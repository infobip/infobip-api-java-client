/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip;

import java.util.Objects;

/**
 * Represents a parameter with a name and a value.
 */
public final class Parameter {

    private final String name;
    private final Object value;

    /**
     * {@link Parameter} constructor. Both the name and the value must not be null.
     *
     * @param name The given name.
     * @param value The given value.
     * @throws NullPointerException if either of the arguments is null.
     */
    public Parameter(String name, Object value) {
        this.name = Objects.requireNonNull(name);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * Returns the parameter name.
     *
     * @return The parameter name.
     */
    public String name() {
        return name;
    }

    /**
     * Returns the parameter value.
     *
     * @return The parameter value.
     */
    public Object value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Parameter parameter = (Parameter) o;
        return name.equals(parameter.name) && value.equals(parameter.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        return "Parameter{" + "name='" + name + '\'' + ", value='" + value + '\'' + '}';
    }
}
