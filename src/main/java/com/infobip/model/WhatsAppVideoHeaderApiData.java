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
 * Represents WhatsAppVideoHeaderApiData model.
 */
public class WhatsAppVideoHeaderApiData extends WhatsAppHeaderApiData {

    private String example;

    /**
     * Constructs a new {@link WhatsAppVideoHeaderApiData} instance.
     */
    public WhatsAppVideoHeaderApiData() {
        super("VIDEO");
    }

    /**
     * Sets example.
     * <p>
     * Field description:
     * An example of a template header video a user could use. Should be a valid URL that starts with &#x60;http&#x60; or &#x60;https&#x60;. Supported video type is &#x60;MP4&#x60;. Maximum video size is 16MB. Cannot contain placeholders.
     *
     * @param example
     * @return This {@link WhatsAppVideoHeaderApiData instance}.
     */
    public WhatsAppVideoHeaderApiData example(String example) {
        this.example = example;
        return this;
    }

    /**
     * Returns example.
     * <p>
     * Field description:
     * An example of a template header video a user could use. Should be a valid URL that starts with &#x60;http&#x60; or &#x60;https&#x60;. Supported video type is &#x60;MP4&#x60;. Maximum video size is 16MB. Cannot contain placeholders.
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
     * An example of a template header video a user could use. Should be a valid URL that starts with &#x60;http&#x60; or &#x60;https&#x60;. Supported video type is &#x60;MP4&#x60;. Maximum video size is 16MB. Cannot contain placeholders.
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
        WhatsAppVideoHeaderApiData whatsAppVideoHeaderApiData = (WhatsAppVideoHeaderApiData) o;
        return Objects.equals(this.example, whatsAppVideoHeaderApiData.example) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(example, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppVideoHeaderApiData {")
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
