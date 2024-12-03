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
 * Provides options for configuring the delivery report behavior.
 */
public class SmsMessageDeliveryReporting {

    private String url;

    private Boolean intermediateReport;

    private Boolean notify;

    /**
     * Sets url.
     * <p>
     * Field description:
     * The URL on your call back server where a delivery report will be sent. If your URL becomes unavailable then the [retry cycle](https://www.infobip.com/docs/sms/api#notify-url) uses the following formula: &#x60;1min + (1min * retryNumber * retryNumber)&#x60;.
     *
     * @param url
     * @return This {@link SmsMessageDeliveryReporting instance}.
     */
    public SmsMessageDeliveryReporting url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * The URL on your call back server where a delivery report will be sent. If your URL becomes unavailable then the [retry cycle](https://www.infobip.com/docs/sms/api#notify-url) uses the following formula: &#x60;1min + (1min * retryNumber * retryNumber)&#x60;.
     *
     * @return url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     * <p>
     * Field description:
     * The URL on your call back server where a delivery report will be sent. If your URL becomes unavailable then the [retry cycle](https://www.infobip.com/docs/sms/api#notify-url) uses the following formula: &#x60;1min + (1min * retryNumber * retryNumber)&#x60;.
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Sets intermediateReport.
     * <p>
     * Field description:
     * The real-time intermediate delivery report containing GSM error codes, messages status, pricing, network and country codes, etc., which will be sent on your callback server. Defaults to &#x60;false&#x60;.
     *
     * @param intermediateReport
     * @return This {@link SmsMessageDeliveryReporting instance}.
     */
    public SmsMessageDeliveryReporting intermediateReport(Boolean intermediateReport) {
        this.intermediateReport = intermediateReport;
        return this;
    }

    /**
     * Returns intermediateReport.
     * <p>
     * Field description:
     * The real-time intermediate delivery report containing GSM error codes, messages status, pricing, network and country codes, etc., which will be sent on your callback server. Defaults to &#x60;false&#x60;.
     *
     * @return intermediateReport
     */
    @JsonProperty("intermediateReport")
    public Boolean getIntermediateReport() {
        return intermediateReport;
    }

    /**
     * Sets intermediateReport.
     * <p>
     * Field description:
     * The real-time intermediate delivery report containing GSM error codes, messages status, pricing, network and country codes, etc., which will be sent on your callback server. Defaults to &#x60;false&#x60;.
     *
     * @param intermediateReport
     */
    @JsonProperty("intermediateReport")
    public void setIntermediateReport(Boolean intermediateReport) {
        this.intermediateReport = intermediateReport;
    }

    /**
     * Sets notify.
     * <p>
     * Field description:
     * Notify enables you to specify your preferences for receiving DLRs. If set to false, no DLR will be sent. Note: When no webhook is specified in the request and notify is set to &#39;true&#39; or not defined, your Subscription settings will apply.
     *
     * @param notify
     * @return This {@link SmsMessageDeliveryReporting instance}.
     */
    public SmsMessageDeliveryReporting notify(Boolean notify) {
        this.notify = notify;
        return this;
    }

    /**
     * Returns notify.
     * <p>
     * Field description:
     * Notify enables you to specify your preferences for receiving DLRs. If set to false, no DLR will be sent. Note: When no webhook is specified in the request and notify is set to &#39;true&#39; or not defined, your Subscription settings will apply.
     *
     * @return notify
     */
    @JsonProperty("notify")
    public Boolean getNotify() {
        return notify;
    }

    /**
     * Sets notify.
     * <p>
     * Field description:
     * Notify enables you to specify your preferences for receiving DLRs. If set to false, no DLR will be sent. Note: When no webhook is specified in the request and notify is set to &#39;true&#39; or not defined, your Subscription settings will apply.
     *
     * @param notify
     */
    @JsonProperty("notify")
    public void setNotify(Boolean notify) {
        this.notify = notify;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsMessageDeliveryReporting smsMessageDeliveryReporting = (SmsMessageDeliveryReporting) o;
        return Objects.equals(this.url, smsMessageDeliveryReporting.url)
                && Objects.equals(this.intermediateReport, smsMessageDeliveryReporting.intermediateReport)
                && Objects.equals(this.notify, smsMessageDeliveryReporting.notify);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, intermediateReport, notify);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsMessageDeliveryReporting {")
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
                .append(newLine)
                .append("    intermediateReport: ")
                .append(toIndentedString(intermediateReport))
                .append(newLine)
                .append("    notify: ")
                .append(toIndentedString(notify))
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
