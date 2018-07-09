
package com.inpas.parser.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PossessorLink {

    @SerializedName("PossessorRef")
    @Expose
    private Integer possessorRef;
    @SerializedName("TerminalProfileLinks")
    @Expose
    @Valid
    private List<TerminalProfileLink> terminalProfileLinks = new ArrayList<TerminalProfileLink>();

    public Integer getPossessorRef() {
        return possessorRef;
    }

    public void setPossessorRef(Integer possessorRef) {
        this.possessorRef = possessorRef;
    }

    public PossessorLink withPossessorRef(Integer possessorRef) {
        this.possessorRef = possessorRef;
        return this;
    }

    public List<TerminalProfileLink> getTerminalProfileLinks() {
        return terminalProfileLinks;
    }

    public void setTerminalProfileLinks(List<TerminalProfileLink> terminalProfileLinks) {
        this.terminalProfileLinks = terminalProfileLinks;
    }

    public PossessorLink withTerminalProfileLinks(List<TerminalProfileLink> terminalProfileLinks) {
        this.terminalProfileLinks = terminalProfileLinks;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PossessorLink.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("possessorRef");
        sb.append('=');
        sb.append(((this.possessorRef == null)?"<null>":this.possessorRef));
        sb.append(',');
        sb.append("terminalProfileLinks");
        sb.append('=');
        sb.append(((this.terminalProfileLinks == null)?"<null>":this.terminalProfileLinks));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
