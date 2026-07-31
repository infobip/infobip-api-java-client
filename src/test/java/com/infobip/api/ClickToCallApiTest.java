package com.infobip.api;

import static org.assertj.core.api.BDDAssertions.then;

import com.infobip.model.*;
import java.util.List;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

class ClickToCallApiTest extends ApiTest {

    private static final String SEND = "/voice/ctc/1/send";

    @Test
    void shouldSendClickToCallMessage() {
        String givenBulkId = "BULK-ID-123-xyz";
        String givenFrom = "41793026700";
        String givenFromB = "41793026701";
        String givenDestinationA = "41793026727";
        String givenDestinationB = "41793026731";
        String givenMessageId = "MESSAGE-ID-123-xyz";
        String givenText = "Test Voice message.";
        String givenLanguage = "en";
        String givenName = "Joanna";
        String givenGender = "female";
        boolean givenAnonymization = false;
        String givenNotifyUrl = "https://www.example.com/voice/clicktocall";
        String givenNotifyContentType = "application/json";
        int givenMaxDuration = 60;
        int givenWarningTime = 5;
        int givenMinPeriod = 1;
        int givenMaxPeriod = 5;
        int givenMaxCount = 5;
        String givenMachineDetection = "hangup";
        int givenFromHour = 6;
        int givenFromMinute = 0;
        int givenToHour = 15;
        int givenToMinute = 30;

        String expectedBulkId = "4fda521a-c680-470d-b134-83d468f7ac80";
        String expectedTo = "41793026727";
        int expectedGroupId = 1;
        String expectedGroupName = "PENDING";
        int expectedId = 26;
        String expectedName = "PENDING_ACCEPTED";
        String expectedDescription = "Message accepted, pending for delivery.";
        String expectedMessageId = "2250be2d4219-3af1-78856-aabe-1362af1edfd2";

        String expectedRequest = String.format(
                "{\n" + "  \"bulkId\": \"%s\",\n"
                        + "  \"messages\": [\n"
                        + "    {\n"
                        + "      \"from\": \"%s\",\n"
                        + "      \"fromB\": \"%s\",\n"
                        + "      \"destinationA\": \"%s\",\n"
                        + "      \"destinationB\": \"%s\",\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"text\": \"%s\",\n"
                        + "      \"language\": \"%s\",\n"
                        + "      \"voice\": {\n"
                        + "        \"name\": \"%s\",\n"
                        + "        \"gender\": \"%s\"\n"
                        + "      },\n"
                        + "      \"anonymization\": %b,\n"
                        + "      \"notifyUrl\": \"%s\",\n"
                        + "      \"notifyContentType\": \"%s\",\n"
                        + "      \"maxDuration\": %d,\n"
                        + "      \"warningTime\": %d,\n"
                        + "      \"retry\": {\n"
                        + "        \"minPeriod\": %d,\n"
                        + "        \"maxPeriod\": %d,\n"
                        + "        \"maxCount\": %d\n"
                        + "      },\n"
                        + "      \"machineDetection\": \"%s\",\n"
                        + "      \"deliveryTimeWindow\": {\n"
                        + "        \"from\": {\n"
                        + "          \"hour\": %d,\n"
                        + "          \"minute\": %d\n"
                        + "        },\n"
                        + "        \"to\": {\n"
                        + "          \"hour\": %d,\n"
                        + "          \"minute\": %d\n"
                        + "        },\n"
                        + "        \"days\": [\n"
                        + "          \"MONDAY\",\n"
                        + "          \"TUESDAY\",\n"
                        + "          \"WEDNESDAY\",\n"
                        + "          \"THURSDAY\",\n"
                        + "          \"FRIDAY\",\n"
                        + "          \"SATURDAY\",\n"
                        + "          \"SUNDAY\"\n"
                        + "        ]\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenBulkId,
                givenFrom,
                givenFromB,
                givenDestinationA,
                givenDestinationB,
                givenMessageId,
                givenText,
                givenLanguage,
                givenName,
                givenGender,
                givenAnonymization,
                givenNotifyUrl,
                givenNotifyContentType,
                givenMaxDuration,
                givenWarningTime,
                givenMinPeriod,
                givenMaxPeriod,
                givenMaxCount,
                givenMachineDetection,
                givenFromHour,
                givenFromMinute,
                givenToHour,
                givenToMinute);

        String givenResponse = String.format(
                "{\n" + "  \"bulkId\": \"%s\",\n"
                        + "  \"messages\": [\n"
                        + "    {\n"
                        + "      \"to\": \"%s\",\n"
                        + "      \"status\": {\n"
                        + "        \"groupId\": %d,\n"
                        + "        \"groupName\": \"%s\",\n"
                        + "        \"id\": %d,\n"
                        + "        \"name\": \"%s\",\n"
                        + "        \"description\": \"%s\"\n"
                        + "      },\n"
                        + "      \"messageId\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                expectedBulkId,
                expectedTo,
                expectedGroupId,
                expectedGroupName,
                expectedId,
                expectedName,
                expectedDescription,
                expectedMessageId);

        setUpSuccessPostRequest(SEND, expectedRequest, givenResponse);

        ClickToCallApi api = new ClickToCallApi(getApiClient());

        CallsClickToCallMessageBody request = new CallsClickToCallMessageBody()
                .bulkId(givenBulkId)
                .messages(List.of(new CallsClickToCallMessage()
                        .from(givenFrom)
                        .fromB(givenFromB)
                        .destinationA(givenDestinationA)
                        .destinationB(givenDestinationB)
                        .messageId(givenMessageId)
                        .text(givenText)
                        .language(givenLanguage)
                        .voice(new CallsVoice().name(givenName).gender(givenGender))
                        .anonymization(givenAnonymization)
                        .notifyUrl(givenNotifyUrl)
                        .notifyContentType(givenNotifyContentType)
                        .maxDuration(givenMaxDuration)
                        .warningTime(givenWarningTime)
                        .retry(new CallsRetry()
                                .minPeriod(givenMinPeriod)
                                .maxPeriod(givenMaxPeriod)
                                .maxCount(givenMaxCount))
                        .machineDetection(givenMachineDetection)
                        .deliveryTimeWindow(new DeliveryTimeWindow()
                                .from(new DeliveryTime().hour(givenFromHour).minute(givenFromMinute))
                                .to(new DeliveryTime().hour(givenToHour).minute(givenToMinute))
                                .days(List.of(
                                        DeliveryDay.MONDAY,
                                        DeliveryDay.TUESDAY,
                                        DeliveryDay.WEDNESDAY,
                                        DeliveryDay.THURSDAY,
                                        DeliveryDay.FRIDAY,
                                        DeliveryDay.SATURDAY,
                                        DeliveryDay.SUNDAY)))));

        Consumer<CallsVoiceResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(expectedBulkId);
            then(response.getMessages()).hasSize(1);
            var message = response.getMessages().get(0);
            then(message.getTo()).isEqualTo(expectedTo);
            then(message.getStatus().getGroupId()).isEqualTo(expectedGroupId);
            then(message.getStatus().getGroupName()).isEqualTo(expectedGroupName);
            then(message.getStatus().getId()).isEqualTo(expectedId);
            then(message.getStatus().getName()).isEqualTo(expectedName);
            then(message.getStatus().getDescription()).isEqualTo(expectedDescription);
            then(message.getMessageId()).isEqualTo(expectedMessageId);
        };

        var call = api.sendClickToCallMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }
}
