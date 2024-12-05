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
 * Paging response.
 */
public class EmailPageDetails {

    private Integer page;

    private Integer size;

    /**
     * Sets page.
     * <p>
     * Field description:
     * Requested page number.
     * <p>
     * The field is required.
     *
     * @param page
     * @return This {@link EmailPageDetails instance}.
     */
    public EmailPageDetails page(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * Returns page.
     * <p>
     * Field description:
     * Requested page number.
     * <p>
     * The field is required.
     *
     * @return page
     */
    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    /**
     * Sets page.
     * <p>
     * Field description:
     * Requested page number.
     * <p>
     * The field is required.
     *
     * @param page
     */
    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * Sets size.
     * <p>
     * Field description:
     * Requested page size.
     * <p>
     * The field is required.
     *
     * @param size
     * @return This {@link EmailPageDetails instance}.
     */
    public EmailPageDetails size(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * Returns size.
     * <p>
     * Field description:
     * Requested page size.
     * <p>
     * The field is required.
     *
     * @return size
     */
    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    /**
     * Sets size.
     * <p>
     * Field description:
     * Requested page size.
     * <p>
     * The field is required.
     *
     * @param size
     */
    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailPageDetails emailPageDetails = (EmailPageDetails) o;
        return Objects.equals(this.page, emailPageDetails.page) && Objects.equals(this.size, emailPageDetails.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, size);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailPageDetails {")
                .append(newLine)
                .append("    page: ")
                .append(toIndentedString(page))
                .append(newLine)
                .append("    size: ")
                .append(toIndentedString(size))
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
