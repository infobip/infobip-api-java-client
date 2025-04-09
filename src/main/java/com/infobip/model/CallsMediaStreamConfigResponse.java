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
 * Represents CallsMediaStreamConfigResponse model.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CallsMediaStreamingConfigResponse.class, name = "MEDIA_STREAMING"),
    @JsonSubTypes.Type(value = CallsWebsocketEndpointConfigResponse.class, name = "WEBSOCKET_ENDPOINT"),
})
public abstract class CallsMediaStreamConfigResponse {

    private String id;

    protected final CallsResponseMediaStreamConfigType type;

    /**
     * Constructs a new {@link CallsMediaStreamConfigResponse} instance.
     */
    public CallsMediaStreamConfigResponse(String type) {
        this.type = CallsResponseMediaStreamConfigType.fromValue(type);
    }

    private String name;

    private String url;

    /**
     * Sets id.
     * <p>
     * Field description:
     * Media-stream configuration ID.
     *
     * @param id
     * @return This {@link CallsMediaStreamConfigResponse instance}.
     */
    public CallsMediaStreamConfigResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Media-stream configuration ID.
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
     * Media-stream configuration ID.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public CallsResponseMediaStreamConfigType getType() {
        return type;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * Media-stream configuration name.
     *
     * @param name
     * @return This {@link CallsMediaStreamConfigResponse instance}.
     */
    public CallsMediaStreamConfigResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * Media-stream configuration name.
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
     *
     * @param url
     * @return This {@link CallsMediaStreamConfigResponse instance}.
     */
    public CallsMediaStreamConfigResponse url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * Destination websocket or load balancer URL.
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
        CallsMediaStreamConfigResponse callsMediaStreamConfigResponse = (CallsMediaStreamConfigResponse) o;
        return Objects.equals(this.id, callsMediaStreamConfigResponse.id)
                && Objects.equals(this.type, callsMediaStreamConfigResponse.type)
                && Objects.equals(this.name, callsMediaStreamConfigResponse.name)
                && Objects.equals(this.url, callsMediaStreamConfigResponse.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, name, url);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsMediaStreamConfigResponse {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
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
