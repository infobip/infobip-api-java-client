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
 * Represents ResourcesDocumentRequirementSpec model.
 */
public class ResourcesDocumentRequirementSpec extends ResourcesRequirementSpec {

    private String key;

    private String name;

    private String description;

    private Boolean required;

    private Boolean multipleValuesSupported;

    private ResourcesCategory category;

    private ResourcesAttachment attachment;

    /**
     * Constructs a new {@link ResourcesDocumentRequirementSpec} instance.
     */
    public ResourcesDocumentRequirementSpec() {
        super("DOCUMENT");
    }

    /**
     * Sets key.
     * <p>
     * Field description:
     * Key of the requirement.
     *
     * @param key
     * @return This {@link ResourcesDocumentRequirementSpec instance}.
     */
    public ResourcesDocumentRequirementSpec key(String key) {
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
     * @return This {@link ResourcesDocumentRequirementSpec instance}.
     */
    public ResourcesDocumentRequirementSpec name(String name) {
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
     * @return This {@link ResourcesDocumentRequirementSpec instance}.
     */
    public ResourcesDocumentRequirementSpec description(String description) {
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
     * @return This {@link ResourcesDocumentRequirementSpec instance}.
     */
    public ResourcesDocumentRequirementSpec required(Boolean required) {
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
     * @return This {@link ResourcesDocumentRequirementSpec instance}.
     */
    public ResourcesDocumentRequirementSpec multipleValuesSupported(Boolean multipleValuesSupported) {
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
     * @return This {@link ResourcesDocumentRequirementSpec instance}.
     */
    public ResourcesDocumentRequirementSpec category(ResourcesCategory category) {
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
     * Sets attachment.
     *
     * @param attachment
     * @return This {@link ResourcesDocumentRequirementSpec instance}.
     */
    public ResourcesDocumentRequirementSpec attachment(ResourcesAttachment attachment) {
        this.attachment = attachment;
        return this;
    }

    /**
     * Returns attachment.
     *
     * @return attachment
     */
    @JsonProperty("attachment")
    public ResourcesAttachment getAttachment() {
        return attachment;
    }

    /**
     * Sets attachment.
     *
     * @param attachment
     */
    @JsonProperty("attachment")
    public void setAttachment(ResourcesAttachment attachment) {
        this.attachment = attachment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesDocumentRequirementSpec resourcesDocumentRequirementSpec = (ResourcesDocumentRequirementSpec) o;
        return Objects.equals(this.key, resourcesDocumentRequirementSpec.key)
                && Objects.equals(this.name, resourcesDocumentRequirementSpec.name)
                && Objects.equals(this.description, resourcesDocumentRequirementSpec.description)
                && Objects.equals(this.required, resourcesDocumentRequirementSpec.required)
                && Objects.equals(
                        this.multipleValuesSupported, resourcesDocumentRequirementSpec.multipleValuesSupported)
                && Objects.equals(this.category, resourcesDocumentRequirementSpec.category)
                && Objects.equals(this.attachment, resourcesDocumentRequirementSpec.attachment)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                key, name, description, required, multipleValuesSupported, category, attachment, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesDocumentRequirementSpec {")
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
                .append("    attachment: ")
                .append(toIndentedString(attachment))
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
