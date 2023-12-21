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
 * Represents ApiError model.
 */
public class ApiError {

    private String errorCode;

    private String description;

    private String action;

    private List<ApiErrorViolation> violations = new ArrayList<>();

    private List<ApiErrorResource> resources = new ArrayList<>();

    /**
     * Sets errorCode.
     * <p>
     * Field description:
     * An error code uniquely identifying the error case.
     * <p>
     * The field is required.
     *
     * @param errorCode
     * @return This {@link ApiError instance}.
     */
    public ApiError errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Returns errorCode.
     * <p>
     * Field description:
     * An error code uniquely identifying the error case.
     * <p>
     * The field is required.
     *
     * @return errorCode
     */
    @JsonProperty("errorCode")
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets errorCode.
     * <p>
     * Field description:
     * An error code uniquely identifying the error case.
     * <p>
     * The field is required.
     *
     * @param errorCode
     */
    @JsonProperty("errorCode")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
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
     * @return This {@link ApiError instance}.
     */
    public ApiError description(String description) {
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
     * @return This {@link ApiError instance}.
     */
    public ApiError action(String action) {
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
     * @return This {@link ApiError instance}.
     */
    public ApiError violations(List<ApiErrorViolation> violations) {
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
     * @return This {@link ApiError instance}.
     */
    public ApiError addViolationsItem(ApiErrorViolation violationsItem) {
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
     * Sets resources.
     * <p>
     * Field description:
     * List of available resources to recover from the error.
     * <p>
     * The field is required.
     *
     * @param resources
     * @return This {@link ApiError instance}.
     */
    public ApiError resources(List<ApiErrorResource> resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Adds and item into resources.
     * <p>
     * Field description:
     * List of available resources to recover from the error.
     * <p>
     * The field is required.
     *
     * @param resourcesItem The item to be added to the list.
     * @return This {@link ApiError instance}.
     */
    public ApiError addResourcesItem(ApiErrorResource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    /**
     * Returns resources.
     * <p>
     * Field description:
     * List of available resources to recover from the error.
     * <p>
     * The field is required.
     *
     * @return resources
     */
    @JsonProperty("resources")
    public List<ApiErrorResource> getResources() {
        return resources;
    }

    /**
     * Sets resources.
     * <p>
     * Field description:
     * List of available resources to recover from the error.
     * <p>
     * The field is required.
     *
     * @param resources
     */
    @JsonProperty("resources")
    public void setResources(List<ApiErrorResource> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiError apiError = (ApiError) o;
        return Objects.equals(this.errorCode, apiError.errorCode)
                && Objects.equals(this.description, apiError.description)
                && Objects.equals(this.action, apiError.action)
                && Objects.equals(this.violations, apiError.violations)
                && Objects.equals(this.resources, apiError.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode, description, action, violations, resources);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ApiError {")
                .append(newLine)
                .append("    errorCode: ")
                .append(toIndentedString(errorCode))
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
                .append("    resources: ")
                .append(toIndentedString(resources))
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
