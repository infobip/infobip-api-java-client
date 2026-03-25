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
 * The type of opt in that requires a user to record a confirmation.
 */
public class NumbersInteractiveVoiceResponseOptIn {

    private String callToAction;

    /**
     * Sets callToAction.
     * <p>
     * Field description:
     *     The message sent to the user to tell them how to subscribe. Must include:     • Product description     • Message frequency disclosure     • Complete terms and conditions OR link to complete terms and conditions     • Privacy policy OR link to privacy policy     • STOP keyword     • The \&quot;Message and data rates may apply\&quot; disclosure
     * <p>
     * The field is required.
     *
     * @param callToAction
     * @return This {@link NumbersInteractiveVoiceResponseOptIn instance}.
     */
    public NumbersInteractiveVoiceResponseOptIn callToAction(String callToAction) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersInteractiveVoiceResponseOptIn numbersInteractiveVoiceResponseOptIn =
                (NumbersInteractiveVoiceResponseOptIn) o;
        return Objects.equals(this.callToAction, numbersInteractiveVoiceResponseOptIn.callToAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(callToAction);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersInteractiveVoiceResponseOptIn {")
                .append(newLine)
                .append("    callToAction: ")
                .append(toIndentedString(callToAction))
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
