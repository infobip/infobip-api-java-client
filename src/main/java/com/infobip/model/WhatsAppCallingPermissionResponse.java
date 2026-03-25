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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents WhatsAppCallingPermissionResponse model.
 */
public class WhatsAppCallingPermissionResponse {

    private WhatsAppCallingPermissionStatus status;

    private List<WhatsAppCallingPermissionAction> actions = new ArrayList<>();

    private OffsetDateTime expirationTime;

    /**
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     * @return This {@link WhatsAppCallingPermissionResponse instance}.
     */
    public WhatsAppCallingPermissionResponse status(WhatsAppCallingPermissionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     * <p>
     * The field is required.
     *
     * @return status
     */
    @JsonProperty("status")
    public WhatsAppCallingPermissionStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     * <p>
     * The field is required.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(WhatsAppCallingPermissionStatus status) {
        this.status = status;
    }

    /**
     * Sets actions.
     * <p>
     * Field description:
     * A list of actions a sender may undertake to facilitate a call permission or a business initiated call.
     * <p>
     * The field is required.
     *
     * @param actions
     * @return This {@link WhatsAppCallingPermissionResponse instance}.
     */
    public WhatsAppCallingPermissionResponse actions(List<WhatsAppCallingPermissionAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Adds and item into actions.
     * <p>
     * Field description:
     * A list of actions a sender may undertake to facilitate a call permission or a business initiated call.
     * <p>
     * The field is required.
     *
     * @param actionsItem The item to be added to the list.
     * @return This {@link WhatsAppCallingPermissionResponse instance}.
     */
    public WhatsAppCallingPermissionResponse addActionsItem(WhatsAppCallingPermissionAction actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    /**
     * Returns actions.
     * <p>
     * Field description:
     * A list of actions a sender may undertake to facilitate a call permission or a business initiated call.
     * <p>
     * The field is required.
     *
     * @return actions
     */
    @JsonProperty("actions")
    public List<WhatsAppCallingPermissionAction> getActions() {
        return actions;
    }

    /**
     * Sets actions.
     * <p>
     * Field description:
     * A list of actions a sender may undertake to facilitate a call permission or a business initiated call.
     * <p>
     * The field is required.
     *
     * @param actions
     */
    @JsonProperty("actions")
    public void setActions(List<WhatsAppCallingPermissionAction> actions) {
        this.actions = actions;
    }

    /**
     * Sets expirationTime.
     * <p>
     * Field description:
     * Time at which the calling permission will expire. Present only when &#x60;TEMPORARY&#x60; permission is granted.
     *
     * @param expirationTime
     * @return This {@link WhatsAppCallingPermissionResponse instance}.
     */
    public WhatsAppCallingPermissionResponse expirationTime(OffsetDateTime expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    /**
     * Returns expirationTime.
     * <p>
     * Field description:
     * Time at which the calling permission will expire. Present only when &#x60;TEMPORARY&#x60; permission is granted.
     *
     * @return expirationTime
     */
    @JsonProperty("expirationTime")
    public OffsetDateTime getExpirationTime() {
        return expirationTime;
    }

    /**
     * Sets expirationTime.
     * <p>
     * Field description:
     * Time at which the calling permission will expire. Present only when &#x60;TEMPORARY&#x60; permission is granted.
     *
     * @param expirationTime
     */
    @JsonProperty("expirationTime")
    public void setExpirationTime(OffsetDateTime expirationTime) {
        this.expirationTime = expirationTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppCallingPermissionResponse whatsAppCallingPermissionResponse = (WhatsAppCallingPermissionResponse) o;
        return Objects.equals(this.status, whatsAppCallingPermissionResponse.status)
                && Objects.equals(this.actions, whatsAppCallingPermissionResponse.actions)
                && Objects.equals(this.expirationTime, whatsAppCallingPermissionResponse.expirationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, actions, expirationTime);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppCallingPermissionResponse {")
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    actions: ")
                .append(toIndentedString(actions))
                .append(newLine)
                .append("    expirationTime: ")
                .append(toIndentedString(expirationTime))
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
