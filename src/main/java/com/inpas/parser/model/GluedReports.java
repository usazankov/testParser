
package com.inpas.parser.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GluedReports {

    @SerializedName("ReconciliationReport")
    @Expose
    private Integer reconciliationReport;
    @SerializedName("ReconciliationReportFail")
    @Expose
    private Integer reconciliationReportFail;

    public Integer getReconciliationReport() {
        return reconciliationReport;
    }

    public void setReconciliationReport(Integer reconciliationReport) {
        this.reconciliationReport = reconciliationReport;
    }

    public GluedReports withReconciliationReport(Integer reconciliationReport) {
        this.reconciliationReport = reconciliationReport;
        return this;
    }

    public Integer getReconciliationReportFail() {
        return reconciliationReportFail;
    }

    public void setReconciliationReportFail(Integer reconciliationReportFail) {
        this.reconciliationReportFail = reconciliationReportFail;
    }

    public GluedReports withReconciliationReportFail(Integer reconciliationReportFail) {
        this.reconciliationReportFail = reconciliationReportFail;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GluedReports.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("reconciliationReport");
        sb.append('=');
        sb.append(((this.reconciliationReport == null)?"<null>":this.reconciliationReport));
        sb.append(',');
        sb.append("reconciliationReportFail");
        sb.append('=');
        sb.append(((this.reconciliationReportFail == null)?"<null>":this.reconciliationReportFail));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
