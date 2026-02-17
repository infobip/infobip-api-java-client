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
 * Properties of the events that provide &#x60;Call&#x60; object.
 */
public class CallProperties {

    private Call call;

    private String apiBaseUrl;

    private String sender;

    private String resolvedCnam;

    /**
     * Sets call.
     *
     * @param call
     * @return This {@link CallProperties instance}.
     */
    public CallProperties call(Call call) {
        this.call = call;
        return this;
    }

    /**
     * Returns call.
     *
     * @return call
     */
    @JsonProperty("call")
    public Call getCall() {
        return call;
    }

    /**
     * Sets call.
     *
     * @param call
     */
    @JsonProperty("call")
    public void setCall(Call call) {
        this.call = call;
    }

    /**
     * Sets apiBaseUrl.
     * <p>
     * Field description:
     * Base URL of the API which you should invoke for all actions related to the call.
     *
     * @param apiBaseUrl
     * @return This {@link CallProperties instance}.
     */
    public CallProperties apiBaseUrl(String apiBaseUrl) {
        this.apiBaseUrl = apiBaseUrl;
        return this;
    }

    /**
     * Returns apiBaseUrl.
     * <p>
     * Field description:
     * Base URL of the API which you should invoke for all actions related to the call.
     *
     * @return apiBaseUrl
     */
    @JsonProperty("apiBaseUrl")
    public String getApiBaseUrl() {
        return apiBaseUrl;
    }

    /**
     * Sets apiBaseUrl.
     * <p>
     * Field description:
     * Base URL of the API which you should invoke for all actions related to the call.
     *
     * @param apiBaseUrl
     */
    @JsonProperty("apiBaseUrl")
    public void setApiBaseUrl(String apiBaseUrl) {
        this.apiBaseUrl = apiBaseUrl;
    }

    /**
     * Sets sender.
     *
     * @param sender
     * @return This {@link CallProperties instance}.
     */
    public CallProperties sender(String sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Returns sender.
     *
     * @return sender
     */
    @JsonProperty("sender")
    public String getSender() {
        return sender;
    }

    /**
     * Sets sender.
     *
     * @param sender
     */
    @JsonProperty("sender")
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * Sets resolvedCnam.
     *
     * @param resolvedCnam
     * @return This {@link CallProperties instance}.
     */
    public CallProperties resolvedCnam(String resolvedCnam) {
        this.resolvedCnam = resolvedCnam;
        return this;
    }

    /**
     * Returns resolvedCnam.
     *
     * @return resolvedCnam
     */
    @JsonProperty("resolvedCnam")
    public String getResolvedCnam() {
        return resolvedCnam;
    }

    /**
     * Sets resolvedCnam.
     *
     * @param resolvedCnam
     */
    @JsonProperty("resolvedCnam")
    public void setResolvedCnam(String resolvedCnam) {
        this.resolvedCnam = resolvedCnam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallProperties callProperties = (CallProperties) o;
        return Objects.equals(this.call, callProperties.call)
                && Objects.equals(this.apiBaseUrl, callProperties.apiBaseUrl)
                && Objects.equals(this.sender, callProperties.sender)
                && Objects.equals(this.resolvedCnam, callProperties.resolvedCnam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(call, apiBaseUrl, sender, resolvedCnam);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallProperties {")
                .append(newLine)
                .append("    call: ")
                .append(toIndentedString(call))
                .append(newLine)
                .append("    apiBaseUrl: ")
                .append(toIndentedString(apiBaseUrl))
                .append(newLine)
                .append("    sender: ")
                .append(toIndentedString(sender))
                .append(newLine)
                .append("    resolvedCnam: ")
                .append(toIndentedString(resolvedCnam))
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
