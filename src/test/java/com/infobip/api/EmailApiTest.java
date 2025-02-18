package com.infobip.api;

import static com.infobip.api.util.ResponseStatuses.*;
import static org.assertj.core.api.BDDAssertions.then;

import com.infobip.JSON;
import com.infobip.model.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

class EmailApiTest extends ApiTest {

    private static final String EMAIL_SEND = "/email/3/send";
    private static final String LOGS = "/email/1/logs";
    private static final String REPORTS = "/email/1/reports";
    private static final String BULKS = "/email/1/bulks";
    private static final String BULKS_STATUS = "/email/1/bulks/status";
    private static final String VALIDATION = "/email/2/validation";
    private static final String DOMAINS = "/email/1/domains";
    private static final String DOMAIN = "/email/1/domains/{domainName}";
    private static final String DOMAIN_TRACKING = "/email/1/domains/{domainName}/tracking";
    private static final String DOMAIN_VERIFY = "/email/1/domains/{domainName}/verify";
    private static final String IPS = "/email/1/ips";
    private static final String DOMAIN_IPS = "/email/1/domain-ips";
    private static final String RETURN_PATH = "/email/1/domains/{domainName}/return-path";
    private static final String EMAIL_SUPPRESSION = "/email/1/suppressions";
    private static final String EMAIL_SUPPRESSION_DOMAINS = "/email/1/suppressions/domains";

