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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents TfaStartAuthenticationRequest model.
 */
public class TfaStartAuthenticationRequest {

    private String applicationId;

    private String from;

    private String messageId;

    private Map<String, String> placeholders = null;

    private String to;

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * The ID of the application that represents your service, e.g. 2FA for login, 2FA for changing the password, etc.
     * <p>
     * The field is required.
     *
     * @param applicationId
     * @return This {@link TfaStartAuthenticationRequest instance}.
     */
    public TfaStartAuthenticationRequest applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * The ID of the application that represents your service, e.g. 2FA for login, 2FA for changing the password, etc.
     * <p>
     * The field is required.
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
     * The ID of the application that represents your service, e.g. 2FA for login, 2FA for changing the password, etc.
     * <p>
     * The field is required.
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Use this parameter if you wish to override the sender ID from the [created](#channels/sms/create-2fa-message-template) message template parameter &#x60;senderId&#x60;.
     *
     * @param from
     * @return This {@link TfaStartAuthenticationRequest instance}.
     */
    public TfaStartAuthenticationRequest from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Use this parameter if you wish to override the sender ID from the [created](#channels/sms/create-2fa-message-template) message template parameter &#x60;senderId&#x60;.
     *
     * @return from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Use this parameter if you wish to override the sender ID from the [created](#channels/sms/create-2fa-message-template) message template parameter &#x60;senderId&#x60;.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID of the message template (message body with the PIN placeholder) that is sent to the recipient.
     * <p>
     * The field is required.
     *
     * @param messageId
     * @return This {@link TfaStartAuthenticationRequest instance}.
     */
    public TfaStartAuthenticationRequest messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID of the message template (message body with the PIN placeholder) that is sent to the recipient.
     * <p>
     * The field is required.
     *
     * @return messageId
     */
    @JsonProperty("messageId")
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * The ID of the message template (message body with the PIN placeholder) that is sent to the recipient.
     * <p>
     * The field is required.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets placeholders.
     * <p>
     * Field description:
     * Key value pairs that will be replaced during message sending. Placeholder keys should NOT contain curly brackets and should NOT contain a &#x60;pin&#x60; placeholder. Valid example: &#x60;\&quot;placeholders\&quot;:{\&quot;firstName\&quot;:\&quot;John\&quot;}&#x60;
     *
     * @param placeholders
     * @return This {@link TfaStartAuthenticationRequest instance}.
     */
    public TfaStartAuthenticationRequest placeholders(Map<String, String> placeholders) {
        this.placeholders = placeholders;
        return this;
    }

    /**
     * Puts and entry into placeholders.
     * <p>
     * Field description:
     * Key value pairs that will be replaced during message sending. Placeholder keys should NOT contain curly brackets and should NOT contain a &#x60;pin&#x60; placeholder. Valid example: &#x60;\&quot;placeholders\&quot;:{\&quot;firstName\&quot;:\&quot;John\&quot;}&#x60;
     *
     * @param key The given key.
     * @param placeholdersItem The item to be associated with the given key.
     * @return This {@link TfaStartAuthenticationRequest instance}.
     */
    public TfaStartAuthenticationRequest putPlaceholdersItem(String key, String placeholdersItem) {
        if (this.placeholders == null) {
            this.placeholders = new HashMap<>();
        }
        this.placeholders.put(key, placeholdersItem);
        return this;
    }

    /**
     * Returns placeholders.
     * <p>
     * Field description:
     * Key value pairs that will be replaced during message sending. Placeholder keys should NOT contain curly brackets and should NOT contain a &#x60;pin&#x60; placeholder. Valid example: &#x60;\&quot;placeholders\&quot;:{\&quot;firstName\&quot;:\&quot;John\&quot;}&#x60;
     *
     * @return placeholders
     */
    @JsonProperty("placeholders")
    public Map<String, String> getPlaceholders() {
        return placeholders;
    }

    /**
     * Sets placeholders.
     * <p>
     * Field description:
     * Key value pairs that will be replaced during message sending. Placeholder keys should NOT contain curly brackets and should NOT contain a &#x60;pin&#x60; placeholder. Valid example: &#x60;\&quot;placeholders\&quot;:{\&quot;firstName\&quot;:\&quot;John\&quot;}&#x60;
     *
     * @param placeholders
     */
    @JsonProperty("placeholders")
    public void setPlaceholders(Map<String, String> placeholders) {
        this.placeholders = placeholders;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Phone number to which the 2FA message will be sent. Example: 41793026727.
     * <p>
     * The field is required.
     *
     * @param to
     * @return This {@link TfaStartAuthenticationRequest instance}.
     */
    public TfaStartAuthenticationRequest to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Phone number to which the 2FA message will be sent. Example: 41793026727.
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
     * Phone number to which the 2FA message will be sent. Example: 41793026727.
     * <p>
     * The field is required.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TfaStartAuthenticationRequest tfaStartAuthenticationRequest = (TfaStartAuthenticationRequest) o;
        return Objects.equals(this.applicationId, tfaStartAuthenticationRequest.applicationId)
                && Objects.equals(this.from, tfaStartAuthenticationRequest.from)
                && Objects.equals(this.messageId, tfaStartAuthenticationRequest.messageId)
                && Objects.equals(this.placeholders, tfaStartAuthenticationRequest.placeholders)
                && Objects.equals(this.to, tfaStartAuthenticationRequest.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, from, messageId, placeholders, to);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class TfaStartAuthenticationRequest {")
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    placeholders: ")
                .append(toIndentedString(placeholders))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
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
