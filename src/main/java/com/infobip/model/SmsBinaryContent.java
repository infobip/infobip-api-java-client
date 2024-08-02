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
 * Represents SmsBinaryContent model.
 */
public class SmsBinaryContent implements SmsMessageContent {

    private Integer dataCoding;

    private Integer esmClass;

    private String hex;

    /**
     * Sets dataCoding.
     * <p>
     * Field description:
     * Binary content data coding. The default value is (&#x60;0&#x60;) for GSM7. Example: (&#x60;8&#x60;) for  Unicode data.
     *
     * @param dataCoding
     * @return This {@link SmsBinaryContent instance}.
     */
    public SmsBinaryContent dataCoding(Integer dataCoding) {
        this.dataCoding = dataCoding;
        return this;
    }

    /**
     * Returns dataCoding.
     * <p>
     * Field description:
     * Binary content data coding. The default value is (&#x60;0&#x60;) for GSM7. Example: (&#x60;8&#x60;) for  Unicode data.
     *
     * @return dataCoding
     */
    @JsonProperty("dataCoding")
    public Integer getDataCoding() {
        return dataCoding;
    }

    /**
     * Sets dataCoding.
     * <p>
     * Field description:
     * Binary content data coding. The default value is (&#x60;0&#x60;) for GSM7. Example: (&#x60;8&#x60;) for  Unicode data.
     *
     * @param dataCoding
     */
    @JsonProperty("dataCoding")
    public void setDataCoding(Integer dataCoding) {
        this.dataCoding = dataCoding;
    }

    /**
     * Sets esmClass.
     * <p>
     * Field description:
     * “Esm_class” parameter. Indicate special message attributes associated with the SMS. Default value is (&#x60;0&#x60;).
     *
     * @param esmClass
     * @return This {@link SmsBinaryContent instance}.
     */
    public SmsBinaryContent esmClass(Integer esmClass) {
        this.esmClass = esmClass;
        return this;
    }

    /**
     * Returns esmClass.
     * <p>
     * Field description:
     * “Esm_class” parameter. Indicate special message attributes associated with the SMS. Default value is (&#x60;0&#x60;).
     *
     * @return esmClass
     */
    @JsonProperty("esmClass")
    public Integer getEsmClass() {
        return esmClass;
    }

    /**
     * Sets esmClass.
     * <p>
     * Field description:
     * “Esm_class” parameter. Indicate special message attributes associated with the SMS. Default value is (&#x60;0&#x60;).
     *
     * @param esmClass
     */
    @JsonProperty("esmClass")
    public void setEsmClass(Integer esmClass) {
        this.esmClass = esmClass;
    }

    /**
     * Sets hex.
     * <p>
     * Field description:
     * Hexadecimal string. This is the representation of your binary data. Two hex digits represent one byte. They should be separated by the space character.
     * <p>
     * The field is required.
     *
     * @param hex
     * @return This {@link SmsBinaryContent instance}.
     */
    public SmsBinaryContent hex(String hex) {
        this.hex = hex;
        return this;
    }

    /**
     * Returns hex.
     * <p>
     * Field description:
     * Hexadecimal string. This is the representation of your binary data. Two hex digits represent one byte. They should be separated by the space character.
     * <p>
     * The field is required.
     *
     * @return hex
     */
    @JsonProperty("hex")
    public String getHex() {
        return hex;
    }

    /**
     * Sets hex.
     * <p>
     * Field description:
     * Hexadecimal string. This is the representation of your binary data. Two hex digits represent one byte. They should be separated by the space character.
     * <p>
     * The field is required.
     *
     * @param hex
     */
    @JsonProperty("hex")
    public void setHex(String hex) {
        this.hex = hex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsBinaryContent smsBinaryContent = (SmsBinaryContent) o;
        return Objects.equals(this.dataCoding, smsBinaryContent.dataCoding)
                && Objects.equals(this.esmClass, smsBinaryContent.esmClass)
                && Objects.equals(this.hex, smsBinaryContent.hex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataCoding, esmClass, hex);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsBinaryContent {")
                .append(newLine)
                .append("    dataCoding: ")
                .append(toIndentedString(dataCoding))
                .append(newLine)
                .append("    esmClass: ")
                .append(toIndentedString(esmClass))
                .append(newLine)
                .append("    hex: ")
                .append(toIndentedString(hex))
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
