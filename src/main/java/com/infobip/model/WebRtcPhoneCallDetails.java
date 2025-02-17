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
 * Represents WebRtcPhoneCallDetails model.
 */
public class WebRtcPhoneCallDetails extends WebRtcCallDetails {

    private WebRtcParticipant caller;

    private WebRtcParticipant callee;

    /**
     * Constructs a new {@link WebRtcPhoneCallDetails} instance.
     */
    public WebRtcPhoneCallDetails() {
        super("PHONE");
    }

    /**
     * Sets caller.
     * <p>
     * The field is required.
     *
     * @param caller
     * @return This {@link WebRtcPhoneCallDetails instance}.
     */
    public WebRtcPhoneCallDetails caller(WebRtcParticipant caller) {
        this.caller = caller;
        return this;
    }

    /**
     * Returns caller.
     * <p>
     * The field is required.
     *
     * @return caller
     */
    @JsonProperty("caller")
    public WebRtcParticipant getCaller() {
        return caller;
    }

    /**
     * Sets caller.
     * <p>
     * The field is required.
     *
     * @param caller
     */
    @JsonProperty("caller")
    public void setCaller(WebRtcParticipant caller) {
        this.caller = caller;
    }

    /**
     * Sets callee.
     * <p>
     * The field is required.
     *
     * @param callee
     * @return This {@link WebRtcPhoneCallDetails instance}.
     */
    public WebRtcPhoneCallDetails callee(WebRtcParticipant callee) {
        this.callee = callee;
        return this;
    }

    /**
     * Returns callee.
     * <p>
     * The field is required.
     *
     * @return callee
     */
    @JsonProperty("callee")
    public WebRtcParticipant getCallee() {
        return callee;
    }

    /**
     * Sets callee.
     * <p>
     * The field is required.
     *
     * @param callee
     */
    @JsonProperty("callee")
    public void setCallee(WebRtcParticipant callee) {
        this.callee = callee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcPhoneCallDetails webRtcPhoneCallDetails = (WebRtcPhoneCallDetails) o;
        return Objects.equals(this.caller, webRtcPhoneCallDetails.caller)
                && Objects.equals(this.callee, webRtcPhoneCallDetails.callee)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caller, callee, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcPhoneCallDetails {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    caller: ")
                .append(toIndentedString(caller))
                .append(newLine)
                .append("    callee: ")
                .append(toIndentedString(callee))
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
