# Infobip API Java Client

This right here is a Java Client for Infobip API and you can use it as a dependency to add [Infobip APIs][apidocs] to your application.
To use this, you'll need an Infobip account. If not already having one, you can create a [free trial][freetrial] account [here][signup].

<img src="https://udesigncss.com/wp-content/uploads/2020/01/Infobip-logo-transparent.png" height="124px" alt="Infobip" />

#### Table of contents:
* [Quality Check](#quality-check)
* [Documentation](#documentation)
* [General Info](#general-info)
* [Installation](#installation)
* [Quickstart](#quickstart)
* [Ask for help](#ask-for-help)

## Quality Check
[![Maven Central](https://img.shields.io/maven-central/v/com.infobip.api/client.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.infobip.api%22%20AND%20a:%22client%22)
[![Travis CI](https://travis-ci.com/kiselica-aldin/java-travis-playground.svg?branch=main&status=passed)](https://travis-ci.com/github/kiselica-aldin/java-travis-playground)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=com.aldin.kiselica%3Ajava-travis-playground&metric=alert_status)](https://sonarcloud.io/dashboard?id=com.aldin.kiselica%3Ajava-travis-playground)
[![MIT License](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

[![SonarCloud](https://sonarcloud.io/images/project_badges/sonarcloud-white.svg)](https://sonarcloud.io/dashboard?id=com.aldin.kiselica%3Ajava-travis-playground)

## Documentation

Infobip API Documentation can be found [here][apidocs].

Java API Client Documentation can be found [here][libdocs].
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
      <version>3.0.0-SNAPSHOT</version>
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

```java
    ApiClient apiClient = new ApiClient();
    apiClient.setApiKeyPrefix(API_KEY_PREFIX);
    apiClient.setApiKey(API_KEY);
    apiClient.setBasePath(URL_BASE_PATH);
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
        .destinations(Collections.singletonList(new SmsDestination().to("41793026727")))
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

Example of webhook implementation with Spring Web framework:

```java
    @PostMapping("/delivery-reports")
    public void receiveDr(@RequestBody SmsDeliveryResult reports) {
        for (SmsReport report : reports.getResults()) {
            System.out.println(report.getMessageId() + " - " + report.getStatus());
        }
    }
```

#### Fetching delivery reports
If you are for any reason unable to receive real time delivery reports on your endpoint, you can use `messageId` or `bulkId` to fetch them.
Each request will return a batch of delivery reports - only once.

```java
    Integer numberOfReportsLimit = 10;
    SmsDeliveryResult deliveryReports = sendSmsApi.getOutboundSmsMessageDeliveryReports(bulkId, messageId, numberOfReportsLimit);
    for (SmsReport report : deliveryReports.getResults()) {
        System.out.println(report.getMessageId() + " - " + report.getStatus());
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
If you want to receive SMS messages from your subscribers we can have them delivered to you in real time. When you buy and configure a number capable of receiving SMS, specify your endpoint as explained [here]().
e.g. `https://{yourDomain}/incoming-sms`

Example of webhook implementation with Spring Web framework:

```java
    @PostMapping("/incoming-sms")
    public void receiveSms(@RequestBody SmsInboundMessageResult messages) {
        for (SmsInboundMessage message : messages.getResults()) {
            System.out.println(message.getFrom() + " - " + message.getCleanText());
        }
    }
```
#### Two-Factor Authentication (2FA)
For 2FA quick start guide please check [these examples](two-factor-authentication.md)

## Demo project
Full code samples can be found on GitHub here: [infobip-api-java-client-demo](http://github.com/infobip/infobip-api-java-client-demo)

## Ask for help

Feel free to open issues on the repository for any issue or feature request. As per pull requests, for details check the `CONTRIBUTING` [file][contributing] related to it - in short, we will not merge any pull requests, this code is auto-generated.

If it is, however, something that requires our imminent attention feel free to contact us @ [support@infobip.com](mailto:support@infobip.com)

[apidocs]: https://www.infobip.com/docs/api
[libdocs]: https://www.infobip.com/docs/sdk
[freetrial]: https://www.infobip.com/docs/freetrial
[signup]: https://www.infobip.com/signup
[semver]: https://semver.org
[license]: LICENSE`
[contributing]: CONTRIBUTING.md
