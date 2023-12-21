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
 * Represents WebRtcRoomDestination model.
 */
public class WebRtcRoomDestination extends WebRtcDestination {

    private String roomName;

    private String displayName;

    private String password;

    /**
     * Constructs a new {@link WebRtcRoomDestination} instance.
     */
    public WebRtcRoomDestination() {
        super("ROOM");
    }

    /**
     * Sets roomName.
     * <p>
     * Field description:
     * Name of a room.
     * <p>
     * The field is required.
     *
     * @param roomName
     * @return This {@link WebRtcRoomDestination instance}.
     */
    public WebRtcRoomDestination roomName(String roomName) {
        this.roomName = roomName;
        return this;
    }

    /**
     * Returns roomName.
     * <p>
     * Field description:
     * Name of a room.
     * <p>
     * The field is required.
     *
     * @return roomName
     */
    @JsonProperty("roomName")
    public String getRoomName() {
        return roomName;
    }

    /**
     * Sets roomName.
     * <p>
     * Field description:
     * Name of a room.
     * <p>
     * The field is required.
     *
     * @param roomName
     */
    @JsonProperty("roomName")
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * Sets displayName.
     * <p>
     * Field description:
     * Destination display name, if defined, that the call Link UI will use instead of an agent name. If a destination display name is an empty string, the UI will hide it.
     *
     * @param displayName
     * @return This {@link WebRtcRoomDestination instance}.
     */
    public WebRtcRoomDestination displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Returns displayName.
     * <p>
     * Field description:
     * Destination display name, if defined, that the call Link UI will use instead of an agent name. If a destination display name is an empty string, the UI will hide it.
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
     * Destination display name, if defined, that the call Link UI will use instead of an agent name. If a destination display name is an empty string, the UI will hide it.
     *
     * @param displayName
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Sets password.
     * <p>
     * Field description:
     * Password for entering a room. If defined, a user will have to enter the same password before joining. It can be between 4 and 20 characters long and can contain numbers, letters and dashes, underscores and spaces. If not defined, anyone with the link will be able to join the call.
     *
     * @param password
     * @return This {@link WebRtcRoomDestination instance}.
     */
    public WebRtcRoomDestination password(String password) {
        this.password = password;
        return this;
    }

    /**
     * Returns password.
     * <p>
     * Field description:
     * Password for entering a room. If defined, a user will have to enter the same password before joining. It can be between 4 and 20 characters long and can contain numbers, letters and dashes, underscores and spaces. If not defined, anyone with the link will be able to join the call.
     *
     * @return password
     */
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    /**
     * Sets password.
     * <p>
     * Field description:
     * Password for entering a room. If defined, a user will have to enter the same password before joining. It can be between 4 and 20 characters long and can contain numbers, letters and dashes, underscores and spaces. If not defined, anyone with the link will be able to join the call.
     *
     * @param password
     */
    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcRoomDestination webRtcRoomDestination = (WebRtcRoomDestination) o;
        return Objects.equals(this.roomName, webRtcRoomDestination.roomName)
                && Objects.equals(this.displayName, webRtcRoomDestination.displayName)
                && Objects.equals(this.password, webRtcRoomDestination.password)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomName, displayName, password, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcRoomDestination {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    roomName: ")
                .append(toIndentedString(roomName))
                .append(newLine)
                .append("    displayName: ")
                .append(toIndentedString(displayName))
                .append(newLine)
                .append("    password: ")
                .append(toIndentedString(password))
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
