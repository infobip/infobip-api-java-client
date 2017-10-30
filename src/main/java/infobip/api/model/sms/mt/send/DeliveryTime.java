package infobip.api.model.sms.mt.send;

/**
 * This is a generated class and is not intended for modification!
 */
public class DeliveryTime {
    private Integer hour;
    private Integer minute;

    public DeliveryTime() {
    }

    public Integer getHour() {
        return this.hour;
    }

    public DeliveryTime setHour(Integer hour) {
        this.hour = hour;
        return this;
    }

    public Integer getMinute() {
        return this.minute;
    }

    public DeliveryTime setMinute(Integer minute) {
        this.minute = minute;
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

        DeliveryTime o = (DeliveryTime)obj;
        if (this.hour == null) {
            if (o.hour != null){
                return false;
            }
        } else if (!this.hour.equals(o.hour)) {
            return false;
        }
        if (this.minute == null) {
            if (o.minute != null){
                return false;
            }
        } else if (!this.minute.equals(o.minute)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "DeliveryTime{" +
            "hour='" + hour + "'" +
            ", minute='" + minute + "'" +
            '}';
    }
}