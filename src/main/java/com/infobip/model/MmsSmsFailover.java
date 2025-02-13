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
 * MMS to be sent in case a message could not be delivered through the main channel.
 */
public class MmsSmsFailover {

    private String sender;

    private String text;

    private ValidityPeriod validityPeriod;

    private MmsRegional regional;

    /**
     * Sets sender.
     * <p>
     * Field description:
     * The sender ID. It can be alphanumeric or numeric (e.g., &#x60;CompanyName&#x60;). Make sure you don&#39;t exceed [character limit](https://www.infobip.com/docs/sms/get-started#sender-names).
     *
     * @param sender
     * @return This {@link MmsSmsFailover instance}.
     */
    public MmsSmsFailover sender(String sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Returns sender.
     * <p>
     * Field description:
     * The sender ID. It can be alphanumeric or numeric (e.g., &#x60;CompanyName&#x60;). Make sure you don&#39;t exceed [character limit](https://www.infobip.com/docs/sms/get-started#sender-names).
     *
     * @return sender
     */
    @JsonProperty("sender")
    public String getSender() {
        return sender;
    }

    /**
     * Sets sender.
     * <p>
     * Field description:
     * The sender ID. It can be alphanumeric or numeric (e.g., &#x60;CompanyName&#x60;). Make sure you don&#39;t exceed [character limit](https://www.infobip.com/docs/sms/get-started#sender-names).
     *
     * @param sender
     */
    @JsonProperty("sender")
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Content of the message being sent.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link MmsSmsFailover instance}.
     */
    public MmsSmsFailover text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Content of the message being sent.
     * <p>
     * The field is required.
     *
     * @return text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Content of the message being sent.
     * <p>
     * The field is required.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets validityPeriod.
     *
     * @param validityPeriod
     * @return This {@link MmsSmsFailover instance}.
     */
    public MmsSmsFailover validityPeriod(ValidityPeriod validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * Returns validityPeriod.
     *
     * @return validityPeriod
     */
    @JsonProperty("validityPeriod")
    public ValidityPeriod getValidityPeriod() {
        return validityPeriod;
    }

    /**
     * Sets validityPeriod.
     *
     * @param validityPeriod
     */
    @JsonProperty("validityPeriod")
    public void setValidityPeriod(ValidityPeriod validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    /**
     * Sets regional.
     *
     * @param regional
     * @return This {@link MmsSmsFailover instance}.
     */
    public MmsSmsFailover regional(MmsRegional regional) {
        this.regional = regional;
        return this;
    }

    /**
     * Returns regional.
     *
     * @return regional
     */
    @JsonProperty("regional")
    public MmsRegional getRegional() {
        return regional;
    }

    /**
     * Sets regional.
     *
     * @param regional
     */
    @JsonProperty("regional")
    public void setRegional(MmsRegional regional) {
        this.regional = regional;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MmsSmsFailover mmsSmsFailover = (MmsSmsFailover) o;
        return Objects.equals(this.sender, mmsSmsFailover.sender)
                && Objects.equals(this.text, mmsSmsFailover.text)
                && Objects.equals(this.validityPeriod, mmsSmsFailover.validityPeriod)
                && Objects.equals(this.regional, mmsSmsFailover.regional);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sender, text, validityPeriod, regional);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsSmsFailover {")
                .append(newLine)
                .append("    sender: ")
                .append(toIndentedString(sender))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    validityPeriod: ")
                .append(toIndentedString(validityPeriod))
                .append(newLine)
                .append("    regional: ")
                .append(toIndentedString(regional))
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
