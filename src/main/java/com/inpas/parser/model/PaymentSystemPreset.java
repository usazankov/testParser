
package com.inpas.parser.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * schema for PaymentSystemPreset
 * 
 */
public class PaymentSystemPreset {

    @SerializedName("PaymentSystemPreset")
    @Expose
    @Valid
    private List<PaymentSystem> paymentSystemPreset = new ArrayList<PaymentSystem>();

    public List<PaymentSystem> getPaymentSystemPreset() {
        return paymentSystemPreset;
    }

    public void setPaymentSystemPreset(List<PaymentSystem> paymentSystemPreset) {
        this.paymentSystemPreset = paymentSystemPreset;
    }

    public PaymentSystemPreset withPaymentSystemPreset(List<PaymentSystem> paymentSystemPreset) {
        this.paymentSystemPreset = paymentSystemPreset;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PaymentSystemPreset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("paymentSystemPreset");
        sb.append('=');
        sb.append(((this.paymentSystemPreset == null)?"<null>":this.paymentSystemPreset));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
