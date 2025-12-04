package com.infobip.api;

import static com.infobip.api.util.ResponseStatuses.*;
import static org.assertj.core.api.BDDAssertions.then;

import com.infobip.ApiCallback;
import com.infobip.ApiException;
import com.infobip.model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

class RcsApiTest extends ApiTest {

    private static final String RCS_OUTBOUND = "/rcs/1/message/outbound";

    @Test
    void shouldSendRcsMessage() {
        // Given
        String givenBulkId = "2034072219640523072";
        String givenTo = "41793026727";
        String givenMessageId = "2250be2d4219-3af1-78856-aabe-1362af1edfd2";
        String givenFrom = "InfoRCS";
        String givenText = "Welcome to RCS messaging!";

        String givenResponse = "{\n"
                + "  \"bulkId\": \"" + givenBulkId + "\",\n"
                + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"" + givenTo + "\",\n"
                + "      \"messageId\": \"" + givenMessageId + "\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 26,\n"
                + "        \"name\": \"PENDING_ACCEPTED\",\n"
                + "        \"description\": \"Message accepted, pending delivery\"\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";

        String expectedRequest = "{\n"
                + "  \"from\": \"" + givenFrom + "\",\n"
                + "  \"to\": [\n"
                + "    \"" + givenTo + "\"\n"
                + "  ],\n"
                + "  \"content\": {\n"
                + "    \"text\": \"" + givenText + "\"\n"
                + "  }\n"
                + "}";

        // When
        setUpSuccessPostRequest(RCS_OUTBOUND, expectedRequest, givenResponse);

        RcsApi api = new RcsApi(getApiClient());

        RcsContent content = new RcsContent().text(givenText);

        RcsOutboundRequest request = new RcsOutboundRequest()
                .from(givenFrom)
                .to(List.of(givenTo))
                .content(content);

        // Then
        Consumer<RcsOutboundResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getMessages()).hasSize(1);

