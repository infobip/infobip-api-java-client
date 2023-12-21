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
 * List of criteria that should match route. For a route to match, any criterion should be met.
 */
public class CallRoutingSearchCriteria {

    private String to;

    private CallRoutingCriteria value;

    /**
     * Sets to.
     * <p>
     * Field description:
     * Number regex used to match criteria.
     *
     * @param to
     * @return This {@link CallRoutingSearchCriteria instance}.
     */
    public CallRoutingSearchCriteria to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Number regex used to match criteria.
     *
     * @return to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Number regex used to match criteria.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets value.
     *
     * @param value
     * @return This {@link CallRoutingSearchCriteria instance}.
     */
    public CallRoutingSearchCriteria value(CallRoutingCriteria value) {
        this.value = value;
        return this;
    }

    /**
     * Returns value.
     *
     * @return value
     */
    @JsonProperty("value")
    public CallRoutingCriteria getValue() {
        return value;
    }

    /**
     * Sets value.
     *
     * @param value
     */
    @JsonProperty("value")
    public void setValue(CallRoutingCriteria value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingSearchCriteria callRoutingSearchCriteria = (CallRoutingSearchCriteria) o;
        return Objects.equals(this.to, callRoutingSearchCriteria.to)
                && Objects.equals(this.value, callRoutingSearchCriteria.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, value);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingSearchCriteria {")
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    value: ")
                .append(toIndentedString(value))
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
