# Infobip API Java Client

![Java](https://img.shields.io/badge/java-11%2B-blue)
[![Maven Central](https://badgen.net/maven/v/maven-central/com.infobip/infobip-api-java-client?icon=maven)](https://search.maven.org/artifact/com.infobip/infobip-api-java-client)
[![Snyk](https://snyk.io/test/github/infobip/infobip-api-java-client/badge.svg)](https://snyk.io/test/github/infobip/infobip-api-java-client)
[![MIT License](https://badgen.net/github/license/infobip/infobip-api-java-client)](https://opensource.org/licenses/MIT)

This is a Java Client for Infobip API and you can use it as a dependency when you want to consume [Infobip APIs][apidocs] in your application.
To use this, you'll need an Infobip account. You can create a [free trial][freetrial] account [here][signup].

`infobip-api-java-client` is built on top of [OpenAPI Specification](https://spec.openapis.org/oas/latest.html), generated by [Infobip OSCAR](https://www.youtube.com/watch?v=XC8oVn_efTw) service powered by [OpenAPI Generator](https://openapi-generator.tech/).

<br/>
<img src="https://cdn-web.infobip.com/uploads/2023/01/Infobip-logo.svg" height="48px" alt="Infobip" />

#### Table of contents:
* [Documentation](#documentation)
* [General Info](#general-info)
* [Installation](#installation)
* [Quickstart](#quickstart)
* [Ask for help](#ask-for-help)

## Documentation

Detailed documentation about Infobip API can be found [here][apidocs].
The current version of this library includes this subset of Infobip products:
* [SMS](https://www.infobip.com/docs/api/channels/sms)
* [MMS](https://www.infobip.com/docs/api/channels/mms)
* [Voice](https://www.infobip.com/docs/api/channels/voice)
* [WebRTC](https://www.infobip.com/docs/api/channels/webrtc)
* [Email](https://www.infobip.com/docs/api/channels/email)
* [WhatsApp](https://www.infobip.com/docs/api/channels/whatsapp)
* [Viber](https://www.infobip.com/docs/api/channels/viber)
* [Messages API](https://www.infobip.com/docs/api/platform/messages-api)

## General Info
For `infobip-api-java-client` versioning we use [Semantic Versioning][semver] scheme.

Published under [MIT License][license].

The library requires Java 11 and is compatible up to and including Java 19.

## Installation

#### Maven Central
Simply add the following in your project's POM file under `dependencies` tag:
```xml
<dependency>
      <groupId>com.infobip</groupId>
      <artifactId>infobip-api-java-client</artifactId>
      <version>4.4.0</version>
</dependency>
```

#### Build manually
If you decide to take a manual approach, you need the following installed and available in your `$PATH`:
- JDK 11 or above
- [Apache Maven](https://maven.apache.org/download.cgi)

Proceed with the following:

    $ git clone git@github.com:infobip/infobip-api-java-client
    $ cd infobip-api-java-client
    $ mvn install       # Requires maven, download from https://maven.apache.org/download.html

## Quickstart

#### Initialize the Client

The library supports the [API Key Header](https://www.infobip.com/docs/essentials/api-authentication#api-key-header) authentication method.
Once you have an [Infobip account](https://www.infobip.com/signup), you can manage your API keys through the Infobip [API key management](https://portal.infobip.com/settings/accounts/api-keys) page.

To see your base URL, log in to the [Infobip API Resource][apidocs] hub with your Infobip credentials or visit your [Infobip account](https://portal.infobip.com/homepage/).

```java
    ApiClient apiClient = ApiClient.forApiKey(ApiKey.from(API_KEY))
        .withBaseUrl(BaseUrl.from(BASE_URL))
        .build();
```

For details, check the [ApiClient](https://github.com/infobip/infobip-api-java-client/blob/master/src/main/java/com/infobip/ApiClient.java) source code.

#### Send an SMS
See below, a simple example of sending a single SMS message to a single recipient.

```java
    SmsApi smsApi = new SmsApi(apiClient);
    SmsTextualMessage smsMessage = new SmsTextualMessage()
        .from("InfoSMS")
        .addDestinationsItem(new SmsDestination().to("41793026727"))
        .text("Hello World from infobip-api-java-client!");

    SmsAdvancedTextualRequest smsMessageRequest = new SmsAdvancedTextualRequest()
        .messages(List.of(smsMessage));
```
```java
    try {
        SmsResponse smsResponse = smsApi.sendSmsMessage(smsMessageRequest).execute();
    } catch (ApiException apiException) {
        // HANDLE THE EXCEPTION
    }
```

For asynchronous processing, you can use the following approach:
```java
    smsApi.sendSmsMessage(smsMessageRequest)
        .executeAsync(new ApiCallback<>() {
            @Override
            public void onSuccess(SmsResponse result, int responseStatusCode, Map<String, List<String>> responseHeaders) {
                // HANDLE THE SUCCESS
            }

            @Override
            public void onFailure(ApiException exception, int responseStatusCode, Map<String, List<String>> responseHeaders) {
                // HANDLE THE FAILURE
            }
        });
```

Fields provided within `ApiException` object are `responseStatusCode` referring to a HTTP status code response, as well as the `rawResponseBody` and `details` extracted from the response body if possible.

```java
    apiException.responseStatusCode();
    apiException.rawResponseBody();
    apiException.details();
```

Additionally, you can retrieve a `bulkId` and a `messageId` from the `SmsResponse` object to use for troubleshooting or fetching a delivery report for a given message or a bulk.
Bulk ID is received only when you send a message to more than one destination address or send multiple messages in a single request.

```java
    String bulkId = smsResponse.getBulkId();
    String messageId = smsResponse.getMessages().get(0).getMessageId();
```

#### Receive sent SMS report
For each SMS that you send out, we can send you a message delivery report in real time. All you need to do is specify your endpoint when sending SMS in the `notifyUrl` field within `SmsTextualMessage`, or subscribe for reports by contacting our support team at support@infobip.com.
e.g. `https://{yourDomain}/delivery-reports`

You can use data models from the library and the pre-configured `com.infobip.JSON` serializer.

Example of webhook implementation with Spring Web framework:

```java
    @PostMapping("/delivery-reports")
    public void receiveDeliveryReports(HttpServletRequest request) throws IOException {
        SmsDeliveryResult reports = new JSON().deserialize(request.getInputStream(), SmsDeliveryResult.class);
        for (SmsReport report : reports.getResults()) {
            System.out.println(report.getMessageId() + " - " + report.getStatus().getName());
        }
    }
```
If you prefer to use your own serializer, make note of the supported [date format](https://www.infobip.com/docs/essentials/integration-best-practices#date-formats).
You can always take a look at our [implementation](https://github.com/infobip/infobip-api-java-client/blob/master/src/main/java/com/infobip/JSON.java).

#### Fetching delivery reports
If you are for any reason unable to receive real-time delivery reports on your endpoint, you can use `messageId` or `bulkId` to fetch them.
Each request will return a batch of delivery reports - only once. See [documentation](https://www.infobip.com/docs/api/channels/sms/sms-messaging/logs-and-status-reports/get-outbound-sms-message-delivery-reports) for more details.

```java
    SmsDeliveryResult deliveryReports = smsApi.getOutboundSmsMessageDeliveryReports()
            .bulkId(bulkId)
            .execute();
    for (SmsReport report : deliveryReports.getResults()) {
        System.out.println(report.getMessageId() + " - " + report.getStatus().getName());
    }
```

#### Unicode & SMS preview
Infobip API supports Unicode characters and automatically detects encoding. Unicode and non-standard GSM characters use additional space, avoid unpleasant surprises and check how different message configurations will affect your message text, number of characters, and message parts.

```java
    SmsPreviewRequest smsPreviewRequest = new SmsPreviewRequest()
            .text("Let's see how many characters will remain unused in this message.");
    SmsPreviewResponse previewResponse = smsApi
            .previewSmsMessage(smsPreviewRequest)
            .execute();
    System.out.println(previewResponse);
```

#### Receive incoming SMS
If you want to receive SMS messages from your subscribers we can have them delivered to you in real time. When you buy and configure a number capable of receiving SMS, specify your endpoint, as explained in [documentation](https://www.infobip.com/docs/api#channels/sms/receive-inbound-sms-messages).
e.g. `https://{yourDomain}/incoming-sms`.

Example of webhook implementation with Spring Web framework:

```java
    @PostMapping("/incoming-sms")
    public void receiveSms(HttpServletRequest request) throws IOException {
        SmsInboundMessageResult messages = new JSON().deserialize(request.getInputStream(), SmsInboundMessageResult.class);
        for (SmsInboundMessage message : messages.getResults()) {
            System.out.println(message.getFrom() + " - " + message.getCleanText());
        }
    }
```
#### Two-Factor Authentication (2FA)
For 2FA quick start guide, view [these examples](two-factor-authentication.md).

#### Email
For Email quick start guide, view [these examples](email.md).

#### WhatsApp
For WhatsApp quick start guide, view [these examples](whatsapp.md).

#### Messages API
For Messages API quick start guide, view [these examples](messages-api.md).

## Ask for help

Feel free to open issues on the repository for any encountered problem or feature request. For pull requests, go to the `CONTRIBUTING` [file][contributing] related to it. This code is auto generated, and we are unable to merge any pull requests form here.

This code is auto generated, and we are unable to merge any pull request from here, but we will review and implement changes directly within our pipeline, as described in the `CONTRIBUTING` [file][contributing]. 

For anything that requires our imminent attention, contact us @ [support@infobip.com](mailto:support@infobip.com).

[apidocs]: https://www.infobip.com/docs/api
[freetrial]: https://www.infobip.com/docs/essentials/free-trial
[signup]: https://www.infobip.com/signup
[semver]: https://semver.org
[license]: LICENSE
[contributing]: CONTRIBUTING.md
