package infobip.api.model.sms.mt.send;

import infobip.api.model.sms.mt.send.DeliveryDay;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import infobip.api.model.sms.mt.send.DeliveryTime;

/**
 * This is a generated class and is not intended for modification!
 */
public class DeliveryTimeWindow {
    private List<DeliveryDay> days = new ArrayList<DeliveryDay>();
    private DeliveryTime from;
    private DeliveryTime to;

    public DeliveryTimeWindow() {
    }

    public List<DeliveryDay> getDays() {
        return this.days;
    }

    public DeliveryTimeWindow setDays(List<DeliveryDay> days) {
        this.days = days;
        return this;
    }

    public DeliveryTimeWindow addDays(DeliveryDay... days) {
        this.days.addAll(Arrays.asList(days));
        return this;
    }

    public DeliveryTimeWindow removeDays(DeliveryDay... days) {
        this.days.removeAll(Arrays.asList(days));
        return this;
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        DeliveryTimeWindow o = (DeliveryTimeWindow)obj;
        if (this.days == null) {
            if (o.days != null){
                return false;
            }
        } else if (!this.days.equals(o.days)) {
            return false;
        }
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

        return true;
    }

    @Override
    public String toString() {
        return "DeliveryTimeWindow{" +
            "days=" + (days == null?"null":Arrays.toString(days.toArray())) +
            ", from='" + from + "'" +
            ", to='" + to + "'" +
            '}';
    }
}