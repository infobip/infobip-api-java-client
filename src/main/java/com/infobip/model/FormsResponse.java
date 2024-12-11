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
 * Represents FormsResponse model.
 */
public class FormsResponse {

    private List<FormsResponseContent> forms = new ArrayList<>();

    private Integer offset;

    private Integer limit;

    private Long total;

    /**
     * Sets forms.
     * <p>
     * Field description:
     * Forms list
     * <p>
     * The field is required.
     *
     * @param forms
     * @return This {@link FormsResponse instance}.
     */
    public FormsResponse forms(List<FormsResponseContent> forms) {
        this.forms = forms;
        return this;
    }

    /**
     * Adds and item into forms.
     * <p>
     * Field description:
     * Forms list
     * <p>
     * The field is required.
     *
     * @param formsItem The item to be added to the list.
     * @return This {@link FormsResponse instance}.
     */
    public FormsResponse addFormsItem(FormsResponseContent formsItem) {
        if (this.forms == null) {
            this.forms = new ArrayList<>();
        }
        this.forms.add(formsItem);
        return this;
    }

    /**
     * Returns forms.
     * <p>
     * Field description:
     * Forms list
     * <p>
     * The field is required.
     *
     * @return forms
     */
    @JsonProperty("forms")
    public List<FormsResponseContent> getForms() {
        return forms;
    }

    /**
     * Sets forms.
     * <p>
     * Field description:
     * Forms list
     * <p>
     * The field is required.
     *
     * @param forms
     */
    @JsonProperty("forms")
    public void setForms(List<FormsResponseContent> forms) {
        this.forms = forms;
    }

    /**
     * Sets offset.
     * <p>
     * Field description:
     * Offset from beginning of list of available forms
     *
     * @param offset
     * @return This {@link FormsResponse instance}.
     */
    public FormsResponse offset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Returns offset.
     * <p>
     * Field description:
     * Offset from beginning of list of available forms
     *
     * @return offset
     */
    @JsonProperty("offset")
    public Integer getOffset() {
        return offset;
    }

    /**
     * Sets offset.
     * <p>
     * Field description:
     * Offset from beginning of list of available forms
     *
     * @param offset
     */
    @JsonProperty("offset")
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * Sets limit.
     * <p>
     * Field description:
     * Number of returned forms
     *
     * @param limit
     * @return This {@link FormsResponse instance}.
     */
    public FormsResponse limit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Returns limit.
     * <p>
     * Field description:
     * Number of returned forms
     *
     * @return limit
     */
    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets limit.
     * <p>
     * Field description:
     * Number of returned forms
     *
     * @param limit
     */
    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * Sets total.
     * <p>
     * Field description:
     * Total number of available forms
     *
     * @param total
     * @return This {@link FormsResponse instance}.
     */
    public FormsResponse total(Long total) {
        this.total = total;
        return this;
    }

    /**
     * Returns total.
     * <p>
     * Field description:
     * Total number of available forms
     *
     * @return total
     */
    @JsonProperty("total")
    public Long getTotal() {
        return total;
    }

    /**
     * Sets total.
     * <p>
     * Field description:
     * Total number of available forms
     *
     * @param total
     */
    @JsonProperty("total")
    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FormsResponse formsResponse = (FormsResponse) o;
        return Objects.equals(this.forms, formsResponse.forms)
                && Objects.equals(this.offset, formsResponse.offset)
                && Objects.equals(this.limit, formsResponse.limit)
                && Objects.equals(this.total, formsResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(forms, offset, limit, total);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class FormsResponse {")
                .append(newLine)
                .append("    forms: ")
                .append(toIndentedString(forms))
                .append(newLine)
                .append("    offset: ")
                .append(toIndentedString(offset))
                .append(newLine)
                .append("    limit: ")
                .append(toIndentedString(limit))
                .append(newLine)
                .append("    total: ")
                .append(toIndentedString(total))
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
