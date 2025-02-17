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
 * ---
 */
public class MmsDestinationGroup implements MmsDestination {

    private List<MmsDestinationSingle> group = new ArrayList<>();

    /**
     * Sets group.
     * <p>
     * Field description:
     * An array of destination objects for where messages are being sent. A valid destination is required.
     * <p>
     * The field is required.
     *
     * @param group
     * @return This {@link MmsDestinationGroup instance}.
     */
    public MmsDestinationGroup group(List<MmsDestinationSingle> group) {
        this.group = group;
        return this;
    }

    /**
     * Adds and item into group.
     * <p>
     * Field description:
     * An array of destination objects for where messages are being sent. A valid destination is required.
     * <p>
     * The field is required.
     *
     * @param groupItem The item to be added to the list.
     * @return This {@link MmsDestinationGroup instance}.
     */
    public MmsDestinationGroup addGroupItem(MmsDestinationSingle groupItem) {
        if (this.group == null) {
            this.group = new ArrayList<>();
        }
        this.group.add(groupItem);
        return this;
    }

    /**
     * Returns group.
     * <p>
     * Field description:
     * An array of destination objects for where messages are being sent. A valid destination is required.
     * <p>
     * The field is required.
     *
     * @return group
     */
    @JsonProperty("group")
    public List<MmsDestinationSingle> getGroup() {
        return group;
    }

    /**
     * Sets group.
     * <p>
     * Field description:
     * An array of destination objects for where messages are being sent. A valid destination is required.
     * <p>
     * The field is required.
     *
     * @param group
     */
    @JsonProperty("group")
    public void setGroup(List<MmsDestinationSingle> group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MmsDestinationGroup mmsDestinationGroup = (MmsDestinationGroup) o;
        return Objects.equals(this.group, mmsDestinationGroup.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsDestinationGroup {")
                .append(newLine)
                .append("    group: ")
                .append(toIndentedString(group))
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
