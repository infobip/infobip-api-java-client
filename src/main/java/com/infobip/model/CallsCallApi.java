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
 * Call API Action performs an HTTP request to a client’s endpoint, and (if told to) processes the response data. If collectResponse is set, the system will attempt to parse the response from the server. Our platform needs to be able to make HTTP requests to the specified endpoint.
 */
public class CallsCallApi implements CallsScriptInner {

    private String request;

    private CallsCallApiOptions options;

    private Integer actionId;

    /**
     * Sets request.
     * <p>
     * Field description:
     * The URL to target
     * <p>
     * The field is required.
     *
     * @param request
     * @return This {@link CallsCallApi instance}.
     */
    public CallsCallApi request(String request) {
        this.request = request;
        return this;
    }

    /**
     * Returns request.
     * <p>
     * Field description:
     * The URL to target
     * <p>
     * The field is required.
     *
     * @return request
     */
    @JsonProperty("request")
    public String getRequest() {
        return request;
    }

    /**
     * Sets request.
     * <p>
     * Field description:
     * The URL to target
     * <p>
     * The field is required.
     *
     * @param request
     */
    @JsonProperty("request")
    public void setRequest(String request) {
        this.request = request;
    }

    /**
     * Sets options.
     * <p>
     * The field is required.
     *
     * @param options
     * @return This {@link CallsCallApi instance}.
     */
    public CallsCallApi options(CallsCallApiOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns options.
     * <p>
     * The field is required.
     *
     * @return options
     */
    @JsonProperty("options")
    public CallsCallApiOptions getOptions() {
        return options;
    }

    /**
     * Sets options.
     * <p>
     * The field is required.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(CallsCallApiOptions options) {
        this.options = options;
    }

    /**
     * Sets actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @param actionId
     * @return This {@link CallsCallApi instance}.
     */
    public CallsCallApi actionId(Integer actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * Returns actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @return actionId
     */
    @JsonProperty("actionId")
    public Integer getActionId() {
        return actionId;
    }

    /**
     * Sets actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @param actionId
     */
    @JsonProperty("actionId")
    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsCallApi callsCallApi = (CallsCallApi) o;
        return Objects.equals(this.request, callsCallApi.request)
                && Objects.equals(this.options, callsCallApi.options)
                && Objects.equals(this.actionId, callsCallApi.actionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(request, options, actionId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsCallApi {")
                .append(newLine)
                .append("    request: ")
                .append(toIndentedString(request))
                .append(newLine)
                .append("    options: ")
                .append(toIndentedString(options))
                .append(newLine)
                .append("    actionId: ")
                .append(toIndentedString(actionId))
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