            RcsMessageInfo messageInfo = response.getMessages().get(0);
            then(messageInfo.getTo()).isEqualTo(givenTo);
            then(messageInfo.getMessageId()).isEqualTo(givenMessageId);
            then(messageInfo.getStatus()).isNotNull();
            then(messageInfo.getStatus().getGroupId()).isEqualTo(1);
            then(messageInfo.getStatus().getGroupName()).isEqualTo("PENDING");
            then(messageInfo.getStatus().getId()).isEqualTo(26);
            then(messageInfo.getStatus().getName()).isEqualTo("PENDING_ACCEPTED");
        };

        var call = api.sendRcsOutboundMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendRcsMessageWithRichCard() {
        // Given
        String givenBulkId = "2034072219640523072";
        String givenTo = "41793026727";
        String givenMessageId = "2250be2d4219-3af1-78856-aabe-1362af1edfd2";
        String givenFrom = "InfoRCS";

        String givenResponse = "{\n"
                + "  \"bulkId\": \"" + givenBulkId + "\",\n"
                + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"" + givenTo + "\",\n"
                + "      \"messageId\": \"" + givenMessageId + "\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 26,\n"
                + "        \"name\": \"PENDING_ACCEPTED\"\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";

        String expectedRequest = "{\n"
                + "  \"from\": \"" + givenFrom + "\",\n"
                + "  \"to\": [\n"
                + "    \"" + givenTo + "\"\n"
                + "  ],\n"
                + "  \"content\": {\n"
                + "    \"card\": {\n"
                + "      \"title\": \"Special Offer\",\n"
                + "      \"description\": \"Get 20% off on all products\",\n"
                + "      \"mediaUrl\": \"https://example.com/image.jpg\",\n"
                + "      \"actions\": [\n"
                + "        {\n"
                + "          \"type\": \"openUrl\",\n"
                + "          \"text\": \"Shop Now\",\n"
                + "          \"url\": \"https://example.com/shop\"\n"
                + "        },\n"
                + "        {\n"
                + "          \"type\": \"reply\",\n"
                + "          \"text\": \"More Info\",\n"
                + "          \"postbackData\": \"INFO_REQUEST\"\n"
                + "        }\n"
                + "      ]\n"
                + "    }\n"
                + "  }\n"
                + "}";

        // When
        setUpSuccessPostRequest(RCS_OUTBOUND, expectedRequest, givenResponse);

        RcsApi api = new RcsApi(getApiClient());

        RcsCard card = new RcsCard()
                .title("Special Offer")
                .description("Get 20% off on all products")
                .mediaUrl("https://example.com/image.jpg")
                .actions(List.of(
                        new RcsSuggestedAction()
                                .type("openUrl")
                                .text("Shop Now")
                                .url("https://example.com/shop"),
                        new RcsSuggestedAction()
                                .type("reply")
                                .text("More Info")
                                .postbackData("INFO_REQUEST")));

        RcsContent content = new RcsContent().card(card);

        RcsOutboundRequest request = new RcsOutboundRequest()
                .from(givenFrom)
                .to(List.of(givenTo))
                .content(content);

        // Then
        Consumer<RcsOutboundResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getMessages()).hasSize(1);

            RcsMessageInfo messageInfo = response.getMessages().get(0);
            then(messageInfo.getTo()).isEqualTo(givenTo);
            then(messageInfo.getMessageId()).isEqualTo(givenMessageId);
            then(messageInfo.getStatus()).isNotNull();
        };

        var call = api.sendRcsOutboundMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendRcsMessageWithCarousel() {
        // Given
        String givenBulkId = "2034072219640523072";
        String givenTo1 = "41793026727";
        String givenTo2 = "385915242424";
        String givenMessageId1 = "msg-id-1";
        String givenMessageId2 = "msg-id-2";
        String givenFrom = "InfoRCS";

        String givenResponse = "{\n"
                + "  \"bulkId\": \"" + givenBulkId + "\",\n"
                + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"" + givenTo1 + "\",\n"
                + "      \"messageId\": \"" + givenMessageId1 + "\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 26,\n"
                + "        \"name\": \"PENDING_ACCEPTED\"\n"
                + "      }\n"
                + "    },\n"
                + "    {\n"
                + "      \"to\": \"" + givenTo2 + "\",\n"
                + "      \"messageId\": \"" + givenMessageId2 + "\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 26,\n"
                + "        \"name\": \"PENDING_ACCEPTED\"\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";

        String expectedRequest = "{\n"
                + "  \"from\": \"" + givenFrom + "\",\n"
                + "  \"to\": [\n"
                + "    \"" + givenTo1 + "\",\n"
                + "    \"" + givenTo2 + "\"\n"
                + "  ],\n"
                + "  \"content\": {\n"
                + "    \"carousel\": [\n"
                + "      {\n"
                + "        \"title\": \"Product 1\",\n"
                + "        \"description\": \"Description of product 1\",\n"
                + "        \"mediaUrl\": \"https://example.com/product1.jpg\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"title\": \"Product 2\",\n"
                + "        \"description\": \"Description of product 2\",\n"
                + "        \"mediaUrl\": \"https://example.com/product2.jpg\"\n"
                + "      }\n"
                + "    ],\n"
                + "    \"suggestedActions\": [\n"
                + "      {\n"
                + "        \"type\": \"reply\",\n"
                + "        \"text\": \"View More\",\n"
                + "        \"postbackData\": \"VIEW_MORE\"\n"
                + "      }\n"
                + "    ]\n"
                + "  },\n"
                + "  \"notifyUrl\": \"https://example.com/callback\"\n"
                + "}";

        // When
        setUpSuccessPostRequest(RCS_OUTBOUND, expectedRequest, givenResponse);

        RcsApi api = new RcsApi(getApiClient());

        List<RcsCard> carousel = List.of(
                new RcsCard()
                        .title("Product 1")
                        .description("Description of product 1")
                        .mediaUrl("https://example.com/product1.jpg"),
                new RcsCard()
                        .title("Product 2")
                        .description("Description of product 2")
                        .mediaUrl("https://example.com/product2.jpg"));

        RcsContent content = new RcsContent()
                .carousel(carousel)
                .suggestedActions(List.of(
                        new RcsSuggestedAction()
                                .type("reply")
                                .text("View More")
                                .postbackData("VIEW_MORE")));

        RcsOutboundRequest request = new RcsOutboundRequest()
                .from(givenFrom)
                .to(List.of(givenTo1, givenTo2))
                .content(content)
                .notifyUrl("https://example.com/callback");

        // Then
        Consumer<RcsOutboundResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getMessages()).hasSize(2);

            RcsMessageInfo messageInfo1 = response.getMessages().get(0);
            then(messageInfo1.getTo()).isEqualTo(givenTo1);
            then(messageInfo1.getMessageId()).isEqualTo(givenMessageId1);

            RcsMessageInfo messageInfo2 = response.getMessages().get(1);
            then(messageInfo2.getTo()).isEqualTo(givenTo2);
            then(messageInfo2.getMessageId()).isEqualTo(givenMessageId2);
        };

        var call = api.sendRcsOutboundMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldHandleRcsLocationAction() {
        // Given
        String givenBulkId = "2034072219640523072";
        String givenTo = "41793026727";
        String givenMessageId = "msg-location-1";
        String givenFrom = "InfoRCS";

        String givenResponse = "{\n"
                + "  \"bulkId\": \"" + givenBulkId + "\",\n"
                + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"" + givenTo + "\",\n"
                + "      \"messageId\": \"" + givenMessageId + "\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 26,\n"
                + "        \"name\": \"PENDING_ACCEPTED\"\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";

        String expectedRequest = "{\n"
                + "  \"from\": \"" + givenFrom + "\",\n"
                + "  \"to\": [\n"
                + "    \"" + givenTo + "\"\n"
                + "  ],\n"
                + "  \"content\": {\n"
                + "    \"text\": \"Visit our office location\",\n"
                + "    \"suggestedActions\": [\n"
                + "      {\n"
                + "        \"type\": \"viewLocation\",\n"
                + "        \"text\": \"View on Map\",\n"
                + "        \"latitude\": 47.3769,\n"
                + "        \"longitude\": 8.5417,\n"
                + "        \"label\": \"Infobip Office Zurich\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"type\": \"shareLocation\",\n"
                + "        \"text\": \"Share Your Location\"\n"
                + "      }\n"
                + "    ]\n"
                + "  }\n"
                + "}";

        // When
        setUpSuccessPostRequest(RCS_OUTBOUND, expectedRequest, givenResponse);

        RcsApi api = new RcsApi(getApiClient());

        RcsContent content = new RcsContent()
                .text("Visit our office location")
                .suggestedActions(List.of(
                        new RcsSuggestedAction()
                                .type("viewLocation")
                                .text("View on Map")
                                .latitude(47.3769)
                                .longitude(8.5417)
                                .label("Infobip Office Zurich"),
                        new RcsSuggestedAction()
                                .type("shareLocation")
                                .text("Share Your Location")));

        RcsOutboundRequest request = new RcsOutboundRequest()
                .from(givenFrom)
                .to(List.of(givenTo))
                .content(content);

        // Then
        Consumer<RcsOutboundResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getMessages()).hasSize(1);
        };

        var call = api.sendRcsOutboundMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldHandleRcsError() {
        // Given
        String givenFrom = "InvalidSender";
        String givenTo = "41793026727";

        String givenResponse = "{\n"
                + "  \"errorCode\": \"E400\",\n"
                + "  \"description\": \"Invalid sender ID.\",\n"
                + "  \"action\": \"Use a valid registered sender ID.\",\n"
                + "  \"violations\": [\n"
                + "    {\n"
                + "      \"field\": \"from\",\n"
                + "      \"description\": \"Sender ID not registered for RCS\"\n"
                + "    }\n"
                + "  ]\n"
                + "}";

        String expectedRequest = "{\n"
                + "  \"from\": \"" + givenFrom + "\",\n"
                + "  \"to\": [\n"
                + "    \"" + givenTo + "\"\n"
                + "  ],\n"
                + "  \"content\": {\n"
                + "    \"text\": \"Test message\"\n"
                + "  }\n"
                + "}";

        // When
        setUpPostRequest(RCS_OUTBOUND, expectedRequest, givenResponse, 400);

        RcsApi api = new RcsApi(getApiClient());

        RcsOutboundRequest request = new RcsOutboundRequest()
                .from(givenFrom)
                .to(List.of(givenTo))
                .content(new RcsContent().text("Test message"));

        // Then
        Consumer<ApiException> assertions = (exception) -> {
            then(exception).isNotNull();
            then(exception.responseStatusCode()).isEqualTo(400);
            then(exception.rawResponseBody()).contains("E400");
            then(exception.rawResponseBody()).contains("Invalid sender ID");
        };

        testFailedCall(() -> api.sendRcsOutboundMessage(request).execute(), assertions);
        testFailedAsyncCall(
                (ApiCallback<RcsOutboundResponse> callback) -> 
                    api.sendRcsOutboundMessage(request).executeAsync(callback),
                assertions);
    }

    @Test
    void shouldSendRcsWithMediaOnly() {
        // Given - RCS with media but no text
        String givenBulkId = "2034072219640523072";
        String givenTo = "41793026727";
        String givenMessageId = "media-msg-1";
        String givenFrom = "InfoRCS";

        String givenResponse = "{\n"
                + "  \"bulkId\": \"" + givenBulkId + "\",\n"
                + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"" + givenTo + "\",\n"
                + "      \"messageId\": \"" + givenMessageId + "\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 26,\n"
                + "        \"name\": \"PENDING_ACCEPTED\"\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";

        String expectedRequest = "{\n"
                + "  \"from\": \"" + givenFrom + "\",\n"
                + "  \"to\": [\n"
                + "    \"" + givenTo + "\"\n"
                + "  ],\n"
                + "  \"content\": {\n"
                + "    \"mediaUrl\": \"https://example.com/video.mp4\"\n"
                + "  }\n"
                + "}";

        // When
        setUpSuccessPostRequest(RCS_OUTBOUND, expectedRequest, givenResponse);

        RcsApi api = new RcsApi(getApiClient());

        RcsContent content = new RcsContent()
                .mediaUrl("https://example.com/video.mp4");

        RcsOutboundRequest request = new RcsOutboundRequest()
                .from(givenFrom)
                .to(List.of(givenTo))
                .content(content);

        // Then
        Consumer<RcsOutboundResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
        };

        var call = api.sendRcsOutboundMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldHandlePartialSuccessForMultipleRecipients() {
        // Given - some recipients succeed, some fail
        String givenBulkId = "2034072219640523072";
        String validTo = "41793026727";
        String invalidTo = "00000000000";
        String givenFrom = "InfoRCS";

        String givenResponse = "{\n"
                + "  \"bulkId\": \"" + givenBulkId + "\",\n"
                + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"" + validTo + "\",\n"
                + "      \"messageId\": \"msg-1\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 26,\n"
                + "        \"name\": \"PENDING_ACCEPTED\"\n"
                + "      }\n"
                + "    },\n"
                + "    {\n"
                + "      \"to\": \"" + invalidTo + "\",\n"
                + "      \"messageId\": \"msg-2\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 5,\n"
                + "        \"groupName\": \"REJECTED\",\n"
                + "        \"id\": 51,\n"
                + "        \"name\": \"REJECTED_DESTINATION\",\n"
                + "        \"description\": \"Invalid destination number\"\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";

        String expectedRequest = "{\n"
                + "  \"from\": \"" + givenFrom + "\",\n"
                + "  \"to\": [\n"
                + "    \"" + validTo + "\",\n"
                + "    \"" + invalidTo + "\"\n"
                + "  ],\n"
                + "  \"content\": {\n"
                + "    \"text\": \"Test message\"\n"
                + "  }\n"
                + "}";

        // When
        setUpSuccessPostRequest(RCS_OUTBOUND, expectedRequest, givenResponse);

        RcsApi api = new RcsApi(getApiClient());

        RcsOutboundRequest request = new RcsOutboundRequest()
                .from(givenFrom)
                .to(List.of(validTo, invalidTo))
                .content(new RcsContent().text("Test message"));

        // Then
        Consumer<RcsOutboundResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getMessages()).hasSize(2);
            
            // First recipient succeeds
            RcsMessageInfo msg1 = response.getMessages().get(0);
            then(msg1.getTo()).isEqualTo(validTo);
            then(msg1.getStatus().getGroupName()).isEqualTo("PENDING");
            
            // Second recipient fails
            RcsMessageInfo msg2 = response.getMessages().get(1);
            then(msg2.getTo()).isEqualTo(invalidTo);
            then(msg2.getStatus().getGroupName()).isEqualTo("REJECTED");
            then(msg2.getStatus().getDescription()).contains("Invalid destination");
        };

        var call = api.sendRcsOutboundMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldHandleEmptyCarousel() {
        // Given
        String givenFrom = "InfoRCS";
        String givenTo = "41793026727";

        String givenResponse = "{\n"
                + "  \"errorCode\": \"E400\",\n"
                + "  \"description\": \"Carousel must contain at least one card.\",\n"
                + "  \"action\": \"Add cards to carousel.\"\n"
                + "}";

        String expectedRequest = "{\n"
                + "  \"from\": \"" + givenFrom + "\",\n"
                + "  \"to\": [\n"
                + "    \"" + givenTo + "\"\n"
                + "  ],\n"
                + "  \"content\": {\n"
                + "    \"carousel\": []\n"
                + "  }\n"
                + "}";

        // When
        setUpPostRequest(RCS_OUTBOUND, expectedRequest, givenResponse, 400);

        RcsApi api = new RcsApi(getApiClient());

        RcsContent content = new RcsContent()
                .carousel(new ArrayList<>());

        RcsOutboundRequest request = new RcsOutboundRequest()
                .from(givenFrom)
                .to(List.of(givenTo))
                .content(content);

        // Then
        Consumer<ApiException> assertions = (exception) -> {
            then(exception).isNotNull();
            then(exception.responseStatusCode()).isEqualTo(400);
            then(exception.rawResponseBody()).contains("Carousel must contain at least one card");
        };

        testFailedCall(() -> api.sendRcsOutboundMessage(request).execute(), assertions);
    }

    @Test
    void shouldHandleAuthenticationError() {
        // Given
        String givenResponse = "{\n"
                + "  \"errorCode\": \"E401\",\n"
                + "  \"description\": \"Authentication failed.\",\n"
                + "  \"action\": \"Check your API key.\"\n"
                + "}";

        String expectedRequest = "{\n"
                + "  \"from\": \"InfoRCS\",\n"
                + "  \"to\": [\n"
                + "    \"41793026727\"\n"
                + "  ],\n"
                + "  \"content\": {\n"
                + "    \"text\": \"Test\"\n"
                + "  }\n"
                + "}";

        // When
        setUpPostRequest(RCS_OUTBOUND, expectedRequest, givenResponse, 401);

        RcsApi api = new RcsApi(getApiClient());

        RcsOutboundRequest request = new RcsOutboundRequest()
                .from("InfoRCS")
                .to(List.of("41793026727"))
                .content(new RcsContent().text("Test"));

        // Then
        Consumer<ApiException> assertions = (exception) -> {
            then(exception).isNotNull();
            then(exception.responseStatusCode()).isEqualTo(401);
            then(exception.rawResponseBody()).contains("E401");
        };

        testFailedCall(() -> api.sendRcsOutboundMessage(request).execute(), assertions);
    }
}
