# Messages API quickstart

This quick guide aims to help you start with [Infobip Messages API](https://www.infobip.com/docs/api/platform/messages-api/sending-message/send-messages-api-message). After reading it, you should know how to use Messages API, send various types of messages, receive incoming messages, and receive delivery reports.

Messages API supports 11 different channels: SMS, MMS, RCS, WhatsApp, Viber Business Messages, Viber Bots, Apple Messages for Business, Google Business Messages, Instagram Direct Messages, Messenger, and LINE Official Notification.

The first step is to create an `ApiClient` instance with some configuration.

````java
    ApiClient apiClient = ApiClient.forApiKey(ApiKey.from(API_KEY))
        .withBaseUrl(BaseUrl.from(BASE_URL))
        .build();
````

With that ready, you can now create an instance of `MessagesApi` which allows you to send messages using Messages API.

````java
    MessagesApi messagesApi = new MessagesApi(apiClient);
````

## Activate your test senders

Before sending a message using Messages API, you need to activate your sender(s) and connect to our test domain.

Here you can find the example on how to activate and use **WhatsApp and SMS channels**.

To activate the WhatsApp test sender, add the **447860099299** Infobip sender to your WhatsApp contacts and send a message containing your Infobip account username.

To use the SMS test sender, simply send a message by using **InfoSMS** sender.

You are now ready to send your first message.

**IMPORTANT NOTE:** Keep in mind that for test purposes you can only send messages to a number you registered when you created your Infobip account.

## Send your first message

The easiest way to start with Messages API is to send a text message. First you need to prepare the message you want to send, like on snippet below:

````java
    MessagesApiMessage messagesApiMessage = new MessagesApiMessage()
                .channel(MessagesApiOutboundMessageChannel.SMS)
                .sender("48123234567")
                .destinations(
                        List.of(
                                new MessagesApiToDestination()
                                        .to("447491163443")
                        )
                )
                .content(
                        new MessagesApiMessageContent()
                                .body(
                                        new MessagesApiMessageTextBody()
                                                .text("Sent using Infobip's Java client library!")
                                )
                );

    MessagesApiRequest messagesApiRequest = new MessagesApiRequest()
                .addMessagesItem(messagesApiMessage);
````

Send the message invoking the appropriate send method and store the results in a new variable.

````java
    MessagesApiResponse messageInfo = null;
    try {
        messageInfo = messagesApi
            .sendMessagesApiMessage(messagesApiRequest)
            .execute();
    } catch (ApiException apiException) {
        // HANDLE THE EXCEPTION
    }
    
````

Once the invocation finishes, you can inspect the results and print a status description, as shown below.

````java
    System.out.println(messageInfo.getMessages().get(0).getStatus().getDescription());
````

## How to receive messages

To receive messages using Messages API you must set up the webhook.

Basically, that is just an endpoint implemented on your side where you will accept the requests when a new message arrives. That endpoint will be called by the Infobip API whenever we receive an incoming message for your registered sender(s).

```java
    @PostMapping("/incoming-messages")
    public void receiveMessages(HttpServletRequest request) throws IOException {
        MessagesApiIncomingMessage messages = new JSON().deserialize(request.inputStream(), MessagesApiIncomingMessage.class);
        for (MessagesApiInboundEvent messageData : messages.getResults()) {
            switch (messageData.getEvent()) {
                case MO:
                    MessagesApiWebhookEvent messagesApiWebhookEvent = ((MessagesApiWebhookEvent) messageData);
                    // INSERT YOUR PROCESSING LOGIC HERE
                    break;
                case TYPING_STARTED:
                    MessagesApiInboundTypingStartedEvent messagesApiInboundTypingStartedEvent = ((MessagesApiInboundTypingStartedEvent) messageData);
                    // INSERT YOUR PROCESSING LOGIC HERE
                    break;
                case TYPING_STOPPED:
                    MessagesApiInboundTypingStoppedEvent messagesApiInboundTypingStoppedEvent = ((MessagesApiInboundTypingStoppedEvent) messageData);
                    // INSERT YOUR PROCESSING LOGIC HERE
                    break;
                default:
                    throw new IllegalArgumentException("Unexpected message type!");
                    break;
            }
        }
    }
```

You can find more details about the structure of the message you can expect on your endpoint on [docs page](https://www.infobip.com/docs/api/platform/messages-api/incoming-message/receive-messages-api-incoming-messages).

## How to receive delivery reports

For each message that you send out, you can get a message delivery report in real time. Subscribe for reports by contacting our support team at <support@infobip.com>. e.g. `https://{yourDomain}/delivery-reports`

```java
    @PostMapping("/delivery-reports")
    public void receiveDeliveryReports(HttpServletRequest request) throws IOException {
        MessagesApiDeliveryReport reports = new JSON().deserialize(request.getInputStream(), MessagesApiDeliveryReport.class);
        for (MessagesApiDeliveryResult result : reports.getResults()) {
            System.out.println(result.getMessageId() + " - " + result.getStatus().getName());
        }
    }
```

## Use adaptationMode to automatically modify message types

Enhance your Messages API requests by using the `adaptationMode` parameter. It allows you to send messages even if they are unsupported by the channel.

When you set adaptationMode to `true,` Messages API automatically adjusts the message to remove any unsupported elements, ensuring successful delivery.

For instance, if you'd like to include an image in your WhatsApp and SMS messages, set adaptationMode to 'true'. Messages API will handle the delivery for WhatsApp as a message containing an image, while for SMS will provide a link to the image.

On the other hand, if you set adaptationMode to 'false' and try to send a message with an unsupported element to a channel, an error will occur. Make sure to choose the right setting based on your specific channel and content requirements.