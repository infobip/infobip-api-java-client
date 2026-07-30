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
 * An array of destination objects for where messages are being sent. A valid destination is required.   Note: Maximum number of recipients is 1000 overall including &#x60;to&#x60;, &#x60;cc&#x60; and &#x60;bcc&#x60; field.
 */
public class EmailGroupDestination {

    private List<EmailToDestination> to = new ArrayList<>();

    private List<EmailToDestination> cc = null;

    private List<EmailToDestination> bcc = null;

    private String replyTo;

    private Boolean preserveRecipients;

    /**
     * Sets to.
     * <p>
     * Field description:
     * List of TO recipient email addresses.
     * <p>
     * The field is required.
     *
     * @param to
     * @return This {@link EmailGroupDestination instance}.
     */
    public EmailGroupDestination to(List<EmailToDestination> to) {
        this.to = to;
        return this;
    }

    /**
     * Adds and item into to.
     * <p>
     * Field description:
     * List of TO recipient email addresses.
     * <p>
     * The field is required.
     *
     * @param toItem The item to be added to the list.
     * @return This {@link EmailGroupDestination instance}.
     */
    public EmailGroupDestination addToItem(EmailToDestination toItem) {
        if (this.to == null) {
            this.to = new ArrayList<>();
        }
        this.to.add(toItem);
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * List of TO recipient email addresses.
     * <p>
     * The field is required.
     *
     * @return to
     */
    @JsonProperty("to")
    public List<EmailToDestination> getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * List of TO recipient email addresses.
     * <p>
     * The field is required.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(List<EmailToDestination> to) {
        this.to = to;
    }

    /**
     * Sets cc.
     * <p>
     * Field description:
     * List of CC recipient email addresses.
     *
     * @param cc
     * @return This {@link EmailGroupDestination instance}.
     */
    public EmailGroupDestination cc(List<EmailToDestination> cc) {
        this.cc = cc;
        return this;
    }

    /**
     * Adds and item into cc.
     * <p>
     * Field description:
     * List of CC recipient email addresses.
     *
     * @param ccItem The item to be added to the list.
     * @return This {@link EmailGroupDestination instance}.
     */
    public EmailGroupDestination addCcItem(EmailToDestination ccItem) {
        if (this.cc == null) {
            this.cc = new ArrayList<>();
        }
        this.cc.add(ccItem);
        return this;
    }

    /**
     * Returns cc.
     * <p>
     * Field description:
     * List of CC recipient email addresses.
     *
     * @return cc
     */
    @JsonProperty("cc")
    public List<EmailToDestination> getCc() {
        return cc;
    }

    /**
     * Sets cc.
     * <p>
     * Field description:
     * List of CC recipient email addresses.
     *
     * @param cc
     */
    @JsonProperty("cc")
    public void setCc(List<EmailToDestination> cc) {
        this.cc = cc;
    }

    /**
     * Sets bcc.
     * <p>
     * Field description:
     * List of BCC recipient email addresses.
     *
     * @param bcc
     * @return This {@link EmailGroupDestination instance}.
     */
    public EmailGroupDestination bcc(List<EmailToDestination> bcc) {
        this.bcc = bcc;
        return this;
    }

    /**
     * Adds and item into bcc.
     * <p>
     * Field description:
     * List of BCC recipient email addresses.
     *
     * @param bccItem The item to be added to the list.
     * @return This {@link EmailGroupDestination instance}.
     */
    public EmailGroupDestination addBccItem(EmailToDestination bccItem) {
        if (this.bcc == null) {
            this.bcc = new ArrayList<>();
        }
        this.bcc.add(bccItem);
        return this;
    }

    /**
     * Returns bcc.
     * <p>
     * Field description:
     * List of BCC recipient email addresses.
     *
     * @return bcc
     */
    @JsonProperty("bcc")
    public List<EmailToDestination> getBcc() {
        return bcc;
    }

    /**
     * Sets bcc.
     * <p>
     * Field description:
     * List of BCC recipient email addresses.
     *
     * @param bcc
     */
    @JsonProperty("bcc")
    public void setBcc(List<EmailToDestination> bcc) {
        this.bcc = bcc;
    }

    /**
     * Sets replyTo.
     * <p>
     * Field description:
     * Email address to which recipients of the email can reply.
     *
     * @param replyTo
     * @return This {@link EmailGroupDestination instance}.
     */
    public EmailGroupDestination replyTo(String replyTo) {
        this.replyTo = replyTo;
        return this;
    }

    /**
     * Returns replyTo.
     * <p>
     * Field description:
     * Email address to which recipients of the email can reply.
     *
     * @return replyTo
     */
    @JsonProperty("replyTo")
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * Sets replyTo.
     * <p>
     * Field description:
     * Email address to which recipients of the email can reply.
     *
     * @param replyTo
     */
    @JsonProperty("replyTo")
    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }

    /**
     * Sets preserveRecipients.
     * <p>
     * Field description:
     * When this option is set to &#x60;true&#x60;, all recipients in the &#x60;to&#x60; field will be able to see the entire list of recipients who received the email, and the response will include a single &#x60;messageId&#x60;. If the option is set to &#x60;false&#x60; , each recipient will only see their own email address, and the response will provide a unique &#x60;messageId&#x60; for each individual recipient.
     *
     * @param preserveRecipients
     * @return This {@link EmailGroupDestination instance}.
     */
    public EmailGroupDestination preserveRecipients(Boolean preserveRecipients) {
        this.preserveRecipients = preserveRecipients;
        return this;
    }

    /**
     * Returns preserveRecipients.
     * <p>
     * Field description:
     * When this option is set to &#x60;true&#x60;, all recipients in the &#x60;to&#x60; field will be able to see the entire list of recipients who received the email, and the response will include a single &#x60;messageId&#x60;. If the option is set to &#x60;false&#x60; , each recipient will only see their own email address, and the response will provide a unique &#x60;messageId&#x60; for each individual recipient.
     *
     * @return preserveRecipients
     */
    @JsonProperty("preserveRecipients")
    public Boolean getPreserveRecipients() {
        return preserveRecipients;
    }

    /**
     * Sets preserveRecipients.
     * <p>
     * Field description:
     * When this option is set to &#x60;true&#x60;, all recipients in the &#x60;to&#x60; field will be able to see the entire list of recipients who received the email, and the response will include a single &#x60;messageId&#x60;. If the option is set to &#x60;false&#x60; , each recipient will only see their own email address, and the response will provide a unique &#x60;messageId&#x60; for each individual recipient.
     *
     * @param preserveRecipients
     */
    @JsonProperty("preserveRecipients")
    public void setPreserveRecipients(Boolean preserveRecipients) {
        this.preserveRecipients = preserveRecipients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailGroupDestination emailGroupDestination = (EmailGroupDestination) o;
        return Objects.equals(this.to, emailGroupDestination.to)
                && Objects.equals(this.cc, emailGroupDestination.cc)
                && Objects.equals(this.bcc, emailGroupDestination.bcc)
                && Objects.equals(this.replyTo, emailGroupDestination.replyTo)
                && Objects.equals(this.preserveRecipients, emailGroupDestination.preserveRecipients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, cc, bcc, replyTo, preserveRecipients);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailGroupDestination {")
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    cc: ")
                .append(toIndentedString(cc))
                .append(newLine)
                .append("    bcc: ")
                .append(toIndentedString(bcc))
                .append(newLine)
                .append("    replyTo: ")
                .append(toIndentedString(replyTo))
                .append(newLine)
                .append("    preserveRecipients: ")
                .append(toIndentedString(preserveRecipients))
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
