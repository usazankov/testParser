

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

public enum DefOperation {

    @SerializedName("0")
    TypeOper_Unknown(0),
    @SerializedName("1")
    TypeOper_Sale(1),
    @SerializedName("2")
    TypeOper_Refund(2);
    private final Integer value;
    private final static Map<Integer, DefOperation> CONSTANTS = new HashMap<Integer, DefOperation>();

    static {
        for (DefOperation c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DefOperation(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return this.value;
    }

    public static DefOperation fromValue(Integer value) {
        DefOperation constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
