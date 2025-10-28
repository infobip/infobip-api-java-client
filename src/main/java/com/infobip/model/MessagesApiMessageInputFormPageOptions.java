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
 * Options of the page.
 */
public class MessagesApiMessageInputFormPageOptions {

    private String hintText;

    private String regex;

    private String placeholder;

    private Boolean isRequired;

    private MessagesApiMessageInputFormInputType inputType;

    private String labelText;

    private String prefixText;

    private Integer maximumCharacterCount;

    private MessagesApiMessageInputFormPageKeyboard keyboardType;

    private MessagesApiMessageInputFormPageTextContentType textContentType;

    /**
     * Sets hintText.
     * <p>
     * Field description:
     * Text to give the user more input context that displays below the Input field.
     *
     * @param hintText
     * @return This {@link MessagesApiMessageInputFormPageOptions instance}.
     */
    public MessagesApiMessageInputFormPageOptions hintText(String hintText) {
        this.hintText = hintText;
        return this;
    }

    /**
     * Returns hintText.
     * <p>
     * Field description:
     * Text to give the user more input context that displays below the Input field.
     *
     * @return hintText
     */
    @JsonProperty("hintText")
    public String getHintText() {
        return hintText;
    }

    /**
     * Sets hintText.
     * <p>
     * Field description:
     * Text to give the user more input context that displays below the Input field.
     *
     * @param hintText
     */
    @JsonProperty("hintText")
    public void setHintText(String hintText) {
        this.hintText = hintText;
    }

    /**
     * Sets regex.
     * <p>
     * Field description:
     * String representing a JSON encoded regular expression (regex) string to limit the type of input for input field to use.
     *
     * @param regex
     * @return This {@link MessagesApiMessageInputFormPageOptions instance}.
     */
    public MessagesApiMessageInputFormPageOptions regex(String regex) {
        this.regex = regex;
        return this;
    }

    /**
     * Returns regex.
     * <p>
     * Field description:
     * String representing a JSON encoded regular expression (regex) string to limit the type of input for input field to use.
     *
     * @return regex
     */
    @JsonProperty("regex")
    public String getRegex() {
        return regex;
    }

    /**
     * Sets regex.
     * <p>
     * Field description:
     * String representing a JSON encoded regular expression (regex) string to limit the type of input for input field to use.
     *
     * @param regex
     */
    @JsonProperty("regex")
    public void setRegex(String regex) {
        this.regex = regex;
    }

    /**
     * Sets placeholder.
     * <p>
     * Field description:
     * Text string used when there is no other text in the input text field.
     *
     * @param placeholder
     * @return This {@link MessagesApiMessageInputFormPageOptions instance}.
     */
    public MessagesApiMessageInputFormPageOptions placeholder(String placeholder) {
        this.placeholder = placeholder;
        return this;
    }

    /**
     * Returns placeholder.
     * <p>
     * Field description:
     * Text string used when there is no other text in the input text field.
     *
     * @return placeholder
     */
    @JsonProperty("placeholder")
    public String getPlaceholder() {
        return placeholder;
    }

