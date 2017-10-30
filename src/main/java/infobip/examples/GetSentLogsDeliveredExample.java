package infobip.examples;

import infobip.api.client.GetSentSmsLogs;
import infobip.api.config.BasicAuthConfiguration;
import infobip.api.model.sms.mt.logs.SMSLog;
import infobip.api.model.sms.mt.logs.SMSLogsResponse;

public class GetSentLogsDeliveredExample extends Example {

    public static void main(String[] args) {

        GetSentSmsLogs client = new GetSentSmsLogs(new BasicAuthConfiguration(USERNAME, PASSWORD));

        SMSLogsResponse response = client.execute(null, null, null, null, "DELIVERED", null, null, 10, null, null);

        for (SMSLog result : response.getResults()) {
            System.out.println("Message ID: " + result.getMessageId());
            System.out.println("Sent at: " + result.getSentAt());
            System.out.println("Sender: " + result.getFrom());
            System.out.println("Receiver: " + result.getTo());
            System.out.println("Message text: " + result.getText());
            System.out.println("Status: " + result.getStatus().getName());
            System.out.println("Price: " + result.getPrice().getPricePerMessage() + " " + result.getPrice().getCurrency());
            System.out.println("------------------------------------------------");
        }
    }
}