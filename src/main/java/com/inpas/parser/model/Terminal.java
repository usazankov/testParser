
package com.inpas.parser.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Terminal {

    @SerializedName("Anchor")
    @Expose
    private Integer anchor;
    @SerializedName("XSD_Version")
    @Expose
    private String xSD_Version = "";
    @SerializedName("TerminalId")
    @Expose
    private String terminalId = "";
    @SerializedName("OwnerName")
    @Expose
    private String ownerName = "";
    @SerializedName("Address")
    @Expose
    private String address = "";
    @SerializedName("TerminalTimeZone")
    @Expose
    private Integer terminalTimeZone;
    @SerializedName("SummerTime")
    @Expose
    private DefSwitch summerTime = DefSwitch.fromValue(0);
    @SerializedName("Model")
    @Expose
    private DefDeviceModel model = DefDeviceModel.fromValue(0);
    @SerializedName("TerminalCountryCode")
    @Expose
    private String terminalCountryCode = "";
    @SerializedName("PriorLicense")
    @Expose
    private DefLicenseType priorLicense = DefLicenseType.fromValue(0);
    @SerializedName("UseMainMenuPassword")
    @Expose
    private DefSwitch useMainMenuPassword = DefSwitch.fromValue(0);
    @SerializedName("MainMenuPassword")
    @Expose
    private String mainMenuPassword = "";
    @SerializedName("Logging")
    @Expose
    @Valid
    private Logging logging;
    @SerializedName("PowerSet")
    @Expose
    private DefSwitch powerSet = DefSwitch.fromValue(0);
    @SerializedName("WarningLevel")
    @Expose
    private Integer warningLevel = 0;
    @SerializedName("BlockingLevel")
    @Expose
    private Integer blockingLevel = 0;
    @SerializedName("ShuttingLevel")
    @Expose
    private Integer shuttingLevel = 0;
    @SerializedName("SerialNo")
    @Expose
    private String serialNo = "";
    @SerializedName("PossessorLinks")
    @Expose
    @Valid
    private List<PossessorLink> possessorLinks = new ArrayList<PossessorLink>();
    @SerializedName("UseLogins")
    @Expose
    private DefSwitch useLogins = DefSwitch.fromValue(0);
    @SerializedName("TypeUseLogins")
    @Expose
    private Terminal.ParamTypeUseLogins typeUseLogins = Terminal.ParamTypeUseLogins.fromValue(0);
    @SerializedName("AutoLogin")
    @Expose
    private DefSwitch autoLogin = DefSwitch.fromValue(0);
    @SerializedName("AutoLoginUsername")
    @Expose
    private Integer autoLoginUsername = -1;
    @SerializedName("LogoutCase")
    @Expose
    private Integer logoutCase = -1;
    @SerializedName("CardLoginPassword")
    @Expose
    private DefSwitch cardLoginPassword = DefSwitch.fromValue(0);
    @SerializedName("TerminalEvents")
    @Expose
    @Valid
    private List<Object> terminalEvents = new ArrayList<Object>();
    @SerializedName("CombineFunctions")
    @Expose
    private Terminal.ParamCombineFunctions combineFunctions = Terminal.ParamCombineFunctions.fromValue(0);
    @SerializedName("ResetReceipt")
    @Expose
    private DefSwitch resetReceipt = DefSwitch.fromValue(0);
    @SerializedName("TransactionScheme")
    @Expose
    private Terminal.ParamTransactionScheme transactionScheme = Terminal.ParamTransactionScheme.fromValue(0);
    @SerializedName("HotKeysProfile")
    @Expose
    private Integer hotKeysProfile;
    @SerializedName("PicturesGroupTypeSelectedTerminal")
    @Expose
    private Terminal.ParamPicturesGroupTypeSelectedTerminal picturesGroupTypeSelectedTerminal = Terminal.ParamPicturesGroupTypeSelectedTerminal.fromValue(0);
    @SerializedName("PicturesGroupSelectedTerminal")
    @Expose
    private Integer picturesGroupSelectedTerminal;
    @SerializedName("ReportRepeat")
    @Expose
    private DefSwitch reportRepeat = DefSwitch.fromValue(0);
    @SerializedName("PromptPrintDecline")
    @Expose
    private DefSwitch promptPrintDecline = DefSwitch.fromValue(0);
    @SerializedName("WaitPinTimeout")
    @Expose
    private Integer waitPinTimeout;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("TerminalVariable")
    @Expose
    private String terminalVariable;
    @SerializedName("UseEnergySaving")
    @Expose
    private Terminal.ParamUseEnergySaving useEnergySaving = Terminal.ParamUseEnergySaving.fromValue(0);
    @SerializedName("BackLightTimeout")
    @Expose
    private Integer backLightTimeout;
    @SerializedName("SleepTime")
    @Expose
    private Integer sleepTime;
    @SerializedName("HibernateTimeout")
    @Expose
    private Integer hibernateTimeout;
    @SerializedName("ShutdownTimeout")
    @Expose
    private Integer shutdownTimeout;
    @SerializedName("KeyboardLock")
    @Expose
    private DefSwitch keyboardLock = DefSwitch.fromValue(0);

    public Integer getAnchor() {
        return anchor;
    }

    public void setAnchor(Integer anchor) {
        this.anchor = anchor;
    }

    public Terminal withAnchor(Integer anchor) {
        this.anchor = anchor;
        return this;
    }

    public String getXSD_Version() {
        return xSD_Version;
    }

    public void setXSD_Version(String xSD_Version) {
        this.xSD_Version = xSD_Version;
    }

    public Terminal withXSD_Version(String xSD_Version) {
        this.xSD_Version = xSD_Version;
        return this;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public Terminal withTerminalId(String terminalId) {
        this.terminalId = terminalId;
        return this;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Terminal withOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Terminal withAddress(String address) {
        this.address = address;
        return this;
    }

    public Integer getTerminalTimeZone() {
        return terminalTimeZone;
    }

    public void setTerminalTimeZone(Integer terminalTimeZone) {
        this.terminalTimeZone = terminalTimeZone;
    }

    public Terminal withTerminalTimeZone(Integer terminalTimeZone) {
        this.terminalTimeZone = terminalTimeZone;
        return this;
    }

    public DefSwitch getSummerTime() {
        return summerTime;
    }

    public void setSummerTime(DefSwitch summerTime) {
        this.summerTime = summerTime;
    }

    public Terminal withSummerTime(DefSwitch summerTime) {
        this.summerTime = summerTime;
        return this;
    }

    public DefDeviceModel getModel() {
        return model;
    }

    public void setModel(DefDeviceModel model) {
        this.model = model;
    }

    public Terminal withModel(DefDeviceModel model) {
        this.model = model;
        return this;
    }

    public String getTerminalCountryCode() {
        return terminalCountryCode;
    }

    public void setTerminalCountryCode(String terminalCountryCode) {
        this.terminalCountryCode = terminalCountryCode;
    }

    public Terminal withTerminalCountryCode(String terminalCountryCode) {
        this.terminalCountryCode = terminalCountryCode;
        return this;
    }

    public DefLicenseType getPriorLicense() {
        return priorLicense;
    }

    public void setPriorLicense(DefLicenseType priorLicense) {
        this.priorLicense = priorLicense;
    }

    public Terminal withPriorLicense(DefLicenseType priorLicense) {
        this.priorLicense = priorLicense;
        return this;
    }

    public DefSwitch getUseMainMenuPassword() {
        return useMainMenuPassword;
    }

    public void setUseMainMenuPassword(DefSwitch useMainMenuPassword) {
        this.useMainMenuPassword = useMainMenuPassword;
    }

    public Terminal withUseMainMenuPassword(DefSwitch useMainMenuPassword) {
        this.useMainMenuPassword = useMainMenuPassword;
        return this;
    }

    public String getMainMenuPassword() {
        return mainMenuPassword;
    }

    public void setMainMenuPassword(String mainMenuPassword) {
        this.mainMenuPassword = mainMenuPassword;
    }

    public Terminal withMainMenuPassword(String mainMenuPassword) {
        this.mainMenuPassword = mainMenuPassword;
        return this;
    }

    public Logging getLogging() {
        return logging;
    }

    public void setLogging(Logging logging) {
        this.logging = logging;
    }

    public Terminal withLogging(Logging logging) {
        this.logging = logging;
        return this;
    }

    public DefSwitch getPowerSet() {
        return powerSet;
    }

    public void setPowerSet(DefSwitch powerSet) {
        this.powerSet = powerSet;
    }

    public Terminal withPowerSet(DefSwitch powerSet) {
        this.powerSet = powerSet;
        return this;
    }

    public Integer getWarningLevel() {
        return warningLevel;
    }

    public void setWarningLevel(Integer warningLevel) {
        this.warningLevel = warningLevel;
    }

    public Terminal withWarningLevel(Integer warningLevel) {
        this.warningLevel = warningLevel;
        return this;
    }

    public Integer getBlockingLevel() {
        return blockingLevel;
    }

    public void setBlockingLevel(Integer blockingLevel) {
        this.blockingLevel = blockingLevel;
    }

    public Terminal withBlockingLevel(Integer blockingLevel) {
        this.blockingLevel = blockingLevel;
        return this;
    }

    public Integer getShuttingLevel() {
        return shuttingLevel;
    }

    public void setShuttingLevel(Integer shuttingLevel) {
        this.shuttingLevel = shuttingLevel;
    }

    public Terminal withShuttingLevel(Integer shuttingLevel) {
        this.shuttingLevel = shuttingLevel;
        return this;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public Terminal withSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }

    public List<PossessorLink> getPossessorLinks() {
        return possessorLinks;
    }

    public void setPossessorLinks(List<PossessorLink> possessorLinks) {
        this.possessorLinks = possessorLinks;
    }

    public Terminal withPossessorLinks(List<PossessorLink> possessorLinks) {
        this.possessorLinks = possessorLinks;
        return this;
    }

    public DefSwitch getUseLogins() {
        return useLogins;
    }

    public void setUseLogins(DefSwitch useLogins) {
        this.useLogins = useLogins;
    }

    public Terminal withUseLogins(DefSwitch useLogins) {
        this.useLogins = useLogins;
        return this;
    }

    public Terminal.ParamTypeUseLogins getTypeUseLogins() {
        return typeUseLogins;
    }

    public void setTypeUseLogins(Terminal.ParamTypeUseLogins typeUseLogins) {
        this.typeUseLogins = typeUseLogins;
    }

    public Terminal withTypeUseLogins(Terminal.ParamTypeUseLogins typeUseLogins) {
        this.typeUseLogins = typeUseLogins;
        return this;
    }

    public DefSwitch getAutoLogin() {
        return autoLogin;
    }

    public void setAutoLogin(DefSwitch autoLogin) {
        this.autoLogin = autoLogin;
    }

    public Terminal withAutoLogin(DefSwitch autoLogin) {
        this.autoLogin = autoLogin;
        return this;
    }

    public Integer getAutoLoginUsername() {
        return autoLoginUsername;
    }

    public void setAutoLoginUsername(Integer autoLoginUsername) {
        this.autoLoginUsername = autoLoginUsername;
    }

    public Terminal withAutoLoginUsername(Integer autoLoginUsername) {
        this.autoLoginUsername = autoLoginUsername;
        return this;
    }

    public Integer getLogoutCase() {
        return logoutCase;
    }

    public void setLogoutCase(Integer logoutCase) {
        this.logoutCase = logoutCase;
    }

    public Terminal withLogoutCase(Integer logoutCase) {
        this.logoutCase = logoutCase;
        return this;
    }

    public DefSwitch getCardLoginPassword() {
        return cardLoginPassword;
    }

    public void setCardLoginPassword(DefSwitch cardLoginPassword) {
        this.cardLoginPassword = cardLoginPassword;
    }

    public Terminal withCardLoginPassword(DefSwitch cardLoginPassword) {
        this.cardLoginPassword = cardLoginPassword;
        return this;
    }

    public List<Object> getTerminalEvents() {
        return terminalEvents;
    }

    public void setTerminalEvents(List<Object> terminalEvents) {
        this.terminalEvents = terminalEvents;
    }

    public Terminal withTerminalEvents(List<Object> terminalEvents) {
        this.terminalEvents = terminalEvents;
        return this;
    }

    public Terminal.ParamCombineFunctions getCombineFunctions() {
        return combineFunctions;
    }

    public void setCombineFunctions(Terminal.ParamCombineFunctions combineFunctions) {
        this.combineFunctions = combineFunctions;
    }

    public Terminal withCombineFunctions(Terminal.ParamCombineFunctions combineFunctions) {
        this.combineFunctions = combineFunctions;
        return this;
    }

    public DefSwitch getResetReceipt() {
        return resetReceipt;
    }

    public void setResetReceipt(DefSwitch resetReceipt) {
        this.resetReceipt = resetReceipt;
    }

    public Terminal withResetReceipt(DefSwitch resetReceipt) {
        this.resetReceipt = resetReceipt;
        return this;
    }

    public Terminal.ParamTransactionScheme getTransactionScheme() {
        return transactionScheme;
    }

    public void setTransactionScheme(Terminal.ParamTransactionScheme transactionScheme) {
        this.transactionScheme = transactionScheme;
    }

    public Terminal withTransactionScheme(Terminal.ParamTransactionScheme transactionScheme) {
        this.transactionScheme = transactionScheme;
        return this;
    }

    public Integer getHotKeysProfile() {
        return hotKeysProfile;
    }

    public void setHotKeysProfile(Integer hotKeysProfile) {
        this.hotKeysProfile = hotKeysProfile;
    }

    public Terminal withHotKeysProfile(Integer hotKeysProfile) {
        this.hotKeysProfile = hotKeysProfile;
        return this;
    }

    public Terminal.ParamPicturesGroupTypeSelectedTerminal getPicturesGroupTypeSelectedTerminal() {
        return picturesGroupTypeSelectedTerminal;
    }

    public void setPicturesGroupTypeSelectedTerminal(Terminal.ParamPicturesGroupTypeSelectedTerminal picturesGroupTypeSelectedTerminal) {
        this.picturesGroupTypeSelectedTerminal = picturesGroupTypeSelectedTerminal;
    }

    public Terminal withPicturesGroupTypeSelectedTerminal(Terminal.ParamPicturesGroupTypeSelectedTerminal picturesGroupTypeSelectedTerminal) {
        this.picturesGroupTypeSelectedTerminal = picturesGroupTypeSelectedTerminal;
        return this;
    }

    public Integer getPicturesGroupSelectedTerminal() {
        return picturesGroupSelectedTerminal;
    }

    public void setPicturesGroupSelectedTerminal(Integer picturesGroupSelectedTerminal) {
        this.picturesGroupSelectedTerminal = picturesGroupSelectedTerminal;
    }

    public Terminal withPicturesGroupSelectedTerminal(Integer picturesGroupSelectedTerminal) {
        this.picturesGroupSelectedTerminal = picturesGroupSelectedTerminal;
        return this;
    }

    public DefSwitch getReportRepeat() {
        return reportRepeat;
    }

    public void setReportRepeat(DefSwitch reportRepeat) {
        this.reportRepeat = reportRepeat;
    }

    public Terminal withReportRepeat(DefSwitch reportRepeat) {
        this.reportRepeat = reportRepeat;
        return this;
    }

    public DefSwitch getPromptPrintDecline() {
        return promptPrintDecline;
    }

    public void setPromptPrintDecline(DefSwitch promptPrintDecline) {
        this.promptPrintDecline = promptPrintDecline;
    }

    public Terminal withPromptPrintDecline(DefSwitch promptPrintDecline) {
        this.promptPrintDecline = promptPrintDecline;
        return this;
    }

    public Integer getWaitPinTimeout() {
        return waitPinTimeout;
    }

    public void setWaitPinTimeout(Integer waitPinTimeout) {
        this.waitPinTimeout = waitPinTimeout;
    }

    public Terminal withWaitPinTimeout(Integer waitPinTimeout) {
        this.waitPinTimeout = waitPinTimeout;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Terminal withDescription(String description) {
        this.description = description;
        return this;
    }

    public String getTerminalVariable() {
        return terminalVariable;
    }

    public void setTerminalVariable(String terminalVariable) {
        this.terminalVariable = terminalVariable;
    }

    public Terminal withTerminalVariable(String terminalVariable) {
        this.terminalVariable = terminalVariable;
        return this;
    }

    public Terminal.ParamUseEnergySaving getUseEnergySaving() {
        return useEnergySaving;
    }

    public void setUseEnergySaving(Terminal.ParamUseEnergySaving useEnergySaving) {
        this.useEnergySaving = useEnergySaving;
    }

    public Terminal withUseEnergySaving(Terminal.ParamUseEnergySaving useEnergySaving) {
        this.useEnergySaving = useEnergySaving;
        return this;
    }

    public Integer getBackLightTimeout() {
        return backLightTimeout;
    }

    public void setBackLightTimeout(Integer backLightTimeout) {
        this.backLightTimeout = backLightTimeout;
    }

    public Terminal withBackLightTimeout(Integer backLightTimeout) {
        this.backLightTimeout = backLightTimeout;
        return this;
    }

    public Integer getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(Integer sleepTime) {
        this.sleepTime = sleepTime;
    }

    public Terminal withSleepTime(Integer sleepTime) {
        this.sleepTime = sleepTime;
        return this;
    }

    public Integer getHibernateTimeout() {
        return hibernateTimeout;
    }

    public void setHibernateTimeout(Integer hibernateTimeout) {
        this.hibernateTimeout = hibernateTimeout;
    }

    public Terminal withHibernateTimeout(Integer hibernateTimeout) {
        this.hibernateTimeout = hibernateTimeout;
        return this;
    }

    public Integer getShutdownTimeout() {
        return shutdownTimeout;
    }

    public void setShutdownTimeout(Integer shutdownTimeout) {
        this.shutdownTimeout = shutdownTimeout;
    }

    public Terminal withShutdownTimeout(Integer shutdownTimeout) {
        this.shutdownTimeout = shutdownTimeout;
        return this;
    }

    public DefSwitch getKeyboardLock() {
        return keyboardLock;
    }

    public void setKeyboardLock(DefSwitch keyboardLock) {
        this.keyboardLock = keyboardLock;
    }

    public Terminal withKeyboardLock(DefSwitch keyboardLock) {
        this.keyboardLock = keyboardLock;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Terminal.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anchor");
        sb.append('=');
        sb.append(((this.anchor == null)?"<null>":this.anchor));
        sb.append(',');
        sb.append("xSD_Version");
        sb.append('=');
        sb.append(((this.xSD_Version == null)?"<null>":this.xSD_Version));
        sb.append(',');
        sb.append("terminalId");
        sb.append('=');
        sb.append(((this.terminalId == null)?"<null>":this.terminalId));
        sb.append(',');
        sb.append("ownerName");
        sb.append('=');
        sb.append(((this.ownerName == null)?"<null>":this.ownerName));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("terminalTimeZone");
        sb.append('=');
        sb.append(((this.terminalTimeZone == null)?"<null>":this.terminalTimeZone));
        sb.append(',');
        sb.append("summerTime");
        sb.append('=');
        sb.append(((this.summerTime == null)?"<null>":this.summerTime));
        sb.append(',');
        sb.append("model");
        sb.append('=');
        sb.append(((this.model == null)?"<null>":this.model));
        sb.append(',');
        sb.append("terminalCountryCode");
        sb.append('=');
        sb.append(((this.terminalCountryCode == null)?"<null>":this.terminalCountryCode));
        sb.append(',');
        sb.append("priorLicense");
        sb.append('=');
        sb.append(((this.priorLicense == null)?"<null>":this.priorLicense));
        sb.append(',');
        sb.append("useMainMenuPassword");
        sb.append('=');
        sb.append(((this.useMainMenuPassword == null)?"<null>":this.useMainMenuPassword));
        sb.append(',');
        sb.append("mainMenuPassword");
        sb.append('=');
        sb.append(((this.mainMenuPassword == null)?"<null>":this.mainMenuPassword));
        sb.append(',');
        sb.append("logging");
        sb.append('=');
        sb.append(((this.logging == null)?"<null>":this.logging));
        sb.append(',');
        sb.append("powerSet");
        sb.append('=');
        sb.append(((this.powerSet == null)?"<null>":this.powerSet));
        sb.append(',');
        sb.append("warningLevel");
        sb.append('=');
        sb.append(((this.warningLevel == null)?"<null>":this.warningLevel));
        sb.append(',');
        sb.append("blockingLevel");
        sb.append('=');
        sb.append(((this.blockingLevel == null)?"<null>":this.blockingLevel));
        sb.append(',');
        sb.append("shuttingLevel");
        sb.append('=');
        sb.append(((this.shuttingLevel == null)?"<null>":this.shuttingLevel));
        sb.append(',');
        sb.append("serialNo");
        sb.append('=');
        sb.append(((this.serialNo == null)?"<null>":this.serialNo));
        sb.append(',');
        sb.append("possessorLinks");
        sb.append('=');
        sb.append(((this.possessorLinks == null)?"<null>":this.possessorLinks));
        sb.append(',');
        sb.append("useLogins");
        sb.append('=');
        sb.append(((this.useLogins == null)?"<null>":this.useLogins));
        sb.append(',');
        sb.append("typeUseLogins");
        sb.append('=');
        sb.append(((this.typeUseLogins == null)?"<null>":this.typeUseLogins));
        sb.append(',');
        sb.append("autoLogin");
        sb.append('=');
        sb.append(((this.autoLogin == null)?"<null>":this.autoLogin));
        sb.append(',');
        sb.append("autoLoginUsername");
        sb.append('=');
        sb.append(((this.autoLoginUsername == null)?"<null>":this.autoLoginUsername));
        sb.append(',');
        sb.append("logoutCase");
        sb.append('=');
        sb.append(((this.logoutCase == null)?"<null>":this.logoutCase));
        sb.append(',');
        sb.append("cardLoginPassword");
        sb.append('=');
        sb.append(((this.cardLoginPassword == null)?"<null>":this.cardLoginPassword));
        sb.append(',');
        sb.append("terminalEvents");
        sb.append('=');
        sb.append(((this.terminalEvents == null)?"<null>":this.terminalEvents));
        sb.append(',');
        sb.append("combineFunctions");
        sb.append('=');
        sb.append(((this.combineFunctions == null)?"<null>":this.combineFunctions));
        sb.append(',');
        sb.append("resetReceipt");
        sb.append('=');
        sb.append(((this.resetReceipt == null)?"<null>":this.resetReceipt));
        sb.append(',');
        sb.append("transactionScheme");
        sb.append('=');
        sb.append(((this.transactionScheme == null)?"<null>":this.transactionScheme));
        sb.append(',');
        sb.append("hotKeysProfile");
        sb.append('=');
        sb.append(((this.hotKeysProfile == null)?"<null>":this.hotKeysProfile));
        sb.append(',');
        sb.append("picturesGroupTypeSelectedTerminal");
        sb.append('=');
        sb.append(((this.picturesGroupTypeSelectedTerminal == null)?"<null>":this.picturesGroupTypeSelectedTerminal));
        sb.append(',');
        sb.append("picturesGroupSelectedTerminal");
        sb.append('=');
        sb.append(((this.picturesGroupSelectedTerminal == null)?"<null>":this.picturesGroupSelectedTerminal));
        sb.append(',');
        sb.append("reportRepeat");
        sb.append('=');
        sb.append(((this.reportRepeat == null)?"<null>":this.reportRepeat));
        sb.append(',');
        sb.append("promptPrintDecline");
        sb.append('=');
        sb.append(((this.promptPrintDecline == null)?"<null>":this.promptPrintDecline));
        sb.append(',');
        sb.append("waitPinTimeout");
        sb.append('=');
        sb.append(((this.waitPinTimeout == null)?"<null>":this.waitPinTimeout));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("terminalVariable");
        sb.append('=');
        sb.append(((this.terminalVariable == null)?"<null>":this.terminalVariable));
        sb.append(',');
        sb.append("useEnergySaving");
        sb.append('=');
        sb.append(((this.useEnergySaving == null)?"<null>":this.useEnergySaving));
        sb.append(',');
        sb.append("backLightTimeout");
        sb.append('=');
        sb.append(((this.backLightTimeout == null)?"<null>":this.backLightTimeout));
        sb.append(',');
        sb.append("sleepTime");
        sb.append('=');
        sb.append(((this.sleepTime == null)?"<null>":this.sleepTime));
        sb.append(',');
        sb.append("hibernateTimeout");
        sb.append('=');
        sb.append(((this.hibernateTimeout == null)?"<null>":this.hibernateTimeout));
        sb.append(',');
        sb.append("shutdownTimeout");
        sb.append('=');
        sb.append(((this.shutdownTimeout == null)?"<null>":this.shutdownTimeout));
        sb.append(',');
        sb.append("keyboardLock");
        sb.append('=');
        sb.append(((this.keyboardLock == null)?"<null>":this.keyboardLock));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public enum ParamCombineFunctions {

        @SerializedName("0")
        ReconciliationOnly(0),
        @SerializedName("1")
        ReconciliationAndParamLoad(1),
        @SerializedName("2")
        ReconciliationAndLogUpload(2);
        private final Integer value;
        private final static Map<Integer, Terminal.ParamCombineFunctions> CONSTANTS = new HashMap<Integer, Terminal.ParamCombineFunctions>();

        static {
            for (Terminal.ParamCombineFunctions c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ParamCombineFunctions(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static Terminal.ParamCombineFunctions fromValue(Integer value) {
            Terminal.ParamCombineFunctions constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum ParamPicturesGroupTypeSelectedTerminal {

        @SerializedName("0")
        PictureGroupDenied(0),
        @SerializedName("1")
        PictureGroupDefault(1),
        @SerializedName("2")
        PictureGroupPointed(2),
        @SerializedName("3")
        PictureGroupOrganization(3),
        @SerializedName("4")
        PictureSingle(4);
        private final Integer value;
        private final static Map<Integer, Terminal.ParamPicturesGroupTypeSelectedTerminal> CONSTANTS = new HashMap<Integer, Terminal.ParamPicturesGroupTypeSelectedTerminal>();

        static {
            for (Terminal.ParamPicturesGroupTypeSelectedTerminal c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ParamPicturesGroupTypeSelectedTerminal(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static Terminal.ParamPicturesGroupTypeSelectedTerminal fromValue(Integer value) {
            Terminal.ParamPicturesGroupTypeSelectedTerminal constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum ParamTransactionScheme {

        @SerializedName("0")
        TransactionScheme_Default(0),
        @SerializedName("1")
        TransactionScheme_Alternative(1);
        private final Integer value;
        private final static Map<Integer, Terminal.ParamTransactionScheme> CONSTANTS = new HashMap<Integer, Terminal.ParamTransactionScheme>();

        static {
            for (Terminal.ParamTransactionScheme c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ParamTransactionScheme(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static Terminal.ParamTransactionScheme fromValue(Integer value) {
            Terminal.ParamTransactionScheme constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum ParamTypeUseLogins {

        @SerializedName("0")
        UseLogins_UnlockTerminal(0),
        @SerializedName("1")
        UseLogins_ExecuteOperation(1);
        private final Integer value;
        private final static Map<Integer, Terminal.ParamTypeUseLogins> CONSTANTS = new HashMap<Integer, Terminal.ParamTypeUseLogins>();

        static {
            for (Terminal.ParamTypeUseLogins c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ParamTypeUseLogins(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static Terminal.ParamTypeUseLogins fromValue(Integer value) {
            Terminal.ParamTypeUseLogins constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum ParamUseEnergySaving {

        @SerializedName("0")
        EnergySaving_NotUsed(0),
        @SerializedName("1")
        EnergySaving_UsedAll(1),
        @SerializedName("2")
        EnergySaving_OnlyPowerOff(2);
        private final Integer value;
        private final static Map<Integer, Terminal.ParamUseEnergySaving> CONSTANTS = new HashMap<Integer, Terminal.ParamUseEnergySaving>();

        static {
            for (Terminal.ParamUseEnergySaving c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ParamUseEnergySaving(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static Terminal.ParamUseEnergySaving fromValue(Integer value) {
            Terminal.ParamUseEnergySaving constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
