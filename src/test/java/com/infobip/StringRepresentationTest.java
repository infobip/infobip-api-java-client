package com.infobip;

import static org.assertj.core.api.BDDAssertions.then;

import com.infobip.model.*;
import java.util.List;
import org.junit.jupiter.api.Test;

class StringRepresentationTest {

    @Test
    void shouldGenerateProperSmsTextualMessageRepresentation() {
        // given
        SmsRequest request = new SmsRequest()
                .messages(List.of(new SmsMessage()
                        .sender("InfoSMS")
                        .destinations(List.of(new SmsDestination().to("385991112222")))
                        .content(new SmsTextContent().text("This is a sample message"))));
        // when
        String representation = request.toString();

        // then
        then(representation)
                .isEqualToIgnoringNewLines("class SmsRequest {\n" + "    messages: [class SmsMessage {\n"
                        + "        sender: InfoSMS\n"
                        + "        destinations: [class SmsDestination {\n"
                        + "            to: 385991112222\n"
                        + "            messageId: null\n"
                        + "            networkId: null\n"
                        + "        }]\n"
                        + "        content: class SmsTextContent {\n"
                        + "            text: This is a sample message\n"
                        + "            transliteration: null\n"
                        + "            language: null\n"
                        + "        }\n"
                        + "        options: null\n"
                        + "        webhooks: null\n"
                        + "    }]\n"
                        + "    options: null\n"
                        + "}");
    }

    @Test
    void shouldGenerateProperWhatsAppContentRepresentation() {
        // given
        WhatsAppTemplateContent content = new WhatsAppTemplateContent()
                .language("en")
                .templateName("back_in_stock")
                .templateData(new WhatsAppTemplateDataContent()
                        .header(new WhatsAppTemplateImageHeaderContent()
                                .mediaUrl("https://api.infobip.com/ott/1/media/infobipLogo"))
                        .body(new WhatsAppTemplateBodyContent()
                                .addPlaceholdersItem("<PUT YOUR NAME>")
                                .addPlaceholdersItem("<PUT THE ITEM NAME"))
                        .addButtonsItem(new WhatsAppTemplateQuickReplyButtonContent().parameter("yes"))
                        .carousel(new WhatsAppTemplateCarouselContent()
                                .addCardsItem(new WhatsAppTemplateCardContent()
                                        .header(new WhatsAppTemplateImageHeaderContent().mediaUrl("mediaurllink"))
                                        .body(new WhatsAppTemplateBodyContent().placeholders(List.of("placeholders")))
                                        .buttons(List.of(
                                                new WhatsAppTemplateUrlButtonContent().parameter("parameter"))))));

        // when
        String representation = content.toString();

        // then
        then(representation)
                .isEqualToIgnoringNewLines("class WhatsAppTemplateContent {\n" + "    templateName: back_in_stock\n"
                        + "    templateData: class WhatsAppTemplateDataContent {\n"
                        + "        body: class WhatsAppTemplateBodyContent {\n"
                        + "            placeholders: [<PUT YOUR NAME>, <PUT THE ITEM NAME]\n"
                        + "        }\n"
                        + "        header: class WhatsAppTemplateImageHeaderContent {\n"
                        + "            class WhatsAppTemplateHeaderContent {\n"
                        + "                type: IMAGE\n"
                        + "            }\n"
                        + "            mediaUrl: https://api.infobip.com/ott/1/media/infobipLogo\n"
                        + "        }\n"
                        + "        buttons: [class WhatsAppTemplateQuickReplyButtonContent {\n"
                        + "            class WhatsAppTemplateButtonContent {\n"
                        + "                type: QUICK_REPLY\n"
                        + "            }\n"
                        + "            parameter: yes\n"
                        + "        }]\n"
                        + "        carousel: class WhatsAppTemplateCarouselContent {\n"
                        + "            cards: [class WhatsAppTemplateCardContent {\n"
                        + "                header: class WhatsAppTemplateImageHeaderContent {\n"
                        + "                    class WhatsAppTemplateHeaderContent {\n"
                        + "                        type: IMAGE\n"
                        + "                    }\n"
                        + "                    mediaUrl: mediaurllink\n"
                        + "                }\n"
                        + "                body: class WhatsAppTemplateBodyContent {\n"
                        + "                    placeholders: [placeholders]\n"
                        + "                }\n"
                        + "                buttons: [class WhatsAppTemplateUrlButtonContent {\n"
                        + "                    class WhatsAppTemplateButtonContent {\n"
                        + "                        type: URL\n"
                        + "                    }\n"
                        + "                    parameter: parameter\n"
                        + "                }]\n"
                        + "            }]\n"
                        + "        }\n"
                        + "        limitedTimeOffer: null\n"
                        + "    }\n"
                        + "    language: en\n"
                        + "}");
    }
}
