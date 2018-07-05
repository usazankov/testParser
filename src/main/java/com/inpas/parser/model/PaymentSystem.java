
package com.inpas.parser.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PaymentSystem {

    @SerializedName("Anchor")
    @Expose
    private Integer anchor;
    @SerializedName("PName")
    @Expose
    private String pName = "";
    @SerializedName("Name")
    @Expose
    private DefPaymentSystem name = DefPaymentSystem.fromValue(0);
    @SerializedName("NameQ")
    @Expose
    private DefPaymentSystem nameQ = DefPaymentSystem.fromValue(0);
    @SerializedName("HotListPath")
    @Expose
    private String hotListPath = "";
    @SerializedName("RID")
    @Expose
    @Valid
    private List<Byte> rID = new ArrayList<Byte>();
    @SerializedName("EmvTDOL")
    @Expose
    @Valid
    private List<Byte> emvTDOL = new ArrayList<Byte>();
    @SerializedName("EmvDDOL")
    @Expose
    @Valid
    private List<Byte> emvDDOL = new ArrayList<Byte>();
    @SerializedName("EmvCAPKs")
    @Expose
    @Valid
    private List<EmvCAPK> emvCAPKs = new ArrayList<EmvCAPK>();
    @SerializedName("ReferralCallCenter")
    @Expose
    private String referralCallCenter = "";

    public Integer getAnchor() {
        return anchor;
    }

    public void setAnchor(Integer anchor) {
        this.anchor = anchor;
    }

    public PaymentSystem withAnchor(Integer anchor) {
        this.anchor = anchor;
        return this;
    }

    public String getPName() {
        return pName;
    }

    public void setPName(String pName) {
        this.pName = pName;
    }

    public PaymentSystem withPName(String pName) {
        this.pName = pName;
        return this;
    }

    public DefPaymentSystem getName() {
        return name;
    }

    public void setName(DefPaymentSystem name) {
        this.name = name;
    }

    public PaymentSystem withName(DefPaymentSystem name) {
        this.name = name;
        return this;
    }

    public DefPaymentSystem getNameQ() {
        return nameQ;
    }

    public void setNameQ(DefPaymentSystem nameQ) {
        this.nameQ = nameQ;
    }

    public PaymentSystem withNameQ(DefPaymentSystem nameQ) {
        this.nameQ = nameQ;
        return this;
    }

    public String getHotListPath() {
        return hotListPath;
    }

    public void setHotListPath(String hotListPath) {
        this.hotListPath = hotListPath;
    }

    public PaymentSystem withHotListPath(String hotListPath) {
        this.hotListPath = hotListPath;
        return this;
    }

    public List<Byte> getRID() {
        return rID;
    }

    public void setRID(List<Byte> rID) {
        this.rID = rID;
    }

    public PaymentSystem withRID(List<Byte> rID) {
        this.rID = rID;
        return this;
    }

    public List<Byte> getEmvTDOL() {
        return emvTDOL;
    }

    public void setEmvTDOL(List<Byte> emvTDOL) {
        this.emvTDOL = emvTDOL;
    }

    public PaymentSystem withEmvTDOL(List<Byte> emvTDOL) {
        this.emvTDOL = emvTDOL;
        return this;
    }

    public List<Byte> getEmvDDOL() {
        return emvDDOL;
    }

    public void setEmvDDOL(List<Byte> emvDDOL) {
        this.emvDDOL = emvDDOL;
    }

    public PaymentSystem withEmvDDOL(List<Byte> emvDDOL) {
        this.emvDDOL = emvDDOL;
        return this;
    }

    public List<EmvCAPK> getEmvCAPKs() {
        return emvCAPKs;
    }

    public void setEmvCAPKs(List<EmvCAPK> emvCAPKs) {
        this.emvCAPKs = emvCAPKs;
    }

    public PaymentSystem withEmvCAPKs(List<EmvCAPK> emvCAPKs) {
        this.emvCAPKs = emvCAPKs;
        return this;
    }

    public String getReferralCallCenter() {
        return referralCallCenter;
    }

    public void setReferralCallCenter(String referralCallCenter) {
        this.referralCallCenter = referralCallCenter;
    }

    public PaymentSystem withReferralCallCenter(String referralCallCenter) {
        this.referralCallCenter = referralCallCenter;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PaymentSystem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anchor");
        sb.append('=');
        sb.append(((this.anchor == null)?"<null>":this.anchor));
        sb.append(',');
        sb.append("pName");
        sb.append('=');
        sb.append(((this.pName == null)?"<null>":this.pName));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("nameQ");
        sb.append('=');
        sb.append(((this.nameQ == null)?"<null>":this.nameQ));
        sb.append(',');
        sb.append("hotListPath");
        sb.append('=');
        sb.append(((this.hotListPath == null)?"<null>":this.hotListPath));
        sb.append(',');
        sb.append("rID");
        sb.append('=');
        sb.append(((this.rID == null)?"<null>":this.rID));
        sb.append(',');
        sb.append("emvTDOL");
        sb.append('=');
        sb.append(((this.emvTDOL == null)?"<null>":this.emvTDOL));
        sb.append(',');
        sb.append("emvDDOL");
        sb.append('=');
        sb.append(((this.emvDDOL == null)?"<null>":this.emvDDOL));
        sb.append(',');
        sb.append("emvCAPKs");
        sb.append('=');
        sb.append(((this.emvCAPKs == null)?"<null>":this.emvCAPKs));
        sb.append(',');
        sb.append("referralCallCenter");
        sb.append('=');
        sb.append(((this.referralCallCenter == null)?"<null>":this.referralCallCenter));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
