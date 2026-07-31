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
 * Variable parameter definition for template placeholders.
 */
public class ViberTemplateParam {

    private ViberTemplateParamType type;

    private String name;

    private String example;

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     * @return This {@link ViberTemplateParam instance}.
     */
    public ViberTemplateParam type(ViberTemplateParamType type) {
        this.type = type;
        return this;
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public ViberTemplateParamType getType() {
        return type;
    }

    /**
     * Sets type.
     * <p>
     * The field is required.
     *
     * @param type
     */
    @JsonProperty("type")
    public void setType(ViberTemplateParamType type) {
        this.type = type;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name or identifier of the parameter, used to reference it in the template. Must have the same name as the placeholder in the template content.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link ViberTemplateParam instance}.
     */
    public ViberTemplateParam name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Name or identifier of the parameter, used to reference it in the template. Must have the same name as the placeholder in the template content.
     * <p>
     * The field is required.
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
     * Name or identifier of the parameter, used to reference it in the template. Must have the same name as the placeholder in the template content.
     * <p>
     * The field is required.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets example.
     * <p>
     * Field description:
     * Example value for the parameter, used for template preview and validation.
     * <p>
     * The field is required.
     *
     * @param example
     * @return This {@link ViberTemplateParam instance}.
     */
    public ViberTemplateParam example(String example) {
        this.example = example;
        return this;
    }

    /**
     * Returns example.
     * <p>
     * Field description:
     * Example value for the parameter, used for template preview and validation.
     * <p>
     * The field is required.
     *
     * @return example
     */
    @JsonProperty("example")
    public String getExample() {
        return example;
    }

    /**
     * Sets example.
     * <p>
     * Field description:
     * Example value for the parameter, used for template preview and validation.
     * <p>
     * The field is required.
     *
     * @param example
     */
    @JsonProperty("example")
    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViberTemplateParam viberTemplateParam = (ViberTemplateParam) o;
        return Objects.equals(this.type, viberTemplateParam.type)
                && Objects.equals(this.name, viberTemplateParam.name)
                && Objects.equals(this.example, viberTemplateParam.example);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, example);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberTemplateParam {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    example: ")
                .append(toIndentedString(example))
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
