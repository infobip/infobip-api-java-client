package infobip.examples;

import infobip.api.client.SendMultipleTextualSmsAdvanced;
import infobip.api.config.BasicAuthConfiguration;
import infobip.api.model.Destination;
import infobip.api.model.sms.mt.send.*;
import infobip.api.model.sms.mt.send.textual.SMSAdvancedTextualRequest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SendSmsAdvancedDeliveryTimeWindowExample extends Example {

    public static void main(String[] args) {

        SendMultipleTextualSmsAdvanced client = new SendMultipleTextualSmsAdvanced(new BasicAuthConfiguration(USERNAME, PASSWORD));

        Destination destination = new Destination();
        destination.setTo(TO);

        Message message = new Message();
        message.setFrom(FROM);
        message.setDestinations(Collections.singletonList(destination));
        message.setText(MESSAGE_TEXT);
        message.setDeliveryTimeWindow(generateDeliveryTimeWindow());

        SMSAdvancedTextualRequest requestBody = new SMSAdvancedTextualRequest();
        requestBody.setMessages(Collections.singletonList(message));

        SMSResponse response = client.execute(requestBody);

        for (SMSResponseDetails sentMessageInfo : response.getMessages()) {
            System.out.println("Message ID: " + sentMessageInfo.getMessageId());
            System.out.println("Receiver: " + sentMessageInfo.getTo());
            System.out.println("Message status: " + sentMessageInfo.getStatus().getName());
        }
    }

    private static DeliveryTimeWindow generateDeliveryTimeWindow() {

        DeliveryTime deliveryTimeFrom = new DeliveryTime();
        deliveryTimeFrom.setHour(9);
        deliveryTimeFrom.setMinute(30);

        DeliveryTime deliveryTimeTo = new DeliveryTime();
        deliveryTimeTo.setHour(19);
        deliveryTimeTo.setMinute(30);

        List<DeliveryDay> deliveryDayList = Arrays.asList(
                DeliveryDay.MONDAY,
                DeliveryDay.TUESDAY,
                DeliveryDay.WEDNESDAY,
                DeliveryDay.THURSDAY,
                DeliveryDay.FRIDAY,
                DeliveryDay.SATURDAY,
                DeliveryDay.SUNDAY
        );

        DeliveryTimeWindow deliveryTimeWindow = new DeliveryTimeWindow();
        deliveryTimeWindow.setFrom(deliveryTimeFrom);
        deliveryTimeWindow.setTo(deliveryTimeTo);
        deliveryTimeWindow.setDays(deliveryDayList);
        return deliveryTimeWindow;
    }
}