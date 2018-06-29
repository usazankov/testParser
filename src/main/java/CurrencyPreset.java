

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

    @SerializedName("Currency")
    @Expose
    @Valid
    private List<Currency> currency = new ArrayList<Currency>();

    public List<Currency> getCurrency() {
        return currency;
    }

    public void setCurrency(List<Currency> currency) {
        this.currency = currency;
    }

    public CurrencyPreset withCurrency(List<Currency> currency) {
        this.currency = currency;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(CurrencyPreset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
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
        result = ((result* 31)+((this.currency == null)? 0 :this.currency.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CurrencyPreset) == false) {
            return false;
        }
        CurrencyPreset rhs = ((CurrencyPreset) other);
        return ((this.currency == rhs.currency)||((this.currency!= null)&&this.currency.equals(rhs.currency)));
    }

}
