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
 * Represents NumbersNetworkStatus model.
 */
public class NumbersNetworkStatus {

    private NumbersNetwork network;

    private NumbersNetworkState state;

    private String messageClass;

    private Integer throughput;

    private String brandTier;

    /**
     * Sets network.
     *
     * @param network
     * @return This {@link NumbersNetworkStatus instance}.
     */
    public NumbersNetworkStatus network(NumbersNetwork network) {
        this.network = network;
        return this;
    }

    /**
     * Returns network.
     *
     * @return network
     */
    @JsonProperty("network")
    public NumbersNetwork getNetwork() {
        return network;
    }

    /**
     * Sets network.
     *
     * @param network
     */
    @JsonProperty("network")
    public void setNetwork(NumbersNetwork network) {
        this.network = network;
    }

    /**
     * Sets state.
     *
     * @param state
     * @return This {@link NumbersNetworkStatus instance}.
     */
    public NumbersNetworkStatus state(NumbersNetworkState state) {
        this.state = state;
        return this;
    }

    /**
     * Returns state.
     *
     * @return state
     */
    @JsonProperty("state")
    public NumbersNetworkState getState() {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state
     */
    @JsonProperty("state")
    public void setState(NumbersNetworkState state) {
        this.state = state;
    }

    /**
     * Sets messageClass.
     * <p>
     * Field description:
     * This value is provided by some carriers to help determine throughput and daily limits. Refer to the [current documentation](https://www.infobip.com/docs/10dlc/throughput) for how to interpret these values as they may change over time.
     *
     * @param messageClass
     * @return This {@link NumbersNetworkStatus instance}.
     */
    public NumbersNetworkStatus messageClass(String messageClass) {
        this.messageClass = messageClass;
        return this;
    }

    /**
     * Returns messageClass.
     * <p>
     * Field description:
     * This value is provided by some carriers to help determine throughput and daily limits. Refer to the [current documentation](https://www.infobip.com/docs/10dlc/throughput) for how to interpret these values as they may change over time.
     *
     * @return messageClass
     */
    @JsonProperty("messageClass")
    public String getMessageClass() {
        return messageClass;
    }

    /**
     * Sets messageClass.
     * <p>
     * Field description:
     * This value is provided by some carriers to help determine throughput and daily limits. Refer to the [current documentation](https://www.infobip.com/docs/10dlc/throughput) for how to interpret these values as they may change over time.
     *
     * @param messageClass
     */
    @JsonProperty("messageClass")
    public void setMessageClass(String messageClass) {
        this.messageClass = messageClass;
    }

    /**
     * Sets throughput.
     * <p>
     * Field description:
     * This value represents the throughput limit, which is calculated based on the message class and brand tier. Its meaning varies depending on the carrier: for AT&amp;T, it denotes messages per minute, while for T-Mobile, it denotes messages per day. If the throughput value is null, the throughput is considered unlimited.
     *
     * @param throughput
     * @return This {@link NumbersNetworkStatus instance}.
     */
    public NumbersNetworkStatus throughput(Integer throughput) {
        this.throughput = throughput;
        return this;
    }

    /**
     * Returns throughput.
     * <p>
     * Field description:
     * This value represents the throughput limit, which is calculated based on the message class and brand tier. Its meaning varies depending on the carrier: for AT&amp;T, it denotes messages per minute, while for T-Mobile, it denotes messages per day. If the throughput value is null, the throughput is considered unlimited.
     *
     * @return throughput
     */
    @JsonProperty("throughput")
    public Integer getThroughput() {
        return throughput;
    }

    /**
     * Sets throughput.
     * <p>
     * Field description:
     * This value represents the throughput limit, which is calculated based on the message class and brand tier. Its meaning varies depending on the carrier: for AT&amp;T, it denotes messages per minute, while for T-Mobile, it denotes messages per day. If the throughput value is null, the throughput is considered unlimited.
     *
     * @param throughput
     */
    @JsonProperty("throughput")
    public void setThroughput(Integer throughput) {
        this.throughput = throughput;
    }

    /**
     * Sets brandTier.
     * <p>
     * Field description:
     * This value indicates the brand tier for T-Mobile, which determines the corresponding throughput limit.
     *
     * @param brandTier
     * @return This {@link NumbersNetworkStatus instance}.
     */
    public NumbersNetworkStatus brandTier(String brandTier) {
        this.brandTier = brandTier;
        return this;
    }

    /**
     * Returns brandTier.
     * <p>
     * Field description:
     * This value indicates the brand tier for T-Mobile, which determines the corresponding throughput limit.
     *
     * @return brandTier
     */
    @JsonProperty("brandTier")
    public String getBrandTier() {
        return brandTier;
    }

    /**
     * Sets brandTier.
     * <p>
     * Field description:
     * This value indicates the brand tier for T-Mobile, which determines the corresponding throughput limit.
     *
     * @param brandTier
     */
    @JsonProperty("brandTier")
    public void setBrandTier(String brandTier) {
        this.brandTier = brandTier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersNetworkStatus numbersNetworkStatus = (NumbersNetworkStatus) o;
        return Objects.equals(this.network, numbersNetworkStatus.network)
                && Objects.equals(this.state, numbersNetworkStatus.state)
                && Objects.equals(this.messageClass, numbersNetworkStatus.messageClass)
                && Objects.equals(this.throughput, numbersNetworkStatus.throughput)
                && Objects.equals(this.brandTier, numbersNetworkStatus.brandTier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(network, state, messageClass, throughput, brandTier);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersNetworkStatus {")
                .append(newLine)
                .append("    network: ")
                .append(toIndentedString(network))
                .append(newLine)
                .append("    state: ")
                .append(toIndentedString(state))
                .append(newLine)
                .append("    messageClass: ")
                .append(toIndentedString(messageClass))
                .append(newLine)
                .append("    throughput: ")
                .append(toIndentedString(throughput))
                .append(newLine)
                .append("    brandTier: ")
                .append(toIndentedString(brandTier))
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
