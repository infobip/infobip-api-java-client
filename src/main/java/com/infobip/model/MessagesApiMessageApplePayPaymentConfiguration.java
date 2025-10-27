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
 * Represents MessagesApiMessageApplePayPaymentConfiguration model.
 */
public class MessagesApiMessageApplePayPaymentConfiguration extends MessagesApiMessagePaymentConfiguration {

    private String merchantDomain;

    private String merchantDisplayName;

    private String merchantPaymentGatewayUrl;

    private String merchantCountryCode;

    private String currencyCode;

    private List<MessagesApiMessageApplePayPaymentConfigurationMerchantCapability> merchantCapabilities = null;

    private List<MessagesApiMessageApplePayPaymentConfigurationNetwork> supportedNetworks = null;

    private List<MessagesApiMessageApplePayPaymentConfigurationContactField> requiredBillingFields = null;

    private List<MessagesApiMessageApplePayPaymentConfigurationContactField> requiredShippingFields = null;

    private String paymentMethodUpdateUrl;

    private String shippingContactUpdateUrl;

    private String shippingMethodUpdateUrl;

    private String orderTrackingUrl;

    private String fallbackUrl;

    /**
     * Constructs a new {@link MessagesApiMessageApplePayPaymentConfiguration} instance.
     */
    public MessagesApiMessageApplePayPaymentConfiguration() {
        super("APPLE_PAY");
    }

    /**
     * Sets merchantDomain.
     * <p>
     * Field description:
     * The domain of the merchant&#39;s website.
     *
     * @param merchantDomain
     * @return This {@link MessagesApiMessageApplePayPaymentConfiguration instance}.
     */
    public MessagesApiMessageApplePayPaymentConfiguration merchantDomain(String merchantDomain) {
        this.merchantDomain = merchantDomain;
        return this;
    }

    /**
     * Returns merchantDomain.
     * <p>
     * Field description:
     * The domain of the merchant&#39;s website.
     *
     * @return merchantDomain
     */
    @JsonProperty("merchantDomain")
    public String getMerchantDomain() {
        return merchantDomain;
    }

    /**
     * Sets merchantDomain.
     * <p>
     * Field description:
     * The domain of the merchant&#39;s website.
     *
     * @param merchantDomain
     */
    @JsonProperty("merchantDomain")
    public void setMerchantDomain(String merchantDomain) {
        this.merchantDomain = merchantDomain;
    }

    /**
     * Sets merchantDisplayName.
     * <p>
     * Field description:
     * The merchant&#39;s display name.
     *
     * @param merchantDisplayName
     * @return This {@link MessagesApiMessageApplePayPaymentConfiguration instance}.
     */
    public MessagesApiMessageApplePayPaymentConfiguration merchantDisplayName(String merchantDisplayName) {
        this.merchantDisplayName = merchantDisplayName;
        return this;
    }

    /**
     * Returns merchantDisplayName.
     * <p>
     * Field description:
     * The merchant&#39;s display name.
     *
     * @return merchantDisplayName
     */
    @JsonProperty("merchantDisplayName")
    public String getMerchantDisplayName() {
        return merchantDisplayName;
    }

    /**
     * Sets merchantDisplayName.
     * <p>
     * Field description:
     * The merchant&#39;s display name.
     *
     * @param merchantDisplayName
     */
    @JsonProperty("merchantDisplayName")
    public void setMerchantDisplayName(String merchantDisplayName) {
        this.merchantDisplayName = merchantDisplayName;
    }

    /**
     * Sets merchantPaymentGatewayUrl.
     * <p>
     * Field description:
     * The URL of the merchant&#39;s payment gateway. This is the URL that Apple Pay uses to process payments.
     *
     * @param merchantPaymentGatewayUrl
     * @return This {@link MessagesApiMessageApplePayPaymentConfiguration instance}.
     */
    public MessagesApiMessageApplePayPaymentConfiguration merchantPaymentGatewayUrl(String merchantPaymentGatewayUrl) {
        this.merchantPaymentGatewayUrl = merchantPaymentGatewayUrl;
        return this;
    }

    /**
     * Returns merchantPaymentGatewayUrl.
     * <p>
     * Field description:
     * The URL of the merchant&#39;s payment gateway. This is the URL that Apple Pay uses to process payments.
     *
     * @return merchantPaymentGatewayUrl
     */
    @JsonProperty("merchantPaymentGatewayUrl")
    public String getMerchantPaymentGatewayUrl() {
        return merchantPaymentGatewayUrl;
    }

