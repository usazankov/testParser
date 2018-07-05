
package com.inpas.parser.model;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MagCVM {

    @SerializedName("Anchor")
    @Expose
    private Integer anchor;
    @SerializedName("MagCVM_Operations")
    @Expose
    @Valid
    private List<DefOperation> magCVM_Operations = new ArrayList<DefOperation>();
    @SerializedName("MagCVM_Metods")
    @Expose
    private MagCVM.ParamMagCVM_Metods magCVM_Metods = MagCVM.ParamMagCVM_Metods.fromValue(0);
    @SerializedName("MagCVMAmount")
    @Expose
    @Valid
    private BigInteger magCVMAmount;

    public Integer getAnchor() {
        return anchor;
    }

    public void setAnchor(Integer anchor) {
        this.anchor = anchor;
    }

    public MagCVM withAnchor(Integer anchor) {
        this.anchor = anchor;
        return this;
    }

    public List<DefOperation> getMagCVM_Operations() {
        return magCVM_Operations;
    }

    public void setMagCVM_Operations(List<DefOperation> magCVM_Operations) {
        this.magCVM_Operations = magCVM_Operations;
    }

    public MagCVM withMagCVM_Operations(List<DefOperation> magCVM_Operations) {
        this.magCVM_Operations = magCVM_Operations;
        return this;
    }

    public MagCVM.ParamMagCVM_Metods getMagCVM_Metods() {
        return magCVM_Metods;
    }

    public void setMagCVM_Metods(MagCVM.ParamMagCVM_Metods magCVM_Metods) {
        this.magCVM_Metods = magCVM_Metods;
    }

    public MagCVM withMagCVM_Metods(MagCVM.ParamMagCVM_Metods magCVM_Metods) {
        this.magCVM_Metods = magCVM_Metods;
        return this;
    }

    public BigInteger getMagCVMAmount() {
        return magCVMAmount;
    }

    public void setMagCVMAmount(BigInteger magCVMAmount) {
        this.magCVMAmount = magCVMAmount;
    }

    public MagCVM withMagCVMAmount(BigInteger magCVMAmount) {
        this.magCVMAmount = magCVMAmount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MagCVM.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anchor");
        sb.append('=');
        sb.append(((this.anchor == null)?"<null>":this.anchor));
        sb.append(',');
        sb.append("magCVM_Operations");
        sb.append('=');
        sb.append(((this.magCVM_Operations == null)?"<null>":this.magCVM_Operations));
        sb.append(',');
        sb.append("magCVM_Metods");
        sb.append('=');
        sb.append(((this.magCVM_Metods == null)?"<null>":this.magCVM_Metods));
        sb.append(',');
        sb.append("magCVMAmount");
        sb.append('=');
        sb.append(((this.magCVMAmount == null)?"<null>":this.magCVMAmount));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public enum ParamMagCVM_Metods {

        @SerializedName("0")
        MagCVM_Unknown(0),
        @SerializedName("1")
        MagCVM_ServiceCode(1),
        @SerializedName("2")
        MagCVM_PinOrSign(2),
        @SerializedName("3")
        MagCVM_Pin(3),
        @SerializedName("4")
        MagCVM_Sign(4),
        @SerializedName("5")
        MagCVM_No(5),
        @SerializedName("6")
        MagCVM_PinByCashier(6),
        @SerializedName("7")
        MagCVM_TotalIds(7);
        private final Integer value;
        private final static Map<Integer, MagCVM.ParamMagCVM_Metods> CONSTANTS = new HashMap<Integer, MagCVM.ParamMagCVM_Metods>();

        static {
            for (MagCVM.ParamMagCVM_Metods c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ParamMagCVM_Metods(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static MagCVM.ParamMagCVM_Metods fromValue(Integer value) {
            MagCVM.ParamMagCVM_Metods constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
