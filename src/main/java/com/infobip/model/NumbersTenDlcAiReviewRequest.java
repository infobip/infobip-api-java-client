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
import java.util.List;
import java.util.Objects;

/**
 * Request to submit 10DLC campaign info for AI compliance review with full details
 */
public class NumbersTenDlcAiReviewRequest {

    private String optInMessage;

    private String helpMessage;

    private String optOutMessage;

    private String ctaWebsite;

    private List<String> ctas = new ArrayList<>();

    private List<NumbersTenDlcUseCase> useCases = new ArrayList<>();

    private Boolean ageGated;

    private Boolean directLending;

    private String messageFlow;

    /**
     * Sets optInMessage.
     * <p>
     * Field description:
     * The message sent to the user after they have subscribed.
     * <p>
     * The field is required.
     *
     * @param optInMessage
     * @return This {@link NumbersTenDlcAiReviewRequest instance}.
     */
    public NumbersTenDlcAiReviewRequest optInMessage(String optInMessage) {
        this.optInMessage = optInMessage;
        return this;
    }

    /**
     * Returns optInMessage.
     * <p>
     * Field description:
     * The message sent to the user after they have subscribed.
     * <p>
     * The field is required.
     *
     * @return optInMessage
     */
    @JsonProperty("optInMessage")
    public String getOptInMessage() {
        return optInMessage;
    }

