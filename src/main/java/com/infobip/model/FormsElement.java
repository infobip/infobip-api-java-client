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
import java.util.*;

/**
 * List of form fields
 */
public class FormsElement {

    private FormsComponentType component;

    private String fieldId;

    private String personField;

    private String label;

    private Boolean isRequired;

    private Boolean isHidden;

    private Map<String, String> additionalConfiguration = null;

    private String textContent;

    private List<FormsElementOption> options = null;

    private FormsValidationRules validationRules;

    private String placeholder;

    private String checkboxText;

    private Map<String, String> validationMessages = null;

    /**
     * Sets component.
     * <p>
     * The field is required.
     *
     * @param component
     * @return This {@link FormsElement instance}.
     */
    public FormsElement component(FormsComponentType component) {
        this.component = component;
        return this;
    }

    /**
     * Returns component.
     * <p>
     * The field is required.
     *
     * @return component
     */
    @JsonProperty("component")
    public FormsComponentType getComponent() {
        return component;
    }

    /**
     * Sets component.
     * <p>
     * The field is required.
     *
     * @param component
     */
    @JsonProperty("component")
    public void setComponent(FormsComponentType component) {
        this.component = component;
    }

    /**
     * Sets fieldId.
     *
     * @param fieldId
     * @return This {@link FormsElement instance}.
     */
    public FormsElement fieldId(String fieldId) {
        this.fieldId = fieldId;
        return this;
    }

    /**
     * Returns fieldId.
     *
     * @return fieldId
     */
    @JsonProperty("fieldId")
    public String getFieldId() {
        return fieldId;
    }

