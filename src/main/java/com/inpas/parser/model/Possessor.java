
package com.inpas.parser.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Possessor {

    @SerializedName("Anchor")
    @Expose
    private Integer anchor;
    @SerializedName("Name")
    @Expose
    private String name = "";
    @SerializedName("MCC")
    @Expose
    private String mCC = "";
    @SerializedName("PossessorType")
    @Expose
    private Possessor.ParamPossessorType possessorType = Possessor.ParamPossessorType.fromValue(0);
    @SerializedName("EmvMerchantNameLocation")
    @Expose
    private String emvMerchantNameLocation = "";
    @SerializedName("PaymentSystemRegistrations")
    @Expose
    @Valid
    private List<PaymentSystemRegistration> paymentSystemRegistrations = new ArrayList<PaymentSystemRegistration>();
    @SerializedName("CurrencyRefs")
    @Expose
    @Valid
    private List<Integer> currencyRefs = new ArrayList<Integer>();
    @SerializedName("UsersPreset")
    @Expose
    @Valid
    private List<UsersPresetRegistration> usersPreset = new ArrayList<UsersPresetRegistration>();
    @SerializedName("SelectLanguageDialog")
    @Expose
    private Possessor.ParamSelectLanguageDialog selectLanguageDialog = Possessor.ParamSelectLanguageDialog.fromValue(0);
    @SerializedName("InputAdditionalDataForSale")
    @Expose
    private DefSwitch inputAdditionalDataForSale = DefSwitch.fromValue(0);
    @SerializedName("AdditionalDataDisplayName")
    @Expose
    private String additionalDataDisplayName = "";
    @SerializedName("AdditionalDataUsage")
    @Expose
    private Possessor.ParamAdditionalDataUsage additionalDataUsage = Possessor.ParamAdditionalDataUsage.fromValue(0);
    @SerializedName("GluedReports")
    @Expose
    @Valid
    private GluedReports gluedReports;
    @SerializedName("ReportRefs")
    @Expose
    @Valid
    private List<Integer> reportRefs = new ArrayList<Integer>();
    @SerializedName("Logo")
    @Expose
    private String logo;

    public Integer getAnchor() {
        return anchor;
    }

    public void setAnchor(Integer anchor) {
        this.anchor = anchor;
    }

    public Possessor withAnchor(Integer anchor) {
        this.anchor = anchor;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Possessor withName(String name) {
        this.name = name;
        return this;
    }

    public String getMCC() {
        return mCC;
    }

    public void setMCC(String mCC) {
        this.mCC = mCC;
    }

    public Possessor withMCC(String mCC) {
        this.mCC = mCC;
        return this;
    }

    public Possessor.ParamPossessorType getPossessorType() {
        return possessorType;
    }

    public void setPossessorType(Possessor.ParamPossessorType possessorType) {
        this.possessorType = possessorType;
    }

    public Possessor withPossessorType(Possessor.ParamPossessorType possessorType) {
        this.possessorType = possessorType;
        return this;
    }

    public String getEmvMerchantNameLocation() {
        return emvMerchantNameLocation;
    }

    public void setEmvMerchantNameLocation(String emvMerchantNameLocation) {
        this.emvMerchantNameLocation = emvMerchantNameLocation;
    }

    public Possessor withEmvMerchantNameLocation(String emvMerchantNameLocation) {
        this.emvMerchantNameLocation = emvMerchantNameLocation;
        return this;
    }

    public List<PaymentSystemRegistration> getPaymentSystemRegistrations() {
        return paymentSystemRegistrations;
    }

    public void setPaymentSystemRegistrations(List<PaymentSystemRegistration> paymentSystemRegistrations) {
        this.paymentSystemRegistrations = paymentSystemRegistrations;
    }

    public Possessor withPaymentSystemRegistrations(List<PaymentSystemRegistration> paymentSystemRegistrations) {
        this.paymentSystemRegistrations = paymentSystemRegistrations;
        return this;
    }

    public List<Integer> getCurrencyRefs() {
        return currencyRefs;
    }

    public void setCurrencyRefs(List<Integer> currencyRefs) {
        this.currencyRefs = currencyRefs;
    }

    public Possessor withCurrencyRefs(List<Integer> currencyRefs) {
        this.currencyRefs = currencyRefs;
        return this;
    }

    public List<UsersPresetRegistration> getUsersPreset() {
        return usersPreset;
    }

    public void setUsersPreset(List<UsersPresetRegistration> usersPreset) {
        this.usersPreset = usersPreset;
    }

    public Possessor withUsersPreset(List<UsersPresetRegistration> usersPreset) {
        this.usersPreset = usersPreset;
        return this;
    }

    public Possessor.ParamSelectLanguageDialog getSelectLanguageDialog() {
        return selectLanguageDialog;
    }

    public void setSelectLanguageDialog(Possessor.ParamSelectLanguageDialog selectLanguageDialog) {
        this.selectLanguageDialog = selectLanguageDialog;
    }

    public Possessor withSelectLanguageDialog(Possessor.ParamSelectLanguageDialog selectLanguageDialog) {
        this.selectLanguageDialog = selectLanguageDialog;
        return this;
    }

    public DefSwitch getInputAdditionalDataForSale() {
        return inputAdditionalDataForSale;
    }

    public void setInputAdditionalDataForSale(DefSwitch inputAdditionalDataForSale) {
        this.inputAdditionalDataForSale = inputAdditionalDataForSale;
    }

    public Possessor withInputAdditionalDataForSale(DefSwitch inputAdditionalDataForSale) {
        this.inputAdditionalDataForSale = inputAdditionalDataForSale;
        return this;
    }

    public String getAdditionalDataDisplayName() {
        return additionalDataDisplayName;
    }

    public void setAdditionalDataDisplayName(String additionalDataDisplayName) {
        this.additionalDataDisplayName = additionalDataDisplayName;
    }

    public Possessor withAdditionalDataDisplayName(String additionalDataDisplayName) {
        this.additionalDataDisplayName = additionalDataDisplayName;
        return this;
    }

    public Possessor.ParamAdditionalDataUsage getAdditionalDataUsage() {
        return additionalDataUsage;
    }

    public void setAdditionalDataUsage(Possessor.ParamAdditionalDataUsage additionalDataUsage) {
        this.additionalDataUsage = additionalDataUsage;
    }

    public Possessor withAdditionalDataUsage(Possessor.ParamAdditionalDataUsage additionalDataUsage) {
        this.additionalDataUsage = additionalDataUsage;
        return this;
    }

    public GluedReports getGluedReports() {
        return gluedReports;
    }

    public void setGluedReports(GluedReports gluedReports) {
        this.gluedReports = gluedReports;
    }

    public Possessor withGluedReports(GluedReports gluedReports) {
        this.gluedReports = gluedReports;
        return this;
    }

    public List<Integer> getReportRefs() {
        return reportRefs;
    }

    public void setReportRefs(List<Integer> reportRefs) {
        this.reportRefs = reportRefs;
    }

    public Possessor withReportRefs(List<Integer> reportRefs) {
        this.reportRefs = reportRefs;
        return this;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Possessor withLogo(String logo) {
        this.logo = logo;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Possessor.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anchor");
        sb.append('=');
        sb.append(((this.anchor == null)?"<null>":this.anchor));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("mCC");
        sb.append('=');
        sb.append(((this.mCC == null)?"<null>":this.mCC));
        sb.append(',');
        sb.append("possessorType");
        sb.append('=');
        sb.append(((this.possessorType == null)?"<null>":this.possessorType));
        sb.append(',');
        sb.append("emvMerchantNameLocation");
        sb.append('=');
        sb.append(((this.emvMerchantNameLocation == null)?"<null>":this.emvMerchantNameLocation));
        sb.append(',');
        sb.append("paymentSystemRegistrations");
        sb.append('=');
        sb.append(((this.paymentSystemRegistrations == null)?"<null>":this.paymentSystemRegistrations));
        sb.append(',');
        sb.append("currencyRefs");
        sb.append('=');
        sb.append(((this.currencyRefs == null)?"<null>":this.currencyRefs));
        sb.append(',');
        sb.append("usersPreset");
        sb.append('=');
        sb.append(((this.usersPreset == null)?"<null>":this.usersPreset));
        sb.append(',');
        sb.append("selectLanguageDialog");
        sb.append('=');
        sb.append(((this.selectLanguageDialog == null)?"<null>":this.selectLanguageDialog));
        sb.append(',');
        sb.append("inputAdditionalDataForSale");
        sb.append('=');
        sb.append(((this.inputAdditionalDataForSale == null)?"<null>":this.inputAdditionalDataForSale));
        sb.append(',');
        sb.append("additionalDataDisplayName");
        sb.append('=');
        sb.append(((this.additionalDataDisplayName == null)?"<null>":this.additionalDataDisplayName));
        sb.append(',');
        sb.append("additionalDataUsage");
        sb.append('=');
        sb.append(((this.additionalDataUsage == null)?"<null>":this.additionalDataUsage));
        sb.append(',');
        sb.append("gluedReports");
        sb.append('=');
        sb.append(((this.gluedReports == null)?"<null>":this.gluedReports));
        sb.append(',');
        sb.append("reportRefs");
        sb.append('=');
        sb.append(((this.reportRefs == null)?"<null>":this.reportRefs));
        sb.append(',');
        sb.append("logo");
        sb.append('=');
        sb.append(((this.logo == null)?"<null>":this.logo));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public enum ParamAdditionalDataUsage {

        @SerializedName("0")
        SendToHost(0),
        @SerializedName("1")
        ReceiptPrintOnly(1);
        private final Integer value;
        private final static Map<Integer, Possessor.ParamAdditionalDataUsage> CONSTANTS = new HashMap<Integer, Possessor.ParamAdditionalDataUsage>();

        static {
            for (Possessor.ParamAdditionalDataUsage c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ParamAdditionalDataUsage(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static Possessor.ParamAdditionalDataUsage fromValue(Integer value) {
            Possessor.ParamAdditionalDataUsage constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum ParamPossessorType {

        @SerializedName("0")
        PossessorType_Bank(0),
        @SerializedName("1")
        PossessorType_Merchant(1);
        private final Integer value;
        private final static Map<Integer, Possessor.ParamPossessorType> CONSTANTS = new HashMap<Integer, Possessor.ParamPossessorType>();

        static {
            for (Possessor.ParamPossessorType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ParamPossessorType(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static Possessor.ParamPossessorType fromValue(Integer value) {
            Possessor.ParamPossessorType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum ParamSelectLanguageDialog {

        @SerializedName("0")
        SelectLanguageDialog_Off(0),
        @SerializedName("1")
        SelectLanguageDialog_On(1),
        @SerializedName("2")
        SelectLanguageDialog_Optimized(2);
        private final Integer value;
        private final static Map<Integer, Possessor.ParamSelectLanguageDialog> CONSTANTS = new HashMap<Integer, Possessor.ParamSelectLanguageDialog>();

        static {
            for (Possessor.ParamSelectLanguageDialog c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ParamSelectLanguageDialog(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static Possessor.ParamSelectLanguageDialog fromValue(Integer value) {
            Possessor.ParamSelectLanguageDialog constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
