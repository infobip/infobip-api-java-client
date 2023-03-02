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
 * Represents CallsAddExistingCallRequest model.
 */
public class CallsAddExistingCallRequest {

    private Boolean connectOnEarlyMedia;

    /**
     * Sets connectOnEarlyMedia.
     * <p>
     * Field description:
     * Indicates whether to add an existing call on early media. Otherwise, the call will be added after being established. This field is applicable for &#x60;OUTBOUND&#x60; calls only.
     *
     * @param connectOnEarlyMedia
     * @return This {@link CallsAddExistingCallRequest instance}.
     */
    public CallsAddExistingCallRequest connectOnEarlyMedia(Boolean connectOnEarlyMedia) {
        this.connectOnEarlyMedia = connectOnEarlyMedia;
        return this;
    }

    /**
     * Returns connectOnEarlyMedia.
     * <p>
     * Field description:
     * Indicates whether to add an existing call on early media. Otherwise, the call will be added after being established. This field is applicable for &#x60;OUTBOUND&#x60; calls only.
     *
     * @return connectOnEarlyMedia
     */
    @JsonProperty("connectOnEarlyMedia")
    public Boolean getConnectOnEarlyMedia() {
        return connectOnEarlyMedia;
    }

    /**
     * Sets connectOnEarlyMedia.
     * <p>
     * Field description:
     * Indicates whether to add an existing call on early media. Otherwise, the call will be added after being established. This field is applicable for &#x60;OUTBOUND&#x60; calls only.
     *
     * @param connectOnEarlyMedia
     */
    @JsonProperty("connectOnEarlyMedia")
    public void setConnectOnEarlyMedia(Boolean connectOnEarlyMedia) {
        this.connectOnEarlyMedia = connectOnEarlyMedia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsAddExistingCallRequest callsAddExistingCallRequest = (CallsAddExistingCallRequest) o;
        return Objects.equals(this.connectOnEarlyMedia, callsAddExistingCallRequest.connectOnEarlyMedia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectOnEarlyMedia);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsAddExistingCallRequest {")
                .append(newLine)
                .append("    connectOnEarlyMedia: ")
                .append(toIndentedString(connectOnEarlyMedia))
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
