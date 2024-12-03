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
 * WebRTC custom data. To meet the criteria, all of the provided custom data pairs must match.
 */
public class CallRoutingCustomDataEntry {

    private String key;

    private String value;

    /**
     * Sets key.
     * <p>
     * Field description:
     * Custom data key. Example: &#x60;key1&#x60;.
     * <p>
     * The field is required.
     *
     * @param key
     * @return This {@link CallRoutingCustomDataEntry instance}.
     */
    public CallRoutingCustomDataEntry key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Returns key.
     * <p>
     * Field description:
     * Custom data key. Example: &#x60;key1&#x60;.
     * <p>
     * The field is required.
     *
     * @return key
     */
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    /**
     * Sets key.
     * <p>
     * Field description:
     * Custom data key. Example: &#x60;key1&#x60;.
     * <p>
     * The field is required.
     *
     * @param key
     */
    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * Sets value.
     * <p>
     * Field description:
     * Custom data value or regular expression pattern representing the value. Examples: &#x60;value1&#x60;, &#x60;value(.+)&#x60;.
     *
     * @param value
     * @return This {@link CallRoutingCustomDataEntry instance}.
     */
    public CallRoutingCustomDataEntry value(String value) {
        this.value = value;
        return this;
    }

    /**
     * Returns value.
     * <p>
     * Field description:
     * Custom data value or regular expression pattern representing the value. Examples: &#x60;value1&#x60;, &#x60;value(.+)&#x60;.
     *
     * @return value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * Sets value.
     * <p>
     * Field description:
     * Custom data value or regular expression pattern representing the value. Examples: &#x60;value1&#x60;, &#x60;value(.+)&#x60;.
     *
     * @param value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallRoutingCustomDataEntry callRoutingCustomDataEntry = (CallRoutingCustomDataEntry) o;
        return Objects.equals(this.key, callRoutingCustomDataEntry.key)
                && Objects.equals(this.value, callRoutingCustomDataEntry.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallRoutingCustomDataEntry {")
                .append(newLine)
                .append("    key: ")
                .append(toIndentedString(key))
                .append(newLine)
                .append("    value: ")
                .append(toIndentedString(value))
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
