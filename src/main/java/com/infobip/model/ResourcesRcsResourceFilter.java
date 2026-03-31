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
 * RCS filter for resources.
 */
public class ResourcesRcsResourceFilter extends ResourcesIbResourcesFilter {

    private String senderName;

    /**
     * Constructs a new {@link ResourcesRcsResourceFilter} instance.
     */
    public ResourcesRcsResourceFilter() {
        super("RCS_RESOURCE");
    }

    /**
     * Sets senderName.
     * <p>
     * Field description:
     * Sender name.
     *
     * @param senderName
     * @return This {@link ResourcesRcsResourceFilter instance}.
     */
    public ResourcesRcsResourceFilter senderName(String senderName) {
        this.senderName = senderName;
        return this;
    }

    /**
     * Returns senderName.
     * <p>
     * Field description:
     * Sender name.
     *
     * @return senderName
     */
    @JsonProperty("senderName")
    public String getSenderName() {
        return senderName;
    }

    /**
     * Sets senderName.
     * <p>
     * Field description:
     * Sender name.
     *
     * @param senderName
     */
    @JsonProperty("senderName")
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesRcsResourceFilter resourcesRcsResourceFilter = (ResourcesRcsResourceFilter) o;
        return Objects.equals(this.senderName, resourcesRcsResourceFilter.senderName) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(senderName, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesRcsResourceFilter {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    senderName: ")
                .append(toIndentedString(senderName))
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
