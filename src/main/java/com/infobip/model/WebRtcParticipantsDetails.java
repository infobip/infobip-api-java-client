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
 * Represents WebRtcParticipantsDetails model.
 */
public class WebRtcParticipantsDetails extends WebRtcCallDetails {

    private WebRtcParticipant caller;

    private WebRtcParticipant callee;

    private String dialogId;

    private WebRtcHangupSource hangupSource;

    /**
     * Constructs a new {@link WebRtcParticipantsDetails} instance.
     */
    public WebRtcParticipantsDetails() {
        super("WEBRTC");
    }

    /**
     * Sets caller.
     * <p>
     * The field is required.
     *
     * @param caller
     * @return This {@link WebRtcParticipantsDetails instance}.
     */
    public WebRtcParticipantsDetails caller(WebRtcParticipant caller) {
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
     * @return This {@link WebRtcParticipantsDetails instance}.
     */
    public WebRtcParticipantsDetails callee(WebRtcParticipant callee) {
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

    /**
     * Sets dialogId.
     * <p>
     * Field description:
     * Dialog identifier.
     *
     * @param dialogId
     * @return This {@link WebRtcParticipantsDetails instance}.
     */
    public WebRtcParticipantsDetails dialogId(String dialogId) {
        this.dialogId = dialogId;
        return this;
    }

    /**
     * Returns dialogId.
     * <p>
     * Field description:
     * Dialog identifier.
     *
     * @return dialogId
     */
    @JsonProperty("dialogId")
    public String getDialogId() {
        return dialogId;
    }

    /**
     * Sets dialogId.
     * <p>
     * Field description:
     * Dialog identifier.
     *
     * @param dialogId
     */
    @JsonProperty("dialogId")
    public void setDialogId(String dialogId) {
        this.dialogId = dialogId;
    }

    /**
     * Sets hangupSource.
     *
     * @param hangupSource
     * @return This {@link WebRtcParticipantsDetails instance}.
     */
    public WebRtcParticipantsDetails hangupSource(WebRtcHangupSource hangupSource) {
        this.hangupSource = hangupSource;
        return this;
    }

    /**
     * Returns hangupSource.
     *
     * @return hangupSource
     */
    @JsonProperty("hangupSource")
    public WebRtcHangupSource getHangupSource() {
        return hangupSource;
    }

    /**
     * Sets hangupSource.
     *
     * @param hangupSource
     */
    @JsonProperty("hangupSource")
    public void setHangupSource(WebRtcHangupSource hangupSource) {
        this.hangupSource = hangupSource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebRtcParticipantsDetails webRtcParticipantsDetails = (WebRtcParticipantsDetails) o;
        return Objects.equals(this.caller, webRtcParticipantsDetails.caller)
                && Objects.equals(this.callee, webRtcParticipantsDetails.callee)
                && Objects.equals(this.dialogId, webRtcParticipantsDetails.dialogId)
                && Objects.equals(this.hangupSource, webRtcParticipantsDetails.hangupSource)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caller, callee, dialogId, hangupSource, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WebRtcParticipantsDetails {")
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
                .append("    dialogId: ")
                .append(toIndentedString(dialogId))
                .append(newLine)
                .append("    hangupSource: ")
                .append(toIndentedString(hangupSource))
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
