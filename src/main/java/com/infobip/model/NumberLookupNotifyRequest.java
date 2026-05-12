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
 * Represents NumberLookupNotifyRequest model.
 */
public class NumberLookupNotifyRequest {

    private String notifyContentType;

    private String notifyUrl;

    private List<String> to = new ArrayList<>();

    /**
     * Sets notifyContentType.
     * <p>
     * Field description:
     * Preferred lookup report content type. Can be &#x60;application/json&#x60; or &#x60;application/xml&#x60;.
     *
     * @param notifyContentType
     * @return This {@link NumberLookupNotifyRequest instance}.
     */
    public NumberLookupNotifyRequest notifyContentType(String notifyContentType) {
        this.notifyContentType = notifyContentType;
        return this;
    }

    /**
     * Returns notifyContentType.
     * <p>
     * Field description:
     * Preferred lookup report content type. Can be &#x60;application/json&#x60; or &#x60;application/xml&#x60;.
     *
     * @return notifyContentType
     */
    @JsonProperty("notifyContentType")
    public String getNotifyContentType() {
        return notifyContentType;
    }

    /**
     * Sets notifyContentType.
     * <p>
     * Field description:
     * Preferred lookup report content type. Can be &#x60;application/json&#x60; or &#x60;application/xml&#x60;.
     *
     * @param notifyContentType
     */
    @JsonProperty("notifyContentType")
    public void setNotifyContentType(String notifyContentType) {
        this.notifyContentType = notifyContentType;
    }

    /**
     * Sets notifyUrl.
     * <p>
     * Field description:
     * The URL on your call back server on which the lookup report will be sent.
     *
     * @param notifyUrl
     * @return This {@link NumberLookupNotifyRequest instance}.
     */
    public NumberLookupNotifyRequest notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    /**
     * Returns notifyUrl.
     * <p>
     * Field description:
     * The URL on your call back server on which the lookup report will be sent.
     *
     * @return notifyUrl
     */
    @JsonProperty("notifyUrl")
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * Sets notifyUrl.
     * <p>
     * Field description:
     * The URL on your call back server on which the lookup report will be sent.
     *
     * @param notifyUrl
     */
    @JsonProperty("notifyUrl")
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Array of phone numbers to look up. Numbers must be in international format (Example: &#x60;41793026727&#x60;).
     * <p>
     * The field is required.
     *
     * @param to
     * @return This {@link NumberLookupNotifyRequest instance}.
     */
    public NumberLookupNotifyRequest to(List<String> to) {
        this.to = to;
        return this;
    }

    /**
     * Adds and item into to.
     * <p>
     * Field description:
     * Array of phone numbers to look up. Numbers must be in international format (Example: &#x60;41793026727&#x60;).
     * <p>
     * The field is required.
     *
     * @param toItem The item to be added to the list.
     * @return This {@link NumberLookupNotifyRequest instance}.
     */
    public NumberLookupNotifyRequest addToItem(String toItem) {
        if (this.to == null) {
            this.to = new ArrayList<>();
        }
        this.to.add(toItem);
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Array of phone numbers to look up. Numbers must be in international format (Example: &#x60;41793026727&#x60;).
     * <p>
     * The field is required.
     *
     * @return to
     */
    @JsonProperty("to")
    public List<String> getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Array of phone numbers to look up. Numbers must be in international format (Example: &#x60;41793026727&#x60;).
     * <p>
     * The field is required.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(List<String> to) {
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumberLookupNotifyRequest numberLookupNotifyRequest = (NumberLookupNotifyRequest) o;
        return Objects.equals(this.notifyContentType, numberLookupNotifyRequest.notifyContentType)
                && Objects.equals(this.notifyUrl, numberLookupNotifyRequest.notifyUrl)
                && Objects.equals(this.to, numberLookupNotifyRequest.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(notifyContentType, notifyUrl, to);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumberLookupNotifyRequest {")
                .append(newLine)
                .append("    notifyContentType: ")
                .append(toIndentedString(notifyContentType))
                .append(newLine)
                .append("    notifyUrl: ")
                .append(toIndentedString(notifyUrl))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
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
