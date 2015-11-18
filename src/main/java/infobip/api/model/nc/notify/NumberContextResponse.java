package infobip.api.model.nc.notify;

import java.util.Arrays;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class NumberContextResponse {
    private String bulkId;
    private List<NumberContextResponseDetails> results;

    public NumberContextResponse() {
    }

    public String getBulkId() {
        return this.bulkId;
    }

    public NumberContextResponse setBulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }


    public List<NumberContextResponseDetails> getResults() {
        return this.results;
    }

    public NumberContextResponse setResults(List<NumberContextResponseDetails> results) {
        this.results = results;
        return this;
    }

    public NumberContextResponse addResults(NumberContextResponseDetails... results) {
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public NumberContextResponse removeResults(NumberContextResponseDetails... results) {
        this.results.removeAll(Arrays.asList(results));
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

        NumberContextResponse o = (NumberContextResponse) obj;
        if (this.bulkId == null) {
            if (o.bulkId != null) {
                return false;
            }
        } else if (!this.bulkId.equals(o.bulkId)) {
            return false;
        }
        if (this.results == null) {
            if (o.results != null) {
                return false;
            }
        } else if (!this.results.equals(o.results)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "NumberContextResponse{" +
                "bulkId='" + bulkId + "'" +

                ", results=" + (results == null ? "null" : Arrays.toString(results.toArray())) +
                '}';
    }
}