package infobip.api.model.omni.send;

import infobip.api.model.omni.To;
import infobip.api.model.omni.Status;

/**
 * This is a generated class and is not intended for modification!
 */
public class OmniResponseDetails {
    private To to;
    private Status status;
    private String messageId;

    public OmniResponseDetails() {
    }

    public To getTo() {
        return this.to;
    }

    public OmniResponseDetails setTo(To to) {
        this.to = to;
        return this;
    }

    public Status getStatus() {
        return this.status;
    }

    public OmniResponseDetails setStatus(Status status) {
        this.status = status;
        return this;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public OmniResponseDetails setMessageId(String messageId) {
        this.messageId = messageId;
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

        OmniResponseDetails o = (OmniResponseDetails)obj;
        if (this.to == null) {
            if (o.to != null){
                return false;
            }
        } else if (!this.to.equals(o.to)) {
            return false;
        }
        if (this.status == null) {
            if (o.status != null){
                return false;
            }
        } else if (!this.status.equals(o.status)) {
            return false;
        }
        if (this.messageId == null) {
            if (o.messageId != null){
                return false;
            }
        } else if (!this.messageId.equals(o.messageId)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "OmniResponseDetails{" +
            "to='" + to + "'" +
            ", status='" + status + "'" +
            ", messageId='" + messageId + "'" +
            '}';
    }
}