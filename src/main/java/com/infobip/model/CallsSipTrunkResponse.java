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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents CallsSipTrunkResponse model.
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
@JsonSubTypes({
    @JsonSubTypes.Type(value = CallsProviderSipTrunkResponse.class, name = "PROVIDER"),
    @JsonSubTypes.Type(value = CallsRegisteredSipTrunkResponse.class, name = "REGISTERED"),
    @JsonSubTypes.Type(value = CallsStaticSipTrunkResponse.class, name = "STATIC"),
})
public abstract class CallsSipTrunkResponse {

    private String id;

    protected final CallsSipTrunkType type;

    /**
     * Constructs a new {@link CallsSipTrunkResponse} instance.
     */
    public CallsSipTrunkResponse(String type) {
        this.type = CallsSipTrunkType.fromValue(type);
    }

    private String name;

    private CallsSipTrunkLocation location;

    private Boolean tls;

    private List<CallsAudioCodec> codecs = null;

    private CallsDtmfType dtmf;

    private CallsFaxType fax;

    private CallsNumberPresentationFormat numberFormat;

    private Boolean internationalCallsAllowed;

    private Integer channelLimit;

    private CallsAnonymizationType anonymization;

    private CallsBillingPackage billingPackage;

    private CallsSbcHosts sbcHosts;

    private CallsSipOptions sipOptions;