    /**
     * Sets merchantPaymentGatewayUrl.
     * <p>
     * Field description:
     * The URL of the merchant&#39;s payment gateway. This is the URL that Apple Pay uses to process payments.
     *
     * @param merchantPaymentGatewayUrl
     */
    @JsonProperty("merchantPaymentGatewayUrl")
    public void setMerchantPaymentGatewayUrl(String merchantPaymentGatewayUrl) {
        this.merchantPaymentGatewayUrl = merchantPaymentGatewayUrl;
    }

    /**
     * Sets merchantCountryCode.
     * <p>
     * Field description:
     * The two-letter ISO 3166 merchant’s country code.
     *
     * @param merchantCountryCode
     * @return This {@link MessagesApiMessageApplePayPaymentConfiguration instance}.
     */
    public MessagesApiMessageApplePayPaymentConfiguration merchantCountryCode(String merchantCountryCode) {
        this.merchantCountryCode = merchantCountryCode;
        return this;
    }

    /**
     * Returns merchantCountryCode.
     * <p>
     * Field description:
     * The two-letter ISO 3166 merchant’s country code.
     *
     * @return merchantCountryCode
     */
    @JsonProperty("merchantCountryCode")
    public String getMerchantCountryCode() {
        return merchantCountryCode;
    }

    /**
     * Sets merchantCountryCode.
     * <p>
     * Field description:
     * The two-letter ISO 3166 merchant’s country code.
     *
     * @param merchantCountryCode
     */
    @JsonProperty("merchantCountryCode")
    public void setMerchantCountryCode(String merchantCountryCode) {
        this.merchantCountryCode = merchantCountryCode;
    }

    /**
     * Sets currencyCode.
     * <p>
     * Field description:
     * The three-letter ISO 4217 currency code for the payment.
     *
     * @param currencyCode
     * @return This {@link MessagesApiMessageApplePayPaymentConfiguration instance}.
     */
    public MessagesApiMessageApplePayPaymentConfiguration currencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * Returns currencyCode.
     * <p>
     * Field description:
     * The three-letter ISO 4217 currency code for the payment.
     *
     * @return currencyCode
     */
    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets currencyCode.
     * <p>
     * Field description:
     * The three-letter ISO 4217 currency code for the payment.
     *
     * @param currencyCode
     */
    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    /**
     * Sets merchantCapabilities.
     * <p>
     * Field description:
     * An array of payment capabilities supported by the merchant. The array must include 3DS.
     *
     * @param merchantCapabilities
     * @return This {@link MessagesApiMessageApplePayPaymentConfiguration instance}.
     */
    public MessagesApiMessageApplePayPaymentConfiguration merchantCapabilities(
            List<MessagesApiMessageApplePayPaymentConfigurationMerchantCapability> merchantCapabilities) {
        this.merchantCapabilities = merchantCapabilities;
        return this;
    }

    /**
     * Adds and item into merchantCapabilities.
     * <p>
     * Field description:
     * An array of payment capabilities supported by the merchant. The array must include 3DS.
     *
     * @param merchantCapabilitiesItem The item to be added to the list.
     * @return This {@link MessagesApiMessageApplePayPaymentConfiguration instance}.
     */
    public MessagesApiMessageApplePayPaymentConfiguration addMerchantCapabilitiesItem(
            MessagesApiMessageApplePayPaymentConfigurationMerchantCapability merchantCapabilitiesItem) {
        if (this.merchantCapabilities == null) {
            this.merchantCapabilities = new ArrayList<>();
        }
        this.merchantCapabilities.add(merchantCapabilitiesItem);
        return this;
    }

    /**
     * Returns merchantCapabilities.
     * <p>
     * Field description:
     * An array of payment capabilities supported by the merchant. The array must include 3DS.
     *
     * @return merchantCapabilities
     */
    @JsonProperty("merchantCapabilities")
    public List<MessagesApiMessageApplePayPaymentConfigurationMerchantCapability> getMerchantCapabilities() {
        return merchantCapabilities;
    }

    /**
     * Sets merchantCapabilities.
     * <p>
     * Field description:
     * An array of payment capabilities supported by the merchant. The array must include 3DS.
     *
     * @param merchantCapabilities
     */
    @JsonProperty("merchantCapabilities")
    public void setMerchantCapabilities(
            List<MessagesApiMessageApplePayPaymentConfigurationMerchantCapability> merchantCapabilities) {
        this.merchantCapabilities = merchantCapabilities;
    }

