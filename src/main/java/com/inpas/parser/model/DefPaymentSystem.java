
package com.inpas.parser.model;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

public enum DefPaymentSystem {

    @SerializedName("0")
    PaymentSystem_Unknown(0),
    @SerializedName("1")
    PaymentSystem_Visa(1),
    @SerializedName("2")
    PaymentSystem_MasterCard(2),
    @SerializedName("3")
    PaymentSystem_AmEx(3),
    @SerializedName("4")
    PaymentSystem_JCB(4),
    @SerializedName("5")
    PaymentSystem_DinersClub(5),
    @SerializedName("6")
    PaymentSystem_CUP(6),
    @SerializedName("7")
    PaymentSystem_UEC(7),
    @SerializedName("8")
    PaymentSystem_MIR(8),
    @SerializedName("9")
    PaymentSystem_GoldenCrown(9),
    @SerializedName("10")
    PaymentSystem_Loyalty(10),
    @SerializedName("128")
    PaymentSystem_EMVSpecification(128);
    private final Integer value;
    private final static Map<Integer, DefPaymentSystem> CONSTANTS = new HashMap<Integer, DefPaymentSystem>();

    static {
        for (DefPaymentSystem c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DefPaymentSystem(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return this.value;
    }

    public static DefPaymentSystem fromValue(Integer value) {
        DefPaymentSystem constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
