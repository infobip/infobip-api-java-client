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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents Call model.
 */
public class Call {

    private String id;

    private CallEndpoint endpoint;

    private String from;

    private String to;

    private CallDirection direction;

    private CallState state;

    private CallsMediaProperties media;

    private OffsetDateTime startTime;

    private OffsetDateTime answerTime;

    private OffsetDateTime endTime;

    private String parentCallId;

    private CallsMachineDetectionProperties machineDetection;

    private Integer ringDuration;

    private String callsConfigurationId;

    private Platform platform;

    private String conferenceId;

    private Map<String, String> customData = null;

    private String dialogId;

    private String externalId;

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique call ID.
     *
     * @param id
     * @return This {@link Call instance}.
     */
    public Call id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Unique call ID.
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
     * Unique call ID.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets endpoint.
     * <p>
     * The field is required.
     *
     * @param endpoint
     * @return This {@link Call instance}.
     */
    public Call endpoint(CallEndpoint endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Returns endpoint.
     * <p>
     * The field is required.
     *
     * @return endpoint
     */
    @JsonProperty("endpoint")
    public CallEndpoint getEndpoint() {
        return endpoint;
    }

    /**
     * Sets endpoint.
     * <p>
     * The field is required.
     *
     * @param endpoint
     */
    @JsonProperty("endpoint")
    public void setEndpoint(CallEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Caller ID.
     *
     * @param from
     * @return This {@link Call instance}.
     */
    public Call from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Caller ID.
     *
     * @return from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Caller ID.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Callee ID.
     *
     * @param to
     * @return This {@link Call instance}.
     */
    public Call to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Callee ID.
     *
     * @return to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Callee ID.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets direction.
     *
     * @param direction
     * @return This {@link Call instance}.
     */
    public Call direction(CallDirection direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Returns direction.
     *
     * @return direction
     */
    @JsonProperty("direction")
    public CallDirection getDirection() {
        return direction;
    }

    /**
     * Sets direction.
     *
     * @param direction
     */
    @JsonProperty("direction")
    public void setDirection(CallDirection direction) {
        this.direction = direction;
    }

    /**
     * Sets state.
     *
     * @param state
     * @return This {@link Call instance}.
     */
    public Call state(CallState state) {
        this.state = state;
        return this;
    }

    /**
     * Returns state.
     *
     * @return state
     */
    @JsonProperty("state")
    public CallState getState() {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state
     */
    @JsonProperty("state")
    public void setState(CallState state) {
        this.state = state;
    }

    /**
     * Sets media.
     *
     * @param media
     * @return This {@link Call instance}.
     */
    public Call media(CallsMediaProperties media) {
        this.media = media;
        return this;
    }

    /**
     * Returns media.
     *
     * @return media
     */
    @JsonProperty("media")
    public CallsMediaProperties getMedia() {
        return media;
    }

    /**
     * Sets media.
     *
     * @param media
     */
    @JsonProperty("media")
    public void setMedia(CallsMediaProperties media) {
        this.media = media;
    }

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * Date and time for when the call has been created.
     *
     * @param startTime
     * @return This {@link Call instance}.
     */
    public Call startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Returns startTime.
     * <p>
     * Field description:
     * Date and time for when the call has been created.
     *
     * @return startTime
     */
    @JsonProperty("startTime")
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * Date and time for when the call has been created.
     *
     * @param startTime
     */
    @JsonProperty("startTime")
    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Sets answerTime.
     * <p>
     * Field description:
     * Date and time for when the call has been answered.
     *
     * @param answerTime
     * @return This {@link Call instance}.
     */
    public Call answerTime(OffsetDateTime answerTime) {
        this.answerTime = answerTime;
        return this;
    }

    /**
     * Returns answerTime.
     * <p>
     * Field description:
     * Date and time for when the call has been answered.
     *
     * @return answerTime
     */
    @JsonProperty("answerTime")
    public OffsetDateTime getAnswerTime() {
        return answerTime;
    }

    /**
     * Sets answerTime.
     * <p>
     * Field description:
     * Date and time for when the call has been answered.
     *
     * @param answerTime
     */
    @JsonProperty("answerTime")
    public void setAnswerTime(OffsetDateTime answerTime) {
        this.answerTime = answerTime;
    }

    /**
     * Sets endTime.
     * <p>
     * Field description:
     * Date and time for when the call has been finished.
     *
     * @param endTime
     * @return This {@link Call instance}.
     */
    public Call endTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Returns endTime.
     * <p>
     * Field description:
     * Date and time for when the call has been finished.
     *
     * @return endTime
     */
    @JsonProperty("endTime")
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    /**
     * Sets endTime.
     * <p>
     * Field description:
     * Date and time for when the call has been finished.
     *
     * @param endTime
     */
    @JsonProperty("endTime")
    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * Sets parentCallId.
     * <p>
     * Field description:
     * Parent call ID.
     *
     * @param parentCallId
     * @return This {@link Call instance}.
     */
    public Call parentCallId(String parentCallId) {
        this.parentCallId = parentCallId;
        return this;
    }

    /**
     * Returns parentCallId.
     * <p>
     * Field description:
     * Parent call ID.
     *
     * @return parentCallId
     */
    @JsonProperty("parentCallId")
    public String getParentCallId() {
        return parentCallId;
    }

    /**
     * Sets parentCallId.
     * <p>
     * Field description:
     * Parent call ID.
     *
     * @param parentCallId
     */
    @JsonProperty("parentCallId")
    public void setParentCallId(String parentCallId) {
        this.parentCallId = parentCallId;
    }

    /**
     * Sets machineDetection.
     *
     * @param machineDetection
     * @return This {@link Call instance}.
     */
    public Call machineDetection(CallsMachineDetectionProperties machineDetection) {
        this.machineDetection = machineDetection;
        return this;
    }

    /**
     * Returns machineDetection.
     *
     * @return machineDetection
     */
    @JsonProperty("machineDetection")
    public CallsMachineDetectionProperties getMachineDetection() {
        return machineDetection;
    }

    /**
     * Sets machineDetection.
     *
     * @param machineDetection
     */
    @JsonProperty("machineDetection")
    public void setMachineDetection(CallsMachineDetectionProperties machineDetection) {
        this.machineDetection = machineDetection;
    }

    /**
     * Sets ringDuration.
     * <p>
     * Field description:
     * Ringing duration in seconds.
     *
     * @param ringDuration
     * @return This {@link Call instance}.
     */
    public Call ringDuration(Integer ringDuration) {
        this.ringDuration = ringDuration;
        return this;
    }

    /**
     * Returns ringDuration.
     * <p>
     * Field description:
     * Ringing duration in seconds.
     *
     * @return ringDuration
     */
    @JsonProperty("ringDuration")
    public Integer getRingDuration() {
        return ringDuration;
    }

    /**
     * Sets ringDuration.
     * <p>
     * Field description:
     * Ringing duration in seconds.
     *
     * @param ringDuration
     */
    @JsonProperty("ringDuration")
    public void setRingDuration(Integer ringDuration) {
        this.ringDuration = ringDuration;
    }

    /**
     * Sets callsConfigurationId.
     * <p>
     * Field description:
     * Current calls configuration ID.
     *
     * @param callsConfigurationId
     * @return This {@link Call instance}.
     */
    public Call callsConfigurationId(String callsConfigurationId) {
        this.callsConfigurationId = callsConfigurationId;
        return this;
    }

    /**
     * Returns callsConfigurationId.
     * <p>
     * Field description:
     * Current calls configuration ID.
     *
     * @return callsConfigurationId
     */
    @JsonProperty("callsConfigurationId")
    public String getCallsConfigurationId() {
        return callsConfigurationId;
    }

    /**
     * Sets callsConfigurationId.
     * <p>
     * Field description:
     * Current calls configuration ID.
     *
     * @param callsConfigurationId
     */
    @JsonProperty("callsConfigurationId")
    public void setCallsConfigurationId(String callsConfigurationId) {
        this.callsConfigurationId = callsConfigurationId;
    }

    /**
     * Sets platform.
     *
     * @param platform
     * @return This {@link Call instance}.
     */
    public Call platform(Platform platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Returns platform.
     *
     * @return platform
     */
    @JsonProperty("platform")
    public Platform getPlatform() {
        return platform;
    }

    /**
     * Sets platform.
     *
     * @param platform
     */
    @JsonProperty("platform")
    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    /**
     * Sets conferenceId.
     * <p>
     * Field description:
     * Current conference ID.
     *
     * @param conferenceId
     * @return This {@link Call instance}.
     */
    public Call conferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
        return this;
    }

    /**
     * Returns conferenceId.
     * <p>
     * Field description:
     * Current conference ID.
     *
     * @return conferenceId
     */
    @JsonProperty("conferenceId")
    public String getConferenceId() {
        return conferenceId;
    }

    /**
     * Sets conferenceId.
     * <p>
     * Field description:
     * Current conference ID.
     *
     * @param conferenceId
     */
    @JsonProperty("conferenceId")
    public void setConferenceId(String conferenceId) {
        this.conferenceId = conferenceId;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param customData
     * @return This {@link Call instance}.
     */
    public Call customData(Map<String, String> customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Puts and entry into customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param key The given key.
     * @param customDataItem The item to be associated with the given key.
     * @return This {@link Call instance}.
     */
    public Call putCustomDataItem(String key, String customDataItem) {
        if (this.customData == null) {
            this.customData = new HashMap<>();
        }
        this.customData.put(key, customDataItem);
        return this;
    }

    /**
     * Returns customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @return customData
     */
    @JsonProperty("customData")
    public Map<String, String> getCustomData() {
        return customData;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Custom data.
     *
     * @param customData
     */
    @JsonProperty("customData")
    public void setCustomData(Map<String, String> customData) {
        this.customData = customData;
    }

    /**
     * Sets dialogId.
     * <p>
     * Field description:
     * Dialog ID.
     *
     * @param dialogId
     * @return This {@link Call instance}.
     */
    public Call dialogId(String dialogId) {
        this.dialogId = dialogId;
        return this;
    }

    /**
     * Returns dialogId.
     * <p>
     * Field description:
     * Dialog ID.
     *
     * @return dialogId
     */
    @JsonProperty("dialogId")
    public String getDialogId() {
        return dialogId;
    }

    /**
     * Sets dialogId.
     * <p>
     * Field description:
     * Dialog ID.
     *
     * @param dialogId
     */
    @JsonProperty("dialogId")
    public void setDialogId(String dialogId) {
        this.dialogId = dialogId;
    }

    /**
     * Sets externalId.
     * <p>
     * Field description:
     * Client defined call ID.
     *
     * @param externalId
     * @return This {@link Call instance}.
     */
    public Call externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * Returns externalId.
     * <p>
     * Field description:
     * Client defined call ID.
     *
     * @return externalId
     */
    @JsonProperty("externalId")
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets externalId.
     * <p>
     * Field description:
     * Client defined call ID.
     *
     * @param externalId
     */
    @JsonProperty("externalId")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Call call = (Call) o;
        return Objects.equals(this.id, call.id)
                && Objects.equals(this.endpoint, call.endpoint)
                && Objects.equals(this.from, call.from)
                && Objects.equals(this.to, call.to)
                && Objects.equals(this.direction, call.direction)
                && Objects.equals(this.state, call.state)
                && Objects.equals(this.media, call.media)
                && Objects.equals(this.startTime, call.startTime)
                && Objects.equals(this.answerTime, call.answerTime)
                && Objects.equals(this.endTime, call.endTime)
                && Objects.equals(this.parentCallId, call.parentCallId)
                && Objects.equals(this.machineDetection, call.machineDetection)
                && Objects.equals(this.ringDuration, call.ringDuration)
                && Objects.equals(this.callsConfigurationId, call.callsConfigurationId)
                && Objects.equals(this.platform, call.platform)
                && Objects.equals(this.conferenceId, call.conferenceId)
                && Objects.equals(this.customData, call.customData)
                && Objects.equals(this.dialogId, call.dialogId)
                && Objects.equals(this.externalId, call.externalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                endpoint,
                from,
                to,
                direction,
                state,
                media,
                startTime,
                answerTime,
                endTime,
                parentCallId,
                machineDetection,
                ringDuration,
                callsConfigurationId,
                platform,
                conferenceId,
                customData,
                dialogId,
                externalId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class Call {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    endpoint: ")
                .append(toIndentedString(endpoint))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    direction: ")
                .append(toIndentedString(direction))
                .append(newLine)
                .append("    state: ")
                .append(toIndentedString(state))
                .append(newLine)
                .append("    media: ")
                .append(toIndentedString(media))
                .append(newLine)
                .append("    startTime: ")
                .append(toIndentedString(startTime))
                .append(newLine)
                .append("    answerTime: ")
                .append(toIndentedString(answerTime))
                .append(newLine)
                .append("    endTime: ")
                .append(toIndentedString(endTime))
                .append(newLine)
                .append("    parentCallId: ")
                .append(toIndentedString(parentCallId))
                .append(newLine)
                .append("    machineDetection: ")
                .append(toIndentedString(machineDetection))
                .append(newLine)
                .append("    ringDuration: ")
                .append(toIndentedString(ringDuration))
                .append(newLine)
                .append("    callsConfigurationId: ")
                .append(toIndentedString(callsConfigurationId))
                .append(newLine)
                .append("    platform: ")
                .append(toIndentedString(platform))
                .append(newLine)
                .append("    conferenceId: ")
                .append(toIndentedString(conferenceId))
                .append(newLine)
                .append("    customData: ")
                .append(toIndentedString(customData))
                .append(newLine)
                .append("    dialogId: ")
                .append(toIndentedString(dialogId))
                .append(newLine)
                .append("    externalId: ")
                .append(toIndentedString(externalId))
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
