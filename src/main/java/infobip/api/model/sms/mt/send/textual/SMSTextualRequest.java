package infobip.api.model.sms.mt.send.textual;

import java.util.Arrays;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class SMSTextualRequest {
    private String campaignId;
    private String from;
    private List<String> to;
    private String text;
    private String transliteration;

    public SMSTextualRequest() {
    }


    public String getCampaignId() {
        return this.campaignId;
    }

    public SMSTextualRequest setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
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

    public SMSTextualRequest addTo(String... to) {
        this.to.addAll(Arrays.asList(to));
        return this;
    }

    public SMSTextualRequest removeTo(String... to) {
        this.to.removeAll(Arrays.asList(to));
        return this;
    }


    public String getText() {
        return this.text;
    }

    public SMSTextualRequest setText(String text) {
        this.text = text;
        return this;
    }


    public String getTransliteration() {
        return this.transliteration;
    }

    public SMSTextualRequest setTransliteration(String transliteration) {
        this.transliteration = transliteration;
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

        SMSTextualRequest o = (SMSTextualRequest) obj;
        if (this.campaignId == null) {
            if (o.campaignId != null) {
                return false;
            }
        } else if (!this.campaignId.equals(o.campaignId)) {
            return false;
        }
        if (this.from == null) {
            if (o.from != null) {
                return false;
            }
        } else if (!this.from.equals(o.from)) {
            return false;
        }
        if (this.to == null) {
            if (o.to != null) {
                return false;
            }
        } else if (!this.to.equals(o.to)) {
            return false;
        }
        if (this.text == null) {
            if (o.text != null) {
                return false;
            }
        } else if (!this.text.equals(o.text)) {
            return false;
        }
        if (this.transliteration == null) {
            if (o.transliteration != null) {
                return false;
            }
        } else if (!this.transliteration.equals(o.transliteration)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "SMSTextualRequest{" +
                "campaignId='" + campaignId + "'" +

                ", from='" + from + "'" +

                ", to=" + (to == null ? "null" : Arrays.toString(to.toArray())) +

                ", text='" + text + "'" +

                ", transliteration='" + transliteration + "'" +
                '}';
    }
}