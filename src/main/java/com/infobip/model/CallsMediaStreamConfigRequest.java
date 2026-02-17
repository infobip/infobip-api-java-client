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
import java.util.Objects;

/**
 * Represents CallsMediaStreamConfigRequest model.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CallsMediaStreamingConfigRequest.class, name = "MEDIA_STREAMING"),
    @JsonSubTypes.Type(value = CallsWebsocketEndpointConfigRequest.class, name = "WEBSOCKET_ENDPOINT"),
})
public abstract class CallsMediaStreamConfigRequest {

    protected final CallsRequestMediaStreamConfigType type;

    /**
     * Constructs a new {@link CallsMediaStreamConfigRequest} instance.
     */
    public CallsMediaStreamConfigRequest(String type) {
        this.type = CallsRequestMediaStreamConfigType.fromValue(type);
    }

    private String name;

    private String url;

    /**
     * Returns type.
     * <p>
     * The field is required.
     *
     * @return type
     */
    @JsonProperty("type")
    public CallsRequestMediaStreamConfigType getType() {
        return type;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Media-stream configuration name.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link CallsMediaStreamConfigRequest instance}.
     */
    public CallsMediaStreamConfigRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Media-stream configuration name.
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
     * Media-stream configuration name.
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
     * Sets url.
     * <p>
     * Field description:
     * Destination websocket or load balancer URL.
     * <p>
     * The field is required.
     *
     * @param url
     * @return This {@link CallsMediaStreamConfigRequest instance}.
     */
    public CallsMediaStreamConfigRequest url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * Destination websocket or load balancer URL.
     * <p>
     * The field is required.
     *
     * @return url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * Destination websocket or load balancer URL.
     * <p>
     * The field is required.
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsMediaStreamConfigRequest callsMediaStreamConfigRequest = (CallsMediaStreamConfigRequest) o;
        return Objects.equals(this.type, callsMediaStreamConfigRequest.type)
                && Objects.equals(this.name, callsMediaStreamConfigRequest.name)
                && Objects.equals(this.url, callsMediaStreamConfigRequest.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, name, url);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsMediaStreamConfigRequest {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
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
