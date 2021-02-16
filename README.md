# Infobip API Java Client

[![Maven Central](https://badgen.net/maven/v/maven-central/com.infobip/infobip-api-java-client?icon=maven)](https://search.maven.org/artifact/com.infobip/infobip-api-java-client)
[![MIT License](https://badgen.net/github/license/infobip/infobip-api-java-client)](https://opensource.org/licenses/MIT)

This is a Java Client for Infobip API and you can use it as a dependency to add [Infobip APIs][apidocs] to your application.
To use this, you'll need an Infobip account. If not already having one, you can create a [free trial][freetrial] account [here][signup].

Built on top of [OpenAPI Specification](https://swagger.io/specification/), powered by [OpenAPI Generator](https://openapi-generator.tech/).

<img src="https://udesigncss.com/wp-content/uploads/2020/01/Infobip-logo-transparent.png" height="124px" alt="Infobip" />

#### Table of contents:
* [Documentation](#documentation)
* [General Info](#general-info)
* [Installation](#installation)
* [Quickstart](#quickstart)
* [Ask for help](#ask-for-help)

## Documentation

Infobip API Documentation can be found [here][apidocs].

## General Info
For `infobip-api-java-client` versioning we use [Semantic Versioning][semver] scheme.

Published under [MIT License][license].

Compiled with Java 8.

## Installation

#### Maven Central
Simply add the following in your project's POM file under `dependencies` tag:
```xml
<dependency>
      <groupId>com.infobip</groupId>
      <artifactId>infobip-api-java-client</artifactId>
      <version>3.0.1</version>
</dependency>
```

#### Compile manually
If you decide to take a manual approach, you need the following installed and available in your `$PATH`:
- Java 8
- [Apache Maven v3.3.4 or greater](https://maven.apache.org/download.cgi)

If you want to compile it yourself, here's how you can achieve that:

    $ git clone git@github.com:infobip/infobip-api-java-client
    $ cd infobip-api-java-client
    $ mvn install       # Requires maven, download from https://maven.apache.org/download.html

#### Build JAR manually
If you want to build your own .jar, execute the following from within the cloned directory:

    $ git clone git@github.com:infobip/infobip-api-java-client
    $ cd infobip-api-java-client
    $ mvn package       # Requires maven, download from https://maven.apache.org/download.html

## Quickstart

#### Initialize the Client

We support multiple authentication methods, e.g. you can use [API Key Header](https://www.infobip.com/docs/essentials/api-authentication#api-key-header), in this case, API_KEY_PREFIX will be "App".

To see your base URL, log in to the [Infobip API Resource][apidocs] hub with your Infobip credentials.

```java
    ApiClient apiClient = new ApiClient();
    apiClient.setApiKeyPrefix(API_KEY_PREFIX);
    apiClient.setApiKey(API_KEY);
    apiClient.setBasePath(URL_BASE_PATH);
```

Also, this library supports automatic retrieval of OAuth 2.0 tokens. To use this, initialize the library with your client credentials.

```java
    ApiClient apiClient = new ApiClient(URL_BASE_PATH, CLIENT_ID, CLIENT_SECRET, Collections.emptyMap());
```

Default `ApiClient` can be set manually in order not to have to provide it manually for API instances.

```java
    Configuration.setDefaultApiClient(apiClient);
```

#### Send an SMS
Simple example for sending an SMS message.

```java
    SendSmsApi sendSmsApi = new SendSmsApi();
    SmsTextualMessage smsMessage = new SmsTextualMessage()
        .from("InfoSMS")
        .addDestinationsItem(new SmsDestination().to("41793026727"))
        .text("This is a dummy SMS message sent using infobip-api-java-client");

    SmsAdvancedTextualRequest smsMessageRequest = new SmsAdvancedTextualRequest().messages(
        Collections.singletonList(smsMessage)
    );
```
```java
    try {
        SmsResponse smsResponse = sendSmsApi.sendSmsMessage(smsMessageRequest);
    } catch (ApiException apiException) {
        // HANDLE THE EXCEPTION
    }
```

Fields provided within `ApiException` object are `code` referring to the HTTP Code response, as well as the `responseHeaders` and `responseBody`.

```java
    apiException.getCode();
    apiException.getResponseHeaders();
    apiException.getResponseBody();
```

Additionally, you can pull out the `bulkId` and `messageId`(s) from `SmsResponse` object and use them to fetch a delivery report for given message or bulk.
Bulk ID will be received only when you send a message to more than one destination address or multiple messages in a single request.

```java
    String bulkId = smsResponse.getBulkId();
    String messageId = smsResponse.getMessages().get(0).getMessageId();
```

#### Receive sent SMS report
For each SMS that you send out, we can send you a message delivery report in real time. All you need to do is specify your endpoint when sending SMS in `notifyUrl` field of `SmsTextualMessage`, or subscribe for reports by contacting our support team.
e.g. `https://{yourDomain}/delivery-reports`

You can use data models from the library and the pre-configured `com.infobip.JSON` serializer.

Example of webhook implementation with Spring Web framework:

```java
    @PostMapping("/delivery-reports")
    public void receiveDr(HttpServletRequest request) throws IOException {
        SmsDeliveryResult reports = new JSON().getGson().fromJson(request.getReader(), SmsDeliveryResult.class);
        for (SmsReport report : reports.getResults()) {
            System.out.println(report.getMessageId() + " - " + report.getStatus().getName());
        }
    }
```
If you prefer to use your own serializer, please pay attention to the supported [date format](https://www.infobip.com/docs/essentials/integration-best-practices#date-formats).

#### Fetching delivery reports
If you are for any reason unable to receive real time delivery reports on your endpoint, you can use `messageId` or `bulkId` to fetch them.
Each request will return a batch of delivery reports - only once.

```java
    Integer numberOfReportsLimit = 10;
    SmsDeliveryResult deliveryReports = sendSmsApi.getOutboundSmsMessageDeliveryReports(bulkId, messageId, numberOfReportsLimit);
    for (SmsReport report : deliveryReports.getResults()) {
        System.out.println(report.getMessageId() + " - " + report.getStatus().getName());
    }
```

#### Unicode & SMS preview
Infobip API supports Unicode characters and automatically detects encoding. Unicode and non-standard GSM characters use additional space, avoid unpleasant surprises and check how different message configurations will affect your message text, number of characters and message parts.

```java
    SmsPreviewResponse previewResponse = sendSmsApi.previewSmsMessage(new SmsPreviewRequest()
        .text("Let's see how many characters will remain unused in this message.")
    );
    System.out.println(previewResponse);
```

#### Receive incoming SMS
If you want to receive SMS messages from your subscribers we can have them delivered to you in real time. When you buy and configure a number capable of receiving SMS, specify your endpoint as explained [here](https://www.infobip.com/docs/api#channels/sms/receive-inbound-sms-messages).
e.g. `https://{yourDomain}/incoming-sms`.

Example of webhook implementation with Spring Web framework:

```java
    @PostMapping("/incoming-sms")
    public void receiveSms(HttpServletRequest request) throws IOException {
        SmsInboundMessageResult messages = new JSON().getGson().fromJson(request.getReader(), SmsInboundMessageResult.class);
        for (SmsInboundMessage message : messages.getResults()) {
            System.out.println(message.getFrom() + " - " + message.getCleanText());
        }
    }
```
#### Two-Factor Authentication (2FA)
For 2FA quick start guide please check [these examples](two-factor-authentication.md).

## Ask for help

Feel free to open issues on the repository for any issue or feature request. As per pull requests, for details check the `CONTRIBUTING` [file][contributing] related to it - in short, we will not merge any pull requests, this code is auto-generated.

If it is, however, something that requires our imminent attention feel free to contact us @ [support@infobip.com](mailto:support@infobip.com).

[apidocs]: https://www.infobip.com/docs/api
[freetrial]: https://www.infobip.com/docs/freetrial
[signup]: https://www.infobip.com/signup
[semver]: https://semver.org
[license]: LICENSE
[contributing]: CONTRIBUTING.md
