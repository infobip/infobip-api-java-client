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
 * Represents CallsPublicCnamStatus model.
 */
public class CallsPublicCnamStatus {

    private CallsCnamStorageStatus storage;

    private CallsCnamDeliveryStatus delivery;

    /**
     * Sets storage.
     *
     * @param storage
     * @return This {@link CallsPublicCnamStatus instance}.
     */
    public CallsPublicCnamStatus storage(CallsCnamStorageStatus storage) {
        this.storage = storage;
        return this;
    }

    /**
     * Returns storage.
     *
     * @return storage
     */
    @JsonProperty("storage")
    public CallsCnamStorageStatus getStorage() {
        return storage;
    }

    /**
     * Sets storage.
     *
     * @param storage
     */
    @JsonProperty("storage")
    public void setStorage(CallsCnamStorageStatus storage) {
        this.storage = storage;
    }

    /**
     * Sets delivery.
     *
     * @param delivery
     * @return This {@link CallsPublicCnamStatus instance}.
     */
    public CallsPublicCnamStatus delivery(CallsCnamDeliveryStatus delivery) {
        this.delivery = delivery;
        return this;
    }

    /**
     * Returns delivery.
     *
     * @return delivery
     */
    @JsonProperty("delivery")
    public CallsCnamDeliveryStatus getDelivery() {
        return delivery;
    }

    /**
     * Sets delivery.
     *
     * @param delivery
     */
    @JsonProperty("delivery")
    public void setDelivery(CallsCnamDeliveryStatus delivery) {
        this.delivery = delivery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsPublicCnamStatus callsPublicCnamStatus = (CallsPublicCnamStatus) o;
        return Objects.equals(this.storage, callsPublicCnamStatus.storage)
                && Objects.equals(this.delivery, callsPublicCnamStatus.delivery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storage, delivery);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsPublicCnamStatus {")
                .append(newLine)
                .append("    storage: ")
                .append(toIndentedString(storage))
                .append(newLine)
                .append("    delivery: ")
                .append(toIndentedString(delivery))
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
