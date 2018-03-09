package infobip.api.model.omni.send;

import infobip.api.model.omni.send.OmniResponseDetails;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 */
public class OmniResponse {
    private String bulkId;
    private List<OmniResponseDetails> messages = new ArrayList<>();

    public OmniResponse() {
    }

    public String getBulkId() {
        return this.bulkId;
    }

    public OmniResponse setBulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    public List<OmniResponseDetails> getMessages() {
        return this.messages;
    }

    public OmniResponse setMessages(List<OmniResponseDetails> messages) {
        this.messages = messages;
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

        OmniResponse o = (OmniResponse)obj;
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
        return "OmniResponse{" +
            "bulkId='" + bulkId + "'" +
            ", messages='" + messages + "'" +
            '}';
    }
}