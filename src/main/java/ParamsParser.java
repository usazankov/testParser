
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class ParamsParser {
	Map<Integer, String> tlvFields;
	Map<Integer, String> tlvFieldsRoot;

	final static byte UnknownType = 0x0;
	final static byte HEXType = 0x1;
	final static byte StringType = 0x2;
	final static byte ByteType = 0x3;
	final static byte WordType = 0x4;
	final static byte DwordType = 0x5;
	final static byte DoubleType = 0x6;
	private static String encoding = new String("windows-1251");
	public void init() {
		
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
		tlvFields.put(32795,"EmvCAPK");
		tlvFields.put(1067,"Index");
		tlvFields.put(1068,"Length");
		tlvFields.put(1070,"Exponent");
		tlvFields.put(1069,"Module");
		tlvFields.put(1098,"CheckValue");
		tlvFields.put(1071,"ExpiryDate");
		tlvFields.put(32950,"RevocationSertificates");
		tlvFields.put(32951,"RevocationSertificate");
		tlvFields.put(1494,"SertSerialNumber");
		
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
	
	public int byteArrayToInt(byte[] b) 
	{
	    int value = 0;
	    int length = b.length > 4 ? 4 : b.length;
	    for (int i = 0; i < length; i++) {
	        int shift = (length - 1 - i) * 8;
	        value += (b[i] & 0x000000FF) << shift;
	    }
	    return value;
	}
	public double toDouble(byte[] bytes) {
	    return ByteBuffer.wrap(bytes).getDouble();
	}
	public <T> T parse(final byte[] file, final Class<T> tlvClass) throws Exception{ 
		T t = parseThrowing(file, tlvClass, true); 
		return t; 
	} 
	
	private <T> T parseThrowing(final byte[] file, 
			final Class<T> tlvClass, boolean isRoot) throws Exception{ 
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
			if(nameClass == null) {
				System.out.println("In HashTable of TagId-ClassName  there is no field of the corresponding tagId: " 
			+ obj.getTagId() + " Current parsing class: "+ tlvClass.getName());
			}
			//Проверяем, есть ли такое имя класса в раннее определенной таблице: имя аннотации - поле
			if(hashMap.containsKey(nameClass)) {
				Field field = hashMap.get(nameClass);
				//Получаем доступ к полю для возможности получения и установки значения
				field.setAccessible(true);
				if(obj.isConstructed()) {//Если вложенный тэг
					final Class<?> fieldType = field.getType();
					//Массив объектов
					if(fieldType == List.class) {
						Type type = field.getGenericType();
						if (type instanceof ParameterizedType) {
							ParameterizedType pType = (ParameterizedType)type;
							//Работаем только с объектами, у которых один параметр дженерика:
							if(pType.getActualTypeArguments().length != 1) {
								throw new RuntimeException("number of generic parameters is not one, error parsing on tagId: " 
							+ String.valueOf(obj.getTagId()) + tlvClass.getName());
							}
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
						throw new RuntimeException("Unsupported Object, error parsing on tagId: " + String.valueOf(obj.getTagId())+ " class name: " + tlvClass.getName()); 
					}
				}else {//Если не вложенный тэг - значит тип параметра 'примитивный'
					try {
						parsePrimitiveType(rootObject, field, obj);
					}catch(Exception ex) {
						throw new RuntimeException("Error parsing on TagId: " + String.valueOf(obj.getTagId()) 
						+ "\nClass name: " + tlvClass.getName() + "\nChild exception: " + ex, ex); 
					}
				}
			}else {
				if(nameClass != null) {
					System.out.println("In Class " + tlvClass.getName() +" there is no field " + nameClass + 
							" of the corresponding tagId: " + obj.getTagId());
				}
			}
		}
		return rootObject;
	} 
	
	private void parsePrimitiveType(Object rootObject, Field field, TLVDataObj obj) throws IllegalArgumentException, 
	IllegalAccessException, UnsupportedEncodingException, NoSuchMethodException, SecurityException, InvocationTargetException {
		final Class<?> fieldType = field.getType();
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
				//Обработка массива байт
				if(listByte instanceof List){
					if(c == Byte.class) {
						@SuppressWarnings("unchecked")
						List<Byte> listObjects = (List<Byte>)listByte;
						byte[] val = Arrays.copyOfRange(array, 1, array.length);
						for(byte b: val){
							listObjects.add(b);
						}
						field.set(rootObject, listObjects);
					//Обработка массива перечислений
					}else if(c.isEnum()) {
						byte[] val = Arrays.copyOfRange(array, 1, array.length);
						Method fromValue = c.getMethod("fromValue", Integer.class);
						//Получаем сам список
						Object listObjects = field.get(rootObject);
						//Получаем метод добавления элемента
						Method method = fieldType.getMethod("add", Object.class);
						for(byte b: val){
							Object objEnum = fromValue.invoke(null, (int)b);
							method.invoke(listObjects, objEnum);
						}
					}
				}
			}
		}else{
			System.out.println("Тип " + fieldType.toString() + " не поддерживается,"
					+ "значение с TagID: " + obj.getTagId() + " не будет обработано" );
		}
	}
}
