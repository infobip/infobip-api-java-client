package infobip.api.model.omni.send;

/**
 * This is a generated class and is not intended for modification!
 */
public class NotificationOptions {
    private Boolean vibrationEnabled;
    private Boolean soundEnabled;
    private String soundName;
    private Integer badge;
    private String contentUrl;
    private String category;

    public NotificationOptions() {
    }

    public Boolean getVibrationEnabled() {
        return this.vibrationEnabled;
    }

    public NotificationOptions setVibrationEnabled(Boolean vibrationEnabled) {
        this.vibrationEnabled = vibrationEnabled;
        return this;
    }

    public Boolean getSoundEnabled() {
        return this.soundEnabled;
    }

    public NotificationOptions setSoundEnabled(Boolean soundEnabled) {
        this.soundEnabled = soundEnabled;
        return this;
    }

    public String getSoundName() {
        return this.soundName;
    }

    public NotificationOptions setSoundName(String soundName) {
        this.soundName = soundName;
        return this;
    }

    public Integer getBadge() {
        return this.badge;
    }

    public NotificationOptions setBadge(Integer badge) {
        this.badge = badge;
        return this;
    }

    public String getContentUrl() {
        return this.contentUrl;
    }

    public NotificationOptions setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
        return this;
    }

    public String getCategory() {
        return this.category;
    }

    public NotificationOptions setCategory(String category) {
        this.category = category;
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

        NotificationOptions o = (NotificationOptions)obj;
        if (this.vibrationEnabled == null) {
            if (o.vibrationEnabled != null){
                return false;
            }
        } else if (!this.vibrationEnabled.equals(o.vibrationEnabled)) {
            return false;
        }
        if (this.soundEnabled == null) {
            if (o.soundEnabled != null){
                return false;
            }
        } else if (!this.soundEnabled.equals(o.soundEnabled)) {
            return false;
        }
        if (this.soundName == null) {
            if (o.soundName != null){
                return false;
            }
        } else if (!this.soundName.equals(o.soundName)) {
            return false;
        }
        if (this.badge == null) {
            if (o.badge != null){
                return false;
            }
        } else if (!this.badge.equals(o.badge)) {
            return false;
        }
        if (this.contentUrl == null) {
            if (o.contentUrl != null){
                return false;
            }
        } else if (!this.contentUrl.equals(o.contentUrl)) {
            return false;
        }
        if (this.category == null) {
            if (o.category != null){
                return false;
            }
        } else if (!this.category.equals(o.category)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "NotificationOptions{" +
            "vibrationEnabled='" + vibrationEnabled + "'" +
            ", soundEnabled='" + soundEnabled + "'" +
            ", soundName='" + soundName + "'" +
            ", badge='" + badge + "'" +
            ", contentUrl='" + contentUrl + "'" +
            ", category='" + category + "'" +
            '}';
    }
}