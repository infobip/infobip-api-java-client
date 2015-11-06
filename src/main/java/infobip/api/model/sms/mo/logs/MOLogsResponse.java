package infobip.api.model.sms.mo.logs;

import java.util.Arrays;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class MOLogsResponse {
    private List<MOLog> results;

    public MOLogsResponse() {
    }


    public List<MOLog> getResults() {
        return this.results;
    }

    public MOLogsResponse setResults(List<MOLog> results) {
        this.results = results;
        return this;
    }

    public MOLogsResponse addResults(MOLog... results) {
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public MOLogsResponse removeResults(MOLog... results) {
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

        MOLogsResponse o = (MOLogsResponse) obj;
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
        return "MOLogsResponse{" +
                "results=" + (results == null ? "null" : Arrays.toString(results.toArray())) +
                '}';
    }
}