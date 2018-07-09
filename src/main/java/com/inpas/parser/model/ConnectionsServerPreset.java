
package com.inpas.parser.model;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * schema for ConnectionsServerPreset
 * 
 */
public class ConnectionsServerPreset {

    @SerializedName("ConnectionsServerPreset")
    @Expose
    @Valid
    private List<ConnectionsServer> connectionsServerPreset = new ArrayList<ConnectionsServer>();

    public List<ConnectionsServer> getConnectionsServerPreset() {
        return connectionsServerPreset;
    }

    public void setConnectionsServerPreset(List<ConnectionsServer> connectionsServerPreset) {
        this.connectionsServerPreset = connectionsServerPreset;
    }

    public ConnectionsServerPreset withConnectionsServerPreset(List<ConnectionsServer> connectionsServerPreset) {
        this.connectionsServerPreset = connectionsServerPreset;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConnectionsServerPreset.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("connectionsServerPreset");
        sb.append('=');
        sb.append(((this.connectionsServerPreset == null)?"<null>":this.connectionsServerPreset));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
