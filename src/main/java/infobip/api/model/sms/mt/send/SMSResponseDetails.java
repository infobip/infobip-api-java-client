package infobip.api.model.sms.mt.send;

import infobip.api.model.Status;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class SMSResponseDetails {
    private Integer smsCount;
    private String messageId;
    private String to;
    private Status status;

    public SMSResponseDetails() {
    }


    public Integer getSmsCount() {
        return this.smsCount;
    }

    public SMSResponseDetails setSmsCount(Integer smsCount) {
        this.smsCount = smsCount;
        return this;
    }


    public String getMessageId() {
        return this.messageId;
    }

    public SMSResponseDetails setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }


    public String getTo() {
        return this.to;
    }

    public SMSResponseDetails setTo(String to) {
        this.to = to;
        return this;
    }


    public Status getStatus() {
        return this.status;
    }

    public SMSResponseDetails setStatus(Status status) {
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

        SMSResponseDetails o = (SMSResponseDetails)obj;
        if (this.smsCount == null) {
            if (o.smsCount != null){
                return false;
            }
        } else if (!this.smsCount.equals(o.smsCount)) {
            return false;
        }
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
        return "SMSResponseDetails{" +
            "smsCount='" + smsCount + "'" +

            ", messageId='" + messageId + "'" +

            ", to='" + to + "'" +

            ", status='" + status + "'" +
            '}';
    }
}