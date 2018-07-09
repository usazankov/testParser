
package com.inpas.parser.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Acquiring {

    @SerializedName("Anchor")
    @Expose
    private Integer anchor;
    @SerializedName("AcquiringName")
    @Expose
    private String acquiringName = "";
    @SerializedName("PaymentSystemLinks")
    @Expose
    @Valid
    private List<PaymentSystemLink> paymentSystemLinks = new ArrayList<PaymentSystemLink>();
    @SerializedName("CurrencyRefs")
    @Expose
    @Valid
    private List<Integer> currencyRefs = new ArrayList<Integer>();
    @SerializedName("AuthorisationHosts")
    @Expose
    @Valid
    private List<Integer> authorisationHosts = new ArrayList<Integer>();
    @SerializedName("HostTimeZone")
    @Expose
    private Integer hostTimeZone;
    @SerializedName("SummerTime")
    @Expose
    private DefSwitch summerTime = DefSwitch.fromValue(0);
    @SerializedName("Reports")
    @Expose
    @Valid
    private Reports reports;
    @SerializedName("TechnicalParameters")
    @Expose
    @Valid
    private TechnicalParameters technicalParameters;

    public Integer getAnchor() {
        return anchor;
    }

    public void setAnchor(Integer anchor) {
        this.anchor = anchor;
    }

    public Acquiring withAnchor(Integer anchor) {
        this.anchor = anchor;
        return this;
    }

    public String getAcquiringName() {
        return acquiringName;
    }

    public void setAcquiringName(String acquiringName) {
        this.acquiringName = acquiringName;
    }

    public Acquiring withAcquiringName(String acquiringName) {
        this.acquiringName = acquiringName;
        return this;
    }

    public List<PaymentSystemLink> getPaymentSystemLinks() {
        return paymentSystemLinks;
    }

    public void setPaymentSystemLinks(List<PaymentSystemLink> paymentSystemLinks) {
        this.paymentSystemLinks = paymentSystemLinks;
    }

    public Acquiring withPaymentSystemLinks(List<PaymentSystemLink> paymentSystemLinks) {
        this.paymentSystemLinks = paymentSystemLinks;
        return this;
    }

    public List<Integer> getCurrencyRefs() {
        return currencyRefs;
    }

    public void setCurrencyRefs(List<Integer> currencyRefs) {
        this.currencyRefs = currencyRefs;
    }

    public Acquiring withCurrencyRefs(List<Integer> currencyRefs) {
        this.currencyRefs = currencyRefs;
        return this;
    }

    public List<Integer> getAuthorisationHosts() {
        return authorisationHosts;
    }

    public void setAuthorisationHosts(List<Integer> authorisationHosts) {
        this.authorisationHosts = authorisationHosts;
    }

    public Acquiring withAuthorisationHosts(List<Integer> authorisationHosts) {
        this.authorisationHosts = authorisationHosts;
        return this;
    }

    public Integer getHostTimeZone() {
        return hostTimeZone;
    }

    public void setHostTimeZone(Integer hostTimeZone) {
        this.hostTimeZone = hostTimeZone;
    }

    public Acquiring withHostTimeZone(Integer hostTimeZone) {
        this.hostTimeZone = hostTimeZone;
        return this;
    }

    public DefSwitch getSummerTime() {
        return summerTime;
    }

    public void setSummerTime(DefSwitch summerTime) {
        this.summerTime = summerTime;
    }

    public Acquiring withSummerTime(DefSwitch summerTime) {
        this.summerTime = summerTime;
        return this;
    }

    public Reports getReports() {
        return reports;
    }

    public void setReports(Reports reports) {
        this.reports = reports;
    }

    public Acquiring withReports(Reports reports) {
        this.reports = reports;
        return this;
    }

    public TechnicalParameters getTechnicalParameters() {
        return technicalParameters;
    }

    public void setTechnicalParameters(TechnicalParameters technicalParameters) {
        this.technicalParameters = technicalParameters;
    }

    public Acquiring withTechnicalParameters(TechnicalParameters technicalParameters) {
        this.technicalParameters = technicalParameters;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Acquiring.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anchor");
        sb.append('=');
        sb.append(((this.anchor == null)?"<null>":this.anchor));
        sb.append(',');
        sb.append("acquiringName");
        sb.append('=');
        sb.append(((this.acquiringName == null)?"<null>":this.acquiringName));
        sb.append(',');
        sb.append("paymentSystemLinks");
        sb.append('=');
        sb.append(((this.paymentSystemLinks == null)?"<null>":this.paymentSystemLinks));
        sb.append(',');
        sb.append("currencyRefs");
        sb.append('=');
        sb.append(((this.currencyRefs == null)?"<null>":this.currencyRefs));
        sb.append(',');
        sb.append("authorisationHosts");
        sb.append('=');
        sb.append(((this.authorisationHosts == null)?"<null>":this.authorisationHosts));
        sb.append(',');
        sb.append("hostTimeZone");
        sb.append('=');
        sb.append(((this.hostTimeZone == null)?"<null>":this.hostTimeZone));
        sb.append(',');
        sb.append("summerTime");
        sb.append('=');
        sb.append(((this.summerTime == null)?"<null>":this.summerTime));
        sb.append(',');
        sb.append("reports");
        sb.append('=');
        sb.append(((this.reports == null)?"<null>":this.reports));
        sb.append(',');
        sb.append("technicalParameters");
        sb.append('=');
        sb.append(((this.technicalParameters == null)?"<null>":this.technicalParameters));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
