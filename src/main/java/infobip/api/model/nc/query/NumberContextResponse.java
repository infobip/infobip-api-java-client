package infobip.api.model.nc.query;

import infobip.api.model.nc.query.NumberContextResponseDetails;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 */
public class NumberContextResponse {
    private List<NumberContextResponseDetails> results = new ArrayList<>();
    private String bulkId;

    public NumberContextResponse() {
    }

    public List<NumberContextResponseDetails> getResults() {
        return this.results;
    }

    public NumberContextResponse setResults(List<NumberContextResponseDetails> results) {
        this.results = results;
        return this;
    }

    public String getBulkId() {
        return this.bulkId;
    }

    public NumberContextResponse setBulkId(String bulkId) {
        this.bulkId = bulkId;
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

        NumberContextResponse o = (NumberContextResponse)obj;
        if (this.results == null) {
            if (o.results != null){
                return false;
            }
        } else if (!this.results.equals(o.results)) {
            return false;
        }
        if (this.bulkId == null) {
            if (o.bulkId != null){
                return false;
            }
        } else if (!this.bulkId.equals(o.bulkId)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "NumberContextResponse{" +
            "results='" + results + "'" +
            ", bulkId='" + bulkId + "'" +
            '}';
    }
}