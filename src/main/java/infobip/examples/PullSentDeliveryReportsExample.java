package infobip.examples;

import infobip.api.client.GetSentSmsDeliveryReports;
import infobip.api.config.BasicAuthConfiguration;
import infobip.api.model.sms.mt.reports.SMSReport;
import infobip.api.model.sms.mt.reports.SMSReportResponse;

/**
 * Created by milosmilakovic on 9/24/15.
 */
public class PullSentDeliveryReportsExample extends Example {

    public static void main(String[] args) {
        GetSentSmsDeliveryReports client = new GetSentSmsDeliveryReports(new BasicAuthConfiguration(BASE_URL, USERNAME, PASSWORD));

        SMSReportResponse response = client.execute(null, null, 10);

        for (int i = 0; i < response.getResults().size(); ++i) {
            SMSReport result = response.getResults().get(i);
            System.out.println("Message ID: " + result.getMessageId());
            System.out.println("Sent at: " + result.getSentAt());
            System.out.println("Receiver: " + result.getTo());
            System.out.println("Status: " + result.getStatus().getName());
            System.out.println("Price: " + result.getPrice().getPricePerMessage() + " " + result.getPrice().getCurrency());
        }
    }
}