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
 * Represents CallsGenesysCloudProvider model.
 */
public class CallsGenesysCloudProvider extends CallsPegasusProvider {

    private CallsGenesysCloudRegion region;

    private String outboundTerminationFQDN;

    private String inboundTerminationIdentifier;

    /**
     * Constructs a new {@link CallsGenesysCloudProvider} instance.
     */
    public CallsGenesysCloudProvider() {
        super("GENESYS_CLOUD");
    }

    /**
     * Sets region.
     * <p>
     * The field is required.
     *
     * @param region
     * @return This {@link CallsGenesysCloudProvider instance}.
     */
    public CallsGenesysCloudProvider region(CallsGenesysCloudRegion region) {
        this.region = region;
        return this;
    }

    /**
     * Returns region.
     * <p>
     * The field is required.
     *
     * @return region
     */
    @JsonProperty("region")
    public CallsGenesysCloudRegion getRegion() {
        return region;
    }

    /**
     * Sets region.
     * <p>
     * The field is required.
     *
     * @param region
     */
    @JsonProperty("region")
    public void setRegion(CallsGenesysCloudRegion region) {
        this.region = region;
    }

    /**
     * Sets outboundTerminationFQDN.
     * <p>
     * Field description:
     * Outbound termination FQDN.
     *
     * @param outboundTerminationFQDN
     * @return This {@link CallsGenesysCloudProvider instance}.
     */
    public CallsGenesysCloudProvider outboundTerminationFQDN(String outboundTerminationFQDN) {
        this.outboundTerminationFQDN = outboundTerminationFQDN;
        return this;
    }

    /**
     * Returns outboundTerminationFQDN.
     * <p>
     * Field description:
     * Outbound termination FQDN.
     *
     * @return outboundTerminationFQDN
     */
    @JsonProperty("outboundTerminationFQDN")
    public String getOutboundTerminationFQDN() {
        return outboundTerminationFQDN;
    }

    /**
     * Sets outboundTerminationFQDN.
     * <p>
     * Field description:
     * Outbound termination FQDN.
     *
     * @param outboundTerminationFQDN
     */
    @JsonProperty("outboundTerminationFQDN")
    public void setOutboundTerminationFQDN(String outboundTerminationFQDN) {
        this.outboundTerminationFQDN = outboundTerminationFQDN;
    }

    /**
     * Sets inboundTerminationIdentifier.
     * <p>
     * Field description:
     * Inbound termination identifier.
     *
     * @param inboundTerminationIdentifier
     * @return This {@link CallsGenesysCloudProvider instance}.
     */
    public CallsGenesysCloudProvider inboundTerminationIdentifier(String inboundTerminationIdentifier) {
        this.inboundTerminationIdentifier = inboundTerminationIdentifier;
        return this;
    }

    /**
     * Returns inboundTerminationIdentifier.
     * <p>
     * Field description:
     * Inbound termination identifier.
     *
     * @return inboundTerminationIdentifier
     */
    @JsonProperty("inboundTerminationIdentifier")
    public String getInboundTerminationIdentifier() {
        return inboundTerminationIdentifier;
    }

    /**
     * Sets inboundTerminationIdentifier.
     * <p>
     * Field description:
     * Inbound termination identifier.
     *
     * @param inboundTerminationIdentifier
     */
    @JsonProperty("inboundTerminationIdentifier")
    public void setInboundTerminationIdentifier(String inboundTerminationIdentifier) {
        this.inboundTerminationIdentifier = inboundTerminationIdentifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsGenesysCloudProvider callsGenesysCloudProvider = (CallsGenesysCloudProvider) o;
        return Objects.equals(this.region, callsGenesysCloudProvider.region)
                && Objects.equals(this.outboundTerminationFQDN, callsGenesysCloudProvider.outboundTerminationFQDN)
                && Objects.equals(
                        this.inboundTerminationIdentifier, callsGenesysCloudProvider.inboundTerminationIdentifier)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, outboundTerminationFQDN, inboundTerminationIdentifier, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsGenesysCloudProvider {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    region: ")
                .append(toIndentedString(region))
                .append(newLine)
                .append("    outboundTerminationFQDN: ")
                .append(toIndentedString(outboundTerminationFQDN))
                .append(newLine)
                .append("    inboundTerminationIdentifier: ")
                .append(toIndentedString(inboundTerminationIdentifier))
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
