package infobip.examples;

import infobip.api.model.sms.mo.reports.MOReport;
import infobip.api.model.sms.mo.reports.MOReportResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class DeserializeInboundMessagesExample {

    public static void main(String[] args) {

        String responseBody =
                "{\n" +
                "   \"results\":[\n" +
                "      {\n" +
                "         \"messageId\":\"ff4804ef-6ab6-4abd-984d-ab3b1387e823\",\n" +
                "         \"from\":\"38598111\",\n" +
                "         \"to\":\"41793026727\",\n" +
                "         \"text\":\"KEY Test message\",\n" +
                "         \"cleanText\":\"Test message\",\n" +
                "         \"keyword\":\"KEY\",\n" +
                "         \"receivedAt\":\"2015-02-15T11:43:20.254+0100\",\n" +
                "         \"smsCount\":1\n" +
                "      }\n" +
                "   ]\n" +
                "}";

        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
        MOReportResponse moReportResponse = gson.fromJson(responseBody, MOReportResponse.class);

        for (MOReport result : moReportResponse.getResults()) {
            System.out.println("Message ID: " + result.getMessageId());
            System.out.println("Received at: " + result.getReceivedAt());
            System.out.println("Sender: " + result.getFrom());
            System.out.println("Receiver: " + result.getTo());
            System.out.println("Message text: " + result.getText());
            System.out.println("Keyword: " + result.getKeyword());
            System.out.println("Clean text: " + result.getCleanText());
            System.out.println("Sms Count: " + result.getSmsCount());
            System.out.println("------------------------------------------------");
        }
    }
}
