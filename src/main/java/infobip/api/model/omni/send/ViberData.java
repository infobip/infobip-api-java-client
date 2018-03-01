package infobip.api.model.omni.send;

import java.util.concurrent.TimeUnit;

/**
 * This is a generated class and is not intended for modification!
 */
public class ViberData {
    private String imageURL;
    private String buttonText;
    private String buttonURL;
    private boolean isPromotional;
    private String text;
    private Long validityPeriod;
    private TimeUnit validityPeriodTimeUnit;

    public ViberData() {
    }

    public String getImageURL() {
        return this.imageURL;
    }

    public ViberData setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public ViberData setButtonText(String buttonText) {
        this.buttonText = buttonText;
        return this;
    }

    public String getButtonURL() {
        return this.buttonURL;
    }

    public ViberData setButtonURL(String buttonURL) {
        this.buttonURL = buttonURL;
        return this;
    }

    public boolean isIsPromotional() {
        return this.isPromotional;
    }

    public ViberData setIsPromotional(boolean isPromotional) {
        this.isPromotional = isPromotional;
        return this;
    }

    public String getText() {
        return this.text;
    }

    public ViberData setText(String text) {
        this.text = text;
        return this;
    }

    public Long getValidityPeriod() {
        return this.validityPeriod;
    }

    public ViberData setValidityPeriod(Long validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    public TimeUnit getValidityPeriodTimeUnit() {
        return this.validityPeriodTimeUnit;
    }

    public ViberData setValidityPeriodTimeUnit(TimeUnit validityPeriodTimeUnit) {
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

        ViberData o = (ViberData)obj;
        if (this.imageURL == null) {
            if (o.imageURL != null){
                return false;
            }
        } else if (!this.imageURL.equals(o.imageURL)) {
            return false;
        }
        if (this.buttonText == null) {
            if (o.buttonText != null){
                return false;
            }
        } else if (!this.buttonText.equals(o.buttonText)) {
            return false;
        }
        if (this.buttonURL == null) {
            if (o.buttonURL != null){
                return false;
            }
        } else if (!this.buttonURL.equals(o.buttonURL)) {
            return false;
        }
        if (this.isPromotional != o.isPromotional) {
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
        return "ViberData{" +
            "imageURL='" + imageURL + "'" +
            ", buttonText='" + buttonText + "'" +
            ", buttonURL='" + buttonURL + "'" +
            ", isPromotional=" + isPromotional +
            ", text='" + text + "'" +
            ", validityPeriod='" + validityPeriod + "'" +
            ", validityPeriodTimeUnit='" + validityPeriodTimeUnit + "'" +
            '}';
    }
}