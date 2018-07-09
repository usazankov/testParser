
package com.inpas.parser.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TerminalProfileLink {

    @SerializedName("TerminalProfileRef")
    @Expose
    private Integer terminalProfileRef;
    @SerializedName("RegisteredTerminals")
    @Expose
    @Valid
    private List<RegisteredTerminal> registeredTerminals = new ArrayList<RegisteredTerminal>();

    public Integer getTerminalProfileRef() {
        return terminalProfileRef;
    }

    public void setTerminalProfileRef(Integer terminalProfileRef) {
        this.terminalProfileRef = terminalProfileRef;
    }

    public TerminalProfileLink withTerminalProfileRef(Integer terminalProfileRef) {
        this.terminalProfileRef = terminalProfileRef;
        return this;
    }

    public List<RegisteredTerminal> getRegisteredTerminals() {
        return registeredTerminals;
    }

    public void setRegisteredTerminals(List<RegisteredTerminal> registeredTerminals) {
        this.registeredTerminals = registeredTerminals;
    }

    public TerminalProfileLink withRegisteredTerminals(List<RegisteredTerminal> registeredTerminals) {
        this.registeredTerminals = registeredTerminals;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TerminalProfileLink.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("terminalProfileRef");
        sb.append('=');
        sb.append(((this.terminalProfileRef == null)?"<null>":this.terminalProfileRef));
        sb.append(',');
        sb.append("registeredTerminals");
        sb.append('=');
        sb.append(((this.registeredTerminals == null)?"<null>":this.registeredTerminals));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
