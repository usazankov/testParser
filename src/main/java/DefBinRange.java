

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * schema for DefBinRange
 * 
 */
public class DefBinRange {

    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("PanLengthStart")
    @Expose
    private Integer panLengthStart;
    @SerializedName("PanLengthFinish")
    @Expose
    private Integer panLengthFinish;
    @SerializedName("FromBin")
    @Expose
    private Integer fromBin;
    @SerializedName("ToBin")
    @Expose
    private Integer toBin;

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

    public Integer getFromBin() {
        return fromBin;
    }

    public void setFromBin(Integer fromBin) {
        this.fromBin = fromBin;
    }

    public DefBinRange withFromBin(Integer fromBin) {
        this.fromBin = fromBin;
        return this;
    }

    public Integer getToBin() {
        return toBin;
    }

    public void setToBin(Integer toBin) {
        this.toBin = toBin;
    }

    public DefBinRange withToBin(Integer toBin) {
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

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.toBin == null)? 0 :this.toBin.hashCode()));
        result = ((result* 31)+((this.panLengthStart == null)? 0 :this.panLengthStart.hashCode()));
        result = ((result* 31)+((this.panLengthFinish == null)? 0 :this.panLengthFinish.hashCode()));
        result = ((result* 31)+((this.fromBin == null)? 0 :this.fromBin.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DefBinRange) == false) {
            return false;
        }
        DefBinRange rhs = ((DefBinRange) other);
        return ((((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.toBin == rhs.toBin)||((this.toBin!= null)&&this.toBin.equals(rhs.toBin))))&&((this.panLengthStart == rhs.panLengthStart)||((this.panLengthStart!= null)&&this.panLengthStart.equals(rhs.panLengthStart))))&&((this.panLengthFinish == rhs.panLengthFinish)||((this.panLengthFinish!= null)&&this.panLengthFinish.equals(rhs.panLengthFinish))))&&((this.fromBin == rhs.fromBin)||((this.fromBin!= null)&&this.fromBin.equals(rhs.fromBin))));
    }

}
