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
 * Properties of the media stream finished event.
 */
public class CallsMediaStreamFinishedProperties {

    private String configId;

    private String reason;

    /**
     * Sets configId.
     * <p>
     * Field description:
     * Media-stream configuration ID.
     *
     * @param configId
     * @return This {@link CallsMediaStreamFinishedProperties instance}.
     */
    public CallsMediaStreamFinishedProperties configId(String configId) {
        this.configId = configId;
        return this;
    }

    /**
     * Returns configId.
     * <p>
     * Field description:
     * Media-stream configuration ID.
     *
     * @return configId
     */
    @JsonProperty("configId")
    public String getConfigId() {
        return configId;
    }

    /**
     * Sets configId.
     * <p>
     * Field description:
     * Media-stream configuration ID.
     *
     * @param configId
     */
    @JsonProperty("configId")
    public void setConfigId(String configId) {
        this.configId = configId;
    }

    /**
     * Sets reason.
     * <p>
     * Field description:
     * Media stream connection closed: additional info.
     *
     * @param reason
     * @return This {@link CallsMediaStreamFinishedProperties instance}.
     */
    public CallsMediaStreamFinishedProperties reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Returns reason.
     * <p>
     * Field description:
     * Media stream connection closed: additional info.
     *
     * @return reason
     */
    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Sets reason.
     * <p>
     * Field description:
     * Media stream connection closed: additional info.
     *
     * @param reason
     */
    @JsonProperty("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsMediaStreamFinishedProperties callsMediaStreamFinishedProperties = (CallsMediaStreamFinishedProperties) o;
        return Objects.equals(this.configId, callsMediaStreamFinishedProperties.configId)
                && Objects.equals(this.reason, callsMediaStreamFinishedProperties.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configId, reason);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsMediaStreamFinishedProperties {")
                .append(newLine)
                .append("    configId: ")
                .append(toIndentedString(configId))
                .append(newLine)
                .append("    reason: ")
                .append(toIndentedString(reason))
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
