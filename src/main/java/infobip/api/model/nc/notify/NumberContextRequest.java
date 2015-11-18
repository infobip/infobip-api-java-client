package infobip.api.model.nc.notify;

import java.util.Arrays;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class NumberContextRequest {
    private String notifyUrl;
    private List<String> to;
    private String notifyContentType;

    public NumberContextRequest() {
    }
    
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public NumberContextRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }


    public List<String> getTo() {
        return this.to;
    }

    public NumberContextRequest setTo(List<String> to) {
        this.to = to;
        return this;
    }

    public NumberContextRequest addTo(String... to) {
        this.to.addAll(Arrays.asList(to));
        return this;
    }

    public NumberContextRequest removeTo(String... to) {
        this.to.removeAll(Arrays.asList(to));
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

        NumberContextRequest o = (NumberContextRequest) obj;
        if (this.notifyUrl == null) {
            if (o.notifyUrl != null) {
                return false;
            }
        } else if (!this.notifyUrl.equals(o.notifyUrl)) {
            return false;
        }
        if (this.to == null) {
            if (o.to != null) {
                return false;
            }
        } else if (!this.to.equals(o.to)) {
            return false;
        }
        if (this.notifyContentType == null) {
            if (o.notifyContentType != null) {
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
                "notifyUrl='" + notifyUrl + "'" +

                ", to=" + (to == null ? "null" : Arrays.toString(to.toArray())) +

                ", notifyContentType='" + notifyContentType + "'" +
                '}';
    }
}