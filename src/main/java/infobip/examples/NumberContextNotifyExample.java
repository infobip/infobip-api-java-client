package infobip.examples;

import infobip.api.client.NumberContextNotify;
import infobip.api.config.BasicAuthConfiguration;
import infobip.api.model.nc.notify.NumberContextRequest;
import infobip.api.model.nc.notify.NumberContextResponse;
import infobip.api.model.nc.notify.NumberContextResponseDetails;

import java.util.Collections;

public class NumberContextNotifyExample extends Example {

    public static void main(String[] args) {

        NumberContextNotify client = new NumberContextNotify(new BasicAuthConfiguration(USERNAME, PASSWORD));

        NumberContextRequest requestBody = new NumberContextRequest();
        requestBody.setTo(Collections.singletonList("41793026731"));
        requestBody.setNotifyUrl(NOTIFY_URL);

        NumberContextResponse response = client.execute(requestBody);

        for (NumberContextResponseDetails sentRequestInfo : response.getResults()) {
            System.out.println("Message ID: " + sentRequestInfo.getMessageId());
            System.out.println("Phone number:: " + sentRequestInfo.getTo());
            System.out.println("Message status: " + sentRequestInfo.getStatus().getName());
        }
    }
}
