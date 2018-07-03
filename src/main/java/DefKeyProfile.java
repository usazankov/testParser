

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.SerializedName;

public enum DefKeyProfile {

    @SerializedName("0")
    KeyProfile_Unknown(0),
    @SerializedName("1")
    KeyProfile_TAK(1),
    @SerializedName("2")
    KeyProfile_TPK(2),
    @SerializedName("3")
    KeyProfile_TOPK(3),
    @SerializedName("4")
    KeyProfile_TMK(4),
    @SerializedName("5")
    KeyProfile_TPMK(5),
    @SerializedName("6")
    KeyProfile_TOPMK(6),
    @SerializedName("7")
    KeyProfile_TAMK(7),
    @SerializedName("8")
    KeyProfile_KLK(8),
    @SerializedName("9")
    KeyProfile_TDK(9),
    @SerializedName("10")
    KeyProfile_TEK(10);
    private final Integer value;
    private final static Map<Integer, DefKeyProfile> CONSTANTS = new HashMap<Integer, DefKeyProfile>();

    static {
        for (DefKeyProfile c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private DefKeyProfile(Integer value) {
        this.value = value;
    }

    public Integer value() {
        return this.value;
    }

    public static DefKeyProfile fromValue(Integer value) {
        DefKeyProfile constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException((value +""));
        } else {
            return constant;
        }
    }

}
