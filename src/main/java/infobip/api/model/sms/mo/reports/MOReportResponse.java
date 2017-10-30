package infobip.api.model.sms.mo.reports;

import infobip.api.model.sms.mo.reports.MOReport;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 */
public class MOReportResponse {
    private int messageCount;
    private int pendingMessageCount;
    private List<MOReport> results = new ArrayList<MOReport>();

    public MOReportResponse() {
    }

    public int getMessageCount() {
        return this.messageCount;
    }

    public MOReportResponse setMessageCount(int messageCount) {
        this.messageCount = messageCount;
        return this;
    }

    public int getPendingMessageCount() {
        return this.pendingMessageCount;
    }

    public MOReportResponse setPendingMessageCount(int pendingMessageCount) {
        this.pendingMessageCount = pendingMessageCount;
        return this;
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

        MOReportResponse o = (MOReportResponse)obj;
        if (this.messageCount != o.messageCount) {
            return false;
        }
        if (this.pendingMessageCount != o.pendingMessageCount) {
            return false;
        }
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
        return "MOReportResponse{" +
            "messageCount=" + messageCount +
            ", pendingMessageCount=" + pendingMessageCount +
            ", results=" + (results == null?"null":Arrays.toString(results.toArray())) +
            '}';
    }
}