import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.gson.annotations.SerializedName;

public class ParamsParser {
	static Map<Integer, String> tlvFields;
	final static byte UnknownType = 0x0;
	final static byte HEXType = 0x1;
	final static byte StringType = 0x2;
	final static byte ByteType = 0x3;
	final static byte WordType = 0x4;
	final static byte DwordType = 0x5;
	final static byte DoubleType = 0x6;
	
	public static void init() {
		tlvFields = new HashMap<Integer, String>();
		tlvFields.put(32840,"CurrencyPreset");
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
	IllegalAccessException{ 
		
		Set<String> hashSet = new HashSet<String>();
		final Field[] fields = tlvClass.getDeclaredFields();
		
		//Смотрим какие поля определены в данном классе
		for (Field field : fields) {
			final SerializedName tlvFieldAnnotation = field.getAnnotation(SerializedName.class);
			//Если есть поля с аннотацией SerializedName, то добавляем в множество
			if(tlvFieldAnnotation != null) {
				hashSet.add(tlvFieldAnnotation.value());
			}
		}
		
		List<TLVDataObj> list = TLVParser.getTLVDataObjList(file);
		for(TLVDataObj obj: list) {
			//По идентификатору тэга получаем соответствующее ему имя класса
			String nameClass = tlvFields.get(obj.getTagId());
			//Проверяем, есть ли такое имя класса в раннее определенном множестве
			if(hashSet.contains(nameClass)) {
				final T tlvObject = tlvClass.newInstance(); 
				if(obj.isConstructed()) {
					
				}else {
					
				}
				
			}
		}
		/*final Field[] fields = tlvClass.getDeclaredFields(); 
		final Map<Integer, Field> tlvFields = new HashMap<Integer, Field>(); 
		final T tlvObject = tlvClass.newInstance(); 
		for (Field field : fields) { 
			final TlvField tlvFieldAnnotation = field 
					.getAnnotation(TlvField.class); 
			if (null != tlvFieldAnnotation) { 
				final int tagId = tlvFieldAnnotation.value(); 
				if (tlvFields.containsKey(new Integer(tagId))) { 
					throw new IllegalArgumentException("TLV field duplicate: " 
							+ tagId); 
				} 
				tlvFields.put(new Integer(tagId), field); 
			} 
			final OriginalData originalDataAnnotation = field 
					.getAnnotation(OriginalData.class); 
			if (null != originalDataAnnotation) { 
				field.setAccessible(true); 
				field.set(tlvObject, file); 
			} 
		} 

		int idx = 0; 
		while (idx < file.length - 1) { 
			final byte tag = file[idx]; 
			idx++; 
			byte lengthByte = file[idx]; 
			int length = lengthByte & 0x7f; 
			while ((lengthByte & 0x80) == 0x80) { 
				idx++; 
				lengthByte = file[idx]; 
				length = (length << 7) + (lengthByte & 0x7f); 
			} 
			idx++; 
			if (0 == tag) { 
				idx += length; 
				continue; 
			} 
			if (tlvFields.containsKey(new Integer(tag))) { 
				final Field tlvField = tlvFields.get(new Integer(tag)); 
				final Class<?> tlvType = tlvField.getType(); 
				final ConvertData convertDataAnnotation = tlvField 
						.getAnnotation(ConvertData.class); 
				final byte[] tlvValue = copy(file, idx, length); 
				Object fieldValue; 
				if (null != convertDataAnnotation) { 
					final Class<? extends DataConvertor<?>> dataConvertorClass = convertDataAnnotation 
							.value(); 
					final DataConvertor<?> dataConvertor = dataConvertorClass 
							.newInstance(); 
					fieldValue = dataConvertor.convert(tlvValue); 
				} else if (String.class == tlvType) { 
					fieldValue = new String(tlvValue, "UTF-8"); 
				} else if (Boolean.TYPE == tlvType) { 
					fieldValue = true; 
				} else if (tlvType.isArray() 
						&& Byte.TYPE == tlvType.getComponentType()) { 
					fieldValue = tlvValue; 
				} else { 
					throw new IllegalArgumentException( 
							"unsupported field type: " + tlvType.getName()); 
				} 
				if (null != tlvField.get(tlvObject) 
						&& false == tlvField.getType().isPrimitive()) { 
					throw new RuntimeException("field was already set: " 
							+ tlvField.getName()); 
				} 
				tlvField.setAccessible(true); 
				tlvField.set(tlvObject, fieldValue); 
			} else { 
				LOG.debug("unknown tag: " + (tag & 0xff) + ", length: " 
						+ length); 
			} 
			idx += length; 
		} 
		return tlvObject; */
		return null;
	} 
}
