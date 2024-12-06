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
 * Announcements to be played when a call is answered.
 */
public class CallsAnnouncements {

    private CallsAnnouncementCaller caller;

    private CallsAnnouncementCallee callee;

    /**
     * Sets caller.
     *
     * @param caller
     * @return This {@link CallsAnnouncements instance}.
     */
    public CallsAnnouncements caller(CallsAnnouncementCaller caller) {
        this.caller = caller;
        return this;
    }

    /**
     * Returns caller.
     *
     * @return caller
     */
    @JsonProperty("caller")
    public CallsAnnouncementCaller getCaller() {
        return caller;
    }

    /**
     * Sets caller.
     *
     * @param caller
     */
    @JsonProperty("caller")
    public void setCaller(CallsAnnouncementCaller caller) {
        this.caller = caller;
    }

    /**
     * Sets callee.
     *
     * @param callee
     * @return This {@link CallsAnnouncements instance}.
     */
    public CallsAnnouncements callee(CallsAnnouncementCallee callee) {
        this.callee = callee;
        return this;
    }

    /**
     * Returns callee.
     *
     * @return callee
     */
    @JsonProperty("callee")
    public CallsAnnouncementCallee getCallee() {
        return callee;
    }

    /**
     * Sets callee.
     *
     * @param callee
     */
    @JsonProperty("callee")
    public void setCallee(CallsAnnouncementCallee callee) {
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
        CallsAnnouncements callsAnnouncements = (CallsAnnouncements) o;
        return Objects.equals(this.caller, callsAnnouncements.caller)
                && Objects.equals(this.callee, callsAnnouncements.callee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caller, callee);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsAnnouncements {")
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
