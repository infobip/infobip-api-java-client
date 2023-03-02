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
 * Tracking details of the domain.
 */
public class EmailTrackingResponse {

    private Boolean clicks;

    private Boolean opens;

    private Boolean unsubscribe;

    /**
     * Sets clicks.
     * <p>
     * Field description:
     * Indicates whether tracking of clicks is enabled.
     *
     * @param clicks
     * @return This {@link EmailTrackingResponse instance}.
     */
    public EmailTrackingResponse clicks(Boolean clicks) {
        this.clicks = clicks;
        return this;
    }

    /**
     * Returns clicks.
     * <p>
     * Field description:
     * Indicates whether tracking of clicks is enabled.
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
     * Indicates whether tracking of clicks is enabled.
     *
     * @param clicks
     */
    @JsonProperty("clicks")
    public void setClicks(Boolean clicks) {
        this.clicks = clicks;
    }

    /**
     * Sets opens.
     * <p>
     * Field description:
     * Indicates whether tracking of opens is enabled.
     *
     * @param opens
     * @return This {@link EmailTrackingResponse instance}.
     */
    public EmailTrackingResponse opens(Boolean opens) {
        this.opens = opens;
        return this;
    }

    /**
     * Returns opens.
     * <p>
     * Field description:
     * Indicates whether tracking of opens is enabled.
     *
     * @return opens
     */
    @JsonProperty("opens")
    public Boolean getOpens() {
        return opens;
    }

    /**
     * Sets opens.
     * <p>
     * Field description:
     * Indicates whether tracking of opens is enabled.
     *
     * @param opens
     */
    @JsonProperty("opens")
    public void setOpens(Boolean opens) {
        this.opens = opens;
    }

    /**
     * Sets unsubscribe.
     * <p>
     * Field description:
     * Indicates whether tracking of unsubscribes is enabled.
     *
     * @param unsubscribe
     * @return This {@link EmailTrackingResponse instance}.
     */
    public EmailTrackingResponse unsubscribe(Boolean unsubscribe) {
        this.unsubscribe = unsubscribe;
        return this;
    }

    /**
     * Returns unsubscribe.
     * <p>
     * Field description:
     * Indicates whether tracking of unsubscribes is enabled.
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
     * Indicates whether tracking of unsubscribes is enabled.
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
        EmailTrackingResponse emailTrackingResponse = (EmailTrackingResponse) o;
        return Objects.equals(this.clicks, emailTrackingResponse.clicks)
                && Objects.equals(this.opens, emailTrackingResponse.opens)
                && Objects.equals(this.unsubscribe, emailTrackingResponse.unsubscribe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clicks, opens, unsubscribe);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailTrackingResponse {")
                .append(newLine)
                .append("    clicks: ")
                .append(toIndentedString(clicks))
                .append(newLine)
                .append("    opens: ")
                .append(toIndentedString(opens))
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
