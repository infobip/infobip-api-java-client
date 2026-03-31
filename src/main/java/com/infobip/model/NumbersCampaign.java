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
 * Represents NumbersCampaign model.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = NumbersExternalTenDlcCampaign.class, name = "EXTERNAL_TEN_DIGIT_LONG_CODE"),
    @JsonSubTypes.Type(value = NumbersTenDlcCampaign.class, name = "TEN_DIGIT_LONG_CODE"),
    @JsonSubTypes.Type(value = NumbersTollFreeCampaign.class, name = "TOLL_FREE_NUMBER"),
})
public abstract class NumbersCampaign {

    private UUID id;

    private String referenceId;

    private String applicationId;

    private String entityId;

    private String name;

    private OffsetDateTime createdDate;

    private OffsetDateTime lastModifiedDate;

    private NumbersCampaignStage stage;

    private NumbersPriorityInfo priority;

    private NumbersCampaignFeedback campaignFeedback;

    protected final NumbersCampaignType type;

    /**
     * Constructs a new {@link NumbersCampaign} instance.
     */
    public NumbersCampaign(String type) {
        this.type = NumbersCampaignType.fromValue(type);
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * The identifier for the campaign.
     *
     * @param id
     * @return This {@link NumbersCampaign instance}.
     */
    public NumbersCampaign id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * The identifier for the campaign.
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
     * The identifier for the campaign.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Sets referenceId.
     * <p>
     * Field description:
     * Unique user defined ID for the campaign. While not required, it is recommended to supply a referenceId as the uniqueness constraint will help ensure a campaign is not accidentally created multiple times. Subsequent create requests with the same referenceId will be rejected with an error.
     *
     * @param referenceId
     * @return This {@link NumbersCampaign instance}.
     */
    public NumbersCampaign referenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }

    /**
     * Returns referenceId.
     * <p>
     * Field description:
     * Unique user defined ID for the campaign. While not required, it is recommended to supply a referenceId as the uniqueness constraint will help ensure a campaign is not accidentally created multiple times. Subsequent create requests with the same referenceId will be rejected with an error.
     *
     * @return referenceId
     */
    @JsonProperty("referenceId")
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets referenceId.
     * <p>
     * Field description:
     * Unique user defined ID for the campaign. While not required, it is recommended to supply a referenceId as the uniqueness constraint will help ensure a campaign is not accidentally created multiple times. Subsequent create requests with the same referenceId will be rejected with an error.
     *
     * @param referenceId
     */
    @JsonProperty("referenceId")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * CPaaS X property identifying an application, a use case or an environment on your system. It should only be set if you are using CPaaS X Applications with your traffic.
     *
     * @param applicationId
     * @return This {@link NumbersCampaign instance}.
     */
    public NumbersCampaign applicationId(String applicationId) {
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
     * @return This {@link NumbersCampaign instance}.
     */
    public NumbersCampaign entityId(String entityId) {
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
     * The name of the campaign.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link NumbersCampaign instance}.
     */
    public NumbersCampaign name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * The name of the campaign.
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
     * The name of the campaign.
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
     * Sets createdDate.
     * <p>
     * Field description:
     * The date and time when the campaign was created.
     *
     * @param createdDate
     * @return This {@link NumbersCampaign instance}.
     */
    public NumbersCampaign createdDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Returns createdDate.
     * <p>
     * Field description:
     * The date and time when the campaign was created.
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
     * The date and time when the campaign was created.
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
     * The date and time when the campaign was last modified.
     *
     * @param lastModifiedDate
     * @return This {@link NumbersCampaign instance}.
     */
    public NumbersCampaign lastModifiedDate(OffsetDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * Returns lastModifiedDate.
     * <p>
     * Field description:
     * The date and time when the campaign was last modified.
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
     * The date and time when the campaign was last modified.
     *
     * @param lastModifiedDate
     */
    @JsonProperty("lastModifiedDate")
    public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * Sets stage.
     *
     * @param stage
     * @return This {@link NumbersCampaign instance}.
     */
    public NumbersCampaign stage(NumbersCampaignStage stage) {
        this.stage = stage;
        return this;
    }

    /**
     * Returns stage.
     *
     * @return stage
     */
    @JsonProperty("stage")
    public NumbersCampaignStage getStage() {
        return stage;
    }

    /**
     * Sets stage.
     *
     * @param stage
     */
    @JsonProperty("stage")
    public void setStage(NumbersCampaignStage stage) {
        this.stage = stage;
    }

    /**
     * Sets priority.
     *
     * @param priority
     * @return This {@link NumbersCampaign instance}.
     */
    public NumbersCampaign priority(NumbersPriorityInfo priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Returns priority.
     *
     * @return priority
     */
    @JsonProperty("priority")
    public NumbersPriorityInfo getPriority() {
        return priority;
    }

    /**
     * Sets priority.
     *
     * @param priority
     */
    @JsonProperty("priority")
    public void setPriority(NumbersPriorityInfo priority) {
        this.priority = priority;
    }

    /**
     * Sets campaignFeedback.
     *
     * @param campaignFeedback
     * @return This {@link NumbersCampaign instance}.
     */
    public NumbersCampaign campaignFeedback(NumbersCampaignFeedback campaignFeedback) {
        this.campaignFeedback = campaignFeedback;
        return this;
    }

    /**
     * Returns campaignFeedback.
     *
     * @return campaignFeedback
     */
    @JsonProperty("campaignFeedback")
    public NumbersCampaignFeedback getCampaignFeedback() {
        return campaignFeedback;
    }

    /**
     * Sets campaignFeedback.
     *
     * @param campaignFeedback
     */
    @JsonProperty("campaignFeedback")
    public void setCampaignFeedback(NumbersCampaignFeedback campaignFeedback) {
        this.campaignFeedback = campaignFeedback;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public NumbersCampaignType getType() {
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
        NumbersCampaign numbersCampaign = (NumbersCampaign) o;
        return Objects.equals(this.id, numbersCampaign.id)
                && Objects.equals(this.referenceId, numbersCampaign.referenceId)
                && Objects.equals(this.applicationId, numbersCampaign.applicationId)
                && Objects.equals(this.entityId, numbersCampaign.entityId)
                && Objects.equals(this.name, numbersCampaign.name)
                && Objects.equals(this.createdDate, numbersCampaign.createdDate)
                && Objects.equals(this.lastModifiedDate, numbersCampaign.lastModifiedDate)
                && Objects.equals(this.stage, numbersCampaign.stage)
                && Objects.equals(this.priority, numbersCampaign.priority)
                && Objects.equals(this.campaignFeedback, numbersCampaign.campaignFeedback)
                && Objects.equals(this.type, numbersCampaign.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                referenceId,
                applicationId,
                entityId,
                name,
                createdDate,
                lastModifiedDate,
                stage,
                priority,
                campaignFeedback,
                type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersCampaign {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    referenceId: ")
                .append(toIndentedString(referenceId))
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
                .append("    createdDate: ")
                .append(toIndentedString(createdDate))
                .append(newLine)
                .append("    lastModifiedDate: ")
                .append(toIndentedString(lastModifiedDate))
                .append(newLine)
                .append("    stage: ")
                .append(toIndentedString(stage))
                .append(newLine)
                .append("    priority: ")
                .append(toIndentedString(priority))
                .append(newLine)
                .append("    campaignFeedback: ")
                .append(toIndentedString(campaignFeedback))
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
