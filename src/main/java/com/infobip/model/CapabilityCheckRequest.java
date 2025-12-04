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
 * Represents CapabilityCheckRequest model.
 */
public class CapabilityCheckRequest {

    private List<String> numbers = new ArrayList<>();

    private List<String> channels;

    /**
     * Sets numbers.
     * <p>
     * Field description:
     * List of phone numbers to check capabilities for.
     * <p>
     * The field is required.
     *
     * @param numbers
     * @return This {@link CapabilityCheckRequest instance}.
     */
    public CapabilityCheckRequest numbers(List<String> numbers) {
        this.numbers = numbers;
        return this;
    }

    /**
     * Adds and item into numbers.
     * <p>
     * Field description:
     * List of phone numbers to check capabilities for.
     * <p>
     * The field is required.
     *
     * @param numbersItem The item to be added to the list.
     * @return This {@link CapabilityCheckRequest instance}.
     */
    public CapabilityCheckRequest addNumbersItem(String numbersItem) {
        if (this.numbers == null) {
            this.numbers = new ArrayList<>();
        }
        this.numbers.add(numbersItem);
        return this;
    }

    /**
     * Returns numbers.
     * <p>
     * Field description:
     * List of phone numbers to check capabilities for.
     * <p>
     * The field is required.
     *
     * @return numbers
     */
    @JsonProperty("numbers")
    public List<String> getNumbers() {
        return numbers;
    }

    /**
     * Sets numbers.
     * <p>
     * Field description:
     * List of phone numbers to check capabilities for.
     * <p>
     * The field is required.
     *
     * @param numbers
     */
    @JsonProperty("numbers")
    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    /**
     * Sets channels.
     * <p>
     * Field description:
     * List of channels to check support for. If not provided, all channels will be checked.
     *
     * @param channels
     * @return This {@link CapabilityCheckRequest instance}.
     */
    public CapabilityCheckRequest channels(List<String> channels) {
        this.channels = channels;
        return this;
    }

    /**
     * Adds and item into channels.
     * <p>
     * Field description:
     * List of channels to check support for. If not provided, all channels will be checked.
     *
     * @param channelsItem The item to be added to the list.
     * @return This {@link CapabilityCheckRequest instance}.
     */
    public CapabilityCheckRequest addChannelsItem(String channelsItem) {
        if (this.channels == null) {
            this.channels = new ArrayList<>();
        }
        this.channels.add(channelsItem);
        return this;
    }

    /**
     * Returns channels.
     * <p>
     * Field description:
     * List of channels to check support for. If not provided, all channels will be checked.
     *
     * @return channels
     */
    @JsonProperty("channels")
    public List<String> getChannels() {
        return channels;
    }

    /**
     * Sets channels.
     * <p>
     * Field description:
     * List of channels to check support for. If not provided, all channels will be checked.
     *
     * @param channels
     */
    @JsonProperty("channels")
    public void setChannels(List<String> channels) {
        this.channels = channels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CapabilityCheckRequest capabilityCheckRequest = (CapabilityCheckRequest) o;
        return Objects.equals(this.numbers, capabilityCheckRequest.numbers)
                && Objects.equals(this.channels, capabilityCheckRequest.channels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numbers, channels);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CapabilityCheckRequest {")
                .append(newLine)
                .append("    numbers: ")
                .append(toIndentedString(numbers))
                .append(newLine)
                .append("    channels: ")
                .append(toIndentedString(channels))
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
