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
 * Represents CallRoutingPhoneCriteria model.
 */
public class CallRoutingPhoneCriteria extends CallRoutingCriteria {

    private String from;

    /**
     * Constructs a new {@link CallRoutingPhoneCriteria} instance.
     */
    public CallRoutingPhoneCriteria() {
        super("PHONE");
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Number regex used to match criteria.
     *
     * @param from
     * @return This {@link CallRoutingPhoneCriteria instance}.
     */
    public CallRoutingPhoneCriteria from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Number regex used to match criteria.
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
     * Number regex used to match criteria.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingPhoneCriteria callRoutingPhoneCriteria = (CallRoutingPhoneCriteria) o;
        return Objects.equals(this.from, callRoutingPhoneCriteria.from) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingPhoneCriteria {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
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
