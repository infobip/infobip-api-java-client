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
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Represents NumbersExternalTenDlcCampaign model.
 */
public class NumbersExternalTenDlcCampaign extends NumbersCampaign {

    private String externalCampaignId;

    private Set<String> numbers = null;

    private Set<String> numberKeys = null;

    private Set<NumbersNumberPreview> numberPreviews = null;

    private NumbersNumberPool numberPool;

    /**
     * Constructs a new {@link NumbersExternalTenDlcCampaign} instance.
     */
    public NumbersExternalTenDlcCampaign() {
        super("EXTERNAL_TEN_DIGIT_LONG_CODE");
    }

    /**
     * Sets externalCampaignId.
     * <p>
     * Field description:
     * The ID of the campaign as defined by The Campaign Registry.
     * <p>
     * The field is required.
     *
     * @param externalCampaignId
     * @return This {@link NumbersExternalTenDlcCampaign instance}.
     */
    public NumbersExternalTenDlcCampaign externalCampaignId(String externalCampaignId) {
        this.externalCampaignId = externalCampaignId;
        return this;
    }

    /**
     * Returns externalCampaignId.
     * <p>
     * Field description:
     * The ID of the campaign as defined by The Campaign Registry.
     * <p>
     * The field is required.
     *
     * @return externalCampaignId
     */
    @JsonProperty("externalCampaignId")
    public String getExternalCampaignId() {
        return externalCampaignId;
    }

    /**
     * Sets externalCampaignId.
     * <p>
     * Field description:
     * The ID of the campaign as defined by The Campaign Registry.
     * <p>
     * The field is required.
     *
     * @param externalCampaignId
     */
    @JsonProperty("externalCampaignId")
    public void setExternalCampaignId(String externalCampaignId) {
        this.externalCampaignId = externalCampaignId;
    }

    /**
     * Sets numbers.
     * <p>
     * Field description:
     * US 10DLC Numbers to be used with the campaign.
     *
     * @param numbers
     * @return This {@link NumbersExternalTenDlcCampaign instance}.
     */
    public NumbersExternalTenDlcCampaign numbers(Set<String> numbers) {
        this.numbers = numbers;
        return this;
    }

    /**
     * Adds and item into numbers.
     * <p>
     * Field description:
     * US 10DLC Numbers to be used with the campaign.
     *
     * @param numbersItem The item to be added to the list.
     * @return This {@link NumbersExternalTenDlcCampaign instance}.
     */
    public NumbersExternalTenDlcCampaign addNumbersItem(String numbersItem) {
        if (this.numbers == null) {
            this.numbers = new LinkedHashSet<>();
        }
        this.numbers.add(numbersItem);
        return this;
    }

    /**
     * Returns numbers.
     * <p>
     * Field description:
     * US 10DLC Numbers to be used with the campaign.
     *
     * @return numbers
     */
    @JsonProperty("numbers")
    public Set<String> getNumbers() {
        return numbers;
    }

    /**
     * Sets numbers.
     * <p>
     * Field description:
     * US 10DLC Numbers to be used with the campaign.
     *
     * @param numbers
     */
    @JsonProperty("numbers")
    public void setNumbers(Set<String> numbers) {
        this.numbers = numbers;
    }

    /**
     * Sets numberKeys.
     * <p>
     * Field description:
     * The numberKey(s) of the numbers to use with the campaign. Campaign must have at least one 10DLC number associated before it can be submitted for review. Alternatively, you can use the &#39;numbers&#39; property to specify the numbers directly, but note that &#39;numberKeys&#39; property takes precedence if both are specified.
     *
     * @param numberKeys
     * @return This {@link NumbersExternalTenDlcCampaign instance}.
     */
    public NumbersExternalTenDlcCampaign numberKeys(Set<String> numberKeys) {
        this.numberKeys = numberKeys;
        return this;
    }

    /**
     * Adds and item into numberKeys.
     * <p>
     * Field description:
     * The numberKey(s) of the numbers to use with the campaign. Campaign must have at least one 10DLC number associated before it can be submitted for review. Alternatively, you can use the &#39;numbers&#39; property to specify the numbers directly, but note that &#39;numberKeys&#39; property takes precedence if both are specified.
     *
     * @param numberKeysItem The item to be added to the list.
     * @return This {@link NumbersExternalTenDlcCampaign instance}.
     */
    public NumbersExternalTenDlcCampaign addNumberKeysItem(String numberKeysItem) {
        if (this.numberKeys == null) {
            this.numberKeys = new LinkedHashSet<>();
        }
        this.numberKeys.add(numberKeysItem);
        return this;
    }

