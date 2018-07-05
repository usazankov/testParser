
package com.inpas.parser.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * schema for TerminalProfilePreset
 * 
 */
public class TerminalProfilePreset {

    @SerializedName("TerminalProfilePreset")
    @Expose
    @Valid
    private List<TerminalProfile> terminalProfilePreset = new ArrayList<TerminalProfile>();

    public List<TerminalProfile> getTerminalProfilePreset() {
        return terminalProfilePreset;
    }

    public void setTerminalProfilePreset(List<TerminalProfile> terminalProfilePreset) {
        this.terminalProfilePreset = terminalProfilePreset;
    }

    public TerminalProfilePreset withTerminalProfilePreset(List<TerminalProfile> terminalProfilePreset) {
        this.terminalProfilePreset = terminalProfilePreset;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TerminalProfilePreset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("terminalProfilePreset");
        sb.append('=');
        sb.append(((this.terminalProfilePreset == null)?"<null>":this.terminalProfilePreset));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
