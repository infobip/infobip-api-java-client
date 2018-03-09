package infobip.api.model.sms.mt.send.textual;

import infobip.api.model.sms.mt.send.Message;
import java.util.List;
import java.util.ArrayList;

/**
 * This is a generated class and is not intended for modification!
 */
public class SMSMultiTextualRequest {
    private List<Message> messages = new ArrayList<>();
    private String bulkId;

    public SMSMultiTextualRequest() {
    }

    public List<Message> getMessages() {
        return this.messages;
    }

    public SMSMultiTextualRequest setMessages(List<Message> messages) {
        this.messages = messages;
        return this;
    }

    public String getBulkId() {
        return this.bulkId;
    }

    public SMSMultiTextualRequest setBulkId(String bulkId) {
        this.bulkId = bulkId;
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

        SMSMultiTextualRequest o = (SMSMultiTextualRequest)obj;
        if (this.messages == null) {
            if (o.messages != null){
                return false;
            }
        } else if (!this.messages.equals(o.messages)) {
            return false;
        }
        if (this.bulkId == null) {
            if (o.bulkId != null){
                return false;
            }
        } else if (!this.bulkId.equals(o.bulkId)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "SMSMultiTextualRequest{" +
            "messages='" + messages + "'" +
            ", bulkId='" + bulkId + "'" +
            '}';
    }
}