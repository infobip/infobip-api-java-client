package infobip.api.model.sms.mo.logs;

import java.util.Date;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class MOLog {
    private String cleanText;
    private Integer smsCount;
    private String messageId;
    private String from;
    private String to;
    private String text;
    private String keyword;
    private Date receivedAt;

    public MOLog() {
    }

    public String getCleanText() {
        return this.cleanText;
    }

    public MOLog setCleanText(String cleanText) {
        this.cleanText = cleanText;
        return this;
    }

    public Integer getSmsCount() {
        return this.smsCount;
    }

    public MOLog setSmsCount(Integer smsCount) {
        this.smsCount = smsCount;
        return this;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public MOLog setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public String getFrom() {
        return this.from;
    }

    public MOLog setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return this.to;
    }

    public MOLog setTo(String to) {
        this.to = to;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public MOLog setText(String text) {
        this.text = text;
        return this;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public MOLog setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    public Date getReceivedAt() {
        return this.receivedAt;
    }

    public MOLog setReceivedAt(Date receivedAt) {
        this.receivedAt = receivedAt;
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

        MOLog o = (MOLog)obj;
        if (this.cleanText == null) {
            if (o.cleanText != null){
                return false;
            }
        } else if (!this.cleanText.equals(o.cleanText)) {
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

        return true;
    }

    @Override
    public String toString() {
        return "MOLog{" +
            "cleanText='" + cleanText + "'" +
            ", smsCount='" + smsCount + "'" +
            ", messageId='" + messageId + "'" +
            ", from='" + from + "'" +
            ", to='" + to + "'" +
            ", text='" + text + "'" +
            ", keyword='" + keyword + "'" +
            ", receivedAt='" + receivedAt + "'" +
            '}';
    }
}