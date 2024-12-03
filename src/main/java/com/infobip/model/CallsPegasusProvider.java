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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.Objects;

/**
 * Represents CallsPegasusProvider model.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CallsCiscoWebexProvider.class, name = "CISCO_WEBEX"),
    @JsonSubTypes.Type(value = CallsFreshworksProvider.class, name = "FRESHWORKS"),
    @JsonSubTypes.Type(value = CallsGenesysCloudProvider.class, name = "GENESYS_CLOUD"),
})
public abstract class CallsPegasusProvider {

    protected final CallsPegasusProviderTrunkType type;

    /**
     * Constructs a new {@link CallsPegasusProvider} instance.
     */
    public CallsPegasusProvider(String type) {
        this.type = CallsPegasusProviderTrunkType.fromValue(type);
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public CallsPegasusProviderTrunkType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsPegasusProvider callsPegasusProvider = (CallsPegasusProvider) o;
        return Objects.equals(this.type, callsPegasusProvider.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsPegasusProvider {")
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
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
