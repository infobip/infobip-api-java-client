package infobip.api.model.omni;

import infobip.api.model.omni.To;

/**
 * This is a generated class and is not intended for modification!
 */
public class Destination {
    private String messageId;
    private To to;

    public Destination() {
    }

    public String getMessageId() {
        return this.messageId;
    }

    public Destination setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public To getTo() {
        return this.to;
    }

    public Destination setTo(To to) {
        this.to = to;
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

        Destination o = (Destination)obj;
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

        return true;
    }

    @Override
    public String toString() {
        return "Destination{" +
            "messageId='" + messageId + "'" +
            ", to='" + to + "'" +
            '}';
    }
}