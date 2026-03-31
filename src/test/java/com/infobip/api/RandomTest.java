package com.infobip.api;

import com.infobip.ApiClient;
import com.infobip.ApiKey;
import com.infobip.BaseUrl;
import com.infobip.model.*;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Test;

public class RandomTest {

    @Test
    public void shouldTest() {

        ApiClient apiClient = ApiClient.forApiKey(
                        ApiKey.from("7f7320dc0368225ef1dc823bf8e00bad-4838936f-bfd6-458b-8229-2d3723e9d9d1"))
                .withBaseUrl(BaseUrl.from("ej69kq.api.infobip.com"))
                .build();

        NumbersApi numbersApi = new NumbersApi(apiClient);

        UUID givenId = UUID.fromString("4d3601ed-c632-4979-ae22-43854ef4ffaf");
        String givenReferenceId = "customer-defined-identifier";
        String givenApplicationId = "app-id";
        String givenEntityId = "entity-id";
        String givenName = "Example Promo";
        String givenNumber = "14232180111";
        UUID givenBrandId = UUID.fromString("a0c63335-f841-4d43-9ef8-e0765a233f29");
        String givenConfirmationMessage =
                "Example promotional-marketing. Msg&data rates may apply. Reply HELP for help, STOP to cancel.";
        String givenCustomerCarePhone = "14232180111";
        String givenCustomerCareEmail = "examples@example.com";
        String givenExampleMessage = "Come in today and get 10% OFF today!";
        String givenHelpMessage =
                "Example promotional-marketing: Help at textsupport@example.com or 18889997777. Msg&data rates may apply. Reply STOP to cancel.";
        Boolean givenLowVolume = false;
        String givenProgramSummary = "A mix of promotional and informational messaging.";
        String givenStopMessage =
                "Example promotional-marketing: You have been unsubscribed, no more messages will be sent.";
        String givenTermsAndConditionsUrl = "https://www.example.com/terms-and-conditions";
        NumbersTenDlcUseCase givenUseCase1 = NumbersTenDlcUseCase.PROMOTIONAL_MARKETING;
        NumbersTenDlcUseCase givenUseCase2 = NumbersTenDlcUseCase.EDUCATION;
        String givenOptInCallToAction =
                "Text MESSAGE to subscribe to recurring promotional marketing alerts. Msg&DataRates may apply. Text HELP for help, STOP to opt out. Terms and PP https://www.example.om/terms-of-service/";
        String givenOptInKeyword = "MESSAGE";
        Boolean givenAgeGated = true;
        Boolean givenDirectLending = false;
        Boolean givenEmbeddedLink = true;
        Boolean givenEmbeddedPhone = false;

        var request = new NumbersTenDlcCampaign()
                .brandId(givenBrandId)
                .numbers(new java.util.LinkedHashSet<>(List.of(givenNumber)))
                .programSummary(givenProgramSummary)
                .confirmationMessage(givenConfirmationMessage)
                .exampleMessages(List.of(givenExampleMessage))
                .helpMessage(givenHelpMessage)
                .stopMessage(givenStopMessage)
                .messageTypes(new java.util.LinkedHashSet<>(List.of(NumbersMessageType.SMS, NumbersMessageType.MMS)))
                .termsAndConditionsUrl(givenTermsAndConditionsUrl)
                .optIns(new NumbersOptIns()
                        .keyword(new NumbersKeywordOptIn()
                                .callToAction(givenOptInCallToAction)
                                .addKeywordsItem(givenOptInKeyword)))
                .ageGated(givenAgeGated)
                .customerCarePhone(givenCustomerCarePhone)
                .lowVolume(givenLowVolume)
                .useCases(new java.util.LinkedHashSet<>(List.of(givenUseCase1, givenUseCase2)))
                .directLending(givenDirectLending)
                .embeddedLink(givenEmbeddedLink)
                .embeddedPhone(givenEmbeddedPhone)
                .customerCareEmail(givenCustomerCareEmail);
        request.referenceId(givenReferenceId);
        request.applicationId(givenApplicationId);
        request.entityId(givenEntityId);
        request.name(givenName);

        NumbersCampaign resp = null;
        try {
            resp = numbersApi.createCampaign(request).execute();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(resp);
    }
}
