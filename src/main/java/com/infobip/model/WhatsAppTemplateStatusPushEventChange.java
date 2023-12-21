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
 * Represents WhatsAppTemplateStatusPushEventChange model.
 */
public class WhatsAppTemplateStatusPushEventChange extends WhatsAppTemplatePushEventChange {

    private WhatsAppStatus newStatus;

    private WhatsAppReason reason;

    /**
     * Constructs a new {@link WhatsAppTemplateStatusPushEventChange} instance.
     */
    public WhatsAppTemplateStatusPushEventChange() {
        super("TEMPLATE_STATUS_UPDATE");
    }

    /**
     * Sets newStatus.
     * <p>
     * The field is required.
     *
     * @param newStatus
     * @return This {@link WhatsAppTemplateStatusPushEventChange instance}.
     */
    public WhatsAppTemplateStatusPushEventChange newStatus(WhatsAppStatus newStatus) {
        this.newStatus = newStatus;
        return this;
    }

    /**
     * Returns newStatus.
     * <p>
     * The field is required.
     *
     * @return newStatus
     */
    @JsonProperty("newStatus")
    public WhatsAppStatus getNewStatus() {
        return newStatus;
    }

    /**
     * Sets newStatus.
     * <p>
     * The field is required.
     *
     * @param newStatus
     */
    @JsonProperty("newStatus")
    public void setNewStatus(WhatsAppStatus newStatus) {
        this.newStatus = newStatus;
    }

    /**
     * Sets reason.
     *
     * @param reason
     * @return This {@link WhatsAppTemplateStatusPushEventChange instance}.
     */
    public WhatsAppTemplateStatusPushEventChange reason(WhatsAppReason reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Returns reason.
     *
     * @return reason
     */
    @JsonProperty("reason")
    public WhatsAppReason getReason() {
        return reason;
    }

    /**
     * Sets reason.
     *
     * @param reason
     */
    @JsonProperty("reason")
    public void setReason(WhatsAppReason reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppTemplateStatusPushEventChange whatsAppTemplateStatusPushEventChange =
                (WhatsAppTemplateStatusPushEventChange) o;
        return Objects.equals(this.newStatus, whatsAppTemplateStatusPushEventChange.newStatus)
                && Objects.equals(this.reason, whatsAppTemplateStatusPushEventChange.reason)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newStatus, reason, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppTemplateStatusPushEventChange {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    newStatus: ")
                .append(toIndentedString(newStatus))
                .append(newLine)
                .append("    reason: ")
                .append(toIndentedString(reason))
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
