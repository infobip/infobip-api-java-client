## WhatsApp API quickstart
This quick guide aims to help you start with Infobip WhatsApp API. After reading it, you should know how to use a WhatsApp client, send various types of messages, and receive delivery reports.

The first step is to create an `ApiClient` instance with some configuration.
```java
    ApiClient apiClient = new ApiClient();
    apiClient.setApiKeyPrefix(API_KEY_PREFIX);
    apiClient.setApiKey(API_KEY);
    apiClient.setBasePath(URL_BASE_PATH);
```
With that ready, you can now create an instance of `SendWhatsAppApi` which allows you to send WhatsApp messages.

```java
SendWhatsAppApi whatsAppApi = new SendWhatsAppApi(apiClient);
```

### Activate your test sender
Before sending WhatsApp messages you need to activate your sender and connect to our test domain.

Just add **447860099299** Infobip sender to your WhatsApp contacts and send a message containing your Infobip account username. 

Or you can go to the [docs page][whatsapp-docs-page] for an easier way to do the same thing.

You are now ready to send your first message.

IMPORTANT NOTE: Keep in mind that for test purposes you can only send messages to registered numbers.

### Send your first message

The easiest way to start with WhatsApp messages is to send template messages. Because for other types of messages the recipient must initiate the conversation.
Template messages are a predefined and structured type of messages approved by WhatsApp for a certain sender.
So, it is the easiest way to get started.

Infobip test sender has a lot of predefined templates that you can fetch by using this [endpoint][get-templates-url].

The example below shows how to use a template named `welcome_multiple_languages` with only one placeholder. 
First, create an instance of `WhatsAppMessage` and provide all required data like recipient number as to parameter. We use `en` as a language parameter here, but you can change it to a few others predefined in templates. 
```java
    WhatsAppMessage message = new WhatsAppMessage()
        .from("447860099299")
        .to("<PUT YOUR NUMBER>")
        .content(new WhatsAppTemplateContent()
                .language("en")
                .templateName("welcome_multiple_languages")
                .templateData(new WhatsAppTemplateDataContent()
                        .body(new WhatsAppTemplateBodyContent()
                                .addPlaceholdersItem("<PUT YOUR NAME>")
                        )
                )
        );
```
The next step is to create `WhatsAppBulkMessage` instance that serves as a container for multiple messages like we created above.
```java
    WhatsAppBulkMessage bulkMessage = new WhatsAppBulkMessage()
        .addMessagesItem(message);
```
Next, create an instance of WhatsApp API client and pass it the configuration instance created at the beginning.
```java
    SendWhatsAppApi whatsAppApi = new SendWhatsAppApi(apiClient);
```

And finally, we can send the message invoking the appropriate send method and store the result new variable.
```java
    WhatsAppBulkMessageInfo messageInfo = whatsAppApi.sendWhatsAppTemplateMessage(bulkMessage);
```

After invocation finishes, you can inspect the result and print, for example, a status description like shown below.
```java
    System.out.println(messageInfo.getMessages().get(0).getStatus().getDescription());
```

### Send another template message

For sending another message we will choose a bit more complex template example called `registration_success`.
This time we, start with creating an instance of `WhatsAppTemplateContent` just because it is more readable.

