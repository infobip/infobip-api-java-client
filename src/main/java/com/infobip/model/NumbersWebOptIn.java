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
 * The type of opt in that requires a user to follow a URL.
 */
public class NumbersWebOptIn {

    private String callToAction;

    private String url;

    /**
     * Sets callToAction.
     * <p>
     * Field description:
     *     The message sent to the user to tell them how to subscribe. Must include:     • Product description     • Message frequency disclosure     • Complete terms and conditions OR link to complete terms and conditions     • Privacy policy OR link to privacy policy     • STOP keyword     • The \&quot;Message and data rates may apply\&quot; disclosure
     * <p>
     * The field is required.
     *
     * @param callToAction
     * @return This {@link NumbersWebOptIn instance}.
     */
    public NumbersWebOptIn callToAction(String callToAction) {
        this.callToAction = callToAction;
        return this;
    }

    /**
     * Returns callToAction.
     * <p>
     * Field description:
     *     The message sent to the user to tell them how to subscribe. Must include:     • Product description     • Message frequency disclosure     • Complete terms and conditions OR link to complete terms and conditions     • Privacy policy OR link to privacy policy     • STOP keyword     • The \&quot;Message and data rates may apply\&quot; disclosure
     * <p>
     * The field is required.
     *
     * @return callToAction
     */
    @JsonProperty("callToAction")
    public String getCallToAction() {
        return callToAction;
    }

    /**
     * Sets callToAction.
     * <p>
     * Field description:
     *     The message sent to the user to tell them how to subscribe. Must include:     • Product description     • Message frequency disclosure     • Complete terms and conditions OR link to complete terms and conditions     • Privacy policy OR link to privacy policy     • STOP keyword     • The \&quot;Message and data rates may apply\&quot; disclosure
     * <p>
     * The field is required.
     *
     * @param callToAction
     */
    @JsonProperty("callToAction")
    public void setCallToAction(String callToAction) {
        this.callToAction = callToAction;
    }

    /**
     * Sets url.
     *
     * @param url
     * @return This {@link NumbersWebOptIn instance}.
     */
    public NumbersWebOptIn url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Returns url.
     *
     * @return url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     *
     * @param url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersWebOptIn numbersWebOptIn = (NumbersWebOptIn) o;
        return Objects.equals(this.callToAction, numbersWebOptIn.callToAction)
                && Objects.equals(this.url, numbersWebOptIn.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callToAction, url);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersWebOptIn {")
                .append(newLine)
                .append("    callToAction: ")
                .append(toIndentedString(callToAction))
                .append(newLine)
                .append("    url: ")
                .append(toIndentedString(url))
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
