
package com.inpas.parser.model;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UsersGroup {

    @SerializedName("Anchor")
    @Expose
    private Integer anchor;
    @SerializedName("UsersGroupName")
    @Expose
    private String usersGroupName = "";
    @SerializedName("UsersGroupEnabledFinOperations")
    @Expose
    private String usersGroupEnabledFinOperations = "";
    @SerializedName("UsersGroupEnabledServiceOperations")
    @Expose
    private String usersGroupEnabledServiceOperations = "";
    @SerializedName("UsersGroupRole")
    @Expose
    private UsersGroup.ParamUsersGroupRole usersGroupRole = UsersGroup.ParamUsersGroupRole.fromValue(0);

    public Integer getAnchor() {
        return anchor;
    }

    public void setAnchor(Integer anchor) {
        this.anchor = anchor;
    }

    public UsersGroup withAnchor(Integer anchor) {
        this.anchor = anchor;
        return this;
    }

    public String getUsersGroupName() {
        return usersGroupName;
    }

    public void setUsersGroupName(String usersGroupName) {
        this.usersGroupName = usersGroupName;
    }

    public UsersGroup withUsersGroupName(String usersGroupName) {
        this.usersGroupName = usersGroupName;
        return this;
    }

    public String getUsersGroupEnabledFinOperations() {
        return usersGroupEnabledFinOperations;
    }

    public void setUsersGroupEnabledFinOperations(String usersGroupEnabledFinOperations) {
        this.usersGroupEnabledFinOperations = usersGroupEnabledFinOperations;
    }

    public UsersGroup withUsersGroupEnabledFinOperations(String usersGroupEnabledFinOperations) {
        this.usersGroupEnabledFinOperations = usersGroupEnabledFinOperations;
        return this;
    }

    public String getUsersGroupEnabledServiceOperations() {
        return usersGroupEnabledServiceOperations;
    }

    public void setUsersGroupEnabledServiceOperations(String usersGroupEnabledServiceOperations) {
        this.usersGroupEnabledServiceOperations = usersGroupEnabledServiceOperations;
    }

    public UsersGroup withUsersGroupEnabledServiceOperations(String usersGroupEnabledServiceOperations) {
        this.usersGroupEnabledServiceOperations = usersGroupEnabledServiceOperations;
        return this;
    }

    public UsersGroup.ParamUsersGroupRole getUsersGroupRole() {
        return usersGroupRole;
    }

    public void setUsersGroupRole(UsersGroup.ParamUsersGroupRole usersGroupRole) {
        this.usersGroupRole = usersGroupRole;
    }

    public UsersGroup withUsersGroupRole(UsersGroup.ParamUsersGroupRole usersGroupRole) {
        this.usersGroupRole = usersGroupRole;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UsersGroup.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anchor");
        sb.append('=');
        sb.append(((this.anchor == null)?"<null>":this.anchor));
        sb.append(',');
        sb.append("usersGroupName");
        sb.append('=');
        sb.append(((this.usersGroupName == null)?"<null>":this.usersGroupName));
        sb.append(',');
        sb.append("usersGroupEnabledFinOperations");
        sb.append('=');
        sb.append(((this.usersGroupEnabledFinOperations == null)?"<null>":this.usersGroupEnabledFinOperations));
        sb.append(',');
        sb.append("usersGroupEnabledServiceOperations");
        sb.append('=');
        sb.append(((this.usersGroupEnabledServiceOperations == null)?"<null>":this.usersGroupEnabledServiceOperations));
        sb.append(',');
        sb.append("usersGroupRole");
        sb.append('=');
        sb.append(((this.usersGroupRole == null)?"<null>":this.usersGroupRole));
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
        result = ((result* 31)+((this.usersGroupEnabledServiceOperations == null)? 0 :this.usersGroupEnabledServiceOperations.hashCode()));
        result = ((result* 31)+((this.usersGroupRole == null)? 0 :this.usersGroupRole.hashCode()));
        result = ((result* 31)+((this.usersGroupName == null)? 0 :this.usersGroupName.hashCode()));
        result = ((result* 31)+((this.usersGroupEnabledFinOperations == null)? 0 :this.usersGroupEnabledFinOperations.hashCode()));
        result = ((result* 31)+((this.anchor == null)? 0 :this.anchor.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UsersGroup) == false) {
            return false;
        }
        UsersGroup rhs = ((UsersGroup) other);
        return ((((((this.usersGroupEnabledServiceOperations == rhs.usersGroupEnabledServiceOperations)||((this.usersGroupEnabledServiceOperations!= null)&&this.usersGroupEnabledServiceOperations.equals(rhs.usersGroupEnabledServiceOperations)))&&((this.usersGroupRole == rhs.usersGroupRole)||((this.usersGroupRole!= null)&&this.usersGroupRole.equals(rhs.usersGroupRole))))&&((this.usersGroupName == rhs.usersGroupName)||((this.usersGroupName!= null)&&this.usersGroupName.equals(rhs.usersGroupName))))&&((this.usersGroupEnabledFinOperations == rhs.usersGroupEnabledFinOperations)||((this.usersGroupEnabledFinOperations!= null)&&this.usersGroupEnabledFinOperations.equals(rhs.usersGroupEnabledFinOperations))))&&((this.anchor == rhs.anchor)||((this.anchor!= null)&&this.anchor.equals(rhs.anchor))));
    }

    public enum ParamUsersGroupRole {

        @SerializedName("0")
        UserGroupRole_Unknown(0),
        @SerializedName("1")
        UserGroupRole_Cachier(1),
        @SerializedName("2")
        UserGroupRole_SenCachier(2),
        @SerializedName("3")
        UserGroupRole_Admin(3),
        @SerializedName("4")
        UserGroupRole_Root(4);
        private final Integer value;
        private final static Map<Integer, UsersGroup.ParamUsersGroupRole> CONSTANTS = new HashMap<Integer, UsersGroup.ParamUsersGroupRole>();

        static {
            for (UsersGroup.ParamUsersGroupRole c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private ParamUsersGroupRole(Integer value) {
            this.value = value;
        }

        public Integer value() {
            return this.value;
        }

        public static UsersGroup.ParamUsersGroupRole fromValue(Integer value) {
            UsersGroup.ParamUsersGroupRole constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
