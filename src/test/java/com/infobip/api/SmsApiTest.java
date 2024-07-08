package com.infobip.api;

import com.infobip.JSON;
import com.infobip.model.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import static com.infobip.api.util.ResponseStatuses.*;
import static org.assertj.core.api.BDDAssertions.then;

class SmsApiTest extends ApiTest {

    private static final String TEXT_ADVANCED = "/sms/2/text/advanced";
    private static final String BINARY_ADVANCED = "/sms/2/binary/advanced";
    private static final String PREVIEW = "/sms/1/preview";
    private static final String REPORTS = "/sms/1/reports";
    private static final String LOGS = "/sms/1/logs";
    private static final String INBOX_REPORTS = "/sms/1/inbox/reports";
    private static final String BULKS = "/sms/1/bulks";
    private static final String BULKS_STATUS = "/sms/1/bulks/status";

    @Test
    void shouldSendSimpleSms() {
        String givenBulkId = "2034072219640523072";
        String givenTo = "41793026727";
        String givenMessageId = "2250be2d4219-3af1-78856-aabe-1362af1edfd2";

        String givenResponse = givenPendingResponse(givenBulkId, givenTo, givenMessageId);

        String givenFrom = "InfoSMS";
        String givenText = "This is a sample message";

        String expectedRequest = String.format("{" +
                                                   "  \"messages\": [" +
                                                   "    {" +
                                                   "      \"from\": \"%s\"," +
                                                   "      \"destinations\": [" +
                                                   "        {" +
                                                   "          \"to\": \"%s\"" +
                                                   "        }" +
                                                   "      ]," +
                                                   "      \"text\": \"%s\"" +
                                                   "    }" +
                                                   "  ]" +
                                                   "}",
                                               givenFrom,
                                               givenTo,
                                               givenText
        );

        setUpSuccessPostRequest(
            TEXT_ADVANCED,
            expectedRequest,
            givenResponse
        );

        SmsApi sendSmsApi = new SmsApi(getApiClient());

        SmsDestination destination = new SmsDestination()
            .to(givenTo);

        SmsTextualMessage message = new SmsTextualMessage()
            .from(givenFrom)
            .text(givenText)
            .destinations(List.of(destination));

        SmsAdvancedTextualRequest request = new SmsAdvancedTextualRequest()
            .messages(List.of(message));

        Consumer<SmsResponse> assertions = (smsResponse) -> {
            then(smsResponse).isNotNull();
            then(smsResponse.getBulkId()).isEqualTo(givenBulkId);
            List<SmsResponseDetails> smsResponseDetails = smsResponse.getMessages();
            then(smsResponseDetails).isNotNull();
            then(smsResponseDetails).hasSize(1);
            thenResponseDetailsForMessageHasStatusPending(smsResponseDetails.get(0), givenTo, givenMessageId);
        };

        var call = sendSmsApi.sendSmsMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendFlashSms() {
        String givenBulkId = "2034072219640523072";
        String givenTo = "41793026727";
        String givenMessageId = "2250be2d4219-3af1-78856-aabe-1362af1edfd2";

        String givenResponse = givenPendingResponse(givenBulkId, givenTo, givenMessageId);

        String givenFrom = "InfoSMS";
        String givenText = "Toto, I've got a feeling we're not in Kansas anymore.";
        boolean isFlash = true;

        String expectedRequest = String.format("{" +
                                                   "  \"messages\": [" +
                                                   "    {" +
                                                   "      \"from\": \"%s\"," +
                                                   "      \"destinations\": [" +
                                                   "        {" +
                                                   "          \"to\": \"%s\"" +
                                                   "        }" +
                                                   "      ]," +
                                                   "      \"text\": \"%s\"," +
                                                   "      \"flash\": %b" +
                                                   "    }" +
                                                   "  ]" +
                                                   "}",
                                               givenFrom,
                                               givenTo,
                                               givenText,
                                               isFlash
        );

        setUpSuccessPostRequest(TEXT_ADVANCED, expectedRequest, givenResponse);

        SmsApi sendSmsApi = new SmsApi(getApiClient());

        SmsDestination destination = new SmsDestination()
            .to(givenTo);

        SmsTextualMessage message = new SmsTextualMessage()
            .from(givenFrom)
            .text(givenText)
            .destinations(List.of(destination))
            .flash(isFlash);

        SmsAdvancedTextualRequest request = new SmsAdvancedTextualRequest()
            .messages(List.of(message));

        Consumer<SmsResponse> assertions = (smsResponse) -> {
            then(smsResponse).isNotNull();
            then(smsResponse.getBulkId()).isEqualTo(givenBulkId);

            List<SmsResponseDetails> smsResponseDetails = smsResponse.getMessages();
            then(smsResponseDetails).isNotNull();
            then(smsResponseDetails).hasSize(1);
            thenResponseDetailsForMessageHasStatusPending(smsResponseDetails.get(0), givenTo, givenMessageId);
        };

        var call = sendSmsApi.sendSmsMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendFullyFeaturedSmsMessage() {
        String givenCallbackData = "transactionId=100";
        String deliveryTimeWindowDayMondayString = "MONDAY";
        SmsDeliveryDay deliveryTimeWindowDayMonday = SmsDeliveryDay.MONDAY;
        String deliveryTimeWindowDaySundayString = "SUNDAY";
        SmsDeliveryDay deliveryTimeWindowDaySunday = SmsDeliveryDay.SUNDAY;
        int deliveryTimeWindowFromHours = 12;
        int deliveryTimeWindowFromMinutes = 10;
        int deliveryTimeWindowToHours = 20;
        int deliveryTimeWindowToMinutes = 15;
        String givenFirstDestinationMessageId = "abc123";
        String givenFirstDestination = "385991112222";
        String givenSecondDestinationMessageId = "xyz100";
        String givenSecondDestination = "385911231234";
        boolean givenFlash = true;
        String givenFrom = "Info";
        boolean givenIntermediateReport = true;
        String givenLanguageCode = "AUTODETECT";
        String givenNotifyContentType = "application/json";
        String givenNotifyUrl = "https://www.example.com/sms/advanced";
        String givenIndiaDltContentTemplateId = "contentTemplateId";
        String givenIndiaDltPrincipalEntityId = "givenPrincipalEntityId";
        int givenTurkeyIysBrandCode = 123123;
        String givenTurkeyIysRecipientTypeString = "TACIR";
        SmsIysRecipientType givenTurkeyIysRecipientType = SmsIysRecipientType.TACIR;
        OffsetDateTime givenSendAt = OffsetDateTime.of(2023, 8, 1, 16, 10, 0, 0, ZoneOffset.ofHoursMinutes(5, 30));
        String givenSendAtString = "2023-08-01T16:10:00.000+0530";
        String givenText = "Laku noć";
        String givenTransliteration = "CENTRAL_EUROPEAN";
        long givenValidityPeriod = 720L;
        String givenEntityId = "100aaa100";
        String givenApplicationId = "123abc123";
        var givenResellerCode = 10;
        String givenSouthKoreaTitle = "SouthKoreaTitle";

        String expectedMessage = String.format("{\n" +
                                                   "    \"callbackData\": \"%s\",\n" +
                                                   "    \"deliveryTimeWindow\": {\n" +
                                                   "        \"days\": [\n" +
                                                   "            \"%s\",\n" +
                                                   "            \"%s\"\n" +
                                                   "        ],\n" +
                                                   "        \"from\": {\n" +
                                                   "            \"hour\": %d,\n" +
                                                   "            \"minute\": %d\n" +
                                                   "        },\n" +
                                                   "        \"to\": {\n" +
                                                   "            \"hour\": %d,\n" +
                                                   "            \"minute\": %d\n" +
                                                   "        }\n" +
                                                   "    },\n" +
                                                   "    \"destinations\": [\n" +
                                                   "        {\n" +
                                                   "            \"messageId\": \"%s\",\n" +
                                                   "            \"to\": \"%s\"\n" +
                                                   "        },\n" +
                                                   "        {\n" +
                                                   "            \"messageId\": \"%s\",\n" +
                                                   "            \"to\": \"%s\"\n" +
                                                   "        }\n" +
                                                   "    ],\n" +
                                                   "    \"flash\": %b,\n" +
                                                   "    \"from\": \"%s\",\n" +
                                                   "    \"intermediateReport\": %b,\n" +
                                                   "    \"language\": {\n" +
                                                   "        \"languageCode\": \"%s\"\n" +
                                                   "    },\n" +
                                                   "    \"notifyContentType\": \"%s\",\n" +
                                                   "    \"notifyUrl\": \"%s\",\n" +
                                                   "    \"regional\": {\n" +
                                                   "        \"indiaDlt\": {\n" +
                                                   "            \"contentTemplateId\": \"%s\",\n" +
                                                   "            \"principalEntityId\": \"%s\"\n" +
                                                   "        },\n" +
                                                   "        \"turkeyIys\": {\n" +
                                                   "            \"brandCode\": %d,\n" +
                                                   "            \"recipientType\": \"%s\"\n" +
                                                   "        },\n" +
                                                   "        \"southKorea\": {\n" +
                                                   "            \"resellerCode\": %d,\n" +
                                                   "            \"title\": \"%s\"\n" +
                                                   "        }\n" +
                                                   "    },\n" +
                                                   "    \"sendAt\": \"%s\",\n" +
                                                   "    \"text\": \"%s\",\n" +
                                                   "    \"transliteration\": \"%s\",\n" +
                                                   "    \"validityPeriod\": %d,\n" +
                                                   "    \"entityId\": \"%s\",\n" +
                                                   "    \"applicationId\": \"%s\"\n" +
                                                   "}\n",
                                               givenCallbackData,
                                               deliveryTimeWindowDayMondayString,
                                               deliveryTimeWindowDaySundayString,
                                               deliveryTimeWindowFromHours,
                                               deliveryTimeWindowFromMinutes,
                                               deliveryTimeWindowToHours,
                                               deliveryTimeWindowToMinutes,
                                               givenFirstDestinationMessageId,
                                               givenFirstDestination,
                                               givenSecondDestinationMessageId,
                                               givenSecondDestination,
                                               givenFlash,
                                               givenFrom,
                                               givenIntermediateReport,
                                               givenLanguageCode,
                                               givenNotifyContentType,
                                               givenNotifyUrl,
                                               givenIndiaDltContentTemplateId,
                                               givenIndiaDltPrincipalEntityId,
                                               givenTurkeyIysBrandCode,
                                               givenTurkeyIysRecipientTypeString,
                                               givenResellerCode,
                                               givenSouthKoreaTitle,
                                               givenSendAtString,
                                               givenText,
                                               givenTransliteration,
                                               givenValidityPeriod,
                                               givenEntityId,
                                               givenApplicationId
        );

        String givenBulkId = "BULK-ID-123-xyz";
        int givenSendingSpeedLimitAmount = 10;
        String givenSendingSpeedLimitTimeUnitString = "HOUR";
        SmsSpeedLimitTimeUnit givenSendingSpeedLimitTimeUnit = SmsSpeedLimitTimeUnit.HOUR;
        boolean givenUrlOptionsShortenUrl = true;
        boolean givenUrlOptionsTrackClicks = false;
        String givenUrlOptionsTrackingUrl = "https://ib.com";
        boolean givenUrlOptionsRemoveProtocol = true;
        String givenUrlOptionsCustomDomain = "example.com";
        String givenTracking = "SMS";
        String givenTrackingType = "MY_CAMPAIGN";
        String givenTrackingBaseUrl = "https://example.com";
        String givenTrackingProcessKey = "123";

        String expectedRequest = String.format("{\n" +
                                                   "    \"bulkId\": \"%s\",\n" +
                                                   "    \"messages\": [\n" +
                                                   "        %s\n" +
                                                   "    ],\n" +
                                                   "    \"sendingSpeedLimit\": {\n" +
                                                   "        \"amount\": %d,\n" +
                                                   "        \"timeUnit\": \"%s\"\n" +
                                                   "    },\n" +
                                                   "    \"urlOptions\": {\n" +
                                                   "        \"shortenUrl\": %b,\n" +
                                                   "        \"trackClicks\": %b,\n" +
                                                   "        \"trackingUrl\": \"%s\",\n" +
                                                   "        \"removeProtocol\": %b,\n" +
                                                   "        \"customDomain\": \"%s\"\n" +
                                                   "    },\n" +
                                                   "    \"tracking\": {\n" +
                                                   "        \"baseUrl\": \"%s\",\n" +
                                                   "        \"processKey\": \"%s\",\n" +
                                                   "        \"track\": \"%s\",\n" +
                                                   "        \"type\": \"%s\"\n" +
                                                   "    }\n" +
                                                   "}",
                                               givenBulkId,
                                               expectedMessage,
                                               givenSendingSpeedLimitAmount,
                                               givenSendingSpeedLimitTimeUnitString,
                                               givenUrlOptionsShortenUrl,
                                               givenUrlOptionsTrackClicks,
                                               givenUrlOptionsTrackingUrl,
                                               givenUrlOptionsRemoveProtocol,
                                               givenUrlOptionsCustomDomain,
                                               givenTrackingBaseUrl,
                                               givenTrackingProcessKey,
                                               givenTracking,
                                               givenTrackingType
        );

        String givenResponse = givenPendingResponse(
            givenBulkId,
            givenFirstDestination,
            givenFirstDestinationMessageId,
            givenSecondDestination,
            givenSecondDestinationMessageId
        );

        setUpSuccessPostRequest(TEXT_ADVANCED, expectedRequest, givenResponse);

        SmsApi sendSmsApi = new SmsApi(getApiClient());

        SmsDeliveryTimeWindow givenDeliveryTimeWindow = new SmsDeliveryTimeWindow()
            .days(List.of(deliveryTimeWindowDayMonday, deliveryTimeWindowDaySunday))
            .from(
                new SmsDeliveryTimeFrom()
                    .hour(deliveryTimeWindowFromHours)
                    .minute(deliveryTimeWindowFromMinutes)
            ).to(
                new SmsDeliveryTimeTo()
                    .hour(deliveryTimeWindowToHours)
                    .minute(deliveryTimeWindowToMinutes)
            );

        SmsDestination firstDestination = new SmsDestination()
            .messageId(givenFirstDestinationMessageId)
            .to(givenFirstDestination);

        SmsDestination secondDestination = new SmsDestination()
            .messageId(givenSecondDestinationMessageId)
            .to(givenSecondDestination);

        SmsRegionalOptions regionalOptions = new SmsRegionalOptions()
            .indiaDlt(
                new SmsIndiaDltOptions()
                    .contentTemplateId(givenIndiaDltContentTemplateId)
                    .principalEntityId(givenIndiaDltPrincipalEntityId)
            ).turkeyIys(
                new SmsTurkeyIysOptions()
                    .brandCode(givenTurkeyIysBrandCode)
                    .recipientType(givenTurkeyIysRecipientType)
            ).southKorea(
                new SmsSouthKoreaOptions()
                    .resellerCode(givenResellerCode)
                    .title(givenSouthKoreaTitle)
            );

        SmsTextualMessage message = new SmsTextualMessage()
            .callbackData(givenCallbackData)
            .deliveryTimeWindow(givenDeliveryTimeWindow)
            .addDestinationsItem(firstDestination)
            .addDestinationsItem(secondDestination)
            .flash(givenFlash)
            .from(givenFrom)
            .intermediateReport(givenIntermediateReport)
            .language(new SmsLanguage().languageCode(givenLanguageCode))
            .notifyContentType(givenNotifyContentType)
            .notifyUrl(givenNotifyUrl)
            .regional(regionalOptions)
            .sendAt(givenSendAt)
            .text(givenText)
            .transliteration(givenTransliteration)
            .validityPeriod(givenValidityPeriod)
            .entityId(givenEntityId)
            .applicationId(givenApplicationId);

        SmsAdvancedTextualRequest request = new SmsAdvancedTextualRequest()
            .bulkId(givenBulkId)
            .addMessagesItem(message)
            .sendingSpeedLimit(
                new SmsSendingSpeedLimit()
                    .amount(givenSendingSpeedLimitAmount)
                    .timeUnit(givenSendingSpeedLimitTimeUnit)
            ).urlOptions(
                new SmsUrlOptions()
                    .shortenUrl(givenUrlOptionsShortenUrl)
                    .trackClicks(givenUrlOptionsTrackClicks)
                    .trackingUrl(givenUrlOptionsTrackingUrl)
                    .removeProtocol(givenUrlOptionsRemoveProtocol)
                    .customDomain(givenUrlOptionsCustomDomain)
            ).tracking(
                new SmsTracking()
                    .baseUrl(givenTrackingBaseUrl)
                    .processKey(givenTrackingProcessKey)
                    .track(givenTracking)
                    .type(givenTrackingType)
            );

        Consumer<SmsResponse> assertions = (smsResponse) -> {
            then(smsResponse).isNotNull();
            then(smsResponse.getBulkId()).isEqualTo(givenBulkId);

            List<SmsResponseDetails> smsResponseDetails = smsResponse.getMessages();
            then(smsResponseDetails).isNotNull();
            then(smsResponseDetails).hasSize(2);

            thenResponseDetailsForMessageHasStatusPending(smsResponseDetails.get(0), givenFirstDestination, givenFirstDestinationMessageId);
            thenResponseDetailsForMessageHasStatusPending(smsResponseDetails.get(1), givenSecondDestination, givenSecondDestinationMessageId);
        };

        var call = sendSmsApi.sendSmsMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendFullyFeaturedBinaryMessage() {
        String givenFromMessage1 = "InfoSMS";
        String givenToMessage1 = "41793026727";
        String givenMessageIdMessage1 = "MESSAGE-ID-123-xyz";
        String givenAnotherToMessage1 = "41793026834";
        String givenHexMessage1 = "54 65 73 74 20 6d 65 73 73 61 67 65 2e";
        int givenDataCodingMessage1 = 0;
        int givenEsmClassMessage1 = 0;
        boolean givenIntermediateReportMessage1 = true;
        String givenNotifyUrlMessage1 = "https://www.example.com/sms/advanced";
        String givenNotifyContentTypeMessage1 = "application/json";
        String givenCallbackDataMessage1 = "DLR callback data";
        Long givenValidityPeriodMessage1 = 720L;

        String expectedMessage1 = String.format("{" +
                                                    "  \"from\": \"%s\"," +
                                                    "  \"destinations\": [" +
                                                    "    {" +
                                                    "      \"to\": \"%s\"," +
                                                    "      \"messageId\": \"%s\"" +
                                                    "    }," +
                                                    "    {" +
                                                    "      \"to\": \"%s\"" +
                                                    "    }" +
                                                    "  ]," +
                                                    "  \"binary\": {" +
                                                    "    \"hex\": \"%s\"," +
                                                    "    \"dataCoding\": %d," +
                                                    "    \"esmClass\": %d" +
                                                    "  }," +
                                                    "  \"intermediateReport\": %s," +
                                                    "  \"notifyUrl\": \"%s\"," +
                                                    "  \"notifyContentType\": \"%s\"," +
                                                    "  \"callbackData\": \"%s\"," +
                                                    "  \"validityPeriod\": %d" +
                                                    "}",
                                                givenFromMessage1,
                                                givenToMessage1,
                                                givenMessageIdMessage1,
                                                givenAnotherToMessage1,
                                                givenHexMessage1,
                                                givenDataCodingMessage1,
                                                givenEsmClassMessage1,
                                                givenIntermediateReportMessage1,
                                                givenNotifyUrlMessage1,
                                                givenNotifyContentTypeMessage1,
                                                givenCallbackDataMessage1,
                                                givenValidityPeriodMessage1

        );

        String givenFromMessage2 = "41793026700";
        String givenToMessage2 = "41793026700";
        String givenHexMessage2 = "54 65 73 74 20 6d 65 73 73 61 67 65 2e";
        int givenDataCodingMessage2 = 0;
        int givenEsmClassMessage2 = 0;
        String givenSendAtMessage2 = "2021-08-08T16:10:00.000+0500";
        int givenDeliveryTimeFromHourMessage2 = 6;
        int givenDeliveryTimeFromMinuteMessage2 = 0;
        int givenDeliveryTimeToHourMessage2 = 15;
        int givenDeliveryTimeToMinuteMessage2 = 30;
        String givenContentTemplateIdMessage2 = "contentTemplateId";
        String givenPrincipalEntityIdMessage2 = "givenPrincipalEntityId";

        String expectedMessage2 = String.format("{" +
                                                    "  \"from\": \"%s\"," +
                                                    "  \"destinations\": [" +
                                                    "    {" +
                                                    "      \"to\": \"%s\"" +
                                                    "    }" +
                                                    "  ]," +
                                                    "  \"binary\": {" +
                                                    "    \"hex\": \"%s\"," +
                                                    "    \"dataCoding\": %d," +
                                                    "    \"esmClass\": %d" +
                                                    "  }," +
                                                    "  \"sendAt\": \"%s\"," +
                                                    "  \"deliveryTimeWindow\": {" +
                                                    "    \"from\": {" +
                                                    "      \"hour\": %d," +
                                                    "      \"minute\": %d" +
                                                    "    }," +
                                                    "    \"to\": {" +
                                                    "      \"hour\": %d," +
                                                    "      \"minute\": %d" +
                                                    "    }," +
                                                    "    \"days\": [" +
                                                    "      \"MONDAY\"," +
                                                    "      \"TUESDAY\"," +
                                                    "      \"WEDNESDAY\"" +
                                                    "    ]" +
                                                    "  }," +
                                                    "  \"regional\": {" +
                                                    "    \"indiaDlt\": {" +
                                                    "      \"contentTemplateId\": \"%s\"," +
                                                    "      \"principalEntityId\": \"%s\"" +
                                                    "    }" +
                                                    "  }" +
                                                    "}",
                                                givenFromMessage2,
                                                givenToMessage2,
                                                givenHexMessage2,
                                                givenDataCodingMessage2,
                                                givenEsmClassMessage2,
                                                givenSendAtMessage2,
                                                givenDeliveryTimeFromHourMessage2,
                                                givenDeliveryTimeFromMinuteMessage2,
                                                givenDeliveryTimeToHourMessage2,
                                                givenDeliveryTimeToMinuteMessage2,
                                                givenContentTemplateIdMessage2,
                                                givenPrincipalEntityIdMessage2
        );

        String givenBulkId = "BULK-ID-123-xyz";
        int givenSendingSpeedLimitAmount = 10;
        String givenSendingSpeedLimitTimeUnitString = "HOUR";
        SmsSpeedLimitTimeUnit givenSendingSpeedLimitTimeUnit = SmsSpeedLimitTimeUnit.HOUR;

        String expectedRequest = String.format("{" +
                                                   "  \"messages\": [" +
                                                   "    %s," +
                                                   "    %s" +
                                                   "  ]," +
                                                   "  \"bulkId\": \"%s\"," +
                                                   "  \"sendingSpeedLimit\": {" +
                                                   "    \"amount\": %d," +
                                                   "    \"timeUnit\": \"%s\"" +
                                                   "  }" +
                                                   "}",
                                               expectedMessage1,
                                               expectedMessage2,
                                               givenBulkId,
                                               givenSendingSpeedLimitAmount,
                                               givenSendingSpeedLimitTimeUnitString
        );

        String givenMessageIdMessage2 = "2033247207850523792";

        String givenResponse = givenPendingResponse(
            givenBulkId,
            givenToMessage1,
            givenMessageIdMessage1,
            givenToMessage2,
            givenMessageIdMessage2
        );

        setUpSuccessPostRequest(BINARY_ADVANCED, expectedRequest, givenResponse);

        SmsApi sendSmsApi = new SmsApi(getApiClient());

        SmsBinaryMessage message1 = new SmsBinaryMessage()
            .from(givenFromMessage1)
            .destinations(List.of(
                new SmsDestination()
                    .to(givenToMessage1)
                    .messageId(givenMessageIdMessage1),
                new SmsDestination()
                    .to(givenAnotherToMessage1)
            )).binary(
                new SmsBinaryContent()
                    .hex(givenHexMessage1)
                    .dataCoding(givenDataCodingMessage1)
                    .esmClass(givenEsmClassMessage1)
            ).intermediateReport(givenIntermediateReportMessage1)
            .notifyUrl(givenNotifyUrlMessage1)
            .notifyContentType(givenNotifyContentTypeMessage1)
            .callbackData(givenCallbackDataMessage1)
            .validityPeriod(givenValidityPeriodMessage1);

        SmsBinaryMessage message2 = new SmsBinaryMessage()
            .from(givenFromMessage2)
            .destinations(List.of(
                new SmsDestination()
                    .to(givenToMessage2)
            )).binary(
                new SmsBinaryContent()
                    .hex(givenHexMessage2)
                    .dataCoding(givenDataCodingMessage2)
                    .esmClass(givenEsmClassMessage2)
            )
            .sendAt(OffsetDateTime.of(2021, 8, 8, 16, 10, 0, 0, ZoneOffset.ofHours(5)))
            .deliveryTimeWindow(
                new SmsDeliveryTimeWindow()
                    .to(
                        new SmsDeliveryTimeTo()
                            .hour(givenDeliveryTimeToHourMessage2)
                            .minute(givenDeliveryTimeToMinuteMessage2)
                    )
                    .from(
                        new SmsDeliveryTimeFrom()
                            .hour(givenDeliveryTimeFromHourMessage2)
                            .minute(givenDeliveryTimeFromMinuteMessage2)
                    )
                    .days(List.of(SmsDeliveryDay.MONDAY, SmsDeliveryDay.TUESDAY, SmsDeliveryDay.WEDNESDAY))
            ).regional(
                new SmsRegionalOptions()
                    .indiaDlt(
                        new SmsIndiaDltOptions()
                            .contentTemplateId(givenContentTemplateIdMessage2)
                            .principalEntityId(givenPrincipalEntityIdMessage2)
                    )
            );

        SmsAdvancedBinaryRequest request = new SmsAdvancedBinaryRequest()
            .messages(List.of(message1, message2))
            .bulkId(givenBulkId)
            .sendingSpeedLimit(
                new SmsSendingSpeedLimit()
                    .amount(givenSendingSpeedLimitAmount)
                    .timeUnit(givenSendingSpeedLimitTimeUnit)
            );

        Consumer<SmsResponse> assertions = (smsResponse) -> {
            then(smsResponse).isNotNull();
            then(smsResponse.getBulkId()).isEqualTo(givenBulkId);

            List<SmsResponseDetails> smsResponseDetails = smsResponse.getMessages();
            then(smsResponseDetails).isNotNull();
            then(smsResponseDetails).hasSize(2);

            thenResponseDetailsForMessageHasStatusPending(smsResponseDetails.get(0), givenToMessage1, givenMessageIdMessage1);
            thenResponseDetailsForMessageHasStatusPending(smsResponseDetails.get(1), givenToMessage2, givenMessageIdMessage2);
        };

        var call = sendSmsApi.sendBinarySmsMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendFlashBinarySms() {
        String givenBulkId = "2034072219640523072";
        String givenTo = "41793026727";
        String givenMessageId = "2250be2d4219-3af1-78856-aabe-1362af1edfd2";

        String givenResponse = givenPendingResponse(givenBulkId, givenTo, givenMessageId);

        String givenFrom = "InfoSMS";
        String givenHex = "0048 0065 006c 006c 006f 0020 0077 006f 0072 006c 0064 002c 0020 039a 03b1 03bb 03b7 03bc 03ad 03c1 03b1 0020 03ba 03cc 03c3 03bc 03b5 002c 0020 30b3 30f3 30cb 30c1 30cf";
        int givenDataCoding = 0;
        int givenEsmClass = 0;
        boolean isFlash = true;

        String expectedRequest = String.format("{" +
                                                   "  \"messages\": [" +
                                                   "    {" +
                                                   "      \"from\": \"%s\"," +
                                                   "      \"destinations\": [" +
                                                   "        {" +
                                                   "          \"to\": \"%s\"" +
                                                   "        }" +
                                                   "      ]," +
                                                   "      \"binary\": {" +
                                                   "        \"hex\": \"%s\"," +
                                                   "        \"dataCoding\": %d," +
                                                   "        \"esmClass\": %d" +
                                                   "      }," +
                                                   "      \"flash\": %b" +
                                                   "    }" +
                                                   "  ]" +
                                                   "}",
                                               givenFrom,
                                               givenTo,
                                               givenHex,
                                               givenDataCoding,
                                               givenEsmClass,
                                               isFlash
        );

        setUpSuccessPostRequest(BINARY_ADVANCED, expectedRequest, givenResponse);

        SmsApi sendSmsApi = new SmsApi(getApiClient());

        SmsDestination destination = new SmsDestination()
            .to(givenTo);

        SmsBinaryMessage message = new SmsBinaryMessage()
            .from(givenFrom)
            .binary(
                new SmsBinaryContent()
                    .hex(givenHex)
                    .dataCoding(givenDataCoding)
                    .esmClass(givenEsmClass)
            )
            .destinations(List.of(destination))
            .flash(isFlash);

        SmsAdvancedBinaryRequest request = new SmsAdvancedBinaryRequest()
            .messages(List.of(message));

        Consumer<SmsResponse> assertions = (smsResponse) -> {
            then(smsResponse).isNotNull();
            then(smsResponse.getBulkId()).isEqualTo(givenBulkId);

            List<SmsResponseDetails> smsResponseDetails = smsResponse.getMessages();
            then(smsResponseDetails).isNotNull();
            then(smsResponseDetails).hasSize(1);
            thenResponseDetailsForMessageHasStatusPending(smsResponseDetails.get(0), givenTo, givenMessageId);
        };

        var call = sendSmsApi.sendBinarySmsMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldPreviewSmsMessage() {
        String givenOriginalText = "Let's see how many characters remain unused in this message.";
        String givenTextPreview = "Let's see how many characters remain unused in this message.";
        Integer givenMessageCount = 1;
        Integer givenCharactersRemaining = 96;

        String givenResponse = String.format("{\n" +
                                                 "  \"originalText\": \"%s\",\n" +
                                                 "  \"previews\": [\n" +
                                                 "    {\n" +
                                                 "      \"textPreview\": \"%s\",\n" +
                                                 "      \"messageCount\": %d,\n" +
                                                 "      \"charactersRemaining\": %d,\n" +
                                                 "      \"configuration\": {}\n" +
                                                 "    }\n" +
                                                 "  ]\n" +
                                                 "}\n",
                                             givenOriginalText,
                                             givenTextPreview,
                                             givenMessageCount,
                                             givenCharactersRemaining
        );

        String expectedRequest = String.format("{\n" +
                                                   "  \"text\": \"%s\"\n" +
                                                   "}\n",
                                               givenOriginalText
        );

        setUpSuccessPostRequest(
            PREVIEW,
            expectedRequest,
            givenResponse
        );

        SmsApi api = new SmsApi(getApiClient());

        SmsPreviewRequest request = new SmsPreviewRequest().text(givenOriginalText);

        Consumer<SmsPreviewResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getOriginalText()).isEqualTo(givenOriginalText);
            then(response.getPreviews()).isNotNull();
            then(response.getPreviews().size()).isEqualTo(1);
            var preview = response.getPreviews().get(0);
            then(preview.getTextPreview()).isEqualTo(givenTextPreview);
            then(preview.getMessageCount()).isEqualTo(givenMessageCount);
            then(preview.getCharactersRemaining()).isEqualTo(givenCharactersRemaining);
        };

        var call = api.previewSmsMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetDeliveryReports() {
        String givenBulkId = "BULK-ID-123-xyz";
        String givenMessageId = "MESSAGE-ID-123-xyz";
        String givenTo = "41793026727";
        String givenSentAt = "2019-11-09T16:00:00.000+0000";
        OffsetDateTime givenSentAtDateTime = OffsetDateTime.of(
            LocalDateTime.of(2019, 11, 9, 16, 0, 0),
            ZoneOffset.ofHours(0));
        String givenDoneAt = "2019-11-09T16:00:00.000+0000";
        OffsetDateTime givenDoneAtDateTime = OffsetDateTime.of(
            LocalDateTime.of(2019, 11, 9, 16, 0, 0),
            ZoneOffset.ofHours(0));
        Integer givenSmsCount = 1;
        Double givenPricePerMessage = 0.01;
        String givenCurrency = "EUR";
        Integer givenGroupId = 3;
        String givenGroupName = "DELIVERED";
        Integer givenId = 5;
        String givenName = "DELIVERED_TO_HANDSET";
        String givenDescription = "Message delivered to handset";
        Integer givenErrorGroupId = 0;
        String givenErrorGroupName = "Ok";
        Integer givenErrorId = 0;
        String givenErrorName = "NO_ERROR";
        String givenErrorDescription = "No Error";
        Boolean givenErrorPermanent = false;
        String givenMessageId2 = "12db39c3-7822-4e72-a3ec-c87442c0ffc5";
        String givenTo2 = "41793026834";

        String givenResponse = String.format("{\n" +
                                                 "  \"results\": [\n" +
                                                 "    {\n" +
                                                 "      \"bulkId\": \"%s\",\n" +
                                                 "      \"messageId\": \"%s\",\n" +
                                                 "      \"to\": \"%s\",\n" +
                                                 "      \"sentAt\": \"%s\",\n" +
                                                 "      \"doneAt\": \"%s\",\n" +
                                                 "      \"smsCount\": %d,\n" +
                                                 "      \"price\": {\n" +
                                                 "        \"pricePerMessage\": %f,\n" +
                                                 "        \"currency\": \"%s\"\n" +
                                                 "      },\n" +
                                                 "      \"status\": {\n" +
                                                 "        \"groupId\": %d,\n" +
                                                 "        \"groupName\": \"%s\",\n" +
                                                 "        \"id\": %d,\n" +
                                                 "        \"name\": \"%s\",\n" +
                                                 "        \"description\": \"%s\"\n" +
                                                 "      },\n" +
                                                 "      \"error\": {\n" +
                                                 "        \"groupId\": %d,\n" +
                                                 "        \"groupName\": \"%s\",\n" +
                                                 "        \"id\": %d,\n" +
                                                 "        \"name\": \"%s\",\n" +
                                                 "        \"description\": \"%s\",\n" +
                                                 "        \"permanent\": %b\n" +
                                                 "      }\n" +
                                                 "    },\n" +
                                                 "    {\n" +
                                                 "      \"bulkId\": \"%s\",\n" +
                                                 "      \"messageId\": \"%s\",\n" +
                                                 "      \"to\": \"%s\",\n" +
                                                 "      \"sentAt\": \"%s\",\n" +
                                                 "      \"doneAt\": \"%s\",\n" +
                                                 "      \"smsCount\": %d,\n" +
                                                 "      \"price\": {\n" +
                                                 "        \"pricePerMessage\": %f,\n" +
                                                 "        \"currency\": \"%s\"\n" +
                                                 "      },\n" +
                                                 "      \"status\": {\n" +
                                                 "        \"groupId\": %d,\n" +
                                                 "        \"groupName\": \"%s\",\n" +
                                                 "        \"id\": %d,\n" +
                                                 "        \"name\": \"%s\",\n" +
                                                 "        \"description\": \"%s\"\n" +
                                                 "      },\n" +
                                                 "      \"error\": {\n" +
                                                 "        \"groupId\": %d,\n" +
                                                 "        \"groupName\": \"%s\",\n" +
                                                 "        \"id\": %d,\n" +
                                                 "        \"name\": \"%s\",\n" +
                                                 "        \"description\": \"%s\",\n" +
                                                 "        \"permanent\": %b\n" +
                                                 "      }\n" +
                                                 "    }\n" +
                                                 "  ]\n" +
                                                 "}\n",
                                             givenBulkId, givenMessageId, givenTo, givenSentAt, givenDoneAt, givenSmsCount,
                                             givenPricePerMessage, givenCurrency,
                                             givenGroupId, givenGroupName, givenId, givenName, givenDescription,
                                             givenErrorGroupId, givenErrorGroupName, givenErrorId, givenErrorName, givenErrorDescription, givenErrorPermanent,
                                             givenBulkId, givenMessageId2, givenTo2, givenSentAt, givenDoneAt, givenSmsCount,
                                             givenPricePerMessage, givenCurrency,
                                             givenGroupId, givenGroupName, givenId, givenName, givenDescription,
                                             givenErrorGroupId, givenErrorGroupName, givenErrorId, givenErrorName, givenErrorDescription, givenErrorPermanent
        );

        setUpSuccessGetRequest(
            REPORTS,
            Map.of(),
            givenResponse
        );

        SmsApi api = new SmsApi(getApiClient());

        Consumer<SmsDeliveryResult> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults()).isNotNull();
            var results = response.getResults();
            then(results.size()).isEqualTo(2);
            var result1 = results.get(0);
            then(result1.getBulkId()).isEqualTo(givenBulkId);
            then(result1.getMessageId()).isEqualTo(givenMessageId);
            then(result1.getTo()).isEqualTo(givenTo);
            then(result1.getSentAt()).isEqualTo(givenSentAtDateTime);
            then(result1.getDoneAt()).isEqualTo(givenDoneAtDateTime);
            then(result1.getSmsCount()).isEqualTo(givenSmsCount);
            then(result1.getPrice()).isNotNull();
            var price1 = result1.getPrice();
            then(price1.getPricePerMessage()).isEqualTo(givenPricePerMessage);
            then(price1.getCurrency()).isEqualTo(givenCurrency);
            var status1 = result1.getStatus();
            then(status1.getGroupId()).isEqualTo(givenGroupId);
            then(status1.getGroupName()).isEqualTo(givenGroupName);
            then(status1.getId()).isEqualTo(givenId);
            then(status1.getName()).isEqualTo(givenName);
            then(status1.getDescription()).isEqualTo(givenDescription);
            var error1 = result1.getError();
            then(error1.getGroupId()).isEqualTo(givenErrorGroupId);
            then(error1.getGroupName()).isEqualTo(givenErrorGroupName);
            then(error1.getId()).isEqualTo(givenErrorId);
            then(error1.getName()).isEqualTo(givenErrorName);
            then(error1.getDescription()).isEqualTo(givenErrorDescription);
            then(error1.getPermanent()).isEqualTo(givenErrorPermanent);

            var result2 = results.get(1);
            then(result2.getBulkId()).isEqualTo(givenBulkId);
            then(result2.getMessageId()).isEqualTo(givenMessageId2);
            then(result2.getTo()).isEqualTo(givenTo2);
            then(result2.getSentAt()).isEqualTo(givenSentAtDateTime);
            then(result2.getDoneAt()).isEqualTo(givenDoneAtDateTime);
            then(result2.getSmsCount()).isEqualTo(givenSmsCount);
            then(result2.getPrice()).isNotNull();
            var price2 = result2.getPrice();
            then(price2.getPricePerMessage()).isEqualTo(givenPricePerMessage);
            then(price2.getCurrency()).isEqualTo(givenCurrency);
            var status2 = result2.getStatus();
            then(status2.getGroupId()).isEqualTo(givenGroupId);
            then(status2.getGroupName()).isEqualTo(givenGroupName);
            then(status2.getId()).isEqualTo(givenId);
            then(status2.getName()).isEqualTo(givenName);
            then(status2.getDescription()).isEqualTo(givenDescription);
            var error2 = result2.getError();
            then(error2.getGroupId()).isEqualTo(givenErrorGroupId);
            then(error2.getGroupName()).isEqualTo(givenErrorGroupName);
            then(error2.getId()).isEqualTo(givenErrorId);
            then(error2.getName()).isEqualTo(givenErrorName);
            then(error2.getDescription()).isEqualTo(givenErrorDescription);
            then(error2.getPermanent()).isEqualTo(givenErrorPermanent);

        };

        var call = api.getOutboundSmsMessageDeliveryReports();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetSmsLogs() {
        String givenBulkId = "BULK-ID-123-xyz";
        String givenSentSinceString = "2015-02-22T17:42:05.390+0100";
        OffsetDateTime givenSentSinceDateTime = OffsetDateTime.of(
            LocalDateTime.of(2015, 2, 22, 17, 42, 5, 390000000),
            ZoneOffset.ofHours(1)
        );

        String givenMessageIdMessage1 = "MESSAGE-ID-123-xyz";
        String givenToMessage1 = "41793026727";
        String givenSendAtMessage1 = "2019-11-09T16:00:00.000+0000";
        String givenDoneAtMessage1 = "2019-11-09T16:00:00.000+0000";
        int givenSmsCountMessage1 = 1;
        double givenPricePerMessageMessage1 = 0.01;
        String givenCurrencyMessage1 = "EUR";

        String givenMessageIdMessage2 = "12db39c3-7822-4e72-a3ec-c87442c0ffc5";
        String givenToMessage2 = "41793026834";
        String givenSendAtMessage2 = "2019-11-09T17:00:00.000+0000";
        String givenDoneAtMessage2 = "2019-11-09T17:00:00.000+0000";
        int givenSmsCountMessage2 = 5;
        double givenPricePerMessageMessage2 = 0.05;
        String givenCurrencyMessage2 = "HRK";
        var givenApplicationId = "applicationId";
        var givenEntityId = "entityId";

        String givenResponse = String.format("{" +
                                                 "  \"results\": [" +
                                                 "    {" +
                                                 "      \"bulkId\": \"%s\"," +
                                                 "      \"applicationId\": \"%s\"," +
                                                 "      \"entityId\": \"%s\"," +
                                                 "      \"messageId\": \"%s\"," +
                                                 "      \"to\": \"%s\"," +
                                                 "      \"sentAt\": \"%s\"," +
                                                 "      \"doneAt\": \"%s\"," +
                                                 "      \"smsCount\": %d," +
                                                 "      \"price\": {" +
                                                 "        \"pricePerMessage\": %g," +
                                                 "        \"currency\": \"%s\"" +
                                                 "      }," +
                                                 "      \"status\": {" +
                                                 "        \"groupId\": %d," +
                                                 "        \"groupName\": \"%s\"," +
                                                 "        \"id\": %d," +
                                                 "        \"name\": \"%s\"," +
                                                 "        \"description\": \"%s\"" +
                                                 "      }," +
                                                 "      \"error\": {" +
                                                 "        \"groupId\": %d," +
                                                 "        \"groupName\": \"%s\"," +
                                                 "        \"id\": %d," +
                                                 "        \"name\": \"%s\"," +
                                                 "        \"description\": \"%s\"," +
                                                 "        \"permanent\": %b" +
                                                 "      }" +
                                                 "    }," +
                                                 "    {" +
                                                 "      \"bulkId\": \"%s\"," +
                                                 "      \"messageId\": \"%s\"," +
                                                 "      \"to\": \"%s\"," +
                                                 "      \"sentAt\": \"%s\"," +
                                                 "      \"doneAt\": \"%s\"," +
                                                 "      \"smsCount\": %d," +
                                                 "      \"price\": {" +
                                                 "        \"pricePerMessage\": %g," +
                                                 "        \"currency\": \"%s\"" +
                                                 "      }," +
                                                 "      \"status\": {" +
                                                 "        \"groupId\": %d," +
                                                 "        \"groupName\": \"%s\"," +
                                                 "        \"id\": %d," +
                                                 "        \"name\": \"%s\"," +
                                                 "        \"description\": \"%s\"" +
                                                 "      }," +
                                                 "      \"error\": {" +
                                                 "        \"groupId\": %d," +
                                                 "        \"groupName\": \"%s\"," +
                                                 "        \"id\": %d," +
                                                 "        \"name\": \"%s\"," +
                                                 "        \"description\": \"%s\"," +
                                                 "        \"permanent\": %b" +
                                                 "      }" +
                                                 "    }" +
                                                 "  ]" +
                                                 "}",
                                             givenBulkId,
                                             givenApplicationId,
                                             givenEntityId,
                                             givenMessageIdMessage1,
                                             givenToMessage1,
                                             givenSendAtMessage1,
                                             givenDoneAtMessage1,
                                             givenSmsCountMessage1,
                                             givenPricePerMessageMessage1,
                                             givenCurrencyMessage1,
                                             DELIVERED_STATUS_GROUP_ID,
                                             DELIVERED_STATUS_GROUP_NAME,
                                             DELIVERED_STATUS_ID,
                                             DELIVERED_STATUS_NAME,
                                             DELIVERED_STATUS_DESCRIPTION,
                                             NO_ERROR_GROUP_ID,
                                             NO_ERROR_GROUP_NAME,
                                             NO_ERROR_ID,
                                             NO_ERROR_NAME,
                                             NO_ERROR_DESCRIPTION,
                                             NO_ERROR_IS_PERMANENT,
                                             givenBulkId,
                                             givenMessageIdMessage2,
                                             givenToMessage2,
                                             givenSendAtMessage2,
                                             givenDoneAtMessage2,
                                             givenSmsCountMessage2,
                                             givenPricePerMessageMessage2,
                                             givenCurrencyMessage2,
                                             DELIVERED_STATUS_GROUP_ID,
                                             DELIVERED_STATUS_GROUP_NAME,
                                             DELIVERED_STATUS_ID,
                                             DELIVERED_STATUS_NAME,
                                             DELIVERED_STATUS_DESCRIPTION,
                                             NO_ERROR_GROUP_ID,
                                             NO_ERROR_GROUP_NAME,
                                             NO_ERROR_ID,
                                             NO_ERROR_NAME,
                                             NO_ERROR_DESCRIPTION,
                                             NO_ERROR_IS_PERMANENT
        );

        setUpSuccessGetRequest(
            LOGS,
            Map.of(
                "bulkId", givenBulkId,
                "sentSince", givenSentSinceString
            ),
            givenResponse
        );

        SmsApi sendSmsApi = new SmsApi(getApiClient());

        Consumer<SmsLogsResponse> assertions = smsLogsResponse -> {
            then(smsLogsResponse).isNotNull();
            List<SmsLog> results = smsLogsResponse.getResults();
            then(results).isNotNull();
            then(results).hasSize(2);

            OffsetDateTime expectedSendAtMessage1 = OffsetDateTime.of(
                LocalDateTime.of(2019, 11, 9, 16, 0),
                ZoneOffset.UTC
            );

            OffsetDateTime expectedDoneAtMessage1 = OffsetDateTime.of(
                LocalDateTime.of(2019, 11, 9, 16, 0),
                ZoneOffset.UTC
            );

            SmsLog log = results.get(0);
            then(log).isNotNull();
            then(log.getBulkId()).isEqualTo(givenBulkId);
            then(log.getMessageId()).isEqualTo(givenMessageIdMessage1);
            then(log.getTo()).isEqualTo(givenToMessage1);
            then(log.getSentAt()).isEqualTo(expectedSendAtMessage1);
            then(log.getDoneAt()).isEqualTo(expectedDoneAtMessage1);
            then(log.getFrom()).isNull();
            then(log.getText()).isNull();
            then(log.getMccMnc()).isNull();
            then(log.getApplicationId()).isEqualTo(givenApplicationId);
            then(log.getEntityId()).isEqualTo(givenEntityId);

            thenPriceIsEqualTo(log.getPrice(), givenPricePerMessageMessage1, givenCurrencyMessage1);
            thenStatusIsDelivered(log.getStatus());
            thenNoError(log.getError());

            OffsetDateTime expectedSendAtMessage2 = OffsetDateTime.of(
                LocalDateTime.of(2019, 11, 9, 17, 0),
                ZoneOffset.UTC
            );

            OffsetDateTime expectedDoneAtMessage2 = OffsetDateTime.of(
                LocalDateTime.of(2019, 11, 9, 17, 0),
                ZoneOffset.UTC
            );

            SmsLog anotherLog = results.get(1);
            then(anotherLog).isNotNull();
            then(anotherLog.getBulkId()).isEqualTo(givenBulkId);
            then(anotherLog.getMessageId()).isEqualTo(givenMessageIdMessage2);
            then(anotherLog.getTo()).isEqualTo(givenToMessage2);
            then(anotherLog.getSentAt()).isEqualTo(expectedSendAtMessage2);
            then(anotherLog.getDoneAt()).isEqualTo(expectedDoneAtMessage2);
            then(anotherLog.getFrom()).isNull();
            then(anotherLog.getText()).isNull();
            then(anotherLog.getMccMnc()).isNull();
            thenPriceIsEqualTo(anotherLog.getPrice(), givenPricePerMessageMessage2, givenCurrencyMessage2);
            thenStatusIsDelivered(anotherLog.getStatus());
            thenNoError(anotherLog.getError());
        };

        var call = sendSmsApi.getOutboundSmsMessageLogs()
                             .bulkId(List.of(givenBulkId))
                             .sentSince(givenSentSinceDateTime);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    private String givenPendingResponse(String givenBulkId, String givenTo, String givenMessageId) {
        return String.format("{" +
                                 "  \"bulkId\": \"%s\"," +
                                 "  \"messages\": [" +
                                 "    %s" +
                                 "  ]" +
                                 "}",
                             givenBulkId,
                             givenPendingResponseDetails(givenTo, givenMessageId)
        );
    }

    private String givenPendingResponse(
        String givenBulkId,
        String givenToMessage1,
        String givenMessageIdMessage1,
        String givenToMessage2,
        String givenMessageIdMessage2
    ) {
        return String.format("{" +
                                 "  \"bulkId\": \"%s\"," +
                                 "  \"messages\": [" +
                                 "    %s," +
                                 "    %s" +
                                 "  ]" +
                                 "}",
                             givenBulkId,
                             givenPendingResponseDetails(givenToMessage1, givenMessageIdMessage1),
                             givenPendingResponseDetails(givenToMessage2, givenMessageIdMessage2)
        );
    }

    private String givenPendingResponseDetails(String givenTo, String givenMessageId) {
        return String.format("{" +
                                 "  \"to\": \"%s\"," +
                                 "  \"status\": {" +
                                 "    \"groupId\": %d," +
                                 "    \"groupName\": \"%s\"," +
                                 "    \"id\": %d," +
                                 "    \"name\": \"%s\"," +
                                 "    \"description\": \"%s\"" +
                                 "  }," +
                                 "  \"messageId\": \"%s\"" +
                                 "}",
                             givenTo,
                             PENDING_STATUS_GROUP_ID,
                             PENDING_STATUS_GROUP_NAME,
                             PENDING_STATUS_ID,
                             PENDING_STATUS_NAME,
                             PENDING_STATUS_DESCRIPTION,
                             givenMessageId
        );
    }

    private void thenResponseDetailsForMessageHasStatusPending(
        SmsResponseDetails responseDetails,
        String expectedTo,
        String expectedMessageId
    ) {
        then(responseDetails.getTo()).isEqualTo(expectedTo);
        then(responseDetails.getMessageId()).isEqualTo(expectedMessageId);
        thenStatusIsPending(responseDetails.getStatus());
    }

    private void thenStatusIsPending(MessageStatus status) {
        then(status).isNotNull();
        then(status.getGroupId()).isEqualTo(PENDING_STATUS_GROUP_ID);
        then(status.getGroupName()).isEqualTo(PENDING_STATUS_GROUP_NAME);
        then(status.getId()).isEqualTo(PENDING_STATUS_ID);
        then(status.getName()).isEqualTo(PENDING_STATUS_NAME);
        then(status.getDescription()).isEqualTo(PENDING_STATUS_DESCRIPTION);
        then(status.getAction()).isNull();
    }

    private void thenStatusIsDelivered(MessageStatus status) {
        then(status).isNotNull();
        then(status.getGroupId()).isEqualTo(DELIVERED_STATUS_GROUP_ID);
        then(status.getGroupName()).isEqualTo(DELIVERED_STATUS_GROUP_NAME);
        then(status.getId()).isEqualTo(DELIVERED_STATUS_ID);
        then(status.getName()).isEqualTo(DELIVERED_STATUS_NAME);
        then(status.getDescription()).isEqualTo(DELIVERED_STATUS_DESCRIPTION);
        then(status.getAction()).isNull();
    }

    private void thenPriceIsEqualTo(MessagePrice price, double expectedPricePerMessage, String expectedCurrency) {
        then(price).isNotNull();
        then(price.getPricePerMessage()).isEqualTo(expectedPricePerMessage);
        then(price.getCurrency()).isEqualTo(expectedCurrency);
    }

    private void thenNoError(MessageError error) {
        then(error).isNotNull();
        then(error.getGroupId()).isEqualTo(NO_ERROR_GROUP_ID);
        then(error.getGroupName()).isEqualTo(NO_ERROR_GROUP_NAME);
        then(error.getId()).isEqualTo(NO_ERROR_ID);
        then(error.getName()).isEqualTo(NO_ERROR_NAME);
        then(error.getDescription()).isEqualTo(NO_ERROR_DESCRIPTION);
        then(error.getPermanent()).isEqualTo(NO_ERROR_IS_PERMANENT);
    }

    @Test
    void shouldGetReceivedSmsMessages() {
        String givenMessageId = "817790313235066447";
        String givenFrom = "385916242493";
        String givenTo = "385921004026";
        String givenText = "QUIZ Correct answer is Paris";
        String givenCleanText = "Correct answer is Paris";
        String givenKeyword = "QUIZ";
        String givenReceivedAtString = "2021-08-25T16:10:00.000+0500";
        OffsetDateTime givenReceivedAt = OffsetDateTime.of(
            LocalDateTime.of(2021, 8, 25, 16, 10, 0),
            ZoneOffset.ofHours(5)
        );
        int givenSmsCount = 1;
        double givenPricePerMessage = 0;
        String givenCurrency = "EUR";
        String givenCallbackData = "callbackData";
        int givenMessageCount = 1;
        int givenPendingMessageCount = 0;
        var givenApplicationId = "applicationId";
        var givenEntityId = "entityId";

        String givenResponse = String.format("{\n" +
                                                 "    \"results\": [\n" +
                                                 "      {\n" +
                                                 "        \"messageId\": \"%s\",\n" +
                                                 "        \"from\": \"%s\",\n" +
                                                 "        \"to\": \"%s\",\n" +
                                                 "        \"text\": \"%s\",\n" +
                                                 "        \"cleanText\": \"%s\",\n" +
                                                 "        \"keyword\": \"%s\",\n" +
                                                 "        \"receivedAt\": \"%s\",\n" +
                                                 "        \"smsCount\": %d,\n" +
                                                 "        \"price\": {\n" +
                                                 "          \"pricePerMessage\": %g,\n" +
                                                 "          \"currency\": \"%s\"\n" +
                                                 "        },\n" +
                                                 "        \"callbackData\": \"%s\",\n" +
                                                 "        \"applicationId\": \"%s\",\n" +
                                                 "        \"entityId\": \"%s\"\n" +
                                                 "      }\n" +
                                                 "    ],\n" +
                                                 "    \"messageCount\": %d,\n" +
                                                 "    \"pendingMessageCount\": %d\n" +
                                                 "}\n",
                                             givenMessageId,
                                             givenFrom,
                                             givenTo,
                                             givenText,
                                             givenCleanText,
                                             givenKeyword,
                                             givenReceivedAtString,
                                             givenSmsCount,
                                             givenPricePerMessage,
                                             givenCurrency,
                                             givenCallbackData,
                                             givenApplicationId,
                                             givenEntityId,
                                             givenMessageCount,
                                             givenPendingMessageCount
        );

        Integer givenLimit = 2;

        setUpSuccessGetRequest(
            INBOX_REPORTS,
            Map.of("limit", givenLimit.toString()),
            givenResponse
        );

        SmsApi receiveSmsApi = new SmsApi(getApiClient());

        Consumer<SmsInboundMessageResult> assertions = inboundMessageResult -> {
            then(inboundMessageResult).isNotNull();
            then(inboundMessageResult.getMessageCount()).isEqualTo(givenMessageCount);
            then(inboundMessageResult.getPendingMessageCount()).isEqualTo(givenPendingMessageCount);

            List<SmsInboundMessage> messages = inboundMessageResult.getResults();
            then(messages).isNotNull();
            then(messages).hasSize(1);

            SmsInboundMessage message = messages.get(0);
            then(message).isNotNull();
            then(message.getMessageId()).isEqualTo(givenMessageId);
            then(message.getFrom()).isEqualTo(givenFrom);
            then(message.getTo()).isEqualTo(givenTo);
            then(message.getText()).isEqualTo(givenText);
            then(message.getCleanText()).isEqualTo(givenCleanText);
            then(message.getKeyword()).isEqualTo(givenKeyword);
            then(message.getReceivedAt()).isEqualTo(givenReceivedAt);
            then(message.getSmsCount()).isEqualTo(givenSmsCount);
            then(message.getCallbackData()).isEqualTo(givenCallbackData);
            then(message.getApplicationId()).isEqualTo(givenApplicationId);
            then(message.getEntityId()).isEqualTo(givenEntityId);

            MessagePrice price = message.getPrice();
            then(price).isNotNull();
            then(price.getPricePerMessage()).isEqualTo(givenPricePerMessage);
            then(price.getCurrency()).isEqualTo(givenCurrency);
        };

        var call = receiveSmsApi.getInboundSmsMessages()
                                .limit(givenLimit);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendSMSDeliveryReports() {
        String givenBulkId = "BULK-ID-123-xyz";
        String givenMessageIdMessage1 = "MESSAGE-ID-123-xyz";
        String givenToMessage1 = "41793026727";
        String givenSentAtMessage1 = "2019-11-09T16:00:00.000+0000";
        String givenDoneAtMessage1 = "2019-11-09T16:00:00.000+0000";
        Integer givenSmsCountMessage1 = 1;

        double givenPricePerMessageMessage1 = 0.01;
        String givenCurrencyMessage1 = "EUR";

        Integer givenStatusGroupIdMessage1 = 3;
        String givenStatusGroupNameMessage1 = "DELIVERED";
        Integer givenStatusIdMessage1 = 5;
        String givenStatusNameMessage1 = "DELIVERED_TO_HANDSET";
        String givenStatusDescriptionMessage1 = "Message delivered to handset";

        Integer givenErrorGroupIdMessage1 = 0;
        String givenErrorGroupNameMessage1 = "OK";
        Integer givenErrorIdMessage1 = 0;
        String givenErrorNameMessage1 = "NO_ERROR";
        String givenErrorDescriptionMessage1 = "No Error";
        boolean givenErrorPermanentMessage1 = false;

        String givenMessageIdMessage2 = "12db39c3-7822-4e72-a3ec-c87442c0ffc5";
        String givenToMessage2 = "41793026834";
        String givenSentAtMessage2 = "2019-11-09T17:00:00.000+0000";
        String givenDoneAtMessage2 = "2019-11-09T17:00:00.000+0000";
        Integer givenSmsCountMessage2 = 1;

        double givenPricePerMessageMessage2 = 0.01;
        String givenCurrencyMessage2 = "EUR";

        Integer givenStatusGroupIdMessage2 = 3;
        String givenStatusGroupNameMessage2 = "DELIVERED";
        Integer givenStatusIdMessage2 = 5;
        String givenStatusNameMessage2 = "DELIVERED_TO_HANDSET";
        String givenStatusDescriptionMessage2 = "Message delivered to handset";

        Integer givenErrorGroupIdMessage2 = 0;
        String givenErrorGroupNameMessage2 = "OK";
        Integer givenErrorIdMessage2 = 0;
        String givenErrorNameMessage2 = "NO_ERROR";
        String givenErrorDescriptionMessage2 = "No Error";
        boolean givenErrorPermanentMessage2 = false;
        var givenApplicationId = "application";
        var givenEntityId = "entity";

        String givenResponse = String.format("{" +
                                                 "  \"results\": [" +
                                                 "    {" +
                                                 "   \"bulkId\": \"%s\"," +
                                                 "   \"applicationId\": \"%s\"," +
                                                 "   \"entityId\": \"%s\"," +
                                                 "   \"messageId\": \"%s\"," +
                                                 "   \"to\": \"%s\"," +
                                                 "   \"sentAt\": \"%s\"," +
                                                 "   \"doneAt\": \"%s\"," +
                                                 "   \"smsCount\": %s," +
                                                 "   \"price\": {" +
                                                 "     \"pricePerMessage\": %g," +
                                                 "     \"currency\": \"%s\"" +
                                                 "    }," +
                                                 "   \"status\": {" +
                                                 "     \"groupId\": %d," +
                                                 "     \"groupName\": \"%s\"," +
                                                 "     \"id\": %d," +
                                                 "     \"name\": \"%s\"," +
                                                 "     \"description\": \"%s\"" +
                                                 "    }," +
                                                 "   \"error\": {" +
                                                 "     \"groupId\": %d," +
                                                 "     \"groupName\": \"%s\"," +
                                                 "     \"id\": %d," +
                                                 "     \"name\": \"%s\"," +
                                                 "     \"description\": \"%s\"," +
                                                 "     \"permanent\": \"%b\"" +
                                                 "    }" +
                                                 "  }," +
                                                 "    {" +
                                                 "   \"bulkId\": \"%s\"," +
                                                 "   \"messageId\": \"%s\"," +
                                                 "   \"to\": \"%s\"," +
                                                 "   \"sentAt\": \"%s\"," +
                                                 "   \"doneAt\": \"%s\"," +
                                                 "   \"smsCount\": %s," +
                                                 "   \"price\": {" +
                                                 "     \"pricePerMessage\": %g," +
                                                 "     \"currency\": \"%s\"" +
                                                 "    }," +
                                                 "   \"status\": {" +
                                                 "     \"groupId\": %d," +
                                                 "     \"groupName\": \"%s\"," +
                                                 "     \"id\": %d," +
                                                 "     \"name\": \"%s\"," +
                                                 "     \"description\": \"%s\"" +
                                                 "    }," +
                                                 "   \"error\": {" +
                                                 "     \"groupId\": %d," +
                                                 "     \"groupName\": \"%s\"," +
                                                 "     \"id\": %d," +
                                                 "     \"name\": \"%s\"," +
                                                 "     \"description\": \"%s\"," +
                                                 "     \"permanent\": \"%b\"" +
                                                 "    }" +
                                                 "   }" +
                                                 "  ]" +
                                                 "}",
                                             givenBulkId,
                                             givenApplicationId,
                                             givenEntityId,
                                             givenMessageIdMessage1,
                                             givenToMessage1,
                                             givenSentAtMessage1,
                                             givenDoneAtMessage1,
                                             givenSmsCountMessage1,
                                             givenPricePerMessageMessage1,
                                             givenCurrencyMessage1,
                                             givenStatusGroupIdMessage1,
                                             givenStatusGroupNameMessage1,
                                             givenStatusIdMessage1,
                                             givenStatusNameMessage1,
                                             givenStatusDescriptionMessage1,
                                             givenErrorGroupIdMessage1,
                                             givenErrorGroupNameMessage1,
                                             givenErrorIdMessage1,
                                             givenErrorNameMessage1,
                                             givenErrorDescriptionMessage1,
                                             givenErrorPermanentMessage1,
                                             givenBulkId,
                                             givenMessageIdMessage2,
                                             givenToMessage2,
                                             givenSentAtMessage2,
                                             givenDoneAtMessage2,
                                             givenSmsCountMessage2,
                                             givenPricePerMessageMessage2,
                                             givenCurrencyMessage2,
                                             givenStatusGroupIdMessage2,
                                             givenStatusGroupNameMessage2,
                                             givenStatusIdMessage2,
                                             givenStatusNameMessage2,
                                             givenStatusDescriptionMessage2,
                                             givenErrorGroupIdMessage2,
                                             givenErrorGroupNameMessage2,
                                             givenErrorIdMessage2,
                                             givenErrorNameMessage2,
                                             givenErrorDescriptionMessage2,
                                             givenErrorPermanentMessage2
        );

        String messageIdParameter = "MESSAGE-ID-123-xyz";
        String limitParameter = "2";
        setUpSuccessGetRequest(
            REPORTS,
            Map.of(
                "messageId", messageIdParameter,
                "limit", limitParameter
            ),
            givenResponse
        );

        SmsApi sendSmsApi = new SmsApi(getApiClient());

        OffsetDateTime expectedSendAtMessage1 = OffsetDateTime.of(
            LocalDateTime.of(2019, 11, 9, 16, 0),
            ZoneOffset.UTC
        );
        OffsetDateTime expectedDoneAtMessage1 = OffsetDateTime.of(
            LocalDateTime.of(2019, 11, 9, 16, 0),
            ZoneOffset.UTC
        );
        OffsetDateTime expectedSendAtMessage2 = OffsetDateTime.of(
            LocalDateTime.of(2019, 11, 9, 17, 0),
            ZoneOffset.UTC
        );
        OffsetDateTime expectedDoneAtMessage2 = OffsetDateTime.of(
            LocalDateTime.of(2019, 11, 9, 17, 0),
            ZoneOffset.UTC
        );

        Consumer<SmsDeliveryResult> assertions = (deliveryResult) -> {
            then(deliveryResult).isNotNull();
            List<SmsReport> reports = deliveryResult.getResults();
            then(reports).hasSize(2);
            SmsReport report1 = reports.get(0);
            then(report1.getBulkId()).isEqualTo(givenBulkId);
            then(report1.getApplicationId()).isEqualTo(givenApplicationId);
            then(report1.getEntityId()).isEqualTo(givenEntityId);
            then(report1.getMessageId()).isEqualTo(givenMessageIdMessage1);
            then(report1.getTo()).isEqualTo(givenToMessage1);
            then(report1.getSentAt()).isEqualTo(expectedSendAtMessage1);
            then(report1.getDoneAt()).isEqualTo(expectedDoneAtMessage1);
            then(report1.getSmsCount()).isEqualTo(givenSmsCountMessage1);
            MessagePrice price1 = report1.getPrice();
            then(report1.getPrice()).isNotNull();
            then(price1.getPricePerMessage()).isEqualTo(givenPricePerMessageMessage1);
            then(price1.getCurrency()).isEqualTo(givenCurrencyMessage1);
            then(report1.getStatus()).isNotNull();
            MessageStatus status1 = report1.getStatus();
            then(status1.getGroupId()).isEqualTo(givenStatusGroupIdMessage1);
            then(status1.getGroupName()).isEqualTo(givenStatusGroupNameMessage1);
            then(status1.getId()).isEqualTo(givenStatusIdMessage1);
            then(status1.getDescription()).isEqualTo(givenStatusDescriptionMessage1);
            then(report1.getError()).isNotNull();
            MessageError error1 = report1.getError();
            then(error1.getGroupId()).isEqualTo(givenErrorGroupIdMessage1);
            then(error1.getGroupName()).isEqualTo(givenErrorGroupNameMessage1);
            then(error1.getName()).isEqualTo(givenErrorNameMessage1);
            then(error1.getDescription()).isEqualTo(givenErrorDescriptionMessage1);
            then(error1.getPermanent()).isEqualTo(givenErrorPermanentMessage1);

            SmsReport report2 = reports.get(1);
            then(report2.getBulkId()).isEqualTo(givenBulkId);
            then(report2.getMessageId()).isEqualTo(givenMessageIdMessage2);
            then(report2.getTo()).isEqualTo(givenToMessage2);
            then(report2.getSentAt()).isEqualTo(expectedSendAtMessage2);
            then(report2.getDoneAt()).isEqualTo(expectedDoneAtMessage2);
            then(report2.getSmsCount()).isEqualTo(givenSmsCountMessage2);
            MessagePrice price2 = report2.getPrice();
            then(report2.getPrice()).isNotNull();
            then(price2.getPricePerMessage()).isEqualTo(givenPricePerMessageMessage2);
            then(price2.getCurrency()).isEqualTo(givenCurrencyMessage2);
            then(report2.getStatus()).isNotNull();
            MessageStatus status2 = report2.getStatus();
            then(status2.getGroupId()).isEqualTo(givenStatusGroupIdMessage2);
            then(status2.getGroupName()).isEqualTo(givenStatusGroupNameMessage2);
            then(status2.getId()).isEqualTo(givenStatusIdMessage2);
            then(status2.getDescription()).isEqualTo(givenStatusDescriptionMessage2);
            then(report2.getError()).isNotNull();
            MessageError error2 = report2.getError();
            then(error2.getGroupId()).isEqualTo(givenErrorGroupIdMessage2);
            then(error2.getGroupName()).isEqualTo(givenErrorGroupNameMessage2);
            then(error2.getName()).isEqualTo(givenErrorNameMessage2);
            then(error2.getDescription()).isEqualTo(givenErrorDescriptionMessage2);
            then(error2.getPermanent()).isEqualTo(givenErrorPermanentMessage2);
        };

        var call = sendSmsApi.getOutboundSmsMessageDeliveryReports()
                             .bulkId(givenBulkId)
                             .messageId(messageIdParameter)
                             .limit(Integer.valueOf(limitParameter));

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetScheduledSmsMessages() {
        String givenBulkId = "BULK-ID-123-xyz";
        String givenSendAtString = "2021-02-22T17:42:05.0+0100";
        OffsetDateTime givenSendAt = OffsetDateTime.of(
            LocalDateTime.of(2021, 2, 22, 17, 42, 5, 0),
            ZoneOffset.ofHours(1)
        );

        String givenResponse = String.format("{\n" +
                                                 "    \"bulkId\": \"%s\",\n" +
                                                 "    \"sendAt\": \"%s\"\n" +
                                                 "}\n",
                                             givenBulkId,
                                             givenSendAtString
        );

        setUpSuccessGetRequest(
            BULKS,
            Map.of("bulkId", givenBulkId),
            givenResponse
        );

        SmsApi scheduledSmsApi = new SmsApi(getApiClient());

        Consumer<SmsBulkResponse> assertions = bulkResponse -> {
            then(bulkResponse).isNotNull();
            then(bulkResponse.getBulkId()).isEqualTo(givenBulkId);
            then(bulkResponse.getSendAt()).isEqualTo(givenSendAt);
        };

        var call = scheduledSmsApi.getScheduledSmsMessages(givenBulkId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldRescheduleSmsMessages() {
        String givenBulkId = "BULK-ID-123-xyz";
        String givenSendAtString = "2021-02-22T17:42:05.390+0100";
        OffsetDateTime givenSendAt = OffsetDateTime.of(
            LocalDateTime.of(2021, 2, 22, 17, 42, 5, 390000000),
            ZoneOffset.ofHours(1)
        );

        String expectedRequest = String.format("{\n" +
                                                   "  \"sendAt\": \"%s\"\n" +
                                                   "}\n",
                                               givenSendAtString
        );

        String givenResponse = String.format("{\n" +
                                                 "    \"bulkId\": \"%s\",\n" +
                                                 "    \"sendAt\": \"%s\"\n" +
                                                 "}\n",
                                             givenBulkId,
                                             givenSendAtString
        );

        setUpSuccessPutRequest(
            BULKS,
            Map.of("bulkId", givenBulkId),
            expectedRequest,
            givenResponse
        );

        SmsApi scheduledSmsApi = new SmsApi(getApiClient());

        SmsBulkRequest bulkRequest = new SmsBulkRequest().sendAt(givenSendAt);

        Consumer<SmsBulkResponse> assertions = bulkResponse -> {
            then(bulkResponse).isNotNull();
            then(bulkResponse.getBulkId()).isEqualTo(givenBulkId);
            then(bulkResponse.getSendAt()).isEqualTo(givenSendAt);
        };

        var call = scheduledSmsApi.rescheduleSmsMessages(givenBulkId, bulkRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetScheduledSmsMessagesStatus() {
        String givenBulkId = "BULK-ID-123-xyz";
        String givenBulkStatusString = "PAUSED";
        SmsBulkStatus givenBulkStatus = SmsBulkStatus.PAUSED;

        String givenResponse = String.format("{\n" +
                                                 "    \"bulkId\": \"%s\",\n" +
                                                 "    \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenBulkId,
                                             givenBulkStatusString
        );

        setUpSuccessGetRequest(
            BULKS_STATUS,
            Map.of("bulkId", givenBulkId),
            givenResponse
        );

        SmsApi scheduledSmsApi = new SmsApi(getApiClient());

        Consumer<SmsBulkStatusResponse> assertions = bulkResponse -> {
            then(bulkResponse).isNotNull();
            then(bulkResponse.getBulkId()).isEqualTo(givenBulkId);
            then(bulkResponse.getStatus()).isEqualTo(givenBulkStatus);
        };

        var call = scheduledSmsApi.getScheduledSmsMessagesStatus(givenBulkId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateScheduledSmsMessagesStatus() {
        String givenBulkId = "BULK-ID-123-xyz";
        String givenBulkStatusString = "PAUSED";
        SmsBulkStatus givenBulkStatus = SmsBulkStatus.PAUSED;

        String givenResponse = String.format("{\n" +
                                                 "  \"bulkId\": \"%s\",\n" +
                                                 "  \"status\": \"%s\"\n" +
                                                 "}\n",
                                             givenBulkId,
                                             givenBulkStatusString
        );

        String expectedRequest = String.format("{\n" +
                                                   "  \"status\": \"%s\"\n" +
                                                   "}\n",
                                               givenBulkStatusString
        );

        setUpSuccessPutRequest(
            BULKS_STATUS,
            Map.of("bulkId", givenBulkId),
            expectedRequest,
            givenResponse
        );

        SmsApi scheduledSmsApi = new SmsApi(getApiClient());

        SmsUpdateStatusRequest request = new SmsUpdateStatusRequest().status(givenBulkStatus);

        Consumer<SmsBulkStatusResponse> assertions = bulkResponse -> {
            then(bulkResponse).isNotNull();
            then(bulkResponse.getBulkId()).isEqualTo(givenBulkId);
            then(bulkResponse.getStatus()).isEqualTo(givenBulkStatus);
        };

        var call = scheduledSmsApi.updateScheduledSmsMessagesStatus(givenBulkId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendSmsPreview() {

        String expectedPreviewText = "Let's see how many characters will remain unused in this message.";
        String expectedRequest = String.format("{" +
                                                   "  \"text\": \"%s\"" +
                                                   "}",
                                               expectedPreviewText
        );

        String givenOriginalText = "Let's see how many characters will remain unused in this message.";
        String givenTextPreview = "Let's see how many characters will remain unused in this message.";
        int givenMessageCount = 1;
        int givenCharactersRemaining = 95;
        String givenResponse = String.format("{" +
                                                 "  \"originalText\": \"%s\"," +
                                                 "   \"previews\": [" +
                                                 "    {" +
                                                 "      \"textPreview\": \"%s\"," +
                                                 "      \"messageCount\": %d," +
                                                 "      \"charactersRemaining\": %d," +
                                                 "      \"configuration\": { }" +
                                                 "    }" +
                                                 "  ]" +
                                                 "}",
                                             givenOriginalText,
                                             givenTextPreview,
                                             givenMessageCount,
                                             givenCharactersRemaining
        );

        setUpSuccessPostRequest(PREVIEW, expectedRequest, givenResponse);

        SmsApi sendSmsApi = new SmsApi(getApiClient());

        SmsPreviewRequest request = new SmsPreviewRequest()
            .text(givenTextPreview);

        Consumer<SmsPreviewResponse> assertions = (smsResponse) -> {
            then(smsResponse).isNotNull();
            then(smsResponse.getOriginalText()).isEqualTo(givenOriginalText);
            List<SmsPreview> smsPreviews = smsResponse.getPreviews();
            then(smsPreviews).isNotNull();
            then(smsPreviews).hasSize(1);
            SmsPreview preview = smsPreviews.get(0);
            then(preview.getCharactersRemaining()).isEqualTo(givenCharactersRemaining);
            then(preview.getTextPreview()).isEqualTo(givenTextPreview);
            SmsLanguageConfiguration configuration = preview.getConfiguration();
            then(configuration).isNotNull();
            then(configuration.getLanguage()).isNull();
            then(configuration.getTransliteration()).isNull();
        };

        var call = sendSmsApi.previewSmsMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    // WEBHOOKS
    private final JSON json = new JSON();

    @Test
    void shouldParseInboundSmsMessages() {
        var givenRequest = "{\n" +
            "  \"results\": [\n" +
            "    {\n" +
            "      \"messageId\": \"817790313235066447\",\n" +
            "      \"from\": \"385916242493\",\n" +
            "      \"to\": \"385921004026\",\n" +
            "      \"text\": \"QUIZ Correct answer is Paris\",\n" +
            "      \"cleanText\": \"Correct answer is Paris\",\n" +
            "      \"keyword\": \"QUIZ\",\n" +
            "      \"receivedAt\": \"2016-10-06T09:28:39.220+0000\",\n" +
            "      \"smsCount\": 1,\n" +
            "      \"price\": {\n" +
            "        \"pricePerMessage\": 0,\n" +
            "        \"currency\": \"EUR\"\n" +
            "      },\n" +
            "      \"callbackData\": \"callbackData\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"messageCount\": 1,\n" +
            "  \"pendingMessageCount\": 0\n" +
            "}\n";
        SmsWebhookInboundReportResponse reportResponse = json.deserialize(
            givenRequest,
            SmsWebhookInboundReportResponse.class
        );
        then(reportResponse.getResults()).isNotNull();
        then(reportResponse.getResults().size()).isEqualTo(1);
        then(reportResponse.getResults().get(0).getClass()).isEqualTo(SmsWebhookInboundReport.class);
        var message = (SmsWebhookInboundReport) reportResponse.getResults().get(0);
        then(message.getPrice().getClass()).isEqualTo(MessagePrice.class);
    }

    @Test
    void shouldParseOutboundSmsMessageReport() {
        var givenRequest = "{\n" +
            "  \"results\": [\n" +
            "    {\n" +
            "      \"bulkId\": \"BULK-ID-123-xyz\",\n" +
            "      \"messageId\": \"MESSAGE-ID-123-xyz\",\n" +
            "      \"to\": \"41793026727\",\n" +
            "      \"sentAt\": \"2019-11-09T16:00:00.000+0000\",\n" +
            "      \"doneAt\": \"2019-11-09T16:00:00.000+0000\",\n" +
            "      \"smsCount\": 1,\n" +
            "      \"price\": {\n" +
            "        \"pricePerMessage\": 0.01,\n" +
            "        \"currency\": \"EUR\"\n" +
            "      },\n" +
            "      \"status\": {\n" +
            "        \"groupId\": 3,\n" +
            "        \"groupName\": \"DELIVERED\",\n" +
            "        \"id\": 5,\n" +
            "        \"name\": \"DELIVERED_TO_HANDSET\",\n" +
            "        \"description\": \"Message delivered to handset\"\n" +
            "      },\n" +
            "      \"error\": {\n" +
            "        \"groupId\": 0,\n" +
            "        \"groupName\": \"Ok\",\n" +
            "        \"id\": 0,\n" +
            "        \"name\": \"NO_ERROR\",\n" +
            "        \"description\": \"No Error\",\n" +
            "        \"permanent\": false\n" +
            "      }\n" +
            "    },\n" +
            "    {\n" +
            "      \"bulkId\": \"BULK-ID-123-xyz\",\n" +
            "      \"messageId\": \"12db39c3-7822-4e72-a3ec-c87442c0ffc5\",\n" +
            "      \"to\": \"41793026834\",\n" +
            "      \"sentAt\": \"2019-11-09T17:00:00.000+0000\",\n" +
            "      \"doneAt\": \"2019-11-09T17:00:00.000+0000\",\n" +
            "      \"smsCount\": 1,\n" +
            "      \"price\": {\n" +
            "        \"pricePerMessage\": 0.01,\n" +
            "        \"currency\": \"EUR\"\n" +
            "      },\n" +
            "      \"status\": {\n" +
            "        \"groupId\": 3,\n" +
            "        \"groupName\": \"DELIVERED\",\n" +
            "        \"id\": 5,\n" +
            "        \"name\": \"DELIVERED_TO_HANDSET\",\n" +
            "        \"description\": \"Message delivered to handset\"\n" +
            "      },\n" +
            "      \"error\": {\n" +
            "        \"groupId\": 0,\n" +
            "        \"groupName\": \"Ok\",\n" +
            "        \"id\": 0,\n" +
            "        \"name\": \"NO_ERROR\",\n" +
            "        \"description\": \"No Error\",\n" +
            "        \"permanent\": false\n" +
            "      }\n" +
            "    }\n" +
            "  ]\n" +
            "}\n";
        SmsDeliveryResult reportResponse = json.deserialize(
            givenRequest,
            SmsDeliveryResult.class
        );
        then(reportResponse.getResults()).isNotNull();
        then(reportResponse.getResults().size()).isEqualTo(2);

        then(reportResponse.getResults().get(0).getClass()).isEqualTo(SmsReport.class);
        var message1 = (SmsReport) reportResponse.getResults().get(0);
        then(message1.getPrice().getClass()).isEqualTo(MessagePrice.class);
        then(message1.getStatus().getClass()).isEqualTo(MessageStatus.class);
        then(message1.getError().getClass()).isEqualTo(MessageError.class);

        then(reportResponse.getResults().get(1).getClass()).isEqualTo(SmsReport.class);
        var message2 = (SmsReport) reportResponse.getResults().get(1);
        then(message2.getPrice().getClass()).isEqualTo(MessagePrice.class);
        then(message2.getStatus().getClass()).isEqualTo(MessageStatus.class);
        then(message2.getError().getClass()).isEqualTo(MessageError.class);
    }

}
