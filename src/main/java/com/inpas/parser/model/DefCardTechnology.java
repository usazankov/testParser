
package com.inpas.parser.model;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

public enum DefCardTechnology {

    @SerializedName("1")
    CardTechnology_Magnetic(1),
    @SerializedName("2")
    CardTechnology_Contact(2),
    @SerializedName("3")
    CardTechnology_MagneticAndContact(3),
    @SerializedName("4")
    CardTechnology_Contactless(4);
    private final Integer value;
    private final static Map<Integer, DefCardTechnology> CONSTANTS = new HashMap<Integer, DefCardTechnology>();

    static {
        for (DefCardTechnology c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DefCardTechnology(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return this.value;
    }

    public static DefCardTechnology fromValue(Integer value) {
        DefCardTechnology constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
