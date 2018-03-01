package infobip.api.model.omni.reports;

import infobip.api.model.omni.reports.OMNIReport;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 */
public class OMNIReportsResponse {
    private List<OMNIReport> results = new ArrayList<>();

    public OMNIReportsResponse() {
    }

    public List<OMNIReport> getResults() {
        return this.results;
    }

    public OMNIReportsResponse setResults(List<OMNIReport> results) {
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

        OMNIReportsResponse o = (OMNIReportsResponse)obj;
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
        return "OMNIReportsResponse{" +
            "results='" + results + "'" +
            '}';
    }
}