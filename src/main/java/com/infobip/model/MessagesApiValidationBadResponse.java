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
 * Represents MessagesApiValidationBadResponse model.
 */
public class MessagesApiValidationBadResponse {

    private String description;

    private String action;

    private List<ApiErrorViolation> violations = new ArrayList<>();

    private List<ApiErrorViolation> skippableViolations = null;

    /**
     * Sets description.
     * <p>
     * Field description:
     * A detailed description of an error.
     * <p>
     * The field is required.
     *
     * @param description
     * @return This {@link MessagesApiValidationBadResponse instance}.
     */
    public MessagesApiValidationBadResponse description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * A detailed description of an error.
     * <p>
     * The field is required.
     *
     * @return description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * A detailed description of an error.
     * <p>
     * The field is required.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets action.
     * <p>
     * Field description:
     * An action that should be taken to recover from the error.
     * <p>
     * The field is required.
     *
     * @param action
     * @return This {@link MessagesApiValidationBadResponse instance}.
     */
    public MessagesApiValidationBadResponse action(String action) {
        this.action = action;
        return this;
    }

    /**
     * Returns action.
     * <p>
     * Field description:
     * An action that should be taken to recover from the error.
     * <p>
     * The field is required.
     *
     * @return action
     */
    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    /**
     * Sets action.
     * <p>
     * Field description:
     * An action that should be taken to recover from the error.
     * <p>
     * The field is required.
     *
     * @param action
     */
    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * Sets violations.
     * <p>
     * Field description:
     * List of violations that caused the error.
     * <p>
     * The field is required.
     *
     * @param violations
     * @return This {@link MessagesApiValidationBadResponse instance}.
     */
    public MessagesApiValidationBadResponse violations(List<ApiErrorViolation> violations) {
        this.violations = violations;
        return this;
    }

    /**
     * Adds and item into violations.
     * <p>
     * Field description:
     * List of violations that caused the error.
     * <p>
     * The field is required.
     *
     * @param violationsItem The item to be added to the list.
     * @return This {@link MessagesApiValidationBadResponse instance}.
     */
    public MessagesApiValidationBadResponse addViolationsItem(ApiErrorViolation violationsItem) {
        if (this.violations == null) {
            this.violations = new ArrayList<>();
        }
        this.violations.add(violationsItem);
        return this;
    }

    /**
     * Returns violations.
     * <p>
     * Field description:
     * List of violations that caused the error.
     * <p>
     * The field is required.
     *
     * @return violations
     */
    @JsonProperty("violations")
    public List<ApiErrorViolation> getViolations() {
        return violations;
    }

    /**
     * Sets violations.
     * <p>
     * Field description:
     * List of violations that caused the error.
     * <p>
     * The field is required.
     *
     * @param violations
     */
    @JsonProperty("violations")
    public void setViolations(List<ApiErrorViolation> violations) {
        this.violations = violations;
    }

    /**
     * Sets skippableViolations.
     * <p>
     * Field description:
     * List of violations that may be omitted, but is recommended to address.
     *
     * @param skippableViolations
     * @return This {@link MessagesApiValidationBadResponse instance}.
     */
    public MessagesApiValidationBadResponse skippableViolations(List<ApiErrorViolation> skippableViolations) {
        this.skippableViolations = skippableViolations;
        return this;
    }

    /**
     * Adds and item into skippableViolations.
     * <p>
     * Field description:
     * List of violations that may be omitted, but is recommended to address.
     *
     * @param skippableViolationsItem The item to be added to the list.
     * @return This {@link MessagesApiValidationBadResponse instance}.
     */
    public MessagesApiValidationBadResponse addSkippableViolationsItem(ApiErrorViolation skippableViolationsItem) {
        if (this.skippableViolations == null) {
            this.skippableViolations = new ArrayList<>();
        }
        this.skippableViolations.add(skippableViolationsItem);
        return this;
    }

    /**
     * Returns skippableViolations.
     * <p>
     * Field description:
     * List of violations that may be omitted, but is recommended to address.
     *
     * @return skippableViolations
     */
    @JsonProperty("skippableViolations")
    public List<ApiErrorViolation> getSkippableViolations() {
        return skippableViolations;
    }

    /**
     * Sets skippableViolations.
     * <p>
     * Field description:
     * List of violations that may be omitted, but is recommended to address.
     *
     * @param skippableViolations
     */
    @JsonProperty("skippableViolations")
    public void setSkippableViolations(List<ApiErrorViolation> skippableViolations) {
        this.skippableViolations = skippableViolations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiValidationBadResponse messagesApiValidationBadResponse = (MessagesApiValidationBadResponse) o;
        return Objects.equals(this.description, messagesApiValidationBadResponse.description)
                && Objects.equals(this.action, messagesApiValidationBadResponse.action)
                && Objects.equals(this.violations, messagesApiValidationBadResponse.violations)
                && Objects.equals(this.skippableViolations, messagesApiValidationBadResponse.skippableViolations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, action, violations, skippableViolations);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiValidationBadResponse {")
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
                .append(newLine)
                .append("    action: ")
                .append(toIndentedString(action))
                .append(newLine)
                .append("    violations: ")
                .append(toIndentedString(violations))
                .append(newLine)
                .append("    skippableViolations: ")
                .append(toIndentedString(skippableViolations))
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
