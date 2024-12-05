package com.infobip.api;

import static com.infobip.api.util.ResponseStatuses.*;
import static com.infobip.model.WhatsAppLanguage.EN;
import static com.infobip.model.WhatsAppStatus.APPROVED;
import static org.assertj.core.api.BDDAssertions.then;

import com.infobip.JSON;
import com.infobip.model.*;
import java.io.File;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

class WhatsAppApiTest extends ApiTest {

    private static final String MESSAGE_TEMPLATE = "/whatsapp/1/message/template";
    private static final String MESSAGE_TEXT = "/whatsapp/1/message/text";
    private static final String MESSAGE_DOCUMENT = "/whatsapp/1/message/document";
    private static final String MESSAGE_IMAGE = "/whatsapp/1/message/image";
    private static final String MESSAGE_AUDIO = "/whatsapp/1/message/audio";
    private static final String MESSAGE_VIDEO = "/whatsapp/1/message/video";
    private static final String MESSAGE_STICKER = "/whatsapp/1/message/sticker";
    private static final String MESSAGE_LOCATION = "/whatsapp/1/message/location";
    private static final String MESSAGE_CONTACT = "/whatsapp/1/message/contact";
    private static final String MESSAGE_INTERACTIVE_BUTTONS = "/whatsapp/1/message/interactive/buttons";
    private static final String MESSAGE_INTERACTIVE_LIST = "/whatsapp/1/message/interactive/list";
    private static final String MESSAGE_INTERACTIVE_PRODUCT = "/whatsapp/1/message/interactive/product";
    private static final String MESSAGE_INTERACTIVE_MULTI_PRODUCT = "/whatsapp/1/message/interactive/multi-product";
    private static final String MESSAGE_INTERACTIVE_LOCATION_REQUEST =
            "/whatsapp/1/message/interactive/location-request";
    private static final String MESSAGE_INTERACTIVE_ORDER_DETAILS = "/whatsapp/1/message/interactive/order-details";
    private static final String MESSAGE_INTERACTIVE_ORDER_STATUS = "/whatsapp/1/message/interactive/order-status";
    private static final String SENDER_MEDIAS = "/whatsapp/1/senders/{sender}/media";
    private static final String SENDER_MEDIA = "/whatsapp/1/senders/{sender}/media/{mediaId}";
    private static final String SENDER_TEMPLATES = "/whatsapp/2/senders/{sender}/templates";
    private static final String SENDER_TEMPLATE = "/whatsapp/2/senders/{sender}/templates/{templateName}";
    private static final String SENDER_TEMPLATE_ID = "/whatsapp/2/senders/{sender}/templates/{id}";
    private static final String SENDER_MESSAGE_READ = "/whatsapp/1/senders/{sender}/message/{messageId}/read";
    private static final String SENDER_CONTACT_IDENTITY = "/whatsapp/1/{sender}/contacts/{userNumber}/identity";
    private static final String SENDER_QUALITY = "/whatsapp/1/senders/quality";
    private static final String SENDER_BUSINESS_INFO = "/whatsapp/1/senders/{sender}/business-info";
    private static final String SENDER_BUSINESS_LOGO = "/whatsapp/1/senders/{sender}/business-info/logo";
    private static final String ADD_SENDER =
            "/whatsapp/1/embedded-signup/registrations/business-account/{businessAccountId}/senders";
    private static final String SENDER_VERIFICATION =
            "/whatsapp/1/embedded-signup/registrations/senders/{sender}/verification";
    private static final String INDIA_PAYMENT = "/whatsapp/1/senders/{sender}/payments/upi/payu/{paymentId}";
    private static final String BRAZIL_PAYMENT = "/whatsapp/1/senders/{sender}/payments/br/{paymentId}";

