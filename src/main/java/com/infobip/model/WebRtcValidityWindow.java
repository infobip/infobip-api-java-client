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
 * Description of a call link validation period and the number of times it can be used within the range.
 */
public class WebRtcValidityWindow {

    private Boolean oneTime;

    private OffsetDateTime startTime;

    private OffsetDateTime endTime;

    private WebRtcAcceptableHours acceptableHours;

    private List<DeliveryDay> acceptableDays = null;

    /**
     * Sets oneTime.
     * <p>
     * Field description:
     * By default, call links are generated for multiple calls.If you want to limit the period for how long a link is valid, specify the start and end time. If you want to invalidate a link after establishing a call, set this value to &#39;true&#39; (defaults to &#39;false&#39;).For ROOM calls, this value cannot be &#39;true&#39;.
     *
     * @param oneTime
     * @return This {@link WebRtcValidityWindow instance}.
     */
    public WebRtcValidityWindow oneTime(Boolean oneTime) {
        this.oneTime = oneTime;
        return this;
    }

    /**
     * Returns oneTime.
     * <p>
     * Field description:
     * By default, call links are generated for multiple calls.If you want to limit the period for how long a link is valid, specify the start and end time. If you want to invalidate a link after establishing a call, set this value to &#39;true&#39; (defaults to &#39;false&#39;).For ROOM calls, this value cannot be &#39;true&#39;.
     *
     * @return oneTime
     */
    @JsonProperty("oneTime")
    public Boolean getOneTime() {
        return oneTime;
    }

    /**
     * Sets oneTime.
     * <p>
     * Field description:
     * By default, call links are generated for multiple calls.If you want to limit the period for how long a link is valid, specify the start and end time. If you want to invalidate a link after establishing a call, set this value to &#39;true&#39; (defaults to &#39;false&#39;).For ROOM calls, this value cannot be &#39;true&#39;.
     *
     * @param oneTime
     */
    @JsonProperty("oneTime")
    public void setOneTime(Boolean oneTime) {
        this.oneTime = oneTime;
    }

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * Specify starting moment in the UTC timezone for when a call link becomes valid. Defaults to the time when a link was created. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;.
     *
     * @param startTime
     * @return This {@link WebRtcValidityWindow instance}.
     */
    public WebRtcValidityWindow startTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Returns startTime.
     * <p>
     * Field description:
     * Specify starting moment in the UTC timezone for when a call link becomes valid. Defaults to the time when a link was created. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;.
     *
     * @return startTime
     */
    @JsonProperty("startTime")
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    /**
     * Sets startTime.
     * <p>
     * Field description:
     * Specify starting moment in the UTC timezone for when a call link becomes valid. Defaults to the time when a link was created. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;.
     *
     * @param startTime
     */
    @JsonProperty("startTime")
    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    /**
     * Sets endTime.
     * <p>
     * Field description:
     * Specify ending moment in the UTC timezone for when a call link becomes invalid. Default value is 24 hours after a link was created. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;.
     *
     * @param endTime
     * @return This {@link WebRtcValidityWindow instance}.
     */
    public WebRtcValidityWindow endTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Returns endTime.
     * <p>
     * Field description:
     * Specify ending moment in the UTC timezone for when a call link becomes invalid. Default value is 24 hours after a link was created. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;.
     *
     * @return endTime
     */
    @JsonProperty("endTime")
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    /**
     * Sets endTime.
     * <p>
     * Field description:
     * Specify ending moment in the UTC timezone for when a call link becomes invalid. Default value is 24 hours after a link was created. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS+ZZZZ&#x60;.
     *
     * @param endTime
     */
    @JsonProperty("endTime")
    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    /**
     * Sets acceptableHours.
     *
     * @param acceptableHours
     * @return This {@link WebRtcValidityWindow instance}.
     */
    public WebRtcValidityWindow acceptableHours(WebRtcAcceptableHours acceptableHours) {
        this.acceptableHours = acceptableHours;
        return this;
    }

    /**
     * Returns acceptableHours.
     *
     * @return acceptableHours
     */
    @JsonProperty("acceptableHours")
    public WebRtcAcceptableHours getAcceptableHours() {
        return acceptableHours;
    }

    /**
     * Sets acceptableHours.
     *
     * @param acceptableHours
     */
    @JsonProperty("acceptableHours")
    public void setAcceptableHours(WebRtcAcceptableHours acceptableHours) {
        this.acceptableHours = acceptableHours;
    }

    /**
     * Sets acceptableDays.
     * <p>
     * Field description:
     * Specify the days a link can be used. It is every day of the week, by default.
     *
     * @param acceptableDays
     * @return This {@link WebRtcValidityWindow instance}.
     */
    public WebRtcValidityWindow acceptableDays(List<DeliveryDay> acceptableDays) {
        this.acceptableDays = acceptableDays;
        return this;
    }

    /**
     * Adds and item into acceptableDays.
     * <p>
     * Field description:
     * Specify the days a link can be used. It is every day of the week, by default.
     *
     * @param acceptableDaysItem The item to be added to the list.
     * @return This {@link WebRtcValidityWindow instance}.
     */
    public WebRtcValidityWindow addAcceptableDaysItem(DeliveryDay acceptableDaysItem) {
        if (this.acceptableDays == null) {
            this.acceptableDays = new ArrayList<>();
        }
        this.acceptableDays.add(acceptableDaysItem);
        return this;
    }

    /**
     * Returns acceptableDays.
     * <p>
     * Field description:
     * Specify the days a link can be used. It is every day of the week, by default.
     *
     * @return acceptableDays
     */
    @JsonProperty("acceptableDays")
    public List<DeliveryDay> getAcceptableDays() {
        return acceptableDays;
    }

    /**
     * Sets acceptableDays.
     * <p>
     * Field description:
     * Specify the days a link can be used. It is every day of the week, by default.
     *
     * @param acceptableDays
     */
    @JsonProperty("acceptableDays")
    public void setAcceptableDays(List<DeliveryDay> acceptableDays) {
        this.acceptableDays = acceptableDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcValidityWindow webRtcValidityWindow = (WebRtcValidityWindow) o;
        return Objects.equals(this.oneTime, webRtcValidityWindow.oneTime)
                && Objects.equals(this.startTime, webRtcValidityWindow.startTime)
                && Objects.equals(this.endTime, webRtcValidityWindow.endTime)
                && Objects.equals(this.acceptableHours, webRtcValidityWindow.acceptableHours)
                && Objects.equals(this.acceptableDays, webRtcValidityWindow.acceptableDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oneTime, startTime, endTime, acceptableHours, acceptableDays);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcValidityWindow {")
                .append(newLine)
                .append("    oneTime: ")
                .append(toIndentedString(oneTime))
                .append(newLine)
                .append("    startTime: ")
                .append(toIndentedString(startTime))
                .append(newLine)
                .append("    endTime: ")
                .append(toIndentedString(endTime))
                .append(newLine)
                .append("    acceptableHours: ")
                .append(toIndentedString(acceptableHours))
                .append(newLine)
                .append("    acceptableDays: ")
                .append(toIndentedString(acceptableDays))
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
