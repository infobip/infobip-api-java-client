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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents WebRtcWebhookEventPayload model.
 */
public class WebRtcWebhookEventPayload {

    private String callLinkId;

    private String callLinkConfigId;

    private WebRtcCallDetails callDetails;

    private Map<String, String> customData = null;

    private ClientRecording recording;

    private WebRtcErrorCode errorCode;

    /**
     * Sets callLinkId.
     * <p>
     * Field description:
     * Id of the used call link.
     *
     * @param callLinkId
     * @return This {@link WebRtcWebhookEventPayload instance}.
     */
    public WebRtcWebhookEventPayload callLinkId(String callLinkId) {
        this.callLinkId = callLinkId;
        return this;
    }

    /**
     * Returns callLinkId.
     * <p>
     * Field description:
     * Id of the used call link.
     *
     * @return callLinkId
     */
    @JsonProperty("callLinkId")
    public String getCallLinkId() {
        return callLinkId;
    }

    /**
     * Sets callLinkId.
     * <p>
     * Field description:
     * Id of the used call link.
     *
     * @param callLinkId
     */
    @JsonProperty("callLinkId")
    public void setCallLinkId(String callLinkId) {
        this.callLinkId = callLinkId;
    }

    /**
     * Sets callLinkConfigId.
     * <p>
     * Field description:
     * Id of the call link configuration used.
     *
     * @param callLinkConfigId
     * @return This {@link WebRtcWebhookEventPayload instance}.
     */
    public WebRtcWebhookEventPayload callLinkConfigId(String callLinkConfigId) {
        this.callLinkConfigId = callLinkConfigId;
        return this;
    }

    /**
     * Returns callLinkConfigId.
     * <p>
     * Field description:
     * Id of the call link configuration used.
     *
     * @return callLinkConfigId
     */
    @JsonProperty("callLinkConfigId")
    public String getCallLinkConfigId() {
        return callLinkConfigId;
    }

    /**
     * Sets callLinkConfigId.
     * <p>
     * Field description:
     * Id of the call link configuration used.
     *
     * @param callLinkConfigId
     */
    @JsonProperty("callLinkConfigId")
    public void setCallLinkConfigId(String callLinkConfigId) {
        this.callLinkConfigId = callLinkConfigId;
    }

    /**
     * Sets callDetails.
     *
     * @param callDetails
     * @return This {@link WebRtcWebhookEventPayload instance}.
     */
    public WebRtcWebhookEventPayload callDetails(WebRtcCallDetails callDetails) {
        this.callDetails = callDetails;
        return this;
    }

    /**
     * Returns callDetails.
     *
     * @return callDetails
     */
    @JsonProperty("callDetails")
    public WebRtcCallDetails getCallDetails() {
        return callDetails;
    }

    /**
     * Sets callDetails.
     *
     * @param callDetails
     */
    @JsonProperty("callDetails")
    public void setCallDetails(WebRtcCallDetails callDetails) {
        this.callDetails = callDetails;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Custom attributes sent in a call once it has started.
     *
     * @param customData
     * @return This {@link WebRtcWebhookEventPayload instance}.
     */
    public WebRtcWebhookEventPayload customData(Map<String, String> customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Puts and entry into customData.
     * <p>
     * Field description:
     * Custom attributes sent in a call once it has started.
     *
     * @param key The given key.
     * @param customDataItem The item to be associated with the given key.
     * @return This {@link WebRtcWebhookEventPayload instance}.
     */
    public WebRtcWebhookEventPayload putCustomDataItem(String key, String customDataItem) {
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
     * Custom attributes sent in a call once it has started.
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
     * Custom attributes sent in a call once it has started.
     *
     * @param customData
     */
    @JsonProperty("customData")
    public void setCustomData(Map<String, String> customData) {
        this.customData = customData;
    }

    /**
     * Sets recording.
     *
     * @param recording
     * @return This {@link WebRtcWebhookEventPayload instance}.
     */
    public WebRtcWebhookEventPayload recording(ClientRecording recording) {
        this.recording = recording;
        return this;
    }

    /**
     * Returns recording.
     *
     * @return recording
     */
    @JsonProperty("recording")
    public ClientRecording getRecording() {
        return recording;
    }

    /**
     * Sets recording.
     *
     * @param recording
     */
    @JsonProperty("recording")
    public void setRecording(ClientRecording recording) {
        this.recording = recording;
    }

    /**
     * Sets errorCode.
     *
     * @param errorCode
     * @return This {@link WebRtcWebhookEventPayload instance}.
     */
    public WebRtcWebhookEventPayload errorCode(WebRtcErrorCode errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Returns errorCode.
     *
     * @return errorCode
     */
    @JsonProperty("errorCode")
    public WebRtcErrorCode getErrorCode() {
        return errorCode;
    }

    /**
     * Sets errorCode.
     *
     * @param errorCode
     */
    @JsonProperty("errorCode")
    public void setErrorCode(WebRtcErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcWebhookEventPayload webRtcWebhookEventPayload = (WebRtcWebhookEventPayload) o;
        return Objects.equals(this.callLinkId, webRtcWebhookEventPayload.callLinkId)
                && Objects.equals(this.callLinkConfigId, webRtcWebhookEventPayload.callLinkConfigId)
                && Objects.equals(this.callDetails, webRtcWebhookEventPayload.callDetails)
                && Objects.equals(this.customData, webRtcWebhookEventPayload.customData)
                && Objects.equals(this.recording, webRtcWebhookEventPayload.recording)
                && Objects.equals(this.errorCode, webRtcWebhookEventPayload.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callLinkId, callLinkConfigId, callDetails, customData, recording, errorCode);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcWebhookEventPayload {")
                .append(newLine)
                .append("    callLinkId: ")
                .append(toIndentedString(callLinkId))
                .append(newLine)
                .append("    callLinkConfigId: ")
                .append(toIndentedString(callLinkConfigId))
                .append(newLine)
                .append("    callDetails: ")
                .append(toIndentedString(callDetails))
                .append(newLine)
                .append("    customData: ")
                .append(toIndentedString(customData))
                .append(newLine)
                .append("    recording: ")
                .append(toIndentedString(recording))
                .append(newLine)
                .append("    errorCode: ")
                .append(toIndentedString(errorCode))
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
