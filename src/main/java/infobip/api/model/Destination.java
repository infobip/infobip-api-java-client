package infobip.api.model;

/**
 * This is a generated class and is not intended for modification!
 */
public class Destination {
    private String to;
    private String messageId;

    public Destination() {
    }

    public String getTo() {
        return this.to;
    }

    public Destination setTo(String to) {
        this.to = to;
        return this;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public Destination setMessageId(String messageId) {
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

        Destination o = (Destination)obj;
        if (this.to == null) {
            if (o.to != null){
                return false;
            }
        } else if (!this.to.equals(o.to)) {
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
        return "Destination{" +
            "to='" + to + "'" +
            ", messageId='" + messageId + "'" +
            '}';
    }
}