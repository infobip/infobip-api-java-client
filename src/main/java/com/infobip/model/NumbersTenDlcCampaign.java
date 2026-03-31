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
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/**
 * Represents NumbersTenDlcCampaign model.
 */
public class NumbersTenDlcCampaign extends NumbersCampaign {

    private UUID brandId;

    private NumbersBrandPreview brandPreview;

    private NumbersAppealData appealData;

    private String programSummary;

    private String confirmationMessage;

    private List<String> exampleMessages = new ArrayList<>();

    private String helpMessage;

    private String stopMessage;

    private Set<NumbersMessageType> messageTypes = new LinkedHashSet<>();

    private String termsAndConditionsUrl;

    private NumbersOptIns optIns;

    private Boolean ageGated;

    private String customerCarePhone;

    private Boolean lowVolume = false;

    private Set<NumbersTenDlcUseCase> useCases = new LinkedHashSet<>();

    private Boolean directLending;

    private Boolean embeddedLink;

    private Boolean embeddedPhone;

    private String customerCareEmail;

    private List<String> mmsSampleFiles = null;

    private List<String> supportingDocuments = null;

    private Set<String> numberKeys = null;

    private Set<String> numbers = null;

    private Set<NumbersNumberPreview> numberPreviews = null;

    private NumbersNumberPool numberPool;

