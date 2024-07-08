package com.infobip.api;

import com.infobip.ApiCallback;
import com.infobip.ApiException;
import com.infobip.ApiExceptionDetails;
import com.infobip.model.SmsAdvancedTextualRequest;
import com.infobip.model.SmsDestination;
import com.infobip.model.SmsResponse;
import com.infobip.model.SmsTextualMessage;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;

import static org.assertj.core.api.BDDAssertions.then;

class ApiErrorResponsesTest extends ApiTest {

    private static final String SMS_API_ENDPOINT = "/sms/2/text/advanced";

    @ParameterizedTest(name = "[{index}] Status code = {0}")
    @MethodSource("errorResponsesSource")
    void shouldProcessErrorResponse(int givenHttpStatusCode, String givenResponse, ApiExceptionDetails expectedDetails) {
        String givenTo = "41793026727";
        String givenFrom = "InfoSMS";
        String givenText = "This is a sample message";

        String expectedRequest = String.format("{\n" +
                                                   "  \"messages\": [\n" +
                                                   "    {\n" +
                                                   "      \"destinations\": [\n" +
                                                   "        {\n" +
                                                   "          \"to\": \"%s\"\n" +
                                                   "        }\n" +
                                                   "      ],\n" +
                                                   "      \"from\": \"%s\",\n" +
                                                   "      \"text\": \"%s\"\n" +
                                                   "    }\n" +
                                                   "  ]\n" +
                                                   "}",
                                               givenTo,
                                               givenFrom,
                                               givenText
        );

        setUpPostRequest(SMS_API_ENDPOINT, expectedRequest, givenResponse, givenHttpStatusCode);

        SmsApi sendSmsApi = new SmsApi(getApiClient());

        SmsDestination destination = new SmsDestination().to(givenTo);

        SmsTextualMessage message = new SmsTextualMessage()
            .from(givenFrom)
            .text(givenText)
            .destinations(List.of(destination));

        SmsAdvancedTextualRequest request = new SmsAdvancedTextualRequest()
            .messages(List.of(message));

        Consumer<ApiException> assertions = (apiException) -> {
            then(apiException).isNotNull();
            then(apiException.responseStatusCode()).isEqualTo(givenHttpStatusCode);
            then(apiException.rawResponseBody()).isEqualTo(givenResponse);
            then(apiException.details()).isEqualTo(expectedDetails);
        };

        testFailedCall(
            () -> sendSmsApi.sendSmsMessage(request).execute(),
            assertions
        );

        testFailedAsyncCall(
            (ApiCallback<SmsResponse> apiCallback) -> sendSmsApi.sendSmsMessage(request).executeAsync(apiCallback),
            assertions
        );
    }

    private static Stream<Arguments> errorResponsesSource() {
        return Stream.of(
            badRequestResponse(),
            internalServerErrorResponse()

        );
    }

    private static Arguments badRequestResponse() {
        String badRequestResponse = "{\n" +
            "  \"requestError\": {\n" +
            "    \"serviceException\": {\n" +
            "      \"messageId\": \"BAD_REQUEST\",\n" +
            "      \"text\": \"Bad request\",\n" +
            "      \"validationErrors\": {\n" +
            "        \"messages[0].text\": [\n" +
            "          \"invalid text\"\n" +
            "        ]\n" +
            "      }\n" +
            "    }\n" +
            "  }\n" +
            "}";

        var violation = new ApiExceptionDetails.Violation();
        violation.setViolation("invalid text");
        violation.setProperty("messages[0].text");
        List<ApiExceptionDetails.Violation> violations = new ArrayList<>();
        violations.add(violation);

        ApiExceptionDetails expectedDetails = new ApiExceptionDetails();
        expectedDetails.setMessageId("BAD_REQUEST");
        expectedDetails.setText("Bad request");
        expectedDetails.setValidationErrors(Map.of("messages[0].text", List.of("invalid text")));
        expectedDetails.setErrorCode("E400");
        expectedDetails.setDescription("Bad request");
        expectedDetails.setViolations(violations);

        return Arguments.of(400, badRequestResponse, expectedDetails);
    }

    private static Arguments internalServerErrorResponse() {
        String serverErrorResponse = "{\n" +
            "  \"requestError\": {\n" +
            "    \"serviceException\": {\n" +
            "      \"messageId\": \"GENERAL_ERROR\",\n" +
            "      \"text\": \"Something went wrong. Please contact support.\"\n" +
            "    }\n" +
            "  }\n" +
            "}";
        ApiExceptionDetails expectedDetails = new ApiExceptionDetails();
        expectedDetails.setMessageId("GENERAL_ERROR");
        expectedDetails.setText("Something went wrong. Please contact support.");
        expectedDetails.setErrorCode("E500");
        expectedDetails.setDescription("Something went wrong. Please contact support.");

        return Arguments.of(500, serverErrorResponse, expectedDetails);
    }

}
