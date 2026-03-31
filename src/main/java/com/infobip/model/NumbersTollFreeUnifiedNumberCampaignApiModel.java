/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/**
 * Represents NumbersTollFreeUnifiedNumberCampaignApiModel model.
 */
public class NumbersTollFreeUnifiedNumberCampaignApiModel {

    private UUID id;

    private String referenceId;

    private String applicationId;

    private String entityId;

    private String name;

    private OffsetDateTime createdDate;

    private OffsetDateTime lastModifiedDate;

    private NumbersCampaignStage stage;

    private NumbersPriorityInfo priority;

    /**
     * Represents type enumeration.
     */
    public enum TypeEnum {
        TOLL_FREE_UNIFIED_NUMBER("TOLL_FREE_UNIFIED_NUMBER");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            for (TypeEnum enumElement : TypeEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private TypeEnum type;

    private NumbersCampaignFeedback campaignFeedback;

    private String privacyPolicyUrl;

    private String termsAndConditionsUrl;

    private NumbersTollFreeMessageVolume messageVolume;

    private Set<String> numbers = null;

    private Set<String> numberKeys = new LinkedHashSet<>();

    private Set<NumbersNumberPreview> numberPreviews = null;

    private NumbersTollFreeUseCase useCase;

    private String programSummary;

    private String exampleMessage;

    private NumbersOptIns optIns;

    private Set<String> optInImageURLs = new LinkedHashSet<>();

    private String additionalInformation;

    private String countryCode;

    private NumbersAddress address;

    private String supportPhone;

    private String supportEmail;

    private String businessContactFirstName;

    private String businessContactLastName;

    private String legalName;

    private String businessDBA;

    private String businessName;

    private String businessWebsite;

    private String customerCareEmail;

    private String taxId;

    private String taxIdIssuingCountry;

    /**
     * Legal entity type of the business.
     */
    public enum LegalEntityTypeEnum {
        PRIVATE_COMPANY("PRIVATE_COMPANY"),
        PUBLIC_COMPANY("PUBLIC_COMPANY"),
        NON_PROFIT("NON_PROFIT"),
        GOVERNMENT("GOVERNMENT"),
        SOLE_PROPRIETOR("SOLE_PROPRIETOR");

        private String value;

        LegalEntityTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LegalEntityTypeEnum fromValue(String value) {
            for (LegalEntityTypeEnum enumElement : LegalEntityTypeEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private LegalEntityTypeEnum legalEntityType;

    private NumbersBusinessRegistrationType businessRegistrationType;

    private String campaignVerifyToken;

    private UUID priorityId;

    /**
     * Sets id.
     * <p>
     * Field description:
     * The identifier for the campaign.
     *
     * @param id
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * The identifier for the campaign.
     *
     * @return id
     */
    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * The identifier for the campaign.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Sets referenceId.
     * <p>
     * Field description:
     * Unique user defined ID for the campaign. While not required, it is recommended to supply a referenceId as the uniqueness constraint will help ensure a campaign is not accidentally created multiple times. Subsequent create requests with the same referenceId will be rejected with an error.
     *
     * @param referenceId
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel referenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }

    /**
     * Returns referenceId.
     * <p>
     * Field description:
     * Unique user defined ID for the campaign. While not required, it is recommended to supply a referenceId as the uniqueness constraint will help ensure a campaign is not accidentally created multiple times. Subsequent create requests with the same referenceId will be rejected with an error.
     *
     * @return referenceId
     */
    @JsonProperty("referenceId")
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets referenceId.
     * <p>
     * Field description:
     * Unique user defined ID for the campaign. While not required, it is recommended to supply a referenceId as the uniqueness constraint will help ensure a campaign is not accidentally created multiple times. Subsequent create requests with the same referenceId will be rejected with an error.
     *
     * @param referenceId
     */
    @JsonProperty("referenceId")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * CPaaS X property identifying an application, a use case or an environment on your system. It should only be set if you are using CPaaS X Applications with your traffic.
     *
     * @param applicationId
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * CPaaS X property identifying an application, a use case or an environment on your system. It should only be set if you are using CPaaS X Applications with your traffic.
     *
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * CPaaS X property identifying an application, a use case or an environment on your system. It should only be set if you are using CPaaS X Applications with your traffic.
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * CPaaS X property identifying an unique actor on your system. Should only be set if you are using CPaaS X Applications with your traffic.
     *
     * @param entityId
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     * <p>
     * Field description:
     * CPaaS X property identifying an unique actor on your system. Should only be set if you are using CPaaS X Applications with your traffic.
     *
     * @return entityId
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * CPaaS X property identifying an unique actor on your system. Should only be set if you are using CPaaS X Applications with your traffic.
     *
     * @param entityId
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * The name of the campaign.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * The name of the campaign.
     * <p>
     * The field is required.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * The name of the campaign.
     * <p>
     * The field is required.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets createdDate.
     * <p>
     * Field description:
     * The date and time when the campaign was created.
     *
     * @param createdDate
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel createdDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Returns createdDate.
     * <p>
     * Field description:
     * The date and time when the campaign was created.
     *
     * @return createdDate
     */
    @JsonProperty("createdDate")
    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets createdDate.
     * <p>
     * Field description:
     * The date and time when the campaign was created.
     *
     * @param createdDate
     */
    @JsonProperty("createdDate")
    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Sets lastModifiedDate.
     * <p>
     * Field description:
     * The date and time when the campaign was last modified.
     *
     * @param lastModifiedDate
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel lastModifiedDate(OffsetDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * Returns lastModifiedDate.
     * <p>
     * Field description:
     * The date and time when the campaign was last modified.
     *
     * @return lastModifiedDate
     */
    @JsonProperty("lastModifiedDate")
    public OffsetDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets lastModifiedDate.
     * <p>
     * Field description:
     * The date and time when the campaign was last modified.
     *
     * @param lastModifiedDate
     */
    @JsonProperty("lastModifiedDate")
    public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Sets stage.
     *
     * @param stage
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel stage(NumbersCampaignStage stage) {
        this.stage = stage;
        return this;
    }

    /**
     * Returns stage.
     *
     * @return stage
     */
    @JsonProperty("stage")
    public NumbersCampaignStage getStage() {
        return stage;
    }

    /**
     * Sets stage.
     *
     * @param stage
     */
    @JsonProperty("stage")
    public void setStage(NumbersCampaignStage stage) {
        this.stage = stage;
    }

    /**
     * Sets priority.
     *
     * @param priority
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel priority(NumbersPriorityInfo priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Returns priority.
     *
     * @return priority
     */
    @JsonProperty("priority")
    public NumbersPriorityInfo getPriority() {
        return priority;
    }

    /**
     * Sets priority.
     *
     * @param priority
     */
    @JsonProperty("priority")
    public void setPriority(NumbersPriorityInfo priority) {
        this.priority = priority;
    }

    /**
     * Sets type.
     *
     * @param type
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Sets campaignFeedback.
     *
     * @param campaignFeedback
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel campaignFeedback(NumbersCampaignFeedback campaignFeedback) {
        this.campaignFeedback = campaignFeedback;
        return this;
    }

    /**
     * Returns campaignFeedback.
     *
     * @return campaignFeedback
     */
    @JsonProperty("campaignFeedback")
    public NumbersCampaignFeedback getCampaignFeedback() {
        return campaignFeedback;
    }

    /**
     * Sets campaignFeedback.
     *
     * @param campaignFeedback
     */
    @JsonProperty("campaignFeedback")
    public void setCampaignFeedback(NumbersCampaignFeedback campaignFeedback) {
        this.campaignFeedback = campaignFeedback;
    }

    /**
     * Sets privacyPolicyUrl.
     * <p>
     * Field description:
     * Public URL to the privacy policy that outlines how user data is collected, stored, and used.
     *
     * @param privacyPolicyUrl
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel privacyPolicyUrl(String privacyPolicyUrl) {
        this.privacyPolicyUrl = privacyPolicyUrl;
        return this;
    }

    /**
     * Returns privacyPolicyUrl.
     * <p>
     * Field description:
     * Public URL to the privacy policy that outlines how user data is collected, stored, and used.
     *
     * @return privacyPolicyUrl
     */
    @JsonProperty("privacyPolicyUrl")
    public String getPrivacyPolicyUrl() {
        return privacyPolicyUrl;
    }

    /**
     * Sets privacyPolicyUrl.
     * <p>
     * Field description:
     * Public URL to the privacy policy that outlines how user data is collected, stored, and used.
     *
     * @param privacyPolicyUrl
     */
    @JsonProperty("privacyPolicyUrl")
    public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
        this.privacyPolicyUrl = privacyPolicyUrl;
    }

    /**
     * Sets termsAndConditionsUrl.
     * <p>
     * Field description:
     * URL where the terms and conditions of the campaign are located.
     *
     * @param termsAndConditionsUrl
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel termsAndConditionsUrl(String termsAndConditionsUrl) {
        this.termsAndConditionsUrl = termsAndConditionsUrl;
        return this;
    }

    /**
     * Returns termsAndConditionsUrl.
     * <p>
     * Field description:
     * URL where the terms and conditions of the campaign are located.
     *
     * @return termsAndConditionsUrl
     */
    @JsonProperty("termsAndConditionsUrl")
    public String getTermsAndConditionsUrl() {
        return termsAndConditionsUrl;
    }

    /**
     * Sets termsAndConditionsUrl.
     * <p>
     * Field description:
     * URL where the terms and conditions of the campaign are located.
     *
     * @param termsAndConditionsUrl
     */
    @JsonProperty("termsAndConditionsUrl")
    public void setTermsAndConditionsUrl(String termsAndConditionsUrl) {
        this.termsAndConditionsUrl = termsAndConditionsUrl;
    }

    /**
     * Sets messageVolume.
     * <p>
     * The field is required.
     *
     * @param messageVolume
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel messageVolume(NumbersTollFreeMessageVolume messageVolume) {
        this.messageVolume = messageVolume;
        return this;
    }

    /**
     * Returns messageVolume.
     * <p>
     * The field is required.
     *
     * @return messageVolume
     */
    @JsonProperty("messageVolume")
    public NumbersTollFreeMessageVolume getMessageVolume() {
        return messageVolume;
    }

    /**
     * Sets messageVolume.
     * <p>
     * The field is required.
     *
     * @param messageVolume
     */
    @JsonProperty("messageVolume")
    public void setMessageVolume(NumbersTollFreeMessageVolume messageVolume) {
        this.messageVolume = messageVolume;
    }

    /**
     * Sets numbers.
     * <p>
     * Field description:
     * US TFN numbers to use with the campaign. Campaign must have at least one TFN number associated before it can be submitted for review. You may only use numbers that are associated with your account inside the Infobip platform. Numbers must be provided in international format including the country prefix, e.g. 18881234567. This property can be used instead of &#39;numberKeys&#39; to specify the campaign numbers; it is not returned in the API response.
     *
     * @param numbers
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel numbers(Set<String> numbers) {
        this.numbers = numbers;
        return this;
    }

    /**
     * Adds and item into numbers.
     * <p>
     * Field description:
     * US TFN numbers to use with the campaign. Campaign must have at least one TFN number associated before it can be submitted for review. You may only use numbers that are associated with your account inside the Infobip platform. Numbers must be provided in international format including the country prefix, e.g. 18881234567. This property can be used instead of &#39;numberKeys&#39; to specify the campaign numbers; it is not returned in the API response.
     *
     * @param numbersItem The item to be added to the list.
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel addNumbersItem(String numbersItem) {
        if (this.numbers == null) {
            this.numbers = new LinkedHashSet<>();
        }
        this.numbers.add(numbersItem);
        return this;
    }

    /**
     * Returns numbers.
     * <p>
     * Field description:
     * US TFN numbers to use with the campaign. Campaign must have at least one TFN number associated before it can be submitted for review. You may only use numbers that are associated with your account inside the Infobip platform. Numbers must be provided in international format including the country prefix, e.g. 18881234567. This property can be used instead of &#39;numberKeys&#39; to specify the campaign numbers; it is not returned in the API response.
     *
     * @return numbers
     */
    @JsonProperty("numbers")
    public Set<String> getNumbers() {
        return numbers;
    }

    /**
     * Sets numbers.
     * <p>
     * Field description:
     * US TFN numbers to use with the campaign. Campaign must have at least one TFN number associated before it can be submitted for review. You may only use numbers that are associated with your account inside the Infobip platform. Numbers must be provided in international format including the country prefix, e.g. 18881234567. This property can be used instead of &#39;numberKeys&#39; to specify the campaign numbers; it is not returned in the API response.
     *
     * @param numbers
     */
    @JsonProperty("numbers")
    public void setNumbers(Set<String> numbers) {
        this.numbers = numbers;
    }

    /**
     * Sets numberKeys.
     * <p>
     * Field description:
     * The numberKey(s) of the numbers to use with the campaign. Campaign must have at least one TFN number associated before it can be submitted for review. Alternatively, you can use the &#39;numbers&#39; property to specify the numbers directly, but note that &#39;numberKeys&#39; property takes precedence if both are specified.
     * <p>
     * The field is required.
     *
     * @param numberKeys
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel numberKeys(Set<String> numberKeys) {
        this.numberKeys = numberKeys;
        return this;
    }

    /**
     * Adds and item into numberKeys.
     * <p>
     * Field description:
     * The numberKey(s) of the numbers to use with the campaign. Campaign must have at least one TFN number associated before it can be submitted for review. Alternatively, you can use the &#39;numbers&#39; property to specify the numbers directly, but note that &#39;numberKeys&#39; property takes precedence if both are specified.
     * <p>
     * The field is required.
     *
     * @param numberKeysItem The item to be added to the list.
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel addNumberKeysItem(String numberKeysItem) {
        if (this.numberKeys == null) {
            this.numberKeys = new LinkedHashSet<>();
        }
        this.numberKeys.add(numberKeysItem);
        return this;
    }

    /**
     * Returns numberKeys.
     * <p>
     * Field description:
     * The numberKey(s) of the numbers to use with the campaign. Campaign must have at least one TFN number associated before it can be submitted for review. Alternatively, you can use the &#39;numbers&#39; property to specify the numbers directly, but note that &#39;numberKeys&#39; property takes precedence if both are specified.
     * <p>
     * The field is required.
     *
     * @return numberKeys
     */
    @JsonProperty("numberKeys")
    public Set<String> getNumberKeys() {
        return numberKeys;
    }

    /**
     * Sets numberKeys.
     * <p>
     * Field description:
     * The numberKey(s) of the numbers to use with the campaign. Campaign must have at least one TFN number associated before it can be submitted for review. Alternatively, you can use the &#39;numbers&#39; property to specify the numbers directly, but note that &#39;numberKeys&#39; property takes precedence if both are specified.
     * <p>
     * The field is required.
     *
     * @param numberKeys
     */
    @JsonProperty("numberKeys")
    public void setNumberKeys(Set<String> numberKeys) {
        this.numberKeys = numberKeys;
    }

    /**
     * Sets numberPreviews.
     * <p>
     * Field description:
     * The number(s) to use with the campaign. This property is read-only and ignored in POST/PUT calls.
     *
     * @param numberPreviews
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel numberPreviews(Set<NumbersNumberPreview> numberPreviews) {
        this.numberPreviews = numberPreviews;
        return this;
    }

    /**
     * Adds and item into numberPreviews.
     * <p>
     * Field description:
     * The number(s) to use with the campaign. This property is read-only and ignored in POST/PUT calls.
     *
     * @param numberPreviewsItem The item to be added to the list.
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel addNumberPreviewsItem(NumbersNumberPreview numberPreviewsItem) {
        if (this.numberPreviews == null) {
            this.numberPreviews = new LinkedHashSet<>();
        }
        this.numberPreviews.add(numberPreviewsItem);
        return this;
    }

    /**
     * Returns numberPreviews.
     * <p>
     * Field description:
     * The number(s) to use with the campaign. This property is read-only and ignored in POST/PUT calls.
     *
     * @return numberPreviews
     */
    @JsonProperty("numberPreviews")
    public Set<NumbersNumberPreview> getNumberPreviews() {
        return numberPreviews;
    }

    /**
     * Sets numberPreviews.
     * <p>
     * Field description:
     * The number(s) to use with the campaign. This property is read-only and ignored in POST/PUT calls.
     *
     * @param numberPreviews
     */
    @JsonProperty("numberPreviews")
    public void setNumberPreviews(Set<NumbersNumberPreview> numberPreviews) {
        this.numberPreviews = numberPreviews;
    }

    /**
     * Sets useCase.
     * <p>
     * The field is required.
     *
     * @param useCase
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel useCase(NumbersTollFreeUseCase useCase) {
        this.useCase = useCase;
        return this;
    }

    /**
     * Returns useCase.
     * <p>
     * The field is required.
     *
     * @return useCase
     */
    @JsonProperty("useCase")
    public NumbersTollFreeUseCase getUseCase() {
        return useCase;
    }

    /**
     * Sets useCase.
     * <p>
     * The field is required.
     *
     * @param useCase
     */
    @JsonProperty("useCase")
    public void setUseCase(NumbersTollFreeUseCase useCase) {
        this.useCase = useCase;
    }

    /**
     * Sets programSummary.
     * <p>
     * Field description:
     * A brief description of the purpose of the campaign.
     * <p>
     * The field is required.
     *
     * @param programSummary
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel programSummary(String programSummary) {
        this.programSummary = programSummary;
        return this;
    }

    /**
     * Returns programSummary.
     * <p>
     * Field description:
     * A brief description of the purpose of the campaign.
     * <p>
     * The field is required.
     *
     * @return programSummary
     */
    @JsonProperty("programSummary")
    public String getProgramSummary() {
        return programSummary;
    }

    /**
     * Sets programSummary.
     * <p>
     * Field description:
     * A brief description of the purpose of the campaign.
     * <p>
     * The field is required.
     *
     * @param programSummary
     */
    @JsonProperty("programSummary")
    public void setProgramSummary(String programSummary) {
        this.programSummary = programSummary;
    }

    /**
     * Sets exampleMessage.
     * <p>
     * Field description:
     * The example message(s) a user may receive from this campaign. Each example message must be at least 20 characters long.
     * <p>
     * The field is required.
     *
     * @param exampleMessage
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel exampleMessage(String exampleMessage) {
        this.exampleMessage = exampleMessage;
        return this;
    }

    /**
     * Returns exampleMessage.
     * <p>
     * Field description:
     * The example message(s) a user may receive from this campaign. Each example message must be at least 20 characters long.
     * <p>
     * The field is required.
     *
     * @return exampleMessage
     */
    @JsonProperty("exampleMessage")
    public String getExampleMessage() {
        return exampleMessage;
    }

    /**
     * Sets exampleMessage.
     * <p>
     * Field description:
     * The example message(s) a user may receive from this campaign. Each example message must be at least 20 characters long.
     * <p>
     * The field is required.
     *
     * @param exampleMessage
     */
    @JsonProperty("exampleMessage")
    public void setExampleMessage(String exampleMessage) {
        this.exampleMessage = exampleMessage;
    }

    /**
     * Sets optIns.
     * <p>
     * The field is required.
     *
     * @param optIns
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel optIns(NumbersOptIns optIns) {
        this.optIns = optIns;
        return this;
    }

    /**
     * Returns optIns.
     * <p>
     * The field is required.
     *
     * @return optIns
     */
    @JsonProperty("optIns")
    public NumbersOptIns getOptIns() {
        return optIns;
    }

    /**
     * Sets optIns.
     * <p>
     * The field is required.
     *
     * @param optIns
     */
    @JsonProperty("optIns")
    public void setOptIns(NumbersOptIns optIns) {
        this.optIns = optIns;
    }

    /**
     * Sets optInImageURLs.
     * <p>
     * Field description:
     * List of URLs linking to screenshots that show how end-users opt in to receive messages.
     * <p>
     * The field is required.
     *
     * @param optInImageURLs
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel optInImageURLs(Set<String> optInImageURLs) {
        this.optInImageURLs = optInImageURLs;
        return this;
    }

    /**
     * Adds and item into optInImageURLs.
     * <p>
     * Field description:
     * List of URLs linking to screenshots that show how end-users opt in to receive messages.
     * <p>
     * The field is required.
     *
     * @param optInImageURLsItem The item to be added to the list.
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel addOptInImageURLsItem(String optInImageURLsItem) {
        if (this.optInImageURLs == null) {
            this.optInImageURLs = new LinkedHashSet<>();
        }
        this.optInImageURLs.add(optInImageURLsItem);
        return this;
    }

    /**
     * Returns optInImageURLs.
     * <p>
     * Field description:
     * List of URLs linking to screenshots that show how end-users opt in to receive messages.
     * <p>
     * The field is required.
     *
     * @return optInImageURLs
     */
    @JsonProperty("optInImageURLs")
    public Set<String> getOptInImageURLs() {
        return optInImageURLs;
    }

    /**
     * Sets optInImageURLs.
     * <p>
     * Field description:
     * List of URLs linking to screenshots that show how end-users opt in to receive messages.
     * <p>
     * The field is required.
     *
     * @param optInImageURLs
     */
    @JsonProperty("optInImageURLs")
    public void setOptInImageURLs(Set<String> optInImageURLs) {
        this.optInImageURLs = optInImageURLs;
    }

    /**
     * Sets additionalInformation.
     * <p>
     * Field description:
     * Free-form field for any extra details relevant to the campaign—such as custom use cases or compliance clarification.
     *
     * @param additionalInformation
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel additionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
        return this;
    }

    /**
     * Returns additionalInformation.
     * <p>
     * Field description:
     * Free-form field for any extra details relevant to the campaign—such as custom use cases or compliance clarification.
     *
     * @return additionalInformation
     */
    @JsonProperty("additionalInformation")
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    /**
     * Sets additionalInformation.
     * <p>
     * Field description:
     * Free-form field for any extra details relevant to the campaign—such as custom use cases or compliance clarification.
     *
     * @param additionalInformation
     */
    @JsonProperty("additionalInformation")
    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * The country where the brand is located.
     *
     * @param countryCode
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Returns countryCode.
     * <p>
     * Field description:
     * The country where the brand is located.
     *
     * @return countryCode
     */
    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * The country where the brand is located.
     *
     * @param countryCode
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * Sets address.
     *
     * @param address
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel address(NumbersAddress address) {
        this.address = address;
        return this;
    }

    /**
     * Returns address.
     *
     * @return address
     */
    @JsonProperty("address")
    public NumbersAddress getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address
     */
    @JsonProperty("address")
    public void setAddress(NumbersAddress address) {
        this.address = address;
    }

    /**
     * Sets supportPhone.
     * <p>
     * Field description:
     * The business phone number to contact about brand compliance issues.
     * <p>
     * The field is required.
     *
     * @param supportPhone
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel supportPhone(String supportPhone) {
        this.supportPhone = supportPhone;
        return this;
    }

    /**
     * Returns supportPhone.
     * <p>
     * Field description:
     * The business phone number to contact about brand compliance issues.
     * <p>
     * The field is required.
     *
     * @return supportPhone
     */
    @JsonProperty("supportPhone")
    public String getSupportPhone() {
        return supportPhone;
    }

    /**
     * Sets supportPhone.
     * <p>
     * Field description:
     * The business phone number to contact about brand compliance issues.
     * <p>
     * The field is required.
     *
     * @param supportPhone
     */
    @JsonProperty("supportPhone")
    public void setSupportPhone(String supportPhone) {
        this.supportPhone = supportPhone;
    }

    /**
     * Sets supportEmail.
     * <p>
     * Field description:
     * The business email address to contact about brand compliance issues. Must be a well formed email address that does not include a &#39;&#x3D;&#39; character.
     * <p>
     * The field is required.
     *
     * @param supportEmail
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel supportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
        return this;
    }

    /**
     * Returns supportEmail.
     * <p>
     * Field description:
     * The business email address to contact about brand compliance issues. Must be a well formed email address that does not include a &#39;&#x3D;&#39; character.
     * <p>
     * The field is required.
     *
     * @return supportEmail
     */
    @JsonProperty("supportEmail")
    public String getSupportEmail() {
        return supportEmail;
    }

    /**
     * Sets supportEmail.
     * <p>
     * Field description:
     * The business email address to contact about brand compliance issues. Must be a well formed email address that does not include a &#39;&#x3D;&#39; character.
     * <p>
     * The field is required.
     *
     * @param supportEmail
     */
    @JsonProperty("supportEmail")
    public void setSupportEmail(String supportEmail) {
        this.supportEmail = supportEmail;
    }

    /**
     * Sets businessContactFirstName.
     * <p>
     * Field description:
     * First name of the primary contact person for the brand or business entity. Used for verification or compliance outreach.
     * <p>
     * The field is required.
     *
     * @param businessContactFirstName
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel businessContactFirstName(String businessContactFirstName) {
        this.businessContactFirstName = businessContactFirstName;
        return this;
    }

    /**
     * Returns businessContactFirstName.
     * <p>
     * Field description:
     * First name of the primary contact person for the brand or business entity. Used for verification or compliance outreach.
     * <p>
     * The field is required.
     *
     * @return businessContactFirstName
     */
    @JsonProperty("businessContactFirstName")
    public String getBusinessContactFirstName() {
        return businessContactFirstName;
    }

    /**
     * Sets businessContactFirstName.
     * <p>
     * Field description:
     * First name of the primary contact person for the brand or business entity. Used for verification or compliance outreach.
     * <p>
     * The field is required.
     *
     * @param businessContactFirstName
     */
    @JsonProperty("businessContactFirstName")
    public void setBusinessContactFirstName(String businessContactFirstName) {
        this.businessContactFirstName = businessContactFirstName;
    }

    /**
     * Sets businessContactLastName.
     * <p>
     * Field description:
     * Last name of the primary contact person for the brand or business entity.
     * <p>
     * The field is required.
     *
     * @param businessContactLastName
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel businessContactLastName(String businessContactLastName) {
        this.businessContactLastName = businessContactLastName;
        return this;
    }

    /**
     * Returns businessContactLastName.
     * <p>
     * Field description:
     * Last name of the primary contact person for the brand or business entity.
     * <p>
     * The field is required.
     *
     * @return businessContactLastName
     */
    @JsonProperty("businessContactLastName")
    public String getBusinessContactLastName() {
        return businessContactLastName;
    }

    /**
     * Sets businessContactLastName.
     * <p>
     * Field description:
     * Last name of the primary contact person for the brand or business entity.
     * <p>
     * The field is required.
     *
     * @param businessContactLastName
     */
    @JsonProperty("businessContactLastName")
    public void setBusinessContactLastName(String businessContactLastName) {
        this.businessContactLastName = businessContactLastName;
    }

    /**
     * Sets legalName.
     * <p>
     * Field description:
     * The legal name of the brand.
     * <p>
     * The field is required.
     *
     * @param legalName
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel legalName(String legalName) {
        this.legalName = legalName;
        return this;
    }

    /**
     * Returns legalName.
     * <p>
     * Field description:
     * The legal name of the brand.
     * <p>
     * The field is required.
     *
     * @return legalName
     */
    @JsonProperty("legalName")
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets legalName.
     * <p>
     * Field description:
     * The legal name of the brand.
     * <p>
     * The field is required.
     *
     * @param legalName
     */
    @JsonProperty("legalName")
    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    /**
     * Sets businessDBA.
     * <p>
     * Field description:
     * &#39;Doing Business As&#39; name if different from the legal business name.
     *
     * @param businessDBA
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel businessDBA(String businessDBA) {
        this.businessDBA = businessDBA;
        return this;
    }

    /**
     * Returns businessDBA.
     * <p>
     * Field description:
     * &#39;Doing Business As&#39; name if different from the legal business name.
     *
     * @return businessDBA
     */
    @JsonProperty("businessDBA")
    public String getBusinessDBA() {
        return businessDBA;
    }

    /**
     * Sets businessDBA.
     * <p>
     * Field description:
     * &#39;Doing Business As&#39; name if different from the legal business name.
     *
     * @param businessDBA
     */
    @JsonProperty("businessDBA")
    public void setBusinessDBA(String businessDBA) {
        this.businessDBA = businessDBA;
    }

    /**
     * Sets businessName.
     * <p>
     * Field description:
     * The customer defined name of brand or business entity.
     *
     * @param businessName
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel businessName(String businessName) {
        this.businessName = businessName;
        return this;
    }

    /**
     * Returns businessName.
     * <p>
     * Field description:
     * The customer defined name of brand or business entity.
     *
     * @return businessName
     */
    @JsonProperty("businessName")
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Sets businessName.
     * <p>
     * Field description:
     * The customer defined name of brand or business entity.
     *
     * @param businessName
     */
    @JsonProperty("businessName")
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    /**
     * Sets businessWebsite.
     * <p>
     * Field description:
     * The website for the brand or business entity.
     * <p>
     * The field is required.
     *
     * @param businessWebsite
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel businessWebsite(String businessWebsite) {
        this.businessWebsite = businessWebsite;
        return this;
    }

    /**
     * Returns businessWebsite.
     * <p>
     * Field description:
     * The website for the brand or business entity.
     * <p>
     * The field is required.
     *
     * @return businessWebsite
     */
    @JsonProperty("businessWebsite")
    public String getBusinessWebsite() {
        return businessWebsite;
    }

    /**
     * Sets businessWebsite.
     * <p>
     * Field description:
     * The website for the brand or business entity.
     * <p>
     * The field is required.
     *
     * @param businessWebsite
     */
    @JsonProperty("businessWebsite")
    public void setBusinessWebsite(String businessWebsite) {
        this.businessWebsite = businessWebsite;
    }

    /**
     * Sets customerCareEmail.
     * <p>
     * Field description:
     * The email address the user may contact to get customer care.  Must be a well formed email address that does not include a &#39;&#x3D;&#39; character.
     * <p>
     * The field is required.
     *
     * @param customerCareEmail
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel customerCareEmail(String customerCareEmail) {
        this.customerCareEmail = customerCareEmail;
        return this;
    }

    /**
     * Returns customerCareEmail.
     * <p>
     * Field description:
     * The email address the user may contact to get customer care.  Must be a well formed email address that does not include a &#39;&#x3D;&#39; character.
     * <p>
     * The field is required.
     *
     * @return customerCareEmail
     */
    @JsonProperty("customerCareEmail")
    public String getCustomerCareEmail() {
        return customerCareEmail;
    }

    /**
     * Sets customerCareEmail.
     * <p>
     * Field description:
     * The email address the user may contact to get customer care.  Must be a well formed email address that does not include a &#39;&#x3D;&#39; character.
     * <p>
     * The field is required.
     *
     * @param customerCareEmail
     */
    @JsonProperty("customerCareEmail")
    public void setCustomerCareEmail(String customerCareEmail) {
        this.customerCareEmail = customerCareEmail;
    }

    /**
     * Sets taxId.
     * <p>
     * Field description:
     * The tax identifier for the brand.
     * <p>
     * The field is required.
     *
     * @param taxId
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel taxId(String taxId) {
        this.taxId = taxId;
        return this;
    }

    /**
     * Returns taxId.
     * <p>
     * Field description:
     * The tax identifier for the brand.
     * <p>
     * The field is required.
     *
     * @return taxId
     */
    @JsonProperty("taxId")
    public String getTaxId() {
        return taxId;
    }

    /**
     * Sets taxId.
     * <p>
     * Field description:
     * The tax identifier for the brand.
     * <p>
     * The field is required.
     *
     * @param taxId
     */
    @JsonProperty("taxId")
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    /**
     * Sets taxIdIssuingCountry.
     * <p>
     * Field description:
     * The country where tax identifier is issued. If not specified, the value from countryCode will be used.
     *
     * @param taxIdIssuingCountry
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel taxIdIssuingCountry(String taxIdIssuingCountry) {
        this.taxIdIssuingCountry = taxIdIssuingCountry;
        return this;
    }

    /**
     * Returns taxIdIssuingCountry.
     * <p>
     * Field description:
     * The country where tax identifier is issued. If not specified, the value from countryCode will be used.
     *
     * @return taxIdIssuingCountry
     */
    @JsonProperty("taxIdIssuingCountry")
    public String getTaxIdIssuingCountry() {
        return taxIdIssuingCountry;
    }

    /**
     * Sets taxIdIssuingCountry.
     * <p>
     * Field description:
     * The country where tax identifier is issued. If not specified, the value from countryCode will be used.
     *
     * @param taxIdIssuingCountry
     */
    @JsonProperty("taxIdIssuingCountry")
    public void setTaxIdIssuingCountry(String taxIdIssuingCountry) {
        this.taxIdIssuingCountry = taxIdIssuingCountry;
    }

    /**
     * Sets legalEntityType.
     * <p>
     * Field description:
     * Legal entity type of the business.
     * <p>
     * The field is required.
     *
     * @param legalEntityType
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel legalEntityType(LegalEntityTypeEnum legalEntityType) {
        this.legalEntityType = legalEntityType;
        return this;
    }

    /**
     * Returns legalEntityType.
     * <p>
     * Field description:
     * Legal entity type of the business.
     * <p>
     * The field is required.
     *
     * @return legalEntityType
     */
    @JsonProperty("legalEntityType")
    public LegalEntityTypeEnum getLegalEntityType() {
        return legalEntityType;
    }

    /**
     * Sets legalEntityType.
     * <p>
     * Field description:
     * Legal entity type of the business.
     * <p>
     * The field is required.
     *
     * @param legalEntityType
     */
    @JsonProperty("legalEntityType")
    public void setLegalEntityType(LegalEntityTypeEnum legalEntityType) {
        this.legalEntityType = legalEntityType;
    }

    /**
     * Sets businessRegistrationType.
     * <p>
     * The field is required.
     *
     * @param businessRegistrationType
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel businessRegistrationType(
            NumbersBusinessRegistrationType businessRegistrationType) {
        this.businessRegistrationType = businessRegistrationType;
        return this;
    }

    /**
     * Returns businessRegistrationType.
     * <p>
     * The field is required.
     *
     * @return businessRegistrationType
     */
    @JsonProperty("businessRegistrationType")
    public NumbersBusinessRegistrationType getBusinessRegistrationType() {
        return businessRegistrationType;
    }

    /**
     * Sets businessRegistrationType.
     * <p>
     * The field is required.
     *
     * @param businessRegistrationType
     */
    @JsonProperty("businessRegistrationType")
    public void setBusinessRegistrationType(NumbersBusinessRegistrationType businessRegistrationType) {
        this.businessRegistrationType = businessRegistrationType;
    }

    /**
     * Sets campaignVerifyToken.
     * <p>
     * Field description:
     * Campaign Verify token for POLITICAL campaigns.
     *
     * @param campaignVerifyToken
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel campaignVerifyToken(String campaignVerifyToken) {
        this.campaignVerifyToken = campaignVerifyToken;
        return this;
    }

    /**
     * Returns campaignVerifyToken.
     * <p>
     * Field description:
     * Campaign Verify token for POLITICAL campaigns.
     *
     * @return campaignVerifyToken
     */
    @JsonProperty("campaignVerifyToken")
    public String getCampaignVerifyToken() {
        return campaignVerifyToken;
    }

    /**
     * Sets campaignVerifyToken.
     * <p>
     * Field description:
     * Campaign Verify token for POLITICAL campaigns.
     *
     * @param campaignVerifyToken
     */
    @JsonProperty("campaignVerifyToken")
    public void setCampaignVerifyToken(String campaignVerifyToken) {
        this.campaignVerifyToken = campaignVerifyToken;
    }

    /**
     * Sets priorityId.
     * <p>
     * Field description:
     * Priority information used in latest campaign review.
     *
     * @param priorityId
     * @return This {@link NumbersTollFreeUnifiedNumberCampaignApiModel instance}.
     */
    public NumbersTollFreeUnifiedNumberCampaignApiModel priorityId(UUID priorityId) {
        this.priorityId = priorityId;
        return this;
    }

    /**
     * Returns priorityId.
     * <p>
     * Field description:
     * Priority information used in latest campaign review.
     *
     * @return priorityId
     */
    @JsonProperty("priorityId")
    public UUID getPriorityId() {
        return priorityId;
    }

    /**
     * Sets priorityId.
     * <p>
     * Field description:
     * Priority information used in latest campaign review.
     *
     * @param priorityId
     */
    @JsonProperty("priorityId")
    public void setPriorityId(UUID priorityId) {
        this.priorityId = priorityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersTollFreeUnifiedNumberCampaignApiModel numbersTollFreeUnifiedNumberCampaignApiModel =
                (NumbersTollFreeUnifiedNumberCampaignApiModel) o;
        return Objects.equals(this.id, numbersTollFreeUnifiedNumberCampaignApiModel.id)
                && Objects.equals(this.referenceId, numbersTollFreeUnifiedNumberCampaignApiModel.referenceId)
                && Objects.equals(this.applicationId, numbersTollFreeUnifiedNumberCampaignApiModel.applicationId)
                && Objects.equals(this.entityId, numbersTollFreeUnifiedNumberCampaignApiModel.entityId)
                && Objects.equals(this.name, numbersTollFreeUnifiedNumberCampaignApiModel.name)
                && Objects.equals(this.createdDate, numbersTollFreeUnifiedNumberCampaignApiModel.createdDate)
                && Objects.equals(this.lastModifiedDate, numbersTollFreeUnifiedNumberCampaignApiModel.lastModifiedDate)
                && Objects.equals(this.stage, numbersTollFreeUnifiedNumberCampaignApiModel.stage)
                && Objects.equals(this.priority, numbersTollFreeUnifiedNumberCampaignApiModel.priority)
                && Objects.equals(this.type, numbersTollFreeUnifiedNumberCampaignApiModel.type)
                && Objects.equals(this.campaignFeedback, numbersTollFreeUnifiedNumberCampaignApiModel.campaignFeedback)
                && Objects.equals(this.privacyPolicyUrl, numbersTollFreeUnifiedNumberCampaignApiModel.privacyPolicyUrl)
                && Objects.equals(
                        this.termsAndConditionsUrl, numbersTollFreeUnifiedNumberCampaignApiModel.termsAndConditionsUrl)
                && Objects.equals(this.messageVolume, numbersTollFreeUnifiedNumberCampaignApiModel.messageVolume)
                && Objects.equals(this.numbers, numbersTollFreeUnifiedNumberCampaignApiModel.numbers)
                && Objects.equals(this.numberKeys, numbersTollFreeUnifiedNumberCampaignApiModel.numberKeys)
                && Objects.equals(this.numberPreviews, numbersTollFreeUnifiedNumberCampaignApiModel.numberPreviews)
                && Objects.equals(this.useCase, numbersTollFreeUnifiedNumberCampaignApiModel.useCase)
                && Objects.equals(this.programSummary, numbersTollFreeUnifiedNumberCampaignApiModel.programSummary)
                && Objects.equals(this.exampleMessage, numbersTollFreeUnifiedNumberCampaignApiModel.exampleMessage)
                && Objects.equals(this.optIns, numbersTollFreeUnifiedNumberCampaignApiModel.optIns)
                && Objects.equals(this.optInImageURLs, numbersTollFreeUnifiedNumberCampaignApiModel.optInImageURLs)
                && Objects.equals(
                        this.additionalInformation, numbersTollFreeUnifiedNumberCampaignApiModel.additionalInformation)
                && Objects.equals(this.countryCode, numbersTollFreeUnifiedNumberCampaignApiModel.countryCode)
                && Objects.equals(this.address, numbersTollFreeUnifiedNumberCampaignApiModel.address)
                && Objects.equals(this.supportPhone, numbersTollFreeUnifiedNumberCampaignApiModel.supportPhone)
                && Objects.equals(this.supportEmail, numbersTollFreeUnifiedNumberCampaignApiModel.supportEmail)
                && Objects.equals(
                        this.businessContactFirstName,
                        numbersTollFreeUnifiedNumberCampaignApiModel.businessContactFirstName)
                && Objects.equals(
                        this.businessContactLastName,
                        numbersTollFreeUnifiedNumberCampaignApiModel.businessContactLastName)
                && Objects.equals(this.legalName, numbersTollFreeUnifiedNumberCampaignApiModel.legalName)
                && Objects.equals(this.businessDBA, numbersTollFreeUnifiedNumberCampaignApiModel.businessDBA)
                && Objects.equals(this.businessName, numbersTollFreeUnifiedNumberCampaignApiModel.businessName)
                && Objects.equals(this.businessWebsite, numbersTollFreeUnifiedNumberCampaignApiModel.businessWebsite)
                && Objects.equals(
                        this.customerCareEmail, numbersTollFreeUnifiedNumberCampaignApiModel.customerCareEmail)
                && Objects.equals(this.taxId, numbersTollFreeUnifiedNumberCampaignApiModel.taxId)
                && Objects.equals(
                        this.taxIdIssuingCountry, numbersTollFreeUnifiedNumberCampaignApiModel.taxIdIssuingCountry)
                && Objects.equals(this.legalEntityType, numbersTollFreeUnifiedNumberCampaignApiModel.legalEntityType)
                && Objects.equals(
                        this.businessRegistrationType,
                        numbersTollFreeUnifiedNumberCampaignApiModel.businessRegistrationType)
                && Objects.equals(
                        this.campaignVerifyToken, numbersTollFreeUnifiedNumberCampaignApiModel.campaignVerifyToken)
                && Objects.equals(this.priorityId, numbersTollFreeUnifiedNumberCampaignApiModel.priorityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                referenceId,
                applicationId,
                entityId,
                name,
                createdDate,
                lastModifiedDate,
                stage,
                priority,
                type,
                campaignFeedback,
                privacyPolicyUrl,
                termsAndConditionsUrl,
                messageVolume,
                numbers,
                numberKeys,
                numberPreviews,
                useCase,
                programSummary,
                exampleMessage,
                optIns,
                optInImageURLs,
                additionalInformation,
                countryCode,
                address,
                supportPhone,
                supportEmail,
                businessContactFirstName,
                businessContactLastName,
                legalName,
                businessDBA,
                businessName,
                businessWebsite,
                customerCareEmail,
                taxId,
                taxIdIssuingCountry,
                legalEntityType,
                businessRegistrationType,
                campaignVerifyToken,
                priorityId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersTollFreeUnifiedNumberCampaignApiModel {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    referenceId: ")
                .append(toIndentedString(referenceId))
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    entityId: ")
                .append(toIndentedString(entityId))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    createdDate: ")
                .append(toIndentedString(createdDate))
                .append(newLine)
                .append("    lastModifiedDate: ")
                .append(toIndentedString(lastModifiedDate))
                .append(newLine)
                .append("    stage: ")
                .append(toIndentedString(stage))
                .append(newLine)
                .append("    priority: ")
                .append(toIndentedString(priority))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    campaignFeedback: ")
                .append(toIndentedString(campaignFeedback))
                .append(newLine)
                .append("    privacyPolicyUrl: ")
                .append(toIndentedString(privacyPolicyUrl))
                .append(newLine)
                .append("    termsAndConditionsUrl: ")
                .append(toIndentedString(termsAndConditionsUrl))
                .append(newLine)
                .append("    messageVolume: ")
                .append(toIndentedString(messageVolume))
                .append(newLine)
                .append("    numbers: ")
                .append(toIndentedString(numbers))
                .append(newLine)
                .append("    numberKeys: ")
                .append(toIndentedString(numberKeys))
                .append(newLine)
                .append("    numberPreviews: ")
                .append(toIndentedString(numberPreviews))
                .append(newLine)
                .append("    useCase: ")
                .append(toIndentedString(useCase))
                .append(newLine)
                .append("    programSummary: ")
                .append(toIndentedString(programSummary))
                .append(newLine)
                .append("    exampleMessage: ")
                .append(toIndentedString(exampleMessage))
                .append(newLine)
                .append("    optIns: ")
                .append(toIndentedString(optIns))
                .append(newLine)
                .append("    optInImageURLs: ")
                .append(toIndentedString(optInImageURLs))
                .append(newLine)
                .append("    additionalInformation: ")
                .append(toIndentedString(additionalInformation))
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
                .append(newLine)
                .append("    address: ")
                .append(toIndentedString(address))
                .append(newLine)
                .append("    supportPhone: ")
                .append(toIndentedString(supportPhone))
                .append(newLine)
                .append("    supportEmail: ")
                .append(toIndentedString(supportEmail))
                .append(newLine)
                .append("    businessContactFirstName: ")
                .append(toIndentedString(businessContactFirstName))
                .append(newLine)
                .append("    businessContactLastName: ")
                .append(toIndentedString(businessContactLastName))
                .append(newLine)
                .append("    legalName: ")
                .append(toIndentedString(legalName))
                .append(newLine)
                .append("    businessDBA: ")
                .append(toIndentedString(businessDBA))
                .append(newLine)
                .append("    businessName: ")
                .append(toIndentedString(businessName))
                .append(newLine)
                .append("    businessWebsite: ")
                .append(toIndentedString(businessWebsite))
                .append(newLine)
                .append("    customerCareEmail: ")
                .append(toIndentedString(customerCareEmail))
                .append(newLine)
                .append("    taxId: ")
                .append(toIndentedString(taxId))
                .append(newLine)
                .append("    taxIdIssuingCountry: ")
                .append(toIndentedString(taxIdIssuingCountry))
                .append(newLine)
                .append("    legalEntityType: ")
                .append(toIndentedString(legalEntityType))
                .append(newLine)
                .append("    businessRegistrationType: ")
                .append(toIndentedString(businessRegistrationType))
                .append(newLine)
                .append("    campaignVerifyToken: ")
                .append(toIndentedString(campaignVerifyToken))
                .append(newLine)
                .append("    priorityId: ")
                .append(toIndentedString(priorityId))
                .append(newLine)
                .append("}")
                .toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        String lineSeparator = System.lineSeparator();
        String lineSeparatorFollowedByIndentation = lineSeparator + "    ";
        return o.toString().replace(lineSeparator, lineSeparatorFollowedByIndentation);
    }
}
