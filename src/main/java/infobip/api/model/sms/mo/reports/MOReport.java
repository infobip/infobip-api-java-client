package infobip.api.model.sms.mo.reports;

import java.util.Date;
import infobip.api.model.Price;

/**
 * This is a generated class and is not intended for modification!
 */
public class MOReport {
    private String messageId;
    private String from;
    private String to;
    private String text;
    private String cleanText;
    private String keyword;
    private Date receivedAt;
    private int smsCount;
    private Price price;
    private String callbackData;

    public MOReport() {
    }

    public String getMessageId() {
        return this.messageId;
    }

    public MOReport setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getFrom() {
        return this.from;
    }

    public MOReport setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return this.to;
    }

    public MOReport setTo(String to) {
        this.to = to;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public MOReport setText(String text) {
        this.text = text;
        return this;
    }

    public String getCleanText() {
        return this.cleanText;
    }

    public MOReport setCleanText(String cleanText) {
        this.cleanText = cleanText;
        return this;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public MOReport setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public Date getReceivedAt() {
        return this.receivedAt;
    }

    public MOReport setReceivedAt(Date receivedAt) {
        this.receivedAt = receivedAt;
        return this;
    }

    public int getSmsCount() {
        return this.smsCount;
    }

    public MOReport setSmsCount(int smsCount) {
        this.smsCount = smsCount;
        return this;
    }

    public Price getPrice() {
        return this.price;
    }

    public MOReport setPrice(Price price) {
        this.price = price;
        return this;
    }

    public String getCallbackData() {
        return this.callbackData;
    }

    public MOReport setCallbackData(String callbackData) {
        this.callbackData = callbackData;
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

        MOReport o = (MOReport)obj;
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
        if (this.cleanText == null) {
            if (o.cleanText != null){
                return false;
            }
        } else if (!this.cleanText.equals(o.cleanText)) {
            return false;
        }
        if (this.keyword == null) {
            if (o.keyword != null){
                return false;
            }
        } else if (!this.keyword.equals(o.keyword)) {
            return false;
        }
        if (this.receivedAt == null) {
            if (o.receivedAt != null){
                return false;
            }
        } else if (!this.receivedAt.equals(o.receivedAt)) {
            return false;
        }
        if (this.smsCount != o.smsCount) {
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

        return true;
    }

    @Override
    public String toString() {
        return "MOReport{" +
            "messageId='" + messageId + "'" +
            ", from='" + from + "'" +
            ", to='" + to + "'" +
            ", text='" + text + "'" +
            ", cleanText='" + cleanText + "'" +
            ", keyword='" + keyword + "'" +
            ", receivedAt='" + receivedAt + "'" +
            ", smsCount=" + smsCount +
            ", price='" + price + "'" +
            ", callbackData='" + callbackData + "'" +
            '}';
    }
}