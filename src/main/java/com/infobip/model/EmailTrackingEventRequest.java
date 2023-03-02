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
 * Represents EmailTrackingEventRequest model.
 */
public class EmailTrackingEventRequest {

    private Boolean open;

    private Boolean clicks;

    private Boolean unsubscribe;

    /**
     * Sets open.
     * <p>
     * Field description:
     * Boolean value corresponding to whether opens for a message needs to be tracked or not.
     *
     * @param open
     * @return This {@link EmailTrackingEventRequest instance}.
     */
    public EmailTrackingEventRequest open(Boolean open) {
        this.open = open;
        return this;
    }

    /**
     * Returns open.
     * <p>
     * Field description:
     * Boolean value corresponding to whether opens for a message needs to be tracked or not.
     *
     * @return open
     */
    @JsonProperty("open")
    public Boolean getOpen() {
        return open;
    }

    /**
     * Sets open.
     * <p>
     * Field description:
     * Boolean value corresponding to whether opens for a message needs to be tracked or not.
     *
     * @param open
     */
    @JsonProperty("open")
    public void setOpen(Boolean open) {
        this.open = open;
    }

    /**
     * Sets clicks.
     * <p>
     * Field description:
     * Boolean value corresponding to whether clicks for a message needs to be tracked or not.
     *
     * @param clicks
     * @return This {@link EmailTrackingEventRequest instance}.
     */
    public EmailTrackingEventRequest clicks(Boolean clicks) {
        this.clicks = clicks;
        return this;
    }

    /**
     * Returns clicks.
     * <p>
     * Field description:
     * Boolean value corresponding to whether clicks for a message needs to be tracked or not.
     *
     * @return clicks
     */
    @JsonProperty("clicks")
    public Boolean getClicks() {
        return clicks;
    }

    /**
     * Sets clicks.
     * <p>
     * Field description:
     * Boolean value corresponding to whether clicks for a message needs to be tracked or not.
     *
     * @param clicks
     */
    @JsonProperty("clicks")
    public void setClicks(Boolean clicks) {
        this.clicks = clicks;
    }

    /**
     * Sets unsubscribe.
     * <p>
     * Field description:
     * Boolean value corresponding to whether unsubscribe for a message needs to be tracked or not.
     *
     * @param unsubscribe
     * @return This {@link EmailTrackingEventRequest instance}.
     */
    public EmailTrackingEventRequest unsubscribe(Boolean unsubscribe) {
        this.unsubscribe = unsubscribe;
        return this;
    }

    /**
     * Returns unsubscribe.
     * <p>
     * Field description:
     * Boolean value corresponding to whether unsubscribe for a message needs to be tracked or not.
     *
     * @return unsubscribe
     */
    @JsonProperty("unsubscribe")
    public Boolean getUnsubscribe() {
        return unsubscribe;
    }

    /**
     * Sets unsubscribe.
     * <p>
     * Field description:
     * Boolean value corresponding to whether unsubscribe for a message needs to be tracked or not.
     *
     * @param unsubscribe
     */
    @JsonProperty("unsubscribe")
    public void setUnsubscribe(Boolean unsubscribe) {
        this.unsubscribe = unsubscribe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailTrackingEventRequest emailTrackingEventRequest = (EmailTrackingEventRequest) o;
        return Objects.equals(this.open, emailTrackingEventRequest.open)
                && Objects.equals(this.clicks, emailTrackingEventRequest.clicks)
                && Objects.equals(this.unsubscribe, emailTrackingEventRequest.unsubscribe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(open, clicks, unsubscribe);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailTrackingEventRequest {")
                .append(newLine)
                .append("    open: ")
                .append(toIndentedString(open))
                .append(newLine)
                .append("    clicks: ")
                .append(toIndentedString(clicks))
                .append(newLine)
                .append("    unsubscribe: ")
                .append(toIndentedString(unsubscribe))
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
