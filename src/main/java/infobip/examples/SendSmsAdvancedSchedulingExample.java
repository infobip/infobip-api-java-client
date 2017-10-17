package infobip.examples;

import infobip.api.client.*;
import infobip.api.config.BasicAuthConfiguration;
import infobip.api.config.Configuration;
import infobip.api.model.Destination;
import infobip.api.model.sms.mt.bulks.BulkRequest;
import infobip.api.model.sms.mt.bulks.BulkResponse;
import infobip.api.model.sms.mt.bulks.status.BulkStatus;
import infobip.api.model.sms.mt.bulks.status.BulkStatusResponse;
import infobip.api.model.sms.mt.bulks.status.UpdateStatusRequest;
import infobip.api.model.sms.mt.send.Message;
import infobip.api.model.sms.mt.send.SMSResponse;
import infobip.api.model.sms.mt.send.SMSResponseDetails;
import infobip.api.model.sms.mt.send.textual.SMSAdvancedTextualRequest;

import java.util.*;

public class SendSmsAdvancedSchedulingExample extends Example {

    private static final Configuration CONFIGURATION = new BasicAuthConfiguration(USERNAME, PASSWORD);

    private static Calendar NOW = Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));

    public static void main(String[] args) {

        SMSResponse smsResponse = sendScheduledMessage();
        String bulkId = smsResponse.getBulkId();
        SMSResponseDetails sentMessageInfo = smsResponse.getMessages().get(0);

        System.out.println("------------------------------------------------");
        System.out.println("Scheduled SMS");
        System.out.println("Message ID: " + sentMessageInfo.getMessageId());
        System.out.println("Bulk ID: " + bulkId);
        System.out.println("Receiver: " + sentMessageInfo.getTo());
        System.out.println("Message status: " + sentMessageInfo.getStatus().getName());
        System.out.println("------------------------------------------------");

        BulkResponse bulkResponse = getBulk(bulkId);
        System.out.println("Fetched scheduling date.");
        System.out.println("Bulk ID: " + bulkResponse.getBulkId());
        System.out.println("SendAt: " + bulkResponse.getSendAt());
        System.out.println("------------------------------------------------");

        rescheduleMessage(bulkId);
        System.out.println("Rescheduling message.");
        System.out.println("------------------------------------------------");

        bulkResponse = getBulk(bulkId);
        System.out.println("Fetched scheduling date after rescheduling.");
        System.out.println("Bulk ID: " + bulkResponse.getBulkId());
        System.out.println("SendAt: " + bulkResponse.getSendAt());
        System.out.println("------------------------------------------------");

        BulkStatusResponse statusResponse = getBulkStatus(bulkId);
        System.out.println("Fetched bulk status.");
        System.out.println("Bulk status: " + statusResponse.getStatus());
        System.out.println("------------------------------------------------");

        if(statusResponse.getStatus() == BulkStatus.PENDING) {
            System.out.println("Fetched bulk is in PENDING status, attempting to cancel bulk.");
            System.out.println("------------------------------------------------");

            cancelBulkStatus(bulkId);

            statusResponse = getBulkStatus(bulkId);
            System.out.println("Fetched bulk status after update.");
            System.out.println("Bulk status: " + statusResponse.getStatus());
        } else {
            System.out.println("Fetched bulk is not in PENDING status, aborting update.");
        }

        System.out.println("------------------------------------------------");
    }

    private static SMSResponse sendScheduledMessage() {
        Destination destination = new Destination();
        destination.setTo(TO);

        Calendar calendar = NOW;
        calendar.add(Calendar.MINUTE, 10);
        Date sendAt = calendar.getTime();

        Message message = new Message();
        message.setDestinations(Collections.singletonList(destination));
        message.setSendAt(sendAt);
        message.setFrom(FROM);
        message.setText(MESSAGE_TEXT);

        SMSAdvancedTextualRequest request = new SMSAdvancedTextualRequest();
        request.setMessages(Collections.singletonList(message));

        return new SendMultipleTextualSmsAdvanced(CONFIGURATION).execute(request);
    }

    private static BulkResponse getBulk(String bulkId) {
        return new GetBulks(CONFIGURATION).execute(bulkId);
    }

    private static void rescheduleMessage(String bulkId) {
        Calendar calendar = NOW;
        calendar.add(Calendar.MINUTE, 30);
        Date sendAt = calendar.getTime();

        BulkRequest rescheduleRequest = new BulkRequest();
        rescheduleRequest.setSendAt(sendAt);

        new RescheduleBulk(CONFIGURATION).execute(bulkId, rescheduleRequest);
    }

    private static BulkStatusResponse getBulkStatus(String bulkId) {
        return new GetBulkStatus(CONFIGURATION).execute(bulkId);
    }

    private static void cancelBulkStatus(String bulkId) {
        UpdateStatusRequest updateStatusRequest = new UpdateStatusRequest();
        updateStatusRequest.setStatus(BulkStatus.CANCELED);

        new ManageBulkStatus(CONFIGURATION).execute(bulkId, updateStatusRequest);
    }
}
