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
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.infobip.RawJsonDeserializer;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Represents CallsSearchResponse model.
 */
public class CallsSearchResponse {

    private OffsetDateTime createTime;

    private String description;

    private String id;

    private String name;

    private String notifyUrl;

    private String notifyContentType;

    private Boolean record;

    @JsonRawValue
    @JsonDeserialize(using = RawJsonDeserializer.class)
    private String script;

    private OffsetDateTime updateTime;

    private LocalDate lastUsageDate;

    /**
     * Sets createTime.
     * <p>
     * Field description:
     * Creation timestamp.
     *
     * @param createTime
     * @return This {@link CallsSearchResponse instance}.
     */
    public CallsSearchResponse createTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Returns createTime.
     * <p>
     * Field description:
     * Creation timestamp.
     *
     * @return createTime
     */
    @JsonProperty("createTime")
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    /**
     * Sets createTime.
     * <p>
     * Field description:
     * Creation timestamp.
     *
     * @param createTime
     */
    @JsonProperty("createTime")
    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Scenario description.
     *
     * @param description
     * @return This {@link CallsSearchResponse instance}.
     */
    public CallsSearchResponse description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Scenario description.
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
     * Scenario description.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Scenario key. It is used for launching IVR scenario.
     *
     * @param id
     * @return This {@link CallsSearchResponse instance}.
     */
    public CallsSearchResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Scenario key. It is used for launching IVR scenario.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Scenario key. It is used for launching IVR scenario.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Scenario name.
     *
     * @param name
     * @return This {@link CallsSearchResponse instance}.
     */
    public CallsSearchResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Scenario name.
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
     * Scenario name.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets notifyUrl.
     * <p>
     * Field description:
     * The URL on the client&#39;s callback server on which the Delivery report will be sent.
     *
     * @param notifyUrl
     * @return This {@link CallsSearchResponse instance}.
     */
    public CallsSearchResponse notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    /**
     * Returns notifyUrl.
     * <p>
     * Field description:
     * The URL on the client&#39;s callback server on which the Delivery report will be sent.
     *
     * @return notifyUrl
     */
    @JsonProperty("notifyUrl")
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * Sets notifyUrl.
     * <p>
     * Field description:
     * The URL on the client&#39;s callback server on which the Delivery report will be sent.
     *
     * @param notifyUrl
     */
    @JsonProperty("notifyUrl")
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * Sets notifyContentType.
     * <p>
     * Field description:
     * Preferred Delivery report content type. Can be &#x60;application/json&#x60; or &#x60;application/xml&#x60;.
     *
     * @param notifyContentType
     * @return This {@link CallsSearchResponse instance}.
     */
    public CallsSearchResponse notifyContentType(String notifyContentType) {
        this.notifyContentType = notifyContentType;
        return this;
    }

    /**
     * Returns notifyContentType.
     * <p>
     * Field description:
     * Preferred Delivery report content type. Can be &#x60;application/json&#x60; or &#x60;application/xml&#x60;.
     *
     * @return notifyContentType
     */
    @JsonProperty("notifyContentType")
    public String getNotifyContentType() {
        return notifyContentType;
    }

    /**
     * Sets notifyContentType.
     * <p>
     * Field description:
     * Preferred Delivery report content type. Can be &#x60;application/json&#x60; or &#x60;application/xml&#x60;.
     *
     * @param notifyContentType
     */
    @JsonProperty("notifyContentType")
    public void setNotifyContentType(String notifyContentType) {
        this.notifyContentType = notifyContentType;
    }

    /**
     * Sets record.
     * <p>
     * Field description:
     * Indicates if all calls using the scenario should be recorded.
     *
     * @param record
     * @return This {@link CallsSearchResponse instance}.
     */
    public CallsSearchResponse record(Boolean record) {
        this.record = record;
        return this;
    }

    /**
     * Returns record.
     * <p>
     * Field description:
     * Indicates if all calls using the scenario should be recorded.
     *
     * @return record
     */
    @JsonProperty("record")
    public Boolean getRecord() {
        return record;
    }

