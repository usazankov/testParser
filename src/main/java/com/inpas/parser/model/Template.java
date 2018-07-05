
package com.inpas.parser.model;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Template {

    @SerializedName("Anchor")
    @Expose
    private Integer anchor;
    @SerializedName("TemplateName")
    @Expose
    private String templateName = "";
    @SerializedName("TemplateType")
    @Expose
    private Template.ParamTemplateType templateType = Template.ParamTemplateType.fromValue(0);
    @SerializedName("TemplateBody")
    @Expose
    private String templateBody = "";

    public Integer getAnchor() {
        return anchor;
    }

    public void setAnchor(Integer anchor) {
        this.anchor = anchor;
    }

    public Template withAnchor(Integer anchor) {
        this.anchor = anchor;
        return this;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Template withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    public Template.ParamTemplateType getTemplateType() {
        return templateType;
    }

    public void setTemplateType(Template.ParamTemplateType templateType) {
        this.templateType = templateType;
    }

    public Template withTemplateType(Template.ParamTemplateType templateType) {
        this.templateType = templateType;
        return this;
    }

    public String getTemplateBody() {
        return templateBody;
    }

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    public Template withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Template.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anchor");
        sb.append('=');
        sb.append(((this.anchor == null)?"<null>":this.anchor));
        sb.append(',');
        sb.append("templateName");
        sb.append('=');
        sb.append(((this.templateName == null)?"<null>":this.templateName));
        sb.append(',');
        sb.append("templateType");
        sb.append('=');
        sb.append(((this.templateType == null)?"<null>":this.templateType));
        sb.append(',');
        sb.append("templateBody");
        sb.append('=');
        sb.append(((this.templateBody == null)?"<null>":this.templateBody));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    public enum ParamTemplateType {

        @SerializedName("0")
        TemplateType_Unknown(0),
        @SerializedName("1")
        TemplateType_FinCheques(1),
        @SerializedName("2")
        TemplateType_Reconciliation(2),
        @SerializedName("3")
        TemplateType_KeyChange(3),
        @SerializedName("4")
        TemplateType_UserReports(4),
        @SerializedName("5")
        TemplateType_LinkCheck(5),
        @SerializedName("6")
        TemplateType_AutoReport(6),
        @SerializedName("8")
        TemplateType_LoadParam(8);
        private final Integer value;
        private final static Map<Integer, Template.ParamTemplateType> CONSTANTS = new HashMap<Integer, Template.ParamTemplateType>();

        static {
            for (Template.ParamTemplateType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ParamTemplateType(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static Template.ParamTemplateType fromValue(Integer value) {
            Template.ParamTemplateType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
