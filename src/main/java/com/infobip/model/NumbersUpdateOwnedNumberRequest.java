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
 * Represents NumbersUpdateOwnedNumberRequest model.
 */
public class NumbersUpdateOwnedNumberRequest {

    private String applicationId;

    private String entityId;

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * ID of the Application that would be associated with the number.
     * <p>
     * The field is required.
     *
     * @param applicationId
     * @return This {@link NumbersUpdateOwnedNumberRequest instance}.
     */
    public NumbersUpdateOwnedNumberRequest applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * ID of the Application that would be associated with the number.
     * <p>
     * The field is required.
     *
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * ID of the Application that would be associated with the number.
     * <p>
     * The field is required.
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * ID of the Entity that would be associated with the number.
     *
     * @param entityId
     * @return This {@link NumbersUpdateOwnedNumberRequest instance}.
     */
    public NumbersUpdateOwnedNumberRequest entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     * <p>
     * Field description:
     * ID of the Entity that would be associated with the number.
     *
     * @return entityId
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * ID of the Entity that would be associated with the number.
     *
     * @param entityId
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersUpdateOwnedNumberRequest numbersUpdateOwnedNumberRequest = (NumbersUpdateOwnedNumberRequest) o;
        return Objects.equals(this.applicationId, numbersUpdateOwnedNumberRequest.applicationId)
                && Objects.equals(this.entityId, numbersUpdateOwnedNumberRequest.entityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, entityId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersUpdateOwnedNumberRequest {")
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    entityId: ")
                .append(toIndentedString(entityId))
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
