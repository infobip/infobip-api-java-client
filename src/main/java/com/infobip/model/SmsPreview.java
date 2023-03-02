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
 * Allows for previewing the original message content once additional language configuration has been applied to it.
 */
public class SmsPreview {

    private String textPreview;

    private Integer messageCount;

    private Integer charactersRemaining;

    private SmsLanguageConfiguration _configuration;

    /**
     * Sets textPreview.
     * <p>
     * Field description:
     * Preview of the message content as it should appear on the recipient’s device.
     *
     * @param textPreview
     * @return This {@link SmsPreview instance}.
     */
    public SmsPreview textPreview(String textPreview) {
        this.textPreview = textPreview;
        return this;
    }

    /**
     * Returns textPreview.
     * <p>
     * Field description:
     * Preview of the message content as it should appear on the recipient’s device.
     *
     * @return textPreview
     */
    @JsonProperty("textPreview")
    public String getTextPreview() {
        return textPreview;
    }

    /**
     * Sets textPreview.
     * <p>
     * Field description:
     * Preview of the message content as it should appear on the recipient’s device.
     *
     * @param textPreview
     */
    @JsonProperty("textPreview")
    public void setTextPreview(String textPreview) {
        this.textPreview = textPreview;
    }

    /**
     * Sets messageCount.
     * <p>
     * Field description:
     * Number of SMS message parts required to deliver the message.
     *
     * @param messageCount
     * @return This {@link SmsPreview instance}.
     */
    public SmsPreview messageCount(Integer messageCount) {
        this.messageCount = messageCount;
        return this;
    }

    /**
     * Returns messageCount.
     * <p>
     * Field description:
     * Number of SMS message parts required to deliver the message.
     *
     * @return messageCount
     */
    @JsonProperty("messageCount")
    public Integer getMessageCount() {
        return messageCount;
    }

    /**
     * Sets messageCount.
     * <p>
     * Field description:
     * Number of SMS message parts required to deliver the message.
     *
     * @param messageCount
     */
    @JsonProperty("messageCount")
    public void setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
    }

    /**
     * Sets charactersRemaining.
     * <p>
     * Field description:
     * Number of remaining characters in the last part of the SMS.
     *
     * @param charactersRemaining
     * @return This {@link SmsPreview instance}.
     */
    public SmsPreview charactersRemaining(Integer charactersRemaining) {
        this.charactersRemaining = charactersRemaining;
        return this;
    }

    /**
     * Returns charactersRemaining.
     * <p>
     * Field description:
     * Number of remaining characters in the last part of the SMS.
     *
     * @return charactersRemaining
     */
    @JsonProperty("charactersRemaining")
    public Integer getCharactersRemaining() {
        return charactersRemaining;
    }

    /**
     * Sets charactersRemaining.
     * <p>
     * Field description:
     * Number of remaining characters in the last part of the SMS.
     *
     * @param charactersRemaining
     */
    @JsonProperty("charactersRemaining")
    public void setCharactersRemaining(Integer charactersRemaining) {
        this.charactersRemaining = charactersRemaining;
    }

    /**
     * Sets _configuration.
     *
     * @param _configuration
     * @return This {@link SmsPreview instance}.
     */
    public SmsPreview _configuration(SmsLanguageConfiguration _configuration) {
        this._configuration = _configuration;
        return this;
    }

    /**
     * Returns _configuration.
     *
     * @return _configuration
     */
    @JsonProperty("configuration")
    public SmsLanguageConfiguration getConfiguration() {
        return _configuration;
    }

    /**
     * Sets _configuration.
     *
     * @param _configuration
     */
    @JsonProperty("configuration")
    public void setConfiguration(SmsLanguageConfiguration _configuration) {
        this._configuration = _configuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsPreview smsPreview = (SmsPreview) o;
        return Objects.equals(this.textPreview, smsPreview.textPreview)
                && Objects.equals(this.messageCount, smsPreview.messageCount)
                && Objects.equals(this.charactersRemaining, smsPreview.charactersRemaining)
                && Objects.equals(this._configuration, smsPreview._configuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(textPreview, messageCount, charactersRemaining, _configuration);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsPreview {")
                .append(newLine)
                .append("    textPreview: ")
                .append(toIndentedString(textPreview))
                .append(newLine)
                .append("    messageCount: ")
                .append(toIndentedString(messageCount))
                .append(newLine)
                .append("    charactersRemaining: ")
                .append(toIndentedString(charactersRemaining))
                .append(newLine)
                .append("    _configuration: ")
                .append(toIndentedString(_configuration))
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
