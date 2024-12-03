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
 * For-each action is a control statement that executes a block of code for each of the values within the supplied list. The Supplied list of values can be static or dynamic (defined as user variable).
 */
public class CallsForEach implements CallsScriptInner {

    private String forEach;

    private String in;

    private String delimiter;

    private List<Object> _do = new ArrayList<>();

    /**
     * Sets forEach.
     * <p>
     * Field description:
     * Variable name that will be used inside the loop to represent single value from supplied list of values.
     * <p>
     * The field is required.
     *
     * @param forEach
     * @return This {@link CallsForEach instance}.
     */
    public CallsForEach forEach(String forEach) {
        this.forEach = forEach;
        return this;
    }

    /**
     * Returns forEach.
     * <p>
     * Field description:
     * Variable name that will be used inside the loop to represent single value from supplied list of values.
     * <p>
     * The field is required.
     *
     * @return forEach
     */
    @JsonProperty("for-each")
    public String getForEach() {
        return forEach;
    }

    /**
     * Sets forEach.
     * <p>
     * Field description:
     * Variable name that will be used inside the loop to represent single value from supplied list of values.
     * <p>
     * The field is required.
     *
     * @param forEach
     */
    @JsonProperty("for-each")
    public void setForEach(String forEach) {
        this.forEach = forEach;
    }

    /**
     * Sets in.
     * <p>
     * Field description:
     * Variable name that will be used inside the loop to represent single value from supplied list of values.
     * <p>
     * The field is required.
     *
     * @param in
     * @return This {@link CallsForEach instance}.
     */
    public CallsForEach in(String in) {
        this.in = in;
        return this;
    }

    /**
     * Returns in.
     * <p>
     * Field description:
     * Variable name that will be used inside the loop to represent single value from supplied list of values.
     * <p>
     * The field is required.
     *
     * @return in
     */
    @JsonProperty("in")
    public String getIn() {
        return in;
    }

    /**
     * Sets in.
     * <p>
     * Field description:
     * Variable name that will be used inside the loop to represent single value from supplied list of values.
     * <p>
     * The field is required.
     *
     * @param in
     */
    @JsonProperty("in")
    public void setIn(String in) {
        this.in = in;
    }

    /**
     * Sets delimiter.
     * <p>
     * Field description:
     * Variable name that will be used inside the loop to represent single value from supplied list of values.
     *
     * @param delimiter
     * @return This {@link CallsForEach instance}.
     */
    public CallsForEach delimiter(String delimiter) {
        this.delimiter = delimiter;
        return this;
    }

    /**
     * Returns delimiter.
     * <p>
     * Field description:
     * Variable name that will be used inside the loop to represent single value from supplied list of values.
     *
     * @return delimiter
     */
    @JsonProperty("delimiter")
    public String getDelimiter() {
        return delimiter;
    }

    /**
     * Sets delimiter.
     * <p>
     * Field description:
     * Variable name that will be used inside the loop to represent single value from supplied list of values.
     *
     * @param delimiter
     */
    @JsonProperty("delimiter")
    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * Sets _do.
     * <p>
     * Field description:
     * Array of actions to execute.
     * <p>
     * The field is required.
     *
     * @param _do
     * @return This {@link CallsForEach instance}.
     */
    public CallsForEach _do(List<Object> _do) {
        this._do = _do;
        return this;
    }

    /**
     * Adds and item into _do.
     * <p>
     * Field description:
     * Array of actions to execute.
     * <p>
     * The field is required.
     *
     * @param _doItem The item to be added to the list.
     * @return This {@link CallsForEach instance}.
     */
    public CallsForEach addDoItem(Object _doItem) {
        if (this._do == null) {
            this._do = new ArrayList<>();
        }
        this._do.add(_doItem);
        return this;
    }

    /**
     * Returns _do.
     * <p>
     * Field description:
     * Array of actions to execute.
     * <p>
     * The field is required.
     *
     * @return _do
     */
    @JsonProperty("do")
    public List<Object> getDo() {
        return _do;
    }

    /**
     * Sets _do.
     * <p>
     * Field description:
     * Array of actions to execute.
     * <p>
     * The field is required.
     *
     * @param _do
     */
    @JsonProperty("do")
    public void setDo(List<Object> _do) {
        this._do = _do;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsForEach callsForEach = (CallsForEach) o;
        return Objects.equals(this.forEach, callsForEach.forEach)
                && Objects.equals(this.in, callsForEach.in)
                && Objects.equals(this.delimiter, callsForEach.delimiter)
                && Objects.equals(this._do, callsForEach._do);
    }

    @Override
    public int hashCode() {
        return Objects.hash(forEach, in, delimiter, _do);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsForEach {")
                .append(newLine)
                .append("    forEach: ")
                .append(toIndentedString(forEach))
                .append(newLine)
                .append("    in: ")
                .append(toIndentedString(in))
                .append(newLine)
                .append("    delimiter: ")
                .append(toIndentedString(delimiter))
                .append(newLine)
                .append("    _do: ")
                .append(toIndentedString(_do))
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
