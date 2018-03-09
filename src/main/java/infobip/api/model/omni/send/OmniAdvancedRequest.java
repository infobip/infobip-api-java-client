package infobip.api.model.omni.send;

import infobip.api.model.omni.Destination;
import java.util.List;
import java.util.ArrayList;
import infobip.api.model.omni.send.SmsData;
import infobip.api.model.omni.send.ParsecoData;
import infobip.api.model.omni.send.ViberData;
import infobip.api.model.omni.send.VoiceData;
import infobip.api.model.omni.send.EmailData;
import infobip.api.model.omni.send.PushData;
import infobip.api.model.omni.send.FacebookData;
import infobip.api.model.omni.send.LineData;
import infobip.api.model.omni.send.VKontakteData;
import java.util.Date;

/**
 * This is a generated class and is not intended for modification!
 */
public class OmniAdvancedRequest {
    private List<Destination> destinations = new ArrayList<>();
    private String bulkId;
    private String scenarioKey;
    private SmsData sms;
    private ParsecoData parseco;
    private ViberData viber;
    private VoiceData voice;
    private EmailData email;
    private PushData push;
    private FacebookData facebook;
    private LineData line;
    private VKontakteData vKontakte;
    private Boolean notify;
    private Boolean intermediateReport;
    private String notifyUrl;
    private String notifyContentType;
    private String callbackData;
    private Date sendAt;

    public OmniAdvancedRequest() {
    }

    public List<Destination> getDestinations() {
        return this.destinations;
    }

