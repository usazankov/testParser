
package com.inpas.parser.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PaymentSystemLink {

    @SerializedName("PaymentSystemRef")
    @Expose
    private Integer paymentSystemRef;
    @SerializedName("AcquirerIdentifier")
    @Expose
    private String acquirerIdentifier;

    public Integer getPaymentSystemRef() {
        return paymentSystemRef;
    }

    public void setPaymentSystemRef(Integer paymentSystemRef) {
        this.paymentSystemRef = paymentSystemRef;
    }

    public PaymentSystemLink withPaymentSystemRef(Integer paymentSystemRef) {
        this.paymentSystemRef = paymentSystemRef;
        return this;
    }

    public String getAcquirerIdentifier() {
        return acquirerIdentifier;
    }

    public void setAcquirerIdentifier(String acquirerIdentifier) {
        this.acquirerIdentifier = acquirerIdentifier;
    }

    public PaymentSystemLink withAcquirerIdentifier(String acquirerIdentifier) {
        this.acquirerIdentifier = acquirerIdentifier;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PaymentSystemLink.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("paymentSystemRef");
        sb.append('=');
        sb.append(((this.paymentSystemRef == null)?"<null>":this.paymentSystemRef));
        sb.append(',');
        sb.append("acquirerIdentifier");
        sb.append('=');
        sb.append(((this.acquirerIdentifier == null)?"<null>":this.acquirerIdentifier));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
