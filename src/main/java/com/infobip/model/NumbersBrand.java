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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * Represents NumbersBrand model.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = NumbersGovernmentBrand.class, name = "TENDLC_GOVERNMENT"),
    @JsonSubTypes.Type(value = NumbersNonProfitBrand.class, name = "TENDLC_NON_PROFIT"),
    @JsonSubTypes.Type(value = NumbersPrivateCompanyBrand.class, name = "TENDLC_PRIVATE_COMPANY"),
    @JsonSubTypes.Type(value = NumbersPublicCompanyBrand.class, name = "TENDLC_PUBLIC_COMPANY"),
    @JsonSubTypes.Type(value = NumbersTollFreeBrand.class, name = "TOLL_FREE_NUMBER"),
})
public abstract class NumbersBrand {

    private UUID id;

    private String applicationId;

    private String entityId;

    private String name;

    private NumbersBrandStage stage;

    private String website;

    private OffsetDateTime createdDate;

    private OffsetDateTime lastModifiedDate;

    protected final NumbersBrandType type;

    /**
     * Constructs a new {@link NumbersBrand} instance.
     */
    public NumbersBrand(String type) {
        this.type = NumbersBrandType.fromValue(type);
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * The identifier for the brand.
     *
     * @param id
     * @return This {@link NumbersBrand instance}.
     */
    public NumbersBrand id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * The identifier for the brand.
     *
     * @return id
     */
    @JsonProperty("id")
    public UUID getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * The identifier for the brand.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * CPaaS X property identifying an application, a use case or an environment on your system. It should only be set if you are using CPaaS X Applications with your traffic.
     *
     * @param applicationId
     * @return This {@link NumbersBrand instance}.
     */
    public NumbersBrand applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * CPaaS X property identifying an application, a use case or an environment on your system. It should only be set if you are using CPaaS X Applications with your traffic.
     *
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * CPaaS X property identifying an application, a use case or an environment on your system. It should only be set if you are using CPaaS X Applications with your traffic.
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * CPaaS X property identifying an unique actor on your system. Should only be set if you are using CPaaS X Applications with your traffic.
     *
     * @param entityId
     * @return This {@link NumbersBrand instance}.
     */
    public NumbersBrand entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     * <p>
     * Field description:
     * CPaaS X property identifying an unique actor on your system. Should only be set if you are using CPaaS X Applications with your traffic.
     *
     * @return entityId
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * CPaaS X property identifying an unique actor on your system. Should only be set if you are using CPaaS X Applications with your traffic.
     *
     * @param entityId
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * The customer defined name of brand.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link NumbersBrand instance}.
     */
    public NumbersBrand name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * The customer defined name of brand.
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
     * The customer defined name of brand.
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
     * Sets stage.
     *
     * @param stage
     * @return This {@link NumbersBrand instance}.
     */
    public NumbersBrand stage(NumbersBrandStage stage) {
        this.stage = stage;
        return this;
    }

    /**
     * Returns stage.
     *
     * @return stage
     */
    @JsonProperty("stage")
    public NumbersBrandStage getStage() {
        return stage;
    }

    /**
     * Sets stage.
     *
     * @param stage
     */
    @JsonProperty("stage")
    public void setStage(NumbersBrandStage stage) {
        this.stage = stage;
    }

    /**
     * Sets website.
     * <p>
     * Field description:
     * The website for the brand.
     * <p>
     * The field is required.
     *
     * @param website
     * @return This {@link NumbersBrand instance}.
     */
    public NumbersBrand website(String website) {
        this.website = website;
        return this;
    }

    /**
     * Returns website.
     * <p>
     * Field description:
     * The website for the brand.
     * <p>
     * The field is required.
     *
     * @return website
     */
    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    /**
     * Sets website.
     * <p>
     * Field description:
     * The website for the brand.
     * <p>
     * The field is required.
     *
     * @param website
     */
    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * Sets createdDate.
     * <p>
     * Field description:
     * The date and time when the brand was created.
     *
     * @param createdDate
     * @return This {@link NumbersBrand instance}.
     */
    public NumbersBrand createdDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Returns createdDate.
     * <p>
     * Field description:
     * The date and time when the brand was created.
     *
     * @return createdDate
     */
    @JsonProperty("createdDate")
    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets createdDate.
     * <p>
     * Field description:
     * The date and time when the brand was created.
     *
     * @param createdDate
     */
    @JsonProperty("createdDate")
    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Sets lastModifiedDate.
     * <p>
     * Field description:
     * The date and time when the brand was last modified.
     *
     * @param lastModifiedDate
     * @return This {@link NumbersBrand instance}.
     */
    public NumbersBrand lastModifiedDate(OffsetDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * Returns lastModifiedDate.
     * <p>
     * Field description:
     * The date and time when the brand was last modified.
     *
     * @return lastModifiedDate
     */
    @JsonProperty("lastModifiedDate")
    public OffsetDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets lastModifiedDate.
     * <p>
     * Field description:
     * The date and time when the brand was last modified.
     *
     * @param lastModifiedDate
     */
    @JsonProperty("lastModifiedDate")
    public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public NumbersBrandType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersBrand numbersBrand = (NumbersBrand) o;
        return Objects.equals(this.id, numbersBrand.id)
                && Objects.equals(this.applicationId, numbersBrand.applicationId)
                && Objects.equals(this.entityId, numbersBrand.entityId)
                && Objects.equals(this.name, numbersBrand.name)
                && Objects.equals(this.stage, numbersBrand.stage)
                && Objects.equals(this.website, numbersBrand.website)
                && Objects.equals(this.createdDate, numbersBrand.createdDate)
                && Objects.equals(this.lastModifiedDate, numbersBrand.lastModifiedDate)
                && Objects.equals(this.type, numbersBrand.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, applicationId, entityId, name, stage, website, createdDate, lastModifiedDate, type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersBrand {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    entityId: ")
                .append(toIndentedString(entityId))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    stage: ")
                .append(toIndentedString(stage))
                .append(newLine)
                .append("    website: ")
                .append(toIndentedString(website))
                .append(newLine)
                .append("    createdDate: ")
                .append(toIndentedString(createdDate))
                .append(newLine)
                .append("    lastModifiedDate: ")
                .append(toIndentedString(lastModifiedDate))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
