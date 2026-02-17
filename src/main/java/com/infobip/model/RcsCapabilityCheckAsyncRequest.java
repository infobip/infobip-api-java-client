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
 * Represents RcsCapabilityCheckAsyncRequest model.
 */
public class RcsCapabilityCheckAsyncRequest {

    private String sender;

    private List<String> phoneNumbers = new ArrayList<>();

    private String notifyUrl;

    private String notifyContentType;

    private RcsCapabilityCheckOptions options;

    /**
     * Sets sender.
     * <p>
     * Field description:
     * Identifier of an RCS sender that will be used to send message.
     * <p>
     * The field is required.
     *
     * @param sender
     * @return This {@link RcsCapabilityCheckAsyncRequest instance}.
     */
    public RcsCapabilityCheckAsyncRequest sender(String sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Returns sender.
     * <p>
     * Field description:
     * Identifier of an RCS sender that will be used to send message.
     * <p>
     * The field is required.
     *
     * @return sender
     */
    @JsonProperty("sender")
    public String getSender() {
        return sender;
    }

    /**
     * Sets sender.
     * <p>
     * Field description:
     * Identifier of an RCS sender that will be used to send message.
     * <p>
     * The field is required.
     *
     * @param sender
     */
    @JsonProperty("sender")
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * Sets phoneNumbers.
     * <p>
     * Field description:
     * A list of phone numbers to check for RCS capability (for example, &#x60;[\&quot;441134960001\&quot;, \&quot;441134960002\&quot;]&#x60;).
     * <p>
     * The field is required.
     *
     * @param phoneNumbers
     * @return This {@link RcsCapabilityCheckAsyncRequest instance}.
     */
    public RcsCapabilityCheckAsyncRequest phoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    /**
     * Adds and item into phoneNumbers.
     * <p>
     * Field description:
     * A list of phone numbers to check for RCS capability (for example, &#x60;[\&quot;441134960001\&quot;, \&quot;441134960002\&quot;]&#x60;).
     * <p>
     * The field is required.
     *
     * @param phoneNumbersItem The item to be added to the list.
     * @return This {@link RcsCapabilityCheckAsyncRequest instance}.
     */
    public RcsCapabilityCheckAsyncRequest addPhoneNumbersItem(String phoneNumbersItem) {
        if (this.phoneNumbers == null) {
            this.phoneNumbers = new ArrayList<>();
        }
        this.phoneNumbers.add(phoneNumbersItem);
        return this;
    }

    /**
     * Returns phoneNumbers.
     * <p>
     * Field description:
     * A list of phone numbers to check for RCS capability (for example, &#x60;[\&quot;441134960001\&quot;, \&quot;441134960002\&quot;]&#x60;).
     * <p>
     * The field is required.
     *
     * @return phoneNumbers
     */
    @JsonProperty("phoneNumbers")
    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * Sets phoneNumbers.
     * <p>
     * Field description:
     * A list of phone numbers to check for RCS capability (for example, &#x60;[\&quot;441134960001\&quot;, \&quot;441134960002\&quot;]&#x60;).
     * <p>
     * The field is required.
     *
     * @param phoneNumbers
     */
    @JsonProperty("phoneNumbers")
    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    /**
     * Sets notifyUrl.
     * <p>
     * Field description:
     * The URL of your callback server where the RCS capability check report will be sent. The schema for this endpoint is documented at [Receive Capability Check result](#channels/rcs/receive-capability-check-result).If notifyUrl is empty, events will be sent to the URL you added via Subscription API. The event name is CapCheck.
     *
     * @param notifyUrl
     * @return This {@link RcsCapabilityCheckAsyncRequest instance}.
     */
    public RcsCapabilityCheckAsyncRequest notifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }

    /**
     * Returns notifyUrl.
     * <p>
     * Field description:
     * The URL of your callback server where the RCS capability check report will be sent. The schema for this endpoint is documented at [Receive Capability Check result](#channels/rcs/receive-capability-check-result).If notifyUrl is empty, events will be sent to the URL you added via Subscription API. The event name is CapCheck.
     *
     * @return notifyUrl
     */
    @JsonProperty("notifyUrl")
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * Sets notifyUrl.
     * <p>
     * Field description:
     * The URL of your callback server where the RCS capability check report will be sent. The schema for this endpoint is documented at [Receive Capability Check result](#channels/rcs/receive-capability-check-result).If notifyUrl is empty, events will be sent to the URL you added via Subscription API. The event name is CapCheck.
     *
     * @param notifyUrl
     */
    @JsonProperty("notifyUrl")
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    /**
     * Sets notifyContentType.
     * <p>
     * Field description:
     * The preferred content type for the RCS capability check report. Options are: &#x60;application/json&#x60; or &#x60;application/xml&#x60;.
     *
     * @param notifyContentType
     * @return This {@link RcsCapabilityCheckAsyncRequest instance}.
     */
    public RcsCapabilityCheckAsyncRequest notifyContentType(String notifyContentType) {
        this.notifyContentType = notifyContentType;
        return this;
    }

    /**
     * Returns notifyContentType.
     * <p>
     * Field description:
     * The preferred content type for the RCS capability check report. Options are: &#x60;application/json&#x60; or &#x60;application/xml&#x60;.
     *
     * @return notifyContentType
     */
    @JsonProperty("notifyContentType")
    public String getNotifyContentType() {
        return notifyContentType;
    }

    /**
     * Sets notifyContentType.
     * <p>
     * Field description:
     * The preferred content type for the RCS capability check report. Options are: &#x60;application/json&#x60; or &#x60;application/xml&#x60;.
     *
     * @param notifyContentType
     */
    @JsonProperty("notifyContentType")
    public void setNotifyContentType(String notifyContentType) {
        this.notifyContentType = notifyContentType;
    }

    /**
     * Sets options.
     *
     * @param options
     * @return This {@link RcsCapabilityCheckAsyncRequest instance}.
     */
    public RcsCapabilityCheckAsyncRequest options(RcsCapabilityCheckOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns options.
     *
     * @return options
     */
    @JsonProperty("options")
    public RcsCapabilityCheckOptions getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(RcsCapabilityCheckOptions options) {
        this.options = options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RcsCapabilityCheckAsyncRequest rcsCapabilityCheckAsyncRequest = (RcsCapabilityCheckAsyncRequest) o;
        return Objects.equals(this.sender, rcsCapabilityCheckAsyncRequest.sender)
                && Objects.equals(this.phoneNumbers, rcsCapabilityCheckAsyncRequest.phoneNumbers)
                && Objects.equals(this.notifyUrl, rcsCapabilityCheckAsyncRequest.notifyUrl)
                && Objects.equals(this.notifyContentType, rcsCapabilityCheckAsyncRequest.notifyContentType)
                && Objects.equals(this.options, rcsCapabilityCheckAsyncRequest.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sender, phoneNumbers, notifyUrl, notifyContentType, options);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsCapabilityCheckAsyncRequest {")
                .append(newLine)
                .append("    sender: ")
                .append(toIndentedString(sender))
                .append(newLine)
                .append("    phoneNumbers: ")
                .append(toIndentedString(phoneNumbers))
                .append(newLine)
                .append("    notifyUrl: ")
                .append(toIndentedString(notifyUrl))
                .append(newLine)
                .append("    notifyContentType: ")
                .append(toIndentedString(notifyContentType))
                .append(newLine)
                .append("    options: ")
                .append(toIndentedString(options))
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
