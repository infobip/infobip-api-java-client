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
 * Represents RcsCapabilityCheckSyncRequest model.
 */
public class RcsCapabilityCheckSyncRequest {

    private String sender;

    private List<String> phoneNumbers = new ArrayList<>();

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
     * @return This {@link RcsCapabilityCheckSyncRequest instance}.
     */
    public RcsCapabilityCheckSyncRequest sender(String sender) {
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
     * A list of phone numbers (1 to 5) to check for RCS capability (for example, &#x60;[\&quot;441134960001\&quot;, \&quot;441134960002\&quot;]&#x60;).
     * <p>
     * The field is required.
     *
     * @param phoneNumbers
     * @return This {@link RcsCapabilityCheckSyncRequest instance}.
     */
    public RcsCapabilityCheckSyncRequest phoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    /**
     * Adds and item into phoneNumbers.
     * <p>
     * Field description:
     * A list of phone numbers (1 to 5) to check for RCS capability (for example, &#x60;[\&quot;441134960001\&quot;, \&quot;441134960002\&quot;]&#x60;).
     * <p>
     * The field is required.
     *
     * @param phoneNumbersItem The item to be added to the list.
     * @return This {@link RcsCapabilityCheckSyncRequest instance}.
     */
    public RcsCapabilityCheckSyncRequest addPhoneNumbersItem(String phoneNumbersItem) {
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
     * A list of phone numbers (1 to 5) to check for RCS capability (for example, &#x60;[\&quot;441134960001\&quot;, \&quot;441134960002\&quot;]&#x60;).
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
     * A list of phone numbers (1 to 5) to check for RCS capability (for example, &#x60;[\&quot;441134960001\&quot;, \&quot;441134960002\&quot;]&#x60;).
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
     * Sets options.
     *
     * @param options
     * @return This {@link RcsCapabilityCheckSyncRequest instance}.
     */
    public RcsCapabilityCheckSyncRequest options(RcsCapabilityCheckOptions options) {
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
        RcsCapabilityCheckSyncRequest rcsCapabilityCheckSyncRequest = (RcsCapabilityCheckSyncRequest) o;
        return Objects.equals(this.sender, rcsCapabilityCheckSyncRequest.sender)
                && Objects.equals(this.phoneNumbers, rcsCapabilityCheckSyncRequest.phoneNumbers)
                && Objects.equals(this.options, rcsCapabilityCheckSyncRequest.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sender, phoneNumbers, options);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class RcsCapabilityCheckSyncRequest {")
                .append(newLine)
                .append("    sender: ")
                .append(toIndentedString(sender))
                .append(newLine)
                .append("    phoneNumbers: ")
                .append(toIndentedString(phoneNumbers))
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
