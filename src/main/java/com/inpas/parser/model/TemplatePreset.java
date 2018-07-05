
package com.inpas.parser.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * schema for TemplatePreset
 * 
 */
public class TemplatePreset {

    @SerializedName("TemplatePreset")
    @Expose
    @Valid
    private List<Template> templatePreset = new ArrayList<Template>();

    public List<Template> getTemplatePreset() {
        return templatePreset;
    }

    public void setTemplatePreset(List<Template> templatePreset) {
        this.templatePreset = templatePreset;
    }

    public TemplatePreset withTemplatePreset(List<Template> templatePreset) {
        this.templatePreset = templatePreset;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TemplatePreset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("templatePreset");
        sb.append('=');
        sb.append(((this.templatePreset == null)?"<null>":this.templatePreset));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
