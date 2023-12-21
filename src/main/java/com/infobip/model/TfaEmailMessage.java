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
 * Represents TfaEmailMessage model.
 */
public class TfaEmailMessage {

    private String applicationId;

    private Long emailTemplateId;

    private String from;

    private String messageId;

    private Integer pinLength;

    private TfaPinType pinType;

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * The ID of the application that represents your service (e.g. 2FA for login, 2FA for changing the password, etc.) for which the requested message has been created.
     *
     * @param applicationId
     * @return This {@link TfaEmailMessage instance}.
     */
    public TfaEmailMessage applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * The ID of the application that represents your service (e.g. 2FA for login, 2FA for changing the password, etc.) for which the requested message has been created.
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
     * The ID of the application that represents your service (e.g. 2FA for login, 2FA for changing the password, etc.) for which the requested message has been created.
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets emailTemplateId.
     * <p>
     * Field description:
     * Email template ID that should reference a previously created Email template.
     *
     * @param emailTemplateId
     * @return This {@link TfaEmailMessage instance}.
     */
    public TfaEmailMessage emailTemplateId(Long emailTemplateId) {
        this.emailTemplateId = emailTemplateId;
        return this;
    }

    /**
     * Returns emailTemplateId.
     * <p>
     * Field description:
     * Email template ID that should reference a previously created Email template.
     *
     * @return emailTemplateId
     */
    @JsonProperty("emailTemplateId")
    public Long getEmailTemplateId() {
        return emailTemplateId;
    }

    /**
     * Sets emailTemplateId.
     * <p>
     * Field description:
     * Email template ID that should reference a previously created Email template.
     *
     * @param emailTemplateId
     */
    @JsonProperty("emailTemplateId")
    public void setEmailTemplateId(Long emailTemplateId) {
        this.emailTemplateId = emailTemplateId;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * The sender of the 2FA message, an email address with an optional sender name (e.g. &#x60;company@example.com&#x60; or &#x60;Jane Smith &lt;jane.smith@somecompany.com&gt;&#x60;).
     *
     * @param from
     * @return This {@link TfaEmailMessage instance}.
     */
    public TfaEmailMessage from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * The sender of the 2FA message, an email address with an optional sender name (e.g. &#x60;company@example.com&#x60; or &#x60;Jane Smith &lt;jane.smith@somecompany.com&gt;&#x60;).
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
     * The sender of the 2FA message, an email address with an optional sender name (e.g. &#x60;company@example.com&#x60; or &#x60;Jane Smith &lt;jane.smith@somecompany.com&gt;&#x60;).
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
     *
     * @param messageId
     * @return This {@link TfaEmailMessage instance}.
     */
    public TfaEmailMessage messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * The ID of the message template (message body with the PIN placeholder) that is sent to the recipient.
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
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets pinLength.
     * <p>
     * Field description:
     * PIN code length.
     *
     * @param pinLength
     * @return This {@link TfaEmailMessage instance}.
     */
    public TfaEmailMessage pinLength(Integer pinLength) {
        this.pinLength = pinLength;
        return this;
    }

    /**
     * Returns pinLength.
     * <p>
     * Field description:
     * PIN code length.
     *
     * @return pinLength
     */
    @JsonProperty("pinLength")
    public Integer getPinLength() {
        return pinLength;
    }

    /**
     * Sets pinLength.
     * <p>
     * Field description:
     * PIN code length.
     *
     * @param pinLength
     */
    @JsonProperty("pinLength")
    public void setPinLength(Integer pinLength) {
        this.pinLength = pinLength;
    }

    /**
     * Sets pinType.
     *
     * @param pinType
     * @return This {@link TfaEmailMessage instance}.
     */
    public TfaEmailMessage pinType(TfaPinType pinType) {
        this.pinType = pinType;
        return this;
    }

    /**
     * Returns pinType.
     *
     * @return pinType
     */
    @JsonProperty("pinType")
    public TfaPinType getPinType() {
        return pinType;
    }

    /**
     * Sets pinType.
     *
     * @param pinType
     */
    @JsonProperty("pinType")
    public void setPinType(TfaPinType pinType) {
        this.pinType = pinType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TfaEmailMessage tfaEmailMessage = (TfaEmailMessage) o;
        return Objects.equals(this.applicationId, tfaEmailMessage.applicationId)
                && Objects.equals(this.emailTemplateId, tfaEmailMessage.emailTemplateId)
                && Objects.equals(this.from, tfaEmailMessage.from)
                && Objects.equals(this.messageId, tfaEmailMessage.messageId)
                && Objects.equals(this.pinLength, tfaEmailMessage.pinLength)
                && Objects.equals(this.pinType, tfaEmailMessage.pinType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, emailTemplateId, from, messageId, pinLength, pinType);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class TfaEmailMessage {")
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    emailTemplateId: ")
                .append(toIndentedString(emailTemplateId))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    pinLength: ")
                .append(toIndentedString(pinLength))
                .append(newLine)
                .append("    pinType: ")
                .append(toIndentedString(pinType))
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
