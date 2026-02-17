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
 * Sending rate defined in number of messages sent per second, minute, hour or day. You may wish to use this to allow your systems or agents to handle large amounts of incoming traffic. Not setting a send speed limit can overwhelm your resources with incoming traffic. If this parameter is defined, _validityPeriod_ is ignored.
 */
public class CallsSendingSpeed {

    private Integer speed;

    private String timeUnit;

    /**
     * Sets speed.
     * <p>
     * Field description:
     * Defines the number of messages that will be sent per specified time unit.
     *
     * @param speed
     * @return This {@link CallsSendingSpeed instance}.
     */
    public CallsSendingSpeed speed(Integer speed) {
        this.speed = speed;
        return this;
    }

    /**
     * Returns speed.
     * <p>
     * Field description:
     * Defines the number of messages that will be sent per specified time unit.
     *
     * @return speed
     */
    @JsonProperty("speed")
    public Integer getSpeed() {
        return speed;
    }

    /**
     * Sets speed.
     * <p>
     * Field description:
     * Defines the number of messages that will be sent per specified time unit.
     *
     * @param speed
     */
    @JsonProperty("speed")
    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    /**
     * Sets timeUnit.
     * <p>
     * Field description:
     * Defines time unit used for calculating sending speed.  Possible values: &#x60;second&#x60;, &#x60;minute&#x60;, &#x60;hour&#x60; and &#x60;day&#x60;.
     *
     * @param timeUnit
     * @return This {@link CallsSendingSpeed instance}.
     */
    public CallsSendingSpeed timeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * Returns timeUnit.
     * <p>
     * Field description:
     * Defines time unit used for calculating sending speed.  Possible values: &#x60;second&#x60;, &#x60;minute&#x60;, &#x60;hour&#x60; and &#x60;day&#x60;.
     *
     * @return timeUnit
     */
    @JsonProperty("timeUnit")
    public String getTimeUnit() {
        return timeUnit;
    }

    /**
     * Sets timeUnit.
     * <p>
     * Field description:
     * Defines time unit used for calculating sending speed.  Possible values: &#x60;second&#x60;, &#x60;minute&#x60;, &#x60;hour&#x60; and &#x60;day&#x60;.
     *
     * @param timeUnit
     */
    @JsonProperty("timeUnit")
    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSendingSpeed callsSendingSpeed = (CallsSendingSpeed) o;
        return Objects.equals(this.speed, callsSendingSpeed.speed)
                && Objects.equals(this.timeUnit, callsSendingSpeed.timeUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, timeUnit);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSendingSpeed {")
                .append(newLine)
                .append("    speed: ")
                .append(toIndentedString(speed))
                .append(newLine)
                .append("    timeUnit: ")
                .append(toIndentedString(timeUnit))
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
