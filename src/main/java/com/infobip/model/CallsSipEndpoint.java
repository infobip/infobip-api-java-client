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
 * Represents CallsSipEndpoint model.
 */
public class CallsSipEndpoint extends CallEndpoint {

    private String username;

    private String sipTrunkId;

    private String sipTrunkGroupId;

    private Map<String, String> customHeaders = null;

    /**
     * Constructs a new {@link CallsSipEndpoint} instance.
     */
    public CallsSipEndpoint() {
        super("SIP");
    }

    /**
     * Sets username.
     * <p>
     * Field description:
     * SIP endpoint username.
     * <p>
     * The field is required.
     *
     * @param username
     * @return This {@link CallsSipEndpoint instance}.
     */
    public CallsSipEndpoint username(String username) {
        this.username = username;
        return this;
    }

    /**
     * Returns username.
     * <p>
     * Field description:
     * SIP endpoint username.
     * <p>
     * The field is required.
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
     * SIP endpoint username.
     * <p>
     * The field is required.
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
     * SIP trunk ID. Either this field or &#x60;sipTrunkGroupId&#x60; has to be provided.
     *
     * @param sipTrunkId
     * @return This {@link CallsSipEndpoint instance}.
     */
    public CallsSipEndpoint sipTrunkId(String sipTrunkId) {
        this.sipTrunkId = sipTrunkId;
        return this;
    }

    /**
     * Returns sipTrunkId.
     * <p>
     * Field description:
     * SIP trunk ID. Either this field or &#x60;sipTrunkGroupId&#x60; has to be provided.
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
     * SIP trunk ID. Either this field or &#x60;sipTrunkGroupId&#x60; has to be provided.
     *
     * @param sipTrunkId
     */
    @JsonProperty("sipTrunkId")
    public void setSipTrunkId(String sipTrunkId) {
        this.sipTrunkId = sipTrunkId;
    }

    /**
     * Sets sipTrunkGroupId.
     * <p>
     * Field description:
     * SIP trunk group ID. Either this field or &#x60;sipTrunkId&#x60; has to be provided.
     *
     * @param sipTrunkGroupId
     * @return This {@link CallsSipEndpoint instance}.
     */
    public CallsSipEndpoint sipTrunkGroupId(String sipTrunkGroupId) {
        this.sipTrunkGroupId = sipTrunkGroupId;
        return this;
    }

    /**
     * Returns sipTrunkGroupId.
     * <p>
     * Field description:
     * SIP trunk group ID. Either this field or &#x60;sipTrunkId&#x60; has to be provided.
     *
     * @return sipTrunkGroupId
     */
    @JsonProperty("sipTrunkGroupId")
    public String getSipTrunkGroupId() {
        return sipTrunkGroupId;
    }

    /**
     * Sets sipTrunkGroupId.
     * <p>
     * Field description:
     * SIP trunk group ID. Either this field or &#x60;sipTrunkId&#x60; has to be provided.
     *
     * @param sipTrunkGroupId
     */
    @JsonProperty("sipTrunkGroupId")
    public void setSipTrunkGroupId(String sipTrunkGroupId) {
        this.sipTrunkGroupId = sipTrunkGroupId;
    }

    /**
     * Sets customHeaders.
     * <p>
     * Field description:
     * Custom headers.
     *
     * @param customHeaders
     * @return This {@link CallsSipEndpoint instance}.
     */
    public CallsSipEndpoint customHeaders(Map<String, String> customHeaders) {
        this.customHeaders = customHeaders;
        return this;
    }

    /**
     * Puts and entry into customHeaders.
     * <p>
     * Field description:
     * Custom headers.
     *
     * @param key The given key.
     * @param customHeadersItem The item to be associated with the given key.
     * @return This {@link CallsSipEndpoint instance}.
     */
    public CallsSipEndpoint putCustomHeadersItem(String key, String customHeadersItem) {
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
     * Custom headers.
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
     * Custom headers.
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
        CallsSipEndpoint callsSipEndpoint = (CallsSipEndpoint) o;
        return Objects.equals(this.username, callsSipEndpoint.username)
                && Objects.equals(this.sipTrunkId, callsSipEndpoint.sipTrunkId)
                && Objects.equals(this.sipTrunkGroupId, callsSipEndpoint.sipTrunkGroupId)
                && Objects.equals(this.customHeaders, callsSipEndpoint.customHeaders)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, sipTrunkId, sipTrunkGroupId, customHeaders, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSipEndpoint {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    username: ")
                .append(toIndentedString(username))
                .append(newLine)
                .append("    sipTrunkId: ")
                .append(toIndentedString(sipTrunkId))
                .append(newLine)
                .append("    sipTrunkGroupId: ")
                .append(toIndentedString(sipTrunkGroupId))
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
