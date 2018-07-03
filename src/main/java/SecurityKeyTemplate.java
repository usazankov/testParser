

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SecurityKeyTemplate {

    @SerializedName("Anchor")
    @Expose
    private Integer anchor;
    @SerializedName("Pinpad")
    @Expose
    private DefParamPinpad pinpad = DefParamPinpad.fromValue(0);
    @SerializedName("MKeys")
    @Expose
    @Valid
    private List<MKey> mKeys = new ArrayList<MKey>();

    public Integer getAnchor() {
        return anchor;
    }

    public void setAnchor(Integer anchor) {
        this.anchor = anchor;
    }

    public SecurityKeyTemplate withAnchor(Integer anchor) {
        this.anchor = anchor;
        return this;
    }

    public DefParamPinpad getPinpad() {
        return pinpad;
    }

    public void setPinpad(DefParamPinpad pinpad) {
        this.pinpad = pinpad;
    }

    public SecurityKeyTemplate withPinpad(DefParamPinpad pinpad) {
        this.pinpad = pinpad;
        return this;
    }

    public List<MKey> getMKeys() {
        return mKeys;
    }

    public void setMKeys(List<MKey> mKeys) {
        this.mKeys = mKeys;
    }

    public SecurityKeyTemplate withMKeys(List<MKey> mKeys) {
        this.mKeys = mKeys;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SecurityKeyTemplate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anchor");
        sb.append('=');
        sb.append(((this.anchor == null)?"<null>":this.anchor));
        sb.append(',');
        sb.append("pinpad");
        sb.append('=');
        sb.append(((this.pinpad == null)?"<null>":this.pinpad));
        sb.append(',');
        sb.append("mKeys");
        sb.append('=');
        sb.append(((this.mKeys == null)?"<null>":this.mKeys));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
