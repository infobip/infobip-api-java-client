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
 * Represents CallRoutingSimulatorSipEndpoint model.
 */
public class CallRoutingSimulatorSipEndpoint extends CallRoutingSimulatorCallEndpoint {

    private String from;

    private String sipTrunkId;

    private Map<String, String> headers = null;

    /**
     * Constructs a new {@link CallRoutingSimulatorSipEndpoint} instance.
     */
    public CallRoutingSimulatorSipEndpoint() {
        super("SIP");
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Username sent to a selected SIP trunk.
     *
     * @param from
     * @return This {@link CallRoutingSimulatorSipEndpoint instance}.
     */
    public CallRoutingSimulatorSipEndpoint from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Username sent to a selected SIP trunk.
     *
     * @return from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Username sent to a selected SIP trunk.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets sipTrunkId.
     * <p>
     * Field description:
     * Unique identifier of a SIP trunk.
     * <p>
     * The field is required.
     *
     * @param sipTrunkId
     * @return This {@link CallRoutingSimulatorSipEndpoint instance}.
     */
    public CallRoutingSimulatorSipEndpoint sipTrunkId(String sipTrunkId) {
        this.sipTrunkId = sipTrunkId;
        return this;
    }

    /**
     * Returns sipTrunkId.
     * <p>
     * Field description:
     * Unique identifier of a SIP trunk.
     * <p>
     * The field is required.
     *
     * @return sipTrunkId
     */
    @JsonProperty("sipTrunkId")
    public String getSipTrunkId() {
        return sipTrunkId;
    }

    /**
     * Sets sipTrunkId.
     * <p>
     * Field description:
     * Unique identifier of a SIP trunk.
     * <p>
     * The field is required.
     *
     * @param sipTrunkId
     */
    @JsonProperty("sipTrunkId")
    public void setSipTrunkId(String sipTrunkId) {
        this.sipTrunkId = sipTrunkId;
    }

    /**
     * Sets headers.
     * <p>
     * Field description:
     * Custom headers.
     *
     * @param headers
     * @return This {@link CallRoutingSimulatorSipEndpoint instance}.
     */
    public CallRoutingSimulatorSipEndpoint headers(Map<String, String> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Puts and entry into headers.
     * <p>
     * Field description:
     * Custom headers.
     *
     * @param key The given key.
     * @param headersItem The item to be associated with the given key.
     * @return This {@link CallRoutingSimulatorSipEndpoint instance}.
     */
    public CallRoutingSimulatorSipEndpoint putHeadersItem(String key, String headersItem) {
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
     * Custom headers.
     *
     * @return headers
     */
    @JsonProperty("headers")
    public Map<String, String> getHeaders() {
        return headers;
    }

    /**
     * Sets headers.
     * <p>
     * Field description:
     * Custom headers.
     *
     * @param headers
     */
    @JsonProperty("headers")
    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingSimulatorSipEndpoint callRoutingSimulatorSipEndpoint = (CallRoutingSimulatorSipEndpoint) o;
        return Objects.equals(this.from, callRoutingSimulatorSipEndpoint.from)
                && Objects.equals(this.sipTrunkId, callRoutingSimulatorSipEndpoint.sipTrunkId)
                && Objects.equals(this.headers, callRoutingSimulatorSipEndpoint.headers)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, sipTrunkId, headers, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingSimulatorSipEndpoint {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    sipTrunkId: ")
                .append(toIndentedString(sipTrunkId))
                .append(newLine)
                .append("    headers: ")
                .append(toIndentedString(headers))
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
