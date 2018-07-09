
package com.inpas.parser.model;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

public enum DefDeviceModel {

    @SerializedName("0")
    DefDeviceModel_Unknown(0),
    @SerializedName("1")
    DefDeviceModel_A60(1),
    @SerializedName("2")
    DefDeviceModel_A80(2),
    @SerializedName("3")
    DefDeviceModel_A910(3),
    @SerializedName("4")
    DefDeviceModel_A920(4),
    @SerializedName("5")
    DefDeviceModel_A930(5);
    private final Integer value;
    private final static Map<Integer, DefDeviceModel> CONSTANTS = new HashMap<Integer, DefDeviceModel>();

    static {
        for (DefDeviceModel c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DefDeviceModel(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return this.value;
    }

    public static DefDeviceModel fromValue(Integer value) {
        DefDeviceModel constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
