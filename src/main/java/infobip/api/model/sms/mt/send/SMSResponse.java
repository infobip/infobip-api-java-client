package infobip.api.model.sms.mt.send;

import infobip.api.model.sms.mt.send.SMSResponseDetails;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 */
public class SMSResponse {
    private String bulkId;
    private String trackingProcessKey;
    private List<SMSResponseDetails> messages = new ArrayList<SMSResponseDetails>();

    public SMSResponse() {
    }

    public String getBulkId() {
        return this.bulkId;
    }

    public SMSResponse setBulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    public String getTrackingProcessKey() {
        return this.trackingProcessKey;
    }

    public SMSResponse setTrackingProcessKey(String trackingProcessKey) {
        this.trackingProcessKey = trackingProcessKey;
        return this;
    }

    public List<SMSResponseDetails> getMessages() {
        return this.messages;
    }

    public SMSResponse setMessages(List<SMSResponseDetails> messages) {
        this.messages = messages;
        return this;
    }

    public SMSResponse addMessages(SMSResponseDetails... messages) {
        this.messages.addAll(Arrays.asList(messages));
        return this;
    }

    public SMSResponse removeMessages(SMSResponseDetails... messages) {
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

        SMSResponse o = (SMSResponse)obj;
        if (this.bulkId == null) {
            if (o.bulkId != null){
                return false;
            }
        } else if (!this.bulkId.equals(o.bulkId)) {
            return false;
        }
        if (this.trackingProcessKey == null) {
            if (o.trackingProcessKey != null){
                return false;
            }
        } else if (!this.trackingProcessKey.equals(o.trackingProcessKey)) {
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
        return "SMSResponse{" +
            "bulkId='" + bulkId + "'" +
            ", trackingProcessKey='" + trackingProcessKey + "'" +
            ", messages=" + (messages == null?"null":Arrays.toString(messages.toArray())) +
            '}';
    }
}