

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PrefLanguageItem {

    @SerializedName("Anchor")
    @Expose
    private Integer anchor;
    @SerializedName("PrefLanguage")
    @Expose
    private String prefLanguage;
    @SerializedName("Item")
    @Expose
    private String item;

    public Integer getAnchor() {
        return anchor;
    }

    public void setAnchor(Integer anchor) {
        this.anchor = anchor;
    }

    public PrefLanguageItem withAnchor(Integer anchor) {
        this.anchor = anchor;
        return this;
    }

    public String getPrefLanguage() {
        return prefLanguage;
    }

    public void setPrefLanguage(String prefLanguage) {
        this.prefLanguage = prefLanguage;
    }

    public PrefLanguageItem withPrefLanguage(String prefLanguage) {
        this.prefLanguage = prefLanguage;
        return this;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public PrefLanguageItem withItem(String item) {
        this.item = item;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PrefLanguageItem.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anchor");
        sb.append('=');
        sb.append(((this.anchor == null)?"<null>":this.anchor));
        sb.append(',');
        sb.append("prefLanguage");
        sb.append('=');
        sb.append(((this.prefLanguage == null)?"<null>":this.prefLanguage));
        sb.append(',');
        sb.append("item");
        sb.append('=');
        sb.append(((this.item == null)?"<null>":this.item));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
