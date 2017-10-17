package infobip.api.model.sms.mt.bulks;

import java.util.Date;

/**
 * This is a generated class and is not intended for modification!
 */
public class BulkRequest {
    private Date sendAt;

    public BulkRequest() {
    }

    public Date getSendAt() {
        return this.sendAt;
    }

    public BulkRequest setSendAt(Date sendAt) {
        this.sendAt = sendAt;
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

        BulkRequest o = (BulkRequest)obj;
        if (this.sendAt == null) {
            if (o.sendAt != null){
                return false;
            }
        } else if (!this.sendAt.equals(o.sendAt)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "BulkRequest{" +
            "sendAt='" + sendAt + "'" +
            '}';
    }
}