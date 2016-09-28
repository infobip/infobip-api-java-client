package infobip.api.model.sms.mt.logs;

import infobip.api.model.sms.mt.logs.SMSLog;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 */
public class SMSLogsResponse {
    private List<SMSLog> results = new ArrayList<SMSLog>();

    public SMSLogsResponse() {
    }

    public List<SMSLog> getResults() {
        return this.results;
    }

    public SMSLogsResponse setResults(List<SMSLog> results) {
        this.results = results;
        return this;
    }

    public SMSLogsResponse addResults(SMSLog... results) {
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    public SMSLogsResponse removeResults(SMSLog... results) {
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

        SMSLogsResponse o = (SMSLogsResponse)obj;
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
        return "SMSLogsResponse{" +
            "results=" + (results == null?"null":Arrays.toString(results.toArray())) +
            '}';
    }
}