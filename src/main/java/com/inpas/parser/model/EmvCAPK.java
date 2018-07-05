
package com.inpas.parser.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EmvCAPK {

    @SerializedName("Anchor")
    @Expose
    private Integer anchor;
    @SerializedName("Index")
    @Expose
    @Valid
    private Byte index;
    @SerializedName("Length")
    @Expose
    private Integer length;
    @SerializedName("Exponent")
    @Expose
    private EmvCAPK.ParamExponentType exponent = EmvCAPK.ParamExponentType.fromValue(1);
    @SerializedName("Module")
    @Expose
    @Valid
    private List<Byte> module = new ArrayList<Byte>();
    @SerializedName("CheckValue")
    @Expose
    @Valid
    private List<Byte> checkValue = new ArrayList<Byte>();
    @SerializedName("ExpiryDate")
    @Expose
    private String expiryDate = "";
    @SerializedName("RevocationSertificates")
    @Expose
    @Valid
    private List<ParamRevocationSertificate> revocationSertificates = new ArrayList<ParamRevocationSertificate>();

    public Integer getAnchor() {
        return anchor;
    }

    public void setAnchor(Integer anchor) {
        this.anchor = anchor;
    }

    public EmvCAPK withAnchor(Integer anchor) {
        this.anchor = anchor;
        return this;
    }

    public Byte getIndex() {
        return index;
    }

    public void setIndex(Byte index) {
        this.index = index;
    }

    public EmvCAPK withIndex(Byte index) {
        this.index = index;
        return this;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public EmvCAPK withLength(Integer length) {
        this.length = length;
        return this;
    }

    public EmvCAPK.ParamExponentType getExponent() {
        return exponent;
    }

    public void setExponent(EmvCAPK.ParamExponentType exponent) {
        this.exponent = exponent;
    }

    public EmvCAPK withExponent(EmvCAPK.ParamExponentType exponent) {
        this.exponent = exponent;
        return this;
    }

    public List<Byte> getModule() {
        return module;
    }

    public void setModule(List<Byte> module) {
        this.module = module;
    }

    public EmvCAPK withModule(List<Byte> module) {
        this.module = module;
        return this;
    }

    public List<Byte> getCheckValue() {
        return checkValue;
    }

    public void setCheckValue(List<Byte> checkValue) {
        this.checkValue = checkValue;
    }

    public EmvCAPK withCheckValue(List<Byte> checkValue) {
        this.checkValue = checkValue;
        return this;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public EmvCAPK withExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    public List<ParamRevocationSertificate> getRevocationSertificates() {
        return revocationSertificates;
    }

    public void setRevocationSertificates(List<ParamRevocationSertificate> revocationSertificates) {
        this.revocationSertificates = revocationSertificates;
    }

    public EmvCAPK withRevocationSertificates(List<ParamRevocationSertificate> revocationSertificates) {
        this.revocationSertificates = revocationSertificates;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EmvCAPK.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anchor");
        sb.append('=');
        sb.append(((this.anchor == null)?"<null>":this.anchor));
        sb.append(',');
        sb.append("index");
        sb.append('=');
        sb.append(((this.index == null)?"<null>":this.index));
        sb.append(',');
        sb.append("length");
        sb.append('=');
        sb.append(((this.length == null)?"<null>":this.length));
        sb.append(',');
        sb.append("exponent");
        sb.append('=');
        sb.append(((this.exponent == null)?"<null>":this.exponent));
        sb.append(',');
        sb.append("module");
        sb.append('=');
        sb.append(((this.module == null)?"<null>":this.module));
        sb.append(',');
        sb.append("checkValue");
        sb.append('=');
        sb.append(((this.checkValue == null)?"<null>":this.checkValue));
        sb.append(',');
        sb.append("expiryDate");
        sb.append('=');
        sb.append(((this.expiryDate == null)?"<null>":this.expiryDate));
        sb.append(',');
        sb.append("revocationSertificates");
        sb.append('=');
        sb.append(((this.revocationSertificates == null)?"<null>":this.revocationSertificates));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public enum ParamExponentType {

        @SerializedName("1")
        ExponentType_3(1),
        @SerializedName("2")
        ExponentType_2_16_1(2);
        private final Integer value;
        private final static Map<Integer, EmvCAPK.ParamExponentType> CONSTANTS = new HashMap<Integer, EmvCAPK.ParamExponentType>();

        static {
            for (EmvCAPK.ParamExponentType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ParamExponentType(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static EmvCAPK.ParamExponentType fromValue(Integer value) {
            EmvCAPK.ParamExponentType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
