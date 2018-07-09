
package com.inpas.parser.model;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Logging {

    @SerializedName("UploadLogsFlag")
    @Expose
    private DefSwitch uploadLogsFlag = DefSwitch.fromValue(0);
    @SerializedName("LogSize")
    @Expose
    private Integer logSize = 0;
    @SerializedName("LogMode")
    @Expose
    private Logging.ParamLogMode logMode = Logging.ParamLogMode.fromValue(0);

    public DefSwitch getUploadLogsFlag() {
        return uploadLogsFlag;
    }

    public void setUploadLogsFlag(DefSwitch uploadLogsFlag) {
        this.uploadLogsFlag = uploadLogsFlag;
    }

    public Logging withUploadLogsFlag(DefSwitch uploadLogsFlag) {
        this.uploadLogsFlag = uploadLogsFlag;
        return this;
    }

    public Integer getLogSize() {
        return logSize;
    }

    public void setLogSize(Integer logSize) {
        this.logSize = logSize;
    }

    public Logging withLogSize(Integer logSize) {
        this.logSize = logSize;
        return this;
    }

    public Logging.ParamLogMode getLogMode() {
        return logMode;
    }

    public void setLogMode(Logging.ParamLogMode logMode) {
        this.logMode = logMode;
    }

    public Logging withLogMode(Logging.ParamLogMode logMode) {
        this.logMode = logMode;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Logging.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("uploadLogsFlag");
        sb.append('=');
        sb.append(((this.uploadLogsFlag == null)?"<null>":this.uploadLogsFlag));
        sb.append(',');
        sb.append("logSize");
        sb.append('=');
        sb.append(((this.logSize == null)?"<null>":this.logSize));
        sb.append(',');
        sb.append("logMode");
        sb.append('=');
        sb.append(((this.logMode == null)?"<null>":this.logMode));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public enum ParamLogMode {

        @SerializedName("0")
        LogMode_Unknown(0),
        @SerializedName("1")
        LogMode_Errors(1),
        @SerializedName("2")
        LogMode_Support(2),
        @SerializedName("3")
        LogMode_Debug(3);
        private final Integer value;
        private final static Map<Integer, Logging.ParamLogMode> CONSTANTS = new HashMap<Integer, Logging.ParamLogMode>();

        static {
            for (Logging.ParamLogMode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ParamLogMode(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static Logging.ParamLogMode fromValue(Integer value) {
            Logging.ParamLogMode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
