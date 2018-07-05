
package com.inpas.parser.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * schema for CurrencyPreset
 * 
 */
public class CurrencyPreset {

    @SerializedName("CurrencyPreset")
    @Expose
    @Valid
    private List<Currency> currencyPreset = new ArrayList<Currency>();

    public List<Currency> getCurrencyPreset() {
        return currencyPreset;
    }

    public void setCurrencyPreset(List<Currency> currencyPreset) {
        this.currencyPreset = currencyPreset;
    }

    public CurrencyPreset withCurrencyPreset(List<Currency> currencyPreset) {
        this.currencyPreset = currencyPreset;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurrencyPreset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("currencyPreset");
        sb.append('=');
        sb.append(((this.currencyPreset == null)?"<null>":this.currencyPreset));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
