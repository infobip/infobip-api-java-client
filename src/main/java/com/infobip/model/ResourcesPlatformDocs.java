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
 * Platform applicationId and entityId to apply to inbound messages that pair to this configuration. If not provided, or if set to default values (applicationId &#x3D; default and entityId &#x3D; null), values from the associated number/resource will be used.
 */
public class ResourcesPlatformDocs {

    private String applicationId;

    private String entityId;

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Platform applicationId.
     *
     * @param applicationId
     * @return This {@link ResourcesPlatformDocs instance}.
     */
    public ResourcesPlatformDocs applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * Platform applicationId.
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
     * Platform applicationId.
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
     * Platform entityId.
     *
     * @param entityId
     * @return This {@link ResourcesPlatformDocs instance}.
     */
    public ResourcesPlatformDocs entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     * <p>
     * Field description:
     * Platform entityId.
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
     * Platform entityId.
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
        ResourcesPlatformDocs resourcesPlatformDocs = (ResourcesPlatformDocs) o;
        return Objects.equals(this.applicationId, resourcesPlatformDocs.applicationId)
                && Objects.equals(this.entityId, resourcesPlatformDocs.entityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, entityId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesPlatformDocs {")
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
