# WhatsApp API quickstart

This quick guide aims to help you start with [Infobip WhatsApp API](https://www.infobip.com/docs/api/channels/whatsapp). After reading it, you should know how to use a WhatsApp client, send various types of messages, and receive delivery reports.

The first step is to create an `ApiClient` instance with some configuration.

```java
    ApiClient apiClient = ApiClient.forApiKey(ApiKey.from(API_KEY))
        .withBaseUrl(BaseUrl.from(BASE_URL))
        .build();
```

With that ready, you can now create an instance of `WhatsAppApi` which allows you to send WhatsApp messages.

```java
WhatsAppApi whatsAppApi = new WhatsAppApi(apiClient);
```

## Activate your test sender

Before sending a WhatsApp message you need to activate your sender and connect to our test domain.

Add the **447860099299** Infobip sender to your WhatsApp contacts and send a message containing your Infobip account username.

Alternatively, you can go to our [documentation page][whatsapp-docs-page] for an easier way to do the same thing.

You are now ready to send your first message.

IMPORTANT NOTE: Keep in mind that for test purposes you can only send messages to a number you registered when you created your Infobip account.

## Send your first message

The easiest way to start with WhatsApp messages is to send a template message. Template messages are predefined and structured messages approved by WhatsApp for a specific sender. For other types of messages, the recipient must initiate the conversation.

The Infobip test sender has a lot of predefined templates that you can fetch by using the [GET WhatsApp templates][get-templates-url] endpoint or the equivalent `WhatsAppApi` method `getWhatsappTemplates`.

The example below shows how to use a template named `welcome_multiple_languages` with only one placeholder. 

First, create a `WhatsAppMessage` instance and provide all required data. We'll use `en` as a language parameter here, but you can change it to any defined in the template. 

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

The next step is to create a `WhatsAppBulkMessage` instance that serves as a container for multiple messages. Just like the one we've created above.

```java
    WhatsAppBulkMessage bulkMessage = new WhatsAppBulkMessage()
        .addMessagesItem(message);
```

Finally, we can send the message invoking the appropriate send method and store the results in a new variable.

```java
    WhatsAppBulkMessageInfo messageInfo = whatsAppApi
        .sendWhatsAppTemplateMessage(bulkMessage)
        .execute();
```

Once the invocation finishes, you can inspect the results and print a status description, as shown below.

```java
    System.out.println(messageInfo.getMessages().get(0).getStatus().getDescription());
```

## Send another template message

To send another message, we will choose a bit more complex template example called `back_in_stock`.
This time we'll start with creating a `WhatsAppTemplateContent` instance for better readability.

```java
    WhatsAppTemplateContent content = new WhatsAppTemplateContent()
        .language("en")
        .templateName("back_in_stock")
        .templateData(new WhatsAppTemplateDataContent()
            .header(new WhatsAppTemplateImageHeaderContent()
                    .mediaUrl("https://api.infobip.com/ott/1/media/infobipLogo")
            ).body(new WhatsAppTemplateBodyContent()
                    .addPlaceholdersItem("<PUT YOUR NAME>")
                    .addPlaceholdersItem("<PUT THE ITEM NAME")
            ).addButtonsItem(new WhatsAppTemplateQuickReplyButtonContent()
                    .parameter("yes")
            )
        );
```

Once it's all prepared, we can create a `WhatsAppBulkMessage` instance and provide the above-created object as its `content` field.
The rest is the same as in the previous example. We are using the `whatsAppApi` instance created at the beginning and invoke a send method.

```java
    WhatsAppBulkMessage bulkMessage = new WhatsAppBulkMessage()
        .addMessagesItem(new WhatsAppMessage()
                .from("447860099299")
                .to("<PUT YOUR NUMBER>")
                .content(content)
        );

    WhatsAppBulkMessageInfo messageInfo = whatsAppApi
        .sendWhatsAppTemplateMessage(bulkMessage)
        .execute();;

    System.out.println(messageInfo.getMessages().get(0).getStatus().getDescription());
```

## Respond to user-initiated messages

As mentioned above, you are not restricted to only sending template messages.
You may respond to a user-initiated message with any type of message within 24 hours of receiving the message.
So, for sending freestyle messages you have to initiate WhatsApp conversation from your registered number.

```java
    WhatsAppTextMessage textMessage = new WhatsAppTextMessage()
            .from("447860099299")
            .to("<PUT YOUR NUMBER>")
            .content(new WhatsAppTextContent()
                    .text("This is my first WhatsApp message sent using Infobip API client library")
            );

    WhatsAppApi whatsAppApi = new WhatsAppApi(apiClient);
    WhatsAppSingleMessageInfo messageInfo = whatsAppApi.sendWhatsAppTextMessage(textMessage).execute();

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
        WhatsAppWebhookInboundMessageResult messages = new JSON().deserialize(request.getInputStream(), WhatsAppWebhookInboundMessageResult.class);
        for (WhatsAppWebhookInboundMessageData messageData : messages.getResults()) {
            WhatsAppWebhookInboundMessage message = messageData.getMessage();
            String text;
            switch (message.getType()) {
                case TEXT:
                    text = ((WhatsAppWebhookInboundTextMessage) message).getText();
                    break;
                case IMAGE:
                    text = ((WhatsAppWebhookInboundImageMessage) message).getCaption();
                    break;
                case DOCUMENT:
                    text = ((WhatsAppWebhookInboundDocumentMessage) message).getCaption();
                    break;
                case LOCATION:
                    text = ((WhatsAppWebhookInboundLocationMessage) message).getAddress();
                    break;
                /*
                      Remaining cases for not covered message types
                 */
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
