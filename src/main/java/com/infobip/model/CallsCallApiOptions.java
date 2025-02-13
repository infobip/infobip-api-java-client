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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents CallsCallApiOptions model.
 */
public class CallsCallApiOptions {

    private CallsHttpMethod method;

    private Map<String, Object> headers = null;

    private String body;

    private Boolean collectResponse;

    /**
     * Sets method.
     * <p>
     * The field is required.
     *
     * @param method
     * @return This {@link CallsCallApiOptions instance}.
     */
    public CallsCallApiOptions method(CallsHttpMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Returns method.
     * <p>
     * The field is required.
     *
     * @return method
     */
    @JsonProperty("method")
    public CallsHttpMethod getMethod() {
        return method;
    }

    /**
     * Sets method.
     * <p>
     * The field is required.
     *
     * @param method
     */
    @JsonProperty("method")
    public void setMethod(CallsHttpMethod method) {
        this.method = method;
    }

    /**
     * Sets headers.
     * <p>
     * Field description:
     * HTTP headers
     *
     * @param headers
     * @return This {@link CallsCallApiOptions instance}.
     */
    public CallsCallApiOptions headers(Map<String, Object> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Puts and entry into headers.
     * <p>
     * Field description:
     * HTTP headers
     *
     * @param key The given key.
     * @param headersItem The item to be associated with the given key.
     * @return This {@link CallsCallApiOptions instance}.
     */
    public CallsCallApiOptions putHeadersItem(String key, Object headersItem) {
        if (this.headers == null) {
            this.headers = new HashMap<>();
        }
        this.headers.put(key, headersItem);
        return this;
    }

    /**
     * Returns headers.
     * <p>
     * Field description:
     * HTTP headers
     *
     * @return headers
     */
    @JsonProperty("headers")
    public Map<String, Object> getHeaders() {
        return headers;
    }

    /**
     * Sets headers.
     * <p>
     * Field description:
     * HTTP headers
     *
     * @param headers
     */
    @JsonProperty("headers")
    public void setHeaders(Map<String, Object> headers) {
        this.headers = headers;
    }

    /**
     * Sets body.
     * <p>
     * Field description:
     * HTTP body
     *
     * @param body
     * @return This {@link CallsCallApiOptions instance}.
     */
    public CallsCallApiOptions body(String body) {
        this.body = body;
        return this;
    }

    /**
     * Returns body.
     * <p>
     * Field description:
     * HTTP body
     *
     * @return body
     */
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    /**
     * Sets body.
     * <p>
     * Field description:
     * HTTP body
     *
     * @param body
     */
    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Sets collectResponse.
     * <p>
     * Field description:
     * If this field is set, the system will parse the response and save all its fields as variables inside scenario. Note: Parser ignores non-primitive fields and does not go deeper than the first level. For example, if the response is {\&quot;letters\&quot;: \&quot;abcd\&quot;, \&quot;numbers\&quot;: 12345}, the system will store variables letters and numbers, with values abcd and 12345 respectively. Check the example Say action with Call Api Responses. Response that is parsed can only be in JSON or XML.
     *
     * @param collectResponse
     * @return This {@link CallsCallApiOptions instance}.
     */
    public CallsCallApiOptions collectResponse(Boolean collectResponse) {
        this.collectResponse = collectResponse;
        return this;
    }

    /**
     * Returns collectResponse.
     * <p>
     * Field description:
     * If this field is set, the system will parse the response and save all its fields as variables inside scenario. Note: Parser ignores non-primitive fields and does not go deeper than the first level. For example, if the response is {\&quot;letters\&quot;: \&quot;abcd\&quot;, \&quot;numbers\&quot;: 12345}, the system will store variables letters and numbers, with values abcd and 12345 respectively. Check the example Say action with Call Api Responses. Response that is parsed can only be in JSON or XML.
     *
     * @return collectResponse
     */
    @JsonProperty("collectResponse")
    public Boolean getCollectResponse() {
        return collectResponse;
    }

    /**
     * Sets collectResponse.
     * <p>
     * Field description:
     * If this field is set, the system will parse the response and save all its fields as variables inside scenario. Note: Parser ignores non-primitive fields and does not go deeper than the first level. For example, if the response is {\&quot;letters\&quot;: \&quot;abcd\&quot;, \&quot;numbers\&quot;: 12345}, the system will store variables letters and numbers, with values abcd and 12345 respectively. Check the example Say action with Call Api Responses. Response that is parsed can only be in JSON or XML.
     *
     * @param collectResponse
     */
    @JsonProperty("collectResponse")
    public void setCollectResponse(Boolean collectResponse) {
        this.collectResponse = collectResponse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsCallApiOptions callsCallApiOptions = (CallsCallApiOptions) o;
        return Objects.equals(this.method, callsCallApiOptions.method)
                && Objects.equals(this.headers, callsCallApiOptions.headers)
                && Objects.equals(this.body, callsCallApiOptions.body)
                && Objects.equals(this.collectResponse, callsCallApiOptions.collectResponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(method, headers, body, collectResponse);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsCallApiOptions {")
                .append(newLine)
                .append("    method: ")
                .append(toIndentedString(method))
                .append(newLine)
                .append("    headers: ")
                .append(toIndentedString(headers))
                .append(newLine)
                .append("    body: ")
                .append(toIndentedString(body))
                .append(newLine)
                .append("    collectResponse: ")
                .append(toIndentedString(collectResponse))
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
