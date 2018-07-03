

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Currency {

    @SerializedName("Anchor")
    @Expose
    private Integer anchor;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("NumericCode")
    @Expose
    private String numericCode;
    @SerializedName("AlphabeticCode")
    @Expose
    private String alphabeticCode;
    @SerializedName("MinorUnit")
    @Expose
    private String minorUnit;
    @SerializedName("ConversionFactor")
    @Expose
    private Double conversionFactor;
    @SerializedName("BinRanges")
    @Expose
    @Valid
    private List<DefBinRange> binRanges = new ArrayList<DefBinRange>();

    public Integer getAnchor() {
        return anchor;
    }

    public void setAnchor(Integer anchor) {
        this.anchor = anchor;
    }

    public Currency withAnchor(Integer anchor) {
        this.anchor = anchor;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Currency withName(String name) {
        this.name = name;
        return this;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    public Currency withNumericCode(String numericCode) {
        this.numericCode = numericCode;
        return this;
    }

    public String getAlphabeticCode() {
        return alphabeticCode;
    }

    public void setAlphabeticCode(String alphabeticCode) {
        this.alphabeticCode = alphabeticCode;
    }

    public Currency withAlphabeticCode(String alphabeticCode) {
        this.alphabeticCode = alphabeticCode;
        return this;
    }

    public String getMinorUnit() {
        return minorUnit;
    }

    public void setMinorUnit(String minorUnit) {
        this.minorUnit = minorUnit;
    }

    public Currency withMinorUnit(String minorUnit) {
        this.minorUnit = minorUnit;
        return this;
    }

    public Double getConversionFactor() {
        return conversionFactor;
    }

    public void setConversionFactor(Double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public Currency withConversionFactor(Double conversionFactor) {
        this.conversionFactor = conversionFactor;
        return this;
    }

    public List<DefBinRange> getBinRanges() {
        return binRanges;
    }

    public void setBinRanges(List<DefBinRange> binRanges) {
        this.binRanges = binRanges;
    }

    public Currency withBinRanges(List<DefBinRange> binRanges) {
        this.binRanges = binRanges;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Currency.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anchor");
        sb.append('=');
        sb.append(((this.anchor == null)?"<null>":this.anchor));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("numericCode");
        sb.append('=');
        sb.append(((this.numericCode == null)?"<null>":this.numericCode));
        sb.append(',');
        sb.append("alphabeticCode");
        sb.append('=');
        sb.append(((this.alphabeticCode == null)?"<null>":this.alphabeticCode));
        sb.append(',');
        sb.append("minorUnit");
        sb.append('=');
        sb.append(((this.minorUnit == null)?"<null>":this.minorUnit));
        sb.append(',');
        sb.append("conversionFactor");
        sb.append('=');
        sb.append(((this.conversionFactor == null)?"<null>":this.conversionFactor));
        sb.append(',');
        sb.append("binRanges");
        sb.append('=');
        sb.append(((this.binRanges == null)?"<null>":this.binRanges));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
