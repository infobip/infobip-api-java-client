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
 * Array of voices belonging to the specified language.
 */
public class CallsSynthesisVoice {

    private String name;

    private String gender;

    private String supplier;

    private Boolean ssmlSupported;

    private Boolean isDefault;

    private Boolean isNeural;

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name of the voice. Example: &#x60;Joanna&#x60;
     *
     * @param name
     * @return This {@link CallsSynthesisVoice instance}.
     */
    public CallsSynthesisVoice name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Name of the voice. Example: &#x60;Joanna&#x60;
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
     * Name of the voice. Example: &#x60;Joanna&#x60;
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets gender.
     * <p>
     * Field description:
     * Gender of the voice. Can be &#x60;male&#x60; or &#x60;female&#x60;.
     *
     * @param gender
     * @return This {@link CallsSynthesisVoice instance}.
     */
    public CallsSynthesisVoice gender(String gender) {
        this.gender = gender;
        return this;
    }

    /**
     * Returns gender.
     * <p>
     * Field description:
     * Gender of the voice. Can be &#x60;male&#x60; or &#x60;female&#x60;.
     *
     * @return gender
     */
    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    /**
     * Sets gender.
     * <p>
     * Field description:
     * Gender of the voice. Can be &#x60;male&#x60; or &#x60;female&#x60;.
     *
     * @param gender
     */
    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Sets supplier.
     * <p>
     * Field description:
     * Name of the supplier for text to speech synthesis.
     *
     * @param supplier
     * @return This {@link CallsSynthesisVoice instance}.
     */
    public CallsSynthesisVoice supplier(String supplier) {
        this.supplier = supplier;
        return this;
    }

    /**
     * Returns supplier.
     * <p>
     * Field description:
     * Name of the supplier for text to speech synthesis.
     *
     * @return supplier
     */
    @JsonProperty("supplier")
    public String getSupplier() {
        return supplier;
    }

    /**
     * Sets supplier.
     * <p>
     * Field description:
     * Name of the supplier for text to speech synthesis.
     *
     * @param supplier
     */
    @JsonProperty("supplier")
    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    /**
     * Sets ssmlSupported.
     * <p>
     * Field description:
     * Indicates if SSML is supported.
     *
     * @param ssmlSupported
     * @return This {@link CallsSynthesisVoice instance}.
     */
    public CallsSynthesisVoice ssmlSupported(Boolean ssmlSupported) {
        this.ssmlSupported = ssmlSupported;
        return this;
    }

    /**
     * Returns ssmlSupported.
     * <p>
     * Field description:
     * Indicates if SSML is supported.
     *
     * @return ssmlSupported
     */
    @JsonProperty("ssmlSupported")
    public Boolean getSsmlSupported() {
        return ssmlSupported;
    }

    /**
     * Sets ssmlSupported.
     * <p>
     * Field description:
     * Indicates if SSML is supported.
     *
     * @param ssmlSupported
     */
    @JsonProperty("ssmlSupported")
    public void setSsmlSupported(Boolean ssmlSupported) {
        this.ssmlSupported = ssmlSupported;
    }

    /**
     * Sets isDefault.
     * <p>
     * Field description:
     * Indicates whether voice is default voice for a given language. If voice is not chosen for the language, then default voice will be used.
     *
     * @param isDefault
     * @return This {@link CallsSynthesisVoice instance}.
     */
    public CallsSynthesisVoice isDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Returns isDefault.
     * <p>
     * Field description:
     * Indicates whether voice is default voice for a given language. If voice is not chosen for the language, then default voice will be used.
     *
     * @return isDefault
     */
    @JsonProperty("isDefault")
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * Sets isDefault.
     * <p>
     * Field description:
     * Indicates whether voice is default voice for a given language. If voice is not chosen for the language, then default voice will be used.
     *
     * @param isDefault
     */
    @JsonProperty("isDefault")
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * Sets isNeural.
     * <p>
     * Field description:
     * Indicates whether voice is neural. Using neural voice will generate additional cost.
     *
     * @param isNeural
     * @return This {@link CallsSynthesisVoice instance}.
     */
    public CallsSynthesisVoice isNeural(Boolean isNeural) {
        this.isNeural = isNeural;
        return this;
    }

    /**
     * Returns isNeural.
     * <p>
     * Field description:
     * Indicates whether voice is neural. Using neural voice will generate additional cost.
     *
     * @return isNeural
     */
    @JsonProperty("isNeural")
    public Boolean getIsNeural() {
        return isNeural;
    }

    /**
     * Sets isNeural.
     * <p>
     * Field description:
     * Indicates whether voice is neural. Using neural voice will generate additional cost.
     *
     * @param isNeural
     */
    @JsonProperty("isNeural")
    public void setIsNeural(Boolean isNeural) {
        this.isNeural = isNeural;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSynthesisVoice callsSynthesisVoice = (CallsSynthesisVoice) o;
        return Objects.equals(this.name, callsSynthesisVoice.name)
                && Objects.equals(this.gender, callsSynthesisVoice.gender)
                && Objects.equals(this.supplier, callsSynthesisVoice.supplier)
                && Objects.equals(this.ssmlSupported, callsSynthesisVoice.ssmlSupported)
                && Objects.equals(this.isDefault, callsSynthesisVoice.isDefault)
                && Objects.equals(this.isNeural, callsSynthesisVoice.isNeural);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, supplier, ssmlSupported, isDefault, isNeural);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSynthesisVoice {")
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    gender: ")
                .append(toIndentedString(gender))
                .append(newLine)
                .append("    supplier: ")
                .append(toIndentedString(supplier))
                .append(newLine)
                .append("    ssmlSupported: ")
                .append(toIndentedString(ssmlSupported))
                .append(newLine)
                .append("    isDefault: ")
                .append(toIndentedString(isDefault))
                .append(newLine)
                .append("    isNeural: ")
                .append(toIndentedString(isNeural))
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
