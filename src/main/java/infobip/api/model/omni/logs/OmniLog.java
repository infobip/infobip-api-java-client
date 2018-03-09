package infobip.api.model.omni.logs;

import java.util.Date;
import infobip.api.model.omni.Price;
import infobip.api.model.omni.Status;
import infobip.api.model.omni.OmniChannel;

/**
 * This is a generated class and is not intended for modification!
 */
public class OmniLog {
    private String bulkId;
    private String messageId;
    private String to;
    private String from;
    private String text;
    private Date sentAt;
    private Date doneAt;
    private Integer messageCount;
    private String mccMnc;
    private Price price;
    private Status status;
    private OmniChannel channel;

    public OmniLog() {
    }

    public String getBulkId() {
        return this.bulkId;
    }

    public OmniLog setBulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public OmniLog setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getTo() {
        return this.to;
    }

    public OmniLog setTo(String to) {
        this.to = to;
        return this;
    }

    public String getFrom() {
        return this.from;
    }

    public OmniLog setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public OmniLog setText(String text) {
        this.text = text;
        return this;
    }

    public Date getSentAt() {
        return this.sentAt;
    }

    public OmniLog setSentAt(Date sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    public Date getDoneAt() {
        return this.doneAt;
    }

    public OmniLog setDoneAt(Date doneAt) {
        this.doneAt = doneAt;
        return this;
    }

    public Integer getMessageCount() {
        return this.messageCount;
    }

    public OmniLog setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
        return this;
    }

    public String getMccMnc() {
        return this.mccMnc;
    }

    public OmniLog setMccMnc(String mccMnc) {
        this.mccMnc = mccMnc;
        return this;
    }

    public Price getPrice() {
        return this.price;
    }

    public OmniLog setPrice(Price price) {
        this.price = price;
        return this;
    }

    public Status getStatus() {
        return this.status;
    }

    public OmniLog setStatus(Status status) {
        this.status = status;
        return this;
    }

    public OmniChannel getChannel() {
        return this.channel;
    }

    public OmniLog setChannel(OmniChannel channel) {
        this.channel = channel;
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

        OmniLog o = (OmniLog)obj;
        if (this.bulkId == null) {
            if (o.bulkId != null){
                return false;
            }
        } else if (!this.bulkId.equals(o.bulkId)) {
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
        if (this.from == null) {
            if (o.from != null){
                return false;
            }
        } else if (!this.from.equals(o.from)) {
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
        if (this.doneAt == null) {
            if (o.doneAt != null){
                return false;
            }
        } else if (!this.doneAt.equals(o.doneAt)) {
            return false;
        }
        if (this.messageCount == null) {
            if (o.messageCount != null){
                return false;
            }
        } else if (!this.messageCount.equals(o.messageCount)) {
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
        if (this.status == null) {
            if (o.status != null){
                return false;
            }
        } else if (!this.status.equals(o.status)) {
            return false;
        }
        if (this.channel == null) {
            if (o.channel != null){
                return false;
            }
        } else if (!this.channel.equals(o.channel)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "OmniLog{" +
            "bulkId='" + bulkId + "'" +
            ", messageId='" + messageId + "'" +
            ", to='" + to + "'" +
            ", from='" + from + "'" +
            ", text='" + text + "'" +
            ", sentAt='" + sentAt + "'" +
            ", doneAt='" + doneAt + "'" +
            ", messageCount='" + messageCount + "'" +
            ", mccMnc='" + mccMnc + "'" +
            ", price='" + price + "'" +
            ", status='" + status + "'" +
            ", channel='" + channel + "'" +
            '}';
    }
}