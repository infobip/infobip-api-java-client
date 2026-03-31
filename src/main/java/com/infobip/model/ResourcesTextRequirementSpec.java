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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents ResourcesTextRequirementSpec model.
 */
public class ResourcesTextRequirementSpec extends ResourcesRequirementSpec {

    private String key;

    private String name;

    private String description;

    private Boolean required;

    private Boolean multipleValuesSupported;

    private ResourcesCategory category;

    private List<String> options = null;

    private ResourcesTextRequirementValidation validation;

    /**
     * Constructs a new {@link ResourcesTextRequirementSpec} instance.
     */
    public ResourcesTextRequirementSpec() {
        super("TEXT");
    }

    /**
     * Sets key.
     * <p>
     * Field description:
     * Key of the requirement.
     *
     * @param key
     * @return This {@link ResourcesTextRequirementSpec instance}.
     */
    public ResourcesTextRequirementSpec key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Returns key.
     * <p>
     * Field description:
     * Key of the requirement.
     *
     * @return key
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * Sets key.
     * <p>
     * Field description:
     * Key of the requirement.
     *
     * @param key
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Name of the requirement.
     *
     * @param name
     * @return This {@link ResourcesTextRequirementSpec instance}.
     */
    public ResourcesTextRequirementSpec name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Name of the requirement.
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
     * Name of the requirement.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Description of the requirement.
     *
     * @param description
     * @return This {@link ResourcesTextRequirementSpec instance}.
     */
    public ResourcesTextRequirementSpec description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Description of the requirement.
     *
     * @return description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Description of the requirement.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets required.
     * <p>
     * Field description:
     * Flag that indicates if the requirement is required.
     *
     * @param required
     * @return This {@link ResourcesTextRequirementSpec instance}.
     */
    public ResourcesTextRequirementSpec required(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * Returns required.
     * <p>
     * Field description:
     * Flag that indicates if the requirement is required.
     *
     * @return required
     */
    @JsonProperty("required")
    public Boolean getRequired() {
        return required;
    }

    /**
     * Sets required.
     * <p>
     * Field description:
     * Flag that indicates if the requirement is required.
     *
     * @param required
     */
    @JsonProperty("required")
    public void setRequired(Boolean required) {
        this.required = required;
    }

    /**
     * Sets multipleValuesSupported.
     * <p>
     * Field description:
     * Flag that indicates if multiple values can be provided.
     *
     * @param multipleValuesSupported
     * @return This {@link ResourcesTextRequirementSpec instance}.
     */
    public ResourcesTextRequirementSpec multipleValuesSupported(Boolean multipleValuesSupported) {
        this.multipleValuesSupported = multipleValuesSupported;
        return this;
    }

    /**
     * Returns multipleValuesSupported.
     * <p>
     * Field description:
     * Flag that indicates if multiple values can be provided.
     *
     * @return multipleValuesSupported
     */
    @JsonProperty("multipleValuesSupported")
    public Boolean getMultipleValuesSupported() {
        return multipleValuesSupported;
    }

    /**
     * Sets multipleValuesSupported.
     * <p>
     * Field description:
     * Flag that indicates if multiple values can be provided.
     *
     * @param multipleValuesSupported
     */
    @JsonProperty("multipleValuesSupported")
    public void setMultipleValuesSupported(Boolean multipleValuesSupported) {
        this.multipleValuesSupported = multipleValuesSupported;
    }

    /**
     * Sets category.
     *
     * @param category
     * @return This {@link ResourcesTextRequirementSpec instance}.
     */
    public ResourcesTextRequirementSpec category(ResourcesCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Returns category.
     *
     * @return category
     */
    @JsonProperty("category")
    public ResourcesCategory getCategory() {
        return category;
    }

    /**
     * Sets category.
     *
     * @param category
     */
    @JsonProperty("category")
    public void setCategory(ResourcesCategory category) {
        this.category = category;
    }

    /**
     * Sets options.
     * <p>
     * Field description:
     * List of options for the requirement.
     *
     * @param options
     * @return This {@link ResourcesTextRequirementSpec instance}.
     */
    public ResourcesTextRequirementSpec options(List<String> options) {
        this.options = options;
        return this;
    }

    /**
     * Adds and item into options.
     * <p>
     * Field description:
     * List of options for the requirement.
     *
     * @param optionsItem The item to be added to the list.
     * @return This {@link ResourcesTextRequirementSpec instance}.
     */
    public ResourcesTextRequirementSpec addOptionsItem(String optionsItem) {
        if (this.options == null) {
            this.options = new ArrayList<>();
        }
        this.options.add(optionsItem);
        return this;
    }

    /**
     * Returns options.
     * <p>
     * Field description:
     * List of options for the requirement.
     *
     * @return options
     */
    @JsonProperty("options")
    public List<String> getOptions() {
        return options;
    }

    /**
     * Sets options.
     * <p>
     * Field description:
     * List of options for the requirement.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(List<String> options) {
        this.options = options;
    }

    /**
     * Sets validation.
     *
     * @param validation
     * @return This {@link ResourcesTextRequirementSpec instance}.
     */
    public ResourcesTextRequirementSpec validation(ResourcesTextRequirementValidation validation) {
        this.validation = validation;
        return this;
    }

    /**
     * Returns validation.
     *
     * @return validation
     */
    @JsonProperty("validation")
    public ResourcesTextRequirementValidation getValidation() {
        return validation;
    }

    /**
     * Sets validation.
     *
     * @param validation
     */
    @JsonProperty("validation")
    public void setValidation(ResourcesTextRequirementValidation validation) {
        this.validation = validation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesTextRequirementSpec resourcesTextRequirementSpec = (ResourcesTextRequirementSpec) o;
        return Objects.equals(this.key, resourcesTextRequirementSpec.key)
                && Objects.equals(this.name, resourcesTextRequirementSpec.name)
                && Objects.equals(this.description, resourcesTextRequirementSpec.description)
                && Objects.equals(this.required, resourcesTextRequirementSpec.required)
                && Objects.equals(this.multipleValuesSupported, resourcesTextRequirementSpec.multipleValuesSupported)
                && Objects.equals(this.category, resourcesTextRequirementSpec.category)
                && Objects.equals(this.options, resourcesTextRequirementSpec.options)
                && Objects.equals(this.validation, resourcesTextRequirementSpec.validation)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                key,
                name,
                description,
                required,
                multipleValuesSupported,
                category,
                options,
                validation,
                super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesTextRequirementSpec {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    key: ")
                .append(toIndentedString(key))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
                .append(newLine)
                .append("    required: ")
                .append(toIndentedString(required))
                .append(newLine)
                .append("    multipleValuesSupported: ")
                .append(toIndentedString(multipleValuesSupported))
                .append(newLine)
                .append("    category: ")
                .append(toIndentedString(category))
                .append(newLine)
                .append("    options: ")
                .append(toIndentedString(options))
                .append(newLine)
                .append("    validation: ")
                .append(toIndentedString(validation))
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
