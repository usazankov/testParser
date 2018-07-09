
package com.inpas.parser.model;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

public enum DefLicenseType {

    @SerializedName("0")
    Prior_File(0),
    @SerializedName("1")
    Prior_Sam(1);
    private final Integer value;
    private final static Map<Integer, DefLicenseType> CONSTANTS = new HashMap<Integer, DefLicenseType>();

    static {
        for (DefLicenseType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DefLicenseType(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return this.value;
    }

    public static DefLicenseType fromValue(Integer value) {
        DefLicenseType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
