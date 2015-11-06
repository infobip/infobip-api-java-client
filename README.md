Infobip API Java client
============================

Running examples
----------------

First, setup your username and password in `infobip.examples.Example`. Then, you can run provided examples in 
`infobip.examples` package

Basic messaging example
-----------------------

First, initialize the messaging client using your username and password:

    SendSingleTextualSms client = new SendSingleTextualSms(new BasicAuthConfiguration(USERNAME, PASSWORD));

Prepare the message:

    SMSTextualRequest requestBody = new SMSTextualRequest();
    requestBody.setFrom(FROM);
    requestBody.setTo(Arrays.asList("xxxxxxxx", "yyyyyyyy"));
    requestBody.setText("This is an example message");

Send the message:

    SMSResponse response = client.execute(requestBody);

Later you can query for the delivery status of the message:

     GetSentSmsDeliveryReports client = new GetSentSmsDeliveryReports(new BasicAuthConfiguration(USERNAME, PASSWORD));
     SMSReportResponse response = client.execute(BULK_ID, MESSAGE_ID, LIMIT);

Messaging with delivery report push to notification URL example
-----------------------

Similar to standard messaging example, but when preparing your message, use `SMSAdvancedTextualRequest`:

    SendMultipleTextualSmsAdvanced client = new SendMultipleTextualSmsAdvanced(new BasicAuthConfiguration(USERNAME, PASSWORD));

    Destination destination = new Destination();
    destination.setTo("xxxxxxxx");

    Message message = new Message();
    message.setFrom(FROM);
    message.setDestinations(Collections.singletonList(destination));
    message.setText(MESSAGE_TEXT);
    message.setNotifyUrl("NOTIFY_URL");

    SMSAdvancedTextualRequest requestBody = new SMSAdvancedTextualRequest();
    requestBody.setMessages(Collections.singletonList(message));

    SMSResponse response = client.execute(requestBody);


When the delivery notification is pushed to your server as a HTTP POST request, you can process the body of the message with the following code:

    SMSReportResponse smsReportResponse = gson.fromJson(requestBody, SMSReportResponse.class);

License
-------

This library is licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0)
