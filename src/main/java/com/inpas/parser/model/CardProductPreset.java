
package com.inpas.parser.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * schema for CardProductPreset
 * 
 */
public class CardProductPreset {

    @SerializedName("CardProductPreset")
    @Expose
    @Valid
    private List<CardProduct> cardProductPreset = new ArrayList<CardProduct>();

    public List<CardProduct> getCardProductPreset() {
        return cardProductPreset;
    }

    public void setCardProductPreset(List<CardProduct> cardProductPreset) {
        this.cardProductPreset = cardProductPreset;
    }

    public CardProductPreset withCardProductPreset(List<CardProduct> cardProductPreset) {
        this.cardProductPreset = cardProductPreset;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CardProductPreset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cardProductPreset");
        sb.append('=');
        sb.append(((this.cardProductPreset == null)?"<null>":this.cardProductPreset));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
