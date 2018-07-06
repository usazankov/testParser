
package com.inpas.parser.model;

import java.math.BigInteger;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.inpas.type.HexString;

public class ChipCVM {

    @SerializedName("UseChipCVM")
    @Expose
    private DefSwitch useChipCVM = DefSwitch.fromValue(0);
    @SerializedName("ChipCVMAmount")
    @Expose
    @Valid
    private BigInteger chipCVMAmount;
    @SerializedName("EmvTerminalCapabilities")
    @Expose
    @Valid
    private HexString emvTerminalCapabilities;
    @SerializedName("EmvAdditionalTerminalCapabilities")
    @Expose
    @Valid
    private HexString emvAdditionalTerminalCapabilities;

    public DefSwitch getUseChipCVM() {
        return useChipCVM;
    }

    public void setUseChipCVM(DefSwitch useChipCVM) {
        this.useChipCVM = useChipCVM;
    }

    public ChipCVM withUseChipCVM(DefSwitch useChipCVM) {
        this.useChipCVM = useChipCVM;
        return this;
    }

    public BigInteger getChipCVMAmount() {
        return chipCVMAmount;
    }

    public void setChipCVMAmount(BigInteger chipCVMAmount) {
        this.chipCVMAmount = chipCVMAmount;
    }

    public ChipCVM withChipCVMAmount(BigInteger chipCVMAmount) {
        this.chipCVMAmount = chipCVMAmount;
        return this;
    }

    public HexString getEmvTerminalCapabilities() {
        return emvTerminalCapabilities;
    }

    public void setEmvTerminalCapabilities(HexString emvTerminalCapabilities) {
        this.emvTerminalCapabilities = emvTerminalCapabilities;
    }

    public ChipCVM withEmvTerminalCapabilities(HexString emvTerminalCapabilities) {
        this.emvTerminalCapabilities = emvTerminalCapabilities;
        return this;
    }

    public HexString getEmvAdditionalTerminalCapabilities() {
        return emvAdditionalTerminalCapabilities;
    }

    public void setEmvAdditionalTerminalCapabilities(HexString emvAdditionalTerminalCapabilities) {
        this.emvAdditionalTerminalCapabilities = emvAdditionalTerminalCapabilities;
    }

    public ChipCVM withEmvAdditionalTerminalCapabilities(HexString emvAdditionalTerminalCapabilities) {
        this.emvAdditionalTerminalCapabilities = emvAdditionalTerminalCapabilities;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ChipCVM.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("useChipCVM");
        sb.append('=');
        sb.append(((this.useChipCVM == null)?"<null>":this.useChipCVM));
        sb.append(',');
        sb.append("chipCVMAmount");
        sb.append('=');
        sb.append(((this.chipCVMAmount == null)?"<null>":this.chipCVMAmount));
        sb.append(',');
        sb.append("emvTerminalCapabilities");
        sb.append('=');
        sb.append(((this.emvTerminalCapabilities == null)?"<null>":this.emvTerminalCapabilities));
        sb.append(',');
        sb.append("emvAdditionalTerminalCapabilities");
        sb.append('=');
        sb.append(((this.emvAdditionalTerminalCapabilities == null)?"<null>":this.emvAdditionalTerminalCapabilities));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
