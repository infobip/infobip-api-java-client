/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import java.util.Objects;

/**
 * Key value pairs that will be replaced during message sending in a header. Valid example &#x60;{\&quot;1\&quot;: \&quot;John\&quot;, \&quot;2\&quot;: \&quot;Smith\&quot;, \&quot;type\&quot;: \&quot;TEXT\&quot;}&#x60;
 */
public class MessagesApiTemplateTextHeader extends MessagesApiTemplateHeader {

    /**
     * Constructs a new {@link MessagesApiTemplateTextHeader} instance.
     */
    public MessagesApiTemplateTextHeader() {
        super("TEXT");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiTemplateTextHeader {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
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
