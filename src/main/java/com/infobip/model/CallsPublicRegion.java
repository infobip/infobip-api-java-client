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
 * SIP trunk service address region.
 */
public class CallsPublicRegion {

    private String name;

    private String code;

    private String countryCode;

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name of the region from the country where SIP trunk is located.
     *
     * @param name
     * @return This {@link CallsPublicRegion instance}.
     */
    public CallsPublicRegion name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Name of the region from the country where SIP trunk is located.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name of the region from the country where SIP trunk is located.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets code.
     * <p>
     * Field description:
     * Code of the region from the country where SIP trunk is located.
     *
     * @param code
     * @return This {@link CallsPublicRegion instance}.
     */
    public CallsPublicRegion code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Returns code.
     * <p>
     * Field description:
     * Code of the region from the country where SIP trunk is located.
     *
     * @return code
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * Sets code.
     * <p>
     * Field description:
     * Code of the region from the country where SIP trunk is located.
     *
     * @param code
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Sets countryCode.
     * <p>
     * Field description:
     * Code of the country where SIP trunk is located.
     *
     * @param countryCode
     * @return This {@link CallsPublicRegion instance}.
     */
    public CallsPublicRegion countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Returns countryCode.
     * <p>
     * Field description:
     * Code of the country where SIP trunk is located.
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
     * Code of the country where SIP trunk is located.
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
        CallsPublicRegion callsPublicRegion = (CallsPublicRegion) o;
        return Objects.equals(this.name, callsPublicRegion.name)
                && Objects.equals(this.code, callsPublicRegion.code)
                && Objects.equals(this.countryCode, callsPublicRegion.countryCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code, countryCode);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsPublicRegion {")
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    code: ")
                .append(toIndentedString(code))
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
