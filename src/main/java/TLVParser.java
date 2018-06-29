import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TLVParser {
	
	public static List<TLVDataObj> getTLVDataObjList(final byte[] data){
		List<TLVDataObj> list = new ArrayList<TLVDataObj>();
		int i = 0;
		int length = data.length;
		while(i < length) {
			TLVDataObj obj = new TLVDataObj(Arrays.copyOfRange(data, i, length));
			if(obj.getLength() > 0)list.add(obj);
			i += TLVDataObj.TagHeaderLength + obj.getLength();
		}
		return list;
	}
}
