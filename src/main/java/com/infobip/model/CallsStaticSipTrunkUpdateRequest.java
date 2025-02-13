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
 * Represents CallsStaticSipTrunkUpdateRequest model.
 */
public class CallsStaticSipTrunkUpdateRequest extends CallsSipTrunkUpdateRequest {

    private List<String> sourceHosts = null;

    private List<String> destinationHosts = null;

    private CallsSelectionStrategy strategy;

    private List<CallsAudioCodec> codecs = null;

    private CallsDtmfType dtmf;

    private CallsFaxType fax;

    private CallsAnonymizationType anonymization;

    private CallsNumberPresentationFormat numberFormat;

    private CallsSipOptions sipOptions;

    /**
     * Constructs a new {@link CallsStaticSipTrunkUpdateRequest} instance.
     */
    public CallsStaticSipTrunkUpdateRequest() {
        super("STATIC");
    }

    /**
     * Sets sourceHosts.
     * <p>
     * Field description:
     * List of SIP trunk source hosts. If empty, destination host list must not be empty. Source hosts can be sent in 2 formats: IP address without port or domain without port.
     *
     * @param sourceHosts
     * @return This {@link CallsStaticSipTrunkUpdateRequest instance}.
     */
    public CallsStaticSipTrunkUpdateRequest sourceHosts(List<String> sourceHosts) {
        this.sourceHosts = sourceHosts;
        return this;
    }

    /**
     * Adds and item into sourceHosts.
     * <p>
     * Field description:
     * List of SIP trunk source hosts. If empty, destination host list must not be empty. Source hosts can be sent in 2 formats: IP address without port or domain without port.
     *
     * @param sourceHostsItem The item to be added to the list.
     * @return This {@link CallsStaticSipTrunkUpdateRequest instance}.
     */
    public CallsStaticSipTrunkUpdateRequest addSourceHostsItem(String sourceHostsItem) {
        if (this.sourceHosts == null) {
            this.sourceHosts = new ArrayList<>();
        }
        this.sourceHosts.add(sourceHostsItem);
        return this;
    }

    /**
     * Returns sourceHosts.
     * <p>
     * Field description:
     * List of SIP trunk source hosts. If empty, destination host list must not be empty. Source hosts can be sent in 2 formats: IP address without port or domain without port.
     *
     * @return sourceHosts
     */
    @JsonProperty("sourceHosts")
    public List<String> getSourceHosts() {
        return sourceHosts;
    }

    /**
     * Sets sourceHosts.
     * <p>
     * Field description:
     * List of SIP trunk source hosts. If empty, destination host list must not be empty. Source hosts can be sent in 2 formats: IP address without port or domain without port.
     *
     * @param sourceHosts
     */
    @JsonProperty("sourceHosts")
    public void setSourceHosts(List<String> sourceHosts) {
        this.sourceHosts = sourceHosts;
    }

    /**
     * Sets destinationHosts.
     * <p>
     * Field description:
     * List of SIP trunk destination hosts. If empty, source host list must not be empty. Destination hosts can be sent in 3 formats: IP address with port, domain name with port or domain name without port. The port must fall in the range 1025-65535 or be 0 for SRV lookup.
     *
     * @param destinationHosts
     * @return This {@link CallsStaticSipTrunkUpdateRequest instance}.
     */
    public CallsStaticSipTrunkUpdateRequest destinationHosts(List<String> destinationHosts) {
        this.destinationHosts = destinationHosts;
        return this;
    }

    /**
     * Adds and item into destinationHosts.
     * <p>
     * Field description:
     * List of SIP trunk destination hosts. If empty, source host list must not be empty. Destination hosts can be sent in 3 formats: IP address with port, domain name with port or domain name without port. The port must fall in the range 1025-65535 or be 0 for SRV lookup.
     *
     * @param destinationHostsItem The item to be added to the list.
     * @return This {@link CallsStaticSipTrunkUpdateRequest instance}.
     */
    public CallsStaticSipTrunkUpdateRequest addDestinationHostsItem(String destinationHostsItem) {
        if (this.destinationHosts == null) {
            this.destinationHosts = new ArrayList<>();
        }
        this.destinationHosts.add(destinationHostsItem);
        return this;
    }

