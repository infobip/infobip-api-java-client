package com.infobip.api;

import com.infobip.model.*;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import static org.assertj.core.api.BDDAssertions.then;

class TfaApiTest extends ApiTest {
    private static final String APPLICATIONS = "/2fa/2/applications";
    private static final String APPLICATION = "/2fa/2/applications/{appId}";
    private static final String APPLICATION_MESSAGES = "/2fa/2/applications/{appId}/messages";
    private static final String APPLICATION_MESSAGE = "/2fa/2/applications/{appId}/messages/{msgId}";
    private static final String PIN = "/2fa/2/pin";
    private static final String PIN_RESEND = "/2fa/2/pin/{pinId}/resend";
    private static final String PIN_VIA_VOICE = "/2fa/2/pin/voice";
    private static final String PIN_RESEND_VIA_VOICE = "/2fa/2/pin/{pinId}/resend/voice";
    private static final String PIN_VERIFY = "/2fa/2/pin/{pinId}/verify";
    private static final String APPLICATION_VERIFICATIONS = "/2fa/2/applications/{appId}/verifications";
    private static final String APPLICATION_EMAIL_MESSAGES = "/2fa/2/applications/{appId}/email/messages";
    private static final String APPLICATION_EMAIL_MESSAGE = "/2fa/2/applications/{appId}/email/messages/{msgId}";
    private static final String PIN_EMAIL_SEND = "/2fa/2/pin/email";
    private static final String PIN_EMAIL_RESEND = "/2fa/2/pin/{pinId}/resend/email";

