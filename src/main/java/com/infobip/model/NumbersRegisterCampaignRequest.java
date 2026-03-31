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
import java.util.UUID;

/**
 * Represents NumbersRegisterCampaignRequest model.
 */
public class NumbersRegisterCampaignRequest {

    private UUID priorityId;

    /**
     * Sets priorityId.
     * <p>
     * Field description:
     * The ID of the campaign priority you would like to use.
     *
     * @param priorityId
     * @return This {@link NumbersRegisterCampaignRequest instance}.
     */
    public NumbersRegisterCampaignRequest priorityId(UUID priorityId) {
        this.priorityId = priorityId;
        return this;
    }

    /**
     * Returns priorityId.
     * <p>
     * Field description:
     * The ID of the campaign priority you would like to use.
     *
     * @return priorityId
     */
    @JsonProperty("priorityId")
    public UUID getPriorityId() {
        return priorityId;
    }

    /**
     * Sets priorityId.
     * <p>
     * Field description:
     * The ID of the campaign priority you would like to use.
     *
     * @param priorityId
     */
    @JsonProperty("priorityId")
    public void setPriorityId(UUID priorityId) {
        this.priorityId = priorityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersRegisterCampaignRequest numbersRegisterCampaignRequest = (NumbersRegisterCampaignRequest) o;
        return Objects.equals(this.priorityId, numbersRegisterCampaignRequest.priorityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priorityId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersRegisterCampaignRequest {")
                .append(newLine)
                .append("    priorityId: ")
                .append(toIndentedString(priorityId))
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
