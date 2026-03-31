/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/**
 * Represents NumbersTollFreeCampaign model.
 */
public class NumbersTollFreeCampaign extends NumbersCampaign {

    private UUID brandId;

    private NumbersBrandPreview brandPreview;

    private NumbersAppealData appealData;

    private String privacyPolicyUrl;

    private String termsAndConditionsUrl;

    private NumbersTollFreeMessageVolume messageVolume;

    private Set<String> numbers = null;

    private Set<String> numberKeys = null;

    private Set<NumbersNumberPreview> numberPreviews = null;

    private NumbersTollFreeUseCase useCase;

    private String programSummary;

    private String exampleMessage;

    private NumbersOptIns optIns;

    private Set<String> optInImageURLs = new LinkedHashSet<>();

    private String additionalInformation;

    private String customerCareEmail;

    private String campaignVerifyToken;

    /**
     * Constructs a new {@link NumbersTollFreeCampaign} instance.
     */
    public NumbersTollFreeCampaign() {
        super("TOLL_FREE_NUMBER");
    }

    /**
     * Sets brandId.
     * <p>
     * Field description:
     * The ID of the brand to use with the campaign.
     * <p>
     * The field is required.
     *
     * @param brandId
     * @return This {@link NumbersTollFreeCampaign instance}.
     */
    public NumbersTollFreeCampaign brandId(UUID brandId) {
        this.brandId = brandId;
        return this;
    }

    /**
     * Returns brandId.
     * <p>
     * Field description:
     * The ID of the brand to use with the campaign.
     * <p>
     * The field is required.
     *
     * @return brandId
     */
    @JsonProperty("brandId")
    public UUID getBrandId() {
        return brandId;
    }

    /**
     * Sets brandId.
     * <p>
     * Field description:
     * The ID of the brand to use with the campaign.
     * <p>
     * The field is required.
     *
     * @param brandId
     */
    @JsonProperty("brandId")
    public void setBrandId(UUID brandId) {
        this.brandId = brandId;
    }

    /**
     * Sets brandPreview.
     *
     * @param brandPreview
     * @return This {@link NumbersTollFreeCampaign instance}.
     */
    public NumbersTollFreeCampaign brandPreview(NumbersBrandPreview brandPreview) {
        this.brandPreview = brandPreview;
        return this;
    }

    /**
     * Returns brandPreview.
     *
     * @return brandPreview
     */
    @JsonProperty("brandPreview")
    public NumbersBrandPreview getBrandPreview() {
        return brandPreview;
    }

    /**
     * Sets brandPreview.
     *
     * @param brandPreview
     */
    @JsonProperty("brandPreview")
    public void setBrandPreview(NumbersBrandPreview brandPreview) {
        this.brandPreview = brandPreview;
    }

    /**
     * Sets appealData.
     *
     * @param appealData
     * @return This {@link NumbersTollFreeCampaign instance}.
     */
    public NumbersTollFreeCampaign appealData(NumbersAppealData appealData) {
        this.appealData = appealData;
        return this;
    }

    /**
     * Returns appealData.
     *
     * @return appealData
     */
    @JsonProperty("appealData")
    public NumbersAppealData getAppealData() {
        return appealData;
    }

    /**
     * Sets appealData.
     *
     * @param appealData
     */
    @JsonProperty("appealData")
    public void setAppealData(NumbersAppealData appealData) {
        this.appealData = appealData;
    }

