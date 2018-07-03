
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class ParamsParser {
	static Map<Integer, String> tlvFields;
	static Map<Integer, String> tlvFieldsRoot;
	final static byte UnknownType = 0x0;
	final static byte HEXType = 0x1;
	final static byte StringType = 0x2;
	final static byte ByteType = 0x3;
	final static byte WordType = 0x4;
	final static byte DwordType = 0x5;
	final static byte DoubleType = 0x6;
	private static String encoding = new String("windows-1251");
	public static void init() {
		
		tlvFieldsRoot = new HashMap<Integer, String>();
		tlvFieldsRoot.put(32840,"CurrencyPreset");
		tlvFieldsRoot.put(32792,"PaymentSystemPreset");
		tlvFieldsRoot.put(32788,"CardProductPreset");
		tlvFieldsRoot.put(32832,"SecurityKeyPreset");
		tlvFieldsRoot.put(32830,"AccountTypePreset");
		tlvFields = new HashMap<Integer, String>();
		tlvFields.put(0,"Anchor");
		
		//CurrencyPreset
		tlvFields.put(32797, "Currency");
		tlvFields.put(1027, "Name");
		tlvFields.put(1072, "NumericCode");
		tlvFields.put(1073, "AlphabeticCode");
		tlvFields.put(1074, "MinorUnit");
		tlvFields.put(1075, "ConversionFactor");
		tlvFields.put(32790, "BinRanges");
		tlvFields.put(32791, "DefBinRange");
		tlvFields.put(1055, "PanLengthStart");
		tlvFields.put(1056, "PanLengthFinish");
		tlvFields.put(1057, "FromBin");
		tlvFields.put(1058, "ToBin");
		
		//PaymentSystemPreset
		tlvFields.put(32793,"PaymentSystem");
		tlvFields.put(32794,"EmvCAPKs");
		tlvFields.put(1027,"Name");
		tlvFields.put(1166,"PName");
		tlvFields.put(1066,"HotListPath");
		tlvFields.put(1062,"RID");
		tlvFields.put(1103,"EmvTDOL");
		tlvFields.put(1104,"EmvDDOL");
		tlvFields.put(1154,"ReferralCallCenter");
		
		//CardProductPreset
		tlvFields.put(32789,"CardProduct");
		tlvFields.put(1167,"CPName");
		tlvFields.put(1027,"Name");
		tlvFields.put(1054,"PIX");
		tlvFields.put(1062,"RID");
		tlvFields.put(32790,"BinRanges");
		tlvFields.put(1059,"ManualInput");
		tlvFields.put(1154,"ReferralCallCenter");
		
		//SecurityKeyPreset
		tlvFields.put(32882,"SecurityKeyTemplate");
		tlvFields.put(1283,"Pinpad");
		tlvFields.put(32883,"MKeys");
		tlvFields.put(32884,"MKey");
		tlvFields.put(1109,"KeyProfile");
		tlvFields.put(1110,"SlotNo");
		
		//AccountTypePreset
		tlvFields.put(32831,"AccountType");
		tlvFields.put(1107,"AccountTypeId");
		tlvFields.put(1114,"EnabledOperations");
		tlvFields.put(32849,"PrefLanguages");
		tlvFields.put(32850,"PrefLanguageItem");
		tlvFields.put(1125,"PrefLanguage");
		tlvFields.put(1126,"Item");
		
	}
	public static int byteArrayToInt(byte[] b) 
	{
	    int value = 0;
	    int length = b.length > 4 ? 4 : b.length;
	    for (int i = 0; i < length; i++) {
	        int shift = (length - 1 - i) * 8;
	        value += (b[i] & 0x000000FF) << shift;
	    }
	    return value;
	}
	public static double toDouble(byte[] bytes) {
	    return ByteBuffer.wrap(bytes).getDouble();
	}
	public static <T> T parse(final byte[] file, final Class<T> tlvClass) { 
		T t; 
		try { 
			t = parseThrowing(file, tlvClass, true); 
		} catch (final Exception ex) { 
			throw new RuntimeException("error parsing file: " 
					+ tlvClass.getName(), ex); 
		} 
		return t; 
	} 

	private static <T> T parseThrowing(final byte[] file, 
			final Class<T> tlvClass, boolean isRoot) throws InstantiationException, 
	IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, UnsupportedEncodingException{ 
		String name = tlvClass.getName();
		T rootObject = tlvClass.newInstance(); 
		Map<String, Field> hashMap = new HashMap<String, Field>();
		final Field[] fields = tlvClass.getDeclaredFields();
		
		//Смотрим какие поля определены в данном классе
		for (Field field : fields) {
			final SerializedName tlvFieldAnnotation = field.getAnnotation(SerializedName.class);
			//Если есть поля с аннотацией SerializedName, то добавляем в таблицу соответствия имени к полю класса
			if(tlvFieldAnnotation != null) {
				hashMap.put(tlvFieldAnnotation.value(), field);
			}
		}
		
		List<TLVDataObj> list = TLVParser.getTLVDataObjList(file);
	
		for(TLVDataObj obj: list) {
			//По идентификатору тэга получаем соответствующее ему имя класса
			String nameClass;
			if(isRoot) nameClass = tlvFieldsRoot.get(obj.getTagId());
			else nameClass = tlvFields.get(obj.getTagId());
			//Проверяем, есть ли такое имя класса в раннее определенной таблице: имя аннотации - поле
			if(hashMap.containsKey(nameClass)) {
				Field field = hashMap.get(nameClass);
				//Получаем доступ к полю для возможности получения и установки значения
				field.setAccessible(true);
				final Class<?> fieldType = field.getType();
				if(obj.isConstructed()) {//Если вложенный тэг
					//Массив объектов
					if(fieldType == List.class) {
						Type type = field.getGenericType();
						if (type instanceof ParameterizedType) {
							ParameterizedType pType = (ParameterizedType)type;
							//Работаем только с объектами, у которых один параметр дженерика:
							Class<?> c = (Class<?>)pType.getActualTypeArguments()[0];
							//Получаем метод добавления элемента
							Method method = fieldType.getMethod("add", Object.class);
							//Получаем сам список
							Object listObjects = field.get(rootObject);
							List<TLVDataObj> listTLV = TLVParser.getTLVDataObjList(obj.getValue());
							for(TLVDataObj temp: listTLV) {
								//Рекурсивно создаем объект элемента списка
								Object item = parseThrowing(temp.getValue(), c, false);
								//Вызываем метод добавления элемента
								method.invoke(listObjects, item );
							}
						}
					}else { //Иначе - это какой-то другой объект
						System.out.println("Different Object");
					}
				}else {//Если не вложенный тэг - значит тип параметра примитивный
					byte[] array = obj.getValue();
					if(fieldType == String.class) {
						String value = new String(Arrays.copyOfRange(array, 1, array.length), encoding);
						field.set(rootObject, value);
					}else if(fieldType == Integer.class) {
						Integer value = byteArrayToInt(Arrays.copyOfRange(array, 1, array.length));
						field.set(rootObject, value);
					}else if(fieldType == Double.class) {
						Double value = toDouble(Arrays.copyOfRange(array, 1, array.length));
						field.set(rootObject, value);
					}else if(fieldType.isEnum()){
						Integer value = byteArrayToInt(Arrays.copyOfRange(array, 1, array.length));
						Method method = fieldType.getMethod("fromValue", Integer.class);
						Object objEnum = field.get(rootObject);
						objEnum = method.invoke(objEnum, value);
						field.set(rootObject, objEnum);
					}else if(fieldType == List.class){
						Type type = field.getGenericType();
						if (type instanceof ParameterizedType) {
							ParameterizedType pType = (ParameterizedType)type;
							//Работаем только с объектами, у которых один параметр дженерика:
							Class<?> c = (Class<?>)pType.getActualTypeArguments()[0];
							//Получаем сам список
							Object listByte = field.get(rootObject);
							if( listByte instanceof List && c == Byte.class) {
								List<Byte> listObjects = (List<Byte>)listByte;
								byte[] val = Arrays.copyOfRange(array, 1, array.length);
								for(byte b: val){
									listObjects.add(b);
								}
								field.set(rootObject, listObjects);
							}
						}
					}
				}
			}
		}
		return rootObject;
	} 
}
