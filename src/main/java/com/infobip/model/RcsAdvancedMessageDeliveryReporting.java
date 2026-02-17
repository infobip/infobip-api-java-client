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
public class RcsAdvancedMessageDeliveryReporting {

    private String url;

    private Boolean intermediateReport;

    private Boolean notify;

    private Boolean receiveTriggeredFailoverReports;

    /**
     * Sets url.
     * <p>
     * Field description:
     * The URL on your call back server where a delivery report will be sent. If your URL becomes unavailable then the [retry cycle](https://www.infobip.com/docs/sms/sms-over-api#push-retry-cycle-notify-url) uses the following formula: &#x60;1min + (1min * retryNumber * retryNumber)&#x60;.
     *
     * @param url
     * @return This {@link RcsAdvancedMessageDeliveryReporting instance}.
     */
    public RcsAdvancedMessageDeliveryReporting url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     * <p>
     * Field description:
     * The URL on your call back server where a delivery report will be sent. If your URL becomes unavailable then the [retry cycle](https://www.infobip.com/docs/sms/sms-over-api#push-retry-cycle-notify-url) uses the following formula: &#x60;1min + (1min * retryNumber * retryNumber)&#x60;.
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
     * The URL on your call back server where a delivery report will be sent. If your URL becomes unavailable then the [retry cycle](https://www.infobip.com/docs/sms/sms-over-api#push-retry-cycle-notify-url) uses the following formula: &#x60;1min + (1min * retryNumber * retryNumber)&#x60;.
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
     * @return This {@link RcsAdvancedMessageDeliveryReporting instance}.
     */
    public RcsAdvancedMessageDeliveryReporting intermediateReport(Boolean intermediateReport) {
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
     * @return This {@link RcsAdvancedMessageDeliveryReporting instance}.
     */
    public RcsAdvancedMessageDeliveryReporting notify(Boolean notify) {
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

    /**
     * Sets receiveTriggeredFailoverReports.
     * <p>
     * Field description:
     * Allows you to receive delivery reports for all triggered failover steps, not just the final one (either the first successful or the last failed step). The default setting is &#x60;false&#x60;.
     *
     * @param receiveTriggeredFailoverReports
     * @return This {@link RcsAdvancedMessageDeliveryReporting instance}.
     */
    public RcsAdvancedMessageDeliveryReporting receiveTriggeredFailoverReports(
            Boolean receiveTriggeredFailoverReports) {
        this.receiveTriggeredFailoverReports = receiveTriggeredFailoverReports;
        return this;
    }

    /**
     * Returns receiveTriggeredFailoverReports.
     * <p>
     * Field description:
     * Allows you to receive delivery reports for all triggered failover steps, not just the final one (either the first successful or the last failed step). The default setting is &#x60;false&#x60;.
     *
     * @return receiveTriggeredFailoverReports
     */
    @JsonProperty("receiveTriggeredFailoverReports")
    public Boolean getReceiveTriggeredFailoverReports() {
        return receiveTriggeredFailoverReports;
    }

    /**
     * Sets receiveTriggeredFailoverReports.
     * <p>
     * Field description:
     * Allows you to receive delivery reports for all triggered failover steps, not just the final one (either the first successful or the last failed step). The default setting is &#x60;false&#x60;.
     *
     * @param receiveTriggeredFailoverReports
     */
    @JsonProperty("receiveTriggeredFailoverReports")
    public void setReceiveTriggeredFailoverReports(Boolean receiveTriggeredFailoverReports) {
        this.receiveTriggeredFailoverReports = receiveTriggeredFailoverReports;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsAdvancedMessageDeliveryReporting rcsAdvancedMessageDeliveryReporting =
                (RcsAdvancedMessageDeliveryReporting) o;
        return Objects.equals(this.url, rcsAdvancedMessageDeliveryReporting.url)
                && Objects.equals(this.intermediateReport, rcsAdvancedMessageDeliveryReporting.intermediateReport)
                && Objects.equals(this.notify, rcsAdvancedMessageDeliveryReporting.notify)
                && Objects.equals(
                        this.receiveTriggeredFailoverReports,
                        rcsAdvancedMessageDeliveryReporting.receiveTriggeredFailoverReports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, intermediateReport, notify, receiveTriggeredFailoverReports);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsAdvancedMessageDeliveryReporting {")
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
                .append("    receiveTriggeredFailoverReports: ")
                .append(toIndentedString(receiveTriggeredFailoverReports))
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