    /**
     * Returns numberKeys.
     * <p>
     * Field description:
     * The numberKey(s) of the numbers to use with the campaign. Campaign must have at least one 10DLC number associated before it can be submitted for review. Alternatively, you can use the &#39;numbers&#39; property to specify the numbers directly, but note that &#39;numberKeys&#39; property takes precedence if both are specified.
     *
     * @return numberKeys
     */
    @JsonProperty("numberKeys")
    public Set<String> getNumberKeys() {
        return numberKeys;
    }

    /**
     * Sets numberKeys.
     * <p>
     * Field description:
     * The numberKey(s) of the numbers to use with the campaign. Campaign must have at least one 10DLC number associated before it can be submitted for review. Alternatively, you can use the &#39;numbers&#39; property to specify the numbers directly, but note that &#39;numberKeys&#39; property takes precedence if both are specified.
     *
     * @param numberKeys
     */
    @JsonProperty("numberKeys")
    public void setNumberKeys(Set<String> numberKeys) {
        this.numberKeys = numberKeys;
    }

    /**
     * Sets numberPreviews.
     * <p>
     * Field description:
     * The number(s) to use with the campaign. This property is read-only and ignored in POST/PUT calls.
     *
     * @param numberPreviews
     * @return This {@link NumbersExternalTenDlcCampaign instance}.
     */
    public NumbersExternalTenDlcCampaign numberPreviews(Set<NumbersNumberPreview> numberPreviews) {
        this.numberPreviews = numberPreviews;
        return this;
    }

    /**
     * Adds and item into numberPreviews.
     * <p>
     * Field description:
     * The number(s) to use with the campaign. This property is read-only and ignored in POST/PUT calls.
     *
     * @param numberPreviewsItem The item to be added to the list.
     * @return This {@link NumbersExternalTenDlcCampaign instance}.
     */
    public NumbersExternalTenDlcCampaign addNumberPreviewsItem(NumbersNumberPreview numberPreviewsItem) {
        if (this.numberPreviews == null) {
            this.numberPreviews = new LinkedHashSet<>();
        }
        this.numberPreviews.add(numberPreviewsItem);
        return this;
    }

    /**
     * Returns numberPreviews.
     * <p>
     * Field description:
     * The number(s) to use with the campaign. This property is read-only and ignored in POST/PUT calls.
     *
     * @return numberPreviews
     */
    @JsonProperty("numberPreviews")
    public Set<NumbersNumberPreview> getNumberPreviews() {
        return numberPreviews;
    }

    /**
     * Sets numberPreviews.
     * <p>
     * Field description:
     * The number(s) to use with the campaign. This property is read-only and ignored in POST/PUT calls.
     *
     * @param numberPreviews
     */
    @JsonProperty("numberPreviews")
    public void setNumberPreviews(Set<NumbersNumberPreview> numberPreviews) {
        this.numberPreviews = numberPreviews;
    }

    /**
     * Sets numberPool.
     *
     * @param numberPool
     * @return This {@link NumbersExternalTenDlcCampaign instance}.
     */
    public NumbersExternalTenDlcCampaign numberPool(NumbersNumberPool numberPool) {
        this.numberPool = numberPool;
        return this;
    }

    /**
     * Returns numberPool.
     *
     * @return numberPool
     */
    @JsonProperty("numberPool")
    public NumbersNumberPool getNumberPool() {
        return numberPool;
    }

    /**
     * Sets numberPool.
     *
     * @param numberPool
     */
    @JsonProperty("numberPool")
    public void setNumberPool(NumbersNumberPool numberPool) {
        this.numberPool = numberPool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersExternalTenDlcCampaign numbersExternalTenDlcCampaign = (NumbersExternalTenDlcCampaign) o;
        return Objects.equals(this.externalCampaignId, numbersExternalTenDlcCampaign.externalCampaignId)
                && Objects.equals(this.numbers, numbersExternalTenDlcCampaign.numbers)
                && Objects.equals(this.numberKeys, numbersExternalTenDlcCampaign.numberKeys)
                && Objects.equals(this.numberPreviews, numbersExternalTenDlcCampaign.numberPreviews)
                && Objects.equals(this.numberPool, numbersExternalTenDlcCampaign.numberPool)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(externalCampaignId, numbers, numberKeys, numberPreviews, numberPool, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersExternalTenDlcCampaign {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    externalCampaignId: ")
                .append(toIndentedString(externalCampaignId))
                .append(newLine)
                .append("    numbers: ")
                .append(toIndentedString(numbers))
                .append(newLine)
                .append("    numberKeys: ")
                .append(toIndentedString(numberKeys))
                .append(newLine)
                .append("    numberPreviews: ")
                .append(toIndentedString(numberPreviews))
                .append(newLine)
                .append("    numberPool: ")
                .append(toIndentedString(numberPool))
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
