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
 * Represents RcsCapabilityCheckAsyncResult model.
 */
public class RcsCapabilityCheckAsyncResult {

    private RcsCapabilityCheckResult capabilityCheckResult;

    private RcsCapabilityCheckOptions options;

    /**
     * Sets capabilityCheckResult.
     * <p>
     * The field is required.
     *
     * @param capabilityCheckResult
     * @return This {@link RcsCapabilityCheckAsyncResult instance}.
     */
    public RcsCapabilityCheckAsyncResult capabilityCheckResult(RcsCapabilityCheckResult capabilityCheckResult) {
        this.capabilityCheckResult = capabilityCheckResult;
        return this;
    }

    /**
     * Returns capabilityCheckResult.
     * <p>
     * The field is required.
     *
     * @return capabilityCheckResult
     */
    @JsonProperty("capabilityCheckResult")
    public RcsCapabilityCheckResult getCapabilityCheckResult() {
        return capabilityCheckResult;
    }

    /**
     * Sets capabilityCheckResult.
     * <p>
     * The field is required.
     *
     * @param capabilityCheckResult
     */
    @JsonProperty("capabilityCheckResult")
    public void setCapabilityCheckResult(RcsCapabilityCheckResult capabilityCheckResult) {
        this.capabilityCheckResult = capabilityCheckResult;
    }

    /**
     * Sets options.
     *
     * @param options
     * @return This {@link RcsCapabilityCheckAsyncResult instance}.
     */
    public RcsCapabilityCheckAsyncResult options(RcsCapabilityCheckOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns options.
     *
     * @return options
     */
    @JsonProperty("options")
    public RcsCapabilityCheckOptions getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(RcsCapabilityCheckOptions options) {
        this.options = options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsCapabilityCheckAsyncResult rcsCapabilityCheckAsyncResult = (RcsCapabilityCheckAsyncResult) o;
        return Objects.equals(this.capabilityCheckResult, rcsCapabilityCheckAsyncResult.capabilityCheckResult)
                && Objects.equals(this.options, rcsCapabilityCheckAsyncResult.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capabilityCheckResult, options);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsCapabilityCheckAsyncResult {")
                .append(newLine)
                .append("    capabilityCheckResult: ")
                .append(toIndentedString(capabilityCheckResult))
                .append(newLine)
                .append("    options: ")
                .append(toIndentedString(options))
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
