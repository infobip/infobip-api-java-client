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
 * Represents NumbersUpdateCampaignRegistrationRequest model.
 */
public class NumbersUpdateCampaignRegistrationRequest {

    private Set<String> numberKeys = null;

    private Set<String> numbers = null;

    /**
     * Sets numberKeys.
     * <p>
     * Field description:
     * The numberKey(s) of the numbers to use with the campaign. Campaign must have at least one 10DLC number associated before it can be submitted for review. Alternatively, you can use the &#39;numbers&#39; property to specify the numbers directly, but note that &#39;numberKeys&#39; property takes precedence if both are specified.  Total limit for Number pooling campaigns is 35000 instead of 49. You can add or remove up to 5000 numbers at a time for Number pooling campaigns.
     *
     * @param numberKeys
     * @return This {@link NumbersUpdateCampaignRegistrationRequest instance}.
     */
    public NumbersUpdateCampaignRegistrationRequest numberKeys(Set<String> numberKeys) {
        this.numberKeys = numberKeys;
        return this;
    }

    /**
     * Adds and item into numberKeys.
     * <p>
     * Field description:
     * The numberKey(s) of the numbers to use with the campaign. Campaign must have at least one 10DLC number associated before it can be submitted for review. Alternatively, you can use the &#39;numbers&#39; property to specify the numbers directly, but note that &#39;numberKeys&#39; property takes precedence if both are specified.  Total limit for Number pooling campaigns is 35000 instead of 49. You can add or remove up to 5000 numbers at a time for Number pooling campaigns.
     *
     * @param numberKeysItem The item to be added to the list.
     * @return This {@link NumbersUpdateCampaignRegistrationRequest instance}.
     */
    public NumbersUpdateCampaignRegistrationRequest addNumberKeysItem(String numberKeysItem) {
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
     * The numberKey(s) of the numbers to use with the campaign. Campaign must have at least one 10DLC number associated before it can be submitted for review. Alternatively, you can use the &#39;numbers&#39; property to specify the numbers directly, but note that &#39;numberKeys&#39; property takes precedence if both are specified.  Total limit for Number pooling campaigns is 35000 instead of 49. You can add or remove up to 5000 numbers at a time for Number pooling campaigns.
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
     * The numberKey(s) of the numbers to use with the campaign. Campaign must have at least one 10DLC number associated before it can be submitted for review. Alternatively, you can use the &#39;numbers&#39; property to specify the numbers directly, but note that &#39;numberKeys&#39; property takes precedence if both are specified.  Total limit for Number pooling campaigns is 35000 instead of 49. You can add or remove up to 5000 numbers at a time for Number pooling campaigns.
     *
     * @param numberKeys
     */
    @JsonProperty("numberKeys")
    public void setNumberKeys(Set<String> numberKeys) {
        this.numberKeys = numberKeys;
    }

    /**
     * Sets numbers.
     * <p>
     * Field description:
     * US 10DLC numbers to use with the campaign. Campaign must have at least one 10DLC number associated before it can be submitted for review. You may only use numbers that are associated with your account inside the Infobip platform. Numbers must be provided in international format including the country prefix, e.g. 14232180111. This property can be used instead of &#39;numberKeys&#39; to specify the campaign numbers; it is not returned in the API response.  Total limit for Number pooling campaigns is 35000 instead of 49. You can add or remove up to 5000 numbers at a time for Number pooling campaigns.
     *
     * @param numbers
     * @return This {@link NumbersUpdateCampaignRegistrationRequest instance}.
     */
    public NumbersUpdateCampaignRegistrationRequest numbers(Set<String> numbers) {
        this.numbers = numbers;
        return this;
    }

    /**
     * Adds and item into numbers.
     * <p>
     * Field description:
     * US 10DLC numbers to use with the campaign. Campaign must have at least one 10DLC number associated before it can be submitted for review. You may only use numbers that are associated with your account inside the Infobip platform. Numbers must be provided in international format including the country prefix, e.g. 14232180111. This property can be used instead of &#39;numberKeys&#39; to specify the campaign numbers; it is not returned in the API response.  Total limit for Number pooling campaigns is 35000 instead of 49. You can add or remove up to 5000 numbers at a time for Number pooling campaigns.
     *
     * @param numbersItem The item to be added to the list.
     * @return This {@link NumbersUpdateCampaignRegistrationRequest instance}.
     */
    public NumbersUpdateCampaignRegistrationRequest addNumbersItem(String numbersItem) {
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
     * US 10DLC numbers to use with the campaign. Campaign must have at least one 10DLC number associated before it can be submitted for review. You may only use numbers that are associated with your account inside the Infobip platform. Numbers must be provided in international format including the country prefix, e.g. 14232180111. This property can be used instead of &#39;numberKeys&#39; to specify the campaign numbers; it is not returned in the API response.  Total limit for Number pooling campaigns is 35000 instead of 49. You can add or remove up to 5000 numbers at a time for Number pooling campaigns.
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
     * US 10DLC numbers to use with the campaign. Campaign must have at least one 10DLC number associated before it can be submitted for review. You may only use numbers that are associated with your account inside the Infobip platform. Numbers must be provided in international format including the country prefix, e.g. 14232180111. This property can be used instead of &#39;numberKeys&#39; to specify the campaign numbers; it is not returned in the API response.  Total limit for Number pooling campaigns is 35000 instead of 49. You can add or remove up to 5000 numbers at a time for Number pooling campaigns.
     *
     * @param numbers
     */
    @JsonProperty("numbers")
    public void setNumbers(Set<String> numbers) {
        this.numbers = numbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersUpdateCampaignRegistrationRequest numbersUpdateCampaignRegistrationRequest =
                (NumbersUpdateCampaignRegistrationRequest) o;
        return Objects.equals(this.numberKeys, numbersUpdateCampaignRegistrationRequest.numberKeys)
                && Objects.equals(this.numbers, numbersUpdateCampaignRegistrationRequest.numbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberKeys, numbers);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersUpdateCampaignRegistrationRequest {")
                .append(newLine)
                .append("    numberKeys: ")
                .append(toIndentedString(numberKeys))
                .append(newLine)
                .append("    numbers: ")
                .append(toIndentedString(numbers))
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
