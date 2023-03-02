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
 * Region-specific parameters, often imposed by local laws. Use this, if country or region that you are sending an SMS to requires additional information.
 */
public class SmsRegionalOptions {

    private SmsIndiaDltOptions indiaDlt;

    private SmsTurkeyIysOptions turkeyIys;

    /**
     * Sets indiaDlt.
     *
     * @param indiaDlt
     * @return This {@link SmsRegionalOptions instance}.
     */
    public SmsRegionalOptions indiaDlt(SmsIndiaDltOptions indiaDlt) {
        this.indiaDlt = indiaDlt;
        return this;
    }

    /**
     * Returns indiaDlt.
     *
     * @return indiaDlt
     */
    @JsonProperty("indiaDlt")
    public SmsIndiaDltOptions getIndiaDlt() {
        return indiaDlt;
    }

    /**
     * Sets indiaDlt.
     *
     * @param indiaDlt
     */
    @JsonProperty("indiaDlt")
    public void setIndiaDlt(SmsIndiaDltOptions indiaDlt) {
        this.indiaDlt = indiaDlt;
    }

    /**
     * Sets turkeyIys.
     *
     * @param turkeyIys
     * @return This {@link SmsRegionalOptions instance}.
     */
    public SmsRegionalOptions turkeyIys(SmsTurkeyIysOptions turkeyIys) {
        this.turkeyIys = turkeyIys;
        return this;
    }

    /**
     * Returns turkeyIys.
     *
     * @return turkeyIys
     */
    @JsonProperty("turkeyIys")
    public SmsTurkeyIysOptions getTurkeyIys() {
        return turkeyIys;
    }

    /**
     * Sets turkeyIys.
     *
     * @param turkeyIys
     */
    @JsonProperty("turkeyIys")
    public void setTurkeyIys(SmsTurkeyIysOptions turkeyIys) {
        this.turkeyIys = turkeyIys;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SmsRegionalOptions smsRegionalOptions = (SmsRegionalOptions) o;
        return Objects.equals(this.indiaDlt, smsRegionalOptions.indiaDlt)
                && Objects.equals(this.turkeyIys, smsRegionalOptions.turkeyIys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indiaDlt, turkeyIys);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class SmsRegionalOptions {")
                .append(newLine)
                .append("    indiaDlt: ")
                .append(toIndentedString(indiaDlt))
                .append(newLine)
                .append("    turkeyIys: ")
                .append(toIndentedString(turkeyIys))
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
