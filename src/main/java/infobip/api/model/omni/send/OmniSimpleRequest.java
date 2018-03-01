package infobip.api.model.omni.send;

import infobip.api.model.omni.Destination;
import java.util.List;
import java.util.ArrayList;

/**
 * This is a generated class and is not intended for modification!
 */
public class OmniSimpleRequest {
    private List<Destination> destinations = new ArrayList<>();
    private String bulkId;
    private String scenarioKey;
    private String text;
    private String mailSubject;

    public OmniSimpleRequest() {
    }

    public List<Destination> getDestinations() {
        return this.destinations;
    }

    public OmniSimpleRequest setDestinations(List<Destination> destinations) {
        this.destinations = destinations;
        return this;
    }

    public String getBulkId() {
        return this.bulkId;
    }

    public OmniSimpleRequest setBulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    public String getScenarioKey() {
        return this.scenarioKey;
    }

    public OmniSimpleRequest setScenarioKey(String scenarioKey) {
        this.scenarioKey = scenarioKey;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public OmniSimpleRequest setText(String text) {
        this.text = text;
        return this;
    }

    public String getMailSubject() {
        return this.mailSubject;
    }

    public OmniSimpleRequest setMailSubject(String mailSubject) {
        this.mailSubject = mailSubject;
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

        OmniSimpleRequest o = (OmniSimpleRequest)obj;
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
        if (this.text == null) {
            if (o.text != null){
                return false;
            }
        } else if (!this.text.equals(o.text)) {
            return false;
        }
        if (this.mailSubject == null) {
            if (o.mailSubject != null){
                return false;
            }
        } else if (!this.mailSubject.equals(o.mailSubject)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "OmniSimpleRequest{" +
            "destinations='" + destinations + "'" +
            ", bulkId='" + bulkId + "'" +
            ", scenarioKey='" + scenarioKey + "'" +
            ", text='" + text + "'" +
            ", mailSubject='" + mailSubject + "'" +
            '}';
    }
}