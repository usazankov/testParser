

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MKey {

    @SerializedName("KeyProfile")
    @Expose
    private DefKeyProfile keyProfile = DefKeyProfile.fromValue(0);
    @SerializedName("SlotNo")
    @Expose
    private Integer slotNo;

    public DefKeyProfile getKeyProfile() {
        return keyProfile;
    }

    public void setKeyProfile(DefKeyProfile keyProfile) {
        this.keyProfile = keyProfile;
    }

    public MKey withKeyProfile(DefKeyProfile keyProfile) {
        this.keyProfile = keyProfile;
        return this;
    }

    public Integer getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(Integer slotNo) {
        this.slotNo = slotNo;
    }

    public MKey withSlotNo(Integer slotNo) {
        this.slotNo = slotNo;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MKey.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("keyProfile");
        sb.append('=');
        sb.append(((this.keyProfile == null)?"<null>":this.keyProfile));
        sb.append(',');
        sb.append("slotNo");
        sb.append('=');
        sb.append(((this.slotNo == null)?"<null>":this.slotNo));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
