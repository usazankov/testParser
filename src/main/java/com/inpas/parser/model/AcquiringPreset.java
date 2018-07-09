
package com.inpas.parser.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * schema for AcquiringPreset
 * 
 */
public class AcquiringPreset {

    @SerializedName("AcquiringPreset")
    @Expose
    @Valid
    private List<Acquiring> acquiringPreset = new ArrayList<Acquiring>();

    public List<Acquiring> getAcquiringPreset() {
        return acquiringPreset;
    }

    public void setAcquiringPreset(List<Acquiring> acquiringPreset) {
        this.acquiringPreset = acquiringPreset;
    }

    public AcquiringPreset withAcquiringPreset(List<Acquiring> acquiringPreset) {
        this.acquiringPreset = acquiringPreset;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AcquiringPreset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("acquiringPreset");
        sb.append('=');
        sb.append(((this.acquiringPreset == null)?"<null>":this.acquiringPreset));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
