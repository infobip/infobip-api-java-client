package infobip.api.model.sms.mt.reports;

import java.util.Arrays;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class SMSReportResponse {
    private List<SMSReport> results;

    public SMSReportResponse() {
    }


    public List<SMSReport> getResults() {
        return this.results;
    }

    public SMSReportResponse setResults(List<SMSReport> results) {
        this.results = results;
        return this;
    }

    public SMSReportResponse addResults(SMSReport... results) {
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public SMSReportResponse removeResults(SMSReport... results) {
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

        SMSReportResponse o = (SMSReportResponse) obj;
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
        return "SMSReportResponse{" +
                "results=" + (results == null ? "null" : Arrays.toString(results.toArray())) +
                '}';
    }
}