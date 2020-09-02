package infobip.api.model.sms.mt.send;

import infobip.api.model.sms.mt.send.IndiaDltOptions;

/**
 * This is a generated class and is not intended for modification!
 */
public class RegionalOptions {
    private IndiaDltOptions indiaDlt;

    public RegionalOptions() {
    }

    public IndiaDltOptions getIndiaDlt() {
        return this.indiaDlt;
    }

    public RegionalOptions setIndiaDlt(IndiaDltOptions indiaDlt) {
        this.indiaDlt = indiaDlt;
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

        RegionalOptions o = (RegionalOptions)obj;
        if (this.indiaDlt == null) {
            if (o.indiaDlt != null){
                return false;
            }
        } else if (!this.indiaDlt.equals(o.indiaDlt)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "RegionalOptions{" +
            "indiaDlt='" + indiaDlt + "'" +
            '}';
    }
}