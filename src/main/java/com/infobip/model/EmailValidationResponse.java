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
import java.util.Objects;

/**
 * Validation response
 */
public class EmailValidationResponse {

    private String to;

    private String validMailbox;

    private Boolean validSyntax;

    private Boolean catchAll;

    private String didYouMean;

    private Boolean disposable;

    private Boolean roleBased;

    private EmailValidationReason reason;

    private EmailValidationApiRisk risk;

    private String detailedReasons;

    /**
     * Sets to.
     * <p>
     * Field description:
     * The validated email address.
     * <p>
     * The field is required.
     *
     * @param to
     * @return This {@link EmailValidationResponse instance}.
     */
    public EmailValidationResponse to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * The validated email address.
     * <p>
     * The field is required.
     *
     * @return to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * The validated email address.
     * <p>
     * The field is required.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets validMailbox.
     * <p>
     * Field description:
     * Indicates whether email address is valid.
     * <p>
     * The field is required.
     *
     * @param validMailbox
     * @return This {@link EmailValidationResponse instance}.
     */
    public EmailValidationResponse validMailbox(String validMailbox) {
        this.validMailbox = validMailbox;
        return this;
    }

    /**
     * Returns validMailbox.
     * <p>
     * Field description:
     * Indicates whether email address is valid.
     * <p>
     * The field is required.
     *
     * @return validMailbox
     */
    @JsonProperty("validMailbox")
    public String getValidMailbox() {
        return validMailbox;
    }

    /**
     * Sets validMailbox.
     * <p>
     * Field description:
     * Indicates whether email address is valid.
     * <p>
     * The field is required.
     *
     * @param validMailbox
     */
    @JsonProperty("validMailbox")
    public void setValidMailbox(String validMailbox) {
        this.validMailbox = validMailbox;
    }

    /**
     * Sets validSyntax.
     * <p>
     * Field description:
     * Indicates whether email address syntax is valid.
     * <p>
     * The field is required.
     *
     * @param validSyntax
     * @return This {@link EmailValidationResponse instance}.
     */
    public EmailValidationResponse validSyntax(Boolean validSyntax) {
        this.validSyntax = validSyntax;
        return this;
    }

    /**
     * Returns validSyntax.
     * <p>
     * Field description:
     * Indicates whether email address syntax is valid.
     * <p>
     * The field is required.
     *
     * @return validSyntax
     */
    @JsonProperty("validSyntax")
    public Boolean getValidSyntax() {
        return validSyntax;
    }

    /**
     * Sets validSyntax.
     * <p>
     * Field description:
     * Indicates whether email address syntax is valid.
     * <p>
     * The field is required.
     *
     * @param validSyntax
     */
    @JsonProperty("validSyntax")
    public void setValidSyntax(Boolean validSyntax) {
        this.validSyntax = validSyntax;
    }

    /**
     * Sets catchAll.
     * <p>
     * Field description:
     * Indicates catch all status of email address.
     * <p>
     * The field is required.
     *
     * @param catchAll
     * @return This {@link EmailValidationResponse instance}.
     */
    public EmailValidationResponse catchAll(Boolean catchAll) {
        this.catchAll = catchAll;
        return this;
    }

    /**
     * Returns catchAll.
     * <p>
     * Field description:
     * Indicates catch all status of email address.
     * <p>
     * The field is required.
     *
     * @return catchAll
     */
    @JsonProperty("catchAll")
    public Boolean getCatchAll() {
        return catchAll;
    }

    /**
     * Sets catchAll.
     * <p>
     * Field description:
     * Indicates catch all status of email address.
     * <p>
     * The field is required.
     *
     * @param catchAll
     */
    @JsonProperty("catchAll")
    public void setCatchAll(Boolean catchAll) {
        this.catchAll = catchAll;
    }

    /**
     * Sets didYouMean.
     * <p>
     * Field description:
     * Suggests similar alternate address that may be valid.
     *
     * @param didYouMean
     * @return This {@link EmailValidationResponse instance}.
     */
    public EmailValidationResponse didYouMean(String didYouMean) {
        this.didYouMean = didYouMean;
        return this;
    }

    /**
     * Returns didYouMean.
     * <p>
     * Field description:
     * Suggests similar alternate address that may be valid.
     *
     * @return didYouMean
     */
    @JsonProperty("didYouMean")
    public String getDidYouMean() {
        return didYouMean;
    }

    /**
     * Sets didYouMean.
     * <p>
     * Field description:
     * Suggests similar alternate address that may be valid.
     *
     * @param didYouMean
     */
    @JsonProperty("didYouMean")
    public void setDidYouMean(String didYouMean) {
        this.didYouMean = didYouMean;
    }

    /**
     * Sets disposable.
     * <p>
     * Field description:
     * Indicates whether email address is disposable. A disposable email address is a temporary address that is often used for short-term purposes and can be discarded after use.
     * <p>
     * The field is required.
     *
     * @param disposable
     * @return This {@link EmailValidationResponse instance}.
     */
    public EmailValidationResponse disposable(Boolean disposable) {
        this.disposable = disposable;
        return this;
    }

    /**
     * Returns disposable.
     * <p>
     * Field description:
     * Indicates whether email address is disposable. A disposable email address is a temporary address that is often used for short-term purposes and can be discarded after use.
     * <p>
     * The field is required.
     *
     * @return disposable
     */
    @JsonProperty("disposable")
    public Boolean getDisposable() {
        return disposable;
    }

    /**
     * Sets disposable.
     * <p>
     * Field description:
     * Indicates whether email address is disposable. A disposable email address is a temporary address that is often used for short-term purposes and can be discarded after use.
     * <p>
     * The field is required.
     *
     * @param disposable
     */
    @JsonProperty("disposable")
    public void setDisposable(Boolean disposable) {
        this.disposable = disposable;
    }

