# Change Log of `infobip-api-java-client`

All notable changes to the library will be documented in this file.

The format of the file is based on [Keep a Changelog](http://keepachangelog.com/)
and this library adheres to [Semantic Versioning](http://semver.org/) as mentioned in [README.md][readme] file.

## [Unreleased]

### Added
* Added mock tests to verify the correctness of request payloads and response handling.
* Added `awaitility` and `wiremock` test dependencies.
* `snyk.yml` workflow, which serves the purpose of identifying and addressing dependency vulnerabilities in the project.
* `sonar.yml` workflow to analyze the source code, enhancing code quality and maintainability.
* `git-build-hook-maven-plugin` plugin into the project, providing support for Git hooks.
* `pre-commit.sh` hook, which automatically executes `mvn spotless:apply` prior to each commit, ensuring code formatting consistency.


## [ [4.3.1](https://github.com/infobip/infobip-api-java-client/releases/tag/4.3.1) ] - 2024-06-05

### Added
* Most recent [Infobip SMS API](https://www.infobip.com/docs/api/channels/sms) feature set.

### Changed
* **Fixes and changes**
  * Changed [SmsTurkeyIysOptions](src/main/java/com/infobip/model/SmsTurkeyIysOptions.java) model, previously nested enum 'RecipientTypeEnum' is now extracted to a separate class: [SmsIysRecipientType](src/main/java/com/infobip/model/SmsIysRecipientType.java).
  * Expanded [ApiExceptionDetailsResolver](src/main/java/com/infobip/ApiExceptionDetails.java) model with additional error response that the API might return.

* **Documentation**
  * Fixed Javadoc.


## [ [4.3.0](https://github.com/infobip/infobip-api-java-client/releases/tag/4.3.0) ] - 2024-03-19

⚠️ **IMPORTANT NOTE:** This release contains compile time breaking changes.
All changes, including breaking changes, are addressed and explained in the list bellow.
If you find out that something was not addressed properly, please submit an issue.

### Added
* Support for [Infobip Messages API](https://www.infobip.com/docs/api/channels/voice/routing).
* Most recent feature set for:
  * [Infobip Call Routing API](https://www.infobip.com/docs/api/channels/voice/routing)
  * [Infobip Call Link API](https://www.infobip.com/docs/api/channels/webrtc-calls/call-link)
  * [Infobip Email API](https://www.infobip.com/docs/api/channels/email)
  * [Infobip MMS API](https://www.infobip.com/docs/api/channels/mms)
  * [Infobip Voice API](https://www.infobip.com/docs/api/channels/voice)
  * [Infobip WebRTC API](https://www.infobip.com/docs/api/channels/webrtc)
  * [Infobip Viber API](https://www.infobip.com/docs/api/channels/viber)
  * [Infobip WhatsApp API](https://www.infobip.com/docs/api/channels/whatsapp)

### Changed
* **Removed classes and unified structures**
  * Removed basic url security configuration classes (`CallsBasicUrlSecurityConfig`, `CallRoutingBasicUrlSecurityConfig`) in favor of a unified class: [BasicSecurityConfig](src/main/java/com/infobip/model/BasicSecurityConfig.java)
  * Removed hmac algorithm class (`CallsHmacAlgorithm`) in favor of a unified class: [HmacAlgorithm](src/main/java/com/infobip/model/HmacAlgorithm.java)
  * Removed hmac url security configuration classes (`CallRoutingHmacUrlSecurityConfig`, `CallsHmacUrlSecurityConfig`) in favor of a unified class: [HmacSecurityConfig](src/main/java/com/infobip/model/HmacSecurityConfig.java)
  * Removed url security configuration classes (`CallRoutingUrlSecurityConfig`, `CallsUrlSecurityConfig`) in favor of a unified class: [SecurityConfig](src/main/java/com/infobip/model/SecurityConfig.java)
* **Fixes and changes**
  * Changed [CallRoutingRecording](src/main/java/com/infobip/model/CallRoutingRecording.java) model, previously nested enum 'RecordingTypeEnum' is now extracted to a separate class: [CallRoutingRecordingType](src/main/java/com/infobip/model/RecordingTypeEnum.java).
  * Changed 'endpoint' field type in [CallsBulkCall](src/main/java/com/infobip/model/CallsBulkCall.java) from CallEndpoint to CallsBulkEndpoint since it didn't correspond to the state of the endpoint.
  * Changed 'endpoint' field type in [CallsBulkCallRequest](src/main/java/com/infobip/model/CallsBulkCallRequest.java) from CallEndpoint to CallsBulkEndpoint since it didn't correspond to the state of the endpoint.
  * Fixed some of the enum values in [TfaLanguage](src/main/java/com/infobip/model/TfaLanguage.java) since they didn't correspond to the state of the endpoint.
  * Removed 'record' field in [CallsClickToCallMessage](src/main/java/com/infobip/model/CallsClickToCallMessage.java) since it is not supported on the API side.
  * Removed 'values' field in [ViberOutboundFileContent](src/main/java/com/infobip/model/ViberOutboundFileContent.java) since it is not supported on the API side.
  * Removed 'values' field in [ViberOutboundImageContent](src/main/java/com/infobip/model/ViberOutboundImageContent.java) since it is not supported on the API side.
  * Removed 'values' field in [ViberOutboundVideoContent](src/main/java/com/infobip/model/ViberOutboundVideoContent.java) since it is not supported on the API side.
  * Changed 'reports' field name in [ViberWebhookReportResponse](src/main/java/com/infobip/model/ViberWebhookReportsResponse.java) to 'results'.
  * Changed 'callbackData' field type in [ViberWebhooks](src/main/java/com/infobip/model/ViberWebhooks.java) from Object to String since it didn't correspond to the state of the endpoint.
  * Changed [WhatsAppTemplateApiResponse](src/main/java/com/infobip/model/WhatsAppTemplateApiResponse.java) by making it an abstract class, serving as a base for WhatsAppAuthenticationTemplateApiResponse, WhatsAppDefaultMarketingTemplateApiResponse, WhatsAppDefaultUtilityTemplateApiResponse.
  * Changed 'results' field in [WhatsAppWebhookInboundContactMessage](src/main/java/com/infobip/model/WhatsAppWebhookInboundContactMessage.java) to be initialized to an empty list rather than null.
  * Changed 'results' field in [WhatsAppWebhookInboundMessageResult](src/main/java/com/infobip/model/WhatsAppWebhookInboundMessageResult.java) to be initialized to an empty list rather than null.
  * Removed 'contact' field in [WhatsAppWebhookInboundMessageData](src/main/java/com/infobip/model/WhatsAppWebhookInboundMessageData.java) since it didn't correspond to the state of the endpoint.
  * Changed [WhatsAppWebhookReferral](src/main/java/com/infobip/model/WhatsAppWebhookReferral.java) model, previously nested enum 'SourceTypeEnum' is now extracted to a separate class: [WhatsAppWebhookReferralSourceType](src/main/java/com/infobip/model/WhatsAppWebhookReferralSourceType.java).
  * Changed [WhatsAppWebhookReferralMedia](src/main/java/com/infobip/model/WhatsAppWebhookReferralMedia.java) by making it an abstract class, serving as a base for WhatsAppWebhookReferralMediaImage, WhatsAppWebhookReferralMediaVideo.
* **Documentation**
  * Fixed Javadoc.

### Removed
- Models for Receive WhatsApp Deleted Reports webhook since it is no longer part of Infobip's product stack.
- Unused model classes

## ~~[ [4.2.0](https://github.com/infobip/infobip-api-java-client/releases/tag/4.2.0) ] - 2024-03-07~~

⚠️ **IMPORTANT NOTE:** This release contains changes that are not compatible with Infobip HTTP API. Therefore, it is considered broken. We strongly advise to avoid using it. We are working on a new version. In the meantime, please use 4.1.2.

## [ [4.1.2](https://github.com/infobip/infobip-api-java-client/releases/tag/4.1.2) ] - 2024-03-07

### Fixed
* Issue that caused the number of query parameters for 'bulkId' & 'messageId' to be squared when making getOutboundSmsMessageLogsDefinition call in SmsApi.
* Issue that caused the number of query parameters for 'sender' to be squared when making getWhatsappSendersQualityDefinition call in WhatsAppApi.

## [ [4.1.1](https://github.com/infobip/infobip-api-java-client/releases/tag/4.1.1) ] - 2024-01-03

### Added
* `guava` dependency to tag `early-access` endpoints with `@Beta` annotation.
* Most recent [Infobip WhatsApp API](https://www.infobip.com/docs/api/channels/whatsapp) feature set.

### Changed
* Expanded [WhatsAppTemplateDataContent](src/main/java/com/infobip/model/WhatsAppTemplateDataContent.java) model with additional field supporting `WhatsAppTemplateCarouselContent` that the API might return.
* Early access endpoints in [WhatsAppApi](src/main/java/com/infobip/api/WhatsAppApi.java) are tagged with `@Beta` annotation
* Fixed Javadoc.

## [ [4.1.0](https://github.com/infobip/infobip-api-java-client/releases/tag/4.1.0) ] - 2023-12-20

⚠️ **IMPORTANT NOTE:** This release contains compile time breaking changes.
All changes, including breaking changes, are addressed and explained in the list bellow.
If you find out that something was not addressed properly, please submit an issue.

### Added
* Support for [Infobip Call Routing API](https://www.infobip.com/docs/api/channels/voice/routing).
* Support for [Infobip Call Link API](https://www.infobip.com/docs/api/channels/webrtc-calls/call-link).
* Most recent [Infobip Email API](https://www.infobip.com/docs/api/channels/email) feature set.
* Most recent [Infobip SMS API](https://www.infobip.com/docs/api/channels/sms) feature set.
* Most recent [Infobip MMS API](https://www.infobip.com/docs/api/channels/mms) feature set.
* Most recent [Infobip Voice API](https://www.infobip.com/docs/api/channels/voice) feature set.
* Most recent [Infobip WebRTC API](https://www.infobip.com/docs/api/channels/webrtc) feature set.
* Most recent [Infobip Viber API](https://www.infobip.com/docs/api/channels/viber) feature set.
* Most recent [Infobip WhatsApp API](https://www.infobip.com/docs/api/channels/whatsapp) feature set.
* [CPaaS-X](https://www.infobip.com/docs/cpaas-x/application-and-entity-management) support to more channels.
* Support for handling ApiError models:
  * [ApiError](src/main/java/com/infobip/model/ApiError.java)
  * [ApiErrorResource](src/main/java/com/infobip/model/ApiErrorResource.java)
  * [ApiErrorViolation](src/main/java/com/infobip/model/ApiErrorViolation.java)

### Changed
* **Removed classes and unified structures**
  * Removed pagination classes (`CallsPageInfo`, `WebRtcPageInfo`) in favor of a unified class: [PageInfo](src/main/java/com/infobip/model/PageInfo.java)
  * Removed status-defining classes for messages by products (`EmailStatus`, `MmsStatus`, `SmsStatus`) and introduced a unified class: [MessageStatus](src/main/java/com/infobip/model/PageInfo.java)
  * Removed price-defining classes for messages by products (`EmailPrice`, `MmsPrice`, `SmsPrice`, `EmailWebhookPrice`) and replaced with a unified class: [MessagePrice](src/main/java/com/infobip/model/MessagePrice.java)
  * Removed error-defining classes for query execution by different products (`EmailReportError`, `MmsError`, `SmsError`) and introduced a unified class: [MessageError](src/main/java/com/infobip/model/MessageError.java)
* **Fixes and changes**
  * Expanded [ApiExceptionDetails](src/main/java/com/infobip/ApiExceptionDetails.java) model with additional fields supporting enriched error responses that the API might return.
  * Changed `templateId` field type from Integer to Long in EmailApi's SendEmailRequest class because of reported [issue](https://github.com/infobip/infobip-api-java-client/issues/37).
  * Updated [WhatsAppCategory](src/main/java/com/infobip/model/WhatsAppCategory.java) enumeration values based on [report](https://developers.facebook.com/docs/whatsapp/business-platform/changelog#february-3--2023) and reported [issue](https://github.com/infobip/infobip-api-java-client/issues/36).
  * Updated [CallsErrorCode](src/main/java/com/infobip/model/CallsErrorCode.java) enumeration values to reflect changes on [Hangup](https://www.infobip.com/docs/api/channels/voice/calls/call-legs/hangup-call) endpoint.
  * Updated [ViberValidityPeriodTimeUnit](src/main/java/com/infobip/model/ViberValidityPeriodTimeUnit.java) enumeration values since 'DAYS' is no longer supported, use 'HOURS' instead.
  * Changed 'context' field name in [CallsApplicationTransferRequest](src/main/java/com/infobip/model/CallsApplicationTransferRequest.java) to 'customData'.
  * Changed 'days' field type in [CallsDeliveryTimeWindow](src/main/java/com/infobip/model/CallsDeliveryTimeWindow.java) from List to Set to avoid duplicates.
  * Removed 'type' field in [CallsDtmfTermination](src/main/java/com/infobip/model/CallsDtmfTermination.java) since it is not supported on the API side.
  * Removed 'stopOn' field in [CallsSayRequest](src/main/java/com/infobip/model/CallsSayRequest.java) since it is not supported on the API side.
  * Removed 'sipTrunkGroupId' field in [CallsSipEndpoint](src/main/java/com/infobip/model/CallsSipEndpoint.java) since it is not supported on the API side.
  * Removed 'notifyContentType' field in [MmsAdvancedMessage](src/main/java/com/infobip/model/MmsAdvancedMessage.java) since it is not supported on the API side.
  * Removed 'sendingSpeedLimit' field in [MmsAdvancedRequest](src/main/java/com/infobip/model/MmsAdvancedRequest.java) since it is not supported on the API side.
  * Fixed Viber webhook report models.
  * Changed 'results' field name in [ViberWebhookReportResponse](src/main/java/com/infobip/model/ViberWebhookReportsResponse.java) to reports.
  * Replaced 'ios' and 'android' fields in [WebRtcPushConfigurationResponse](src/main/java/com/infobip/model/WebRtcPushConfigurationResponse.java) with 'androidConfigured' and 'iosConfigured' since they didn't correspond to the state of the endpoint.
  * Changed 'structure' field type in [WhatsAppTemplateApiResponse](src/main/java/com/infobip/model/WhatsAppTemplateApiResponse.java) from 'WhatsAppTemplateStructureApiData' and 'WhatsAppDefaultTemplateStructureApiData'.
  * Changed [WhatsAppTemplatePublicApiRequest](src/main/java/com/infobip/model/WhatsAppTemplatePublicApiRequest.java) by making it an abstract class, serving as a base for WhatsAppAuthenticationTemplatePublicApiRequest, WhatsAppDefaultMarketingTemplatePublicApiRequest, WhatsAppDefaultUtilityTemplatePublicApiRequest.
* **Documentation**
  * Fixed Javadoc.
* **Dependencies**
  * Bumped `slf4j-api` version to `2.0.9`
  * Bumped `jackson` version to `2.15.2`
  * Bumped `okhttp` version to `4.12.0`

### Removed
- Unused model classes

### Deprecated
- Deprecated old error fields in [ApiExceptionDetails](src/main/java/com/infobip/ApiExceptionDetails.java)

## [ [4.0.0](https://github.com/infobip/infobip-api-java-client/releases/tag/4.0.0) ] - 2023-03-01

🎉 **NEW Major Version of `infobip-api-java-client`.**

⚠️ **IMPORTANT NOTE:** This release contains breaking changes.
All changes, including breaking changes, are addressed and explained in the list bellow.
If you find out that something was not addressed properly, please submit an issue.

### Added
* Support for [Infobip MMS API](https://www.infobip.com/docs/api/channels/mms).
* Support for [Infobip Voice API](https://www.infobip.com/docs/api/channels/voice).
* Support for [Infobip WebRTC API](https://www.infobip.com/docs/api/channels/webrtc).
* Support for [Infobip Viber API](https://www.infobip.com/docs/api/channels/viber).
* Most recent [Infobip SMS API](https://www.infobip.com/docs/api/channels/sms) feature set.
* Most recent [Email](https://www.infobip.com/docs/api/channels/email) feature set.
* Most recent [WhatsApp](https://www.infobip.com/docs/api/channels/whatsapp) feature set.
* Tests for the static parts of the auto-generated code.
  There are multiple tests phases implemented in our auto-generation pipeline.
  A part of the tests is now included as a library source code.
* Base URL [abstraction](src/main/java/com/infobip/BaseUrl.java).
* Api Key [abstraction](src/main/java/com/infobip/ApiKey.java).
* Deprecation notice log if deprecated or gone endpoints are used (`slf4j-api` dependency).
* Snyk and Java version badges to README.

### Changed
* The library now requires Java 11 or above.
* [OkHttp](https://square.github.io/okhttp/) dependency was bumped to version 4.10.0.
* From this version, an `ApiClient` instance must be constructed and configured using the Builder pattern:
  ```
      ApiClient apiClient = ApiClient.forApiKey(givenApiKey)
            .withBaseUrl(givenBaseUrl)
            .withHttpClient(givenHttpClient)
            .withReadTimeout(givenReadTimeoutInSeconds)
            .withTempDirectoryPath(givenTempDirPath)
            .build();
  ```
  The additional OkHttp client configuration was removed from the library.
  Please check the Removed section for details.
* API classes were refactored in a way that all functionalities are grouped under the same product.
  For example, `SendSmsApi`, `ScheduledSmsApi` and `ReceiveSmsApi` classes are replaced with a single `SmsApi` class.
* API class methods that trigger an API call were rewritten using a fluent style where all required parameters
  must be passed to a request builder factory method.
  On the other hand, optional parameters may be passed using a separate request builder methods.
  The result can be fetched using `execute` or `executeAsync` methods.
  That allows us to add optional parameters without introducing a breaking change to the library.
  For example, in the previous version, to send a TFA pin code, we could use something like this:
  ```
      TfaStartAuthenticationResponse response = tfaApi.sendTfaPinCodeOverSms(false, request);
  ```
  In the new version, the following pattern applies:
  ```
      TfaStartAuthenticationResponse sendCodeResponse = tfaApi
            .sendTfaPinCodeOverSms(request)
            .ncNeeded(false)
            .execute();
  ```
* [Jackson](https://github.com/FasterXML/jackson) (version 2.14.2) serialization library is used instead of [Gson](https://github.com/google/gson).
  The `JSON` serialization [utility](src/main/java/com/infobip/JSON.java) now uses a preconfigured Jackson's `ObjectMapper`.
  Also, the support for `InputStream` serialization was added.
* All maven plugins were bumped to the most recent version.
  Both unneeded plugins and the obsolete configuration were removed.
* The API request and response processing was rewritten to increase maintainability and usability.
* The `ApiException` class was refactored to have fluent getters and a single accessible Builder.
* From this version, the error response body is deserialized and stored in `details` property of the `ApiException` class.
* The `palantir-java-format` is now used instead of `google-java-format` to have the formatting closer to our internal coding style.
  See the Spotless [README](https://github.com/diffplug/spotless/tree/main/plugin-maven#palantir-java-format) for details.
* Some products like Email and WhatsApp contain a few breaking changes since a new version of a few of the API endpoints was released.
  If you have issues when migrating the existing implementation, please check the official API documentation or submit an issue.

### Removed
- [Basic](https://www.infobip.com/docs/essentials/api-authentication#basic), [IBSSO Token Header](https://www.infobip.com/docs/essentials/api-authentication#ibsso-token-header) and client credentials grant type [OAuth2](https://www.infobip.com/docs/essentials/api-authentication#oauth-2-0) authentication methods.
  Use [API Key Header](https://www.infobip.com/docs/essentials/api-authentication#api-key-header) authentication method instead.
  The API Key should be injected into the `ApiClient` instance through the newly introduced `forApiKey` factory method.
  Examples can be found in the README.
- `Configuration` utility class.
  Having static default configuration is error-prone and provides an unnecessary overhead.
  An `ApiClient` instance should always be injected in the given API class.
- `SSL` settings configuration methods from the `ApiClient`.
  If you need to configure custom `SSL` related settings (custom client keys, disabled CA certificate and hostname verification, etc.),
  configure them on the `OkHttpClient` instance directly and pass the instance to the `ApiClient` using `withHttpClient` builder method.
- Date format customization methods from the `ApiClient`.
  Only the default Infobip [date format](https://www.infobip.com/docs/essentials/integration-best-practices#date-formats-backward-compatibility) should be used.
  The date formatter instance to be used is available through the `JSON` [class](src/main/java/com/infobip/JSON.java).
- Header and cookie manipulation through `ApiClient` public interface.
  However, it can still be achieved using OkHttp interceptors if needed.
  Feel free to configure an `OkHttpClient` instance with appropriate [interceptors](https://square.github.io/okhttp/features/interceptors/) and pass the instance to the `ApiClient` using `withHttpClient` builder method.
- Explicit debugging option for `ApiClient`.
  [HttpLoggingInterceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor) can always be included by providing a preconfigured HTTP client as described above.
- Explicit gzip support for requests.
  The support should be provided by the client itself like explained [here](https://github.com/square/okhttp/issues/350).
- Unused generated classes.
- Default network interceptor used for tracking upload and download progress.
  The functionality can be re-added by using the official OkHttp [recipe](https://github.com/square/okhttp/blob/master/samples/guide/src/main/java/okhttp3/recipes/Progress.java).
- `...WithHttpInfo` methods from API client classes.
  If an additional info like response headers or the response code is needed, the `executeAsync` method should be
  used.
  The required information is injected in the callback.
- `...buildCall` methods from API client classes.
  The OkHttp `Call` [abstraction](https://square.github.io/okhttp/4.x/okhttp/okhttp3/-call/) can be obtained by using the `executeAsync` method.
  We don't allow calling the API without processing the response internally anymore.


## [ [3.2.0](https://github.com/infobip/infobip-api-java-client/releases/tag/3.2.0) ] - 2022-01-19

### Added
- Support for [Infobip WhatsApp API](https://www.infobip.com/docs/api#channels/whatsapp)
- `whatsapp.md` containing quick start guide for WhatsApp API

### Changed
- Email sending API to match the latest version of the API.
  - Signature changed: getEmailLogs()
- Renamed some email API models to be consistent across multiple products
  - EmailError -> EmailReportError
  - EmailLogsResult -> EmailLogsResponse

### Fixed
- Minor SMS API changes (some field became readonly)
- Improved Javadoc comments


## [ [3.1.0](https://github.com/infobip/infobip-api-java-client/releases/tag/3.1.0) ] - 2021-06-16

### Added
- Support for [Infobip Email API](https://www.infobip.com/docs/api#channels/email)
- `email.md` which contains basic example of Email API usage


## [ [3.0.1](https://github.com/infobip/infobip-api-java-client/releases/tag/3.0.1) ] - 2021-02-16

### Changed
- `README.md` which now contains more details about supported authentication methods & updated examples of library usage for webhooks

### Removed
- Unused model classes
- Unused utility classes
- Unused dependency

### Fixed
- Supported date formats as specified in [Integration Best Practices](https://www.infobip.com/docs/essentials/integration-best-practices#date-formats)

## [ [3.0.0](https://github.com/infobip/infobip-api-java-client/releases/tag/3.0.0) ] - 2021-02-03

🎉 **NEW Major Version of `infobip-api-java-client`.**

⚠️ **IMPORTANT NOTE:** This release contains breaking changes!

In this release the infobip-api-java-client library is updated and modernized. It is auto-generated and completely different from the previous version.

### Added
- Support for async execution
- `CONTRIBUTING.md` which contains guidelines for creating GitHub issues
- Support for [Infobip Two-factor Authentication API](https://www.infobip.com/docs/api#channels/sms/send-2fa-pin-code-over-sms)

### Changed
- Models, structure, examples, etc. for [Infobip SMS API](https://www.infobip.com/docs/api#channels/sms)
- Library dependencies
- `README.md` which contains necessary data and examples for quickstart as well as some other important pieces of information on versioning, licensing, etc.

### Removed
- Support for [Infobip Omni API](https://www.infobip.com/docs/api#channels/omni-failover) (to be included back in one of the next releases)

[readme]: README.md
