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
 * Represents ResourcesAppleMbMoHttpForwardDocs model.
 */
public class ResourcesAppleMbMoHttpForwardDocs extends ResourcesAppleMbMoActionDocs {

    private String url;

    private String format;

    /**
     * Constructs a new {@link ResourcesAppleMbMoHttpForwardDocs} instance.
     */
    public ResourcesAppleMbMoHttpForwardDocs() {
        super("HTTP_FORWARD");
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * Specifies URL where message will be pushed.
     * <p>
     * The field is required.
     *
     * @param url
     * @return This {@link ResourcesAppleMbMoHttpForwardDocs instance}.
     */
    public ResourcesAppleMbMoHttpForwardDocs url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * Specifies URL where message will be pushed.
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
     * Specifies URL where message will be pushed.
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
     * Sets format.
     * <p>
     * Field description:
     * Specifies pushed content format.
     *
     * @param format
     * @return This {@link ResourcesAppleMbMoHttpForwardDocs instance}.
     */
    public ResourcesAppleMbMoHttpForwardDocs format(String format) {
        this.format = format;
        return this;
    }

    /**
     * Returns format.
     * <p>
     * Field description:
     * Specifies pushed content format.
     *
     * @return format
     */
    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    /**
     * Sets format.
     * <p>
     * Field description:
     * Specifies pushed content format.
     *
     * @param format
     */
    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesAppleMbMoHttpForwardDocs resourcesAppleMbMoHttpForwardDocs = (ResourcesAppleMbMoHttpForwardDocs) o;
        return Objects.equals(this.url, resourcesAppleMbMoHttpForwardDocs.url)
                && Objects.equals(this.format, resourcesAppleMbMoHttpForwardDocs.format)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, format, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesAppleMbMoHttpForwardDocs {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
                .append(newLine)
                .append("    format: ")
                .append(toIndentedString(format))
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
