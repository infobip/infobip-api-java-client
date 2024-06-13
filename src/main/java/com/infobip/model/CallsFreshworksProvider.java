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
 * Represents CallsFreshworksProvider model.
 */
public class CallsFreshworksProvider extends CallsPegasusProvider {

    private String accountSid;

    private String sipDomain;

    /**
     * Constructs a new {@link CallsFreshworksProvider} instance.
     */
    public CallsFreshworksProvider() {
        super("FRESHWORKS");
    }

    /**
     * Sets accountSid.
     * <p>
     * Field description:
     * Twilio account sid of the trunk.
     * <p>
     * The field is required.
     *
     * @param accountSid
     * @return This {@link CallsFreshworksProvider instance}.
     */
    public CallsFreshworksProvider accountSid(String accountSid) {
        this.accountSid = accountSid;
        return this;
    }

    /**
     * Returns accountSid.
     * <p>
     * Field description:
     * Twilio account sid of the trunk.
     * <p>
     * The field is required.
     *
     * @return accountSid
     */
    @JsonProperty("accountSid")
    public String getAccountSid() {
        return accountSid;
    }

    /**
     * Sets accountSid.
     * <p>
     * Field description:
     * Twilio account sid of the trunk.
     * <p>
     * The field is required.
     *
     * @param accountSid
     */
    @JsonProperty("accountSid")
    public void setAccountSid(String accountSid) {
        this.accountSid = accountSid;
    }

    /**
     * Sets sipDomain.
     * <p>
     * Field description:
     * Sip domain related to the trunk.
     * <p>
     * The field is required.
     *
     * @param sipDomain
     * @return This {@link CallsFreshworksProvider instance}.
     */
    public CallsFreshworksProvider sipDomain(String sipDomain) {
        this.sipDomain = sipDomain;
        return this;
    }

    /**
     * Returns sipDomain.
     * <p>
     * Field description:
     * Sip domain related to the trunk.
     * <p>
     * The field is required.
     *
     * @return sipDomain
     */
    @JsonProperty("sipDomain")
    public String getSipDomain() {
        return sipDomain;
    }

    /**
     * Sets sipDomain.
     * <p>
     * Field description:
     * Sip domain related to the trunk.
     * <p>
     * The field is required.
     *
     * @param sipDomain
     */
    @JsonProperty("sipDomain")
    public void setSipDomain(String sipDomain) {
        this.sipDomain = sipDomain;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsFreshworksProvider callsFreshworksProvider = (CallsFreshworksProvider) o;
        return Objects.equals(this.accountSid, callsFreshworksProvider.accountSid)
                && Objects.equals(this.sipDomain, callsFreshworksProvider.sipDomain)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountSid, sipDomain, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsFreshworksProvider {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    accountSid: ")
                .append(toIndentedString(accountSid))
                .append(newLine)
                .append("    sipDomain: ")
                .append(toIndentedString(sipDomain))
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
