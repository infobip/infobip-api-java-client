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
 * Record action records a portion of the call. The recording starts at the moment where the Record action is added in the IVR.
 */
public class CallsRecord implements CallsScriptInner {

    private Integer record;

    private CallsRecordOptions options;

    private Integer actionId;

    /**
     * Sets record.
     * <p>
     * Field description:
     * The duration to record for in seconds; null for unlimited.
     * <p>
     * The field is required.
     *
     * @param record
     * @return This {@link CallsRecord instance}.
     */
    public CallsRecord record(Integer record) {
        this.record = record;
        return this;
    }

    /**
     * Returns record.
     * <p>
     * Field description:
     * The duration to record for in seconds; null for unlimited.
     * <p>
     * The field is required.
     *
     * @return record
     */
    @JsonProperty("record")
    public Integer getRecord() {
        return record;
    }

    /**
     * Sets record.
     * <p>
     * Field description:
     * The duration to record for in seconds; null for unlimited.
     * <p>
     * The field is required.
     *
     * @param record
     */
    @JsonProperty("record")
    public void setRecord(Integer record) {
        this.record = record;
    }

    /**
     * Sets options.
     *
     * @param options
     * @return This {@link CallsRecord instance}.
     */
    public CallsRecord options(CallsRecordOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns options.
     *
     * @return options
     */
    @JsonProperty("options")
    public CallsRecordOptions getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(CallsRecordOptions options) {
        this.options = options;
    }

    /**
     * Sets actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @param actionId
     * @return This {@link CallsRecord instance}.
     */
    public CallsRecord actionId(Integer actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * Returns actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @return actionId
     */
    @JsonProperty("actionId")
    public Integer getActionId() {
        return actionId;
    }

    /**
     * Sets actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @param actionId
     */
    @JsonProperty("actionId")
    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsRecord callsRecord = (CallsRecord) o;
        return Objects.equals(this.record, callsRecord.record)
                && Objects.equals(this.options, callsRecord.options)
                && Objects.equals(this.actionId, callsRecord.actionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(record, options, actionId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsRecord {")
                .append(newLine)
                .append("    record: ")
                .append(toIndentedString(record))
                .append(newLine)
                .append("    options: ")
                .append(toIndentedString(options))
                .append(newLine)
                .append("    actionId: ")
                .append(toIndentedString(actionId))
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
