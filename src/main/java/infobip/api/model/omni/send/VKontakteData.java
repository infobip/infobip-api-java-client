package infobip.api.model.omni.send;

import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 * This is a generated class and is not intended for modification!
 */
public class VKontakteData {
    private String templateName;
    private Map<String, Object> templateData = new HashMap<>();
    private String text;
    private Long validityPeriod;
    private TimeUnit validityPeriodTimeUnit;

    public VKontakteData() {
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public VKontakteData setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    public Map<String, Object> getTemplateData() {
        return this.templateData;
    }

    public VKontakteData setTemplateData(Map<String, Object> templateData) {
        this.templateData = templateData;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public VKontakteData setText(String text) {
        this.text = text;
        return this;
    }

    public Long getValidityPeriod() {
        return this.validityPeriod;
    }

    public VKontakteData setValidityPeriod(Long validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    public TimeUnit getValidityPeriodTimeUnit() {
        return this.validityPeriodTimeUnit;
    }

    public VKontakteData setValidityPeriodTimeUnit(TimeUnit validityPeriodTimeUnit) {
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

        VKontakteData o = (VKontakteData)obj;
        if (this.templateName == null) {
            if (o.templateName != null){
                return false;
            }
        } else if (!this.templateName.equals(o.templateName)) {
            return false;
        }
        if (this.templateData == null) {
            if (o.templateData != null){
                return false;
            }
        } else if (!this.templateData.equals(o.templateData)) {
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
        return "VKontakteData{" +
            "templateName='" + templateName + "'" +
            ", templateData='" + templateData + "'" +
            ", text='" + text + "'" +
            ", validityPeriod='" + validityPeriod + "'" +
            ", validityPeriodTimeUnit='" + validityPeriodTimeUnit + "'" +
            '}';
    }
}