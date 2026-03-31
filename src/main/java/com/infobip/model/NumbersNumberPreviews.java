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
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Represents NumbersNumberPreviews model.
 */
public class NumbersNumberPreviews {

    private Set<NumbersNumberPreview> numberPreviews = null;

    /**
     * Sets numberPreviews.
     *
     * @param numberPreviews
     * @return This {@link NumbersNumberPreviews instance}.
     */
    public NumbersNumberPreviews numberPreviews(Set<NumbersNumberPreview> numberPreviews) {
        this.numberPreviews = numberPreviews;
        return this;
    }

    /**
     * Adds and item into numberPreviews.
     *
     * @param numberPreviewsItem The item to be added to the list.
     * @return This {@link NumbersNumberPreviews instance}.
     */
    public NumbersNumberPreviews addNumberPreviewsItem(NumbersNumberPreview numberPreviewsItem) {
        if (this.numberPreviews == null) {
            this.numberPreviews = new LinkedHashSet<>();
        }
        this.numberPreviews.add(numberPreviewsItem);
        return this;
    }

    /**
     * Returns numberPreviews.
     *
     * @return numberPreviews
     */
    @JsonProperty("numberPreviews")
    public Set<NumbersNumberPreview> getNumberPreviews() {
        return numberPreviews;
    }

    /**
     * Sets numberPreviews.
     *
     * @param numberPreviews
     */
    @JsonProperty("numberPreviews")
    public void setNumberPreviews(Set<NumbersNumberPreview> numberPreviews) {
        this.numberPreviews = numberPreviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersNumberPreviews numbersNumberPreviews = (NumbersNumberPreviews) o;
        return Objects.equals(this.numberPreviews, numbersNumberPreviews.numberPreviews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberPreviews);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersNumberPreviews {")
                .append(newLine)
                .append("    numberPreviews: ")
                .append(toIndentedString(numberPreviews))
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
