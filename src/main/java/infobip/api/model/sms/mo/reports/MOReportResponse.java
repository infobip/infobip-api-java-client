package infobip.api.model.sms.mo.reports;

import java.util.Arrays;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class MOReportResponse {
    private List<MOReport> results;

    public MOReportResponse() {
    }


    public List<MOReport> getResults() {
        return this.results;
    }

    public MOReportResponse setResults(List<MOReport> results) {
        this.results = results;
        return this;
    }

    public MOReportResponse addResults(MOReport... results) {
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public MOReportResponse removeResults(MOReport... results) {
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

        MOReportResponse o = (MOReportResponse) obj;
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
        return "MOReportResponse{" +
                "results=" + (results == null ? "null" : Arrays.toString(results.toArray())) +
                '}';
    }
}