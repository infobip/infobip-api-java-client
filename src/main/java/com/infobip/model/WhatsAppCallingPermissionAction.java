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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A list of actions a sender may undertake to facilitate a call permission or a business initiated call.
 */
public class WhatsAppCallingPermissionAction {

    private WhatsAppCallingPermissionActionName name;

    private Boolean canPerformAction;

    private List<WhatsAppCallingPermissionActionLimit> limits = new ArrayList<>();

    /**
     * Sets name.
     * <p>
     * The field is required.
     *
     * @param name
     * @return This {@link WhatsAppCallingPermissionAction instance}.
     */
    public WhatsAppCallingPermissionAction name(WhatsAppCallingPermissionActionName name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * The field is required.
     *
     * @return name
     */
    @JsonProperty("name")
    public WhatsAppCallingPermissionActionName getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * The field is required.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(WhatsAppCallingPermissionActionName name) {
        this.name = name;
    }

    /**
     * Sets canPerformAction.
     * <p>
     * Field description:
     * Whether the action can be performed now, taking into account all limits.
     * <p>
     * The field is required.
     *
     * @param canPerformAction
     * @return This {@link WhatsAppCallingPermissionAction instance}.
     */
    public WhatsAppCallingPermissionAction canPerformAction(Boolean canPerformAction) {
        this.canPerformAction = canPerformAction;
        return this;
    }

    /**
     * Returns canPerformAction.
     * <p>
     * Field description:
     * Whether the action can be performed now, taking into account all limits.
     * <p>
     * The field is required.
     *
     * @return canPerformAction
     */
    @JsonProperty("canPerformAction")
    public Boolean getCanPerformAction() {
        return canPerformAction;
    }

    /**
     * Sets canPerformAction.
     * <p>
     * Field description:
     * Whether the action can be performed now, taking into account all limits.
     * <p>
     * The field is required.
     *
     * @param canPerformAction
     */
    @JsonProperty("canPerformAction")
    public void setCanPerformAction(Boolean canPerformAction) {
        this.canPerformAction = canPerformAction;
    }

    /**
     * Sets limits.
     * <p>
     * Field description:
     * A list of time-bound restrictions for the given action.
     * <p>
     * The field is required.
     *
     * @param limits
     * @return This {@link WhatsAppCallingPermissionAction instance}.
     */
    public WhatsAppCallingPermissionAction limits(List<WhatsAppCallingPermissionActionLimit> limits) {
        this.limits = limits;
        return this;
    }

    /**
     * Adds and item into limits.
     * <p>
     * Field description:
     * A list of time-bound restrictions for the given action.
     * <p>
     * The field is required.
     *
     * @param limitsItem The item to be added to the list.
     * @return This {@link WhatsAppCallingPermissionAction instance}.
     */
    public WhatsAppCallingPermissionAction addLimitsItem(WhatsAppCallingPermissionActionLimit limitsItem) {
        if (this.limits == null) {
            this.limits = new ArrayList<>();
        }
        this.limits.add(limitsItem);
        return this;
    }

    /**
     * Returns limits.
     * <p>
     * Field description:
     * A list of time-bound restrictions for the given action.
     * <p>
     * The field is required.
     *
     * @return limits
     */
    @JsonProperty("limits")
    public List<WhatsAppCallingPermissionActionLimit> getLimits() {
        return limits;
    }

    /**
     * Sets limits.
     * <p>
     * Field description:
     * A list of time-bound restrictions for the given action.
     * <p>
     * The field is required.
     *
     * @param limits
     */
    @JsonProperty("limits")
    public void setLimits(List<WhatsAppCallingPermissionActionLimit> limits) {
        this.limits = limits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppCallingPermissionAction whatsAppCallingPermissionAction = (WhatsAppCallingPermissionAction) o;
        return Objects.equals(this.name, whatsAppCallingPermissionAction.name)
                && Objects.equals(this.canPerformAction, whatsAppCallingPermissionAction.canPerformAction)
                && Objects.equals(this.limits, whatsAppCallingPermissionAction.limits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, canPerformAction, limits);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppCallingPermissionAction {")
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    canPerformAction: ")
                .append(toIndentedString(canPerformAction))
                .append(newLine)
                .append("    limits: ")
                .append(toIndentedString(limits))
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
