
package com.inpas.parser.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TerminalProfile {

    @SerializedName("Anchor")
    @Expose
    private Integer anchor;
    @SerializedName("Name")
    @Expose
    private String name = "";
    @SerializedName("TerminalType")
    @Expose
    private TerminalProfile.ParamTerminalType terminalType = TerminalProfile.ParamTerminalType.fromValue(0);
    @SerializedName("CardProductRules")
    @Expose
    @Valid
    private List<CardProductRule> cardProductRules = new ArrayList<CardProductRule>();
    @SerializedName("VisualCheck")
    @Expose
    private TerminalProfile.ParamVisualCheck visualCheck = TerminalProfile.ParamVisualCheck.fromValue(0);
    @SerializedName("ForceOnline")
    @Expose
    private DefSwitch forceOnline = DefSwitch.fromValue(0);
    @SerializedName("MotoOperations")
    @Expose
    @Valid
    private List<DefOperation> motoOperations = new ArrayList<DefOperation>();
    @SerializedName("MidleReceiptRefs")
    @Expose
    @Valid
    private List<Integer> midleReceiptRefs = new ArrayList<Integer>();
    @SerializedName("FinalReceiptRefs")
    @Expose
    @Valid
    private List<Integer> finalReceiptRefs = new ArrayList<Integer>();
    @SerializedName("ReportRefs")
    @Expose
    @Valid
    private List<Integer> reportRefs = new ArrayList<Integer>();
    @SerializedName("EmvTerminalCapabilities")
    @Expose
    @Valid
    private List<Byte> emvTerminalCapabilities = new ArrayList<Byte>();
    @SerializedName("CvmCapability_NoCvmRequired")
    @Expose
    @Valid
    private Byte cvmCapability_NoCvmRequired;
    @SerializedName("EmvAdditionalTerminalCapabilities")
    @Expose
    @Valid
    private List<Byte> emvAdditionalTerminalCapabilities = new ArrayList<Byte>();
    @SerializedName("BypassPIN")
    @Expose
    private DefSwitch bypassPIN = DefSwitch.fromValue(0);
    @SerializedName("UseDirectCancel")
    @Expose
    private DefSwitch useDirectCancel = DefSwitch.fromValue(0);
    @SerializedName("UseManualEnter")
    @Expose
    private DefSwitch useManualEnter = DefSwitch.fromValue(0);
    @SerializedName("UseSoundNotAproved")
    @Expose
    private DefSwitch useSoundNotAproved = DefSwitch.fromValue(0);
    @SerializedName("UseSoundRemoveCard")
    @Expose
    private DefSwitch useSoundRemoveCard = DefSwitch.fromValue(0);
    @SerializedName("AutoReversalAlert")
    @Expose
    private DefSwitch autoReversalAlert = DefSwitch.fromValue(0);
    @SerializedName("MaxOperationsInBatch")
    @Expose
    private Integer maxOperationsInBatch;
    @SerializedName("HotlinePhoneMessage")
    @Expose
    private String hotlinePhoneMessage = "";
    @SerializedName("UnableToGoOnlineCase")
    @Expose
    private TerminalProfile.ParamUnableToGoOnlineCase unableToGoOnlineCase = TerminalProfile.ParamUnableToGoOnlineCase.fromValue(0);
    @SerializedName("EmvThresholdValue")
    @Expose
    @Valid
    private BigInteger emvThresholdValue;
    @SerializedName("EmvTargetPercentage")
    @Expose
    private Integer emvTargetPercentage;
    @SerializedName("EmvMaximumTargetPercentage")
    @Expose
    private Integer emvMaximumTargetPercentage;
    @SerializedName("CardHolderConfirmAmount")
    @Expose
    private DefSwitch cardHolderConfirmAmount = DefSwitch.fromValue(0);

    public Integer getAnchor() {
        return anchor;
    }

    public void setAnchor(Integer anchor) {
        this.anchor = anchor;
    }

    public TerminalProfile withAnchor(Integer anchor) {
        this.anchor = anchor;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TerminalProfile withName(String name) {
        this.name = name;
        return this;
    }

    public TerminalProfile.ParamTerminalType getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(TerminalProfile.ParamTerminalType terminalType) {
        this.terminalType = terminalType;
    }

    public TerminalProfile withTerminalType(TerminalProfile.ParamTerminalType terminalType) {
        this.terminalType = terminalType;
        return this;
    }

    public List<CardProductRule> getCardProductRules() {
        return cardProductRules;
    }

    public void setCardProductRules(List<CardProductRule> cardProductRules) {
        this.cardProductRules = cardProductRules;
    }

    public TerminalProfile withCardProductRules(List<CardProductRule> cardProductRules) {
        this.cardProductRules = cardProductRules;
        return this;
    }

    public TerminalProfile.ParamVisualCheck getVisualCheck() {
        return visualCheck;
    }

    public void setVisualCheck(TerminalProfile.ParamVisualCheck visualCheck) {
        this.visualCheck = visualCheck;
    }

    public TerminalProfile withVisualCheck(TerminalProfile.ParamVisualCheck visualCheck) {
        this.visualCheck = visualCheck;
        return this;
    }

    public DefSwitch getForceOnline() {
        return forceOnline;
    }

    public void setForceOnline(DefSwitch forceOnline) {
        this.forceOnline = forceOnline;
    }

    public TerminalProfile withForceOnline(DefSwitch forceOnline) {
        this.forceOnline = forceOnline;
        return this;
    }

    public List<DefOperation> getMotoOperations() {
        return motoOperations;
    }

    public void setMotoOperations(List<DefOperation> motoOperations) {
        this.motoOperations = motoOperations;
    }

    public TerminalProfile withMotoOperations(List<DefOperation> motoOperations) {
        this.motoOperations = motoOperations;
        return this;
    }

    public List<Integer> getMidleReceiptRefs() {
        return midleReceiptRefs;
    }

    public void setMidleReceiptRefs(List<Integer> midleReceiptRefs) {
        this.midleReceiptRefs = midleReceiptRefs;
    }

    public TerminalProfile withMidleReceiptRefs(List<Integer> midleReceiptRefs) {
        this.midleReceiptRefs = midleReceiptRefs;
        return this;
    }

    public List<Integer> getFinalReceiptRefs() {
        return finalReceiptRefs;
    }

    public void setFinalReceiptRefs(List<Integer> finalReceiptRefs) {
        this.finalReceiptRefs = finalReceiptRefs;
    }

    public TerminalProfile withFinalReceiptRefs(List<Integer> finalReceiptRefs) {
        this.finalReceiptRefs = finalReceiptRefs;
        return this;
    }

    public List<Integer> getReportRefs() {
        return reportRefs;
    }

    public void setReportRefs(List<Integer> reportRefs) {
        this.reportRefs = reportRefs;
    }

    public TerminalProfile withReportRefs(List<Integer> reportRefs) {
        this.reportRefs = reportRefs;
        return this;
    }

    public List<Byte> getEmvTerminalCapabilities() {
        return emvTerminalCapabilities;
    }

    public void setEmvTerminalCapabilities(List<Byte> emvTerminalCapabilities) {
        this.emvTerminalCapabilities = emvTerminalCapabilities;
    }

    public TerminalProfile withEmvTerminalCapabilities(List<Byte> emvTerminalCapabilities) {
        this.emvTerminalCapabilities = emvTerminalCapabilities;
        return this;
    }

    public Byte getCvmCapability_NoCvmRequired() {
        return cvmCapability_NoCvmRequired;
    }

    public void setCvmCapability_NoCvmRequired(Byte cvmCapability_NoCvmRequired) {
        this.cvmCapability_NoCvmRequired = cvmCapability_NoCvmRequired;
    }

    public TerminalProfile withCvmCapability_NoCvmRequired(Byte cvmCapability_NoCvmRequired) {
        this.cvmCapability_NoCvmRequired = cvmCapability_NoCvmRequired;
        return this;
    }

    public List<Byte> getEmvAdditionalTerminalCapabilities() {
        return emvAdditionalTerminalCapabilities;
    }

    public void setEmvAdditionalTerminalCapabilities(List<Byte> emvAdditionalTerminalCapabilities) {
        this.emvAdditionalTerminalCapabilities = emvAdditionalTerminalCapabilities;
    }

    public TerminalProfile withEmvAdditionalTerminalCapabilities(List<Byte> emvAdditionalTerminalCapabilities) {
        this.emvAdditionalTerminalCapabilities = emvAdditionalTerminalCapabilities;
        return this;
    }

    public DefSwitch getBypassPIN() {
        return bypassPIN;
    }

    public void setBypassPIN(DefSwitch bypassPIN) {
        this.bypassPIN = bypassPIN;
    }

    public TerminalProfile withBypassPIN(DefSwitch bypassPIN) {
        this.bypassPIN = bypassPIN;
        return this;
    }

    public DefSwitch getUseDirectCancel() {
        return useDirectCancel;
    }

    public void setUseDirectCancel(DefSwitch useDirectCancel) {
        this.useDirectCancel = useDirectCancel;
    }

    public TerminalProfile withUseDirectCancel(DefSwitch useDirectCancel) {
        this.useDirectCancel = useDirectCancel;
        return this;
    }

    public DefSwitch getUseManualEnter() {
        return useManualEnter;
    }

    public void setUseManualEnter(DefSwitch useManualEnter) {
        this.useManualEnter = useManualEnter;
    }

    public TerminalProfile withUseManualEnter(DefSwitch useManualEnter) {
        this.useManualEnter = useManualEnter;
        return this;
    }

    public DefSwitch getUseSoundNotAproved() {
        return useSoundNotAproved;
    }

    public void setUseSoundNotAproved(DefSwitch useSoundNotAproved) {
        this.useSoundNotAproved = useSoundNotAproved;
    }

    public TerminalProfile withUseSoundNotAproved(DefSwitch useSoundNotAproved) {
        this.useSoundNotAproved = useSoundNotAproved;
        return this;
    }

    public DefSwitch getUseSoundRemoveCard() {
        return useSoundRemoveCard;
    }

    public void setUseSoundRemoveCard(DefSwitch useSoundRemoveCard) {
        this.useSoundRemoveCard = useSoundRemoveCard;
    }

    public TerminalProfile withUseSoundRemoveCard(DefSwitch useSoundRemoveCard) {
        this.useSoundRemoveCard = useSoundRemoveCard;
        return this;
    }

    public DefSwitch getAutoReversalAlert() {
        return autoReversalAlert;
    }

    public void setAutoReversalAlert(DefSwitch autoReversalAlert) {
        this.autoReversalAlert = autoReversalAlert;
    }

    public TerminalProfile withAutoReversalAlert(DefSwitch autoReversalAlert) {
        this.autoReversalAlert = autoReversalAlert;
        return this;
    }

    public Integer getMaxOperationsInBatch() {
        return maxOperationsInBatch;
    }

    public void setMaxOperationsInBatch(Integer maxOperationsInBatch) {
        this.maxOperationsInBatch = maxOperationsInBatch;
    }

    public TerminalProfile withMaxOperationsInBatch(Integer maxOperationsInBatch) {
        this.maxOperationsInBatch = maxOperationsInBatch;
        return this;
    }

    public String getHotlinePhoneMessage() {
        return hotlinePhoneMessage;
    }

    public void setHotlinePhoneMessage(String hotlinePhoneMessage) {
        this.hotlinePhoneMessage = hotlinePhoneMessage;
    }

    public TerminalProfile withHotlinePhoneMessage(String hotlinePhoneMessage) {
        this.hotlinePhoneMessage = hotlinePhoneMessage;
        return this;
    }

    public TerminalProfile.ParamUnableToGoOnlineCase getUnableToGoOnlineCase() {
        return unableToGoOnlineCase;
    }

    public void setUnableToGoOnlineCase(TerminalProfile.ParamUnableToGoOnlineCase unableToGoOnlineCase) {
        this.unableToGoOnlineCase = unableToGoOnlineCase;
    }

    public TerminalProfile withUnableToGoOnlineCase(TerminalProfile.ParamUnableToGoOnlineCase unableToGoOnlineCase) {
        this.unableToGoOnlineCase = unableToGoOnlineCase;
        return this;
    }

    public BigInteger getEmvThresholdValue() {
        return emvThresholdValue;
    }

    public void setEmvThresholdValue(BigInteger emvThresholdValue) {
        this.emvThresholdValue = emvThresholdValue;
    }

    public TerminalProfile withEmvThresholdValue(BigInteger emvThresholdValue) {
        this.emvThresholdValue = emvThresholdValue;
        return this;
    }

    public Integer getEmvTargetPercentage() {
        return emvTargetPercentage;
    }

    public void setEmvTargetPercentage(Integer emvTargetPercentage) {
        this.emvTargetPercentage = emvTargetPercentage;
    }

    public TerminalProfile withEmvTargetPercentage(Integer emvTargetPercentage) {
        this.emvTargetPercentage = emvTargetPercentage;
        return this;
    }

    public Integer getEmvMaximumTargetPercentage() {
        return emvMaximumTargetPercentage;
    }

    public void setEmvMaximumTargetPercentage(Integer emvMaximumTargetPercentage) {
        this.emvMaximumTargetPercentage = emvMaximumTargetPercentage;
    }

    public TerminalProfile withEmvMaximumTargetPercentage(Integer emvMaximumTargetPercentage) {
        this.emvMaximumTargetPercentage = emvMaximumTargetPercentage;
        return this;
    }

    public DefSwitch getCardHolderConfirmAmount() {
        return cardHolderConfirmAmount;
    }

    public void setCardHolderConfirmAmount(DefSwitch cardHolderConfirmAmount) {
        this.cardHolderConfirmAmount = cardHolderConfirmAmount;
    }

    public TerminalProfile withCardHolderConfirmAmount(DefSwitch cardHolderConfirmAmount) {
        this.cardHolderConfirmAmount = cardHolderConfirmAmount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TerminalProfile.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anchor");
        sb.append('=');
        sb.append(((this.anchor == null)?"<null>":this.anchor));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("terminalType");
        sb.append('=');
        sb.append(((this.terminalType == null)?"<null>":this.terminalType));
        sb.append(',');
        sb.append("cardProductRules");
        sb.append('=');
        sb.append(((this.cardProductRules == null)?"<null>":this.cardProductRules));
        sb.append(',');
        sb.append("visualCheck");
        sb.append('=');
        sb.append(((this.visualCheck == null)?"<null>":this.visualCheck));
        sb.append(',');
        sb.append("forceOnline");
        sb.append('=');
        sb.append(((this.forceOnline == null)?"<null>":this.forceOnline));
        sb.append(',');
        sb.append("motoOperations");
        sb.append('=');
        sb.append(((this.motoOperations == null)?"<null>":this.motoOperations));
        sb.append(',');
        sb.append("midleReceiptRefs");
        sb.append('=');
        sb.append(((this.midleReceiptRefs == null)?"<null>":this.midleReceiptRefs));
        sb.append(',');
        sb.append("finalReceiptRefs");
        sb.append('=');
        sb.append(((this.finalReceiptRefs == null)?"<null>":this.finalReceiptRefs));
        sb.append(',');
        sb.append("reportRefs");
        sb.append('=');
        sb.append(((this.reportRefs == null)?"<null>":this.reportRefs));
        sb.append(',');
        sb.append("emvTerminalCapabilities");
        sb.append('=');
        sb.append(((this.emvTerminalCapabilities == null)?"<null>":this.emvTerminalCapabilities));
        sb.append(',');
        sb.append("cvmCapability_NoCvmRequired");
        sb.append('=');
        sb.append(((this.cvmCapability_NoCvmRequired == null)?"<null>":this.cvmCapability_NoCvmRequired));
        sb.append(',');
        sb.append("emvAdditionalTerminalCapabilities");
        sb.append('=');
        sb.append(((this.emvAdditionalTerminalCapabilities == null)?"<null>":this.emvAdditionalTerminalCapabilities));
        sb.append(',');
        sb.append("bypassPIN");
        sb.append('=');
        sb.append(((this.bypassPIN == null)?"<null>":this.bypassPIN));
        sb.append(',');
        sb.append("useDirectCancel");
        sb.append('=');
        sb.append(((this.useDirectCancel == null)?"<null>":this.useDirectCancel));
        sb.append(',');
        sb.append("useManualEnter");
        sb.append('=');
        sb.append(((this.useManualEnter == null)?"<null>":this.useManualEnter));
        sb.append(',');
        sb.append("useSoundNotAproved");
        sb.append('=');
        sb.append(((this.useSoundNotAproved == null)?"<null>":this.useSoundNotAproved));
        sb.append(',');
        sb.append("useSoundRemoveCard");
        sb.append('=');
        sb.append(((this.useSoundRemoveCard == null)?"<null>":this.useSoundRemoveCard));
        sb.append(',');
        sb.append("autoReversalAlert");
        sb.append('=');
        sb.append(((this.autoReversalAlert == null)?"<null>":this.autoReversalAlert));
        sb.append(',');
        sb.append("maxOperationsInBatch");
        sb.append('=');
        sb.append(((this.maxOperationsInBatch == null)?"<null>":this.maxOperationsInBatch));
        sb.append(',');
        sb.append("hotlinePhoneMessage");
        sb.append('=');
        sb.append(((this.hotlinePhoneMessage == null)?"<null>":this.hotlinePhoneMessage));
        sb.append(',');
        sb.append("unableToGoOnlineCase");
        sb.append('=');
        sb.append(((this.unableToGoOnlineCase == null)?"<null>":this.unableToGoOnlineCase));
        sb.append(',');
        sb.append("emvThresholdValue");
        sb.append('=');
        sb.append(((this.emvThresholdValue == null)?"<null>":this.emvThresholdValue));
        sb.append(',');
        sb.append("emvTargetPercentage");
        sb.append('=');
        sb.append(((this.emvTargetPercentage == null)?"<null>":this.emvTargetPercentage));
        sb.append(',');
        sb.append("emvMaximumTargetPercentage");
        sb.append('=');
        sb.append(((this.emvMaximumTargetPercentage == null)?"<null>":this.emvMaximumTargetPercentage));
        sb.append(',');
        sb.append("cardHolderConfirmAmount");
        sb.append('=');
        sb.append(((this.cardHolderConfirmAmount == null)?"<null>":this.cardHolderConfirmAmount));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public enum ParamTerminalType {

        @SerializedName("0")
        TerminalType_Unknown(0),
        @SerializedName("1")
        TerminalType_POS(1),
        @SerializedName("2")
        TerminalType_BBT(2),
        @SerializedName("3")
        TerminalType_QUASI(3),
        @SerializedName("4")
        TerminalType_CAT(4);
        private final Integer value;
        private final static Map<Integer, TerminalProfile.ParamTerminalType> CONSTANTS = new HashMap<Integer, TerminalProfile.ParamTerminalType>();

        static {
            for (TerminalProfile.ParamTerminalType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ParamTerminalType(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TerminalProfile.ParamTerminalType fromValue(Integer value) {
            TerminalProfile.ParamTerminalType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum ParamUnableToGoOnlineCase {

        @SerializedName("0")
        UnableToGoOnline_ApproveDisabled(0),
        @SerializedName("1")
        UnableToGoOnline_MenuCase(1),
        @SerializedName("2")
        UnableToGoOnline_Standart(2);
        private final Integer value;
        private final static Map<Integer, TerminalProfile.ParamUnableToGoOnlineCase> CONSTANTS = new HashMap<Integer, TerminalProfile.ParamUnableToGoOnlineCase>();

        static {
            for (TerminalProfile.ParamUnableToGoOnlineCase c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ParamUnableToGoOnlineCase(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TerminalProfile.ParamUnableToGoOnlineCase fromValue(Integer value) {
            TerminalProfile.ParamUnableToGoOnlineCase constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum ParamVisualCheck {

        @SerializedName("0")
        VisualCheck_4_Last_Digits(0),
        @SerializedName("1")
        VisualCheck_Disabled(1);
        private final Integer value;
        private final static Map<Integer, TerminalProfile.ParamVisualCheck> CONSTANTS = new HashMap<Integer, TerminalProfile.ParamVisualCheck>();

        static {
            for (TerminalProfile.ParamVisualCheck c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ParamVisualCheck(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TerminalProfile.ParamVisualCheck fromValue(Integer value) {
            TerminalProfile.ParamVisualCheck constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
