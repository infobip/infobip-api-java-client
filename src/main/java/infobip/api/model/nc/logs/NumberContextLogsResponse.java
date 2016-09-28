package infobip.api.model.nc.logs;

import infobip.api.model.nc.logs.NumberContextLog;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 */
public class NumberContextLogsResponse {
    private List<NumberContextLog> results = new ArrayList<NumberContextLog>();

    public NumberContextLogsResponse() {
    }

    public List<NumberContextLog> getResults() {
        return this.results;
    }

    public NumberContextLogsResponse setResults(List<NumberContextLog> results) {
        this.results = results;
        return this;
    }

    public NumberContextLogsResponse addResults(NumberContextLog... results) {
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public NumberContextLogsResponse removeResults(NumberContextLog... results) {
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

        NumberContextLogsResponse o = (NumberContextLogsResponse)obj;
        if (this.results == null) {
            if (o.results != null){
                return false;
            }
        } else if (!this.results.equals(o.results)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "NumberContextLogsResponse{" +
            "results=" + (results == null?"null":Arrays.toString(results.toArray())) +
            '}';
    }
}