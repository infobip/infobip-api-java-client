package infobip.api.model.omni.send;

import infobip.api.model.omni.send.FacebookDataType;
import java.util.concurrent.TimeUnit;

/**
 * This is a generated class and is not intended for modification!
 */
public class FacebookData {
    private FacebookDataType type;
    private String url;
    private String text;
    private Long validityPeriod;
    private TimeUnit validityPeriodTimeUnit;

    public FacebookData() {
    }

    public FacebookDataType getType() {
        return this.type;
    }

    public FacebookData setType(FacebookDataType type) {
        this.type = type;
        return this;
    }

    public String getUrl() {
        return this.url;
    }

    public FacebookData setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public FacebookData setText(String text) {
        this.text = text;
        return this;
    }

    public Long getValidityPeriod() {
        return this.validityPeriod;
    }

    public FacebookData setValidityPeriod(Long validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    public TimeUnit getValidityPeriodTimeUnit() {
        return this.validityPeriodTimeUnit;
    }

    public FacebookData setValidityPeriodTimeUnit(TimeUnit validityPeriodTimeUnit) {
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

        FacebookData o = (FacebookData)obj;
        if (this.type == null) {
            if (o.type != null){
                return false;
            }
        } else if (!this.type.equals(o.type)) {
            return false;
        }
        if (this.url == null) {
            if (o.url != null){
                return false;
            }
        } else if (!this.url.equals(o.url)) {
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
        return "FacebookData{" +
            "type='" + type + "'" +
            ", url='" + url + "'" +
            ", text='" + text + "'" +
            ", validityPeriod='" + validityPeriod + "'" +
            ", validityPeriodTimeUnit='" + validityPeriodTimeUnit + "'" +
            '}';
    }
}