package infobip.examples;

import infobip.api.client.SendMultipleTextualSmsAdvanced;
import infobip.api.config.BasicAuthConfiguration;
import infobip.api.model.Destination;
import infobip.api.model.sms.mt.send.Message;
import infobip.api.model.sms.mt.send.SMSResponse;
import infobip.api.model.sms.mt.send.SMSResponseDetails;
import infobip.api.model.sms.mt.send.textual.SMSAdvancedTextualRequest;

import java.util.Collections;

/**
 * Created by milosmilakovic on 9/23/15.
 */
public class SendSmsAdvancedNotifyExample extends Example {

    public static void main(String[] args) {
        SendMultipleTextualSmsAdvanced client = new SendMultipleTextualSmsAdvanced(
                new BasicAuthConfiguration(USERNAME, PASSWORD));
        Destination destination = new Destination();
        destination.setTo("41793026731");

        Message message = new Message();
        message.setFrom(FROM);
        message.setDestinations(Collections.singletonList(destination));
        message.setText(MESSAGE_TEXT);
        message.setNotifyUrl(NOTIFY_URL);

        SMSAdvancedTextualRequest requestBody = new SMSAdvancedTextualRequest();
        requestBody.setMessages(Collections.singletonList(message));

        SMSResponse response = client.execute(requestBody);

        SMSResponseDetails sentMessageInfo = response.getMessages().get(0);
        System.out.println("Message ID: " + sentMessageInfo.getMessageId());
        System.out.println("Receiver: " + sentMessageInfo.getTo());
        System.out.println("Message status: " + sentMessageInfo.getStatus().getName());
    }
}