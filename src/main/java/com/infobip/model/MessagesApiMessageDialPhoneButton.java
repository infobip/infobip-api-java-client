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
 * Represents MessagesApiMessageDialPhoneButton model.
 */
public class MessagesApiMessageDialPhoneButton extends MessagesApiMessageButton {

    private String text;

    private String phoneNumber;

    private String postbackData;

    /**
     * Constructs a new {@link MessagesApiMessageDialPhoneButton} instance.
     */
    public MessagesApiMessageDialPhoneButton() {
        super("DIAL_PHONE");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Text to be displayed on the button.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link MessagesApiMessageDialPhoneButton instance}.
     */
    public MessagesApiMessageDialPhoneButton text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Text to be displayed on the button.
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
     * Text to be displayed on the button.
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
     * Sets phoneNumber.
     * <p>
     * Field description:
     * Valid phone number.
     * <p>
     * The field is required.
     *
     * @param phoneNumber
     * @return This {@link MessagesApiMessageDialPhoneButton instance}.
     */
    public MessagesApiMessageDialPhoneButton phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Returns phoneNumber.
     * <p>
     * Field description:
     * Valid phone number.
     * <p>
     * The field is required.
     *
     * @return phoneNumber
     */
    @JsonProperty("phoneNumber")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets phoneNumber.
     * <p>
     * Field description:
     * Valid phone number.
     * <p>
     * The field is required.
     *
     * @param phoneNumber
     */
    @JsonProperty("phoneNumber")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Sets postbackData.
     * <p>
     * Field description:
     * Custom data that will be sent to you when the user replies to the message.
     *
     * @param postbackData
     * @return This {@link MessagesApiMessageDialPhoneButton instance}.
     */
    public MessagesApiMessageDialPhoneButton postbackData(String postbackData) {
        this.postbackData = postbackData;
        return this;
    }

    /**
     * Returns postbackData.
     * <p>
     * Field description:
     * Custom data that will be sent to you when the user replies to the message.
     *
     * @return postbackData
     */
    @JsonProperty("postbackData")
    public String getPostbackData() {
        return postbackData;
    }

    /**
     * Sets postbackData.
     * <p>
     * Field description:
     * Custom data that will be sent to you when the user replies to the message.
     *
     * @param postbackData
     */
    @JsonProperty("postbackData")
    public void setPostbackData(String postbackData) {
        this.postbackData = postbackData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageDialPhoneButton messagesApiMessageDialPhoneButton = (MessagesApiMessageDialPhoneButton) o;
        return Objects.equals(this.text, messagesApiMessageDialPhoneButton.text)
                && Objects.equals(this.phoneNumber, messagesApiMessageDialPhoneButton.phoneNumber)
                && Objects.equals(this.postbackData, messagesApiMessageDialPhoneButton.postbackData)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, phoneNumber, postbackData, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageDialPhoneButton {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    phoneNumber: ")
                .append(toIndentedString(phoneNumber))
                .append(newLine)
                .append("    postbackData: ")
                .append(toIndentedString(postbackData))
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
