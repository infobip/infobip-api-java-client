package com.infobip.api;

import static org.assertj.core.api.BDDAssertions.then;

import com.infobip.model.*;
import java.util.Map;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

class FlowApiTest extends ApiTest {

    private static final String FLOWS_PARTICIPANTS = "/moments/1/flows/{campaignId}/participants";
    private static final String FLOWS_PARTICIPANTS_REPORT = "/moments/1/flows/{campaignId}/participants/report";
    private static final String FLOWS_COMMUNICATION_PARTICIPANTS = "/communication/1/flows/{campaignId}/participants";

    @Test
    void shouldAddParticipantsToFlow() {
        Long campaignId = 200000000000001L;
        String notifyUrl = "https://example.com";
        String callbackData = "Callback Data";

        String identifier1 = "370329180020364";
        String type1 = "FACEBOOK";

        String identifier2 = "test@infobip.com";
        String type2 = "EMAIL";
        int orderNumber2 = 1167873391;

        String identifier3 = "test2@infobip.com";
        String type3 = "EMAIL";
        int orderNumber3 = 1595299041;
        String externalId3 = "optional_external_person_id";
        String contractExpiry3 = "2023-04-01";
        String company3 = "Infobip";
        String email3 = "test@infobip.com";

        FlowPersonUniqueFieldType personUniqueFieldType = FlowPersonUniqueFieldType.FACEBOOK;
        FlowParticipant givenParticipant = new FlowParticipant()
                .identifyBy(new FlowPersonUniqueField().identifier(identifier1).type(personUniqueFieldType));

        String givenRequest = String.format(
                "{\n" + "  \"participants\": [\n"
                        + "    {\n"
                        + "      \"identifyBy\": {\n"
                        + "        \"identifier\": \"%s\",\n"
                        + "        \"type\": \"%s\"\n"
                        + "      }\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"identifyBy\": {\n"
                        + "        \"identifier\": \"%s\",\n"
                        + "        \"type\": \"%s\"\n"
                        + "      },\n"
                        + "      \"variables\": {\n"
                        + "        \"orderNumber\": %d\n"
                        + "      }\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"identifyBy\": {\n"
                        + "        \"identifier\": \"%s\",\n"
                        + "        \"type\": \"%s\"\n"
                        + "      },\n"
                        + "      \"variables\": {\n"
                        + "        \"orderNumber\": %d\n"
                        + "      },\n"
                        + "      \"person\": {\n"
                        + "        \"externalId\": \"%s\",\n"
                        + "        \"customAttributes\": {\n"
                        + "          \"Contract Expiry\": \"%s\",\n"
                        + "          \"Company\": \"%s\"\n"
                        + "        },\n"
                        + "        \"contactInformation\": {\n"
                        + "          \"email\": [\n"
                        + "            {\n"
                        + "              \"address\": \"%s\"\n"
                        + "            }\n"
                        + "          ]\n"
                        + "        }\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"notifyUrl\": \"%s\",\n"
                        + "  \"callbackData\": \"%s\"\n"
                        + "}",
                identifier1,
                type1,
                identifier2,
                type2,
                orderNumber2,
                identifier3,
                type3,
                orderNumber3,
                externalId3,
                contractExpiry3,
                company3,
                email3,
                notifyUrl,
                callbackData);

        String givenOperationId = "03f2d474-0508-46bf-9f3d-d8e2c28adaea";

        String givenResponse = String.format("{\n" + "  \"operationId\": \"%s\"\n" + "}", givenOperationId);

        FlowAddFlowParticipantsRequest request = new FlowAddFlowParticipantsRequest()
                .addParticipantsItem(givenParticipant)
                .addParticipantsItem(new FlowParticipant()
                        .identifyBy(new FlowPersonUniqueField()
                                .identifier(identifier2)
                                .type(FlowPersonUniqueFieldType.EMAIL))
                        .putVariablesItem("orderNumber", orderNumber2))
                .addParticipantsItem(new FlowParticipant()
                        .identifyBy(new FlowPersonUniqueField()
                                .identifier(identifier3)
                                .type(FlowPersonUniqueFieldType.EMAIL))
                        .putVariablesItem("orderNumber", orderNumber3)
                        .person(new FlowPerson()
                                .externalId(externalId3)
                                .putCustomAttributesItem("Contract Expiry", contractExpiry3)
                                .putCustomAttributesItem("Company", company3)
                                .contactInformation(
                                        new FlowPersonContacts().addEmailItem(new FlowEmailContact().address(email3)))))
                .notifyUrl(notifyUrl)
                .callbackData(callbackData);

        setUpSuccessPostRequest(
                FLOWS_PARTICIPANTS.replace("{campaignId}", campaignId.toString()), givenRequest, givenResponse);

        FlowApi flowApi = new FlowApi(getApiClient());

        FlowAddFlowParticipantsResponse expectedResponse =
                new FlowAddFlowParticipantsResponse().operationId(givenOperationId);

        Consumer<FlowAddFlowParticipantsResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response).isEqualTo(expectedResponse);
        };

        var call = flowApi.addFlowParticipants(campaignId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetParticipantsReport() {
        Long campaignId = 200000000000001L;
        String givenOperationId = "03f2d474-0508-46bf-9f3d-d8e2c28adaea";
        String givenCallbackData = "Callback Data";
        String givenIdentifier1 = "test@infobip.com";
        String givenIdentifier2 = "test2@infobip.com";
        FlowPersonUniqueFieldType givenType = FlowPersonUniqueFieldType.EMAIL;
        FlowAddFlowParticipantStatus givenStatus1 = FlowAddFlowParticipantStatus.ACCEPTED;
        FlowAddFlowParticipantStatus givenStatus2 = FlowAddFlowParticipantStatus.REJECTED;
        FlowErrorStatusReason givenErrorReason = FlowErrorStatusReason.INVALID_CONTACT;

        String givenResponse = String.format(
                "{\n" + "  \"operationId\": \"%s\",\n"
                        + "  \"campaignId\": %d,\n"
                        + "  \"callbackData\": \"%s\",\n"
                        + "  \"participants\": [\n"
                        + "    {\n"
                        + "      \"identifyBy\": {\n"
                        + "        \"identifier\": \"%s\",\n"
                        + "        \"type\": \"%s\"\n"
                        + "      },\n"
                        + "      \"status\": \"%s\"\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"identifyBy\": {\n"
                        + "        \"identifier\": \"%s\",\n"
                        + "        \"type\": \"%s\"\n"
                        + "      },\n"
                        + "      \"status\": \"%s\",\n"
                        + "      \"errorReason\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenOperationId,
                campaignId,
                givenCallbackData,
                givenIdentifier1,
                givenType,
                givenStatus1,
                givenIdentifier2,
                givenType,
                givenStatus2,
                givenErrorReason);

        setUpGetRequest(
                FLOWS_PARTICIPANTS_REPORT.replace("{campaignId}", campaignId.toString()), Map.of(), givenResponse, 200);

        FlowApi flowApi = new FlowApi(getApiClient());

        Consumer<FlowParticipantsReportResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getOperationId()).isEqualTo(givenOperationId);
            then(response.getCampaignId()).isEqualTo(campaignId);
            then(response.getCallbackData()).isEqualTo(givenCallbackData);

            var participants = response.getParticipants();
            then(participants).hasSize(2);

            var participant1 = participants.get(0);
            then(participant1.getIdentifyBy().getIdentifier()).isEqualTo(givenIdentifier1);
            then(participant1.getIdentifyBy().getType()).isEqualTo(givenType);
            then(participant1.getStatus()).isEqualTo(givenStatus1);

            var participant2 = participants.get(1);
            then(participant2.getIdentifyBy().getIdentifier()).isEqualTo(givenIdentifier2);
            then(participant2.getIdentifyBy().getType()).isEqualTo(givenType);
            then(participant2.getStatus()).isEqualTo(givenStatus2);
            then(participant2.getErrorReason()).isEqualTo(givenErrorReason);
        };

        var call = flowApi.getFlowParticipantsAddedReport(campaignId, givenOperationId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldRemoveParticipantFromFlow() {
        Long campaignId = 200000000000001L;

        String expectedResponse = "{}";

        setUpNoRequestBodyDeleteRequest(
                FLOWS_COMMUNICATION_PARTICIPANTS.replace("{campaignId}", campaignId.toString()),
                Map.of(),
                expectedResponse,
                200);

        FlowApi flowApi = new FlowApi(getApiClient());

        var call = flowApi.removePeopleFromFlow(campaignId);
        testSuccessfulCallWithNoBody(call::executeAsync, 200);
    }
}
