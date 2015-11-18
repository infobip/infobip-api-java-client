package infobip.api.model.sms.mt.reports;

import java.util.Date;
import infobip.api.model.Error;
import infobip.api.model.Price;
import infobip.api.model.Status;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class SMSReport {
    private Date doneAt;
    private Integer smsCount;
    private String messageId;
    private Date sentAt;
    private Error error;
    private String bulkId;
    private String mccMnc;
    private Price price;
    private String callbackData;
    private String from;
    private String to;
    private String text;
    private Status status;

    public SMSReport() {
    }

    public Date getDoneAt() {
        return this.doneAt;
    }

    public SMSReport setDoneAt(Date doneAt) {
        this.doneAt = doneAt;
        return this;
    }

    public Integer getSmsCount() {
        return this.smsCount;
    }

    public SMSReport setSmsCount(Integer smsCount) {
        this.smsCount = smsCount;
        return this;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public SMSReport setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public Date getSentAt() {
        return this.sentAt;
    }

    public SMSReport setSentAt(Date sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    public Error getError() {
        return this.error;
    }

    public SMSReport setError(Error error) {
        this.error = error;
        return this;
    }

    public String getBulkId() {
        return this.bulkId;
    }

    public SMSReport setBulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    public String getMccMnc() {
        return this.mccMnc;
    }

    public SMSReport setMccMnc(String mccMnc) {
        this.mccMnc = mccMnc;
        return this;
    }

    public Price getPrice() {
        return this.price;
    }

    public SMSReport setPrice(Price price) {
        this.price = price;
        return this;
    }

    public String getCallbackData() {
        return this.callbackData;
    }

    public SMSReport setCallbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    public String getFrom() {
        return this.from;
    }

    public SMSReport setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return this.to;
    }

    public SMSReport setTo(String to) {
        this.to = to;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public SMSReport setText(String text) {
        this.text = text;
        return this;
    }

    public Status getStatus() {
        return this.status;
    }

    public SMSReport setStatus(Status status) {
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

        SMSReport o = (SMSReport)obj;
        if (this.doneAt == null) {
            if (o.doneAt != null){
                return false;
            }
        } else if (!this.doneAt.equals(o.doneAt)) {
            return false;
        }
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
        if (this.price == null) {
            if (o.price != null){
                return false;
            }
        } else if (!this.price.equals(o.price)) {
            return false;
        }
        if (this.callbackData == null) {
            if (o.callbackData != null){
                return false;
            }
        } else if (!this.callbackData.equals(o.callbackData)) {
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
        return "SMSReport{" +
            "doneAt='" + doneAt + "'" +
            ", smsCount='" + smsCount + "'" +
            ", messageId='" + messageId + "'" +
            ", sentAt='" + sentAt + "'" +
            ", error='" + error + "'" +
            ", bulkId='" + bulkId + "'" +
            ", mccMnc='" + mccMnc + "'" +
            ", price='" + price + "'" +
            ", callbackData='" + callbackData + "'" +
            ", from='" + from + "'" +
            ", to='" + to + "'" +
            ", text='" + text + "'" +
            ", status='" + status + "'" +
            '}';
    }
}