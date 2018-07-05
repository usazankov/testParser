
package com.inpas.parser.model;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

public enum DefSwitch {

    @SerializedName("0")
    NO(0),
    @SerializedName("1")
    YES(1);
    private final Integer value;
    private final static Map<Integer, DefSwitch> CONSTANTS = new HashMap<Integer, DefSwitch>();

    static {
        for (DefSwitch c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DefSwitch(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return this.value;
    }

    public static DefSwitch fromValue(Integer value) {
        DefSwitch constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
