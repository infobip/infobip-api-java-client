Infobip API Java client
============================

Prerequisites
-------------

You have installed [Java](https://java.com/en/download/) (minimal required version is Java 7).

Installation
-----------

It is recommended that you use a dependency management system to get started with using Infobip Java API client in your 
project.
You can choose between [Maven](https://maven.apache.org/) and  [Gradle](https://gradle.org/). Depending on your 
choice find the appropriate configuration below.

### Maven configuration
For using the API client in your maven project add the following snippet to the <code>\<dependencies></code> section 
of your <code>pom.xml</code> file:
```
<dependency>
    <groupId>com.infobip</groupId>
    <artifactId>infobip-api-java-client</artifactId>
    <version>2.0.0</version>
</dependency>
```

### Gradle configuration
For adding the API client to your gradle project add the following line to the <code>dependencies</code> section 
of your <code>build.gradle</code> file:
```
compile "com.infobip:infobip-api-java-client:2.0.0"
```

###Manual dependency management
If you choose not to use any tool for dependency management you can still use the Infobip API client. A <code>
.jar</code>
 with the API client and all of its dependencies can be found at [maven central repository](https://search.maven.org/#search%7Cga%7C1%7Cinfobip-api-java-client).  
From the list there click on <code>jar-with-dependencies.jar</code> link to download the <code>.jar</code> file that you
 can manually integrate into your project.

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
