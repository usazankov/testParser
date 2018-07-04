

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CardProduct {

    @SerializedName("Anchor")
    @Expose
    private Integer anchor;
    @SerializedName("Name")
    @Expose
    private CardProduct.DefCardProduct name = CardProduct.DefCardProduct.fromValue(0);
    @SerializedName("CPName")
    @Expose
    private String cPName;
    @SerializedName("PIX")
    @Expose
    @Valid
    private List<Byte> pIX = new ArrayList<Byte>();
    @SerializedName("BinRanges")
    @Expose
    @Valid
    private List<DefBinRange> binRanges = new ArrayList<DefBinRange>();
    @SerializedName("ManualInput")
    @Expose
    private CardProduct.DefSwitch manualInput = CardProduct.DefSwitch.fromValue(0);

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

    public CardProduct.DefCardProduct getName() {
        return name;
    }

    public void setName(CardProduct.DefCardProduct name) {
        this.name = name;
    }

    public CardProduct withName(CardProduct.DefCardProduct name) {
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

    public List<Byte> getPIX() {
        return pIX;
    }

    public void setPIX(List<Byte> pIX) {
        this.pIX = pIX;
    }

    public CardProduct withPIX(List<Byte> pIX) {
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

    public CardProduct.DefSwitch getManualInput() {
        return manualInput;
    }

    public void setManualInput(CardProduct.DefSwitch manualInput) {
        this.manualInput = manualInput;
    }

    public CardProduct withManualInput(CardProduct.DefSwitch manualInput) {
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

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.manualInput == null)? 0 :this.manualInput.hashCode()));
        result = ((result* 31)+((this.cPName == null)? 0 :this.cPName.hashCode()));
        result = ((result* 31)+((this.anchor == null)? 0 :this.anchor.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.pIX == null)? 0 :this.pIX.hashCode()));
        result = ((result* 31)+((this.binRanges == null)? 0 :this.binRanges.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CardProduct) == false) {
            return false;
        }
        CardProduct rhs = ((CardProduct) other);
        return (((((((this.manualInput == rhs.manualInput)||((this.manualInput!= null)&&this.manualInput.equals(rhs.manualInput)))&&((this.cPName == rhs.cPName)||((this.cPName!= null)&&this.cPName.equals(rhs.cPName))))&&((this.anchor == rhs.anchor)||((this.anchor!= null)&&this.anchor.equals(rhs.anchor))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.pIX == rhs.pIX)||((this.pIX!= null)&&this.pIX.equals(rhs.pIX))))&&((this.binRanges == rhs.binRanges)||((this.binRanges!= null)&&this.binRanges.equals(rhs.binRanges))));
    }

    public enum DefCardProduct {

        @SerializedName("0")
        CardProduct_Unknown(0),
        @SerializedName("1")
        CardProduct_VISA_Clasic(1),
        @SerializedName("2")
        CardProduct_VISA_Gold(2),
        @SerializedName("3")
        CardProduct_VISA_Platinum(3),
        @SerializedName("4")
        CardProduct_VISA_Electron(4),
        @SerializedName("5")
        CardProduct_MasterCard_Standard(5),
        @SerializedName("6")
        CardProduct_CirrusMaestro(6),
        @SerializedName("7")
        CardProduct_AmericanExpress(7),
        @SerializedName("8")
        CardProduct_JCB(8),
        @SerializedName("9")
        CardProduct_DinersClub(9),
        @SerializedName("10")
        CardProduct_CUP(10),
        @SerializedName("11")
        CardProduct_UEC(11),
        @SerializedName("12")
        CardProduct_MIR(12),
        @SerializedName("13")
        CardProduct_Loyalty(13);
        private final Integer value;
        private final static Map<Integer, CardProduct.DefCardProduct> CONSTANTS = new HashMap<Integer, CardProduct.DefCardProduct>();

        static {
            for (CardProduct.DefCardProduct c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private DefCardProduct(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CardProduct.DefCardProduct fromValue(Integer value) {
            CardProduct.DefCardProduct constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum DefSwitch {

        @SerializedName("0")
        NO(0),
        @SerializedName("1")
        YES(1);
        private final Integer value;
        private final static Map<Integer, CardProduct.DefSwitch> CONSTANTS = new HashMap<Integer, CardProduct.DefSwitch>();

        static {
            for (CardProduct.DefSwitch c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private DefSwitch(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static CardProduct.DefSwitch fromValue(Integer value) {
            CardProduct.DefSwitch constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
