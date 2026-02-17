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
 * Properties indicating whether the event is related with a retried call.
 */
public class CallsRetryProperties {

    private Boolean retry;

    /**
     * Sets retry.
     *
     * @param retry
     * @return This {@link CallsRetryProperties instance}.
     */
    public CallsRetryProperties retry(Boolean retry) {
        this.retry = retry;
        return this;
    }

    /**
     * Returns retry.
     *
     * @return retry
     */
    @JsonProperty("retry")
    public Boolean getRetry() {
        return retry;
    }

    /**
     * Sets retry.
     *
     * @param retry
     */
    @JsonProperty("retry")
    public void setRetry(Boolean retry) {
        this.retry = retry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsRetryProperties callsRetryProperties = (CallsRetryProperties) o;
        return Objects.equals(this.retry, callsRetryProperties.retry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retry);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsRetryProperties {")
                .append(newLine)
                .append("    retry: ")
                .append(toIndentedString(retry))
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
