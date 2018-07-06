
package com.inpas.parser.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * schema for PossessorPreset
 * 
 */
public class PossessorPreset {

    @SerializedName("PossessorPreset")
    @Expose
    @Valid
    private List<Possessor> possessorPreset = new ArrayList<Possessor>();

    public List<Possessor> getPossessorPreset() {
        return possessorPreset;
    }

    public void setPossessorPreset(List<Possessor> possessorPreset) {
        this.possessorPreset = possessorPreset;
    }

    public PossessorPreset withPossessorPreset(List<Possessor> possessorPreset) {
        this.possessorPreset = possessorPreset;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PossessorPreset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("possessorPreset");
        sb.append('=');
        sb.append(((this.possessorPreset == null)?"<null>":this.possessorPreset));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
