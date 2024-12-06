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
 * SIP headers. To meet the criteria, all of the provided headers must match.
 */
public class CallRoutingSipHeader {

    private String headerName;

    private String headerValue;

    /**
     * Sets headerName.
     * <p>
     * Field description:
     * SIP header name starting with &#x60;X-&#x60;. Example: &#x60;X-Identity&#x60;.
     * <p>
     * The field is required.
     *
     * @param headerName
     * @return This {@link CallRoutingSipHeader instance}.
     */
    public CallRoutingSipHeader headerName(String headerName) {
        this.headerName = headerName;
        return this;
    }

    /**
     * Returns headerName.
     * <p>
     * Field description:
     * SIP header name starting with &#x60;X-&#x60;. Example: &#x60;X-Identity&#x60;.
     * <p>
     * The field is required.
     *
     * @return headerName
     */
    @JsonProperty("headerName")
    public String getHeaderName() {
        return headerName;
    }

    /**
     * Sets headerName.
     * <p>
     * Field description:
     * SIP header name starting with &#x60;X-&#x60;. Example: &#x60;X-Identity&#x60;.
     * <p>
     * The field is required.
     *
     * @param headerName
     */
    @JsonProperty("headerName")
    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    /**
     * Sets headerValue.
     * <p>
     * Field description:
     * SIP header value or regular expression pattern representing the value. Examples: &#x60;john.doe&#x60;, &#x60;john(.+)&#x60;.
     *
     * @param headerValue
     * @return This {@link CallRoutingSipHeader instance}.
     */
    public CallRoutingSipHeader headerValue(String headerValue) {
        this.headerValue = headerValue;
        return this;
    }

    /**
     * Returns headerValue.
     * <p>
     * Field description:
     * SIP header value or regular expression pattern representing the value. Examples: &#x60;john.doe&#x60;, &#x60;john(.+)&#x60;.
     *
     * @return headerValue
     */
    @JsonProperty("headerValue")
    public String getHeaderValue() {
        return headerValue;
    }

    /**
     * Sets headerValue.
     * <p>
     * Field description:
     * SIP header value or regular expression pattern representing the value. Examples: &#x60;john.doe&#x60;, &#x60;john(.+)&#x60;.
     *
     * @param headerValue
     */
    @JsonProperty("headerValue")
    public void setHeaderValue(String headerValue) {
        this.headerValue = headerValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingSipHeader callRoutingSipHeader = (CallRoutingSipHeader) o;
        return Objects.equals(this.headerName, callRoutingSipHeader.headerName)
                && Objects.equals(this.headerValue, callRoutingSipHeader.headerValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headerName, headerValue);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingSipHeader {")
                .append(newLine)
                .append("    headerName: ")
                .append(toIndentedString(headerName))
                .append(newLine)
                .append("    headerValue: ")
                .append(toIndentedString(headerValue))
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
