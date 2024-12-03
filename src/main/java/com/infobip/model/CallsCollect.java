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
 * Collect action reads the DTMF input from the user’s phone and saves it into a variable. Saved variable can be used within the IVR in any other action that allows variable usage. (e.g. switch/case)
 */
public class CallsCollect implements CallsScriptInner {

    private String collectInto;

    private CallsCollectOptions options;

    private Integer actionId;

    /**
     * Sets collectInto.
     * <p>
     * Field description:
     * The name of the variable to set.
     * <p>
     * The field is required.
     *
     * @param collectInto
     * @return This {@link CallsCollect instance}.
     */
    public CallsCollect collectInto(String collectInto) {
        this.collectInto = collectInto;
        return this;
    }

    /**
     * Returns collectInto.
     * <p>
     * Field description:
     * The name of the variable to set.
     * <p>
     * The field is required.
     *
     * @return collectInto
     */
    @JsonProperty("collectInto")
    public String getCollectInto() {
        return collectInto;
    }

    /**
     * Sets collectInto.
     * <p>
     * Field description:
     * The name of the variable to set.
     * <p>
     * The field is required.
     *
     * @param collectInto
     */
    @JsonProperty("collectInto")
    public void setCollectInto(String collectInto) {
        this.collectInto = collectInto;
    }

    /**
     * Sets options.
     *
     * @param options
     * @return This {@link CallsCollect instance}.
     */
    public CallsCollect options(CallsCollectOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns options.
     *
     * @return options
     */
    @JsonProperty("options")
    public CallsCollectOptions getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(CallsCollectOptions options) {
        this.options = options;
    }

    /**
     * Sets actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @param actionId
     * @return This {@link CallsCollect instance}.
     */
    public CallsCollect actionId(Integer actionId) {
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
        CallsCollect callsCollect = (CallsCollect) o;
        return Objects.equals(this.collectInto, callsCollect.collectInto)
                && Objects.equals(this.options, callsCollect.options)
                && Objects.equals(this.actionId, callsCollect.actionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collectInto, options, actionId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsCollect {")
                .append(newLine)
                .append("    collectInto: ")
                .append(toIndentedString(collectInto))
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
