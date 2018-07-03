
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccountType {

    @SerializedName("Anchor")
    @Expose
    private Integer anchor;
    @SerializedName("AccountTypeName")
    @Expose
    private String accountTypeName;
    @SerializedName("AccountTypeId")
    @Expose
    private Integer accountTypeId;
    @SerializedName("EnabledOperations")
    @Expose
    private AccountType.DefOperation enabledOperations = AccountType.DefOperation.fromValue(0);
    @SerializedName("PrefLanguages")
    @Expose
    @Valid
    private List<PrefLanguageItem> prefLanguages = new ArrayList<PrefLanguageItem>();

    public Integer getAnchor() {
        return anchor;
    }

    public void setAnchor(Integer anchor) {
        this.anchor = anchor;
    }

    public AccountType withAnchor(Integer anchor) {
        this.anchor = anchor;
        return this;
    }

    public String getAccountTypeName() {
        return accountTypeName;
    }

    public void setAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
    }

    public AccountType withAccountTypeName(String accountTypeName) {
        this.accountTypeName = accountTypeName;
        return this;
    }

    public Integer getAccountTypeId() {
        return accountTypeId;
    }

    public void setAccountTypeId(Integer accountTypeId) {
        this.accountTypeId = accountTypeId;
    }

    public AccountType withAccountTypeId(Integer accountTypeId) {
        this.accountTypeId = accountTypeId;
        return this;
    }

    public AccountType.DefOperation getEnabledOperations() {
        return enabledOperations;
    }

    public void setEnabledOperations(AccountType.DefOperation enabledOperations) {
        this.enabledOperations = enabledOperations;
    }

    public AccountType withEnabledOperations(AccountType.DefOperation enabledOperations) {
        this.enabledOperations = enabledOperations;
        return this;
    }

    public List<PrefLanguageItem> getPrefLanguages() {
        return prefLanguages;
    }

    public void setPrefLanguages(List<PrefLanguageItem> prefLanguages) {
        this.prefLanguages = prefLanguages;
    }

    public AccountType withPrefLanguages(List<PrefLanguageItem> prefLanguages) {
        this.prefLanguages = prefLanguages;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AccountType.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anchor");
        sb.append('=');
        sb.append(((this.anchor == null)?"<null>":this.anchor));
        sb.append(',');
        sb.append("accountTypeName");
        sb.append('=');
        sb.append(((this.accountTypeName == null)?"<null>":this.accountTypeName));
        sb.append(',');
        sb.append("accountTypeId");
        sb.append('=');
        sb.append(((this.accountTypeId == null)?"<null>":this.accountTypeId));
        sb.append(',');
        sb.append("enabledOperations");
        sb.append('=');
        sb.append(((this.enabledOperations == null)?"<null>":this.enabledOperations));
        sb.append(',');
        sb.append("prefLanguages");
        sb.append('=');
        sb.append(((this.prefLanguages == null)?"<null>":this.prefLanguages));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public enum DefOperation {

        @SerializedName("0")
        TypeOper_Unknown(0),
        @SerializedName("1")
        TypeOper_Sale(1),
        @SerializedName("2")
        TypeOper_Refund(2);
        private final Integer value;
        private final static Map<Integer, AccountType.DefOperation> CONSTANTS = new HashMap<Integer, AccountType.DefOperation>();

        static {
            for (AccountType.DefOperation c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private DefOperation(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static AccountType.DefOperation fromValue(Integer value) {
            AccountType.DefOperation constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
