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
 * Represents WhatsAppUrlButtonApiData model.
 */
public class WhatsAppUrlButtonApiData extends WhatsAppButtonApiData {

    private String text;

    private String url;

    private String example;

    /**
     * Constructs a new {@link WhatsAppUrlButtonApiData} instance.
     */
    public WhatsAppUrlButtonApiData() {
        super("URL");
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Button text.
     * <p>
     * The field is required.
     *
     * @param text
     * @return This {@link WhatsAppUrlButtonApiData instance}.
     */
    public WhatsAppUrlButtonApiData text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Button text.
     * <p>
     * The field is required.
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
     * Button text.
     * <p>
     * The field is required.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL to which the end-user will be directed when hitting the button. URL is expected to start with &#x60;https://&#x60; or &#x60;http://&#x60;. Can be static or dynamic. For dynamic URL registration, add a placeholder {{1}} at the end of the link. Example: &#x60;https://www.infobip.com/{{1}}&#x60;.
     * <p>
     * The field is required.
     *
     * @param url
     * @return This {@link WhatsAppUrlButtonApiData instance}.
     */
    public WhatsAppUrlButtonApiData url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * URL to which the end-user will be directed when hitting the button. URL is expected to start with &#x60;https://&#x60; or &#x60;http://&#x60;. Can be static or dynamic. For dynamic URL registration, add a placeholder {{1}} at the end of the link. Example: &#x60;https://www.infobip.com/{{1}}&#x60;.
     * <p>
     * The field is required.
     *
     * @return url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * URL to which the end-user will be directed when hitting the button. URL is expected to start with &#x60;https://&#x60; or &#x60;http://&#x60;. Can be static or dynamic. For dynamic URL registration, add a placeholder {{1}} at the end of the link. Example: &#x60;https://www.infobip.com/{{1}}&#x60;.
     * <p>
     * The field is required.
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Sets example.
     * <p>
     * Field description:
     * An example of a URL a user could use. Should be a valid URL that starts with &#x60;https://&#x60; or &#x60;http://&#x60;. Cannot contain placeholders.
     *
     * @param example
     * @return This {@link WhatsAppUrlButtonApiData instance}.
     */
    public WhatsAppUrlButtonApiData example(String example) {
        this.example = example;
        return this;
    }

    /**
     * Returns example.
     * <p>
     * Field description:
     * An example of a URL a user could use. Should be a valid URL that starts with &#x60;https://&#x60; or &#x60;http://&#x60;. Cannot contain placeholders.
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
     * An example of a URL a user could use. Should be a valid URL that starts with &#x60;https://&#x60; or &#x60;http://&#x60;. Cannot contain placeholders.
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
        WhatsAppUrlButtonApiData whatsAppUrlButtonApiData = (WhatsAppUrlButtonApiData) o;
        return Objects.equals(this.text, whatsAppUrlButtonApiData.text)
                && Objects.equals(this.url, whatsAppUrlButtonApiData.url)
                && Objects.equals(this.example, whatsAppUrlButtonApiData.example)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, url, example, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppUrlButtonApiData {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
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
