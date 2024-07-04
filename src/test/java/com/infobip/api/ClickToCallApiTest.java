package com.infobip.api;

import com.infobip.api.ClickToCallApi;
import com.infobip.model.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import static org.assertj.core.api.BDDAssertions.then;

class ClickToCallApiTest extends ApiTest {

    private static final String SEND_CLICK_TO_CALL_MESSAGE = "/voice/ctc/1/send";

    @Test
    @Disabled
    void shouldSendClickToCallMessage() {
        String givenBulkId = "4fda521a-c680-470d-b134-83d468f7ac80";
        String givenTo = "41793026727";
        Integer givenStatusGroupId = 1;
        String givenStatusGroupName = "PENDING";
        Integer givenStatusId = 26;
        String givenStatusName = "PENDING_ACCEPTED";
        String givenStatusDescription = "Message accepted, pending for delivery.";
        String givenMessageId = "2250be2d4219-3af1-78856-aabe-1362af1edfd2";

        String givenResponse = String.format("{\n" +
                                             "  \"bulkId\": \"%s\",\n" +
                                             "  \"messages\": [\n" +
                                             "    {\n" +
                                             "      \"to\": \"%s\",\n" +
                                             "      \"status\": {\n" +
                                             "        \"groupId\": %d,\n" +
                                             "        \"groupName\": \"%s\",\n" +
                                             "        \"id\": %d,\n" +
                                             "        \"name\": \"%s\",\n" +
                                             "        \"description\": \"%s\"\n" +
                                             "      },\n" +
                                             "      \"messageId\": \"%s\"\n" +
                                             "    }\n" +
                                             "  ]\n" +
                                             "}\n",
                                             givenBulkId, givenTo, givenStatusGroupId, givenStatusGroupName, givenStatusId, givenStatusName, givenStatusDescription, givenMessageId
        );

        String givenFrom = "41793026700";
        String givenFromB = "41793026701";
        String givenDestinationA = "41793026727";
        String givenDestinationB = "41793026731";
        String givenReqMessageId = "MESSAGE-ID-123-xyz";
        String givenText = "Test Voice message.";
        String givenLanguage = "en";
        String givenName = "Joanna";
        String givenGender = "female";
        Boolean givenAnonymization = false;
        String givenNotifyUrl = "https=//www.example.com/voice/clicktocall";
        String givenNotifyContentType = "application/json";
        Integer givenMaxDuration = 60;
        Integer givenWarningTime = 5;
        Integer givenMinPeriod = 1;
        Integer givenMaxPeriod = 5;
        Integer givenMaxCount = 5;
        String givenMachineDetection = "hangup";
        Integer givenFromHour = 6;
        Integer givenFromMinute = 0;
        Integer givenToHour = 15;
        Integer givenToMinute = 30;

        String expectedRequest = String.format("{\n" +
                                               "  \"bulkId\": \"%s\",\n" +
                                               "  \"messages\": [\n" +
                                               "    {\n" +
                                               "      \"from\": \"%s\",\n" +
                                               "      \"fromB\": \"%s\",\n" +
                                               "      \"destinationA\": \"%s\",\n" +
                                               "      \"destinationB\": \"%s\",\n" +
                                               "      \"messageId\": \"%s\",\n" +
                                               "      \"text\": \"%s\",\n" +
                                               "      \"language\": \"%s\",\n" +
                                               "      \"voice\": {\n" +
                                               "        \"name\": \"%s\",\n" +
                                               "        \"gender\": \"%s\"\n" +
                                               "      },\n" +
                                               "      \"anonymization\": %b,\n" +
                                               "      \"notifyUrl\": \"%s\",\n" +
                                               "      \"notifyContentType\": \"%s\",\n" +
                                               "      \"maxDuration\": %d,\n" +
                                               "      \"warningTime\": %d,\n" +
                                               "      \"retry\": {\n" +
                                               "        \"minPeriod\": %d,\n" +
                                               "        \"maxPeriod\": %d,\n" +
                                               "        \"maxCount\": %d\n" +
                                               "      },\n" +
                                               "      \"machineDetection\": \"%s\",\n" +
                                               "      \"deliveryTimeWindow\": {\n" +
                                               "        \"from\": {\n" +
                                               "          \"hour\": %d,\n" +
                                               "          \"minute\": %d\n" +
                                               "        },\n" +
                                               "        \"to\": {\n" +
                                               "          \"hour\": %d,\n" +
                                               "          \"minute\": %d\n" +
                                               "        },\n" +
                                               "        \"days\": [\n" +
                                               "          \"MONDAY\",\n" +
                                               "          \"TUESDAY\",\n" +
                                               "          \"WEDNESDAY\",\n" +
                                               "          \"THURSDAY\",\n" +
                                               "          \"FRIDAY\",\n" +
                                               "          \"SATURDAY\",\n" +
                                               "          \"SUNDAY\"\n" +
                                               "        ]\n" +
                                               "      }\n" +
                                               "    }\n" +
                                               "  ]\n" +
                                               "}\n",
                                               givenBulkId,
                                               givenFrom,
                                               givenFromB,
                                               givenDestinationA,
                                               givenDestinationB,
                                               givenReqMessageId,
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
                                               givenToMinute
        );

        setUpSuccessPostRequest(
                SEND_CLICK_TO_CALL_MESSAGE,
                expectedRequest,
                givenResponse
        );

        ClickToCallApi api = new ClickToCallApi(getApiClient());

        CallsClickToCallMessageBody request = new CallsClickToCallMessageBody()
                .bulkId(givenBulkId)
                .messages(List.of(new CallsClickToCallMessage()
                        .from(givenFrom)
                        .fromB(givenFromB)
                        .destinationA(givenDestinationA)
                        .destinationB(givenDestinationB)
                        .messageId(givenReqMessageId)
                        .text(givenText)
                        .language(givenLanguage)
                        .voice(new CallsVoice().name(givenName).gender(givenGender))
                        .anonymization(givenAnonymization)
                        .notifyUrl(givenNotifyUrl)
                        .notifyContentType(givenNotifyContentType)
                        .maxDuration(givenMaxDuration)
                        .warningTime(givenWarningTime)
                        .retry(new CallsRetry().minPeriod(givenMinPeriod).maxPeriod(givenMaxPeriod).maxCount(givenMaxCount))
                        .machineDetection(givenMachineDetection)
                        .deliveryTimeWindow(new CallsDeliveryTimeWindow()
                                .days(Set.of(
                                        CallsDeliveryDay.MONDAY, CallsDeliveryDay.TUESDAY, CallsDeliveryDay.WEDNESDAY,
                                        CallsDeliveryDay.THURSDAY, CallsDeliveryDay.FRIDAY, CallsDeliveryDay.SATURDAY,
                                        CallsDeliveryDay.SUNDAY
                                ))
                                .to(new CallsDeliveryTime().hour(givenToHour).minute(givenToMinute))
                                .from(new CallsDeliveryTime().hour(givenFromHour).minute(givenFromMinute)))
                ));

        Consumer<CallsVoiceResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getMessages().size()).isEqualTo(1);
            var message = response.getMessages().get(0);
            then(message).isNotNull();
            then(message.getTo()).isEqualTo(givenTo);
            var status = message.getStatus();
            then(status).isNotNull();
            then(status.getGroupId()).isEqualTo(givenStatusGroupId);
            then(status.getGroupName()).isEqualTo(givenStatusGroupName);
            then(status.getId()).isEqualTo(givenStatusId);
            then(status.getName()).isEqualTo(givenStatusName);
            then(status.getDescription()).isEqualTo(givenStatusDescription);
            then(message.getMessageId()).isEqualTo(givenMessageId);
        };

        var call = api.sendClickToCallMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }
}