    @Test
    void shouldAddDomain() {
        String givenDomainName = "example.com";
        EmailAddDomainRequest.DkimKeyLengthEnum givenDkimKeyLength =
                EmailAddDomainRequest.DkimKeyLengthEnum.NUMBER_1024;

        Long givenDomainId = 1L;
        Boolean givenActive = false;
        Boolean givenTracking = true;
        String givenDnsRecords = "string";
        Boolean givenVerified = true;
        Boolean givenBlocked = false;
        String givenCreatedAt = "2022-05-05T17:32:28.777+01:00";
        Long givenTargetedDailyTraffic = 15L;
        String givenReturnPathAddress = "pathAddress";

        String givenResponse = String.format(
                "{\n" + "  \"domainId\": %d,\n"
                        + "  \"domainName\": \"%s\",\n"
                        + "  \"active\": %b,\n"
                        + "  \"tracking\": {\n"
                        + "    \"clicks\": %b,\n"
                        + "    \"opens\": %b,\n"
                        + "    \"unsubscribe\": %b\n"
                        + "  },\n"
                        + "  \"dnsRecords\": [\n"
                        + "    {\n"
                        + "      \"recordType\": \"%s\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"expectedValue\": \"%s\",\n"
                        + "      \"verified\": %b\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"blocked\": %b,\n"
                        + "  \"createdAt\": \"%s\",\n"
                        + "  \"returnPathAddress\": \"%s\"\n"
                        + "}\n",
                givenDomainId,
                givenDomainName,
                givenActive,
                givenTracking,
                givenTracking,
                givenTracking,
                givenDnsRecords,
                givenDnsRecords,
                givenDnsRecords,
                givenVerified,
                givenBlocked,
                givenCreatedAt,
                givenReturnPathAddress);

        String expectedRequest = String.format(
                "{\n" + "  \"domainName\": \"%s\",\n"
                        + "  \"dkimKeyLength\": %s,\n"
                        + "  \"targetedDailyTraffic\": %d,\n"
                        + "  \"returnPathAddress\": \"%s\"\n"
                        + "}\n",
                givenDomainName, givenDkimKeyLength, givenTargetedDailyTraffic, givenReturnPathAddress);

        setUpSuccessPostRequest(DOMAINS, Map.of(), expectedRequest, givenResponse);

        EmailApi api = new EmailApi(getApiClient());

        EmailAddDomainRequest request = new EmailAddDomainRequest()
                .domainName(givenDomainName)
                .dkimKeyLength(givenDkimKeyLength)
                .targetedDailyTraffic(givenTargetedDailyTraffic)
                .returnPathAddress(givenReturnPathAddress);

        Consumer<EmailDomainResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getDomainId()).isEqualTo(givenDomainId);
            then(response.getDomainName()).isEqualTo(givenDomainName);
            then(response.getActive()).isEqualTo(givenActive);
            then(response.getTracking()).isNotNull();
            then(response.getTracking().getClicks()).isEqualTo(givenTracking);
            then(response.getTracking().getOpens()).isEqualTo(givenTracking);
            then(response.getTracking().getUnsubscribe()).isEqualTo(givenTracking);
            then(response.getDnsRecords()).isNotNull();
            then(response.getDnsRecords().size()).isEqualTo(1);
            var record = response.getDnsRecords().get(0);
            then(record.getRecordType()).isEqualTo(givenDnsRecords);
            then(record.getName()).isEqualTo(givenDnsRecords);
            then(record.getExpectedValue()).isEqualTo(givenDnsRecords);
            then(record.getVerified()).isEqualTo(givenVerified);
            then(response.getBlocked()).isEqualTo(givenBlocked);
            then(response.getCreatedAt()).isEqualTo(givenCreatedAt);
            then(response.getReturnPathAddress()).isEqualTo(givenReturnPathAddress);
        };

        var call = api.addDomain(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetAllDomains() {
        String givenDomainName = "example.com";
        Integer givenPaging = 0;
        Long givenDomainId = 1L;
        Boolean givenActive = false;
        Boolean givenTracking = true;
        String givenDnsRecords = "string";
        Boolean givenVerified = true;
        Boolean givenBlocked = false;
        String givenCreatedAt = "2022-05-05T17:32:28.777+01:00";

        String givenResponse = String.format(
                "{\n" + "    \"paging\": {\n"
                        + "    \"page\": %d,\n"
                        + "    \"size\": %d,\n"
                        + "    \"totalPages\": %d,\n"
                        + "    \"totalResults\": %d\n"
                        + "    },\n"
                        + "    \"results\": [\n"
                        + "        {\n"
                        + "          \"domainId\": %d,\n"
                        + "          \"domainName\": \"%s\",\n"
                        + "          \"active\": %b,\n"
                        + "          \"tracking\": {\n"
                        + "            \"clicks\": %b,\n"
                        + "            \"opens\": %b,\n"
                        + "            \"unsubscribe\": %b\n"
                        + "          },\n"
                        + "          \"dnsRecords\": [\n"
                        + "            {\n"
                        + "              \"recordType\": \"%s\",\n"
                        + "              \"name\": \"%s\",\n"
                        + "              \"expectedValue\": \"%s\",\n"
                        + "              \"verified\": %b\n"
                        + "            }\n"
                        + "          ],\n"
                        + "          \"blocked\": %b,\n"
                        + "          \"createdAt\": \"%s\"\n"
                        + "        }\n"
                        + "    ]\n"
                        + "}\n",
                givenPaging,
                givenPaging,
                givenPaging,
                givenPaging,
                givenDomainId,
                givenDomainName,
                givenActive,
                givenTracking,
                givenTracking,
                givenTracking,
                givenDnsRecords,
                givenDnsRecords,
                givenDnsRecords,
                givenVerified,
                givenBlocked,
                givenCreatedAt);

        setUpSuccessGetRequest(DOMAINS, Map.of(), givenResponse);

        EmailApi api = new EmailApi(getApiClient());

        Consumer<EmailAllDomainsResponse> assertions = (response) -> {
            then(response).isNotNull();

            then(response.getPaging()).isNotNull();
            then(response.getPaging().getPage()).isEqualTo(givenPaging);
            then(response.getPaging().getSize()).isEqualTo(givenPaging);
            then(response.getPaging().getTotalPages()).isEqualTo(givenPaging);
            then(response.getPaging().getTotalResults()).isEqualTo(givenPaging);

            then(response.getResults()).isNotNull();
            var result = response.getResults().get(0);
            then(result).isNotNull();
            then(result.getDomainId()).isEqualTo(givenDomainId);
            then(result.getDomainName()).isEqualTo(givenDomainName);
            then(result.getActive()).isEqualTo(givenActive);
            then(result.getTracking()).isNotNull();
            then(result.getTracking().getClicks()).isEqualTo(givenTracking);
            then(result.getTracking().getOpens()).isEqualTo(givenTracking);
            then(result.getTracking().getUnsubscribe()).isEqualTo(givenTracking);
            then(result.getDnsRecords()).isNotNull();
            then(result.getDnsRecords().size()).isEqualTo(1);
            var record = result.getDnsRecords().get(0);
            then(record.getRecordType()).isEqualTo(givenDnsRecords);
            then(record.getName()).isEqualTo(givenDnsRecords);
            then(record.getExpectedValue()).isEqualTo(givenDnsRecords);
            then(record.getVerified()).isEqualTo(givenVerified);
            then(result.getBlocked()).isEqualTo(givenBlocked);
            then(result.getCreatedAt()).isEqualTo(givenCreatedAt);
        };

        var call = api.getAllDomains();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetDomainDetails() {
        String givenDomainName = "example.com";
        Long givenDomainId = 1L;
        Boolean givenActive = false;
        Boolean givenTracking = true;
        String givenDnsRecords = "string";
        Boolean givenVerified = true;
        Boolean givenBlocked = false;
        String givenCreatedAt = "2022-05-05T17:32:28.777+01:00";

        String givenResponse = String.format(
                "{\n" + "  \"domainId\": %d,\n"
                        + "  \"domainName\": \"%s\",\n"
                        + "  \"active\": %b,\n"
                        + "  \"tracking\": {\n"
                        + "    \"clicks\": %b,\n"
                        + "    \"opens\": %b,\n"
                        + "    \"unsubscribe\": %b\n"
                        + "  },\n"
                        + "  \"dnsRecords\": [\n"
                        + "    {\n"
                        + "      \"recordType\": \"%s\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"expectedValue\": \"%s\",\n"
                        + "      \"verified\": %b\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"blocked\": %b,\n"
                        + "  \"createdAt\": \"%s\"\n"
                        + "}\n",
                givenDomainId,
                givenDomainName,
                givenActive,
                givenTracking,
                givenTracking,
                givenTracking,
                givenDnsRecords,
                givenDnsRecords,
                givenDnsRecords,
                givenVerified,
                givenBlocked,
                givenCreatedAt);

        setUpSuccessGetRequest(DOMAIN.replace("{domainName}", givenDomainName), Map.of(), givenResponse);

        EmailApi api = new EmailApi(getApiClient());
        Consumer<EmailDomainResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getDomainId()).isEqualTo(givenDomainId);
            then(response.getDomainName()).isEqualTo(givenDomainName);
            then(response.getActive()).isEqualTo(givenActive);
            then(response.getTracking()).isNotNull();
            then(response.getTracking().getClicks()).isEqualTo(givenTracking);
            then(response.getTracking().getOpens()).isEqualTo(givenTracking);
            then(response.getTracking().getUnsubscribe()).isEqualTo(givenTracking);
            then(response.getDnsRecords()).isNotNull();
            then(response.getDnsRecords().size()).isEqualTo(1);
            var record = response.getDnsRecords().get(0);
            then(record.getRecordType()).isEqualTo(givenDnsRecords);
            then(record.getName()).isEqualTo(givenDnsRecords);
            then(record.getExpectedValue()).isEqualTo(givenDnsRecords);
            then(record.getVerified()).isEqualTo(givenVerified);
            then(response.getBlocked()).isEqualTo(givenBlocked);
            then(response.getCreatedAt()).isEqualTo(givenCreatedAt);
        };

        var call = api.getDomainDetails(givenDomainName);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteDomain() {
        String givenDomainName = "example.com";
        int givenStatusCode = 204;

        setUpNoResponseBodyDeleteRequest(DOMAIN.replace("{domainName}", givenDomainName), Map.of(), givenStatusCode);

        EmailApi api = new EmailApi(getApiClient());

        var call = api.deleteDomain(givenDomainName);
        testSuccessfulCallWithNoBody(call::executeAsync, givenStatusCode);
    }

    @Test
    void shouldUpdateTrackingEvents() {
        String givenDomainName = "example.com";
        Long givenDomainId = 1L;
        Boolean givenActive = false;
        Boolean givenTracking = true;
        Boolean givenUnsubscribe = true;
        String givenDnsRecords = "string";
        Boolean givenVerified = true;
        Boolean givenBlocked = false;
        String givenCreatedAt = "2022-05-05T17:32:28.777+01:00";

        String givenResponse = String.format(
                "{\n" + "  \"domainId\": %d,\n"
                        + "  \"domainName\": \"%s\",\n"
                        + "  \"active\": %b,\n"
                        + "  \"tracking\": {\n"
                        + "    \"clicks\": %b,\n"
                        + "    \"opens\": %b,\n"
                        + "    \"unsubscribe\": %b\n"
                        + "  },\n"
                        + "  \"dnsRecords\": [\n"
                        + "    {\n"
                        + "      \"recordType\": \"%s\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"expectedValue\": \"%s\",\n"
                        + "      \"verified\": %b\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"blocked\": %b,\n"
                        + "  \"createdAt\": \"%s\"\n"
                        + "}\n",
                givenDomainId,
                givenDomainName,
                givenActive,
                givenTracking,
                givenTracking,
                givenTracking,
                givenDnsRecords,
                givenDnsRecords,
                givenDnsRecords,
                givenVerified,
                givenBlocked,
                givenCreatedAt);

        String expectedRequest = String.format(
                "{\n" + "  \"open\": %b,\n" + "  \"clicks\": %b,\n" + "  \"unsubscribe\": %b\n" + "}\n",
                givenTracking, givenTracking, givenUnsubscribe);

        setUpSuccessPutRequest(
                DOMAIN_TRACKING.replace("{domainName}", givenDomainName), Map.of(), expectedRequest, givenResponse);

        EmailApi api = new EmailApi(getApiClient());

        EmailTrackingEventRequest request = new EmailTrackingEventRequest()
                .open(givenTracking)
                .clicks(givenTracking)
                .unsubscribe(givenUnsubscribe);

        Consumer<EmailDomainResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getDomainId()).isEqualTo(givenDomainId);
            then(response.getDomainName()).isEqualTo(givenDomainName);
            then(response.getActive()).isEqualTo(givenActive);
            then(response.getTracking()).isNotNull();
            then(response.getTracking().getClicks()).isEqualTo(givenTracking);
            then(response.getTracking().getOpens()).isEqualTo(givenTracking);
            then(response.getTracking().getUnsubscribe()).isEqualTo(givenUnsubscribe);
            then(response.getDnsRecords()).isNotNull();
            then(response.getDnsRecords().size()).isEqualTo(1);
            var record = response.getDnsRecords().get(0);
            then(record.getRecordType()).isEqualTo(givenDnsRecords);
            then(record.getName()).isEqualTo(givenDnsRecords);
            then(record.getExpectedValue()).isEqualTo(givenDnsRecords);
            then(record.getVerified()).isEqualTo(givenVerified);
            then(response.getBlocked()).isEqualTo(givenBlocked);
            then(response.getCreatedAt()).isEqualTo(givenCreatedAt);
        };

        var call = api.updateTrackingEvents(givenDomainName, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldVerifyDomain() {
        String givenDomainName = "example.com";
        int givenStatusCode = 202;

        setUpNoContentPostRequest(DOMAIN_VERIFY.replace("{domainName}", givenDomainName), givenStatusCode);

        EmailApi api = new EmailApi(getApiClient());

        var call = api.verifyDomain(givenDomainName);
        testSuccessfulCallWithNoBody(call::executeAsync, givenStatusCode);
    }

    @Test
    void shouldValidateEmail() {
        String givenTo = "john.smith@abc.com";
        Boolean givenValidSyntax = true;
        String givenDidYouMean = null;

        String expectedRequest = String.format("{\n" + "  \"to\": \"%s\"\n" + "}", givenTo);

        String givenResponse = String.format(
                "{\n" + "  \"to\": \"%s\",\n"
                        + "  \"validMailbox\": true,\n"
                        + "  \"validSyntax\": %b,\n"
                        + "  \"catchAll\": false,\n"
                        + "  \"didYouMean\": %s,\n"
                        + "  \"disposable\": false,\n"
                        + "  \"roleBased\": true\n"
                        + "}",
                givenTo, givenValidSyntax, givenDidYouMean);

        setUpPostRequest(VALIDATION, expectedRequest, givenResponse, 200);

        Consumer<EmailValidationResponse> assertions = response -> {
            then(response).isNotNull();
            then(response.getTo()).isEqualTo(givenTo);
            then(response.getValidSyntax()).isEqualTo(givenValidSyntax);
            then(response.getDidYouMean()).isEqualTo(givenDidYouMean);
        };

        EmailApi validationApi = new EmailApi(getApiClient());

        var call = validationApi.validateEmailAddresses(new EmailValidationRequest().to(givenTo));

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetScheduledEmails() {

        String givenBulkId = "BULK-ID-123-xyz";
        String givenExternalBulkId = "SOME_USER_DEFINE_BULK_123";
        String givenResponse = String.format(
                "{\n" + "  \"externalBulkId\": \"%s\",\n"
                        + "  \"bulks\": [\n"
                        + "    {\n"
                        + "      \"bulkId\": \"%s\",\n"
                        + "      \"sendAt\": \"2021-08-25T16:00:00.000+0000\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenExternalBulkId, givenBulkId);

        Consumer<EmailBulkScheduleResponse> assertions = scheduledEmails -> {
            then(scheduledEmails.getExternalBulkId()).isEqualTo(givenExternalBulkId);
            then(scheduledEmails.getBulks()).hasSize(1);
            then(scheduledEmails.getBulks().get(0).getBulkId()).isEqualTo(givenBulkId);
        };

        setUpGetRequest(BULKS, Map.of("bulkId", givenExternalBulkId), givenResponse, 200);

        EmailApi scheduledEmailApi = new EmailApi(getApiClient());
        var call = scheduledEmailApi.getScheduledEmails(givenExternalBulkId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetScheduledEmailsStatuses() {
        String givenBulkId = "BULK-ID-123-xyz";
        String givenExternalBulkId = "SOME_USER_DEFINE_BULK_123";
        String givenStatus = "PENDING";
        String givenResponse = String.format(
                "{\n" + "  \"externalBulkId\": \"%s\",\n"
                        + "  \"bulks\": [\n"
                        + "    {\n"
                        + "      \"bulkId\": \"%s\",\n"
                        + "      \"status\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenExternalBulkId, givenBulkId, givenStatus);

        Consumer<EmailBulkStatusResponse> assertions = scheduledEmails -> {
            then(scheduledEmails.getExternalBulkId()).isEqualTo(givenExternalBulkId);
            then(scheduledEmails.getBulks()).hasSize(1);
            then(scheduledEmails.getBulks().get(0).getBulkId()).isEqualTo(givenBulkId);
            then(scheduledEmails.getBulks().get(0).getStatus()).isEqualTo(EmailBulkStatus.fromValue(givenStatus));
        };

        setUpGetRequest(BULKS_STATUS, Map.of("bulkId", givenExternalBulkId), givenResponse, 200);

        EmailApi scheduledEmailApi = new EmailApi(getApiClient());
        var call = scheduledEmailApi.getScheduledEmailStatuses(givenExternalBulkId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldRescheduledEmails() {
        String givenBulkId = "BULK-ID-123-xyz";
        String givenSendAt = "2021-06-08T17:42:05.390+0100";
        OffsetDateTime givenSendAtDateTime =
                OffsetDateTime.of(LocalDateTime.of(2021, 6, 8, 17, 42, 5, 390000000), ZoneOffset.ofHours(1));

        String givenRequest = String.format("{\n" + "  \"sendAt\": \"%s\"\n" + "}", givenSendAt);

        String givenResponse = String.format(
                "{\n" + "  \"bulkId\": \"%s\",\n" + "  \"sendAt\": \"%s\"\n" + "}", givenBulkId, givenSendAt);

        setUpPutRequest(BULKS, Map.of("bulkId", givenBulkId), givenRequest, givenResponse, 200);

        Consumer<EmailBulkRescheduleResponse> assertions = emailBulkRescheduleResponse -> {
            then(emailBulkRescheduleResponse.getBulkId()).isEqualTo(givenBulkId);
            then(emailBulkRescheduleResponse.getSendAt()).isEqualTo(givenSendAtDateTime);
        };

        EmailApi scheduledEmailApi = new EmailApi(getApiClient());
        var call = scheduledEmailApi.rescheduleEmails(
                givenBulkId, new EmailBulkRescheduleRequest().sendAt(givenSendAtDateTime));
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateScheduledEmailStatuses() {
        String givenBulkId = "string";
        EmailBulkStatus givenStatus = EmailBulkStatus.PENDING;

        String givenResponse = String.format(
                "{\n" + "  \"bulkId\": \"%s\",\n" + "  \"status\": \"%s\"\n" + "}\n", givenBulkId, givenStatus);
        String expectedRequest = String.format("{\n" + "  \"status\": \"%s\"\n" + "}\n", givenStatus);

        setUpSuccessPutRequest(BULKS_STATUS, Map.of(), expectedRequest, givenResponse);

        EmailApi api = new EmailApi(getApiClient());

        EmailBulkUpdateStatusRequest request = new EmailBulkUpdateStatusRequest().status(givenStatus);

        Consumer<EmailBulkUpdateStatusResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getStatus()).isEqualTo(givenStatus);
        };

        var call = api.updateScheduledEmailStatuses(givenBulkId, request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSendFullyFeaturedEmail() throws IOException {
        String givenTo = "john.smith@somedomain.com";
        String givenAnotherTo = "{\"to\": \"alice.grey@somecompany.com\",\"placeholders\": {\"name\": \"Alice\"}}";
        String anotherToInResponse = "alice.grey@somecompany.com";
        String givenBulkId = "snxemd8u52v7v84iiu69";
        Integer givenGroupId = 1;
        String givenGroupName = "PENDING";
        Integer givenId = 1;
        String givenName = "PENDING_ACCEPTED";
        String givenDescription = "Message accepted, pending for delivery.";

        String givenAttachmentText = "Test file text";
        File tempFile = File.createTempFile("attachment", ".txt");
        Files.writeString(tempFile.toPath(), givenAttachmentText);

        String givenMessageId = "somExternalMessageId0";
        String givenAnotherMessageId = "someExternalMessageId1";

        String givenFrom = "Jane Smith <jane.smith@example.com>";
        String givenReplyTo = "all.replies@example.com";
        String givenSubject = "Mail subject text";
        String givenText = "Mail body text";
        String givenHtml = "<h1>Html body</h1><p>Rich HTML message body.</p>";
        Boolean intermediateReport = true;
        String givenNotifyUrl = "https://www.example.com/email/advanced";
        String givenNotifyContentType = "application/json";
        String givenCallbackData = "DLR callback data";

        var parts = List.of(
                new Multipart("from", givenFrom),
                new Multipart("to", givenTo),
                new Multipart("to", givenAnotherTo),
                new Multipart("replyTo", givenReplyTo),
                new Multipart("subject", givenSubject),
                new Multipart("text", givenText),
                new Multipart("html", givenHtml),
                new Multipart("attachment", givenAttachmentText),
                new Multipart("intermediateReport", intermediateReport.toString()),
                new Multipart("notifyUrl", givenNotifyUrl),
                new Multipart("notifyContentType", givenNotifyContentType),
                new Multipart("callbackData", givenCallbackData));

        String expectedResponse = String.format(
                "{\n" + "  \"bulkId\": \"%s\",\n"
                        + "  \"messages\": [\n"
                        + "    {\n"
                        + "      \"to\": \"%s\",\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"status\": {\n"
                        + "        \"groupId\": %d,\n"
                        + "        \"groupName\": \"%s\",\n"
                        + "        \"id\": %d,\n"
                        + "        \"name\": \"%s\",\n"
                        + "        \"description\": \"%s\"\n"
                        + "      }\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"to\": \"%s\",\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"status\": {\n"
                        + "        \"groupId\": %d,\n"
                        + "        \"groupName\": \"%s\",\n"
                        + "        \"id\": %d,\n"
                        + "        \"name\": \"%s\",\n"
                        + "        \"description\": \"%s\"\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenBulkId,
                givenTo,
                givenMessageId,
                givenGroupId,
                givenGroupName,
                givenId,
                givenName,
                givenDescription,
                anotherToInResponse,
                givenAnotherMessageId,
                givenGroupId,
                givenGroupName,
                givenId,
                givenName,
                givenDescription);

        setUpMultipartRequest(EMAIL_SEND, parts, expectedResponse, 200);

        Consumer<EmailSendResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getBulkId()).isEqualTo(givenBulkId);
            then(response.getMessages()).isNotNull();
            var messages = response.getMessages();
            then(messages).isNotNull();
            then(messages).hasSize(2);
            var expectedStatus = new MessageStatus()
                    .groupId(givenGroupId)
                    .groupName(givenGroupName)
                    .id(givenId)
                    .name(givenName)
                    .description(givenDescription);
            var firstMessage = messages.get(0);
            then(firstMessage.getTo()).isEqualTo(givenTo);
            then(firstMessage.getMessageId()).isEqualTo(givenMessageId);
            then(firstMessage.getStatus()).isEqualTo(expectedStatus);
            var secondMessage = messages.get(1);
            then(secondMessage.getTo()).isEqualTo(anotherToInResponse);
            then(secondMessage.getMessageId()).isEqualTo(givenAnotherMessageId);
            then(secondMessage.getStatus()).isEqualTo(expectedStatus);
        };

        EmailApi sendEmailApi = new EmailApi(getApiClient());

        var call = sendEmailApi
                .sendEmail(List.of(givenTo, givenAnotherTo))
                .from(givenFrom)
                .subject(givenSubject)
                .replyTo(givenReplyTo)
                .html(givenHtml)
                .text(givenText)
                .attachment(List.of(tempFile))
                .intermediateReport(intermediateReport)
                .notifyUrl(givenNotifyUrl)
                .notifyContentType(givenNotifyContentType)
                .callbackData(givenCallbackData);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetEmailDeliveryReports() {
        String givenSentAt = "2021-08-25T16:10:00.000+0500";
        String givenDoneAt = "2021-08-25T16:11:00.000+0500";
        OffsetDateTime expectedSentAt = OffsetDateTime.of(LocalDateTime.of(2021, 8, 25, 16, 10), ZoneOffset.ofHours(5));
        OffsetDateTime expectedDoneAt = OffsetDateTime.of(LocalDateTime.of(2021, 8, 25, 16, 11), ZoneOffset.ofHours(5));
        String givenBulkId = "csdstgteet4fath2pclbq";
        String givenMessageId = "45653761-3a88-4060-869e-ae372adc7a51";
        String givenTo = "john.doe@example.com";

        String expectedResponse = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"bulkId\": \"%s\",\n"
                        + "      \"messageId\": \"%s\",\n"
                        + "      \"to\": \"%s\",\n"
                        + "      \"sentAt\": \"%s\",\n"
                        + "      \"doneAt\": \"%s\",\n"
                        + "      \"messageCount\": 1,\n"
                        + "      \"price\": {\n"
                        + "        \"pricePerMessage\": 0,\n"
                        + "        \"currency\": \"UNKNOWN\"\n"
                        + "      },\n"
                        + "      \"status\": {\n"
                        + "        \"groupId\": 3,\n"
                        + "        \"groupName\": \"DELIVERED\",\n"
                        + "        \"id\": 5,\n"
                        + "        \"name\": \"DELIVERED_TO_HANDSET\",\n"
                        + "        \"description\": \"Message delivered to handset\"\n"
                        + "      },\n"
                        + "      \"error\": {\n"
                        + "        \"groupId\": 0,\n"
                        + "        \"groupName\": \"OK\",\n"
                        + "        \"id\": 0,\n"
                        + "        \"name\": \"NO_ERROR\",\n"
                        + "        \"description\": \"No Error\",\n"
                        + "        \"permanent\": false\n"
                        + "      },\n"
                        + "      \"channel\": \"EMAIL\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenBulkId, givenMessageId, givenTo, givenSentAt, givenDoneAt);

        Consumer<EmailReportsResult> assertions = emailReportsResult -> {
            then(emailReportsResult).isNotNull();
            List<EmailReport> results = emailReportsResult.getResults();
            then(results).isNotNull();
            then(results).hasSize(1);
            EmailReport report = results.get(0);

            then(report).isNotNull();
            then(report.getBulkId()).isEqualTo(givenBulkId);
            then(report.getMessageId()).isEqualTo(givenMessageId);
            then(report.getTo()).isEqualTo(givenTo);

            then(report.getSentAt()).isEqualTo(expectedSentAt);
            then(report.getDoneAt()).isEqualTo(expectedDoneAt);

            MessageStatus status = report.getStatus();
            then(status.getGroupId()).isEqualTo(DELIVERED_STATUS_GROUP_ID);
            then(status.getGroupName()).isEqualTo(DELIVERED_STATUS_GROUP_NAME);
            then(status.getId()).isEqualTo(DELIVERED_STATUS_ID);
            then(status.getName()).isEqualTo(DELIVERED_STATUS_NAME);
            then(status.getDescription()).isEqualTo(DELIVERED_STATUS_DESCRIPTION);
            MessageError error = report.getError();
            then(error).isNotNull();
            then(error.getGroupId()).isEqualTo(NO_ERROR_GROUP_ID);
            then(error.getGroupName()).isEqualTo(NO_ERROR_GROUP_NAME);
            then(error.getId()).isEqualTo(NO_ERROR_ID);
            then(error.getName()).isEqualTo(NO_ERROR_NAME);
            then(error.getDescription()).isEqualTo(NO_ERROR_DESCRIPTION);
            then(error.getPermanent()).isEqualTo(NO_ERROR_IS_PERMANENT);
        };

        Map<String, String> params = Map.of(
                "bulkId", givenBulkId,
                "messageId", givenMessageId,
                "limit", "1");

        setUpGetRequest(REPORTS, params, expectedResponse, 200);

        EmailApi sendEmailApi = new EmailApi(getApiClient());
        var call = sendEmailApi
                .getEmailDeliveryReports()
                .bulkId(givenBulkId)
                .messageId(givenMessageId)
                .limit(1);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateReturnPath() {
        Long givenDomainId = 1L;
        String givenDomainName = "example.com";
        Boolean givenActive = false;
        Boolean givenTracking = true;
        Boolean givenOpens = true;
        Boolean givenUnsubscribe = true;
        String givenRecordType = "string";
        String givenName = "string";
        String givenExpectedValue = "string";
        Boolean givenVerified = true;
        Boolean givenBlocked = false;
        String givenCreatedAt = "2021-01-02T01:00:00.123Z";
        String givenReturnPathAddress = "returnpath@example.com";

        String givenResponse = String.format(
                "{\n" + "  \"domainId\": %d,\n"
                        + "  \"domainName\": \"%s\",\n"
                        + "  \"active\": %b,\n"
                        + "  \"tracking\": {\n"
                        + "    \"clicks\": %b,\n"
                        + "    \"opens\": %b,\n"
                        + "    \"unsubscribe\": %b\n"
                        + "  },\n"
                        + "  \"dnsRecords\": [\n"
                        + "    {\n"
                        + "      \"recordType\": \"%s\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"expectedValue\": \"%s\",\n"
                        + "      \"verified\": %b\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"blocked\": %b,\n"
                        + "  \"createdAt\": \"%s\",\n"
                        + "  \"returnPathAddress\": \"%s\"\n"
                        + "}\n",
                givenDomainId,
                givenDomainName,
                givenActive,
                givenTracking,
                givenOpens,
                givenUnsubscribe,
                givenRecordType,
                givenName,
                givenExpectedValue,
                givenVerified,
                givenBlocked,
                givenCreatedAt,
                givenReturnPathAddress);

        String expectedReturnPathAddress = "returnpath@example.com";
        String expectedRequest =
                String.format("{\n" + "  \"returnPathAddress\": \"%s\"\n" + "}\n", expectedReturnPathAddress);

        setUpPutRequest(
                RETURN_PATH.replace("{domainName}", givenDomainName), Map.of(), expectedRequest, givenResponse, 200);

        EmailApi sendEmailApi = new EmailApi(getApiClient());
        var givenReturnPathAddressRequest =
                new EmailReturnPathAddressRequest().returnPathAddress(givenReturnPathAddress);

        Consumer<EmailDomainResponse> assertions = emailDomainResponse -> {
            then(emailDomainResponse).isNotNull();
            then(emailDomainResponse.getDomainId()).isEqualTo(givenDomainId);
            then(emailDomainResponse.getDomainName()).isEqualTo(givenDomainName);
            then(emailDomainResponse.getActive()).isFalse();
            var emailTrackingResponse = emailDomainResponse.getTracking();
            then(emailTrackingResponse).isNotNull();
            then(emailTrackingResponse.getClicks()).isTrue();
            then(emailTrackingResponse.getOpens()).isTrue();
            then(emailTrackingResponse.getUnsubscribe()).isTrue();
            var emailDnsRecords = emailDomainResponse.getDnsRecords();
            then(emailDnsRecords.size()).isEqualTo(1);
            var emailDnsRecord = emailDnsRecords.get(0);
            then(emailDnsRecord).isNotNull();
            then(emailDnsRecord.getRecordType()).isEqualTo(givenRecordType);
            then(emailDnsRecord.getName()).isEqualTo(givenName);
            then(emailDnsRecord.getExpectedValue()).isEqualTo(givenExpectedValue);
            then(emailDnsRecord.getVerified()).isTrue();
            then(emailDomainResponse.getBlocked()).isFalse();
            then(emailDomainResponse.getCreatedAt()).isEqualTo(givenCreatedAt);
            then(emailDomainResponse.getReturnPathAddress()).isEqualTo(givenReturnPathAddress);
        };

        var call = sendEmailApi.updateReturnPath(givenDomainName, givenReturnPathAddressRequest);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    // WEBHOOKS
    private final JSON json = new JSON();

    @Test
    void shouldParseEmailDeliveryReports() {
        String givenRequest = "{\n" + "  \"results\": [\n"
                + "    {\n"
                + "      \"bulkId\": \"aszzmbhu62l7bxkhmyrj\",\n"
                + "      \"price\": {\n"
                + "        \"pricePerMessage\": 0,\n"
                + "        \"currency\": \"UNKNOWN\"\n"
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
                + "      \"messageId\": \"hgtesn8bcmc71pujp92d\",\n"
                + "      \"doneAt\": \"2020-09-08T05:27:59.256+0000\",\n"
                + "      \"smsCount\": 1,\n"
                + "      \"sentAt\": \"2020-09-08T05:27:57.628+0000\",\n"
                + "      \"browserLink\": \"http://tracking.domain.com/render/content?id=9A31C6F61DBAE9664D74C7A5A5A01F92283F581D11EA80A28C12E83BC83D449BC4A9F32F1AE3C3E\",\n"
                + "      \"callbackData\": \"something you want back\",\n"
                + "      \"to\": \"john.doe@gmail.com\"\n"
                + "    }\n"
                + "  ]\n"
                + "}\n";

        EmailWebhookDLRReportResponse reportResponse =
                json.deserialize(givenRequest, EmailWebhookDLRReportResponse.class);

        then(reportResponse.getResults()).isNotNull();
        then(reportResponse.getResults().size()).isEqualTo(1);
        then(reportResponse.getResults().get(0).getClass()).isEqualTo(EmailWebhookDeliveryReport.class);
        var message = (EmailWebhookDeliveryReport) reportResponse.getResults().get(0);
        then(message.getPrice().getClass()).isEqualTo(MessagePrice.class);
        then(message.getStatus().getClass()).isEqualTo(MessageStatus.class);
        then(message.getError().getClass()).isEqualTo(MessageError.class);
    }

    @Test
    void shouldParseUserEvents() {
        String givenRequest = "{\n" + "   \"notificationType\": \"OPENED\",\n"
                + "   \"domain\": \"example.com\",\n"
                + "   \"recipient\": \"john.doe@example.com\",\n"
                + "   \"sendDateTime\": 1599542877689,\n"
                + "   \"messageId\": \"14b734recsf69n8zkao5\",\n"
                + "   \"bulkId\": \"ikzzmbhu6223bxkhmyrj\",\n"
                + "   \"recipientInfo\": {\n"
                + "     \"deviceType\": \"Phone\",\n"
                + "     \"os\": \"iOS 12\",\n"
                + "     \"deviceName\": \"Apple\"\n"
                + "   },\n"
                + "   \"geoLocation\": {\n"
                + "     \"city\": \"Los Angeles\",\n"
                + "     \"longitude\": \"-118.24550\",\n"
                + "     \"latitude\": \"34.05361\",\n"
                + "     \"country_name\": \"United States\"\n"
                + "   }\n"
                + "}\n";

        EmailWebhookTrackResponse reportResponse = json.deserialize(givenRequest, EmailWebhookTrackResponse.class);

        then(reportResponse).isNotNull();
        then(reportResponse.getRecipientInfo().getClass()).isEqualTo(EmailWebhookRecipientInfo.class);
        then(reportResponse.getGeoLocation().getClass()).isEqualTo(EmailWebhookGeoLocation.class);
    }

    @Test
    void shouldGetEmailSuppressions() {
        String givenDomainName = "example.com";
        String givenEmailAddress = "jane.smith@example.com";
        EmailSuppressionType givenType = EmailSuppressionType.BOUNCE;
        String givenCreatedDate = "2024-08-14T14:02:17.366Z";
        OffsetDateTime givenCreatedDateTime = OffsetDateTime.parse(givenCreatedDate);
        String givenReason = "550 5.1.1 <jane.smith@example.com>: user does not exist";
        int givenPage = 0;
        int givenSize = 100;

        String givenResponse = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"domainName\": \"%s\",\n"
                        + "      \"emailAddress\": \"%s\",\n"
                        + "      \"type\": \"%s\",\n"
                        + "      \"createdDate\": \"%s\",\n"
                        + "      \"reason\": \"%s\"\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"paging\": {\n"
                        + "    \"page\": %d,\n"
                        + "    \"size\": %d\n"
                        + "  }\n"
                        + "}",
                givenDomainName, givenEmailAddress, givenType, givenCreatedDate, givenReason, givenPage, givenSize);

        setUpGetRequest(
                "/email/1/suppressions",
                Map.of("domainName", givenDomainName, "type", givenType.toString()),
                givenResponse,
                200);

        EmailApi api = new EmailApi(getApiClient());

        Consumer<EmailSuppressionInfoPageResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults().size()).isEqualTo(1);
            var result = response.getResults().get(0);
            then(result.getDomainName()).isEqualTo(givenDomainName);
            then(result.getEmailAddress()).isEqualTo(givenEmailAddress);
            then(result.getType()).isEqualTo(givenType.toString());
            then(result.getCreatedDate()).isEqualTo(givenCreatedDateTime);
            then(result.getReason()).isEqualTo(givenReason);
            var paging = response.getPaging();
            then(paging.getPage()).isEqualTo(givenPage);
            then(paging.getSize()).isEqualTo(givenSize);
        };

        var call = api.getSuppressions(givenDomainName, givenType);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldAddEmailSuppressions() {
        String givenDomainName1 = "example.com";
        List<String> givenEmailAddresses1 = List.of("jane.smith@example.com", "john.doe@example.com");
        EmailAddSuppressionType givenType = EmailAddSuppressionType.BOUNCE;

        String givenDomainName2 = "example.com";
        List<String> givenEmailAddresses2 = List.of("john.smith@example.com", "john.perry@example.com");

        String expectedRequest = String.format(
                "{\n" + "  \"suppressions\": [\n"
                        + "    {\n"
                        + "      \"domainName\": \"%s\",\n"
                        + "      \"emailAddress\": [\n"
                        + "        \"%s\",\n"
                        + "        \"%s\"\n"
                        + "      ],\n"
                        + "      \"type\": \"%s\"\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"domainName\": \"%s\",\n"
                        + "      \"emailAddress\": [\n"
                        + "        \"%s\",\n"
                        + "        \"%s\"\n"
                        + "      ],\n"
                        + "      \"type\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenDomainName1,
                givenEmailAddresses1.get(0),
                givenEmailAddresses1.get(1),
                givenType,
                givenDomainName2,
                givenEmailAddresses2.get(0),
                givenEmailAddresses2.get(1),
                givenType);

        setUpNoResponseBodyPostRequest(EMAIL_SUPPRESSION, Map.of(), expectedRequest, 204);

        EmailApi api = new EmailApi(getApiClient());

        EmailAddSuppressionRequest request = new EmailAddSuppressionRequest()
                .suppressions(List.of(
                        new EmailAddSuppression()
                                .domainName(givenDomainName1)
                                .emailAddress(givenEmailAddresses1)
                                .type(EmailAddSuppressionType.BOUNCE),
                        new EmailAddSuppression()
                                .domainName(givenDomainName2)
                                .emailAddress(givenEmailAddresses2)
                                .type(EmailAddSuppressionType.BOUNCE)));

        var call = api.addSuppressions(request);
        testSuccessfulCallWithNoBody(call::executeAsync, 204);
    }

    @Test
    void shouldDeleteEmailSuppressions() {
        String givenDomainName1 = "example.com";
        List<String> givenEmailAddresses1 = List.of("jane.smith@example.com", "john.doe@example.com");
        EmailAddSuppressionType givenType = EmailAddSuppressionType.BOUNCE;

        String givenDomainName2 = "example.com";
        List<String> givenEmailAddresses2 = List.of("john.smith@example.com", "john.perry@example.com");

        String expectedRequest = String.format(
                "{\n" + "  \"suppressions\": [\n"
                        + "    {\n"
                        + "      \"domainName\": \"%s\",\n"
                        + "      \"emailAddress\": [\n"
                        + "        \"%s\",\n"
                        + "        \"%s\"\n"
                        + "      ],\n"
                        + "      \"type\": \"%s\"\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"domainName\": \"%s\",\n"
                        + "      \"emailAddress\": [\n"
                        + "        \"%s\",\n"
                        + "        \"%s\"\n"
                        + "      ],\n"
                        + "      \"type\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenDomainName1,
                givenEmailAddresses1.get(0),
                givenEmailAddresses1.get(1),
                givenType,
                givenDomainName2,
                givenEmailAddresses2.get(0),
                givenEmailAddresses2.get(1),
                givenType);

        setUpNoResponseBodyDeleteRequest(EMAIL_SUPPRESSION, Map.of(), expectedRequest, 204);

        EmailApi api = new EmailApi(getApiClient());

        EmailDeleteSuppressionRequest request = new EmailDeleteSuppressionRequest()
                .suppressions(List.of(
                        new EmailDeleteSuppression()
                                .domainName(givenDomainName1)
                                .emailAddress(givenEmailAddresses1)
                                .type(EmailSuppressionType.BOUNCE),
                        new EmailDeleteSuppression()
                                .domainName(givenDomainName2)
                                .emailAddress(givenEmailAddresses2)
                                .type(EmailSuppressionType.BOUNCE)));

        var call = api.deleteSuppressions(request);
        testSuccessfulCallWithNoBody(call::executeAsync, 204);
    }

    @Test
    void shouldGetSuppressionDomains() {
        String givenDomainName1 = "example.com";
        EmailDomainAccess givenDataAccess1 = EmailDomainAccess.OWNER;
        boolean givenReadBounces1 = true;
        boolean givenCreateBounces1 = true;
        boolean givenDeleteBounces1 = true;
        boolean givenReadComplaints1 = true;
        boolean givenCreateComplaints1 = true;
        boolean givenDeleteComplaints1 = true;
        boolean givenReadOverquotas1 = true;

        String givenDomainName2 = "example.com";
        EmailDomainAccess givenDataAccess2 = EmailDomainAccess.GRANTED;
        boolean givenReadBounces2 = true;
        boolean givenCreateBounces2 = true;
        boolean givenDeleteBounces2 = false;
        boolean givenReadComplaints2 = true;
        boolean givenCreateComplaints2 = false;
        boolean givenDeleteComplaints2 = false;
        boolean givenReadOverquotas2 = false;

        int givenPage = 0;
        int givenSize = 100;

        String givenResponse = String.format(
                "{\n" + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"domainName\": \"%s\",\n"
                        + "      \"dataAccess\": \"%s\",\n"
                        + "      \"readBounces\": %b,\n"
                        + "      \"createBounces\": %b,\n"
                        + "      \"deleteBounces\": %b,\n"
                        + "      \"readComplaints\": %b,\n"
                        + "      \"createComplaints\": %b,\n"
                        + "      \"deleteComplaints\": %b,\n"
                        + "      \"readOverquotas\": %b\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"domainName\": \"%s\",\n"
                        + "      \"dataAccess\": \"%s\",\n"
                        + "      \"readBounces\": %b,\n"
                        + "      \"createBounces\": %b,\n"
                        + "      \"deleteBounces\": %b,\n"
                        + "      \"readComplaints\": %b,\n"
                        + "      \"createComplaints\": %b,\n"
                        + "      \"deleteComplaints\": %b,\n"
                        + "      \"readOverquotas\": %b\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"paging\": {\n"
                        + "    \"page\": %d,\n"
                        + "    \"size\": %d\n"
                        + "  }\n"
                        + "}",
                givenDomainName1,
                givenDataAccess1,
                givenReadBounces1,
                givenCreateBounces1,
                givenDeleteBounces1,
                givenReadComplaints1,
                givenCreateComplaints1,
                givenDeleteComplaints1,
                givenReadOverquotas1,
                givenDomainName2,
                givenDataAccess2,
                givenReadBounces2,
                givenCreateBounces2,
                givenDeleteBounces2,
                givenReadComplaints2,
                givenCreateComplaints2,
                givenDeleteComplaints2,
                givenReadOverquotas2,
                givenPage,
                givenSize);

        setUpGetRequest(EMAIL_SUPPRESSION_DOMAINS, Map.of(), givenResponse, 200);

        EmailApi api = new EmailApi(getApiClient());

        Consumer<EmailDomainInfoPageResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getResults().size()).isEqualTo(2);

            var result1 = response.getResults().get(0);
            then(result1.getDomainName()).isEqualTo(givenDomainName1);
            then(result1.getDataAccess()).isEqualTo(EmailDomainAccess.OWNER);
            then(result1.getReadBounces()).isEqualTo(givenReadBounces1);
            then(result1.getCreateBounces()).isEqualTo(givenCreateBounces1);
            then(result1.getDeleteBounces()).isEqualTo(givenDeleteBounces1);
            then(result1.getReadComplaints()).isEqualTo(givenReadComplaints1);
            then(result1.getCreateComplaints()).isEqualTo(givenCreateComplaints1);
            then(result1.getDeleteComplaints()).isEqualTo(givenDeleteComplaints1);
            then(result1.getReadOverquotas()).isEqualTo(givenReadOverquotas1);

            var result2 = response.getResults().get(1);
            then(result2.getDomainName()).isEqualTo(givenDomainName2);
            then(result2.getDataAccess()).isEqualTo(givenDataAccess2);
            then(result2.getReadBounces()).isEqualTo(givenReadBounces2);
            then(result2.getCreateBounces()).isEqualTo(givenCreateBounces2);
            then(result2.getDeleteBounces()).isEqualTo(givenDeleteBounces2);
            then(result2.getReadComplaints()).isEqualTo(givenReadComplaints2);
            then(result2.getCreateComplaints()).isEqualTo(givenCreateComplaints2);
            then(result2.getDeleteComplaints()).isEqualTo(givenDeleteComplaints2);
            then(result2.getReadOverquotas()).isEqualTo(givenReadOverquotas2);

            var paging = response.getPaging();
            then(paging.getPage()).isEqualTo(givenPage);
            then(paging.getSize()).isEqualTo(givenSize);
        };

        var call = api.getDomains();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetIps() {
        String givenResponse = "[\n" + "  {\n"
                + "    \"id\": \"DB3F9D439088BF73F5560443C8054AC4\",\n"
                + "    \"ip\": \"198.51.100.0\"\n"
                + "  }\n"
                + "]";

        setUpSuccessGetRequest("/email/1/ip-management/ips", Map.of(), givenResponse);

        EmailApi api = new EmailApi(getApiClient());

        Consumer<List<EmailIpResponse>> assertions = (response) -> {
            then(response).isNotNull();
            then(response).hasSize(1);
            EmailIpResponse ipResponse = response.get(0);
            then(ipResponse.getId()).isEqualTo("DB3F9D439088BF73F5560443C8054AC4");
            then(ipResponse.getIp()).isEqualTo("198.51.100.0");
        };

        var call = api.getAllIps();
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetIpDetails() {
        String givenResponse = "{\n" + "  \"id\": \"DB3F9D439088BF73F5560443C8054AC4\",\n"
                + "  \"ip\": \"198.51.100.0\",\n"
                + "  \"pools\": [\n"
                + "    {\n"
                + "      \"id\": \"08A3A7608750CC6E6080325A6ADF45B6\",\n"
                + "      \"name\": \"IP pool name\"\n"
                + "    }\n"
                + "  ]\n"
                + "}";

        String ipId = "DB3F9D439088BF73F5560443C8054AC4";
        setUpSuccessGetRequest("/email/1/ip-management/ips/" + ipId, Map.of(), givenResponse);

        EmailApi api = new EmailApi(getApiClient());

        Consumer<EmailIpDetailResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo("DB3F9D439088BF73F5560443C8054AC4");
            then(response.getIp()).isEqualTo("198.51.100.0");
            then(response.getPools()).hasSize(1);
            Set<EmailIpPoolResponse> poolResponses = response.getPools();
            var poolResponse = poolResponses.iterator().next();
            then(poolResponse.getId()).isEqualTo("08A3A7608750CC6E6080325A6ADF45B6");
            then(poolResponse.getName()).isEqualTo("IP pool name");
        };

        var call = api.getIpDetails(ipId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldIpManagementGetDomainDetails() {
        String givenResponse = "{\n" + "  \"id\": 1,\n"
                + "  \"name\": \"example.com\",\n"
                + "  \"pools\": [\n"
                + "    {\n"
                + "      \"id\": \"08A3A7608750CC6E6080325A6ADF45B6\",\n"
                + "      \"name\": \"IP pool name\",\n"
                + "      \"priority\": 0,\n"
                + "      \"ips\": [\n"
                + "        {\n"
                + "          \"id\": \"DB3F9D439088BF73F5560443C8054AC4\",\n"
                + "          \"ip\": \"198.51.100.0\"\n"
                + "        }\n"
                + "      ]\n"
                + "    }\n"
                + "  ]\n"
                + "}";

        Long domainId = 1L;
        setUpSuccessGetRequest("/email/1/ip-management/domains/" + domainId, Map.of(), givenResponse);

        EmailApi api = new EmailApi(getApiClient());

        Consumer<EmailIpDomainResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(1);
            then(response.getName()).isEqualTo("example.com");
            then(response.getPools()).hasSize(1);
            EmailDomainIpApiPool poolResponse = response.getPools().iterator().next();
            then(poolResponse.getId()).isEqualTo("08A3A7608750CC6E6080325A6ADF45B6");
            then(poolResponse.getName()).isEqualTo("IP pool name");
            then(poolResponse.getPriority()).isEqualTo(0);
            then(poolResponse.getIps()).hasSize(1);
            EmailIpResponse ipResponse = poolResponse.getIps().iterator().next();
            then(ipResponse.getId()).isEqualTo("DB3F9D439088BF73F5560443C8054AC4");
            then(ipResponse.getIp()).isEqualTo("198.51.100.0");
        };

        var call = api.getIpDomain(domainId);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }
}
