

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ParamRevocationSertificate {

    @SerializedName("Anchor")
    @Expose
    private Integer anchor;
    @SerializedName("SertSerialNumber")
    @Expose
    @Valid
    private List<Byte> sertSerialNumber = new ArrayList<Byte>();

    public Integer getAnchor() {
        return anchor;
    }

    public void setAnchor(Integer anchor) {
        this.anchor = anchor;
    }

    public ParamRevocationSertificate withAnchor(Integer anchor) {
        this.anchor = anchor;
        return this;
    }

    public List<Byte> getSertSerialNumber() {
        return sertSerialNumber;
    }

    public void setSertSerialNumber(List<Byte> sertSerialNumber) {
        this.sertSerialNumber = sertSerialNumber;
    }

    public ParamRevocationSertificate withSertSerialNumber(List<Byte> sertSerialNumber) {
        this.sertSerialNumber = sertSerialNumber;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ParamRevocationSertificate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anchor");
        sb.append('=');
        sb.append(((this.anchor == null)?"<null>":this.anchor));
        sb.append(',');
        sb.append("sertSerialNumber");
        sb.append('=');
        sb.append(((this.sertSerialNumber == null)?"<null>":this.sertSerialNumber));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.sertSerialNumber == null)? 0 :this.sertSerialNumber.hashCode()));
        result = ((result* 31)+((this.anchor == null)? 0 :this.anchor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ParamRevocationSertificate) == false) {
            return false;
        }
        ParamRevocationSertificate rhs = ((ParamRevocationSertificate) other);
        return (((this.sertSerialNumber == rhs.sertSerialNumber)||((this.sertSerialNumber!= null)&&this.sertSerialNumber.equals(rhs.sertSerialNumber)))&&((this.anchor == rhs.anchor)||((this.anchor!= null)&&this.anchor.equals(rhs.anchor))));
    }

}
