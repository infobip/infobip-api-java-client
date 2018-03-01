package infobip.api.model.nc.query;

import java.util.List;
import java.util.ArrayList;

/**
 * This is a generated class and is not intended for modification!
 */
public class NumberContextRequest {
    private List<String> to = new ArrayList<>();

    public NumberContextRequest() {
    }

    public List<String> getTo() {
        return this.to;
    }

    public NumberContextRequest setTo(List<String> to) {
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

        NumberContextRequest o = (NumberContextRequest)obj;
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
        return "NumberContextRequest{" +
            "to='" + to + "'" +
            '}';
    }
}