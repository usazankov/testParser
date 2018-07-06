
package com.inpas.parser.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PaymentSystemRegistration {

    @SerializedName("Anchor")
    @Expose
    private Integer anchor;
    @SerializedName("MerchantId")
    @Expose
    private String merchantId = "";
    @SerializedName("PaymentSystemRef")
    @Expose
    private Integer paymentSystemRef;

    public Integer getAnchor() {
        return anchor;
    }

    public void setAnchor(Integer anchor) {
        this.anchor = anchor;
    }

    public PaymentSystemRegistration withAnchor(Integer anchor) {
        this.anchor = anchor;
        return this;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public PaymentSystemRegistration withMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }

    public Integer getPaymentSystemRef() {
        return paymentSystemRef;
    }

    public void setPaymentSystemRef(Integer paymentSystemRef) {
        this.paymentSystemRef = paymentSystemRef;
    }

    public PaymentSystemRegistration withPaymentSystemRef(Integer paymentSystemRef) {
        this.paymentSystemRef = paymentSystemRef;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PaymentSystemRegistration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anchor");
        sb.append('=');
        sb.append(((this.anchor == null)?"<null>":this.anchor));
        sb.append(',');
        sb.append("merchantId");
        sb.append('=');
        sb.append(((this.merchantId == null)?"<null>":this.merchantId));
        sb.append(',');
        sb.append("paymentSystemRef");
        sb.append('=');
        sb.append(((this.paymentSystemRef == null)?"<null>":this.paymentSystemRef));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
