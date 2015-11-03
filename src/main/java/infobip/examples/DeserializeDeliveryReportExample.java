package infobip.examples;

import infobip.api.model.sms.mt.reports.SMSReport;
import infobip.api.model.sms.mt.reports.SMSReportResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by milosmilakovic on 9/24/15.
 */
public class DeserializeDeliveryReportExample {

    public static void main(String[] args) {

         String responseBody = "{\n" +
                "  \"results\": [\n" +
                "    {\n" +
                "      \"bulkId\": \"BULK-ID-123-xyz\",\n" +
                "      \"messageId\": \"c9823180-94d4-4ea0-9bf3-ec907e7534a6\",\n" +
                "      \"to\": \"41793026731\",\n" +
                "      \"sentAt\": \"2015-06-04T13:01:52.933\",\n" +
                "      \"doneAt\": \"2015-06-04T13:02:00.134+0000\",\n" +
                "      \"smsCount\": 1,\n" +
                "      \"price\": {\n" +
                "        \"pricePerMessage\": 0.0001000000,\n" +
                "        \"currency\": \"EUR\"\n" +
                "      },\n" +
                "      \"status\": {\n" +
                "        \"groupId\": 3,\n" +
                "        \"groupName\": \"DELIVERED\",\n" +
                "        \"id\": 5,\n" +
                "        \"name\": \"DELIVERED_TO_HANDSET\",\n" +
                "        \"description\": \"Message delivered to handset\"\n" +
                "      },\n" +
                "      \"error\": {\n" +
                "        \"groupId\": 0,\n" +
                "        \"groupName\": \"OK\",\n" +
                "        \"id\": 0,\n" +
                "        \"name\": \"NO_ERROR\",\n" +
                "        \"description\": \"No Error\",\n" +
                "        \"permanent\": false\n" +
                "      }\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
        SMSReportResponse smsReportResponse = gson.fromJson(responseBody, SMSReportResponse.class);

        for (int i = 0; i < smsReportResponse.getResults().size(); ++i) {
            SMSReport result = smsReportResponse.getResults().get(i);
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
