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
 * Represents EmailDomainIpPoolUpdateApiRequest model.
 */
public class EmailDomainIpPoolUpdateApiRequest {

    private Integer priority;

    /**
     * Sets priority.
     * <p>
     * Field description:
     * IP pool sending priority.
     * <p>
     * The field is required.
     *
     * @param priority
     * @return This {@link EmailDomainIpPoolUpdateApiRequest instance}.
     */
    public EmailDomainIpPoolUpdateApiRequest priority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Returns priority.
     * <p>
     * Field description:
     * IP pool sending priority.
     * <p>
     * The field is required.
     *
     * @return priority
     */
    @JsonProperty("priority")
    public Integer getPriority() {
        return priority;
    }

    /**
     * Sets priority.
     * <p>
     * Field description:
     * IP pool sending priority.
     * <p>
     * The field is required.
     *
     * @param priority
     */
    @JsonProperty("priority")
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailDomainIpPoolUpdateApiRequest emailDomainIpPoolUpdateApiRequest = (EmailDomainIpPoolUpdateApiRequest) o;
        return Objects.equals(this.priority, emailDomainIpPoolUpdateApiRequest.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailDomainIpPoolUpdateApiRequest {")
                .append(newLine)
                .append("    priority: ")
                .append(toIndentedString(priority))
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
