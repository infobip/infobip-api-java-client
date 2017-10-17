package infobip.api.model.sms.mt.bulks.status;

import infobip.api.model.sms.mt.bulks.status.BulkStatus;

/**
 * This is a generated class and is not intended for modification!
 */
public class UpdateStatusRequest {
    private BulkStatus status;

    public UpdateStatusRequest() {
    }

    public BulkStatus getStatus() {
        return this.status;
    }

    public UpdateStatusRequest setStatus(BulkStatus status) {
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

        UpdateStatusRequest o = (UpdateStatusRequest)obj;
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
        return "UpdateStatusRequest{" +
            "status='" + status + "'" +
            '}';
    }
}