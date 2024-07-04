package com.infobip;

import com.infobip.model.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;

class StringRepresentationTest {

    @Test
    void shouldGenerateProperSmsTextualMessageRepresentation() {
        // given
        var givenIncludeSmsCountInResponse = false;

        SmsAdvancedTextualRequest request = new SmsAdvancedTextualRequest()
                .messages(List.of(
                        new SmsTextualMessage()
                                .from("ServiceSMS")
                                .destinations(List.of(new SmsDestination().to("385991112222")))
                                .text("Hello world from Infobip API Client: https://www.infobip.com/docs/sdk.")
                ))
                .urlOptions(new SmsUrlOptions().shortenUrl(true))
                .includeSmsCountInResponse(givenIncludeSmsCountInResponse);

        // when
        String representation = request.toString();

        // then
        then(representation).isEqualToIgnoringNewLines("class SmsAdvancedTextualRequest {\n" +
                                                       "    bulkId: null\n" +
                                                       "    messages: [class SmsTextualMessage {\n" +
                                                       "        callbackData: null\n" +
                                                       "        deliveryTimeWindow: null\n" +
                                                       "        destinations: [class SmsDestination {\n" +
                                                       "            messageId: null\n" +
                                                       "            to: 385991112222\n" +
                                                       "        }]\n" +
                                                       "        flash: null\n" +
                                                       "        from: ServiceSMS\n" +
                                                       "        intermediateReport: null\n" +
                                                       "        language: null\n" +
                                                       "        notifyContentType: null\n" +
                                                       "        notifyUrl: null\n" +
                                                       "        regional: null\n" +
                                                       "        sendAt: null\n" +
                                                       "        text: Hello world from Infobip API Client: https://www.infobip.com/docs/sdk.\n" +
                                                       "        transliteration: null\n" +
                                                       "        validityPeriod: null\n" +
                                                       "        entityId: null\n" +
                                                       "        applicationId: null\n" +
                                                       "    }]\n" +
                                                       "    sendingSpeedLimit: null\n" +
                                                       "    urlOptions: class SmsUrlOptions {\n" +
                                                       "        shortenUrl: true\n" +
                                                       "        trackClicks: null\n" +
                                                       "        trackingUrl: null\n" +
                                                       "        removeProtocol: null\n" +
                                                       "        customDomain: null\n" +
                                                       "    }\n" +
                                                       "    tracking: null\n" +
                                                       "    includeSmsCountInResponse: false\n" +
                                                       "}");
    }

    @Test
    void shouldGenerateProperWhatsAppContentRepresentation() {
        // given
        WhatsAppTemplateContent content = new WhatsAppTemplateContent()
                .language("en")
                .templateName("back_in_stock")
                .templateData(new WhatsAppTemplateDataContent()
                        .header(new WhatsAppTemplateImageHeaderContent()
                                .mediaUrl("https://api.infobip.com/ott/1/media/infobipLogo")
                        ).body(new WhatsAppTemplateBodyContent()
                                .addPlaceholdersItem("<PUT YOUR NAME>")
                                .addPlaceholdersItem("<PUT THE ITEM NAME")
                        ).addButtonsItem(new WhatsAppTemplateQuickReplyButtonContent()
                                .parameter("yes")
                        )
                        .carousel(new WhatsAppTemplateCarouselContent().addCardsItem(
                                new WhatsAppTemplateCardContent()
                                        .header(
                                                new WhatsAppTemplateImageHeaderContent()
                                                        .mediaUrl("mediaurllink")
                                        )
                                        .body(
                                                new WhatsAppTemplateBodyContent()
                                                        .placeholders(List.of(
                                                                "placeholders"
                                                        ))
                                        )
                                        .buttons(List.of(
                                                new WhatsAppTemplateUrlButtonContent()
                                                        .parameter("parameter")
                                        ))
                        ))
                );

        // when
        String representation = content.toString();

        // then
        then(representation).isEqualToIgnoringNewLines("class WhatsAppTemplateContent {\n" +
                                                       "    templateName: back_in_stock\n" +
                                                       "    templateData: class WhatsAppTemplateDataContent {\n" +
                                                       "        body: class WhatsAppTemplateBodyContent {\n" +
                                                       "            placeholders: [<PUT YOUR NAME>, <PUT THE ITEM NAME]\n" +
                                                       "        }\n" +
                                                       "        header: class WhatsAppTemplateImageHeaderContent {\n" +
                                                       "            class WhatsAppTemplateHeaderContent {\n" +
                                                       "                type: IMAGE\n" +
                                                       "            }\n" +
                                                       "            mediaUrl: https://api.infobip.com/ott/1/media/infobipLogo\n" +
                                                       "        }\n" +
                                                       "        buttons: [class WhatsAppTemplateQuickReplyButtonContent {\n" +
                                                       "            class WhatsAppTemplateButtonContent {\n" +
                                                       "                type: QUICK_REPLY\n" +
                                                       "            }\n" +
                                                       "            parameter: yes\n" +
                                                       "        }]\n" +
                                                       "        carousel: class WhatsAppTemplateCarouselContent {\n" +
                                                       "            cards: [class WhatsAppTemplateCardContent {\n" +
                                                       "                header: class WhatsAppTemplateImageHeaderContent {\n" +
                                                       "                    class WhatsAppTemplateHeaderContent {\n" +
                                                       "                        type: IMAGE\n" +
                                                       "                    }\n" +
                                                       "                    mediaUrl: mediaurllink\n" +
                                                       "                }\n" +
                                                       "                body: class WhatsAppTemplateBodyContent {\n" +
                                                       "                    placeholders: [placeholders]\n" +
                                                       "                }\n" +
                                                       "                buttons: [class WhatsAppTemplateUrlButtonContent {\n" +
                                                       "                    class WhatsAppTemplateButtonContent {\n" +
                                                       "                        type: URL\n" +
                                                       "                    }\n" +
                                                       "                    parameter: parameter\n" +
                                                       "                }]\n" +
                                                       "            }]\n" +
                                                       "        }\n" +
                                                       "        limitedTimeOffer: null\n" +
                                                       "    }\n" +
                                                       "    language: en\n" +
                                                       "}");
    }
}
