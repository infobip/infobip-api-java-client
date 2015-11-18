package infobip.api.model.nc.notify;

import infobip.api.model.Status;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class NumberContextResponseDetails {
    private String messageId;
    private String to;
    private Status status;

    public NumberContextResponseDetails() {
    }

    public String getMessageId() {
        return this.messageId;
    }

    public NumberContextResponseDetails setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getTo() {
        return this.to;
    }

    public NumberContextResponseDetails setTo(String to) {
        this.to = to;
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
        if (this.messageId == null) {
            if (o.messageId != null){
                return false;
            }
        } else if (!this.messageId.equals(o.messageId)) {
            return false;
        }
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

        return true;
    }

    @Override
    public String toString() {
        return "NumberContextResponseDetails{" +
            "messageId='" + messageId + "'" +
            ", to='" + to + "'" +
            ", status='" + status + "'" +
            '}';
    }
}