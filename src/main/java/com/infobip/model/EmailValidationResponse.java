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
 * Represents EmailValidationResponse model.
 */
public class EmailValidationResponse {

    private String to;

    private String validMailbox;

    private Boolean validSyntax;

    private Boolean catchAll;

    private String didYouMean;

    private Boolean disposable;

    private Boolean roleBased;

    private String reason;

    /**
     * Sets to.
     * <p>
     * Field description:
     * Email address of the recipient.
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
     * Email address of the recipient.
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
     * Email address of the recipient.
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
     * Represents status of recipient email address.
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
     * Represents status of recipient email address.
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
     * Represents status of recipient email address.
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
     * Represents syntax of recipient email address.
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
     * Represents syntax of recipient email address.
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
     * Represents syntax of recipient email address.
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
     * Denotes catch all status of recipient email address.
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
     * Denotes catch all status of recipient email address.
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
     * Denotes catch all status of recipient email address.
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
     * Suggests alternate addresses that maybe valid.
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
     * Suggests alternate addresses that maybe valid.
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
     * Suggests alternate addresses that maybe valid.
     *
     * @param didYouMean
     */
    @JsonProperty("didYouMean")
    public void setDidYouMean(String didYouMean) {
        this.didYouMean = didYouMean;
    }

    /**
     * Sets disposable.
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
     *
     * @return disposable
     */
    @JsonProperty("disposable")
    public Boolean getDisposable() {
        return disposable;
    }

    /**
     * Sets disposable.
     *
     * @param disposable
     */
    @JsonProperty("disposable")
    public void setDisposable(Boolean disposable) {
        this.disposable = disposable;
    }

    /**
     * Sets roleBased.
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
     *
     * @return roleBased
     */
    @JsonProperty("roleBased")
    public Boolean getRoleBased() {
        return roleBased;
    }

    /**
     * Sets roleBased.
     *
     * @param roleBased
     */
    @JsonProperty("roleBased")
    public void setRoleBased(Boolean roleBased) {
        this.roleBased = roleBased;
    }

    /**
     * Sets reason.
     * <p>
     * Field description:
     * Reason is provided when validMailbox status is unknown. 1. INBOX_FULL - The user quota exceeded / The user inbox is full / The user doesn&#39;t accept any more requests.  2. UNEXPECTED_FAILURE - The mail Server returned a temporary error. 3. THROTTLED - The mail server is not allowing us momentarily because of too many requests. 4. TIMED_OUT - The Mail Server took a longer time to respond / there was a delay in the network. 5. TEMP_REJECTION - Mail server temporarily rejected. 6. UNABLE_TO_CONNECT - Unable to connect to the Mail Server.
     *
     * @param reason
     * @return This {@link EmailValidationResponse instance}.
     */
    public EmailValidationResponse reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Returns reason.
     * <p>
     * Field description:
     * Reason is provided when validMailbox status is unknown. 1. INBOX_FULL - The user quota exceeded / The user inbox is full / The user doesn&#39;t accept any more requests.  2. UNEXPECTED_FAILURE - The mail Server returned a temporary error. 3. THROTTLED - The mail server is not allowing us momentarily because of too many requests. 4. TIMED_OUT - The Mail Server took a longer time to respond / there was a delay in the network. 5. TEMP_REJECTION - Mail server temporarily rejected. 6. UNABLE_TO_CONNECT - Unable to connect to the Mail Server.
     *
     * @return reason
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Sets reason.
     * <p>
     * Field description:
     * Reason is provided when validMailbox status is unknown. 1. INBOX_FULL - The user quota exceeded / The user inbox is full / The user doesn&#39;t accept any more requests.  2. UNEXPECTED_FAILURE - The mail Server returned a temporary error. 3. THROTTLED - The mail server is not allowing us momentarily because of too many requests. 4. TIMED_OUT - The Mail Server took a longer time to respond / there was a delay in the network. 5. TEMP_REJECTION - Mail server temporarily rejected. 6. UNABLE_TO_CONNECT - Unable to connect to the Mail Server.
     *
     * @param reason
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
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
                && Objects.equals(this.reason, emailValidationResponse.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, validMailbox, validSyntax, catchAll, didYouMean, disposable, roleBased, reason);
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
