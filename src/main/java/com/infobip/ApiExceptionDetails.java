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

    private String messageId;

    private String text;

    private Map<String, List<String>> validationErrors;

    /**
     * Returns an identifier of the error.
     *
     * @return Identifier of the error.
     */
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Returns a detailed error description.
     *
     * @return Detailed error description.
     */
    public String getText() {
        return text;
    }

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
    public Map<String, List<String>> getValidationErrors() {
        return validationErrors;
    }

    public void setValidationErrors(Map<String, List<String>> validationErrors) {
        this.validationErrors = validationErrors;
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
                && Objects.equals(validationErrors, that.validationErrors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageId, text, validationErrors);
    }

    @Override
    public String toString() {
        return "ApiExceptionDetails{" + "messageId='"
                + messageId + '\'' + ", text='"
                + text + '\'' + ", validationErrors="
                + validationErrors + '}';
    }
}
