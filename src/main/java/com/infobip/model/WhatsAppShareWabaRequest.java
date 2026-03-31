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
 * Represents WhatsAppShareWabaRequest model.
 */
public class WhatsAppShareWabaRequest {

    private Long businessAccountId;

    /**
     * Sets businessAccountId.
     * <p>
     * The field is required.
     *
     * @param businessAccountId
     * @return This {@link WhatsAppShareWabaRequest instance}.
     */
    public WhatsAppShareWabaRequest businessAccountId(Long businessAccountId) {
        this.businessAccountId = businessAccountId;
        return this;
    }

    /**
     * Returns businessAccountId.
     * <p>
     * The field is required.
     *
     * @return businessAccountId
     */
    @JsonProperty("businessAccountId")
    public Long getBusinessAccountId() {
        return businessAccountId;
    }

    /**
     * Sets businessAccountId.
     * <p>
     * The field is required.
     *
     * @param businessAccountId
     */
    @JsonProperty("businessAccountId")
    public void setBusinessAccountId(Long businessAccountId) {
        this.businessAccountId = businessAccountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppShareWabaRequest whatsAppShareWabaRequest = (WhatsAppShareWabaRequest) o;
        return Objects.equals(this.businessAccountId, whatsAppShareWabaRequest.businessAccountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(businessAccountId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppShareWabaRequest {")
                .append(newLine)
                .append("    businessAccountId: ")
                .append(toIndentedString(businessAccountId))
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
