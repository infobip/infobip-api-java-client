package infobip.api.model.sms.mt.send.binary;

import infobip.api.model.sms.mt.send.Message;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class SMSMultiBinaryRequest {
    private String bulkId;
    private ArrayList<Message> messages = new ArrayList<Message>();

    public SMSMultiBinaryRequest() {
    }


    public String getBulkId() {
        return this.bulkId;
    }

    public SMSMultiBinaryRequest setBulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }


    public ArrayList<Message> getMessages() {
        return this.messages;
    }

    public SMSMultiBinaryRequest setMessages(ArrayList<Message> messages) {
        this.messages = messages;
        return this;
    }

    public SMSMultiBinaryRequest addMessages(Message... messages) {
        this.messages.addAll(Arrays.asList(messages));
        return this;
    }

    public SMSMultiBinaryRequest removeMessages(Message... messages) {
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

        SMSMultiBinaryRequest o = (SMSMultiBinaryRequest)obj;
        if (this.bulkId == null) {
            if (o.bulkId != null){
                return false;
            }
        } else if (!this.bulkId.equals(o.bulkId)) {
            return false;
        }
        if (this.messages == null) {
            if (o.messages != null){
                return false;
            }
        } else if (!this.messages.equals(o.messages)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "SMSMultiBinaryRequest{" +
            "bulkId='" + bulkId + "'" +

            ", messages=" + (messages == null?"null":Arrays.toString(messages.toArray())) +
            '}';
    }
}