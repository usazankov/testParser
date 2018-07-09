
package com.inpas.parser.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConnectionsServer {

    @SerializedName("Anchor")
    @Expose
    private Integer anchor;
    @SerializedName("ConnectionName")
    @Expose
    private String connectionName = "";
    @SerializedName("SSLConfigServerPortCertificatePath")
    @Expose
    private String sSLConfigServerPortCertificatePath = "";
    @SerializedName("SSLClientCertificatePath")
    @Expose
    private String sSLClientCertificatePath = "";
    @SerializedName("SSLPrivateKeyPath")
    @Expose
    private String sSLPrivateKeyPath = "";
    @SerializedName("Address")
    @Expose
    private String address = "";

    public Integer getAnchor() {
        return anchor;
    }

    public void setAnchor(Integer anchor) {
        this.anchor = anchor;
    }

    public ConnectionsServer withAnchor(Integer anchor) {
        this.anchor = anchor;
        return this;
    }

    public String getConnectionName() {
        return connectionName;
    }

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    public ConnectionsServer withConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    public String getSSLConfigServerPortCertificatePath() {
        return sSLConfigServerPortCertificatePath;
    }

    public void setSSLConfigServerPortCertificatePath(String sSLConfigServerPortCertificatePath) {
        this.sSLConfigServerPortCertificatePath = sSLConfigServerPortCertificatePath;
    }

    public ConnectionsServer withSSLConfigServerPortCertificatePath(String sSLConfigServerPortCertificatePath) {
        this.sSLConfigServerPortCertificatePath = sSLConfigServerPortCertificatePath;
        return this;
    }

    public String getSSLClientCertificatePath() {
        return sSLClientCertificatePath;
    }

    public void setSSLClientCertificatePath(String sSLClientCertificatePath) {
        this.sSLClientCertificatePath = sSLClientCertificatePath;
    }

    public ConnectionsServer withSSLClientCertificatePath(String sSLClientCertificatePath) {
        this.sSLClientCertificatePath = sSLClientCertificatePath;
        return this;
    }

    public String getSSLPrivateKeyPath() {
        return sSLPrivateKeyPath;
    }

    public void setSSLPrivateKeyPath(String sSLPrivateKeyPath) {
        this.sSLPrivateKeyPath = sSLPrivateKeyPath;
    }

    public ConnectionsServer withSSLPrivateKeyPath(String sSLPrivateKeyPath) {
        this.sSLPrivateKeyPath = sSLPrivateKeyPath;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ConnectionsServer withAddress(String address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConnectionsServer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("anchor");
        sb.append('=');
        sb.append(((this.anchor == null)?"<null>":this.anchor));
        sb.append(',');
        sb.append("connectionName");
        sb.append('=');
        sb.append(((this.connectionName == null)?"<null>":this.connectionName));
        sb.append(',');
        sb.append("sSLConfigServerPortCertificatePath");
        sb.append('=');
        sb.append(((this.sSLConfigServerPortCertificatePath == null)?"<null>":this.sSLConfigServerPortCertificatePath));
        sb.append(',');
        sb.append("sSLClientCertificatePath");
        sb.append('=');
        sb.append(((this.sSLClientCertificatePath == null)?"<null>":this.sSLClientCertificatePath));
        sb.append(',');
        sb.append("sSLPrivateKeyPath");
        sb.append('=');
        sb.append(((this.sSLPrivateKeyPath == null)?"<null>":this.sSLPrivateKeyPath));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