    @Test
    void shouldGetTfaApplications() {
        String givenApplicationId1 = "0933F3BC087D2A617AC6DCB2EF5B8A61";
        String givenName1 = "Test application BASIC 1";
        int givenPinAttempts1 = 10;
        boolean givenAllowMultiplePinVerifications1 = true;
        String givenPinTimeToLive1 = "2h";
        String givenVerifyPinLimit1 = "1/3s";
        String givenSendPinPerApplicationLimit1 = "10000/1d";
        String givenSendPinPerPhoneNumberLimit1 = "3/1d";
        boolean givenEnabled1 = true;

        String givenApplicationId2 = "5F04FACFAA4978F62FCAEBA97B37E90F";
        String givenName2 = "Test application BASIC 2";
        int givenPinAttempts2 = 12;
        boolean givenAllowMultiplePinVerifications2 = true;
        String givenPinTimeToLive2 = "10m";
        String givenVerifyPinLimit2 = "2/1s";
        String givenSendPinPerApplicationLimit2 = "10000/1d";
        String givenSendPinPerPhoneNumberLimit2 = "5/1h";
        boolean givenEnabled2 = true;

        String givenApplicationId3 = "B450F966A8EF017180F148AF22C42642";
        String givenName3 = "Test application BASIC 3";
        int givenPinAttempts3 = 15;
        boolean givenAllowMultiplePinVerifications3 = true;
        String givenPinTimeToLive3 = "1h";
        String givenVerifyPinLimit3 = "30/10s";
        String givenSendPinPerApplicationLimit3 = "10000/3d";
        String givenSendPinPerPhoneNumberLimit3 = "10/20m";
        boolean givenEnabled3 = true;

        String givenResponse = String.format(
                "[" +
                " {" +
                "    \"applicationId\": \"%s\"," +
                "    \"name\": \"%s\"," +
                "    \"configuration\": {" +
                "      \"pinAttempts\": %d," +
                "      \"allowMultiplePinVerifications\": %b," +
                "      \"pinTimeToLive\": \"%s\"," +
                "      \"verifyPinLimit\": \"%s\"," +
                "      \"sendPinPerApplicationLimit\": \"%s\"," +
                "      \"sendPinPerPhoneNumberLimit\": \"%s\"" +
                "    }," +
                "    \"enabled\": %b" +
                "  }," +
                "  {" +
                "    \"applicationId\": \"%s\"," +
                "    \"name\": \"%s\"," +
                "    \"configuration\": {" +
                "      \"pinAttempts\": %d," +
                "      \"allowMultiplePinVerifications\": %b," +
                "      \"pinTimeToLive\": \"%s\"," +
                "      \"verifyPinLimit\": \"%s\"," +
                "      \"sendPinPerApplicationLimit\": \"%s\"," +
                "      \"sendPinPerPhoneNumberLimit\": \"%s\"" +
                "    }," +
                "    \"enabled\": %b" +
                "  }," +
                "  {" +
                "    \"applicationId\": \"%s\"," +
                "    \"name\": \"%s\"," +
                "    \"configuration\": {" +
                "      \"pinAttempts\": %d," +
                "      \"allowMultiplePinVerifications\": %b," +
                "      \"pinTimeToLive\": \"%s\"," +
                "      \"verifyPinLimit\": \"%s\"," +
                "      \"sendPinPerApplicationLimit\": \"%s\"," +
                "      \"sendPinPerPhoneNumberLimit\": \"%s\"" +
                "    }," +
                "    \"enabled\": %b" +
                "  }" +
                "]",
                givenApplicationId1,
                givenName1,
                givenPinAttempts1,
                givenAllowMultiplePinVerifications1,
                givenPinTimeToLive1,
                givenVerifyPinLimit1,
                givenSendPinPerApplicationLimit1,
                givenSendPinPerPhoneNumberLimit1,
                givenEnabled1,

                givenApplicationId2,
                givenName2,
                givenPinAttempts2,
                givenAllowMultiplePinVerifications2,
                givenPinTimeToLive2,
                givenVerifyPinLimit2,
                givenSendPinPerApplicationLimit2,
                givenSendPinPerPhoneNumberLimit2,
                givenEnabled2,

                givenApplicationId3,
                givenName3,
                givenPinAttempts3,
                givenAllowMultiplePinVerifications3,
                givenPinTimeToLive3,
                givenVerifyPinLimit3,
                givenSendPinPerApplicationLimit3,
                givenSendPinPerPhoneNumberLimit3,
                givenEnabled3
        );

        setUpSuccessGetRequest(
                APPLICATIONS,
                Map.of(),
                givenResponse
        );

        TfaApi tfaApi = new TfaApi(getApiClient());

        Consumer<List<TfaApplicationResponse>> assertions = (tfaApplicationsResponse) -> {
            then(tfaApplicationsResponse).isNotNull();
            then(tfaApplicationsResponse.size()).isEqualTo(3);

            TfaApplicationResponse response1 = tfaApplicationsResponse.get(0);
            then(response1.getApplicationId()).isEqualTo(givenApplicationId1);
            then(response1.getName()).isEqualTo(givenName1);
            then(response1.getEnabled()).isEqualTo(givenEnabled1);
            then(response1.getConfiguration().getPinAttempts()).isEqualTo(givenPinAttempts1);
            then(response1.getConfiguration().getPinTimeToLive()).isEqualTo(givenPinTimeToLive1);
            then(response1.getConfiguration().getSendPinPerApplicationLimit()).isEqualTo(givenSendPinPerApplicationLimit1);
            then(response1.getConfiguration().getVerifyPinLimit()).isEqualTo(givenVerifyPinLimit1);
            then(response1.getConfiguration().getSendPinPerPhoneNumberLimit()).isEqualTo(givenSendPinPerPhoneNumberLimit1);
            then(response1.getConfiguration().getAllowMultiplePinVerifications()).isEqualTo(givenAllowMultiplePinVerifications1);

            TfaApplicationResponse response2 = tfaApplicationsResponse.get(1);
            then(response2.getApplicationId()).isEqualTo(givenApplicationId2);
            then(response2.getName()).isEqualTo(givenName2);
            then(response2.getEnabled()).isEqualTo(givenEnabled2);
            then(response2.getConfiguration().getPinAttempts()).isEqualTo(givenPinAttempts2);
            then(response2.getConfiguration().getPinTimeToLive()).isEqualTo(givenPinTimeToLive2);
            then(response2.getConfiguration().getSendPinPerApplicationLimit()).isEqualTo(givenSendPinPerApplicationLimit2);
            then(response2.getConfiguration().getVerifyPinLimit()).isEqualTo(givenVerifyPinLimit2);
            then(response2.getConfiguration().getSendPinPerPhoneNumberLimit()).isEqualTo(givenSendPinPerPhoneNumberLimit2);
            then(response2.getConfiguration().getAllowMultiplePinVerifications()).isEqualTo(givenAllowMultiplePinVerifications2);

            TfaApplicationResponse response3 = tfaApplicationsResponse.get(2);
            then(response3.getApplicationId()).isEqualTo(givenApplicationId3);
            then(response3.getName()).isEqualTo(givenName3);
            then(response3.getEnabled()).isEqualTo(givenEnabled3);
            then(response3.getConfiguration().getPinAttempts()).isEqualTo(givenPinAttempts3);
            then(response3.getConfiguration().getPinTimeToLive()).isEqualTo(givenPinTimeToLive3);
            then(response3.getConfiguration().getSendPinPerApplicationLimit()).isEqualTo(givenSendPinPerApplicationLimit3);
            then(response3.getConfiguration().getVerifyPinLimit()).isEqualTo(givenVerifyPinLimit3);
            then(response3.getConfiguration().getSendPinPerPhoneNumberLimit()).isEqualTo(givenSendPinPerPhoneNumberLimit3);
            then(response3.getConfiguration().getAllowMultiplePinVerifications()).isEqualTo(givenAllowMultiplePinVerifications3);
        };

        var call = tfaApi.getTfaApplications();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateTfaApplication() {
        String givenApplicationId = "1234567";

        String givenName = "2fa application name";
        int givenPinAttempts = 5;
        boolean givenAllowMultiplePinVerifications = true;
        String givenPinTimeToLive = "10m";
        String givenVerifyPinLimit = "2/4s";
        String givenSendPinPerApplicationLimit = "5000/12h";
        String givenSendPinPerPhoneNumberLimit = "2/1d";
        boolean givenEnabled = true;

        String givenResponse = String.format(
                " {" +
                "    \"applicationId\": \"%s\"," +
                "    \"name\": \"%s\"," +
                "    \"configuration\": {" +
                "      \"pinAttempts\": %d," +
                "      \"allowMultiplePinVerifications\": %b," +
                "      \"pinTimeToLive\": \"%s\"," +
                "      \"verifyPinLimit\": \"%s\"," +
                "      \"sendPinPerApplicationLimit\": \"%s\"," +
                "      \"sendPinPerPhoneNumberLimit\": \"%s\"" +
                "    }," +
                "    \"enabled\": %b" +
                "  }",
                givenApplicationId,
                givenName,
                givenPinAttempts,
                givenAllowMultiplePinVerifications,
                givenPinTimeToLive,
                givenVerifyPinLimit,
                givenSendPinPerApplicationLimit,
                givenSendPinPerPhoneNumberLimit,
                givenEnabled
        );

        String expectedRequest = String.format(
                "{" +
                "    \"name\": \"%s\"," +
                "    \"configuration\": {" +
                "      \"pinAttempts\": %d," +
                "      \"allowMultiplePinVerifications\": %b," +
                "      \"pinTimeToLive\": \"%s\"," +
                "      \"verifyPinLimit\": \"%s\"," +
                "      \"sendPinPerApplicationLimit\": \"%s\"," +
                "      \"sendPinPerPhoneNumberLimit\": \"%s\"" +
                "    }," +
                "    \"enabled\": %b" +
                "}",
                givenName,
                givenPinAttempts,
                givenAllowMultiplePinVerifications,
                givenPinTimeToLive,
                givenVerifyPinLimit,
                givenSendPinPerApplicationLimit,
                givenSendPinPerPhoneNumberLimit,
                givenEnabled
        );

        setUpSuccessPostRequest(
                APPLICATIONS,
                expectedRequest,
                givenResponse
        );

        TfaApi tfaApi = new TfaApi(getApiClient());

        TfaApplicationConfiguration givenConfiguration = givenTfaApplicationConfiguration(givenPinAttempts, givenAllowMultiplePinVerifications, givenPinTimeToLive, givenVerifyPinLimit, givenSendPinPerApplicationLimit, givenSendPinPerPhoneNumberLimit);
        TfaApplicationRequest request = givenTfaApplicationRequest(givenName, givenEnabled, givenConfiguration);

        Consumer<TfaApplicationResponse> assertions = (tfaApplicationResponse) -> {
            then(tfaApplicationResponse).isNotNull();
            then(tfaApplicationResponse.getApplicationId()).isEqualTo(givenApplicationId);
            then(tfaApplicationResponse.getName()).isEqualTo(givenName);
            then(tfaApplicationResponse.getConfiguration()).isEqualTo(givenConfiguration);
            then(tfaApplicationResponse.getEnabled()).isEqualTo(givenEnabled);
        };

        var call = tfaApi.createTfaApplication(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetTfaApplication() {
        String givenApplicationId = "0933F3BC087D2A617AC6DCB2EF5B8A61";
        String givenName = "Application name";
        int givenPinAttempts = 5;
        boolean givenAllowMultiplePinVerifications = true;
        String givenPinTimeToLive = "10m";
        String givenVerifyPinLimit = "2/4s";
        String givenSendPinPerApplicationLimit = "5000/12h";
        String givenSendPinPerPhoneNumberLimit = "2/1d";
        boolean givenEnabled = true;

        String givenResponse = String.format(
                "{" +
                "    \"applicationId\": \"%s\"," +
                "    \"name\": \"%s\"," +
                "    \"configuration\": {" +
                "      \"pinAttempts\": %d," +
                "      \"allowMultiplePinVerifications\": %b," +
                "      \"pinTimeToLive\": \"%s\"," +
                "      \"verifyPinLimit\": \"%s\"," +
                "      \"sendPinPerApplicationLimit\": \"%s\"," +
                "      \"sendPinPerPhoneNumberLimit\": \"%s\"" +
                "    }," +
                "    \"enabled\": %b" +
                "}",
                givenApplicationId,
                givenName,
                givenPinAttempts,
                givenAllowMultiplePinVerifications,
                givenPinTimeToLive,
                givenVerifyPinLimit,
                givenSendPinPerApplicationLimit,
                givenSendPinPerPhoneNumberLimit,
                givenEnabled
        );

        setUpSuccessGetRequest(
                APPLICATION.replace("{appId}", givenApplicationId),
                Map.of(),
                givenResponse
        );

        TfaApi tfaApi = new TfaApi(getApiClient());

        TfaApplicationConfiguration givenConfiguration = givenTfaApplicationConfiguration(
                givenPinAttempts,
                givenAllowMultiplePinVerifications,
                givenPinTimeToLive,
                givenVerifyPinLimit,
                givenSendPinPerApplicationLimit,
                givenSendPinPerPhoneNumberLimit);

        Consumer<TfaApplicationResponse> assertions = (tfaApplicationResponse) -> {
            then(tfaApplicationResponse).isNotNull();
            then(tfaApplicationResponse.getApplicationId()).isEqualTo(givenApplicationId);
            then(tfaApplicationResponse.getName()).isEqualTo(givenName);
            then(tfaApplicationResponse.getConfiguration()).isEqualTo(givenConfiguration);
            then(tfaApplicationResponse.getEnabled()).isEqualTo(givenEnabled);
        };

        var call = tfaApi.getTfaApplication(givenApplicationId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateTfaApplication() {
        String givenApplicationId = "0933F3BC087D2A617AC6DCB2EF5B8A61";
        String givenName = "Application name";
        int givenPinAttempts = 5;
        boolean givenAllowMultiplePinVerifications = true;
        String givenPinTimeToLive = "10m";
        String givenVerifyPinLimit = "2/4s";
        String givenSendPinPerApplicationLimit = "5000/12h";
        String givenSendPinPerPhoneNumberLimit = "2/1d";
        boolean givenEnabled = true;

        String givenResponse = String.format(
                "{" +
                "    \"applicationId\": \"%s\"," +
                "    \"name\": \"%s\"," +
                "    \"configuration\": {" +
                "      \"pinAttempts\": %d," +
                "      \"allowMultiplePinVerifications\": %b," +
                "      \"pinTimeToLive\": \"%s\"," +
                "      \"verifyPinLimit\": \"%s\"," +
                "      \"sendPinPerApplicationLimit\": \"%s\"," +
                "      \"sendPinPerPhoneNumberLimit\": \"%s\"" +
                "    }," +
                "    \"enabled\": %b" +
                "}",
                givenApplicationId,
                givenName,
                givenPinAttempts,
                givenAllowMultiplePinVerifications,
                givenPinTimeToLive,
                givenVerifyPinLimit,
                givenSendPinPerApplicationLimit,
                givenSendPinPerPhoneNumberLimit,
                givenEnabled
        );

        String expectedRequest = String.format(
                "{" +
                "    \"name\": \"%s\"," +
                "    \"configuration\": {" +
                "      \"pinAttempts\": %d," +
                "      \"allowMultiplePinVerifications\": %b," +
                "      \"pinTimeToLive\": \"%s\"," +
                "      \"verifyPinLimit\": \"%s\"," +
                "      \"sendPinPerApplicationLimit\": \"%s\"," +
                "      \"sendPinPerPhoneNumberLimit\": \"%s\"" +
                "    }," +
                "    \"enabled\": %b" +
                "}",
                givenName,
                givenPinAttempts,
                givenAllowMultiplePinVerifications,
                givenPinTimeToLive,
                givenVerifyPinLimit,
                givenSendPinPerApplicationLimit,
                givenSendPinPerPhoneNumberLimit,
                givenEnabled
        );

        setUpSuccessPutRequest(
                APPLICATION.replace("{appId}", givenApplicationId),
                Map.of(),
                expectedRequest,
                givenResponse
        );

        TfaApi tfaApi = new TfaApi(getApiClient());

        TfaApplicationConfiguration givenConfiguration = givenTfaApplicationConfiguration(
                givenPinAttempts,
                givenAllowMultiplePinVerifications,
                givenPinTimeToLive,
                givenVerifyPinLimit,
                givenSendPinPerApplicationLimit,
                givenSendPinPerPhoneNumberLimit);
        TfaApplicationRequest request = givenTfaApplicationRequest(
                givenName,
                givenEnabled,
                givenConfiguration);

        Consumer<TfaApplicationResponse> assertions = (tfaApplicationResponse) -> {
            then(tfaApplicationResponse).isNotNull();
            then(tfaApplicationResponse.getApplicationId()).isEqualTo(givenApplicationId);
            then(tfaApplicationResponse.getName()).isEqualTo(givenName);
            then(tfaApplicationResponse.getConfiguration()).isEqualTo(givenConfiguration);
            then(tfaApplicationResponse.getEnabled()).isEqualTo(givenEnabled);
        };

        var call = tfaApi.updateTfaApplication(givenApplicationId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetTfaMessageTemplates() {
        String givenApplicationId = "HJ675435E3A6EA43432G5F37A635KJ8B";

        String givenMessageId1 = "9C815F8AF3328";
        String givenPinPlaceholder1 = "{{pin}}";
        String givenMessageText1 = String.format("Your PIN is %s.", givenPinPlaceholder1);
        int givenPinLength1 = 4;
        String givenPinType1 = "NUMERIC";
        String givenLanguage1 = "en";
        String givenRepeatDtmf1 = "1#";
        double givenSpeechRate1 = 1d;

        String givenMessageId2 = "8F0792F86035A";
        String givenPinPlaceholder2 = "{{pin}}";
        String givenMessageText2 = String.format("Your PIN is %s.", givenPinPlaceholder2);
        int givenPinLength2 = 6;
        String givenPinType2 = "HEX";
        String givenRepeatDtmf2 = "1#";
        double givenSpeechRate2 = 1.5d;
        var givenFrom = "from";
        var givenEmailTemplateId = 10L;

        String givenResponse = String.format(
                "[" +
                "  {" +
                "    \"messageId\": \"%s\"," +
                "    \"from\": \"%s\"," +
                "    \"emailTemplateId\": %d," +
                "    \"applicationId\": \"%s\"," +
                "    \"pinPlaceholder\": \"%s\"," +
                "    \"messageText\": \"%s\"," +
                "    \"pinLength\": %d," +
                "    \"pinType\": \"%s\"," +
                "    \"language\": \"%s\"," +
                "    \"repeatDTMF\": \"%s\"," +
                "    \"speechRate\": %.1f" +
                "  }," +
                "  {" +
                "    \"messageId\": \"%s\"," +
                "    \"applicationId\": \"%s\"," +
                "    \"pinPlaceholder\": \"%s\"," +
                "    \"messageText\": \"%s\"," +
                "    \"pinLength\": %d," +
                "    \"pinType\": \"%s\"," +
                "    \"repeatDTMF\": \"%s\"," +
                "    \"speechRate\": %.1f" +
                "  }" +
                "]",
                givenMessageId1,
                givenFrom,
                givenEmailTemplateId,
                givenApplicationId,
                givenPinPlaceholder1,
                givenMessageText1,
                givenPinLength1,
                givenPinType1,
                givenLanguage1,
                givenRepeatDtmf1,
                givenSpeechRate1,
                givenMessageId2,
                givenApplicationId,
                givenPinPlaceholder2,
                givenMessageText2,
                givenPinLength2,
                givenPinType2,
                givenRepeatDtmf2,
                givenSpeechRate2
        );

        setUpSuccessGetRequest(
                APPLICATION_MESSAGES.replace("{appId}", givenApplicationId),
                Map.of(),
                givenResponse
        );

        TfaApi tfaApi = new TfaApi(getApiClient());

        Consumer<List<TfaMessage>> assertions = (tfaMessages) -> {
            then(tfaMessages).isNotNull();
            then(tfaMessages.size()).isEqualTo(2);

            TfaMessage tfaMessage1 = tfaMessages.get(0);
            then(tfaMessage1.getApplicationId()).isEqualTo(givenApplicationId);
            then(tfaMessage1.getMessageId()).isEqualTo(givenMessageId1);
            then(tfaMessage1.getMessageText()).isEqualTo(givenMessageText1);
            then(tfaMessage1.getPinLength()).isEqualTo(givenPinLength1);
            then(tfaMessage1.getPinPlaceholder()).isEqualTo(givenPinPlaceholder1);
            then(tfaMessage1.getPinType().getValue()).isEqualTo(givenPinType1);
            then(tfaMessage1.getLanguage().getValue()).isEqualTo(givenLanguage1);
            then(tfaMessage1.getRepeatDTMF()).isEqualTo(givenRepeatDtmf1);
            then(tfaMessage1.getSpeechRate()).isEqualTo(givenSpeechRate1);
            then(tfaMessage1.getEmailTemplateId()).isEqualTo(givenEmailTemplateId);
            then(tfaMessage1.getFrom()).isEqualTo(givenFrom);


            TfaMessage tfaMessage2 = tfaMessages.get(1);
            then(tfaMessage2.getApplicationId()).isEqualTo(givenApplicationId);
            then(tfaMessage2.getMessageId()).isEqualTo(givenMessageId2);
            then(tfaMessage2.getMessageText()).isEqualTo(givenMessageText2);
            then(tfaMessage2.getPinLength()).isEqualTo(givenPinLength2);
            then(tfaMessage2.getPinPlaceholder()).isEqualTo(givenPinPlaceholder2);
            then(tfaMessage2.getPinType().getValue()).isEqualTo(givenPinType2);
            then(tfaMessage2.getRepeatDTMF()).isEqualTo(givenRepeatDtmf2);
            then(tfaMessage2.getSpeechRate()).isEqualTo(givenSpeechRate2);
        };

        var call = tfaApi.getTfaMessageTemplates(givenApplicationId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateTfaMessageTemplate() {
        String givenApplicationId = "HJ675435E3A6EA43432G5F37A635KJ8B";

        String givenPinPlaceholder = "{{pin}}";
        String givenMessageText = String.format("Your PIN is %s.", givenPinPlaceholder);
        int givenPinLength = 4;
        String givenPinType = "ALPHANUMERIC";
        String givenLanguage = "en";
        String givenSenderId = "Infobip 2FA";
        String givenRepeatDtmf = "1#";
        double givenSpeechRate = 1d;

        String givenResponse = String.format(
                "  {" +
                "    \"pinPlaceholder\": \"%s\"," +
                "    \"messageText\": \"%s\"," +
                "    \"pinLength\": %d," +
                "    \"pinType\": \"%s\"," +
                "    \"language\": \"%s\"," +
                "    \"senderId\": \"%s\"," +
                "    \"repeatDTMF\": \"%s\"," +
                "    \"speechRate\": %.1f" +
                "  }",
                givenPinPlaceholder,
                givenMessageText,
                givenPinLength,
                givenPinType,
                givenLanguage,
                givenSenderId,
                givenRepeatDtmf,
                givenSpeechRate
        );

        String expectedRequest = String.format(
                "  {" +
                "    \"messageText\": \"%s\"," +
                "    \"pinLength\": %d," +
                "    \"pinType\": \"%s\"," +
                "    \"language\": \"%s\"," +
                "    \"senderId\": \"%s\"," +
                "    \"repeatDTMF\": \"%s\"," +
                "    \"speechRate\": %.1f" +
                "  }",
                givenMessageText,
                givenPinLength,
                givenPinType,
                givenLanguage,
                givenSenderId,
                givenRepeatDtmf,
                givenSpeechRate
        );

        setUpSuccessPostRequest(
                APPLICATION_MESSAGES.replace("{appId}", givenApplicationId),
                expectedRequest,
                givenResponse
        );

        TfaApi tfaApi = new TfaApi(getApiClient());

        TfaCreateMessageRequest request = new TfaCreateMessageRequest()
                .messageText(givenMessageText)
                .pinLength(givenPinLength)
                .pinType(TfaPinType.fromValue(givenPinType))
                .language(TfaLanguage.fromValue(givenLanguage))
                .senderId(givenSenderId)
                .repeatDTMF(givenRepeatDtmf)
                .speechRate(givenSpeechRate);

        Consumer<TfaMessage> assertions = (tfaMessage) -> {
            then(tfaMessage).isNotNull();

            then(tfaMessage.getMessageText()).isEqualTo(givenMessageText);
            then(tfaMessage.getPinLength()).isEqualTo(givenPinLength);
            then(tfaMessage.getPinPlaceholder()).isEqualTo(givenPinPlaceholder);
            then(tfaMessage.getPinType().getValue()).isEqualTo(givenPinType);
            then(tfaMessage.getLanguage().getValue()).isEqualTo(givenLanguage);
            then(tfaMessage.getSenderId()).isEqualTo(givenSenderId);
            then(tfaMessage.getRepeatDTMF()).isEqualTo(givenRepeatDtmf);
            then(tfaMessage.getSpeechRate()).isEqualTo(givenSpeechRate);
        };

        var call = tfaApi.createTfaMessageTemplate(givenApplicationId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetTfaMessageTemplate() {
        String givenApplicationId = "HJ675435E3A6EA43432G5F37A635KJ8B";
        String givenMessageId = "9C815F8AF3328";

        String givenPinPlaceholder = "{{pin}}";
        String givenMessageText = String.format("Your PIN is %s.", givenPinPlaceholder);
        int givenPinLength = 4;
        String givenPinType = "ALPHANUMERIC";
        String givenLanguage = "en";
        String givenSenderId = "Infobip 2FA";
        String givenRepeatDtmf = "1#";
        double givenSpeechRate = 1d;

        String givenResponse = String.format(
                "  {" +
                "    \"pinPlaceholder\": \"%s\"," +
                "    \"messageText\": \"%s\"," +
                "    \"pinLength\": %d," +
                "    \"pinType\": \"%s\"," +
                "    \"language\": \"%s\"," +
                "    \"senderId\": \"%s\"," +
                "    \"repeatDTMF\": \"%s\"," +
                "    \"speechRate\": %.1f" +
                "  }",
                givenPinPlaceholder,
                givenMessageText,
                givenPinLength,
                givenPinType,
                givenLanguage,
                givenSenderId,
                givenRepeatDtmf,
                givenSpeechRate
            );

        setUpSuccessGetRequest(
                APPLICATION_MESSAGE
                        .replace("{appId}", givenApplicationId)
                        .replace("{msgId}", givenMessageId),
                Map.of(),
                givenResponse
        );

        TfaApi tfaApi = new TfaApi(getApiClient());

        Consumer<TfaMessage> assertions = (tfaMessage) -> {
            then(tfaMessage.getMessageText()).isEqualTo(givenMessageText);
            then(tfaMessage.getPinLength()).isEqualTo(givenPinLength);
            then(tfaMessage.getPinPlaceholder()).isEqualTo(givenPinPlaceholder);
            then(tfaMessage.getPinType().getValue()).isEqualTo(givenPinType);
            then(tfaMessage.getLanguage().getValue()).isEqualTo(givenLanguage);
            then(tfaMessage.getSenderId()).isEqualTo(givenSenderId);
            then(tfaMessage.getRepeatDTMF()).isEqualTo(givenRepeatDtmf);
            then(tfaMessage.getSpeechRate()).isEqualTo(givenSpeechRate);
        };

        var call = tfaApi.getTfaMessageTemplate(givenApplicationId, givenMessageId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateTfaMessageTemplate() {
        String givenApplicationId = "HJ675435E3A6EA43432G5F37A635KJ8B";
        String givenMessageId = "9C815F8AF3328";

        String givenPinPlaceholder = "{{pin}}";
        String givenMessageText = String.format("Your PIN is %s.", givenPinPlaceholder);
        int givenPinLength = 6;
        String givenPinType = "ALPHANUMERIC";
        String givenLanguage = "en";
        String givenSenderId = "Infobip 2FA";
        String givenRepeatDtmf = "1#";
        double givenSpeechRate = 1d;

        String givenResponse = String.format(
                "  {" +
                "    \"pinPlaceholder\": \"%s\"," +
                "    \"messageText\": \"%s\"," +
                "    \"pinLength\": %d," +
                "    \"pinType\": \"%s\"," +
                "    \"language\": \"%s\"," +
                "    \"senderId\": \"%s\"," +
                "    \"repeatDTMF\": \"%s\"," +
                "    \"speechRate\": %.1f" +
                "  }",
                givenPinPlaceholder,
                givenMessageText,
                givenPinLength,
                givenPinType,
                givenLanguage,
                givenSenderId,
                givenRepeatDtmf,
                givenSpeechRate
        );

        String expectedRequest = String.format(
                "  {" +
                "    \"messageText\": \"%s\"," +
                "    \"pinLength\": %d," +
                "    \"pinType\": \"%s\"," +
                "    \"language\": \"%s\"," +
                "    \"senderId\": \"%s\"," +
                "    \"repeatDTMF\": \"%s\"," +
                "    \"speechRate\": %.1f" +
                "  }",
                givenMessageText,
                givenPinLength,
                givenPinType,
                givenLanguage,
                givenSenderId,
                givenRepeatDtmf,
                givenSpeechRate
        );

        setUpSuccessPutRequest(
                APPLICATION_MESSAGE
                        .replace("{appId}", givenApplicationId)
                        .replace("{msgId}", givenMessageId),
                Map.of(),
                expectedRequest,
                givenResponse
        );

        TfaApi tfaApi = new TfaApi(getApiClient());

        TfaUpdateMessageRequest request = new TfaUpdateMessageRequest()
                .messageText(givenMessageText)
                .pinLength(givenPinLength)
                .pinType(TfaPinType.fromValue(givenPinType))
                .language(TfaLanguage.fromValue(givenLanguage))
                .senderId(givenSenderId)
                .repeatDTMF(givenRepeatDtmf)
                .speechRate(givenSpeechRate);

        Consumer<TfaMessage> assertions = (tfaMessage) -> {
            then(tfaMessage).isNotNull();

            then(tfaMessage.getMessageText()).isEqualTo(givenMessageText);
            then(tfaMessage.getPinLength()).isEqualTo(givenPinLength);
            then(tfaMessage.getPinPlaceholder()).isEqualTo(givenPinPlaceholder);
            then(tfaMessage.getPinType().getValue()).isEqualTo(givenPinType);
            then(tfaMessage.getLanguage().getValue()).isEqualTo(givenLanguage);
            then(tfaMessage.getSenderId()).isEqualTo(givenSenderId);
            then(tfaMessage.getRepeatDTMF()).isEqualTo(givenRepeatDtmf);
            then(tfaMessage.getSpeechRate()).isEqualTo(givenSpeechRate);
        };

        var call = tfaApi.updateTfaMessageTemplate(givenApplicationId, givenMessageId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendTfaPinCodeViaSms() {
        String givenPinId = "9C817C6F8AF3D48F9FE553282AFA2B67";
        String givenTo = "41793026727";
        String givenNcStatus = "NC_DESTINATION_REACHABLE";
        String givenSmsStatus = "MESSAGE_SENT";

        String givenApplicationId = "1234567";
        String givenMessageId = "7654321";
        String givenFrom = "Sender 1";
        String givenFirstName = "John";

        String givenResponse = String.format(
                "{" +
                "  \"pinId\": \"%s\"," +
                "  \"to\": \"%s\"," +
                "  \"ncStatus\": \"%s\"," +
                "  \"smsStatus\": \"%s\"" +
                "}",
                givenPinId,
                givenTo,
                givenNcStatus,
                givenSmsStatus
        );

        String expectedRequest = String.format(
                "{" +
                "  \"applicationId\": \"%s\"," +
                "  \"messageId\": \"%s\"," +
                "  \"from\": \"%s\"," +
                "  \"to\": \"%s\"," +
                "  \"placeholders\": {" +
                "    \"firstName\": \"%s\"" +
                "  }" +
                "}",
                givenApplicationId,
                givenMessageId,
                givenFrom,
                givenTo,
                givenFirstName
        );

        setUpSuccessPostRequest(PIN, expectedRequest, givenResponse);

        TfaApi tfaApi = new TfaApi(getApiClient());

        Map<String, String> givenPlaceholders = Map.of("firstName", givenFirstName);

        TfaStartAuthenticationRequest request = givenTfaStartAuthenticationRequest(givenTo, givenApplicationId, givenMessageId, givenFrom, givenPlaceholders);

        Consumer<TfaStartAuthenticationResponse> assertions = tfaStartAuthenticationResponse -> {
            then(tfaStartAuthenticationResponse).isNotNull();
            then(tfaStartAuthenticationResponse.getPinId()).isEqualTo(givenPinId);
            then(tfaStartAuthenticationResponse.getTo()).isEqualTo(givenTo);
            then(tfaStartAuthenticationResponse.getNcStatus()).isEqualTo(givenNcStatus);
            then(tfaStartAuthenticationResponse.getSmsStatus()).isEqualTo(givenSmsStatus);
            then(tfaStartAuthenticationResponse.getCallStatus()).isNull();
        };

        var call = tfaApi.sendTfaPinCodeOverSms(request).ncNeeded(false);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldResendTfaPinCodeViaSms() {
        String givenPinId = "9C817C6F8AF3D48F9FE553282AFA2B67";
        String givenTo = "41793026727";
        String givenNcStatus = "NC_DESTINATION_REACHABLE";
        String givenSmsStatus = "MESSAGE_SENT";

        String givenFirstName = "John";

        String givenResponse = String.format(
                "{" +
                "  \"pinId\": \"%s\"," +
                "  \"to\": \"%s\"," +
                "  \"ncStatus\": \"%s\"," +
                "  \"smsStatus\": \"%s\"" +
                "}",
                givenPinId,
                givenTo,
                givenNcStatus,
                givenSmsStatus
        );

        String expectedRequest = String.format(
                "{" +
                "  \"placeholders\": {" +
                "    \"firstName\": \"%s\"" +
                "  }" +
                "}",
                givenFirstName
        );

        setUpSuccessPostRequest(
                PIN_RESEND.replace("{pinId}", givenPinId),
                expectedRequest,
                givenResponse
        );

        TfaApi tfaApi = new TfaApi(getApiClient());

        TfaResendPinRequest request = new TfaResendPinRequest()
                .placeholders(Map.of("firstName", givenFirstName));

        Consumer<TfaStartAuthenticationResponse> assertions = tfaStartAuthenticationResponse -> {
            then(tfaStartAuthenticationResponse).isNotNull();
            then(tfaStartAuthenticationResponse.getPinId()).isEqualTo(givenPinId);
            then(tfaStartAuthenticationResponse.getTo()).isEqualTo(givenTo);
            then(tfaStartAuthenticationResponse.getNcStatus()).isEqualTo(givenNcStatus);
            then(tfaStartAuthenticationResponse.getSmsStatus()).isEqualTo(givenSmsStatus);
            then(tfaStartAuthenticationResponse.getCallStatus()).isNull();
        };

        var call = tfaApi.resendTfaPinCodeOverSms(givenPinId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendTfaPinCodeViaVoice() {
        String givenPinId = "9C817C6F8AF3D48F9FE553282AFA2B67";
        String givenTo = "41793026727";
        String givenCallStatus = "PENDING_ACCEPTED";

        String givenApplicationId = "1234567";
        String givenMessageId = "7654321";
        String givenFrom = "Sender 1";
        String givenFirstName = "John";

        String givenResponse = String.format(
                "{" +
                "  \"pinId\": \"%s\"," +
                "  \"to\": \"%s\"," +
                "  \"callStatus\": \"%s\"" +
                "}",
                givenPinId,
                givenTo,
                givenCallStatus
        );

        String expectedRequest = String.format(
                "{" +
                "  \"applicationId\": \"%s\"," +
                "  \"messageId\": \"%s\"," +
                "  \"from\": \"%s\"," +
                "  \"to\": \"%s\"," +
                "  \"placeholders\": {" +
                "    \"firstName\": \"%s\"" +
                "  }" +
                "}",
                givenApplicationId,
                givenMessageId,
                givenFrom,
                givenTo,
                givenFirstName
        );

        setUpSuccessPostRequest(PIN_VIA_VOICE, expectedRequest, givenResponse);

        TfaApi tfaApi = new TfaApi(getApiClient());

        Map<String, String> givenPlaceholders = Map.of("firstName", givenFirstName);

        TfaStartAuthenticationRequest request = givenTfaStartAuthenticationRequest(givenTo, givenApplicationId, givenMessageId, givenFrom, givenPlaceholders);

        Consumer<TfaStartAuthenticationResponse> assertions = tfaStartAuthenticationResponse -> {
            then(tfaStartAuthenticationResponse).isNotNull();
            then(tfaStartAuthenticationResponse.getPinId()).isEqualTo(givenPinId);
            then(tfaStartAuthenticationResponse.getTo()).isEqualTo(givenTo);
            then(tfaStartAuthenticationResponse.getCallStatus()).isEqualTo(givenCallStatus);
            then(tfaStartAuthenticationResponse.getNcStatus()).isNull();
            then(tfaStartAuthenticationResponse.getSmsStatus()).isNull();
        };

        var call = tfaApi.sendTfaPinCodeOverVoice(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);

    }

    @Test
    void shouldResendTfaPinCodeViaVoice() {
        String givenPinId = "9C817C6F8AF3D48F9FE553282AFA2B68";
        String givenTo = "41793026726";
        String givenNcStatus = "NC_DESTINATION_REACHABLE";
        String givenSmsStatus = "MESSAGE_SENT";

        String givenFirstName = "Doe";

        String givenResponse = String.format(
                "{" +
                "  \"pinId\": \"%s\"," +
                "  \"to\": \"%s\"," +
                "  \"ncStatus\": \"%s\"," +
                "  \"smsStatus\": \"%s\"" +
                "}",
                givenPinId,
                givenTo,
                givenNcStatus,
                givenSmsStatus
        );

        String expectedRequest = String.format(
                "{" +
                "  \"placeholders\": {" +
                "    \"firstName\": \"%s\"" +
                "  }" +
                "}",
                givenFirstName
        );

        setUpSuccessPostRequest(
                PIN_RESEND_VIA_VOICE.replace("{pinId}", givenPinId),
                expectedRequest,
                givenResponse
        );

        TfaApi tfaApi = new TfaApi(getApiClient());

        TfaResendPinRequest request = new TfaResendPinRequest()
                .placeholders(Map.of("firstName", givenFirstName));

        Consumer<TfaStartAuthenticationResponse> assertions = tfaStartAuthenticationResponse -> {
            then(tfaStartAuthenticationResponse).isNotNull();
            then(tfaStartAuthenticationResponse.getPinId()).isEqualTo(givenPinId);
            then(tfaStartAuthenticationResponse.getTo()).isEqualTo(givenTo);
            then(tfaStartAuthenticationResponse.getNcStatus()).isEqualTo(givenNcStatus);
            then(tfaStartAuthenticationResponse.getSmsStatus()).isEqualTo(givenSmsStatus);
            then(tfaStartAuthenticationResponse.getCallStatus()).isNull();
        };

        var call = tfaApi.resendTfaPinCodeOverVoice(givenPinId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldVerifyTfaCall() {
        String givenPin = "1598";

        String givenPinId = "9C817C6F8AF3D48F9FE553282AFA2B68";
        String givenMsisdn = "41793026726";
        boolean givenVerified = true;
        int givenAttemptsRemaining = 0;

        String givenResponse = String.format(
                "{" +
                "  \"pinId\": \"%s\"," +
                "  \"msisdn\": \"%s\"," +
                "  \"verified\": %b," +
                "  \"attemptsRemaining\": %d" +
                "}",
                givenPinId,
                givenMsisdn,
                givenVerified,
                givenAttemptsRemaining
        );

        String expectedRequest = String.format(
                "{" +
                "  \"pin\": \"%s\"" +
                "}",
                givenPin
        );

        setUpSuccessPostRequest(
                PIN_VERIFY.replace("{pinId}", givenPinId),
                expectedRequest,
                givenResponse
        );

        TfaApi tfaApi = new TfaApi(getApiClient());

        TfaVerifyPinRequest request = new TfaVerifyPinRequest()
                .pin(givenPin);

        Consumer<TfaVerifyPinResponse> assertions = tfaVerifyPinResponse -> {
            then(tfaVerifyPinResponse).isNotNull();
            then(tfaVerifyPinResponse.getPinId()).isEqualTo(givenPinId);
            then(tfaVerifyPinResponse.getMsisdn()).isEqualTo(givenMsisdn);
            then(tfaVerifyPinResponse.getVerified()).isEqualTo(givenVerified);
            then(tfaVerifyPinResponse.getAttemptsRemaining()).isEqualTo(givenAttemptsRemaining);
        };

        var call = tfaApi.verifyTfaPhoneNumber(givenPinId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetTfaVerificationStatus() {
        String givenApplicationId = "16A8B5FE2BCD6CA716A2D780CB3F3390";

        String givenMsisdn = "41793026726";
        boolean givenVerified1 = true;
        Long givenVerifiedAt1 = 1418364366L;
        Long givenSentAt1 = 1418364246L;

        boolean givenVerified2 = false;
        Long givenVerifiedAt2 = 1418364226L;
        Long givenSentAt2 = 1418333246L;

        String givenResponse = String.format(
                "{" +
                "  \"verifications\": [" +
                "    {" +
                "      \"msisdn\": \"%s\"," +
                "      \"verified\": %b," +
                "      \"verifiedAt\": %d," +
                "      \"sentAt\": %d" +
                "    }," +
                "    {" +
                "      \"msisdn\": \"%s\"," +
                "      \"verified\": %b," +
                "      \"verifiedAt\": %d," +
                "      \"sentAt\": %d" +
                "    }" +
                "  ]" +
                "}",
                givenMsisdn,
                givenVerified1,
                givenVerifiedAt1,
                givenSentAt1,

                givenMsisdn,
                givenVerified2,
                givenVerifiedAt2,
                givenSentAt2
        );

        setUpSuccessGetRequest(
                APPLICATION_VERIFICATIONS.replace("{appId}", givenApplicationId),
                Map.of(),
                givenResponse
        );

        TfaApi tfaApi = new TfaApi(getApiClient());

        Consumer<TfaVerificationResponse> assertions = tfaVerificationResponse -> {
            then(tfaVerificationResponse).isNotNull();
            then(tfaVerificationResponse.getVerifications()).isNotNull();
            then(tfaVerificationResponse.getVerifications().size()).isEqualTo(2);

            TfaVerification tfaVerification1 = tfaVerificationResponse.getVerifications().get(0);
            then(tfaVerification1.getMsisdn()).isEqualTo(givenMsisdn);
            then(tfaVerification1.getVerified()).isEqualTo(givenVerified1);
            then(tfaVerification1.getVerifiedAt()).isEqualTo(givenVerifiedAt1);
            then(tfaVerification1.getSentAt()).isEqualTo(givenSentAt1);

            TfaVerification tfaVerification2 = tfaVerificationResponse.getVerifications().get(1);
            then(tfaVerification2.getMsisdn()).isEqualTo(givenMsisdn);
            then(tfaVerification2.getVerified()).isEqualTo(givenVerified2);
            then(tfaVerification2.getVerifiedAt()).isEqualTo(givenVerifiedAt2);
            then(tfaVerification2.getSentAt()).isEqualTo(givenSentAt2);
        };

        var call = tfaApi.getTfaVerificationStatus(givenMsisdn, givenApplicationId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateTfaEmailMessageTemplate() {
        String givenMessageId = "9C815F8AF3328";
        String givenApplicationId = "HJ675435E3A6EA43432G5F37A635KJ8B";
        Integer givenPinLength = 4;
        TfaPinType givenPinType = TfaPinType.NUMERIC;
        String givenFrom = "company@example.com";
        Long givenEmailTemplateId = 1234L;

        String givenAppId = "0933F3BC087D2A617AC6DCB2EF5B8A61";

        String givenResponse = String.format("{\n" +
                                             "  \"messageId\": \"%s\",\n" +
                                             "  \"applicationId\": \"%s\",\n" +
                                             "  \"pinLength\": %d,\n" +
                                             "  \"pinType\": \"%s\",\n" +
                                             "  \"from\": \"%s\",\n" +
                                             "  \"emailTemplateId\": %d\n" +
                                             "}\n",
                                             givenMessageId,
                                             givenApplicationId,
                                             givenPinLength,
                                             givenPinType.getValue(),
                                             givenFrom,
                                             givenEmailTemplateId);

        String expectedPinType = "NUMERIC";
        Integer expectedPinLength = 4;
        String expectedFrom = "company@example.com";
        Long expectedEmailTemplateId = 1234L;

        String expectedRequest = String.format("{\n" +
                                               "  \"pinType\": \"%s\",\n" +
                                               "  \"pinLength\": %d,\n" +
                                               "  \"from\": \"%s\",\n" +
                                               "  \"emailTemplateId\": %d\n" +
                                               "}",
                                               expectedPinType,
                                               expectedPinLength,
                                               expectedFrom,
                                               expectedEmailTemplateId
        );

        setUpPostRequest(APPLICATION_EMAIL_MESSAGES.replace("{appId}", givenAppId),
                         expectedRequest,
                         givenResponse,
                         200);

        TfaApi tfaApi = new TfaApi(getApiClient());
        var tfaCreateEmailMessageRequest = new TfaCreateEmailMessageRequest()
                .pinType(TfaPinType.valueOf(expectedPinType))
                .pinLength(expectedPinLength)
                .from(expectedFrom)
                .emailTemplateId(expectedEmailTemplateId);

        Consumer<TfaEmailMessage> assertions = tfaEmailMessage -> {
            then(tfaEmailMessage).isNotNull();
            then(tfaEmailMessage.getMessageId()).isEqualTo(givenMessageId);
            then(tfaEmailMessage.getApplicationId()).isEqualTo(givenApplicationId);
            then(tfaEmailMessage.getPinLength()).isEqualTo(givenPinLength);
            then(tfaEmailMessage.getPinType()).isEqualTo(givenPinType);
            then(tfaEmailMessage.getFrom()).isEqualTo(givenFrom);
            then(tfaEmailMessage.getEmailTemplateId()).isEqualTo(givenEmailTemplateId);
        };

        var call = tfaApi.createTfaEmailMessageTemplate(givenAppId, tfaCreateEmailMessageRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateTfaEmailMessageTemplate() {
        String givenMessageId = "9C815F8AF3328";
        String givenApplicationId = "HJ675435E3A6EA43432G5F37A635KJ8B";
        Integer givenPinLength = 6;
        TfaPinType givenPinType = TfaPinType.ALPHANUMERIC;
        String givenFrom = "company@example.com";
        Long givenEmailTemplateId = 1234L;

        String givenAppId = "0933F3BC087D2A617AC6DCB2EF5B8A61";
        String givenMsgId = "16A8B5FE2BCD6CA716A2D780CB3F3390";

        String givenResponse = String.format("{\n" +
                                             "  \"messageId\": \"%s\",\n" +
                                             "  \"applicationId\": \"%s\",\n" +
                                             "  \"pinLength\": %d,\n" +
                                             "  \"pinType\": \"%s\",\n" +
                                             "  \"from\": \"%s\",\n" +
                                             "  \"emailTemplateId\": %d\n" +
                                             "}\n",
                                             givenMessageId,
                                             givenApplicationId,
                                             givenPinLength,
                                             givenPinType.getValue(),
                                             givenFrom,
                                             givenEmailTemplateId);

        String expectedPinType = "ALPHANUMERIC";
        Integer expectedPinLength = 6;
        String expectedFrom = "company@example.com";
        Long expectedEmailTemplateId = 1234L;

        String expectedRequest = String.format("{\n" +
                                               "  \"pinType\": \"%s\",\n" +
                                               "  \"pinLength\": %d,\n" +
                                               "  \"from\": \"%s\",\n" +
                                               "  \"emailTemplateId\": %d\n" +
                                               "}",
                                               expectedPinType,
                                               expectedPinLength,
                                               expectedFrom,
                                               expectedEmailTemplateId
        );

        setUpPutRequest(APPLICATION_EMAIL_MESSAGE.replace("{appId}", givenAppId).replace("{msgId}", givenMsgId),
                        Map.of(),
                        expectedRequest,
                        givenResponse,
                        200);

        TfaApi tfaApi = new TfaApi(getApiClient());
        var tfaUpdateEmailMessageRequest = new TfaUpdateEmailMessageRequest()
                .pinType(TfaPinType.valueOf(expectedPinType))
                .pinLength(expectedPinLength)
                .from(expectedFrom)
                .emailTemplateId(expectedEmailTemplateId);

        Consumer<TfaEmailMessage> assertions = tfaEmailMessage -> {
            then(tfaEmailMessage).isNotNull();
            then(tfaEmailMessage.getMessageId()).isEqualTo(givenMessageId);
            then(tfaEmailMessage.getApplicationId()).isEqualTo(givenApplicationId);
            then(tfaEmailMessage.getPinLength()).isEqualTo(givenPinLength);
            then(tfaEmailMessage.getPinType()).isEqualTo(givenPinType);
            then(tfaEmailMessage.getFrom()).isEqualTo(givenFrom);
            then(tfaEmailMessage.getEmailTemplateId()).isEqualTo(givenEmailTemplateId);
        };

        var call = tfaApi.updateTfaEmailMessageTemplate(givenAppId, givenMsgId, tfaUpdateEmailMessageRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendTfaPinCodeOverEmail() {
        String givenPinId = "9C817C6F8AF3D48F9FE553282AFA2B67";
        String givenTo = "john.smith@example.com";
        String givenName = "PENDING_ACCEPTED";
        String givenDescription = "Message accepted, pending for delivery.";
        String givenResponse = String.format("{\n" +
                                             "  \"pinId\": \"%s\",\n" +
                                             "  \"to\": \"%s\",\n" +
                                             "  \"emailStatus\": {\n" +
                                             "    \"name\": \"%s\",\n" +
                                             "    \"description\": \"%s\"\n" +
                                             "  }\n" +
                                             "}\n",
                                             givenPinId,
                                             givenTo,
                                             givenName,
                                             givenDescription);

        String expectedApplicationId = "1234567";
        String expectedMessageId = "7654321";
        String expectedFrom = "jane.smith@example.com";
        String expectedTo = "john.smith@example.com";
        String expectedFirstName = "John";
        String expectedRequest = String.format("{\n" +
                                               "  \"applicationId\": \"%s\",\n" +
                                               "  \"messageId\": \"%s\",\n" +
                                               "  \"from\": \"%s\",\n" +
                                               "  \"to\": \"%s\",\n" +
                                               "  \"placeholders\": {\n" +
                                               "    \"firstName\": \"%s\"\n" +
                                               "  }\n" +
                                               "}\n",
                                               expectedApplicationId,
                                               expectedMessageId,
                                               expectedFrom,
                                               expectedTo,
                                               expectedFirstName
        );

        setUpPostRequest(PIN_EMAIL_SEND,
                         expectedRequest,
                         givenResponse,
                         200);

        TfaApi tfaApi = new TfaApi(getApiClient());
        var tfaStartEmailAuthenticationRequest = new TfaStartEmailAuthenticationRequest()
                .applicationId(expectedApplicationId)
                .messageId(expectedMessageId)
                .from(expectedFrom)
                .to(expectedTo)
                .placeholders(Map.of(
                       "firstName", "John"
                ));

        Consumer<TfaStartEmailAuthenticationResponse> assertions = tfaStartEmailAuthenticationResponse -> {
            then(tfaStartEmailAuthenticationResponse).isNotNull();
            then(tfaStartEmailAuthenticationResponse.getPinId()).isEqualTo(givenPinId);
            then(tfaStartEmailAuthenticationResponse.getTo()).isEqualTo(givenTo);
            then(tfaStartEmailAuthenticationResponse.getEmailStatus()).isNotNull();
            var tfaEmailStatus = tfaStartEmailAuthenticationResponse.getEmailStatus();
            then(tfaEmailStatus.getName()).isEqualTo(givenName);
            then(tfaEmailStatus.getDescription()).isEqualTo(givenDescription);
        };

        var call = tfaApi.send2faPinCodeOverEmail(tfaStartEmailAuthenticationRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldResendTfaPinCodeOverEmail() {
        String givenPinId = "9C817C6F8AF3D48F9FE553282AFA2B67";
        String givenTo = "john.smith@example.com";
        String givenName = "PENDING_ACCEPTED";
        String givenDescription = "Message accepted, pending for delivery.";

        String sentPinId = "0933F3BC087D2A617AC6DCB2EF5B8A61";

        String givenResponse = String.format("{\n" +
                                             "  \"pinId\": \"%s\",\n" +
                                             "  \"to\": \"%s\",\n" +
                                             "  \"emailStatus\": {\n" +
                                             "    \"name\": \"%s\",\n" +
                                             "    \"description\": \"%s\"\n" +
                                             "  }\n" +
                                             "}\n",
                                             givenPinId,
                                             givenTo,
                                             givenName,
                                             givenDescription);

        String expectedFirstName = "John";
        String expectedRequest = String.format("{\n" +
                                               "  \"placeholders\": {\n" +
                                               "    \"firstName\": \"%s\"\n" +
                                               "  }\n" +
                                               "}\n",
                                               expectedFirstName
        );

        setUpPostRequest(PIN_EMAIL_RESEND.replace("{pinId}", sentPinId),
                         expectedRequest,
                         givenResponse,
                         200);

        TfaApi tfaApi = new TfaApi(getApiClient());
        var tfaStartEmailAuthenticationRequest = new TfaResendPinRequest()
                .placeholders(Map.of(
                        "firstName", "John"
                ));

        Consumer<TfaStartEmailAuthenticationResponse> assertions = tfaStartEmailAuthenticationResponse -> {
            then(tfaStartEmailAuthenticationResponse).isNotNull();
            then(tfaStartEmailAuthenticationResponse.getPinId()).isEqualTo(givenPinId);
            then(tfaStartEmailAuthenticationResponse.getTo()).isEqualTo(givenTo);
            then(tfaStartEmailAuthenticationResponse.getEmailStatus()).isNotNull();
            var tfaEmailStatus = tfaStartEmailAuthenticationResponse.getEmailStatus();
            then(tfaEmailStatus.getName()).isEqualTo(givenName);
            then(tfaEmailStatus.getDescription()).isEqualTo(givenDescription);
        };

        var call = tfaApi.resend2faPinCodeOverEmail(sentPinId, tfaStartEmailAuthenticationRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    private TfaApplicationConfiguration givenTfaApplicationConfiguration(
            int givenPinAttempts,
            boolean givenAllowMultiplePinVerifications,
            String givenPinTimeToLive,
            String givenVerifyPinLimit,
            String givenSendPinPerApplicationLimit,
            String givenSendPinPerPhoneNumberLimit) {

        return new TfaApplicationConfiguration()
                .pinAttempts(givenPinAttempts)
                .pinTimeToLive(givenPinTimeToLive)
                .allowMultiplePinVerifications(givenAllowMultiplePinVerifications)
                .sendPinPerApplicationLimit(givenSendPinPerApplicationLimit)
                .sendPinPerPhoneNumberLimit(givenSendPinPerPhoneNumberLimit)
                .verifyPinLimit(givenVerifyPinLimit);
    }

    private TfaApplicationRequest givenTfaApplicationRequest(String givenName,
                                                             boolean givenEnabled,
                                                             TfaApplicationConfiguration givenConfiguration) {
        return new TfaApplicationRequest()
                .name(givenName)
                ._configuration(givenConfiguration)
                .enabled(givenEnabled);
    }

    private TfaStartAuthenticationRequest givenTfaStartAuthenticationRequest(String givenTo,
                                                                             String givenApplicationId,
                                                                             String givenMessageId,
                                                                             String givenFrom, Map<String, String> givenPlaceholders) {
        return new TfaStartAuthenticationRequest()
                .applicationId(givenApplicationId)
                .messageId(givenMessageId)
                .from(givenFrom)
                .to(givenTo)
                .placeholders(givenPlaceholders);
    }
}
