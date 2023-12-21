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
 * Use the call link feature to enable calls between users that have an Infobip account and users that don&#39;t.
 */
public class WebRtcCallLink {

    private String id;

    private String url;

    private String identity;

    private String displayName;

    private Boolean showIdentity;

    private WebRtcDestination destination;

    private Map<String, String> customData = null;

    private WebRtcValidityWindow validityWindow;

    private String callLinkConfigId;

    /**
     * Sets id.
     * <p>
     * Field description:
     * Identifier of the created call. To open a call link, it should be concatenated to the URL: https://call-link.com/.
     *
     * @param id
     * @return This {@link WebRtcCallLink instance}.
     */
    public WebRtcCallLink id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Identifier of the created call. To open a call link, it should be concatenated to the URL: https://call-link.com/.
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
     * Identifier of the created call. To open a call link, it should be concatenated to the URL: https://call-link.com/.
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
     * A URL to initiate a call.
     *
     * @param url
     * @return This {@link WebRtcCallLink instance}.
     */
    public WebRtcCallLink url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * A URL to initiate a call.
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
     * A URL to initiate a call.
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Sets identity.
     * <p>
     * Field description:
     * Identity of a user who will use a call link.
     * <p>
     * The field is required.
     *
     * @param identity
     * @return This {@link WebRtcCallLink instance}.
     */
    public WebRtcCallLink identity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Returns identity.
     * <p>
     * Field description:
     * Identity of a user who will use a call link.
     * <p>
     * The field is required.
     *
     * @return identity
     */
    @JsonProperty("identity")
    public String getIdentity() {
        return identity;
    }

    /**
     * Sets identity.
     * <p>
     * Field description:
     * Identity of a user who will use a call link.
     * <p>
     * The field is required.
     *
     * @param identity
     */
    @JsonProperty("identity")
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * Sets displayName.
     * <p>
     * Field description:
     * Display name of a user who will use a call link to initiate a call.
     *
     * @param displayName
     * @return This {@link WebRtcCallLink instance}.
     */
    public WebRtcCallLink displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Returns displayName.
     * <p>
     * Field description:
     * Display name of a user who will use a call link to initiate a call.
     *
     * @return displayName
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets displayName.
     * <p>
     * Field description:
     * Display name of a user who will use a call link to initiate a call.
     *
     * @param displayName
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Sets showIdentity.
     * <p>
     * Field description:
     * Show identity or displayName on before a call.
     *
     * @param showIdentity
     * @return This {@link WebRtcCallLink instance}.
     */
    public WebRtcCallLink showIdentity(Boolean showIdentity) {
        this.showIdentity = showIdentity;
        return this;
    }

    /**
     * Returns showIdentity.
     * <p>
     * Field description:
     * Show identity or displayName on before a call.
     *
     * @return showIdentity
     */
    @JsonProperty("showIdentity")
    public Boolean getShowIdentity() {
        return showIdentity;
    }

    /**
     * Sets showIdentity.
     * <p>
     * Field description:
     * Show identity or displayName on before a call.
     *
     * @param showIdentity
     */
    @JsonProperty("showIdentity")
    public void setShowIdentity(Boolean showIdentity) {
        this.showIdentity = showIdentity;
    }

