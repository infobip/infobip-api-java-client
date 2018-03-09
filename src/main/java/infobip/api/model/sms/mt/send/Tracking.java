package infobip.api.model.sms.mt.send;

/**
 * This is a generated class and is not intended for modification!
 */
public class Tracking {
    private String track;
    private String processKey;
    private String type;
    private String baseUrl;

    public Tracking() {
    }

    public String getTrack() {
        return this.track;
    }

    public Tracking setTrack(String track) {
        this.track = track;
        return this;
    }

    public String getProcessKey() {
        return this.processKey;
    }

    public Tracking setProcessKey(String processKey) {
        this.processKey = processKey;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public Tracking setType(String type) {
        this.type = type;
        return this;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public Tracking setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
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

        Tracking o = (Tracking)obj;
        if (this.track == null) {
            if (o.track != null){
                return false;
            }
        } else if (!this.track.equals(o.track)) {
            return false;
        }
        if (this.processKey == null) {
            if (o.processKey != null){
                return false;
            }
        } else if (!this.processKey.equals(o.processKey)) {
            return false;
        }
        if (this.type == null) {
            if (o.type != null){
                return false;
            }
        } else if (!this.type.equals(o.type)) {
            return false;
        }
        if (this.baseUrl == null) {
            if (o.baseUrl != null){
                return false;
            }
        } else if (!this.baseUrl.equals(o.baseUrl)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Tracking{" +
            "track='" + track + "'" +
            ", processKey='" + processKey + "'" +
            ", type='" + type + "'" +
            ", baseUrl='" + baseUrl + "'" +
            '}';
    }
}