    /**
     * Constructs a new {@link NumbersTenDlcCampaign} instance.
     */
    public NumbersTenDlcCampaign() {
        super("TEN_DIGIT_LONG_CODE");
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
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign brandId(UUID brandId) {
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
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign brandPreview(NumbersBrandPreview brandPreview) {
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
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign appealData(NumbersAppealData appealData) {
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
     * Sets programSummary.
     * <p>
     * Field description:
     * A brief description of the purpose of the campaign.
     * <p>
     * The field is required.
     *
     * @param programSummary
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign programSummary(String programSummary) {
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
     * Sets confirmationMessage.
     * <p>
     * Field description:
     * The message sent to the user after they have subscribed.
     * <p>
     * The field is required.
     *
     * @param confirmationMessage
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign confirmationMessage(String confirmationMessage) {
        this.confirmationMessage = confirmationMessage;
        return this;
    }

    /**
     * Returns confirmationMessage.
     * <p>
     * Field description:
     * The message sent to the user after they have subscribed.
     * <p>
     * The field is required.
     *
     * @return confirmationMessage
     */
    @JsonProperty("confirmationMessage")
    public String getConfirmationMessage() {
        return confirmationMessage;
    }

    /**
     * Sets confirmationMessage.
     * <p>
     * Field description:
     * The message sent to the user after they have subscribed.
     * <p>
     * The field is required.
     *
     * @param confirmationMessage
     */
    @JsonProperty("confirmationMessage")
    public void setConfirmationMessage(String confirmationMessage) {
        this.confirmationMessage = confirmationMessage;
    }

    /**
     * Sets exampleMessages.
     * <p>
     * Field description:
     * The example message(s) a user may receive from this campaign. Each example message must be at least 20 characters long.
     * <p>
     * The field is required.
     *
     * @param exampleMessages
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign exampleMessages(List<String> exampleMessages) {
        this.exampleMessages = exampleMessages;
        return this;
    }

    /**
     * Adds and item into exampleMessages.
     * <p>
     * Field description:
     * The example message(s) a user may receive from this campaign. Each example message must be at least 20 characters long.
     * <p>
     * The field is required.
     *
     * @param exampleMessagesItem The item to be added to the list.
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign addExampleMessagesItem(String exampleMessagesItem) {
        if (this.exampleMessages == null) {
            this.exampleMessages = new ArrayList<>();
        }
        this.exampleMessages.add(exampleMessagesItem);
        return this;
    }

    /**
     * Returns exampleMessages.
     * <p>
     * Field description:
     * The example message(s) a user may receive from this campaign. Each example message must be at least 20 characters long.
     * <p>
     * The field is required.
     *
     * @return exampleMessages
     */
    @JsonProperty("exampleMessages")
    public List<String> getExampleMessages() {
        return exampleMessages;
    }

    /**
     * Sets exampleMessages.
     * <p>
     * Field description:
     * The example message(s) a user may receive from this campaign. Each example message must be at least 20 characters long.
     * <p>
     * The field is required.
     *
     * @param exampleMessages
     */
    @JsonProperty("exampleMessages")
    public void setExampleMessages(List<String> exampleMessages) {
        this.exampleMessages = exampleMessages;
    }

    /**
     * Sets helpMessage.
     * <p>
     * Field description:
     * The message sent to a user after they have asked for help.
     * <p>
     * The field is required.
     *
     * @param helpMessage
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign helpMessage(String helpMessage) {
        this.helpMessage = helpMessage;
        return this;
    }

    /**
     * Returns helpMessage.
     * <p>
     * Field description:
     * The message sent to a user after they have asked for help.
     * <p>
     * The field is required.
     *
     * @return helpMessage
     */
    @JsonProperty("helpMessage")
    public String getHelpMessage() {
        return helpMessage;
    }

    /**
     * Sets helpMessage.
     * <p>
     * Field description:
     * The message sent to a user after they have asked for help.
     * <p>
     * The field is required.
     *
     * @param helpMessage
     */
    @JsonProperty("helpMessage")
    public void setHelpMessage(String helpMessage) {
        this.helpMessage = helpMessage;
    }

    /**
     * Sets stopMessage.
     * <p>
     * Field description:
     * The message sent to a user after they have asked to stop receiving messages.
     * <p>
     * The field is required.
     *
     * @param stopMessage
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign stopMessage(String stopMessage) {
        this.stopMessage = stopMessage;
        return this;
    }

    /**
     * Returns stopMessage.
     * <p>
     * Field description:
     * The message sent to a user after they have asked to stop receiving messages.
     * <p>
     * The field is required.
     *
     * @return stopMessage
     */
    @JsonProperty("stopMessage")
    public String getStopMessage() {
        return stopMessage;
    }

    /**
     * Sets stopMessage.
     * <p>
     * Field description:
     * The message sent to a user after they have asked to stop receiving messages.
     * <p>
     * The field is required.
     *
     * @param stopMessage
     */
    @JsonProperty("stopMessage")
    public void setStopMessage(String stopMessage) {
        this.stopMessage = stopMessage;
    }

    /**
     * Sets messageTypes.
     * <p>
     * Field description:
     * The message type(s) this campaign will use to send messages.
     * <p>
     * The field is required.
     *
     * @param messageTypes
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign messageTypes(Set<NumbersMessageType> messageTypes) {
        this.messageTypes = messageTypes;
        return this;
    }

    /**
     * Adds and item into messageTypes.
     * <p>
     * Field description:
     * The message type(s) this campaign will use to send messages.
     * <p>
     * The field is required.
     *
     * @param messageTypesItem The item to be added to the list.
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign addMessageTypesItem(NumbersMessageType messageTypesItem) {
        if (this.messageTypes == null) {
            this.messageTypes = new LinkedHashSet<>();
        }
        this.messageTypes.add(messageTypesItem);
        return this;
    }

    /**
     * Returns messageTypes.
     * <p>
     * Field description:
     * The message type(s) this campaign will use to send messages.
     * <p>
     * The field is required.
     *
     * @return messageTypes
     */
    @JsonProperty("messageTypes")
    public Set<NumbersMessageType> getMessageTypes() {
        return messageTypes;
    }

    /**
     * Sets messageTypes.
     * <p>
     * Field description:
     * The message type(s) this campaign will use to send messages.
     * <p>
     * The field is required.
     *
     * @param messageTypes
     */
    @JsonProperty("messageTypes")
    public void setMessageTypes(Set<NumbersMessageType> messageTypes) {
        this.messageTypes = messageTypes;
    }

    /**
     * Sets termsAndConditionsUrl.
     * <p>
     * Field description:
     * URL where the terms and conditions of the campaign are located.
     * <p>
     * The field is required.
     *
     * @param termsAndConditionsUrl
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign termsAndConditionsUrl(String termsAndConditionsUrl) {
        this.termsAndConditionsUrl = termsAndConditionsUrl;
        return this;
    }

    /**
     * Returns termsAndConditionsUrl.
     * <p>
     * Field description:
     * URL where the terms and conditions of the campaign are located.
     * <p>
     * The field is required.
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
     * <p>
     * The field is required.
     *
     * @param termsAndConditionsUrl
     */
    @JsonProperty("termsAndConditionsUrl")
    public void setTermsAndConditionsUrl(String termsAndConditionsUrl) {
        this.termsAndConditionsUrl = termsAndConditionsUrl;
    }

    /**
     * Sets optIns.
     * <p>
     * The field is required.
     *
     * @param optIns
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign optIns(NumbersOptIns optIns) {
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
     * Sets ageGated.
     * <p>
     * Field description:
     * Shows whether the campaign will include any age-gated content, as defined by Carrier and CTIA guidelines.
     *
     * @param ageGated
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign ageGated(Boolean ageGated) {
        this.ageGated = ageGated;
        return this;
    }

    /**
     * Returns ageGated.
     * <p>
     * Field description:
     * Shows whether the campaign will include any age-gated content, as defined by Carrier and CTIA guidelines.
     *
     * @return ageGated
     */
    @JsonProperty("ageGated")
    public Boolean getAgeGated() {
        return ageGated;
    }

    /**
     * Sets ageGated.
     * <p>
     * Field description:
     * Shows whether the campaign will include any age-gated content, as defined by Carrier and CTIA guidelines.
     *
     * @param ageGated
     */
    @JsonProperty("ageGated")
    public void setAgeGated(Boolean ageGated) {
        this.ageGated = ageGated;
    }

    /**
     * Sets customerCarePhone.
     * <p>
     * Field description:
     * The phone number the user may call to get customer care.
     * <p>
     * The field is required.
     *
     * @param customerCarePhone
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign customerCarePhone(String customerCarePhone) {
        this.customerCarePhone = customerCarePhone;
        return this;
    }

    /**
     * Returns customerCarePhone.
     * <p>
     * Field description:
     * The phone number the user may call to get customer care.
     * <p>
     * The field is required.
     *
     * @return customerCarePhone
     */
    @JsonProperty("customerCarePhone")
    public String getCustomerCarePhone() {
        return customerCarePhone;
    }

    /**
     * Sets customerCarePhone.
     * <p>
     * Field description:
     * The phone number the user may call to get customer care.
     * <p>
     * The field is required.
     *
     * @param customerCarePhone
     */
    @JsonProperty("customerCarePhone")
    public void setCustomerCarePhone(String customerCarePhone) {
        this.customerCarePhone = customerCarePhone;
    }

    /**
     * Sets lowVolume.
     * <p>
     * Field description:
     * Low volume campaigns are a lower cost campaign designed for low daily volume and non-time-sensitive messages. They are limited to 6 messages per minute on most carriers and no more than 5,000 messages per month on all carriers.
     * <p>
     * The field is required.
     *
     * @param lowVolume
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign lowVolume(Boolean lowVolume) {
        this.lowVolume = lowVolume;
        return this;
    }

    /**
     * Returns lowVolume.
     * <p>
     * Field description:
     * Low volume campaigns are a lower cost campaign designed for low daily volume and non-time-sensitive messages. They are limited to 6 messages per minute on most carriers and no more than 5,000 messages per month on all carriers.
     * <p>
     * The field is required.
     *
     * @return lowVolume
     */
    @JsonProperty("lowVolume")
    public Boolean getLowVolume() {
        return lowVolume;
    }

    /**
     * Sets lowVolume.
     * <p>
     * Field description:
     * Low volume campaigns are a lower cost campaign designed for low daily volume and non-time-sensitive messages. They are limited to 6 messages per minute on most carriers and no more than 5,000 messages per month on all carriers.
     * <p>
     * The field is required.
     *
     * @param lowVolume
     */
    @JsonProperty("lowVolume")
    public void setLowVolume(Boolean lowVolume) {
        this.lowVolume = lowVolume;
    }

    /**
     * Sets useCases.
     * <p>
     * Field description:
     * The use cases for this campaign.
     * <p>
     * The field is required.
     *
     * @param useCases
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign useCases(Set<NumbersTenDlcUseCase> useCases) {
        this.useCases = useCases;
        return this;
    }

    /**
     * Adds and item into useCases.
     * <p>
     * Field description:
     * The use cases for this campaign.
     * <p>
     * The field is required.
     *
     * @param useCasesItem The item to be added to the list.
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign addUseCasesItem(NumbersTenDlcUseCase useCasesItem) {
        if (this.useCases == null) {
            this.useCases = new LinkedHashSet<>();
        }
        this.useCases.add(useCasesItem);
        return this;
    }

    /**
     * Returns useCases.
     * <p>
     * Field description:
     * The use cases for this campaign.
     * <p>
     * The field is required.
     *
     * @return useCases
     */
    @JsonProperty("useCases")
    public Set<NumbersTenDlcUseCase> getUseCases() {
        return useCases;
    }

    /**
     * Sets useCases.
     * <p>
     * Field description:
     * The use cases for this campaign.
     * <p>
     * The field is required.
     *
     * @param useCases
     */
    @JsonProperty("useCases")
    public void setUseCases(Set<NumbersTenDlcUseCase> useCases) {
        this.useCases = useCases;
    }

    /**
     * Sets directLending.
     * <p>
     * Field description:
     * Shows whether the campaign will include content related to direct lending or other loan arrangements.
     *
     * @param directLending
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign directLending(Boolean directLending) {
        this.directLending = directLending;
        return this;
    }

    /**
     * Returns directLending.
     * <p>
     * Field description:
     * Shows whether the campaign will include content related to direct lending or other loan arrangements.
     *
     * @return directLending
     */
    @JsonProperty("directLending")
    public Boolean getDirectLending() {
        return directLending;
    }

    /**
     * Sets directLending.
     * <p>
     * Field description:
     * Shows whether the campaign will include content related to direct lending or other loan arrangements.
     *
     * @param directLending
     */
    @JsonProperty("directLending")
    public void setDirectLending(Boolean directLending) {
        this.directLending = directLending;
    }

    /**
     * Sets embeddedLink.
     * <p>
     * Field description:
     * Shows whether the campaign will send embedded links of any kind. Public URL shorteners (bitly, tinyurl) are not accepted.
     *
     * @param embeddedLink
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign embeddedLink(Boolean embeddedLink) {
        this.embeddedLink = embeddedLink;
        return this;
    }

    /**
     * Returns embeddedLink.
     * <p>
     * Field description:
     * Shows whether the campaign will send embedded links of any kind. Public URL shorteners (bitly, tinyurl) are not accepted.
     *
     * @return embeddedLink
     */
    @JsonProperty("embeddedLink")
    public Boolean getEmbeddedLink() {
        return embeddedLink;
    }

    /**
     * Sets embeddedLink.
     * <p>
     * Field description:
     * Shows whether the campaign will send embedded links of any kind. Public URL shorteners (bitly, tinyurl) are not accepted.
     *
     * @param embeddedLink
     */
    @JsonProperty("embeddedLink")
    public void setEmbeddedLink(Boolean embeddedLink) {
        this.embeddedLink = embeddedLink;
    }

    /**
     * Sets embeddedPhone.
     * <p>
     * Field description:
     * Shows whether any embedded phone numbers would be used in the campaign, except the required HELP information contact phone number.
     *
     * @param embeddedPhone
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign embeddedPhone(Boolean embeddedPhone) {
        this.embeddedPhone = embeddedPhone;
        return this;
    }

    /**
     * Returns embeddedPhone.
     * <p>
     * Field description:
     * Shows whether any embedded phone numbers would be used in the campaign, except the required HELP information contact phone number.
     *
     * @return embeddedPhone
     */
    @JsonProperty("embeddedPhone")
    public Boolean getEmbeddedPhone() {
        return embeddedPhone;
    }

    /**
     * Sets embeddedPhone.
     * <p>
     * Field description:
     * Shows whether any embedded phone numbers would be used in the campaign, except the required HELP information contact phone number.
     *
     * @param embeddedPhone
     */
    @JsonProperty("embeddedPhone")
    public void setEmbeddedPhone(Boolean embeddedPhone) {
        this.embeddedPhone = embeddedPhone;
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
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign customerCareEmail(String customerCareEmail) {
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
     * Sets mmsSampleFiles.
     * <p>
     * Field description:
     * List of MMS sample files for the campaign. Each entry can be either a URL to an external file or a UUID of a previously uploaded document. Maximum 5 files allowed. Supported file types: .bmp, .dib, .gif, .jpeg, .jpg, .m2a, .m4a, .m4b, .m4p, .m4r, .m4v, .mp1, .mp2, .mp3, .mp4, .mpa, .oga, .ogg, .ogm, .ogv, .ogx, .png, .spx, .txt, .wav, .webm.
     *
     * @param mmsSampleFiles
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign mmsSampleFiles(List<String> mmsSampleFiles) {
        this.mmsSampleFiles = mmsSampleFiles;
        return this;
    }

    /**
     * Adds and item into mmsSampleFiles.
     * <p>
     * Field description:
     * List of MMS sample files for the campaign. Each entry can be either a URL to an external file or a UUID of a previously uploaded document. Maximum 5 files allowed. Supported file types: .bmp, .dib, .gif, .jpeg, .jpg, .m2a, .m4a, .m4b, .m4p, .m4r, .m4v, .mp1, .mp2, .mp3, .mp4, .mpa, .oga, .ogg, .ogm, .ogv, .ogx, .png, .spx, .txt, .wav, .webm.
     *
     * @param mmsSampleFilesItem The item to be added to the list.
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign addMmsSampleFilesItem(String mmsSampleFilesItem) {
        if (this.mmsSampleFiles == null) {
            this.mmsSampleFiles = new ArrayList<>();
        }
        this.mmsSampleFiles.add(mmsSampleFilesItem);
        return this;
    }

    /**
     * Returns mmsSampleFiles.
     * <p>
     * Field description:
     * List of MMS sample files for the campaign. Each entry can be either a URL to an external file or a UUID of a previously uploaded document. Maximum 5 files allowed. Supported file types: .bmp, .dib, .gif, .jpeg, .jpg, .m2a, .m4a, .m4b, .m4p, .m4r, .m4v, .mp1, .mp2, .mp3, .mp4, .mpa, .oga, .ogg, .ogm, .ogv, .ogx, .png, .spx, .txt, .wav, .webm.
     *
     * @return mmsSampleFiles
     */
    @JsonProperty("mmsSampleFiles")
    public List<String> getMmsSampleFiles() {
        return mmsSampleFiles;
    }

    /**
     * Sets mmsSampleFiles.
     * <p>
     * Field description:
     * List of MMS sample files for the campaign. Each entry can be either a URL to an external file or a UUID of a previously uploaded document. Maximum 5 files allowed. Supported file types: .bmp, .dib, .gif, .jpeg, .jpg, .m2a, .m4a, .m4b, .m4p, .m4r, .m4v, .mp1, .mp2, .mp3, .mp4, .mpa, .oga, .ogg, .ogm, .ogv, .ogx, .png, .spx, .txt, .wav, .webm.
     *
     * @param mmsSampleFiles
     */
    @JsonProperty("mmsSampleFiles")
    public void setMmsSampleFiles(List<String> mmsSampleFiles) {
        this.mmsSampleFiles = mmsSampleFiles;
    }

    /**
     * Sets supportingDocuments.
     * <p>
     * Field description:
     * List of supporting documents for the campaign. Each entry can be either a URL to an external document or a UUID of a previously uploaded document. Maximum 5 documents allowed. Supported file types: .bmp, .dib, .docx, .htm, .html, .jpeg, .jpg, .odt, .pdf, .png, .raw, .rtf, .tif, .tiff, .txt, .xml.
     *
     * @param supportingDocuments
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign supportingDocuments(List<String> supportingDocuments) {
        this.supportingDocuments = supportingDocuments;
        return this;
    }

    /**
     * Adds and item into supportingDocuments.
     * <p>
     * Field description:
     * List of supporting documents for the campaign. Each entry can be either a URL to an external document or a UUID of a previously uploaded document. Maximum 5 documents allowed. Supported file types: .bmp, .dib, .docx, .htm, .html, .jpeg, .jpg, .odt, .pdf, .png, .raw, .rtf, .tif, .tiff, .txt, .xml.
     *
     * @param supportingDocumentsItem The item to be added to the list.
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign addSupportingDocumentsItem(String supportingDocumentsItem) {
        if (this.supportingDocuments == null) {
            this.supportingDocuments = new ArrayList<>();
        }
        this.supportingDocuments.add(supportingDocumentsItem);
        return this;
    }

    /**
     * Returns supportingDocuments.
     * <p>
     * Field description:
     * List of supporting documents for the campaign. Each entry can be either a URL to an external document or a UUID of a previously uploaded document. Maximum 5 documents allowed. Supported file types: .bmp, .dib, .docx, .htm, .html, .jpeg, .jpg, .odt, .pdf, .png, .raw, .rtf, .tif, .tiff, .txt, .xml.
     *
     * @return supportingDocuments
     */
    @JsonProperty("supportingDocuments")
    public List<String> getSupportingDocuments() {
        return supportingDocuments;
    }

    /**
     * Sets supportingDocuments.
     * <p>
     * Field description:
     * List of supporting documents for the campaign. Each entry can be either a URL to an external document or a UUID of a previously uploaded document. Maximum 5 documents allowed. Supported file types: .bmp, .dib, .docx, .htm, .html, .jpeg, .jpg, .odt, .pdf, .png, .raw, .rtf, .tif, .tiff, .txt, .xml.
     *
     * @param supportingDocuments
     */
    @JsonProperty("supportingDocuments")
    public void setSupportingDocuments(List<String> supportingDocuments) {
        this.supportingDocuments = supportingDocuments;
    }

    /**
     * Sets numberKeys.
     * <p>
     * Field description:
     * The numberKey(s) of the numbers to use with the campaign. Campaign must have at least one 10DLC number associated before it can be submitted for review. Alternatively, you can use the &#39;numbers&#39; property to specify the numbers directly, but note that &#39;numberKeys&#39; property takes precedence if both are specified.
     *
     * @param numberKeys
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign numberKeys(Set<String> numberKeys) {
        this.numberKeys = numberKeys;
        return this;
    }

    /**
     * Adds and item into numberKeys.
     * <p>
     * Field description:
     * The numberKey(s) of the numbers to use with the campaign. Campaign must have at least one 10DLC number associated before it can be submitted for review. Alternatively, you can use the &#39;numbers&#39; property to specify the numbers directly, but note that &#39;numberKeys&#39; property takes precedence if both are specified.
     *
     * @param numberKeysItem The item to be added to the list.
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign addNumberKeysItem(String numberKeysItem) {
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
     * The numberKey(s) of the numbers to use with the campaign. Campaign must have at least one 10DLC number associated before it can be submitted for review. Alternatively, you can use the &#39;numbers&#39; property to specify the numbers directly, but note that &#39;numberKeys&#39; property takes precedence if both are specified.
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
     * The numberKey(s) of the numbers to use with the campaign. Campaign must have at least one 10DLC number associated before it can be submitted for review. Alternatively, you can use the &#39;numbers&#39; property to specify the numbers directly, but note that &#39;numberKeys&#39; property takes precedence if both are specified.
     *
     * @param numberKeys
     */
    @JsonProperty("numberKeys")
    public void setNumberKeys(Set<String> numberKeys) {
        this.numberKeys = numberKeys;
    }

    /**
     * Sets numbers.
     * <p>
     * Field description:
     * US 10DLC numbers to use with the campaign. Campaign must have at least one 10DLC number associated before it can be submitted for review. You may only use numbers that are associated with your account inside the Infobip platform. Numbers must be provided in international format including the country prefix, e.g. 14232180111. This property can be used instead of &#39;numberKeys&#39; to specify the campaign numbers; it is not returned in the API response.
     *
     * @param numbers
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign numbers(Set<String> numbers) {
        this.numbers = numbers;
        return this;
    }

    /**
     * Adds and item into numbers.
     * <p>
     * Field description:
     * US 10DLC numbers to use with the campaign. Campaign must have at least one 10DLC number associated before it can be submitted for review. You may only use numbers that are associated with your account inside the Infobip platform. Numbers must be provided in international format including the country prefix, e.g. 14232180111. This property can be used instead of &#39;numberKeys&#39; to specify the campaign numbers; it is not returned in the API response.
     *
     * @param numbersItem The item to be added to the list.
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign addNumbersItem(String numbersItem) {
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
     * US 10DLC numbers to use with the campaign. Campaign must have at least one 10DLC number associated before it can be submitted for review. You may only use numbers that are associated with your account inside the Infobip platform. Numbers must be provided in international format including the country prefix, e.g. 14232180111. This property can be used instead of &#39;numberKeys&#39; to specify the campaign numbers; it is not returned in the API response.
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
     * US 10DLC numbers to use with the campaign. Campaign must have at least one 10DLC number associated before it can be submitted for review. You may only use numbers that are associated with your account inside the Infobip platform. Numbers must be provided in international format including the country prefix, e.g. 14232180111. This property can be used instead of &#39;numberKeys&#39; to specify the campaign numbers; it is not returned in the API response.
     *
     * @param numbers
     */
    @JsonProperty("numbers")
    public void setNumbers(Set<String> numbers) {
        this.numbers = numbers;
    }

    /**
     * Sets numberPreviews.
     * <p>
     * Field description:
     * The number(s) to use with the campaign. This property is read-only and ignored in POST/PUT calls.
     *
     * @param numberPreviews
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign numberPreviews(Set<NumbersNumberPreview> numberPreviews) {
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
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign addNumberPreviewsItem(NumbersNumberPreview numberPreviewsItem) {
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
     * Sets numberPool.
     *
     * @param numberPool
     * @return This {@link NumbersTenDlcCampaign instance}.
     */
    public NumbersTenDlcCampaign numberPool(NumbersNumberPool numberPool) {
        this.numberPool = numberPool;
        return this;
    }

    /**
     * Returns numberPool.
     *
     * @return numberPool
     */
    @JsonProperty("numberPool")
    public NumbersNumberPool getNumberPool() {
        return numberPool;
    }

    /**
     * Sets numberPool.
     *
     * @param numberPool
     */
    @JsonProperty("numberPool")
    public void setNumberPool(NumbersNumberPool numberPool) {
        this.numberPool = numberPool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersTenDlcCampaign numbersTenDlcCampaign = (NumbersTenDlcCampaign) o;
        return Objects.equals(this.brandId, numbersTenDlcCampaign.brandId)
                && Objects.equals(this.brandPreview, numbersTenDlcCampaign.brandPreview)
                && Objects.equals(this.appealData, numbersTenDlcCampaign.appealData)
                && Objects.equals(this.programSummary, numbersTenDlcCampaign.programSummary)
                && Objects.equals(this.confirmationMessage, numbersTenDlcCampaign.confirmationMessage)
                && Objects.equals(this.exampleMessages, numbersTenDlcCampaign.exampleMessages)
                && Objects.equals(this.helpMessage, numbersTenDlcCampaign.helpMessage)
                && Objects.equals(this.stopMessage, numbersTenDlcCampaign.stopMessage)
                && Objects.equals(this.messageTypes, numbersTenDlcCampaign.messageTypes)
                && Objects.equals(this.termsAndConditionsUrl, numbersTenDlcCampaign.termsAndConditionsUrl)
                && Objects.equals(this.optIns, numbersTenDlcCampaign.optIns)
                && Objects.equals(this.ageGated, numbersTenDlcCampaign.ageGated)
                && Objects.equals(this.customerCarePhone, numbersTenDlcCampaign.customerCarePhone)
                && Objects.equals(this.lowVolume, numbersTenDlcCampaign.lowVolume)
                && Objects.equals(this.useCases, numbersTenDlcCampaign.useCases)
                && Objects.equals(this.directLending, numbersTenDlcCampaign.directLending)
                && Objects.equals(this.embeddedLink, numbersTenDlcCampaign.embeddedLink)
                && Objects.equals(this.embeddedPhone, numbersTenDlcCampaign.embeddedPhone)
                && Objects.equals(this.customerCareEmail, numbersTenDlcCampaign.customerCareEmail)
                && Objects.equals(this.mmsSampleFiles, numbersTenDlcCampaign.mmsSampleFiles)
                && Objects.equals(this.supportingDocuments, numbersTenDlcCampaign.supportingDocuments)
                && Objects.equals(this.numberKeys, numbersTenDlcCampaign.numberKeys)
                && Objects.equals(this.numbers, numbersTenDlcCampaign.numbers)
                && Objects.equals(this.numberPreviews, numbersTenDlcCampaign.numberPreviews)
                && Objects.equals(this.numberPool, numbersTenDlcCampaign.numberPool)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                brandId,
                brandPreview,
                appealData,
                programSummary,
                confirmationMessage,
                exampleMessages,
                helpMessage,
                stopMessage,
                messageTypes,
                termsAndConditionsUrl,
                optIns,
                ageGated,
                customerCarePhone,
                lowVolume,
                useCases,
                directLending,
                embeddedLink,
                embeddedPhone,
                customerCareEmail,
                mmsSampleFiles,
                supportingDocuments,
                numberKeys,
                numbers,
                numberPreviews,
                numberPool,
                super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersTenDlcCampaign {")
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
                .append("    programSummary: ")
                .append(toIndentedString(programSummary))
                .append(newLine)
                .append("    confirmationMessage: ")
                .append(toIndentedString(confirmationMessage))
                .append(newLine)
                .append("    exampleMessages: ")
                .append(toIndentedString(exampleMessages))
                .append(newLine)
                .append("    helpMessage: ")
                .append(toIndentedString(helpMessage))
                .append(newLine)
                .append("    stopMessage: ")
                .append(toIndentedString(stopMessage))
                .append(newLine)
                .append("    messageTypes: ")
                .append(toIndentedString(messageTypes))
                .append(newLine)
                .append("    termsAndConditionsUrl: ")
                .append(toIndentedString(termsAndConditionsUrl))
                .append(newLine)
                .append("    optIns: ")
                .append(toIndentedString(optIns))
                .append(newLine)
                .append("    ageGated: ")
                .append(toIndentedString(ageGated))
                .append(newLine)
                .append("    customerCarePhone: ")
                .append(toIndentedString(customerCarePhone))
                .append(newLine)
                .append("    lowVolume: ")
                .append(toIndentedString(lowVolume))
                .append(newLine)
                .append("    useCases: ")
                .append(toIndentedString(useCases))
                .append(newLine)
                .append("    directLending: ")
                .append(toIndentedString(directLending))
                .append(newLine)
                .append("    embeddedLink: ")
                .append(toIndentedString(embeddedLink))
                .append(newLine)
                .append("    embeddedPhone: ")
                .append(toIndentedString(embeddedPhone))
                .append(newLine)
                .append("    customerCareEmail: ")
                .append(toIndentedString(customerCareEmail))
                .append(newLine)
                .append("    mmsSampleFiles: ")
                .append(toIndentedString(mmsSampleFiles))
                .append(newLine)
                .append("    supportingDocuments: ")
                .append(toIndentedString(supportingDocuments))
                .append(newLine)
                .append("    numberKeys: ")
                .append(toIndentedString(numberKeys))
                .append(newLine)
                .append("    numbers: ")
                .append(toIndentedString(numbers))
                .append(newLine)
                .append("    numberPreviews: ")
                .append(toIndentedString(numberPreviews))
                .append(newLine)
                .append("    numberPool: ")
                .append(toIndentedString(numberPool))
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
