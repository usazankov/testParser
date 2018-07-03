

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * schema for SecurityKeyPreset
 * 
 */
public class SecurityKeyPreset {

    @SerializedName("SecurityKeyPreset")
    @Expose
    @Valid
    private List<SecurityKeyTemplate> securityKeyPreset = new ArrayList<SecurityKeyTemplate>();

    public List<SecurityKeyTemplate> getSecurityKeyPreset() {
        return securityKeyPreset;
    }

    public void setSecurityKeyPreset(List<SecurityKeyTemplate> securityKeyPreset) {
        this.securityKeyPreset = securityKeyPreset;
    }

    public SecurityKeyPreset withSecurityKeyPreset(List<SecurityKeyTemplate> securityKeyPreset) {
        this.securityKeyPreset = securityKeyPreset;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SecurityKeyPreset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("securityKeyPreset");
        sb.append('=');
        sb.append(((this.securityKeyPreset == null)?"<null>":this.securityKeyPreset));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
