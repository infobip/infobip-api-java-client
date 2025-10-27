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
 * Represents CallsAdvisorRole model.
 */
public class CallsAdvisorRole extends CallsRole {

    private List<String> advise = new ArrayList<>();

    /**
     * Constructs a new {@link CallsAdvisorRole} instance.
     */
    public CallsAdvisorRole() {
        super("ADVISOR");
    }

    /**
     * Sets advise.
     * <p>
     * Field description:
     * List of call IDs that can hear (and see) this advisor.
     * <p>
     * The field is required.
     *
     * @param advise
     * @return This {@link CallsAdvisorRole instance}.
     */
    public CallsAdvisorRole advise(List<String> advise) {
        this.advise = advise;
        return this;
    }

    /**
     * Adds and item into advise.
     * <p>
     * Field description:
     * List of call IDs that can hear (and see) this advisor.
     * <p>
     * The field is required.
     *
     * @param adviseItem The item to be added to the list.
     * @return This {@link CallsAdvisorRole instance}.
     */
    public CallsAdvisorRole addAdviseItem(String adviseItem) {
        if (this.advise == null) {
            this.advise = new ArrayList<>();
        }
        this.advise.add(adviseItem);
        return this;
    }

    /**
     * Returns advise.
     * <p>
     * Field description:
     * List of call IDs that can hear (and see) this advisor.
     * <p>
     * The field is required.
     *
     * @return advise
     */
    @JsonProperty("advise")
    public List<String> getAdvise() {
        return advise;
    }

    /**
     * Sets advise.
     * <p>
     * Field description:
     * List of call IDs that can hear (and see) this advisor.
     * <p>
     * The field is required.
     *
     * @param advise
     */
    @JsonProperty("advise")
    public void setAdvise(List<String> advise) {
        this.advise = advise;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsAdvisorRole callsAdvisorRole = (CallsAdvisorRole) o;
        return Objects.equals(this.advise, callsAdvisorRole.advise) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(advise, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsAdvisorRole {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    advise: ")
                .append(toIndentedString(advise))
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
