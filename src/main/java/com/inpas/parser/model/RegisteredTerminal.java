
package com.inpas.parser.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RegisteredTerminal {

    @SerializedName("Anchor")
    @Expose
    private Integer anchor;
    @SerializedName("VirtualPOSID")
    @Expose
    private String virtualPOSID = "";
    @SerializedName("PosIDAddress")
    @Expose
    private String posIDAddress;
    @SerializedName("PosIDPossessorName")
    @Expose
    private String posIDPossessorName;
    @SerializedName("AcquiringRef")
    @Expose
    private Integer acquiringRef;
    @SerializedName("KeyTemplateRef")
    @Expose
    private Integer keyTemplateRef;
    @SerializedName("SecurityKeys")
    @Expose
    @Valid
    private List<WKey> securityKeys = new ArrayList<WKey>();

    public Integer getAnchor() {
        return anchor;
    }

    public void setAnchor(Integer anchor) {
        this.anchor = anchor;
    }

    public RegisteredTerminal withAnchor(Integer anchor) {
        this.anchor = anchor;
        return this;
    }

    public String getVirtualPOSID() {
        return virtualPOSID;
    }

    public void setVirtualPOSID(String virtualPOSID) {
        this.virtualPOSID = virtualPOSID;
    }

    public RegisteredTerminal withVirtualPOSID(String virtualPOSID) {
        this.virtualPOSID = virtualPOSID;
        return this;
    }

    public String getPosIDAddress() {
        return posIDAddress;
    }

    public void setPosIDAddress(String posIDAddress) {
        this.posIDAddress = posIDAddress;
    }

    public RegisteredTerminal withPosIDAddress(String posIDAddress) {
        this.posIDAddress = posIDAddress;
        return this;
    }

    public String getPosIDPossessorName() {
        return posIDPossessorName;
    }

    public void setPosIDPossessorName(String posIDPossessorName) {
        this.posIDPossessorName = posIDPossessorName;
    }

    public RegisteredTerminal withPosIDPossessorName(String posIDPossessorName) {
        this.posIDPossessorName = posIDPossessorName;
        return this;
    }

    public Integer getAcquiringRef() {
        return acquiringRef;
    }

    public void setAcquiringRef(Integer acquiringRef) {
        this.acquiringRef = acquiringRef;
    }

    public RegisteredTerminal withAcquiringRef(Integer acquiringRef) {
        this.acquiringRef = acquiringRef;
        return this;
    }

    public Integer getKeyTemplateRef() {
        return keyTemplateRef;
    }

    public void setKeyTemplateRef(Integer keyTemplateRef) {
        this.keyTemplateRef = keyTemplateRef;
    }

    public RegisteredTerminal withKeyTemplateRef(Integer keyTemplateRef) {
        this.keyTemplateRef = keyTemplateRef;
        return this;
    }

    public List<WKey> getSecurityKeys() {
        return securityKeys;
    }

    public void setSecurityKeys(List<WKey> securityKeys) {
        this.securityKeys = securityKeys;
    }

    public RegisteredTerminal withSecurityKeys(List<WKey> securityKeys) {
        this.securityKeys = securityKeys;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RegisteredTerminal.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anchor");
        sb.append('=');
        sb.append(((this.anchor == null)?"<null>":this.anchor));
        sb.append(',');
        sb.append("virtualPOSID");
        sb.append('=');
        sb.append(((this.virtualPOSID == null)?"<null>":this.virtualPOSID));
        sb.append(',');
        sb.append("posIDAddress");
        sb.append('=');
        sb.append(((this.posIDAddress == null)?"<null>":this.posIDAddress));
        sb.append(',');
        sb.append("posIDPossessorName");
        sb.append('=');
        sb.append(((this.posIDPossessorName == null)?"<null>":this.posIDPossessorName));
        sb.append(',');
        sb.append("acquiringRef");
        sb.append('=');
        sb.append(((this.acquiringRef == null)?"<null>":this.acquiringRef));
        sb.append(',');
        sb.append("keyTemplateRef");
        sb.append('=');
        sb.append(((this.keyTemplateRef == null)?"<null>":this.keyTemplateRef));
        sb.append(',');
        sb.append("securityKeys");
        sb.append('=');
        sb.append(((this.securityKeys == null)?"<null>":this.securityKeys));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
