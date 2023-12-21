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
 * Represents WhatsAppCopyCodeButtonApiData model.
 */
public class WhatsAppCopyCodeButtonApiData extends WhatsAppAuthenticationButtonApiData {

    private String text;

    /**
     * Constructs a new {@link WhatsAppCopyCodeButtonApiData} instance.
     */
    public WhatsAppCopyCodeButtonApiData() {
        super("COPY_CODE");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Button text.  WhatsApp will use default value if not provided.
     *
     * @param text
     * @return This {@link WhatsAppCopyCodeButtonApiData instance}.
     */
    public WhatsAppCopyCodeButtonApiData text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Button text.  WhatsApp will use default value if not provided.
     *
     * @return text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Button text.  WhatsApp will use default value if not provided.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppCopyCodeButtonApiData whatsAppCopyCodeButtonApiData = (WhatsAppCopyCodeButtonApiData) o;
        return Objects.equals(this.text, whatsAppCopyCodeButtonApiData.text) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppCopyCodeButtonApiData {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
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
