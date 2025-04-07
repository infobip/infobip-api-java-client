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
public class MessagesApiMessageDeliveryReporting {

    private String url;

    private Boolean intermediateReport;

    private Boolean receiveTriggeredFailoverReports;

    /**
     * Sets url.
     * <p>
     * Field description:
     * The URL on your call back server where a delivery report will be sent. If your URL becomes unavailable then the [retry cycle](https://www.infobip.com/docs/sms/api#notify-url) uses the following formula: &#x60;1min + (1min * retryNumber * retryNumber)&#x60;.
     *
     * @param url
     * @return This {@link MessagesApiMessageDeliveryReporting instance}.
     */
    public MessagesApiMessageDeliveryReporting url(String url) {
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
     * The real-time intermediate delivery report containing GSM error codes, messages status, pricing, network and country codes, etc., which will be sent on your callback server. The default setting is &#x60;false&#x60;.
     *
     * @param intermediateReport
     * @return This {@link MessagesApiMessageDeliveryReporting instance}.
     */
    public MessagesApiMessageDeliveryReporting intermediateReport(Boolean intermediateReport) {
        this.intermediateReport = intermediateReport;
        return this;
    }

    /**
     * Returns intermediateReport.
     * <p>
     * Field description:
     * The real-time intermediate delivery report containing GSM error codes, messages status, pricing, network and country codes, etc., which will be sent on your callback server. The default setting is &#x60;false&#x60;.
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
     * The real-time intermediate delivery report containing GSM error codes, messages status, pricing, network and country codes, etc., which will be sent on your callback server. The default setting is &#x60;false&#x60;.
     *
     * @param intermediateReport
     */
    @JsonProperty("intermediateReport")
    public void setIntermediateReport(Boolean intermediateReport) {
        this.intermediateReport = intermediateReport;
    }

    /**
     * Sets receiveTriggeredFailoverReports.
     * <p>
     * Field description:
     * Allows you to receive delivery reports for all triggered failover steps, not just the final one (either the first successful or the last failed step). The default setting is &#x60;false&#x60;.
     *
     * @param receiveTriggeredFailoverReports
     * @return This {@link MessagesApiMessageDeliveryReporting instance}.
     */
    public MessagesApiMessageDeliveryReporting receiveTriggeredFailoverReports(
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
        MessagesApiMessageDeliveryReporting messagesApiMessageDeliveryReporting =
                (MessagesApiMessageDeliveryReporting) o;
        return Objects.equals(this.url, messagesApiMessageDeliveryReporting.url)
                && Objects.equals(this.intermediateReport, messagesApiMessageDeliveryReporting.intermediateReport)
                && Objects.equals(
                        this.receiveTriggeredFailoverReports,
                        messagesApiMessageDeliveryReporting.receiveTriggeredFailoverReports);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, intermediateReport, receiveTriggeredFailoverReports);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageDeliveryReporting {")
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
                .append(newLine)
                .append("    intermediateReport: ")
                .append(toIndentedString(intermediateReport))
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
