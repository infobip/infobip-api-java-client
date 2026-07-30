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
 * Represents NumberLookupQueryRequest model.
 */
public class NumberLookupQueryRequest {

    private List<String> to = new ArrayList<>();

    /**
     * Sets to.
     * <p>
     * Field description:
     * Array of phone numbers to look up. Numbers must be in international format (Example: &#x60;41793026727&#x60;). Numbers longer than 256 characters in the request will be clipped during processing. The clipped numbers will be included in the response, reports, and logs.
     * <p>
     * The field is required.
     *
     * @param to
     * @return This {@link NumberLookupQueryRequest instance}.
     */
    public NumberLookupQueryRequest to(List<String> to) {
        this.to = to;
        return this;
    }

    /**
     * Adds and item into to.
     * <p>
     * Field description:
     * Array of phone numbers to look up. Numbers must be in international format (Example: &#x60;41793026727&#x60;). Numbers longer than 256 characters in the request will be clipped during processing. The clipped numbers will be included in the response, reports, and logs.
     * <p>
     * The field is required.
     *
     * @param toItem The item to be added to the list.
     * @return This {@link NumberLookupQueryRequest instance}.
     */
    public NumberLookupQueryRequest addToItem(String toItem) {
        if (this.to == null) {
            this.to = new ArrayList<>();
        }
        this.to.add(toItem);
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Array of phone numbers to look up. Numbers must be in international format (Example: &#x60;41793026727&#x60;). Numbers longer than 256 characters in the request will be clipped during processing. The clipped numbers will be included in the response, reports, and logs.
     * <p>
     * The field is required.
     *
     * @return to
     */
    @JsonProperty("to")
    public List<String> getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Array of phone numbers to look up. Numbers must be in international format (Example: &#x60;41793026727&#x60;). Numbers longer than 256 characters in the request will be clipped during processing. The clipped numbers will be included in the response, reports, and logs.
     * <p>
     * The field is required.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(List<String> to) {
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumberLookupQueryRequest numberLookupQueryRequest = (NumberLookupQueryRequest) o;
        return Objects.equals(this.to, numberLookupQueryRequest.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumberLookupQueryRequest {")
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
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