    /**
     * Returns destinationHosts.
     * <p>
     * Field description:
     * List of SIP trunk destination hosts. If empty, source host list must not be empty. Destination hosts can be sent in 3 formats: IP address with port, domain name with port or domain name without port. The port must fall in the range 1025-65535 or be 0 for SRV lookup.
     *
     * @return destinationHosts
     */
    @JsonProperty("destinationHosts")
    public List<String> getDestinationHosts() {
        return destinationHosts;
    }

    /**
     * Sets destinationHosts.
     * <p>
     * Field description:
     * List of SIP trunk destination hosts. If empty, source host list must not be empty. Destination hosts can be sent in 3 formats: IP address with port, domain name with port or domain name without port. The port must fall in the range 1025-65535 or be 0 for SRV lookup.
     *
     * @param destinationHosts
     */
    @JsonProperty("destinationHosts")
    public void setDestinationHosts(List<String> destinationHosts) {
        this.destinationHosts = destinationHosts;
    }

    /**
     * Sets strategy.
     *
     * @param strategy
     * @return This {@link CallsStaticSipTrunkUpdateRequest instance}.
     */
    public CallsStaticSipTrunkUpdateRequest strategy(CallsSelectionStrategy strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * Returns strategy.
     *
     * @return strategy
     */
    @JsonProperty("strategy")
    public CallsSelectionStrategy getStrategy() {
        return strategy;
    }

    /**
     * Sets strategy.
     *
     * @param strategy
     */
    @JsonProperty("strategy")
    public void setStrategy(CallsSelectionStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Sets codecs.
     * <p>
     * Field description:
     * List of audio codecs supported by a SIP trunk.
     *
     * @param codecs
     * @return This {@link CallsStaticSipTrunkUpdateRequest instance}.
     */
    public CallsStaticSipTrunkUpdateRequest codecs(List<CallsAudioCodec> codecs) {
        this.codecs = codecs;
        return this;
    }

    /**
     * Adds and item into codecs.
     * <p>
     * Field description:
     * List of audio codecs supported by a SIP trunk.
     *
     * @param codecsItem The item to be added to the list.
     * @return This {@link CallsStaticSipTrunkUpdateRequest instance}.
     */
    public CallsStaticSipTrunkUpdateRequest addCodecsItem(CallsAudioCodec codecsItem) {
        if (this.codecs == null) {
            this.codecs = new ArrayList<>();
        }
        this.codecs.add(codecsItem);
        return this;
    }

    /**
     * Returns codecs.
     * <p>
     * Field description:
     * List of audio codecs supported by a SIP trunk.
     *
     * @return codecs
     */
    @JsonProperty("codecs")
    public List<CallsAudioCodec> getCodecs() {
        return codecs;
    }

    /**
     * Sets codecs.
     * <p>
     * Field description:
     * List of audio codecs supported by a SIP trunk.
     *
     * @param codecs
     */
    @JsonProperty("codecs")
    public void setCodecs(List<CallsAudioCodec> codecs) {
        this.codecs = codecs;
    }

    /**
     * Sets dtmf.
     *
     * @param dtmf
     * @return This {@link CallsStaticSipTrunkUpdateRequest instance}.
     */
    public CallsStaticSipTrunkUpdateRequest dtmf(CallsDtmfType dtmf) {
        this.dtmf = dtmf;
        return this;
    }

    /**
     * Returns dtmf.
     *
     * @return dtmf
     */
    @JsonProperty("dtmf")
    public CallsDtmfType getDtmf() {
        return dtmf;
    }

    /**
     * Sets dtmf.
     *
     * @param dtmf
     */
    @JsonProperty("dtmf")
    public void setDtmf(CallsDtmfType dtmf) {
        this.dtmf = dtmf;
    }

    /**
     * Sets fax.
     *
     * @param fax
     * @return This {@link CallsStaticSipTrunkUpdateRequest instance}.
     */
    public CallsStaticSipTrunkUpdateRequest fax(CallsFaxType fax) {
        this.fax = fax;
        return this;
    }

    /**
     * Returns fax.
     *
     * @return fax
     */
    @JsonProperty("fax")
    public CallsFaxType getFax() {
        return fax;
    }

    /**
     * Sets fax.
     *
     * @param fax
     */
    @JsonProperty("fax")
    public void setFax(CallsFaxType fax) {
        this.fax = fax;
    }

    /**
     * Sets anonymization.
     *
     * @param anonymization
     * @return This {@link CallsStaticSipTrunkUpdateRequest instance}.
     */
    public CallsStaticSipTrunkUpdateRequest anonymization(CallsAnonymizationType anonymization) {
        this.anonymization = anonymization;
        return this;
    }

    /**
     * Returns anonymization.
     *
     * @return anonymization
     */
    @JsonProperty("anonymization")
    public CallsAnonymizationType getAnonymization() {
        return anonymization;
    }

    /**
     * Sets anonymization.
     *
     * @param anonymization
     */
    @JsonProperty("anonymization")
    public void setAnonymization(CallsAnonymizationType anonymization) {
        this.anonymization = anonymization;
    }

    /**
     * Sets numberFormat.
     *
     * @param numberFormat
     * @return This {@link CallsStaticSipTrunkUpdateRequest instance}.
     */
    public CallsStaticSipTrunkUpdateRequest numberFormat(CallsNumberPresentationFormat numberFormat) {
        this.numberFormat = numberFormat;
        return this;
    }

    /**
     * Returns numberFormat.
     *
     * @return numberFormat
     */
    @JsonProperty("numberFormat")
    public CallsNumberPresentationFormat getNumberFormat() {
        return numberFormat;
    }

    /**
     * Sets numberFormat.
     *
     * @param numberFormat
     */
    @JsonProperty("numberFormat")
    public void setNumberFormat(CallsNumberPresentationFormat numberFormat) {
        this.numberFormat = numberFormat;
    }

    /**
     * Sets sipOptions.
     *
     * @param sipOptions
     * @return This {@link CallsStaticSipTrunkUpdateRequest instance}.
     */
    public CallsStaticSipTrunkUpdateRequest sipOptions(CallsSipOptions sipOptions) {
        this.sipOptions = sipOptions;
        return this;
    }

    /**
     * Returns sipOptions.
     *
     * @return sipOptions
     */
    @JsonProperty("sipOptions")
    public CallsSipOptions getSipOptions() {
        return sipOptions;
    }

    /**
     * Sets sipOptions.
     *
     * @param sipOptions
     */
    @JsonProperty("sipOptions")
    public void setSipOptions(CallsSipOptions sipOptions) {
        this.sipOptions = sipOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsStaticSipTrunkUpdateRequest callsStaticSipTrunkUpdateRequest = (CallsStaticSipTrunkUpdateRequest) o;
        return Objects.equals(this.sourceHosts, callsStaticSipTrunkUpdateRequest.sourceHosts)
                && Objects.equals(this.destinationHosts, callsStaticSipTrunkUpdateRequest.destinationHosts)
                && Objects.equals(this.strategy, callsStaticSipTrunkUpdateRequest.strategy)
                && Objects.equals(this.codecs, callsStaticSipTrunkUpdateRequest.codecs)
                && Objects.equals(this.dtmf, callsStaticSipTrunkUpdateRequest.dtmf)
                && Objects.equals(this.fax, callsStaticSipTrunkUpdateRequest.fax)
                && Objects.equals(this.anonymization, callsStaticSipTrunkUpdateRequest.anonymization)
                && Objects.equals(this.numberFormat, callsStaticSipTrunkUpdateRequest.numberFormat)
                && Objects.equals(this.sipOptions, callsStaticSipTrunkUpdateRequest.sipOptions)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                sourceHosts,
                destinationHosts,
                strategy,
                codecs,
                dtmf,
                fax,
                anonymization,
                numberFormat,
                sipOptions,
                super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsStaticSipTrunkUpdateRequest {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    sourceHosts: ")
                .append(toIndentedString(sourceHosts))
                .append(newLine)
                .append("    destinationHosts: ")
                .append(toIndentedString(destinationHosts))
                .append(newLine)
                .append("    strategy: ")
                .append(toIndentedString(strategy))
                .append(newLine)
                .append("    codecs: ")
                .append(toIndentedString(codecs))
                .append(newLine)
                .append("    dtmf: ")
                .append(toIndentedString(dtmf))
                .append(newLine)
                .append("    fax: ")
                .append(toIndentedString(fax))
                .append(newLine)
                .append("    anonymization: ")
                .append(toIndentedString(anonymization))
                .append(newLine)
                .append("    numberFormat: ")
                .append(toIndentedString(numberFormat))
                .append(newLine)
                .append("    sipOptions: ")
                .append(toIndentedString(sipOptions))
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
