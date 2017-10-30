package infobip.examples;

import infobip.api.client.LogEndTag;
import infobip.api.config.BasicAuthConfiguration;
import infobip.api.model.conversion.EndTagResponse;

public class LogEndTagExample extends Example {

    public static void main(String[] args) {

        LogEndTag client = new LogEndTag(new BasicAuthConfiguration(USERNAME, PASSWORD));

        String messageId = "MESSAGE-ID";

        EndTagResponse response = client.execute(messageId);

        System.out.println("processKey: " + response.getProcessKey());
    }
}
