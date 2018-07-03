

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * schema for AccountTypePreset
 * 
 */
public class AccountTypePreset {

    @SerializedName("AccountTypePreset")
    @Expose
    @Valid
    private List<AccountType> accountTypePreset = new ArrayList<AccountType>();

    public List<AccountType> getAccountTypePreset() {
        return accountTypePreset;
    }

    public void setAccountTypePreset(List<AccountType> accountTypePreset) {
        this.accountTypePreset = accountTypePreset;
    }

    public AccountTypePreset withAccountTypePreset(List<AccountType> accountTypePreset) {
        this.accountTypePreset = accountTypePreset;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountTypePreset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accountTypePreset");
        sb.append('=');
        sb.append(((this.accountTypePreset == null)?"<null>":this.accountTypePreset));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
