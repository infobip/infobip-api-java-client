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
 * SIP trunk service address country.
 */
public class CallsPublicCountry {

    private String name;

    private String code;

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name of the country where SIP trunk is located.
     *
     * @param name
     * @return This {@link CallsPublicCountry instance}.
     */
    public CallsPublicCountry name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Name of the country where SIP trunk is located.
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
     * Name of the country where SIP trunk is located.
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
     * Code of the country where SIP trunk is located.
     *
     * @param code
     * @return This {@link CallsPublicCountry instance}.
     */
    public CallsPublicCountry code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Returns code.
     * <p>
     * Field description:
     * Code of the country where SIP trunk is located.
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
     * Code of the country where SIP trunk is located.
     *
     * @param code
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsPublicCountry callsPublicCountry = (CallsPublicCountry) o;
        return Objects.equals(this.name, callsPublicCountry.name) && Objects.equals(this.code, callsPublicCountry.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsPublicCountry {")
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    code: ")
                .append(toIndentedString(code))
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
