package com.infobip.api;

import static org.assertj.core.api.BDDAssertions.then;

import com.infobip.model.*;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

class WhatsAppApiTest extends ApiTest {
    @Test
    void shouldAudioMessageSendWhatsAppAudioMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"mediaUrl\": \"http://example.com/audio\"\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\"\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppAudioContent whatsAppAudioContent = new WhatsAppAudioContent().mediaUrl("http://example.com/audio");
        WhatsAppAudioMessage whatsAppAudioMessage = new WhatsAppAudioMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppAudioContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp");
        Consumer<WhatsAppSingleMessageInfo> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getTo()).isEqualTo("441134960001");
            then(response.getMessageCount()).isEqualTo(1);
            then(response.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(response.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus messageStatus = response.getStatus();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        setUpSuccessPostRequest("/whatsapp/1/message/audio", givenRequest, givenResponse);
        var call = whatsAppApi.sendWhatsAppAudioMessage(whatsAppAudioMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldMultipleContactsMessageSendWhatsAppContactMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"contacts\": [\n"
                + "      {\n"
                + "        \"addresses\": [\n"
                + "          {\n"
                + "            \"street\": \"Istarska\",\n"
                + "            \"city\": \"Vodnjan\",\n"
                + "            \"zip\": \"52215\",\n"
                + "            \"country\": \"Croatia\",\n"
                + "            \"countryCode\": \"HR\",\n"
                + "            \"type\": \"WORK\"\n"
                + "          },\n"
                + "          {\n"
                + "            \"street\": \"Istarska\",\n"
                + "            \"city\": \"Vodnjan\",\n"
                + "            \"zip\": \"52215\",\n"
                + "            \"country\": \"Croatia\",\n"
                + "            \"countryCode\": \"HR\",\n"
                + "            \"type\": \"HOME\"\n"
                + "          }\n"
                + "        ],\n"
                + "        \"birthday\": \"2010-01-01\",\n"
                + "        \"emails\": [\n"
                + "          {\n"
                + "            \"email\": \"John.Smith@example.com\",\n"
                + "            \"type\": \"WORK\"\n"
                + "          },\n"
                + "          {\n"
                + "            \"email\": \"John.Smith.priv@example.com\",\n"
                + "            \"type\": \"HOME\"\n"
                + "          }\n"
                + "        ],\n"
                + "        \"name\": {\n"
                + "          \"firstName\": \"John\",\n"
                + "          \"lastName\": \"Smith\",\n"
                + "          \"middleName\": \"B\",\n"
                + "          \"namePrefix\": \"Mr.\",\n"
                + "          \"formattedName\": \"Mr. John Smith\"\n"
                + "        },\n"
                + "        \"org\": {\n"
                + "          \"company\": \"Company Name\",\n"
                + "          \"department\": \"Department\",\n"
                + "          \"title\": \"Director\"\n"
                + "        },\n"
                + "        \"phones\": [\n"
                + "          {\n"
                + "            \"phone\": \"+441134960019\",\n"
                + "            \"type\": \"HOME\",\n"
                + "            \"waId\": \"441134960019\"\n"
                + "          },\n"
                + "          {\n"
                + "            \"phone\": \"+441134960000\",\n"
                + "            \"type\": \"WORK\",\n"
                + "            \"waId\": \"441134960000\"\n"
                + "          }\n"
                + "        ],\n"
                + "        \"urls\": [\n"
                + "          {\n"
                + "            \"url\": \"http://example.com/John.Smith\",\n"
                + "            \"type\": \"WORK\"\n"
                + "          },\n"
                + "          {\n"
                + "            \"url\": \"http://example.com/home/John.Smith\",\n"
                + "            \"type\": \"HOME\"\n"
                + "          }\n"
                + "        ]\n"
                + "      },\n"
                + "      {\n"
                + "        \"addresses\": [\n"
                + "          {\n"
                + "            \"street\": \"Istarska\",\n"
                + "            \"city\": \"Vodnjan\",\n"
                + "            \"zip\": \"52215\",\n"
                + "            \"country\": \"Croatia\",\n"
                + "            \"countryCode\": \"HR\",\n"
                + "            \"type\": \"WORK\"\n"
                + "          },\n"
                + "          {\n"
                + "            \"street\": \"Istarska\",\n"
                + "            \"city\": \"Vodnjan\",\n"
                + "            \"zip\": \"52215\",\n"
                + "            \"country\": \"Croatia\",\n"
                + "            \"countryCode\": \"HR\",\n"
                + "            \"type\": \"HOME\"\n"
                + "          }\n"
                + "        ],\n"
                + "        \"birthday\": \"2010-01-01\",\n"
                + "        \"emails\": [\n"
                + "          {\n"
                + "            \"email\": \"Alexander.Abraham@example.com\",\n"
                + "            \"type\": \"WORK\"\n"
                + "          },\n"
                + "          {\n"
                + "            \"email\": \"Alexander.Abraham.priv@example.com\",\n"
                + "            \"type\": \"HOME\"\n"
                + "          }\n"
                + "        ],\n"
                + "        \"name\": {\n"
                + "          \"firstName\": \"Alexander\",\n"
                + "          \"lastName\": \"Abraham\",\n"
                + "          \"middleName\": \"B\",\n"
                + "          \"namePrefix\": \"Mr.\",\n"
                + "          \"formattedName\": \"Mr. Alexander Abraham\"\n"
                + "        },\n"
                + "        \"org\": {\n"
                + "          \"company\": \"Company Name\",\n"
                + "          \"department\": \"Department\",\n"
                + "          \"title\": \"Director\"\n"
                + "        },\n"
                + "        \"phones\": [\n"
                + "          {\n"
                + "            \"phone\": \"+441134960010\",\n"
                + "            \"type\": \"HOME\",\n"
                + "            \"waId\": \"441134960010\"\n"
                + "          },\n"
                + "          {\n"
                + "            \"phone\": \"+441134960011\",\n"
                + "            \"type\": \"WORK\",\n"
                + "            \"waId\": \"441134960011\"\n"
                + "          }\n"
                + "        ],\n"
                + "        \"urls\": [\n"
                + "          {\n"
                + "            \"url\": \"http://example.com/Alexander.Abraham\",\n"
                + "            \"type\": \"WORK\"\n"
                + "          },\n"
                + "          {\n"
                + "            \"url\": \"http://example.com/home/Alexander.Abraham\",\n"
                + "            \"type\": \"HOME\"\n"
                + "          }\n"
                + "        ]\n"
                + "      }\n"
                + "    ]\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\"\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppAddressContent whatsappAddressContent = new WhatsAppAddressContent()
                .street("Istarska")
                .city("Vodnjan")
                .zip("52215")
                .country("Croatia")
                .countryCode("HR")
                .type(WhatsAppAddressType.WORK);
        WhatsAppAddressContent whatsappAddressContent2 = new WhatsAppAddressContent()
                .street("Istarska")
                .city("Vodnjan")
                .zip("52215")
                .country("Croatia")
                .countryCode("HR")
                .type(WhatsAppAddressType.HOME);
        List<WhatsAppAddressContent> whatsappAddressContentList =
                List.of(whatsappAddressContent, whatsappAddressContent2);
        WhatsAppEmailContent whatsappEmailContent =
                new WhatsAppEmailContent().email("John.Smith@example.com").type(WhatsAppEmailType.WORK);
        WhatsAppEmailContent whatsappEmailContent2 =
                new WhatsAppEmailContent().email("John.Smith.priv@example.com").type(WhatsAppEmailType.HOME);
        List<WhatsAppEmailContent> whatsappEmailContentList = List.of(whatsappEmailContent, whatsappEmailContent2);
        WhatsAppNameContent whatsappNameContent = new WhatsAppNameContent()
                .firstName("John")
                .lastName("Smith")
                .middleName("B")
                .namePrefix("Mr.")
                .formattedName("Mr. John Smith");
        WhatsAppOrganizationContent whatsappOrganizationContent = new WhatsAppOrganizationContent()
                .company("Company Name")
                .department("Department")
                .title("Director");
        WhatsAppPhoneContent whatsappPhoneContent = new WhatsAppPhoneContent()
                .phone("+441134960019")
                .type(WhatsAppPhoneType.HOME)
                .waId("441134960019");
        WhatsAppPhoneContent whatsappPhoneContent2 = new WhatsAppPhoneContent()
                .phone("+441134960000")
                .type(WhatsAppPhoneType.WORK)
                .waId("441134960000");
        List<WhatsAppPhoneContent> whatsappPhoneContentList = List.of(whatsappPhoneContent, whatsappPhoneContent2);
        WhatsAppUrlContent whatsappUrlContent =
                new WhatsAppUrlContent().url("http://example.com/John.Smith").type(WhatsAppUrlType.WORK);
        WhatsAppUrlContent whatsappUrlContent2 = new WhatsAppUrlContent()
                .url("http://example.com/home/John.Smith")
                .type(WhatsAppUrlType.HOME);
        List<WhatsAppUrlContent> whatsappUrlContentList = List.of(whatsappUrlContent, whatsappUrlContent2);
        WhatsAppContactContent whatsappContactContent = new WhatsAppContactContent()
                .addresses(whatsappAddressContentList)
                .birthday("2010-01-01")
                .emails(whatsappEmailContentList)
                .name(whatsappNameContent)
                .org(whatsappOrganizationContent)
                .phones(whatsappPhoneContentList)
                .urls(whatsappUrlContentList);
        WhatsAppAddressContent whatsappAddressContent3 = new WhatsAppAddressContent()
                .street("Istarska")
                .city("Vodnjan")
                .zip("52215")
                .country("Croatia")
                .countryCode("HR")
                .type(WhatsAppAddressType.WORK);
        WhatsAppAddressContent whatsappAddressContent4 = new WhatsAppAddressContent()
                .street("Istarska")
                .city("Vodnjan")
                .zip("52215")
                .country("Croatia")
                .countryCode("HR")
                .type(WhatsAppAddressType.HOME);
        List<WhatsAppAddressContent> whatsappAddressContentList2 =
                List.of(whatsappAddressContent3, whatsappAddressContent4);
        WhatsAppEmailContent whatsappEmailContent3 = new WhatsAppEmailContent()
                .email("Alexander.Abraham@example.com")
                .type(WhatsAppEmailType.WORK);
        WhatsAppEmailContent whatsappEmailContent4 = new WhatsAppEmailContent()
                .email("Alexander.Abraham.priv@example.com")
                .type(WhatsAppEmailType.HOME);
        List<WhatsAppEmailContent> whatsappEmailContentList2 = List.of(whatsappEmailContent3, whatsappEmailContent4);
        WhatsAppNameContent whatsappNameContent2 = new WhatsAppNameContent()
                .firstName("Alexander")
                .lastName("Abraham")
                .middleName("B")
                .namePrefix("Mr.")
                .formattedName("Mr. Alexander Abraham");
        WhatsAppOrganizationContent whatsappOrganizationContent2 = new WhatsAppOrganizationContent()
                .company("Company Name")
                .department("Department")
                .title("Director");
        WhatsAppPhoneContent whatsappPhoneContent3 = new WhatsAppPhoneContent()
                .phone("+441134960010")
                .type(WhatsAppPhoneType.HOME)
                .waId("441134960010");
        WhatsAppPhoneContent whatsappPhoneContent4 = new WhatsAppPhoneContent()
                .phone("+441134960011")
                .type(WhatsAppPhoneType.WORK)
                .waId("441134960011");
        List<WhatsAppPhoneContent> whatsappPhoneContentList2 = List.of(whatsappPhoneContent3, whatsappPhoneContent4);
        WhatsAppUrlContent whatsappUrlContent3 = new WhatsAppUrlContent()
                .url("http://example.com/Alexander.Abraham")
                .type(WhatsAppUrlType.WORK);
        WhatsAppUrlContent whatsappUrlContent4 = new WhatsAppUrlContent()
                .url("http://example.com/home/Alexander.Abraham")
                .type(WhatsAppUrlType.HOME);
        List<WhatsAppUrlContent> whatsappUrlContentList2 = List.of(whatsappUrlContent3, whatsappUrlContent4);
        WhatsAppContactContent whatsappContactContent2 = new WhatsAppContactContent()
                .addresses(whatsappAddressContentList2)
                .birthday("2010-01-01")
                .emails(whatsappEmailContentList2)
                .name(whatsappNameContent2)
                .org(whatsappOrganizationContent2)
                .phones(whatsappPhoneContentList2)
                .urls(whatsappUrlContentList2);
        List<WhatsAppContactContent> whatsappContactContentList =
                List.of(whatsappContactContent, whatsappContactContent2);
        WhatsAppContactsContent whatsappContactsContent =
                new WhatsAppContactsContent().contacts(whatsappContactContentList);
        WhatsAppContactsMessage whatsappContactsMessage = new WhatsAppContactsMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsappContactsContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp");
        setUpSuccessPostRequest("/whatsapp/1/message/contact", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus messageStatus = whatsAppSingleMessageInfo.getStatus();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsAppContactMessage(whatsappContactsMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendSingleContactMessageSendWhatsAppContactMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"contacts\": [\n"
                + "      {\n"
                + "        \"addresses\": [\n"
                + "          {\n"
                + "            \"street\": \"Istarska\",\n"
                + "            \"city\": \"Vodnjan\",\n"
                + "            \"zip\": \"52215\",\n"
                + "            \"country\": \"Croatia\",\n"
                + "            \"countryCode\": \"HR\",\n"
                + "            \"type\": \"WORK\"\n"
                + "          },\n"
                + "          {\n"
                + "            \"street\": \"Istarska\",\n"
                + "            \"city\": \"Vodnjan\",\n"
                + "            \"zip\": \"52215\",\n"
                + "            \"country\": \"Croatia\",\n"
                + "            \"countryCode\": \"HR\",\n"
                + "            \"type\": \"HOME\"\n"
                + "          }\n"
                + "        ],\n"
                + "        \"birthday\": \"2010-01-01\",\n"
                + "        \"emails\": [\n"
                + "          {\"email\": \"John.Smith@example.com\", \"type\": \"WORK\"},\n"
                + "          {\"email\": \"John.Smith.priv@example.com\", \"type\": \"HOME\"}\n"
                + "        ],\n"
                + "        \"name\": {\n"
                + "          \"firstName\": \"John\",\n"
                + "          \"lastName\": \"Smith\",\n"
                + "          \"middleName\": \"B\",\n"
                + "          \"namePrefix\": \"Mr.\",\n"
                + "          \"formattedName\": \"Mr. John Smith\"\n"
                + "        },\n"
                + "        \"org\": {\"company\": \"Company Name\", \"department\": \"Department\", \"title\": \"Director\"},\n"
                + "        \"phones\": [\n"
                + "          {\"phone\": \"+441134960019\", \"type\": \"HOME\", \"waId\": \"441134960019\"},\n"
                + "          {\"phone\": \"+441134960000\", \"type\": \"WORK\", \"waId\": \"441134960000\"}\n"
                + "        ],\n"
                + "        \"urls\": [\n"
                + "          {\"url\": \"http://example.com/John.Smith\", \"type\": \"WORK\"},\n"
                + "          {\"url\": \"http://example.com/home/John.Smith\", \"type\": \"HOME\"}\n"
                + "        ]\n"
                + "      }\n"
                + "    ]\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\"\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppAddressContent whatsAppAddressContent1 = new WhatsAppAddressContent()
                .street("Istarska")
                .city("Vodnjan")
                .zip("52215")
                .country("Croatia")
                .countryCode("HR")
                .type(WhatsAppAddressType.WORK);
        WhatsAppAddressContent whatsAppAddressContent2 = new WhatsAppAddressContent()
                .street("Istarska")
                .city("Vodnjan")
                .zip("52215")
                .country("Croatia")
                .countryCode("HR")
                .type(WhatsAppAddressType.HOME);
        List<WhatsAppAddressContent> whatsAppAddressContentList =
                List.of(whatsAppAddressContent1, whatsAppAddressContent2);
        WhatsAppEmailContent whatsAppEmailContent1 =
                new WhatsAppEmailContent().email("John.Smith@example.com").type(WhatsAppEmailType.WORK);
        WhatsAppEmailContent whatsAppEmailContent2 =
                new WhatsAppEmailContent().email("John.Smith.priv@example.com").type(WhatsAppEmailType.HOME);
        List<WhatsAppEmailContent> whatsAppEmailContentList = List.of(whatsAppEmailContent1, whatsAppEmailContent2);
        WhatsAppNameContent whatsAppNameContent = new WhatsAppNameContent()
                .firstName("John")
                .lastName("Smith")
                .middleName("B")
                .namePrefix("Mr.")
                .formattedName("Mr. John Smith");
        WhatsAppOrganizationContent whatsAppOrganizationContent = new WhatsAppOrganizationContent()
                .company("Company Name")
                .department("Department")
                .title("Director");
        WhatsAppPhoneContent whatsAppPhoneContent1 = new WhatsAppPhoneContent()
                .phone("+441134960019")
                .type(WhatsAppPhoneType.HOME)
                .waId("441134960019");
        WhatsAppPhoneContent whatsAppPhoneContent2 = new WhatsAppPhoneContent()
                .phone("+441134960000")
                .type(WhatsAppPhoneType.WORK)
                .waId("441134960000");
        List<WhatsAppPhoneContent> whatsAppPhoneContentList = List.of(whatsAppPhoneContent1, whatsAppPhoneContent2);
        WhatsAppUrlContent whatsAppUrlContent1 =
                new WhatsAppUrlContent().url("http://example.com/John.Smith").type(WhatsAppUrlType.WORK);
        WhatsAppUrlContent whatsAppUrlContent2 = new WhatsAppUrlContent()
                .url("http://example.com/home/John.Smith")
                .type(WhatsAppUrlType.HOME);
        List<WhatsAppUrlContent> whatsAppUrlContentList = List.of(whatsAppUrlContent1, whatsAppUrlContent2);
        WhatsAppContactContent whatsAppContactContent = new WhatsAppContactContent()
                .addresses(whatsAppAddressContentList)
                .birthday("2010-01-01")
                .emails(whatsAppEmailContentList)
                .name(whatsAppNameContent)
                .org(whatsAppOrganizationContent)
                .phones(whatsAppPhoneContentList)
                .urls(whatsAppUrlContentList);
        List<WhatsAppContactContent> whatsAppContactContentList = List.of(whatsAppContactContent);
        WhatsAppContactsContent whatsAppContactsContent =
                new WhatsAppContactsContent().contacts(whatsAppContactContentList);
        WhatsAppContactsMessage whatsAppContactsMessage = new WhatsAppContactsMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppContactsContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp");
        setUpSuccessPostRequest("/whatsapp/1/message/contact", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getTo()).isEqualTo("441134960001");
            then(response.getMessageCount()).isEqualTo(1);
            then(response.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(response.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = response.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsAppContactMessage(whatsAppContactsMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDocumentMessageSendWhatsAppDocumentMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"mediaUrl\": \"http://example.com/document\"\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppDocumentContent whatsAppDocumentContent =
                new WhatsAppDocumentContent().mediaUrl("http://example.com/document");
        WhatsAppDocumentMessage whatsAppDocumentMessage = new WhatsAppDocumentMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppDocumentContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/document", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus messageStatus = whatsAppSingleMessageInfo.getStatus();
            then(messageStatus).isNotNull();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsAppDocumentMessage(whatsAppDocumentMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDocumentMessageWithAllFieldsSendWhatsAppDocumentMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"mediaUrl\": \"http://example.com/document\",\n"
                + "    \"caption\": \"Some document caption\",\n"
                + "    \"filename\": \"filename.pdf\"\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppDocumentContent whatsAppDocumentContent = new WhatsAppDocumentContent()
                .mediaUrl("http://example.com/document")
                .caption("Some document caption")
                .filename("filename.pdf");
        WhatsAppDocumentMessage whatsAppDocumentMessage = new WhatsAppDocumentMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppDocumentContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/document", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus messageStatus = whatsAppSingleMessageInfo.getStatus();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsAppDocumentMessage(whatsAppDocumentMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendImageMessageSendWhatsAppImageMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"mediaUrl\": \"http://example.com/image\"\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppImageContent whatsAppImageContent = new WhatsAppImageContent().mediaUrl("http://example.com/image");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppImageMessage whatsAppImageMessage = new WhatsAppImageMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppImageContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/image", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus messageStatus = whatsAppSingleMessageInfo.getStatus();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsAppImageMessage(whatsAppImageMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendImageMessageWithCaptionSendWhatsAppImageMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"mediaUrl\": \"http://example.com/image\",\n"
                + "    \"caption\": \"Some image caption\"\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n            \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppImageContent whatsAppImageContent =
                new WhatsAppImageContent().mediaUrl("http://example.com/image").caption("Some image caption");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppImageMessage whatsAppImageMessage = new WhatsAppImageMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppImageContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/image", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getTo()).isEqualTo("441134960001");
            then(response.getMessageCount()).isEqualTo(1);
            then(response.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus messageStatus = response.getStatus();
            then(messageStatus).isNotNull();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsAppImageMessage(whatsAppImageMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendDocumentHeaderInteractiveReplyButtonsMessageSendWhatsAppInteractiveButtonsMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    },\n"
                + "    \"action\": {\n"
                + "      \"buttons\": [\n"
                + "        {\n"
                + "          \"type\": \"REPLY\",\n"
                + "          \"id\": \"1\",\n"
                + "          \"title\": \"Yes\"\n"
                + "        },\n"
                + "        {\n"
                + "          \"type\": \"REPLY\",\n"
                + "          \"id\": \"2\",\n"
                + "          \"title\": \"No\"\n"
                + "        }\n"
                + "      ]\n"
                + "    },\n"
                + "    \"header\": {\n"
                + "      \"type\": \"DOCUMENT\",\n"
                + "      \"mediaUrl\": \"https://example.com/document\",\n"
                + "      \"filename\": \"document.pdf\"\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"Footer\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n            \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveButtonsDocumentHeaderContent whatsAppInteractiveButtonsDocumentHeaderContent =
                new WhatsAppInteractiveButtonsDocumentHeaderContent()
                        .mediaUrl("https://example.com/document")
                        .filename("document.pdf");
        WhatsAppInteractiveButtonContent whatsAppInteractiveReplyButtonContent =
                new WhatsAppInteractiveReplyButtonContent().id("1").title("Yes");
        WhatsAppInteractiveButtonContent whatsAppInteractiveReplyButtonContent2 =
                new WhatsAppInteractiveReplyButtonContent().id("2").title("No");
        List<WhatsAppInteractiveButtonContent> whatsAppInteractiveReplyButtonContentList =
                List.of(whatsAppInteractiveReplyButtonContent, whatsAppInteractiveReplyButtonContent2);
        WhatsAppInteractiveButtonsActionContent whatsAppInteractiveButtonsActionContent =
                new WhatsAppInteractiveButtonsActionContent().buttons(whatsAppInteractiveReplyButtonContentList);
        WhatsAppInteractiveBodyContent whatsAppInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveFooterContent whatsAppInteractiveFooterContent =
                new WhatsAppInteractiveFooterContent().text("Footer");
        WhatsAppInteractiveButtonsContent whatsAppInteractiveButtonsContent = new WhatsAppInteractiveButtonsContent()
                .body(whatsAppInteractiveBodyContent)
                .action(whatsAppInteractiveButtonsActionContent)
                .header(whatsAppInteractiveButtonsDocumentHeaderContent)
                .footer(whatsAppInteractiveFooterContent);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveButtonsMessage whatsAppInteractiveButtonsMessage = new WhatsAppInteractiveButtonsMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppInteractiveButtonsContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/buttons", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsAppInteractiveButtonsMessage(whatsAppInteractiveButtonsMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendImageHeaderInteractiveReplyButtonsMessageSendWhatsAppInteractiveButtonsMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    },\n"
                + "    \"action\": {\n"
                + "      \"buttons\": [\n"
                + "        {\n"
                + "          \"type\": \"REPLY\",\n"
                + "          \"id\": \"1\",\n"
                + "          \"title\": \"Yes\"\n"
                + "        },\n"
                + "        {\n"
                + "          \"type\": \"REPLY\",\n"
                + "          \"id\": \"2\",\n"
                + "          \"title\": \"No\"\n"
                + "        }\n"
                + "      ]\n"
                + "    },\n"
                + "    \"header\": {\n"
                + "      \"type\": \"IMAGE\",\n"
                + "      \"mediaUrl\": \"https://example.com/image\"\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"Footer\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveButtonContent whatsappInteractiveReplyButtonContent =
                new WhatsAppInteractiveReplyButtonContent().id("1").title("Yes");
        WhatsAppInteractiveButtonContent whatsappInteractiveReplyButtonContent2 =
                new WhatsAppInteractiveReplyButtonContent().id("2").title("No");
        List<WhatsAppInteractiveButtonContent> whatsAppInteractiveReplyButtonContentList =
                List.of(whatsappInteractiveReplyButtonContent, whatsappInteractiveReplyButtonContent2);
        WhatsAppInteractiveButtonsActionContent whatsappInteractiveButtonsActionContent =
                new WhatsAppInteractiveButtonsActionContent().buttons(whatsAppInteractiveReplyButtonContentList);
        WhatsAppInteractiveBodyContent whatsappInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveButtonsImageHeaderContent whatsappInteractiveButtonsImageHeaderContent =
                new WhatsAppInteractiveButtonsImageHeaderContent().mediaUrl("https://example.com/image");
        WhatsAppInteractiveFooterContent whatsappInteractiveFooterContent =
                new WhatsAppInteractiveFooterContent().text("Footer");
        WhatsAppInteractiveButtonsContent whatsappInteractiveButtonsContent = new WhatsAppInteractiveButtonsContent()
                .body(whatsappInteractiveBodyContent)
                .action(whatsappInteractiveButtonsActionContent)
                .header(whatsappInteractiveButtonsImageHeaderContent)
                .footer(whatsappInteractiveFooterContent);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveButtonsMessage whatsappInteractiveButtonsMessage = new WhatsAppInteractiveButtonsMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsappInteractiveButtonsContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/buttons", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsappSingleMessageInfo) -> {
            then(whatsappSingleMessageInfo).isNotNull();
            then(whatsappSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsappSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsappSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsappSingleMessageStatus = whatsappSingleMessageInfo.getStatus();
            then(whatsappSingleMessageStatus).isNotNull();
            then(whatsappSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsappSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsappSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsappSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsappSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsAppInteractiveButtonsMessage(whatsappInteractiveButtonsMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendInteractiveReplyButtonsMessageSendWhatsAppInteractiveButtonsMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    },\n"
                + "    \"action\": {\n"
                + "      \"buttons\": [\n"
                + "        {\n"
                + "          \"type\": \"REPLY\",\n"
                + "          \"id\": \"1\",\n"
                + "          \"title\": \"Yes\"\n"
                + "        },\n"
                + "        {\n"
                + "          \"type\": \"REPLY\",\n                "
                + "          \"id\": \"2\",\n"
                + "          \"title\": \"No\"\n"
                + "        }\n"
                + "      ]\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"Footer\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveReplyButtonContent whatsAppInteractiveReplyButtonContent =
                new WhatsAppInteractiveReplyButtonContent().id("1").title("Yes");
        WhatsAppInteractiveReplyButtonContent whatsAppInteractiveReplyButtonContent2 =
                new WhatsAppInteractiveReplyButtonContent().id("2").title("No");
        WhatsAppInteractiveBodyContent whatsAppInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveButtonsActionContent whatsAppInteractiveButtonsActionContent =
                new WhatsAppInteractiveButtonsActionContent()
                        .addButtonsItem(whatsAppInteractiveReplyButtonContent)
                        .addButtonsItem(whatsAppInteractiveReplyButtonContent2);
        WhatsAppInteractiveFooterContent whatsAppInteractiveFooterContent =
                new WhatsAppInteractiveFooterContent().text("Footer");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveButtonsContent whatsAppInteractiveButtonsContent = new WhatsAppInteractiveButtonsContent()
                .body(whatsAppInteractiveBodyContent)
                .action(whatsAppInteractiveButtonsActionContent)
                .footer(whatsAppInteractiveFooterContent);
        WhatsAppInteractiveButtonsMessage whatsAppInteractiveButtonsMessage = new WhatsAppInteractiveButtonsMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppInteractiveButtonsContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/buttons", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus messageStatus = whatsAppSingleMessageInfo.getStatus();
            then(messageStatus).isNotNull();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsAppInteractiveButtonsMessage(whatsAppInteractiveButtonsMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldTextHeaderInteractiveReplyButtonsMessageSendWhatsAppInteractiveButtonsMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    },\n"
                + "    \"action\": {\n"
                + "      \"buttons\": [\n"
                + "        {\n"
                + "          \"type\": \"REPLY\",\n"
                + "          \"id\": \"1\",\n"
                + "          \"title\": \"Yes\"\n"
                + "        },\n"
                + "        {\n"
                + "          \"type\": \"REPLY\",\n"
                + "          \"id\": \"2\",\n"
                + "          \"title\": \"No\"\n"
                + "        }\n"
                + "      ]\n"
                + "    },\n"
                + "    \"header\": {\n"
                + "      \"type\": \"TEXT\",\n"
                + "      \"text\": \"Header\"\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"Footer\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n            \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveButtonsMessage whatsAppInteractiveButtonsMessage = new WhatsAppInteractiveButtonsMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp");
        WhatsAppInteractiveBodyContent whatsAppInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveReplyButtonContent whatsAppInteractiveReplyButtonContent1 =
                new WhatsAppInteractiveReplyButtonContent().id("1").title("Yes");
        WhatsAppInteractiveReplyButtonContent whatsAppInteractiveReplyButtonContent2 =
                new WhatsAppInteractiveReplyButtonContent().id("2").title("No");
        List<WhatsAppInteractiveButtonContent> whatsappInteractiveButtonContentList =
                List.of(whatsAppInteractiveReplyButtonContent1, whatsAppInteractiveReplyButtonContent2);
        WhatsAppInteractiveButtonsActionContent whatsAppInteractiveButtonsActionContent =
                new WhatsAppInteractiveButtonsActionContent().buttons(whatsappInteractiveButtonContentList);
        WhatsAppInteractiveButtonsTextHeaderContent whatsAppInteractiveButtonsTextHeaderContent =
                new WhatsAppInteractiveButtonsTextHeaderContent().text("Header");
        WhatsAppInteractiveFooterContent whatsAppInteractiveFooterContent =
                new WhatsAppInteractiveFooterContent().text("Footer");
        WhatsAppInteractiveButtonsContent whatsAppInteractiveButtonsContent = new WhatsAppInteractiveButtonsContent()
                .body(whatsAppInteractiveBodyContent)
                .action(whatsAppInteractiveButtonsActionContent)
                .header(whatsAppInteractiveButtonsTextHeaderContent)
                .footer(whatsAppInteractiveFooterContent);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        whatsAppInteractiveButtonsMessage.setContent(whatsAppInteractiveButtonsContent);
        whatsAppInteractiveButtonsMessage.setUrlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/buttons", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsAppInteractiveButtonsMessage(whatsAppInteractiveButtonsMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendVideoHeaderInteractiveReplyButtonsMessageSendWhatsAppInteractiveButtonsMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    },\n"
                + "    \"action\": {\n"
                + "      \"buttons\": [\n"
                + "        {\n"
                + "          \"type\": \"REPLY\",\n"
                + "          \"id\": \"1\",\n"
                + "          \"title\": \"Yes\"\n"
                + "        },\n"
                + "        {\n"
                + "          \"type\": \"REPLY\",\n"
                + "          \"id\": \"2\",\n"
                + "          \"title\": \"No\"\n"
                + "        }\n"
                + "      ]\n"
                + "    },\n"
                + "    \"header\": {\n"
                + "      \"type\": \"VIDEO\",\n"
                + "      \"mediaUrl\": \"https://example.com/video\"\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"Footer\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n                "
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveButtonsVideoHeaderContent whatsappInteractiveButtonsVideoHeaderContent =
                new WhatsAppInteractiveButtonsVideoHeaderContent().mediaUrl("https://example.com/video");
        WhatsAppInteractiveBodyContent whatsappInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveButtonContent whatsAppInteractiveReplyButtonContent1 =
                new WhatsAppInteractiveReplyButtonContent().id("1").title("Yes");
        WhatsAppInteractiveButtonContent whatsAppInteractiveReplyButtonContent2 =
                new WhatsAppInteractiveReplyButtonContent().id("2").title("No");
        List<WhatsAppInteractiveButtonContent> whatsAppInteractiveReplyButtonContentList =
                List.of(whatsAppInteractiveReplyButtonContent1, whatsAppInteractiveReplyButtonContent2);
        WhatsAppInteractiveButtonsActionContent whatsAppInteractiveButtonsActionContent =
                new WhatsAppInteractiveButtonsActionContent().buttons(whatsAppInteractiveReplyButtonContentList);
        WhatsAppInteractiveFooterContent whatsAppInteractiveFooterContent =
                new WhatsAppInteractiveFooterContent().text("Footer");
        WhatsAppInteractiveButtonsContent whatsAppInteractiveButtonsContent = new WhatsAppInteractiveButtonsContent()
                .header(whatsappInteractiveButtonsVideoHeaderContent)
                .body(whatsappInteractiveBodyContent)
                .action(whatsAppInteractiveButtonsActionContent)
                .footer(whatsAppInteractiveFooterContent);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveButtonsMessage whatsAppInteractiveButtonsMessage = new WhatsAppInteractiveButtonsMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppInteractiveButtonsContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/buttons", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus messageStatus = whatsAppSingleMessageInfo.getStatus();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsAppInteractiveButtonsMessage(whatsAppInteractiveButtonsMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldHeaderAndFooterInteractiveFlowMessageSendWhatsappInteractiveFlowMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    },\n"
                + "    \"action\": {\n"
                + "      \"mode\": \"PUBLISHED\",\n"
                + "      \"flowMessageVersion\": 3,\n"
                + "      \"flowToken\": \"Flow token\",\n"
                + "      \"flowId\": \"98E8D4AA79E2697757FAA\",\n"
                + "      \"callToActionButton\": \"Button text\",\n"
                + "      \"flowAction\": \"NAVIGATE\",\n"
                + "      \"flowActionPayload\": {\n"
                + "        \"screen\": \"product_screen\",\n"
                + "        \"data\": {\n"
                + "          \"product_name\": \"name\",\n"
                + "          \"product_price\": 200\n"
                + "        }\n"
                + "      }\n"
                + "    },\n"
                + "    \"header\": {\n"
                + "      \"type\": \"TEXT\",\n"
                + "      \"text\": \"Header text\"\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"Footer text\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n                "
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveFlowTextHeaderContent whatsAppInteractiveFlowTextHeaderContent =
                new WhatsAppInteractiveFlowTextHeaderContent().text("Header text");
        WhatsAppInteractiveFooterContent whatsAppInteractiveFooterContent =
                new WhatsAppInteractiveFooterContent().text("Footer text");
        WhatsAppInteractiveBodyContent whatsAppInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveFlowActionPayload whatsAppInteractiveFlowActionPayload =
                new WhatsAppInteractiveFlowActionPayload().screen("product_screen");
        whatsAppInteractiveFlowActionPayload.putDataItem("product_name", "name");
        whatsAppInteractiveFlowActionPayload.putDataItem("product_price", 200);
        WhatsAppInteractiveFlowActionContent whatsAppInteractiveFlowActionContent =
                new WhatsAppInteractiveFlowActionContent()
                        .mode(WhatsAppInteractiveFlowActionMode.PUBLISHED)
                        .flowMessageVersion(3)
                        .flowToken("Flow token")
                        .flowId("98E8D4AA79E2697757FAA")
                        .callToActionButton("Button text")
                        .flowAction(WhatsAppInteractiveFlowAction.NAVIGATE)
                        .flowActionPayload(whatsAppInteractiveFlowActionPayload);
        WhatsAppInteractiveFlowContent whatsAppInteractiveFlowContent = new WhatsAppInteractiveFlowContent()
                .body(whatsAppInteractiveBodyContent)
                .action(whatsAppInteractiveFlowActionContent)
                .header(whatsAppInteractiveFlowTextHeaderContent)
                .footer(whatsAppInteractiveFooterContent);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveFlowMessage whatsAppInteractiveFlowMessage = new WhatsAppInteractiveFlowMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppInteractiveFlowContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus whatsAppSingleMessageInfoStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageInfoStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageInfoStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageInfoStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageInfoStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageInfoStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/flow", givenRequest, givenResponse);
        var call = whatsAppApi.sendWhatsappInteractiveFlowMessage(whatsAppInteractiveFlowMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldInteractiveFlowMessageSendWhatsappInteractiveFlowMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    },\n"
                + "    \"action\": {\n"
                + "      \"mode\": \"PUBLISHED\",\n"
                + "      \"flowMessageVersion\": 3,\n"
                + "      \"flowToken\": \"Flow token\",\n"
                + "      \"flowId\": \"98E8D4AA79E2697757FAA\",\n"
                + "      \"callToActionButton\": \"Button text\",\n"
                + "      \"flowAction\": \"NAVIGATE\",\n"
                + "      \"flowActionPayload\": {\n"
                + "        \"screen\": \"product_screen\",\n"
                + "        \"data\": {\n"
                + "          \"product_name\": \"name\",\n"
                + "          \"product_price\": 200\n"
                + "        }\n"
                + "      }\n"
                + "    }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n                "
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveBodyContent whatsAppInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveFlowActionPayload whatsAppInteractiveFlowActionPayload =
                new WhatsAppInteractiveFlowActionPayload()
                        .screen("product_screen")
                        .putDataItem("product_name", "name")
                        .putDataItem("product_price", 200);
        WhatsAppInteractiveFlowActionContent whatsAppInteractiveFlowActionContent =
                new WhatsAppInteractiveFlowActionContent()
                        .mode(WhatsAppInteractiveFlowActionMode.PUBLISHED)
                        .flowMessageVersion(3)
                        .flowToken("Flow token")
                        .flowId("98E8D4AA79E2697757FAA")
                        .callToActionButton("Button text")
                        .flowAction(WhatsAppInteractiveFlowAction.NAVIGATE)
                        .flowActionPayload(whatsAppInteractiveFlowActionPayload);
        WhatsAppInteractiveFlowContent whatsAppInteractiveFlowContent = new WhatsAppInteractiveFlowContent()
                .body(whatsAppInteractiveBodyContent)
                .action(whatsAppInteractiveFlowActionContent);
        WhatsAppInteractiveFlowMessage whatsAppInteractiveFlowMessage = new WhatsAppInteractiveFlowMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppInteractiveFlowContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/flow", givenRequest, givenResponse);
        var call = whatsAppApi.sendWhatsappInteractiveFlowMessage(whatsAppInteractiveFlowMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendHeaderInteractiveListMessageSendWhatsAppInteractiveListMessage() {
        WhatsAppInteractiveRowContent whatsappInteractiveRowContent1 = new WhatsAppInteractiveRowContent()
                .id("1")
                .title("first row title")
                .description("first row description");
        WhatsAppInteractiveRowContent whatsappInteractiveRowContent2 = new WhatsAppInteractiveRowContent()
                .id("2")
                .title("second row title")
                .description("second row description");
        List<WhatsAppInteractiveRowContent> whatsappInteractiveRowContentList1 =
                List.of(whatsappInteractiveRowContent1, whatsappInteractiveRowContent2);
        WhatsAppInteractiveListSectionContent whatsappInteractiveListSectionContent1 =
                new WhatsAppInteractiveListSectionContent()
                        .title("First section title")
                        .rows(whatsappInteractiveRowContentList1);
        WhatsAppInteractiveRowContent whatsappInteractiveRowContent3 =
                new WhatsAppInteractiveRowContent().id("3").title("third row title");
        List<WhatsAppInteractiveRowContent> whatsappInteractiveRowContentList2 =
                List.of(whatsappInteractiveRowContent3);
        WhatsAppInteractiveListSectionContent whatsappInteractiveListSectionContent2 =
                new WhatsAppInteractiveListSectionContent()
                        .title("Second section title")
                        .rows(whatsappInteractiveRowContentList2);
        List<WhatsAppInteractiveListSectionContent> whatsappInteractiveListSectionContentList =
                List.of(whatsappInteractiveListSectionContent1, whatsappInteractiveListSectionContent2);
        WhatsAppInteractiveListActionContent whatsappInteractiveListActionContent =
                new WhatsAppInteractiveListActionContent()
                        .title("Choose one")
                        .sections(whatsappInteractiveListSectionContentList);
        WhatsAppInteractiveBodyContent whatsappInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveListHeaderContent whatsappInteractiveListHeaderContent =
                new WhatsAppInteractiveListTextHeaderContent().text("Header");
        WhatsAppInteractiveFooterContent whatsappInteractiveFooterContent =
                new WhatsAppInteractiveFooterContent().text("Footer");
        WhatsAppInteractiveListContent whatsappInteractiveListContent = new WhatsAppInteractiveListContent()
                .body(whatsappInteractiveBodyContent)
                .action(whatsappInteractiveListActionContent)
                .header(whatsappInteractiveListHeaderContent)
                .footer(whatsappInteractiveFooterContent);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveListMessage whatsappInteractiveListMessage = new WhatsAppInteractiveListMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsappInteractiveListContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
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
                + "          \"title\": \"First section title\",\n"
                + "          \"rows\": [\n"
                + "            {\n"
                + "              \"id\": \"1\",\n"
                + "              \"title\": \"first row title\",\n"
                + "              \"description\": \"first row description\"\n"
                + "            },\n"
                + "            {\n"
                + "              \"id\": \"2\",\n"
                + "              \"title\": \"second row title\",\n"
                + "              \"description\": \"second row description\"\n"
                + "            }\n"
                + "          ]\n"
                + "        },\n"
                + "        {\n"
                + "          \"title\": \"Second section title\",\n"
                + "          \"rows\": [\n"
                + "            {\n"
                + "              \"id\": \"3\",\n"
                + "              \"title\": \"third row title\"\n"
                + "            }\n"
                + "          ]\n"
                + "        }\n"
                + "      ]\n"
                + "    },\n"
                + "    \"header\": {\n"
                + "      \"type\": \"TEXT\",\n"
                + "      \"text\": \"Header\"\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"Footer\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/list", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsappSingleMessageInfo) -> {
            then(whatsappSingleMessageInfo).isNotNull();
            then(whatsappSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsappSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsappSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsappSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsAppInteractiveListMessage(whatsappInteractiveListMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendInteractiveListMessageSendWhatsAppInteractiveListMessage() {
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
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
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n                "
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        WhatsAppInteractiveRowContent whatsAppInteractiveRowContent =
                new WhatsAppInteractiveRowContent().id("1").title("row title");
        List<WhatsAppInteractiveRowContent> whatsAppInteractiveRowContentList = List.of(whatsAppInteractiveRowContent);
        WhatsAppInteractiveListSectionContent whatsAppInteractiveListSectionContent =
                new WhatsAppInteractiveListSectionContent().rows(whatsAppInteractiveRowContentList);
        List<WhatsAppInteractiveListSectionContent> whatsAppInteractiveListSectionContentList =
                List.of(whatsAppInteractiveListSectionContent);
        WhatsAppInteractiveListActionContent whatsAppInteractiveListActionContent =
                new WhatsAppInteractiveListActionContent()
                        .title("Choose one")
                        .sections(whatsAppInteractiveListSectionContentList);
        WhatsAppInteractiveBodyContent whatsAppInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveListContent whatsAppInteractiveListContent = new WhatsAppInteractiveListContent()
                .body(whatsAppInteractiveBodyContent)
                .action(whatsAppInteractiveListActionContent);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveListMessage whatsAppInteractiveListMessage = new WhatsAppInteractiveListMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppInteractiveListContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/list", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getTo()).isEqualTo("441134960001");
            then(response.getMessageCount()).isEqualTo(1);
            then(response.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(response.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus messageStatus = response.getStatus();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsAppInteractiveListMessage(whatsAppInteractiveListMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldInteractiveLocationRequestMessageSendWhatsappInteractiveLocationRequestMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n                "
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveLocationRequestMessage whatsAppInteractiveLocationRequestMessage =
                new WhatsAppInteractiveLocationRequestMessage()
                        .from("441134960000")
                        .to("441134960001")
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .content(new WhatsAppInteractiveLocationRequestContent()
                                .body(new WhatsAppInteractiveBodyContent().text("Some text")))
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp")
                        .urlOptions(new UrlOptions()
                                .shortenUrl(true)
                                .trackClicks(true)
                                .trackingUrl("https://example.com/click-report")
                                .removeProtocol(true));
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/location-request", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsappInteractiveLocationRequestMessage(whatsAppInteractiveLocationRequestMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendFooterInteractiveMultiProductMessageSendWhatsAppInteractiveMultiProductMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"header\": {\n"
                + "      \"type\": \"TEXT\",\n"
                + "      \"text\": \"Header\"\n"
                + "    },\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    },\n"
                + "    \"action\": {\n"
                + "      \"catalogId\": \"1\",\n"
                + "      \"sections\": [\n"
                + "        {\n"
                + "          \"title\": \"Title\",\n"
                + "          \"productRetailerIds\": [\n"
                + "            \"1\",\n"
                + "            \"2\"\n"
                + "          ]\n"
                + "        }\n"
                + "      ]\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"Footer\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveMultiProductSectionContent whatsAppInteractiveMultiProductSectionContent =
                new WhatsAppInteractiveMultiProductSectionContent().title("Title");
        List<String> stringList = List.of("1", "2");
        List<WhatsAppInteractiveMultiProductSectionContent> whatsAppInteractiveMultiProductSectionContentList =
                List.of(whatsAppInteractiveMultiProductSectionContent.productRetailerIds(stringList));
        WhatsAppInteractiveMultiProductActionContent whatsAppInteractiveMultiProductActionContent =
                new WhatsAppInteractiveMultiProductActionContent()
                        .catalogId("1")
                        .sections(whatsAppInteractiveMultiProductSectionContentList);
        WhatsAppInteractiveBodyContent whatsAppInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveMultiProductHeaderContent whatsAppInteractiveMultiProductHeaderContent =
                new WhatsAppInteractiveMultiProductTextHeaderContent().text("Header");
        WhatsAppInteractiveFooterContent whatsAppInteractiveFooterContent =
                new WhatsAppInteractiveFooterContent().text("Footer");
        WhatsAppInteractiveMultiProductContent whatsAppInteractiveMultiProductContent =
                new WhatsAppInteractiveMultiProductContent()
                        .header(whatsAppInteractiveMultiProductHeaderContent)
                        .body(whatsAppInteractiveBodyContent)
                        .action(whatsAppInteractiveMultiProductActionContent)
                        .footer(whatsAppInteractiveFooterContent);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveMultiProductMessage whatsAppInteractiveMultiProductMessage =
                new WhatsAppInteractiveMultiProductMessage()
                        .from("441134960000")
                        .to("441134960001")
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .content(whatsAppInteractiveMultiProductContent)
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp")
                        .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/multi-product", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsAppInteractiveMultiProductMessage(whatsAppInteractiveMultiProductMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldInteractiveMultiProductMessageSendWhatsAppInteractiveMultiProductMessage() {
        WhatsAppApi whatsappApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"header\": {\n"
                + "      \"type\": \"TEXT\",\n"
                + "      \"text\": \"Header\"\n"
                + "    },\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    },\n"
                + "    \"action\": {\n"
                + "      \"catalogId\": \"1\",\n"
                + "      \"sections\": [\n"
                + "        {\n"
                + "          \"title\": \"Title\",\n"
                + "          \"productRetailerIds\": [\n"
                + "            \"1\",\n"
                + "            \"2\"\n"
                + "          ]\n"
                + "        }\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n            \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveMultiProductSectionContent whatsappMultiProductSectionContent =
                new WhatsAppInteractiveMultiProductSectionContent().title("Title");
        List<String> productRetailerIdsList = List.of("1", "2");
        whatsappMultiProductSectionContent.productRetailerIds(productRetailerIdsList);
        List<WhatsAppInteractiveMultiProductSectionContent> whatsappMultiProductSectionContentList =
                List.of(whatsappMultiProductSectionContent);
        WhatsAppInteractiveMultiProductActionContent whatsappInteractiveMultiProductActionContent =
                new WhatsAppInteractiveMultiProductActionContent()
                        .catalogId("1")
                        .sections(whatsappMultiProductSectionContentList);
        WhatsAppInteractiveMultiProductTextHeaderContent whatsappInteractiveMultiProductTextHeaderContent =
                new WhatsAppInteractiveMultiProductTextHeaderContent().text("Header");
        WhatsAppInteractiveBodyContent whatsappInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveMultiProductContent whatsappInteractiveMultiProductContent =
                new WhatsAppInteractiveMultiProductContent()
                        .header(whatsappInteractiveMultiProductTextHeaderContent)
                        .body(whatsappInteractiveBodyContent)
                        .action(whatsappInteractiveMultiProductActionContent);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveMultiProductMessage whatsappInteractiveMultiProductMessage =
                new WhatsAppInteractiveMultiProductMessage()
                        .from("441134960000")
                        .to("441134960001")
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .content(whatsappInteractiveMultiProductContent)
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp")
                        .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/multi-product", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsappApi.sendWhatsAppInteractiveMultiProductMessage(whatsappInteractiveMultiProductMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendHeaderInteractiveUpiPayuOrderDetailsMessageSendWhatsappInteractiveOrderDetailsMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    },\n"
                + "    \"action\": {\n"
                + "      \"payment\": {\n"
                + "        \"type\": \"UPI_PAYU\",\n"
                + "        \"id\": \"fd3e847h2\",\n"
                + "        \"productDescription\": \"tshirt100\",\n"
                + "        \"customerFirstName\": \"John\",\n"
                + "        \"customerLastName\": \"Smith\",\n"
                + "        \"customerEmail\": \"John.Smith@example.com\",\n"
                + "        \"callbackData\": [\n"
                + "          \"customData1\",\n"
                + "          \"customData2\",\n"
                + "          \"customData3\",\n"
                + "          \"customData4\",\n"
                + "          \"customData5\"\n"
                + "        ]\n"
                + "      },\n"
                + "      \"paymentConfiguration\": \"payment-config\",\n"
                + "      \"orderCurrency\": \"INR\",\n"
                + "      \"orderType\": \"DIGITAL_GOODS\",\n"
                + "      \"totalAmount\": {\n"
                + "        \"value\": 21000\n"
                + "      },\n"
                + "      \"order\": {\n"
                + "        \"items\": [\n"
                + "          {\n"
                + "            \"retailerId\": \"1\",\n"
                + "            \"name\": \"product\",\n"
                + "            \"amount\": { \"value\": 10000 },\n"
                + "            \"quantity\": 2,\n"
                + "            \"originCountry\": \"country of origin\",\n"
                + "            \"importerName\": \"importer name\",\n"
                + "            \"importerAddress\": {\n"
                + "              \"firstAddressLine\": \"address line\",\n"
                + "              \"secondAddressLine\": \"address line\",\n"
                + "              \"city\": \"city\",\n"
                + "              \"zoneCode\": \"zone code\",\n"
                + "              \"postalCode\": \"postal code\",\n"
                + "              \"countryCode\": \"country code\"\n"
                + "            }\n"
                + "          }\n"
                + "        ],\n"
                + "        \"subtotal\": { \"value\": 20000 },\n"
                + "        \"tax\": { \"value\": 1000, \"description\": \"tax included\" },\n"
                + "        \"shipping\": { \"value\": 1000, \"description\": \"shipping cost\" },\n"
                + "        \"discount\": { \"amount\": { \"value\": 1000, \"description\": \"discount\" }, \"programName\": \"membership discount\" },\n"
                + "        \"orderExpiration\": { \"expirationSeconds\": 500, \"description\": \"limited offer\" }\n"
                + "      }\n"
                + "    },\n"
                + "    \"header\": { \"type\": \"IMAGE\", \"mediaUrl\": \"https://example.com/image\" },\n"
                + "    \"footer\": { \"text\": \"Footer\" }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        List<String> stringList = List.of("customData1", "customData2", "customData3", "customData4", "customData5");
        WhatsAppInteractiveOrderUPIPayUPaymentDetails whatsAppInteractiveOrderUPIPayUPaymentDetails =
                new WhatsAppInteractiveOrderUPIPayUPaymentDetails()
                        .id("fd3e847h2")
                        .productDescription("tshirt100")
                        .customerFirstName("John")
                        .customerLastName("Smith")
                        .customerEmail("John.Smith@example.com");
        whatsAppInteractiveOrderUPIPayUPaymentDetails.setCallbackData(stringList);
        WhatsAppInteractiveOrderDetailsImporterAddress whatsAppInteractiveOrderDetailsImporterAddress =
                new WhatsAppInteractiveOrderDetailsImporterAddress()
                        .firstAddressLine("address line")
                        .secondAddressLine("address line")
                        .city("city")
                        .zoneCode("zone code")
                        .postalCode("postal code")
                        .countryCode("country code");
        WhatsAppInteractiveOrderDetailsOrderItem whatsAppInteractiveOrderDetailsOrderItem =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("1")
                        .name("product")
                        .amount(new WhatsAppInteractiveOrderDetailsAmount().value(10000))
                        .quantity(2)
                        .originCountry("country of origin")
                        .importerName("importer name")
                        .importerAddress(whatsAppInteractiveOrderDetailsImporterAddress);
        List<WhatsAppInteractiveOrderDetailsOrderItem> whatsAppInteractiveOrderDetailsOrderItemList =
                List.of(whatsAppInteractiveOrderDetailsOrderItem);
        WhatsAppInteractiveOrderDetailsOrder whatsAppInteractiveOrderDetailsOrder =
                new WhatsAppInteractiveOrderDetailsOrder()
                        .items(whatsAppInteractiveOrderDetailsOrderItemList)
                        .subtotal(new WhatsAppInteractiveOrderDetailsAmount().value(20000))
                        .tax(new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                                .value(1000)
                                .description("tax included"))
                        .shipping(new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                                .value(1000)
                                .description("shipping cost"));
        WhatsAppInteractiveOrderDetailsDiscount whatsAppInteractiveOrderDetailsDiscount =
                new WhatsAppInteractiveOrderDetailsDiscount()
                        .amount(new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                                .value(1000)
                                .description("discount"))
                        .programName("membership discount");
        whatsAppInteractiveOrderDetailsOrder.setDiscount(whatsAppInteractiveOrderDetailsDiscount);
        whatsAppInteractiveOrderDetailsOrder.setOrderExpiration(new WhatsAppInteractiveOrderDetailsOrderExpiration()
                .expirationSeconds(500L)
                .description("limited offer"));
        WhatsAppInteractiveOrderDetailsActionContent whatsAppInteractiveOrderDetailsActionContent =
                new WhatsAppInteractiveOrderDetailsActionContent()
                        .payment(whatsAppInteractiveOrderUPIPayUPaymentDetails)
                        .paymentConfiguration("payment-config")
                        .orderCurrency(WhatsAppOrderCurrency.INR)
                        .orderType(WhatsAppOrderType.DIGITAL_GOODS)
                        .totalAmount(new WhatsAppInteractiveOrderDetailsAmount().value(21000))
                        .order(whatsAppInteractiveOrderDetailsOrder);
        WhatsAppInteractiveBodyContent whatsAppInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveOrderDetailsImageHeaderContent whatsAppInteractiveOrderDetailsImageHeaderContent =
                new WhatsAppInteractiveOrderDetailsImageHeaderContent().mediaUrl("https://example.com/image");
        WhatsAppInteractiveFooterContent whatsAppInteractiveFooterContent =
                new WhatsAppInteractiveFooterContent().text("Footer");
        WhatsAppInteractiveOrderDetailsContent whatsAppInteractiveOrderDetailsContent =
                new WhatsAppInteractiveOrderDetailsContent()
                        .body(whatsAppInteractiveBodyContent)
                        .action(whatsAppInteractiveOrderDetailsActionContent)
                        .header(whatsAppInteractiveOrderDetailsImageHeaderContent)
                        .footer(whatsAppInteractiveFooterContent);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveOrderDetailsMessage whatsAppInteractiveOrderDetailsMessage =
                new WhatsAppInteractiveOrderDetailsMessage()
                        .from("441134960000")
                        .to("441134960001")
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .content(whatsAppInteractiveOrderDetailsContent)
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp")
                        .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/order-details", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsappInteractiveOrderDetailsMessage(whatsAppInteractiveOrderDetailsMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendInteractiveBrazilBoletoOrderDetailsMessageSendWhatsappInteractiveOrderDetailsMessage() {
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    },\n"
                + "    \"action\": {\n"
                + "      \"payment\": {\n"
                + "        \"type\": \"BRAZIL_BOLETO\",\n"
                + "        \"id\": \"fd3e847h2\",\n"
                + "        \"code\": \"03399026944140000002628346101018898510000008848\"\n"
                + "      },\n"
                + "      \"orderCurrency\": \"BRL\",\n"
                + "      \"orderType\": \"DIGITAL_GOODS\",\n"
                + "      \"totalAmount\": {\n"
                + "        \"value\": 21000\n"
                + "      },\n"
                + "      \"order\": {\n"
                + "        \"catalogId\": \"1\",\n"
                + "        \"items\": [\n"
                + "          {\n"
                + "            \"retailerId\": \"1\",\n"
                + "            \"name\": \"discounted product\",\n"
                + "            \"amount\": { \"value\": 10000 },\n"
                + "            \"saleAmount\": { \"value\": 5000 },\n            "
                + "            \"quantity\": 2\n"
                + "          },\n"
                + "          {\n"
                + "            \"retailerId\": \"2\",\n"
                + "            \"name\": \"product\",\n"
                + "            \"amount\": { \"value\": 10000 },\n"
                + "            \"quantity\": 1\n"
                + "          }\n"
                + "        ],\n"
                + "        \"subtotal\": { \"value\": 20000 },\n"
                + "        \"tax\": { \"value\": 1000, \"description\": \"tax included\" },\n"
                + "        \"shipping\": { \"value\": 1000, \"description\": \"shipping cost\" },\n"
                + "        \"discount\": { \"amount\": { \"value\": 1000, \"description\": \"discount\" }, \"programName\": \"membership discount\" },\n"
                + "        \"orderExpiration\": { \"expirationSeconds\": 500, \"description\": \"limited offer\" }\n"
                + "      }\n"
                + "    },\n"
                + "    \"footer\": { \"text\": \"Footer\" }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        WhatsAppInteractiveOrderDetailsOrderItem whatsappInteractiveOrderDetailsOrderItem =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("1")
                        .name("discounted product")
                        .amount(new WhatsAppInteractiveOrderDetailsAmount().value(10000))
                        .saleAmount(new WhatsAppInteractiveOrderDetailsAmount().value(5000))
                        .quantity(2);
        WhatsAppInteractiveOrderDetailsOrderItem whatsappInteractiveOrderDetailsOrderItem2 =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("2")
                        .name("product")
                        .amount(new WhatsAppInteractiveOrderDetailsAmount().value(10000))
                        .quantity(1);
        List<WhatsAppInteractiveOrderDetailsOrderItem> whatsappInteractiveOrderDetailsOrderItemList =
                List.of(whatsappInteractiveOrderDetailsOrderItem, whatsappInteractiveOrderDetailsOrderItem2);
        WhatsAppInteractiveOrderDetailsOrder whatsappInteractiveOrderDetailsOrder =
                new WhatsAppInteractiveOrderDetailsOrder()
                        .catalogId("1")
                        .items(whatsappInteractiveOrderDetailsOrderItemList)
                        .subtotal(new WhatsAppInteractiveOrderDetailsAmount().value(20000))
                        .tax(new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                                .value(1000)
                                .description("tax included"))
                        .shipping(new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                                .value(1000)
                                .description("shipping cost"))
                        .discount(new WhatsAppInteractiveOrderDetailsDiscount()
                                .amount(new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                                        .value(1000)
                                        .description("discount"))
                                .programName("membership discount"))
                        .orderExpiration(new WhatsAppInteractiveOrderDetailsOrderExpiration()
                                .expirationSeconds(500L)
                                .description("limited offer"));
        WhatsAppInteractiveOrderDetailsAmount whatsappInteractiveOrderDetailsAmount =
                new WhatsAppInteractiveOrderDetailsAmount().value(21000);
        WhatsAppInteractiveAllowedOrderPaymentDetails whatsappInteractiveOrderBrazilBoletoPaymentDetails =
                new WhatsAppInteractiveOrderBrazilBoletoPaymentDetails()
                        .id("fd3e847h2")
                        .code("03399026944140000002628346101018898510000008848");
        WhatsAppInteractiveOrderDetailsActionContent whatsappInteractiveOrderDetailsActionContent =
                new WhatsAppInteractiveOrderDetailsActionContent()
                        .payment(whatsappInteractiveOrderBrazilBoletoPaymentDetails)
                        .orderCurrency(WhatsAppOrderCurrency.BRL)
                        .orderType(WhatsAppOrderType.DIGITAL_GOODS)
                        .totalAmount(whatsappInteractiveOrderDetailsAmount)
                        .order(whatsappInteractiveOrderDetailsOrder);
        WhatsAppInteractiveBodyContent whatsappInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveFooterContent whatsappInteractiveFooterContent =
                new WhatsAppInteractiveFooterContent().text("Footer");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveOrderDetailsContent whatsappInteractiveOrderDetailsContent =
                new WhatsAppInteractiveOrderDetailsContent()
                        .body(whatsappInteractiveBodyContent)
                        .action(whatsappInteractiveOrderDetailsActionContent)
                        .footer(whatsappInteractiveFooterContent);
        WhatsAppInteractiveOrderDetailsMessage whatsappInteractiveOrderDetailsMessage =
                new WhatsAppInteractiveOrderDetailsMessage()
                        .from("441134960000")
                        .to("441134960001")
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .content(whatsappInteractiveOrderDetailsContent)
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp")
                        .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/order-details", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus messageStatus = whatsAppSingleMessageInfo.getStatus();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsappInteractiveOrderDetailsMessage(whatsappInteractiveOrderDetailsMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendInteractiveBrazilLinkOrderDetailsMessageSendWhatsappInteractiveOrderDetailsMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    },\n"
                + "    \"action\": {\n"
                + "      \"payment\": {\n"
                + "        \"type\": \"BRAZIL_LINK\",\n"
                + "        \"id\": \"fd3e847h2\",\n"
                + "        \"paymentLink\": \"https://example.com/payment-link\"\n"
                + "      },\n"
                + "      \"orderCurrency\": \"BRL\",\n"
                + "      \"orderType\": \"DIGITAL_GOODS\",\n"
                + "      \"totalAmount\": {\n"
                + "        \"value\": 21000\n"
                + "      },\n"
                + "      \"order\": {\n"
                + "        \"catalogId\": \"1\",\n"
                + "        \"items\": [\n"
                + "          {\n"
                + "            \"retailerId\": \"1\",\n"
                + "            \"name\": \"discounted product\",\n"
                + "            \"amount\": { \"value\": 10000 },\n"
                + "            \"saleAmount\": { \"value\": 5000 },\n            "
                + "            \"quantity\": 2\n"
                + "          },\n"
                + "          {\n"
                + "            \"retailerId\": \"2\",\n"
                + "            \"name\": \"product\",\n"
                + "            \"amount\": { \"value\": 10000 },\n"
                + "            \"quantity\": 1\n"
                + "          }\n"
                + "        ],\n"
                + "        \"subtotal\": { \"value\": 20000 },\n"
                + "        \"tax\": { \"value\": 1000, \"description\": \"tax included\" },\n"
                + "        \"shipping\": { \"value\": 1000, \"description\": \"shipping cost\" },\n"
                + "        \"discount\": { \"amount\": { \"value\": 1000, \"description\": \"discount\" }, \"programName\": \"membership discount\" },\n"
                + "        \"orderExpiration\": { \"expirationSeconds\": 500, \"description\": \"limited offer\" }\n"
                + "      }\n"
                + "    },\n"
                + "    \"footer\": { \"text\": \"Footer\" }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveBodyContent whatsappInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveOrderBrazilLinkPaymentDetails whatsappInteractiveOrderBrazilLinkPaymentDetails =
                new WhatsAppInteractiveOrderBrazilLinkPaymentDetails()
                        .id("fd3e847h2")
                        .paymentLink("https://example.com/payment-link");
        WhatsAppInteractiveOrderDetailsAmount whatsappInteractiveOrderDetailsAmount =
                new WhatsAppInteractiveOrderDetailsAmount().value(21000);
        WhatsAppInteractiveOrderDetailsAmount whatsappInteractiveOrderDetailsAmountItem1Amount =
                new WhatsAppInteractiveOrderDetailsAmount().value(10000);
        WhatsAppInteractiveOrderDetailsAmount whatsappInteractiveOrderDetailsAmountItem1SaleAmount =
                new WhatsAppInteractiveOrderDetailsAmount().value(5000);
        WhatsAppInteractiveOrderDetailsOrderItem whatsappInteractiveOrderDetailsOrderItem1 =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("1")
                        .name("discounted product")
                        .amount(whatsappInteractiveOrderDetailsAmountItem1Amount)
                        .saleAmount(whatsappInteractiveOrderDetailsAmountItem1SaleAmount)
                        .quantity(2);
        WhatsAppInteractiveOrderDetailsOrderItem whatsappInteractiveOrderDetailsOrderItem2 =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("2")
                        .name("product")
                        .amount(new WhatsAppInteractiveOrderDetailsAmount().value(10000))
                        .quantity(1);
        List<WhatsAppInteractiveOrderDetailsOrderItem> whatsappInteractiveOrderDetailsOrderItemList =
                List.of(whatsappInteractiveOrderDetailsOrderItem1, whatsappInteractiveOrderDetailsOrderItem2);
        WhatsAppInteractiveOrderDetailsOrder whatsappInteractiveOrderDetailsOrder =
                new WhatsAppInteractiveOrderDetailsOrder()
                        .catalogId("1")
                        .items(whatsappInteractiveOrderDetailsOrderItemList)
                        .subtotal(new WhatsAppInteractiveOrderDetailsAmount().value(20000))
                        .tax(new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                                .value(1000)
                                .description("tax included"))
                        .shipping(new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                                .value(1000)
                                .description("shipping cost"))
                        .discount(new WhatsAppInteractiveOrderDetailsDiscount()
                                .amount(new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                                        .value(1000)
                                        .description("discount"))
                                .programName("membership discount"))
                        .orderExpiration(new WhatsAppInteractiveOrderDetailsOrderExpiration()
                                .expirationSeconds(500L)
                                .description("limited offer"));
        WhatsAppInteractiveOrderDetailsActionContent whatsappInteractiveOrderDetailsActionContent =
                new WhatsAppInteractiveOrderDetailsActionContent()
                        .payment(whatsappInteractiveOrderBrazilLinkPaymentDetails)
                        .orderCurrency(WhatsAppOrderCurrency.BRL)
                        .orderType(WhatsAppOrderType.DIGITAL_GOODS)
                        .totalAmount(whatsappInteractiveOrderDetailsAmount)
                        .order(whatsappInteractiveOrderDetailsOrder);
        WhatsAppInteractiveFooterContent whatsappInteractiveFooterContent =
                new WhatsAppInteractiveFooterContent().text("Footer");
        WhatsAppInteractiveOrderDetailsContent whatsappInteractiveOrderDetailsContent =
                new WhatsAppInteractiveOrderDetailsContent()
                        .body(whatsappInteractiveBodyContent)
                        .action(whatsappInteractiveOrderDetailsActionContent)
                        .footer(whatsappInteractiveFooterContent);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveOrderDetailsMessage whatsappInteractiveOrderDetailsMessage =
                new WhatsAppInteractiveOrderDetailsMessage()
                        .from("441134960000")
                        .to("441134960001")
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .content(whatsappInteractiveOrderDetailsContent)
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp")
                        .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/order-details", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsappInteractiveOrderDetailsMessage(whatsappInteractiveOrderDetailsMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendInteractiveBrazilPaymentsOrderDetailsMessageSendWhatsappInteractiveOrderDetailsMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    },\n"
                + "    \"action\": {\n"
                + "      \"payment\": {\n"
                + "        \"type\": \"BRAZIL_PAYMENTS\",\n"
                + "        \"payments\": [\n"
                + "          {\n"
                + "            \"type\": \"BRAZIL_PIX_DC\",\n"
                + "            \"id\": \"fd3e847h2\",\n"
                + "            \"code\": \"00020101021226900014br.gov.bcb.pix2568pix\",\n"
                + "            \"merchantName\": \"Company Name\",\n"
                + "            \"keyType\": \"CNPJ\",\n"
                + "            \"key\": \"01234567891234\"\n"
                + "          },\n"
                + "          {\n"
                + "            \"type\": \"BRAZIL_BOLETO\",\n"
                + "            \"id\": \"fd3e847h2\",\n"
                + "            \"code\": \"03399026944140000002628346101018898510000008848\"\n"
                + "          }\n"
                + "        ]\n"
                + "      },\n"
                + "      \"orderCurrency\": \"BRL\",\n"
                + "      \"orderType\": \"DIGITAL_GOODS\",\n"
                + "      \"totalAmount\": {\n"
                + "        \"value\": 21000\n"
                + "      },\n"
                + "      \"order\": {\n"
                + "        \"catalogId\": \"1\",\n"
                + "        \"items\": [\n"
                + "          {\n"
                + "            \"retailerId\": \"1\",\n"
                + "            \"name\": \"discounted product\",\n"
                + "            \"amount\": {\"value\": 10000},\n"
                + "            \"saleAmount\": {\"value\": 5000},\n"
                + "            \"quantity\": 2\n"
                + "          },\n"
                + "          {\n"
                + "            \"retailerId\": \"2\",\n"
                + "            \"name\": \"product\",\n"
                + "            \"amount\": {\"value\": 10000},\n"
                + "            \"quantity\": 1\n"
                + "          }\n"
                + "        ],\n"
                + "        \"subtotal\": {\"value\": 20000},\n"
                + "        \"tax\": {\"value\": 1000, \"description\": \"tax included\"},\n"
                + "        \"shipping\": {\"value\": 1000, \"description\": \"shipping cost\"},\n"
                + "        \"discount\": {\"amount\": {\"value\": 1000, \"description\": \"discount\"}, \"programName\": \"membership discount\"},\n"
                + "        \"orderExpiration\": {\"expirationSeconds\": 500, \"description\": \"limited offer\"}\n"
                + "      }\n"
                + "    },\n"
                + "    \"footer\": {\"text\": \"Footer\"}\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n            \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveBodyContent whatsAppInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveOrderDetailsAmount whatsAppInteractiveOrderDetailsAmountTotal =
                new WhatsAppInteractiveOrderDetailsAmount().value(21000);
        WhatsAppInteractiveOrderDetailsOrderItem whatsAppInteractiveOrderDetailsOrderItem =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("1")
                        .name("discounted product")
                        .amount(new WhatsAppInteractiveOrderDetailsAmount().value(10000))
                        .saleAmount(new WhatsAppInteractiveOrderDetailsAmount().value(5000))
                        .quantity(2);
        WhatsAppInteractiveOrderDetailsOrderItem whatsAppInteractiveOrderDetailsOrderItem2 =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("2")
                        .name("product")
                        .amount(new WhatsAppInteractiveOrderDetailsAmount().value(10000))
                        .quantity(1);
        List<WhatsAppInteractiveOrderDetailsOrderItem> whatsAppInteractiveOrderDetailsOrderItemList =
                List.of(whatsAppInteractiveOrderDetailsOrderItem, whatsAppInteractiveOrderDetailsOrderItem2);
        WhatsAppInteractiveOrderDetailsDescriptiveAmount whatsAppInteractiveOrderDetailsTax =
                new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                        .value(1000)
                        .description("tax included");
        WhatsAppInteractiveOrderDetailsDescriptiveAmount whatsAppInteractiveOrderDetailsShipping =
                new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                        .value(1000)
                        .description("shipping cost");
        WhatsAppInteractiveOrderDetailsDescriptiveAmount whatsAppInteractiveOrderDetailsDiscountAmount =
                new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                        .value(1000)
                        .description("discount");
        WhatsAppInteractiveOrderDetailsDiscount whatsAppInteractiveOrderDetailsDiscount =
                new WhatsAppInteractiveOrderDetailsDiscount()
                        .amount(whatsAppInteractiveOrderDetailsDiscountAmount)
                        .programName("membership discount");
        WhatsAppInteractiveOrderDetailsOrderExpiration whatsAppInteractiveOrderDetailsOrderExpiration =
                new WhatsAppInteractiveOrderDetailsOrderExpiration()
                        .expirationSeconds(500L)
                        .description("limited offer");
        WhatsAppInteractiveOrderDetailsOrder whatsAppInteractiveOrderDetailsOrder =
                new WhatsAppInteractiveOrderDetailsOrder()
                        .catalogId("1")
                        .items(whatsAppInteractiveOrderDetailsOrderItemList)
                        .subtotal(new WhatsAppInteractiveOrderDetailsAmount().value(20000))
                        .tax(whatsAppInteractiveOrderDetailsTax)
                        .shipping(whatsAppInteractiveOrderDetailsShipping)
                        .discount(whatsAppInteractiveOrderDetailsDiscount)
                        .orderExpiration(whatsAppInteractiveOrderDetailsOrderExpiration);
        WhatsAppInteractiveOrderDetailsActionContent whatsAppInteractiveOrderDetailsActionContent =
                new WhatsAppInteractiveOrderDetailsActionContent()
                        .orderCurrency(WhatsAppOrderCurrency.BRL)
                        .orderType(WhatsAppOrderType.DIGITAL_GOODS)
                        .totalAmount(whatsAppInteractiveOrderDetailsAmountTotal)
                        .order(whatsAppInteractiveOrderDetailsOrder)
                        .payment(new WhatsAppInteractiveOrderBrazilPaymentsDetails()
                                .payments(List.of(
                                        new WhatsAppInteractiveOrderBrazilPixDcPaymentDetails()
                                                .id("fd3e847h2")
                                                .code("00020101021226900014br.gov.bcb.pix2568pix")
                                                .merchantName("Company Name")
                                                .keyType(WhatsAppPixKeyType.CNPJ)
                                                .key("01234567891234"),
                                        new WhatsAppInteractiveOrderBrazilBoletoPaymentDetails()
                                                .id("fd3e847h2")
                                                .code("03399026944140000002628346101018898510000008848"))));
        WhatsAppInteractiveFooterContent whatsAppInteractiveFooterContent =
                new WhatsAppInteractiveFooterContent().text("Footer");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveOrderDetailsContent whatsAppInteractiveOrderDetailsContent =
                new WhatsAppInteractiveOrderDetailsContent()
                        .body(whatsAppInteractiveBodyContent)
                        .action(whatsAppInteractiveOrderDetailsActionContent)
                        .footer(whatsAppInteractiveFooterContent);
        WhatsAppInteractiveOrderDetailsMessage whatsAppInteractiveOrderDetailsMessage =
                new WhatsAppInteractiveOrderDetailsMessage()
                        .from("441134960000")
                        .to("441134960001")
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .content(whatsAppInteractiveOrderDetailsContent)
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp")
                        .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/order-details", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus messageStatus = whatsAppSingleMessageInfo.getStatus();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsappInteractiveOrderDetailsMessage(whatsAppInteractiveOrderDetailsMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendInteractiveBrazilPixDcOrderDetailsMessageSendWhatsappInteractiveOrderDetailsMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    },\n"
                + "    \"action\": {\n"
                + "      \"payment\": {\n"
                + "        \"type\": \"BRAZIL_PIX_DC\",\n"
                + "        \"id\": \"fd3e847h2\",\n"
                + "        \"code\": \"00020101021226900014br.gov.bcb.pix2568pix\",\n"
                + "        \"merchantName\": \"Company Name\",\n"
                + "        \"keyType\": \"CNPJ\",\n"
                + "        \"key\": \"01234567891234\"\n"
                + "      },\n"
                + "      \"paymentConfiguration\": \"payment-config\",\n"
                + "      \"orderCurrency\": \"BRL\",\n"
                + "      \"orderType\": \"DIGITAL_GOODS\",\n"
                + "      \"totalAmount\": {\n"
                + "        \"value\": 21000\n"
                + "      },\n"
                + "      \"order\": {\n"
                + "        \"catalogId\": \"1\",\n"
                + "        \"items\": [\n"
                + "          {\n"
                + "            \"retailerId\": \"1\",\n"
                + "            \"name\": \"discounted product\",\n"
                + "            \"amount\": { \"value\": 10000 },\n"
                + "            \"saleAmount\": { \"value\": 5000 },\n            "
                + "            \"quantity\": 2\n"
                + "          },\n"
                + "          {\n"
                + "            \"retailerId\": \"2\",\n"
                + "            \"name\": \"product\",\n"
                + "            \"amount\": { \"value\": 10000 },\n"
                + "            \"quantity\": 1\n"
                + "          }\n"
                + "        ],\n"
                + "        \"subtotal\": { \"value\": 20000 },\n"
                + "        \"tax\": { \"value\": 1000, \"description\": \"tax included\" },\n"
                + "        \"shipping\": { \"value\": 1000, \"description\": \"shipping cost\" },\n"
                + "        \"discount\": { \"amount\": { \"value\": 1000, \"description\": \"discount\" }, \"programName\": \"membership discount\" },\n"
                + "        \"orderExpiration\": { \"expirationSeconds\": 500, \"description\": \"limited offer\" }\n"
                + "      }\n"
                + "    },\n"
                + "    \"footer\": { \"text\": \"Footer\" }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveOrderBrazilPixDcPaymentDetails whatsappInteractiveOrderBrazilPixDcPaymentDetails =
                new WhatsAppInteractiveOrderBrazilPixDcPaymentDetails()
                        .id("fd3e847h2")
                        .code("00020101021226900014br.gov.bcb.pix2568pix")
                        .merchantName("Company Name")
                        .keyType(WhatsAppPixKeyType.CNPJ)
                        .key("01234567891234");
        WhatsAppInteractiveOrderDetailsAmount whatsappInteractiveOrderDetailsAmountTotal =
                new WhatsAppInteractiveOrderDetailsAmount().value(21000);
        WhatsAppInteractiveOrderDetailsAmount whatsappInteractiveOrderDetailsAmountItem1Amount =
                new WhatsAppInteractiveOrderDetailsAmount().value(10000);
        WhatsAppInteractiveOrderDetailsAmount whatsappInteractiveOrderDetailsAmountItem1SaleAmount =
                new WhatsAppInteractiveOrderDetailsAmount().value(5000);
        WhatsAppInteractiveOrderDetailsOrderItem whatsappInteractiveOrderDetailsOrderItem =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("1")
                        .name("discounted product")
                        .amount(whatsappInteractiveOrderDetailsAmountItem1Amount)
                        .saleAmount(whatsappInteractiveOrderDetailsAmountItem1SaleAmount)
                        .quantity(2);
        WhatsAppInteractiveOrderDetailsAmount whatsappInteractiveOrderDetailsAmountItem2Amount =
                new WhatsAppInteractiveOrderDetailsAmount().value(10000);
        WhatsAppInteractiveOrderDetailsOrderItem whatsappInteractiveOrderDetailsOrderItem2 =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("2")
                        .name("product")
                        .amount(whatsappInteractiveOrderDetailsAmountItem2Amount)
                        .quantity(1);
        List<WhatsAppInteractiveOrderDetailsOrderItem> whatsappInteractiveOrderDetailsOrderItemList =
                List.of(whatsappInteractiveOrderDetailsOrderItem, whatsappInteractiveOrderDetailsOrderItem2);
        WhatsAppInteractiveOrderDetailsAmount whatsappInteractiveOrderDetailsDescriptiveAmountSubtotal =
                new WhatsAppInteractiveOrderDetailsAmount().value(20000);
        WhatsAppInteractiveOrderDetailsDescriptiveAmount whatsappInteractiveOrderDetailsDescriptiveAmountTax =
                new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                        .value(1000)
                        .description("tax included");
        WhatsAppInteractiveOrderDetailsDescriptiveAmount whatsappInteractiveOrderDetailsDescriptiveAmountShipping =
                new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                        .value(1000)
                        .description("shipping cost");
        WhatsAppInteractiveOrderDetailsDescriptiveAmount
                whatsappInteractiveOrderDetailsDescriptiveAmountDiscountAmount =
                        new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                                .value(1000)
                                .description("discount");
        WhatsAppInteractiveOrderDetailsDiscount whatsappInteractiveOrderDetailsDiscount =
                new WhatsAppInteractiveOrderDetailsDiscount()
                        .amount(whatsappInteractiveOrderDetailsDescriptiveAmountDiscountAmount)
                        .programName("membership discount");
        WhatsAppInteractiveOrderDetailsOrderExpiration whatsappInteractiveOrderDetailsOrderExpiration =
                new WhatsAppInteractiveOrderDetailsOrderExpiration()
                        .expirationSeconds(500L)
                        .description("limited offer");
        WhatsAppInteractiveOrderDetailsOrder whatsappInteractiveOrderDetailsOrder =
                new WhatsAppInteractiveOrderDetailsOrder()
                        .catalogId("1")
                        .items(whatsappInteractiveOrderDetailsOrderItemList)
                        .subtotal(whatsappInteractiveOrderDetailsDescriptiveAmountSubtotal)
                        .tax(whatsappInteractiveOrderDetailsDescriptiveAmountTax)
                        .shipping(whatsappInteractiveOrderDetailsDescriptiveAmountShipping)
                        .discount(whatsappInteractiveOrderDetailsDiscount)
                        .orderExpiration(whatsappInteractiveOrderDetailsOrderExpiration);
        WhatsAppInteractiveOrderDetailsActionContent whatsappInteractiveOrderDetailsActionContent =
                new WhatsAppInteractiveOrderDetailsActionContent()
                        .payment(whatsappInteractiveOrderBrazilPixDcPaymentDetails)
                        .paymentConfiguration("payment-config")
                        .orderCurrency(WhatsAppOrderCurrency.BRL)
                        .orderType(WhatsAppOrderType.DIGITAL_GOODS)
                        .totalAmount(whatsappInteractiveOrderDetailsAmountTotal)
                        .order(whatsappInteractiveOrderDetailsOrder);
        WhatsAppInteractiveBodyContent whatsappInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveFooterContent whatsappInteractiveFooterContent =
                new WhatsAppInteractiveFooterContent().text("Footer");
        WhatsAppInteractiveOrderDetailsContent whatsappInteractiveOrderDetailsContent =
                new WhatsAppInteractiveOrderDetailsContent()
                        .body(whatsappInteractiveBodyContent)
                        .action(whatsappInteractiveOrderDetailsActionContent)
                        .footer(whatsappInteractiveFooterContent);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveOrderDetailsMessage whatsappInteractiveOrderDetailsMessage =
                new WhatsAppInteractiveOrderDetailsMessage()
                        .from("441134960000")
                        .to("441134960001")
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .content(whatsappInteractiveOrderDetailsContent)
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp")
                        .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/order-details", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getTo()).isEqualTo("441134960001");
            then(response.getMessageCount()).isEqualTo(1);
            then(response.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus messageStatus = response.getStatus();
            then(messageStatus).isNotNull();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsappInteractiveOrderDetailsMessage(whatsappInteractiveOrderDetailsMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void
            shouldSendInteractiveBrazilPixDcOrderDetailsMessageWithoutPaymentConfigurationSendWhatsappInteractiveOrderDetailsMessage() {
        WhatsAppApi whatsappApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    },\n"
                + "    \"action\": {\n"
                + "      \"payment\": {\n"
                + "        \"type\": \"BRAZIL_PIX_DC\",\n"
                + "        \"id\": \"fd3e847h2\",\n"
                + "        \"code\": \"00020101021226900014br.gov.bcb.pix2568pix\",\n"
                + "        \"merchantName\": \"Company Name\",\n"
                + "        \"keyType\": \"CNPJ\",\n"
                + "        \"key\": \"01234567891234\"\n"
                + "      },\n"
                + "      \"orderCurrency\": \"BRL\",\n"
                + "      \"orderType\": \"DIGITAL_GOODS\",\n"
                + "      \"totalAmount\": {\n"
                + "        \"value\": 21000\n"
                + "      },\n"
                + "      \"order\": {\n"
                + "        \"catalogId\": \"1\",\n"
                + "        \"items\": [\n"
                + "          {\n"
                + "            \"retailerId\": \"1\",\n"
                + "            \"name\": \"discounted product\",\n"
                + "            \"amount\": {\"value\": 10000},\n"
                + "            \"saleAmount\": {\"value\": 5000},\n                \"quantity\": 2\n"
                + "          },\n"
                + "          {\n"
                + "            \"retailerId\": \"2\",\n"
                + "            \"name\": \"product\",\n"
                + "            \"amount\": {\"value\": 10000},\n"
                + "            \"quantity\": 1\n"
                + "          }\n"
                + "        ],\n"
                + "        \"subtotal\": {\"value\": 20000},\n"
                + "        \"tax\": {\"value\": 1000, \"description\": \"tax included\"},\n"
                + "        \"shipping\": {\"value\": 1000, \"description\": \"shipping cost\"},\n"
                + "        \"discount\": {\"amount\": {\"value\": 1000, \"description\": \"discount\"}, \"programName\": \"membership discount\"},\n"
                + "        \"orderExpiration\": {\"expirationSeconds\": 500, \"description\": \"limited offer\"}\n"
                + "      }\n"
                + "    },\n"
                + "    \"footer\": {\"text\": \"Footer\"}\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\"shortenUrl\": true, \"trackClicks\": true, \"trackingUrl\": \"https://example.com/click-report\", \"removeProtocol\": true}\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveOrderDetailsMessage whatsAppInteractiveOrderDetailsMessage =
                new WhatsAppInteractiveOrderDetailsMessage()
                        .from("441134960000")
                        .to("441134960001")
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
        WhatsAppInteractiveBodyContent whatsAppInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveOrderBrazilPixDcPaymentDetails whatsAppInteractiveOrderBrazilPixDcPaymentDetails =
                new WhatsAppInteractiveOrderBrazilPixDcPaymentDetails().id("fd3e847h2");
        whatsAppInteractiveOrderBrazilPixDcPaymentDetails.setCode("00020101021226900014br.gov.bcb.pix2568pix");
        whatsAppInteractiveOrderBrazilPixDcPaymentDetails.setMerchantName("Company Name");
        whatsAppInteractiveOrderBrazilPixDcPaymentDetails.setKeyType(WhatsAppPixKeyType.CNPJ);
        whatsAppInteractiveOrderBrazilPixDcPaymentDetails.setKey("01234567891234");
        WhatsAppInteractiveOrderDetailsAmount whatsAppInteractiveOrderDetailsAmount =
                new WhatsAppInteractiveOrderDetailsAmount().value(21000);
        WhatsAppInteractiveOrderDetailsOrderItem whatsAppInteractiveOrderDetailsOrderItem1 =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("1")
                        .name("discounted product")
                        .amount(new WhatsAppInteractiveOrderDetailsAmount().value(10000))
                        .saleAmount(new WhatsAppInteractiveOrderDetailsAmount().value(5000))
                        .quantity(2);
        WhatsAppInteractiveOrderDetailsOrderItem whatsAppInteractiveOrderDetailsOrderItem2 =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("2")
                        .name("product")
                        .amount(new WhatsAppInteractiveOrderDetailsAmount().value(10000))
                        .quantity(1);
        List<WhatsAppInteractiveOrderDetailsOrderItem> whatsAppInteractiveOrderDetailsOrderItemList =
                List.of(whatsAppInteractiveOrderDetailsOrderItem1, whatsAppInteractiveOrderDetailsOrderItem2);
        WhatsAppInteractiveOrderDetailsDescriptiveAmount whatsAppInteractiveOrderDetailsDescriptiveAmountTax =
                new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                        .value(1000)
                        .description("tax included");
        WhatsAppInteractiveOrderDetailsDescriptiveAmount whatsAppInteractiveOrderDetailsDescriptiveAmountShipping =
                new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                        .value(1000)
                        .description("shipping cost");
        WhatsAppInteractiveOrderDetailsDescriptiveAmount
                whatsAppInteractiveOrderDetailsDescriptiveAmountDiscountAmount =
                        new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                                .value(1000)
                                .description("discount");
        WhatsAppInteractiveOrderDetailsDiscount whatsAppInteractiveOrderDetailsDiscount =
                new WhatsAppInteractiveOrderDetailsDiscount()
                        .amount(whatsAppInteractiveOrderDetailsDescriptiveAmountDiscountAmount)
                        .programName("membership discount");
        WhatsAppInteractiveOrderDetailsOrderExpiration whatsAppInteractiveOrderDetailsOrderExpiration =
                new WhatsAppInteractiveOrderDetailsOrderExpiration()
                        .expirationSeconds(500L)
                        .description("limited offer");
        WhatsAppInteractiveOrderDetailsOrder whatsAppInteractiveOrderDetailsOrder =
                new WhatsAppInteractiveOrderDetailsOrder()
                        .catalogId("1")
                        .items(whatsAppInteractiveOrderDetailsOrderItemList)
                        .subtotal(new WhatsAppInteractiveOrderDetailsAmount().value(20000))
                        .tax(whatsAppInteractiveOrderDetailsDescriptiveAmountTax)
                        .shipping(whatsAppInteractiveOrderDetailsDescriptiveAmountShipping)
                        .discount(whatsAppInteractiveOrderDetailsDiscount)
                        .orderExpiration(whatsAppInteractiveOrderDetailsOrderExpiration);
        WhatsAppInteractiveOrderDetailsActionContent whatsAppInteractiveOrderDetailsActionContent =
                new WhatsAppInteractiveOrderDetailsActionContent()
                        .payment(whatsAppInteractiveOrderBrazilPixDcPaymentDetails)
                        .orderCurrency(WhatsAppOrderCurrency.BRL)
                        .orderType(WhatsAppOrderType.DIGITAL_GOODS)
                        .totalAmount(whatsAppInteractiveOrderDetailsAmount)
                        .order(whatsAppInteractiveOrderDetailsOrder);
        WhatsAppInteractiveFooterContent whatsAppInteractiveFooterContent =
                new WhatsAppInteractiveFooterContent().text("Footer");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        whatsAppInteractiveOrderDetailsMessage
                .content(new WhatsAppInteractiveOrderDetailsContent()
                        .body(whatsAppInteractiveBodyContent)
                        .action(whatsAppInteractiveOrderDetailsActionContent)
                        .footer(whatsAppInteractiveFooterContent))
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/order-details", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus messageStatus = whatsAppSingleMessageInfo.getStatus();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsappApi.sendWhatsappInteractiveOrderDetailsMessage(whatsAppInteractiveOrderDetailsMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendInteractiveBrazilOrderDetailsMessageSendWhatsappInteractiveOrderDetailsMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    },\n"
                + "    \"action\": {\n"
                + "      \"payment\": {\n"
                + "        \"type\": \"BRAZIL\",\n"
                + "        \"id\": \"fd3e847h2\"\n"
                + "      },\n"
                + "      \"paymentConfiguration\": \"payment-config\",\n"
                + "      \"orderCurrency\": \"BRL\",\n"
                + "      \"orderType\": \"DIGITAL_GOODS\",\n"
                + "      \"totalAmount\": {\n"
                + "        \"value\": 21000\n"
                + "      },\n"
                + "      \"order\": {\n"
                + "        \"catalogId\": \"1\",\n"
                + "        \"items\": [\n"
                + "          {\n"
                + "            \"retailerId\": \"1\",\n"
                + "            \"name\": \"discounted product\",\n"
                + "            \"amount\": { \"value\": 10000 },\n"
                + "            \"saleAmount\": { \"value\": 5000 },\n"
                + "            \"quantity\": 2\n"
                + "          },\n"
                + "          {\n"
                + "            \"retailerId\": \"2\",\n"
                + "            \"name\": \"product\",\n"
                + "            \"amount\": { \"value\": 10000 },\n"
                + "            \"quantity\": 1\n"
                + "          }\n"
                + "        ],\n"
                + "        \"subtotal\": { \"value\": 20000 },\n"
                + "        \"tax\": { \"value\": 1000, \"description\": \"tax included\" },\n"
                + "        \"shipping\": { \"value\": 1000, \"description\": \"shipping cost\" },\n"
                + "        \"discount\": { \"amount\": { \"value\": 1000, \"description\": \"discount\" }, \"programName\": \"membership discount\" },\n"
                + "        \"orderExpiration\": { \"expirationSeconds\": 500, \"description\": \"limited offer\" }\n"
                + "      }\n"
                + "    },\n"
                + "    \"footer\": { \"text\": \"Footer\" }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveBodyContent whatsAppInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveOrderBrazilPaymentDetails whatsAppInteractiveOrderBrazilPaymentDetails =
                new WhatsAppInteractiveOrderBrazilPaymentDetails().id("fd3e847h2");
        WhatsAppInteractiveOrderDetailsAmount whatsAppInteractiveOrderDetailsAmountTotal =
                new WhatsAppInteractiveOrderDetailsAmount().value(21000);
        WhatsAppInteractiveOrderDetailsOrderItem whatsAppInteractiveOrderDetailsOrderItem1 =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("1")
                        .name("discounted product")
                        .amount(new WhatsAppInteractiveOrderDetailsAmount().value(10000))
                        .saleAmount(new WhatsAppInteractiveOrderDetailsAmount().value(5000))
                        .quantity(2);
        WhatsAppInteractiveOrderDetailsOrderItem whatsAppInteractiveOrderDetailsOrderItem2 =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("2")
                        .name("product")
                        .amount(new WhatsAppInteractiveOrderDetailsAmount().value(10000))
                        .quantity(1);
        List<WhatsAppInteractiveOrderDetailsOrderItem> whatsAppInteractiveOrderDetailsOrderItemList =
                List.of(whatsAppInteractiveOrderDetailsOrderItem1, whatsAppInteractiveOrderDetailsOrderItem2);
        WhatsAppInteractiveOrderDetailsAmount whatsAppInteractiveOrderDetailsAmountSubtotal =
                new WhatsAppInteractiveOrderDetailsAmount().value(20000);
        WhatsAppInteractiveOrderDetailsDescriptiveAmount whatsAppInteractiveOrderDetailsDescriptiveAmountTax =
                new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                        .value(1000)
                        .description("tax included");
        WhatsAppInteractiveOrderDetailsDescriptiveAmount whatsAppInteractiveOrderDetailsDescriptiveAmountShipping =
                new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                        .value(1000)
                        .description("shipping cost");
        WhatsAppInteractiveOrderDetailsDescriptiveAmount
                whatsAppInteractiveOrderDetailsDescriptiveAmountDiscountAmount =
                        new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                                .value(1000)
                                .description("discount");
        WhatsAppInteractiveOrderDetailsDiscount whatsAppInteractiveOrderDetailsDiscount =
                new WhatsAppInteractiveOrderDetailsDiscount()
                        .amount(whatsAppInteractiveOrderDetailsDescriptiveAmountDiscountAmount)
                        .programName("membership discount");
        WhatsAppInteractiveOrderDetailsOrderExpiration whatsAppInteractiveOrderDetailsOrderExpiration =
                new WhatsAppInteractiveOrderDetailsOrderExpiration()
                        .expirationSeconds(500L)
                        .description("limited offer");
        WhatsAppInteractiveOrderDetailsOrder whatsAppInteractiveOrderDetailsOrder =
                new WhatsAppInteractiveOrderDetailsOrder()
                        .catalogId("1")
                        .items(whatsAppInteractiveOrderDetailsOrderItemList)
                        .subtotal(whatsAppInteractiveOrderDetailsAmountSubtotal)
                        .tax(whatsAppInteractiveOrderDetailsDescriptiveAmountTax)
                        .shipping(whatsAppInteractiveOrderDetailsDescriptiveAmountShipping)
                        .discount(whatsAppInteractiveOrderDetailsDiscount)
                        .orderExpiration(whatsAppInteractiveOrderDetailsOrderExpiration);
        WhatsAppInteractiveOrderDetailsActionContent whatsAppInteractiveOrderDetailsActionContent =
                new WhatsAppInteractiveOrderDetailsActionContent()
                        .payment(whatsAppInteractiveOrderBrazilPaymentDetails)
                        .paymentConfiguration("payment-config")
                        .orderCurrency(WhatsAppOrderCurrency.BRL)
                        .orderType(WhatsAppOrderType.DIGITAL_GOODS)
                        .totalAmount(whatsAppInteractiveOrderDetailsAmountTotal)
                        .order(whatsAppInteractiveOrderDetailsOrder);
        WhatsAppInteractiveFooterContent whatsAppInteractiveFooterContent =
                new WhatsAppInteractiveFooterContent().text("Footer");
        WhatsAppInteractiveOrderDetailsContent whatsAppInteractiveOrderDetailsContent =
                new WhatsAppInteractiveOrderDetailsContent()
                        .body(whatsAppInteractiveBodyContent)
                        .action(whatsAppInteractiveOrderDetailsActionContent)
                        .footer(whatsAppInteractiveFooterContent);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveOrderDetailsMessage whatsAppInteractiveOrderDetailsMessage =
                new WhatsAppInteractiveOrderDetailsMessage()
                        .from("441134960000")
                        .to("441134960001")
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .content(whatsAppInteractiveOrderDetailsContent)
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp")
                        .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/order-details", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getTo()).isEqualTo("441134960001");
            then(response.getMessageCount()).isEqualTo(1);
            then(response.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = response.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsappInteractiveOrderDetailsMessage(whatsAppInteractiveOrderDetailsMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldInteractivePgRazorpayOrderDetailsMessageSendWhatsappInteractiveOrderDetailsMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    },\n"
                + "    \"action\": {\n"
                + "      \"payment\": {\n"
                + "        \"type\": \"PG_RAZORPAY\",\n"
                + "        \"id\": \"fd3e847h2\",\n"
                + "        \"beneficiary\": {\n"
                + "          \"name\": \"John Smith\",\n"
                + "          \"firstAddressLine\": \"address line\",\n"
                + "          \"secondAddressLine\": \"address line\",\n"
                + "          \"city\": \"city\",\n"
                + "          \"state\": \"state\",\n"
                + "          \"country\": \"INDIA\",\n"
                + "          \"postalCode\": \"123456\"\n"
                + "        },\n"
                + "        \"callbackData\": {\n"
                + "          \"key0\": \"customData1\",\n"
                + "          \"key1\": \"customData2\",\n"
                + "          \"key2\": \"customData3\",\n"
                + "          \"key3\": \"customData4\",\n"
                + "          \"key4\": \"customData5\",\n"
                + "          \"key5\": \"customData6\",\n"
                + "          \"key6\": \"customData7\",\n"
                + "          \"key7\": \"customData8\",\n"
                + "          \"key8\": \"customData9\",\n"
                + "          \"key9\": \"customData10\",\n"
                + "          \"key10\": \"customData11\",\n"
                + "          \"key11\": \"customData12\",\n"
                + "          \"key12\": \"customData13\",\n"
                + "          \"key13\": \"customData14\",\n"
                + "          \"key14\": \"customData15\"\n"
                + "        }\n"
                + "      },\n"
                + "      \"paymentConfiguration\": \"payment-config\",\n"
                + "      \"orderCurrency\": \"INR\",\n"
                + "      \"orderType\": \"DIGITAL_GOODS\",\n"
                + "      \"totalAmount\": { \"value\": 21000 },\n"
                + "      \"order\": {\n"
                + "        \"catalogId\": \"1\",\n"
                + "        \"items\": [\n"
                + "          {\"retailerId\":\"1\",\"name\":\"discounted product\",\"amount\":{\"value\":10000},\"saleAmount\":{\"value\":5000},\"quantity\":2},\n"
                + "          {\"retailerId\":\"2\",\"name\":\"product\",\"amount\":{\"value\":10000},\"quantity\":1}\n"
                + "        ],\n"
                + "        \"subtotal\": {\"value\":20000},\n"
                + "        \"tax\": {\"value\":1000,\"description\":\"tax included\"},\n"
                + "        \"shipping\": {\"value\":1000,\"description\":\"shipping cost\"},\n"
                + "        \"discount\": {\"amount\":{\"value\":1000,\"description\":\"discount\"},\"programName\":\"membership discount\"},\n"
                + "        \"orderExpiration\": {\"expirationSeconds\":500,\"description\":\"limited offer\"}\n"
                + "      }\n"
                + "    },\n"
                + "    \"footer\": { \"text\": \"Footer\" }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": { \"shortenUrl\": true, \"trackClicks\": true, \"trackingUrl\": \"https://example.com/click-report\", \"removeProtocol\": true }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveBodyContent whatsAppInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppBeneficiary whatsAppBeneficiary = new WhatsAppBeneficiary()
                .name("John Smith")
                .firstAddressLine("address line")
                .secondAddressLine("address line")
                .city("city")
                .state("state")
                .country(WhatsAppBeneficiaryCountry.INDIA)
                .postalCode("123456");
        Map<String, String> callbackDataMap = Map.ofEntries(
                Map.entry("key0", "customData1"),
                Map.entry("key1", "customData2"),
                Map.entry("key2", "customData3"),
                Map.entry("key3", "customData4"),
                Map.entry("key4", "customData5"),
                Map.entry("key5", "customData6"),
                Map.entry("key6", "customData7"),
                Map.entry("key7", "customData8"),
                Map.entry("key8", "customData9"),
                Map.entry("key9", "customData10"),
                Map.entry("key10", "customData11"),
                Map.entry("key11", "customData12"),
                Map.entry("key12", "customData13"),
                Map.entry("key13", "customData14"),
                Map.entry("key14", "customData15"));
        WhatsAppInteractiveOrderUPIPGRazorpayPaymentDetails whatsAppInteractiveOrderUPIPGRazorpayPaymentDetails =
                new WhatsAppInteractiveOrderUPIPGRazorpayPaymentDetails()
                        .id("fd3e847h2")
                        .beneficiary(whatsAppBeneficiary)
                        .callbackData(callbackDataMap);
        WhatsAppInteractiveOrderDetailsAmount whatsAppInteractiveOrderDetailsAmountTotal =
                new WhatsAppInteractiveOrderDetailsAmount().value(21000);
        WhatsAppInteractiveOrderDetailsOrderItem whatsAppInteractiveOrderDetailsOrderItem =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("1")
                        .name("discounted product")
                        .amount(new WhatsAppInteractiveOrderDetailsAmount().value(10000))
                        .saleAmount(new WhatsAppInteractiveOrderDetailsAmount().value(5000))
                        .quantity(2);
        WhatsAppInteractiveOrderDetailsOrderItem whatsAppInteractiveOrderDetailsOrderItem2 =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("2")
                        .name("product")
                        .amount(new WhatsAppInteractiveOrderDetailsAmount().value(10000))
                        .quantity(1);
        List<WhatsAppInteractiveOrderDetailsOrderItem> whatsAppInteractiveOrderDetailsOrderItemList =
                List.of(whatsAppInteractiveOrderDetailsOrderItem, whatsAppInteractiveOrderDetailsOrderItem2);
        WhatsAppInteractiveOrderDetailsDescriptiveAmount whatsAppInteractiveOrderDetailsDescriptiveAmountTax =
                new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                        .value(1000)
                        .description("tax included");
        WhatsAppInteractiveOrderDetailsDescriptiveAmount whatsAppInteractiveOrderDetailsDescriptiveAmountShipping =
                new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                        .value(1000)
                        .description("shipping cost");
        WhatsAppInteractiveOrderDetailsDescriptiveAmount
                whatsAppInteractiveOrderDetailsDescriptiveAmountDiscountAmount =
                        new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                                .value(1000)
                                .description("discount");
        WhatsAppInteractiveOrderDetailsDiscount whatsAppInteractiveOrderDetailsDiscount =
                new WhatsAppInteractiveOrderDetailsDiscount()
                        .amount(whatsAppInteractiveOrderDetailsDescriptiveAmountDiscountAmount)
                        .programName("membership discount");
        WhatsAppInteractiveOrderDetailsOrderExpiration whatsAppInteractiveOrderDetailsOrderExpiration =
                new WhatsAppInteractiveOrderDetailsOrderExpiration()
                        .expirationSeconds(500L)
                        .description("limited offer");
        WhatsAppInteractiveOrderDetailsOrder whatsAppInteractiveOrderDetailsOrder =
                new WhatsAppInteractiveOrderDetailsOrder()
                        .catalogId("1")
                        .items(whatsAppInteractiveOrderDetailsOrderItemList)
                        .subtotal(new WhatsAppInteractiveOrderDetailsAmount().value(20000))
                        .tax(whatsAppInteractiveOrderDetailsDescriptiveAmountTax)
                        .shipping(whatsAppInteractiveOrderDetailsDescriptiveAmountShipping)
                        .discount(whatsAppInteractiveOrderDetailsDiscount)
                        .orderExpiration(whatsAppInteractiveOrderDetailsOrderExpiration);
        WhatsAppInteractiveOrderDetailsActionContent whatsAppInteractiveOrderDetailsActionContent =
                new WhatsAppInteractiveOrderDetailsActionContent()
                        .payment(whatsAppInteractiveOrderUPIPGRazorpayPaymentDetails)
                        .paymentConfiguration("payment-config")
                        .orderCurrency(WhatsAppOrderCurrency.INR)
                        .orderType(WhatsAppOrderType.DIGITAL_GOODS)
                        .totalAmount(whatsAppInteractiveOrderDetailsAmountTotal)
                        .order(whatsAppInteractiveOrderDetailsOrder);
        WhatsAppInteractiveFooterContent whatsAppInteractiveFooterContent =
                new WhatsAppInteractiveFooterContent().text("Footer");
        WhatsAppInteractiveOrderDetailsContent whatsAppInteractiveOrderDetailsContent =
                new WhatsAppInteractiveOrderDetailsContent()
                        .body(whatsAppInteractiveBodyContent)
                        .action(whatsAppInteractiveOrderDetailsActionContent)
                        .footer(whatsAppInteractiveFooterContent);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveOrderDetailsMessage whatsAppInteractiveOrderDetailsMessage =
                new WhatsAppInteractiveOrderDetailsMessage()
                        .from("441134960000")
                        .to("441134960001")
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .content(whatsAppInteractiveOrderDetailsContent)
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp")
                        .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/order-details", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus messageStatus = whatsAppSingleMessageInfo.getStatus();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsappInteractiveOrderDetailsMessage(whatsAppInteractiveOrderDetailsMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldBodyAndFooterInteractiveOrderStatusMessageSendWhatsappInteractiveOrderStatusMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"action\": {\n"
                + "      \"payment\": {\n"
                + "        \"type\": \"UPI_PAYU\",\n"
                + "        \"id\": \"16085194825\"\n"
                + "      },\n"
                + "      \"status\": \"SHIPPED\",\n"
                + "      \"description\": \"Order shipped\"\n"
                + "    },\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"Footer\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveOrderUPIPayUPaymentStatus whatsappInteractiveOrderUPIPayUPaymentStatus =
                new WhatsAppInteractiveOrderUPIPayUPaymentStatus().id("16085194825");
        WhatsAppInteractiveOrderStatusActionContent whatsappInteractiveOrderStatusActionContent =
                new WhatsAppInteractiveOrderStatusActionContent()
                        .payment(whatsappInteractiveOrderUPIPayUPaymentStatus)
                        .status(WhatsAppOrderStatus.SHIPPED)
                        .description("Order shipped");
        WhatsAppInteractiveBodyContent whatsappInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveFooterContent whatsappInteractiveFooterContent =
                new WhatsAppInteractiveFooterContent().text("Footer");
        WhatsAppInteractiveOrderStatusContent whatsappInteractiveOrderStatusContent =
                new WhatsAppInteractiveOrderStatusContent()
                        .action(whatsappInteractiveOrderStatusActionContent)
                        .body(whatsappInteractiveBodyContent)
                        .footer(whatsappInteractiveFooterContent);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveOrderStatusMessage whatsAppInteractiveOrderStatusMessage =
                new WhatsAppInteractiveOrderStatusMessage()
                        .from("441134960000")
                        .to("441134960001")
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .content(whatsappInteractiveOrderStatusContent)
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp")
                        .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/order-status", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsappSingleMessageInfo) -> {
            then(whatsappSingleMessageInfo).isNotNull();
            then(whatsappSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsappSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsappSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsappSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsappInteractiveOrderStatusMessage(whatsAppInteractiveOrderStatusMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendBodyInteractiveOrderStatusMessageSendWhatsappInteractiveOrderStatusMessage() {
        WhatsAppApi whatsappApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"action\": {\n"
                + "      \"payment\": {\n"
                + "        \"type\": \"UPI_PAYU\",\n"
                + "        \"id\": \"16085194825\"\n"
                + "      },\n"
                + "      \"status\": \"SHIPPED\",\n"
                + "      \"description\": \"Order shipped\"\n"
                + "    },\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n                "
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveOrderUPIPayUPaymentStatus whatsappInteractiveOrderUPIPayUPaymentStatus =
                new WhatsAppInteractiveOrderUPIPayUPaymentStatus().id("16085194825");
        WhatsAppInteractiveOrderStatusActionContent whatsappInteractiveOrderStatusActionContent =
                new WhatsAppInteractiveOrderStatusActionContent()
                        .payment(whatsappInteractiveOrderUPIPayUPaymentStatus)
                        .status(WhatsAppOrderStatus.SHIPPED)
                        .description("Order shipped");
        WhatsAppInteractiveBodyContent whatsappInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveOrderStatusContent whatsappInteractiveOrderStatusContent =
                new WhatsAppInteractiveOrderStatusContent()
                        .action(whatsappInteractiveOrderStatusActionContent)
                        .body(whatsappInteractiveBodyContent);
        WhatsAppInteractiveOrderStatusMessage whatsappInteractiveOrderStatusMessage =
                new WhatsAppInteractiveOrderStatusMessage()
                        .from("441134960000")
                        .to("441134960001")
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .content(whatsappInteractiveOrderStatusContent)
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp")
                        .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/order-status", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsappSingleMessageInfo) -> {
            then(whatsappSingleMessageInfo).isNotNull();
            then(whatsappSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsappSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsappSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsappSingleMessageStatus = whatsappSingleMessageInfo.getStatus();
            then(whatsappSingleMessageStatus).isNotNull();
            then(whatsappSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsappSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsappSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsappSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsappSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsappApi.sendWhatsappInteractiveOrderStatusMessage(whatsappInteractiveOrderStatusMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldFooterInteractiveOrderStatusMessageSendWhatsappInteractiveOrderStatusMessage() {
        WhatsAppApi whatsappApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"action\": {\n"
                + "      \"payment\": {\n"
                + "        \"type\": \"UPI_PAYU\",\n"
                + "        \"id\": \"16085194825\"\n"
                + "      },\n"
                + "      \"status\": \"SHIPPED\",\n"
                + "      \"description\": \"Order shipped\"\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"Footer\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n            \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveOrderUPIPayUPaymentStatus whatsAppInteractiveOrderUPIPayUPaymentStatus =
                new WhatsAppInteractiveOrderUPIPayUPaymentStatus().id("16085194825");
        WhatsAppInteractiveOrderStatusActionContent whatsAppInteractiveOrderStatusActionContent =
                new WhatsAppInteractiveOrderStatusActionContent()
                        .payment(whatsAppInteractiveOrderUPIPayUPaymentStatus)
                        .status(WhatsAppOrderStatus.SHIPPED)
                        .description("Order shipped");
        WhatsAppInteractiveFooterContent whatsAppInteractiveFooterContent =
                new WhatsAppInteractiveFooterContent().text("Footer");
        WhatsAppInteractiveOrderStatusContent whatsAppInteractiveOrderStatusContent =
                new WhatsAppInteractiveOrderStatusContent()
                        .action(whatsAppInteractiveOrderStatusActionContent)
                        .footer(whatsAppInteractiveFooterContent);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveOrderStatusMessage whatsappInteractiveOrderStatusMessage =
                new WhatsAppInteractiveOrderStatusMessage()
                        .from("441134960000")
                        .to("441134960001")
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .content(whatsAppInteractiveOrderStatusContent)
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp")
                        .urlOptions(urlOptions);
        Consumer<WhatsAppSingleMessageInfo> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getTo()).isEqualTo("441134960001");
            then(response.getMessageCount()).isEqualTo(1);
            then(response.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus messageStatus = response.getStatus();
            then(messageStatus).isNotNull();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsappApi.sendWhatsappInteractiveOrderStatusMessage(whatsappInteractiveOrderStatusMessage);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/order-status", givenRequest, givenResponse);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendInteractiveOrderStatusMessageSendWhatsappInteractiveOrderStatusMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"action\": {\n"
                + "      \"payment\": {\n"
                + "        \"type\": \"UPI_PAYU\",\n"
                + "        \"id\": \"16085194825\"\n"
                + "      },\n"
                + "      \"status\": \"SHIPPED\",\n"
                + "      \"description\": \"Order shipped\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveOrderUPIPayUPaymentStatus whatsappInteractiveOrderUPIPayUPaymentStatus =
                new WhatsAppInteractiveOrderUPIPayUPaymentStatus().id("16085194825");
        WhatsAppInteractiveOrderStatusActionContent whatsappInteractiveOrderStatusActionContent =
                new WhatsAppInteractiveOrderStatusActionContent()
                        .payment(whatsappInteractiveOrderUPIPayUPaymentStatus)
                        .status(WhatsAppOrderStatus.SHIPPED)
                        .description("Order shipped");
        WhatsAppInteractiveOrderStatusContent whatsappInteractiveOrderStatusContent =
                new WhatsAppInteractiveOrderStatusContent().action(whatsappInteractiveOrderStatusActionContent);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveOrderStatusMessage whatsappInteractiveOrderStatusMessage =
                new WhatsAppInteractiveOrderStatusMessage()
                        .from("441134960000")
                        .to("441134960001")
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .content(whatsappInteractiveOrderStatusContent)
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp")
                        .urlOptions(urlOptions);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsappSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsappSingleMessageStatus).isNotNull();
            then(whatsappSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsappSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsappSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsappSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsappSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/order-status", givenRequest, givenResponse);
        var call = whatsAppApi.sendWhatsappInteractiveOrderStatusMessage(whatsappInteractiveOrderStatusMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendBodyAndFooterInteractiveProductMessageSendWhatsAppInteractiveProductMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"action\": {\n"
                + "      \"catalogId\": \"1\",\n"
                + "      \"productRetailerId\": \"2\"\n"
                + "    },\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"Footer\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveProductActionContent whatsAppInteractiveProductActionContent =
                new WhatsAppInteractiveProductActionContent().catalogId("1").productRetailerId("2");
        WhatsAppInteractiveBodyContent whatsAppInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveFooterContent whatsAppInteractiveFooterContent =
                new WhatsAppInteractiveFooterContent().text("Footer");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveProductMessage whatsAppInteractiveProductMessage = new WhatsAppInteractiveProductMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(new WhatsAppInteractiveProductContent()
                        .action(whatsAppInteractiveProductActionContent)
                        .body(whatsAppInteractiveBodyContent)
                        .footer(whatsAppInteractiveFooterContent))
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/product", givenRequest, givenResponse);
        var call = whatsAppApi.sendWhatsAppInteractiveProductMessage(whatsAppInteractiveProductMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldBodyInteractiveProductMessageSendWhatsAppInteractiveProductMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"action\": {\n"
                + "      \"catalogId\": \"1\",\n"
                + "      \"productRetailerId\": \"2\"\n"
                + "    },\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveProductActionContent whatsAppInteractiveProductActionContent =
                new WhatsAppInteractiveProductActionContent().catalogId("1").productRetailerId("2");
        WhatsAppInteractiveBodyContent whatsAppInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveProductContent whatsAppInteractiveProductContent = new WhatsAppInteractiveProductContent()
                .action(whatsAppInteractiveProductActionContent)
                .body(whatsAppInteractiveBodyContent);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveProductMessage whatsAppInteractiveProductMessage = new WhatsAppInteractiveProductMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppInteractiveProductContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/product", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus messageStatus = whatsAppSingleMessageInfo.getStatus();
            then(messageStatus).isNotNull();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsAppInteractiveProductMessage(whatsAppInteractiveProductMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldFooterInteractiveProductMessageSendWhatsAppInteractiveProductMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"action\": {\n"
                + "      \"catalogId\": \"1\",\n"
                + "      \"productRetailerId\": \"2\"\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"Footer\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n            \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveProductActionContent whatsAppInteractiveProductActionContent =
                new WhatsAppInteractiveProductActionContent().catalogId("1").productRetailerId("2");
        WhatsAppInteractiveFooterContent whatsAppInteractiveFooterContent =
                new WhatsAppInteractiveFooterContent().text("Footer");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveProductContent whatsAppInteractiveProductContent = new WhatsAppInteractiveProductContent()
                .action(whatsAppInteractiveProductActionContent)
                .footer(whatsAppInteractiveFooterContent);
        WhatsAppInteractiveProductMessage whatsAppInteractiveProductMessage = new WhatsAppInteractiveProductMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppInteractiveProductContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/product", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsappSingleMessageInfo) -> {
            then(whatsappSingleMessageInfo).isNotNull();
            then(whatsappSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsappSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsappSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsappSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsappSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsAppInteractiveProductMessage(whatsAppInteractiveProductMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldInteractiveProductMessageSendWhatsAppInteractiveProductMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"action\": {\n"
                + "      \"catalogId\": \"1\",\n"
                + "      \"productRetailerId\": \"2\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveProductActionContent whatsAppInteractiveProductActionContent =
                new WhatsAppInteractiveProductActionContent().catalogId("1").productRetailerId("2");
        WhatsAppInteractiveProductContent whatsAppInteractiveProductContent =
                new WhatsAppInteractiveProductContent().action(whatsAppInteractiveProductActionContent);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveProductMessage whatsAppInteractiveProductMessage = new WhatsAppInteractiveProductMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppInteractiveProductContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/product", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoConsumer = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsAppInteractiveProductMessage(whatsAppInteractiveProductMessage);
        testSuccessfulCall(call::execute, whatsAppSingleMessageInfoConsumer);
        testSuccessfulAsyncCall(call::executeAsync, whatsAppSingleMessageInfoConsumer);
    }

    @Test
    void shouldSendHeaderAndFooterInteractiveUrlButtonMessageSendWhatsappInteractiveUrlButtonMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    },\n"
                + "    \"action\": {\n"
                + "      \"displayText\": \"Display text\",\n"
                + "      \"url\": \"https://www.example.com\"\n"
                + "    },\n"
                + "    \"header\": {\n"
                + "      \"type\": \"TEXT\",\n"
                + "      \"text\": \"Header text\"\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"Footer text\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveBodyContent whatsAppInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveUrlButtonActionContent whatsAppInteractiveUrlButtonActionContent =
                new WhatsAppInteractiveUrlButtonActionContent()
                        .displayText("Display text")
                        .url("https://www.example.com");
        WhatsAppInteractiveUrlButtonTextHeaderContent whatsAppInteractiveUrlButtonTextHeaderContent =
                new WhatsAppInteractiveUrlButtonTextHeaderContent().text("Header text");
        WhatsAppInteractiveFooterContent whatsAppInteractiveFooterContent =
                new WhatsAppInteractiveFooterContent().text("Footer text");
        WhatsAppInteractiveUrlButtonContent whatsAppInteractiveUrlButtonContent =
                new WhatsAppInteractiveUrlButtonContent()
                        .body(whatsAppInteractiveBodyContent)
                        .action(whatsAppInteractiveUrlButtonActionContent)
                        .header(whatsAppInteractiveUrlButtonTextHeaderContent)
                        .footer(whatsAppInteractiveFooterContent);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveUrlButtonMessage whatsAppInteractiveUrlButtonMessage =
                new WhatsAppInteractiveUrlButtonMessage()
                        .from("441134960000")
                        .to("441134960001")
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .content(whatsAppInteractiveUrlButtonContent)
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp")
                        .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/url-button", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsappInteractiveUrlButtonMessage(whatsAppInteractiveUrlButtonMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendInteractiveUrlButtonMessageSendWhatsappInteractiveUrlButtonMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"Some text\"\n"
                + "    },\n"
                + "    \"action\": {\n"
                + "      \"displayText\": \"Display text\",\n"
                + "      \"url\": \"https://www.example.com\"\n"
                + "    }\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppInteractiveBodyContent whatsAppInteractiveBodyContent =
                new WhatsAppInteractiveBodyContent().text("Some text");
        WhatsAppInteractiveUrlButtonActionContent whatsAppInteractiveUrlButtonActionContent =
                new WhatsAppInteractiveUrlButtonActionContent()
                        .displayText("Display text")
                        .url("https://www.example.com");
        WhatsAppInteractiveUrlButtonContent whatsAppInteractiveUrlButtonContent =
                new WhatsAppInteractiveUrlButtonContent()
                        .body(whatsAppInteractiveBodyContent)
                        .action(whatsAppInteractiveUrlButtonActionContent);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppInteractiveUrlButtonMessage whatsAppInteractiveUrlButtonMessage =
                new WhatsAppInteractiveUrlButtonMessage()
                        .from("441134960000")
                        .to("441134960001")
                        .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                        .content(whatsAppInteractiveUrlButtonContent)
                        .callbackData("Callback data")
                        .notifyUrl("https://www.example.com/whatsapp")
                        .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/interactive/url-button", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsappInteractiveUrlButtonMessage(whatsAppInteractiveUrlButtonMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldLocationMessageSendWhatsAppLocationMessage() {
        WhatsAppApi whatsappApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"latitude\": 44.9526862,\n"
                + "    \"longitude\": 13.8545217\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\"\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppLocationContent whatsappLocationContent =
                new WhatsAppLocationContent().latitude(44.9526862).longitude(13.8545217);
        WhatsAppLocationMessage whatsappLocationMessage = new WhatsAppLocationMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsappLocationContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp");
        setUpSuccessPostRequest("/whatsapp/1/message/location", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getTo()).isEqualTo("441134960001");
            then(response.getMessageCount()).isEqualTo(1);
            then(response.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(response.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = response.getStatus();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsappApi.sendWhatsAppLocationMessage(whatsappLocationMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldLocationMessageWithAllFieldsSendWhatsAppLocationMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"latitude\": 44.9526862,\n"
                + "    \"longitude\": 13.8545217,\n"
                + "    \"name\": \"Infobip\",\n"
                + "    \"address\": \"Vodnjan, Croatia\"\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\"\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n                "
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppLocationContent whatsAppLocationContent = new WhatsAppLocationContent()
                .latitude(44.9526862)
                .longitude(13.8545217)
                .name("Infobip")
                .address("Vodnjan, Croatia");
        WhatsAppLocationMessage whatsAppLocationMessage = new WhatsAppLocationMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppLocationContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp");
        setUpSuccessPostRequest("/whatsapp/1/message/location", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getTo()).isEqualTo("441134960001");
            then(response.getMessageCount()).isEqualTo(1);
            then(response.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(response.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = response.getStatus();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsAppLocationMessage(whatsAppLocationMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendStickerMessageSendWhatsAppStickerMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"mediaUrl\": \"http://example.com/sticker\"\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\"\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppStickerContent whatsAppStickerContent =
                new WhatsAppStickerContent().mediaUrl("http://example.com/sticker");
        WhatsAppStickerMessage whatsAppStickerMessage = new WhatsAppStickerMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppStickerContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp");
        setUpSuccessPostRequest("/whatsapp/1/message/sticker", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsAppStickerMessage(whatsAppStickerMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendAuthenticationWithCopyCodeButtonTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": [\n"
                + "              \"Authentication Code Value\"\n"
                + "            ]\n"
                + "          },\n"
                + "          \"buttons\": [\n"
                + "            {\n"
                + "              \"type\": \"URL\",\n"
                + "              \"parameter\": \"Authentication Code Value\"\n"
                + "            }\n"
                + "          ]\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n                \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        WhatsAppTemplateUrlButtonContent whatsAppTemplateUrlButtonContent =
                new WhatsAppTemplateUrlButtonContent().parameter("Authentication Code Value");
        List<WhatsAppTemplateButtonContent> whatsAppTemplateButtonContentList =
                List.of(whatsAppTemplateUrlButtonContent);
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent =
                new WhatsAppTemplateBodyContent().addPlaceholdersItem("Authentication Code Value");
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent()
                .body(whatsAppTemplateBodyContent)
                .buttons(whatsAppTemplateButtonContentList);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldAuthenticationWithOneTapButtonTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": [\n"
                + "              \"Authentication Code Value\"\n"
                + "            ]\n"
                + "          },\n"
                + "          \"buttons\": [\n"
                + "            {\n"
                + "              \"type\": \"URL\",\n"
                + "              \"parameter\": \"Authentication Code Value\"\n"
                + "            }\n"
                + "          ]\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n"
                + "        \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppTemplateUrlButtonContent whatsAppTemplateUrlButtonContent =
                new WhatsAppTemplateUrlButtonContent().parameter("Authentication Code Value");
        List<WhatsAppTemplateButtonContent> whatsAppTemplateButtonContentList =
                List.of(whatsAppTemplateUrlButtonContent);
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent =
                new WhatsAppTemplateBodyContent().addPlaceholdersItem("Authentication Code Value");
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent()
                .body(whatsAppTemplateBodyContent)
                .buttons(whatsAppTemplateButtonContentList);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendBodyTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": [\n"
                + "              \"Placeholder Value 1\",\n"
                + "              \"Placeholder Value 2\"\n"
                + "            ]\n"
                + "          }\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n"
                + "        \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent = new WhatsAppTemplateBodyContent();
        List<String> placeholdersList = List.of("Placeholder Value 1", "Placeholder Value 2");
        whatsAppTemplateBodyContent.setPlaceholders(placeholdersList);
        WhatsAppTemplateDataContent whatsAppTemplateDataContent =
                new WhatsAppTemplateDataContent().body(whatsAppTemplateBodyContent);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldBulkTemplateMessagesSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": [\n"
                + "              \"Placeholder Value 1\"\n"
                + "            ]\n"
                + "          }\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n"
                + "        \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    },\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960002\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381db\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": [\n"
                + "              \"Placeholder Value 1\"\n"
                + "            ]\n"
                + "          }\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n"
                + "        \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"BULK-ID-123-xyz\"\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent =
                new WhatsAppTemplateBodyContent().addPlaceholdersItem("Placeholder Value 1");
        WhatsAppTemplateDataContent whatsAppTemplateDataContent =
                new WhatsAppTemplateDataContent().body(whatsAppTemplateBodyContent);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        WhatsAppMessage whatsAppMessage2 = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960002")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381db")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage, whatsAppMessage2);
        WhatsAppBulkMessage whatsAppBulkMessage =
                new WhatsAppBulkMessage().bulkId("BULK-ID-123-xyz").messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendCallPermissionRequestTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": []\n"
                + "          }\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n"
                + "        \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        List<String> whatsAppTemplateBodyContentPlaceholdersList = List.of();
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent =
                new WhatsAppTemplateBodyContent().placeholders(whatsAppTemplateBodyContentPlaceholdersList);
        WhatsAppTemplateDataContent whatsAppTemplateDataContent =
                new WhatsAppTemplateDataContent().body(whatsAppTemplateBodyContent);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus messageStatus = whatsAppSingleMessageInfo.getStatus();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCarouselMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": []\n"
                + "          },\n"
                + "          \"carousel\": {\n"
                + "            \"cards\": [\n"
                + "              {\n"
                + "                \"header\": {\n"
                + "                  \"type\": \"IMAGE\",\n"
                + "                  \"mediaUrl\": \"http://example.com/image\"\n"
                + "                }\n"
                + "              }\n"
                + "            ]\n"
                + "          }\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n"
                + "        \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        WhatsAppTemplateImageHeaderContent whatsAppTemplateImageHeaderContent =
                new WhatsAppTemplateImageHeaderContent().mediaUrl("http://example.com/image");
        WhatsAppTemplateCardContent whatsAppTemplateCardContent =
                new WhatsAppTemplateCardContent().header(whatsAppTemplateImageHeaderContent);
        List<WhatsAppTemplateCardContent> whatsAppTemplateCardContentList = List.of(whatsAppTemplateCardContent);
        WhatsAppTemplateCarouselContent whatsAppTemplateCarouselContent =
                new WhatsAppTemplateCarouselContent().cards(whatsAppTemplateCardContentList);
        List<String> placeholdersList = List.of();
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent =
                new WhatsAppTemplateBodyContent().placeholders(placeholdersList);
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent()
                .body(whatsAppTemplateBodyContent)
                .carousel(whatsAppTemplateCarouselContent);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendCarouselMessageWithButtonsInCardSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": []\n"
                + "          },\n"
                + "          \"carousel\": {\n"
                + "            \"cards\": [\n"
                + "              {\n"
                + "                \"header\": {\n"
                + "                  \"type\": \"IMAGE\",\n"
                + "                  \"mediaUrl\": \"http://example.com/image\"\n"
                + "                },\n"
                + "                \"buttons\": [\n"
                + "                  {\n"
                + "                    \"type\": \"QUICK_REPLY\",\n"
                + "                    \"parameter\": \"Yes\"\n"
                + "                  },\n"
                + "                  {\n"
                + "                    \"type\": \"QUICK_REPLY\",\n"
                + "                    \"parameter\": \"No\"\n"
                + "                  }\n"
                + "                ]\n"
                + "              }\n"
                + "            ]\n"
                + "          }\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n"
                + "        \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        WhatsAppTemplateImageHeaderContent whatsappTemplateImageHeaderContent =
                new WhatsAppTemplateImageHeaderContent().mediaUrl("http://example.com/image");
        WhatsAppTemplateQuickReplyButtonContent whatsappTemplateQuickReplyButtonContent =
                new WhatsAppTemplateQuickReplyButtonContent().parameter("Yes");
        WhatsAppTemplateQuickReplyButtonContent whatsappTemplateQuickReplyButtonContent2 =
                new WhatsAppTemplateQuickReplyButtonContent().parameter("No");
        List<WhatsAppTemplateButtonContent> whatsappTemplateQuickReplyButtonContentList =
                List.of(whatsappTemplateQuickReplyButtonContent, whatsappTemplateQuickReplyButtonContent2);
        WhatsAppTemplateCardContent whatsappTemplateCardContent = new WhatsAppTemplateCardContent()
                .header(whatsappTemplateImageHeaderContent)
                .buttons(whatsappTemplateQuickReplyButtonContentList);
        List<WhatsAppTemplateCardContent> whatsappTemplateCardContentList = List.of(whatsappTemplateCardContent);
        WhatsAppTemplateCarouselContent whatsappTemplateCarouselContent =
                new WhatsAppTemplateCarouselContent().cards(whatsappTemplateCardContentList);
        List<String> placeholdersList = List.of();
        WhatsAppTemplateBodyContent whatsappTemplateBodyContent =
                new WhatsAppTemplateBodyContent().placeholders(placeholdersList);
        WhatsAppTemplateDataContent whatsappTemplateDataContent = new WhatsAppTemplateDataContent()
                .body(whatsappTemplateBodyContent)
                .carousel(whatsappTemplateCarouselContent);
        WhatsAppTemplateContent whatsappTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsappTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsappMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsappTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsappMessageList = List.of(whatsappMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsappMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsappSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsappSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsappSingleMessageInfo = whatsappSingleMessageInfoList.get(0);
            then(whatsappSingleMessageInfo).isNotNull();
            then(whatsappSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsappSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsappSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsappSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus messageStatus = whatsappSingleMessageInfo.getStatus();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendCatalogButtonTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": []\n"
                + "          },\n"
                + "          \"buttons\": [\n"
                + "            {\n"
                + "              \"type\": \"CATALOG\",\n"
                + "              \"thumbnailProductRetailerId\": \"qihxicpdu3\"\n"
                + "            }\n"
                + "          ]\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n            \"trackingUrl\": \"https://example.com/click-report\",\n            \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        List<String> stringList = List.of();
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent =
                new WhatsAppTemplateBodyContent().placeholders(stringList);
        WhatsAppTemplateCatalogButtonContent whatsAppTemplateCatalogButtonContent =
                new WhatsAppTemplateCatalogButtonContent().thumbnailProductRetailerId("qihxicpdu3");
        List<WhatsAppTemplateButtonContent> whatsAppTemplateButtonContentList =
                List.of(whatsAppTemplateCatalogButtonContent);
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent()
                .body(whatsAppTemplateBodyContent)
                .buttons(whatsAppTemplateButtonContentList);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendCatalogButtonTemplateMessageWithoutOptionalFieldsSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": []\n"
                + "          },\n"
                + "          \"buttons\": [\n"
                + "            {\n"
                + "              \"type\": \"CATALOG\"\n"
                + "            }\n"
                + "          ]\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n"
                + "        \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppTemplateCatalogButtonContent whatsAppTemplateCatalogButtonContent =
                new WhatsAppTemplateCatalogButtonContent();
        List<WhatsAppTemplateButtonContent> whatsAppTemplateButtonContentList =
                List.of(whatsAppTemplateCatalogButtonContent);
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent = new WhatsAppTemplateBodyContent();
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent()
                .body(whatsAppTemplateBodyContent)
                .buttons(whatsAppTemplateButtonContentList);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCouponTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsappApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": []\n"
                + "          },\n"
                + "          \"buttons\": [\n"
                + "            {\n"
                + "              \"type\": \"COPY_CODE\",\n"
                + "              \"parameter\": \"exampleCode\"\n"
                + "            }\n"
                + "          ]\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n                \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        WhatsAppTemplateCopyCodeButtonContent whatsappTemplateCopyCodeButtonContent =
                new WhatsAppTemplateCopyCodeButtonContent().parameter("exampleCode");
        List<WhatsAppTemplateButtonContent> whatsappTemplateButtonContentList =
                List.of(whatsappTemplateCopyCodeButtonContent);
        List<String> whatsappTemplateBodyContentPlaceholdersList = List.of();
        WhatsAppTemplateBodyContent whatsappTemplateBodyContent =
                new WhatsAppTemplateBodyContent().placeholders(whatsappTemplateBodyContentPlaceholdersList);
        WhatsAppTemplateDataContent whatsappTemplateDataContent = new WhatsAppTemplateDataContent()
                .body(whatsappTemplateBodyContent)
                .buttons(whatsappTemplateButtonContentList);
        WhatsAppTemplateContent whatsappTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsappTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsappMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsappTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsappMessageList = List.of(whatsappMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsappMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsappBulkMessageInfo) -> {
            then(whatsappBulkMessageInfo).isNotNull();
            then(whatsappBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
            then(whatsappBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsappSingleMessageInfoList = whatsappBulkMessageInfo.getMessages();
            then(whatsappSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsappSingleMessageInfo = whatsappSingleMessageInfoList.get(0);
            then(whatsappSingleMessageInfo).isNotNull();
            then(whatsappSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsappSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsappSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsappSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus whatsappSingleMessageStatus = whatsappSingleMessageInfo.getStatus();
            then(whatsappSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsappSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsappSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsappSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsappSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsappApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendDocumentHeaderTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": []\n"
                + "          },\n"
                + "          \"header\": {\n"
                + "            \"type\": \"DOCUMENT\",\n"
                + "            \"mediaUrl\": \"http://example.com/document\",\n"
                + "            \"filename\": \"document.pdf\"\n"
                + "          }\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n"
                + "        \"trackingUrl\": \"https://example.com/click-report\",\n                "
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        WhatsAppTemplateDocumentHeaderContent whatsAppTemplateDocumentHeaderContent =
                new WhatsAppTemplateDocumentHeaderContent()
                        .mediaUrl("http://example.com/document")
                        .filename("document.pdf");
        List<String> placeholdersList = List.of();
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent = new WhatsAppTemplateBodyContent();
        whatsAppTemplateBodyContent.setPlaceholders(placeholdersList);
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent();
        whatsAppTemplateDataContent.setHeader(whatsAppTemplateDocumentHeaderContent);
        whatsAppTemplateDataContent.setBody(whatsAppTemplateBodyContent);
        WhatsAppTemplateContent whatsAppTemplateContent =
                new WhatsAppTemplateContent().templateName("template_name").language("en_GB");
        whatsAppTemplateContent.setTemplateData(whatsAppTemplateDataContent);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus messageStatus = whatsAppSingleMessageInfo.getStatus();
            then(messageStatus).isNotNull();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendDynamicUrlButtonTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": []\n"
                + "          },\n"
                + "          \"buttons\": [\n"
                + "            {\n"
                + "              \"type\": \"URL\",\n"
                + "              \"parameter\": \"docs\"\n"
                + "            }\n"
                + "          ]\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n                \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent =
                new WhatsAppTemplateBodyContent().placeholders(List.of());
        List<String> stringList = List.of();
        WhatsAppTemplateUrlButtonContent whatsAppTemplateUrlButtonContent =
                new WhatsAppTemplateUrlButtonContent().parameter("docs");
        List<WhatsAppTemplateButtonContent> whatsAppTemplateButtonContentList =
                List.of(whatsAppTemplateUrlButtonContent);
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent()
                .body(whatsAppTemplateBodyContent)
                .buttons(whatsAppTemplateButtonContentList);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldFlowButtonTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest =
                "{\"messages\":[{\"from\":\"441134960000\",\"to\":\"441134960001\",\"messageId\":\"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\"content\":{\"templateName\":\"template_name\",\"templateData\":{\"body\":{\"placeholders\":[]},\"buttons\":[{\"type\":\"FLOW\"}]},\"language\":\"en_GB\"},\"callbackData\":\"Callback data\",\"notifyUrl\":\"https://www.example.com/whatsapp\",\"urlOptions\":{\"shortenUrl\":true,\"trackClicks\":true,\"trackingUrl\":\"https://example.com/click-report\",\"removeProtocol\":true}}]}";
        String givenResponse =
                "{\"messages\":[{\"to\":\"441134960001\",\"messageCount\":1,\"messageId\":\"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\"status\":{\"groupId\":1,\"groupName\":\"PENDING\",\"id\":7,\"name\":\"PENDING_ENROUTE\",\"description\":\"Message sent to next instance\"}}],\"bulkId\":\"2034072219640523073\"}";
        List<String> stringList = List.of();
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent =
                new WhatsAppTemplateBodyContent().placeholders(stringList);
        WhatsAppTemplateFlowButtonContent whatsAppTemplateFlowButtonContent = new WhatsAppTemplateFlowButtonContent();
        List<WhatsAppTemplateButtonContent> whatsAppTemplateButtonContentList =
                List.of(whatsAppTemplateFlowButtonContent);
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent()
                .buttons(whatsAppTemplateButtonContentList)
                .body(whatsAppTemplateBodyContent);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldFlowButtonWithFlowTokenAndDataTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": []\n"
                + "          },\n"
                + "          \"buttons\": [\n"
                + "            {\n"
                + "              \"type\": \"FLOW\",\n"
                + "              \"flowToken\": \"Flow token\",\n"
                + "              \"data\": {\n"
                + "                \"key\": \"value\",\n"
                + "                \"key2\": \"value2\"\n"
                + "              }\n"
                + "            }\n"
                + "          ]\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n"
                + "        \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        WhatsAppTemplateFlowButtonContent whatsappTemplateFlowButtonContent = new WhatsAppTemplateFlowButtonContent()
                .flowToken("Flow token")
                .putDataItem("key", "value")
                .putDataItem("key2", "value2");
        List<WhatsAppTemplateButtonContent> whatsappTemplateButtonContentList =
                List.of(whatsappTemplateFlowButtonContent);
        WhatsAppTemplateBodyContent whatsappTemplateBodyContent = new WhatsAppTemplateBodyContent();
        List<String> whatsappTemplateBodyPlaceholdersList = List.of();
        whatsappTemplateBodyContent.setPlaceholders(whatsappTemplateBodyPlaceholdersList);
        WhatsAppTemplateDataContent whatsappTemplateDataContent = new WhatsAppTemplateDataContent()
                .body(whatsappTemplateBodyContent)
                .buttons(whatsappTemplateButtonContentList);
        WhatsAppTemplateContent whatsappTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsappTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsappMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsappTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsappMessageList = List.of(whatsappMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsappMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsappSingleMessageInfoList = response.getMessages();
            then(whatsappSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsappSingleMessageInfo = whatsappSingleMessageInfoList.get(0);
            then(whatsappSingleMessageInfo).isNotNull();
            then(whatsappSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsappSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsappSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsappSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus whatsappSingleMessageStatus = whatsappSingleMessageInfo.getStatus();
            then(whatsappSingleMessageStatus).isNotNull();
            then(whatsappSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsappSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsappSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsappSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsappSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(response.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendImageHeaderTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": []\n"
                + "          },\n"
                + "          \"header\": {\n"
                + "            \"type\": \"IMAGE\",\n"
                + "            \"mediaUrl\": \"http://example.com/image\"\n"
                + "          }\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n"
                + "        \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n            \"groupName\": \"PENDING\",\n            \"id\": 7,\n            \"name\": \"PENDING_ENROUTE\",\n            \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        WhatsAppTemplateImageHeaderContent whatsAppTemplateImageHeaderContent =
                new WhatsAppTemplateImageHeaderContent().mediaUrl("http://example.com/image");
        List<String> placeholdersList = List.of();
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent = new WhatsAppTemplateBodyContent();
        whatsAppTemplateBodyContent.setPlaceholders(placeholdersList);
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent()
                .header(whatsAppTemplateImageHeaderContent)
                .body(whatsAppTemplateBodyContent);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus messageStatus = whatsAppSingleMessageInfo.getStatus();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendLimitedTimeOfferWithExpirationTimeSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": [\n"
                + "              \"Placeholder Value 1\"\n"
                + "            ]\n"
                + "          },\n"
                + "          \"buttons\": [\n"
                + "            {\n"
                + "              \"type\": \"COPY_CODE\",\n"
                + "              \"parameter\": \"exampleCode\"\n"
                + "            },\n"
                + "            {\n"
                + "              \"type\": \"URL\",\n"
                + "              \"parameter\": \"docs\"\n"
                + "            }\n"
                + "          ],\n"
                + "          \"limitedTimeOffer\": {\n"
                + "            \"expirationTime\": \"2030-01-01T10:00:00.000+0000\"\n"
                + "          }\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n            \"trackingUrl\": \"https://example.com/click-report\",\n            \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        WhatsAppTemplateCopyCodeButtonContent whatsAppTemplateCopyCodeButtonContent =
                new WhatsAppTemplateCopyCodeButtonContent().parameter("exampleCode");
        WhatsAppTemplateUrlButtonContent whatsAppTemplateUrlButtonContent =
                new WhatsAppTemplateUrlButtonContent().parameter("docs");
        List<WhatsAppTemplateButtonContent> whatsAppTemplateButtonContentList =
                List.of(whatsAppTemplateCopyCodeButtonContent, whatsAppTemplateUrlButtonContent);
        List<String> stringList = List.of("Placeholder Value 1");
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent =
                new WhatsAppTemplateBodyContent().placeholders(stringList);
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2030-01-01T10:00:00.000Z");
        WhatsAppTemplateLimitedTimeOfferContent whatsAppTemplateLimitedTimeOfferContent =
                new WhatsAppTemplateLimitedTimeOfferContent().expirationTime(offsetDateTime);
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent()
                .body(whatsAppTemplateBodyContent)
                .buttons(whatsAppTemplateButtonContentList)
                .limitedTimeOffer(whatsAppTemplateLimitedTimeOfferContent);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendLocationHeaderTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": []\n"
                + "          },\n"
                + "          \"header\": {\n"
                + "            \"type\": \"LOCATION\",\n"
                + "            \"latitude\": 45.79359,\n"
                + "            \"longitude\": 15.94613\n"
                + "          }\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n"
                + "        \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        WhatsAppTemplateLocationHeaderContent whatsAppTemplateLocationHeaderContent =
                new WhatsAppTemplateLocationHeaderContent().latitude(45.79359).longitude(15.94613);
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent = new WhatsAppTemplateBodyContent();
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent()
                .body(whatsAppTemplateBodyContent)
                .header(whatsAppTemplateLocationHeaderContent);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendMultiProductButtonTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": []\n"
                + "          },\n"
                + "          \"buttons\": [\n"
                + "            {\n"
                + "              \"type\": \"MULTI_PRODUCT\",\n"
                + "              \"thumbnailProductRetailerId\": \"qihxicpdu3\",\n"
                + "              \"sections\": [\n"
                + "                {\n"
                + "                  \"title\": \"Title\",\n"
                + "                  \"productRetailerIds\": [\n"
                + "                    \"1\",\n"
                + "                    \"2\"\n"
                + "                  ]\n"
                + "                }\n"
                + "              ]\n"
                + "            }\n"
                + "          ]\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n"
                + "        \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        WhatsAppTemplateMultiProductButtonContent whatsAppTemplateMultiProductButtonContent =
                new WhatsAppTemplateMultiProductButtonContent().thumbnailProductRetailerId("qihxicpdu3");
        WhatsAppMultiProductSectionContent whatsAppMultiProductSectionContent = new WhatsAppMultiProductSectionContent()
                .title("Title")
                .addProductRetailerIdsItem("1")
                .addProductRetailerIdsItem("2");
        List<WhatsAppMultiProductSectionContent> whatsAppMultiProductSectionContentList =
                List.of(whatsAppMultiProductSectionContent);
        whatsAppTemplateMultiProductButtonContent.setSections(whatsAppMultiProductSectionContentList);
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent = new WhatsAppTemplateBodyContent();
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent()
                .addButtonsItem(whatsAppTemplateMultiProductButtonContent)
                .body(whatsAppTemplateBodyContent);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus messageStatus = whatsAppSingleMessageInfo.getStatus();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldMultiProductButtonTemplateMessageWithoutOptionalFieldsSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": []\n"
                + "          },\n"
                + "          \"buttons\": [\n"
                + "            {\n"
                + "              \"type\": \"MULTI_PRODUCT\",\n"
                + "              \"sections\": [\n"
                + "                {\n"
                + "                  \"title\": \"Title\",\n"
                + "                  \"productRetailerIds\": [\n"
                + "                    \"1\",\n"
                + "                    \"2\"\n"
                + "                  ]\n"
                + "                }\n"
                + "              ]\n"
                + "            }\n"
                + "          ]\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n"
                + "        \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        List<String> placeholdersList = List.of();
        List<String> productRetailerIdsList = List.of("1", "2");
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent =
                new WhatsAppTemplateBodyContent().placeholders(placeholdersList);
        WhatsAppMultiProductSectionContent whatsAppMultiProductSectionContent =
                new WhatsAppMultiProductSectionContent().title("Title").productRetailerIds(productRetailerIdsList);
        List<WhatsAppMultiProductSectionContent> whatsAppMultiProductSectionContentList =
                List.of(whatsAppMultiProductSectionContent);
        WhatsAppTemplateMultiProductButtonContent whatsAppTemplateMultiProductButtonContent =
                new WhatsAppTemplateMultiProductButtonContent().sections(whatsAppMultiProductSectionContentList);
        List<WhatsAppTemplateButtonContent> whatsAppTemplateButtonContentList =
                List.of(whatsAppTemplateMultiProductButtonContent);
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent()
                .body(whatsAppTemplateBodyContent)
                .buttons(whatsAppTemplateButtonContentList);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (response) -> {
            then(response).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = response.getMessages();
            then(whatsAppSingleMessageInfoList).isNotNull();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(response.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendOrderDetailsForBrazilBoletoButtonTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest =
                "{\"messages\":[{\"from\":\"441134960000\",\"to\":\"441134960001\",\"messageId\":\"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\"content\":{\"templateName\":\"template_name\",\"templateData\":{\"body\":{\"placeholders\":[]},\"buttons\":[{\"type\":\"ORDER_DETAILS\",\"action\":{\"payment\":{\"type\":\"BRAZIL_BOLETO\",\"id\":\"fd3e847h2\",\"code\":\"03399026944140000002628346101018898510000008848\"},\"orderCurrency\":\"BRL\",\"orderType\":\"DIGITAL_GOODS\",\"totalAmount\":{\"value\":21000},\"order\":{\"catalogId\":\"1\",\"items\":[{\"retailerId\":\"1\",\"name\":\"discounted product\",\"amount\":{\"value\":10000},\"saleAmount\":{\"value\":5000},\"quantity\":2},{\"retailerId\":\"2\",\"name\":\"product\",\"amount\":{\"value\":10000},\"quantity\":1}],\"subtotal\":{\"value\":20000},\"tax\":{\"value\":1000,\"description\":\"tax included\"},\"shipping\":{\"value\":1000,\"description\":\"shipping cost\"},\"discount\":{\"amount\":{\"value\":1000,\"description\":\"discount\"},\"programName\":\"membership discount\"},\"orderExpiration\":{\"expirationSeconds\":500,\"description\":\"limited offer\"}}}}]},\"language\":\"en_GB\"},\"callbackData\":\"Callback data\",\"notifyUrl\":\"https://www.example.com/whatsapp\",\"urlOptions\":{\"shortenUrl\":true,\"trackClicks\":true,\"trackingUrl\":\"https://example.com/click-report\",\"removeProtocol\":true}}]}";
        String givenResponse =
                "{\"messages\":[{\"to\":\"441134960001\",\"messageCount\":1,\"messageId\":\"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\"status\":{\"groupId\":1,\"groupName\":\"PENDING\",\"id\":7,\"name\":\"PENDING_ENROUTE\",\"description\":\"Message sent to next instance\"}}],\"bulkId\":\"2034072219640523073\"}";
        WhatsAppInteractiveOrderBrazilBoletoPaymentDetails whatsappInteractiveOrderBrazilBoletoPaymentDetails =
                new WhatsAppInteractiveOrderBrazilBoletoPaymentDetails()
                        .id("fd3e847h2")
                        .code("03399026944140000002628346101018898510000008848");
        WhatsAppInteractiveOrderDetailsAmount whatsAppInteractiveOrderDetailsAmount1 =
                new WhatsAppInteractiveOrderDetailsAmount().value(10000);
        WhatsAppInteractiveOrderDetailsAmount whatsAppInteractiveOrderDetailsSaleAmount =
                new WhatsAppInteractiveOrderDetailsAmount().value(5000);
        WhatsAppInteractiveOrderDetailsOrderItem whatsAppInteractiveOrderDetailsOrderItem =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("1")
                        .name("discounted product")
                        .amount(whatsAppInteractiveOrderDetailsAmount1)
                        .saleAmount(whatsAppInteractiveOrderDetailsSaleAmount)
                        .quantity(2);
        WhatsAppInteractiveOrderDetailsOrderItem whatsAppInteractiveOrderDetailsOrderItem2 =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("2")
                        .name("product")
                        .amount(new WhatsAppInteractiveOrderDetailsAmount().value(10000))
                        .quantity(1);
        List<WhatsAppInteractiveOrderDetailsOrderItem> whatsAppInteractiveOrderDetailsOrderItemList =
                List.of(whatsAppInteractiveOrderDetailsOrderItem, whatsAppInteractiveOrderDetailsOrderItem2);
        WhatsAppInteractiveOrderDetailsAmount whatsAppInteractiveOrderDetailsSubtotal =
                new WhatsAppInteractiveOrderDetailsAmount().value(20000);
        WhatsAppInteractiveOrderDetailsDescriptiveAmount whatsAppInteractiveOrderDetailsTax =
                new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                        .value(1000)
                        .description("tax included");
        WhatsAppInteractiveOrderDetailsDescriptiveAmount whatsAppInteractiveOrderDetailsShipping =
                new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                        .value(1000)
                        .description("shipping cost");
        WhatsAppInteractiveOrderDetailsDescriptiveAmount whatsAppInteractiveOrderDetailsDiscountAmount =
                new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                        .value(1000)
                        .description("discount");
        WhatsAppInteractiveOrderDetailsDiscount whatsAppInteractiveOrderDetailsDiscount =
                new WhatsAppInteractiveOrderDetailsDiscount()
                        .amount(whatsAppInteractiveOrderDetailsDiscountAmount)
                        .programName("membership discount");
        WhatsAppInteractiveOrderDetailsOrderExpiration whatsAppInteractiveOrderDetailsOrderExpiration =
                new WhatsAppInteractiveOrderDetailsOrderExpiration()
                        .expirationSeconds(500L)
                        .description("limited offer");
        WhatsAppInteractiveOrderDetailsOrder whatsAppInteractiveOrderDetailsOrder =
                new WhatsAppInteractiveOrderDetailsOrder()
                        .catalogId("1")
                        .items(whatsAppInteractiveOrderDetailsOrderItemList)
                        .subtotal(whatsAppInteractiveOrderDetailsSubtotal)
                        .tax(whatsAppInteractiveOrderDetailsTax)
                        .shipping(whatsAppInteractiveOrderDetailsShipping)
                        .discount(whatsAppInteractiveOrderDetailsDiscount)
                        .orderExpiration(whatsAppInteractiveOrderDetailsOrderExpiration);
        WhatsAppInteractiveOrderDetailsAmount whatsAppInteractiveOrderDetailsTotalAmount =
                new WhatsAppInteractiveOrderDetailsAmount().value(21000);
        WhatsAppTemplateOrderDetailsActionContent whatsAppTemplateOrderDetailsActionContent =
                new WhatsAppTemplateOrderDetailsActionContent()
                        .payment(whatsappInteractiveOrderBrazilBoletoPaymentDetails)
                        .orderCurrency(WhatsAppOrderCurrency.BRL)
                        .orderType(WhatsAppOrderType.DIGITAL_GOODS)
                        .totalAmount(whatsAppInteractiveOrderDetailsTotalAmount)
                        .order(whatsAppInteractiveOrderDetailsOrder);
        WhatsAppTemplateOrderDetailsButtonContent whatsAppTemplateOrderDetailsButtonContent =
                new WhatsAppTemplateOrderDetailsButtonContent().action(whatsAppTemplateOrderDetailsActionContent);
        List<WhatsAppTemplateButtonContent> whatsAppTemplateOrderDetailsButtonContentList =
                List.of(whatsAppTemplateOrderDetailsButtonContent);
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent =
                new WhatsAppTemplateBodyContent().placeholders(List.of());
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent()
                .body(whatsAppTemplateBodyContent)
                .buttons(whatsAppTemplateOrderDetailsButtonContentList);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus messageStatus = whatsAppSingleMessageInfo.getStatus();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendOrderDetailsForBrazilLinkButtonTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": []\n"
                + "          },\n"
                + "          \"buttons\": [\n"
                + "            {\n"
                + "              \"type\": \"ORDER_DETAILS\",\n"
                + "              \"action\": {\n"
                + "                \"payment\": {\n"
                + "                  \"type\": \"BRAZIL_LINK\",\n"
                + "                  \"id\": \"fd3e847h2\",\n"
                + "                  \"paymentLink\": \"https://example.com/payment-link\"\n"
                + "                },\n"
                + "                \"orderCurrency\": \"BRL\",\n"
                + "                \"orderType\": \"DIGITAL_GOODS\",\n"
                + "                \"totalAmount\": {\n"
                + "                  \"value\": 21000\n"
                + "                },\n"
                + "                \"order\": {\n"
                + "                  \"catalogId\": \"1\",\n"
                + "                  \"items\": [\n"
                + "                    {\n"
                + "                      \"retailerId\": \"1\",\n"
                + "                      \"name\": \"discounted product\",\n"
                + "                      \"amount\": {\n"
                + "                        \"value\": 10000\n"
                + "                      },\n"
                + "                      \"saleAmount\": {\n"
                + "                        \"value\": 5000\n"
                + "                      },\n"
                + "                      \"quantity\": 2\n"
                + "                    },\n"
                + "                    {\n"
                + "                      \"retailerId\": \"2\",\n"
                + "                      \"name\": \"product\",\n"
                + "                      \"amount\": {\n"
                + "                        \"value\": 10000\n"
                + "                      },\n"
                + "                      \"quantity\": 1\n"
                + "                    }\n"
                + "                  ],\n"
                + "                  \"subtotal\": {\n"
                + "                    \"value\": 20000\n"
                + "                  },\n"
                + "                  \"tax\": {\n"
                + "                    \"value\": 1000,\n"
                + "                    \"description\": \"tax included\"\n"
                + "                  },\n"
                + "                  \"shipping\": {\n"
                + "                    \"value\": 1000,\n"
                + "                    \"description\": \"shipping cost\"\n"
                + "                  },\n"
                + "                  \"discount\": {\n"
                + "                    \"amount\": {\n"
                + "                      \"value\": 1000,\n"
                + "                      \"description\": \"discount\"\n"
                + "                    },\n"
                + "                    \"programName\": \"membership discount\"\n"
                + "                  },\n"
                + "                  \"orderExpiration\": {\n"
                + "                    \"expirationSeconds\": 500,\n"
                + "                    \"description\": \"limited offer\"\n"
                + "                  }\n"
                + "                }\n"
                + "              }\n"
                + "            }\n"
                + "          ]\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n"
                + "        \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        WhatsAppInteractiveOrderDetailsAmount whatsAppInteractiveOrderDetailsAmountTotal =
                new WhatsAppInteractiveOrderDetailsAmount().value(21000);
        WhatsAppInteractiveOrderBrazilLinkPaymentDetails whatsAppInteractiveOrderBrazilLinkPaymentDetails =
                new WhatsAppInteractiveOrderBrazilLinkPaymentDetails()
                        .id("fd3e847h2")
                        .paymentLink("https://example.com/payment-link");
        WhatsAppInteractiveOrderDetailsAmount whatsAppInteractiveOrderDetailsAmountItem1Amount =
                new WhatsAppInteractiveOrderDetailsAmount().value(10000);
        WhatsAppInteractiveOrderDetailsAmount whatsAppInteractiveOrderDetailsAmountItem1SaleAmount =
                new WhatsAppInteractiveOrderDetailsAmount().value(5000);
        WhatsAppInteractiveOrderDetailsOrderItem whatsAppInteractiveOrderDetailsOrderItem1 =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("1")
                        .name("discounted product")
                        .amount(whatsAppInteractiveOrderDetailsAmountItem1Amount)
                        .saleAmount(whatsAppInteractiveOrderDetailsAmountItem1SaleAmount)
                        .quantity(2);
        WhatsAppInteractiveOrderDetailsOrderItem whatsAppInteractiveOrderDetailsOrderItem2 =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("2")
                        .name("product")
                        .amount(new WhatsAppInteractiveOrderDetailsAmount().value(10000))
                        .quantity(1);
        List<WhatsAppInteractiveOrderDetailsOrderItem> whatsAppInteractiveOrderDetailsOrderItemList =
                List.of(whatsAppInteractiveOrderDetailsOrderItem1, whatsAppInteractiveOrderDetailsOrderItem2);
        WhatsAppInteractiveOrderDetailsAmount whatsAppInteractiveOrderDetailsAmountSubtotal =
                new WhatsAppInteractiveOrderDetailsAmount().value(20000);
        WhatsAppInteractiveOrderDetailsDescriptiveAmount whatsAppInteractiveOrderDetailsDescriptiveAmountTax =
                new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                        .value(1000)
                        .description("tax included");
        WhatsAppInteractiveOrderDetailsDescriptiveAmount whatsAppInteractiveOrderDetailsDescriptiveAmountShipping =
                new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                        .value(1000)
                        .description("shipping cost");
        WhatsAppInteractiveOrderDetailsDescriptiveAmount
                whatsAppInteractiveOrderDetailsDescriptiveAmountDiscountAmount =
                        new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                                .value(1000)
                                .description("discount");
        WhatsAppInteractiveOrderDetailsDiscount whatsAppInteractiveOrderDetailsDiscount =
                new WhatsAppInteractiveOrderDetailsDiscount()
                        .amount(whatsAppInteractiveOrderDetailsDescriptiveAmountDiscountAmount)
                        .programName("membership discount");
        WhatsAppInteractiveOrderDetailsOrderExpiration whatsAppInteractiveOrderDetailsOrderExpiration =
                new WhatsAppInteractiveOrderDetailsOrderExpiration()
                        .expirationSeconds(500L)
                        .description("limited offer");
        WhatsAppInteractiveOrderDetailsOrder whatsAppInteractiveOrderDetailsOrder =
                new WhatsAppInteractiveOrderDetailsOrder()
                        .catalogId("1")
                        .items(whatsAppInteractiveOrderDetailsOrderItemList)
                        .subtotal(whatsAppInteractiveOrderDetailsAmountSubtotal)
                        .tax(whatsAppInteractiveOrderDetailsDescriptiveAmountTax)
                        .shipping(whatsAppInteractiveOrderDetailsDescriptiveAmountShipping)
                        .discount(whatsAppInteractiveOrderDetailsDiscount)
                        .orderExpiration(whatsAppInteractiveOrderDetailsOrderExpiration);
        WhatsAppTemplateOrderDetailsActionContent whatsAppTemplateOrderDetailsActionContent =
                new WhatsAppTemplateOrderDetailsActionContent()
                        .payment(whatsAppInteractiveOrderBrazilLinkPaymentDetails)
                        .orderCurrency(WhatsAppOrderCurrency.BRL)
                        .orderType(WhatsAppOrderType.DIGITAL_GOODS)
                        .totalAmount(whatsAppInteractiveOrderDetailsAmountTotal)
                        .order(whatsAppInteractiveOrderDetailsOrder);
        WhatsAppTemplateOrderDetailsButtonContent whatsAppTemplateOrderDetailsButtonContent =
                new WhatsAppTemplateOrderDetailsButtonContent().action(whatsAppTemplateOrderDetailsActionContent);
        List<WhatsAppTemplateButtonContent> whatsAppTemplateButtonContentList =
                List.of(whatsAppTemplateOrderDetailsButtonContent);
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent =
                new WhatsAppTemplateBodyContent().placeholders(List.of());
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent()
                .buttons(whatsAppTemplateButtonContentList)
                .body(whatsAppTemplateBodyContent);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = response.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(response.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldOrderDetailsForBrazilPixDcButtonTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest =
                "{\"messages\":[{\"from\":\"441134960000\",\"to\":\"441134960001\",\"messageId\":\"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\"content\":{\"templateName\":\"template_name\",\"templateData\":{\"body\":{\"placeholders\":[]},\"buttons\":[{\"type\":\"ORDER_DETAILS\",\"action\":{\"payment\":{\"type\":\"BRAZIL_PIX_DC\",\"id\":\"fd3e847h2\",\"code\":\"00020101021226900014br.gov.bcb.pix2568pix\",\"merchantName\":\"Company Name\",\"keyType\":\"CNPJ\",\"key\":\"01234567891234\"},\"orderCurrency\":\"BRL\",\"orderType\":\"DIGITAL_GOODS\",\"totalAmount\":{\"value\":21000},\"order\":{\"catalogId\":\"1\",\"items\":[{\"retailerId\":\"1\",\"name\":\"discounted product\",\"amount\":{\"value\":10000},\"saleAmount\":{\"value\":5000},\"quantity\":2},{\"retailerId\":\"2\",\"name\":\"product\",\"amount\":{\"value\":10000},\"quantity\":1}],\"subtotal\":{\"value\":20000},\"tax\":{\"value\":1000,\"description\":\"tax included\"},\"shipping\":{\"value\":1000,\"description\":\"shipping cost\"},\"discount\":{\"amount\":{\"value\":1000,\"description\":\"discount\"},\"programName\":\"membership discount\"},\"orderExpiration\":{\"expirationSeconds\":500,\"description\":\"limited offer\"}}}}]},\"language\":\"en_GB\"},\"callbackData\":\"Callback data\",\"notifyUrl\":\"https://www.example.com/whatsapp\",\"urlOptions\":{\"shortenUrl\":true,\"trackClicks\":true,\"trackingUrl\":\"https://example.com/click-report\",\"removeProtocol\":true}}]}";
        String givenResponse =
                "{\"messages\":[{\"to\":\"441134960001\",\"messageCount\":1,\"messageId\":\"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\"status\":{\"groupId\":1,\"groupName\":\"PENDING\",\"id\":7,\"name\":\"PENDING_ENROUTE\",\"description\":\"Message sent to next instance\"}}],\"bulkId\":\"2034072219640523073\"}";
        WhatsAppInteractiveOrderBrazilPixDcPaymentDetails whatsAppInteractiveOrderBrazilPixDcPaymentDetails =
                new WhatsAppInteractiveOrderBrazilPixDcPaymentDetails()
                        .id("fd3e847h2")
                        .code("00020101021226900014br.gov.bcb.pix2568pix")
                        .merchantName("Company Name")
                        .keyType(WhatsAppPixKeyType.CNPJ)
                        .key("01234567891234");
        WhatsAppInteractiveOrderDetailsAmount whatsAppInteractiveOrderDetailsAmount =
                new WhatsAppInteractiveOrderDetailsAmount().value(21000);
        WhatsAppInteractiveOrderDetailsOrderItem whatsAppInteractiveOrderDetailsOrderItem =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("1")
                        .name("discounted product")
                        .amount(new WhatsAppInteractiveOrderDetailsAmount().value(10000))
                        .saleAmount(new WhatsAppInteractiveOrderDetailsAmount().value(5000))
                        .quantity(2);
        WhatsAppInteractiveOrderDetailsOrderItem whatsAppInteractiveOrderDetailsOrderItem2 =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("2")
                        .name("product")
                        .amount(new WhatsAppInteractiveOrderDetailsAmount().value(10000))
                        .quantity(1);
        List<WhatsAppInteractiveOrderDetailsOrderItem> whatsAppInteractiveOrderDetailsOrderItemList =
                List.of(whatsAppInteractiveOrderDetailsOrderItem, whatsAppInteractiveOrderDetailsOrderItem2);
        WhatsAppInteractiveOrderDetailsOrder whatsAppInteractiveOrderDetailsOrder =
                new WhatsAppInteractiveOrderDetailsOrder()
                        .catalogId("1")
                        .items(whatsAppInteractiveOrderDetailsOrderItemList)
                        .subtotal(new WhatsAppInteractiveOrderDetailsAmount().value(20000))
                        .tax(new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                                .value(1000)
                                .description("tax included"))
                        .shipping(new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                                .value(1000)
                                .description("shipping cost"))
                        .discount(new WhatsAppInteractiveOrderDetailsDiscount()
                                .amount(new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                                        .value(1000)
                                        .description("discount"))
                                .programName("membership discount"))
                        .orderExpiration(new WhatsAppInteractiveOrderDetailsOrderExpiration()
                                .expirationSeconds(500L)
                                .description("limited offer"));
        WhatsAppTemplateOrderDetailsActionContent whatsAppTemplateOrderDetailsActionContent =
                new WhatsAppTemplateOrderDetailsActionContent()
                        .payment(whatsAppInteractiveOrderBrazilPixDcPaymentDetails)
                        .orderCurrency(WhatsAppOrderCurrency.BRL)
                        .orderType(WhatsAppOrderType.DIGITAL_GOODS)
                        .totalAmount(whatsAppInteractiveOrderDetailsAmount)
                        .order(whatsAppInteractiveOrderDetailsOrder);
        WhatsAppTemplateOrderDetailsButtonContent whatsAppTemplateOrderDetailsButtonContent =
                new WhatsAppTemplateOrderDetailsButtonContent().action(whatsAppTemplateOrderDetailsActionContent);
        List<WhatsAppTemplateButtonContent> whatsAppTemplateButtonContentList =
                List.of(whatsAppTemplateOrderDetailsButtonContent);
        List<String> stringList = List.of();
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent =
                new WhatsAppTemplateBodyContent().placeholders(stringList);
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent()
                .body(whatsAppTemplateBodyContent)
                .buttons(whatsAppTemplateButtonContentList);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = response.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(response.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendOrderDetailsForPGPayUButtonTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": []\n"
                + "          },\n"
                + "          \"buttons\": [\n"
                + "            {\n"
                + "              \"type\": \"ORDER_DETAILS\",\n"
                + "              \"action\": {\n"
                + "                \"payment\": {\n"
                + "                  \"type\": \"PG_PAYU\",\n"
                + "                  \"id\": \"fd3e847h2\",\n"
                + "                  \"beneficiary\": {\n"
                + "                    \"name\": \"John Smith\",\n"
                + "                    \"firstAddressLine\": \"address line\",\n"
                + "                    \"secondAddressLine\": \"address line\",\n"
                + "                    \"city\": \"city\",\n"
                + "                    \"state\": \"state\",\n"
                + "                    \"country\": \"INDIA\",\n"
                + "                    \"postalCode\": \"123456\"\n"
                + "                  },\n"
                + "                  \"callbackData\": [\n"
                + "                    \"customData1\",\n"
                + "                    \"customData2\",\n"
                + "                    \"customData3\",\n"
                + "                    \"customData4\"\n"
                + "                  ]\n"
                + "                },\n"
                + "                \"orderCurrency\": \"BRL\",\n"
                + "                \"orderType\": \"DIGITAL_GOODS\",\n"
                + "                \"totalAmount\": {\n"
                + "                  \"value\": 21000\n"
                + "                },\n"
                + "                \"order\": {\n"
                + "                  \"catalogId\": \"1\",\n"
                + "                  \"items\": [\n"
                + "                    {\n"
                + "                      \"retailerId\": \"1\",\n"
                + "                      \"name\": \"discounted product\",\n"
                + "                      \"amount\": { \"value\": 10000 },\n"
                + "                      \"saleAmount\": { \"value\": 5000 },\n"
                + "                      \"quantity\": 2\n"
                + "                    },\n"
                + "                    {\n"
                + "                      \"retailerId\": \"2\",\n"
                + "                      \"name\": \"product\",\n"
                + "                      \"amount\": { \"value\": 10000 },\n"
                + "                      \"quantity\": 1\n"
                + "                    }\n"
                + "                  ],\n"
                + "                  \"subtotal\": { \"value\": 20000 },\n"
                + "                  \"tax\": { \"value\": 1000, \"description\": \"tax included\" },\n"
                + "                  \"shipping\": { \"value\": 1000, \"description\": \"shipping cost\" },\n"
                + "                  \"discount\": {\n"
                + "                    \"amount\": { \"value\": 1000, \"description\": \"discount\" },\n            "
                + "                    \"programName\": \"membership discount\"\n"
                + "                  },\n"
                + "                  \"orderExpiration\": { \"expirationSeconds\": 500, \"description\": \"limited offer\" }\n"
                + "                }\n"
                + "              }\n"
                + "            }\n"
                + "          ]\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n"
                + "        \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent =
                new WhatsAppTemplateBodyContent().placeholders(List.of());
        List<String> callbackDataList = List.of("customData1", "customData2", "customData3", "customData4");
        WhatsAppBeneficiary whatsAppBeneficiary = new WhatsAppBeneficiary()
                .name("John Smith")
                .firstAddressLine("address line")
                .secondAddressLine("address line")
                .city("city")
                .state("state")
                .country(WhatsAppBeneficiaryCountry.INDIA)
                .postalCode("123456");
        WhatsAppInteractiveOrderUPIPGPayUPaymentDetails whatsAppInteractiveOrderUPIPGPayUPaymentDetails =
                new WhatsAppInteractiveOrderUPIPGPayUPaymentDetails()
                        .id("fd3e847h2")
                        .beneficiary(whatsAppBeneficiary)
                        .callbackData(callbackDataList);
        WhatsAppInteractiveOrderDetailsAmount whatsAppInteractiveOrderDetailsAmountTotal =
                new WhatsAppInteractiveOrderDetailsAmount().value(21000);
        WhatsAppInteractiveOrderDetailsAmount whatsAppInteractiveOrderDetailsAmountItem1Amount =
                new WhatsAppInteractiveOrderDetailsAmount().value(10000);
        WhatsAppInteractiveOrderDetailsAmount whatsAppInteractiveOrderDetailsAmountItem1SaleAmount =
                new WhatsAppInteractiveOrderDetailsAmount().value(5000);
        WhatsAppInteractiveOrderDetailsOrderItem whatsAppInteractiveOrderDetailsOrderItem1 =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("1")
                        .name("discounted product")
                        .amount(whatsAppInteractiveOrderDetailsAmountItem1Amount)
                        .saleAmount(whatsAppInteractiveOrderDetailsAmountItem1SaleAmount)
                        .quantity(2);
        WhatsAppInteractiveOrderDetailsOrderItem whatsAppInteractiveOrderDetailsOrderItem2 =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("2")
                        .name("product")
                        .amount(new WhatsAppInteractiveOrderDetailsAmount().value(10000))
                        .quantity(1);
        List<WhatsAppInteractiveOrderDetailsOrderItem> whatsAppInteractiveOrderDetailsOrderItemList =
                List.of(whatsAppInteractiveOrderDetailsOrderItem1, whatsAppInteractiveOrderDetailsOrderItem2);
        WhatsAppInteractiveOrderDetailsAmount whatsAppInteractiveOrderDetailsSubtotal =
                new WhatsAppInteractiveOrderDetailsAmount().value(20000);
        WhatsAppInteractiveOrderDetailsDescriptiveAmount whatsAppInteractiveOrderDetailsTax =
                new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                        .value(1000)
                        .description("tax included");
        WhatsAppInteractiveOrderDetailsDescriptiveAmount whatsAppInteractiveOrderDetailsShipping =
                new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                        .value(1000)
                        .description("shipping cost");
        WhatsAppInteractiveOrderDetailsDescriptiveAmount whatsAppInteractiveOrderDetailsDiscountAmount =
                new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                        .value(1000)
                        .description("discount");
        WhatsAppInteractiveOrderDetailsDiscount whatsAppInteractiveOrderDetailsDiscount =
                new WhatsAppInteractiveOrderDetailsDiscount()
                        .amount(whatsAppInteractiveOrderDetailsDiscountAmount)
                        .programName("membership discount");
        WhatsAppInteractiveOrderDetailsOrderExpiration whatsAppInteractiveOrderDetailsOrderExpiration =
                new WhatsAppInteractiveOrderDetailsOrderExpiration()
                        .expirationSeconds(500L)
                        .description("limited offer");
        WhatsAppInteractiveOrderDetailsOrder whatsAppInteractiveOrderDetailsOrder =
                new WhatsAppInteractiveOrderDetailsOrder()
                        .catalogId("1")
                        .items(whatsAppInteractiveOrderDetailsOrderItemList)
                        .subtotal(whatsAppInteractiveOrderDetailsSubtotal)
                        .tax(whatsAppInteractiveOrderDetailsTax)
                        .shipping(whatsAppInteractiveOrderDetailsShipping)
                        .discount(whatsAppInteractiveOrderDetailsDiscount)
                        .orderExpiration(whatsAppInteractiveOrderDetailsOrderExpiration);
        WhatsAppTemplateOrderDetailsActionContent whatsAppTemplateOrderDetailsActionContent =
                new WhatsAppTemplateOrderDetailsActionContent()
                        .payment(whatsAppInteractiveOrderUPIPGPayUPaymentDetails)
                        .orderCurrency(WhatsAppOrderCurrency.BRL)
                        .orderType(WhatsAppOrderType.DIGITAL_GOODS)
                        .totalAmount(whatsAppInteractiveOrderDetailsAmountTotal)
                        .order(whatsAppInteractiveOrderDetailsOrder);
        WhatsAppTemplateOrderDetailsButtonContent whatsAppTemplateOrderDetailsButtonContent =
                new WhatsAppTemplateOrderDetailsButtonContent().action(whatsAppTemplateOrderDetailsActionContent);
        List<WhatsAppTemplateButtonContent> whatsAppTemplateButtonContentList =
                List.of(whatsAppTemplateOrderDetailsButtonContent);
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent()
                .body(whatsAppTemplateBodyContent)
                .buttons(whatsAppTemplateButtonContentList);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendOrderDetailsForPGRazorpayButtonTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": []\n"
                + "          },\n"
                + "          \"buttons\": [\n"
                + "            {\n"
                + "              \"type\": \"ORDER_DETAILS\",\n"
                + "              \"action\": {\n"
                + "                \"payment\": {\n"
                + "                  \"type\": \"PG_RAZORPAY\",\n"
                + "                  \"id\": \"fd3e847h2\",\n"
                + "                  \"beneficiary\": {\n"
                + "                    \"name\": \"John Smith\",\n"
                + "                    \"firstAddressLine\": \"address line\",\n"
                + "                    \"secondAddressLine\": \"address line\",\n"
                + "                    \"city\": \"city\",\n"
                + "                    \"state\": \"state\",\n"
                + "                    \"country\": \"INDIA\",\n"
                + "                    \"postalCode\": \"123456\"\n"
                + "                  },\n"
                + "                  \"callbackData\": {\n"
                + "                    \"key0\": \"customData1\",\n"
                + "                    \"key1\": \"customData2\",\n"
                + "                    \"key2\": \"customData3\",\n"
                + "                    \"key3\": \"customData4\",\n"
                + "                    \"key4\": \"customData5\",\n"
                + "                    \"key5\": \"customData6\",\n"
                + "                    \"key6\": \"customData7\",\n"
                + "                    \"key7\": \"customData8\",\n"
                + "                    \"key8\": \"customData9\",\n"
                + "                    \"key9\": \"customData10\",\n"
                + "                    \"key10\": \"customData11\",\n"
                + "                    \"key11\": \"customData12\",\n"
                + "                    \"key12\": \"customData13\",\n"
                + "                    \"key13\": \"customData14\",\n"
                + "                    \"key14\": \"customData15\"\n"
                + "                  }\n"
                + "                },\n"
                + "                \"orderCurrency\": \"BRL\",\n"
                + "                \"orderType\": \"DIGITAL_GOODS\",\n"
                + "                \"totalAmount\": {\n"
                + "                  \"value\": 21000\n"
                + "                },\n"
                + "                \"order\": {\n"
                + "                  \"catalogId\": \"1\",\n"
                + "                  \"items\": [\n"
                + "                    {\n"
                + "                      \"retailerId\": \"1\",\n"
                + "                      \"name\": \"discounted product\",\n"
                + "                      \"amount\": { \"value\": 10000 },\n"
                + "                      \"saleAmount\": { \"value\": 5000 },\n"
                + "                      \"quantity\": 2\n"
                + "                    },\n"
                + "                    {\n"
                + "                      \"retailerId\": \"2\",\n"
                + "                      \"name\": \"product\",\n"
                + "                      \"amount\": { \"value\": 10000 },\n"
                + "                      \"quantity\": 1\n"
                + "                    }\n"
                + "                  ],\n"
                + "                  \"subtotal\": { \"value\": 20000 },\n"
                + "                  \"tax\": { \"value\": 1000, \"description\": \"tax included\" },\n"
                + "                  \"shipping\": { \"value\": 1000, \"description\": \"shipping cost\" },\n"
                + "                  \"discount\": { \"amount\": { \"value\": 1000, \"description\": \"discount\" }, \"programName\": \"membership discount\" },\n"
                + "                  \"orderExpiration\": { \"expirationSeconds\": 500, \"description\": \"limited offer\" }\n"
                + "                }\n"
                + "              }\n"
                + "            }\n"
                + "          ]\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": { \"shortenUrl\": true, \"trackClicks\": true, \"trackingUrl\": \"https://example.com/click-report\", \"removeProtocol\": true }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        WhatsAppBeneficiary whatsAppBeneficiary = new WhatsAppBeneficiary()
                .name("John Smith")
                .firstAddressLine("address line")
                .secondAddressLine("address line")
                .city("city")
                .state("state")
                .country(WhatsAppBeneficiaryCountry.INDIA)
                .postalCode("123456");
        WhatsAppInteractiveOrderUPIPGRazorpayPaymentDetails whatsAppInteractiveOrderUPIPGRazorpayPaymentDetails =
                new WhatsAppInteractiveOrderUPIPGRazorpayPaymentDetails()
                        .id("fd3e847h2")
                        .beneficiary(whatsAppBeneficiary)
                        .putCallbackDataItem("key0", "customData1")
                        .putCallbackDataItem("key1", "customData2")
                        .putCallbackDataItem("key2", "customData3")
                        .putCallbackDataItem("key3", "customData4")
                        .putCallbackDataItem("key4", "customData5")
                        .putCallbackDataItem("key5", "customData6")
                        .putCallbackDataItem("key6", "customData7")
                        .putCallbackDataItem("key7", "customData8")
                        .putCallbackDataItem("key8", "customData9")
                        .putCallbackDataItem("key9", "customData10")
                        .putCallbackDataItem("key10", "customData11")
                        .putCallbackDataItem("key11", "customData12")
                        .putCallbackDataItem("key12", "customData13")
                        .putCallbackDataItem("key13", "customData14")
                        .putCallbackDataItem("key14", "customData15");
        WhatsAppInteractiveOrderDetailsAmount whatsAppInteractiveOrderDetailsAmountItem1 =
                new WhatsAppInteractiveOrderDetailsAmount().value(10000);
        WhatsAppInteractiveOrderDetailsAmount whatsAppInteractiveOrderDetailsAmountSale1 =
                new WhatsAppInteractiveOrderDetailsAmount().value(5000);
        WhatsAppInteractiveOrderDetailsOrderItem whatsAppInteractiveOrderDetailsOrderItem1 =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("1")
                        .name("discounted product")
                        .amount(whatsAppInteractiveOrderDetailsAmountItem1)
                        .saleAmount(whatsAppInteractiveOrderDetailsAmountSale1)
                        .quantity(2);
        WhatsAppInteractiveOrderDetailsOrderItem whatsAppInteractiveOrderDetailsOrderItem2 =
                new WhatsAppInteractiveOrderDetailsOrderItem()
                        .retailerId("2")
                        .name("product")
                        .amount(new WhatsAppInteractiveOrderDetailsAmount().value(10000))
                        .quantity(1);
        List<WhatsAppInteractiveOrderDetailsOrderItem> whatsAppInteractiveOrderDetailsOrderItemList =
                List.of(whatsAppInteractiveOrderDetailsOrderItem1, whatsAppInteractiveOrderDetailsOrderItem2);
        WhatsAppInteractiveOrderDetailsAmount whatsAppInteractiveOrderDetailsAmountSubtotal =
                new WhatsAppInteractiveOrderDetailsAmount().value(20000);
        WhatsAppInteractiveOrderDetailsDescriptiveAmount whatsAppInteractiveOrderDetailsDescriptiveAmountTax =
                new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                        .value(1000)
                        .description("tax included");
        WhatsAppInteractiveOrderDetailsDescriptiveAmount whatsAppInteractiveOrderDetailsDescriptiveAmountShipping =
                new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                        .value(1000)
                        .description("shipping cost");
        WhatsAppInteractiveOrderDetailsDiscount whatsAppInteractiveOrderDetailsDiscount =
                new WhatsAppInteractiveOrderDetailsDiscount()
                        .amount(new WhatsAppInteractiveOrderDetailsDescriptiveAmount()
                                .value(1000)
                                .description("discount"))
                        .programName("membership discount");
        WhatsAppInteractiveOrderDetailsOrderExpiration whatsAppInteractiveOrderDetailsOrderExpiration =
                new WhatsAppInteractiveOrderDetailsOrderExpiration()
                        .expirationSeconds(500L)
                        .description("limited offer");
        WhatsAppInteractiveOrderDetailsOrder whatsAppInteractiveOrderDetailsOrder =
                new WhatsAppInteractiveOrderDetailsOrder()
                        .catalogId("1")
                        .items(whatsAppInteractiveOrderDetailsOrderItemList)
                        .subtotal(whatsAppInteractiveOrderDetailsAmountSubtotal)
                        .tax(whatsAppInteractiveOrderDetailsDescriptiveAmountTax)
                        .shipping(whatsAppInteractiveOrderDetailsDescriptiveAmountShipping)
                        .discount(whatsAppInteractiveOrderDetailsDiscount)
                        .orderExpiration(whatsAppInteractiveOrderDetailsOrderExpiration);
        WhatsAppTemplateOrderDetailsActionContent whatsAppTemplateOrderDetailsActionContent =
                new WhatsAppTemplateOrderDetailsActionContent()
                        .payment(whatsAppInteractiveOrderUPIPGRazorpayPaymentDetails)
                        .orderCurrency(WhatsAppOrderCurrency.BRL)
                        .orderType(WhatsAppOrderType.DIGITAL_GOODS)
                        .totalAmount(new WhatsAppInteractiveOrderDetailsAmount().value(21000))
                        .order(whatsAppInteractiveOrderDetailsOrder);
        WhatsAppTemplateOrderDetailsButtonContent whatsAppTemplateOrderDetailsButtonContent =
                new WhatsAppTemplateOrderDetailsButtonContent().action(whatsAppTemplateOrderDetailsActionContent);
        List<WhatsAppTemplateButtonContent> whatsAppTemplateOrderDetailsButtonContentList =
                List.of(whatsAppTemplateOrderDetailsButtonContent);
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent = new WhatsAppTemplateBodyContent();
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent()
                .body(whatsAppTemplateBodyContent)
                .buttons(whatsAppTemplateOrderDetailsButtonContentList);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus messageStatus = whatsAppSingleMessageInfo.getStatus();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendOrderStatusTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": []\n"
                + "          },\n"
                + "          \"orderStatus\": {\n"
                + "            \"orderStatuses\": [\n"
                + "              {\n"
                + "                \"type\": \"ORDER_STATUS\",\n"
                + "                \"payment\": {\n"
                + "                  \"type\": \"UPI_INTENT\",\n"
                + "                  \"id\": \"paymentId\"\n"
                + "                },\n"
                + "                \"status\": \"PROCESSING\",\n"
                + "                \"description\": \"Order status description\"\n"
                + "              }\n"
                + "            ]\n"
                + "          }\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n"
                + "        \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent = new WhatsAppTemplateBodyContent();
        List<String> whatsAppTemplateBodyContentPlaceholdersList = List.of();
        whatsAppTemplateBodyContent.setPlaceholders(whatsAppTemplateBodyContentPlaceholdersList);
        WhatsAppInteractiveAllowedOrderPaymentDetails whatsAppInteractiveOrderUPIIntentPaymentStatus =
                new WhatsAppInteractiveOrderUPIIntentPaymentDetails().id("paymentId");
        WhatsAppOrderStatusContent whatsAppOrderStatusContent = new WhatsAppTemplateOrderStatusActionContent()
                .status(WhatsAppOrderStatus.PROCESSING)
                .description("Order status description")
                .payment(whatsAppInteractiveOrderUPIIntentPaymentStatus);
        List<WhatsAppOrderStatusContent> whatsAppOrderStatusContentList = List.of(whatsAppOrderStatusContent);
        WhatsAppTemplateOrderStatusContent whatsAppTemplateOrderStatusContent =
                new WhatsAppTemplateOrderStatusContent().orderStatuses(whatsAppOrderStatusContentList);
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent()
                .body(whatsAppTemplateBodyContent)
                .orderStatus(whatsAppTemplateOrderStatusContent);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo("2034072219640523073");
            then(response.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = response.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus messageStatus = whatsAppSingleMessageInfo.getStatus();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldQuickReplyButtonTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": []\n"
                + "          },\n"
                + "          \"buttons\": [\n"
                + "            {\n"
                + "              \"type\": \"QUICK_REPLY\",\n"
                + "              \"parameter\": \"Yes\"\n"
                + "            },\n"
                + "            {\n"
                + "              \"type\": \"QUICK_REPLY\",\n"
                + "              \"parameter\": \"No\"\n"
                + "            }\n"
                + "          ]\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n"
                + "        \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        WhatsAppTemplateQuickReplyButtonContent whatsAppTemplateQuickReplyButtonContent1 =
                new WhatsAppTemplateQuickReplyButtonContent().parameter("Yes");
        WhatsAppTemplateQuickReplyButtonContent whatsAppTemplateQuickReplyButtonContent2 =
                new WhatsAppTemplateQuickReplyButtonContent().parameter("No");
        List<WhatsAppTemplateButtonContent> whatsAppTemplateButtonContentList =
                List.of(whatsAppTemplateQuickReplyButtonContent1, whatsAppTemplateQuickReplyButtonContent2);
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent()
                .buttons(whatsAppTemplateButtonContentList)
                .body(new WhatsAppTemplateBodyContent());
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage message = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(message);
        WhatsAppBulkMessage bulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> messages = whatsAppBulkMessageInfo.getMessages();
            then(messages).hasSize(1);
            WhatsAppSingleMessageInfo messageInfo = messages.get(0);
            then(messageInfo).isNotNull();
            then(messageInfo.getTo()).isEqualTo("441134960001");
            then(messageInfo.getMessageCount()).isEqualTo(1);
            then(messageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(messageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus messageStatus = messageInfo.getStatus();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(bulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldStaticUrlButtonTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest =
                "{\"messages\":[{\"from\":\"441134960000\",\"to\":\"441134960001\",\"messageId\":\"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\"content\":{\"templateName\":\"template_name\",\"templateData\":{\"body\":{\"placeholders\":[\"Placeholder Value 1\"]},\"buttons\":[]},\"language\":\"en_GB\"},\"callbackData\":\"Callback data\",\"notifyUrl\":\"https://www.example.com/whatsapp\",\"urlOptions\":{\"shortenUrl\":true,\"trackClicks\":true,\"trackingUrl\":\"https://example.com/click-report\",\"removeProtocol\":true}}]}";
        String givenResponse =
                "{\"messages\":[{\"to\":\"441134960001\",\"messageCount\":1,\"messageId\":\"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\"status\":{\"groupId\":1,\"groupName\":\"PENDING\",\"id\":7,\"name\":\"PENDING_ENROUTE\",\"description\":\"Message sent to next instance\"}}],\"bulkId\":\"2034072219640523073\"}";
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent = new WhatsAppTemplateBodyContent();
        List<String> placeholdersList = List.of("Placeholder Value 1");
        whatsAppTemplateBodyContent.setPlaceholders(placeholdersList);
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent()
                .body(whatsAppTemplateBodyContent)
                .buttons(List.of());
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldTemplateMessageWithSmsFailoverSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": [\n"
                + "              \"Placeholder Value 1\"\n"
                + "            ]\n"
                + "          }\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n"
                + "        \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      },\n"
                + "      \"smsFailover\": {\n"
                + "        \"from\": \"InfoSMS\",\n"
                + "        \"text\": \"SMS message to be sent if WhatsApp template message could not be delivered.\"\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n            \"groupName\": \"PENDING\",\n            \"id\": 7,\n            \"name\": \"PENDING_ENROUTE\",\n            \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent =
                new WhatsAppTemplateBodyContent().addPlaceholdersItem("Placeholder Value 1");
        WhatsAppTemplateDataContent whatsAppTemplateDataContent =
                new WhatsAppTemplateDataContent().body(whatsAppTemplateBodyContent);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppFailover whatsAppFailover = new WhatsAppFailover()
                .from("InfoSMS")
                .text("SMS message to be sent if WhatsApp template message could not be delivered.");
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions)
                .smsFailover(whatsAppFailover);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus messageStatus = whatsAppSingleMessageInfo.getStatus();
            then(messageStatus).isNotNull();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldTextHeaderTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": []\n"
                + "          },\n"
                + "          \"header\": {\n"
                + "            \"type\": \"TEXT\",\n"
                + "            \"placeholder\": \"placeholder value\"\n"
                + "          }\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n"
                + "        \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        WhatsAppTemplateTextHeaderContent whatsAppTemplateTextHeaderContent =
                new WhatsAppTemplateTextHeaderContent().placeholder("placeholder value");
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent = new WhatsAppTemplateBodyContent();
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent()
                .body(whatsAppTemplateBodyContent)
                .header(whatsAppTemplateTextHeaderContent);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            then(whatsAppSingleMessageInfo.getStatus()).isNotNull();
            WhatsAppSingleMessageStatus messageStatus = whatsAppSingleMessageInfo.getStatus();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldVideoHeaderTemplateMessageSendWhatsAppTemplateMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"from\": \"441134960000\",\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"content\": {\n"
                + "        \"templateName\": \"template_name\",\n"
                + "        \"templateData\": {\n"
                + "          \"body\": {\n"
                + "            \"placeholders\": []\n"
                + "          },\n"
                + "          \"header\": {\n"
                + "            \"type\": \"VIDEO\",\n"
                + "            \"mediaUrl\": \"http://example.com/video\"\n"
                + "          }\n"
                + "        },\n"
                + "        \"language\": \"en_GB\"\n"
                + "      },\n"
                + "      \"callbackData\": \"Callback data\",\n"
                + "      \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "      \"urlOptions\": {\n"
                + "        \"shortenUrl\": true,\n"
                + "        \"trackClicks\": true,\n"
                + "        \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "        \"removeProtocol\": true\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        String givenResponse = "{\n" + "  \"messages\": [\n"
                + "    {\n"
                + "      \"to\": \"441134960001\",\n"
                + "      \"messageCount\": 1,\n"
                + "      \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "      \"status\": {\n"
                + "        \"groupId\": 1,\n"
                + "        \"groupName\": \"PENDING\",\n"
                + "        \"id\": 7,\n"
                + "        \"name\": \"PENDING_ENROUTE\",\n"
                + "        \"description\": \"Message sent to next instance\"\n"
                + "      }\n"
                + "    }\n"
                + "  ],\n"
                + "  \"bulkId\": \"2034072219640523073\"\n"
                + "}";
        WhatsAppTemplateVideoHeaderContent whatsAppTemplateVideoHeaderContent =
                new WhatsAppTemplateVideoHeaderContent().mediaUrl("http://example.com/video");
        List<String> placeholdersList = List.of();
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent =
                new WhatsAppTemplateBodyContent().placeholders(placeholdersList);
        WhatsAppTemplateDataContent whatsAppTemplateDataContent = new WhatsAppTemplateDataContent()
                .header(whatsAppTemplateVideoHeaderContent)
                .body(whatsAppTemplateBodyContent);
        WhatsAppTemplateContent whatsAppTemplateContent = new WhatsAppTemplateContent()
                .templateName("template_name")
                .templateData(whatsAppTemplateDataContent)
                .language("en_GB");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppMessage whatsAppMessage = new WhatsAppMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTemplateContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        List<WhatsAppMessage> whatsAppMessageList = List.of(whatsAppMessage);
        WhatsAppBulkMessage whatsAppBulkMessage = new WhatsAppBulkMessage().messages(whatsAppMessageList);
        Consumer<WhatsAppBulkMessageInfo> assertions = (whatsAppBulkMessageInfo) -> {
            then(whatsAppBulkMessageInfo).isNotNull();
            then(whatsAppBulkMessageInfo.getMessages()).isNotNull();
            List<WhatsAppSingleMessageInfo> whatsAppSingleMessageInfoList = whatsAppBulkMessageInfo.getMessages();
            then(whatsAppSingleMessageInfoList).hasSize(1);
            WhatsAppSingleMessageInfo whatsAppSingleMessageInfo = whatsAppSingleMessageInfoList.get(0);
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus messageStatus = whatsAppSingleMessageInfo.getStatus();
            then(messageStatus).isNotNull();
            then(messageStatus.getGroupId()).isEqualTo(1);
            then(messageStatus.getGroupName()).isEqualTo("PENDING");
            then(messageStatus.getId()).isEqualTo(7);
            then(messageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(messageStatus.getDescription()).isEqualTo("Message sent to next instance");
            then(whatsAppBulkMessageInfo.getBulkId()).isEqualTo("2034072219640523073");
        };
        setUpSuccessPostRequest("/whatsapp/1/message/template", givenRequest, givenResponse);
        var call = whatsAppApi.sendWhatsAppTemplateMessage(whatsAppBulkMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendTextMessageSendWhatsAppTextMessage() {
        WhatsAppApi whatsappApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"text\": \"Some text\"\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppTextContent whatsappTextContent = new WhatsAppTextContent().text("Some text");
        WhatsAppTextMessage whatsappTextMessage = new WhatsAppTextMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsappTextContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        setUpSuccessPostRequest("/whatsapp/1/message/text", givenRequest, givenResponse);
        Consumer<WhatsAppSingleMessageInfo> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getTo()).isEqualTo("441134960001");
            then(response.getMessageCount()).isEqualTo(1);
            then(response.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsappSingleMessageStatus = response.getStatus();
            then(whatsappSingleMessageStatus).isNotNull();
            then(whatsappSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsappSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsappSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsappSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsappSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsappApi.sendWhatsAppTextMessage(whatsappTextMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendTextMessageWithPreviewableUrlSendWhatsAppTextMessage() {
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"text\": \"Some text with url: http://example.com\",\n"
                + "    \"previewUrl\": true\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": false\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        WhatsAppTextContent whatsAppTextContent = new WhatsAppTextContent()
                .text("Some text with url: http://example.com")
                .previewUrl(true);
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(false);
        WhatsAppTextMessage whatsAppTextMessage = new WhatsAppTextMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppTextContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        Consumer<WhatsAppSingleMessageInfo> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getTo()).isEqualTo("441134960001");
            then(response.getMessageCount()).isEqualTo(1);
            then(response.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = response.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        setUpSuccessPostRequest("/whatsapp/1/message/text", givenRequest, givenResponse);
        var call = whatsAppApi.sendWhatsAppTextMessage(whatsAppTextMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendVideoMessageSendWhatsAppVideoMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"mediaUrl\": \"http://example.com/video\"\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        WhatsAppVideoContent whatsAppVideoContent = new WhatsAppVideoContent().mediaUrl("http://example.com/video");
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppVideoMessage whatsAppVideoMessage = new WhatsAppVideoMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsAppVideoContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        Consumer<WhatsAppSingleMessageInfo> assertions = (whatsAppSingleMessageInfo) -> {
            then(whatsAppSingleMessageInfo).isNotNull();
            then(whatsAppSingleMessageInfo.getTo()).isEqualTo("441134960001");
            then(whatsAppSingleMessageInfo.getMessageCount()).isEqualTo(1);
            then(whatsAppSingleMessageInfo.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsAppSingleMessageStatus = whatsAppSingleMessageInfo.getStatus();
            then(whatsAppSingleMessageStatus).isNotNull();
            then(whatsAppSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsAppSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsAppSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsAppSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsAppSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        var call = whatsAppApi.sendWhatsAppVideoMessage(whatsAppVideoMessage);
        setUpSuccessPostRequest("/whatsapp/1/message/video", givenRequest, givenResponse);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldVideoMessageWithCaptionSendWhatsAppVideoMessage() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"from\": \"441134960000\",\n"
                + "  \"to\": \"441134960001\",\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"content\": {\n"
                + "    \"mediaUrl\": \"http://example.com/video\",\n"
                + "    \"caption\": \"Some video caption\"\n"
                + "  },\n"
                + "  \"callbackData\": \"Callback data\",\n"
                + "  \"notifyUrl\": \"https://www.example.com/whatsapp\",\n"
                + "  \"urlOptions\": {\n"
                + "    \"shortenUrl\": true,\n"
                + "    \"trackClicks\": true,\n"
                + "    \"trackingUrl\": \"https://example.com/click-report\",\n"
                + "    \"removeProtocol\": true\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"to\": \"441134960001\",\n"
                + "  \"messageCount\": 1,\n"
                + "  \"messageId\": \"a28dd97c-1ffb-4fcf-99f1-0b557ed381da\",\n"
                + "  \"status\": {\n"
                + "    \"groupId\": 1,\n"
                + "    \"groupName\": \"PENDING\",\n"
                + "    \"id\": 7,\n"
                + "    \"name\": \"PENDING_ENROUTE\",\n"
                + "    \"description\": \"Message sent to next instance\"\n"
                + "  }\n"
                + "}";
        UrlOptions urlOptions = new UrlOptions()
                .shortenUrl(true)
                .trackClicks(true)
                .trackingUrl("https://example.com/click-report")
                .removeProtocol(true);
        WhatsAppVideoContent whatsappVideoContent =
                new WhatsAppVideoContent().mediaUrl("http://example.com/video").caption("Some video caption");
        WhatsAppVideoMessage whatsappVideoMessage = new WhatsAppVideoMessage()
                .from("441134960000")
                .to("441134960001")
                .messageId("a28dd97c-1ffb-4fcf-99f1-0b557ed381da")
                .content(whatsappVideoContent)
                .callbackData("Callback data")
                .notifyUrl("https://www.example.com/whatsapp")
                .urlOptions(urlOptions);
        Consumer<WhatsAppSingleMessageInfo> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getTo()).isEqualTo("441134960001");
            then(response.getMessageCount()).isEqualTo(1);
            then(response.getMessageId()).isEqualTo("a28dd97c-1ffb-4fcf-99f1-0b557ed381da");
            WhatsAppSingleMessageStatus whatsappSingleMessageStatus = response.getStatus();
            then(whatsappSingleMessageStatus).isNotNull();
            then(whatsappSingleMessageStatus.getGroupId()).isEqualTo(1);
            then(whatsappSingleMessageStatus.getGroupName()).isEqualTo("PENDING");
            then(whatsappSingleMessageStatus.getId()).isEqualTo(7);
            then(whatsappSingleMessageStatus.getName()).isEqualTo("PENDING_ENROUTE");
            then(whatsappSingleMessageStatus.getDescription()).isEqualTo("Message sent to next instance");
        };
        setUpSuccessPostRequest("/whatsapp/1/message/video", givenRequest, givenResponse);
        var call = whatsAppApi.sendWhatsAppVideoMessage(whatsappVideoMessage);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetSuccessfulResponseGetWhatsappSendersQuality() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenResponse =
                "{\"results\":[{\"sender\":\"441134960000\",\"qualityRating\":\"MEDIUM\",\"status\":\"CONNECTED\",\"currentLimit\":\"LIMIT_100K\",\"lastUpdated\":\"2022-02-18T08:12:26.422Z\"},{\"sender\":\"441134960001\",\"qualityRating\":\"LOW\",\"status\":\"BANNED\",\"currentLimit\":\"UNLIMITED\",\"lastUpdated\":\"2022-02-18T08:12:26.420Z\"}]}";
        OffsetDateTime offsetDateTime1 =
                OffsetDateTime.of(LocalDateTime.of(2022, 2, 18, 8, 12, 26, 422000000), ZoneOffset.UTC);
        OffsetDateTime offsetDateTime2 =
                OffsetDateTime.of(LocalDateTime.of(2022, 2, 18, 8, 12, 26, 420000000), ZoneOffset.UTC);
        List<String> sendersList = List.of();
        setUpSuccessGetRequest("/whatsapp/1/senders/quality", Map.of(), givenResponse);
        Consumer<WhatsAppSenderQualityResponse> assertions = (whatsappSenderQualityResponse) -> {
            then(whatsappSenderQualityResponse).isNotNull();
            then(whatsappSenderQualityResponse.getResults()).isNotNull();
            List<WhatsAppSenderQuality> whatsappSenderQualityList = whatsappSenderQualityResponse.getResults();
            then(whatsappSenderQualityList).hasSize(2);
            WhatsAppSenderQuality whatsappSenderQuality = whatsappSenderQualityList.get(0);
            then(whatsappSenderQuality).isNotNull();
            then(whatsappSenderQuality.getSender()).isEqualTo("441134960000");
            then(whatsappSenderQuality.getQualityRating()).isEqualTo(WhatsAppSenderQualityRating.MEDIUM);
            then(whatsappSenderQuality.getStatus()).isEqualTo(WhatsAppSenderStatus.CONNECTED);
            then(whatsappSenderQuality.getCurrentLimit()).isEqualTo(WhatsAppSenderLimit.LIMIT_100K);
            then(whatsappSenderQuality.getLastUpdated()).isNotNull();
            then(whatsappSenderQuality.getLastUpdated()).isEqualTo(offsetDateTime1);
            WhatsAppSenderQuality whatsappSenderQuality2 = whatsappSenderQualityList.get(1);
            then(whatsappSenderQuality2).isNotNull();
            then(whatsappSenderQuality2.getSender()).isEqualTo("441134960001");
            then(whatsappSenderQuality2.getQualityRating()).isEqualTo(WhatsAppSenderQualityRating.LOW);
            then(whatsappSenderQuality2.getStatus()).isEqualTo(WhatsAppSenderStatus.BANNED);
            then(whatsappSenderQuality2.getCurrentLimit()).isEqualTo(WhatsAppSenderLimit.UNLIMITED);
            then(whatsappSenderQuality2.getLastUpdated()).isNotNull();
            then(whatsappSenderQuality2.getLastUpdated()).isEqualTo(offsetDateTime2);
        };
        var call = whatsAppApi.getWhatsappSendersQuality(sendersList);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetSuccessfulResponseGetWhatsappSenderBusinessInfo() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenResponse = "{\n" + "  \"about\": \"Infobip Business Account\",\n"
                + "  \"address\": \"35-38 New Bridge Street, London EC4V 6BW\",\n"
                + "  \"description\": \"Infobip is a global cloud communications platform.\",\n"
                + "  \"email\": \"info@example.com\",\n"
                + "  \"vertical\": \"PROFESSIONAL_SERVICES\",\n"
                + "  \"websites\": [\n"
                + "    \"https://www.infobip.com\"\n"
                + "  ],\n"
                + "  \"displayName\": \"Infobip\"\n"
                + "}";
        Map<String, String> expectedParameters = Map.of();
        String sender = "447796344125";
        setUpSuccessGetRequest("/whatsapp/1/senders/447796344125/business-info", expectedParameters, givenResponse);
        Consumer<WhatsAppBusinessInfoResponse> assertions = (whatsappBusinessInfoResponse) -> {
            then(whatsappBusinessInfoResponse).isNotNull();
            then(whatsappBusinessInfoResponse.getAbout()).isEqualTo("Infobip Business Account");
            then(whatsappBusinessInfoResponse.getAddress()).isEqualTo("35-38 New Bridge Street, London EC4V 6BW");
            then(whatsappBusinessInfoResponse.getDescription())
                    .isEqualTo("Infobip is a global cloud communications platform.");
            then(whatsappBusinessInfoResponse.getEmail()).isEqualTo("info@example.com");
            then(whatsappBusinessInfoResponse.getVertical()).isEqualTo(WhatsAppBusinessVertical.PROFESSIONAL_SERVICES);
            then(whatsappBusinessInfoResponse.getWebsites()).isNotNull();
            List<String> websitesList = whatsappBusinessInfoResponse.getWebsites();
            then(websitesList).hasSize(1);
            then(websitesList.get(0)).isEqualTo("https://www.infobip.com");
            then(whatsappBusinessInfoResponse.getDisplayName()).isEqualTo("Infobip");
        };
        var call = whatsAppApi.getWhatsappSenderBusinessInfo(sender);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetWhatsappBrazilPaymentStatusGetWhatsappBrazilPaymentStatus() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenResponse = "{\n" + "  \"referenceId\": \"72123248136\",\n"
                + "  \"paymentId\": \"16085194825\",\n"
                + "  \"paymentStatus\": \"CAPTURED\",\n"
                + "  \"currency\": \"INR\",\n"
                + "  \"totalAmountValue\": 21000,\n"
                + "  \"totalAmountOffset\": 100,\n"
                + "  \"transactions\": [\n"
                + "    {\n"
                + "      \"id\": \"27194245144\",\n"
                + "      \"type\": \"UPI\",\n"
                + "      \"status\": \"SUCCESS\",\n"
                + "      \"createdTimestamp\": \"2023-01-01T00:00:00.000+0000\",\n"
                + "      \"updatedTimestamp\": \"2023-01-01T01:00:00.000+0000\"\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        OffsetDateTime expectedCreatedTimestamp = OffsetDateTime.of(LocalDateTime.of(2023, 1, 1, 0, 0), ZoneOffset.UTC);
        OffsetDateTime expectedUpdatedTimestamp = OffsetDateTime.of(LocalDateTime.of(2023, 1, 1, 1, 0), ZoneOffset.UTC);
        Consumer<WhatsAppPayment> assertions = (whatsAppPaymentResponse) -> {
            then(whatsAppPaymentResponse).isNotNull();
            then(whatsAppPaymentResponse.getReferenceId()).isEqualTo("72123248136");
            then(whatsAppPaymentResponse.getPaymentId()).isEqualTo("16085194825");
            then(whatsAppPaymentResponse.getPaymentStatus()).isEqualTo(WhatsAppPaymentStatus.CAPTURED);
            then(whatsAppPaymentResponse.getCurrency()).isEqualTo(WhatsAppPaymentCurrency.INR);
            then(whatsAppPaymentResponse.getTotalAmountValue()).isEqualTo(21000);
            then(whatsAppPaymentResponse.getTotalAmountOffset()).isEqualTo(100);
            then(whatsAppPaymentResponse.getTransactions()).isNotNull();
            List<WhatsAppPaymentTransaction> whatsappPaymentTransactionList = whatsAppPaymentResponse.getTransactions();
            then(whatsappPaymentTransactionList).hasSize(1);
            WhatsAppPaymentTransaction whatsappPaymentTransaction = whatsappPaymentTransactionList.get(0);
            then(whatsappPaymentTransaction).isNotNull();
            then(whatsappPaymentTransaction.getId()).isEqualTo("27194245144");
            then(whatsappPaymentTransaction.getType()).isEqualTo(WhatsAppPaymentTransactionType.UPI);
            then(whatsappPaymentTransaction.getStatus()).isEqualTo(WhatsAppPaymentTransactionStatus.SUCCESS);
            then(whatsappPaymentTransaction.getCreatedTimestamp()).isEqualTo(expectedCreatedTimestamp);
            then(whatsappPaymentTransaction.getUpdatedTimestamp()).isEqualTo(expectedUpdatedTimestamp);
        };
        setUpSuccessGetRequest("/whatsapp/1/senders/test-sender/payments/br/16085194825", Map.of(), givenResponse);
        var call = whatsAppApi.getWhatsappBrazilPaymentStatus("test-sender", "16085194825");
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetSuccessResponseGetWhatsappUpiPayuPaymentStatus() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenResponse =
                "{\"referenceId\":\"72123248136\",\"paymentId\":\"16085194825\",\"paymentStatus\":\"CAPTURED\",\"currency\":\"INR\",\"totalAmountValue\":21000,\"totalAmountOffset\":100,\"transactions\":[{\"id\":\"27194245144\",\"type\":\"UPI\",\"status\":\"SUCCESS\",\"createdTimestamp\":\"2023-01-01T00:00:00.000+0000\",\"updatedTimestamp\":\"2023-01-01T01:00:00.000+0000\"}]}";
        Map<String, String> expectedParameters = Map.of();
        OffsetDateTime offsetDateTimeCreated = OffsetDateTime.of(LocalDateTime.of(2023, 1, 1, 0, 0), ZoneOffset.UTC);
        OffsetDateTime offsetDateTimeUpdated = OffsetDateTime.of(LocalDateTime.of(2023, 1, 1, 1, 0), ZoneOffset.UTC);
        setUpSuccessGetRequest(
                "/whatsapp/1/senders/sender/payments/upi/16085194825", expectedParameters, givenResponse);
        Consumer<WhatsAppPayment> assertions = (whatsappPayment) -> {
            then(whatsappPayment).isNotNull();
            then(whatsappPayment.getReferenceId()).isEqualTo("72123248136");
            then(whatsappPayment.getPaymentId()).isEqualTo("16085194825");
            then(whatsappPayment.getPaymentStatus()).isEqualTo(WhatsAppPaymentStatus.CAPTURED);
            then(whatsappPayment.getCurrency()).isEqualTo(WhatsAppPaymentCurrency.INR);
            then(whatsappPayment.getTotalAmountValue()).isEqualTo(21000);
            then(whatsappPayment.getTotalAmountOffset()).isEqualTo(100);
            then(whatsappPayment.getTransactions()).isNotNull();
            List<WhatsAppPaymentTransaction> whatsappPaymentTransactionList = whatsappPayment.getTransactions();
            then(whatsappPaymentTransactionList).hasSize(1);
            WhatsAppPaymentTransaction whatsappPaymentTransaction = whatsappPaymentTransactionList.get(0);
            then(whatsappPaymentTransaction).isNotNull();
            then(whatsappPaymentTransaction.getId()).isEqualTo("27194245144");
            then(whatsappPaymentTransaction.getType()).isEqualTo(WhatsAppPaymentTransactionType.UPI);
            then(whatsappPaymentTransaction.getStatus()).isEqualTo(WhatsAppPaymentTransactionStatus.SUCCESS);
            then(whatsappPaymentTransaction.getCreatedTimestamp()).isEqualTo(offsetDateTimeCreated);
            then(whatsappPaymentTransaction.getUpdatedTimestamp()).isEqualTo(offsetDateTimeUpdated);
        };
        var call = whatsAppApi.getWhatsappUpiPaymentStatus("sender", "16085194825");
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetSuccessResponseGetWhatsappUpiPaymentStatus() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenResponse = "{\n" + "  \"referenceId\": \"72123248136\",\n"
                + "  \"paymentId\": \"16085194825\",\n"
                + "  \"paymentStatus\": \"CAPTURED\",\n"
                + "  \"currency\": \"INR\",\n"
                + "  \"totalAmountValue\": 21000,\n"
                + "  \"totalAmountOffset\": 100,\n"
                + "  \"transactions\": [\n"
                + "    {\n"
                + "      \"id\": \"27194245144\",\n"
                + "      \"type\": \"UPI\",\n"
                + "      \"status\": \"SUCCESS\",\n"
                + "      \"createdTimestamp\": \"2023-01-01T00:00:00.000+0000\",\n"
                + "      \"updatedTimestamp\": \"2023-01-01T01:00:00.000+0000\"\n"
                + "    }\n"
                + "  ]\n"
                + "}";
        OffsetDateTime expectedCreated = OffsetDateTime.of(LocalDateTime.of(2023, 1, 1, 0, 0), ZoneOffset.UTC);
        OffsetDateTime expectedUpdated = OffsetDateTime.of(LocalDateTime.of(2023, 1, 1, 1, 0), ZoneOffset.UTC);
        setUpSuccessGetRequest("/whatsapp/1/senders/sender/payments/upi/16085194825", Map.of(), givenResponse);
        Consumer<WhatsAppPayment> assertions = (whatsAppPayment) -> {
            then(whatsAppPayment).isNotNull();
            then(whatsAppPayment.getReferenceId()).isEqualTo("72123248136");
            then(whatsAppPayment.getPaymentId()).isEqualTo("16085194825");
            then(whatsAppPayment.getPaymentStatus()).isEqualTo(WhatsAppPaymentStatus.CAPTURED);
            then(whatsAppPayment.getCurrency()).isEqualTo(WhatsAppPaymentCurrency.INR);
            then(whatsAppPayment.getTotalAmountValue()).isEqualTo(21000);
            then(whatsAppPayment.getTotalAmountOffset()).isEqualTo(100);
            List<WhatsAppPaymentTransaction> whatsAppPaymentTransactionList = whatsAppPayment.getTransactions();
            then(whatsAppPaymentTransactionList).isNotNull();
            then(whatsAppPaymentTransactionList).hasSize(1);
            WhatsAppPaymentTransaction whatsAppPaymentTransaction = whatsAppPaymentTransactionList.get(0);
            then(whatsAppPaymentTransaction).isNotNull();
            then(whatsAppPaymentTransaction.getId()).isEqualTo("27194245144");
            then(whatsAppPaymentTransaction.getType()).isEqualTo(WhatsAppPaymentTransactionType.UPI);
            then(whatsAppPaymentTransaction.getStatus()).isEqualTo(WhatsAppPaymentTransactionStatus.SUCCESS);
            then(whatsAppPaymentTransaction.getCreatedTimestamp()).isEqualTo(expectedCreated);
            then(whatsAppPaymentTransaction.getUpdatedTimestamp()).isEqualTo(expectedUpdated);
        };
        var call = whatsAppApi.getWhatsappUpiPaymentStatus("sender", "16085194825");
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetMediaTemplateGetWhatsAppTemplates() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenResponse =
                "{\"templates\":[{\"id\":\"111\",\"businessAccountId\":222,\"name\":\"media_template\",\"language\":\"en\",\"status\":\"APPROVED\",\"category\":\"MARKETING\",\"structure\":{\"header\":{\"format\":\"IMAGE\"},\"body\":{\"text\":\"example {{1}} body\"},\"footer\":{\"text\":\"exampleFooter\"},\"type\":\"MEDIA\"},\"quality\":\"HIGH\",\"platform\":{\"entityId\":\"entityId\",\"applicationId\":\"applicationId\"},\"createdAt\":\"2024-01-01T00:00:00.000+0000\",\"lastUpdatedAt\":\"2024-01-01T00:00:00.000+0000\"}]}";
        OffsetDateTime expectedCreatedAt = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
        OffsetDateTime expectedLastUpdatedAt = expectedCreatedAt;
        setUpSuccessGetRequest("/whatsapp/2/senders/sender/templates", Map.of(), givenResponse);
        Consumer<WhatsAppTemplatesApiResponse> assertions = (whatsAppTemplatesApiResponse) -> {
            then(whatsAppTemplatesApiResponse).isNotNull();
            then(whatsAppTemplatesApiResponse.getTemplates()).isNotNull();
            List<WhatsAppTemplateApiResponse> whatsAppTemplateApiResponseList =
                    whatsAppTemplatesApiResponse.getTemplates();
            then(whatsAppTemplateApiResponseList).hasSize(1);
            WhatsAppTemplateApiResponse whatsAppTemplateApiResponse = whatsAppTemplateApiResponseList.get(0);
            then(whatsAppTemplateApiResponse).isNotNull();
            then(whatsAppTemplateApiResponse.getId()).isEqualTo("111");
            then(whatsAppTemplateApiResponse.getBusinessAccountId()).isEqualTo(222L);
            then(whatsAppTemplateApiResponse.getName()).isEqualTo("media_template");
            then(whatsAppTemplateApiResponse.getLanguage()).isEqualTo(WhatsAppLanguage.EN);
            then(whatsAppTemplateApiResponse.getStatus()).isEqualTo(WhatsAppStatus.APPROVED);
            then(whatsAppTemplateApiResponse.getCategory()).isEqualTo(WhatsAppCategory.MARKETING);
            then(whatsAppTemplateApiResponse.getStructure()).isNotNull();
            WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiData =
                    whatsAppTemplateApiResponse.getStructure();
            then(whatsAppDefaultTemplateStructureApiData.getHeader()).isNotNull();
            then(whatsAppDefaultTemplateStructureApiData.getHeader().getFormat())
                    .isEqualTo(WhatsAppHeaderApiData.FormatEnum.IMAGE);
            then(whatsAppDefaultTemplateStructureApiData.getBody()).isNotNull();
            WhatsAppBodyApiData whatsAppBodyApiData = whatsAppDefaultTemplateStructureApiData.getBody();
            then(whatsAppBodyApiData.getText()).isEqualTo("example {{1}} body");
            then(whatsAppDefaultTemplateStructureApiData.getFooter()).isNotNull();
            WhatsAppFooterApiData whatsAppFooterApiData = whatsAppDefaultTemplateStructureApiData.getFooter();
            then(whatsAppFooterApiData.getText()).isEqualTo("exampleFooter");
            then(whatsAppDefaultTemplateStructureApiData.getType())
                    .isEqualTo(WhatsAppDefaultTemplateStructureApiData.TypeEnum.valueOf("MEDIA"));
            then(whatsAppTemplateApiResponse.getQuality()).isEqualTo(WhatsAppTemplateApiResponse.QualityEnum.HIGH);
            then(whatsAppTemplateApiResponse.getPlatform()).isNotNull();
            Platform platform = whatsAppTemplateApiResponse.getPlatform();
            then(platform.getEntityId()).isEqualTo("entityId");
            then(platform.getApplicationId()).isEqualTo("applicationId");
            then(whatsAppTemplateApiResponse.getCreatedAt()).isEqualTo(expectedCreatedAt);
            then(whatsAppTemplateApiResponse.getLastUpdatedAt()).isEqualTo(expectedLastUpdatedAt);
        };
        var call = whatsAppApi.getWhatsAppTemplates("sender");
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldTemplateCreateWhatsAppTemplate() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"name\": \"text_template\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"body {{1}} content\",\n"
                + "      \"examples\": [\n"
                + "        \"example\"\n"
                + "      ]\n"
                + "    }\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"id\": \"111\",\n"
                + "  \"businessAccountId\": 222,\n"
                + "  \"name\": \"text_template\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"status\": \"APPROVED\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"example {{1}} body\"\n"
                + "    },\n"
                + "    \"type\": \"TEXT\"\n"
                + "  },\n"
                + "  \"quality\": \"UNKNOWN\",\n"
                + "  \"createdAt\": \"2024-01-01T00:00:00.000+0000\",\n"
                + "  \"lastUpdatedAt\": \"2024-01-01T00:00:00.000+0000\"\n"
                + "}";
        WhatsAppBodyApiData whatsAppBodyApiData =
                new WhatsAppBodyApiData().text("body {{1}} content").addExamplesItem("example");
        WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiData =
                new WhatsAppDefaultTemplateStructureApiData().body(whatsAppBodyApiData);
        WhatsAppTemplatePublicApiRequest whatsAppDefaultMarketingTemplatePublicApiRequest =
                new WhatsAppDefaultMarketingTemplatePublicApiRequest()
                        .name("text_template")
                        .language(WhatsAppLanguage.EN)
                        .structure(whatsAppDefaultTemplateStructureApiData);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
        setUpSuccessPostRequest("/whatsapp/2/senders/sender/templates", givenRequest, givenResponse);
        Consumer<WhatsAppTemplateApiResponse> assertions = (whatsAppTemplateApiResponse) -> {
            then(whatsAppTemplateApiResponse).isNotNull();
            then(whatsAppTemplateApiResponse.getId()).isEqualTo("111");
            then(whatsAppTemplateApiResponse.getBusinessAccountId()).isEqualTo(222L);
            then(whatsAppTemplateApiResponse.getName()).isEqualTo("text_template");
            then(whatsAppTemplateApiResponse.getLanguage()).isEqualTo(WhatsAppLanguage.EN);
            then(whatsAppTemplateApiResponse.getStatus()).isEqualTo(WhatsAppStatus.APPROVED);
            then(whatsAppTemplateApiResponse.getCategory()).isEqualTo(WhatsAppCategory.MARKETING);
            Object structure = whatsAppTemplateApiResponse.getStructure();
            then(structure).isNotNull();
            WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiDataResponse =
                    (WhatsAppDefaultTemplateStructureApiData) structure;
            then(whatsAppDefaultTemplateStructureApiDataResponse.getType())
                    .isEqualTo(WhatsAppDefaultTemplateStructureApiData.TypeEnum.TEXT);
            then(whatsAppDefaultTemplateStructureApiDataResponse.getBody()).isNotNull();
            WhatsAppBodyApiData whatsAppBodyApiDataResponse = whatsAppDefaultTemplateStructureApiDataResponse.getBody();
            then(whatsAppBodyApiDataResponse).isNotNull();
            then(whatsAppBodyApiDataResponse.getText()).isEqualTo("example {{1}} body");
            then(whatsAppTemplateApiResponse.getQuality()).isEqualTo(WhatsAppTemplateApiResponse.QualityEnum.UNKNOWN);
            then(whatsAppTemplateApiResponse.getCreatedAt()).isEqualTo(offsetDateTime);
            then(whatsAppTemplateApiResponse.getLastUpdatedAt()).isEqualTo(offsetDateTime);
        };
        var call = whatsAppApi.createWhatsAppTemplate("sender", whatsAppDefaultMarketingTemplatePublicApiRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldTemplatePlatformDataCreateWhatsAppTemplate() {
        String givenRequest = "{\n" + "  \"name\": \"text_template\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"body {{1}} content\",\n"
                + "      \"examples\": [\n"
                + "        \"example\"\n"
                + "      ]\n"
                + "    }\n"
                + "  },\n"
                + "  \"platform\": {\n"
                + "    \"entityId\": \"entityId\",\n"
                + "    \"applicationId\": \"applicationId\"\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"id\": \"111\",\n"
                + "  \"businessAccountId\": 222,\n"
                + "  \"name\": \"text_template\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"status\": \"APPROVED\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"example {{1}} body\"\n"
                + "    },\n"
                + "    \"type\": \"TEXT\"\n"
                + "  },\n"
                + "  \"quality\": \"UNKNOWN\",\n"
                + "  \"createdAt\": \"2024-01-01T00:00:00.000+0000\",\n"
                + "  \"lastUpdatedAt\": \"2024-01-01T00:00:00.000+0000\"\n"
                + "}";
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        WhatsAppBodyApiData whatsAppBodyApiData =
                new WhatsAppBodyApiData().text("body {{1}} content").addExamplesItem("example");
        WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiData =
                new WhatsAppDefaultTemplateStructureApiData().body(whatsAppBodyApiData);
        Platform platform = new Platform().entityId("entityId").applicationId("applicationId");
        WhatsAppTemplatePublicApiRequest whatsAppTemplatePublicApiRequest =
                new WhatsAppDefaultMarketingTemplatePublicApiRequest()
                        .name("text_template")
                        .language(WhatsAppLanguage.EN)
                        .structure(whatsAppDefaultTemplateStructureApiData)
                        .platform(platform);
        OffsetDateTime expectedCreatedAt = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
        OffsetDateTime expectedLastUpdatedAt = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
        setUpSuccessPostRequest("/whatsapp/2/senders/sender/templates", givenRequest, givenResponse);
        Consumer<WhatsAppTemplateApiResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo("111");
            then(response.getBusinessAccountId()).isEqualTo(222L);
            then(response.getName()).isEqualTo("text_template");
            then(response.getLanguage()).isEqualTo(WhatsAppLanguage.EN);
            then(response.getStatus()).isEqualTo(WhatsAppStatus.APPROVED);
            then(response.getCategory()).isEqualTo(WhatsAppCategory.MARKETING);
            WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiDataResp =
                    (WhatsAppDefaultTemplateStructureApiData) response.getStructure();
            then(whatsAppDefaultTemplateStructureApiDataResp).isNotNull();
            WhatsAppBodyApiData whatsAppBodyApiDataResp = whatsAppDefaultTemplateStructureApiDataResp.getBody();
            then(whatsAppBodyApiDataResp).isNotNull();
            then(whatsAppBodyApiDataResp.getText()).isEqualTo("example {{1}} body");
            then(whatsAppDefaultTemplateStructureApiDataResp.getType())
                    .isEqualTo(WhatsAppDefaultTemplateStructureApiData.TypeEnum.TEXT);
            then(response.getQuality()).isEqualTo(WhatsAppTemplateApiResponse.QualityEnum.UNKNOWN);
            then(response.getCreatedAt()).isEqualTo(expectedCreatedAt);
            then(response.getLastUpdatedAt()).isEqualTo(expectedLastUpdatedAt);
        };
        var call = whatsAppApi.createWhatsAppTemplate("sender", whatsAppTemplatePublicApiRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldTemplateWithAllElementsCreateWhatsAppTemplate() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"name\": \"media_template_with_all_elements\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"header\": {\n"
                + "      \"example\": \"https://www.example.com/image.png\",\n"
                + "      \"format\": \"IMAGE\"\n"
                + "    },\n"
                + "    \"body\": {\n"
                + "      \"text\": \"body {{1}} content\",\n"
                + "      \"examples\": [\n"
                + "        \"example\"\n"
                + "      ]\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"footer content\"\n"
                + "    },\n"
                + "    \"buttons\": [\n"
                + "      {\n"
                + "        \"type\": \"PHONE_NUMBER\",\n"
                + "        \"text\": \"call agent\",\n"
                + "        \"phoneNumber\": \"007\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"type\": \"URL\",\n"
                + "        \"text\": \"visit website\",\n"
                + "        \"url\": \"https://www.infobip.com/{{1}}\",\n"
                + "        \"example\": \"https://www.infobip.com/docs\"\n"
                + "      }\n"
                + "    ]\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"id\": \"111\",\n"
                + "  \"businessAccountId\": 222,\n"
                + "  \"name\": \"media_template_with_buttons\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"status\": \"APPROVED\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"header\": {\n"
                + "      \"format\": \"IMAGE\"\n"
                + "    },\n"
                + "    \"body\": {\n"
                + "      \"text\": \"example {{1}} body\"\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"exampleFooter\"\n"
                + "    },\n"
                + "    \"buttons\": [\n"
                + "      {\n"
                + "        \"type\": \"PHONE_NUMBER\",\n"
                + "        \"text\": \"Dial 911\",\n"
                + "        \"phoneNumber\": \"911\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"type\": \"URL\",\n"
                + "        \"text\": \"Visit our website\",\n"
                + "        \"url\": \"https://www.infobip.com\"\n"
                + "      }\n"
                + "    ],\n"
                + "    \"type\": \"MEDIA\"\n"
                + "  },\n"
                + "  \"quality\": \"LOW\",\n"
                + "  \"createdAt\": \"2024-01-01T00:00:00.000+0000\",\n"
                + "  \"lastUpdatedAt\": \"2024-01-01T00:00:00.000+0000\"\n"
                + "}";
        WhatsAppImageHeaderApiData whatsAppImageHeaderApiData =
                new WhatsAppImageHeaderApiData().example("https://www.example.com/image.png");
        WhatsAppBodyApiData whatsAppBodyApiData =
                new WhatsAppBodyApiData().text("body {{1}} content").addExamplesItem("example");
        WhatsAppFooterApiData whatsAppFooterApiData = new WhatsAppFooterApiData().text("footer content");
        WhatsAppPhoneNumberButtonApiData whatsAppPhoneNumberButtonApiData =
                new WhatsAppPhoneNumberButtonApiData().text("call agent").phoneNumber("007");
        WhatsAppUrlButtonApiData whatsAppUrlButtonApiData = new WhatsAppUrlButtonApiData()
                .text("visit website")
                .url("https://www.infobip.com/{{1}}")
                .example("https://www.infobip.com/docs");
        List<WhatsAppButtonApiData> whatsAppButtonApiDataList =
                List.of(whatsAppPhoneNumberButtonApiData, whatsAppUrlButtonApiData);
        WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiData =
                new WhatsAppDefaultTemplateStructureApiData()
                        .header(whatsAppImageHeaderApiData)
                        .body(whatsAppBodyApiData)
                        .footer(whatsAppFooterApiData)
                        .buttons(whatsAppButtonApiDataList);
        WhatsAppTemplatePublicApiRequest whatsAppTemplatePublicApiRequest =
                new WhatsAppDefaultMarketingTemplatePublicApiRequest()
                        .name("media_template_with_all_elements")
                        .language(WhatsAppLanguage.EN)
                        .structure(whatsAppDefaultTemplateStructureApiData);
        OffsetDateTime expectedCreatedAt = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
        OffsetDateTime expectedLastUpdatedAt = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
        setUpSuccessPostRequest("/whatsapp/2/senders/mySender/templates", givenRequest, givenResponse);
        Consumer<WhatsAppTemplateApiResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo("111");
            then(response.getBusinessAccountId()).isEqualTo(222L);
            then(response.getName()).isEqualTo("media_template_with_buttons");
            then(response.getLanguage()).isEqualTo(WhatsAppLanguage.EN);
            then(response.getStatus()).isEqualTo(WhatsAppStatus.APPROVED);
            then(response.getCategory()).isEqualTo(WhatsAppCategory.MARKETING);
            then(response.getStructure()).isNotNull();
            WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiDataResponse =
                    response.getStructure();
            then(whatsAppDefaultTemplateStructureApiDataResponse.getHeader()).isNotNull();
            WhatsAppHeaderApiData whatsAppTemplateHeaderContent =
                    whatsAppDefaultTemplateStructureApiDataResponse.getHeader();
            then(whatsAppTemplateHeaderContent.getFormat()).isEqualTo(WhatsAppHeaderApiData.FormatEnum.IMAGE);
            then(whatsAppDefaultTemplateStructureApiDataResponse.getBody()).isNotNull();
            WhatsAppBodyApiData whatsAppBodyApiDataResponse = whatsAppDefaultTemplateStructureApiDataResponse.getBody();
            then(whatsAppBodyApiDataResponse.getText()).isEqualTo("example {{1}} body");
            then(whatsAppDefaultTemplateStructureApiDataResponse.getFooter()).isNotNull();
            WhatsAppFooterApiData whatsAppFooterApiDataResponse =
                    whatsAppDefaultTemplateStructureApiDataResponse.getFooter();
            then(whatsAppFooterApiDataResponse.getText()).isEqualTo("exampleFooter");
            then(whatsAppDefaultTemplateStructureApiDataResponse.getButtons()).isNotNull();
            List<WhatsAppButtonApiData> whatsAppButtonApiDataListResponse =
                    whatsAppDefaultTemplateStructureApiDataResponse.getButtons();
            then(whatsAppButtonApiDataListResponse).hasSize(2);
            WhatsAppPhoneNumberButtonApiData whatsAppPhoneNumberButtonApiDataResponse =
                    (WhatsAppPhoneNumberButtonApiData) whatsAppButtonApiDataListResponse.get(0);
            then(whatsAppPhoneNumberButtonApiDataResponse).isNotNull();
            then(whatsAppPhoneNumberButtonApiDataResponse.getType())
                    .isEqualTo(WhatsAppButtonApiData.TypeEnum.PHONE_NUMBER);
            then(whatsAppPhoneNumberButtonApiDataResponse.getText()).isEqualTo("Dial 911");
            then(whatsAppPhoneNumberButtonApiDataResponse.getPhoneNumber()).isEqualTo("911");
            WhatsAppUrlButtonApiData whatsAppUrlButtonApiDataResponse =
                    (WhatsAppUrlButtonApiData) whatsAppButtonApiDataListResponse.get(1);
            then(whatsAppUrlButtonApiDataResponse).isNotNull();
            then(whatsAppUrlButtonApiDataResponse.getType()).isEqualTo(WhatsAppButtonApiData.TypeEnum.URL);
            then(whatsAppUrlButtonApiDataResponse.getText()).isEqualTo("Visit our website");
            then(whatsAppUrlButtonApiDataResponse.getUrl()).isEqualTo("https://www.infobip.com");
            then(whatsAppDefaultTemplateStructureApiDataResponse.getType())
                    .isEqualTo(WhatsAppDefaultTemplateStructureApiData.TypeEnum.MEDIA);
            then(response.getQuality()).isEqualTo(WhatsAppTemplateApiResponse.QualityEnum.LOW);
            then(response.getCreatedAt()).isEqualTo(expectedCreatedAt);
            then(response.getLastUpdatedAt()).isEqualTo(expectedLastUpdatedAt);
        };
        var call = whatsAppApi.createWhatsAppTemplate("mySender", whatsAppTemplatePublicApiRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldTemplateWithCallPermissionRequestCreateWhatsAppTemplate() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest =
                "{\"name\":\"media_template_with_call_permission_request\",\"language\":\"en\",\"category\":\"MARKETING\",\"structure\":{\"body\":{\"text\":\"body {{1}} content\",\"examples\":[\"example\"]},\"callPermissionRequest\":{}}}";
        String givenResponse = "{\n" + "  \"id\": \"111\",\n"
                + "  \"businessAccountId\": 222,\n"
                + "  \"name\": \"media_template\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"status\": \"APPROVED\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"header\": {\n"
                + "      \"format\": \"IMAGE\"\n"
                + "    },\n"
                + "    \"body\": {\n"
                + "      \"text\": \"example {{1}} body\"\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"exampleFooter\"\n"
                + "    },\n"
                + "    \"type\": \"MEDIA\"\n"
                + "  },\n"
                + "  \"quality\": \"HIGH\",\n"
                + "  \"platform\": {\n"
                + "    \"entityId\": \"entityId\",\n"
                + "    \"applicationId\": \"applicationId\"\n"
                + "  },\n"
                + "  \"createdAt\": \"2024-01-01T00:00:00.000+0000\",\n"
                + "  \"lastUpdatedAt\": \"2024-01-01T00:00:00.000+0000\"\n"
                + "}";
        List<String> examplesList = List.of("example");
        WhatsAppBodyApiData whatsAppBodyApiData =
                new WhatsAppBodyApiData().text("body {{1}} content").examples(examplesList);
        WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiData =
                new WhatsAppDefaultTemplateStructureApiData()
                        .body(whatsAppBodyApiData)
                        .callPermissionRequest(new HashMap<>());
        WhatsAppTemplatePublicApiRequest whatsAppTemplatePublicApiRequest =
                new WhatsAppDefaultMarketingTemplatePublicApiRequest()
                        .name("media_template_with_call_permission_request")
                        .language(WhatsAppLanguage.EN)
                        .structure(whatsAppDefaultTemplateStructureApiData);
        OffsetDateTime expectedDateTime = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
        setUpSuccessPostRequest("/whatsapp/2/senders/447796344125/templates", givenRequest, givenResponse);
        Consumer<WhatsAppTemplateApiResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo("111");
            then(response.getBusinessAccountId()).isEqualTo(222L);
            then(response.getName()).isEqualTo("media_template");
            then(response.getLanguage()).isEqualTo(WhatsAppLanguage.EN);
            then(response.getStatus()).isEqualTo(WhatsAppStatus.APPROVED);
            then(response.getCategory()).isEqualTo(WhatsAppCategory.MARKETING);
            WhatsAppDefaultTemplateStructureApiData whatsappDefaultTemplateStructureApiData = response.getStructure();
            then(whatsappDefaultTemplateStructureApiData).isNotNull();
            WhatsAppHeaderApiData whatsAppHeaderApiData = whatsappDefaultTemplateStructureApiData.getHeader();
            then(whatsAppHeaderApiData).isNotNull();
            then(whatsAppHeaderApiData.getFormat()).isEqualTo(WhatsAppHeaderApiData.FormatEnum.IMAGE);
            WhatsAppBodyApiData whatsAppBodyApiData1 = whatsappDefaultTemplateStructureApiData.getBody();
            then(whatsAppBodyApiData1).isNotNull();
            then(whatsAppBodyApiData1.getText()).isEqualTo("example {{1}} body");
            WhatsAppFooterApiData whatsAppFooterApiData = whatsappDefaultTemplateStructureApiData.getFooter();
            then(whatsAppFooterApiData).isNotNull();
            then(whatsAppFooterApiData.getText()).isEqualTo("exampleFooter");
            then(whatsappDefaultTemplateStructureApiData.getType())
                    .isEqualTo(WhatsAppDefaultTemplateStructureApiData.TypeEnum.MEDIA);
            then(response.getQuality()).isEqualTo(WhatsAppTemplateApiResponse.QualityEnum.HIGH);
            Platform platform = response.getPlatform();
            then(platform).isNotNull();
            then(platform.getEntityId()).isEqualTo("entityId");
            then(platform.getApplicationId()).isEqualTo("applicationId");
            then(response.getCreatedAt()).isEqualTo(expectedDateTime);
            then(response.getLastUpdatedAt()).isEqualTo(expectedDateTime);
        };
        var call = whatsAppApi.createWhatsAppTemplate("447796344125", whatsAppTemplatePublicApiRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldTemplateWithCallToActionButtonsCreateWhatsAppTemplate() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"name\": \"media_template_with_call_to_action_buttons\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"body {{1}} content\",\n"
                + "      \"examples\": [\n"
                + "        \"example\"\n"
                + "      ]\n"
                + "    },\n"
                + "    \"buttons\": [\n"
                + "      {\n"
                + "        \"type\": \"PHONE_NUMBER\",\n"
                + "        \"text\": \"call agent\",\n"
                + "        \"phoneNumber\": \"007\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"type\": \"URL\",\n            "
                + "        \"text\": \"visit website\",\n"
                + "        \"url\": \"https://www.infobip.com/{{1}}\",\n"
                + "        \"example\": \"https://www.infobip.com/docs\"\n"
                + "      }\n"
                + "    ]\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"id\": \"111\",\n"
                + "  \"businessAccountId\": 222,\n"
                + "  \"name\": \"media_template_with_buttons\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"status\": \"APPROVED\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"header\": {\n"
                + "      \"format\": \"IMAGE\"\n"
                + "    },\n"
                + "    \"body\": {\n"
                + "      \"text\": \"example {{1}} body\"\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"exampleFooter\"\n"
                + "    },\n"
                + "    \"buttons\": [\n"
                + "      {\n"
                + "        \"type\": \"PHONE_NUMBER\",\n"
                + "        \"text\": \"Dial 911\",\n"
                + "        \"phoneNumber\": \"911\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"type\": \"URL\",\n"
                + "        \"text\": \"Visit our website\",\n"
                + "        \"url\": \"https://www.infobip.com\"\n"
                + "      }\n"
                + "    ],\n"
                + "    \"type\": \"MEDIA\"\n"
                + "  },\n"
                + "  \"quality\": \"LOW\",\n"
                + "  \"createdAt\": \"2024-01-01T00:00:00.000+0000\",\n"
                + "  \"lastUpdatedAt\": \"2024-01-01T00:00:00.000+0000\"\n"
                + "}";
        String sender = "0001";
        WhatsAppPhoneNumberButtonApiData whatsAppPhoneNumberButtonApiData =
                new WhatsAppPhoneNumberButtonApiData().text("call agent").phoneNumber("007");
        WhatsAppUrlButtonApiData whatsAppUrlButtonApiData = new WhatsAppUrlButtonApiData()
                .text("visit website")
                .url("https://www.infobip.com/{{1}}")
                .example("https://www.infobip.com/docs");
        List<WhatsAppButtonApiData> whatsAppButtonApiDataList =
                List.of(whatsAppPhoneNumberButtonApiData, whatsAppUrlButtonApiData);
        WhatsAppBodyApiData whatsAppBodyApiData =
                new WhatsAppBodyApiData().text("body {{1}} content").addExamplesItem("example");
        WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiData =
                new WhatsAppDefaultTemplateStructureApiData()
                        .body(whatsAppBodyApiData)
                        .buttons(whatsAppButtonApiDataList);
        WhatsAppTemplatePublicApiRequest whatsAppDefaultMarketingTemplatePublicApiRequest =
                new WhatsAppDefaultMarketingTemplatePublicApiRequest()
                        .name("media_template_with_call_to_action_buttons")
                        .language(WhatsAppLanguage.EN)
                        .structure(whatsAppDefaultTemplateStructureApiData);
        setUpSuccessPostRequest("/whatsapp/2/senders/0001/templates", givenRequest, givenResponse);
        Consumer<WhatsAppTemplateApiResponse> assertions = (whatsAppTemplateApiResponse) -> {
            then(whatsAppTemplateApiResponse).isNotNull();
            then(whatsAppTemplateApiResponse.getId()).isEqualTo("111");
            then(whatsAppTemplateApiResponse.getBusinessAccountId()).isEqualTo(222L);
            then(whatsAppTemplateApiResponse.getName()).isEqualTo("media_template_with_buttons");
            then(whatsAppTemplateApiResponse.getLanguage()).isEqualTo(WhatsAppLanguage.EN);
            then(whatsAppTemplateApiResponse.getStatus()).isEqualTo(WhatsAppStatus.APPROVED);
            then(whatsAppTemplateApiResponse.getCategory()).isEqualTo(WhatsAppCategory.MARKETING);
            then(whatsAppTemplateApiResponse.getStructure()).isNotNull();
            WhatsAppHeaderApiData whatsAppHeaderApiData =
                    whatsAppTemplateApiResponse.getStructure().getHeader();
            then(whatsAppHeaderApiData).isNotNull();
            then(whatsAppHeaderApiData.getFormat()).isEqualTo(WhatsAppHeaderApiData.FormatEnum.IMAGE);
            WhatsAppBodyApiData whatsAppBodyApiDataResponse =
                    whatsAppTemplateApiResponse.getStructure().getBody();
            then(whatsAppBodyApiDataResponse).isNotNull();
            then(whatsAppBodyApiDataResponse.getText()).isEqualTo("example {{1}} body");
            WhatsAppFooterApiData whatsAppFooterApiData =
                    whatsAppTemplateApiResponse.getStructure().getFooter();
            then(whatsAppFooterApiData).isNotNull();
            then(whatsAppFooterApiData.getText()).isEqualTo("exampleFooter");
            then(whatsAppTemplateApiResponse.getStructure().getButtons()).isNotNull();
            List<WhatsAppButtonApiData> whatsAppButtonApiDataListResponse =
                    whatsAppTemplateApiResponse.getStructure().getButtons();
            then(whatsAppButtonApiDataListResponse).hasSize(2);
            WhatsAppButtonApiData whatsAppButtonApiDataResponse1 = whatsAppButtonApiDataListResponse.get(0);
            then(whatsAppButtonApiDataResponse1).isNotNull();
            then(((WhatsAppPhoneNumberButtonApiData) whatsAppButtonApiDataResponse1).getText())
                    .isEqualTo("Dial 911");
            then(((WhatsAppPhoneNumberButtonApiData) whatsAppButtonApiDataResponse1).getPhoneNumber())
                    .isEqualTo("911");
            WhatsAppButtonApiData whatsAppButtonApiDataResponse2 = whatsAppButtonApiDataListResponse.get(1);
            then(whatsAppButtonApiDataResponse2).isNotNull();
            then(((WhatsAppUrlButtonApiData) whatsAppButtonApiDataResponse2).getText())
                    .isEqualTo("Visit our website");
            then(((WhatsAppUrlButtonApiData) whatsAppButtonApiDataResponse2).getUrl())
                    .isEqualTo("https://www.infobip.com");
            then(whatsAppTemplateApiResponse.getStructure().getType())
                    .isEqualTo(WhatsAppDefaultTemplateStructureApiData.TypeEnum.MEDIA);
            then(whatsAppTemplateApiResponse.getQuality()).isEqualTo(WhatsAppTemplateApiResponse.QualityEnum.LOW);
            OffsetDateTime expectedCreatedAt = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
            then(whatsAppTemplateApiResponse.getCreatedAt()).isEqualTo(expectedCreatedAt);
            OffsetDateTime expectedLastUpdatedAt =
                    OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
            then(whatsAppTemplateApiResponse.getLastUpdatedAt()).isEqualTo(expectedLastUpdatedAt);
        };
        var call = whatsAppApi.createWhatsAppTemplate(sender, whatsAppDefaultMarketingTemplatePublicApiRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldTemplateWithCarouselCreateWhatsAppTemplate() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"name\": \"media_template_with_carousel\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"body {{1}} content\",\n"
                + "      \"examples\": [\n"
                + "        \"example\"\n"
                + "      ]\n"
                + "    },\n"
                + "    \"carousel\": {\n"
                + "      \"cards\": [\n"
                + "        {\n"
                + "          \"header\": {\n"
                + "            \"example\": \"https://www.example.com/image.png\",\n"
                + "            \"format\": \"IMAGE\"\n"
                + "          },\n"
                + "          \"body\": {\n"
                + "            \"text\": \"body {{1}} content\",\n"
                + "            \"examples\": [\n"
                + "              \"example\"\n"
                + "            ]\n"
                + "          },\n"
                + "          \"buttons\": [\n"
                + "            {\n"
                + "              \"type\": \"PHONE_NUMBER\",\n"
                + "              \"text\": \"call agent\",\n"
                + "              \"phoneNumber\": \"007\"\n"
                + "            },\n"
                + "            {\n"
                + "              \"type\": \"URL\",\n"
                + "              \"text\": \"visit website\",\n"
                + "              \"url\": \"https://www.infobip.com/{{1}}\",\n"
                + "              \"example\": \"https://www.infobip.com/docs\"\n"
                + "            }\n"
                + "          ]\n"
                + "        }\n"
                + "      ]\n"
                + "    }\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"id\": \"111\",\n"
                + "  \"businessAccountId\": 222,\n"
                + "  \"name\": \"media_template_with_carousel\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"status\": \"APPROVED\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"example {{1}} body\"\n"
                + "    },\n"
                + "    \"carousel\": {\n"
                + "      \"cards\": [\n"
                + "        {\n"
                + "          \"header\": {\n"
                + "            \"format\": \"IMAGE\"\n"
                + "          },\n"
                + "          \"body\": {\n"
                + "            \"text\": \"example {{1}} body\"\n"
                + "          },\n"
                + "          \"buttons\": [\n"
                + "            {\n"
                + "              \"type\": \"PHONE_NUMBER\",\n"
                + "              \"text\": \"Dial 911\",\n"
                + "              \"phoneNumber\": \"911\"\n"
                + "            },\n"
                + "            {\n"
                + "              \"type\": \"URL\",\n"
                + "              \"text\": \"Visit our website\",\n"
                + "              \"url\": \"https://www.infobip.com\"\n"
                + "            }\n"
                + "          ]\n"
                + "        }\n"
                + "      ]\n"
                + "    },\n"
                + "    \"type\": \"MEDIA\"\n"
                + "  },\n"
                + "  \"quality\": \"LOW\",\n"
                + "  \"createdAt\": \"2024-01-01T00:00:00.000+0000\",\n"
                + "  \"lastUpdatedAt\": \"2024-01-01T00:00:00.000+0000\"\n"
                + "}";
        WhatsAppImageHeaderApiData whatsAppImageHeaderApiData =
                new WhatsAppImageHeaderApiData().example("https://www.example.com/image.png");
        WhatsAppBodyApiData whatsAppBodyApiData =
                new WhatsAppBodyApiData().text("body {{1}} content").examples(List.of("example"));
        WhatsAppPhoneNumberButtonApiData whatsAppPhoneNumberButtonApiData =
                new WhatsAppPhoneNumberButtonApiData().text("call agent").phoneNumber("007");
        WhatsAppUrlButtonApiData whatsAppUrlButtonApiData = new WhatsAppUrlButtonApiData()
                .text("visit website")
                .url("https://www.infobip.com/{{1}}")
                .example("https://www.infobip.com/docs");
        List<WhatsAppButtonApiData> buttonsList = List.of(whatsAppPhoneNumberButtonApiData, whatsAppUrlButtonApiData);
        WhatsAppCardApiData whatsAppCardApiData = new WhatsAppCardApiData()
                .header(whatsAppImageHeaderApiData)
                .body(whatsAppBodyApiData)
                .buttons(buttonsList);
        WhatsAppCarouselApiData whatsAppCarouselApiData =
                new WhatsAppCarouselApiData().cards(List.of(whatsAppCardApiData));
        WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiData =
                new WhatsAppDefaultTemplateStructureApiData()
                        .body(whatsAppBodyApiData)
                        .carousel(whatsAppCarouselApiData);
        WhatsAppTemplatePublicApiRequest request = new WhatsAppDefaultMarketingTemplatePublicApiRequest()
                .name("media_template_with_carousel")
                .language(WhatsAppLanguage.EN)
                .structure(whatsAppDefaultTemplateStructureApiData);
        OffsetDateTime expectedCreatedAt = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
        OffsetDateTime expectedLastUpdatedAt = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
        setUpSuccessPostRequest("/whatsapp/2/senders/447796344125/templates", givenRequest, givenResponse);
        Consumer<WhatsAppTemplateApiResponse> assertions = (whatsappTemplateApiResponse) -> {
            then(whatsappTemplateApiResponse).isNotNull();
            then(whatsappTemplateApiResponse.getId()).isEqualTo("111");
            then(whatsappTemplateApiResponse.getBusinessAccountId()).isEqualTo(222L);
            then(whatsappTemplateApiResponse.getName()).isEqualTo("media_template_with_carousel");
            then(whatsappTemplateApiResponse.getLanguage()).isEqualTo(WhatsAppLanguage.EN);
            then(whatsappTemplateApiResponse.getStatus()).isEqualTo(WhatsAppStatus.APPROVED);
            then(whatsappTemplateApiResponse.getCategory()).isEqualTo(WhatsAppCategory.MARKETING);
            WhatsAppDefaultTemplateStructureApiData whatsappDefaultTemplateStructureApiData =
                    whatsappTemplateApiResponse.getStructure();
            then(whatsappDefaultTemplateStructureApiData).isNotNull();
            WhatsAppBodyApiData whatsappBodyApiData = whatsappDefaultTemplateStructureApiData.getBody();
            then(whatsappBodyApiData).isNotNull();
            then(whatsappBodyApiData.getText()).isEqualTo("example {{1}} body");
            WhatsAppCarouselApiData whatsappTemplateCarouselContent =
                    whatsappDefaultTemplateStructureApiData.getCarousel();
            then(whatsappTemplateCarouselContent).isNotNull();
            List<WhatsAppCardApiData> whatsappTemplateCardContentList = whatsappTemplateCarouselContent.getCards();
            then(whatsappTemplateCardContentList).isNotNull();
            then(whatsappTemplateCardContentList).hasSize(1);
            WhatsAppCardApiData whatsappTemplateCardContent = whatsappTemplateCardContentList.get(0);
            then(whatsappTemplateCardContent).isNotNull();
            WhatsAppHeaderApiData whatsappTemplateHeaderContent = whatsappTemplateCardContent.getHeader();
            then(whatsappTemplateHeaderContent).isNotNull();
            then(whatsappTemplateHeaderContent.getFormat()).isEqualTo(WhatsAppHeaderApiData.FormatEnum.IMAGE);
            WhatsAppBodyApiData whatsappTemplateBodyContent = whatsappTemplateCardContent.getBody();
            then(whatsappTemplateBodyContent).isNotNull();
            then(whatsappTemplateBodyContent.getText()).isEqualTo("example {{1}} body");
            List<WhatsAppButtonApiData> whatsappTemplateButtonContentList1 = whatsappTemplateCardContent.getButtons();
            then(whatsappTemplateButtonContentList1).isNotNull();
            then(whatsappTemplateButtonContentList1).hasSize(2);
            WhatsAppPhoneNumberButtonApiData whatsappTemplateButtonContent =
                    (WhatsAppPhoneNumberButtonApiData) whatsappTemplateButtonContentList1.get(0);
            then(whatsappTemplateButtonContent).isNotNull();
            then(whatsappTemplateButtonContent.getType()).isEqualTo(WhatsAppButtonApiData.TypeEnum.PHONE_NUMBER);
            then(whatsappTemplateButtonContent.getText()).isEqualTo("Dial 911");
            then(whatsappTemplateButtonContent.getPhoneNumber()).isEqualTo("911");
            WhatsAppUrlButtonApiData whatsappTemplateButtonContent2 =
                    (WhatsAppUrlButtonApiData) whatsappTemplateButtonContentList1.get(1);
            then(whatsappTemplateButtonContent2).isNotNull();
            then(whatsappTemplateButtonContent2.getType()).isEqualTo(WhatsAppButtonApiData.TypeEnum.URL);
            then(whatsappTemplateButtonContent2.getText()).isEqualTo("Visit our website");
            then(whatsappTemplateButtonContent2.getUrl()).isEqualTo("https://www.infobip.com");
            then(whatsappDefaultTemplateStructureApiData.getType())
                    .isEqualTo(WhatsAppDefaultTemplateStructureApiData.TypeEnum.MEDIA);
            then(whatsappTemplateApiResponse.getQuality()).isEqualTo(WhatsAppTemplateApiResponse.QualityEnum.LOW);
            then(whatsappTemplateApiResponse.getCreatedAt()).isEqualTo(expectedCreatedAt);
            then(whatsappTemplateApiResponse.getLastUpdatedAt()).isEqualTo(expectedLastUpdatedAt);
        };
        var call = whatsAppApi.createWhatsAppTemplate("447796344125", request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateTemplateWithCopyCodeButtonCreateWhatsAppTemplate() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"name\": \"media_template_with_copy_code_button\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"header\": {\n"
                + "      \"example\": \"https://www.example.com/image.png\",\n"
                + "      \"format\": \"IMAGE\"\n"
                + "    },\n"
                + "    \"body\": {\n"
                + "      \"text\": \"body {{1}} content\",\n"
                + "      \"examples\": [\n"
                + "        \"example\"\n"
                + "      ]\n"
                + "    },\n"
                + "    \"buttons\": [\n"
                + "      {\n"
                + "        \"type\": \"COPY_CODE\",\n"
                + "        \"example\": \"exampleCode\"\n"
                + "      }\n"
                + "    ]\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"id\": \"111\",\n"
                + "  \"businessAccountId\": 222,\n"
                + "  \"name\": \"media_template_with_copy_code\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"status\": \"APPROVED\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"header\": {\n"
                + "      \"format\": \"IMAGE\"\n"
                + "    },\n"
                + "    \"body\": {\n"
                + "      \"text\": \"example {{1}} body\"\n"
                + "    },\n"
                + "    \"buttons\": [\n"
                + "      {\n"
                + "        \"type\": \"COPY_CODE\",\n"
                + "        \"text\": \"Copy offer code\",\n"
                + "        \"example\": \"exampleCopyCode\"\n"
                + "      }\n"
                + "    ],\n"
                + "    \"shorteningOptions\": {\n"
                + "      \"customDomain\": \"my-domain\"\n"
                + "    },\n"
                + "    \"type\": \"MEDIA\"\n"
                + "  },\n"
                + "  \"quality\": \"LOW\",\n"
                + "  \"createdAt\": \"2024-01-01T00:00:00.000+0000\",\n"
                + "  \"lastUpdatedAt\": \"2024-01-01T00:00:00.000+0000\"\n"
                + "}";
        WhatsAppImageHeaderApiData whatsAppImageHeaderApiData =
                new WhatsAppImageHeaderApiData().example("https://www.example.com/image.png");
        List<String> stringList = List.of("example");
        WhatsAppBodyApiData whatsAppBodyApiData =
                new WhatsAppBodyApiData().text("body {{1}} content").examples(stringList);
        WhatsAppCopyCodeDefaultButtonApiData whatsAppCopyCodeDefaultButtonApiData =
                new WhatsAppCopyCodeDefaultButtonApiData().example("exampleCode");
        List<WhatsAppButtonApiData> whatsAppButtonApiDataList = List.of(whatsAppCopyCodeDefaultButtonApiData);
        WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiData =
                new WhatsAppDefaultTemplateStructureApiData()
                        .header(whatsAppImageHeaderApiData)
                        .body(whatsAppBodyApiData)
                        .buttons(whatsAppButtonApiDataList);
        WhatsAppTemplatePublicApiRequest whatsAppDefaultMarketingTemplatePublicApiRequest =
                new WhatsAppDefaultMarketingTemplatePublicApiRequest()
                        .name("media_template_with_copy_code_button")
                        .language(WhatsAppLanguage.EN)
                        .structure(whatsAppDefaultTemplateStructureApiData);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
        setUpSuccessPostRequest("/whatsapp/2/senders/447796344125/templates", givenRequest, givenResponse);
        Consumer<WhatsAppTemplateApiResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo("111");
            then(response.getBusinessAccountId()).isEqualTo(222L);
            then(response.getName()).isEqualTo("media_template_with_copy_code");
            then(response.getLanguage()).isEqualTo(WhatsAppLanguage.EN);
            then(response.getStatus()).isEqualTo(WhatsAppStatus.APPROVED);
            then(response.getCategory()).isEqualTo(WhatsAppCategory.MARKETING);
            WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiDataResponse =
                    (WhatsAppDefaultTemplateStructureApiData) response.getStructure();
            then(whatsAppDefaultTemplateStructureApiDataResponse).isNotNull();
            WhatsAppImageHeaderApiData whatsAppImageHeaderApiDataResponse =
                    (WhatsAppImageHeaderApiData) whatsAppDefaultTemplateStructureApiDataResponse.getHeader();
            then(whatsAppImageHeaderApiDataResponse).isNotNull();
            then(whatsAppImageHeaderApiDataResponse.getFormat()).isEqualTo(WhatsAppHeaderApiData.FormatEnum.IMAGE);
            WhatsAppBodyApiData whatsAppBodyApiDataResponse = whatsAppDefaultTemplateStructureApiDataResponse.getBody();
            then(whatsAppBodyApiDataResponse).isNotNull();
            then(whatsAppBodyApiDataResponse.getText()).isEqualTo("example {{1}} body");
            List<WhatsAppButtonApiData> whatsAppTemplateButtonContentList =
                    whatsAppDefaultTemplateStructureApiDataResponse.getButtons();
            then(whatsAppTemplateButtonContentList).isNotNull();
            then(whatsAppTemplateButtonContentList).hasSize(1);
            WhatsAppCopyCodeDefaultButtonApiData whatsAppTemplateButtonContent =
                    (WhatsAppCopyCodeDefaultButtonApiData) whatsAppTemplateButtonContentList.get(0);
            then(whatsAppTemplateButtonContent.getText()).isEqualTo("Copy offer code");
            then(whatsAppTemplateButtonContent.getExample()).isEqualTo("exampleCopyCode");
            WhatsAppShorteningOptionsApiData whatsAppShorteningOptionsApiData =
                    whatsAppDefaultTemplateStructureApiDataResponse.getShorteningOptions();
            then(whatsAppShorteningOptionsApiData).isNotNull();
            then(whatsAppShorteningOptionsApiData.getCustomDomain()).isEqualTo("my-domain");
            then(whatsAppDefaultTemplateStructureApiDataResponse.getType())
                    .isEqualTo(WhatsAppDefaultTemplateStructureApiData.TypeEnum.MEDIA);
            then(response.getQuality()).isEqualTo(WhatsAppTemplateApiResponse.QualityEnum.LOW);
            then(response.getCreatedAt()).isEqualTo(offsetDateTime);
            then(response.getLastUpdatedAt()).isEqualTo(offsetDateTime);
        };
        var call = whatsAppApi.createWhatsAppTemplate("447796344125", whatsAppDefaultMarketingTemplatePublicApiRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldTemplateWithFlowButtonCreateWhatsAppTemplate() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"name\": \"media_template_with_flow_button\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"body {{1}} content\",\n"
                + "      \"examples\": [\n"
                + "        \"example\"\n"
                + "      ]\n"
                + "    },\n"
                + "    \"buttons\": [\n"
                + "      {\n"
                + "        \"type\": \"FLOW\",\n"
                + "        \"text\": \"exampleText\",\n"
                + "        \"flowId\": 123456,\n"
                + "        \"flowAction\": \"NAVIGATE\",\n"
                + "        \"navigateScreen\": \"exampleNavigateScreen\"\n"
                + "      }\n"
                + "    ]\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"id\": \"111\",\n"
                + "  \"businessAccountId\": 222,\n"
                + "  \"name\": \"media_template_with_flow_button\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"status\": \"APPROVED\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"header\": {\n"
                + "      \"format\": \"IMAGE\"\n"
                + "    },\n"
                + "    \"body\": {\n"
                + "      \"text\": \"example {{1}} body\"\n"
                + "    },\n"
                + "    \"buttons\": [\n"
                + "      {\n"
                + "        \"type\": \"FLOW\",\n"
                + "        \"text\": \"example text\",\n"
                + "        \"flowId\": 123456,\n"
                + "        \"flowAction\": \"NAVIGATE\",\n"
                + "        \"navigateScreen\": \"exampleScreen\"\n"
                + "      }\n"
                + "    ],\n"
                + "    \"type\": \"MEDIA\"\n"
                + "  },\n"
                + "  \"quality\": \"LOW\",\n"
                + "  \"createdAt\": \"2024-01-01T00:00:00.000+0000\",\n"
                + "  \"lastUpdatedAt\": \"2024-01-01T00:00:00.000+0000\"\n"
                + "}";
        WhatsAppBodyApiData whatsAppBodyApiData = new WhatsAppBodyApiData().text("body {{1}} content");
        whatsAppBodyApiData.addExamplesItem("example");
        WhatsAppFlowButtonApiData whatsAppTemplateFlowButtonContent = new WhatsAppFlowButtonApiData()
                .text("exampleText")
                .flowId(123456L)
                .flowAction(WhatsAppFlowButtonApiData.FlowActionEnum.NAVIGATE)
                .navigateScreen("exampleNavigateScreen");
        List<WhatsAppButtonApiData> whatsAppTemplateFlowButtonContentList = List.of(whatsAppTemplateFlowButtonContent);
        WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiData =
                new WhatsAppDefaultTemplateStructureApiData().body(whatsAppBodyApiData);
        whatsAppDefaultTemplateStructureApiData.addButtonsItem(whatsAppTemplateFlowButtonContent);
        WhatsAppTemplatePublicApiRequest whatsAppDefaultMarketingTemplatePublicApiRequest =
                new WhatsAppDefaultMarketingTemplatePublicApiRequest()
                        .name("media_template_with_flow_button")
                        .language(WhatsAppLanguage.EN)
                        .structure(whatsAppDefaultTemplateStructureApiData);
        setUpSuccessPostRequest("/whatsapp/2/senders/447796344125/templates", givenRequest, givenResponse);
        Consumer<WhatsAppTemplateApiResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo("111");
            then(response.getBusinessAccountId()).isEqualTo(222);
            then(response.getName()).isEqualTo("media_template_with_flow_button");
            then(response.getLanguage()).isEqualTo(WhatsAppLanguage.EN);
            then(response.getStatus()).isEqualTo(WhatsAppStatus.APPROVED);
            then(response.getCategory()).isEqualTo(WhatsAppCategory.MARKETING);
            then(response.getStructure()).isNotNull();
            WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiDataResp =
                    response.getStructure();
            then(whatsAppDefaultTemplateStructureApiDataResp.getHeader()).isNotNull();
            WhatsAppImageHeaderApiData whatsAppImageHeaderApiData =
                    (WhatsAppImageHeaderApiData) whatsAppDefaultTemplateStructureApiDataResp.getHeader();
            then(whatsAppImageHeaderApiData.getFormat()).isEqualTo(WhatsAppHeaderApiData.FormatEnum.IMAGE);
            then(whatsAppDefaultTemplateStructureApiDataResp.getBody()).isNotNull();
            WhatsAppBodyApiData whatsAppBodyApiDataResp = whatsAppDefaultTemplateStructureApiDataResp.getBody();
            then(whatsAppBodyApiDataResp.getText()).isEqualTo("example {{1}} body");
            then(whatsAppDefaultTemplateStructureApiDataResp.getButtons()).isNotNull();
            List<WhatsAppButtonApiData> whatsAppTemplateButtonContentList =
                    whatsAppDefaultTemplateStructureApiDataResp.getButtons();
            then(whatsAppTemplateButtonContentList).hasSize(1);
            WhatsAppFlowButtonApiData whatsAppTemplateFlowButtonContentResp =
                    (WhatsAppFlowButtonApiData) whatsAppTemplateButtonContentList.get(0);
            then(whatsAppTemplateFlowButtonContentResp.getText()).isEqualTo("example text");
            then(whatsAppTemplateFlowButtonContentResp.getFlowId()).isEqualTo(123456L);
            then(whatsAppTemplateFlowButtonContentResp.getFlowAction())
                    .isEqualTo(WhatsAppFlowButtonApiData.FlowActionEnum.NAVIGATE);
            then(whatsAppTemplateFlowButtonContentResp.getNavigateScreen()).isEqualTo("exampleScreen");
            then(whatsAppDefaultTemplateStructureApiDataResp.getType()).isNotNull();
            then(whatsAppDefaultTemplateStructureApiDataResp.getType().toString())
                    .isEqualTo("MEDIA");
            then(response.getQuality()).isEqualTo(WhatsAppTemplateApiResponse.QualityEnum.LOW);
            OffsetDateTime expectedDateTime = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
            then(response.getCreatedAt()).isEqualTo(expectedDateTime);
            then(response.getLastUpdatedAt()).isEqualTo(expectedDateTime);
        };
        var call = whatsAppApi.createWhatsAppTemplate("447796344125", whatsAppDefaultMarketingTemplatePublicApiRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldTemplateWithFooterCreateWhatsAppTemplate() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"name\": \"media_template_with_footer\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"body {{1}} content\",\n"
                + "      \"examples\": [\n"
                + "        \"example\"\n"
                + "      ]\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"footer content\"\n"
                + "    }\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"id\": \"111\",\n"
                + "  \"businessAccountId\": 222,\n"
                + "  \"name\": \"media_template\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"status\": \"APPROVED\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"header\": {\n"
                + "      \"format\": \"IMAGE\"\n"
                + "    },\n"
                + "    \"body\": {\n"
                + "      \"text\": \"example {{1}} body\"\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"exampleFooter\"\n"
                + "    },\n"
                + "    \"type\": \"MEDIA\"\n"
                + "  },\n"
                + "  \"quality\": \"HIGH\",\n"
                + "  \"platform\": {\n"
                + "    \"entityId\": \"entityId\",\n"
                + "    \"applicationId\": \"applicationId\"\n"
                + "  },\n"
                + "  \"createdAt\": \"2024-01-01T00:00:00.000+0000\",\n"
                + "  \"lastUpdatedAt\": \"2024-01-01T00:00:00.000+0000\"\n"
                + "}";
        WhatsAppBodyApiData whatsAppBodyApiData =
                new WhatsAppBodyApiData().text("body {{1}} content").addExamplesItem("example");
        WhatsAppFooterApiData whatsAppFooterApiData = new WhatsAppFooterApiData().text("footer content");
        WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiData =
                new WhatsAppDefaultTemplateStructureApiData()
                        .body(whatsAppBodyApiData)
                        .footer(whatsAppFooterApiData);
        WhatsAppTemplatePublicApiRequest whatsAppTemplatePublicApiRequest =
                new WhatsAppDefaultMarketingTemplatePublicApiRequest()
                        .name("media_template_with_footer")
                        .language(WhatsAppLanguage.EN)
                        .structure(whatsAppDefaultTemplateStructureApiData);
        OffsetDateTime givenCreatedAt = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
        OffsetDateTime givenLastUpdatedAt = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
        setUpSuccessPostRequest("/whatsapp/2/senders/sender/templates", givenRequest, givenResponse);
        Consumer<WhatsAppTemplateApiResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo("111");
            then(response.getBusinessAccountId()).isEqualTo(222L);
            then(response.getName()).isEqualTo("media_template");
            then(response.getLanguage()).isEqualTo(WhatsAppLanguage.EN);
            then(response.getStatus()).isEqualTo(WhatsAppStatus.APPROVED);
            then(response.getCategory()).isEqualTo(WhatsAppCategory.MARKETING);
            then(response.getStructure()).isNotNull();
            WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiDataResponse =
                    response.getStructure();
            then(whatsAppDefaultTemplateStructureApiDataResponse.getHeader()).isNotNull();
            WhatsAppHeaderApiData whatsAppHeaderApiData = whatsAppDefaultTemplateStructureApiDataResponse.getHeader();
            then(whatsAppHeaderApiData.getFormat()).isEqualTo(WhatsAppHeaderApiData.FormatEnum.IMAGE);
            then(whatsAppDefaultTemplateStructureApiDataResponse.getBody()).isNotNull();
            WhatsAppBodyApiData whatsAppBodyApiDataResponse = whatsAppDefaultTemplateStructureApiDataResponse.getBody();
            then(whatsAppBodyApiDataResponse.getText()).isEqualTo("example {{1}} body");
            then(whatsAppDefaultTemplateStructureApiDataResponse.getFooter()).isNotNull();
            WhatsAppFooterApiData whatsAppFooterApiDataResponse =
                    whatsAppDefaultTemplateStructureApiDataResponse.getFooter();
            then(whatsAppFooterApiDataResponse.getText()).isEqualTo("exampleFooter");
            then(whatsAppDefaultTemplateStructureApiDataResponse.getType())
                    .isEqualTo(WhatsAppDefaultTemplateStructureApiData.TypeEnum.MEDIA);
            then(response.getQuality()).isEqualTo(WhatsAppTemplateApiResponse.QualityEnum.HIGH);
            then(response.getPlatform()).isNotNull();
            Platform platform = response.getPlatform();
            then(platform.getEntityId()).isEqualTo("entityId");
            then(platform.getApplicationId()).isEqualTo("applicationId");
            then(response.getCreatedAt()).isEqualTo(givenCreatedAt);
            then(response.getLastUpdatedAt()).isEqualTo(givenLastUpdatedAt);
        };
        var call = whatsAppApi.createWhatsAppTemplate("sender", whatsAppTemplatePublicApiRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldTemplateWithImageHeaderCreateWhatsAppTemplate() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"name\": \"media_template_with_image_header\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"header\": {\n"
                + "      \"example\": \"https://www.example.com/image.png\",\n"
                + "      \"format\": \"IMAGE\"\n"
                + "    },\n"
                + "    \"body\": {\n"
                + "      \"text\": \"body {{1}} content\",\n"
                + "      \"examples\": [\n"
                + "        \"example\"\n"
                + "      ]\n"
                + "    }\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"id\": \"111\",\n"
                + "  \"businessAccountId\": 222,\n"
                + "  \"name\": \"media_template\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"status\": \"APPROVED\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"header\": {\n"
                + "      \"format\": \"IMAGE\"\n"
                + "    },\n            "
                + "    \"body\": {\n"
                + "      \"text\": \"example {{1}} body\"\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"exampleFooter\"\n"
                + "    },\n"
                + "    \"type\": \"MEDIA\"\n"
                + "  },\n"
                + "  \"quality\": \"HIGH\",\n"
                + "  \"platform\": {\n"
                + "    \"entityId\": \"entityId\",\n"
                + "    \"applicationId\": \"applicationId\"\n"
                + "  },\n"
                + "  \"createdAt\": \"2024-01-01T00:00:00.000+0000\",\n"
                + "  \"lastUpdatedAt\": \"2024-01-01T00:00:00.000+0000\"\n"
                + "}";
        String sender = "sender";
        WhatsAppImageHeaderApiData whatsappImageHeaderApiData =
                new WhatsAppImageHeaderApiData().example("https://www.example.com/image.png");
        WhatsAppBodyApiData whatsappBodyApiData =
                new WhatsAppBodyApiData().text("body {{1}} content").addExamplesItem("example");
        WhatsAppDefaultTemplateStructureApiData whatsappDefaultTemplateStructureApiData =
                new WhatsAppDefaultTemplateStructureApiData()
                        .header(whatsappImageHeaderApiData)
                        .body(whatsappBodyApiData);
        WhatsAppTemplatePublicApiRequest whatsappTemplatePublicApiRequest =
                new WhatsAppDefaultMarketingTemplatePublicApiRequest()
                        .name("media_template_with_image_header")
                        .language(WhatsAppLanguage.EN)
                        .structure(whatsappDefaultTemplateStructureApiData);
        setUpSuccessPostRequest("/whatsapp/2/senders/" + sender + "/templates", givenRequest, givenResponse);
        Consumer<WhatsAppTemplateApiResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo("111");
            then(response.getBusinessAccountId()).isEqualTo(222);
            then(response.getName()).isEqualTo("media_template");
            then(response.getLanguage()).isEqualTo(WhatsAppLanguage.EN);
            then(response.getStatus()).isEqualTo(WhatsAppStatus.APPROVED);
            then(response.getCategory()).isEqualTo(WhatsAppCategory.MARKETING);
            WhatsAppDefaultTemplateStructureApiData whatsappDefaultTemplateStructureApiData2 = response.getStructure();
            then(whatsappDefaultTemplateStructureApiData2).isNotNull();
            WhatsAppHeaderApiData whatsappHeaderApiData = whatsappDefaultTemplateStructureApiData2.getHeader();
            then(whatsappHeaderApiData).isNotNull();
            then(whatsappHeaderApiData.getFormat()).isEqualTo(WhatsAppHeaderApiData.FormatEnum.IMAGE);
            WhatsAppBodyApiData whatsappBodyApiData2 = whatsappDefaultTemplateStructureApiData2.getBody();
            then(whatsappBodyApiData2).isNotNull();
            then(whatsappBodyApiData2.getText()).isEqualTo("example {{1}} body");
            WhatsAppFooterApiData whatsappFooterApiData = whatsappDefaultTemplateStructureApiData2.getFooter();
            then(whatsappFooterApiData).isNotNull();
            then(whatsappFooterApiData.getText()).isEqualTo("exampleFooter");
            then(whatsappDefaultTemplateStructureApiData2.getType())
                    .isEqualTo(WhatsAppDefaultTemplateStructureApiData.TypeEnum.MEDIA);
            then(response.getQuality()).isEqualTo(WhatsAppTemplateApiResponse.QualityEnum.HIGH);
            Platform platform = response.getPlatform();
            then(platform).isNotNull();
            then(platform.getEntityId()).isEqualTo("entityId");
            then(platform.getApplicationId()).isEqualTo("applicationId");
            OffsetDateTime expectedCreatedAt = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
            then(response.getCreatedAt()).isEqualTo(expectedCreatedAt);
            OffsetDateTime expectedLastUpdatedAt =
                    OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
            then(response.getLastUpdatedAt()).isEqualTo(expectedLastUpdatedAt);
        };
        var call = whatsAppApi.createWhatsAppTemplate(sender, whatsappTemplatePublicApiRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateTemplateWithLimitedTimeOfferCreateWhatsAppTemplate() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"name\": \"media_template_with_limited_time_offer\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"body {{1}} content\",\n"
                + "      \"examples\": [\n"
                + "        \"example\"\n"
                + "      ]\n"
                + "    },\n"
                + "    \"buttons\": [\n"
                + "      {\n"
                + "        \"type\": \"URL\",\n"
                + "        \"text\": \"visit website\",\n"
                + "        \"url\": \"https://www.infobip.com/{{1}}\",\n"
                + "        \"example\": \"https://www.infobip.com/docs\"\n"
                + "      }\n"
                + "    ],\n"
                + "    \"limitedTimeOffer\": {\n"
                + "      \"hasExpiration\": false,\n"
                + "      \"text\": \"Example offer\"\n"
                + "    }\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"id\": \"111\",\n"
                + "  \"businessAccountId\": 222,\n"
                + "  \"name\": \"media_template_with_buttons\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"status\": \"APPROVED\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"header\": {\n"
                + "      \"format\": \"IMAGE\"\n"
                + "    },\n            "
                + "    \"body\": {\n"
                + "      \"text\": \"example {{1}} body\"\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"exampleFooter\"\n"
                + "    },\n"
                + "    \"buttons\": [\n"
                + "      {\n"
                + "        \"type\": \"PHONE_NUMBER\",\n"
                + "        \"text\": \"Dial 911\",\n"
                + "        \"phoneNumber\": \"911\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"type\": \"URL\",\n"
                + "        \"text\": \"Visit our website\",\n"
                + "        \"url\": \"https://www.infobip.com\"\n"
                + "      }\n"
                + "    ],\n"
                + "    \"type\": \"MEDIA\"\n"
                + "  },\n"
                + "  \"quality\": \"LOW\",\n"
                + "  \"createdAt\": \"2024-01-01T00:00:00.000+0000\",\n"
                + "  \"lastUpdatedAt\": \"2024-01-01T00:00:00.000+0000\"\n"
                + "}";
        WhatsAppBodyApiData whatsappBodyApiData = new WhatsAppBodyApiData().text("body {{1}} content");
        whatsappBodyApiData.addExamplesItem("example");
        WhatsAppUrlButtonApiData whatsappUrlButtonApiData =
                new WhatsAppUrlButtonApiData().text("visit website").url("https://www.infobip.com/{{1}}");
        whatsappUrlButtonApiData.setExample("https://www.infobip.com/docs");
        List<WhatsAppButtonApiData> whatsappButtonApiDataList = List.of(whatsappUrlButtonApiData);
        WhatsAppLimitedTimeOfferApiData whatsappLimitedTimeOfferApiData =
                new WhatsAppLimitedTimeOfferApiData().hasExpiration(false).text("Example offer");
        WhatsAppDefaultTemplateStructureApiData whatsappDefaultTemplateStructureApiData =
                new WhatsAppDefaultTemplateStructureApiData()
                        .body(whatsappBodyApiData)
                        .buttons(whatsappButtonApiDataList)
                        .limitedTimeOffer(whatsappLimitedTimeOfferApiData);
        WhatsAppTemplatePublicApiRequest whatsappDefaultMarketingTemplatePublicApiRequest =
                new WhatsAppDefaultMarketingTemplatePublicApiRequest()
                        .name("media_template_with_limited_time_offer")
                        .language(WhatsAppLanguage.EN)
                        .structure(whatsappDefaultTemplateStructureApiData);
        setUpSuccessPostRequest("/whatsapp/2/senders/447796344125/templates", givenRequest, givenResponse);
        Consumer<WhatsAppTemplateApiResponse> assertions = (whatsAppTemplateApiResponse) -> {
            then(whatsAppTemplateApiResponse).isNotNull();
            then(whatsAppTemplateApiResponse.getId()).isEqualTo("111");
            then(whatsAppTemplateApiResponse.getBusinessAccountId()).isEqualTo(222L);
            then(whatsAppTemplateApiResponse.getName()).isEqualTo("media_template_with_buttons");
            then(whatsAppTemplateApiResponse.getLanguage()).isEqualTo(WhatsAppLanguage.EN);
            then(whatsAppTemplateApiResponse.getStatus()).isEqualTo(WhatsAppStatus.APPROVED);
            then(whatsAppTemplateApiResponse.getCategory()).isEqualTo(WhatsAppCategory.MARKETING);
            WhatsAppDefaultTemplateStructureApiData whatsappDefaultTemplateStructureApiDataResponse =
                    whatsAppTemplateApiResponse.getStructure();
            then(whatsappDefaultTemplateStructureApiDataResponse).isNotNull();
            var whatsappTemplateHeaderContent = whatsappDefaultTemplateStructureApiDataResponse.getHeader();
            then(whatsappTemplateHeaderContent).isNotNull();
            then(whatsappTemplateHeaderContent.getFormat()).isEqualTo(WhatsAppHeaderApiData.FormatEnum.IMAGE);
            var whatsappTemplateBodyContent = whatsappDefaultTemplateStructureApiDataResponse.getBody();
            then(whatsappTemplateBodyContent).isNotNull();
            then(whatsappTemplateBodyContent.getText()).isEqualTo("example {{1}} body");
            WhatsAppFooterApiData whatsappFooterApiData = whatsappDefaultTemplateStructureApiDataResponse.getFooter();
            then(whatsappFooterApiData).isNotNull();
            then(whatsappFooterApiData.getText()).isEqualTo("exampleFooter");
            then(whatsappDefaultTemplateStructureApiDataResponse.getButtons()).isNotNull();
            List<WhatsAppButtonApiData> whatsappButtonApiDataListResponse =
                    whatsappDefaultTemplateStructureApiDataResponse.getButtons();
            then(whatsappButtonApiDataListResponse).hasSize(2);
            WhatsAppPhoneNumberButtonApiData whatsappButtonApiDataResponse1 =
                    (WhatsAppPhoneNumberButtonApiData) whatsappButtonApiDataListResponse.get(0);
            then(whatsappButtonApiDataResponse1).isNotNull();
            then(whatsappButtonApiDataResponse1.getType()).isEqualTo(WhatsAppButtonApiData.TypeEnum.PHONE_NUMBER);
            then(whatsappButtonApiDataResponse1.getText()).isEqualTo("Dial 911");
            WhatsAppPhoneNumberButtonApiData whatsappPhoneNumberButtonApiData =
                    (WhatsAppPhoneNumberButtonApiData) whatsappButtonApiDataResponse1;
            then(whatsappPhoneNumberButtonApiData).isNotNull();
            then(whatsappPhoneNumberButtonApiData.getPhoneNumber()).isEqualTo("911");
            WhatsAppUrlButtonApiData whatsappButtonApiDataResponse2 =
                    (WhatsAppUrlButtonApiData) whatsappButtonApiDataListResponse.get(1);
            then(whatsappButtonApiDataResponse2).isNotNull();
            then(whatsappButtonApiDataResponse2.getType()).isEqualTo(WhatsAppButtonApiData.TypeEnum.URL);
            then(whatsappButtonApiDataResponse2.getText()).isEqualTo("Visit our website");
            WhatsAppUrlButtonApiData whatsappUrlButtonApiDataResponse =
                    (WhatsAppUrlButtonApiData) whatsappButtonApiDataResponse2;
            then(whatsAppTemplateApiResponse.getStructure().getType())
                    .isEqualTo(WhatsAppDefaultTemplateStructureApiData.TypeEnum.MEDIA);
            then(whatsappUrlButtonApiDataResponse).isNotNull();
            then(whatsappUrlButtonApiDataResponse.getUrl()).isEqualTo("https://www.infobip.com");
            then(whatsAppTemplateApiResponse.getQuality()).isEqualTo(WhatsAppTemplateApiResponse.QualityEnum.LOW);
            OffsetDateTime expectedCreatedAt = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
            OffsetDateTime expectedLastUpdatedAt =
                    OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
            then(whatsAppTemplateApiResponse.getCreatedAt()).isEqualTo(expectedCreatedAt);
            then(whatsAppTemplateApiResponse.getLastUpdatedAt()).isEqualTo(expectedLastUpdatedAt);
        };
        var call = whatsAppApi.createWhatsAppTemplate("447796344125", whatsappDefaultMarketingTemplatePublicApiRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldTemplateWithLimitedTimeOfferWithExpirationCreateWhatsAppTemplate() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"name\": \"media_template_with_limited_time_offer\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"body {{1}} content\",\n"
                + "      \"examples\": [\n"
                + "        \"example\"\n"
                + "      ]\n"
                + "    },\n"
                + "    \"buttons\": [\n"
                + "      {\n"
                + "        \"type\": \"COPY_CODE\",\n"
                + "        \"example\": \"exampleCode\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"type\": \"URL\",\n"
                + "        \"text\": \"visit website\",\n"
                + "        \"url\": \"https://www.infobip.com/{{1}}\",\n"
                + "        \"example\": \"https://www.infobip.com/docs\"\n"
                + "      }\n"
                + "    ],\n"
                + "    \"limitedTimeOffer\": {\n"
                + "      \"hasExpiration\": true,\n"
                + "      \"text\": \"Example offer\"\n"
                + "    }\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"id\": \"111\",\n"
                + "  \"businessAccountId\": 222,\n"
                + "  \"name\": \"media_template_with_copy_code\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"status\": \"APPROVED\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"header\": {\n"
                + "      \"format\": \"IMAGE\"\n"
                + "    },\n            "
                + "    \"body\": {\n"
                + "      \"text\": \"example {{1}} body\"\n"
                + "    },\n"
                + "    \"buttons\": [\n"
                + "      {\n"
                + "        \"type\": \"COPY_CODE\",\n"
                + "        \"text\": \"Copy offer code\",\n"
                + "        \"example\": \"exampleCopyCode\"\n"
                + "      }\n"
                + "    ],\n"
                + "    \"shorteningOptions\": {\n"
                + "      \"customDomain\": \"my-domain\"\n"
                + "    },\n"
                + "    \"type\": \"MEDIA\"\n"
                + "  },\n"
                + "  \"quality\": \"LOW\",\n"
                + "  \"createdAt\": \"2024-01-01T00:00:00.000+0000\",\n"
                + "  \"lastUpdatedAt\": \"2024-01-01T00:00:00.000+0000\"\n"
                + "}";
        WhatsAppButtonApiData whatsappTemplateCopyCodeButtonContent =
                new WhatsAppCopyCodeDefaultButtonApiData().example("exampleCode");
        WhatsAppButtonApiData whatsappTemplateUrlButtonContent = new WhatsAppUrlButtonApiData()
                .url("https://www.infobip.com/{{1}}")
                .text("visit website")
                .example("https://www.infobip.com/docs");
        List<WhatsAppButtonApiData> whatsappTemplateButtonContentList =
                List.of(whatsappTemplateCopyCodeButtonContent, whatsappTemplateUrlButtonContent);
        WhatsAppBodyApiData whatsAppBodyApiData =
                new WhatsAppBodyApiData().text("body {{1}} content").addExamplesItem("example");
        WhatsAppLimitedTimeOfferApiData whatsAppLimitedTimeOfferApiData =
                new WhatsAppLimitedTimeOfferApiData().hasExpiration(true).text("Example offer");
        WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiData =
                new WhatsAppDefaultTemplateStructureApiData()
                        .body(whatsAppBodyApiData)
                        .buttons(whatsappTemplateButtonContentList)
                        .limitedTimeOffer(whatsAppLimitedTimeOfferApiData);
        WhatsAppTemplatePublicApiRequest whatsAppDefaultMarketingTemplatePublicApiRequest =
                new WhatsAppDefaultMarketingTemplatePublicApiRequest()
                        .name("media_template_with_limited_time_offer")
                        .language(WhatsAppLanguage.EN)
                        .structure(whatsAppDefaultTemplateStructureApiData);
        String sender = "123";
        OffsetDateTime expectedDateTime = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
        setUpSuccessPostRequest("/whatsapp/2/senders/123/templates", givenRequest, givenResponse);
        Consumer<WhatsAppTemplateApiResponse> assertions = (whatsappTemplateApiResponse) -> {
            then(whatsappTemplateApiResponse).isNotNull();
            then(whatsappTemplateApiResponse.getId()).isEqualTo("111");
            then(whatsappTemplateApiResponse.getBusinessAccountId()).isEqualTo(222);
            then(whatsappTemplateApiResponse.getName()).isEqualTo("media_template_with_copy_code");
            then(whatsappTemplateApiResponse.getLanguage()).isEqualTo(WhatsAppLanguage.EN);
            then(whatsappTemplateApiResponse.getStatus()).isEqualTo(WhatsAppStatus.APPROVED);
            then(whatsappTemplateApiResponse.getCategory()).isEqualTo(WhatsAppCategory.MARKETING);
            then(whatsappTemplateApiResponse.getStructure()).isNotNull();
            WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiDataResponse =
                    (WhatsAppDefaultTemplateStructureApiData) whatsappTemplateApiResponse.getStructure();
            then(whatsAppDefaultTemplateStructureApiDataResponse.getHeader()).isNotNull();
            WhatsAppHeaderApiData whatsAppTemplateHeaderContent =
                    whatsAppDefaultTemplateStructureApiDataResponse.getHeader();
            then(whatsAppTemplateHeaderContent.getFormat()).isEqualTo(WhatsAppHeaderApiData.FormatEnum.IMAGE);
            then(whatsAppDefaultTemplateStructureApiDataResponse.getBody()).isNotNull();
            WhatsAppBodyApiData whatsAppTemplateBodyContent = whatsAppDefaultTemplateStructureApiDataResponse.getBody();
            then(whatsAppTemplateBodyContent.getText()).isEqualTo("example {{1}} body");
            then(whatsAppDefaultTemplateStructureApiDataResponse.getButtons()).isNotNull();
            List<WhatsAppButtonApiData> whatsappTemplateButtonContentListResponse =
                    whatsAppDefaultTemplateStructureApiDataResponse.getButtons();
            then(whatsappTemplateButtonContentListResponse).hasSize(1);
            WhatsAppCopyCodeDefaultButtonApiData whatsappTemplateCopyCodeButtonContentResponse =
                    (WhatsAppCopyCodeDefaultButtonApiData) whatsappTemplateButtonContentListResponse.get(0);
            then(whatsappTemplateCopyCodeButtonContentResponse).isNotNull();
            then(whatsappTemplateCopyCodeButtonContentResponse.getText()).isEqualTo("Copy offer code");
            then(whatsappTemplateCopyCodeButtonContentResponse.getExample()).isEqualTo("exampleCopyCode");
            then(whatsAppDefaultTemplateStructureApiDataResponse.getShorteningOptions())
                    .isNotNull();
            WhatsAppShorteningOptionsApiData whatsAppShorteningOptionsApiData =
                    whatsAppDefaultTemplateStructureApiDataResponse.getShorteningOptions();
            then(whatsAppShorteningOptionsApiData.getCustomDomain()).isEqualTo("my-domain");
            then(whatsAppDefaultTemplateStructureApiDataResponse.getType())
                    .isEqualTo(WhatsAppDefaultTemplateStructureApiData.TypeEnum.MEDIA);
            then(whatsappTemplateApiResponse.getQuality()).isEqualTo(WhatsAppTemplateApiResponse.QualityEnum.LOW);
            then(whatsappTemplateApiResponse.getCreatedAt()).isEqualTo(expectedDateTime);
            then(whatsappTemplateApiResponse.getLastUpdatedAt()).isEqualTo(expectedDateTime);
        };
        var call = whatsAppApi.createWhatsAppTemplate(sender, whatsAppDefaultMarketingTemplatePublicApiRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldTemplateWithMultiProductButtonCreateWhatsAppTemplate() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"name\": \"media_template_with_multi_product_button\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"header\": {\n"
                + "      \"example\": \"https://www.example.com/image.png\",\n"
                + "      \"format\": \"IMAGE\"\n"
                + "    },\n"
                + "    \"body\": {\n"
                + "      \"text\": \"body {{1}} content\",\n"
                + "      \"examples\": [\n"
                + "        \"example\"\n"
                + "      ]\n"
                + "    },\n"
                + "    \"buttons\": [\n"
                + "      {\n"
                + "        \"type\": \"MULTI_PRODUCT\"\n"
                + "      }\n"
                + "    ]\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"id\": \"111\",\n"
                + "  \"businessAccountId\": 222,\n"
                + "  \"name\": \"media_template_with_multi_product_button\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"status\": \"APPROVED\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"header\": {\n"
                + "      \"format\": \"IMAGE\"\n"
                + "    },\n"
                + "    \"body\": {\n"
                + "      \"text\": \"example {{1}} body\"\n"
                + "    },\n"
                + "    \"buttons\": [\n"
                + "      {\n"
                + "        \"type\": \"MULTI_PRODUCT\",\n"
                + "        \"text\": \"View items\"\n"
                + "      }\n"
                + "    ],\n"
                + "    \"shorteningOptions\": {\n"
                + "      \"customDomain\": \"example.com\"\n"
                + "    },\n"
                + "    \"type\": \"MEDIA\"\n"
                + "  },\n"
                + "  \"quality\": \"LOW\",\n"
                + "  \"createdAt\": \"2024-01-01T00:00:00.000+0000\",\n"
                + "  \"lastUpdatedAt\": \"2024-01-01T00:00:00.000+0000\"\n"
                + "}";
        WhatsAppImageHeaderApiData whatsAppImageHeaderApiData =
                new WhatsAppImageHeaderApiData().example("https://www.example.com/image.png");
        WhatsAppBodyApiData whatsAppBodyApiData =
                new WhatsAppBodyApiData().text("body {{1}} content").addExamplesItem("example");
        WhatsAppMultiProductButtonApiData whatsAppMultiProductButtonApiData = new WhatsAppMultiProductButtonApiData();
        List<WhatsAppButtonApiData> whatsAppButtonApiDataList = List.of(whatsAppMultiProductButtonApiData);
        WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiData =
                new WhatsAppDefaultTemplateStructureApiData()
                        .header(whatsAppImageHeaderApiData)
                        .body(whatsAppBodyApiData)
                        .buttons(whatsAppButtonApiDataList);
        WhatsAppTemplatePublicApiRequest whatsAppTemplatePublicApiRequest =
                new WhatsAppDefaultMarketingTemplatePublicApiRequest()
                        .name("media_template_with_multi_product_button")
                        .language(WhatsAppLanguage.EN)
                        .structure(whatsAppDefaultTemplateStructureApiData);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
        setUpSuccessPostRequest("/whatsapp/2/senders/sender/templates", givenRequest, givenResponse);
        Consumer<WhatsAppTemplateApiResponse> assertions = (whatsAppTemplateApiResponse) -> {
            then(whatsAppTemplateApiResponse).isNotNull();
            then(whatsAppTemplateApiResponse.getId()).isEqualTo("111");
            then(whatsAppTemplateApiResponse.getBusinessAccountId()).isEqualTo(222L);
            then(whatsAppTemplateApiResponse.getName()).isEqualTo("media_template_with_multi_product_button");
            then(whatsAppTemplateApiResponse.getLanguage()).isEqualTo(WhatsAppLanguage.EN);
            then(whatsAppTemplateApiResponse.getStatus()).isEqualTo(WhatsAppStatus.APPROVED);
            then(whatsAppTemplateApiResponse.getCategory()).isEqualTo(WhatsAppCategory.MARKETING);
            WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiDataResponse =
                    whatsAppTemplateApiResponse.getStructure();
            then(whatsAppDefaultTemplateStructureApiDataResponse).isNotNull();
            WhatsAppHeaderApiData whatsAppHeaderApiData = whatsAppDefaultTemplateStructureApiDataResponse.getHeader();
            then(whatsAppHeaderApiData).isNotNull();
            then(whatsAppHeaderApiData.getFormat()).isEqualTo(WhatsAppHeaderApiData.FormatEnum.IMAGE);
            WhatsAppBodyApiData whatsAppBodyApiDataResponse = whatsAppDefaultTemplateStructureApiDataResponse.getBody();
            then(whatsAppBodyApiDataResponse).isNotNull();
            then(whatsAppBodyApiDataResponse.getText()).isEqualTo("example {{1}} body");
            List<WhatsAppButtonApiData> whatsAppButtonApiDataListResponse =
                    whatsAppDefaultTemplateStructureApiDataResponse.getButtons();
            then(whatsAppButtonApiDataListResponse).isNotNull();
            then(whatsAppButtonApiDataListResponse).hasSize(1);
            WhatsAppMultiProductButtonApiData whatsAppMultiProductButtonApiDataResponse =
                    (WhatsAppMultiProductButtonApiData) whatsAppButtonApiDataListResponse.get(0);
            then(whatsAppMultiProductButtonApiDataResponse).isNotNull();
            then(whatsAppMultiProductButtonApiDataResponse.getType().getValue()).isEqualTo("MULTI_PRODUCT");
            then(whatsAppMultiProductButtonApiDataResponse.getText()).isEqualTo("View items");
            WhatsAppShorteningOptionsApiData whatsAppShorteningOptionsApiData =
                    whatsAppDefaultTemplateStructureApiDataResponse.getShorteningOptions();
            then(whatsAppShorteningOptionsApiData).isNotNull();
            then(whatsAppShorteningOptionsApiData.getCustomDomain()).isEqualTo("example.com");
            then(whatsAppDefaultTemplateStructureApiDataResponse.getType())
                    .isEqualTo(WhatsAppDefaultTemplateStructureApiData.TypeEnum.MEDIA);
            then(whatsAppTemplateApiResponse.getQuality()).isEqualTo(WhatsAppTemplateApiResponse.QualityEnum.LOW);
            then(whatsAppTemplateApiResponse.getCreatedAt()).isEqualTo(offsetDateTime);
            then(whatsAppTemplateApiResponse.getLastUpdatedAt()).isEqualTo(offsetDateTime);
        };
        var call = whatsAppApi.createWhatsAppTemplate("sender", whatsAppTemplatePublicApiRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCreateTemplateWithQuickReplyButtonsCreateWhatsAppTemplate() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String sender = "InfoSMS";
        String givenRequest = "{\n" + "  \"name\": \"media_template_with_quick_reply_buttons\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"body {{1}} content\",\n"
                + "      \"examples\": [\n"
                + "        \"example\"\n"
                + "      ]\n"
                + "    },\n"
                + "    \"buttons\": [\n"
                + "      {\n"
                + "        \"type\": \"QUICK_REPLY\",\n"
                + "        \"text\": \"quick reply 1\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"type\": \"QUICK_REPLY\",\n"
                + "        \"text\": \"quick reply 2\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"type\": \"QUICK_REPLY\",\n"
                + "        \"text\": \"quick reply 3\"\n"
                + "      }\n"
                + "    ]\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"id\": \"111\",\n"
                + "  \"businessAccountId\": 222,\n"
                + "  \"name\": \"media_template_with_buttons\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"status\": \"APPROVED\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"header\": {\n"
                + "      \"format\": \"IMAGE\"\n"
                + "    },\n                "
                + "    \"body\": {\n"
                + "      \"text\": \"example {{1}} body\"\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"exampleFooter\"\n"
                + "    },\n"
                + "    \"buttons\": [\n"
                + "      {\n"
                + "        \"type\": \"PHONE_NUMBER\",\n"
                + "        \"text\": \"Dial 911\",\n"
                + "        \"phoneNumber\": \"911\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"type\": \"URL\",\n"
                + "        \"text\": \"Visit our website\",\n"
                + "        \"url\": \"https://www.infobip.com\"\n"
                + "      }\n"
                + "    ],\n"
                + "    \"type\": \"MEDIA\"\n"
                + "  },\n"
                + "  \"quality\": \"LOW\",\n"
                + "  \"createdAt\": \"2024-01-01T00:00:00.000+0000\",\n"
                + "  \"lastUpdatedAt\": \"2024-01-01T00:00:00.000+0000\"\n"
                + "}";
        WhatsAppQuickReplyButtonApiData whatsAppQuickReplyButtonApiData1 =
                new WhatsAppQuickReplyButtonApiData().text("quick reply 1");
        WhatsAppQuickReplyButtonApiData whatsAppQuickReplyButtonApiData2 =
                new WhatsAppQuickReplyButtonApiData().text("quick reply 2");
        WhatsAppQuickReplyButtonApiData whatsAppQuickReplyButtonApiData3 =
                new WhatsAppQuickReplyButtonApiData().text("quick reply 3");
        List<WhatsAppButtonApiData> whatsAppButtonApiDataList = List.of(
                whatsAppQuickReplyButtonApiData1, whatsAppQuickReplyButtonApiData2, whatsAppQuickReplyButtonApiData3);
        WhatsAppBodyApiData whatsAppBodyApiData =
                new WhatsAppBodyApiData().text("body {{1}} content").addExamplesItem("example");
        WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiData =
                new WhatsAppDefaultTemplateStructureApiData()
                        .body(whatsAppBodyApiData)
                        .buttons(whatsAppButtonApiDataList);
        WhatsAppTemplatePublicApiRequest whatsAppDefaultMarketingTemplatePublicApiRequest =
                new WhatsAppDefaultMarketingTemplatePublicApiRequest()
                        .name("media_template_with_quick_reply_buttons")
                        .language(WhatsAppLanguage.EN)
                        .structure(whatsAppDefaultTemplateStructureApiData);
        OffsetDateTime expectedCreatedAt = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
        OffsetDateTime expectedLastUpdatedAt = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
        setUpSuccessPostRequest("/whatsapp/2/senders/" + sender + "/templates", givenRequest, givenResponse);
        Consumer<WhatsAppTemplateApiResponse> assertions = (whatsAppTemplateApiResponse) -> {
            then(whatsAppTemplateApiResponse).isNotNull();
            then(whatsAppTemplateApiResponse.getId()).isEqualTo("111");
            then(whatsAppTemplateApiResponse.getBusinessAccountId()).isEqualTo(222L);
            then(whatsAppTemplateApiResponse.getName()).isEqualTo("media_template_with_buttons");
            then(whatsAppTemplateApiResponse.getLanguage()).isEqualTo(WhatsAppLanguage.EN);
            then(whatsAppTemplateApiResponse.getStatus()).isEqualTo(WhatsAppStatus.APPROVED);
            then(whatsAppTemplateApiResponse.getCategory()).isEqualTo(WhatsAppCategory.MARKETING);
            then(whatsAppTemplateApiResponse.getStructure()).isNotNull();
            WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiDataResponse =
                    (WhatsAppDefaultTemplateStructureApiData) whatsAppTemplateApiResponse.getStructure();
            then(whatsAppDefaultTemplateStructureApiDataResponse.getType())
                    .isEqualTo(WhatsAppDefaultTemplateStructureApiData.TypeEnum.MEDIA);
            then(whatsAppDefaultTemplateStructureApiDataResponse.getHeader()).isNotNull();
            WhatsAppHeaderApiData whatsAppHeaderApiData = whatsAppDefaultTemplateStructureApiDataResponse.getHeader();
            then(whatsAppHeaderApiData.getFormat()).isEqualTo(WhatsAppHeaderApiData.FormatEnum.IMAGE);
            then(whatsAppDefaultTemplateStructureApiDataResponse.getBody()).isNotNull();
            WhatsAppBodyApiData whatsAppBodyApiDataResponse = whatsAppDefaultTemplateStructureApiDataResponse.getBody();
            then(whatsAppBodyApiDataResponse.getText()).isEqualTo("example {{1}} body");
            then(whatsAppDefaultTemplateStructureApiDataResponse.getFooter()).isNotNull();
            WhatsAppFooterApiData whatsAppFooterApiDataResponse =
                    whatsAppDefaultTemplateStructureApiDataResponse.getFooter();
            then(whatsAppFooterApiDataResponse.getText()).isEqualTo("exampleFooter");
            then(whatsAppDefaultTemplateStructureApiDataResponse.getButtons()).isNotNull();
            List<WhatsAppButtonApiData> whatsAppButtonApiDataListResponse =
                    whatsAppDefaultTemplateStructureApiDataResponse.getButtons();
            then(whatsAppButtonApiDataListResponse).hasSize(2);
            WhatsAppPhoneNumberButtonApiData whatsAppPhoneNumberButtonApiDataResponse =
                    (WhatsAppPhoneNumberButtonApiData) whatsAppButtonApiDataListResponse.get(0);
            then(whatsAppPhoneNumberButtonApiDataResponse).isNotNull();
            then(whatsAppPhoneNumberButtonApiDataResponse.getType())
                    .isEqualTo(WhatsAppButtonApiData.TypeEnum.PHONE_NUMBER);
            then(whatsAppPhoneNumberButtonApiDataResponse.getText()).isEqualTo("Dial 911");
            then(whatsAppPhoneNumberButtonApiDataResponse.getPhoneNumber()).isEqualTo("911");
            WhatsAppUrlButtonApiData whatsAppUrlButtonApiDataResponse =
                    (WhatsAppUrlButtonApiData) whatsAppButtonApiDataListResponse.get(1);
            then(whatsAppUrlButtonApiDataResponse).isNotNull();
            then(whatsAppUrlButtonApiDataResponse.getType()).isEqualTo(WhatsAppButtonApiData.TypeEnum.URL);
            then(whatsAppUrlButtonApiDataResponse.getText()).isEqualTo("Visit our website");
            then(whatsAppUrlButtonApiDataResponse.getUrl()).isEqualTo("https://www.infobip.com");
            then(whatsAppTemplateApiResponse.getQuality()).isEqualTo(WhatsAppTemplateApiResponse.QualityEnum.LOW);
            then(whatsAppTemplateApiResponse.getCreatedAt()).isEqualTo(expectedCreatedAt);
            then(whatsAppTemplateApiResponse.getLastUpdatedAt()).isEqualTo(expectedLastUpdatedAt);
        };
        var call = whatsAppApi.createWhatsAppTemplate(sender, whatsAppDefaultMarketingTemplatePublicApiRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldTemplateWithVoiceCallButtonCreateWhatsAppTemplate() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"name\": \"media_template_with_order_details_button\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"body {{1}} content\",\n"
                + "      \"examples\": [\n"
                + "        \"example\"\n"
                + "      ]\n"
                + "    },\n"
                + "    \"buttons\": [\n"
                + "      {\n"
                + "        \"type\": \"VOICE_CALL\",\n"
                + "        \"text\": \"Call Now\"\n"
                + "      }\n"
                + "    ]\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"id\": \"111\",\n"
                + "  \"businessAccountId\": 222,\n"
                + "  \"name\": \"media_template_with_voice_call\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"status\": \"APPROVED\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"header\": {\n"
                + "      \"format\": \"IMAGE\"\n"
                + "    },\n"
                + "    \"body\": {\n"
                + "      \"text\": \"example {{1}} body\"\n"
                + "    },\n"
                + "    \"buttons\": [\n"
                + "      {\n"
                + "        \"type\": \"VOICE_CALL\",\n"
                + "        \"text\": \"Call Now\"\n"
                + "      }\n"
                + "    ],\n"
                + "    \"type\": \"MEDIA\"\n"
                + "  },\n"
                + "  \"quality\": \"LOW\",\n"
                + "  \"createdAt\": \"2024-01-01T00:00:00.000+0000\",\n"
                + "  \"lastUpdatedAt\": \"2024-01-01T00:00:00.000+0000\"\n"
                + "}";
        WhatsAppVoiceCallButtonApiData whatsAppVoiceCallButtonApiData =
                new WhatsAppVoiceCallButtonApiData().text("Call Now");
        List<WhatsAppButtonApiData> whatsAppButtonApiDataList = List.of(whatsAppVoiceCallButtonApiData);
        WhatsAppBodyApiData whatsAppBodyApiData =
                new WhatsAppBodyApiData().text("body {{1}} content").addExamplesItem("example");
        WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiData =
                new WhatsAppDefaultTemplateStructureApiData()
                        .body(whatsAppBodyApiData)
                        .buttons(whatsAppButtonApiDataList);
        WhatsAppTemplatePublicApiRequest whatsAppDefaultMarketingTemplatePublicApiRequest =
                new WhatsAppDefaultMarketingTemplatePublicApiRequest()
                        .name("media_template_with_order_details_button")
                        .language(WhatsAppLanguage.EN)
                        .structure(whatsAppDefaultTemplateStructureApiData);
        OffsetDateTime expectedCreatedAt = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
        OffsetDateTime expectedLastUpdatedAt = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
        setUpSuccessPostRequest("/whatsapp/2/senders/sender/templates", givenRequest, givenResponse);
        Consumer<WhatsAppTemplateApiResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo("111");
            then(response.getBusinessAccountId()).isEqualTo(222);
            then(response.getName()).isEqualTo("media_template_with_voice_call");
            then(response.getLanguage()).isEqualTo(WhatsAppLanguage.EN);
            then(response.getStatus()).isEqualTo(WhatsAppStatus.APPROVED);
            then(response.getCategory()).isEqualTo(WhatsAppCategory.MARKETING);
            WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiDataResponse =
                    response.getStructure();
            then(whatsAppDefaultTemplateStructureApiDataResponse).isNotNull();
            var whatsAppTemplateHeaderContent = whatsAppDefaultTemplateStructureApiDataResponse.getHeader();
            then(whatsAppTemplateHeaderContent).isNotNull();
            then(whatsAppTemplateHeaderContent.getFormat()).isEqualTo(WhatsAppHeaderApiData.FormatEnum.IMAGE);
            var whatsAppTemplateBodyContent = whatsAppDefaultTemplateStructureApiDataResponse.getBody();
            then(whatsAppTemplateBodyContent).isNotNull();
            then(whatsAppTemplateBodyContent.getText()).isEqualTo("example {{1}} body");
            then(whatsAppDefaultTemplateStructureApiDataResponse.getButtons()).isNotNull();
            List<WhatsAppButtonApiData> whatsAppTemplateButtonContentList =
                    whatsAppDefaultTemplateStructureApiDataResponse.getButtons();
            then(whatsAppTemplateButtonContentList).hasSize(1);
            WhatsAppVoiceCallButtonApiData whatsAppTemplateButtonContent =
                    (WhatsAppVoiceCallButtonApiData) whatsAppTemplateButtonContentList.get(0);
            then(whatsAppTemplateButtonContent.getType().getValue()).isEqualTo("VOICE_CALL");
            then(whatsAppTemplateButtonContent.getText()).isEqualTo("Call Now");
            then(whatsAppDefaultTemplateStructureApiDataResponse.getType())
                    .isEqualTo(WhatsAppDefaultTemplateStructureApiData.TypeEnum.valueOf("MEDIA"));
            then(response.getQuality()).isEqualTo(WhatsAppTemplateApiResponse.QualityEnum.LOW);
            then(response.getCreatedAt()).isEqualTo(expectedCreatedAt);
            then(response.getLastUpdatedAt()).isEqualTo(expectedLastUpdatedAt);
        };
        var call = whatsAppApi.createWhatsAppTemplate("sender", whatsAppDefaultMarketingTemplatePublicApiRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetMediaTemplateGetWhatsappTemplate() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenResponse = "{\n" + "  \"id\": \"111\",\n"
                + "  \"businessAccountId\": 222,\n"
                + "  \"name\": \"media_template\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"status\": \"APPROVED\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"header\": {\n"
                + "      \"format\": \"IMAGE\"\n"
                + "    },\n"
                + "    \"body\": {\n"
                + "      \"text\": \"example {{1}} body\"\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"exampleFooter\"\n"
                + "    },\n"
                + "    \"type\": \"MEDIA\"\n"
                + "  },\n"
                + "  \"quality\": \"HIGH\",\n"
                + "  \"platform\": {\n"
                + "    \"entityId\": \"entityId\",\n"
                + "    \"applicationId\": \"applicationId\"\n"
                + "  },\n"
                + "  \"createdAt\": \"2024-01-01T00:00:00.000+0000\",\n"
                + "  \"lastUpdatedAt\": \"2024-01-01T00:00:00.000+0000\"\n"
                + "}";
        OffsetDateTime expectedCreatedAt = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
        OffsetDateTime expectedLastUpdatedAt = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
        setUpSuccessGetRequest("/whatsapp/2/senders/senderId/templates/111", Map.of(), givenResponse);
        Consumer<WhatsAppTemplateApiResponse> assertions = (whatsAppTemplateApiResponse) -> {
            then(whatsAppTemplateApiResponse).isNotNull();
            then(whatsAppTemplateApiResponse.getId()).isEqualTo("111");
            then(whatsAppTemplateApiResponse.getBusinessAccountId()).isEqualTo(222L);
            then(whatsAppTemplateApiResponse.getName()).isEqualTo("media_template");
            then(whatsAppTemplateApiResponse.getLanguage()).isEqualTo(WhatsAppLanguage.EN);
            then(whatsAppTemplateApiResponse.getStatus()).isEqualTo(WhatsAppStatus.APPROVED);
            then(whatsAppTemplateApiResponse.getCategory()).isEqualTo(WhatsAppCategory.MARKETING);
            WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiData =
                    whatsAppTemplateApiResponse.getStructure();
            then(whatsAppDefaultTemplateStructureApiData).isNotNull();
            WhatsAppHeaderApiData whatsAppHeaderApiData = whatsAppDefaultTemplateStructureApiData.getHeader();
            then(whatsAppHeaderApiData).isNotNull();
            then(whatsAppHeaderApiData.getFormat()).isEqualTo(WhatsAppHeaderApiData.FormatEnum.IMAGE);
            WhatsAppBodyApiData whatsAppBodyApiData = whatsAppDefaultTemplateStructureApiData.getBody();
            then(whatsAppBodyApiData).isNotNull();
            then(whatsAppBodyApiData.getText()).isEqualTo("example {{1}} body");
            WhatsAppFooterApiData whatsAppFooterApiData = whatsAppDefaultTemplateStructureApiData.getFooter();
            then(whatsAppFooterApiData).isNotNull();
            then(whatsAppFooterApiData.getText()).isEqualTo("exampleFooter");
            then(whatsAppDefaultTemplateStructureApiData.getType().toString()).isEqualTo("MEDIA");
            then(whatsAppTemplateApiResponse.getQuality()).isEqualTo(WhatsAppTemplateApiResponse.QualityEnum.HIGH);
            Platform platform = whatsAppTemplateApiResponse.getPlatform();
            then(platform).isNotNull();
            then(platform.getEntityId()).isEqualTo("entityId");
            then(platform.getApplicationId()).isEqualTo("applicationId");
            then(whatsAppTemplateApiResponse.getCreatedAt()).isEqualTo(expectedCreatedAt);
            then(whatsAppTemplateApiResponse.getLastUpdatedAt()).isEqualTo(expectedLastUpdatedAt);
        };
        var call = whatsAppApi.getWhatsappTemplate("senderId", "111");
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldEditCallPermissionRequestTemplateStructureEditWhatsappTemplate() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"body {{1}} content\",\n"
                + "      \"examples\": [\n"
                + "        \"example\"\n"
                + "      ]\n"
                + "    }\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"id\": \"111\",\n"
                + "  \"businessAccountId\": 222,\n"
                + "  \"name\": \"media_template\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"status\": \"APPROVED\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"header\": {\n"
                + "      \"format\": \"IMAGE\"\n"
                + "    },\n"
                + "    \"body\": {\n"
                + "      \"text\": \"example {{1}} body\"\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"exampleFooter\"\n"
                + "    },\n"
                + "    \"type\": \"MEDIA\"\n"
                + "  },\n"
                + "  \"quality\": \"HIGH\",\n"
                + "  \"platform\": {\n"
                + "    \"entityId\": \"entityId\",\n"
                + "    \"applicationId\": \"applicationId\"\n"
                + "  },\n"
                + "  \"createdAt\": \"2024-01-01T00:00:00.000+0000\",\n"
                + "  \"lastUpdatedAt\": \"2024-01-01T00:00:00.000+0000\"\n"
                + "}";
        WhatsAppBodyApiData whatsAppBodyApiData =
                new WhatsAppBodyApiData().text("body {{1}} content").addExamplesItem("example");
        WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiData =
                new WhatsAppDefaultTemplateStructureApiData().body(whatsAppBodyApiData);
        WhatsAppTemplateEditPublicApiRequest whatsAppTemplateEditPublicApiRequest =
                new WhatsAppTemplateEditPublicApiRequest()
                        .category(WhatsAppCategory.MARKETING)
                        .structure(whatsAppDefaultTemplateStructureApiData);
        Map<String, String> expectedParameters = Map.of();
        OffsetDateTime expectedCreatedAt = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
        setUpPatchRequest(
                "/whatsapp/2/senders/senderName/templates/111", expectedParameters, givenRequest, givenResponse, 200);
        Consumer<WhatsAppTemplateApiResponse> assertions = (whatsAppTemplateApiResponse) -> {
            then(whatsAppTemplateApiResponse).isNotNull();
            then(whatsAppTemplateApiResponse.getId()).isEqualTo("111");
            then(whatsAppTemplateApiResponse.getBusinessAccountId()).isEqualTo(222L);
            then(whatsAppTemplateApiResponse.getName()).isEqualTo("media_template");
            then(whatsAppTemplateApiResponse.getLanguage()).isEqualTo(WhatsAppLanguage.EN);
            then(whatsAppTemplateApiResponse.getStatus()).isEqualTo(WhatsAppStatus.APPROVED);
            then(whatsAppTemplateApiResponse.getCategory()).isEqualTo(WhatsAppCategory.MARKETING);
            WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiDataResponse =
                    (WhatsAppDefaultTemplateStructureApiData) whatsAppTemplateApiResponse.getStructure();
            then(whatsAppDefaultTemplateStructureApiDataResponse).isNotNull();
            then(whatsAppDefaultTemplateStructureApiDataResponse.getHeader()).isNotNull();
            WhatsAppHeaderApiData whatsAppHeaderApiData = whatsAppDefaultTemplateStructureApiDataResponse.getHeader();
            then(whatsAppHeaderApiData.getFormat()).isEqualTo(WhatsAppHeaderApiData.FormatEnum.IMAGE);
            then(whatsAppDefaultTemplateStructureApiDataResponse.getBody()).isNotNull();
            WhatsAppBodyApiData whatsAppBodyApiDataResponse = whatsAppDefaultTemplateStructureApiDataResponse.getBody();
            then(whatsAppBodyApiDataResponse.getText()).isEqualTo("example {{1}} body");
            then(whatsAppDefaultTemplateStructureApiDataResponse.getFooter()).isNotNull();
            WhatsAppFooterApiData whatsAppFooterApiData = whatsAppDefaultTemplateStructureApiDataResponse.getFooter();
            then(whatsAppFooterApiData.getText()).isEqualTo("exampleFooter");
            then(String.valueOf(whatsAppDefaultTemplateStructureApiDataResponse.getType()))
                    .isEqualTo("MEDIA");
            then(whatsAppTemplateApiResponse.getQuality()).isEqualTo(WhatsAppTemplateApiResponse.QualityEnum.HIGH);
            then(whatsAppTemplateApiResponse.getPlatform()).isNotNull();
            Platform platform = whatsAppTemplateApiResponse.getPlatform();
            then(platform).isNotNull();
            then(platform.getEntityId()).isEqualTo("entityId");
            then(platform.getApplicationId()).isEqualTo("applicationId");
            then(whatsAppTemplateApiResponse.getCreatedAt()).isEqualTo(expectedCreatedAt);
            then(whatsAppTemplateApiResponse.getLastUpdatedAt()).isEqualTo(expectedCreatedAt);
        };
        var call = whatsAppApi.editWhatsappTemplate("senderName", "111", whatsAppTemplateEditPublicApiRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldEditLimitedTimeOfferTemplateStructureEditWhatsappTemplate() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"body\": {\n"
                + "      \"text\": \"body {{1}} content\",\n"
                + "      \"examples\": [\n"
                + "        \"example\"\n"
                + "      ]\n"
                + "    },\n"
                + "    \"buttons\": [\n"
                + "      {\n"
                + "        \"type\": \"COPY_CODE\",\n"
                + "        \"example\": \"Copy code\"\n"
                + "      },\n"
                + "      {\n"
                + "        \"type\": \"URL\",\n"
                + "        \"text\": \"visit website\",\n"
                + "        \"url\": \"https://www.infobip.com/{{1}}\",\n"
                + "        \"example\": \"https://www.infobip.com/docs\"\n"
                + "      }\n"
                + "    ],\n"
                + "    \"limitedTimeOffer\": {\n"
                + "      \"hasExpiration\": true,\n"
                + "      \"text\": \"Example offer\"\n"
                + "    },\n"
                + "    \"type\": \"MEDIA\"\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"id\": \"111\",\n"
                + "  \"businessAccountId\": 222,\n"
                + "  \"name\": \"media_template_with_copy_code\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"status\": \"APPROVED\",\n                "
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"header\": {\n"
                + "      \"format\": \"IMAGE\"\n"
                + "    },\n"
                + "    \"body\": {\n"
                + "      \"text\": \"example {{1}} body\"\n"
                + "    },\n"
                + "    \"buttons\": [\n"
                + "      {\n"
                + "        \"type\": \"COPY_CODE\",\n"
                + "        \"text\": \"Copy offer code\",\n"
                + "        \"example\": \"exampleCopyCode\"\n"
                + "      }\n"
                + "    ],\n"
                + "    \"shorteningOptions\": {\n"
                + "      \"customDomain\": \"my-domain\"\n"
                + "    },\n"
                + "    \"type\": \"MEDIA\"\n"
                + "  },\n"
                + "  \"quality\": \"LOW\",\n"
                + "  \"createdAt\": \"2024-01-01T00:00:00.000+0000\",\n"
                + "  \"lastUpdatedAt\": \"2024-01-01T00:00:00.000+0000\"\n"
                + "}";
        WhatsAppBodyApiData whatsAppBodyApiDataReq =
                new WhatsAppBodyApiData().text("body {{1}} content").addExamplesItem("example");
        WhatsAppCopyCodeDefaultButtonApiData whatsAppCopyCodeDefaultButtonApiDataReq =
                new WhatsAppCopyCodeDefaultButtonApiData().example("Copy code");
        WhatsAppUrlButtonApiData whatsAppUrlButtonApiDataReq = new WhatsAppUrlButtonApiData()
                .text("visit website")
                .url("https://www.infobip.com/{{1}}")
                .example("https://www.infobip.com/docs");
        List<WhatsAppButtonApiData> whatsappButtonApiDataListReq =
                List.of(whatsAppCopyCodeDefaultButtonApiDataReq, whatsAppUrlButtonApiDataReq);
        WhatsAppLimitedTimeOfferApiData whatsAppLimitedTimeOfferApiDataReq =
                new WhatsAppLimitedTimeOfferApiData().hasExpiration(true).text("Example offer");
        WhatsAppDefaultTemplateStructureApiData whatsappDefaultTemplateStructureApiDataReq =
                new WhatsAppDefaultTemplateStructureApiData()
                        .body(whatsAppBodyApiDataReq)
                        .buttons(whatsappButtonApiDataListReq)
                        .limitedTimeOffer(whatsAppLimitedTimeOfferApiDataReq)
                        .type(WhatsAppDefaultTemplateStructureApiData.TypeEnum.MEDIA);
        WhatsAppTemplateEditPublicApiRequest whatsappTemplateEditPublicApiRequest =
                new WhatsAppTemplateEditPublicApiRequest()
                        .category(WhatsAppCategory.MARKETING)
                        .structure(whatsappDefaultTemplateStructureApiDataReq);
        String sender = "sender";
        String id = "111";
        setUpPatchRequest("/whatsapp/2/senders/sender/templates/111", Map.of(), givenRequest, givenResponse, 200);
        Consumer<WhatsAppTemplateApiResponse> assertions = (whatsAppTemplateApiResponse) -> {
            then(whatsAppTemplateApiResponse).isNotNull();
            then(whatsAppTemplateApiResponse.getId()).isEqualTo("111");
            then(whatsAppTemplateApiResponse.getBusinessAccountId()).isEqualTo(222L);
            then(whatsAppTemplateApiResponse.getName()).isEqualTo("media_template_with_copy_code");
            then(whatsAppTemplateApiResponse.getLanguage()).isEqualTo(WhatsAppLanguage.EN);
            then(whatsAppTemplateApiResponse.getStatus()).isEqualTo(WhatsAppStatus.APPROVED);
            then(whatsAppTemplateApiResponse.getCategory()).isEqualTo(WhatsAppCategory.MARKETING);
            then(whatsAppTemplateApiResponse.getStructure()).isNotNull();
            WhatsAppDefaultTemplateStructureApiData whatsappDefaultTemplateStructureApiData =
                    whatsAppTemplateApiResponse.getStructure();
            then(whatsappDefaultTemplateStructureApiData.getHeader()).isNotNull();
            WhatsAppImageHeaderApiData whatsAppImageHeaderApiData =
                    (WhatsAppImageHeaderApiData) whatsappDefaultTemplateStructureApiData.getHeader();
            then(whatsAppImageHeaderApiData.getFormat()).isEqualTo(WhatsAppHeaderApiData.FormatEnum.IMAGE);
            then(whatsappDefaultTemplateStructureApiData.getBody()).isNotNull();
            WhatsAppBodyApiData whatsAppBodyApiData = whatsappDefaultTemplateStructureApiData.getBody();
            then(whatsAppBodyApiData.getText()).isEqualTo("example {{1}} body");
            then(whatsappDefaultTemplateStructureApiData.getButtons()).isNotNull();
            List<WhatsAppButtonApiData> whatsappButtonApiDataList =
                    whatsappDefaultTemplateStructureApiData.getButtons();
            then(whatsappButtonApiDataList).hasSize(1);
            WhatsAppCopyCodeDefaultButtonApiData whatsAppCopyCodeDefaultButtonApiData =
                    (WhatsAppCopyCodeDefaultButtonApiData) whatsappButtonApiDataList.get(0);
            then(whatsAppCopyCodeDefaultButtonApiData.getType()).isEqualTo(WhatsAppButtonApiData.TypeEnum.COPY_CODE);
            then(whatsAppCopyCodeDefaultButtonApiData.getText()).isEqualTo("Copy offer code");
            then(whatsAppCopyCodeDefaultButtonApiData.getExample()).isEqualTo("exampleCopyCode");
            then(whatsappDefaultTemplateStructureApiData.getShorteningOptions()).isNotNull();
            WhatsAppShorteningOptionsApiData whatsAppShorteningOptionsApiData =
                    whatsappDefaultTemplateStructureApiData.getShorteningOptions();
            then(whatsAppShorteningOptionsApiData.getCustomDomain()).isEqualTo("my-domain");
            then(whatsappDefaultTemplateStructureApiData.getType())
                    .isEqualTo(WhatsAppDefaultTemplateStructureApiData.TypeEnum.MEDIA);
            then(whatsAppTemplateApiResponse.getQuality()).isEqualTo(WhatsAppTemplateApiResponse.QualityEnum.LOW);
            OffsetDateTime expectedCreatedAt = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
            then(whatsAppTemplateApiResponse.getCreatedAt()).isEqualTo(expectedCreatedAt);
            OffsetDateTime expectedLastUpdatedAt =
                    OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneOffset.UTC);
            then(whatsAppTemplateApiResponse.getLastUpdatedAt()).isEqualTo(expectedLastUpdatedAt);
        };
        var call = whatsAppApi.editWhatsappTemplate(sender, id, whatsappTemplateEditPublicApiRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldEditTemplatePlatformDataEditWhatsappTemplate() {
        WhatsAppApi whatsAppApi = new WhatsAppApi(getApiClient());
        String givenRequest = "{\n" + "  \"platform\": {\n"
                + "    \"entityId\": \"entityId\",\n"
                + "    \"applicationId\": \"applicationId\"\n"
                + "  }\n"
                + "}";
        String givenResponse = "{\n" + "  \"id\": \"111\",\n"
                + "  \"businessAccountId\": 222,\n"
                + "  \"name\": \"media_template\",\n"
                + "  \"language\": \"en\",\n"
                + "  \"status\": \"APPROVED\",\n"
                + "  \"category\": \"MARKETING\",\n"
                + "  \"structure\": {\n"
                + "    \"header\": {\n"
                + "      \"format\": \"IMAGE\"\n"
                + "    },\n"
                + "    \"body\": {\n"
                + "      \"text\": \"example {{1}} body\"\n"
                + "    },\n"
                + "    \"footer\": {\n"
                + "      \"text\": \"exampleFooter\"\n"
                + "    },\n"
                + "    \"type\": \"MEDIA\"\n"
                + "  },\n"
                + "  \"quality\": \"HIGH\",\n"
                + "  \"platform\": {\n"
                + "    \"entityId\": \"entityId\",\n"
                + "    \"applicationId\": \"applicationId\"\n"
                + "  },\n"
                + "  \"createdAt\": \"2024-01-01T00:00:00.000+0000\",\n"
                + "  \"lastUpdatedAt\": \"2024-01-01T00:00:00.000+0000\"\n"
                + "}";
        Platform platform = new Platform().entityId("entityId").applicationId("applicationId");
        WhatsAppTemplateEditPublicApiRequest whatsAppTemplateEditPublicApiRequest =
                new WhatsAppTemplateEditPublicApiRequest().platform(platform);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0, 0, 0), ZoneOffset.UTC);
        setUpPatchRequest("/whatsapp/2/senders/447796344125/templates/111", Map.of(), givenRequest, givenResponse, 200);
        Consumer<WhatsAppTemplateApiResponse> assertions = (whatsAppTemplateApiResponse) -> {
            then(whatsAppTemplateApiResponse).isNotNull();
            then(whatsAppTemplateApiResponse.getId()).isEqualTo("111");
            then(whatsAppTemplateApiResponse.getBusinessAccountId()).isEqualTo(222);
            then(whatsAppTemplateApiResponse.getName()).isEqualTo("media_template");
            then(whatsAppTemplateApiResponse.getLanguage().getValue()).isEqualTo("en");
            then(whatsAppTemplateApiResponse.getStatus()).isEqualTo(WhatsAppStatus.APPROVED);
            then(whatsAppTemplateApiResponse.getCategory()).isEqualTo(WhatsAppCategory.MARKETING);
            WhatsAppDefaultTemplateStructureApiData whatsAppDefaultTemplateStructureApiData =
                    whatsAppTemplateApiResponse.getStructure();
            then(whatsAppDefaultTemplateStructureApiData).isNotNull();
            WhatsAppHeaderApiData whatsAppTemplateHeaderContent = whatsAppDefaultTemplateStructureApiData.getHeader();
            then(whatsAppTemplateHeaderContent).isNotNull();
            then(whatsAppTemplateHeaderContent.getFormat()).isEqualTo(WhatsAppHeaderApiData.FormatEnum.IMAGE);
            WhatsAppBodyApiData whatsAppTemplateBodyContent = whatsAppDefaultTemplateStructureApiData.getBody();
            then(whatsAppTemplateBodyContent).isNotNull();
            then(whatsAppTemplateBodyContent.getText()).isEqualTo("example {{1}} body");
            WhatsAppFooterApiData whatsAppFooterApiData = whatsAppDefaultTemplateStructureApiData.getFooter();
            then(whatsAppFooterApiData).isNotNull();
            then(whatsAppFooterApiData.getText()).isEqualTo("exampleFooter");
            then(whatsAppDefaultTemplateStructureApiData.getType())
                    .isEqualTo(WhatsAppDefaultTemplateStructureApiData.TypeEnum.MEDIA);
            then(whatsAppTemplateApiResponse.getQuality()).isEqualTo(WhatsAppTemplateApiResponse.QualityEnum.HIGH);
            Platform platform2 = whatsAppTemplateApiResponse.getPlatform();
            then(platform2).isNotNull();
            then(platform2.getEntityId()).isEqualTo("entityId");
            then(platform2.getApplicationId()).isEqualTo("applicationId");
            then(whatsAppTemplateApiResponse.getCreatedAt()).isEqualTo(offsetDateTime);
            then(whatsAppTemplateApiResponse.getLastUpdatedAt()).isEqualTo(offsetDateTime);
        };
        var call = whatsAppApi.editWhatsappTemplate("447796344125", "111", whatsAppTemplateEditPublicApiRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }
}
