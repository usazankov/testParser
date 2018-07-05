
package com.inpas.parser.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * schema for UsersGroupPreset
 * 
 */
public class UsersGroupPreset {

    @SerializedName("UsersGroupPreset")
    @Expose
    @Valid
    private List<UsersGroup> usersGroupPreset = new ArrayList<UsersGroup>();

    public List<UsersGroup> getUsersGroupPreset() {
        return usersGroupPreset;
    }

    public void setUsersGroupPreset(List<UsersGroup> usersGroupPreset) {
        this.usersGroupPreset = usersGroupPreset;
    }

    public UsersGroupPreset withUsersGroupPreset(List<UsersGroup> usersGroupPreset) {
        this.usersGroupPreset = usersGroupPreset;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UsersGroupPreset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("usersGroupPreset");
        sb.append('=');
        sb.append(((this.usersGroupPreset == null)?"<null>":this.usersGroupPreset));
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
        result = ((result* 31)+((this.usersGroupPreset == null)? 0 :this.usersGroupPreset.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UsersGroupPreset) == false) {
            return false;
        }
        UsersGroupPreset rhs = ((UsersGroupPreset) other);
        return ((this.usersGroupPreset == rhs.usersGroupPreset)||((this.usersGroupPreset!= null)&&this.usersGroupPreset.equals(rhs.usersGroupPreset)));
    }

}
