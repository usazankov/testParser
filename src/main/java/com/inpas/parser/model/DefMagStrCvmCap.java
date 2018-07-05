
package com.inpas.parser.model;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

public enum DefMagStrCvmCap {

    @SerializedName("0")
    NoCVM(0),
    @SerializedName("16")
    ObtainSignature(16),
    @SerializedName("32")
    OnlinePIN(32),
    @SerializedName("240")
    Unknown(240);
    private final Integer value;
    private final static Map<Integer, DefMagStrCvmCap> CONSTANTS = new HashMap<Integer, DefMagStrCvmCap>();

    static {
        for (DefMagStrCvmCap c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DefMagStrCvmCap(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return this.value;
    }

    public static DefMagStrCvmCap fromValue(Integer value) {
        DefMagStrCvmCap constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