    /**
     * Sets privacyPolicyUrl.
     * <p>
     * Field description:
     * Public URL to the privacy policy that outlines how user data is collected, stored, and used.
     *
     * @param privacyPolicyUrl
     * @return This {@link NumbersTollFreeCampaign instance}.
     */
    public NumbersTollFreeCampaign privacyPolicyUrl(String privacyPolicyUrl) {
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
     * @return This {@link NumbersTollFreeCampaign instance}.
     */
    public NumbersTollFreeCampaign termsAndConditionsUrl(String termsAndConditionsUrl) {
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
     * @return This {@link NumbersTollFreeCampaign instance}.
     */
    public NumbersTollFreeCampaign messageVolume(NumbersTollFreeMessageVolume messageVolume) {
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
     * @return This {@link NumbersTollFreeCampaign instance}.
     */
    public NumbersTollFreeCampaign numbers(Set<String> numbers) {
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
     * @return This {@link NumbersTollFreeCampaign instance}.
     */
    public NumbersTollFreeCampaign addNumbersItem(String numbersItem) {
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
     *
     * @param numberKeys
     * @return This {@link NumbersTollFreeCampaign instance}.
     */
    public NumbersTollFreeCampaign numberKeys(Set<String> numberKeys) {
        this.numberKeys = numberKeys;
        return this;
    }

    /**
     * Adds and item into numberKeys.
     * <p>
     * Field description:
     * The numberKey(s) of the numbers to use with the campaign. Campaign must have at least one TFN number associated before it can be submitted for review. Alternatively, you can use the &#39;numbers&#39; property to specify the numbers directly, but note that &#39;numberKeys&#39; property takes precedence if both are specified.
     *
     * @param numberKeysItem The item to be added to the list.
     * @return This {@link NumbersTollFreeCampaign instance}.
     */
    public NumbersTollFreeCampaign addNumberKeysItem(String numberKeysItem) {
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
     * @return This {@link NumbersTollFreeCampaign instance}.
     */
    public NumbersTollFreeCampaign numberPreviews(Set<NumbersNumberPreview> numberPreviews) {
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
     * @return This {@link NumbersTollFreeCampaign instance}.
     */
    public NumbersTollFreeCampaign addNumberPreviewsItem(NumbersNumberPreview numberPreviewsItem) {
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
     * @return This {@link NumbersTollFreeCampaign instance}.
     */
    public NumbersTollFreeCampaign useCase(NumbersTollFreeUseCase useCase) {
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
     * @return This {@link NumbersTollFreeCampaign instance}.
     */
    public NumbersTollFreeCampaign programSummary(String programSummary) {
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
     * @return This {@link NumbersTollFreeCampaign instance}.
     */
    public NumbersTollFreeCampaign exampleMessage(String exampleMessage) {
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
     * @return This {@link NumbersTollFreeCampaign instance}.
     */
    public NumbersTollFreeCampaign optIns(NumbersOptIns optIns) {
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
     * @return This {@link NumbersTollFreeCampaign instance}.
     */
    public NumbersTollFreeCampaign optInImageURLs(Set<String> optInImageURLs) {
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
     * @return This {@link NumbersTollFreeCampaign instance}.
     */
    public NumbersTollFreeCampaign addOptInImageURLsItem(String optInImageURLsItem) {
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
     * @return This {@link NumbersTollFreeCampaign instance}.
     */
    public NumbersTollFreeCampaign additionalInformation(String additionalInformation) {
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
     * Sets customerCareEmail.
     * <p>
     * Field description:
     * The email address the user may contact to get customer care.  Must be a well formed email address that does not include a &#39;&#x3D;&#39; character.
     * <p>
     * The field is required.
     *
     * @param customerCareEmail
     * @return This {@link NumbersTollFreeCampaign instance}.
     */
    public NumbersTollFreeCampaign customerCareEmail(String customerCareEmail) {
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
     * Sets campaignVerifyToken.
     * <p>
     * Field description:
     * Campaign Verify token for POLITICAL campaigns.
     *
     * @param campaignVerifyToken
     * @return This {@link NumbersTollFreeCampaign instance}.
     */
    public NumbersTollFreeCampaign campaignVerifyToken(String campaignVerifyToken) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersTollFreeCampaign numbersTollFreeCampaign = (NumbersTollFreeCampaign) o;
        return Objects.equals(this.brandId, numbersTollFreeCampaign.brandId)
                && Objects.equals(this.brandPreview, numbersTollFreeCampaign.brandPreview)
                && Objects.equals(this.appealData, numbersTollFreeCampaign.appealData)
                && Objects.equals(this.privacyPolicyUrl, numbersTollFreeCampaign.privacyPolicyUrl)
                && Objects.equals(this.termsAndConditionsUrl, numbersTollFreeCampaign.termsAndConditionsUrl)
                && Objects.equals(this.messageVolume, numbersTollFreeCampaign.messageVolume)
                && Objects.equals(this.numbers, numbersTollFreeCampaign.numbers)
                && Objects.equals(this.numberKeys, numbersTollFreeCampaign.numberKeys)
                && Objects.equals(this.numberPreviews, numbersTollFreeCampaign.numberPreviews)
                && Objects.equals(this.useCase, numbersTollFreeCampaign.useCase)
                && Objects.equals(this.programSummary, numbersTollFreeCampaign.programSummary)
                && Objects.equals(this.exampleMessage, numbersTollFreeCampaign.exampleMessage)
                && Objects.equals(this.optIns, numbersTollFreeCampaign.optIns)
                && Objects.equals(this.optInImageURLs, numbersTollFreeCampaign.optInImageURLs)
                && Objects.equals(this.additionalInformation, numbersTollFreeCampaign.additionalInformation)
                && Objects.equals(this.customerCareEmail, numbersTollFreeCampaign.customerCareEmail)
                && Objects.equals(this.campaignVerifyToken, numbersTollFreeCampaign.campaignVerifyToken)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                brandId,
                brandPreview,
                appealData,
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
                customerCareEmail,
                campaignVerifyToken,
                super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersTollFreeCampaign {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    brandId: ")
                .append(toIndentedString(brandId))
                .append(newLine)
                .append("    brandPreview: ")
                .append(toIndentedString(brandPreview))
                .append(newLine)
                .append("    appealData: ")
                .append(toIndentedString(appealData))
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
                .append("    customerCareEmail: ")
                .append(toIndentedString(customerCareEmail))
                .append(newLine)
                .append("    campaignVerifyToken: ")
                .append(toIndentedString(campaignVerifyToken))
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
