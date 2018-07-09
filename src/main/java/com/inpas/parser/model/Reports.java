
package com.inpas.parser.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reports {

    @SerializedName("ReconciliationReport")
    @Expose
    private Integer reconciliationReport;
    @SerializedName("KeyExchangeReport")
    @Expose
    private Integer keyExchangeReport;
    @SerializedName("CheckLinkReport")
    @Expose
    private Integer checkLinkReport;

    public Integer getReconciliationReport() {
        return reconciliationReport;
    }

    public void setReconciliationReport(Integer reconciliationReport) {
        this.reconciliationReport = reconciliationReport;
    }

    public Reports withReconciliationReport(Integer reconciliationReport) {
        this.reconciliationReport = reconciliationReport;
        return this;
    }

    public Integer getKeyExchangeReport() {
        return keyExchangeReport;
    }

    public void setKeyExchangeReport(Integer keyExchangeReport) {
        this.keyExchangeReport = keyExchangeReport;
    }

    public Reports withKeyExchangeReport(Integer keyExchangeReport) {
        this.keyExchangeReport = keyExchangeReport;
        return this;
    }

    public Integer getCheckLinkReport() {
        return checkLinkReport;
    }

    public void setCheckLinkReport(Integer checkLinkReport) {
        this.checkLinkReport = checkLinkReport;
    }

    public Reports withCheckLinkReport(Integer checkLinkReport) {
        this.checkLinkReport = checkLinkReport;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Reports.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reconciliationReport");
        sb.append('=');
        sb.append(((this.reconciliationReport == null)?"<null>":this.reconciliationReport));
        sb.append(',');
        sb.append("keyExchangeReport");
        sb.append('=');
        sb.append(((this.keyExchangeReport == null)?"<null>":this.keyExchangeReport));
        sb.append(',');
        sb.append("checkLinkReport");
        sb.append('=');
        sb.append(((this.checkLinkReport == null)?"<null>":this.checkLinkReport));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