    /**
     * Sets supportedNetworks.
     * <p>
     * Field description:
     * An array of payment networks supported by the merchant. The array must include one or more of the following values: AMEX, DISCOVER, MASTERCARD, PRIVATE_LABEL or VISA.
     *
     * @param supportedNetworks
     * @return This {@link MessagesApiMessageApplePayPaymentConfiguration instance}.
     */
    public MessagesApiMessageApplePayPaymentConfiguration supportedNetworks(
            List<MessagesApiMessageApplePayPaymentConfigurationNetwork> supportedNetworks) {
        this.supportedNetworks = supportedNetworks;
        return this;
    }

    /**
     * Adds and item into supportedNetworks.
     * <p>
     * Field description:
     * An array of payment networks supported by the merchant. The array must include one or more of the following values: AMEX, DISCOVER, MASTERCARD, PRIVATE_LABEL or VISA.
     *
     * @param supportedNetworksItem The item to be added to the list.
     * @return This {@link MessagesApiMessageApplePayPaymentConfiguration instance}.
     */
    public MessagesApiMessageApplePayPaymentConfiguration addSupportedNetworksItem(
            MessagesApiMessageApplePayPaymentConfigurationNetwork supportedNetworksItem) {
        if (this.supportedNetworks == null) {
            this.supportedNetworks = new ArrayList<>();
        }
        this.supportedNetworks.add(supportedNetworksItem);
        return this;
    }

    /**
     * Returns supportedNetworks.
     * <p>
     * Field description:
     * An array of payment networks supported by the merchant. The array must include one or more of the following values: AMEX, DISCOVER, MASTERCARD, PRIVATE_LABEL or VISA.
     *
     * @return supportedNetworks
     */
    @JsonProperty("supportedNetworks")
    public List<MessagesApiMessageApplePayPaymentConfigurationNetwork> getSupportedNetworks() {
        return supportedNetworks;
    }

    /**
     * Sets supportedNetworks.
     * <p>
     * Field description:
     * An array of payment networks supported by the merchant. The array must include one or more of the following values: AMEX, DISCOVER, MASTERCARD, PRIVATE_LABEL or VISA.
     *
     * @param supportedNetworks
     */
    @JsonProperty("supportedNetworks")
    public void setSupportedNetworks(List<MessagesApiMessageApplePayPaymentConfigurationNetwork> supportedNetworks) {
        this.supportedNetworks = supportedNetworks;
    }

    /**
     * Sets requiredBillingFields.
     * <p>
     * Field description:
     * The list of the customer&#39;s required billing information needed to process the transaction.
     *
     * @param requiredBillingFields
     * @return This {@link MessagesApiMessageApplePayPaymentConfiguration instance}.
     */
    public MessagesApiMessageApplePayPaymentConfiguration requiredBillingFields(
            List<MessagesApiMessageApplePayPaymentConfigurationContactField> requiredBillingFields) {
        this.requiredBillingFields = requiredBillingFields;
        return this;
    }

    /**
     * Adds and item into requiredBillingFields.
     * <p>
     * Field description:
     * The list of the customer&#39;s required billing information needed to process the transaction.
     *
     * @param requiredBillingFieldsItem The item to be added to the list.
     * @return This {@link MessagesApiMessageApplePayPaymentConfiguration instance}.
     */
    public MessagesApiMessageApplePayPaymentConfiguration addRequiredBillingFieldsItem(
            MessagesApiMessageApplePayPaymentConfigurationContactField requiredBillingFieldsItem) {
        if (this.requiredBillingFields == null) {
            this.requiredBillingFields = new ArrayList<>();
        }
        this.requiredBillingFields.add(requiredBillingFieldsItem);
        return this;
    }

    /**
     * Returns requiredBillingFields.
     * <p>
     * Field description:
     * The list of the customer&#39;s required billing information needed to process the transaction.
     *
     * @return requiredBillingFields
     */
    @JsonProperty("requiredBillingFields")
    public List<MessagesApiMessageApplePayPaymentConfigurationContactField> getRequiredBillingFields() {
        return requiredBillingFields;
    }

