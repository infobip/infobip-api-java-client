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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents CallRoutingSipCriteria model.
 */
public class CallRoutingSipCriteria extends CallRoutingCriteria {

    private String sipTrunkId;

    private String username;

    private List<CallRoutingSipHeader> headers = null;

    /**
     * Constructs a new {@link CallRoutingSipCriteria} instance.
     */
    public CallRoutingSipCriteria() {
        super("SIP");
    }

    /**
     * Sets sipTrunkId.
     * <p>
     * Field description:
     * ID of the SIP trunk. Example: &#x60;60d345fd3a799ec&#x60;
     *
     * @param sipTrunkId
     * @return This {@link CallRoutingSipCriteria instance}.
     */
    public CallRoutingSipCriteria sipTrunkId(String sipTrunkId) {
        this.sipTrunkId = sipTrunkId;
        return this;
    }

    /**
     * Returns sipTrunkId.
     * <p>
     * Field description:
     * ID of the SIP trunk. Example: &#x60;60d345fd3a799ec&#x60;
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
     * ID of the SIP trunk. Example: &#x60;60d345fd3a799ec&#x60;
     *
     * @param sipTrunkId
     */
    @JsonProperty("sipTrunkId")
    public void setSipTrunkId(String sipTrunkId) {
        this.sipTrunkId = sipTrunkId;
    }

    /**
     * Sets username.
     * <p>
     * Field description:
     * SIP trunk username or regular expression pattern representing username. Examples: &#x60;41793026727&#x60;, &#x60;41793(.+)&#x60;.
     *
     * @param username
     * @return This {@link CallRoutingSipCriteria instance}.
     */
    public CallRoutingSipCriteria username(String username) {
        this.username = username;
        return this;
    }

    /**
     * Returns username.
     * <p>
     * Field description:
     * SIP trunk username or regular expression pattern representing username. Examples: &#x60;41793026727&#x60;, &#x60;41793(.+)&#x60;.
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
     * SIP trunk username or regular expression pattern representing username. Examples: &#x60;41793026727&#x60;, &#x60;41793(.+)&#x60;.
     *
     * @param username
     */
    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Sets headers.
     * <p>
     * Field description:
     * SIP headers. To meet the criteria, all of the provided headers must match.
     *
     * @param headers
     * @return This {@link CallRoutingSipCriteria instance}.
     */
    public CallRoutingSipCriteria headers(List<CallRoutingSipHeader> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Adds and item into headers.
     * <p>
     * Field description:
     * SIP headers. To meet the criteria, all of the provided headers must match.
     *
     * @param headersItem The item to be added to the list.
     * @return This {@link CallRoutingSipCriteria instance}.
     */
    public CallRoutingSipCriteria addHeadersItem(CallRoutingSipHeader headersItem) {
        if (this.headers == null) {
            this.headers = new ArrayList<>();
        }
        this.headers.add(headersItem);
        return this;
    }

    /**
     * Returns headers.
     * <p>
     * Field description:
     * SIP headers. To meet the criteria, all of the provided headers must match.
     *
     * @return headers
     */
    @JsonProperty("headers")
    public List<CallRoutingSipHeader> getHeaders() {
        return headers;
    }

    /**
     * Sets headers.
     * <p>
     * Field description:
     * SIP headers. To meet the criteria, all of the provided headers must match.
     *
     * @param headers
     */
    @JsonProperty("headers")
    public void setHeaders(List<CallRoutingSipHeader> headers) {
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
        CallRoutingSipCriteria callRoutingSipCriteria = (CallRoutingSipCriteria) o;
        return Objects.equals(this.sipTrunkId, callRoutingSipCriteria.sipTrunkId)
                && Objects.equals(this.username, callRoutingSipCriteria.username)
                && Objects.equals(this.headers, callRoutingSipCriteria.headers)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sipTrunkId, username, headers, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingSipCriteria {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    sipTrunkId: ")
                .append(toIndentedString(sipTrunkId))
                .append(newLine)
                .append("    username: ")
                .append(toIndentedString(username))
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
