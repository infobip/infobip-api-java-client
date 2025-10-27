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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents TfaResendPinRequestViaEmail model.
 */
public class TfaResendPinRequestViaEmail {

    private Map<String, String> landingPagePlaceholders = null;

    private Map<String, String> placeholders = null;

    /**
     * Sets landingPagePlaceholders.
     * <p>
     * Field description:
     * Key value pairs that will be replaced when using personalized opt out landing page. Placeholder keys should NOT contain curly brackets and should NOT contain a &#x60;pin&#x60; placeholder. Valid example: &#x60;\&quot;landingPagePlaceholders\&quot;:{\&quot;name\&quot;:\&quot;John\&quot;, \&quot;surname\&quot;: \&quot;Smith\&quot;}&#x60;
     *
     * @param landingPagePlaceholders
     * @return This {@link TfaResendPinRequestViaEmail instance}.
     */
    public TfaResendPinRequestViaEmail landingPagePlaceholders(Map<String, String> landingPagePlaceholders) {
        this.landingPagePlaceholders = landingPagePlaceholders;
        return this;
    }

    /**
     * Puts and entry into landingPagePlaceholders.
     * <p>
     * Field description:
     * Key value pairs that will be replaced when using personalized opt out landing page. Placeholder keys should NOT contain curly brackets and should NOT contain a &#x60;pin&#x60; placeholder. Valid example: &#x60;\&quot;landingPagePlaceholders\&quot;:{\&quot;name\&quot;:\&quot;John\&quot;, \&quot;surname\&quot;: \&quot;Smith\&quot;}&#x60;
     *
     * @param key The given key.
     * @param landingPagePlaceholdersItem The item to be associated with the given key.
     * @return This {@link TfaResendPinRequestViaEmail instance}.
     */
    public TfaResendPinRequestViaEmail putLandingPagePlaceholdersItem(String key, String landingPagePlaceholdersItem) {
        if (this.landingPagePlaceholders == null) {
            this.landingPagePlaceholders = new HashMap<>();
        }
        this.landingPagePlaceholders.put(key, landingPagePlaceholdersItem);
        return this;
    }

    /**
     * Returns landingPagePlaceholders.
     * <p>
     * Field description:
     * Key value pairs that will be replaced when using personalized opt out landing page. Placeholder keys should NOT contain curly brackets and should NOT contain a &#x60;pin&#x60; placeholder. Valid example: &#x60;\&quot;landingPagePlaceholders\&quot;:{\&quot;name\&quot;:\&quot;John\&quot;, \&quot;surname\&quot;: \&quot;Smith\&quot;}&#x60;
     *
     * @return landingPagePlaceholders
     */
    @JsonProperty("landingPagePlaceholders")
    public Map<String, String> getLandingPagePlaceholders() {
        return landingPagePlaceholders;
    }

    /**
     * Sets landingPagePlaceholders.
     * <p>
     * Field description:
     * Key value pairs that will be replaced when using personalized opt out landing page. Placeholder keys should NOT contain curly brackets and should NOT contain a &#x60;pin&#x60; placeholder. Valid example: &#x60;\&quot;landingPagePlaceholders\&quot;:{\&quot;name\&quot;:\&quot;John\&quot;, \&quot;surname\&quot;: \&quot;Smith\&quot;}&#x60;
     *
     * @param landingPagePlaceholders
     */
    @JsonProperty("landingPagePlaceholders")
    public void setLandingPagePlaceholders(Map<String, String> landingPagePlaceholders) {
        this.landingPagePlaceholders = landingPagePlaceholders;
    }

    /**
     * Sets placeholders.
     * <p>
     * Field description:
     * Key value pairs that will be replaced during message sending. Placeholder keys should NOT contain curly brackets and should NOT contain a &#x60;pin&#x60; placeholder. Valid example: &#x60;\&quot;placeholders\&quot;:{\&quot;firstName\&quot;:\&quot;John\&quot;}&#x60;
     *
     * @param placeholders
     * @return This {@link TfaResendPinRequestViaEmail instance}.
     */
    public TfaResendPinRequestViaEmail placeholders(Map<String, String> placeholders) {
        this.placeholders = placeholders;
        return this;
    }

    /**
     * Puts and entry into placeholders.
     * <p>
     * Field description:
     * Key value pairs that will be replaced during message sending. Placeholder keys should NOT contain curly brackets and should NOT contain a &#x60;pin&#x60; placeholder. Valid example: &#x60;\&quot;placeholders\&quot;:{\&quot;firstName\&quot;:\&quot;John\&quot;}&#x60;
     *
     * @param key The given key.
     * @param placeholdersItem The item to be associated with the given key.
     * @return This {@link TfaResendPinRequestViaEmail instance}.
     */
    public TfaResendPinRequestViaEmail putPlaceholdersItem(String key, String placeholdersItem) {
        if (this.placeholders == null) {
            this.placeholders = new HashMap<>();
        }
        this.placeholders.put(key, placeholdersItem);
        return this;
    }

    /**
     * Returns placeholders.
     * <p>
     * Field description:
     * Key value pairs that will be replaced during message sending. Placeholder keys should NOT contain curly brackets and should NOT contain a &#x60;pin&#x60; placeholder. Valid example: &#x60;\&quot;placeholders\&quot;:{\&quot;firstName\&quot;:\&quot;John\&quot;}&#x60;
     *
     * @return placeholders
     */
    @JsonProperty("placeholders")
    public Map<String, String> getPlaceholders() {
        return placeholders;
    }

    /**
     * Sets placeholders.
     * <p>
     * Field description:
     * Key value pairs that will be replaced during message sending. Placeholder keys should NOT contain curly brackets and should NOT contain a &#x60;pin&#x60; placeholder. Valid example: &#x60;\&quot;placeholders\&quot;:{\&quot;firstName\&quot;:\&quot;John\&quot;}&#x60;
     *
     * @param placeholders
     */
    @JsonProperty("placeholders")
    public void setPlaceholders(Map<String, String> placeholders) {
        this.placeholders = placeholders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TfaResendPinRequestViaEmail tfaResendPinRequestViaEmail = (TfaResendPinRequestViaEmail) o;
        return Objects.equals(this.landingPagePlaceholders, tfaResendPinRequestViaEmail.landingPagePlaceholders)
                && Objects.equals(this.placeholders, tfaResendPinRequestViaEmail.placeholders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(landingPagePlaceholders, placeholders);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class TfaResendPinRequestViaEmail {")
                .append(newLine)
                .append("    landingPagePlaceholders: ")
                .append(toIndentedString(landingPagePlaceholders))
                .append(newLine)
                .append("    placeholders: ")
                .append(toIndentedString(placeholders))
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
