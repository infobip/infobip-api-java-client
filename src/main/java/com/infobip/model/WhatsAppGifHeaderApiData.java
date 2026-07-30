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
 * Represents WhatsAppGifHeaderApiData model.
 */
public class WhatsAppGifHeaderApiData extends WhatsAppHeaderApiData {

    private String example;

    /**
     * Constructs a new {@link WhatsAppGifHeaderApiData} instance.
     */
    public WhatsAppGifHeaderApiData() {
        super("GIF");
    }

    /**
     * Sets example.
     * <p>
     * Field description:
     * An example of a template header GIF a user could use. Should be a valid URL that starts with &#x60;http&#x60; or &#x60;https&#x60;. Supported type is &#x60;MP4&#x60;. Maximum size is 3.5MB. Cannot contain placeholders. Only available for MM API (Marketing Messages).
     *
     * @param example
     * @return This {@link WhatsAppGifHeaderApiData instance}.
     */
    public WhatsAppGifHeaderApiData example(String example) {
        this.example = example;
        return this;
    }

    /**
     * Returns example.
     * <p>
     * Field description:
     * An example of a template header GIF a user could use. Should be a valid URL that starts with &#x60;http&#x60; or &#x60;https&#x60;. Supported type is &#x60;MP4&#x60;. Maximum size is 3.5MB. Cannot contain placeholders. Only available for MM API (Marketing Messages).
     *
     * @return example
     */
    @JsonProperty("example")
    public String getExample() {
        return example;
    }

    /**
     * Sets example.
     * <p>
     * Field description:
     * An example of a template header GIF a user could use. Should be a valid URL that starts with &#x60;http&#x60; or &#x60;https&#x60;. Supported type is &#x60;MP4&#x60;. Maximum size is 3.5MB. Cannot contain placeholders. Only available for MM API (Marketing Messages).
     *
     * @param example
     */
    @JsonProperty("example")
    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppGifHeaderApiData whatsAppGifHeaderApiData = (WhatsAppGifHeaderApiData) o;
        return Objects.equals(this.example, whatsAppGifHeaderApiData.example) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(example, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppGifHeaderApiData {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    example: ")
                .append(toIndentedString(example))
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
