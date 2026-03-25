package com.infobip.api;

import static org.assertj.core.api.BDDAssertions.then;

import com.infobip.JSON;
import com.infobip.model.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;
import org.junit.jupiter.api.Test;

class ResourcesApiTest extends ApiTest {

    private static final String RESOURCES = "/resources/1/resources";
    private static final String COVERAGE_LOOKUP = "/resources/1/coverage-lookup";
    private static final String REQUIREMENTS_LOOKUP = "/resources/1/requirements-lookup";
    private static final String RESOURCE_REQUESTS = "/resources/1/requests";
    private static final String RESOURCE_REQUEST = "/resources/1/requests/{id}";
    private static final String CANCEL_RESOURCE_REQUEST = "/resources/1/requests/{id}/cancel";
    private static final String DOCUMENTS = "/resources/1/documents";
    private static final String DOCUMENT = "/resources/1/documents/{documentId}";
    private static final String INBOUND_CONFIGURATIONS = "/resource-management/1/inbound-message-configurations";
    private static final String INBOUND_CONFIGURATION =
            "/resource-management/1/inbound-message-configurations/{configurationKey}";

    @Test
    void shouldGetInboundConfigurations() {
        String givenConfigurationKey = "58BC6DB7966CB9F69A91EB956DF73239";
        String givenNumber = "41793026727";
        String givenNumberKey = "58BC6DB7966CB9F69A91EB956DF73239";
        String givenResource = "41793026727";
        String givenResourceKey = "58BC6DB7966CB9F69A91EB956DF73239";
        String givenKeyword = "STARTKW";
        ResourcesConfigurationType givenChannel = ResourcesConfigurationType.SMS;
        String givenCountryCode = "GB";

        String givenResponseConfigurationKey = "E9FCDCA496035F08EEA5933702EDF745";
        String givenResponseKeyword = "STARTKW";
        String givenUsername = "myusername";
        String givenApplicationId = "myApplicationId";
        String givenEntityId = "myEntityId";
        MoActionType givenForwardingType = MoActionType.PULL;
        String givenAutoResponseMessage = "Thank you for your message.";
        String givenAutoResponseSender = "MyAutoResponseSender";
        String givenDeliveryFrom = "08:35";
        String givenDeliveryTo = "16:35";
        ResourcesDeliveryTimeZoneResponse givenDeliveryTimeZone = ResourcesDeliveryTimeZoneResponse.USER_TIME_ZONE;
        ResourcesBlockListConfigurationType givenBlockListType = ResourcesBlockListConfigurationType.UNBLOCK;
        ResourcesBlockLevelResponse givenBlockLevel = ResourcesBlockLevelResponse.FROM_SENDER;

        String givenResponse = String.format(
                "[\n"
                        + "  {\n"
                        + "    \"configurationKey\": \"%s\",\n"
                        + "    \"channel\": \"%s\",\n"
                        + "    \"keyword\": \"%s\",\n"
                        + "    \"username\": \"%s\",\n"
                        + "    \"platform\": {\n"
                        + "      \"applicationId\": \"%s\",\n"
                        + "      \"entityId\": \"%s\"\n"
                        + "    },\n"
                        + "    \"forwarding\": {\n"
                        + "      \"type\": \"%s\"\n"
                        + "    },\n"
                        + "    \"conversations\": {\n"
                        + "      \"enabled\": true\n"
                        + "    },\n"
                        + "    \"answers\": {\n"
                        + "      \"enabled\": true\n"
                        + "    },\n"
                        + "    \"autoResponse\": {\n"
                        + "      \"message\": \"%s\",\n"
                        + "      \"sender\": \"%s\",\n"
                        + "      \"deliveryTimeWindow\": {\n"
                        + "        \"from\": \"%s\",\n"
                        + "        \"to\": \"%s\",\n"
                        + "        \"days\": [\"MONDAY\", \"TUESDAY\", \"WEDNESDAY\", \"THURSDAY\", \"FRIDAY\"],\n"
                        + "        \"deliveryTimeZone\": \"%s\"\n"
                        + "      }\n"
                        + "    },\n"
                        + "    \"blockListConfiguration\": {\n"
                        + "      \"type\": \"%s\",\n"
                        + "      \"level\": \"%s\"\n"
                        + "    }\n"
                        + "  }\n"
                        + "]",
                givenResponseConfigurationKey,
                givenChannel,
                givenResponseKeyword,
                givenUsername,
                givenApplicationId,
                givenEntityId,
                givenForwardingType,
                givenAutoResponseMessage,
                givenAutoResponseSender,
                givenDeliveryFrom,
                givenDeliveryTo,
                givenDeliveryTimeZone,
                givenBlockListType,
                givenBlockLevel);

        setUpSuccessGetRequest(
                INBOUND_CONFIGURATIONS,
                Map.of(
                        "configurationKey", givenConfigurationKey,
                        "number", givenNumber,
                        "numberKey", givenNumberKey,
                        "resource", givenResource,
                        "resourceKey", givenResourceKey,
                        "keyword", givenKeyword,
                        "channel", givenChannel.getValue(),
                        "countryCode", givenCountryCode),
                givenResponse);

        ResourcesApi api = new ResourcesApi(getApiClient());

        Consumer<List<ResourcesMoConfigurationResponse>> assertions = (response) -> {
            then(response).isNotNull();
            then(response).hasSize(1);

            ResourcesMoConfigurationResponse config = response.get(0);
            then(config.getConfigurationKey()).isEqualTo(givenResponseConfigurationKey);
            then(config.getChannel()).isEqualTo(givenChannel);
            then(config.getKeyword()).isEqualTo(givenResponseKeyword);
            then(config.getUsername()).isEqualTo(givenUsername);

            ResourcesPlatformDocs platform = config.getPlatform();
            then(platform).isNotNull();
            then(platform.getApplicationId()).isEqualTo(givenApplicationId);
            then(platform.getEntityId()).isEqualTo(givenEntityId);

            ResourcesMoActionDocs forwarding = config.getForwarding();
            then(forwarding).isNotNull();
            then(forwarding.getType()).isEqualTo(givenForwardingType);

            then(config.getConversations()).isNotNull();
            then(config.getConversations().getEnabled()).isTrue();

            then(config.getAnswers()).isNotNull();
            then(config.getAnswers().getEnabled()).isTrue();

            ResourcesAutoResponseActionResponse autoResponse = config.getAutoResponse();
            then(autoResponse).isNotNull();
            then(autoResponse.getMessage()).isEqualTo(givenAutoResponseMessage);
            then(autoResponse.getSender()).isEqualTo(givenAutoResponseSender);

            ResourcesDeliveryTimeWindowResponse deliveryTimeWindow = autoResponse.getDeliveryTimeWindow();
            then(deliveryTimeWindow).isNotNull();
            then(deliveryTimeWindow.getFrom()).isEqualTo(givenDeliveryFrom);
            then(deliveryTimeWindow.getTo()).isEqualTo(givenDeliveryTo);
            then(deliveryTimeWindow.getDays())
                    .isEqualTo(Set.of(
                            ResourcesDayOfWeek.MONDAY,
                            ResourcesDayOfWeek.TUESDAY,
                            ResourcesDayOfWeek.WEDNESDAY,
                            ResourcesDayOfWeek.THURSDAY,
                            ResourcesDayOfWeek.FRIDAY));
            then(deliveryTimeWindow.getDeliveryTimeZone()).isEqualTo(givenDeliveryTimeZone);

            ResourcesBlockListConfigurationResponse blockList = config.getBlockListConfiguration();
            then(blockList).isNotNull();
            then(blockList.getType()).isEqualTo(givenBlockListType);
            then(blockList.getLevel()).isEqualTo(givenBlockLevel);
        };

        var call = api.getInboundConfigurations(givenChannel)
                .configurationKey(givenConfigurationKey)
                .number(givenNumber)
                .numberKey(givenNumberKey)
                .resource(givenResource)
                .resourceKey(givenResourceKey)
                .keyword(givenKeyword)
                .countryCode(givenCountryCode);

        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldManageInboundConfiguration() {
        String givenKeyword = "STARTKW";
        String givenUsername = "myusername";
        ResourcesUnsetOption givenUnset = ResourcesUnsetOption.FORWARDING;
        String givenNumberKey = "58BC6DB7966CB9F69A91EB956DF73239";
        String givenApplicationId = "myApplicationId";
        String givenEntityId = "myEntityId";
        String givenNumber = "41793026727";
        String givenCountryCode = "GB";
        MoActionType givenForwardingType = MoActionType.PULL;
        String givenAutoResponseMessage = "Thank you for your message.";
        String givenAutoResponseSender = "MyAutoResponseSender";
        String givenDeliveryFrom = "08:35";
        String givenDeliveryTo = "16:35";
        ResourcesDeliveryTimeZone givenDeliveryTimeZone = ResourcesDeliveryTimeZone.USER_TIME_ZONE;
        ResourcesBlockListConfigurationType givenBlockListType = ResourcesBlockListConfigurationType.UNBLOCK;
        ResourcesBlockLevelRequest givenBlockLevel = ResourcesBlockLevelRequest.SENDER;

        String givenResponseConfigurationKey = "E9FCDCA496035F08EEA5933702EDF745";
        ResourcesConfigurationType givenChannel = ResourcesConfigurationType.SMS;
        ResourcesDeliveryTimeZoneResponse givenResponseDeliveryTimeZone =
                ResourcesDeliveryTimeZoneResponse.USER_TIME_ZONE;
        ResourcesBlockLevelResponse givenResponseBlockLevel = ResourcesBlockLevelResponse.FROM_SENDER;

        String expectedRequest = String.format(
                "{\n"
                        + "  \"keyword\": \"%s\",\n"
                        + "  \"username\": \"%s\",\n"
                        + "  \"unset\": [\"%s\"],\n"
                        + "  \"channel\": \"%s\",\n"
                        + "  \"numberKey\": \"%s\",\n"
                        + "  \"platform\": {\n"
                        + "    \"applicationId\": \"%s\",\n"
                        + "    \"entityId\": \"%s\"\n"
                        + "  },\n"
                        + "  \"number\": \"%s\",\n"
                        + "  \"countryCode\": \"%s\",\n"
                        + "  \"forwarding\": {\n"
                        + "    \"type\": \"%s\"\n"
                        + "  },\n"
                        + "  \"conversations\": {\n"
                        + "    \"enabled\": true\n"
                        + "  },\n"
                        + "  \"autoResponse\": {\n"
                        + "    \"message\": \"%s\",\n"
                        + "    \"sender\": \"%s\",\n"
                        + "    \"deliveryTimeWindow\": {\n"
                        + "      \"from\": \"%s\",\n"
                        + "      \"to\": \"%s\",\n"
                        + "      \"days\": [\"MONDAY\", \"TUESDAY\", \"WEDNESDAY\", \"THURSDAY\", \"FRIDAY\"],\n"
                        + "      \"deliveryTimeZone\": \"%s\"\n"
                        + "    }\n"
                        + "  },\n"
                        + "  \"blockListConfiguration\": {\n"
                        + "    \"type\": \"%s\",\n"
                        + "    \"level\": \"%s\"\n"
                        + "  }\n"
                        + "}",
                givenKeyword,
                givenUsername,
                givenUnset,
                givenChannel,
                givenNumberKey,
                givenApplicationId,
                givenEntityId,
                givenNumber,
                givenCountryCode,
                givenForwardingType,
                givenAutoResponseMessage,
                givenAutoResponseSender,
                givenDeliveryFrom,
                givenDeliveryTo,
                givenDeliveryTimeZone,
                givenBlockListType,
                givenBlockLevel);

        String givenResponse = String.format(
                "{\n"
                        + "  \"configurationKey\": \"%s\",\n"
                        + "  \"channel\": \"%s\",\n"
                        + "  \"keyword\": \"%s\",\n"
                        + "  \"username\": \"%s\",\n"
                        + "  \"platform\": {\n"
                        + "    \"applicationId\": \"%s\",\n"
                        + "    \"entityId\": \"%s\"\n"
                        + "  },\n"
                        + "  \"forwarding\": {\n"
                        + "    \"type\": \"%s\"\n"
                        + "  },\n"
                        + "  \"conversations\": {\n"
                        + "    \"enabled\": true\n"
                        + "  },\n"
                        + "  \"answers\": {\n"
                        + "    \"enabled\": true\n"
                        + "  },\n"
                        + "  \"autoResponse\": {\n"
                        + "    \"message\": \"%s\",\n"
                        + "    \"sender\": \"%s\",\n"
                        + "    \"deliveryTimeWindow\": {\n"
                        + "      \"from\": \"%s\",\n"
                        + "      \"to\": \"%s\",\n"
                        + "      \"days\": [\"MONDAY\", \"TUESDAY\", \"WEDNESDAY\", \"THURSDAY\", \"FRIDAY\"],\n"
                        + "      \"deliveryTimeZone\": \"%s\"\n"
                        + "    }\n"
                        + "  },\n"
                        + "  \"blockListConfiguration\": {\n"
                        + "    \"type\": \"%s\",\n"
                        + "    \"level\": \"%s\"\n"
                        + "  }\n"
                        + "}",
                givenResponseConfigurationKey,
                givenChannel,
                givenKeyword,
                givenUsername,
                givenApplicationId,
                givenEntityId,
                givenForwardingType,
                givenAutoResponseMessage,
                givenAutoResponseSender,
                givenDeliveryFrom,
                givenDeliveryTo,
                givenResponseDeliveryTimeZone,
                givenBlockListType,
                givenResponseBlockLevel);

        setUpSuccessPostRequest(INBOUND_CONFIGURATIONS, expectedRequest, givenResponse);

        ResourcesApi api = new ResourcesApi(getApiClient());

        Set<ResourcesDayOfWeek> givenDays = new LinkedHashSet<>();
        givenDays.add(ResourcesDayOfWeek.MONDAY);
        givenDays.add(ResourcesDayOfWeek.TUESDAY);
        givenDays.add(ResourcesDayOfWeek.WEDNESDAY);
        givenDays.add(ResourcesDayOfWeek.THURSDAY);
        givenDays.add(ResourcesDayOfWeek.FRIDAY);

        ResourcesMoConfigurationRequest request = new ResourcesSmsMoConfigurationRequest()
                .numberKey(givenNumberKey)
                .platform(new ResourcesPlatformDocs()
                        .applicationId(givenApplicationId)
                        .entityId(givenEntityId))
                .number(givenNumber)
                .countryCode(givenCountryCode)
                .forwarding(new ResourcesPullActionDocs())
                .conversations(new ResourcesUseConversations().enabled(true))
                .autoResponse(new ResourcesAutoResponseActionRequest()
                        .message(givenAutoResponseMessage)
                        .sender(givenAutoResponseSender)
                        .deliveryTimeWindow(new ResourcesDeliveryTimeWindow()
                                .from(givenDeliveryFrom)
                                .to(givenDeliveryTo)
                                .days(givenDays)
                                .deliveryTimeZone(givenDeliveryTimeZone)))
                .blockListConfiguration(new ResourcesBlockListConfigurationRequest()
                        .type(givenBlockListType)
                        .level(givenBlockLevel))
                .keyword(givenKeyword)
                .username(givenUsername)
                .unset(Set.of(givenUnset));

        Consumer<ResourcesMoConfigurationResponse> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getConfigurationKey()).isEqualTo(givenResponseConfigurationKey);
            then(response.getChannel()).isEqualTo(givenChannel);
            then(response.getKeyword()).isEqualTo(givenKeyword);
            then(response.getUsername()).isEqualTo(givenUsername);

            ResourcesPlatformDocs platform = response.getPlatform();
            then(platform).isNotNull();
            then(platform.getApplicationId()).isEqualTo(givenApplicationId);
            then(platform.getEntityId()).isEqualTo(givenEntityId);

            ResourcesMoActionDocs forwarding = response.getForwarding();
            then(forwarding).isNotNull();
            then(forwarding.getType()).isEqualTo(givenForwardingType);

            then(response.getConversations()).isNotNull();
            then(response.getConversations().getEnabled()).isTrue();

            then(response.getAnswers()).isNotNull();
            then(response.getAnswers().getEnabled()).isTrue();

            ResourcesAutoResponseActionResponse autoResponse = response.getAutoResponse();
            then(autoResponse).isNotNull();
            then(autoResponse.getMessage()).isEqualTo(givenAutoResponseMessage);
            then(autoResponse.getSender()).isEqualTo(givenAutoResponseSender);

            ResourcesDeliveryTimeWindowResponse deliveryTimeWindow = autoResponse.getDeliveryTimeWindow();
            then(deliveryTimeWindow).isNotNull();
            then(deliveryTimeWindow.getFrom()).isEqualTo(givenDeliveryFrom);
            then(deliveryTimeWindow.getTo()).isEqualTo(givenDeliveryTo);
            then(deliveryTimeWindow.getDays()).isEqualTo(givenDays);
            then(deliveryTimeWindow.getDeliveryTimeZone()).isEqualTo(givenResponseDeliveryTimeZone);

            ResourcesBlockListConfigurationResponse blockList = response.getBlockListConfiguration();
            then(blockList).isNotNull();
            then(blockList.getType()).isEqualTo(givenBlockListType);
            then(blockList.getLevel()).isEqualTo(givenResponseBlockLevel);
        };

