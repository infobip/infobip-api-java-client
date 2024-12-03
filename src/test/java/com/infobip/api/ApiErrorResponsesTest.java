package com.infobip.api;

import static org.assertj.core.api.BDDAssertions.then;

import com.infobip.ApiCallback;
import com.infobip.ApiException;
import com.infobip.ApiExceptionDetails;
import com.infobip.model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ApiErrorResponsesTest extends ApiTest {

    private static final String SMS_API_ENDPOINT = "/sms/3/messages";

    @ParameterizedTest(name = "[{index}] Status code = {0}")
    @MethodSource("errorResponsesSource")
    void shouldProcessErrorResponse(
            int givenHttpStatusCode, String givenResponse, ApiExceptionDetails expectedDetails) {
        String givenTo = "41793026727";
        String givenFrom = "InfoSMS";
        String givenText = "This is a sample message";

        String expectedRequest = String.format(
                "{\n" + "  \"messages\": [\n"
                        + "    {\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"destinations\": [\n"
                        + "        {\n"
                        + "          \"to\": \"%s\"\n"
                        + "        }\n"
                        + "      ],\n"
                        + "      \"content\": {\n"
                        + "        \"text\": \"%s\"\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenFrom, givenTo, givenText);

        setUpPostRequest(SMS_API_ENDPOINT, expectedRequest, givenResponse, givenHttpStatusCode);

        SmsApi sendSmsApi = new SmsApi(getApiClient());

        SmsDestination destination = new SmsDestination().to(givenTo);

        SmsMessage message = new SmsMessage()
                .sender("InfoSMS")
                .destinations(List.of(destination))
                .content(new SmsTextContent().text(givenText));

        SmsRequest request = new SmsRequest().messages(List.of(message));

        Consumer<ApiException> assertions = (apiException) -> {
            then(apiException).isNotNull();
            then(apiException.responseStatusCode()).isEqualTo(givenHttpStatusCode);
            then(apiException.rawResponseBody()).isEqualTo(givenResponse);
            then(apiException.details()).isEqualTo(expectedDetails);
        };

        testFailedCall(() -> sendSmsApi.sendSmsMessages(request).execute(), assertions);

        testFailedAsyncCall(
                (ApiCallback<SmsResponse> apiCallback) ->
                        sendSmsApi.sendSmsMessages(request).executeAsync(apiCallback),
                assertions);
    }

    private static Stream<Arguments> errorResponsesSource() {
        return Stream.of(badRequestResponse(), internalServerErrorResponse());
    }

    private static Arguments badRequestResponse() {
        String badRequestResponse = "    {\n" + "      \"errorCode\": \"E400\",\n"
                + "      \"description\": \"Request cannot be processed.\",\n"
                + "      \"action\": \"Check the syntax, violations and adjust the request.\",\n"
                + "      \"violations\": [],\n"
                + "      \"resources\": [\n"
                + "        {\n"
                + "          \"name\": \"API endpoint documentation\",\n"
                + "          \"url\": \"https://www.infobip.com/docs/api/send-sms-messages\"\n"
                + "        }\n"
                + "      ]\n"
                + "    }\n";

        var resource = new ApiExceptionDetails.Resource();
        resource.setName("API endpoint documentation");
        resource.setUrl("https://www.infobip.com/docs/api/send-sms-messages");

        List<ApiExceptionDetails.Violation> violations = new ArrayList<>();
        List<ApiExceptionDetails.Resource> resources = new ArrayList<>();
        resources.add(resource);

        ApiExceptionDetails expectedDetails = new ApiExceptionDetails();
        expectedDetails.setErrorCode("E400");
        expectedDetails.setDescription("Request cannot be processed.");
        expectedDetails.setAction("Check the syntax, violations and adjust the request.");
        expectedDetails.setViolations(violations);
        expectedDetails.setResources(resources);

        return Arguments.of(400, badRequestResponse, expectedDetails);
    }

    private static Arguments internalServerErrorResponse() {
        String serverErrorResponse = "{\n" + "  \"errorCode\": \"E500\",\n"
                + "  \"description\": \"Something went wrong.\",\n"
                + "  \"action\": \"Contact the support.\",\n"
                + "  \"violations\": [],\n"
                + "  \"resources\": [\n"
                + "    {\n"
                + "      \"name\": \"API endpoint documentation\",\n"
                + "      \"url\": \"https://www.infobip.com/docs/api/send-sms-messages\"\n"
                + "    }\n"
                + "  ]\n"
                + "}";

        var resource = new ApiExceptionDetails.Resource();
        resource.setName("API endpoint documentation");
        resource.setUrl("https://www.infobip.com/docs/api/send-sms-messages");

        List<ApiExceptionDetails.Violation> violations = new ArrayList<>();
        List<ApiExceptionDetails.Resource> resources = new ArrayList<>();
        resources.add(resource);

        ApiExceptionDetails expectedDetails = new ApiExceptionDetails();
        expectedDetails.setErrorCode("E500");
        expectedDetails.setDescription("Something went wrong.");
        expectedDetails.setAction("Contact the support.");
        expectedDetails.setViolations(violations);
        expectedDetails.setResources(resources);

        return Arguments.of(500, serverErrorResponse, expectedDetails);
    }
}
