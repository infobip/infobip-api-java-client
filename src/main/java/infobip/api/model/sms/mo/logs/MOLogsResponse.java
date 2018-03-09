package infobip.api.model.sms.mo.logs;

import infobip.api.model.sms.mo.logs.MOLog;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 */
public class MOLogsResponse {
    private List<MOLog> results = new ArrayList<>();

    public MOLogsResponse() {
    }

    public List<MOLog> getResults() {
        return this.results;
    }

    public MOLogsResponse setResults(List<MOLog> results) {
        this.results = results;
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

        MOLogsResponse o = (MOLogsResponse)obj;
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
        return "MOLogsResponse{" +
            "results='" + results + "'" +
            '}';
    }
}