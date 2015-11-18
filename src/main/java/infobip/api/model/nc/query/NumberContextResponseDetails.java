package infobip.api.model.nc.query;

import infobip.api.model.nc.Network;
import infobip.api.model.Error;
import infobip.api.model.Status;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class NumberContextResponseDetails {
    private Boolean ported;
    private Boolean roaming;
    private String mccMnc;
    private Network roamingNetwork;
    private Network portedNetwork;
    private String to;
    private String imsi;
    private String servingMSC;
    private Error error;
    private Network originalNetwork;
    private Status status;

    public NumberContextResponseDetails() {
    }

    public Boolean getPorted() {
        return this.ported;
    }

    public NumberContextResponseDetails setPorted(Boolean ported) {
        this.ported = ported;
        return this;
    }

    public Boolean getRoaming() {
        return this.roaming;
    }

    public NumberContextResponseDetails setRoaming(Boolean roaming) {
        this.roaming = roaming;
        return this;
    }

    public String getMccMnc() {
        return this.mccMnc;
    }

    public NumberContextResponseDetails setMccMnc(String mccMnc) {
        this.mccMnc = mccMnc;
        return this;
    }

    public Network getRoamingNetwork() {
        return this.roamingNetwork;
    }

    public NumberContextResponseDetails setRoamingNetwork(Network roamingNetwork) {
        this.roamingNetwork = roamingNetwork;
        return this;
    }

    public Network getPortedNetwork() {
        return this.portedNetwork;
    }

    public NumberContextResponseDetails setPortedNetwork(Network portedNetwork) {
        this.portedNetwork = portedNetwork;
        return this;
    }

    public String getTo() {
        return this.to;
    }

    public NumberContextResponseDetails setTo(String to) {
        this.to = to;
        return this;
    }

    public String getImsi() {
        return this.imsi;
    }

    public NumberContextResponseDetails setImsi(String imsi) {
        this.imsi = imsi;
        return this;
    }

    public String getServingMSC() {
        return this.servingMSC;
    }

    public NumberContextResponseDetails setServingMSC(String servingMSC) {
        this.servingMSC = servingMSC;
        return this;
    }

    public Error getError() {
        return this.error;
    }

    public NumberContextResponseDetails setError(Error error) {
        this.error = error;
        return this;
    }

    public Network getOriginalNetwork() {
        return this.originalNetwork;
    }

    public NumberContextResponseDetails setOriginalNetwork(Network originalNetwork) {
        this.originalNetwork = originalNetwork;
        return this;
    }

    public Status getStatus() {
        return this.status;
    }

    public NumberContextResponseDetails setStatus(Status status) {
        this.status = status;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        NumberContextResponseDetails o = (NumberContextResponseDetails)obj;
        if (this.ported == null) {
            if (o.ported != null){
                return false;
            }
        } else if (!this.ported.equals(o.ported)) {
            return false;
        }
        if (this.roaming == null) {
            if (o.roaming != null){
                return false;
            }
        } else if (!this.roaming.equals(o.roaming)) {
            return false;
        }
        if (this.mccMnc == null) {
            if (o.mccMnc != null){
                return false;
            }
        } else if (!this.mccMnc.equals(o.mccMnc)) {
            return false;
        }
        if (this.roamingNetwork == null) {
            if (o.roamingNetwork != null){
                return false;
            }
        } else if (!this.roamingNetwork.equals(o.roamingNetwork)) {
            return false;
        }
        if (this.portedNetwork == null) {
            if (o.portedNetwork != null){
                return false;
            }
        } else if (!this.portedNetwork.equals(o.portedNetwork)) {
            return false;
        }
        if (this.to == null) {
            if (o.to != null){
                return false;
            }
        } else if (!this.to.equals(o.to)) {
            return false;
        }
        if (this.imsi == null) {
            if (o.imsi != null){
                return false;
            }
        } else if (!this.imsi.equals(o.imsi)) {
            return false;
        }
        if (this.servingMSC == null) {
            if (o.servingMSC != null){
                return false;
            }
        } else if (!this.servingMSC.equals(o.servingMSC)) {
            return false;
        }
        if (this.error == null) {
            if (o.error != null){
                return false;
            }
        } else if (!this.error.equals(o.error)) {
            return false;
        }
        if (this.originalNetwork == null) {
            if (o.originalNetwork != null){
                return false;
            }
        } else if (!this.originalNetwork.equals(o.originalNetwork)) {
            return false;
        }
        if (this.status == null) {
            if (o.status != null){
                return false;
            }
        } else if (!this.status.equals(o.status)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "NumberContextResponseDetails{" +
            "ported='" + ported + "'" +
            ", roaming='" + roaming + "'" +
            ", mccMnc='" + mccMnc + "'" +
            ", roamingNetwork='" + roamingNetwork + "'" +
            ", portedNetwork='" + portedNetwork + "'" +
            ", to='" + to + "'" +
            ", imsi='" + imsi + "'" +
            ", servingMSC='" + servingMSC + "'" +
            ", error='" + error + "'" +
            ", originalNetwork='" + originalNetwork + "'" +
            ", status='" + status + "'" +
            '}';
    }
}