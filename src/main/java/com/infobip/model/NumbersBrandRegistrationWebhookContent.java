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
import java.util.UUID;

/**
 * Event content.
 */
public class NumbersBrandRegistrationWebhookContent {

    private UUID brandId;

    private NumbersWebhookBrandRegistrationStatus brandStatus;

    private List<String> rejectionReasons = null;

    /**
     * Sets brandId.
     * <p>
     * Field description:
     * The ID of the brand.
     *
     * @param brandId
     * @return This {@link NumbersBrandRegistrationWebhookContent instance}.
     */
    public NumbersBrandRegistrationWebhookContent brandId(UUID brandId) {
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
     * Sets brandStatus.
     *
     * @param brandStatus
     * @return This {@link NumbersBrandRegistrationWebhookContent instance}.
     */
    public NumbersBrandRegistrationWebhookContent brandStatus(NumbersWebhookBrandRegistrationStatus brandStatus) {
        this.brandStatus = brandStatus;
        return this;
    }

    /**
     * Returns brandStatus.
     *
     * @return brandStatus
     */
    @JsonProperty("brandStatus")
    public NumbersWebhookBrandRegistrationStatus getBrandStatus() {
        return brandStatus;
    }

    /**
     * Sets brandStatus.
     *
     * @param brandStatus
     */
    @JsonProperty("brandStatus")
    public void setBrandStatus(NumbersWebhookBrandRegistrationStatus brandStatus) {
        this.brandStatus = brandStatus;
    }

    /**
     * Sets rejectionReasons.
     * <p>
     * Field description:
     * The rejection reasons. This field is present only when brand registration status is &#39;FAILURE&#39;.
     *
     * @param rejectionReasons
     * @return This {@link NumbersBrandRegistrationWebhookContent instance}.
     */
    public NumbersBrandRegistrationWebhookContent rejectionReasons(List<String> rejectionReasons) {
        this.rejectionReasons = rejectionReasons;
        return this;
    }

    /**
     * Adds and item into rejectionReasons.
     * <p>
     * Field description:
     * The rejection reasons. This field is present only when brand registration status is &#39;FAILURE&#39;.
     *
     * @param rejectionReasonsItem The item to be added to the list.
     * @return This {@link NumbersBrandRegistrationWebhookContent instance}.
     */
    public NumbersBrandRegistrationWebhookContent addRejectionReasonsItem(String rejectionReasonsItem) {
        if (this.rejectionReasons == null) {
            this.rejectionReasons = new ArrayList<>();
        }
        this.rejectionReasons.add(rejectionReasonsItem);
        return this;
    }

    /**
     * Returns rejectionReasons.
     * <p>
     * Field description:
     * The rejection reasons. This field is present only when brand registration status is &#39;FAILURE&#39;.
     *
     * @return rejectionReasons
     */
    @JsonProperty("rejectionReasons")
    public List<String> getRejectionReasons() {
        return rejectionReasons;
    }

    /**
     * Sets rejectionReasons.
     * <p>
     * Field description:
     * The rejection reasons. This field is present only when brand registration status is &#39;FAILURE&#39;.
     *
     * @param rejectionReasons
     */
    @JsonProperty("rejectionReasons")
    public void setRejectionReasons(List<String> rejectionReasons) {
        this.rejectionReasons = rejectionReasons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersBrandRegistrationWebhookContent numbersBrandRegistrationWebhookContent =
                (NumbersBrandRegistrationWebhookContent) o;
        return Objects.equals(this.brandId, numbersBrandRegistrationWebhookContent.brandId)
                && Objects.equals(this.brandStatus, numbersBrandRegistrationWebhookContent.brandStatus)
                && Objects.equals(this.rejectionReasons, numbersBrandRegistrationWebhookContent.rejectionReasons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandId, brandStatus, rejectionReasons);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersBrandRegistrationWebhookContent {")
                .append(newLine)
                .append("    brandId: ")
                .append(toIndentedString(brandId))
                .append(newLine)
                .append("    brandStatus: ")
                .append(toIndentedString(brandStatus))
                .append(newLine)
                .append("    rejectionReasons: ")
                .append(toIndentedString(rejectionReasons))
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
