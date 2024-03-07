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
 * Represents TfaCreateEmailMessageRequest model.
 */
public class TfaCreateEmailMessageRequest {

    private Long emailTemplateId;

    private String from;

    private Integer pinLength;

    private TfaPinType pinType;

    /**
     * Sets emailTemplateId.
     * <p>
     * Field description:
     * Email template ID that should reference a previously created [Broadcast template](https://www.infobip.com/docs/email/templates).
     * <p>
     * The field is required.
     *
     * @param emailTemplateId
     * @return This {@link TfaCreateEmailMessageRequest instance}.
     */
    public TfaCreateEmailMessageRequest emailTemplateId(Long emailTemplateId) {
        this.emailTemplateId = emailTemplateId;
        return this;
    }

    /**
     * Returns emailTemplateId.
     * <p>
     * Field description:
     * Email template ID that should reference a previously created [Broadcast template](https://www.infobip.com/docs/email/templates).
     * <p>
     * The field is required.
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
     * Email template ID that should reference a previously created [Broadcast template](https://www.infobip.com/docs/email/templates).
     * <p>
     * The field is required.
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
     * @return This {@link TfaCreateEmailMessageRequest instance}.
     */
    public TfaCreateEmailMessageRequest from(String from) {
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
     * Sets pinLength.
     * <p>
     * Field description:
     * PIN code length.
     *
     * @param pinLength
     * @return This {@link TfaCreateEmailMessageRequest instance}.
     */
    public TfaCreateEmailMessageRequest pinLength(Integer pinLength) {
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
     * @return This {@link TfaCreateEmailMessageRequest instance}.
     */
    public TfaCreateEmailMessageRequest pinType(TfaPinType pinType) {
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
        TfaCreateEmailMessageRequest tfaCreateEmailMessageRequest = (TfaCreateEmailMessageRequest) o;
        return Objects.equals(this.emailTemplateId, tfaCreateEmailMessageRequest.emailTemplateId)
                && Objects.equals(this.from, tfaCreateEmailMessageRequest.from)
                && Objects.equals(this.pinLength, tfaCreateEmailMessageRequest.pinLength)
                && Objects.equals(this.pinType, tfaCreateEmailMessageRequest.pinType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emailTemplateId, from, pinLength, pinType);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class TfaCreateEmailMessageRequest {")
                .append(newLine)
                .append("    emailTemplateId: ")
                .append(toIndentedString(emailTemplateId))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
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