    @Test
    void shouldGetWhatsappIdentity() {
        String givenSender = "string";
        String givenUserNumber = "123456789";

        Boolean givenAcknowledged = true;
        String givenHash = "eU2Fdi4EMUw=";
        String givenCreatedAt = "2022-02-04T18:12:26.000+0000";
        OffsetDateTime givenCreatedAtDateTime =
                OffsetDateTime.of(LocalDateTime.of(2022, 2, 4, 18, 12, 26, 0), ZoneOffset.ofHours(0));

        String givenResponse = String.format(
                "{\n" + "  \"acknowledged\": %b,\n" + "  \"hash\": \"%s\",\n" + "  \"createdAt\": \"%s\"\n" + "}\n",
                givenAcknowledged, givenHash, givenCreatedAt);

        setUpSuccessGetRequest(
                SENDER_CONTACT_IDENTITY.replace("{sender}", givenSender).replace("{userNumber}", givenUserNumber),
                Map.of(),
                givenResponse);

        WhatsAppApi api = new WhatsAppApi(getApiClient());

        Consumer<WhatsAppIdentityInfo> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getAcknowledged()).isEqualTo(givenAcknowledged);
            then(response.getHash()).isEqualTo(givenHash);
            then(response.getCreatedAt()).isEqualTo(givenCreatedAtDateTime);
        };

        var call = api.getWhatsAppIdentity(givenSender, givenUserNumber);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldConfirmWhatsappIdentity() {
        String givenSender = "string";
        String givenUserNumber = "123456789";
        String givenHash = "eU2Fdi4EMUw=";
        int givenStatusCode = 204;

        String expectedRequest = String.format("{\n" + "  \"hash\": \"%s\"\n" + "}\n", givenHash);

        setUpNoResponseBodyPutRequest(
                SENDER_CONTACT_IDENTITY.replace("{sender}", givenSender).replace("{userNumber}", givenUserNumber),
                Map.of(),
                expectedRequest,
                givenStatusCode);

        WhatsAppApi api = new WhatsAppApi(getApiClient());

        WhatsAppIdentityConfirmation request = new WhatsAppIdentityConfirmation().hash(givenHash);

        var call = api.confirmWhatsAppIdentity(givenSender, givenUserNumber, request);
        testSuccessfulCallWithNoBody(call::executeAsync, givenStatusCode);
    }

    @Test
    void shouldSendTemplateMessage() {
        String expectedRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": [\n"
                + "              \"Placeholder Value 1\",\n"
                + "              \"Placeholder Value 2\"\n"
                + "            ]\n"
                + "          },\n"
                + "          \"header\": {\n"
                + "              \"type\": \"DOCUMENT\",\n"
                + "              \"mediaUrl\": \"https://example.com/document\",\n"
                + "              \"filename\": \"document.pdf\"\n"
                + "          }\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\"\n"
                + "    }\n"
                + "  ]\n"
                + "}\n";

        setUpPostRequest("/whatsapp/1/message/template", expectedRequest, givenSuccessBulkResponse(), 200);

        Consumer<WhatsAppBulkMessageInfo> assertions = response -> {
            then(response).isNotNull();
            then(response.getBulkId()).isNull();
            WhatsAppSingleMessageInfo messageInfo = response.getMessages().get(0);
            thenResponseIsSuccessful(messageInfo);
        };

        var message = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .callbackData("Callback data")
                .content(new WhatsAppTemplateContent()
                        .language("en_GB")
                        .templateName("template_name")
                        .templateData(new WhatsAppTemplateDataContent()
                                .body(new WhatsAppTemplateBodyContent()
                                        .addPlaceholdersItem("Placeholder Value 1")
                                        .addPlaceholdersItem("Placeholder Value 2"))
                                .header(new WhatsAppTemplateDocumentHeaderContent()
                                        .filename("document.pdf")
                                        .mediaUrl("https://example.com/document"))));
        WhatsAppBulkMessage bulkMessage = new WhatsAppBulkMessage().addMessagesItem(message);

        var sendApi = new WhatsAppApi(getApiClient());

        var call = sendApi.sendWhatsAppTemplateMessage(bulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendTextMessage() {
        String expectedRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"text\": \"Some text with url: https://example.com\",\n"
                + "    \"previewUrl\": true\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\"\n"
                + "}\n";

        setUpPostRequest("/whatsapp/1/message/text", expectedRequest, givenSuccessResponse(), 200);

        var sendApi = new WhatsAppApi(getApiClient());

        var message = new WhatsAppTextMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(new WhatsAppTextContent()
                        .text("Some text with url: https://example.com")
                        .previewUrl(true))
                .callbackData("Callback data");

        testSuccessfulCall(() -> sendApi.sendWhatsAppTextMessage(message).execute(), this::thenResponseIsSuccessful);
    }

    @Test
    void shouldSendDocumentMessage() {
        String expectedRequest = "{\n" + "   \"from\": \"441134960000\",\n"
                + "   \"to\": \"441134960001\",\n"
                + "   \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "   \"content\": {\n"
                + "     \"mediaUrl\": \"https://example.com/document\",\n"
                + "     \"caption\": \"Some document caption\",\n"
                + "     \"filename\": \"filename.pdf\"\n"
                + "   },\n"
                + "   \"callbackData\": \"Callback data\"\n"
                + " }\n";

        setUpPostRequest("/whatsapp/1/message/document", expectedRequest, givenSuccessResponse(), 200);

        var sendApi = new WhatsAppApi(getApiClient());

        var message = new WhatsAppDocumentMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(new WhatsAppDocumentContent()
                        .mediaUrl("https://example.com/document")
                        .caption("Some document caption")
                        .filename("filename.pdf"))
                .callbackData("Callback data");

        testSuccessfulCall(
                () -> sendApi.sendWhatsAppDocumentMessage(message).execute(), this::thenResponseIsSuccessful);
    }

    @Test
    void shouldSendImageMessage() {
        String expectedRequest = "{\n" + "    \"from\": \"441134960000\",\n"
                + "    \"to\": \"441134960001\",\n"
                + "    \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "    \"content\": {\n"
                + "      \"mediaUrl\": \"https://example.com/image\",\n"
                + "      \"caption\": \"Some image caption\"\n"
                + "    },\n"
                + "    \"callbackData\": \"Callback data\"\n"
                + "  }\n";

        setUpPostRequest("/whatsapp/1/message/image", expectedRequest, givenSuccessResponse(), 200);

        var sendApi = new WhatsAppApi(getApiClient());

        var message = new WhatsAppImageMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(new WhatsAppImageContent()
                        .mediaUrl("https://example.com/image")
                        .caption("Some image caption"))
                .callbackData("Callback data");

        testSuccessfulCall(() -> sendApi.sendWhatsAppImageMessage(message).execute(), this::thenResponseIsSuccessful);
    }

    @Test
    void shouldSendAudioMessage() {
        String expectedRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"mediaUrl\": \"https://example.com/audio\"\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\"\n"
                + "}\n";

        setUpPostRequest("/whatsapp/1/message/audio", expectedRequest, givenSuccessResponse(), 200);

        var sendApi = new WhatsAppApi(getApiClient());

        var message = new WhatsAppAudioMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(new WhatsAppAudioContent().mediaUrl("https://example.com/audio"))
                .callbackData("Callback data");

        testSuccessfulCall(() -> sendApi.sendWhatsAppAudioMessage(message).execute(), this::thenResponseIsSuccessful);
    }

    @Test
    void shouldSendVideoMessage() {
        String expectedRequest = "{\n" + "   \"from\": \"441134960000\",\n"
                + "   \"to\": \"441134960001\",\n"
                + "   \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "   \"content\": {\n"
                + "     \"mediaUrl\": \"https://example.com/video\",\n"
                + "     \"caption\": \"Some video caption\"\n"
                + "   },\n"
                + "   \"callbackData\": \"Callback data\"\n"
                + "}\n";

        setUpPostRequest("/whatsapp/1/message/video", expectedRequest, givenSuccessResponse(), 200);

        var sendApi = new WhatsAppApi(getApiClient());

        var message = new WhatsAppVideoMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(new WhatsAppVideoContent()
                        .mediaUrl("https://example.com/video")
                        .caption("Some video caption"))
                .callbackData("Callback data");

        testSuccessfulCall(() -> sendApi.sendWhatsAppVideoMessage(message).execute(), this::thenResponseIsSuccessful);
    }

    @Test
    void shouldSendStickerMessage() {
        String expectedRequest = "\n" + "{\n"
                + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"mediaUrl\": \"https://example.com/sticker\"\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\"\n"
                + "}\n";

        setUpPostRequest("/whatsapp/1/message/sticker", expectedRequest, givenSuccessResponse(), 200);

        var sendApi = new WhatsAppApi(getApiClient());

        var message = new WhatsAppStickerMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(new WhatsAppStickerContent().mediaUrl("https://example.com/sticker"))
                .callbackData("Callback data");

        testSuccessfulCall(() -> sendApi.sendWhatsAppStickerMessage(message).execute(), this::thenResponseIsSuccessful);
    }

    @Test
    void shouldSendLocationMessage() {
        String expectedRequest = "{\n" + "   \"from\": \"441134960000\",\n"
                + "   \"to\": \"441134960001\",\n"
                + "   \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "   \"content\": {\n"
                + "     \"latitude\": 44.9526862,\n"
                + "     \"longitude\": 13.8545217\n"
                + "   },\n"
                + "   \"callbackData\": \"Callback data\"\n"
                + "}\n";

        setUpPostRequest("/whatsapp/1/message/location", expectedRequest, givenSuccessResponse(), 200);

        var sendApi = new WhatsAppApi(getApiClient());

        var message = new WhatsAppLocationMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(new WhatsAppLocationContent().latitude(44.9526862).longitude(13.8545217))
                .callbackData("Callback data");

        testSuccessfulCall(
                () -> sendApi.sendWhatsAppLocationMessage(message).execute(), this::thenResponseIsSuccessful);
    }

    @Test
    void shouldSendContactMessage() {
        String expectedRequest = "{\n" + "   \"from\": \"441134960000\",\n"
                + "   \"to\": \"441134960001\",\n"
                + "   \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "   \"content\": {\n"
                + "     \"contacts\": [\n"
                + "       {\n"
                + "         \"addresses\": [\n"
                + "           {\n"
                + "             \"street\": \"Istarska\",\n"
                + "             \"city\": \"Vodnjan\",\n"
                + "             \"zip\": \"52215\",\n"
                + "             \"country\": \"Croatia\",\n"
                + "             \"countryCode\": \"HR\",\n"
                + "             \"type\": \"WORK\"\n"
                + "           }\n"
                + "         ],\n"
                + "         \"birthday\": \"2010-01-01\",\n"
                + "         \"emails\": [\n"
                + "           {\n"
                + "             \"email\": \"John.Smith@example.com\",\n"
                + "             \"type\": \"WORK\"\n"
                + "           }\n"
                + "         ],\n"
                + "         \"name\": {\n"
                + "           \"firstName\": \"John\",\n"
                + "           \"lastName\": \"Smith\",\n"
                + "           \"middleName\": \"B\",\n"
                + "           \"namePrefix\": \"Mr.\",\n"
                + "           \"formattedName\": \"Mr. John Smith\"\n"
                + "         },\n"
                + "         \"org\": {\n"
                + "           \"company\": \"Company Name\",\n"
                + "           \"department\": \"Department\",\n"
                + "           \"title\": \"Director\"\n"
                + "         },\n"
                + "         \"phones\": [\n"
                + "           {\n"
                + "             \"phone\": \"+441134960019\",\n"
                + "             \"type\": \"HOME\",\n"
                + "             \"waId\": \"441134960019\"\n"
                + "           }\n"
                + "         ],\n"
                + "         \"urls\": [\n"
                + "           {\n"
                + "             \"url\": \"https://example.com/John.Smith\",\n"
                + "             \"type\": \"WORK\"\n"
                + "           }\n"
                + "         ]\n"
                + "       }\n"
                + "     ]\n"
                + "   },\n"
                + "   \"callbackData\": \"Callback data\"\n"
                + " }\n";

        setUpPostRequest("/whatsapp/1/message/contact", expectedRequest, givenSuccessResponse(), 200);

        var sendApi = new WhatsAppApi(getApiClient());

        var message = new WhatsAppContactsMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(new WhatsAppContactsContent()
                        .addContactsItem(new WhatsAppContactContent()
                                .addAddressesItem(new WhatsAppAddressContent()
                                        .city("Vodnjan")
                                        .street("Istarska")
                                        .zip("52215")
                                        .country("Croatia")
                                        .countryCode("HR")
                                        .type(WhatsAppAddressType.WORK))
                                .birthday("2010-01-01")
                                .addEmailsItem(new WhatsAppEmailContent()
                                        .email("John.Smith@example.com")
                                        .type(WhatsAppEmailType.WORK))
                                .name(new WhatsAppNameContent()
                                        .firstName("John")
                                        .lastName("Smith")
                                        .middleName("B")
                                        .namePrefix("Mr.")
                                        .formattedName("Mr. John Smith"))
                                .org(new WhatsAppOrganizationContent()
                                        .company("Company Name")
                                        .department("Department")
                                        .title("Director"))
                                .addPhonesItem(new WhatsAppPhoneContent()
                                        .phone("+441134960019")
                                        .type(WhatsAppPhoneType.HOME)
                                        .waId("441134960019"))
                                .addUrlsItem(new WhatsAppUrlContent()
                                        .url("https://example.com/John.Smith")
                                        .type(WhatsAppUrlType.WORK))))
                .callbackData("Callback data");

        testSuccessfulCall(() -> sendApi.sendWhatsAppContactMessage(message).execute(), this::thenResponseIsSuccessful);
    }

    @Test
    void shouldSendInteractiveButtonsMessage() {
        String expectedRequest = "{\n" + "    \"from\": \"441134960000\",\n"
                + "    \"to\": \"441134960001\",\n"
                + "    \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "    \"content\": {\n"
                + "      \"body\": {\n"
                + "        \"text\": \"Some text\"\n"
                + "      },\n"
                + "      \"action\": {\n"
                + "        \"buttons\": [\n"
                + "          {\n"
                + "            \"type\": \"REPLY\",\n"
                + "            \"id\": \"1\",\n"
                + "            \"title\": \"Yes\"\n"
                + "          },\n"
                + "          {\n"
                + "            \"type\": \"REPLY\",\n"
                + "            \"id\": \"2\",\n"
                + "            \"title\": \"No\"\n"
                + "          }\n"
                + "        ]\n"
                + "      },\n"
                + "      \"header\": {\n"
                + "        \"type\": \"TEXT\",\n"
                + "        \"text\": \"Header\"\n"
                + "      },\n"
                + "      \"footer\": {\n"
                + "        \"text\": \"Footer\"\n"
                + "      }\n"
                + "    },\n"
                + "    \"callbackData\": \"Callback data\"\n"
                + "}\n";

        setUpPostRequest("/whatsapp/1/message/interactive/buttons", expectedRequest, givenSuccessResponse(), 200);

        var sendApi = new WhatsAppApi(getApiClient());

        var message = new WhatsAppInteractiveButtonsMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(new WhatsAppInteractiveButtonsContent()
                        .body(new WhatsAppInteractiveBodyContent().text("Some text"))
                        .action(new WhatsAppInteractiveButtonsActionContent()
                                .addButtonsItem(new WhatsAppInteractiveReplyButtonContent()
                                        .id("1")
                                        .title("Yes"))
                                .addButtonsItem(new WhatsAppInteractiveReplyButtonContent()
                                        .id("2")
                                        .title("No")))
                        .header(new WhatsAppInteractiveButtonsTextHeaderContent().text("Header"))
                        .footer(new WhatsAppInteractiveFooterContent().text("Footer")))
                .callbackData("Callback data");

        testSuccessfulCall(
                () -> sendApi.sendWhatsAppInteractiveButtonsMessage(message).execute(), this::thenResponseIsSuccessful);
    }

    @Test
    void shouldSendInteractiveListMessage() {
        String expectedRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    },\n"
                + "    \"action\": {\n"
                + "      \"title\": \"Choose one\",\n"
                + "      \"sections\": [\n"
                + "        {\n"
                + "          \"rows\": [\n"
                + "            {\n"
                + "              \"id\": \"1\",\n"
                + "              \"title\": \"row title\"\n"
                + "            }\n"
                + "          ]\n"
                + "        }\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\"\n"
                + "}\n";

        setUpPostRequest("/whatsapp/1/message/interactive/list", expectedRequest, givenSuccessResponse(), 200);

        var sendApi = new WhatsAppApi(getApiClient());

        var message = new WhatsAppInteractiveListMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(new WhatsAppInteractiveListContent()
                        .body(new WhatsAppInteractiveBodyContent().text("Some text"))
                        .action(new WhatsAppInteractiveListActionContent()
                                .title("Choose one")
                                .addSectionsItem(new WhatsAppInteractiveListSectionContent()
                                        .addRowsItem(new WhatsAppInteractiveRowContent()
                                                .id("1")
                                                .title("row title")))))
                .callbackData("Callback data");

        testSuccessfulCall(
                () -> sendApi.sendWhatsAppInteractiveListMessage(message).execute(), this::thenResponseIsSuccessful);
    }

    @Test
    void shouldSendInteractiveProductMessage() {
        String givenFrom = "441134960000";
        String givenTo = "441134960001";
        String givenMessageId = "a28dd97c-1ffb-4fcf-99f1-0b557ed381da";
        String givenCatalogId = "1";
        String givenProductRetailerId = "2";
        String givenCallbackData = "Callback data";
        String givenNotifyUrl = "https://www.example.com/whatsapp";

        String expectedRequest = String.format(
                "{\n" + "  \"from\": \"%s\",\n"
                        + "  \"to\": \"%s\",\n"
                        + "  \"messageId\": \"%s\",\n"
                        + "  \"content\": {\n"
                        + "    \"action\": {\n"
                        + "      \"catalogId\": \"%s\",\n"
                        + "      \"productRetailerId\": \"%s\"\n"
                        + "    }\n"
                        + "  },\n"
                        + "  \"callbackData\": \"%s\",\n"
                        + "  \"notifyUrl\": \"%s\"\n"
                        + "}\n",
                givenFrom,
                givenTo,
                givenMessageId,
                givenCatalogId,
                givenProductRetailerId,
                givenCallbackData,
                givenNotifyUrl);

        setUpSuccessPostRequest("/whatsapp/1/message/interactive/product", expectedRequest, givenSuccessResponse());

        WhatsAppApi api = new WhatsAppApi(getApiClient());

        WhatsAppInteractiveProductMessage request = new WhatsAppInteractiveProductMessage()
                .from(givenFrom)
                .to(givenTo)
                .messageId(givenMessageId)
                .content(new WhatsAppInteractiveProductContent()
                        .action(new WhatsAppInteractiveProductActionContent()
                                .catalogId(givenCatalogId)
                                .productRetailerId(givenProductRetailerId)))
                .callbackData(givenCallbackData)
                .notifyUrl(givenNotifyUrl);

        Consumer<WhatsAppSingleMessageInfo> assertions = (response) -> {
            then(response).isNotNull();
            thenResponseIsSuccessful(response);
        };

        var call = api.sendWhatsAppInteractiveProductMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendInteractiveMultiProductMessage() {
        String givenFrom = "441134960000";
        String givenTo = "441134960001";
        String givenMessageId = "a28dd97c-1ffb-4fcf-99f1-0b557ed381da";
        String givenHeaderType = "TEXT";
        String givenHeaderText = "Header";
        String givenBodyText = "Some text";
        String givenCatalogId = "1";
        String givenTitle = "Title";
        String givenProductRetailerId1 = "1";
        String givenProductRetailerId2 = "2";
        String givenCallbackData = "Callback data";
        String givenNotifyUrl = "https://www.example.com/whatsapp";

        String expectedRequest = String.format(
                "{\n" + "  \"from\": \"%s\",\n"
                        + "  \"to\": \"%s\",\n"
                        + "  \"messageId\": \"%s\",\n"
                        + "  \"content\": {\n"
                        + "    \"header\": {\n"
                        + "      \"type\": \"%s\",\n"
                        + "      \"text\": \"%s\"\n"
                        + "    },\n"
                        + "    \"body\": {\n"
                        + "      \"text\": \"%s\"\n"
                        + "    },\n"
                        + "    \"action\": {\n"
                        + "      \"catalogId\": \"%s\",\n"
                        + "      \"sections\": [\n"
                        + "        {\n"
                        + "          \"title\": \"%s\",\n"
                        + "          \"productRetailerIds\": [\n"
                        + "            \"%s\",\n"
                        + "            \"%s\"\n"
                        + "          ]\n"
                        + "        }\n"
                        + "      ]\n"
                        + "    }\n"
                        + "  },\n"
                        + "  \"callbackData\": \"%s\",\n"
                        + "  \"notifyUrl\": \"%s\"\n"
                        + "}\n",
                givenFrom,
                givenTo,
                givenMessageId,
                givenHeaderType,
                givenHeaderText,
                givenBodyText,
                givenCatalogId,
                givenTitle,
                givenProductRetailerId1,
                givenProductRetailerId2,
                givenCallbackData,
                givenNotifyUrl);

        setUpSuccessPostRequest(
                "/whatsapp/1/message/interactive/multi-product", expectedRequest, givenSuccessResponse());

        WhatsAppApi api = new WhatsAppApi(getApiClient());

        WhatsAppInteractiveMultiProductMessage request = new WhatsAppInteractiveMultiProductMessage()
                .from(givenFrom)
                .to(givenTo)
                .messageId(givenMessageId)
                .content(new WhatsAppInteractiveMultiProductContent()
                        .header(new WhatsAppInteractiveMultiProductTextHeaderContent().text(givenHeaderText))
                        .body(new WhatsAppInteractiveBodyContent().text(givenBodyText))
                        .action(new WhatsAppInteractiveMultiProductActionContent()
                                .catalogId(givenCatalogId)
                                .sections(List.of(new WhatsAppInteractiveMultiProductSectionContent()
                                        .title(givenTitle)
                                        .productRetailerIds(
                                                List.of(givenProductRetailerId1, givenProductRetailerId2))))))
                .callbackData(givenCallbackData)
                .notifyUrl(givenNotifyUrl);

        Consumer<WhatsAppSingleMessageInfo> assertions = (response) -> {
            then(response).isNotNull();
            thenResponseIsSuccessful(response);
        };

        var call = api.sendWhatsAppInteractiveMultiProductMessage(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    private String givenSuccessBulkResponse() {
        return "{\n" + " \"messages\": [\n" + givenSuccessResponse() + "\n" + "],\n" + "\"bulkId\": null\n" + "}\n";
    }

    private String givenSuccessResponse() {
        return "{\n" + "    \"to\": \"441134960001\",\n"
                + "    \"messageCount\": 1,\n"
                + "    \"messageId\": \"d482a40b-a71b-4000-8176-a553cf21e8e3\",\n"
                + "    \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\",\n"
                + "        \"action\": null\n"
                + "    }\n"
                + "}\n";
    }

    private void thenResponseIsSuccessful(WhatsAppSingleMessageInfo messageInfo) {
        then(messageInfo.getTo()).isEqualTo("441134960001");
        then(messageInfo.getMessageId()).isEqualTo("d482a40b-a71b-4000-8176-a553cf21e8e3");
        then(messageInfo.getMessageCount()).isEqualTo(1);
        then(messageInfo.getStatus().getGroupId()).isEqualTo(PENDING_STATUS_GROUP_ID);
        then(messageInfo.getStatus().getGroupName()).isEqualTo(PENDING_STATUS_GROUP_NAME);
        then(messageInfo.getStatus().getId()).isEqualTo(PENDING_ENROUTE_ID);
        then(messageInfo.getStatus().getName()).isEqualTo(PENDING_ENROUTE_STATUS_NAME);
        then(messageInfo.getStatus().getDescription()).isEqualTo(PENDING_STATUS_DESCRIPTION);
        then(messageInfo.getStatus().getAction()).isNull();
    }

    @Test
    void shouldGetMediaMetadata() {
        String givenSender = "447796344125";
        String givenMediaId = "123e4567-e89b-12d3-a456-426655440000";
        String expectedUrl = String.format("/whatsapp/1/senders/%s/media/%s", givenSender, givenMediaId);

        setUpSuccessHeadRequest(expectedUrl);

        var receiveApi = new WhatsAppApi(getApiClient());
        var call = receiveApi.getWhatsAppMediaMetadata(givenSender, givenMediaId);
        testSuccessfulCallWithNoBody(call::executeAsync, 200);
    }

    @Test
    void shouldGetMediaTemplate() {
        var givenSender = "447796344125";
        var givenResponse = "{\n" + "  \"templates\": [\n"
                + "    {\n"
                + "      \"id\": \"111\",\n"
                + "      \"businessAccountId\": 222,\n"
                + "      \"name\": \"exampleName\",\n"
                + "      \"language\": \"en\",\n"
                + "      \"status\": \"APPROVED\",\n"
                + "      \"category\": \"MARKETING\",\n"
                + "      \"structure\": {\n"
                + "        \"header\": {\n"
                + "          \"text\": \"exampleContent\",\n"
                + "          \"format\": \"TEXT\"\n"
                + "        },\n"
                + "        \"body\": {\n"
                + "          \"text\": \"example {{1}} body\"\n"
                + "        },\n"
                + "        \"footer\": {\n"
                + "          \"text\": \"exampleFooter\"\n"
                + "        },\n"
                + "        \"type\": \"MEDIA\"\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}\n";

        setUpSuccessGetRequest(SENDER_TEMPLATES.replace("{sender}", givenSender), Map.of(), givenResponse);
        var manageApi = new WhatsAppApi(getApiClient());
        Consumer<WhatsAppTemplatesApiResponse> assertions = response -> {
            then(response.getTemplates()).isNotNull();
            WhatsAppTemplateApiResponse template = response.getTemplates().get(0);
            then(template.getName()).isEqualTo("exampleName");
            then(template.getLanguage()).isEqualTo(EN);
            then(template.getStructure().getType()).isEqualTo(WhatsAppDefaultTemplateStructureApiData.TypeEnum.MEDIA);
            then(template.getStructure().getHeader().getClass()).isEqualTo(WhatsAppTextHeaderApiData.class);
        };

        var call = manageApi.getWhatsAppTemplates(givenSender);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteTemplate() {
        String givenSender = "string";
        String givenTemplateName = "string";
        int givenStatusCode = 204;

        setUpNoResponseBodyDeleteRequest(
                SENDER_TEMPLATE.replace("{sender}", givenSender).replace("{templateName}", givenTemplateName),
                Map.of(),
                givenStatusCode);

        WhatsAppApi api = new WhatsAppApi(getApiClient());

        var call = api.deleteWhatsAppTemplate(givenSender, givenTemplateName);
        testSuccessfulCallWithNoBody(call::executeAsync, givenStatusCode);
    }

    @Test
    void shouldMarkMessageAsRead() {
        String givenSender = "string";
        String givenMessageId = "1234";
        int givenStatusCode = 204;

        setUpNoBodyPostRequest(
                SENDER_MESSAGE_READ.replace("{sender}", givenSender).replace("{messageId}", givenMessageId),
                Map.of(),
                givenStatusCode);

        WhatsAppApi api = new WhatsAppApi(getApiClient());

        var call = api.markWhatsAppMessageAsRead(givenSender, givenMessageId);
        testSuccessfulCallWithNoBody(call::executeAsync, givenStatusCode);
    }

    @Test
    void shouldDeleteMedia() {
        var givenSender = "447796344125";
        int givenStatusCode = 204;

        String expectedRequest = "{\n" + "    \"url\": \"https://www.infobip.com/infobip-logo.png\"\n" + "}\n";

        var manageApi = new WhatsAppApi(getApiClient());

        setUpNoResponseBodyDeleteRequest(
                SENDER_MEDIAS.replace("{sender}", givenSender), Map.of(), expectedRequest, givenStatusCode);

        var call = manageApi.deleteWhatsAppMedia(
                givenSender, new WhatsAppUrlDeletionRequest().url("https://www.infobip.com/infobip-logo.png"));
        testSuccessfulCallWithNoBody(call::executeAsync, givenStatusCode);
    }

    @Test
    void shouldSendWhatsAppInteractiveLocationRequestMessage() {
        String givenTo = "441134960001";
        Integer givenMessageCount = 1;
        String givenMessageId = "a28dd97c-1ffb-4fcf-99f1-0b557ed381da";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenId = 7;
        String givenName = "PENDING_ENROUTE";
        String givenDescription = "Message sent to next instance";
        String givenResponse = String.format(
                "{\n" + "  \"to\": \"%s\",\n"
                        + "  \"messageCount\": %d,\n"
                        + "  \"messageId\": \"%s\",\n"
                        + "  \"status\": {\n"
                        + "    \"groupId\": %d,\n"
                        + "    \"groupName\": \"%s\",\n"
                        + "    \"id\": %d,\n"
                        + "    \"name\": \"%s\",\n"
                        + "    \"description\": \"%s\"\n"
                        + "  }\n"
                        + "}",
                givenTo,
                givenMessageCount,
                givenMessageId,
                givenGroupId,
                givenGroupName,
                givenId,
                givenName,
                givenDescription);

        String expectedFrom = "441134960000";
        String expectedTo = "441134960001";
        String expectedMessageId = "a28dd97c-1ffb-4fcf-99f1-0b557ed381da";
        String expectedText = "Some text";
        String expectedCallbackData = "Callback data";
        String expectedNotifyUrl = "https://www.example.com/whatsapp";
        Boolean expectedShortenUrl = true;
        Boolean expectedTrackClicks = true;
        String expectedTrackingUrl = "https://example.com/click-report";
        Boolean expectedRemoveProtocol = true;
        String expectedCustomDomain = "example.com";
        String expectedApplicationId = "applicationId";
        String expectedEntityId = "entityId";

        String expectedRequest = String.format(
                "{\n" + "  \"from\": \"%s\",\n"
                        + "  \"to\": \"%s\",\n"
                        + "  \"messageId\": \"%s\",\n"
                        + "  \"content\": {\n"
                        + "    \"body\": {\n"
                        + "      \"text\": \"%s\"\n"
                        + "    }\n"
                        + "  },\n"
                        + "  \"callbackData\": \"%s\",\n"
                        + "  \"notifyUrl\": \"%s\",\n"
                        + "  \"urlOptions\": {\n"
                        + "    \"shortenUrl\": %b,\n"
                        + "    \"trackClicks\": %b,\n"
                        + "    \"trackingUrl\": \"%s\",\n"
                        + "    \"removeProtocol\": %b,\n"
                        + "    \"customDomain\": \"%s\"\n"
                        + "  },\n"
                        + "  \"applicationId\": \"%s\",\n"
                        + "  \"entityId\": \"%s\"\n"
                        + "}",
                expectedFrom,
                expectedTo,
                expectedMessageId,
                expectedText,
                expectedCallbackData,
                expectedNotifyUrl,
                expectedShortenUrl,
                expectedTrackClicks,
                expectedTrackingUrl,
                expectedRemoveProtocol,
                expectedCustomDomain,
                expectedApplicationId,
                expectedEntityId);

        var whatsAppInteractiveLocationRequestMessage = new WhatsAppInteractiveLocationRequestMessage()
                .from(expectedFrom)
                .to(expectedTo)
                .messageId(expectedMessageId)
                .content(new WhatsAppInteractiveLocationRequestContent()
                        .body(new WhatsAppInteractiveBodyContent().text(expectedText)))
                .callbackData(expectedCallbackData)
                .notifyUrl(expectedNotifyUrl)
                .urlOptions(new UrlOptions()
                        .shortenUrl(expectedShortenUrl)
                        .trackClicks(expectedTrackClicks)
                        .trackingUrl(expectedTrackingUrl)
                        .removeProtocol(expectedRemoveProtocol)
                        .customDomain(expectedCustomDomain))
                .applicationId(expectedApplicationId)
                .entityId(expectedEntityId);

        var api = new WhatsAppApi(getApiClient());
        setUpPostRequest(MESSAGE_INTERACTIVE_LOCATION_REQUEST, expectedRequest, givenResponse, 200);

        Consumer<WhatsAppSingleMessageInfo> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getTo()).isEqualTo(givenTo);
            then(response.getMessageCount()).isEqualTo(givenMessageCount);
            then(response.getMessageId()).isEqualTo(givenMessageId);
            then(response.getStatus()).isNotNull();
            var status = response.getStatus();
            then(status.getGroupId()).isEqualTo(givenGroupId);
            then(status.getGroupName()).isEqualTo(givenGroupName);
            then(status.getId()).isEqualTo(givenId);
            then(status.getName()).isEqualTo(givenName);
            then(status.getDescription()).isEqualTo(givenDescription);
        };

        var call = api.sendWhatsappInteractiveLocationRequestMessage(whatsAppInteractiveLocationRequestMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendWhatsAppInteractiveOrderDetailsMessage() {
        String givenTo = "441134960001";
        Integer givenMessageCount = 1;
        String givenMessageId = "a28dd97c-1ffb-4fcf-99f1-0b557ed381da";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenId = 7;
        String givenName = "PENDING_ENROUTE";
        String givenDescription = "Message sent to next instance";
        String givenResponse = String.format(
                "{\n" + "  \"to\": \"%s\",\n"
                        + "  \"messageCount\": %d,\n"
                        + "  \"messageId\": \"%s\",\n"
                        + "  \"status\": {\n"
                        + "    \"groupId\": %d,\n"
                        + "    \"groupName\": \"%s\",\n"
                        + "    \"id\": %d,\n"
                        + "    \"name\": \"%s\",\n"
                        + "    \"description\": \"%s\"\n"
                        + "  }\n"
                        + "}",
                givenTo,
                givenMessageCount,
                givenMessageId,
                givenGroupId,
                givenGroupName,
                givenId,
                givenName,
                givenDescription);

        String expectedFrom = "441134960000";
        String expectedTo = "441134960001";
        String expectedMessageId = "a28dd97c-1ffb-4fcf-99f1-0b557ed381da";
        String expectedText = "Some text";
        String expectedType = "UPI_PAYU";
        String expectedId = "fd3e847h2";
        String expectedProductDescription = "tshirt100";
        String expectedCustomerFirstName = "John";
        String expectedCustomerLastName = "Smith";
        String expectedCustomerEmail = "John.Smith@example.com";
        String expectedCallbackData1 = "customData1";
        String expectedCallbackData2 = "customData2";
        String expectedCallbackData3 = "customData3";
        String expectedCallbackData4 = "customData4";
        String expectedCallbackData5 = "customData5";
        String expectedPaymentConfiguration = "payment-config";
        WhatsAppOrderCurrency expectedOrderCurrency = WhatsAppOrderCurrency.INR;
        WhatsAppOrderType expectedOrderType = WhatsAppOrderType.DIGITAL_GOODS;
        WhatsAppInteractiveOrderDetailsAmount expectedTotalAmountValue = new WhatsAppInteractiveOrderDetailsAmount();
        expectedTotalAmountValue.setValue(21000);
        String expectedRetailerId = "1";
        String expectedName = "product";
        WhatsAppInteractiveOrderDetailsAmount expectedItemValue = new WhatsAppInteractiveOrderDetailsAmount();
        expectedItemValue.setValue(10000);
        Integer expectedQuantity = 2;
        String expectedOriginCountry = "country of origin";
        String expectedImporterName = "importer name";
        String expectedFirstAddressLine = "address line";
        String expectedSecondAddressLine = "address line";
        String expectedCity = "city";
        String expectedZoneCode = "zone code";
        String expectedPostalCode = "postal code";
        String expectedCountryCode = "country code";
        WhatsAppInteractiveOrderDetailsAmount expectedSubtotalValue = new WhatsAppInteractiveOrderDetailsAmount();
        expectedSubtotalValue.setValue(20000);
        Integer expectedTaxValue = 1000;
        String expectedTaxDescription = "tax included";
        Integer expectedShippingValue = 1000;
        String expectedShippingDescription = "shipping cost";
        Integer expectedDiscountAmountValue = 1000;
        String expectedDiscountAmountDescription = "discount";
        String expectedProgramName = "membership discount";
        Long expectedExpirationSeconds = 500L;
        String expectedOrderExpirationDescription = "limited offer";
        String expectedHeaderType = "IMAGE";
        String expectedMediaUrl = "https://example.com/image";
        String expectedFooterText = "Footer";
        String expectedCallbackData = "Callback data";
        String expectedNotifyUrl = "https://www.example.com/whatsapp";
        Boolean expectedShortenUrl = true;
        Boolean expectedTrackClicks = true;
        String expectedTrackingUrl = "https://example.com/click-report";
        Boolean expectedRemoveProtocol = true;
        String expectedCustomDomain = "example.com";
        String expectedApplicationId = "applicationId";
        String expectedEntityId = "entityId";

        String expectedRequest = String.format(
                "{\n" + "  \"from\": \"%s\",\n"
                        + "  \"to\": \"%s\",\n"
                        + "  \"messageId\": \"%s\",\n"
                        + "  \"content\": {\n"
                        + "    \"body\": {\n"
                        + "      \"text\": \"%s\"\n"
                        + "    },\n"
                        + "    \"action\": {\n"
                        + "      \"payment\": {\n"
                        + "        \"type\": \"%s\",\n"
                        + "        \"id\": \"%s\",\n"
                        + "        \"productDescription\": \"%s\",\n"
                        + "        \"customerFirstName\": \"%s\",\n"
                        + "        \"customerLastName\": \"%s\",\n"
                        + "        \"customerEmail\": \"%s\",\n"
                        + "        \"callbackData\": [\n"
                        + "          \"%s\",\n"
                        + "          \"%s\",\n"
                        + "          \"%s\",\n"
                        + "          \"%s\",\n"
                        + "          \"%s\"\n"
                        + "        ]\n"
                        + "      },\n"
                        + "      \"paymentConfiguration\": \"%s\",\n"
                        + "      \"orderCurrency\": \"%s\",\n"
                        + "      \"orderType\": \"%s\",\n"
                        + "      \"totalAmount\": {\n"
                        + "        \"value\": %d\n"
                        + "      },\n"
                        + "      \"order\": {\n"
                        + "        \"items\": [\n"
                        + "          {\n"
                        + "            \"retailerId\": \"%s\",\n"
                        + "            \"name\": \"%s\",\n"
                        + "            \"amount\": {\n"
                        + "              \"value\": %d\n"
                        + "            },\n"
                        + "            \"quantity\": %d,\n"
                        + "            \"originCountry\": \"%s\",\n"
                        + "            \"importerName\": \"%s\",\n"
                        + "            \"importerAddress\": {\n"
                        + "              \"firstAddressLine\": \"%s\",\n"
                        + "              \"secondAddressLine\": \"%s\",\n"
                        + "              \"city\": \"%s\",\n"
                        + "              \"zoneCode\": \"%s\",\n"
                        + "              \"postalCode\": \"%s\",\n"
                        + "              \"countryCode\": \"%s\"\n"
                        + "            }\n"
                        + "          }\n"
                        + "        ],\n"
                        + "        \"subtotal\": {\n"
                        + "          \"value\": %d\n"
                        + "        },\n"
                        + "        \"tax\": {\n"
                        + "          \"value\": %d,\n"
                        + "          \"description\": \"%s\"\n"
                        + "        },\n"
                        + "        \"shipping\": {\n"
                        + "          \"value\": %d,\n"
                        + "          \"description\": \"%s\"\n"
                        + "        },\n"
                        + "        \"discount\": {\n"
                        + "          \"amount\": {\n"
                        + "            \"value\": %d,\n"
                        + "            \"description\": \"%s\"\n"
                        + "          },\n"
                        + "          \"programName\": \"%s\"\n"
                        + "        },\n"
                        + "        \"orderExpiration\": {\n"
                        + "          \"expirationSeconds\": %d,\n"
                        + "          \"description\": \"%s\"\n"
                        + "        }\n"
                        + "      }\n"
                        + "    },\n"
                        + "    \"header\": {\n"
                        + "      \"type\": \"%s\",\n"
                        + "      \"mediaUrl\": \"%s\"\n"
                        + "    },\n"
                        + "    \"footer\": {\n"
                        + "      \"text\": \"%s\"\n"
                        + "    }\n"
                        + "  },\n"
                        + "  \"callbackData\": \"%s\",\n"
                        + "  \"notifyUrl\": \"%s\",\n"
                        + "  \"urlOptions\": {\n"
                        + "    \"shortenUrl\": %b,\n"
                        + "    \"trackClicks\": %b,\n"
                        + "    \"trackingUrl\": \"%s\",\n"
                        + "    \"removeProtocol\": %b,\n"
                        + "    \"customDomain\": \"%s\"\n"
                        + "  },\n"
                        + "  \"applicationId\": \"%s\",\n"
                        + "  \"entityId\": \"%s\"\n"
                        + "}",
                expectedFrom,
                expectedTo,
                expectedMessageId,
                expectedText,
                expectedType,
                expectedId,
                expectedProductDescription,
                expectedCustomerFirstName,
                expectedCustomerLastName,
                expectedCustomerEmail,
                expectedCallbackData1,
                expectedCallbackData2,
                expectedCallbackData3,
                expectedCallbackData4,
                expectedCallbackData5,
                expectedPaymentConfiguration,
                expectedOrderCurrency,
                expectedOrderType,
                expectedTotalAmountValue.getValue(),
                expectedRetailerId,
                expectedName,
                expectedItemValue.getValue(),
                expectedQuantity,
                expectedOriginCountry,
                expectedImporterName,
                expectedFirstAddressLine,
                expectedSecondAddressLine,
                expectedCity,
                expectedZoneCode,
                expectedPostalCode,
                expectedCountryCode,
                expectedSubtotalValue.getValue(),
                expectedTaxValue,
                expectedTaxDescription,
                expectedShippingValue,
                expectedShippingDescription,
                expectedDiscountAmountValue,
                expectedDiscountAmountDescription,
                expectedProgramName,
                expectedExpirationSeconds,
                expectedOrderExpirationDescription,
                expectedHeaderType,
                expectedMediaUrl,
                expectedFooterText,
                expectedCallbackData,
                expectedNotifyUrl,
                expectedShortenUrl,
                expectedTrackClicks,
                expectedTrackingUrl,
                expectedRemoveProtocol,
                expectedCustomDomain,
                expectedApplicationId,
                expectedEntityId);

        var whatsAppInteractiveOrderDetailsMessage = new WhatsAppInteractiveOrderDetailsMessage()
                .from(expectedFrom)
                .to(expectedTo)
                .messageId(expectedMessageId)
                .content(new WhatsAppInteractiveOrderDetailsContent()
                        .body(new WhatsAppInteractiveBodyContent().text(expectedText))
                        .action(new WhatsAppInteractiveOrderDetailsActionContent()
                                .payment(new WhatsAppInteractiveOrderUPIPayUPaymentDetails()
                                        .id(expectedId)
                                        .productDescription(expectedProductDescription)
                                        .customerFirstName(expectedCustomerFirstName)
                                        .customerLastName(expectedCustomerLastName)
                                        .customerEmail(expectedCustomerEmail)
                                        .callbackData(List.of(
                                                expectedCallbackData1,
                                                expectedCallbackData2,
                                                expectedCallbackData3,
                                                expectedCallbackData4,
                                                expectedCallbackData5)))
                                .paymentConfiguration(expectedPaymentConfiguration)
                                .orderCurrency(expectedOrderCurrency)
                                .orderType(expectedOrderType)
                                .totalAmount(expectedTotalAmountValue)
                                .order(new WhatsAppInteractiveOrderDetailsOrder()
                                        .items(List.of(new WhatsAppInteractiveOrderDetailsOrderItem()
                                                .retailerId(expectedRetailerId)
                                                .name(expectedName)
                                                .amount(expectedItemValue)
                                                .quantity(expectedQuantity)
                                                .originCountry(expectedOriginCountry)
                                                .importerName(expectedImporterName)
                                                .importerAddress(new WhatsAppInteractiveOrderDetailsImporterAddress()
                                                        .firstAddressLine(expectedFirstAddressLine)
                                                        .secondAddressLine(expectedSecondAddressLine)
                                                        .city(expectedCity)
                                                        .zoneCode(expectedZoneCode)
                                                        .postalCode(expectedPostalCode)
                                                        .countryCode(expectedCountryCode))))
                                        .subtotal(expectedSubtotalValue)
                                        .tax(new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                                                .value(expectedTaxValue)
                                                .description(expectedTaxDescription))
                                        .shipping(new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                                                .value(expectedShippingValue)
                                                .description(expectedShippingDescription))
                                        .discount(new WhatsAppInteractiveOrderDetailsDiscount()
                                                .amount(new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                                                        .value(expectedDiscountAmountValue)
                                                        .description(expectedDiscountAmountDescription))
                                                .programName(expectedProgramName))
                                        .orderExpiration(new WhatsAppInteractiveOrderDetailsOrderExpiration()
                                                .expirationSeconds(expectedExpirationSeconds)
                                                .description(expectedOrderExpirationDescription))))
                        .header(new WhatsAppInteractiveOrderDetailsImageHeaderContent().mediaUrl(expectedMediaUrl))
                        .footer(new WhatsAppInteractiveFooterContent().text(expectedFooterText)))
                .callbackData(expectedCallbackData)
                .notifyUrl(expectedNotifyUrl)
                .urlOptions(new UrlOptions()
                        .shortenUrl(expectedShortenUrl)
                        .trackClicks(expectedTrackClicks)
                        .trackingUrl(expectedTrackingUrl)
                        .removeProtocol(expectedRemoveProtocol)
                        .customDomain(expectedCustomDomain))
                .applicationId(expectedApplicationId)
                .entityId(expectedEntityId);

        var api = new WhatsAppApi(getApiClient());
        setUpPostRequest(MESSAGE_INTERACTIVE_ORDER_DETAILS, expectedRequest, givenResponse, 200);

        Consumer<WhatsAppSingleMessageInfo> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getTo()).isEqualTo(givenTo);
            then(response.getMessageCount()).isEqualTo(givenMessageCount);
            then(response.getMessageId()).isEqualTo(givenMessageId);
            then(response.getStatus()).isNotNull();
            var status = response.getStatus();
            then(status.getGroupId()).isEqualTo(givenGroupId);
            then(status.getGroupName()).isEqualTo(givenGroupName);
            then(status.getId()).isEqualTo(givenId);
            then(status.getName()).isEqualTo(givenName);
            then(status.getDescription()).isEqualTo(givenDescription);
        };

        var call = api.sendWhatsappInteractiveOrderDetailsMessage(whatsAppInteractiveOrderDetailsMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendWhatsAppInteractiveOrderStatusMessage() {
        String givenTo = "441134960001";
        Integer givenMessageCount = 1;
        String givenMessageId = "a28dd97c-1ffb-4fcf-99f1-0b557ed381da";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenId = 7;
        String givenName = "PENDING_ENROUTE";
        String givenDescription = "Message sent to next instance";
        String givenResponse = String.format(
                "{\n" + "  \"to\": \"%s\",\n"
                        + "  \"messageCount\": %d,\n"
                        + "  \"messageId\": \"%s\",\n"
                        + "  \"status\": {\n"
                        + "    \"groupId\": %d,\n"
                        + "    \"groupName\": \"%s\",\n"
                        + "    \"id\": %d,\n"
                        + "    \"name\": \"%s\",\n"
                        + "    \"description\": \"%s\"\n"
                        + "  }\n"
                        + "}",
                givenTo,
                givenMessageCount,
                givenMessageId,
                givenGroupId,
                givenGroupName,
                givenId,
                givenName,
                givenDescription);

        String expectedFrom = "441134960000";
        String expectedTo = "441134960001";
        String expectedMessageId = "a28dd97c-1ffb-4fcf-99f1-0b557ed381da";
        String expectedPaymentType = "UPI_PAYU";
        String expectedPaymentId = "16085194825";
        WhatsAppOrderStatus expectedStatus = WhatsAppOrderStatus.SHIPPED;
        String expectedDescription = "Order shipped";
        String expectedBodyText = "Some text";
        String expectedFooterText = "Footer";
        String expectedCallbackData = "Callback data";
        String expectedNotifyUrl = "https://www.example.com/whatsapp";
        Boolean expectedShortenUrl = true;
        Boolean expectedTrackClicks = true;
        String expectedTrackingUrl = "https://example.com/click-report";
        Boolean expectedRemoveProtocol = true;
        String expectedCustomDomain = "example.com";
        String expectedApplicationId = "applicationId";
        String expectedEntityId = "entityId";

        String expectedRequest = String.format(
                "{\n" + "  \"from\": \"%s\",\n"
                        + "  \"to\": \"%s\",\n"
                        + "  \"messageId\": \"%s\",\n"
                        + "  \"content\": {\n"
                        + "    \"action\": {\n"
                        + "      \"payment\": {\n"
                        + "        \"type\": \"%s\",\n"
                        + "        \"id\": \"%s\"\n"
                        + "      },\n"
                        + "      \"status\": \"%s\",\n"
                        + "      \"description\": \"%s\"\n"
                        + "    },\n"
                        + "    \"body\": {\n"
                        + "      \"text\": \"%s\"\n"
                        + "    },\n"
                        + "    \"footer\": {\n"
                        + "      \"text\": \"%s\"\n"
                        + "    }\n"
                        + "  },\n"
                        + "  \"callbackData\": \"%s\",\n"
                        + "  \"notifyUrl\": \"%s\",\n"
                        + "  \"urlOptions\": {\n"
                        + "    \"shortenUrl\": %b,\n"
                        + "    \"trackClicks\": %b,\n"
                        + "    \"trackingUrl\": \"%s\",\n"
                        + "    \"removeProtocol\": %b,\n"
                        + "    \"customDomain\": \"%s\"\n"
                        + "  },\n"
                        + "  \"applicationId\": \"%s\",\n"
                        + "  \"entityId\": \"%s\"\n"
                        + "}",
                expectedFrom,
                expectedTo,
                expectedMessageId,
                expectedPaymentType,
                expectedPaymentId,
                expectedStatus,
                expectedDescription,
                expectedBodyText,
                expectedFooterText,
                expectedCallbackData,
                expectedNotifyUrl,
                expectedShortenUrl,
                expectedTrackClicks,
                expectedTrackingUrl,
                expectedRemoveProtocol,
                expectedCustomDomain,
                expectedApplicationId,
                expectedEntityId);

        var api = new WhatsAppApi(getApiClient());
        setUpPostRequest(MESSAGE_INTERACTIVE_ORDER_STATUS, expectedRequest, givenResponse, 200);

        var whatsAppInteractiveOrderStatusMessage = new WhatsAppInteractiveOrderStatusMessage()
                .from(expectedFrom)
                .to(expectedTo)
                .messageId(expectedMessageId)
                .content(new WhatsAppInteractiveOrderStatusContent()
                        .action(new WhatsAppInteractiveOrderStatusActionContent()
                                .payment(new WhatsAppInteractiveOrderUPIPayUPaymentStatus().id(expectedPaymentId))
                                .status(expectedStatus)
                                .description(expectedDescription))
                        .body(new WhatsAppInteractiveBodyContent().text(expectedBodyText))
                        .footer(new WhatsAppInteractiveFooterContent().text(expectedFooterText)))
                .callbackData(expectedCallbackData)
                .notifyUrl(expectedNotifyUrl)
                .urlOptions(new UrlOptions()
                        .shortenUrl(expectedShortenUrl)
                        .trackClicks(expectedTrackClicks)
                        .trackingUrl(expectedTrackingUrl)
                        .removeProtocol(expectedRemoveProtocol)
                        .customDomain(expectedCustomDomain))
                .applicationId(expectedApplicationId)
                .entityId(expectedEntityId);

        Consumer<WhatsAppSingleMessageInfo> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getTo()).isEqualTo(givenTo);
            then(response.getMessageCount()).isEqualTo(givenMessageCount);
            then(response.getMessageId()).isEqualTo(givenMessageId);
            then(response.getStatus()).isNotNull();
            var status = response.getStatus();
            then(status.getGroupId()).isEqualTo(givenGroupId);
            then(status.getGroupName()).isEqualTo(givenGroupName);
            then(status.getId()).isEqualTo(givenId);
            then(status.getName()).isEqualTo(givenName);
            then(status.getDescription()).isEqualTo(givenDescription);
        };

        var call = api.sendWhatsappInteractiveOrderStatusMessage(whatsAppInteractiveOrderStatusMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetWhatsAppTemplate() {
        String givenId = "111";
        Long givenBusinessAccountId = 222L;
        String givenName = "media_template_with_buttons";
        WhatsAppLanguage givenLanguage = EN;
        WhatsAppStatus givenStatus = APPROVED;
        WhatsAppCategory givenCategory = WhatsAppCategory.MARKETING;
        WhatsAppHeaderApiData.FormatEnum givenFormat = WhatsAppHeaderApiData.FormatEnum.IMAGE;
        String givenBodyText = "example {{1}} body";
        String givenFooterText = "exampleFooter";
        String givenButtonText = "Dial 911";
        String givenPhoneNumber = "911";
        String givenType = "PHONE_NUMBER";
        String givenButtonText2 = "Visit our website";
        String givenUrl = "https://www.infobip.com";
        String givenType2 = "URL";
        String givenButtonType = "MEDIA";
        WhatsAppTemplateApiResponse.QualityEnum givenQuality = WhatsAppTemplateApiResponse.QualityEnum.LOW;

        String givenResponse = String.format(
                "{\n" + "  \"id\": \"%s\",\n"
                        + "  \"businessAccountId\": %d,\n"
                        + "  \"name\": \"%s\",\n"
                        + "  \"language\": \"%s\",\n"
                        + "  \"status\": \"%s\",\n"
                        + "  \"category\": \"%s\",\n"
                        + "  \"structure\": {\n"
                        + "    \"header\": {\n"
                        + "      \"format\": \"%s\"\n"
                        + "    },\n"
                        + "    \"body\": {\n"
                        + "      \"text\": \"%s\"\n"
                        + "    },\n"
                        + "    \"footer\": {\n"
                        + "      \"text\": \"%s\"\n"
                        + "    },\n"
                        + "    \"buttons\": [\n"
                        + "      {\n"
                        + "        \"text\": \"%s\",\n"
                        + "        \"phoneNumber\": \"%s\",\n"
                        + "        \"type\": \"%s\"\n"
                        + "      },\n"
                        + "      {\n"
                        + "        \"text\": \"%s\",\n"
                        + "        \"url\": \"%s\",\n"
                        + "        \"type\": \"%s\"\n"
                        + "      }\n"
                        + "    ],\n"
                        + "    \"type\": \"%s\"\n"
                        + "  },\n"
                        + "  \"quality\": \"%s\"\n"
                        + "}",
                givenId,
                givenBusinessAccountId,
                givenName,
                givenLanguage,
                givenStatus,
                givenCategory,
                givenFormat,
                givenBodyText,
                givenFooterText,
                givenButtonText,
                givenPhoneNumber,
                givenType,
                givenButtonText2,
                givenUrl,
                givenType2,
                givenButtonType,
                givenQuality);

        String givenSender = "447796344125";
        String givenPathId = "5653923468715475";

        setUpSuccessGetRequest(
                SENDER_TEMPLATE_ID.replace("{sender}", givenSender).replace("{id}", givenPathId),
                Map.of(),
                givenResponse);

        WhatsAppApi api = new WhatsAppApi(getApiClient());

        Consumer<WhatsAppTemplateApiResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getBusinessAccountId()).isEqualTo(givenBusinessAccountId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getLanguage()).isEqualTo(givenLanguage);
            then(response.getStatus()).isEqualTo(givenStatus);
            then(response.getCategory()).isEqualTo(givenCategory);
            then(response.getStructure()).isNotNull();
            var structure = response.getStructure();
            then(structure.getHeader()).isNotNull();
            then(structure.getHeader().getFormat()).isEqualTo(givenFormat);
            then(structure.getBody()).isNotNull();
            then(structure.getBody().getText()).isEqualTo(givenBodyText);
            then(structure.getFooter()).isNotNull();
            then(structure.getFooter().getText()).isEqualTo(givenFooterText);
            then(structure.getButtons().size()).isEqualTo(2);
            var button1 =
                    (WhatsAppPhoneNumberButtonApiData) structure.getButtons().get(0);
            then(button1.getText()).isEqualTo(givenButtonText);
            then(button1.getPhoneNumber()).isEqualTo(givenPhoneNumber);
            var button2 = (WhatsAppUrlButtonApiData) structure.getButtons().get(1);
            then(button2.getText()).isEqualTo(givenButtonText2);
            then(button2.getUrl()).isEqualTo(givenUrl);
            then(response.getQuality()).isEqualTo(givenQuality);
        };

        var call = api.getWhatsappTemplate(givenSender, givenPathId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldEditWhatsAppTemplate() {
        String givenId = "111";
        Long givenBusinessAccountId = 222L;
        String givenName = "media_template_with_buttons";
        WhatsAppLanguage givenLanguage = EN;
        WhatsAppStatus givenStatus = APPROVED;
        WhatsAppCategory givenCategory = WhatsAppCategory.MARKETING;
        WhatsAppHeaderApiData.FormatEnum givenFormat = WhatsAppHeaderApiData.FormatEnum.IMAGE;
        String givenBodyText = "example {{1}} body";
        String givenFooterText = "exampleFooter";
        String givenButtonText = "Dial 911";
        String givenPhoneNumber = "911";
        String givenType = "PHONE_NUMBER";
        String givenButtonText2 = "Visit our website";
        String givenUrl = "https://www.infobip.com";
        String givenType2 = "URL";
        String givenButtonType = "MEDIA";
        WhatsAppTemplateApiResponse.QualityEnum givenQuality = WhatsAppTemplateApiResponse.QualityEnum.LOW;

        String givenResponse = String.format(
                "{\n" + "  \"id\": \"%s\",\n"
                        + "  \"businessAccountId\": %d,\n"
                        + "  \"name\": \"%s\",\n"
                        + "  \"language\": \"%s\",\n"
                        + "  \"status\": \"%s\",\n"
                        + "  \"category\": \"%s\",\n"
                        + "  \"structure\": {\n"
                        + "    \"header\": {\n"
                        + "      \"format\": \"%s\"\n"
                        + "    },\n"
                        + "    \"body\": {\n"
                        + "      \"text\": \"%s\"\n"
                        + "    },\n"
                        + "    \"footer\": {\n"
                        + "      \"text\": \"%s\"\n"
                        + "    },\n"
                        + "    \"buttons\": [\n"
                        + "      {\n"
                        + "        \"text\": \"%s\",\n"
                        + "        \"phoneNumber\": \"%s\",\n"
                        + "        \"type\": \"%s\"\n"
                        + "      },\n"
                        + "      {\n"
                        + "        \"text\": \"%s\",\n"
                        + "        \"url\": \"%s\",\n"
                        + "        \"type\": \"%s\"\n"
                        + "      }\n"
                        + "    ],\n"
                        + "    \"type\": \"%s\"\n"
                        + "  },\n"
                        + "  \"quality\": \"%s\"\n"
                        + "}",
                givenId,
                givenBusinessAccountId,
                givenName,
                givenLanguage,
                givenStatus,
                givenCategory,
                givenFormat,
                givenBodyText,
                givenFooterText,
                givenButtonText,
                givenPhoneNumber,
                givenType,
                givenButtonText2,
                givenUrl,
                givenType2,
                givenButtonType,
                givenQuality);

        WhatsAppTemplateEditPublicApiRequest.CategoryEnum expectedCategory =
                WhatsAppTemplateEditPublicApiRequest.CategoryEnum.MARKETING;
        String expectedText = "body {{1}} content";
        String expectedExample = "example";
        WhatsAppDefaultTemplateStructureApiData.TypeEnum expectedType =
                WhatsAppDefaultTemplateStructureApiData.TypeEnum.TEXT;

        String expectedRequest = String.format(
                "{\n" + "  \"category\": \"%s\",\n"
                        + "  \"structure\": {\n"
                        + "    \"body\": {\n"
                        + "      \"text\": \"%s\",\n"
                        + "      \"examples\": [\n"
                        + "        \"%s\"\n"
                        + "      ]\n"
                        + "    },\n"
                        + "    \"type\": \"%s\"\n"
                        + "  }\n"
                        + "}",
                expectedCategory, expectedText, expectedExample, expectedType);

        String givenSender = "447796344125";
        String givenPathId = "5653923468715475";

        setUpPatchRequest(
                SENDER_TEMPLATE_ID.replace("{sender}", givenSender).replace("{id}", givenPathId),
                Map.of(),
                expectedRequest,
                givenResponse,
                200);

        WhatsAppApi api = new WhatsAppApi(getApiClient());

        var whatsAppTemplateEditPublicApiRequest = new WhatsAppTemplateEditPublicApiRequest()
                .category(expectedCategory)
                .structure(new WhatsAppDefaultTemplateStructureApiData()
                        .body(new WhatsAppBodyApiData().text(expectedText).addExamplesItem(expectedExample))
                        .type(expectedType));

        Consumer<WhatsAppTemplateApiResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(givenId);
            then(response.getBusinessAccountId()).isEqualTo(givenBusinessAccountId);
            then(response.getName()).isEqualTo(givenName);
            then(response.getLanguage()).isEqualTo(givenLanguage);
            then(response.getStatus()).isEqualTo(givenStatus);
            then(response.getCategory()).isEqualTo(givenCategory);
            then(response.getStructure()).isNotNull();
            var structure = response.getStructure();
            then(structure.getHeader()).isNotNull();
            then(structure.getHeader().getFormat()).isEqualTo(givenFormat);
            then(structure.getBody()).isNotNull();
            then(structure.getBody().getText()).isEqualTo(givenBodyText);
            then(structure.getFooter()).isNotNull();
            then(structure.getFooter().getText()).isEqualTo(givenFooterText);
            then(structure.getButtons().size()).isEqualTo(2);
            var button1 =
                    (WhatsAppPhoneNumberButtonApiData) structure.getButtons().get(0);
            then(button1.getText()).isEqualTo(givenButtonText);
            then(button1.getPhoneNumber()).isEqualTo(givenPhoneNumber);
            var button2 = (WhatsAppUrlButtonApiData) structure.getButtons().get(1);
            then(button2.getText()).isEqualTo(givenButtonText2);
            then(button2.getUrl()).isEqualTo(givenUrl);
            then(response.getQuality()).isEqualTo(givenQuality);
        };

        var call = api.editWhatsappTemplate(givenSender, givenPathId, whatsAppTemplateEditPublicApiRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetIndiaUpiPayUPaymentStatus() {
        String givenReferenceId = "72123248136";
        String givenPaymentId = "16085194825";
        WhatsAppPaymentStatus givenPaymentStatus = WhatsAppPaymentStatus.CAPTURED;
        WhatsAppPaymentCurrency givenCurrency = WhatsAppPaymentCurrency.INR;
        Integer givenTotalAmountValue = 21000;
        Integer givenTotalAmountOffset = 100;
        String givenId = "27194245144";
        WhatsAppPaymentTransactionType givenType = WhatsAppPaymentTransactionType.UPI;
        WhatsAppPaymentTransactionStatus givenStatus = WhatsAppPaymentTransactionStatus.SUCCESS;
        String givenCreatedTimestamp = "2023-01-01T00:00:00.000+0000";
        String givenUpdatedTimestamp = "2023-01-01T01:00:00.000+0000";

        String givenResponse = String.format(
                "{\n" + "  \"referenceId\": \"%s\",\n"
                        + "  \"paymentId\": \"%s\",\n"
                        + "  \"paymentStatus\": \"%s\",\n"
                        + "  \"currency\": \"%s\",\n"
                        + "  \"totalAmountValue\": %d,\n"
                        + "  \"totalAmountOffset\": %d,\n"
                        + "  \"transactions\": [\n"
                        + "    {\n"
                        + "      \"id\": \"%s\",\n"
                        + "      \"type\": \"%s\",\n"
                        + "      \"status\": \"%s\",\n"
                        + "      \"createdTimestamp\": \"%s\",\n"
                        + "      \"updatedTimestamp\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenReferenceId,
                givenPaymentId,
                givenPaymentStatus,
                givenCurrency,
                givenTotalAmountValue,
                givenTotalAmountOffset,
                givenId,
                givenType,
                givenStatus,
                givenCreatedTimestamp,
                givenUpdatedTimestamp);

        OffsetDateTime givenCreatedAtTimestamp =
                OffsetDateTime.of(LocalDateTime.of(2023, 1, 1, 0, 0, 0, 0), ZoneOffset.ofHours(0));

        OffsetDateTime givenUpdatedAtTimestamp =
                OffsetDateTime.of(LocalDateTime.of(2023, 1, 1, 1, 0, 0, 0), ZoneOffset.ofHours(0));

        String givenSender = "447796344125";

        setUpGetRequest(
                INDIA_PAYMENT.replace("{sender}", givenSender).replace("{paymentId}", givenPaymentId),
                Map.of(),
                givenResponse,
                200);

        WhatsAppApi api = new WhatsAppApi(getApiClient());

        Consumer<WhatsAppPayment> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getReferenceId()).isEqualTo(givenReferenceId);
            then(response.getPaymentId()).isEqualTo(givenPaymentId);
            then(response.getPaymentStatus()).isEqualTo(givenPaymentStatus);
            then(response.getCurrency()).isEqualTo(givenCurrency);
            then(response.getTotalAmountValue()).isEqualTo(givenTotalAmountValue);
            then(response.getTotalAmountOffset()).isEqualTo(givenTotalAmountOffset);
            then(response.getTransactions().size()).isEqualTo(1);
            var transaction = response.getTransactions().get(0);
            then(transaction.getId()).isEqualTo(givenId);
            then(transaction.getType()).isEqualTo(givenType);
            then(transaction.getStatus()).isEqualTo(givenStatus);
            then(transaction.getCreatedTimestamp()).isEqualTo(givenCreatedAtTimestamp);
            then(transaction.getUpdatedTimestamp()).isEqualTo(givenUpdatedAtTimestamp);
        };

        var call = api.getWhatsappUpiPayuPaymentStatus(givenSender, givenPaymentId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetBrazilPaymentStatus() {
        String givenReferenceId = "72123248136";
        String givenPaymentId = "16085194825";
        WhatsAppPaymentStatus givenPaymentStatus = WhatsAppPaymentStatus.CAPTURED;
        WhatsAppPaymentCurrency givenCurrency = WhatsAppPaymentCurrency.BRL;
        Integer givenTotalAmountValue = 21000;
        Integer givenTotalAmountOffset = 100;
        String givenId = "27194245144";
        WhatsAppPaymentTransactionType givenType = WhatsAppPaymentTransactionType.UPI;
        WhatsAppPaymentTransactionStatus givenStatus = WhatsAppPaymentTransactionStatus.SUCCESS;
        String givenCreatedTimestamp = "2023-01-01T00:00:00.000+0000";
        String givenUpdatedTimestamp = "2023-01-01T01:00:00.000+0000";

        String givenResponse = String.format(
                "{\n" + "  \"referenceId\": \"%s\",\n"
                        + "  \"paymentId\": \"%s\",\n"
                        + "  \"paymentStatus\": \"%s\",\n"
                        + "  \"currency\": \"%s\",\n"
                        + "  \"totalAmountValue\": %d,\n"
                        + "  \"totalAmountOffset\": %d,\n"
                        + "  \"transactions\": [\n"
                        + "    {\n"
                        + "      \"id\": \"%s\",\n"
                        + "      \"type\": \"%s\",\n"
                        + "      \"status\": \"%s\",\n"
                        + "      \"createdTimestamp\": \"%s\",\n"
                        + "      \"updatedTimestamp\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenReferenceId,
                givenPaymentId,
                givenPaymentStatus,
                givenCurrency,
                givenTotalAmountValue,
                givenTotalAmountOffset,
                givenId,
                givenType,
                givenStatus,
                givenCreatedTimestamp,
                givenUpdatedTimestamp);

        OffsetDateTime givenCreatedAtTimestamp =
                OffsetDateTime.of(LocalDateTime.of(2023, 1, 1, 0, 0, 0, 0), ZoneOffset.ofHours(0));

        OffsetDateTime givenUpdatedAtTimestamp =
                OffsetDateTime.of(LocalDateTime.of(2023, 1, 1, 1, 0, 0, 0), ZoneOffset.ofHours(0));

        String givenSender = "447796344125";

        setUpGetRequest(
                BRAZIL_PAYMENT.replace("{sender}", givenSender).replace("{paymentId}", givenPaymentId),
                Map.of(),
                givenResponse,
                200);

        WhatsAppApi api = new WhatsAppApi(getApiClient());

        Consumer<WhatsAppPayment> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getReferenceId()).isEqualTo(givenReferenceId);
            then(response.getPaymentId()).isEqualTo(givenPaymentId);
            then(response.getPaymentStatus()).isEqualTo(givenPaymentStatus);
            then(response.getCurrency()).isEqualTo(givenCurrency);
            then(response.getTotalAmountValue()).isEqualTo(givenTotalAmountValue);
            then(response.getTotalAmountOffset()).isEqualTo(givenTotalAmountOffset);
            then(response.getTransactions().size()).isEqualTo(1);
            var transaction = response.getTransactions().get(0);
            then(transaction.getId()).isEqualTo(givenId);
            then(transaction.getType()).isEqualTo(givenType);
            then(transaction.getStatus()).isEqualTo(givenStatus);
            then(transaction.getCreatedTimestamp()).isEqualTo(givenCreatedAtTimestamp);
            then(transaction.getUpdatedTimestamp()).isEqualTo(givenUpdatedAtTimestamp);
        };

        var call = api.getWhatsappBrazilPaymentStatus(givenSender, givenPaymentId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetQualityInformationOfWhatsAppSenders() {
        String givenSender = "441134960000";
        WhatsAppSenderQualityRating givenQualityRating = WhatsAppSenderQualityRating.MEDIUM;
        WhatsAppSenderStatus givenStatus = WhatsAppSenderStatus.CONNECTED;
        WhatsAppSenderLimit givenCurrentLimit = WhatsAppSenderLimit.LIMIT_100K;
        String givenLastUpdated = "2022-02-18T08:12:26.422Z";
        String givenSender2 = "441134960001";
        WhatsAppSenderQualityRating givenQualityRating2 = WhatsAppSenderQualityRating.LOW;
        WhatsAppSenderStatus givenStatus2 = WhatsAppSenderStatus.BANNED;
        WhatsAppSenderLimit givenCurrentLimit2 = WhatsAppSenderLimit.LIMIT_50;
        String givenLastUpdated2 = "2022-02-18T08:12:26.420Z";

        String givenResponse = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"qualityRating\": \"%s\",\n"
                        + "      \"status\": \"%s\",\n"
                        + "      \"currentLimit\": \"%s\",\n"
                        + "      \"lastUpdated\": \"%s\"\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"qualityRating\": \"%s\",\n"
                        + "      \"status\": \"%s\",\n"
                        + "      \"currentLimit\": \"%s\",\n"
                        + "      \"lastUpdated\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenSender,
                givenQualityRating,
                givenStatus,
                givenCurrentLimit,
                givenLastUpdated,
                givenSender2,
                givenQualityRating2,
                givenStatus2,
                givenCurrentLimit2,
                givenLastUpdated2);

        setUpGetRequest(SENDER_QUALITY, Map.of(), givenResponse, 200);

        WhatsAppApi api = new WhatsAppApi(getApiClient());

        Consumer<WhatsAppSenderQualityResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults().size()).isEqualTo(2);
            var result1 = response.getResults().get(0);
            then(result1.getSender()).isEqualTo(givenSender);
            then(result1.getQualityRating()).isEqualTo(givenQualityRating);
            then(result1.getStatus()).isEqualTo(givenStatus);
            then(result1.getCurrentLimit()).isEqualTo(givenCurrentLimit);
            then(result1.getLastUpdated()).isEqualTo(givenLastUpdated);
            var result2 = response.getResults().get(1);
            then(result2.getSender()).isEqualTo(givenSender2);
            then(result2.getQualityRating()).isEqualTo(givenQualityRating2);
            then(result2.getStatus()).isEqualTo(givenStatus2);
            then(result2.getCurrentLimit()).isEqualTo(givenCurrentLimit2);
            then(result2.getLastUpdated()).isEqualTo(givenLastUpdated2);
        };

        var call = api.getWhatsappSendersQuality(List.of("447796344125", "447796344126"));
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetBusinessInfoOfWhatsAppSender() {
        String givenAbout = "Infobip Business Account";
        String givenAddress = "35-38 New Bridge Street, London EC4V 6BW";
        String givenDescription = "Infobip is a global cloud communications platform.";
        String givenEmail = "info@example.com";
        WhatsAppBusinessVertical givenVertical = WhatsAppBusinessVertical.PROFESSIONAL_SERVICES;
        String givenWebsite = "https://www.infobip.com";
        String givenDisplayName = "Infobip";
        String givenResponse = String.format(
                "{\n" + "  \"about\": \"%s\",\n"
                        + "  \"address\": \"%s\",\n"
                        + "  \"description\": \"%s\",\n"
                        + "  \"email\": \"%s\",\n"
                        + "  \"vertical\": \"%s\",\n"
                        + "  \"websites\": [\n"
                        + "    \"%s\"\n"
                        + "  ],\n"
                        + "  \"displayName\": \"%s\"\n"
                        + "}",
                givenAbout, givenAddress, givenDescription, givenEmail, givenVertical, givenWebsite, givenDisplayName);

        String givenSender = "447796344125";

        setUpGetRequest(SENDER_BUSINESS_INFO.replace("{sender}", givenSender), Map.of(), givenResponse, 200);

        WhatsAppApi api = new WhatsAppApi(getApiClient());

        Consumer<WhatsAppBusinessInfoResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getAbout()).isEqualTo(givenAbout);
            then(response.getAddress()).isEqualTo(givenAddress);
            then(response.getDescription()).isEqualTo(givenDescription);
            then(response.getEmail()).isEqualTo(givenEmail);
            then(response.getVertical()).isEqualTo(givenVertical);
            then(response.getWebsites().size()).isEqualTo(1);
            then(response.getWebsites().get(0)).isEqualTo(givenWebsite);
            then(response.getDisplayName()).isEqualTo(givenDisplayName);
        };

        var call = api.getWhatsappSenderBusinessInfo(givenSender);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateBusinessInfoOfWhatsAppSender() {
        String expectedAbout = "Infobip Business Account";
        String expectedAddress = "35-38 New Bridge Street, London EC4V 6BW";
        String expectedDescription = "Infobip is a global cloud communications platform.";
        String expectedEmail = "info@example.com";
        WhatsAppBusinessVertical expectedVertical = WhatsAppBusinessVertical.PROFESSIONAL_SERVICES;
        String expectedWebsite = "https://www.infobip.com";
        String expectedLogoUrl = "https://example.com/logo";
        String expectedRequest = String.format(
                "{\n" + "  \"about\": \"%s\",\n"
                        + "  \"address\": \"%s\",\n"
                        + "  \"description\": \"%s\",\n"
                        + "  \"email\": \"%s\",\n"
                        + "  \"vertical\": \"%s\",\n"
                        + "  \"websites\": [\n"
                        + "    \"%s\"\n"
                        + "  ],\n"
                        + "  \"logoUrl\": \"%s\"\n"
                        + "}",
                expectedAbout,
                expectedAddress,
                expectedDescription,
                expectedEmail,
                expectedVertical,
                expectedWebsite,
                expectedLogoUrl);

        String givenSender = "447796344125";

        setUpNoResponseBodyPatchRequest(
                SENDER_BUSINESS_INFO.replace("{sender}", givenSender), Map.of(), expectedRequest, 204);

        WhatsAppApi api = new WhatsAppApi(getApiClient());

        var whatsAppBusinessInfoRequest = new WhatsAppBusinessInfoRequest()
                .about(expectedAbout)
                .address(expectedAddress)
                .description(expectedDescription)
                .email(expectedEmail)
                .vertical(WhatsAppBusinessVertical.PROFESSIONAL_SERVICES)
                .addWebsitesItem(expectedWebsite)
                .logoUrl(expectedLogoUrl);

        var call = api.updateWhatsappSenderBusinessInfo(givenSender, whatsAppBusinessInfoRequest);
        testSuccessfulCallWithNoBody(call::executeAsync, 204);
    }

    @Test
    void shouldDownloadBusinessLogoOfWhatsAppSender() {
        File file = new File("/usr/bin/logo.png");

        String givenSender = "447796344125";

        setUpGetRequest(SENDER_BUSINESS_LOGO.replace("{sender}", givenSender), Map.of(), file.toString(), 204);

        WhatsAppApi api = new WhatsAppApi(getApiClient());

        Consumer<File> assertions = (response) -> {
            then(response).isNotNull();
        };

        var call = api.getWhatsappSenderBusinessLogo(givenSender);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldAddWhatsAppSender() {
        String givenStatus = "SUBMITTED_FOR_REGISTRATION";
        String givenResponse = String.format("{\n" + "  \"status\": \"%s\"\n" + "}", givenStatus);

        String expectedCountryCode = "44";
        String expectedPhoneNumber = "7796344125";
        String expectedDisplayName = "Infobip";
        WhatsAppPhoneNumberRequest.TypeEnum expectedType = WhatsAppPhoneNumberRequest.TypeEnum.EXTERNAL_SMS;
        String expectedLocale = "en_US";
        String expectedRequest = String.format(
                "{\n" + "  \"countryCode\": \"%s\",\n"
                        + "  \"phoneNumber\": \"%s\",\n"
                        + "  \"displayName\": \"%s\",\n"
                        + "  \"type\": \"%s\",\n"
                        + "  \"locale\": \"%s\"\n"
                        + "}",
                expectedCountryCode, expectedPhoneNumber, expectedDisplayName, expectedType, expectedLocale);

        Long givenBusinessAccountId = 12345567897878L;

        var api = new WhatsAppApi(getApiClient());
        setUpPostRequest(
                ADD_SENDER.replace("{businessAccountId}", givenBusinessAccountId.toString()),
                expectedRequest,
                givenResponse,
                202);

        var whatsAppPhoneNumberRequest = new WhatsAppPhoneNumberRequest()
                .countryCode(expectedCountryCode)
                .phoneNumber(expectedPhoneNumber)
                .displayName(expectedDisplayName)
                .type(expectedType)
                .locale(expectedLocale);

        Consumer<WhatsAppSenderRegistrationResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getStatus()).isEqualTo(WhatsAppSenderRegistrationStatus.SUBMITTED_FOR_REGISTRATION);
        };

        var call = api.addWhatsappSender(givenBusinessAccountId, whatsAppPhoneNumberRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldRetryWhatsAppSenderVerification() {
        WhatsAppOtpRequest.TypeEnum expectedType = WhatsAppOtpRequest.TypeEnum.SMS;
        String expectedLocale = "en_US";
        String expectedRequest = String.format(
                "{\n" + "  \"type\": \"%s\",\n" + "  \"locale\": \"%s\"\n" + "}", expectedType, expectedLocale);

        String givenSender = "447796344125";

        var api = new WhatsAppApi(getApiClient());
        setUpNoResponseBodyPutRequest(
                SENDER_VERIFICATION.replace("{sender}", givenSender), Map.of(), expectedRequest, 202);

        var whatsAppOtpRequest = new WhatsAppOtpRequest().type(expectedType).locale(expectedLocale);

        var call = api.retryWhatsappSenderVerification(givenSender, whatsAppOtpRequest);
        testSuccessfulCallWithNoBody(call::executeAsync, 202);
    }

    @Test
    void shouldVerifyWhatsAppSender() {
        String expectedCode = "123456";
        String expectedRequest = String.format("{\n" + "  \"code\": \"%s\"\n" + "}", expectedCode);

        String givenSender = "447796344125";

        var api = new WhatsAppApi(getApiClient());
        setUpNoResponseBodyPostRequest(
                SENDER_VERIFICATION.replace("{sender}", givenSender), Map.of(), expectedRequest, 202);

        var whatsAppVerifyCodeRequest = new WhatsAppVerifyCodeRequest().code(expectedCode);

        var call = api.verifyWhatsappSender(givenSender, whatsAppVerifyCodeRequest);
        testSuccessfulCallWithNoBody(call::executeAsync, 202);
    }

    // WEBHOOKS
    private final JSON json = new JSON();

    @Test
    void shouldParseWhatsAppDeliveryReports() {
        var givenRequest = "{\n" + "  \"results\": [\n"
                + "    {\n"
                + "      \"bulkId\": \"\",\n"
                + "      \"price\": {\n"
                + "        \"pricePerMessage\": 0.21,\n"
                + "        \"currency\": \"BRL\"\n"
                + "      },\n"
                + "      \"status\": {\n"
                + "        \"id\": 5,\n"
                + "        \"groupId\": 3,\n"
                + "        \"groupName\": \"DELIVERED\",\n"
                + "        \"name\": \"DELIVERED_TO_HANDSET\",\n"
                + "        \"description\": \"Message delivered to handset\"\n"
                + "      },\n"
                + "      \"error\": {\n"
                + "        \"id\": 0,\n"
                + "        \"name\": \"NO_ERROR\",\n"
                + "        \"description\": \"No Error\",\n"
                + "        \"groupId\": 0,\n"
                + "        \"groupName\": \"OK\",\n"
                + "        \"permanent\": false\n"
                + "      },\n"
                + "      \"messageId\": \"fb469d73-d362-463f-b30f-1e959b53badc\",\n"
                + "      \"doneAt\": \"2019-04-09T16:01:56.494-0300\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"sentAt\": \"2019-04-09T16:00:58.647-0300\",\n"
                + "      \"to\": \"41793026731\"\n"
                + "    }\n"
                + "  ]\n"
                + "}\n";

        WhatsAppWebhookDeliveryResult deliveryResult =
                json.deserialize(givenRequest, WhatsAppWebhookDeliveryResult.class);

        then(deliveryResult).isNotNull();
        then(deliveryResult.getResults()).isNotNull();
        then(deliveryResult.getResults().size()).isEqualTo(1);
        then(deliveryResult.getResults().get(0).getClass()).isEqualTo(WhatsAppWebhookDeliveryReport.class);
        var report = (WhatsAppWebhookDeliveryReport) deliveryResult.getResults().get(0);
        then(report.getPrice().getClass()).isEqualTo(MessagePrice.class);
        then(report.getStatus().getClass()).isEqualTo(MessageStatus.class);
        then(report.getError().getClass()).isEqualTo(MessageError.class);
    }

    @Test
    void shouldParseWhatsAppIdentityChangeNotification() {
        String givenRequest = "{\n" + "  \"from\": \"41793026731\",\n"
                + "  \"content\": {\n"
                + "    \"description\": \"Security code changed.\",\n"
                + "    \"hash\": \"eU2Fdi4EMUw=\",\n"
                + "    \"type\": \"user_identity_changed\",\n"
                + "    \"userNumber\": \"385919998888\"\n"
                + "  },\n"
                + "  \"createdAt\": \"2022-01-18T23:23:09.206+0000\"\n"
                + "}\n";

        WhatsAppWebhookSystemEventResponse eventResponse =
                json.deserialize(givenRequest, WhatsAppWebhookSystemEventResponse.class);

        then(eventResponse).isNotNull();
        then(eventResponse.getContent().getClass()).isEqualTo(WhatsAppWebhookSystemEvent.class);
        then(eventResponse.getContent().getType()).isEqualTo(WhatsAppWebhookSystemEvent.TypeEnum.USER_IDENTITY_CHANGED);
    }

    @Test
    void shouldParseReceiveWhatsAppPaymentNotification() {
        String givenFrom = "41793026731";
        String givenContentFrom = "447860064555";
        String givenType = "payment";
        String givenReferenceId = "72123248136";
        String givenPaymentId = "fd3e847h2";
        WhatsAppWebhookPaymentNotification.PaymentStatusEnum givenPaymentStatus =
                WhatsAppWebhookPaymentNotification.PaymentStatusEnum.CAPTURED;
        WhatsAppWebhookPaymentNotification.CurrencyEnum givenCurrency =
                WhatsAppWebhookPaymentNotification.CurrencyEnum.INR;
        Integer givenTotalAmountValue = 21000;
        Integer givenTotalAmountOffset = 100;
        String givenCallbackData1 = "customData1";
        String givenId = "27194245144";
        WhatsAppWebhookPaymentTransactionNotification.TypeEnum givenTransactionType =
                WhatsAppWebhookPaymentTransactionNotification.TypeEnum.UPI;
        WhatsAppWebhookPaymentTransactionNotification.StatusEnum givenStatus =
                WhatsAppWebhookPaymentTransactionNotification.StatusEnum.SUCCESS;
        String givenCreatedTimestamp = "2023-01-01T01:00:00.000+0000";
        String givenUpdatedTimestamp = "2023-01-01T01:00:00.000+0000";
        String givenCreatedAtTimestamp = "2023-01-01T01:00:00.000+0000";
        String givenRequest = String.format(
                "{\n" + "  \"from\": \"%s\",\n"
                        + "  \"content\": {\n"
                        + "    \"from\": \"%s\",\n"
                        + "    \"type\": \"%s\",\n"
                        + "    \"referenceId\": \"%s\",\n"
                        + "    \"paymentId\": \"%s\",\n"
                        + "    \"paymentStatus\": \"%s\",\n"
                        + "    \"currency\": \"%s\",\n"
                        + "    \"totalAmountValue\": %d,\n"
                        + "    \"totalAmountOffset\": %d,\n"
                        + "    \"callbackData\": [\n"
                        + "      \"%s\"\n"
                        + "    ],\n"
                        + "    \"transactions\": [\n"
                        + "      {\n"
                        + "        \"id\": \"%s\",\n"
                        + "        \"type\": \"%s\",\n"
                        + "        \"status\": \"%s\",\n"
                        + "        \"createdTimestamp\": \"%s\",\n"
                        + "        \"updatedTimestamp\": \"%S\"\n"
                        + "      }\n"
                        + "    ]\n"
                        + "  },\n"
                        + "  \"createdAt\": \"%s\"\n"
                        + "}",
                givenFrom,
                givenContentFrom,
                givenType,
                givenReferenceId,
                givenPaymentId,
                givenPaymentStatus,
                givenCurrency,
                givenTotalAmountValue,
                givenTotalAmountOffset,
                givenCallbackData1,
                givenId,
                givenTransactionType,
                givenStatus,
                givenCreatedTimestamp,
                givenUpdatedTimestamp,
                givenCreatedAtTimestamp);

        WhatsAppWebhookPaymentNotificationResponse whatsAppWebhookPaymentNotificationResponse =
                json.deserialize(givenRequest, WhatsAppWebhookPaymentNotificationResponse.class);

        OffsetDateTime createdTimestamp = OffsetDateTime.of(2023, 1, 1, 1, 0, 0, 0, ZoneOffset.ofHours(0));
        OffsetDateTime updatedTimestamp = OffsetDateTime.of(2023, 1, 1, 1, 0, 0, 0, ZoneOffset.ofHours(0));
        OffsetDateTime createdAtTimestamp = OffsetDateTime.of(2023, 1, 1, 1, 0, 0, 0, ZoneOffset.ofHours(0));

        then(whatsAppWebhookPaymentNotificationResponse).isNotNull();
        then(whatsAppWebhookPaymentNotificationResponse.getFrom()).isEqualTo(givenFrom);
        then(whatsAppWebhookPaymentNotificationResponse.getContent()).isNotNull();
        var content = whatsAppWebhookPaymentNotificationResponse.getContent();
        then(content.getFrom()).isEqualTo(givenContentFrom);
        then(content.getType()).isEqualTo(givenType);
        then(content.getReferenceId()).isEqualTo(givenReferenceId);
        then(content.getPaymentId()).isEqualTo(givenPaymentId);
        then(content.getPaymentStatus()).isEqualTo(givenPaymentStatus);
        then(content.getCurrency()).isEqualTo(givenCurrency);
        then(content.getTotalAmountValue()).isEqualTo(givenTotalAmountValue);
        then(content.getTotalAmountOffset()).isEqualTo(givenTotalAmountOffset);
        then(content.getCallbackData().get(0)).isEqualTo(givenCallbackData1);
        then(content.getTransactions().size()).isEqualTo(1);
        var transaction = content.getTransactions().get(0);
        then(transaction.getId()).isEqualTo(givenId);
        then(transaction.getType()).isEqualTo(givenTransactionType);
        then(transaction.getStatus()).isEqualTo(givenStatus);
        then(transaction.getCreatedTimestamp()).isEqualTo(createdTimestamp);
        then(transaction.getUpdatedTimestamp()).isEqualTo(updatedTimestamp);
        then(whatsAppWebhookPaymentNotificationResponse.getCreatedAt()).isEqualTo(createdAtTimestamp);
    }

    @Test
    void shouldParseReceiveWhatsAppTemplateUpdate() {
        Long givenMessageTemplateId = 111L;
        String givenMessageTemplateName = "template_name";
        WhatsAppLanguage givenMessageTemplateLanguageName = EN;
        String givenTimestamp = "2019-11-09T16:00:00.000+0000";
        WhatsAppTemplatePushEventChange.TypeEnum givenType = WhatsAppTemplatePushEventChange.TypeEnum.STATUS_UPDATE;
        WhatsAppStatus givenNewStatus = APPROVED;
        WhatsAppReason givenReason = WhatsAppReason.NONE;
        String givenRequest = String.format(
                "{\n" + "  \"messageTemplateId\": %d,\n"
                        + "  \"messageTemplateName\": \"%s\",\n"
                        + "  \"messageTemplateLanguage\": \"%s\",\n"
                        + "  \"timestamp\": \"%s\",\n"
                        + "  \"change\": {\n"
                        + "    \"type\": \"%s\",\n"
                        + "    \"newStatus\": \"%s\",\n"
                        + "    \"reason\": \"%s\"\n"
                        + "  }\n"
                        + "}",
                givenMessageTemplateId,
                givenMessageTemplateName,
                givenMessageTemplateLanguageName,
                givenTimestamp,
                givenType,
                givenNewStatus,
                givenReason);

        WhatsAppTemplateUpdatePushEvent whatsAppTemplateUpdatePushEvent =
                json.deserialize(givenRequest, WhatsAppTemplateUpdatePushEvent.class);

        OffsetDateTime createdTimestamp = OffsetDateTime.of(2019, 11, 9, 16, 0, 0, 0, ZoneOffset.ofHours(0));

        then(whatsAppTemplateUpdatePushEvent).isNotNull();
        then(whatsAppTemplateUpdatePushEvent.getMessageTemplateId()).isEqualTo(givenMessageTemplateId);
        then(whatsAppTemplateUpdatePushEvent.getMessageTemplateName()).isEqualTo(givenMessageTemplateName);
        then(whatsAppTemplateUpdatePushEvent.getMessageTemplateLanguage()).isEqualTo(givenMessageTemplateLanguageName);
        then(whatsAppTemplateUpdatePushEvent.getTimestamp()).isEqualTo(createdTimestamp);
        then(whatsAppTemplateUpdatePushEvent.getChange()).isNotNull();
        var change = (WhatsAppTemplateStatusPushEventChange) whatsAppTemplateUpdatePushEvent.getChange();
        then(change.getType()).isEqualTo(givenType);
        then(change.getNewStatus()).isEqualTo(givenNewStatus);
        then(change.getReason()).isEqualTo(givenReason);
    }
}
