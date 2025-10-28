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
 * Allows you to set up tracking parameters to track conversion metrics. For more details, see: [SMS with conversion tracking](https://www.infobip.com/docs/sms/sms-over-api#send-sms-with-conversion-tracking).
 */
public class SmsTracking {

    private Boolean useConversionTracking;

    private String conversionTrackingName;

    /**
     * Sets useConversionTracking.
     * <p>
     * Field description:
     * Indicates if a message has to be tracked for conversion rates. Default \&quot;false\&quot;.
     *
     * @param useConversionTracking
     * @return This {@link SmsTracking instance}.
     */
    public SmsTracking useConversionTracking(Boolean useConversionTracking) {
        this.useConversionTracking = useConversionTracking;
        return this;
    }

    /**
     * Returns useConversionTracking.
     * <p>
     * Field description:
     * Indicates if a message has to be tracked for conversion rates. Default \&quot;false\&quot;.
     *
     * @return useConversionTracking
     */
    @JsonProperty("useConversionTracking")
    public Boolean getUseConversionTracking() {
        return useConversionTracking;
    }

    /**
     * Sets useConversionTracking.
     * <p>
     * Field description:
     * Indicates if a message has to be tracked for conversion rates. Default \&quot;false\&quot;.
     *
     * @param useConversionTracking
     */
    @JsonProperty("useConversionTracking")
    public void setUseConversionTracking(Boolean useConversionTracking) {
        this.useConversionTracking = useConversionTracking;
    }

    /**
     * Sets conversionTrackingName.
     * <p>
     * Field description:
     * Sets a custom conversion type naming convention, e.g. &#x60;ONE_TIME_PIN&#x60; or &#x60;SOCIAL_INVITES&#x60;.
     *
     * @param conversionTrackingName
     * @return This {@link SmsTracking instance}.
     */
    public SmsTracking conversionTrackingName(String conversionTrackingName) {
        this.conversionTrackingName = conversionTrackingName;
        return this;
    }

    /**
     * Returns conversionTrackingName.
     * <p>
     * Field description:
     * Sets a custom conversion type naming convention, e.g. &#x60;ONE_TIME_PIN&#x60; or &#x60;SOCIAL_INVITES&#x60;.
     *
     * @return conversionTrackingName
     */
    @JsonProperty("conversionTrackingName")
    public String getConversionTrackingName() {
        return conversionTrackingName;
    }

    /**
     * Sets conversionTrackingName.
     * <p>
     * Field description:
     * Sets a custom conversion type naming convention, e.g. &#x60;ONE_TIME_PIN&#x60; or &#x60;SOCIAL_INVITES&#x60;.
     *
     * @param conversionTrackingName
     */
    @JsonProperty("conversionTrackingName")
    public void setConversionTrackingName(String conversionTrackingName) {
        this.conversionTrackingName = conversionTrackingName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsTracking smsTracking = (SmsTracking) o;
        return Objects.equals(this.useConversionTracking, smsTracking.useConversionTracking)
                && Objects.equals(this.conversionTrackingName, smsTracking.conversionTrackingName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(useConversionTracking, conversionTrackingName);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsTracking {")
                .append(newLine)
                .append("    useConversionTracking: ")
                .append(toIndentedString(useConversionTracking))
                .append(newLine)
                .append("    conversionTrackingName: ")
                .append(toIndentedString(conversionTrackingName))
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
