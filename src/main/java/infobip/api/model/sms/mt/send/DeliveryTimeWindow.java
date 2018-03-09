package infobip.api.model.sms.mt.send;

import infobip.api.model.sms.mt.send.DeliveryTime;
import infobip.api.model.sms.mt.send.DeliveryDay;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 */
public class DeliveryTimeWindow {
    private DeliveryTime from;
    private DeliveryTime to;
    private List<DeliveryDay> days = new ArrayList<>();

    public DeliveryTimeWindow() {
    }

    public DeliveryTime getFrom() {
        return this.from;
    }

    public DeliveryTimeWindow setFrom(DeliveryTime from) {
        this.from = from;
        return this;
    }

    public DeliveryTime getTo() {
        return this.to;
    }

    public DeliveryTimeWindow setTo(DeliveryTime to) {
        this.to = to;
        return this;
    }

    public List<DeliveryDay> getDays() {
        return this.days;
    }

    public DeliveryTimeWindow setDays(List<DeliveryDay> days) {
        this.days = days;
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

        DeliveryTimeWindow o = (DeliveryTimeWindow)obj;
        if (this.from == null) {
            if (o.from != null){
                return false;
            }
        } else if (!this.from.equals(o.from)) {
            return false;
        }
        if (this.to == null) {
            if (o.to != null){
                return false;
            }
        } else if (!this.to.equals(o.to)) {
            return false;
        }
        if (this.days == null) {
            if (o.days != null){
                return false;
            }
        } else if (!this.days.equals(o.days)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "DeliveryTimeWindow{" +
            "from='" + from + "'" +
            ", to='" + to + "'" +
            ", days='" + days + "'" +
            '}';
    }
}