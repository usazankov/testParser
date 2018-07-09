
package com.inpas.parser.model;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WKey {

    @SerializedName("Anchor")
    @Expose
    private Integer anchor;
    @SerializedName("KeyProfile")
    @Expose
    private WKey.ParamKeyProfile keyProfile = WKey.ParamKeyProfile.fromValue(0);
    @SerializedName("KeyValue")
    @Expose
    private String keyValue;

    public Integer getAnchor() {
        return anchor;
    }

    public void setAnchor(Integer anchor) {
        this.anchor = anchor;
    }

    public WKey withAnchor(Integer anchor) {
        this.anchor = anchor;
        return this;
    }

    public WKey.ParamKeyProfile getKeyProfile() {
        return keyProfile;
    }

    public void setKeyProfile(WKey.ParamKeyProfile keyProfile) {
        this.keyProfile = keyProfile;
    }

    public WKey withKeyProfile(WKey.ParamKeyProfile keyProfile) {
        this.keyProfile = keyProfile;
        return this;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public WKey withKeyValue(String keyValue) {
        this.keyValue = keyValue;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WKey.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anchor");
        sb.append('=');
        sb.append(((this.anchor == null)?"<null>":this.anchor));
        sb.append(',');
        sb.append("keyProfile");
        sb.append('=');
        sb.append(((this.keyProfile == null)?"<null>":this.keyProfile));
        sb.append(',');
        sb.append("keyValue");
        sb.append('=');
        sb.append(((this.keyValue == null)?"<null>":this.keyValue));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public enum ParamKeyProfile {

        @SerializedName("0")
        KeyProfile_Unknown(0),
        @SerializedName("1")
        KeyProfile_TAK(1),
        @SerializedName("2")
        KeyProfile_TPK(2),
        @SerializedName("3")
        KeyProfile_TOPK(3),
        @SerializedName("4")
        KeyProfile_TMK(4),
        @SerializedName("5")
        KeyProfile_TPMK(5),
        @SerializedName("6")
        KeyProfile_TOPMK(6),
        @SerializedName("7")
        KeyProfile_TAMK(7),
        @SerializedName("8")
        KeyProfile_KLK(8),
        @SerializedName("9")
        KeyProfile_TDK(9),
        @SerializedName("10")
        KeyProfile_TEK(10);
        private final Integer value;
        private final static Map<Integer, WKey.ParamKeyProfile> CONSTANTS = new HashMap<Integer, WKey.ParamKeyProfile>();

        static {
            for (WKey.ParamKeyProfile c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ParamKeyProfile(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static WKey.ParamKeyProfile fromValue(Integer value) {
            WKey.ParamKeyProfile constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
