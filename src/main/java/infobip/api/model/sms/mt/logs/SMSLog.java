package infobip.api.model.sms.mt.logs;

import java.util.Date;
import infobip.api.model.Price;
import infobip.api.model.Error;
import infobip.api.model.Status;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class SMSLog {
    private Date doneAt;
    private String bulkId;
    private String mccMnc;
    private Integer smsCount;
    private Price price;
    private String messageId;
    private String from;
    private String to;
    private String text;
    private Date sentAt;
    private Error error;
    private Status status;

    public SMSLog() {
    }

    public Date getDoneAt() {
        return this.doneAt;
    }

    public SMSLog setDoneAt(Date doneAt) {
        this.doneAt = doneAt;
        return this;
    }

    public String getBulkId() {
        return this.bulkId;
    }

    public SMSLog setBulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    public String getMccMnc() {
        return this.mccMnc;
    }

    public SMSLog setMccMnc(String mccMnc) {
        this.mccMnc = mccMnc;
        return this;
    }

    public Integer getSmsCount() {
        return this.smsCount;
    }

    public SMSLog setSmsCount(Integer smsCount) {
        this.smsCount = smsCount;
        return this;
    }

    public Price getPrice() {
        return this.price;
    }

    public SMSLog setPrice(Price price) {
        this.price = price;
        return this;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public SMSLog setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getFrom() {
        return this.from;
    }

    public SMSLog setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return this.to;
    }

    public SMSLog setTo(String to) {
        this.to = to;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public SMSLog setText(String text) {
        this.text = text;
        return this;
    }

    public Date getSentAt() {
        return this.sentAt;
    }

    public SMSLog setSentAt(Date sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    public Error getError() {
        return this.error;
    }

    public SMSLog setError(Error error) {
        this.error = error;
        return this;
    }

    public Status getStatus() {
        return this.status;
    }

    public SMSLog setStatus(Status status) {
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

        SMSLog o = (SMSLog)obj;
        if (this.doneAt == null) {
            if (o.doneAt != null){
                return false;
            }
        } else if (!this.doneAt.equals(o.doneAt)) {
            return false;
        }
        if (this.bulkId == null) {
            if (o.bulkId != null){
                return false;
            }
        } else if (!this.bulkId.equals(o.bulkId)) {
            return false;
        }
        if (this.mccMnc == null) {
            if (o.mccMnc != null){
                return false;
            }
        } else if (!this.mccMnc.equals(o.mccMnc)) {
            return false;
        }
        if (this.smsCount == null) {
            if (o.smsCount != null){
                return false;
            }
        } else if (!this.smsCount.equals(o.smsCount)) {
            return false;
        }
        if (this.price == null) {
            if (o.price != null){
                return false;
            }
        } else if (!this.price.equals(o.price)) {
            return false;
        }
        if (this.messageId == null) {
            if (o.messageId != null){
                return false;
            }
        } else if (!this.messageId.equals(o.messageId)) {
            return false;
        }
        if (this.from == null) {
            if (o.from != null){
                return false;
            }
        } else if (!this.from.equals(o.from)) {
            return false;
        }
        if (this.to == null) {
            if (o.to != null){
                return false;
            }
        } else if (!this.to.equals(o.to)) {
            return false;
        }
        if (this.text == null) {
            if (o.text != null){
                return false;
            }
        } else if (!this.text.equals(o.text)) {
            return false;
        }
        if (this.sentAt == null) {
            if (o.sentAt != null){
                return false;
            }
        } else if (!this.sentAt.equals(o.sentAt)) {
            return false;
        }
        if (this.error == null) {
            if (o.error != null){
                return false;
            }
        } else if (!this.error.equals(o.error)) {
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
        return "SMSLog{" +
            "doneAt='" + doneAt + "'" +
            ", bulkId='" + bulkId + "'" +
            ", mccMnc='" + mccMnc + "'" +
            ", smsCount='" + smsCount + "'" +
            ", price='" + price + "'" +
            ", messageId='" + messageId + "'" +
            ", from='" + from + "'" +
            ", to='" + to + "'" +
            ", text='" + text + "'" +
            ", sentAt='" + sentAt + "'" +
            ", error='" + error + "'" +
            ", status='" + status + "'" +
            '}';
    }
}