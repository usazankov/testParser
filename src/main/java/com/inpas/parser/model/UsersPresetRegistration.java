
package com.inpas.parser.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UsersPresetRegistration {

    @SerializedName("Anchor")
    @Expose
    private Integer anchor;
    @SerializedName("UserName")
    @Expose
    private String userName = "";
    @SerializedName("UserPassword")
    @Expose
    private String userPassword = "";
    @SerializedName("UserGroupRef")
    @Expose
    private Integer userGroupRef;

    public Integer getAnchor() {
        return anchor;
    }

    public void setAnchor(Integer anchor) {
        this.anchor = anchor;
    }

    public UsersPresetRegistration withAnchor(Integer anchor) {
        this.anchor = anchor;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UsersPresetRegistration withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public UsersPresetRegistration withUserPassword(String userPassword) {
        this.userPassword = userPassword;
        return this;
    }

    public Integer getUserGroupRef() {
        return userGroupRef;
    }

    public void setUserGroupRef(Integer userGroupRef) {
        this.userGroupRef = userGroupRef;
    }

    public UsersPresetRegistration withUserGroupRef(Integer userGroupRef) {
        this.userGroupRef = userGroupRef;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UsersPresetRegistration.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anchor");
        sb.append('=');
        sb.append(((this.anchor == null)?"<null>":this.anchor));
        sb.append(',');
        sb.append("userName");
        sb.append('=');
        sb.append(((this.userName == null)?"<null>":this.userName));
        sb.append(',');
        sb.append("userPassword");
        sb.append('=');
        sb.append(((this.userPassword == null)?"<null>":this.userPassword));
        sb.append(',');
        sb.append("userGroupRef");
        sb.append('=');
        sb.append(((this.userGroupRef == null)?"<null>":this.userGroupRef));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
