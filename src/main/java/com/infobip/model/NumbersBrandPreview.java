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
 * The preview of brand details to use with the campaign. This property is read-only and ignored in POST/PUT calls.
 */
public class NumbersBrandPreview {

    private String brandId;

    private String brandName;

    private String website;

    /**
     * Sets brandId.
     * <p>
     * Field description:
     * The ID of the brand.
     *
     * @param brandId
     * @return This {@link NumbersBrandPreview instance}.
     */
    public NumbersBrandPreview brandId(String brandId) {
        this.brandId = brandId;
        return this;
    }

    /**
     * Returns brandId.
     * <p>
     * Field description:
     * The ID of the brand.
     *
     * @return brandId
     */
    @JsonProperty("brandId")
    public String getBrandId() {
        return brandId;
    }

    /**
     * Sets brandId.
     * <p>
     * Field description:
     * The ID of the brand.
     *
     * @param brandId
     */
    @JsonProperty("brandId")
    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    /**
     * Sets brandName.
     * <p>
     * Field description:
     * The name of the brand.
     *
     * @param brandName
     * @return This {@link NumbersBrandPreview instance}.
     */
    public NumbersBrandPreview brandName(String brandName) {
        this.brandName = brandName;
        return this;
    }

    /**
     * Returns brandName.
     * <p>
     * Field description:
     * The name of the brand.
     *
     * @return brandName
     */
    @JsonProperty("brandName")
    public String getBrandName() {
        return brandName;
    }

    /**
     * Sets brandName.
     * <p>
     * Field description:
     * The name of the brand.
     *
     * @param brandName
     */
    @JsonProperty("brandName")
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * Sets website.
     * <p>
     * Field description:
     * The website for the brand.
     *
     * @param website
     * @return This {@link NumbersBrandPreview instance}.
     */
    public NumbersBrandPreview website(String website) {
        this.website = website;
        return this;
    }

    /**
     * Returns website.
     * <p>
     * Field description:
     * The website for the brand.
     *
     * @return website
     */
    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    /**
     * Sets website.
     * <p>
     * Field description:
     * The website for the brand.
     *
     * @param website
     */
    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersBrandPreview numbersBrandPreview = (NumbersBrandPreview) o;
        return Objects.equals(this.brandId, numbersBrandPreview.brandId)
                && Objects.equals(this.brandName, numbersBrandPreview.brandName)
                && Objects.equals(this.website, numbersBrandPreview.website);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandId, brandName, website);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersBrandPreview {")
                .append(newLine)
                .append("    brandId: ")
                .append(toIndentedString(brandId))
                .append(newLine)
                .append("    brandName: ")
                .append(toIndentedString(brandName))
                .append(newLine)
                .append("    website: ")
                .append(toIndentedString(website))
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