    /**
     * Sets fieldId.
     *
     * @param fieldId
     */
    @JsonProperty("fieldId")
    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
    }

    /**
     * Sets personField.
     *
     * @param personField
     * @return This {@link FormsElement instance}.
     */
    public FormsElement personField(String personField) {
        this.personField = personField;
        return this;
    }

    /**
     * Returns personField.
     *
     * @return personField
     */
    @JsonProperty("personField")
    public String getPersonField() {
        return personField;
    }

    /**
     * Sets personField.
     *
     * @param personField
     */
    @JsonProperty("personField")
    public void setPersonField(String personField) {
        this.personField = personField;
    }

    /**
     * Sets label.
     *
     * @param label
     * @return This {@link FormsElement instance}.
     */
    public FormsElement label(String label) {
        this.label = label;
        return this;
    }

    /**
     * Returns label.
     *
     * @return label
     */
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    /**
     * Sets label.
     *
     * @param label
     */
    @JsonProperty("label")
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Sets isRequired.
     *
     * @param isRequired
     * @return This {@link FormsElement instance}.
     */
    public FormsElement isRequired(Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     * Returns isRequired.
     *
     * @return isRequired
     */
    @JsonProperty("isRequired")
    public Boolean getIsRequired() {
        return isRequired;
    }

    /**
     * Sets isRequired.
     *
     * @param isRequired
     */
    @JsonProperty("isRequired")
    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    /**
     * Sets isHidden.
     *
     * @param isHidden
     * @return This {@link FormsElement instance}.
     */
    public FormsElement isHidden(Boolean isHidden) {
        this.isHidden = isHidden;
        return this;
    }

    /**
     * Returns isHidden.
     *
     * @return isHidden
     */
    @JsonProperty("isHidden")
    public Boolean getIsHidden() {
        return isHidden;
    }

    /**
     * Sets isHidden.
     *
     * @param isHidden
     */
    @JsonProperty("isHidden")
    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    /**
     * Sets additionalConfiguration.
     *
     * @param additionalConfiguration
     * @return This {@link FormsElement instance}.
     */
    public FormsElement additionalConfiguration(Map<String, String> additionalConfiguration) {
        this.additionalConfiguration = additionalConfiguration;
        return this;
    }

    /**
     * Puts and entry into additionalConfiguration.
     *
     * @param key The given key.
     * @param additionalConfigurationItem The item to be associated with the given key.
     * @return This {@link FormsElement instance}.
     */
    public FormsElement putAdditionalConfigurationItem(String key, String additionalConfigurationItem) {
        if (this.additionalConfiguration == null) {
            this.additionalConfiguration = new HashMap<>();
        }
        this.additionalConfiguration.put(key, additionalConfigurationItem);
        return this;
    }

    /**
     * Returns additionalConfiguration.
     *
     * @return additionalConfiguration
     */
    @JsonProperty("additionalConfiguration")
    public Map<String, String> getAdditionalConfiguration() {
        return additionalConfiguration;
    }

    /**
     * Sets additionalConfiguration.
     *
     * @param additionalConfiguration
     */
    @JsonProperty("additionalConfiguration")
    public void setAdditionalConfiguration(Map<String, String> additionalConfiguration) {
        this.additionalConfiguration = additionalConfiguration;
    }

    /**
     * Sets textContent.
     *
     * @param textContent
     * @return This {@link FormsElement instance}.
     */
    public FormsElement textContent(String textContent) {
        this.textContent = textContent;
        return this;
    }

    /**
     * Returns textContent.
     *
     * @return textContent
     */
    @JsonProperty("textContent")
    public String getTextContent() {
        return textContent;
    }

    /**
     * Sets textContent.
     *
     * @param textContent
     */
    @JsonProperty("textContent")
    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    /**
     * Sets options.
     *
     * @param options
     * @return This {@link FormsElement instance}.
     */
    public FormsElement options(List<FormsElementOption> options) {
        this.options = options;
        return this;
    }

    /**
     * Adds and item into options.
     *
     * @param optionsItem The item to be added to the list.
     * @return This {@link FormsElement instance}.
     */
    public FormsElement addOptionsItem(FormsElementOption optionsItem) {
        if (this.options == null) {
            this.options = new ArrayList<>();
        }
        this.options.add(optionsItem);
        return this;
    }

    /**
     * Returns options.
     *
     * @return options
     */
    @JsonProperty("options")
    public List<FormsElementOption> getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(List<FormsElementOption> options) {
        this.options = options;
    }

    /**
     * Sets validationRules.
     *
     * @param validationRules
     * @return This {@link FormsElement instance}.
     */
    public FormsElement validationRules(FormsValidationRules validationRules) {
        this.validationRules = validationRules;
        return this;
    }

    /**
     * Returns validationRules.
     *
     * @return validationRules
     */
    @JsonProperty("validationRules")
    public FormsValidationRules getValidationRules() {
        return validationRules;
    }

    /**
     * Sets validationRules.
     *
     * @param validationRules
     */
    @JsonProperty("validationRules")
    public void setValidationRules(FormsValidationRules validationRules) {
        this.validationRules = validationRules;
    }

    /**
     * Sets placeholder.
     *
     * @param placeholder
     * @return This {@link FormsElement instance}.
     */
    public FormsElement placeholder(String placeholder) {
        this.placeholder = placeholder;
        return this;
    }

    /**
     * Returns placeholder.
     *
     * @return placeholder
     */
    @JsonProperty("placeholder")
    public String getPlaceholder() {
        return placeholder;
    }

    /**
     * Sets placeholder.
     *
     * @param placeholder
     */
    @JsonProperty("placeholder")
    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    /**
     * Sets checkboxText.
     *
     * @param checkboxText
     * @return This {@link FormsElement instance}.
     */
    public FormsElement checkboxText(String checkboxText) {
        this.checkboxText = checkboxText;
        return this;
    }

    /**
     * Returns checkboxText.
     *
     * @return checkboxText
     */
    @JsonProperty("checkboxText")
    public String getCheckboxText() {
        return checkboxText;
    }

    /**
     * Sets checkboxText.
     *
     * @param checkboxText
     */
    @JsonProperty("checkboxText")
    public void setCheckboxText(String checkboxText) {
        this.checkboxText = checkboxText;
    }

    /**
     * Sets validationMessages.
     *
     * @param validationMessages
     * @return This {@link FormsElement instance}.
     */
    public FormsElement validationMessages(Map<String, String> validationMessages) {
        this.validationMessages = validationMessages;
        return this;
    }

    /**
     * Puts and entry into validationMessages.
     *
     * @param key The given key.
     * @param validationMessagesItem The item to be associated with the given key.
     * @return This {@link FormsElement instance}.
     */
    public FormsElement putValidationMessagesItem(String key, String validationMessagesItem) {
        if (this.validationMessages == null) {
            this.validationMessages = new HashMap<>();
        }
        this.validationMessages.put(key, validationMessagesItem);
        return this;
    }

    /**
     * Returns validationMessages.
     *
     * @return validationMessages
     */
    @JsonProperty("validationMessages")
    public Map<String, String> getValidationMessages() {
        return validationMessages;
    }

    /**
     * Sets validationMessages.
     *
     * @param validationMessages
     */
    @JsonProperty("validationMessages")
    public void setValidationMessages(Map<String, String> validationMessages) {
        this.validationMessages = validationMessages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FormsElement formsElement = (FormsElement) o;
        return Objects.equals(this.component, formsElement.component)
                && Objects.equals(this.fieldId, formsElement.fieldId)
                && Objects.equals(this.personField, formsElement.personField)
                && Objects.equals(this.label, formsElement.label)
                && Objects.equals(this.isRequired, formsElement.isRequired)
                && Objects.equals(this.isHidden, formsElement.isHidden)
                && Objects.equals(this.additionalConfiguration, formsElement.additionalConfiguration)
                && Objects.equals(this.textContent, formsElement.textContent)
                && Objects.equals(this.options, formsElement.options)
                && Objects.equals(this.validationRules, formsElement.validationRules)
                && Objects.equals(this.placeholder, formsElement.placeholder)
                && Objects.equals(this.checkboxText, formsElement.checkboxText)
                && Objects.equals(this.validationMessages, formsElement.validationMessages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                component,
                fieldId,
                personField,
                label,
                isRequired,
                isHidden,
                additionalConfiguration,
                textContent,
                options,
                validationRules,
                placeholder,
                checkboxText,
                validationMessages);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FormsElement {")
                .append(newLine)
                .append("    component: ")
                .append(toIndentedString(component))
                .append(newLine)
                .append("    fieldId: ")
                .append(toIndentedString(fieldId))
                .append(newLine)
                .append("    personField: ")
                .append(toIndentedString(personField))
                .append(newLine)
                .append("    label: ")
                .append(toIndentedString(label))
                .append(newLine)
                .append("    isRequired: ")
                .append(toIndentedString(isRequired))
                .append(newLine)
                .append("    isHidden: ")
                .append(toIndentedString(isHidden))
                .append(newLine)
                .append("    additionalConfiguration: ")
                .append(toIndentedString(additionalConfiguration))
                .append(newLine)
                .append("    textContent: ")
                .append(toIndentedString(textContent))
                .append(newLine)
                .append("    options: ")
                .append(toIndentedString(options))
                .append(newLine)
                .append("    validationRules: ")
                .append(toIndentedString(validationRules))
                .append(newLine)
                .append("    placeholder: ")
                .append(toIndentedString(placeholder))
                .append(newLine)
                .append("    checkboxText: ")
                .append(toIndentedString(checkboxText))
                .append(newLine)
                .append("    validationMessages: ")
                .append(toIndentedString(validationMessages))
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
