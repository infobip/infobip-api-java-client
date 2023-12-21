/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Represents API error details.
 */
public final class ApiExceptionDetails {

    @Deprecated(since = "4.1.0")
    private String messageId;

    @Deprecated(since = "4.1.0")
    private String text;

    @Deprecated(since = "4.1.0")
    private Map<String, List<String>> validationErrors;

    private String errorCode;

    private String description;

    private String action;

    private List<Violation> violations;

    private List<Resource> resources;

    /**
     * Returns an identifier of the error.
     *
     * @return Identifier of the error.
     */
    @Deprecated(since = "4.1.0")
    public String getMessageId() {
        return messageId;
    }

    @Deprecated(since = "4.1.0")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Returns a detailed error description.
     *
     * @return Detailed error description.
     */
    @Deprecated(since = "4.1.0")
    public String getText() {
        return text;
    }

    @Deprecated(since = "4.1.0")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Returns a map of validation if there are provided in the response,
     * <code>null</code> otherwise.
     * <p>
     * Keys of the map are field paths. Values are lists of violations.
     *
     * @return {@link Map} of validation errors.
     */
    @Deprecated(since = "4.1.0")
    public Map<String, List<String>> getValidationErrors() {
        return validationErrors;
    }

    @Deprecated(since = "4.1.0")
    public void setValidationErrors(Map<String, List<String>> validationErrors) {
        this.validationErrors = validationErrors;
    }

    /**
     * Returns an error code that uniquely identifies the error case.
     *
     * @return Error code.
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Returns a detailed error description.
     *
     * @return Detailed error description.
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns action that should be taken to recover from the error.
     *
     * @return Action description.
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * Returns a list of violations if they are provided in the response,
     * <code>null</code> otherwise.
     *
     * @return {@link List} of violations.
     */
    public List<Violation> getViolations() {
        return violations;
    }

    public void setViolations(List<Violation> violations) {
        this.violations = violations;
    }

    /**
     * Returns a list of resources if they are provided in the response,
     * <code>null</code> otherwise.
     *
     * @return {@link List} of resources.
     */
    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    /**
     * Represents information about violation.
     */
    public static final class Violation {
        private String property;
        private String violation;

        /**
         * Returns which property was violated.
         *
         * @return Violated property.
         */
        public String getProperty() {
            return property;
        }

        public void setProperty(String property) {
            this.property = property;
        }

        /**
         * Returns what was the violation of property.
         *
         * @return Violation.
         */
        public String getViolation() {
            return violation;
        }

        public void setViolation(String violation) {
            this.violation = violation;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Violation that = (Violation) o;
            return Objects.equals(property, that.property) && Objects.equals(violation, that.violation);
        }

        @Override
        public int hashCode() {
            return Objects.hash(property, violation);
        }

        @Override
        public String toString() {
            return "Violation{" + "property='" + property + '\'' + ", violation='" + violation + '\'' + '}';
        }
    }

    /**
     * Provides resources for received error.
     */
    public static final class Resource {
        private String name;
        private String url;

        /**
         * Returns the name of the resource.
         *
         * @return Resource name.
         */
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        /**
         * Returns the url of the resource.
         *
         * @return Resource url.
         */
        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Resource that = (Resource) o;
            return Objects.equals(name, that.name) && Objects.equals(url, that.url);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, url);
        }

        @Override
        public String toString() {
            return "Resource{" + "name='" + name + '\'' + ", url='" + url + '\'' + '}';
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiExceptionDetails that = (ApiExceptionDetails) o;
        return Objects.equals(messageId, that.messageId)
                && Objects.equals(text, that.text)
                && Objects.equals(validationErrors, that.validationErrors)
                && Objects.equals(errorCode, that.errorCode)
                && Objects.equals(description, that.description)
                && Objects.equals(action, that.action)
                && Objects.equals(violations, that.violations)
                && Objects.equals(resources, that.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, text, validationErrors, errorCode, description, action, violations, resources);
    }

    @Override
    public String toString() {
        return "ApiExceptionDetails{" + "messageId='"
                + messageId + '\'' + ", text='"
                + text + '\'' + ", validationErrors="
                + validationErrors + ", errorCode='"
                + errorCode + '\'' + ", description='"
                + description + '\'' + ", action='"
                + action + '\'' + ", violations="
                + violations + ", resources="
                + resources + '}';
    }
}
