package infobip.api.model.sms.mt.send.textual;

import infobip.api.model.sms.mt.send.Message;

import java.util.Arrays;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class SMSMultiTextualRequest {
    private String bulkId;
    private List<Message> messages;

    public SMSMultiTextualRequest() {
    }


    public String getBulkId() {
        return this.bulkId;
    }

    public SMSMultiTextualRequest setBulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }


    public List<Message> getMessages() {
        return this.messages;
    }

    public SMSMultiTextualRequest setMessages(List<Message> messages) {
        this.messages = messages;
        return this;
    }

    public SMSMultiTextualRequest addMessages(Message... messages) {
        this.messages.addAll(Arrays.asList(messages));
        return this;
    }

    public SMSMultiTextualRequest removeMessages(Message... messages) {
        this.messages.removeAll(Arrays.asList(messages));
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

        SMSMultiTextualRequest o = (SMSMultiTextualRequest) obj;
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

        return true;
    }

    @Override
    public String toString() {
        return "SMSMultiTextualRequest{" +
                "bulkId='" + bulkId + "'" +

                ", messages=" + (messages == null ? "null" : Arrays.toString(messages.toArray())) +
                '}';
    }
}