
package com.inpas.parser.model;

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

}
