## Email API example
This example demonstrates how to initialize an email client, send a message, and receive a delivery report.  
 
Initialize Send Email API client:
```java
    ApiClient apiClient = new ApiClient();
    apiClient.setApiKeyPrefix(API_KEY_PREFIX);
    apiClient.setApiKey(API_KEY);
    apiClient.setBasePath(URL_BASE_PATH);

    SendEmailApi sendEmailApi = new SendEmailApi(apiClient);
```
Before sending email messages you need to verify the domain with which you will be sending emails.  
 
#### Send Email with file
Fields `from`, `to` and `subject` are required, also the message must contain at least one of these: `text`, `html` or `templateId`.

```java
try {
    File fileAttachment = new File("/path/report.csv");

    EmailSendResponse sendResponse = sendEmailApi
            .sendEmail("Jane Smith <jane.smith@somecompany.com>", "john.smith@somedomain.com", "Mail subject text")
            .text("Test message with a file")
            .attachment(fileAttachment)
            .execute();
} catch (ApiException apiException) {
    // HANDLE THE EXCEPTION
}
```
#### Delivery reports
For each message that you send out, we can send you a delivery report in real-time. 
All you need to do is specify your endpoint when sending email in `notifyUrl` field. 
You can use data models from the library and the pre-configured `com.infobip.JSON` serializer.

Additionally you can use `messageId` or `bulkId` to fetch reports.
```java
    Integer numberOfReportsLimit = 10;
    EmailReportsResult deliveryReports = sendEmailApi.getEmailDeliveryReports(bulkId, messageId, numberOfReportsLimit);
    for (EmailReport report : deliveryReports.getResults()) {
        System.out.println(report.getMessageId() + " - " + report.getStatus().getName());
    }
```

#### Scheduled & verification
Endpoints for managing scheduled email bulks & email validation are covered in `ScheduledEmailApi` & `EmailValidationApi` classes.
