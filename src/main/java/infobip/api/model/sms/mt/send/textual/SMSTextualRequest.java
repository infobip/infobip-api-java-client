package infobip.api.model.sms.mt.send.textual;

import java.util.ArrayList;
import java.util.List;
import infobip.api.model.sms.mt.send.RegionalOptions;

/**
 * This is a generated class and is not intended for modification!
 */
public class SMSTextualRequest {
    private String from;
    private List<String> to = new ArrayList<>();
    private String text;
    private String campaignId;
    private String operatorClientId;
    private String transliteration;
    private RegionalOptions regional;

    public SMSTextualRequest() {
    }

    public String getFrom() {
        return this.from;
    }

    public SMSTextualRequest setFrom(String from) {
        this.from = from;
        return this;
    }

    public List<String> getTo() {
        return this.to;
    }

    public SMSTextualRequest setTo(List<String> to) {
        this.to = to;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public SMSTextualRequest setText(String text) {
        this.text = text;
        return this;
    }

    public String getCampaignId() {
        return this.campaignId;
    }

    public SMSTextualRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    public String getOperatorClientId() {
        return this.operatorClientId;
    }

    public SMSTextualRequest setOperatorClientId(String operatorClientId) {
        this.operatorClientId = operatorClientId;
        return this;
    }

    public String getTransliteration() {
        return this.transliteration;
    }

    public SMSTextualRequest setTransliteration(String transliteration) {
        this.transliteration = transliteration;
        return this;
    }

    public RegionalOptions getRegional() {
        return this.regional;
    }

    public SMSTextualRequest setRegional(RegionalOptions regional) {
        this.regional = regional;
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

        SMSTextualRequest o = (SMSTextualRequest)obj;
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
        if (this.campaignId == null) {
            if (o.campaignId != null){
                return false;
            }
        } else if (!this.campaignId.equals(o.campaignId)) {
            return false;
        }
        if (this.operatorClientId == null) {
            if (o.operatorClientId != null){
                return false;
            }
        } else if (!this.operatorClientId.equals(o.operatorClientId)) {
            return false;
        }
        if (this.transliteration == null) {
            if (o.transliteration != null){
                return false;
            }
        } else if (!this.transliteration.equals(o.transliteration)) {
            return false;
        }
        if (this.regional == null) {
            if (o.regional != null){
                return false;
            }
        } else if (!this.regional.equals(o.regional)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "SMSTextualRequest{" +
            "from='" + from + "'" +
            ", to='" + to + "'" +
            ", text='" + text + "'" +
            ", campaignId='" + campaignId + "'" +
            ", operatorClientId='" + operatorClientId + "'" +
            ", transliteration='" + transliteration + "'" +
            ", regional='" + regional + "'" +
            '}';
    }
}