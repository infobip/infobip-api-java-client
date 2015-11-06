package infobip.examples;

import infobip.api.client.SendSingleTextualSms;
import infobip.api.config.BasicAuthConfiguration;
import infobip.api.model.sms.mt.send.SMSResponse;
import infobip.api.model.sms.mt.send.SMSResponseDetails;
import infobip.api.model.sms.mt.send.textual.SMSTextualRequest;

import java.util.Arrays;

/**
 * Created by milosmilakovic on 9/23/15.
 */
public class SendSmsExample extends Example {

    public static void main(String[] args) {
        SendSingleTextualSms client = new SendSingleTextualSms(new BasicAuthConfiguration(USERNAME, PASSWORD));

        SMSTextualRequest requestBody = new SMSTextualRequest();
        requestBody.setFrom(FROM);
        requestBody.setTo(Arrays.asList("41793026731", "41793026727"));
        requestBody.setText(MESSAGE_TEXT);

        SMSResponse response = client.execute(requestBody);

        SMSResponseDetails sentMessageInfo = response.getMessages().get(0);
        System.out.println("Message ID: " + sentMessageInfo.getMessageId());
        System.out.println("Receiver: " + sentMessageInfo.getTo());
        System.out.println("Message status: " + sentMessageInfo.getStatus().getName());
    }
}