    /**
     * Sets roleBased.
     * <p>
     * Field description:
     * Indicates whether email address is role-based. A role-based email address is one that is associated with a specific function or group within an organization, such as marketing@example.org, rather than an individual person.
     * <p>
     * The field is required.
     *
     * @param roleBased
     * @return This {@link EmailValidationResponse instance}.
     */
    public EmailValidationResponse roleBased(Boolean roleBased) {
        this.roleBased = roleBased;
        return this;
    }

    /**
     * Returns roleBased.
     * <p>
     * Field description:
     * Indicates whether email address is role-based. A role-based email address is one that is associated with a specific function or group within an organization, such as marketing@example.org, rather than an individual person.
     * <p>
     * The field is required.
     *
     * @return roleBased
     */
    @JsonProperty("roleBased")
    public Boolean getRoleBased() {
        return roleBased;
    }

    /**
     * Sets roleBased.
     * <p>
     * Field description:
     * Indicates whether email address is role-based. A role-based email address is one that is associated with a specific function or group within an organization, such as marketing@example.org, rather than an individual person.
     * <p>
     * The field is required.
     *
     * @param roleBased
     */
    @JsonProperty("roleBased")
    public void setRoleBased(Boolean roleBased) {
        this.roleBased = roleBased;
    }

    /**
     * Sets reason.
     *
     * @param reason
     * @return This {@link EmailValidationResponse instance}.
     */
    public EmailValidationResponse reason(EmailValidationReason reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Returns reason.
     *
     * @return reason
     */
    @JsonProperty("reason")
    public EmailValidationReason getReason() {
        return reason;
    }

    /**
     * Sets reason.
     *
     * @param reason
     */
    @JsonProperty("reason")
    public void setReason(EmailValidationReason reason) {
        this.reason = reason;
    }

    /**
     * Sets risk.
     * <p>
     * The field is required.
     *
     * @param risk
     * @return This {@link EmailValidationResponse instance}.
     */
    public EmailValidationResponse risk(EmailValidationApiRisk risk) {
        this.risk = risk;
        return this;
    }

    /**
     * Returns risk.
     * <p>
     * The field is required.
     *
     * @return risk
     */
    @JsonProperty("risk")
    public EmailValidationApiRisk getRisk() {
        return risk;
    }

    /**
     * Sets risk.
     * <p>
     * The field is required.
     *
     * @param risk
     */
    @JsonProperty("risk")
    public void setRisk(EmailValidationApiRisk risk) {
        this.risk = risk;
    }

    /**
     * Sets detailedReasons.
     * <p>
     * Field description:
     * This field is provided when the validMailbox status is &#39;unknown&#39; or &#39;false&#39;, offering specific explanations for why the email address has been assigned that status.
     *
     * @param detailedReasons
     * @return This {@link EmailValidationResponse instance}.
     */
    public EmailValidationResponse detailedReasons(String detailedReasons) {
        this.detailedReasons = detailedReasons;
        return this;
    }

    /**
     * Returns detailedReasons.
     * <p>
     * Field description:
     * This field is provided when the validMailbox status is &#39;unknown&#39; or &#39;false&#39;, offering specific explanations for why the email address has been assigned that status.
     *
     * @return detailedReasons
     */
    @JsonProperty("detailedReasons")
    public String getDetailedReasons() {
        return detailedReasons;
    }

    /**
     * Sets detailedReasons.
     * <p>
     * Field description:
     * This field is provided when the validMailbox status is &#39;unknown&#39; or &#39;false&#39;, offering specific explanations for why the email address has been assigned that status.
     *
     * @param detailedReasons
     */
    @JsonProperty("detailedReasons")
    public void setDetailedReasons(String detailedReasons) {
        this.detailedReasons = detailedReasons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailValidationResponse emailValidationResponse = (EmailValidationResponse) o;
        return Objects.equals(this.to, emailValidationResponse.to)
                && Objects.equals(this.validMailbox, emailValidationResponse.validMailbox)
                && Objects.equals(this.validSyntax, emailValidationResponse.validSyntax)
                && Objects.equals(this.catchAll, emailValidationResponse.catchAll)
                && Objects.equals(this.didYouMean, emailValidationResponse.didYouMean)
                && Objects.equals(this.disposable, emailValidationResponse.disposable)
                && Objects.equals(this.roleBased, emailValidationResponse.roleBased)
                && Objects.equals(this.reason, emailValidationResponse.reason)
                && Objects.equals(this.risk, emailValidationResponse.risk)
                && Objects.equals(this.detailedReasons, emailValidationResponse.detailedReasons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                to,
                validMailbox,
                validSyntax,
                catchAll,
                didYouMean,
                disposable,
                roleBased,
                reason,
                risk,
                detailedReasons);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailValidationResponse {")
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    validMailbox: ")
                .append(toIndentedString(validMailbox))
                .append(newLine)
                .append("    validSyntax: ")
                .append(toIndentedString(validSyntax))
                .append(newLine)
                .append("    catchAll: ")
                .append(toIndentedString(catchAll))
                .append(newLine)
                .append("    didYouMean: ")
                .append(toIndentedString(didYouMean))
                .append(newLine)
                .append("    disposable: ")
                .append(toIndentedString(disposable))
                .append(newLine)
                .append("    roleBased: ")
                .append(toIndentedString(roleBased))
                .append(newLine)
                .append("    reason: ")
                .append(toIndentedString(reason))
                .append(newLine)
                .append("    risk: ")
                .append(toIndentedString(risk))
                .append(newLine)
                .append("    detailedReasons: ")
                .append(toIndentedString(detailedReasons))
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