    /**
     * Sets placeholder.
     * <p>
     * Field description:
     * Text string used when there is no other text in the input text field.
     *
     * @param placeholder
     */
    @JsonProperty("placeholder")
    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    /**
     * Sets isRequired.
     * <p>
     * Field description:
     * When set to true, the next button on page is disabled until the user provides input.
     *
     * @param isRequired
     * @return This {@link MessagesApiMessageInputFormPageOptions instance}.
     */
    public MessagesApiMessageInputFormPageOptions isRequired(Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     * Returns isRequired.
     * <p>
     * Field description:
     * When set to true, the next button on page is disabled until the user provides input.
     *
     * @return isRequired
     */
    @JsonProperty("isRequired")
    public Boolean getIsRequired() {
        return isRequired;
    }

    /**
     * Sets isRequired.
     * <p>
     * Field description:
     * When set to true, the next button on page is disabled until the user provides input.
     *
     * @param isRequired
     */
    @JsonProperty("isRequired")
    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    /**
     * Sets inputType.
     *
     * @param inputType
     * @return This {@link MessagesApiMessageInputFormPageOptions instance}.
     */
    public MessagesApiMessageInputFormPageOptions inputType(MessagesApiMessageInputFormInputType inputType) {
        this.inputType = inputType;
        return this;
    }

    /**
     * Returns inputType.
     *
     * @return inputType
     */
    @JsonProperty("inputType")
    public MessagesApiMessageInputFormInputType getInputType() {
        return inputType;
    }

    /**
     * Sets inputType.
     *
     * @param inputType
     */
    @JsonProperty("inputType")
    public void setInputType(MessagesApiMessageInputFormInputType inputType) {
        this.inputType = inputType;
    }

    /**
     * Sets labelText.
     * <p>
     * Field description:
     * Text label shown to identify the input field. Applicable only for SINGLELINE input type.
     *
     * @param labelText
     * @return This {@link MessagesApiMessageInputFormPageOptions instance}.
     */
    public MessagesApiMessageInputFormPageOptions labelText(String labelText) {
        this.labelText = labelText;
        return this;
    }

    /**
     * Returns labelText.
     * <p>
     * Field description:
     * Text label shown to identify the input field. Applicable only for SINGLELINE input type.
     *
     * @return labelText
     */
    @JsonProperty("labelText")
    public String getLabelText() {
        return labelText;
    }

    /**
     * Sets labelText.
     * <p>
     * Field description:
     * Text label shown to identify the input field. Applicable only for SINGLELINE input type.
     *
     * @param labelText
     */
    @JsonProperty("labelText")
    public void setLabelText(String labelText) {
        this.labelText = labelText;
    }

    /**
     * Sets prefixText.
     * <p>
     * Field description:
     * String value representing optional text shown next to the text field. Applicable only for SINGLELINE input type.
     *
     * @param prefixText
     * @return This {@link MessagesApiMessageInputFormPageOptions instance}.
     */
    public MessagesApiMessageInputFormPageOptions prefixText(String prefixText) {
        this.prefixText = prefixText;
        return this;
    }

    /**
     * Returns prefixText.
     * <p>
     * Field description:
     * String value representing optional text shown next to the text field. Applicable only for SINGLELINE input type.
     *
     * @return prefixText
     */
    @JsonProperty("prefixText")
    public String getPrefixText() {
        return prefixText;
    }

    /**
     * Sets prefixText.
     * <p>
     * Field description:
     * String value representing optional text shown next to the text field. Applicable only for SINGLELINE input type.
     *
     * @param prefixText
     */
    @JsonProperty("prefixText")
    public void setPrefixText(String prefixText) {
        this.prefixText = prefixText;
    }

    /**
     * Sets maximumCharacterCount.
     * <p>
     * Field description:
     * Maximum field size in characters.
     *
     * @param maximumCharacterCount
     * @return This {@link MessagesApiMessageInputFormPageOptions instance}.
     */
    public MessagesApiMessageInputFormPageOptions maximumCharacterCount(Integer maximumCharacterCount) {
        this.maximumCharacterCount = maximumCharacterCount;
        return this;
    }

    /**
     * Returns maximumCharacterCount.
     * <p>
     * Field description:
     * Maximum field size in characters.
     *
     * @return maximumCharacterCount
     */
    @JsonProperty("maximumCharacterCount")
    public Integer getMaximumCharacterCount() {
        return maximumCharacterCount;
    }

    /**
     * Sets maximumCharacterCount.
     * <p>
     * Field description:
     * Maximum field size in characters.
     *
     * @param maximumCharacterCount
     */
    @JsonProperty("maximumCharacterCount")
    public void setMaximumCharacterCount(Integer maximumCharacterCount) {
        this.maximumCharacterCount = maximumCharacterCount;
    }

    /**
     * Sets keyboardType.
     *
     * @param keyboardType
     * @return This {@link MessagesApiMessageInputFormPageOptions instance}.
     */
    public MessagesApiMessageInputFormPageOptions keyboardType(MessagesApiMessageInputFormPageKeyboard keyboardType) {
        this.keyboardType = keyboardType;
        return this;
    }

    /**
     * Returns keyboardType.
     *
     * @return keyboardType
     */
    @JsonProperty("keyboardType")
    public MessagesApiMessageInputFormPageKeyboard getKeyboardType() {
        return keyboardType;
    }

    /**
     * Sets keyboardType.
     *
     * @param keyboardType
     */
    @JsonProperty("keyboardType")
    public void setKeyboardType(MessagesApiMessageInputFormPageKeyboard keyboardType) {
        this.keyboardType = keyboardType;
    }

    /**
     * Sets textContentType.
     *
     * @param textContentType
     * @return This {@link MessagesApiMessageInputFormPageOptions instance}.
     */
    public MessagesApiMessageInputFormPageOptions textContentType(
            MessagesApiMessageInputFormPageTextContentType textContentType) {
        this.textContentType = textContentType;
        return this;
    }

    /**
     * Returns textContentType.
     *
     * @return textContentType
     */
    @JsonProperty("textContentType")
    public MessagesApiMessageInputFormPageTextContentType getTextContentType() {
        return textContentType;
    }

    /**
     * Sets textContentType.
     *
     * @param textContentType
     */
    @JsonProperty("textContentType")
    public void setTextContentType(MessagesApiMessageInputFormPageTextContentType textContentType) {
        this.textContentType = textContentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageInputFormPageOptions messagesApiMessageInputFormPageOptions =
                (MessagesApiMessageInputFormPageOptions) o;
        return Objects.equals(this.hintText, messagesApiMessageInputFormPageOptions.hintText)
                && Objects.equals(this.regex, messagesApiMessageInputFormPageOptions.regex)
                && Objects.equals(this.placeholder, messagesApiMessageInputFormPageOptions.placeholder)
                && Objects.equals(this.isRequired, messagesApiMessageInputFormPageOptions.isRequired)
                && Objects.equals(this.inputType, messagesApiMessageInputFormPageOptions.inputType)
                && Objects.equals(this.labelText, messagesApiMessageInputFormPageOptions.labelText)
                && Objects.equals(this.prefixText, messagesApiMessageInputFormPageOptions.prefixText)
                && Objects.equals(
                        this.maximumCharacterCount, messagesApiMessageInputFormPageOptions.maximumCharacterCount)
                && Objects.equals(this.keyboardType, messagesApiMessageInputFormPageOptions.keyboardType)
                && Objects.equals(this.textContentType, messagesApiMessageInputFormPageOptions.textContentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hintText,
                regex,
                placeholder,
                isRequired,
                inputType,
                labelText,
                prefixText,
                maximumCharacterCount,
                keyboardType,
                textContentType);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageInputFormPageOptions {")
                .append(newLine)
                .append("    hintText: ")
                .append(toIndentedString(hintText))
                .append(newLine)
                .append("    regex: ")
                .append(toIndentedString(regex))
                .append(newLine)
                .append("    placeholder: ")
                .append(toIndentedString(placeholder))
                .append(newLine)
                .append("    isRequired: ")
                .append(toIndentedString(isRequired))
                .append(newLine)
                .append("    inputType: ")
                .append(toIndentedString(inputType))
                .append(newLine)
                .append("    labelText: ")
                .append(toIndentedString(labelText))
                .append(newLine)
                .append("    prefixText: ")
                .append(toIndentedString(prefixText))
                .append(newLine)
                .append("    maximumCharacterCount: ")
                .append(toIndentedString(maximumCharacterCount))
                .append(newLine)
                .append("    keyboardType: ")
                .append(toIndentedString(keyboardType))
                .append(newLine)
                .append("    textContentType: ")
                .append(toIndentedString(textContentType))
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
