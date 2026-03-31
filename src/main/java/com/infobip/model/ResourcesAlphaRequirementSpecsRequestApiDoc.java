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

/**
 * Represents ResourcesAlphaRequirementSpecsRequestApiDoc model.
 */
public class ResourcesAlphaRequirementSpecsRequestApiDoc implements ResourcesRequirementsLookupBody {
    /**
     * Type of resource.
     */
    public enum TypeEnum {
        ALPHANUMERIC_REGISTRATION("ALPHANUMERIC_REGISTRATION");

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

    private ResourcesTrafficOrigin trafficOrigin;

    private ResourcesTrafficType trafficType;

    /**
     * Sets type.
     * <p>
     * Field description:
     * Type of resource.
     * <p>
     * The field is required.
     *
     * @param type
     * @return This {@link ResourcesAlphaRequirementSpecsRequestApiDoc instance}.
     */
    public ResourcesAlphaRequirementSpecsRequestApiDoc type(TypeEnum type) {
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
     * @return This {@link ResourcesAlphaRequirementSpecsRequestApiDoc instance}.
     */
    public ResourcesAlphaRequirementSpecsRequestApiDoc countryCode(String countryCode) {
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
     * Sets trafficOrigin.
     *
     * @param trafficOrigin
     * @return This {@link ResourcesAlphaRequirementSpecsRequestApiDoc instance}.
     */
    public ResourcesAlphaRequirementSpecsRequestApiDoc trafficOrigin(ResourcesTrafficOrigin trafficOrigin) {
        this.trafficOrigin = trafficOrigin;
        return this;
    }

    /**
     * Returns trafficOrigin.
     *
     * @return trafficOrigin
     */
    @JsonProperty("trafficOrigin")
    public ResourcesTrafficOrigin getTrafficOrigin() {
        return trafficOrigin;
    }

    /**
     * Sets trafficOrigin.
     *
     * @param trafficOrigin
     */
    @JsonProperty("trafficOrigin")
    public void setTrafficOrigin(ResourcesTrafficOrigin trafficOrigin) {
        this.trafficOrigin = trafficOrigin;
    }

    /**
     * Sets trafficType.
     *
     * @param trafficType
     * @return This {@link ResourcesAlphaRequirementSpecsRequestApiDoc instance}.
     */
    public ResourcesAlphaRequirementSpecsRequestApiDoc trafficType(ResourcesTrafficType trafficType) {
        this.trafficType = trafficType;
        return this;
    }

    /**
     * Returns trafficType.
     *
     * @return trafficType
     */
    @JsonProperty("trafficType")
    public ResourcesTrafficType getTrafficType() {
        return trafficType;
    }

    /**
     * Sets trafficType.
     *
     * @param trafficType
     */
    @JsonProperty("trafficType")
    public void setTrafficType(ResourcesTrafficType trafficType) {
        this.trafficType = trafficType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesAlphaRequirementSpecsRequestApiDoc resourcesAlphaRequirementSpecsRequestApiDoc =
                (ResourcesAlphaRequirementSpecsRequestApiDoc) o;
        return Objects.equals(this.type, resourcesAlphaRequirementSpecsRequestApiDoc.type)
                && Objects.equals(this.countryCode, resourcesAlphaRequirementSpecsRequestApiDoc.countryCode)
                && Objects.equals(this.trafficOrigin, resourcesAlphaRequirementSpecsRequestApiDoc.trafficOrigin)
                && Objects.equals(this.trafficType, resourcesAlphaRequirementSpecsRequestApiDoc.trafficType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, countryCode, trafficOrigin, trafficType);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesAlphaRequirementSpecsRequestApiDoc {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    countryCode: ")
                .append(toIndentedString(countryCode))
                .append(newLine)
                .append("    trafficOrigin: ")
                .append(toIndentedString(trafficOrigin))
                .append(newLine)
                .append("    trafficType: ")
                .append(toIndentedString(trafficType))
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
