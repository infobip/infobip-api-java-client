package infobip.api.model.nc.query;

import java.util.Arrays;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class NumberContextRequest {
    private List<String> to;

    public NumberContextRequest() {
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        NumberContextRequest o = (NumberContextRequest) obj;
        if (this.to == null) {
            if (o.to != null) {
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
                "to=" + (to == null ? "null" : Arrays.toString(to.toArray())) +
                '}';
    }
}