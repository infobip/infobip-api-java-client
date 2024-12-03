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
 * Dial to Many action performs a call redirection to multiple destinations, joining the user’s call only with the destination that answered the call first. After Dial to Many action the following actions are forbidden: Say, Collect, Dial, Dial to Many, Dial to WebRTC, Dial to SIP trunk, Dial to Conversations, Play, Record and Play from Recording.
 */
public class CallsDialToMany implements CallsScriptInner {

    private List<CallsNumbers> dialToMany = new ArrayList<>();

    private CallsDialToManyOptions options;

    private Integer actionId;

    /**
     * Sets dialToMany.
     * <p>
     * The field is required.
     *
     * @param dialToMany
     * @return This {@link CallsDialToMany instance}.
     */
    public CallsDialToMany dialToMany(List<CallsNumbers> dialToMany) {
        this.dialToMany = dialToMany;
        return this;
    }

    /**
     * Adds and item into dialToMany.
     * <p>
     * The field is required.
     *
     * @param dialToManyItem The item to be added to the list.
     * @return This {@link CallsDialToMany instance}.
     */
    public CallsDialToMany addDialToManyItem(CallsNumbers dialToManyItem) {
        if (this.dialToMany == null) {
            this.dialToMany = new ArrayList<>();
        }
        this.dialToMany.add(dialToManyItem);
        return this;
    }

    /**
     * Returns dialToMany.
     * <p>
     * The field is required.
     *
     * @return dialToMany
     */
    @JsonProperty("dialToMany")
    public List<CallsNumbers> getDialToMany() {
        return dialToMany;
    }

    /**
     * Sets dialToMany.
     * <p>
     * The field is required.
     *
     * @param dialToMany
     */
    @JsonProperty("dialToMany")
    public void setDialToMany(List<CallsNumbers> dialToMany) {
        this.dialToMany = dialToMany;
    }

    /**
     * Sets options.
     *
     * @param options
     * @return This {@link CallsDialToMany instance}.
     */
    public CallsDialToMany options(CallsDialToManyOptions options) {
        this.options = options;
        return this;
    }

    /**
     * Returns options.
     *
     * @return options
     */
    @JsonProperty("options")
    public CallsDialToManyOptions getOptions() {
        return options;
    }

    /**
     * Sets options.
     *
     * @param options
     */
    @JsonProperty("options")
    public void setOptions(CallsDialToManyOptions options) {
        this.options = options;
    }

    /**
     * Sets actionId.
     * <p>
     * Field description:
     * User-defined ID of an action that can be used with go-to action.
     *
     * @param actionId
     * @return This {@link CallsDialToMany instance}.
     */
    public CallsDialToMany actionId(Integer actionId) {
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
        CallsDialToMany callsDialToMany = (CallsDialToMany) o;
        return Objects.equals(this.dialToMany, callsDialToMany.dialToMany)
                && Objects.equals(this.options, callsDialToMany.options)
                && Objects.equals(this.actionId, callsDialToMany.actionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dialToMany, options, actionId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsDialToMany {")
                .append(newLine)
                .append("    dialToMany: ")
                .append(toIndentedString(dialToMany))
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
