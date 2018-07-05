
package com.inpas.parser.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * schema for DefBinRange
 * 
 */
public class DefBinRange {

    @SerializedName("Name")
    @Expose
    private String name = "";
    @SerializedName("PanLengthStart")
    @Expose
    private Integer panLengthStart;
    @SerializedName("PanLengthFinish")
    @Expose
    private Integer panLengthFinish;
    @SerializedName("FromBin")
    @Expose
    private String fromBin = "";
    @SerializedName("ToBin")
    @Expose
    private String toBin = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DefBinRange withName(String name) {
        this.name = name;
        return this;
    }

    public Integer getPanLengthStart() {
        return panLengthStart;
    }

    public void setPanLengthStart(Integer panLengthStart) {
        this.panLengthStart = panLengthStart;
    }

    public DefBinRange withPanLengthStart(Integer panLengthStart) {
        this.panLengthStart = panLengthStart;
        return this;
    }

    public Integer getPanLengthFinish() {
        return panLengthFinish;
    }

    public void setPanLengthFinish(Integer panLengthFinish) {
        this.panLengthFinish = panLengthFinish;
    }

    public DefBinRange withPanLengthFinish(Integer panLengthFinish) {
        this.panLengthFinish = panLengthFinish;
        return this;
    }

    public String getFromBin() {
        return fromBin;
    }

    public void setFromBin(String fromBin) {
        this.fromBin = fromBin;
    }

    public DefBinRange withFromBin(String fromBin) {
        this.fromBin = fromBin;
        return this;
    }

    public String getToBin() {
        return toBin;
    }

    public void setToBin(String toBin) {
        this.toBin = toBin;
    }

    public DefBinRange withToBin(String toBin) {
        this.toBin = toBin;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DefBinRange.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("panLengthStart");
        sb.append('=');
        sb.append(((this.panLengthStart == null)?"<null>":this.panLengthStart));
        sb.append(',');
        sb.append("panLengthFinish");
        sb.append('=');
        sb.append(((this.panLengthFinish == null)?"<null>":this.panLengthFinish));
        sb.append(',');
        sb.append("fromBin");
        sb.append('=');
        sb.append(((this.fromBin == null)?"<null>":this.fromBin));
        sb.append(',');
        sb.append("toBin");
        sb.append('=');
        sb.append(((this.toBin == null)?"<null>":this.toBin));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