    /**
     * Sets requiredBillingFields.
     * <p>
     * Field description:
     * The list of the customer&#39;s required billing information needed to process the transaction.
     *
     * @param requiredBillingFields
     */
    @JsonProperty("requiredBillingFields")
    public void setRequiredBillingFields(
            List<MessagesApiMessageApplePayPaymentConfigurationContactField> requiredBillingFields) {
        this.requiredBillingFields = requiredBillingFields;
    }

    /**
     * Sets requiredShippingFields.
     * <p>
     * Field description:
     * The list of shipping or contact information required from the customer to fulfill the order.
     *
     * @param requiredShippingFields
     * @return This {@link MessagesApiMessageApplePayPaymentConfiguration instance}.
     */
    public MessagesApiMessageApplePayPaymentConfiguration requiredShippingFields(
            List<MessagesApiMessageApplePayPaymentConfigurationContactField> requiredShippingFields) {
        this.requiredShippingFields = requiredShippingFields;
        return this;
    }

    /**
     * Adds and item into requiredShippingFields.
     * <p>
     * Field description:
     * The list of shipping or contact information required from the customer to fulfill the order.
     *
     * @param requiredShippingFieldsItem The item to be added to the list.
     * @return This {@link MessagesApiMessageApplePayPaymentConfiguration instance}.
     */
    public MessagesApiMessageApplePayPaymentConfiguration addRequiredShippingFieldsItem(
            MessagesApiMessageApplePayPaymentConfigurationContactField requiredShippingFieldsItem) {
        if (this.requiredShippingFields == null) {
            this.requiredShippingFields = new ArrayList<>();
        }
        this.requiredShippingFields.add(requiredShippingFieldsItem);
        return this;
    }

    /**
     * Returns requiredShippingFields.
     * <p>
     * Field description:
     * The list of shipping or contact information required from the customer to fulfill the order.
     *
     * @return requiredShippingFields
     */
    @JsonProperty("requiredShippingFields")
    public List<MessagesApiMessageApplePayPaymentConfigurationContactField> getRequiredShippingFields() {
        return requiredShippingFields;
    }

    /**
     * Sets requiredShippingFields.
     * <p>
     * Field description:
     * The list of shipping or contact information required from the customer to fulfill the order.
     *
     * @param requiredShippingFields
     */
    @JsonProperty("requiredShippingFields")
    public void setRequiredShippingFields(
            List<MessagesApiMessageApplePayPaymentConfigurationContactField> requiredShippingFields) {
        this.requiredShippingFields = requiredShippingFields;
    }

    /**
     * Sets paymentMethodUpdateUrl.
     * <p>
     * Field description:
     * Called by Apple Pay when the user changes the payment method.
     *
     * @param paymentMethodUpdateUrl
     * @return This {@link MessagesApiMessageApplePayPaymentConfiguration instance}.
     */
    public MessagesApiMessageApplePayPaymentConfiguration paymentMethodUpdateUrl(String paymentMethodUpdateUrl) {
        this.paymentMethodUpdateUrl = paymentMethodUpdateUrl;
        return this;
    }

    /**
     * Returns paymentMethodUpdateUrl.
     * <p>
     * Field description:
     * Called by Apple Pay when the user changes the payment method.
     *
     * @return paymentMethodUpdateUrl
     */
    @JsonProperty("paymentMethodUpdateUrl")
    public String getPaymentMethodUpdateUrl() {
        return paymentMethodUpdateUrl;
    }

    /**
     * Sets paymentMethodUpdateUrl.
     * <p>
     * Field description:
     * Called by Apple Pay when the user changes the payment method.
     *
     * @param paymentMethodUpdateUrl
     */
    @JsonProperty("paymentMethodUpdateUrl")
    public void setPaymentMethodUpdateUrl(String paymentMethodUpdateUrl) {
        this.paymentMethodUpdateUrl = paymentMethodUpdateUrl;
    }

    /**
     * Sets shippingContactUpdateUrl.
     * <p>
     * Field description:
     * Called by Apple Pay when the user changes their shipping address information.
     *
     * @param shippingContactUpdateUrl
     * @return This {@link MessagesApiMessageApplePayPaymentConfiguration instance}.
     */
    public MessagesApiMessageApplePayPaymentConfiguration shippingContactUpdateUrl(String shippingContactUpdateUrl) {
        this.shippingContactUpdateUrl = shippingContactUpdateUrl;
        return this;
    }

    /**
     * Returns shippingContactUpdateUrl.
     * <p>
     * Field description:
     * Called by Apple Pay when the user changes their shipping address information.
     *
     * @return shippingContactUpdateUrl
     */
    @JsonProperty("shippingContactUpdateUrl")
    public String getShippingContactUpdateUrl() {
        return shippingContactUpdateUrl;
    }

