package infobip.api.model.sms.mt.send.binary;

import infobip.api.model.sms.mt.send.Message;

import java.util.Arrays;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class SMSAdvancedBinaryRequest {
    private String bulkId;
    private List<Message> messages;
    private String tracking;

    public SMSAdvancedBinaryRequest() {
    }


    public String getBulkId() {
        return this.bulkId;
    }

    public SMSAdvancedBinaryRequest setBulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }


    public List<Message> getMessages() {
        return this.messages;
    }

    public SMSAdvancedBinaryRequest setMessages(List<Message> messages) {
        this.messages = messages;
        return this;
    }

    public SMSAdvancedBinaryRequest addMessages(Message... messages) {
        this.messages.addAll(Arrays.asList(messages));
        return this;
    }

    public SMSAdvancedBinaryRequest removeMessages(Message... messages) {
        this.messages.removeAll(Arrays.asList(messages));
        return this;
    }


    public String getTracking() {
        return this.tracking;
    }

    public SMSAdvancedBinaryRequest setTracking(String tracking) {
        this.tracking = tracking;
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

        SMSAdvancedBinaryRequest o = (SMSAdvancedBinaryRequest) obj;
        if (this.bulkId == null) {
            if (o.bulkId != null) {
                return false;
            }
        } else if (!this.bulkId.equals(o.bulkId)) {
            return false;
        }
        if (this.messages == null) {
            if (o.messages != null) {
                return false;
            }
        } else if (!this.messages.equals(o.messages)) {
            return false;
        }
        if (this.tracking == null) {
            if (o.tracking != null) {
                return false;
            }
        } else if (!this.tracking.equals(o.tracking)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "SMSAdvancedBinaryRequest{" +
                "bulkId='" + bulkId + "'" +

                ", messages=" + (messages == null ? "null" : Arrays.toString(messages.toArray())) +

                ", tracking='" + tracking + "'" +
                '}';
    }
}