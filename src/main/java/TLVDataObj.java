import java.util.Arrays;

public class TLVDataObj {
	private int tagId;
	private int length;
	private byte[] value;
	public final static int TagHeaderLength = 6;
	TLVDataObj(byte[] data){
		//�������� ������������� ���� - 2 �����
		tagId = (data[0]<< 8)&0x0000ff00|
			    (data[1]<< 0)&0x000000ff;
		
		//�������� ����� ���� - 4 �����
		length = (data[2]<<24)&0xff000000|
			       (data[3]<<16)&0x00ff0000|
			       (data[4]<< 8)&0x0000ff00|
			       (data[5]<< 0)&0x000000ff;
		
		//�������� �� �����
		value = Arrays.copyOfRange(data, 6, length + TagHeaderLength);
		
	}
	
	public void setTagId(int tagId) {
		this.tagId = tagId;
	}
	
	public int getTagId() {
		return tagId;
	}
	
	public void setValue(byte[] value) {
		this.value = value;
	}
	
	public byte[] getValue() {
		return value;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	boolean isConstructed() {
		if(((tagId >> 15) & 1) == 1)return true;
		return false;
	}
}
