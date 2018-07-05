
package com.inpas.parser.model;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

public enum DefCardProduct {

    @SerializedName("0")
    CardProduct_Unknown(0),
    @SerializedName("1")
    CardProduct_VISA_Clasic(1),
    @SerializedName("2")
    CardProduct_VISA_Gold(2),
    @SerializedName("3")
    CardProduct_VISA_Platinum(3),
    @SerializedName("4")
    CardProduct_VISA_Electron(4),
    @SerializedName("5")
    CardProduct_MasterCard_Standard(5),
    @SerializedName("6")
    CardProduct_CirrusMaestro(6),
    @SerializedName("7")
    CardProduct_AmericanExpress(7),
    @SerializedName("8")
    CardProduct_JCB(8),
    @SerializedName("9")
    CardProduct_DinersClub(9),
    @SerializedName("10")
    CardProduct_CUP(10),
    @SerializedName("11")
    CardProduct_UEC(11),
    @SerializedName("12")
    CardProduct_MIR(12),
    @SerializedName("13")
    CardProduct_Loyalty(13);
    private final Integer value;
    private final static Map<Integer, DefCardProduct> CONSTANTS = new HashMap<Integer, DefCardProduct>();

    static {
        for (DefCardProduct c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DefCardProduct(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return this.value;
    }

    public static DefCardProduct fromValue(Integer value) {
        DefCardProduct constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
