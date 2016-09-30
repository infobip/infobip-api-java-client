package infobip.api.model.sms.mt.send.binary;

import infobip.api.model.sms.mt.send.binary.BinaryContent;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 */
public class SMSBinaryRequest {
    private String operatorClientId;
    private String campaignId;
    private BinaryContent binary;
    private String from;
    private List<String> to = new ArrayList<String>();

    public SMSBinaryRequest() {
    }

    public String getOperatorClientId() {
        return this.operatorClientId;
    }

    public SMSBinaryRequest setOperatorClientId(String operatorClientId) {
        this.operatorClientId = operatorClientId;
        return this;
    }

    public String getCampaignId() {
        return this.campaignId;
    }

    public SMSBinaryRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    public BinaryContent getBinary() {
        return this.binary;
    }

    public SMSBinaryRequest setBinary(BinaryContent binary) {
        this.binary = binary;
        return this;
    }

    public String getFrom() {
        return this.from;
    }

    public SMSBinaryRequest setFrom(String from) {
        this.from = from;
        return this;
    }

    public List<String> getTo() {
        return this.to;
    }

    public SMSBinaryRequest setTo(List<String> to) {
        this.to = to;
        return this;
    }

    public SMSBinaryRequest addTo(String... to) {
        this.to.addAll(Arrays.asList(to));
        return this;
    }

    public SMSBinaryRequest removeTo(String... to) {
        this.to.removeAll(Arrays.asList(to));
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

        SMSBinaryRequest o = (SMSBinaryRequest)obj;
        if (this.operatorClientId == null) {
            if (o.operatorClientId != null){
                return false;
            }
        } else if (!this.operatorClientId.equals(o.operatorClientId)) {
            return false;
        }
        if (this.campaignId == null) {
            if (o.campaignId != null){
                return false;
            }
        } else if (!this.campaignId.equals(o.campaignId)) {
            return false;
        }
        if (this.binary == null) {
            if (o.binary != null){
                return false;
            }
        } else if (!this.binary.equals(o.binary)) {
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

        return true;
    }

    @Override
    public String toString() {
        return "SMSBinaryRequest{" +
            "operatorClientId='" + operatorClientId + "'" +
            ", campaignId='" + campaignId + "'" +
            ", binary='" + binary + "'" +
            ", from='" + from + "'" +
            ", to=" + (to == null?"null":Arrays.toString(to.toArray())) +
            '}';
    }
}