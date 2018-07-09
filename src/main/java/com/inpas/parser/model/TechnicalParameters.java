
package com.inpas.parser.model;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TechnicalParameters {

    @SerializedName("ReconciliationType")
    @Expose
    private TechnicalParameters.ParamReconciliationType reconciliationType = TechnicalParameters.ParamReconciliationType.fromValue(0);
    @SerializedName("EmptyReconciliation")
    @Expose
    private DefSwitch emptyReconciliation = DefSwitch.fromValue(0);
    @SerializedName("KeySchema")
    @Expose
    private TechnicalParameters.ParamKeySchema keySchema = TechnicalParameters.ParamKeySchema.fromValue(0);
    @SerializedName("SecureIso")
    @Expose
    private DefSwitch secureIso = DefSwitch.fromValue(0);
    @SerializedName("BatchOverflowReconciliation")
    @Expose
    private DefSwitch batchOverflowReconciliation = DefSwitch.fromValue(0);
    @SerializedName("MaxOffline")
    @Expose
    private Integer maxOffline;
    @SerializedName("UseIssuerRefferal")
    @Expose
    private DefSwitch useIssuerRefferal = DefSwitch.fromValue(0);
    @SerializedName("ResponseTimeout")
    @Expose
    private Integer responseTimeout;

    public TechnicalParameters.ParamReconciliationType getReconciliationType() {
        return reconciliationType;
    }

    public void setReconciliationType(TechnicalParameters.ParamReconciliationType reconciliationType) {
        this.reconciliationType = reconciliationType;
    }

    public TechnicalParameters withReconciliationType(TechnicalParameters.ParamReconciliationType reconciliationType) {
        this.reconciliationType = reconciliationType;
        return this;
    }

    public DefSwitch getEmptyReconciliation() {
        return emptyReconciliation;
    }

    public void setEmptyReconciliation(DefSwitch emptyReconciliation) {
        this.emptyReconciliation = emptyReconciliation;
    }

    public TechnicalParameters withEmptyReconciliation(DefSwitch emptyReconciliation) {
        this.emptyReconciliation = emptyReconciliation;
        return this;
    }

    public TechnicalParameters.ParamKeySchema getKeySchema() {
        return keySchema;
    }

    public void setKeySchema(TechnicalParameters.ParamKeySchema keySchema) {
        this.keySchema = keySchema;
    }

    public TechnicalParameters withKeySchema(TechnicalParameters.ParamKeySchema keySchema) {
        this.keySchema = keySchema;
        return this;
    }

    public DefSwitch getSecureIso() {
        return secureIso;
    }

    public void setSecureIso(DefSwitch secureIso) {
        this.secureIso = secureIso;
    }

    public TechnicalParameters withSecureIso(DefSwitch secureIso) {
        this.secureIso = secureIso;
        return this;
    }

    public DefSwitch getBatchOverflowReconciliation() {
        return batchOverflowReconciliation;
    }

    public void setBatchOverflowReconciliation(DefSwitch batchOverflowReconciliation) {
        this.batchOverflowReconciliation = batchOverflowReconciliation;
    }

    public TechnicalParameters withBatchOverflowReconciliation(DefSwitch batchOverflowReconciliation) {
        this.batchOverflowReconciliation = batchOverflowReconciliation;
        return this;
    }

    public Integer getMaxOffline() {
        return maxOffline;
    }

    public void setMaxOffline(Integer maxOffline) {
        this.maxOffline = maxOffline;
    }

    public TechnicalParameters withMaxOffline(Integer maxOffline) {
        this.maxOffline = maxOffline;
        return this;
    }

    public DefSwitch getUseIssuerRefferal() {
        return useIssuerRefferal;
    }

    public void setUseIssuerRefferal(DefSwitch useIssuerRefferal) {
        this.useIssuerRefferal = useIssuerRefferal;
    }

    public TechnicalParameters withUseIssuerRefferal(DefSwitch useIssuerRefferal) {
        this.useIssuerRefferal = useIssuerRefferal;
        return this;
    }

    public Integer getResponseTimeout() {
        return responseTimeout;
    }

    public void setResponseTimeout(Integer responseTimeout) {
        this.responseTimeout = responseTimeout;
    }

    public TechnicalParameters withResponseTimeout(Integer responseTimeout) {
        this.responseTimeout = responseTimeout;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TechnicalParameters.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reconciliationType");
        sb.append('=');
        sb.append(((this.reconciliationType == null)?"<null>":this.reconciliationType));
        sb.append(',');
        sb.append("emptyReconciliation");
        sb.append('=');
        sb.append(((this.emptyReconciliation == null)?"<null>":this.emptyReconciliation));
        sb.append(',');
        sb.append("keySchema");
        sb.append('=');
        sb.append(((this.keySchema == null)?"<null>":this.keySchema));
        sb.append(',');
        sb.append("secureIso");
        sb.append('=');
        sb.append(((this.secureIso == null)?"<null>":this.secureIso));
        sb.append(',');
        sb.append("batchOverflowReconciliation");
        sb.append('=');
        sb.append(((this.batchOverflowReconciliation == null)?"<null>":this.batchOverflowReconciliation));
        sb.append(',');
        sb.append("maxOffline");
        sb.append('=');
        sb.append(((this.maxOffline == null)?"<null>":this.maxOffline));
        sb.append(',');
        sb.append("useIssuerRefferal");
        sb.append('=');
        sb.append(((this.useIssuerRefferal == null)?"<null>":this.useIssuerRefferal));
        sb.append(',');
        sb.append("responseTimeout");
        sb.append('=');
        sb.append(((this.responseTimeout == null)?"<null>":this.responseTimeout));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public enum ParamKeySchema {

        @SerializedName("0")
        KeySchema_Stat(0),
        @SerializedName("1")
        KeySchema_Dyn(1);
        private final Integer value;
        private final static Map<Integer, TechnicalParameters.ParamKeySchema> CONSTANTS = new HashMap<Integer, TechnicalParameters.ParamKeySchema>();

        static {
            for (TechnicalParameters.ParamKeySchema c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ParamKeySchema(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TechnicalParameters.ParamKeySchema fromValue(Integer value) {
            TechnicalParameters.ParamKeySchema constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum ParamReconciliationType {

        @SerializedName("0")
        ReconciliationType_0(0),
        @SerializedName("1")
        ReconciliationType_1(1),
        @SerializedName("2")
        ReconciliationType_Offline(2);
        private final Integer value;
        private final static Map<Integer, TechnicalParameters.ParamReconciliationType> CONSTANTS = new HashMap<Integer, TechnicalParameters.ParamReconciliationType>();

        static {
            for (TechnicalParameters.ParamReconciliationType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ParamReconciliationType(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static TechnicalParameters.ParamReconciliationType fromValue(Integer value) {
            TechnicalParameters.ParamReconciliationType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
