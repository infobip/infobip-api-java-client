package infobip.api.model.sms.mt.reports;

import infobip.api.model.sms.mt.reports.SMSReport;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 */
public class SMSReportResponse {
    private List<SMSReport> results = new ArrayList<>();

    public SMSReportResponse() {
    }

    public List<SMSReport> getResults() {
        return this.results;
    }

    public SMSReportResponse setResults(List<SMSReport> results) {
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

        SMSReportResponse o = (SMSReportResponse)obj;
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
        return "SMSReportResponse{" +
            "results='" + results + "'" +
            '}';
    }
}