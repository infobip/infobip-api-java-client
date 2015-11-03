package infobip.examples;

import infobip.api.client.GetSentSmsLogs;
import infobip.api.config.BasicAuthConfiguration;
import infobip.api.model.sms.mt.logs.SMSLog;
import infobip.api.model.sms.mt.logs.SMSLogsResponse;

/**
 * Created by milosmilakovic on 9/24/15.
 */
public class GetSentLogsExample extends Example{

    public static void main(String[] args) {
        GetSentSmsLogs client = new GetSentSmsLogs(new BasicAuthConfiguration(BASE_URL, USERNAME, PASSWORD));

        SMSLogsResponse response = client.execute(null, null, null, null, null, null, null, 10, null, null);

        for (int i = 0; i < response.getResults().size(); ++i) {
            SMSLog result = response.getResults().get(i);
            System.out.println("Message ID: " + result.getMessageId());
            System.out.println("Sent at: " + result.getSentAt());
            System.out.println("Sender: " + result.getFrom());
            System.out.println("Receiver: " + result.getTo());
            System.out.println("Message text: " + result.getText());
            System.out.println("Status: " + result.getStatus().getName());
            System.out.println("Price: " + result.getPrice().getPricePerMessage() + " " + result.getPrice().getCurrency());
        }
    }
}