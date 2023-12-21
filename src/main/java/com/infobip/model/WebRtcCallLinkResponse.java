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
 * Represents WebRtcCallLinkResponse model.
 */
public class WebRtcCallLinkResponse {

    private String id;

    private String url;

    /**
     * Sets id.
     * <p>
     * Field description:
     * Identifier of the created call. Call link ID. To open a call link, an ID will be concatenated to the URL: https://call-link.com/.
     *
     * @param id
     * @return This {@link WebRtcCallLinkResponse instance}.
     */
    public WebRtcCallLinkResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Identifier of the created call. Call link ID. To open a call link, an ID will be concatenated to the URL: https://call-link.com/.
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
     * Identifier of the created call. Call link ID. To open a call link, an ID will be concatenated to the URL: https://call-link.com/.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * A URL to initiate the call.
     *
     * @param url
     * @return This {@link WebRtcCallLinkResponse instance}.
     */
    public WebRtcCallLinkResponse url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * A URL to initiate the call.
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
     * A URL to initiate the call.
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
        WebRtcCallLinkResponse webRtcCallLinkResponse = (WebRtcCallLinkResponse) o;
        return Objects.equals(this.id, webRtcCallLinkResponse.id)
                && Objects.equals(this.url, webRtcCallLinkResponse.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcCallLinkResponse {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
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
