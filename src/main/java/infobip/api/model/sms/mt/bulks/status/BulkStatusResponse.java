package infobip.api.model.sms.mt.bulks.status;

import infobip.api.model.sms.mt.bulks.status.BulkStatus;

/**
 * This is a generated class and is not intended for modification!
 */
public class BulkStatusResponse {
    private String bulkId;
    private BulkStatus status;

    public BulkStatusResponse() {
    }

    public String getBulkId() {
        return this.bulkId;
    }

    public BulkStatusResponse setBulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    public BulkStatus getStatus() {
        return this.status;
    }

    public BulkStatusResponse setStatus(BulkStatus status) {
        this.status = status;
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

        BulkStatusResponse o = (BulkStatusResponse)obj;
        if (this.bulkId == null) {
            if (o.bulkId != null){
                return false;
            }
        } else if (!this.bulkId.equals(o.bulkId)) {
            return false;
        }
        if (this.status == null) {
            if (o.status != null){
                return false;
            }
        } else if (!this.status.equals(o.status)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "BulkStatusResponse{" +
            "bulkId='" + bulkId + "'" +
            ", status='" + status + "'" +
            '}';
    }
}