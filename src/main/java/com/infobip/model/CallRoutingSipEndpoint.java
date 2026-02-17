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
 * Represents CallRoutingSipEndpoint model.
 */
public class CallRoutingSipEndpoint extends CallRoutingEndpoint {

    private String from;

    private String username;

    private String sipTrunkId;

    private Map<String, String> customHeaders = null;

    /**
     * Constructs a new {@link CallRoutingSipEndpoint} instance.
     */
    public CallRoutingSipEndpoint() {
        super("SIP");
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Caller ID that will be used. Defaults to &#x60;from&#x60; value used in inbound call.
     *
     * @param from
     * @return This {@link CallRoutingSipEndpoint instance}.
     */
    public CallRoutingSipEndpoint from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Caller ID that will be used. Defaults to &#x60;from&#x60; value used in inbound call.
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
     * Caller ID that will be used. Defaults to &#x60;from&#x60; value used in inbound call.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets username.
     * <p>
     * Field description:
     * Username sent to a selected SIP trunk. When not defined, Infobip DID number is used instead.
     *
     * @param username
     * @return This {@link CallRoutingSipEndpoint instance}.
     */
    public CallRoutingSipEndpoint username(String username) {
        this.username = username;
        return this;
    }

    /**
     * Returns username.
     * <p>
     * Field description:
     * Username sent to a selected SIP trunk. When not defined, Infobip DID number is used instead.
     *
     * @return username
     */
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     * <p>
     * Field description:
     * Username sent to a selected SIP trunk. When not defined, Infobip DID number is used instead.
     *
     * @param username
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
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
     * @return This {@link CallRoutingSipEndpoint instance}.
     */
    public CallRoutingSipEndpoint sipTrunkId(String sipTrunkId) {
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
     * Sets customHeaders.
     * <p>
     * Field description:
     * Custom headers. Only headers starting with &#x60;X-Client-&#x60; prefix will be propagated. Supports using variables &#x60;${from}&#x60; and &#x60;${to}&#x60;.
     *
     * @param customHeaders
     * @return This {@link CallRoutingSipEndpoint instance}.
     */
    public CallRoutingSipEndpoint customHeaders(Map<String, String> customHeaders) {
        this.customHeaders = customHeaders;
        return this;
    }

    /**
     * Puts and entry into customHeaders.
     * <p>
     * Field description:
     * Custom headers. Only headers starting with &#x60;X-Client-&#x60; prefix will be propagated. Supports using variables &#x60;${from}&#x60; and &#x60;${to}&#x60;.
     *
     * @param key The given key.
     * @param customHeadersItem The item to be associated with the given key.
     * @return This {@link CallRoutingSipEndpoint instance}.
     */
    public CallRoutingSipEndpoint putCustomHeadersItem(String key, String customHeadersItem) {
        if (this.customHeaders == null) {
            this.customHeaders = new HashMap<>();
        }
        this.customHeaders.put(key, customHeadersItem);
        return this;
    }

    /**
     * Returns customHeaders.
     * <p>
     * Field description:
     * Custom headers. Only headers starting with &#x60;X-Client-&#x60; prefix will be propagated. Supports using variables &#x60;${from}&#x60; and &#x60;${to}&#x60;.
     *
     * @return customHeaders
     */
    @JsonProperty("customHeaders")
    public Map<String, String> getCustomHeaders() {
        return customHeaders;
    }

    /**
     * Sets customHeaders.
     * <p>
     * Field description:
     * Custom headers. Only headers starting with &#x60;X-Client-&#x60; prefix will be propagated. Supports using variables &#x60;${from}&#x60; and &#x60;${to}&#x60;.
     *
     * @param customHeaders
     */
    @JsonProperty("customHeaders")
    public void setCustomHeaders(Map<String, String> customHeaders) {
        this.customHeaders = customHeaders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingSipEndpoint callRoutingSipEndpoint = (CallRoutingSipEndpoint) o;
        return Objects.equals(this.from, callRoutingSipEndpoint.from)
                && Objects.equals(this.username, callRoutingSipEndpoint.username)
                && Objects.equals(this.sipTrunkId, callRoutingSipEndpoint.sipTrunkId)
                && Objects.equals(this.customHeaders, callRoutingSipEndpoint.customHeaders)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, username, sipTrunkId, customHeaders, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingSipEndpoint {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    username: ")
                .append(toIndentedString(username))
                .append(newLine)
                .append("    sipTrunkId: ")
                .append(toIndentedString(sipTrunkId))
                .append(newLine)
                .append("    customHeaders: ")
                .append(toIndentedString(customHeaders))
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
