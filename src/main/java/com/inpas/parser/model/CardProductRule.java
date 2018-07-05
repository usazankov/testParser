
package com.inpas.parser.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CardProductRule {

    @SerializedName("CardProductRef")
    @Expose
    private Integer cardProductRef;
    @SerializedName("CardTechnology")
    @Expose
    private DefCardTechnology cardTechnology = DefCardTechnology.fromValue(3);
    @SerializedName("EMVAppSelectIndicator")
    @Expose
    private DefSwitch eMVAppSelectIndicator = DefSwitch.fromValue(0);
    @SerializedName("EnabledOperations")
    @Expose
    @Valid
    private List<DefOperation> enabledOperations = new ArrayList<DefOperation>();
    @SerializedName("TransactionLimit")
    @Expose
    @Valid
    private BigInteger transactionLimit;
    @SerializedName("TransactionLimitForRefund")
    @Expose
    @Valid
    private BigInteger transactionLimitForRefund;
    @SerializedName("OnDeviceTransactionLimit")
    @Expose
    @Valid
    private BigInteger onDeviceTransactionLimit;
    @SerializedName("FloorLimitDomestic")
    @Expose
    @Valid
    private BigInteger floorLimitDomestic;
    @SerializedName("FloorLimitInternational")
    @Expose
    @Valid
    private BigInteger floorLimitInternational;
    @SerializedName("MagCVMs")
    @Expose
    @Valid
    private List<MagCVM> magCVMs = new ArrayList<MagCVM>();
    @SerializedName("ChipCVM")
    @Expose
    @Valid
    private ChipCVM chipCVM;
    @SerializedName("CvmLimit")
    @Expose
    @Valid
    private BigInteger cvmLimit;
    @SerializedName("TransactionSchema")
    @Expose
    @Valid
    private Byte transactionSchema;
    @SerializedName("CtlssMCKernelConfig")
    @Expose
    @Valid
    private Byte ctlssMCKernelConfig;
    @SerializedName("CtlssMirTPMCaps")
    @Expose
    @Valid
    private List<Byte> ctlssMirTPMCaps = new ArrayList<Byte>();
    @SerializedName("CtlssMirDataExchTagList")
    @Expose
    @Valid
    private List<Byte> ctlssMirDataExchTagList = new ArrayList<Byte>();
    @SerializedName("AdditionalData")
    @Expose
    @Valid
    private List<Byte> additionalData = new ArrayList<Byte>();
    @SerializedName("EmvTerminalCapabilities")
    @Expose
    @Valid
    private List<Byte> emvTerminalCapabilities = new ArrayList<Byte>();
    @SerializedName("CvmCapability_NoCvmRequired")
    @Expose
    @Valid
    private Byte cvmCapability_NoCvmRequired;
    @SerializedName("MagStrCvmCapability_NoCvmRequired")
    @Expose
    private DefMagStrCvmCap magStrCvmCapability_NoCvmRequired = DefMagStrCvmCap.fromValue(0);
    @SerializedName("MagStrCvmCapability_CvmRequired")
    @Expose
    private DefMagStrCvmCap magStrCvmCapability_CvmRequired = DefMagStrCvmCap.fromValue(0);
    @SerializedName("EmvAdditionalTerminalCapabilities")
    @Expose
    @Valid
    private List<Byte> emvAdditionalTerminalCapabilities = new ArrayList<Byte>();
    @SerializedName("CtlssVisaTransactionQualifiers")
    @Expose
    @Valid
    private List<Byte> ctlssVisaTransactionQualifiers = new ArrayList<Byte>();
    @SerializedName("CtlssCupTransactionQualifiers")
    @Expose
    @Valid
    private List<Byte> ctlssCupTransactionQualifiers = new ArrayList<Byte>();
    @SerializedName("TerminalInterchangeProfile")
    @Expose
    @Valid
    private List<Byte> terminalInterchangeProfile = new ArrayList<Byte>();
    @SerializedName("CombinationOptions")
    @Expose
    @Valid
    private List<Byte> combinationOptions = new ArrayList<Byte>();
    @SerializedName("TAC_Denial")
    @Expose
    @Valid
    private List<Byte> tAC_Denial = new ArrayList<Byte>();
    @SerializedName("TAC_Online")
    @Expose
    @Valid
    private List<Byte> tAC_Online = new ArrayList<Byte>();
    @SerializedName("TAC_Default")
    @Expose
    @Valid
    private List<Byte> tAC_Default = new ArrayList<Byte>();
    @SerializedName("CtlssMCForceMagstripe")
    @Expose
    private DefSwitch ctlssMCForceMagstripe = DefSwitch.fromValue(0);
    @SerializedName("CtlssPPassMagstripeVersion")
    @Expose
    @Valid
    private List<Byte> ctlssPPassMagstripeVersion = new ArrayList<Byte>();
    @SerializedName("SkipCheckExpDate")
    @Expose
    private DefSwitch skipCheckExpDate = DefSwitch.fromValue(0);
    @SerializedName("AllowFallback")
    @Expose
    private DefSwitch allowFallback = DefSwitch.fromValue(0);

    public Integer getCardProductRef() {
        return cardProductRef;
    }

    public void setCardProductRef(Integer cardProductRef) {
        this.cardProductRef = cardProductRef;
    }

    public CardProductRule withCardProductRef(Integer cardProductRef) {
        this.cardProductRef = cardProductRef;
        return this;
    }

    public DefCardTechnology getCardTechnology() {
        return cardTechnology;
    }

    public void setCardTechnology(DefCardTechnology cardTechnology) {
        this.cardTechnology = cardTechnology;
    }

    public CardProductRule withCardTechnology(DefCardTechnology cardTechnology) {
        this.cardTechnology = cardTechnology;
        return this;
    }

    public DefSwitch getEMVAppSelectIndicator() {
        return eMVAppSelectIndicator;
    }

    public void setEMVAppSelectIndicator(DefSwitch eMVAppSelectIndicator) {
        this.eMVAppSelectIndicator = eMVAppSelectIndicator;
    }

    public CardProductRule withEMVAppSelectIndicator(DefSwitch eMVAppSelectIndicator) {
        this.eMVAppSelectIndicator = eMVAppSelectIndicator;
        return this;
    }

    public List<DefOperation> getEnabledOperations() {
        return enabledOperations;
    }

    public void setEnabledOperations(List<DefOperation> enabledOperations) {
        this.enabledOperations = enabledOperations;
    }

    public CardProductRule withEnabledOperations(List<DefOperation> enabledOperations) {
        this.enabledOperations = enabledOperations;
        return this;
    }

    public BigInteger getTransactionLimit() {
        return transactionLimit;
    }

    public void setTransactionLimit(BigInteger transactionLimit) {
        this.transactionLimit = transactionLimit;
    }

    public CardProductRule withTransactionLimit(BigInteger transactionLimit) {
        this.transactionLimit = transactionLimit;
        return this;
    }

    public BigInteger getTransactionLimitForRefund() {
        return transactionLimitForRefund;
    }

    public void setTransactionLimitForRefund(BigInteger transactionLimitForRefund) {
        this.transactionLimitForRefund = transactionLimitForRefund;
    }

    public CardProductRule withTransactionLimitForRefund(BigInteger transactionLimitForRefund) {
        this.transactionLimitForRefund = transactionLimitForRefund;
        return this;
    }

    public BigInteger getOnDeviceTransactionLimit() {
        return onDeviceTransactionLimit;
    }

    public void setOnDeviceTransactionLimit(BigInteger onDeviceTransactionLimit) {
        this.onDeviceTransactionLimit = onDeviceTransactionLimit;
    }

    public CardProductRule withOnDeviceTransactionLimit(BigInteger onDeviceTransactionLimit) {
        this.onDeviceTransactionLimit = onDeviceTransactionLimit;
        return this;
    }

    public BigInteger getFloorLimitDomestic() {
        return floorLimitDomestic;
    }

    public void setFloorLimitDomestic(BigInteger floorLimitDomestic) {
        this.floorLimitDomestic = floorLimitDomestic;
    }

    public CardProductRule withFloorLimitDomestic(BigInteger floorLimitDomestic) {
        this.floorLimitDomestic = floorLimitDomestic;
        return this;
    }

    public BigInteger getFloorLimitInternational() {
        return floorLimitInternational;
    }

    public void setFloorLimitInternational(BigInteger floorLimitInternational) {
        this.floorLimitInternational = floorLimitInternational;
    }

    public CardProductRule withFloorLimitInternational(BigInteger floorLimitInternational) {
        this.floorLimitInternational = floorLimitInternational;
        return this;
    }

    public List<MagCVM> getMagCVMs() {
        return magCVMs;
    }

    public void setMagCVMs(List<MagCVM> magCVMs) {
        this.magCVMs = magCVMs;
    }

    public CardProductRule withMagCVMs(List<MagCVM> magCVMs) {
        this.magCVMs = magCVMs;
        return this;
    }

    public ChipCVM getChipCVM() {
        return chipCVM;
    }

    public void setChipCVM(ChipCVM chipCVM) {
        this.chipCVM = chipCVM;
    }

    public CardProductRule withChipCVM(ChipCVM chipCVM) {
        this.chipCVM = chipCVM;
        return this;
    }

    public BigInteger getCvmLimit() {
        return cvmLimit;
    }

    public void setCvmLimit(BigInteger cvmLimit) {
        this.cvmLimit = cvmLimit;
    }

    public CardProductRule withCvmLimit(BigInteger cvmLimit) {
        this.cvmLimit = cvmLimit;
        return this;
    }

    public Byte getTransactionSchema() {
        return transactionSchema;
    }

    public void setTransactionSchema(Byte transactionSchema) {
        this.transactionSchema = transactionSchema;
    }

    public CardProductRule withTransactionSchema(Byte transactionSchema) {
        this.transactionSchema = transactionSchema;
        return this;
    }

    public Byte getCtlssMCKernelConfig() {
        return ctlssMCKernelConfig;
    }

    public void setCtlssMCKernelConfig(Byte ctlssMCKernelConfig) {
        this.ctlssMCKernelConfig = ctlssMCKernelConfig;
    }

    public CardProductRule withCtlssMCKernelConfig(Byte ctlssMCKernelConfig) {
        this.ctlssMCKernelConfig = ctlssMCKernelConfig;
        return this;
    }

    public List<Byte> getCtlssMirTPMCaps() {
        return ctlssMirTPMCaps;
    }

    public void setCtlssMirTPMCaps(List<Byte> ctlssMirTPMCaps) {
        this.ctlssMirTPMCaps = ctlssMirTPMCaps;
    }

    public CardProductRule withCtlssMirTPMCaps(List<Byte> ctlssMirTPMCaps) {
        this.ctlssMirTPMCaps = ctlssMirTPMCaps;
        return this;
    }

    public List<Byte> getCtlssMirDataExchTagList() {
        return ctlssMirDataExchTagList;
    }

    public void setCtlssMirDataExchTagList(List<Byte> ctlssMirDataExchTagList) {
        this.ctlssMirDataExchTagList = ctlssMirDataExchTagList;
    }

    public CardProductRule withCtlssMirDataExchTagList(List<Byte> ctlssMirDataExchTagList) {
        this.ctlssMirDataExchTagList = ctlssMirDataExchTagList;
        return this;
    }

    public List<Byte> getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(List<Byte> additionalData) {
        this.additionalData = additionalData;
    }

    public CardProductRule withAdditionalData(List<Byte> additionalData) {
        this.additionalData = additionalData;
        return this;
    }

    public List<Byte> getEmvTerminalCapabilities() {
        return emvTerminalCapabilities;
    }

    public void setEmvTerminalCapabilities(List<Byte> emvTerminalCapabilities) {
        this.emvTerminalCapabilities = emvTerminalCapabilities;
    }

    public CardProductRule withEmvTerminalCapabilities(List<Byte> emvTerminalCapabilities) {
        this.emvTerminalCapabilities = emvTerminalCapabilities;
        return this;
    }

    public Byte getCvmCapability_NoCvmRequired() {
        return cvmCapability_NoCvmRequired;
    }

    public void setCvmCapability_NoCvmRequired(Byte cvmCapability_NoCvmRequired) {
        this.cvmCapability_NoCvmRequired = cvmCapability_NoCvmRequired;
    }

    public CardProductRule withCvmCapability_NoCvmRequired(Byte cvmCapability_NoCvmRequired) {
        this.cvmCapability_NoCvmRequired = cvmCapability_NoCvmRequired;
        return this;
    }

    public DefMagStrCvmCap getMagStrCvmCapability_NoCvmRequired() {
        return magStrCvmCapability_NoCvmRequired;
    }

    public void setMagStrCvmCapability_NoCvmRequired(DefMagStrCvmCap magStrCvmCapability_NoCvmRequired) {
        this.magStrCvmCapability_NoCvmRequired = magStrCvmCapability_NoCvmRequired;
    }

    public CardProductRule withMagStrCvmCapability_NoCvmRequired(DefMagStrCvmCap magStrCvmCapability_NoCvmRequired) {
        this.magStrCvmCapability_NoCvmRequired = magStrCvmCapability_NoCvmRequired;
        return this;
    }

    public DefMagStrCvmCap getMagStrCvmCapability_CvmRequired() {
        return magStrCvmCapability_CvmRequired;
    }

    public void setMagStrCvmCapability_CvmRequired(DefMagStrCvmCap magStrCvmCapability_CvmRequired) {
        this.magStrCvmCapability_CvmRequired = magStrCvmCapability_CvmRequired;
    }

    public CardProductRule withMagStrCvmCapability_CvmRequired(DefMagStrCvmCap magStrCvmCapability_CvmRequired) {
        this.magStrCvmCapability_CvmRequired = magStrCvmCapability_CvmRequired;
        return this;
    }

    public List<Byte> getEmvAdditionalTerminalCapabilities() {
        return emvAdditionalTerminalCapabilities;
    }

    public void setEmvAdditionalTerminalCapabilities(List<Byte> emvAdditionalTerminalCapabilities) {
        this.emvAdditionalTerminalCapabilities = emvAdditionalTerminalCapabilities;
    }

    public CardProductRule withEmvAdditionalTerminalCapabilities(List<Byte> emvAdditionalTerminalCapabilities) {
        this.emvAdditionalTerminalCapabilities = emvAdditionalTerminalCapabilities;
        return this;
    }

    public List<Byte> getCtlssVisaTransactionQualifiers() {
        return ctlssVisaTransactionQualifiers;
    }

    public void setCtlssVisaTransactionQualifiers(List<Byte> ctlssVisaTransactionQualifiers) {
        this.ctlssVisaTransactionQualifiers = ctlssVisaTransactionQualifiers;
    }

    public CardProductRule withCtlssVisaTransactionQualifiers(List<Byte> ctlssVisaTransactionQualifiers) {
        this.ctlssVisaTransactionQualifiers = ctlssVisaTransactionQualifiers;
        return this;
    }

    public List<Byte> getCtlssCupTransactionQualifiers() {
        return ctlssCupTransactionQualifiers;
    }

    public void setCtlssCupTransactionQualifiers(List<Byte> ctlssCupTransactionQualifiers) {
        this.ctlssCupTransactionQualifiers = ctlssCupTransactionQualifiers;
    }

    public CardProductRule withCtlssCupTransactionQualifiers(List<Byte> ctlssCupTransactionQualifiers) {
        this.ctlssCupTransactionQualifiers = ctlssCupTransactionQualifiers;
        return this;
    }

    public List<Byte> getTerminalInterchangeProfile() {
        return terminalInterchangeProfile;
    }

    public void setTerminalInterchangeProfile(List<Byte> terminalInterchangeProfile) {
        this.terminalInterchangeProfile = terminalInterchangeProfile;
    }

    public CardProductRule withTerminalInterchangeProfile(List<Byte> terminalInterchangeProfile) {
        this.terminalInterchangeProfile = terminalInterchangeProfile;
        return this;
    }

    public List<Byte> getCombinationOptions() {
        return combinationOptions;
    }

    public void setCombinationOptions(List<Byte> combinationOptions) {
        this.combinationOptions = combinationOptions;
    }

    public CardProductRule withCombinationOptions(List<Byte> combinationOptions) {
        this.combinationOptions = combinationOptions;
        return this;
    }

    public List<Byte> getTAC_Denial() {
        return tAC_Denial;
    }

    public void setTAC_Denial(List<Byte> tAC_Denial) {
        this.tAC_Denial = tAC_Denial;
    }

    public CardProductRule withTAC_Denial(List<Byte> tAC_Denial) {
        this.tAC_Denial = tAC_Denial;
        return this;
    }

    public List<Byte> getTAC_Online() {
        return tAC_Online;
    }

    public void setTAC_Online(List<Byte> tAC_Online) {
        this.tAC_Online = tAC_Online;
    }

    public CardProductRule withTAC_Online(List<Byte> tAC_Online) {
        this.tAC_Online = tAC_Online;
        return this;
    }

    public List<Byte> getTAC_Default() {
        return tAC_Default;
    }

    public void setTAC_Default(List<Byte> tAC_Default) {
        this.tAC_Default = tAC_Default;
    }

    public CardProductRule withTAC_Default(List<Byte> tAC_Default) {
        this.tAC_Default = tAC_Default;
        return this;
    }

    public DefSwitch getCtlssMCForceMagstripe() {
        return ctlssMCForceMagstripe;
    }

    public void setCtlssMCForceMagstripe(DefSwitch ctlssMCForceMagstripe) {
        this.ctlssMCForceMagstripe = ctlssMCForceMagstripe;
    }

    public CardProductRule withCtlssMCForceMagstripe(DefSwitch ctlssMCForceMagstripe) {
        this.ctlssMCForceMagstripe = ctlssMCForceMagstripe;
        return this;
    }

    public List<Byte> getCtlssPPassMagstripeVersion() {
        return ctlssPPassMagstripeVersion;
    }

    public void setCtlssPPassMagstripeVersion(List<Byte> ctlssPPassMagstripeVersion) {
        this.ctlssPPassMagstripeVersion = ctlssPPassMagstripeVersion;
    }

    public CardProductRule withCtlssPPassMagstripeVersion(List<Byte> ctlssPPassMagstripeVersion) {
        this.ctlssPPassMagstripeVersion = ctlssPPassMagstripeVersion;
        return this;
    }

    public DefSwitch getSkipCheckExpDate() {
        return skipCheckExpDate;
    }

    public void setSkipCheckExpDate(DefSwitch skipCheckExpDate) {
        this.skipCheckExpDate = skipCheckExpDate;
    }

    public CardProductRule withSkipCheckExpDate(DefSwitch skipCheckExpDate) {
        this.skipCheckExpDate = skipCheckExpDate;
        return this;
    }

    public DefSwitch getAllowFallback() {
        return allowFallback;
    }

    public void setAllowFallback(DefSwitch allowFallback) {
        this.allowFallback = allowFallback;
    }

    public CardProductRule withAllowFallback(DefSwitch allowFallback) {
        this.allowFallback = allowFallback;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CardProductRule.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cardProductRef");
        sb.append('=');
        sb.append(((this.cardProductRef == null)?"<null>":this.cardProductRef));
        sb.append(',');
        sb.append("cardTechnology");
        sb.append('=');
        sb.append(((this.cardTechnology == null)?"<null>":this.cardTechnology));
        sb.append(',');
        sb.append("eMVAppSelectIndicator");
        sb.append('=');
        sb.append(((this.eMVAppSelectIndicator == null)?"<null>":this.eMVAppSelectIndicator));
        sb.append(',');
        sb.append("enabledOperations");
        sb.append('=');
        sb.append(((this.enabledOperations == null)?"<null>":this.enabledOperations));
        sb.append(',');
        sb.append("transactionLimit");
        sb.append('=');
        sb.append(((this.transactionLimit == null)?"<null>":this.transactionLimit));
        sb.append(',');
        sb.append("transactionLimitForRefund");
        sb.append('=');
        sb.append(((this.transactionLimitForRefund == null)?"<null>":this.transactionLimitForRefund));
        sb.append(',');
        sb.append("onDeviceTransactionLimit");
        sb.append('=');
        sb.append(((this.onDeviceTransactionLimit == null)?"<null>":this.onDeviceTransactionLimit));
        sb.append(',');
        sb.append("floorLimitDomestic");
        sb.append('=');
        sb.append(((this.floorLimitDomestic == null)?"<null>":this.floorLimitDomestic));
        sb.append(',');
        sb.append("floorLimitInternational");
        sb.append('=');
        sb.append(((this.floorLimitInternational == null)?"<null>":this.floorLimitInternational));
        sb.append(',');
        sb.append("magCVMs");
        sb.append('=');
        sb.append(((this.magCVMs == null)?"<null>":this.magCVMs));
        sb.append(',');
        sb.append("chipCVM");
        sb.append('=');
        sb.append(((this.chipCVM == null)?"<null>":this.chipCVM));
        sb.append(',');
        sb.append("cvmLimit");
        sb.append('=');
        sb.append(((this.cvmLimit == null)?"<null>":this.cvmLimit));
        sb.append(',');
        sb.append("transactionSchema");
        sb.append('=');
        sb.append(((this.transactionSchema == null)?"<null>":this.transactionSchema));
        sb.append(',');
        sb.append("ctlssMCKernelConfig");
        sb.append('=');
        sb.append(((this.ctlssMCKernelConfig == null)?"<null>":this.ctlssMCKernelConfig));
        sb.append(',');
        sb.append("ctlssMirTPMCaps");
        sb.append('=');
        sb.append(((this.ctlssMirTPMCaps == null)?"<null>":this.ctlssMirTPMCaps));
        sb.append(',');
        sb.append("ctlssMirDataExchTagList");
        sb.append('=');
        sb.append(((this.ctlssMirDataExchTagList == null)?"<null>":this.ctlssMirDataExchTagList));
        sb.append(',');
        sb.append("additionalData");
        sb.append('=');
        sb.append(((this.additionalData == null)?"<null>":this.additionalData));
        sb.append(',');
        sb.append("emvTerminalCapabilities");
        sb.append('=');
        sb.append(((this.emvTerminalCapabilities == null)?"<null>":this.emvTerminalCapabilities));
        sb.append(',');
        sb.append("cvmCapability_NoCvmRequired");
        sb.append('=');
        sb.append(((this.cvmCapability_NoCvmRequired == null)?"<null>":this.cvmCapability_NoCvmRequired));
        sb.append(',');
        sb.append("magStrCvmCapability_NoCvmRequired");
        sb.append('=');
        sb.append(((this.magStrCvmCapability_NoCvmRequired == null)?"<null>":this.magStrCvmCapability_NoCvmRequired));
        sb.append(',');
        sb.append("magStrCvmCapability_CvmRequired");
        sb.append('=');
        sb.append(((this.magStrCvmCapability_CvmRequired == null)?"<null>":this.magStrCvmCapability_CvmRequired));
        sb.append(',');
        sb.append("emvAdditionalTerminalCapabilities");
        sb.append('=');
        sb.append(((this.emvAdditionalTerminalCapabilities == null)?"<null>":this.emvAdditionalTerminalCapabilities));
        sb.append(',');
        sb.append("ctlssVisaTransactionQualifiers");
        sb.append('=');
        sb.append(((this.ctlssVisaTransactionQualifiers == null)?"<null>":this.ctlssVisaTransactionQualifiers));
        sb.append(',');
        sb.append("ctlssCupTransactionQualifiers");
        sb.append('=');
        sb.append(((this.ctlssCupTransactionQualifiers == null)?"<null>":this.ctlssCupTransactionQualifiers));
        sb.append(',');
        sb.append("terminalInterchangeProfile");
        sb.append('=');
        sb.append(((this.terminalInterchangeProfile == null)?"<null>":this.terminalInterchangeProfile));
        sb.append(',');
        sb.append("combinationOptions");
        sb.append('=');
        sb.append(((this.combinationOptions == null)?"<null>":this.combinationOptions));
        sb.append(',');
        sb.append("tAC_Denial");
        sb.append('=');
        sb.append(((this.tAC_Denial == null)?"<null>":this.tAC_Denial));
        sb.append(',');
        sb.append("tAC_Online");
        sb.append('=');
        sb.append(((this.tAC_Online == null)?"<null>":this.tAC_Online));
        sb.append(',');
        sb.append("tAC_Default");
        sb.append('=');
        sb.append(((this.tAC_Default == null)?"<null>":this.tAC_Default));
        sb.append(',');
        sb.append("ctlssMCForceMagstripe");
        sb.append('=');
        sb.append(((this.ctlssMCForceMagstripe == null)?"<null>":this.ctlssMCForceMagstripe));
        sb.append(',');
        sb.append("ctlssPPassMagstripeVersion");
        sb.append('=');
        sb.append(((this.ctlssPPassMagstripeVersion == null)?"<null>":this.ctlssPPassMagstripeVersion));
        sb.append(',');
        sb.append("skipCheckExpDate");
        sb.append('=');
        sb.append(((this.skipCheckExpDate == null)?"<null>":this.skipCheckExpDate));
        sb.append(',');
        sb.append("allowFallback");
        sb.append('=');
        sb.append(((this.allowFallback == null)?"<null>":this.allowFallback));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
