package infobip.api.model.omni.send;

import java.util.Map;
import java.util.HashMap;
import infobip.api.model.omni.send.NotificationOptions;
import java.util.concurrent.TimeUnit;

/**
 * This is a generated class and is not intended for modification!
 */
public class PushData {
    private Map<String, Object> customPayload = new HashMap<>();
    private NotificationOptions notificationOptions;
    private String text;
    private Long validityPeriod;
    private TimeUnit validityPeriodTimeUnit;

    public PushData() {
    }

    public Map<String, Object> getCustomPayload() {
        return this.customPayload;
    }

    public PushData setCustomPayload(Map<String, Object> customPayload) {
        this.customPayload = customPayload;
        return this;
    }

    public NotificationOptions getNotificationOptions() {
        return this.notificationOptions;
    }

    public PushData setNotificationOptions(NotificationOptions notificationOptions) {
        this.notificationOptions = notificationOptions;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public PushData setText(String text) {
        this.text = text;
        return this;
    }

    public Long getValidityPeriod() {
        return this.validityPeriod;
    }

    public PushData setValidityPeriod(Long validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    public TimeUnit getValidityPeriodTimeUnit() {
        return this.validityPeriodTimeUnit;
    }

    public PushData setValidityPeriodTimeUnit(TimeUnit validityPeriodTimeUnit) {
        this.validityPeriodTimeUnit = validityPeriodTimeUnit;
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

        PushData o = (PushData)obj;
        if (this.customPayload == null) {
            if (o.customPayload != null){
                return false;
            }
        } else if (!this.customPayload.equals(o.customPayload)) {
            return false;
        }
        if (this.notificationOptions == null) {
            if (o.notificationOptions != null){
                return false;
            }
        } else if (!this.notificationOptions.equals(o.notificationOptions)) {
            return false;
        }
        if (this.text == null) {
            if (o.text != null){
                return false;
            }
        } else if (!this.text.equals(o.text)) {
            return false;
        }
        if (this.validityPeriod == null) {
            if (o.validityPeriod != null){
                return false;
            }
        } else if (!this.validityPeriod.equals(o.validityPeriod)) {
            return false;
        }
        if (this.validityPeriodTimeUnit == null) {
            if (o.validityPeriodTimeUnit != null){
                return false;
            }
        } else if (!this.validityPeriodTimeUnit.equals(o.validityPeriodTimeUnit)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "PushData{" +
            "customPayload='" + customPayload + "'" +
            ", notificationOptions='" + notificationOptions + "'" +
            ", text='" + text + "'" +
            ", validityPeriod='" + validityPeriod + "'" +
            ", validityPeriodTimeUnit='" + validityPeriodTimeUnit + "'" +
            '}';
    }
}