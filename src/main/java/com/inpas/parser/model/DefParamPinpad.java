
package com.inpas.parser.model;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

public enum DefParamPinpad {

    @SerializedName("0")
    Pinpad_Hardware(0),
    @SerializedName("1")
    Pinpad_Virtual1(1),
    @SerializedName("2")
    Pinpad_Virtual2(2),
    @SerializedName("3")
    Pinpad_Virtual3(3);
    private final Integer value;
    private final static Map<Integer, DefParamPinpad> CONSTANTS = new HashMap<Integer, DefParamPinpad>();

    static {
        for (DefParamPinpad c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DefParamPinpad(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return this.value;
    }

    public static DefParamPinpad fromValue(Integer value) {
        DefParamPinpad constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
