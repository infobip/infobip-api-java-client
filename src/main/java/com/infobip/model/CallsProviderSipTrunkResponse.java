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
 * Represents CallsProviderSipTrunkResponse model.
 */
public class CallsProviderSipTrunkResponse extends CallsSipTrunkResponse {

    private CallsProvider provider;

    /**
     * Constructs a new {@link CallsProviderSipTrunkResponse} instance.
     */
    public CallsProviderSipTrunkResponse() {
        super("PROVIDER");
    }

    /**
     * Sets provider.
     *
     * @param provider
     * @return This {@link CallsProviderSipTrunkResponse instance}.
     */
    public CallsProviderSipTrunkResponse provider(CallsProvider provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Returns provider.
     *
     * @return provider
     */
    @JsonProperty("provider")
    public CallsProvider getProvider() {
        return provider;
    }

    /**
     * Sets provider.
     *
     * @param provider
     */
    @JsonProperty("provider")
    public void setProvider(CallsProvider provider) {
        this.provider = provider;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsProviderSipTrunkResponse callsProviderSipTrunkResponse = (CallsProviderSipTrunkResponse) o;
        return Objects.equals(this.provider, callsProviderSipTrunkResponse.provider) && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(provider, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsProviderSipTrunkResponse {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    provider: ")
                .append(toIndentedString(provider))
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
