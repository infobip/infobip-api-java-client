package infobip.api.model.nc.notify;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 */
public class NumberContextRequest {
    private List<String> to = new ArrayList<>();
    private String notifyUrl;
    private String notifyContentType;

    public NumberContextRequest() {
    }

    public List<String> getTo() {
        return this.to;
    }

    public NumberContextRequest setTo(List<String> to) {
        this.to = to;
        return this;
    }

    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public NumberContextRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    public String getNotifyContentType() {
        return this.notifyContentType;
    }

    public NumberContextRequest setNotifyContentType(String notifyContentType) {
        this.notifyContentType = notifyContentType;
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

        NumberContextRequest o = (NumberContextRequest)obj;
        if (this.to == null) {
            if (o.to != null){
                return false;
            }
        } else if (!this.to.equals(o.to)) {
            return false;
        }
        if (this.notifyUrl == null) {
            if (o.notifyUrl != null){
                return false;
            }
        } else if (!this.notifyUrl.equals(o.notifyUrl)) {
            return false;
        }
        if (this.notifyContentType == null) {
            if (o.notifyContentType != null){
                return false;
            }
        } else if (!this.notifyContentType.equals(o.notifyContentType)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "NumberContextRequest{" +
            "to='" + to + "'" +
            ", notifyUrl='" + notifyUrl + "'" +
            ", notifyContentType='" + notifyContentType + "'" +
            '}';
    }
}