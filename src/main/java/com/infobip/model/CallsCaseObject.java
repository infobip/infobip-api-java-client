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
 * Represents CallsCaseObject model.
 */
public class CallsCaseObject {

    private List<Object> _default = new ArrayList<>();

    /**
     * Sets _default.
     * <p>
     * Field description:
     * Array of actions to execute if none of the conditions above are met.
     * <p>
     * The field is required.
     *
     * @param _default
     * @return This {@link CallsCaseObject instance}.
     */
    public CallsCaseObject _default(List<Object> _default) {
        this._default = _default;
        return this;
    }

    /**
     * Adds and item into _default.
     * <p>
     * Field description:
     * Array of actions to execute if none of the conditions above are met.
     * <p>
     * The field is required.
     *
     * @param _defaultItem The item to be added to the list.
     * @return This {@link CallsCaseObject instance}.
     */
    public CallsCaseObject addDefaultItem(Object _defaultItem) {
        if (this._default == null) {
            this._default = new ArrayList<>();
        }
        this._default.add(_defaultItem);
        return this;
    }

    /**
     * Returns _default.
     * <p>
     * Field description:
     * Array of actions to execute if none of the conditions above are met.
     * <p>
     * The field is required.
     *
     * @return _default
     */
    @JsonProperty("__default")
    public List<Object> getDefault() {
        return _default;
    }

    /**
     * Sets _default.
     * <p>
     * Field description:
     * Array of actions to execute if none of the conditions above are met.
     * <p>
     * The field is required.
     *
     * @param _default
     */
    @JsonProperty("__default")
    public void setDefault(List<Object> _default) {
        this._default = _default;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsCaseObject callsCaseObject = (CallsCaseObject) o;
        return Objects.equals(this._default, callsCaseObject._default);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_default);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsCaseObject {")
                .append(newLine)
                .append("    _default: ")
                .append(toIndentedString(_default))
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