        var call = api.manageInboundConfiguration(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDeleteInboundConfiguration() {
        String givenConfigurationKey = "58BC6DB7966CB9F69A91EB956DF73239";

        setUpNoResponseBodyDeleteRequest(
                INBOUND_CONFIGURATION.replace("{configurationKey}", givenConfigurationKey), Map.of(), 204);

        ResourcesApi api = new ResourcesApi(getApiClient());

        var call = api.deleteInboundConfiguration(givenConfigurationKey);
        testSuccessfulCallWithNoBody(call::executeAsync, 204);
    }

    @Test
    void shouldSearchResources() {
        String givenNumber = "447860041117";
        String givenCountryCode = "GB";
        ResourcesIbResourceType givenResourceType = ResourcesIbResourceType.NUMBER;
        ResourcesNumberResourceCapabilityChannelDocs givenRequestCapability =
                ResourcesNumberResourceCapabilityChannelDocs.SMS;

        String givenNumberKey = "58B3840032C7774BAC840EEEA2C23A44";
        String givenApplicationId = "myApplicationId";
        String givenEntityId = "myEntityId";
        ResourcesNumberTypeResourceMoDocs givenNumberType = ResourcesNumberTypeResourceMoDocs.VIRTUAL_LONG_NUMBER;
        String givenCountryName = "United Kingdom";
        ResourcesResourceCapabilityChannel givenResponseCapability = ResourcesResourceCapabilityChannel.SMS;
        int givenPage = 0;
        int givenSize = 1;
        int givenTotalPages = 1;
        long givenTotalResults = 1L;

        String expectedRequest = String.format(
                "{\n"
                        + "  \"resourceType\": \"%s\",\n"
                        + "  \"number\": \"%s\",\n"
                        + "  \"countryCode\": \"%s\",\n"
                        + "  \"capabilities\": [\"%s\"]\n"
                        + "}",
                givenResourceType, givenNumber, givenCountryCode, givenRequestCapability);

        String givenResponse = String.format(
                "{\n"
                        + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"number\": \"%s\",\n"
                        + "      \"numberKey\": \"%s\",\n"
                        + "      \"platform\": {\n"
                        + "        \"applicationId\": \"%s\",\n"
                        + "        \"entityId\": \"%s\"\n"
                        + "      },\n"
                        + "      \"numberType\": \"%s\",\n"
                        + "      \"countryCode\": \"%s\",\n"
                        + "      \"countryName\": \"%s\",\n"
                        + "      \"capabilities\": [\"%s\"],\n"
                        + "      \"resourceType\": \"%s\"\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"paging\": {\n"
                        + "    \"page\": %d,\n"
                        + "    \"size\": %d,\n"
                        + "    \"totalPages\": %d,\n"
                        + "    \"totalResults\": %d\n"
                        + "  }\n"
                        + "}",
                givenNumber,
                givenNumberKey,
                givenApplicationId,
                givenEntityId,
                givenNumberType,
                givenCountryCode,
                givenCountryName,
                givenResponseCapability,
                givenResourceType,
                givenPage,
                givenSize,
                givenTotalPages,
                givenTotalResults);

        setUpSuccessPostRequest(RESOURCES, expectedRequest, givenResponse);

        ResourcesApi api = new ResourcesApi(getApiClient());

        ResourcesIbResourcesFilter filter = new ResourcesNumberResourceFilter()
                .number(givenNumber)
                .countryCode(givenCountryCode)
                .capabilities(List.of(givenRequestCapability));

        Consumer<ResourcesIbResourcesResponse> assertions = (response) -> {
            then(response).isNotNull();

            List<ResourcesIbResourceInfo> results = response.getResults();
            then(results).isNotNull();
            then(results).hasSize(1);

            ResourcesNumberResourceInfo result = (ResourcesNumberResourceInfo) results.get(0);
            then(result.getNumber()).isEqualTo(givenNumber);
            then(result.getNumberKey()).isEqualTo(givenNumberKey);
            then(result.getNumberType()).isEqualTo(givenNumberType);
            then(result.getCountryCode()).isEqualTo(givenCountryCode);
            then(result.getCountryName()).isEqualTo(givenCountryName);
            then(result.getResourceType()).isEqualTo(givenResourceType);
            then(result.getCapabilities()).isEqualTo(Set.of(givenResponseCapability));

            ResourcesPlatformDocs platform = result.getPlatform();
            then(platform).isNotNull();
            then(platform.getApplicationId()).isEqualTo(givenApplicationId);
            then(platform.getEntityId()).isEqualTo(givenEntityId);

            PageInfo paging = response.getPaging();
            then(paging).isNotNull();
            then(paging.getPage()).isEqualTo(givenPage);
            then(paging.getSize()).isEqualTo(givenSize);
            then(paging.getTotalPages()).isEqualTo(givenTotalPages);
            then(paging.getTotalResults()).isEqualTo(givenTotalResults);
        };

        var call = api.listResources(filter);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldLookupResourceCoverage() {
        String givenSenderName = "MySender";
        String givenCountryCode = "GB";
        ResourcesIbResourceType givenResourceType = ResourcesIbResourceType.ALPHANUMERIC;

        String givenCountryName = "United Kingdom";
        String givenMccNnc = "310260";
        String givenNetworkName = "Some network";
        ResourcesResourceCapabilityChannel givenChannel = ResourcesResourceCapabilityChannel.SMS;

        String expectedRequest = String.format(
                "{\n"
                        + "  \"resourceType\": \"%s\",\n"
                        + "  \"senderName\": \"%s\",\n"
                        + "  \"countryCode\": \"%s\"\n"
                        + "}",
                givenResourceType, givenSenderName, givenCountryCode);

        String givenResponse = String.format(
                "{\n"
                        + "  \"senderName\": \"%s\",\n"
                        + "  \"countryCode\": \"%s\",\n"
                        + "  \"countryName\": \"%s\",\n"
                        + "  \"capabilities\": [\n"
                        + "    {\n"
                        + "      \"channel\": \"%s\",\n"
                        + "      \"coverage\": {\n"
                        + "        \"outbound\": [\n"
                        + "          {\n"
                        + "            \"mccNnc\": \"%s\",\n"
                        + "            \"networkName\": \"%s\"\n"
                        + "          }\n"
                        + "        ],\n"
                        + "        \"inbound\": false\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"resourceType\": \"%s\"\n"
                        + "}",
                givenSenderName,
                givenCountryCode,
                givenCountryName,
                givenChannel,
                givenMccNnc,
                givenNetworkName,
                givenResourceType);

        setUpSuccessPostRequest(COVERAGE_LOOKUP, expectedRequest, givenResponse);

        ResourcesApi api = new ResourcesApi(getApiClient());

        ResourcesIbResourceCoverageKey coverageKey =
                new ResourcesAlphaCoverageKey().senderName(givenSenderName).countryCode(givenCountryCode);

        Consumer<ResourcesIbResourceCoverageInfo> assertions = (response) -> {
            then(response).isNotNull();

            ResourcesAlphaCoverageInfo alphaCoverageInfo = (ResourcesAlphaCoverageInfo) response;
            then(alphaCoverageInfo.getSenderName()).isEqualTo(givenSenderName);
            then(alphaCoverageInfo.getCountryCode()).isEqualTo(givenCountryCode);
            then(alphaCoverageInfo.getCountryName()).isEqualTo(givenCountryName);
            then(alphaCoverageInfo.getResourceType()).isEqualTo(givenResourceType);

            Set<ResourcesIbResourceCapability> capabilities = alphaCoverageInfo.getCapabilities();
            then(capabilities).isNotNull();
            then(capabilities).hasSize(1);

            ResourcesIbResourceCapability capability = capabilities.iterator().next();
            then(capability.getChannel()).isEqualTo(givenChannel);

            ResourcesIbResourceCoverage coverage = capability.getCoverage();
            then(coverage).isNotNull();
            then(coverage.getInbound()).isFalse();

            Set<ResourcesNetworkView> outbound = coverage.getOutbound();
            then(outbound).isNotNull();
            then(outbound).hasSize(1);

            ResourcesNetworkView network = outbound.iterator().next();
            then(network.getMccNnc()).isEqualTo(givenMccNnc);
            then(network.getNetworkName()).isEqualTo(givenNetworkName);
        };

        var call = api.lookupResourceCoverage(coverageKey);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetResourceRequirements() {
        String givenType = "NUMBER_PURCHASE";
        int givenQuantity = 1;
        String givenNumberType = "TEN_DIGIT_LONG_CODE";
        String givenCountryCode = "US";
        ResourcesResourceNumberCapability givenCapabilitySms = ResourcesResourceNumberCapability.SMS;
        ResourcesResourceNumberCapability givenCapabilityVoice = ResourcesResourceNumberCapability.VOICE;

        String givenCompanyNameKey = "companyName";
        String givenCompanyNameName = "Company Name";
        String givenCompanyNameDescription = "The name of the company.";
        ResourcesCategory givenCompanyNameCategory = ResourcesCategory.BUSINESS_DETAILS;
        int givenCompanyNameMinLength = 3;
        int givenCompanyNameMaxLength = 30;
        String givenCompanyNamePattern = "^[a-zA-Z0-9]+$";

        String givenMonthlyCallsKey = "monthlyCallsVolume";
        String givenMonthlyCallsName = "Monthly Calls Volume";
        String givenMonthlyCallsDescription = "Monthly volume of calls.";
        ResourcesCategory givenMonthlyCallsCategory = ResourcesCategory.USE_CASE_DETAILS;
        String givenMonthlyCallsOption1 = "Up to 1000 calls";
        String givenMonthlyCallsOption2 = "1000 - 10000 calls";
        String givenMonthlyCallsOption3 = "More than 10000 calls";

        String givenFoundedYearKey = "companyFoundedYear";
        String givenFoundedYearName = "Company Founded Year";
        String givenFoundedYearDescription = "Founded year of company.";
        ResourcesCategory givenFoundedYearCategory = ResourcesCategory.BUSINESS_DETAILS;
        int givenFoundedYearMinValue = 1900;
        int givenFoundedYearMaxValue = 2025;

        String givenEmailKey = "companyEmailAddresses";
        String givenEmailName = "Company Email Addresses";
        String givenEmailDescription = "Additional emails of the company.";
        ResourcesCategory givenEmailCategory = ResourcesCategory.BUSINESS_DETAILS;

        String givenWebsiteKey = "companyWebsite";
        String givenWebsiteName = "Company Website";
        String givenWebsiteDescription = "The website of the company.";
        ResourcesCategory givenWebsiteCategory = ResourcesCategory.BUSINESS_DETAILS;

        String givenPhoneKey = "phoneNumber";
        String givenPhoneName = "Phone Number";
        String givenPhoneDescription = "The phone number of the company.";
        ResourcesCategory givenPhoneCategory = ResourcesCategory.CONTACT_INFORMATION;

        String givenRegDocKey = "companyRegistrationDocument";
        String givenRegDocName = "Company Registration Document";
        String givenRegDocDescription = "The document that proves the registration of the company.";
        ResourcesCategory givenRegDocCategory = ResourcesCategory.BUSINESS_DETAILS;

        String givenAddInfoKey = "additionalInformation";
        String givenAddInfoName = "Additional Information";
        String givenAddInfoDescription =
                "Additional information that need to be provided by filling document and uploading it. Used for testing DO NOT MODIFY IT";
        ResourcesCategory givenAddInfoCategory = ResourcesCategory.OTHER;
        String givenAddInfoDocumentId =
                "103AFCC51DC08FDD351D6ACB689FA0711AC0054C882E46DD6316C695FD00B6E12EB107C95F4401F3B4611F431B22A5538D40494D62FA30D7647AFB577480540A";
        ResourcesDocumentType givenAddInfoDocumentType = ResourcesDocumentType.TEMPLATE;

        String expectedRequest = String.format(
                "{\n"
                        + "  \"type\": \"%s\",\n"
                        + "  \"quantity\": %d,\n"
                        + "  \"numberType\": \"%s\",\n"
                        + "  \"capabilities\": [\"%s\", \"%s\"],\n"
                        + "  \"countryCode\": \"%s\"\n"
                        + "}",
                givenType, givenQuantity, givenNumberType, givenCapabilitySms, givenCapabilityVoice, givenCountryCode);

        String givenResponse = String.format(
                "{\n"
                        + "  \"requirements\": [\n"
                        + "    {\n"
                        + "      \"key\": \"%s\",\n"
                        + "      \"type\": \"TEXT\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"description\": \"%s\",\n"
                        + "      \"category\": \"%s\",\n"
                        + "      \"required\": true,\n"
                        + "      \"validation\": {\n"
                        + "        \"minLength\": %d,\n"
                        + "        \"maxLength\": %d,\n"
                        + "        \"pattern\": \"%s\"\n"
                        + "      }\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"key\": \"%s\",\n"
                        + "      \"type\": \"TEXT\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"options\": [\"%s\", \"%s\", \"%s\"],\n"
                        + "      \"description\": \"%s\",\n"
                        + "      \"category\": \"%s\",\n"
                        + "      \"required\": true\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"key\": \"%s\",\n"
                        + "      \"type\": \"INTEGER\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"description\": \"%s\",\n"
                        + "      \"category\": \"%s\",\n"
                        + "      \"required\": true,\n"
                        + "      \"validation\": {\n"
                        + "        \"minValue\": %d,\n"
                        + "        \"maxValue\": %d\n"
                        + "      }\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"key\": \"%s\",\n"
                        + "      \"type\": \"EMAIL\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"description\": \"%s\",\n"
                        + "      \"category\": \"%s\",\n"
                        + "      \"required\": false,\n"
                        + "      \"multipleValuesSupported\": true\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"key\": \"%s\",\n"
                        + "      \"type\": \"URL\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"description\": \"%s\",\n"
                        + "      \"category\": \"%s\",\n"
                        + "      \"required\": true\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"key\": \"%s\",\n"
                        + "      \"type\": \"GSM\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"description\": \"%s\",\n"
                        + "      \"category\": \"%s\",\n"
                        + "      \"required\": true\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"key\": \"%s\",\n"
                        + "      \"type\": \"DOCUMENT\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"description\": \"%s\",\n"
                        + "      \"category\": \"%s\",\n"
                        + "      \"required\": true\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"key\": \"%s\",\n"
                        + "      \"type\": \"DOCUMENT\",\n"
                        + "      \"name\": \"%s\",\n"
                        + "      \"description\": \"%s\",\n"
                        + "      \"category\": \"%s\",\n"
                        + "      \"required\": false,\n"
                        + "      \"attachment\": {\n"
                        + "        \"documentId\": \"%s\",\n"
                        + "        \"documentType\": \"%s\"\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenCompanyNameKey,
                givenCompanyNameName,
                givenCompanyNameDescription,
                givenCompanyNameCategory,
                givenCompanyNameMinLength,
                givenCompanyNameMaxLength,
                givenCompanyNamePattern,
                givenMonthlyCallsKey,
                givenMonthlyCallsName,
                givenMonthlyCallsOption1,
                givenMonthlyCallsOption2,
                givenMonthlyCallsOption3,
                givenMonthlyCallsDescription,
                givenMonthlyCallsCategory,
                givenFoundedYearKey,
                givenFoundedYearName,
                givenFoundedYearDescription,
                givenFoundedYearCategory,
                givenFoundedYearMinValue,
                givenFoundedYearMaxValue,
                givenEmailKey,
                givenEmailName,
                givenEmailDescription,
                givenEmailCategory,
                givenWebsiteKey,
                givenWebsiteName,
                givenWebsiteDescription,
                givenWebsiteCategory,
                givenPhoneKey,
                givenPhoneName,
                givenPhoneDescription,
                givenPhoneCategory,
                givenRegDocKey,
                givenRegDocName,
                givenRegDocDescription,
                givenRegDocCategory,
                givenAddInfoKey,
                givenAddInfoName,
                givenAddInfoDescription,
                givenAddInfoCategory,
                givenAddInfoDocumentId,
                givenAddInfoDocumentType);

        setUpSuccessPostRequest(REQUIREMENTS_LOOKUP, expectedRequest, givenResponse);

        ResourcesApi api = new ResourcesApi(getApiClient());

        ResourcesRequirementsLookupBody request = new ResourcesNumberRequirementSpecsRequestApiDoc()
                .type(ResourcesNumberRequirementSpecsRequestApiDoc.TypeEnum.NUMBER_PURCHASE)
                .quantity(givenQuantity)
                .numberType(ResourcesResourceNumberType.TEN_DIGIT_LONG_CODE)
                .capabilities(List.of(givenCapabilitySms, givenCapabilityVoice))
                .countryCode(givenCountryCode);

        Consumer<ResourcesRequirementSpecs> assertions = (response) -> {
            then(response).isNotNull();

            List<ResourcesRequirementSpec> requirements = response.getRequirements();
            then(requirements).isNotNull();
            then(requirements).hasSize(8);

            ResourcesTextRequirementSpec companyName = (ResourcesTextRequirementSpec) requirements.get(0);
            then(companyName.getKey()).isEqualTo(givenCompanyNameKey);
            then(companyName.getType()).isEqualTo(ResourcesFieldType.TEXT);
            then(companyName.getName()).isEqualTo(givenCompanyNameName);
            then(companyName.getDescription()).isEqualTo(givenCompanyNameDescription);
            then(companyName.getCategory()).isEqualTo(givenCompanyNameCategory);
            then(companyName.getRequired()).isTrue();
            ResourcesTextRequirementValidation companyNameValidation = companyName.getValidation();
            then(companyNameValidation).isNotNull();
            then(companyNameValidation.getMinLength()).isEqualTo(givenCompanyNameMinLength);
            then(companyNameValidation.getMaxLength()).isEqualTo(givenCompanyNameMaxLength);
            then(companyNameValidation.getPattern()).isEqualTo(givenCompanyNamePattern);

            ResourcesTextRequirementSpec monthlyCalls = (ResourcesTextRequirementSpec) requirements.get(1);
            then(monthlyCalls.getKey()).isEqualTo(givenMonthlyCallsKey);
            then(monthlyCalls.getType()).isEqualTo(ResourcesFieldType.TEXT);
            then(monthlyCalls.getName()).isEqualTo(givenMonthlyCallsName);
            then(monthlyCalls.getDescription()).isEqualTo(givenMonthlyCallsDescription);
            then(monthlyCalls.getCategory()).isEqualTo(givenMonthlyCallsCategory);
            then(monthlyCalls.getRequired()).isTrue();
            then(monthlyCalls.getOptions())
                    .isEqualTo(List.of(givenMonthlyCallsOption1, givenMonthlyCallsOption2, givenMonthlyCallsOption3));

            ResourcesIntegerRequirementSpec foundedYear = (ResourcesIntegerRequirementSpec) requirements.get(2);
            then(foundedYear.getKey()).isEqualTo(givenFoundedYearKey);
            then(foundedYear.getType()).isEqualTo(ResourcesFieldType.INTEGER);
            then(foundedYear.getName()).isEqualTo(givenFoundedYearName);
            then(foundedYear.getDescription()).isEqualTo(givenFoundedYearDescription);
            then(foundedYear.getCategory()).isEqualTo(givenFoundedYearCategory);
            then(foundedYear.getRequired()).isTrue();
            ResourcesIntegerRequirementValidation foundedYearValidation = foundedYear.getValidation();
            then(foundedYearValidation).isNotNull();
            then(foundedYearValidation.getMinValue()).isEqualTo(givenFoundedYearMinValue);
            then(foundedYearValidation.getMaxValue()).isEqualTo(givenFoundedYearMaxValue);

            ResourcesEmailRequirementSpec email = (ResourcesEmailRequirementSpec) requirements.get(3);
            then(email.getKey()).isEqualTo(givenEmailKey);
            then(email.getType()).isEqualTo(ResourcesFieldType.EMAIL);
            then(email.getName()).isEqualTo(givenEmailName);
            then(email.getDescription()).isEqualTo(givenEmailDescription);
            then(email.getCategory()).isEqualTo(givenEmailCategory);
            then(email.getRequired()).isFalse();
            then(email.getMultipleValuesSupported()).isTrue();

            ResourcesUrlRequirementSpec website = (ResourcesUrlRequirementSpec) requirements.get(4);
            then(website.getKey()).isEqualTo(givenWebsiteKey);
            then(website.getType()).isEqualTo(ResourcesFieldType.URL);
            then(website.getName()).isEqualTo(givenWebsiteName);
            then(website.getDescription()).isEqualTo(givenWebsiteDescription);
            then(website.getCategory()).isEqualTo(givenWebsiteCategory);
            then(website.getRequired()).isTrue();

            ResourcesGsmRequirementSpec phone = (ResourcesGsmRequirementSpec) requirements.get(5);
            then(phone.getKey()).isEqualTo(givenPhoneKey);
            then(phone.getType()).isEqualTo(ResourcesFieldType.GSM);
            then(phone.getName()).isEqualTo(givenPhoneName);
            then(phone.getDescription()).isEqualTo(givenPhoneDescription);
            then(phone.getCategory()).isEqualTo(givenPhoneCategory);
            then(phone.getRequired()).isTrue();

            ResourcesDocumentRequirementSpec regDoc = (ResourcesDocumentRequirementSpec) requirements.get(6);
            then(regDoc.getKey()).isEqualTo(givenRegDocKey);
            then(regDoc.getType()).isEqualTo(ResourcesFieldType.DOCUMENT);
            then(regDoc.getName()).isEqualTo(givenRegDocName);
            then(regDoc.getDescription()).isEqualTo(givenRegDocDescription);
            then(regDoc.getCategory()).isEqualTo(givenRegDocCategory);
            then(regDoc.getRequired()).isTrue();

            ResourcesDocumentRequirementSpec addInfo = (ResourcesDocumentRequirementSpec) requirements.get(7);
            then(addInfo.getKey()).isEqualTo(givenAddInfoKey);
            then(addInfo.getType()).isEqualTo(ResourcesFieldType.DOCUMENT);
            then(addInfo.getName()).isEqualTo(givenAddInfoName);
            then(addInfo.getDescription()).isEqualTo(givenAddInfoDescription);
            then(addInfo.getCategory()).isEqualTo(givenAddInfoCategory);
            then(addInfo.getRequired()).isFalse();
            ResourcesAttachment attachment = addInfo.getAttachment();
            then(attachment).isNotNull();
            then(attachment.getDocumentId()).isEqualTo(givenAddInfoDocumentId);
            then(attachment.getDocumentType()).isEqualTo(givenAddInfoDocumentType);
        };

        var call = api.resourcesRequirementsLookup(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldSubmitResourceRequest() {
        String givenType = "NUMBER_PURCHASE";
        int givenQuantity = 1;
        String givenNumberType = "TEN_DIGIT_LONG_CODE";
        String givenCapabilitySms = "SMS";
        String givenCapabilityVoice = "VOICE";
        String givenCountryCode = "US";
        String givenRequirementKey = "companyWebsite";
        String givenRequirementValue = "example.com";

        String givenId = "a0c63335-f841-4d43-9ef8-e0765a233f29";

        String expectedRequest = String.format(
                "{\n"
                        + "  \"type\": \"%s\",\n"
                        + "  \"quantity\": %d,\n"
                        + "  \"numberType\": \"%s\",\n"
                        + "  \"capabilities\": [\"%s\", \"%s\"],\n"
                        + "  \"countryCode\": \"%s\",\n"
                        + "  \"requirements\": [\n"
                        + "    {\n"
                        + "      \"key\": \"%s\",\n"
                        + "      \"value\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenType,
                givenQuantity,
                givenNumberType,
                givenCapabilitySms,
                givenCapabilityVoice,
                givenCountryCode,
                givenRequirementKey,
                givenRequirementValue);

        String givenResponse = String.format("{\n" + "  \"id\": \"%s\"\n" + "}", givenId);

        setUpSuccessPostRequest(RESOURCE_REQUESTS, expectedRequest, givenResponse);

        ResourcesApi api = new ResourcesApi(getApiClient());

        ResourcesSubmitResourceRequestBody request = new ResourcesNumberResourceOrderRequestApiDoc()
                .type(ResourcesNumberResourceOrderRequestApiDoc.TypeEnum.NUMBER_PURCHASE)
                .quantity(givenQuantity)
                .numberType(ResourcesResourceNumberType.TEN_DIGIT_LONG_CODE)
                .capabilities(List.of(ResourcesResourceNumberCapability.SMS, ResourcesResourceNumberCapability.VOICE))
                .countryCode(givenCountryCode)
                .requirements(List.of(new ResourcesFilledRequirement()
                        .key(givenRequirementKey)
                        .value(givenRequirementValue)));

        Consumer<ResourcesResourceOrderIdentifier> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getId()).isEqualTo(UUID.fromString(givenId));
        };

        var call = api.submitResourceRequest(request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetResourceRequests() {
        String givenAlphaId = "a0c63335-f841-4d43-9ef8-e0765a233f29";
        ResourcesAlphaResourceOrderApiDoc.TypeEnum givenAlphaType =
                ResourcesAlphaResourceOrderApiDoc.TypeEnum.ALPHANUMERIC_REGISTRATION;
        ResourcesResourceOrderStatus givenAlphaStatus = ResourcesResourceOrderStatus.PENDING;
        String givenAlphaCountryCode = "HR";
        String givenAlphaSenderName = "Example sender";
        String givenAlphaEmail = "examples@example.com";
        String givenAlphaAdditionalEmail = "examples@example.com";
        String givenAlphaRequestedDate = "2019-08-24T14:15:22Z";
        String givenAlphaRequirementKey = "companyWebsite";
        String givenAlphaRequirementValue = "example.com";
        String givenAlphaApplicationId = "default";

        String givenNumberId = "a0c63335-f841-4d43-9ef8-e0765a233f29";
        ResourcesNumberResourceOrderApiDoc.TypeEnum givenNumberType =
                ResourcesNumberResourceOrderApiDoc.TypeEnum.NUMBER_PURCHASE;
        String givenNumberCountryCode = "HR";
        String givenNumberEmail = "examples@example.com";
        String givenNumberRequestedDate = "2019-08-24T14:15:22Z";
        ResourcesResourceOrderStatus givenNumberStatus = ResourcesResourceOrderStatus.PENDING;
        ResourcesResourceNumberType givenNumberNumberType = ResourcesResourceNumberType.TEN_DIGIT_LONG_CODE;
        ResourcesResourceNumberCapability givenNumberCapabilitySms = ResourcesResourceNumberCapability.SMS;
        ResourcesResourceNumberCapability givenNumberCapabilityVoice = ResourcesResourceNumberCapability.VOICE;
        int givenNumberQuantity = 1;
        String givenNumberRequirementKey = "companyWebsite";
        String givenNumberRequirementValue = "example.com";
        String givenNumberFeedbackKey = "companyWebsite";
        ResourcesFeedbackCode givenNumberFeedbackCode = ResourcesFeedbackCode.OTHER;
        String givenNumberFeedbackText = "The provided company website does not exist.";
        String givenNumberApplicationId = "app-id";
        String givenNumberEntityId = "entity-id";

        int givenPage = 0;
        int givenSize = 20;
        int givenTotalPages = 1;
        long givenTotalResults = 1L;

        String givenResponse = String.format(
                "{\n"
                        + "  \"results\": [\n"
                        + "    {\n"
                        + "      \"id\": \"%s\",\n"
                        + "      \"type\": \"%s\",\n"
                        + "      \"status\": \"%s\",\n"
                        + "      \"countryCode\": \"%s\",\n"
                        + "      \"senderName\": \"%s\",\n"
                        + "      \"requestedByEmailAddress\": \"%s\",\n"
                        + "      \"additionalContactEmailAddresses\": [\"%s\"],\n"
                        + "      \"requestedDate\": \"%s\",\n"
                        + "      \"requirements\": [\n"
                        + "        {\n"
                        + "          \"key\": \"%s\",\n"
                        + "          \"value\": \"%s\"\n"
                        + "        }\n"
                        + "      ],\n"
                        + "      \"platform\": {\n"
                        + "        \"applicationId\": \"%s\"\n"
                        + "      }\n"
                        + "    },\n"
                        + "    {\n"
                        + "      \"id\": \"%s\",\n"
                        + "      \"type\": \"%s\",\n"
                        + "      \"countryCode\": \"%s\",\n"
                        + "      \"requestedByEmailAddress\": \"%s\",\n"
                        + "      \"requestedDate\": \"%s\",\n"
                        + "      \"status\": \"%s\",\n"
                        + "      \"numberType\": \"%s\",\n"
                        + "      \"capabilities\": [\"%s\", \"%s\"],\n"
                        + "      \"quantity\": %d,\n"
                        + "      \"requirements\": [\n"
                        + "        {\n"
                        + "          \"key\": \"%s\",\n"
                        + "          \"value\": \"%s\"\n"
                        + "        }\n"
                        + "      ],\n"
                        + "      \"requirementsFeedback\": [\n"
                        + "        {\n"
                        + "          \"key\": \"%s\",\n"
                        + "          \"code\": \"%s\",\n"
                        + "          \"feedback\": \"%s\"\n"
                        + "        }\n"
                        + "      ],\n"
                        + "      \"platform\": {\n"
                        + "        \"applicationId\": \"%s\",\n"
                        + "        \"entityId\": \"%s\"\n"
                        + "      }\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"paging\": {\n"
                        + "    \"page\": %d,\n"
                        + "    \"size\": %d,\n"
                        + "    \"totalPages\": %d,\n"
                        + "    \"totalResults\": %d\n"
                        + "  }\n"
                        + "}",
                givenAlphaId,
                givenAlphaType,
                givenAlphaStatus,
                givenAlphaCountryCode,
                givenAlphaSenderName,
                givenAlphaEmail,
                givenAlphaAdditionalEmail,
                givenAlphaRequestedDate,
                givenAlphaRequirementKey,
                givenAlphaRequirementValue,
                givenAlphaApplicationId,
                givenNumberId,
                givenNumberType,
                givenNumberCountryCode,
                givenNumberEmail,
                givenNumberRequestedDate,
                givenNumberStatus,
                givenNumberNumberType,
                givenNumberCapabilitySms,
                givenNumberCapabilityVoice,
                givenNumberQuantity,
                givenNumberRequirementKey,
                givenNumberRequirementValue,
                givenNumberFeedbackKey,
                givenNumberFeedbackCode,
                givenNumberFeedbackText,
                givenNumberApplicationId,
                givenNumberEntityId,
                givenPage,
                givenSize,
                givenTotalPages,
                givenTotalResults);

        setUpSuccessGetRequest(RESOURCE_REQUESTS, Map.of(), givenResponse);

        ResourcesApi api = new ResourcesApi(getApiClient());

        Consumer<ResourcesPageResourceOrderApiDoc> assertions = (response) -> {
            then(response).isNotNull();

            List<ResourcesPageResourceOrderApiDocResultsInner> results = response.getResults();
            then(results).isNotNull();
            then(results).hasSize(2);

            ResourcesAlphaResourceOrderApiDoc alphaOrder = (ResourcesAlphaResourceOrderApiDoc) results.get(0);
            then(alphaOrder.getId()).isEqualTo(UUID.fromString(givenAlphaId));
            then(alphaOrder.getType()).isEqualTo(givenAlphaType);
            then(alphaOrder.getStatus()).isEqualTo(givenAlphaStatus);
            then(alphaOrder.getCountryCode()).isEqualTo(givenAlphaCountryCode);
            then(alphaOrder.getSenderName()).isEqualTo(givenAlphaSenderName);
            then(alphaOrder.getRequestedByEmailAddress()).isEqualTo(givenAlphaEmail);
            then(alphaOrder.getAdditionalContactEmailAddresses()).isEqualTo(List.of(givenAlphaAdditionalEmail));
            then(alphaOrder.getRequirements()).hasSize(1);
            then(alphaOrder.getRequirements().get(0).getKey()).isEqualTo(givenAlphaRequirementKey);
            then(alphaOrder.getRequirements().get(0).getValue()).isEqualTo(givenAlphaRequirementValue);
            Platform alphaPlatform = alphaOrder.getPlatform();
            then(alphaPlatform).isNotNull();
            then(alphaPlatform.getApplicationId()).isEqualTo(givenAlphaApplicationId);

            ResourcesNumberResourceOrderApiDoc numberOrder = (ResourcesNumberResourceOrderApiDoc) results.get(1);
            then(numberOrder.getId()).isEqualTo(UUID.fromString(givenNumberId));
            then(numberOrder.getType()).isEqualTo(givenNumberType);
            then(numberOrder.getStatus()).isEqualTo(givenNumberStatus);
            then(numberOrder.getCountryCode()).isEqualTo(givenNumberCountryCode);
            then(numberOrder.getRequestedByEmailAddress()).isEqualTo(givenNumberEmail);
            then(numberOrder.getNumberType()).isEqualTo(givenNumberNumberType);
            then(numberOrder.getCapabilities())
                    .isEqualTo(List.of(givenNumberCapabilitySms, givenNumberCapabilityVoice));
            then(numberOrder.getQuantity()).isEqualTo(givenNumberQuantity);
            then(numberOrder.getRequirements()).hasSize(1);
            then(numberOrder.getRequirements().get(0).getKey()).isEqualTo(givenNumberRequirementKey);
            then(numberOrder.getRequirements().get(0).getValue()).isEqualTo(givenNumberRequirementValue);
            then(numberOrder.getRequirementsFeedback()).hasSize(1);
            ResourcesFilledRequirementFeedback feedback =
                    numberOrder.getRequirementsFeedback().get(0);
            then(feedback.getKey()).isEqualTo(givenNumberFeedbackKey);
            then(feedback.getCode()).isEqualTo(givenNumberFeedbackCode);
            then(feedback.getFeedback()).isEqualTo(givenNumberFeedbackText);
            Platform numberPlatform = numberOrder.getPlatform();
            then(numberPlatform).isNotNull();
            then(numberPlatform.getApplicationId()).isEqualTo(givenNumberApplicationId);
            then(numberPlatform.getEntityId()).isEqualTo(givenNumberEntityId);

            PageInfo paging = response.getPaging();
            then(paging).isNotNull();
            then(paging.getPage()).isEqualTo(givenPage);
            then(paging.getSize()).isEqualTo(givenSize);
            then(paging.getTotalPages()).isEqualTo(givenTotalPages);
            then(paging.getTotalResults()).isEqualTo(givenTotalResults);
        };

        var call = api.getResourceRequests()
                .countryCode(List.of("US", "HR"))
                .status(List.of(ResourcesResourceOrderStatus.PENDING, ResourcesResourceOrderStatus.COMPLETED))
                .type(List.of("ALPHANUMERIC_REGISTRATION", "NUMBER_PURCHASE", "RCS_SENDER_LAUNCH"))
                .sort(List.of("status,desc"));
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldGetResourceRequest() {
        String givenId = "a0c63335-f841-4d43-9ef8-e0765a233f29";
        ResourcesAlphaResourceOrderApiDoc.TypeEnum givenType =
                ResourcesAlphaResourceOrderApiDoc.TypeEnum.ALPHANUMERIC_REGISTRATION;
        ResourcesResourceOrderStatus givenStatus = ResourcesResourceOrderStatus.UPDATE_REQUESTED;
        String givenCountryCode = "HR";
        String givenSenderName = "Example sender";
        String givenRequestedByEmail = "examples@example.com";
        String givenAdditionalEmail = "examples@example.com";
        String givenRequestedDate = "2019-08-24T14:15:22Z";
        ResourcesTrafficOrigin givenTrafficOrigin = ResourcesTrafficOrigin.LOCAL;
        String givenRequirementKey = "companyWebsite";
        String givenRequirementValue = "example.com";
        String givenFeedbackKey = "companyWebsite";
        ResourcesFeedbackCode givenFeedbackCode = ResourcesFeedbackCode.OTHER;
        String givenFeedbackText = "The provided company website does not exist.";
        String givenApplicationId = "app-id";
        String givenEntityId = "entity-id";

        String givenResponse = String.format(
                "{\n"
                        + "  \"id\": \"%s\",\n"
                        + "  \"type\": \"%s\",\n"
                        + "  \"status\": \"%s\",\n"
                        + "  \"countryCode\": \"%s\",\n"
                        + "  \"senderName\": \"%s\",\n"
                        + "  \"requestedByEmailAddress\": \"%s\",\n"
                        + "  \"additionalContactEmailAddresses\": [\"%s\"],\n"
                        + "  \"requestedDate\": \"%s\",\n"
                        + "  \"trafficOrigin\": \"%s\",\n"
                        + "  \"requirements\": [\n"
                        + "    {\n"
                        + "      \"key\": \"%s\",\n"
                        + "      \"value\": \"%s\"\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"requirementsFeedback\": [\n"
                        + "    {\n"
                        + "      \"key\": \"%s\",\n"
                        + "      \"code\": \"%s\",\n"
                        + "      \"feedback\": \"%s\"\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"platform\": {\n"
                        + "    \"applicationId\": \"%s\",\n"
                        + "    \"entityId\": \"%s\"\n"
                        + "  }\n"
                        + "}",
                givenId,
                givenType,
                givenStatus,
                givenCountryCode,
                givenSenderName,
                givenRequestedByEmail,
                givenAdditionalEmail,
                givenRequestedDate,
                givenTrafficOrigin,
                givenRequirementKey,
                givenRequirementValue,
                givenFeedbackKey,
                givenFeedbackCode,
                givenFeedbackText,
                givenApplicationId,
                givenEntityId);

        setUpSuccessGetRequest(RESOURCE_REQUEST.replace("{id}", givenId), Map.of(), givenResponse);

        ResourcesApi api = new ResourcesApi(getApiClient());

        Consumer<GetResourceRequest200Response> assertions = (response) -> {
            then(response).isNotNull();
            then(response).isInstanceOf(ResourcesAlphaResourceOrderApiDoc.class);

            ResourcesAlphaResourceOrderApiDoc order = (ResourcesAlphaResourceOrderApiDoc) response;
            then(order.getId()).isEqualTo(UUID.fromString(givenId));
            then(order.getType()).isEqualTo(givenType);
            then(order.getStatus()).isEqualTo(givenStatus);
            then(order.getCountryCode()).isEqualTo(givenCountryCode);
            then(order.getSenderName()).isEqualTo(givenSenderName);
            then(order.getRequestedByEmailAddress()).isEqualTo(givenRequestedByEmail);
            then(order.getAdditionalContactEmailAddresses()).isEqualTo(List.of(givenAdditionalEmail));
            then(order.getTrafficOrigin()).isEqualTo(givenTrafficOrigin);

            then(order.getRequirements()).hasSize(1);
            ResourcesFilledRequirement requirement = order.getRequirements().get(0);
            then(requirement.getKey()).isEqualTo(givenRequirementKey);
            then(requirement.getValue()).isEqualTo(givenRequirementValue);

            then(order.getRequirementsFeedback()).hasSize(1);
            ResourcesFilledRequirementFeedback feedback =
                    order.getRequirementsFeedback().get(0);
            then(feedback.getKey()).isEqualTo(givenFeedbackKey);
            then(feedback.getCode()).isEqualTo(givenFeedbackCode);
            then(feedback.getFeedback()).isEqualTo(givenFeedbackText);

            Platform platform = order.getPlatform();
            then(platform).isNotNull();
            then(platform.getApplicationId()).isEqualTo(givenApplicationId);
            then(platform.getEntityId()).isEqualTo(givenEntityId);
        };

        var call = api.getResourceRequest(UUID.fromString(givenId));
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldUpdateResourceRequest() {
        String givenId = "a0c63335-f841-4d43-9ef8-e0765a233f29";
        String givenRequirementKey = "companyWebsite";
        String givenRequirementValue = "example.com";

        ResourcesNumberResourceOrderApiDoc.TypeEnum givenType =
                ResourcesNumberResourceOrderApiDoc.TypeEnum.NUMBER_PURCHASE;
        ResourcesResourceOrderStatus givenStatus = ResourcesResourceOrderStatus.AUTOMATIC_VALIDATION;
        String givenCountryCode = "HR";
        String givenRequestedByEmail = "examples@example.com";
        String givenRequestedDate = "2019-08-24T14:15:22Z";
        ResourcesResourceNumberType givenNumberType = ResourcesResourceNumberType.TEN_DIGIT_LONG_CODE;
        ResourcesResourceNumberCapability givenCapabilitySms = ResourcesResourceNumberCapability.SMS;
        ResourcesResourceNumberCapability givenCapabilityVoice = ResourcesResourceNumberCapability.VOICE;
        int givenQuantity = 1;
        String givenNote = "Example note";
        String givenApplicationId = "app-id";
        String givenEntityId = "entity-id";

        String expectedRequest = String.format(
                "{\n"
                        + "  \"requirements\": [\n"
                        + "    {\n"
                        + "      \"key\": \"%s\",\n"
                        + "      \"value\": \"%s\"\n"
                        + "    }\n"
                        + "  ]\n"
                        + "}",
                givenRequirementKey, givenRequirementValue);

        String givenResponse = String.format(
                "{\n"
                        + "  \"id\": \"%s\",\n"
                        + "  \"type\": \"%s\",\n"
                        + "  \"status\": \"%s\",\n"
                        + "  \"countryCode\": \"%s\",\n"
                        + "  \"requestedByEmailAddress\": \"%s\",\n"
                        + "  \"requestedDate\": \"%s\",\n"
                        + "  \"numberType\": \"%s\",\n"
                        + "  \"capabilities\": [\"%s\", \"%s\"],\n"
                        + "  \"quantity\": %d,\n"
                        + "  \"note\": \"%s\",\n"
                        + "  \"numbers\": [],\n"
                        + "  \"requirements\": [\n"
                        + "    {\n"
                        + "      \"key\": \"%s\",\n"
                        + "      \"value\": \"%s\"\n"
                        + "    }\n"
                        + "  ],\n"
                        + "  \"platform\": {\n"
                        + "    \"applicationId\": \"%s\",\n"
                        + "    \"entityId\": \"%s\"\n"
                        + "  }\n"
                        + "}",
                givenId,
                givenType,
                givenStatus,
                givenCountryCode,
                givenRequestedByEmail,
                givenRequestedDate,
                givenNumberType,
                givenCapabilitySms,
                givenCapabilityVoice,
                givenQuantity,
                givenNote,
                givenRequirementKey,
                givenRequirementValue,
                givenApplicationId,
                givenEntityId);

        setUpPatchRequest(RESOURCE_REQUEST.replace("{id}", givenId), Map.of(), expectedRequest, givenResponse, 200);

        ResourcesApi api = new ResourcesApi(getApiClient());

        ResourcesUpdateResourceOrderRequest request = new ResourcesUpdateResourceOrderRequest()
                .requirements(List.of(new ResourcesFilledRequirement()
                        .key(givenRequirementKey)
                        .value(givenRequirementValue)));

        Consumer<GetResourceRequest200Response> assertions = (response) -> {
            then(response).isNotNull();
            then(response).isInstanceOf(ResourcesNumberResourceOrderApiDoc.class);

            ResourcesNumberResourceOrderApiDoc order = (ResourcesNumberResourceOrderApiDoc) response;
            then(order.getId()).isEqualTo(UUID.fromString(givenId));
            then(order.getType()).isEqualTo(givenType);
            then(order.getStatus()).isEqualTo(givenStatus);
            then(order.getCountryCode()).isEqualTo(givenCountryCode);
            then(order.getRequestedByEmailAddress()).isEqualTo(givenRequestedByEmail);
            then(order.getNumberType()).isEqualTo(givenNumberType);
            then(order.getCapabilities()).isEqualTo(List.of(givenCapabilitySms, givenCapabilityVoice));
            then(order.getQuantity()).isEqualTo(givenQuantity);
            then(order.getNote()).isEqualTo(givenNote);
            then(order.getNumbers()).isEmpty();

            then(order.getRequirements()).hasSize(1);
            ResourcesFilledRequirement requirement = order.getRequirements().get(0);
            then(requirement.getKey()).isEqualTo(givenRequirementKey);
            then(requirement.getValue()).isEqualTo(givenRequirementValue);

            Platform platform = order.getPlatform();
            then(platform).isNotNull();
            then(platform.getApplicationId()).isEqualTo(givenApplicationId);
            then(platform.getEntityId()).isEqualTo(givenEntityId);
        };

        var call = api.updateResourceRequest(UUID.fromString(givenId), request);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldCancelResourceRequest() {
        String givenId = "a0c63335-f841-4d43-9ef8-e0765a233f29";

        setUpNoBodyPostRequest(CANCEL_RESOURCE_REQUEST.replace("{id}", givenId), Map.of(), 204);

        ResourcesApi api = new ResourcesApi(getApiClient());

        var call = api.cancelResourceRequest(UUID.fromString(givenId));
        testSuccessfulCallWithNoBody(call::executeAsync, 204);
    }

    @Test
    void shouldUploadDocument() throws IOException {
        String givenFileContent = "Test document content";
        String givenDocumentId =
                "103AFCC51DC08FDD351D6ACB689FA071FDF7F7EB92FD6451F62A3AA92EBFA69596150BE4C4BFFBC97182A27D716ED0D3CB67682EF7E0D615EC501064A8B9A201";

        File tempFile = File.createTempFile("document", ".jpg");
        Files.writeString(tempFile.toPath(), givenFileContent);

        String givenResponse = String.format("{\n" + "  \"documentId\": \"%s\"\n" + "}", givenDocumentId);

        setUpMultipartRequest(DOCUMENTS, List.of(new Multipart("document", givenFileContent)), givenResponse, 200);

        ResourcesApi api = new ResourcesApi(getApiClient());

        Consumer<ResourcesDocumentIdentifier> assertions = (response) -> {
            then(response).isNotNull();
            then(response.getDocumentId()).isEqualTo(givenDocumentId);
        };

        var call = api.uploadDocument(tempFile);
        testSuccessfulCall(call::execute, assertions);
        testSuccessfulAsyncCall(call::executeAsync, assertions);
    }

    @Test
    void shouldDownloadDocument() {
        String givenDocumentId =
                "103AFCC51DC08FDD351D6ACB689FA071FDF7F7EB92FD6451F62A3AA92EBFA69596150BE4C4BFFBC97182A27D716ED0D3CB67682EF7E0D615EC501064A8B9A201";
        String givenFileContent = "Test document content";

        setUpSuccessGetRequest(DOCUMENT.replace("{documentId}", givenDocumentId), Map.of(), givenFileContent);

        ResourcesApi api = new ResourcesApi(getApiClient());

        var call = api.downloadDocument(givenDocumentId);
        testSuccessfulCallWithFileResult(call::execute);
    }

    @Test
    void shouldDeleteDocument() {
        String givenDocumentId =
                "103AFCC51DC08FDD351D6ACB689FA071FDF7F7EB92FD6451F62A3AA92EBFA69596150BE4C4BFFBC97182A27D716ED0D3CB67682EF7E0D615EC501064A8B9A201";

        setUpNoResponseBodyDeleteRequest(DOCUMENT.replace("{documentId}", givenDocumentId), Map.of(), 204);

        ResourcesApi api = new ResourcesApi(getApiClient());

        var call = api.deleteDocument(givenDocumentId);
        testSuccessfulCallWithNoBody(call::executeAsync, 204);
    }

    // WEBHOOKS
    private final JSON json = new JSON();

    @Test
    void shouldReceiveResourceRequestStatusUpdate() {
        String givenId = "38a1c2c6-55f2-11ee-a061-325096b39f47";
        String givenReceivedAtString = "2019-08-24T14:15:22.000+0000";
        String givenNumber = "385911234567";
        String givenNumberKey = "8F0792F86035A9F4290821F1EE6BC06A";
        String givenNote = "Please note that these numbers are for testing purposes only.";
        String givenApplicationId = "application-id";
        String givenEntityId = "entity-id";

        String givenRequest = "{\n"
                + "  \"results\": [\n"
                + "    {\n"
                + "      \"event\": \"RESOURCE_REQUEST_STATUS_UPDATE\",\n"
                + "      \"receivedAt\": \""
                + givenReceivedAtString
                + "\",\n"
                + "      \"content\": {\n"
                + "        \"id\": \""
                + givenId
                + "\",\n"
                + "        \"status\": \"COMPLETED\",\n"
                + "        \"type\": \"NUMBER_PURCHASE\",\n"
                + "        \"numbers\": [\n"
                + "          {\n"
                + "            \"number\": \""
                + givenNumber
                + "\",\n"
                + "            \"numberKey\": \""
                + givenNumberKey
                + "\",\n"
                + "            \"status\": \"SUCCESS\"\n"
                + "          }\n"
                + "        ],\n"
                + "        \"requirementsFeedback\": [],\n"
                + "        \"note\": \""
                + givenNote
                + "\"\n"
                + "      },\n"
                + "      \"platform\": {\n"
                + "        \"applicationId\": \""
                + givenApplicationId
                + "\",\n"
                + "        \"entityId\": \""
                + givenEntityId
                + "\"\n"
                + "      }\n"
                + "    }\n"
                + "  ]\n"
                + "}\n";

        ResourcesWebhookNotifApiDocRequestBody requestBody =
                json.deserialize(givenRequest, ResourcesWebhookNotifApiDocRequestBody.class);

        then(requestBody).isNotNull();
        then(requestBody.getResults()).isNotNull();
        then(requestBody.getResults().size()).isEqualTo(1);

        ResourcesWebhookNotifApiDocResult result = requestBody.getResults().get(0);
        then(result.getEvent()).isEqualTo(ResourcesWebhookNotifEventType.RESOURCE_REQUEST_STATUS_UPDATE);
        then(result.getPlatform()).isNotNull();
        then(result.getPlatform().getApplicationId()).isEqualTo(givenApplicationId);
        then(result.getPlatform().getEntityId()).isEqualTo(givenEntityId);

        then(result.getContent()).isNotNull();
        then(result.getContent().getClass()).isEqualTo(ResourcesNumberWebhookNotifApiDoc.class);
        ResourcesNumberWebhookNotifApiDoc content = (ResourcesNumberWebhookNotifApiDoc) result.getContent();
        then(content.getId()).isEqualTo(givenId);
        then(content.getStatus()).isEqualTo(ResourcesNumberWebhookNotifApiDoc.StatusEnum.COMPLETED);
        then(content.getType()).isEqualTo(ResourcesWebhookNotifContentType.NUMBER_PURCHASE);
        then(content.getNumbers()).isNotNull();
        then(content.getNumbers().size()).isEqualTo(1);
        then(content.getNumbers().get(0).getNumber()).isEqualTo(givenNumber);
        then(content.getNumbers().get(0).getNumberKey()).isEqualTo(givenNumberKey);
        then(content.getNumbers().get(0).getStatus()).isEqualTo(ResourcesNumberStatus.SUCCESS);
        then(content.getRequirementsFeedback()).isNotNull();
        then(content.getRequirementsFeedback()).isEmpty();
        then(content.getNote()).isEqualTo(givenNote);
    }
}
