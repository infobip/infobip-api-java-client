package infobip.api.model.sms.mt.bulks;

import java.util.Date;

/**
 * This is a generated class and is not intended for modification!
 */
public class BulkResponse {
    private String bulkId;
    private Date sendAt;

    public BulkResponse() {
    }

    public String getBulkId() {
        return this.bulkId;
    }

    public BulkResponse setBulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    public Date getSendAt() {
        return this.sendAt;
    }

    public BulkResponse setSendAt(Date sendAt) {
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

        BulkResponse o = (BulkResponse)obj;
        if (this.bulkId == null) {
            if (o.bulkId != null){
                return false;
            }
        } else if (!this.bulkId.equals(o.bulkId)) {
            return false;
        }
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
        return "BulkResponse{" +
            "bulkId='" + bulkId + "'" +
            ", sendAt='" + sendAt + "'" +
            '}';
    }
}