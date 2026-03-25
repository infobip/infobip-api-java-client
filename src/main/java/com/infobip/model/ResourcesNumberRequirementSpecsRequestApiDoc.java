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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents ResourcesNumberRequirementSpecsRequestApiDoc model.
 */
public class ResourcesNumberRequirementSpecsRequestApiDoc implements ResourcesRequirementsLookupBody {
    /**
     * Type of resource.
     */
    public enum TypeEnum {
        NUMBER_PURCHASE("NUMBER_PURCHASE");

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum enumElement : TypeEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private TypeEnum type;

    private Integer quantity;

    private ResourcesResourceNumberType numberType;

    private List<ResourcesResourceNumberCapability> capabilities = new ArrayList<>();

    private String countryCode;

    /**
     * Sets type.
     * <p>
     * Field description:
     * Type of resource.
     * <p>
     * The field is required.
     *
     * @param type
     * @return This {@link ResourcesNumberRequirementSpecsRequestApiDoc instance}.
     */
    public ResourcesNumberRequirementSpecsRequestApiDoc type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * Field description:
     * Type of resource.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * Field description:
     * Type of resource.
     * <p>
     * The field is required.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Sets quantity.
     * <p>
     * Field description:
     * Amount of numbers. Default value is 1.
     *
     * @param quantity
     * @return This {@link ResourcesNumberRequirementSpecsRequestApiDoc instance}.
     */
    public ResourcesNumberRequirementSpecsRequestApiDoc quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Returns quantity.
     * <p>
     * Field description:
     * Amount of numbers. Default value is 1.
     *
     * @return quantity
     */
    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Sets quantity.
     * <p>
     * Field description:
     * Amount of numbers. Default value is 1.
     *
     * @param quantity
     */
    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Sets numberType.
     * <p>
     * The field is required.
     *
     * @param numberType
     * @return This {@link ResourcesNumberRequirementSpecsRequestApiDoc instance}.
     */
    public ResourcesNumberRequirementSpecsRequestApiDoc numberType(ResourcesResourceNumberType numberType) {
        this.numberType = numberType;
        return this;
    }

    /**
     * Returns numberType.
     * <p>
     * The field is required.
     *
     * @return numberType
     */
    @JsonProperty("numberType")
    public ResourcesResourceNumberType getNumberType() {
        return numberType;
    }

    /**
     * Sets numberType.
     * <p>
     * The field is required.
     *
     * @param numberType
     */
    @JsonProperty("numberType")
    public void setNumberType(ResourcesResourceNumberType numberType) {
        this.numberType = numberType;
    }

    /**
     * Sets capabilities.
     * <p>
     * Field description:
     * Capabilities of the numbers.
     * <p>
     * The field is required.
     *
     * @param capabilities
     * @return This {@link ResourcesNumberRequirementSpecsRequestApiDoc instance}.
     */
    public ResourcesNumberRequirementSpecsRequestApiDoc capabilities(
            List<ResourcesResourceNumberCapability> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Adds and item into capabilities.
     * <p>
     * Field description:
     * Capabilities of the numbers.
     * <p>
     * The field is required.
     *
     * @param capabilitiesItem The item to be added to the list.
     * @return This {@link ResourcesNumberRequirementSpecsRequestApiDoc instance}.
     */
    public ResourcesNumberRequirementSpecsRequestApiDoc addCapabilitiesItem(
            ResourcesResourceNumberCapability capabilitiesItem) {
        if (this.capabilities == null) {
            this.capabilities = new ArrayList<>();
        }
        this.capabilities.add(capabilitiesItem);
        return this;
    }

    /**
     * Returns capabilities.
     * <p>
     * Field description:
     * Capabilities of the numbers.
     * <p>
     * The field is required.
     *
     * @return capabilities
     */
    @JsonProperty("capabilities")
    public List<ResourcesResourceNumberCapability> getCapabilities() {
        return capabilities;
    }

    /**
     * Sets capabilities.
     * <p>
     * Field description:
     * Capabilities of the numbers.
     * <p>
     * The field is required.
     *
     * @param capabilities
     */
    @JsonProperty("capabilities")
    public void setCapabilities(List<ResourcesResourceNumberCapability> capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard.
     * <p>
     * The field is required.
     *
     * @param countryCode
     * @return This {@link ResourcesNumberRequirementSpecsRequestApiDoc instance}.
     */
    public ResourcesNumberRequirementSpecsRequestApiDoc countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Returns countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard.
     * <p>
     * The field is required.
     *
     * @return countryCode
     */
    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard.
     * <p>
     * The field is required.
     *
     * @param countryCode
     */
    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesNumberRequirementSpecsRequestApiDoc resourcesNumberRequirementSpecsRequestApiDoc =
                (ResourcesNumberRequirementSpecsRequestApiDoc) o;
        return Objects.equals(this.type, resourcesNumberRequirementSpecsRequestApiDoc.type)
                && Objects.equals(this.quantity, resourcesNumberRequirementSpecsRequestApiDoc.quantity)
                && Objects.equals(this.numberType, resourcesNumberRequirementSpecsRequestApiDoc.numberType)
                && Objects.equals(this.capabilities, resourcesNumberRequirementSpecsRequestApiDoc.capabilities)
                && Objects.equals(this.countryCode, resourcesNumberRequirementSpecsRequestApiDoc.countryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, quantity, numberType, capabilities, countryCode);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesNumberRequirementSpecsRequestApiDoc {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    quantity: ")
                .append(toIndentedString(quantity))
                .append(newLine)
                .append("    numberType: ")
                .append(toIndentedString(numberType))
                .append(newLine)
                .append("    capabilities: ")
                .append(toIndentedString(capabilities))
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
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
