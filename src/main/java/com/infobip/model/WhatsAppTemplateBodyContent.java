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
 * Template body.
 */
public class WhatsAppTemplateBodyContent {

    private List<String> placeholders = new ArrayList<>();

    /**
     * Sets placeholders.
     * <p>
     * Field description:
     * Template&#39;s parameter values submitted in the same order as in the registered template. The value must not be null, but it can be an empty array, if the template was registered without placeholders. Values within the array must not be null or empty.
     * <p>
     * The field is required.
     *
     * @param placeholders
     * @return This {@link WhatsAppTemplateBodyContent instance}.
     */
    public WhatsAppTemplateBodyContent placeholders(List<String> placeholders) {
        this.placeholders = placeholders;
        return this;
    }

    /**
     * Adds and item into placeholders.
     * <p>
     * Field description:
     * Template&#39;s parameter values submitted in the same order as in the registered template. The value must not be null, but it can be an empty array, if the template was registered without placeholders. Values within the array must not be null or empty.
     * <p>
     * The field is required.
     *
     * @param placeholdersItem The item to be added to the list.
     * @return This {@link WhatsAppTemplateBodyContent instance}.
     */
    public WhatsAppTemplateBodyContent addPlaceholdersItem(String placeholdersItem) {
        if (this.placeholders == null) {
            this.placeholders = new ArrayList<>();
        }
        this.placeholders.add(placeholdersItem);
        return this;
    }

    /**
     * Returns placeholders.
     * <p>
     * Field description:
     * Template&#39;s parameter values submitted in the same order as in the registered template. The value must not be null, but it can be an empty array, if the template was registered without placeholders. Values within the array must not be null or empty.
     * <p>
     * The field is required.
     *
     * @return placeholders
     */
    @JsonProperty("placeholders")
    public List<String> getPlaceholders() {
        return placeholders;
    }

    /**
     * Sets placeholders.
     * <p>
     * Field description:
     * Template&#39;s parameter values submitted in the same order as in the registered template. The value must not be null, but it can be an empty array, if the template was registered without placeholders. Values within the array must not be null or empty.
     * <p>
     * The field is required.
     *
     * @param placeholders
     */
    @JsonProperty("placeholders")
    public void setPlaceholders(List<String> placeholders) {
        this.placeholders = placeholders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppTemplateBodyContent whatsAppTemplateBodyContent = (WhatsAppTemplateBodyContent) o;
        return Objects.equals(this.placeholders, whatsAppTemplateBodyContent.placeholders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(placeholders);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateBodyContent {")
                .append(newLine)
                .append("    placeholders: ")
                .append(toIndentedString(placeholders))
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
