package infobip.api.model.sms.mo.reports;

import infobip.api.model.sms.mo.reports.MOReport;
import java.util.ArrayList;
import java.util.List;

/**
 * This is a generated class and is not intended for modification!
 */
public class MOReportResponse {
    private List<MOReport> results = new ArrayList<>();
    private int messageCount;
    private int pendingMessageCount;

    public MOReportResponse() {
    }

    public List<MOReport> getResults() {
        return this.results;
    }

    public MOReportResponse setResults(List<MOReport> results) {
        this.results = results;
        return this;
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }

        MOReportResponse o = (MOReportResponse)obj;
        if (this.results == null) {
            if (o.results != null){
                return false;
            }
        } else if (!this.results.equals(o.results)) {
            return false;
        }
        if (this.messageCount != o.messageCount) {
            return false;
        }
        if (this.pendingMessageCount != o.pendingMessageCount) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "MOReportResponse{" +
            "results='" + results + "'" +
            ", messageCount=" + messageCount +
            ", pendingMessageCount=" + pendingMessageCount +
            '}';
    }
}