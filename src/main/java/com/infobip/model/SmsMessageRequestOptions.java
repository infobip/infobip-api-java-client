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
 * Options applicable to all messages in the request.
 */
public class SmsMessageRequestOptions {

    private SmsRequestSchedulingSettings schedule;

    private UrlOptions tracking;

    private Boolean includeSmsCountInResponse;

    private SmsTracking conversionTracking;

    /**
     * Sets schedule.
     *
     * @param schedule
     * @return This {@link SmsMessageRequestOptions instance}.
     */
    public SmsMessageRequestOptions schedule(SmsRequestSchedulingSettings schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Returns schedule.
     *
     * @return schedule
     */
    @JsonProperty("schedule")
    public SmsRequestSchedulingSettings getSchedule() {
        return schedule;
    }

    /**
     * Sets schedule.
     *
     * @param schedule
     */
    @JsonProperty("schedule")
    public void setSchedule(SmsRequestSchedulingSettings schedule) {
        this.schedule = schedule;
    }

    /**
     * Sets tracking.
     *
     * @param tracking
     * @return This {@link SmsMessageRequestOptions instance}.
     */
    public SmsMessageRequestOptions tracking(UrlOptions tracking) {
        this.tracking = tracking;
        return this;
    }

    /**
     * Returns tracking.
     *
     * @return tracking
     */
    @JsonProperty("tracking")
    public UrlOptions getTracking() {
        return tracking;
    }

    /**
     * Sets tracking.
     *
     * @param tracking
     */
    @JsonProperty("tracking")
    public void setTracking(UrlOptions tracking) {
        this.tracking = tracking;
    }

    /**
     * Sets includeSmsCountInResponse.
     * <p>
     * Field description:
     * Set to true to return &#x60;messageCount&#x60; in the response. The &#x60;messageCount&#x60; is the total count of SMS submitted in the request. SMS messages have a character limit and messages longer than the limit will be split into multiple SMS. Not compatible with &#x60;binary&#x60; message content type.
     *
     * @param includeSmsCountInResponse
     * @return This {@link SmsMessageRequestOptions instance}.
     */
    public SmsMessageRequestOptions includeSmsCountInResponse(Boolean includeSmsCountInResponse) {
        this.includeSmsCountInResponse = includeSmsCountInResponse;
        return this;
    }

    /**
     * Returns includeSmsCountInResponse.
     * <p>
     * Field description:
     * Set to true to return &#x60;messageCount&#x60; in the response. The &#x60;messageCount&#x60; is the total count of SMS submitted in the request. SMS messages have a character limit and messages longer than the limit will be split into multiple SMS. Not compatible with &#x60;binary&#x60; message content type.
     *
     * @return includeSmsCountInResponse
     */
    @JsonProperty("includeSmsCountInResponse")
    public Boolean getIncludeSmsCountInResponse() {
        return includeSmsCountInResponse;
    }

    /**
     * Sets includeSmsCountInResponse.
     * <p>
     * Field description:
     * Set to true to return &#x60;messageCount&#x60; in the response. The &#x60;messageCount&#x60; is the total count of SMS submitted in the request. SMS messages have a character limit and messages longer than the limit will be split into multiple SMS. Not compatible with &#x60;binary&#x60; message content type.
     *
     * @param includeSmsCountInResponse
     */
    @JsonProperty("includeSmsCountInResponse")
    public void setIncludeSmsCountInResponse(Boolean includeSmsCountInResponse) {
        this.includeSmsCountInResponse = includeSmsCountInResponse;
    }

    /**
     * Sets conversionTracking.
     *
     * @param conversionTracking
     * @return This {@link SmsMessageRequestOptions instance}.
     */
    public SmsMessageRequestOptions conversionTracking(SmsTracking conversionTracking) {
        this.conversionTracking = conversionTracking;
        return this;
    }

    /**
     * Returns conversionTracking.
     *
     * @return conversionTracking
     */
    @JsonProperty("conversionTracking")
    public SmsTracking getConversionTracking() {
        return conversionTracking;
    }

    /**
     * Sets conversionTracking.
     *
     * @param conversionTracking
     */
    @JsonProperty("conversionTracking")
    public void setConversionTracking(SmsTracking conversionTracking) {
        this.conversionTracking = conversionTracking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsMessageRequestOptions smsMessageRequestOptions = (SmsMessageRequestOptions) o;
        return Objects.equals(this.schedule, smsMessageRequestOptions.schedule)
                && Objects.equals(this.tracking, smsMessageRequestOptions.tracking)
                && Objects.equals(this.includeSmsCountInResponse, smsMessageRequestOptions.includeSmsCountInResponse)
                && Objects.equals(this.conversionTracking, smsMessageRequestOptions.conversionTracking);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedule, tracking, includeSmsCountInResponse, conversionTracking);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsMessageRequestOptions {")
                .append(newLine)
                .append("    schedule: ")
                .append(toIndentedString(schedule))
                .append(newLine)
                .append("    tracking: ")
                .append(toIndentedString(tracking))
                .append(newLine)
                .append("    includeSmsCountInResponse: ")
                .append(toIndentedString(includeSmsCountInResponse))
                .append(newLine)
                .append("    conversionTracking: ")
                .append(toIndentedString(conversionTracking))
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