    /**
     * Sets shippingContactUpdateUrl.
     * <p>
     * Field description:
     * Called by Apple Pay when the user changes their shipping address information.
     *
     * @param shippingContactUpdateUrl
     */
    @JsonProperty("shippingContactUpdateUrl")
    public void setShippingContactUpdateUrl(String shippingContactUpdateUrl) {
        this.shippingContactUpdateUrl = shippingContactUpdateUrl;
    }

    /**
     * Sets shippingMethodUpdateUrl.
     * <p>
     * Field description:
     * Called by Apple Pay when the user changes the shipping method.
     *
     * @param shippingMethodUpdateUrl
     * @return This {@link MessagesApiMessageApplePayPaymentConfiguration instance}.
     */
    public MessagesApiMessageApplePayPaymentConfiguration shippingMethodUpdateUrl(String shippingMethodUpdateUrl) {
        this.shippingMethodUpdateUrl = shippingMethodUpdateUrl;
        return this;
    }

    /**
     * Returns shippingMethodUpdateUrl.
     * <p>
     * Field description:
     * Called by Apple Pay when the user changes the shipping method.
     *
     * @return shippingMethodUpdateUrl
     */
    @JsonProperty("shippingMethodUpdateUrl")
    public String getShippingMethodUpdateUrl() {
        return shippingMethodUpdateUrl;
    }

    /**
     * Sets shippingMethodUpdateUrl.
     * <p>
     * Field description:
     * Called by Apple Pay when the user changes the shipping method.
     *
     * @param shippingMethodUpdateUrl
     */
    @JsonProperty("shippingMethodUpdateUrl")
    public void setShippingMethodUpdateUrl(String shippingMethodUpdateUrl) {
        this.shippingMethodUpdateUrl = shippingMethodUpdateUrl;
    }

    /**
     * Sets orderTrackingUrl.
     * <p>
     * Field description:
     * Called by Apple Pay after completing the order provides you with an opportunity to update the order information in your system.
     *
     * @param orderTrackingUrl
     * @return This {@link MessagesApiMessageApplePayPaymentConfiguration instance}.
     */
    public MessagesApiMessageApplePayPaymentConfiguration orderTrackingUrl(String orderTrackingUrl) {
        this.orderTrackingUrl = orderTrackingUrl;
        return this;
    }

    /**
     * Returns orderTrackingUrl.
     * <p>
     * Field description:
     * Called by Apple Pay after completing the order provides you with an opportunity to update the order information in your system.
     *
     * @return orderTrackingUrl
     */
    @JsonProperty("orderTrackingUrl")
    public String getOrderTrackingUrl() {
        return orderTrackingUrl;
    }

    /**
     * Sets orderTrackingUrl.
     * <p>
     * Field description:
     * Called by Apple Pay after completing the order provides you with an opportunity to update the order information in your system.
     *
     * @param orderTrackingUrl
     */
    @JsonProperty("orderTrackingUrl")
    public void setOrderTrackingUrl(String orderTrackingUrl) {
        this.orderTrackingUrl = orderTrackingUrl;
    }

    /**
     * Sets fallbackUrl.
     * <p>
     * Field description:
     * A URL that opens in a web browser so the user can complete the purchase if their device is unable to make payments using Apple Pay.
     *
     * @param fallbackUrl
     * @return This {@link MessagesApiMessageApplePayPaymentConfiguration instance}.
     */
    public MessagesApiMessageApplePayPaymentConfiguration fallbackUrl(String fallbackUrl) {
        this.fallbackUrl = fallbackUrl;
        return this;
    }

    /**
     * Returns fallbackUrl.
     * <p>
     * Field description:
     * A URL that opens in a web browser so the user can complete the purchase if their device is unable to make payments using Apple Pay.
     *
     * @return fallbackUrl
     */
    @JsonProperty("fallbackUrl")
    public String getFallbackUrl() {
        return fallbackUrl;
    }

