package infobip.api.model.omni.logs;

import infobip.api.model.omni.logs.OmniLog;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 */
public class OmniLogsResponse {
    private List<OmniLog> results = new ArrayList<>();

    public OmniLogsResponse() {
    }

    public List<OmniLog> getResults() {
        return this.results;
    }

    public OmniLogsResponse setResults(List<OmniLog> results) {
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

        OmniLogsResponse o = (OmniLogsResponse)obj;
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
        return "OmniLogsResponse{" +
            "results='" + results + "'" +
            '}';
    }
}