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
 * Properties of the media stream started event.
 */
public class CallsMediaStreamStartedProperties {

    private String configId;

    private String streamId;

    /**
     * Sets configId.
     * <p>
     * Field description:
     * Media-stream configuration ID.
     *
     * @param configId
     * @return This {@link CallsMediaStreamStartedProperties instance}.
     */
    public CallsMediaStreamStartedProperties configId(String configId) {
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
     * Sets streamId.
     * <p>
     * Field description:
     * Unique stream identifier.
     *
     * @param streamId
     * @return This {@link CallsMediaStreamStartedProperties instance}.
     */
    public CallsMediaStreamStartedProperties streamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /**
     * Returns streamId.
     * <p>
     * Field description:
     * Unique stream identifier.
     *
     * @return streamId
     */
    @JsonProperty("streamId")
    public String getStreamId() {
        return streamId;
    }

    /**
     * Sets streamId.
     * <p>
     * Field description:
     * Unique stream identifier.
     *
     * @param streamId
     */
    @JsonProperty("streamId")
    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsMediaStreamStartedProperties callsMediaStreamStartedProperties = (CallsMediaStreamStartedProperties) o;
        return Objects.equals(this.configId, callsMediaStreamStartedProperties.configId)
                && Objects.equals(this.streamId, callsMediaStreamStartedProperties.streamId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configId, streamId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsMediaStreamStartedProperties {")
                .append(newLine)
                .append("    configId: ")
                .append(toIndentedString(configId))
                .append(newLine)
                .append("    streamId: ")
                .append(toIndentedString(streamId))
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
