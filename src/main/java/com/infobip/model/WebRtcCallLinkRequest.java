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
 * Enable calls between users that have an Infobip account and users that don&#39;t.
 */
public class WebRtcCallLinkRequest {

    private String identity;

    private String displayName;

    private Boolean showIdentity;

    private WebRtcDestination destination;

    private Map<String, String> customData = null;

    private WebRtcValidityWindow validityWindow;

    private String callLinkConfigId;

    /**
     * Sets identity.
     * <p>
     * Field description:
     * Identity of a user that will use a call link. Must not be set if the destination type of a call link is ROOM.
     *
     * @param identity
     * @return This {@link WebRtcCallLinkRequest instance}.
     */
    public WebRtcCallLinkRequest identity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Returns identity.
     * <p>
     * Field description:
     * Identity of a user that will use a call link. Must not be set if the destination type of a call link is ROOM.
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
     * Identity of a user that will use a call link. Must not be set if the destination type of a call link is ROOM.
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
     * Display name of a user that will use a call link to initiate a call. Must not be set if the destination type of a call link is ROOM. For other destination types, if you want to set a display name, also set identity.
     *
     * @param displayName
     * @return This {@link WebRtcCallLinkRequest instance}.
     */
    public WebRtcCallLinkRequest displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Returns displayName.
     * <p>
     * Field description:
     * Display name of a user that will use a call link to initiate a call. Must not be set if the destination type of a call link is ROOM. For other destination types, if you want to set a display name, also set identity.
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
     * Display name of a user that will use a call link to initiate a call. Must not be set if the destination type of a call link is ROOM. For other destination types, if you want to set a display name, also set identity.
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
     * @return This {@link WebRtcCallLinkRequest instance}.
     */
    public WebRtcCallLinkRequest showIdentity(Boolean showIdentity) {
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
     * @return This {@link WebRtcCallLinkRequest instance}.
     */
    public WebRtcCallLinkRequest destination(WebRtcDestination destination) {
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
     * Custom attributes sent in a call once it has started.
     *
     * @param customData
     * @return This {@link WebRtcCallLinkRequest instance}.
     */
    public WebRtcCallLinkRequest customData(Map<String, String> customData) {
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
     * @return This {@link WebRtcCallLinkRequest instance}.
     */
    public WebRtcCallLinkRequest putCustomDataItem(String key, String customDataItem) {
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
     * Sets validityWindow.
     *
     * @param validityWindow
     * @return This {@link WebRtcCallLinkRequest instance}.
     */
    public WebRtcCallLinkRequest validityWindow(WebRtcValidityWindow validityWindow) {
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
     * Identifier of a call link configuration. You can use your existing configuration. If this parameter is not sent and there are call link configurations available, the default one will be used. If there are no configurations, the one with system default values will be used.
     *
     * @param callLinkConfigId
     * @return This {@link WebRtcCallLinkRequest instance}.
     */
    public WebRtcCallLinkRequest callLinkConfigId(String callLinkConfigId) {
        this.callLinkConfigId = callLinkConfigId;
        return this;
    }

    /**
     * Returns callLinkConfigId.
     * <p>
     * Field description:
     * Identifier of a call link configuration. You can use your existing configuration. If this parameter is not sent and there are call link configurations available, the default one will be used. If there are no configurations, the one with system default values will be used.
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
     * Identifier of a call link configuration. You can use your existing configuration. If this parameter is not sent and there are call link configurations available, the default one will be used. If there are no configurations, the one with system default values will be used.
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
        WebRtcCallLinkRequest webRtcCallLinkRequest = (WebRtcCallLinkRequest) o;
        return Objects.equals(this.identity, webRtcCallLinkRequest.identity)
                && Objects.equals(this.displayName, webRtcCallLinkRequest.displayName)
                && Objects.equals(this.showIdentity, webRtcCallLinkRequest.showIdentity)
                && Objects.equals(this.destination, webRtcCallLinkRequest.destination)
                && Objects.equals(this.customData, webRtcCallLinkRequest.customData)
                && Objects.equals(this.validityWindow, webRtcCallLinkRequest.validityWindow)
                && Objects.equals(this.callLinkConfigId, webRtcCallLinkRequest.callLinkConfigId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                identity, displayName, showIdentity, destination, customData, validityWindow, callLinkConfigId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcCallLinkRequest {")
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