    /**
     * Sets optInMessage.
     * <p>
     * Field description:
     * The message sent to the user after they have subscribed.
     * <p>
     * The field is required.
     *
     * @param optInMessage
     */
    @JsonProperty("optInMessage")
    public void setOptInMessage(String optInMessage) {
        this.optInMessage = optInMessage;
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
     * @return This {@link NumbersTenDlcAiReviewRequest instance}.
     */
    public NumbersTenDlcAiReviewRequest helpMessage(String helpMessage) {
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
     * Sets optOutMessage.
     * <p>
     * Field description:
     * The message sent to a user after they have asked to stop receiving messages.
     * <p>
     * The field is required.
     *
     * @param optOutMessage
     * @return This {@link NumbersTenDlcAiReviewRequest instance}.
     */
    public NumbersTenDlcAiReviewRequest optOutMessage(String optOutMessage) {
        this.optOutMessage = optOutMessage;
        return this;
    }

    /**
     * Returns optOutMessage.
     * <p>
     * Field description:
     * The message sent to a user after they have asked to stop receiving messages.
     * <p>
     * The field is required.
     *
     * @return optOutMessage
     */
    @JsonProperty("optOutMessage")
    public String getOptOutMessage() {
        return optOutMessage;
    }

    /**
     * Sets optOutMessage.
     * <p>
     * Field description:
     * The message sent to a user after they have asked to stop receiving messages.
     * <p>
     * The field is required.
     *
     * @param optOutMessage
     */
    @JsonProperty("optOutMessage")
    public void setOptOutMessage(String optOutMessage) {
        this.optOutMessage = optOutMessage;
    }

    /**
     * Sets ctaWebsite.
     * <p>
     * Field description:
     * CTA website URL
     * <p>
     * The field is required.
     *
     * @param ctaWebsite
     * @return This {@link NumbersTenDlcAiReviewRequest instance}.
     */
    public NumbersTenDlcAiReviewRequest ctaWebsite(String ctaWebsite) {
        this.ctaWebsite = ctaWebsite;
        return this;
    }

    /**
     * Returns ctaWebsite.
     * <p>
     * Field description:
     * CTA website URL
     * <p>
     * The field is required.
     *
     * @return ctaWebsite
     */
    @JsonProperty("ctaWebsite")
    public String getCtaWebsite() {
        return ctaWebsite;
    }

    /**
     * Sets ctaWebsite.
     * <p>
     * Field description:
     * CTA website URL
     * <p>
     * The field is required.
     *
     * @param ctaWebsite
     */
    @JsonProperty("ctaWebsite")
    public void setCtaWebsite(String ctaWebsite) {
        this.ctaWebsite = ctaWebsite;
    }

    /**
     * Sets ctas.
     * <p>
     * Field description:
     * List of call-to-action texts
     * <p>
     * The field is required.
     *
     * @param ctas
     * @return This {@link NumbersTenDlcAiReviewRequest instance}.
     */
    public NumbersTenDlcAiReviewRequest ctas(List<String> ctas) {
        this.ctas = ctas;
        return this;
    }

    /**
     * Adds and item into ctas.
     * <p>
     * Field description:
     * List of call-to-action texts
     * <p>
     * The field is required.
     *
     * @param ctasItem The item to be added to the list.
     * @return This {@link NumbersTenDlcAiReviewRequest instance}.
     */
    public NumbersTenDlcAiReviewRequest addCtasItem(String ctasItem) {
        if (this.ctas == null) {
            this.ctas = new ArrayList<>();
        }
        this.ctas.add(ctasItem);
        return this;
    }

    /**
     * Returns ctas.
     * <p>
     * Field description:
     * List of call-to-action texts
     * <p>
     * The field is required.
     *
     * @return ctas
     */
    @JsonProperty("ctas")
    public List<String> getCtas() {
        return ctas;
    }

    /**
     * Sets ctas.
     * <p>
     * Field description:
     * List of call-to-action texts
     * <p>
     * The field is required.
     *
     * @param ctas
     */
    @JsonProperty("ctas")
    public void setCtas(List<String> ctas) {
        this.ctas = ctas;
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
     * @return This {@link NumbersTenDlcAiReviewRequest instance}.
     */
    public NumbersTenDlcAiReviewRequest useCases(List<NumbersTenDlcUseCase> useCases) {
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
     * @return This {@link NumbersTenDlcAiReviewRequest instance}.
     */
    public NumbersTenDlcAiReviewRequest addUseCasesItem(NumbersTenDlcUseCase useCasesItem) {
        if (this.useCases == null) {
            this.useCases = new ArrayList<>();
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
    public List<NumbersTenDlcUseCase> getUseCases() {
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
    public void setUseCases(List<NumbersTenDlcUseCase> useCases) {
        this.useCases = useCases;
    }

    /**
     * Sets ageGated.
     * <p>
     * Field description:
     * Whether the campaign is age-gated (18+)
     * <p>
     * The field is required.
     *
     * @param ageGated
     * @return This {@link NumbersTenDlcAiReviewRequest instance}.
     */
    public NumbersTenDlcAiReviewRequest ageGated(Boolean ageGated) {
        this.ageGated = ageGated;
        return this;
    }

    /**
     * Returns ageGated.
     * <p>
     * Field description:
     * Whether the campaign is age-gated (18+)
     * <p>
     * The field is required.
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
     * Whether the campaign is age-gated (18+)
     * <p>
     * The field is required.
     *
     * @param ageGated
     */
    @JsonProperty("ageGated")
    public void setAgeGated(Boolean ageGated) {
        this.ageGated = ageGated;
    }

    /**
     * Sets directLending.
     * <p>
     * Field description:
     * Whether the campaign involves direct lending
     * <p>
     * The field is required.
     *
     * @param directLending
     * @return This {@link NumbersTenDlcAiReviewRequest instance}.
     */
    public NumbersTenDlcAiReviewRequest directLending(Boolean directLending) {
        this.directLending = directLending;
        return this;
    }

    /**
     * Returns directLending.
     * <p>
     * Field description:
     * Whether the campaign involves direct lending
     * <p>
     * The field is required.
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
     * Whether the campaign involves direct lending
     * <p>
     * The field is required.
     *
     * @param directLending
     */
    @JsonProperty("directLending")
    public void setDirectLending(Boolean directLending) {
        this.directLending = directLending;
    }

    /**
     * Sets messageFlow.
     * <p>
     * Field description:
     * Message flow description
     * <p>
     * The field is required.
     *
     * @param messageFlow
     * @return This {@link NumbersTenDlcAiReviewRequest instance}.
     */
    public NumbersTenDlcAiReviewRequest messageFlow(String messageFlow) {
        this.messageFlow = messageFlow;
        return this;
    }

    /**
     * Returns messageFlow.
     * <p>
     * Field description:
     * Message flow description
     * <p>
     * The field is required.
     *
     * @return messageFlow
     */
    @JsonProperty("messageFlow")
    public String getMessageFlow() {
        return messageFlow;
    }

    /**
     * Sets messageFlow.
     * <p>
     * Field description:
     * Message flow description
     * <p>
     * The field is required.
     *
     * @param messageFlow
     */
    @JsonProperty("messageFlow")
    public void setMessageFlow(String messageFlow) {
        this.messageFlow = messageFlow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersTenDlcAiReviewRequest numbersTenDlcAiReviewRequest = (NumbersTenDlcAiReviewRequest) o;
        return Objects.equals(this.optInMessage, numbersTenDlcAiReviewRequest.optInMessage)
                && Objects.equals(this.helpMessage, numbersTenDlcAiReviewRequest.helpMessage)
                && Objects.equals(this.optOutMessage, numbersTenDlcAiReviewRequest.optOutMessage)
                && Objects.equals(this.ctaWebsite, numbersTenDlcAiReviewRequest.ctaWebsite)
                && Objects.equals(this.ctas, numbersTenDlcAiReviewRequest.ctas)
                && Objects.equals(this.useCases, numbersTenDlcAiReviewRequest.useCases)
                && Objects.equals(this.ageGated, numbersTenDlcAiReviewRequest.ageGated)
                && Objects.equals(this.directLending, numbersTenDlcAiReviewRequest.directLending)
                && Objects.equals(this.messageFlow, numbersTenDlcAiReviewRequest.messageFlow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                optInMessage,
                helpMessage,
                optOutMessage,
                ctaWebsite,
                ctas,
                useCases,
                ageGated,
                directLending,
                messageFlow);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersTenDlcAiReviewRequest {")
                .append(newLine)
                .append("    optInMessage: ")
                .append(toIndentedString(optInMessage))
                .append(newLine)
                .append("    helpMessage: ")
                .append(toIndentedString(helpMessage))
                .append(newLine)
                .append("    optOutMessage: ")
                .append(toIndentedString(optOutMessage))
                .append(newLine)
                .append("    ctaWebsite: ")
                .append(toIndentedString(ctaWebsite))
                .append(newLine)
                .append("    ctas: ")
                .append(toIndentedString(ctas))
                .append(newLine)
                .append("    useCases: ")
                .append(toIndentedString(useCases))
                .append(newLine)
                .append("    ageGated: ")
                .append(toIndentedString(ageGated))
                .append(newLine)
                .append("    directLending: ")
                .append(toIndentedString(directLending))
                .append(newLine)
                .append("    messageFlow: ")
                .append(toIndentedString(messageFlow))
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
