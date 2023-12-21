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
 * Represents CallsRegionList model.
 */
public class CallsRegionList {

    private List<CallsPublicRegion> regions = null;

    /**
     * Sets regions.
     * <p>
     * Field description:
     * List of regions.
     *
     * @param regions
     * @return This {@link CallsRegionList instance}.
     */
    public CallsRegionList regions(List<CallsPublicRegion> regions) {
        this.regions = regions;
        return this;
    }

    /**
     * Adds and item into regions.
     * <p>
     * Field description:
     * List of regions.
     *
     * @param regionsItem The item to be added to the list.
     * @return This {@link CallsRegionList instance}.
     */
    public CallsRegionList addRegionsItem(CallsPublicRegion regionsItem) {
        if (this.regions == null) {
            this.regions = new ArrayList<>();
        }
        this.regions.add(regionsItem);
        return this;
    }

    /**
     * Returns regions.
     * <p>
     * Field description:
     * List of regions.
     *
     * @return regions
     */
    @JsonProperty("regions")
    public List<CallsPublicRegion> getRegions() {
        return regions;
    }

    /**
     * Sets regions.
     * <p>
     * Field description:
     * List of regions.
     *
     * @param regions
     */
    @JsonProperty("regions")
    public void setRegions(List<CallsPublicRegion> regions) {
        this.regions = regions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsRegionList callsRegionList = (CallsRegionList) o;
        return Objects.equals(this.regions, callsRegionList.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regions);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsRegionList {")
                .append(newLine)
                .append("    regions: ")
                .append(toIndentedString(regions))
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
