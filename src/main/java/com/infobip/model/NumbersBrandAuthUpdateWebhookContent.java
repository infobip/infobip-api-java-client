/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import java.util.UUID;

/**
 * Event content.
 */
public class NumbersBrandAuthUpdateWebhookContent {

    private UUID brandId;

    /**
     * The new brand auth 2FA update.
     */
    public enum BrandAuthUpdateEnum {
        SEND("BRAND_EMAIL_2FA_SEND"),
        COMPLETE("BRAND_EMAIL_2FA_COMPLETE");

        private String value;

        BrandAuthUpdateEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BrandAuthUpdateEnum fromValue(String value) {
            for (BrandAuthUpdateEnum enumElement : BrandAuthUpdateEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private BrandAuthUpdateEnum brandAuthUpdate;

    /**
     * Sets brandId.
     * <p>
     * Field description:
     * The ID of the brand.
     *
     * @param brandId
     * @return This {@link NumbersBrandAuthUpdateWebhookContent instance}.
     */
    public NumbersBrandAuthUpdateWebhookContent brandId(UUID brandId) {
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
    public UUID getBrandId() {
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
    public void setBrandId(UUID brandId) {
        this.brandId = brandId;
    }

    /**
     * Sets brandAuthUpdate.
     * <p>
     * Field description:
     * The new brand auth 2FA update.
     *
     * @param brandAuthUpdate
     * @return This {@link NumbersBrandAuthUpdateWebhookContent instance}.
     */
    public NumbersBrandAuthUpdateWebhookContent brandAuthUpdate(BrandAuthUpdateEnum brandAuthUpdate) {
        this.brandAuthUpdate = brandAuthUpdate;
        return this;
    }

    /**
     * Returns brandAuthUpdate.
     * <p>
     * Field description:
     * The new brand auth 2FA update.
     *
     * @return brandAuthUpdate
     */
    @JsonProperty("brandAuthUpdate")
    public BrandAuthUpdateEnum getBrandAuthUpdate() {
        return brandAuthUpdate;
    }

    /**
     * Sets brandAuthUpdate.
     * <p>
     * Field description:
     * The new brand auth 2FA update.
     *
     * @param brandAuthUpdate
     */
    @JsonProperty("brandAuthUpdate")
    public void setBrandAuthUpdate(BrandAuthUpdateEnum brandAuthUpdate) {
        this.brandAuthUpdate = brandAuthUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersBrandAuthUpdateWebhookContent numbersBrandAuthUpdateWebhookContent =
                (NumbersBrandAuthUpdateWebhookContent) o;
        return Objects.equals(this.brandId, numbersBrandAuthUpdateWebhookContent.brandId)
                && Objects.equals(this.brandAuthUpdate, numbersBrandAuthUpdateWebhookContent.brandAuthUpdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandId, brandAuthUpdate);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersBrandAuthUpdateWebhookContent {")
                .append(newLine)
                .append("    brandId: ")
                .append(toIndentedString(brandId))
                .append(newLine)
                .append("    brandAuthUpdate: ")
                .append(toIndentedString(brandAuthUpdate))
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
