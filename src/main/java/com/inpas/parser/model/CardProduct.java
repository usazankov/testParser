
package com.inpas.parser.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.inpas.type.HexString;

public class CardProduct {

    @SerializedName("Anchor")
    @Expose
    private Integer anchor;
    @SerializedName("Name")
    @Expose
    private DefCardProduct name = DefCardProduct.fromValue(0);
    @SerializedName("CPName")
    @Expose
    private String cPName = "";
    @SerializedName("PIX")
    @Expose
    @Valid
    private HexString pIX;
    @SerializedName("BinRanges")
    @Expose
    @Valid
    private List<DefBinRange> binRanges = new ArrayList<DefBinRange>();
    @SerializedName("ManualInput")
    @Expose
    private DefSwitch manualInput = DefSwitch.fromValue(0);

    public Integer getAnchor() {
        return anchor;
    }

    public void setAnchor(Integer anchor) {
        this.anchor = anchor;
    }

    public CardProduct withAnchor(Integer anchor) {
        this.anchor = anchor;
        return this;
    }

    public DefCardProduct getName() {
        return name;
    }

    public void setName(DefCardProduct name) {
        this.name = name;
    }

    public CardProduct withName(DefCardProduct name) {
        this.name = name;
        return this;
    }

    public String getCPName() {
        return cPName;
    }

    public void setCPName(String cPName) {
        this.cPName = cPName;
    }

    public CardProduct withCPName(String cPName) {
        this.cPName = cPName;
        return this;
    }

    public HexString getPIX() {
        return pIX;
    }

    public void setPIX(HexString pIX) {
        this.pIX = pIX;
    }

    public CardProduct withPIX(HexString pIX) {
        this.pIX = pIX;
        return this;
    }

    public List<DefBinRange> getBinRanges() {
        return binRanges;
    }

    public void setBinRanges(List<DefBinRange> binRanges) {
        this.binRanges = binRanges;
    }

    public CardProduct withBinRanges(List<DefBinRange> binRanges) {
        this.binRanges = binRanges;
        return this;
    }

    public DefSwitch getManualInput() {
        return manualInput;
    }

    public void setManualInput(DefSwitch manualInput) {
        this.manualInput = manualInput;
    }

    public CardProduct withManualInput(DefSwitch manualInput) {
        this.manualInput = manualInput;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CardProduct.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anchor");
        sb.append('=');
        sb.append(((this.anchor == null)?"<null>":this.anchor));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("cPName");
        sb.append('=');
        sb.append(((this.cPName == null)?"<null>":this.cPName));
        sb.append(',');
        sb.append("pIX");
        sb.append('=');
        sb.append(((this.pIX == null)?"<null>":this.pIX));
        sb.append(',');
        sb.append("binRanges");
        sb.append('=');
        sb.append(((this.binRanges == null)?"<null>":this.binRanges));
        sb.append(',');
        sb.append("manualInput");
        sb.append('=');
        sb.append(((this.manualInput == null)?"<null>":this.manualInput));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
