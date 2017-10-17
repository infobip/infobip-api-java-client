package infobip.api.model.sms.mt.send;

import infobip.api.model.Destination;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import infobip.api.model.sms.mt.send.Language;
import infobip.api.model.sms.mt.send.DeliveryTimeWindow;
import infobip.api.model.sms.mt.send.binary.BinaryContent;
import java.util.Date;

/**
 * This is a generated class and is not intended for modification!
 */
public class Message {
    private String campaignId;
    private List<Destination> destinations = new ArrayList<Destination>();
    private Language language;
    private DeliveryTimeWindow deliveryTimeWindow;
    private Boolean notify;
    private String notifyContentType;
    private Long validityPeriod;
    private String operatorClientId;
    private BinaryContent binary;
    private String callbackData;
    private String notifyUrl;
    private String from;
    private List<String> to = new ArrayList<String>();
    private String text;
    private Date sendAt;
    private String transliteration;
    private Boolean flash;
    private Boolean intermediateReport;

    public Message() {
    }

    public String getCampaignId() {
        return this.campaignId;
    }

    public Message setCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    public List<Destination> getDestinations() {
        return this.destinations;
    }

    public Message setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
        return this;
    }

    public Message addDestinations(Destination... destinations) {
        this.destinations.addAll(Arrays.asList(destinations));
        return this;
    }

    public Message removeDestinations(Destination... destinations) {
        this.destinations.removeAll(Arrays.asList(destinations));
        return this;
    }

    public Language getLanguage() {
        return this.language;
    }

    public Message setLanguage(Language language) {
        this.language = language;
        return this;
    }

    public DeliveryTimeWindow getDeliveryTimeWindow() {
        return this.deliveryTimeWindow;
    }

    public Message setDeliveryTimeWindow(DeliveryTimeWindow deliveryTimeWindow) {
        this.deliveryTimeWindow = deliveryTimeWindow;
        return this;
    }

    public Boolean getNotify() {
        return this.notify;
    }

    public Message setNotify(Boolean notify) {
        this.notify = notify;
        return this;
    }

    public String getNotifyContentType() {
        return this.notifyContentType;
    }

    public Message setNotifyContentType(String notifyContentType) {
        this.notifyContentType = notifyContentType;
        return this;
    }

    public Long getValidityPeriod() {
        return this.validityPeriod;
    }

    public Message setValidityPeriod(Long validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    public String getOperatorClientId() {
        return this.operatorClientId;
    }

    public Message setOperatorClientId(String operatorClientId) {
        this.operatorClientId = operatorClientId;
        return this;
    }

    public BinaryContent getBinary() {
        return this.binary;
    }

    public Message setBinary(BinaryContent binary) {
        this.binary = binary;
        return this;
    }

    public String getCallbackData() {
        return this.callbackData;
    }

    public Message setCallbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public Message setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    public String getFrom() {
        return this.from;
    }

    public Message setFrom(String from) {
        this.from = from;
        return this;
    }

    public List<String> getTo() {
        return this.to;
    }

    public Message setTo(List<String> to) {
        this.to = to;
        return this;
    }

    public Message addTo(String... to) {
        this.to.addAll(Arrays.asList(to));
        return this;
    }

    public Message removeTo(String... to) {
        this.to.removeAll(Arrays.asList(to));
        return this;
    }

    public String getText() {
        return this.text;
    }

    public Message setText(String text) {
        this.text = text;
        return this;
    }

    public Date getSendAt() {
        return this.sendAt;
    }

    public Message setSendAt(Date sendAt) {
        this.sendAt = sendAt;
        return this;
    }

    public String getTransliteration() {
        return this.transliteration;
    }

    public Message setTransliteration(String transliteration) {
        this.transliteration = transliteration;
        return this;
    }

    public Boolean getFlash() {
        return this.flash;
    }

    public Message setFlash(Boolean flash) {
        this.flash = flash;
        return this;
    }

    public Boolean getIntermediateReport() {
        return this.intermediateReport;
    }

    public Message setIntermediateReport(Boolean intermediateReport) {
        this.intermediateReport = intermediateReport;
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

        Message o = (Message)obj;
        if (this.campaignId == null) {
            if (o.campaignId != null){
                return false;
            }
        } else if (!this.campaignId.equals(o.campaignId)) {
            return false;
        }
        if (this.destinations == null) {
            if (o.destinations != null){
                return false;
            }
        } else if (!this.destinations.equals(o.destinations)) {
            return false;
        }
        if (this.language == null) {
            if (o.language != null){
                return false;
            }
        } else if (!this.language.equals(o.language)) {
            return false;
        }
        if (this.deliveryTimeWindow == null) {
            if (o.deliveryTimeWindow != null){
                return false;
            }
        } else if (!this.deliveryTimeWindow.equals(o.deliveryTimeWindow)) {
            return false;
        }
        if (this.notify == null) {
            if (o.notify != null){
                return false;
            }
        } else if (!this.notify.equals(o.notify)) {
            return false;
        }
        if (this.notifyContentType == null) {
            if (o.notifyContentType != null){
                return false;
            }
        } else if (!this.notifyContentType.equals(o.notifyContentType)) {
            return false;
        }
        if (this.validityPeriod == null) {
            if (o.validityPeriod != null){
                return false;
            }
        } else if (!this.validityPeriod.equals(o.validityPeriod)) {
            return false;
        }
        if (this.operatorClientId == null) {
            if (o.operatorClientId != null){
                return false;
            }
        } else if (!this.operatorClientId.equals(o.operatorClientId)) {
            return false;
        }
        if (this.binary == null) {
            if (o.binary != null){
                return false;
            }
        } else if (!this.binary.equals(o.binary)) {
            return false;
        }
        if (this.callbackData == null) {
            if (o.callbackData != null){
                return false;
            }
        } else if (!this.callbackData.equals(o.callbackData)) {
            return false;
        }
        if (this.notifyUrl == null) {
            if (o.notifyUrl != null){
                return false;
            }
        } else if (!this.notifyUrl.equals(o.notifyUrl)) {
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
        if (this.text == null) {
            if (o.text != null){
                return false;
            }
        } else if (!this.text.equals(o.text)) {
            return false;
        }
        if (this.sendAt == null) {
            if (o.sendAt != null){
                return false;
            }
        } else if (!this.sendAt.equals(o.sendAt)) {
            return false;
        }
        if (this.transliteration == null) {
            if (o.transliteration != null){
                return false;
            }
        } else if (!this.transliteration.equals(o.transliteration)) {
            return false;
        }
        if (this.flash == null) {
            if (o.flash != null){
                return false;
            }
        } else if (!this.flash.equals(o.flash)) {
            return false;
        }
        if (this.intermediateReport == null) {
            if (o.intermediateReport != null){
                return false;
            }
        } else if (!this.intermediateReport.equals(o.intermediateReport)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Message{" +
            "campaignId='" + campaignId + "'" +
            ", destinations=" + (destinations == null?"null":Arrays.toString(destinations.toArray())) +
            ", language='" + language + "'" +
            ", deliveryTimeWindow='" + deliveryTimeWindow + "'" +
            ", notify='" + notify + "'" +
            ", notifyContentType='" + notifyContentType + "'" +
            ", validityPeriod='" + validityPeriod + "'" +
            ", operatorClientId='" + operatorClientId + "'" +
            ", binary='" + binary + "'" +
            ", callbackData='" + callbackData + "'" +
            ", notifyUrl='" + notifyUrl + "'" +
            ", from='" + from + "'" +
            ", to=" + (to == null?"null":Arrays.toString(to.toArray())) +
            ", text='" + text + "'" +
            ", sendAt='" + sendAt + "'" +
            ", transliteration='" + transliteration + "'" +
            ", flash='" + flash + "'" +
            ", intermediateReport='" + intermediateReport + "'" +
            '}';
    }
}