package infobip.api.model.sms.mt.send.binary;

import infobip.api.model.sms.mt.send.Tracking;
import infobip.api.model.sms.mt.send.Message;
import java.util.List;
import java.util.ArrayList;

/**
 * This is a generated class and is not intended for modification!
 */
public class SMSAdvancedBinaryRequest {
    private Tracking tracking;
    private List<Message> messages = new ArrayList<>();
    private String bulkId;

    public SMSAdvancedBinaryRequest() {
    }

    public Tracking getTracking() {
        return this.tracking;
    }

    public SMSAdvancedBinaryRequest setTracking(Tracking tracking) {
        this.tracking = tracking;
        return this;
    }

    public List<Message> getMessages() {
        return this.messages;
    }

    public SMSAdvancedBinaryRequest setMessages(List<Message> messages) {
        this.messages = messages;
        return this;
    }

    public String getBulkId() {
        return this.bulkId;
    }

    public SMSAdvancedBinaryRequest setBulkId(String bulkId) {
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

        SMSAdvancedBinaryRequest o = (SMSAdvancedBinaryRequest)obj;
        if (this.tracking == null) {
            if (o.tracking != null){
                return false;
            }
        } else if (!this.tracking.equals(o.tracking)) {
            return false;
        }
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
        return "SMSAdvancedBinaryRequest{" +
            "tracking='" + tracking + "'" +
            ", messages='" + messages + "'" +
            ", bulkId='" + bulkId + "'" +
            '}';
    }
}