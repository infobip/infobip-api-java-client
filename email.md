# Email API example

This example demonstrates how to use the [Infobip Email API](https://www.infobip.com/docs/api/channels/email). You'll learn how to initialize an email client,
send a message, and receive a delivery report.

Initialize Send Email API client:

```java
    ApiClient apiClient = ApiClient.forApiKey(ApiKey.from(API_KEY))
        .withBaseUrl(BaseUrl.from(BASE_URL))
        .build();

    EmailApi emailApi = new EmailApi(apiClient);
```

Before sending an email message, you need to verify the domain with which you will be sending emails.

## Send an Email with a file

Fields `from`, `to`, and `subject` are required. The message must also contain at least one of these: `text`, `html`, or `templateId`.

---
**IMPORTANT NOTE**

Keep in mind the following restrictions while using a trial account:

- you can only send messages to verified email addresses,
- you can only use your email address with the Infobip test domain in the following form: `YourUserName@selfserviceib.com`

---

```java
    File fileAttachment = new File("/path/report.csv");

    EmailSendResponse sendResponse = emailApi
        .sendEmail(List.of("john.smith@somedomain.com"))
        .from("Jane Smith <jane.smith@somecompany.com>")
        .subject("Mail subject text")
        .text("Test message with a file")
        .attachment(List.of(fileAttachment))
        .execute();
```

## Delivery reports

For each message that you send out, we can send you a delivery report in real time.
All you need to do is specify your endpoint when sending email in the `notifyUrl` field.
You can use data models from the library and the pre-configured `com.infobip.JSON` serializer.

Additionally, you can use a `messageId` or a `bulkId` autogenerated in a response for troubleshooting and to fetch reports.

```java
    String bulkId = "BULK-ID-123-xyz";
    Integer numberOfReportsLimit = 10;
    
    EmailReportsResult deliveryReports = emailApi
        .getEmailDeliveryReports()
        .bulkId(bulkId)
        .limit(numberOfReportsLimit)
        .execute();

    for (EmailReport report : deliveryReports.getResults()) {
        System.out.println(report.getMessageId() + " - " + report.getStatus().getName());
    }
```
