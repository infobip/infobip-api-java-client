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
 * Represents CallsCiscoWebexProvider model.
 */
public class CallsCiscoWebexProvider extends CallsPegasusProvider {

    private String ciscoUUID;

    /**
     * Constructs a new {@link CallsCiscoWebexProvider} instance.
     */
    public CallsCiscoWebexProvider() {
        super("CISCO_WEBEX");
    }

    /**
     * Sets ciscoUUID.
     * <p>
     * Field description:
     * Cisco organization ID.
     * <p>
     * The field is required.
     *
     * @param ciscoUUID
     * @return This {@link CallsCiscoWebexProvider instance}.
     */
    public CallsCiscoWebexProvider ciscoUUID(String ciscoUUID) {
        this.ciscoUUID = ciscoUUID;
        return this;
    }

    /**
     * Returns ciscoUUID.
     * <p>
     * Field description:
     * Cisco organization ID.
     * <p>
     * The field is required.
     *
     * @return ciscoUUID
     */
    @JsonProperty("ciscoUUID")
    public String getCiscoUUID() {
        return ciscoUUID;
    }

    /**
     * Sets ciscoUUID.
     * <p>
     * Field description:
     * Cisco organization ID.
     * <p>
     * The field is required.
     *
     * @param ciscoUUID
     */
    @JsonProperty("ciscoUUID")
    public void setCiscoUUID(String ciscoUUID) {
        this.ciscoUUID = ciscoUUID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsCiscoWebexProvider callsCiscoWebexProvider = (CallsCiscoWebexProvider) o;
        return Objects.equals(this.ciscoUUID, callsCiscoWebexProvider.ciscoUUID) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ciscoUUID, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsCiscoWebexProvider {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    ciscoUUID: ")
                .append(toIndentedString(ciscoUUID))
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