    /**
     * Sets destination.
     * <p>
     * The field is required.
     *
     * @param destination
     * @return This {@link WebRtcCallLink instance}.
     */
    public WebRtcCallLink destination(WebRtcDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Returns destination.
     * <p>
     * The field is required.
     *
     * @return destination
     */
    @JsonProperty("destination")
    public WebRtcDestination getDestination() {
        return destination;
    }

    /**
     * Sets destination.
     * <p>
     * The field is required.
     *
     * @param destination
     */
    @JsonProperty("destination")
    public void setDestination(WebRtcDestination destination) {
        this.destination = destination;
    }

    /**
     * Sets customData.
     * <p>
     * Field description:
     * Custom attributes sent in a call once it is started.
     *
     * @param customData
     * @return This {@link WebRtcCallLink instance}.
     */
    public WebRtcCallLink customData(Map<String, String> customData) {
        this.customData = customData;
        return this;
    }

    /**
     * Puts and entry into customData.
     * <p>
     * Field description:
     * Custom attributes sent in a call once it is started.
     *
     * @param key The given key.
     * @param customDataItem The item to be associated with the given key.
     * @return This {@link WebRtcCallLink instance}.
     */
    public WebRtcCallLink putCustomDataItem(String key, String customDataItem) {
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
     * Custom attributes sent in a call once it is started.
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
     * Custom attributes sent in a call once it is started.
     *
     * @param customData
     */
    @JsonProperty("customData")
    public void setCustomData(Map<String, String> customData) {
        this.customData = customData;
    }

    /**
     * Sets validityWindow.
     *
     * @param validityWindow
     * @return This {@link WebRtcCallLink instance}.
     */
    public WebRtcCallLink validityWindow(WebRtcValidityWindow validityWindow) {
        this.validityWindow = validityWindow;
        return this;
    }

    /**
     * Returns validityWindow.
     *
     * @return validityWindow
     */
    @JsonProperty("validityWindow")
    public WebRtcValidityWindow getValidityWindow() {
        return validityWindow;
    }

    /**
     * Sets validityWindow.
     *
     * @param validityWindow
     */
    @JsonProperty("validityWindow")
    public void setValidityWindow(WebRtcValidityWindow validityWindow) {
        this.validityWindow = validityWindow;
    }

    /**
     * Sets callLinkConfigId.
     * <p>
     * Field description:
     * ID of a configuration to use on an existing call link. If this parameter is not sent, and there are some call link configurations, the default one will be used. If there is no configurations, then the one with the system default values will be used.
     *
     * @param callLinkConfigId
     * @return This {@link WebRtcCallLink instance}.
     */
    public WebRtcCallLink callLinkConfigId(String callLinkConfigId) {
        this.callLinkConfigId = callLinkConfigId;
        return this;
    }

    /**
     * Returns callLinkConfigId.
     * <p>
     * Field description:
     * ID of a configuration to use on an existing call link. If this parameter is not sent, and there are some call link configurations, the default one will be used. If there is no configurations, then the one with the system default values will be used.
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
     * ID of a configuration to use on an existing call link. If this parameter is not sent, and there are some call link configurations, the default one will be used. If there is no configurations, then the one with the system default values will be used.
     *
     * @param callLinkConfigId
     */
    @JsonProperty("callLinkConfigId")
    public void setCallLinkConfigId(String callLinkConfigId) {
        this.callLinkConfigId = callLinkConfigId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcCallLink webRtcCallLink = (WebRtcCallLink) o;
        return Objects.equals(this.id, webRtcCallLink.id)
                && Objects.equals(this.url, webRtcCallLink.url)
                && Objects.equals(this.identity, webRtcCallLink.identity)
                && Objects.equals(this.displayName, webRtcCallLink.displayName)
                && Objects.equals(this.showIdentity, webRtcCallLink.showIdentity)
                && Objects.equals(this.destination, webRtcCallLink.destination)
                && Objects.equals(this.customData, webRtcCallLink.customData)
                && Objects.equals(this.validityWindow, webRtcCallLink.validityWindow)
                && Objects.equals(this.callLinkConfigId, webRtcCallLink.callLinkConfigId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                url,
                identity,
                displayName,
                showIdentity,
                destination,
                customData,
                validityWindow,
                callLinkConfigId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcCallLink {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
                .append(newLine)
                .append("    identity: ")
                .append(toIndentedString(identity))
                .append(newLine)
                .append("    displayName: ")
                .append(toIndentedString(displayName))
                .append(newLine)
                .append("    showIdentity: ")
                .append(toIndentedString(showIdentity))
                .append(newLine)
                .append("    destination: ")
                .append(toIndentedString(destination))
                .append(newLine)
                .append("    customData: ")
                .append(toIndentedString(customData))
                .append(newLine)
                .append("    validityWindow: ")
                .append(toIndentedString(validityWindow))
                .append(newLine)
                .append("    callLinkConfigId: ")
                .append(toIndentedString(callLinkConfigId))
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
