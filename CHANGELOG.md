# Change Log of `infobip-api-java-client`

All notable changes to the library will be documented in this file.

The format of the file is based on [Keep a Changelog](http://keepachangelog.com/)
and this library adheres to [Semantic Versioning](http://semver.org/) as mentioned in [README.md][readme] file.

## [ [6.0.0](https://github.com/infobip/infobip-api-java-client/releases/tag/6.0.0) ] - 2025-02-17

🎉 **NEW Major Version of `infobip-api-java-client`.**

⚠️ **IMPORTANT NOTE:** This release contains compile time breaking changes.
All changes, including breaking changes, are addressed and explained in the list bellow.
If you find out that something was not addressed properly, please submit an issue.


### Added
* Most recent feature set for:
    * [Infobip Messages API](https://www.infobip.com/docs/api/platform/messages-api).
        * Footer support for Messages API Message. For additional details check Messages API documentation.
        * Add calendar event button support for Messages API Message. For additional details check Messages API documentation.
        * Card options for Carousel and Rich Link body types in Messages API Message. For additional details check Messages API documentation.
    * [Infobip Voice API](https://www.infobip.com/docs/api/channels/voice).
        * Support for Calls Configuration.
    * [Infobip SMS API](https://www.infobip.com/docs/api/channels/sms).
    * [Infobip 2FA API](https://www.infobip.com/docs/api/platform/2fa).
    * [Infobip Email API](https://www.infobip.com/docs/api/channels/email).
        * Support for Email IP Management instead of set of deprecated Email IP endpoints. Check [Email API documentation](https://www.infobip.com/docs/api/channels/email) for additional details.
    * [Infobip WhatsApp API](https://www.infobip.com/docs/api/channels/whatsapp).
    * [Infobip Viber API](https://www.infobip.com/docs/api/channels/viber).
    * [Infobip WebRTC API](https://www.infobip.com/docs/api/channels/webrtc-calls).
    * [Infobip Moments](https://www.infobip.com/docs/api/customer-engagement/moments).
    * [Infobip MMS API](https://www.infobip.com/docs/api/channels/mms).
        * Introduced `/mms/2/messages (V2)`  replacing the `/mms/1/advanced (V1)` endpoint.
        * Introduced `/mms/2/reports (V2)` replacing `/mms/1/reports (V1)` endpoint.
        * Introduced `/mms/2/logs (V2)` replacing `/mms/1/logs (V1)` endpoint.
* **Added** new Calls error code type: `MACHINE_DETECTED`.
* **Added** support for `CallsProviderSipTrunkUpdateRequest`.
* **Created** `RawJsonDeserializer` to handle raw JSON deserialization.


### Changed

- General
  - **Unified** `MessageResponse`, `MessageResponseDetails`, `MessageGroupError`, `SendingSpeedLimit` and `SpeedLimitTimeUnit`.
  - **Updated** `MessagesApiMessageGeneralStatus` – Adjustments due to API updates.
  - **Updated** `DeprecationChecker` logging level from `WARNING` to `INFO` when the endpoint is only deprecated without a defined sunset date.

- Mms API
  - Introduced the new `MmsMessage` class to replace `MmsAdvancedMessage`, reflecting the latest state of the API for MMS messaging.
    Updated request classes by replacing `MmsAdvancedRequest` with the new `MmsRequest` class, reflecting the latest state of the API.
  - Updated sending message function: use `sendMmsMessages` instead of `sendMmsMessage`.

- Voice API
  -  Adjusted IVR models in script processing. Scenario scripting is now implemented as a raw string to increase usability of the feature. Scripts should be passed as strings to the IVR request model in all upcoming SDK versions.
      - **Updated** `CallsUpdateScenarioRequest.script` field type from `List<CallsScriptInner>` → `String`.
      - **Updated** `CallsSearchResponse.script` and `else` fields type from `List<Object>` → `String`.
      - **Updated** `CallsUpdateScenarioResponse.script` field type from `Object` → `String`.
  - **Updated** `CallsGetVoicesResponses.voices` field type from `List<CallsVoice>` → `List<CallsSynthesisVoice>`.
  - **Updated** `CallsSearchResponse.lastUsageDate` field type from `OffsetDateTime` → `String`.
  - **Updated** `CallsSpeechCaptureRequest.language` field type from `CallsLanguage` → `CallTranscriptionLanguage`.
  - **Updated** `CallsTranscription.language` field type from `CallsLanguage` → `CallTranscriptionLanguage`.
  - **Updated** `CallsUpdateScenarioResponse.lastUsageDate` field type from `OffsetDateTime` → `String`.
  - **Removed** `CallsVoice` – Certain fields removed due to API updates.
  - **Removed** `CallRoutingUrlSecurityConfigType` – Unified into `SecurityConfigType` enumeration class.
  - **Removed** `CallsUrlSecurityConfigType` – Unified into `SecurityConfigType` enumeration class.
  - **Fixed** Number Masking content schema when uploading audio files.
  - **Fixed** Number Masking UTC date-time deserialization in setup response model.
  - **Fixed**: Replaced body content in `ConferencePlayFileRequest` from `CallsPlayRequest` to `CallsConferencePlayRequest`.

- Email API
  - **Updated** `EmailSuppressionInfo.createdDate` field type from `String` → `OffsetDateTime`.
  - **Removed** `EmailSingleMessageStatus` – Now integrated into the unified `MessageStatus` class.
  - **Updated** `EmailAddDeleteSuppressionType` – Pending further clarification.

- Messaging API
  - **Removed** `MessagesApiRequestOptions` – Now replaced by `MessagesApiDefaultMessageRequestOptions` class.
  - **Removed** `MessagesApiSpeedLimitTimeUnit` – Now replaced by the unified `SpeedLimitTimeUnit` class.

- Viber API
  - **Removed** `ViberMessageRequestSchedulingSettings` – Now use `ViberRequestSchedulingSettings`.
  - **Updated** `ViberInboundContent.typeEnum` → `ViberInboundContentType`.
  - **Updated** `ViberOutboundContent.typeEnum` → `ViberOutboundContentType`.
  - **Removed** `ViberMessageStatus` – Now unified into `MessageStatus`.
  - **Removed** `ViberSpeedLimitTimeUnit` – Now unified into `SpeedLimitTimeUnit`.
  - **Removed** `ViberWebhookInboundReport` – Now use `ViberInboundMessageViberInboundContent`.

- WhatsApp API
  - **Removed** unsupported enumeration values from `WhatsAppWebhookType`.
  - **Updated** `WhatsAppWebhookReferralMediaVideo`, `WhatsAppWebhookReferralMediaImage`, `WhatsAppWebhookMediaVideo` – Introduced new `type` field, no longer extending `WhatsappWebhookReferalMedia`.
  - **Refactored** `WhatsAppWebhookReferralMedia` – Changed from an abstract class to a normal class.
  - **Removed** `context` field from various `WhatsAppWebhook` message types:
    - `WhatsAppWebhookQuickReplyContent`
    - `WhatsAppWebhookListReplyContent`
    - `WhatsAppWebhookInboundAudioMessage`
    - `WhatsAppWebhookButtonReplyContent`
    - `WhatsAppWebhookInboundVoiceMessage`
    - `WhatsAppWebhookInboundVideoMessage`
    - `WhatsAppWebhookInboundTextMessage`
    - `WhatsAppWebhookInboundStickerMessage`
    - `WhatsAppWebhookInboundLocationMessage`
    - `WhatsAppWebhookInboundImageMessage`
    - `WhatsAppWebhookInboundDocumentMessage`
    - `WhatsAppWebhookInboundContactMessage`
  - **Removed** `integrationType`, `pairedMessageId`, and `callbackData` fields from `WhatsAppWebhookInboundMessageData`.
  - **Removed** `INFECTED_CONTENT`, `INTERACTIVE_EXTENSION_REPLY`, `UNSUPPORTED` subtypes from `WhatsAppWebhookInboundMessage` abstract class.
  - **Replaced** `WhatsAppValidityPeriodTimeUnit` class with `ValidityPeriodTimeUnit`.
  - **Removed** no longer supported 50 business-initiated conversations messaging tear limit for WhatsApp senders.
  - **Updated** `WhatsAppPhoneNumberRequest.typeEnum` → `WhatsAppPhoneNumberTypeEnum`.
  - **Updated** `WhatsAppOtpRequest.typeEnum` → `WhatsAppNumberType`.
  - **Removed** `structure` field from `WhatsAppDefaultUtilityTemplatePublicApiRequest`.
  - **Removed** `structure` field from `WhatsAppTemplatePublicApiRequest`.
  - **Removed** `groupId` field from `WhatsAppContext`.
  - **Refactored** `WhatsAppDefaultTemplateStructureApiData` – Now an implementation of `WhatsAppTemplateStructureApiData`.
  - **Refactored** `WhatsAppAuthenticationTemplateStructureApiData` – Now an implementation of `WhatsAppTemplateStructureApiData`.

- WebRTC API
  - **Updated** `WebRtcValidityWindow.acceptableDays` typeEnum → `DeliveryDay`.
  - **Removed** `applicationId` field from `WebRtcTokenRequestModel`.
  - **Updated** `WebRtcValidityWindow.LayoutsEnum` → `WebRtcLayout`.
  - **Updated** `WebRtcLocalization.typeEnum` → `WebRtcLocalizationType`.
  - **Updated** `WebRtcWebRtcDestination` → `WebRtcCallsDestination`.
  - **Removed** `fcmServerKey` field from `WebRtcAndroidPushNotificationConfig`.

### Removed:
  - Deprecated functions for sending Viber `Image`, `File`, and `Text` messages have been removed. Use `ViberApi.sendViberMessages` to send messages.
  - All the Calls IVR script related class and from now on all the scripts are processed as `String`:
    - `CallsCallApi`
    - `CallsCapture`
    - `CallsCollect`
    - `CallsDial`
    - `CallsDialToMany`
    - `CallsDialToWebRTC`
    - `CallsDialToConversations`
    - `CallsForEach`
    - `CallsGoTo`
    - `CallsHangup`
    - `CallsIfThenElse`
    - `CallsMachineDetection`
    - `CallsPause`
    - `CallsPlay`
    - `CallsPlayFromRecording`
    - `CallsRecord`
    - `CallsRepeatUntil`
    - `CallsRepeatWhile`
    - `CallsSay`
    - `CallsSendSms`
    - `CallsSetVariable`
    - `CallsSwitchCase`
    - `CallsWhileDo`

These changes align the SDK with the current API specification, ensuring consistency and reliability in future updates.

## [ [5.1.0](https://github.com/infobip/infobip-api-java-client/releases/tag/5.1.0) ] - 2024-12-16

### Added
* Support for [Infobip Moments](https://www.infobip.com/docs/api/customer-engagement/moments).


## [ [5.0.0](https://github.com/infobip/infobip-api-java-client/releases/tag/5.0.0) ] - 2024-12-06

🎉 **NEW Major Version of `infobip-api-java-client`.**

⚠️ **IMPORTANT NOTE:** This release contains compile time breaking changes.
All changes, including breaking changes, are addressed and explained in the list bellow.
If you find out that something was not addressed properly, please submit an issue.

### Added
* Most recent feature set for:
  * [Infobip SMS API](https://www.infobip.com/docs/api/channels/sms)
    * Introduced `/sms/3/messages (V3)`  replacing the `/sms/2/text/advanced (V2)` and `/sms/2/binary/advanced (V2)` endpoints.
    * Introduced `/sms/3/reports (V3)` replacing `/sms/1/reports (V1)` endpoint.
    * Introduced `/sms/3/logs (V3)` replacing `/sms/1/logs (V1)` endpoint.
  * [Infobip Email API](https://www.infobip.com/docs/api/channels/email)
  * [Infobip Voice API](https://www.infobip.com/docs/api/channels/voice)

### Changed
* **Fixes and changes**
  * Introduced the new [SmsMessage](src/main/java/com/infobip/model/SmsMessage.java) class to replace `SmsTextualMessage` and `SmsBinaryMessage`, providing a unified structure for SMS messaging.
  * Added a content field within `SmsMessage` to define the message content. This supports both textual and binary messages, which can be created using [SmsTextContent](src/main/java/com/infobip/model/SmsTextContent.java) or [SmsBinaryContent](src/main/java/com/infobip/model/SmsBinaryContent.java), respectively.
  * Unified request classes by replacing `SmsAdvancedTextualRequest` and `SmsAdvancedBinaryRequest` with the new [SmsRequest](src/main/java/com/infobip/model/SmsRequest.java) class.
  * Consolidated sending functions: use `sendSmsMessages` instead of the `sendSmsMessage` and `sendBinarySmsMessage` functions.
  * Changed 'sentAt', 'doneAt' field type in [MmsReport](src/main/java/com/infobip/model/MmsReport.java) from String to OffsetDateTime since it didn't correspond to the state of the endpoint.
  * Across all voice models, the 'applicationId' field has been removed and replaced with the 'platform' field, as it better reflects the state of the endpoint.
  * Removed delivery time window configuration classes (`SmsDeliveryTimeWindow`, `MmsDeliveryTimeWindow`, `ViberDeliveryTimeWindow`, `CallRoutingAllowedTimeWindow`, `CallsDeliveryTimeWindow`, `SmsDeliveryTimeWindow`, `CallsTimeWindow`) in favor of a unified class: [DeliveryTimeWindow](src/main/java/com/infobip/model/DeliveryTimeWindow.java)
  * Removed delivery time configuration classes (`SmsDeliveryTimeFrom`, `SmsDeliveryTimeTo`, `MmsDeliveryTime`, `ViberDeliveryTime`, `CallsTimeWindowPoint`, `WebRtcTimeOfDay`, `CallRoutingAllowedTimeFrom`, `CallRoutingAllowedTimeTo`, `WebRtcTimeOfDay`) in favor of a unified class: [DeliveryTime](src/main/java/com/infobip/model/DeliveryTime.java)
  * Removed URL options configuration classes (`MessagesApiUrlOptions`, `ViberUrlOptions`, `WhatsAppUrlOptions`) in favor of a unified class: [UrlOptions](src/main/java/com/infobip/model/UrlOptions.java)
  * Removed platform configuration class (`ViberPlatform`, `MessagesApiPlatform`) in favor of a unified class: [Platform](src/main/java/com/infobip/model/Platform.java)
  * Removed TurkeyIys options configuration classes (`MessagesApiTurkeyIysOptions`, `ViberTurkeyIysOptions`, `SmsTurkeyIysOptions`) in favor of a unified class: [TurkeyIysOptions](src/main/java/com/infobip/model/TurkeyIysOptions.java)
  * Removed delivery day enumeration classes (`SmsDeliveryDay`, `MmsDeliveryDay`, `CallsDeliveryDay`, `CallRoutingAllowedDay`) in favor of a unified class: [DeliveryDay](src/main/java/com/infobip/model/DeliveryDay.java)
  * Removed recipient type enumeration classes (`SmsIysRecipientType`, `ViberRecipientType`, `MessagesApiRecipientType`) in favor of a unified class: [IysRecipientType](src/main/java/com/infobip/model/IysRecipientType.java)
  * Removed validity period configuration classes (`ViberValidityPeriod`, `MessagesApiValidityPeriod`) in favor of a unified class: [ValidityPeriod](src/main/java/com/infobip/model/ValidityPeriod.java)
  * Removed validity period time unit enumeration classes (`ViberValidityPeriodTimeUnit`, `MessagesApiValidityPeriodTimeUnit`) in favor of a unified class: [ValidityPeriodTimeUnit](src/main/java/com/infobip/model/ValidityPeriodTimeUnit.java)

## [ [4.4.0](https://github.com/infobip/infobip-api-java-client/releases/tag/4.4.0) ] - 2024-11-19

⚠️ **IMPORTANT NOTE:** This release contains compile time breaking changes.
All changes, including breaking changes, are addressed and explained in the list bellow.
If you find out that something was not addressed properly, please submit an issue.

### Added
* Most recent feature set for:
  * [Infobip Messages API](https://www.infobip.com/docs/api/platform/messages-api)

### Changed
* **Fixes and changes**
  * Changed 'description' field name in [MessagesApiMessageListBody](src/main/java/com/infobip/model/MessagesApiMessageListBody.java) to 'subtext'.
  * Removed 'messageCount' field in [MessagesApiWebhookEventTextContent](src/main/java/com/infobip/model/MessagesApiWebhookEventTextContent.java) since it didn't correspond to the state of the endpoint.
* **Documentation**
  * Fixed Javadoc.

## [ [4.3.2](https://github.com/infobip/infobip-api-java-client/releases/tag/4.3.2) ] - 2024-08-22

### Added
* Added mock tests to verify the correctness of request payloads and response handling.
* Added `awaitility` and `wiremock` test dependencies.
* `snyk.yml` workflow, which serves the purpose of identifying and addressing dependency vulnerabilities in the project.
* `sonar.yml` workflow to analyze the source code, enhancing code quality and maintainability.
* `git-build-hook-maven-plugin` plugin into the project, providing support for Git hooks.
* `pre-commit.sh` hook, which automatically executes `mvn spotless:apply` prior to each commit, ensuring code formatting consistency.

### Changed
* Bumped `jackson` version to `2.17.0`
* Bumped `slf4j-api` version to `2.0.16`
* Bumped `junit-jupiter` version to `5.11.0`
* Bumped `guava` version to `33.3.0-jre`
* Bumped `maven-gpg-plugin` version to `3.2.5`
* Bumped `spotless-maven-plugin` version to `2.43.0`

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
* Support for [Infobip Messages API](https://www.infobip.com/docs/api/platform/messages-api).
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
