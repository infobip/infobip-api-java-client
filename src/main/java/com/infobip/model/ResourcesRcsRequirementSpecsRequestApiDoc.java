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
 * Represents ResourcesRcsRequirementSpecsRequestApiDoc model.
 */
public class ResourcesRcsRequirementSpecsRequestApiDoc implements ResourcesRequirementsLookupBody {
    /**
     * Type of resource.
     */
    public enum TypeEnum {
        RCS_SENDER_LAUNCH("RCS_SENDER_LAUNCH");

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

    private String countryCode;

    private List<String> excludedCarriers = null;

    private ResourcesTrafficOrigin trafficOrigin;

    /**
     * Sets type.
     * <p>
     * Field description:
     * Type of resource.
     * <p>
     * The field is required.
     *
     * @param type
     * @return This {@link ResourcesRcsRequirementSpecsRequestApiDoc instance}.
     */
    public ResourcesRcsRequirementSpecsRequestApiDoc type(TypeEnum type) {
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
     * Sets countryCode.
     * <p>
     * Field description:
     * Country code in two-letter ISO standard.
     * <p>
     * The field is required.
     *
     * @param countryCode
     * @return This {@link ResourcesRcsRequirementSpecsRequestApiDoc instance}.
     */
    public ResourcesRcsRequirementSpecsRequestApiDoc countryCode(String countryCode) {
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

    /**
     * Sets excludedCarriers.
     * <p>
     * Field description:
     * List of carrier names excluded from the sender launch.
     *
     * @param excludedCarriers
     * @return This {@link ResourcesRcsRequirementSpecsRequestApiDoc instance}.
     */
    public ResourcesRcsRequirementSpecsRequestApiDoc excludedCarriers(List<String> excludedCarriers) {
        this.excludedCarriers = excludedCarriers;
        return this;
    }

    /**
     * Adds and item into excludedCarriers.
     * <p>
     * Field description:
     * List of carrier names excluded from the sender launch.
     *
     * @param excludedCarriersItem The item to be added to the list.
     * @return This {@link ResourcesRcsRequirementSpecsRequestApiDoc instance}.
     */
    public ResourcesRcsRequirementSpecsRequestApiDoc addExcludedCarriersItem(String excludedCarriersItem) {
        if (this.excludedCarriers == null) {
            this.excludedCarriers = new ArrayList<>();
        }
        this.excludedCarriers.add(excludedCarriersItem);
        return this;
    }

    /**
     * Returns excludedCarriers.
     * <p>
     * Field description:
     * List of carrier names excluded from the sender launch.
     *
     * @return excludedCarriers
     */
    @JsonProperty("excludedCarriers")
    public List<String> getExcludedCarriers() {
        return excludedCarriers;
    }

    /**
     * Sets excludedCarriers.
     * <p>
     * Field description:
     * List of carrier names excluded from the sender launch.
     *
     * @param excludedCarriers
     */
    @JsonProperty("excludedCarriers")
    public void setExcludedCarriers(List<String> excludedCarriers) {
        this.excludedCarriers = excludedCarriers;
    }

    /**
     * Sets trafficOrigin.
     * <p>
     * The field is required.
     *
     * @param trafficOrigin
     * @return This {@link ResourcesRcsRequirementSpecsRequestApiDoc instance}.
     */
    public ResourcesRcsRequirementSpecsRequestApiDoc trafficOrigin(ResourcesTrafficOrigin trafficOrigin) {
        this.trafficOrigin = trafficOrigin;
        return this;
    }

    /**
     * Returns trafficOrigin.
     * <p>
     * The field is required.
     *
     * @return trafficOrigin
     */
    @JsonProperty("trafficOrigin")
    public ResourcesTrafficOrigin getTrafficOrigin() {
        return trafficOrigin;
    }

    /**
     * Sets trafficOrigin.
     * <p>
     * The field is required.
     *
     * @param trafficOrigin
     */
    @JsonProperty("trafficOrigin")
    public void setTrafficOrigin(ResourcesTrafficOrigin trafficOrigin) {
        this.trafficOrigin = trafficOrigin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesRcsRequirementSpecsRequestApiDoc resourcesRcsRequirementSpecsRequestApiDoc =
                (ResourcesRcsRequirementSpecsRequestApiDoc) o;
        return Objects.equals(this.type, resourcesRcsRequirementSpecsRequestApiDoc.type)
                && Objects.equals(this.countryCode, resourcesRcsRequirementSpecsRequestApiDoc.countryCode)
                && Objects.equals(this.excludedCarriers, resourcesRcsRequirementSpecsRequestApiDoc.excludedCarriers)
                && Objects.equals(this.trafficOrigin, resourcesRcsRequirementSpecsRequestApiDoc.trafficOrigin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, countryCode, excludedCarriers, trafficOrigin);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesRcsRequirementSpecsRequestApiDoc {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
                .append(newLine)
                .append("    excludedCarriers: ")
                .append(toIndentedString(excludedCarriers))
                .append(newLine)
                .append("    trafficOrigin: ")
                .append(toIndentedString(trafficOrigin))
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