```java
    WhatsAppTemplateContent content = new WhatsAppTemplateContent()
        .language("en")
        .templateName("registration_success")
        .templateData(new WhatsAppTemplateDataContent()
                .header(new WhatsAppTemplateDocumentHeaderContent()
                        .mediaUrl("https://api.infobip.com/ott/1/media/infobipLogo")
                        .type("IMAGE")
                )
                .body(new WhatsAppTemplateBodyContent()
                        .addPlaceholdersItem("<PUT YOUR NAME>")
                        .addPlaceholdersItem("WhatsApp message")
                        .addPlaceholdersItem("delivered")
                        .addPlaceholdersItem("exploring Infobip API")
                )
                .addButtonsItem(new WhatsAppTemplateQuickReplyButtonContent()
                        .parameter("Yes")
                        .type("QUICK_REPLY"))
                .addButtonsItem(new WhatsAppTemplateQuickReplyButtonContent()
                        .parameter("No")
                        .type("QUICK_REPLY"))
                .addButtonsItem(new WhatsAppTemplateQuickReplyButtonContent()
                        .parameter("Later")
                        .type("QUICK_REPLY"))
        );
```
With that prepared now, we can create an instance of `WhatsAppBulkMessage` and provide the above-created object as its `content` field.
The rest is the same as in the previous example. We are using the `apiClient` instance created at the beginning and invoke send method.
```java
    WhatsAppBulkMessage bulkMessage = new WhatsAppBulkMessage()
        .addMessagesItem(new WhatsAppMessage()
                .from("447860099299")
                .to("<PUT YOUR NUMBER>")
                .content(content)
        );

    SendWhatsAppApi whatsAppApi = new SendWhatsAppApi(apiClient);
    WhatsAppBulkMessageInfo messageInfo = whatsAppApi.sendWhatsAppTemplateMessage(bulkMessage);

    System.out.println(messageInfo.getMessages().get(0).getStatus().getDescription());
```

### Responding to user-initiated messages
You are not restricted to sending only template messages.
You may respond to user messages with any type of message within 24 hours of message receipt.
So, for sending freestyle messages you have to initiate WhatsApp conversation from your registered number.

```java
    WhatsAppTextMessage textMessage = new WhatsAppTextMessage()
            .from("447860099299")
            .to("<PUT YOUR NUMBER>")
            .content(new WhatsAppTextContent()
                    .text("This is my first WhatsApp message sent using Infobip API client library")
            );

    SendWhatsAppApi whatsAppApi = new SendWhatsAppApi(apiClient);
    WhatsAppSingleMessageInfo messageInfo = whatsAppApi.sendWhatsAppTextMessage(textMessage);

    System.out.println(messageInfo.getStatus().getDescription());
```
Before you sending messages you may want to reactivate your sender by sending STOP and then your Infobip account username to start it again.

### How to receive messages
To receive WhatsApp messages you have to set up the webhook.

Basically, that is just an endpoint implemented on your side where you will accept the requests when a new message arrives.
That endpoint will be called by the Infobip API whenever we receive an incoming message for your registered sender.

You can find more details about the structure of the message you can expect on your endpoint on our [docs page][receive-webhook-url]..

```java
    @PostMapping("/incoming-whatsapp")
    public void receiveWhatsApp(HttpServletRequest request) throws IOException {
        WhatsAppInboundMessageResult messages = new JSON().getGson().fromJson(request.getReader(), WhatsAppInboundMessageResult.class);
        for (WhatsAppInboundMessageData messageData : messages.getResults()) {
            WhatsAppInboundMessage message = messageData.getMessage();
            String text;
            switch (message.getType()) {
                case TEXT:
                    text = ((WhatsAppInboundTextMessage) message).getText();
                    break;
                case IMAGE:
                    text = ((WhatsAppInboundImageMessage) message).getCaption();
                    break;
                case DOCUMENT:
                    text = ((WhatsAppInboundDocumentMessage) message).getCaption();
                    break;
                case LOCATION:
                    text = ((WhatsAppInboundLocationMessage) message).getAddress();
                    break;
                case CONTACT:
                    WhatsAppName name = ((WhatsAppInboundContactMessage) message).getContacts().get(0).getName();
                    text = name.getFirstName() + " " + name.getLastName();
                    break;
                default:
                    text = "Unexpected message type!";
                    break;
            }
            System.out.println("From: " + messageData.getFrom() + " - " + text);
        }
    }
```
[get-templates-url]: https://www.infobip.com/docs/api#channels/whatsapp/get-whatsapp-templates
[receive-webhook-url]: https://www.infobip.com/docs/api#channels/whatsapp/receive-whatsapp-inbound-messages
[whatsapp-docs-page]: https://www.infobip.com/docs/api#channels/whatsapp