    /**
     * Sets id.
     * <p>
     * Field description:
     * SIP trunk ID.
     *
     * @param id
     * @return This {@link CallsSipTrunkResponse instance}.
     */
    public CallsSipTrunkResponse id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * SIP trunk ID.
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * SIP trunk ID.
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns type.
     *
     * @return type
     */
    @JsonProperty("type")
    public CallsSipTrunkType getType() {
        return type;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * SIP trunk name.
     *
     * @param name
     * @return This {@link CallsSipTrunkResponse instance}.
     */
    public CallsSipTrunkResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns name.
     * <p>
     * Field description:
     * SIP trunk name.
     *
     * @return name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * <p>
     * Field description:
     * SIP trunk name.
     *
     * @param name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets location.
     *
     * @param location
     * @return This {@link CallsSipTrunkResponse instance}.
     */
    public CallsSipTrunkResponse location(CallsSipTrunkLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Returns location.
     *
     * @return location
     */
    @JsonProperty("location")
    public CallsSipTrunkLocation getLocation() {
        return location;
    }

    /**
     * Sets location.
     *
     * @param location
     */
    @JsonProperty("location")
    public void setLocation(CallsSipTrunkLocation location) {
        this.location = location;
    }

    /**
     * Sets tls.
     * <p>
     * Field description:
     * Indicates whether communication is secured by the TLS protocol.
     *
     * @param tls
     * @return This {@link CallsSipTrunkResponse instance}.
     */
    public CallsSipTrunkResponse tls(Boolean tls) {
        this.tls = tls;
        return this;
    }

    /**
     * Returns tls.
     * <p>
     * Field description:
     * Indicates whether communication is secured by the TLS protocol.
     *
     * @return tls
     */
    @JsonProperty("tls")
    public Boolean getTls() {
        return tls;
    }

    /**
     * Sets tls.
     * <p>
     * Field description:
     * Indicates whether communication is secured by the TLS protocol.
     *
     * @param tls
     */
    @JsonProperty("tls")
    public void setTls(Boolean tls) {
        this.tls = tls;
    }

    /**
     * Sets codecs.
     * <p>
     * Field description:
     * List of audio codecs supported by a SIP trunk.
     *
     * @param codecs
     * @return This {@link CallsSipTrunkResponse instance}.
     */
    public CallsSipTrunkResponse codecs(List<CallsAudioCodec> codecs) {
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
     * @return This {@link CallsSipTrunkResponse instance}.
     */
    public CallsSipTrunkResponse addCodecsItem(CallsAudioCodec codecsItem) {
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
     * @return This {@link CallsSipTrunkResponse instance}.
     */
    public CallsSipTrunkResponse dtmf(CallsDtmfType dtmf) {
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
     * @return This {@link CallsSipTrunkResponse instance}.
     */
    public CallsSipTrunkResponse fax(CallsFaxType fax) {
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
     * Sets numberFormat.
     *
     * @param numberFormat
     * @return This {@link CallsSipTrunkResponse instance}.
     */
    public CallsSipTrunkResponse numberFormat(CallsNumberPresentationFormat numberFormat) {
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
     * Sets internationalCallsAllowed.
     * <p>
     * Field description:
     * Indicates whether international calls should be allowed. Calls between different countries are considered international.
     *
     * @param internationalCallsAllowed
     * @return This {@link CallsSipTrunkResponse instance}.
     */
    public CallsSipTrunkResponse internationalCallsAllowed(Boolean internationalCallsAllowed) {
        this.internationalCallsAllowed = internationalCallsAllowed;
        return this;
    }

    /**
     * Returns internationalCallsAllowed.
     * <p>
     * Field description:
     * Indicates whether international calls should be allowed. Calls between different countries are considered international.
     *
     * @return internationalCallsAllowed
     */
    @JsonProperty("internationalCallsAllowed")
    public Boolean getInternationalCallsAllowed() {
        return internationalCallsAllowed;
    }

    /**
     * Sets internationalCallsAllowed.
     * <p>
     * Field description:
     * Indicates whether international calls should be allowed. Calls between different countries are considered international.
     *
     * @param internationalCallsAllowed
     */
    @JsonProperty("internationalCallsAllowed")
    public void setInternationalCallsAllowed(Boolean internationalCallsAllowed) {
        this.internationalCallsAllowed = internationalCallsAllowed;
    }

    /**
     * Sets channelLimit.
     * <p>
     * Field description:
     * Maximum number of concurrent channels.
     *
     * @param channelLimit
     * @return This {@link CallsSipTrunkResponse instance}.
     */
    public CallsSipTrunkResponse channelLimit(Integer channelLimit) {
        this.channelLimit = channelLimit;
        return this;
    }

    /**
     * Returns channelLimit.
     * <p>
     * Field description:
     * Maximum number of concurrent channels.
     *
     * @return channelLimit
     */
    @JsonProperty("channelLimit")
    public Integer getChannelLimit() {
        return channelLimit;
    }

    /**
     * Sets channelLimit.
     * <p>
     * Field description:
     * Maximum number of concurrent channels.
     *
     * @param channelLimit
     */
    @JsonProperty("channelLimit")
    public void setChannelLimit(Integer channelLimit) {
        this.channelLimit = channelLimit;
    }

    /**
     * Sets anonymization.
     *
     * @param anonymization
     * @return This {@link CallsSipTrunkResponse instance}.
     */
    public CallsSipTrunkResponse anonymization(CallsAnonymizationType anonymization) {
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
     * Sets billingPackage.
     *
     * @param billingPackage
     * @return This {@link CallsSipTrunkResponse instance}.
     */
    public CallsSipTrunkResponse billingPackage(CallsBillingPackage billingPackage) {
        this.billingPackage = billingPackage;
        return this;
    }

    /**
     * Returns billingPackage.
     *
     * @return billingPackage
     */
    @JsonProperty("billingPackage")
    public CallsBillingPackage getBillingPackage() {
        return billingPackage;
    }

    /**
     * Sets billingPackage.
     *
     * @param billingPackage
     */
    @JsonProperty("billingPackage")
    public void setBillingPackage(CallsBillingPackage billingPackage) {
        this.billingPackage = billingPackage;
    }

    /**
     * Sets sbcHosts.
     *
     * @param sbcHosts
     * @return This {@link CallsSipTrunkResponse instance}.
     */
    public CallsSipTrunkResponse sbcHosts(CallsSbcHosts sbcHosts) {
        this.sbcHosts = sbcHosts;
        return this;
    }

    /**
     * Returns sbcHosts.
     *
     * @return sbcHosts
     */
    @JsonProperty("sbcHosts")
    public CallsSbcHosts getSbcHosts() {
        return sbcHosts;
    }

    /**
     * Sets sbcHosts.
     *
     * @param sbcHosts
     */
    @JsonProperty("sbcHosts")
    public void setSbcHosts(CallsSbcHosts sbcHosts) {
        this.sbcHosts = sbcHosts;
    }

    /**
     * Sets sipOptions.
     *
     * @param sipOptions
     * @return This {@link CallsSipTrunkResponse instance}.
     */
    public CallsSipTrunkResponse sipOptions(CallsSipOptions sipOptions) {
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
        CallsSipTrunkResponse callsSipTrunkResponse = (CallsSipTrunkResponse) o;
        return Objects.equals(this.id, callsSipTrunkResponse.id)
                && Objects.equals(this.type, callsSipTrunkResponse.type)
                && Objects.equals(this.name, callsSipTrunkResponse.name)
                && Objects.equals(this.location, callsSipTrunkResponse.location)
                && Objects.equals(this.tls, callsSipTrunkResponse.tls)
                && Objects.equals(this.codecs, callsSipTrunkResponse.codecs)
                && Objects.equals(this.dtmf, callsSipTrunkResponse.dtmf)
                && Objects.equals(this.fax, callsSipTrunkResponse.fax)
                && Objects.equals(this.numberFormat, callsSipTrunkResponse.numberFormat)
                && Objects.equals(this.internationalCallsAllowed, callsSipTrunkResponse.internationalCallsAllowed)
                && Objects.equals(this.channelLimit, callsSipTrunkResponse.channelLimit)
                && Objects.equals(this.anonymization, callsSipTrunkResponse.anonymization)
                && Objects.equals(this.billingPackage, callsSipTrunkResponse.billingPackage)
                && Objects.equals(this.sbcHosts, callsSipTrunkResponse.sbcHosts)
                && Objects.equals(this.sipOptions, callsSipTrunkResponse.sipOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                type,
                name,
                location,
                tls,
                codecs,
                dtmf,
                fax,
                numberFormat,
                internationalCallsAllowed,
                channelLimit,
                anonymization,
                billingPackage,
                sbcHosts,
                sipOptions);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSipTrunkResponse {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    type: ")
                .append(toIndentedString(type))
                .append(newLine)
                .append("    name: ")
                .append(toIndentedString(name))
                .append(newLine)
                .append("    location: ")
                .append(toIndentedString(location))
                .append(newLine)
                .append("    tls: ")
                .append(toIndentedString(tls))
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
                .append("    numberFormat: ")
                .append(toIndentedString(numberFormat))
                .append(newLine)
                .append("    internationalCallsAllowed: ")
                .append(toIndentedString(internationalCallsAllowed))
                .append(newLine)
                .append("    channelLimit: ")
                .append(toIndentedString(channelLimit))
                .append(newLine)
                .append("    anonymization: ")
                .append(toIndentedString(anonymization))
                .append(newLine)
                .append("    billingPackage: ")
                .append(toIndentedString(billingPackage))
                .append(newLine)
                .append("    sbcHosts: ")
                .append(toIndentedString(sbcHosts))
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