    /**
     * Sets fallbackUrl.
     * <p>
     * Field description:
     * A URL that opens in a web browser so the user can complete the purchase if their device is unable to make payments using Apple Pay.
     *
     * @param fallbackUrl
     */
    @JsonProperty("fallbackUrl")
    public void setFallbackUrl(String fallbackUrl) {
        this.fallbackUrl = fallbackUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MessagesApiMessageApplePayPaymentConfiguration messagesApiMessageApplePayPaymentConfiguration =
                (MessagesApiMessageApplePayPaymentConfiguration) o;
        return Objects.equals(this.merchantDomain, messagesApiMessageApplePayPaymentConfiguration.merchantDomain)
                && Objects.equals(
                        this.merchantDisplayName, messagesApiMessageApplePayPaymentConfiguration.merchantDisplayName)
                && Objects.equals(
                        this.merchantPaymentGatewayUrl,
                        messagesApiMessageApplePayPaymentConfiguration.merchantPaymentGatewayUrl)
                && Objects.equals(
                        this.merchantCountryCode, messagesApiMessageApplePayPaymentConfiguration.merchantCountryCode)
                && Objects.equals(this.currencyCode, messagesApiMessageApplePayPaymentConfiguration.currencyCode)
                && Objects.equals(
                        this.merchantCapabilities, messagesApiMessageApplePayPaymentConfiguration.merchantCapabilities)
                && Objects.equals(
                        this.supportedNetworks, messagesApiMessageApplePayPaymentConfiguration.supportedNetworks)
                && Objects.equals(
                        this.requiredBillingFields,
                        messagesApiMessageApplePayPaymentConfiguration.requiredBillingFields)
                && Objects.equals(
                        this.requiredShippingFields,
                        messagesApiMessageApplePayPaymentConfiguration.requiredShippingFields)
                && Objects.equals(
                        this.paymentMethodUpdateUrl,
                        messagesApiMessageApplePayPaymentConfiguration.paymentMethodUpdateUrl)
                && Objects.equals(
                        this.shippingContactUpdateUrl,
                        messagesApiMessageApplePayPaymentConfiguration.shippingContactUpdateUrl)
                && Objects.equals(
                        this.shippingMethodUpdateUrl,
                        messagesApiMessageApplePayPaymentConfiguration.shippingMethodUpdateUrl)
                && Objects.equals(
                        this.orderTrackingUrl, messagesApiMessageApplePayPaymentConfiguration.orderTrackingUrl)
                && Objects.equals(this.fallbackUrl, messagesApiMessageApplePayPaymentConfiguration.fallbackUrl)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                merchantDomain,
                merchantDisplayName,
                merchantPaymentGatewayUrl,
                merchantCountryCode,
                currencyCode,
                merchantCapabilities,
                supportedNetworks,
                requiredBillingFields,
                requiredShippingFields,
                paymentMethodUpdateUrl,
                shippingContactUpdateUrl,
                shippingMethodUpdateUrl,
                orderTrackingUrl,
                fallbackUrl,
                super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MessagesApiMessageApplePayPaymentConfiguration {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    merchantDomain: ")
                .append(toIndentedString(merchantDomain))
                .append(newLine)
                .append("    merchantDisplayName: ")
                .append(toIndentedString(merchantDisplayName))
                .append(newLine)
                .append("    merchantPaymentGatewayUrl: ")
                .append(toIndentedString(merchantPaymentGatewayUrl))
                .append(newLine)
                .append("    merchantCountryCode: ")
                .append(toIndentedString(merchantCountryCode))
                .append(newLine)
                .append("    currencyCode: ")
                .append(toIndentedString(currencyCode))
                .append(newLine)
                .append("    merchantCapabilities: ")
                .append(toIndentedString(merchantCapabilities))
                .append(newLine)
                .append("    supportedNetworks: ")
                .append(toIndentedString(supportedNetworks))
                .append(newLine)
                .append("    requiredBillingFields: ")
                .append(toIndentedString(requiredBillingFields))
                .append(newLine)
                .append("    requiredShippingFields: ")
                .append(toIndentedString(requiredShippingFields))
                .append(newLine)
                .append("    paymentMethodUpdateUrl: ")
                .append(toIndentedString(paymentMethodUpdateUrl))
                .append(newLine)
                .append("    shippingContactUpdateUrl: ")
                .append(toIndentedString(shippingContactUpdateUrl))
                .append(newLine)
                .append("    shippingMethodUpdateUrl: ")
                .append(toIndentedString(shippingMethodUpdateUrl))
                .append(newLine)
                .append("    orderTrackingUrl: ")
                .append(toIndentedString(orderTrackingUrl))
                .append(newLine)
                .append("    fallbackUrl: ")
                .append(toIndentedString(fallbackUrl))
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
