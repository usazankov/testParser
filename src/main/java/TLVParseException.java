
public class TLVParseException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2450539859227213483L;
	private String additionalMessage;
	private Integer tagId;
	TLVParseException(Integer tagId, String additionalMessage){
		this.additionalMessage = additionalMessage;
		this.tagId = tagId;
	}
	@Override
	public String getMessage() {
		return  "Error parse on TagID:" + String.valueOf(tagId) + " Detailed description: " + additionalMessage;
	}
	public String getAdditionalMessage() {
		return additionalMessage;
	}
	public void setAdditionalMessage(String additionalMessage) {
		this.additionalMessage = additionalMessage;
	}
	public Integer getTagId() {
		return tagId;
	}
	public void setTagId(Integer tagId) {
		this.tagId = tagId;
	}


}