    /**
     * Sets record.
     * <p>
     * Field description:
     * Indicates if all calls using the scenario should be recorded.
     *
     * @param record
     */
    @JsonProperty("record")
    public void setRecord(Boolean record) {
        this.record = record;
    }

    /**
     * Sets script.
     *
     * @param script
     * @return This {@link CallsSearchResponse instance}.
     */
    public CallsSearchResponse script(String script) {
        this.script = script;
        return this;
    }

    /**
     * Returns script.
     *
     * @return script
     */
    @JsonProperty("script")
    public String getScript() {
        return script;
    }

    /**
     * Sets script.
     *
     * @param script
     */
    @JsonProperty("script")
    public void setScript(String script) {
        this.script = script;
    }

    /**
     * Sets updateTime.
     * <p>
     * Field description:
     * Update timestamp
     *
     * @param updateTime
     * @return This {@link CallsSearchResponse instance}.
     */
    public CallsSearchResponse updateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Returns updateTime.
     * <p>
     * Field description:
     * Update timestamp
     *
     * @return updateTime
     */
    @JsonProperty("updateTime")
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * Sets updateTime.
     * <p>
     * Field description:
     * Update timestamp
     *
     * @param updateTime
     */
    @JsonProperty("updateTime")
    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * Sets lastUsageDate.
     * <p>
     * Field description:
     * Last usage date. &#x60;null&#x60; for scenarios that are used last time before &#x60;2024-01-01&#x60;.
     *
     * @param lastUsageDate
     * @return This {@link CallsSearchResponse instance}.
     */
    public CallsSearchResponse lastUsageDate(LocalDate lastUsageDate) {
        this.lastUsageDate = lastUsageDate;
        return this;
    }

    /**
     * Returns lastUsageDate.
     * <p>
     * Field description:
     * Last usage date. &#x60;null&#x60; for scenarios that are used last time before &#x60;2024-01-01&#x60;.
     *
     * @return lastUsageDate
     */
    @JsonProperty("lastUsageDate")
    public LocalDate getLastUsageDate() {
        return lastUsageDate;
    }

    /**
     * Sets lastUsageDate.
     * <p>
     * Field description:
     * Last usage date. &#x60;null&#x60; for scenarios that are used last time before &#x60;2024-01-01&#x60;.
     *
     * @param lastUsageDate
     */
    @JsonProperty("lastUsageDate")
    public void setLastUsageDate(LocalDate lastUsageDate) {
        this.lastUsageDate = lastUsageDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSearchResponse callsSearchResponse = (CallsSearchResponse) o;
        return Objects.equals(this.createTime, callsSearchResponse.createTime)
                && Objects.equals(this.description, callsSearchResponse.description)
                && Objects.equals(this.id, callsSearchResponse.id)
                && Objects.equals(this.name, callsSearchResponse.name)
                && Objects.equals(this.notifyUrl, callsSearchResponse.notifyUrl)
                && Objects.equals(this.notifyContentType, callsSearchResponse.notifyContentType)
                && Objects.equals(this.record, callsSearchResponse.record)
                && Objects.equals(this.script, callsSearchResponse.script)
                && Objects.equals(this.updateTime, callsSearchResponse.updateTime)
                && Objects.equals(this.lastUsageDate, callsSearchResponse.lastUsageDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                createTime,
                description,
                id,
                name,
                notifyUrl,
                notifyContentType,
                record,
                script,
                updateTime,
                lastUsageDate);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSearchResponse {")
                .append(newLine)
                .append("    createTime: ")
                .append(toIndentedString(createTime))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    notifyUrl: ")
                .append(toIndentedString(notifyUrl))
                .append(newLine)
                .append("    notifyContentType: ")
                .append(toIndentedString(notifyContentType))
                .append(newLine)
                .append("    record: ")
                .append(toIndentedString(record))
                .append(newLine)
                .append("    script: ")
                .append(toIndentedString(script))
                .append(newLine)
                .append("    updateTime: ")
                .append(toIndentedString(updateTime))
                .append(newLine)
                .append("    lastUsageDate: ")
                .append(toIndentedString(lastUsageDate))
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