    public OmniAdvancedRequest setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
        return this;
    }

    public String getBulkId() {
        return this.bulkId;
    }

    public OmniAdvancedRequest setBulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    public String getScenarioKey() {
        return this.scenarioKey;
    }

    public OmniAdvancedRequest setScenarioKey(String scenarioKey) {
        this.scenarioKey = scenarioKey;
        return this;
    }

    public SmsData getSms() {
        return this.sms;
    }

    public OmniAdvancedRequest setSms(SmsData sms) {
        this.sms = sms;
        return this;
    }

    public ParsecoData getParseco() {
        return this.parseco;
    }

    public OmniAdvancedRequest setParseco(ParsecoData parseco) {
        this.parseco = parseco;
        return this;
    }

    public ViberData getViber() {
        return this.viber;
    }

    public OmniAdvancedRequest setViber(ViberData viber) {
        this.viber = viber;
        return this;
    }

    public VoiceData getVoice() {
        return this.voice;
    }

    public OmniAdvancedRequest setVoice(VoiceData voice) {
        this.voice = voice;
        return this;
    }

    public EmailData getEmail() {
        return this.email;
    }

    public OmniAdvancedRequest setEmail(EmailData email) {
        this.email = email;
        return this;
    }

    public PushData getPush() {
        return this.push;
    }

    public OmniAdvancedRequest setPush(PushData push) {
        this.push = push;
        return this;
    }

    public FacebookData getFacebook() {
        return this.facebook;
    }

    public OmniAdvancedRequest setFacebook(FacebookData facebook) {
        this.facebook = facebook;
        return this;
    }

    public LineData getLine() {
        return this.line;
    }

    public OmniAdvancedRequest setLine(LineData line) {
        this.line = line;
        return this;
    }

    public VKontakteData getVKontakte() {
        return this.vKontakte;
    }

    public OmniAdvancedRequest setVKontakte(VKontakteData vKontakte) {
        this.vKontakte = vKontakte;
        return this;
    }

    public Boolean getNotify() {
        return this.notify;
    }

    public OmniAdvancedRequest setNotify(Boolean notify) {
        this.notify = notify;
        return this;
    }

    public Boolean getIntermediateReport() {
        return this.intermediateReport;
    }

    public OmniAdvancedRequest setIntermediateReport(Boolean intermediateReport) {
        this.intermediateReport = intermediateReport;
        return this;
    }

    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public OmniAdvancedRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    public String getNotifyContentType() {
        return this.notifyContentType;
    }

    public OmniAdvancedRequest setNotifyContentType(String notifyContentType) {
        this.notifyContentType = notifyContentType;
        return this;
    }

    public String getCallbackData() {
        return this.callbackData;
    }

    public OmniAdvancedRequest setCallbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    public Date getSendAt() {
        return this.sendAt;
    }

    public OmniAdvancedRequest setSendAt(Date sendAt) {
        this.sendAt = sendAt;
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

        OmniAdvancedRequest o = (OmniAdvancedRequest)obj;
        if (this.destinations == null) {
            if (o.destinations != null){
                return false;
            }
        } else if (!this.destinations.equals(o.destinations)) {
            return false;
        }
        if (this.bulkId == null) {
            if (o.bulkId != null){
                return false;
            }
        } else if (!this.bulkId.equals(o.bulkId)) {
            return false;
        }
        if (this.scenarioKey == null) {
            if (o.scenarioKey != null){
                return false;
            }
        } else if (!this.scenarioKey.equals(o.scenarioKey)) {
            return false;
        }
        if (this.sms == null) {
            if (o.sms != null){
                return false;
            }
        } else if (!this.sms.equals(o.sms)) {
            return false;
        }
        if (this.parseco == null) {
            if (o.parseco != null){
                return false;
            }
        } else if (!this.parseco.equals(o.parseco)) {
            return false;
        }
        if (this.viber == null) {
            if (o.viber != null){
                return false;
            }
        } else if (!this.viber.equals(o.viber)) {
            return false;
        }
        if (this.voice == null) {
            if (o.voice != null){
                return false;
            }
        } else if (!this.voice.equals(o.voice)) {
            return false;
        }
        if (this.email == null) {
            if (o.email != null){
                return false;
            }
        } else if (!this.email.equals(o.email)) {
            return false;
        }
        if (this.push == null) {
            if (o.push != null){
                return false;
            }
        } else if (!this.push.equals(o.push)) {
            return false;
        }
        if (this.facebook == null) {
            if (o.facebook != null){
                return false;
            }
        } else if (!this.facebook.equals(o.facebook)) {
            return false;
        }
        if (this.line == null) {
            if (o.line != null){
                return false;
            }
        } else if (!this.line.equals(o.line)) {
            return false;
        }
        if (this.vKontakte == null) {
            if (o.vKontakte != null){
                return false;
            }
        } else if (!this.vKontakte.equals(o.vKontakte)) {
            return false;
        }
        if (this.notify == null) {
            if (o.notify != null){
                return false;
            }
        } else if (!this.notify.equals(o.notify)) {
            return false;
        }
        if (this.intermediateReport == null) {
            if (o.intermediateReport != null){
                return false;
            }
        } else if (!this.intermediateReport.equals(o.intermediateReport)) {
            return false;
        }
        if (this.notifyUrl == null) {
            if (o.notifyUrl != null){
                return false;
            }
        } else if (!this.notifyUrl.equals(o.notifyUrl)) {
            return false;
        }
        if (this.notifyContentType == null) {
            if (o.notifyContentType != null){
                return false;
            }
        } else if (!this.notifyContentType.equals(o.notifyContentType)) {
            return false;
        }
        if (this.callbackData == null) {
            if (o.callbackData != null){
                return false;
            }
        } else if (!this.callbackData.equals(o.callbackData)) {
            return false;
        }
        if (this.sendAt == null) {
            if (o.sendAt != null){
                return false;
            }
        } else if (!this.sendAt.equals(o.sendAt)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "OmniAdvancedRequest{" +
            "destinations='" + destinations + "'" +
            ", bulkId='" + bulkId + "'" +
            ", scenarioKey='" + scenarioKey + "'" +
            ", sms='" + sms + "'" +
            ", parseco='" + parseco + "'" +
            ", viber='" + viber + "'" +
            ", voice='" + voice + "'" +
            ", email='" + email + "'" +
            ", push='" + push + "'" +
            ", facebook='" + facebook + "'" +
            ", line='" + line + "'" +
            ", vKontakte='" + vKontakte + "'" +
            ", notify='" + notify + "'" +
            ", intermediateReport='" + intermediateReport + "'" +
            ", notifyUrl='" + notifyUrl + "'" +
            ", notifyContentType='" + notifyContentType + "'" +
            ", callbackData='" + callbackData + "'" +
            ", sendAt='" + sendAt + "'" +
            '}';
    }
}