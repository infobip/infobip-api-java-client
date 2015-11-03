package infobip.api.model.sms.mt.send;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class Tracking {
    private String processKey;
    private String track;
    private String type;

    public Tracking() {
    }


    public String getProcessKey() {
        return this.processKey;
    }

    public Tracking setProcessKey(String processKey) {
        this.processKey = processKey;
        return this;
    }


    public String getTrack() {
        return this.track;
    }

    public Tracking setTrack(String track) {
        this.track = track;
        return this;
    }


    public String getType() {
        return this.type;
    }

    public Tracking setType(String type) {
        this.type = type;
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
        if (this.processKey == null) {
            if (o.processKey != null){
                return false;
            }
        } else if (!this.processKey.equals(o.processKey)) {
            return false;
        }
        if (this.track == null) {
            if (o.track != null){
                return false;
            }
        } else if (!this.track.equals(o.track)) {
            return false;
        }
        if (this.type == null) {
            if (o.type != null){
                return false;
            }
        } else if (!this.type.equals(o.type)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Tracking{" +
            "processKey='" + processKey + "'" +

            ", track='" + track + "'" +

            ", type='" + type + "'" +
            '}';
    }
}