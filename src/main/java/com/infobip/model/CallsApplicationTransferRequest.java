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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Represents CallsApplicationTransferRequest model.
 */
public class CallsApplicationTransferRequest {

    private String destinationApplicationId;

    private Integer timeout;

    private Map<String, String> context = null;

    /**
     * Sets destinationApplicationId.
     * <p>
     * Field description:
     * ID of the application to which the call is to be transferred.
     * <p>
     * The field is required.
     *
     * @param destinationApplicationId
     * @return This {@link CallsApplicationTransferRequest instance}.
     */
    public CallsApplicationTransferRequest destinationApplicationId(String destinationApplicationId) {
        this.destinationApplicationId = destinationApplicationId;
        return this;
    }

    /**
     * Returns destinationApplicationId.
     * <p>
     * Field description:
     * ID of the application to which the call is to be transferred.
     * <p>
     * The field is required.
     *
     * @return destinationApplicationId
     */
    @JsonProperty("destinationApplicationId")
    public String getDestinationApplicationId() {
        return destinationApplicationId;
    }

    /**
     * Sets destinationApplicationId.
     * <p>
     * Field description:
     * ID of the application to which the call is to be transferred.
     * <p>
     * The field is required.
     *
     * @param destinationApplicationId
     */
    @JsonProperty("destinationApplicationId")
    public void setDestinationApplicationId(String destinationApplicationId) {
        this.destinationApplicationId = destinationApplicationId;
    }

    /**
     * Sets timeout.
     * <p>
     * Field description:
     * Time to wait, in seconds, for the receiving application to accept the transfer.
     *
     * @param timeout
     * @return This {@link CallsApplicationTransferRequest instance}.
     */
    public CallsApplicationTransferRequest timeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Returns timeout.
     * <p>
     * Field description:
     * Time to wait, in seconds, for the receiving application to accept the transfer.
     *
     * @return timeout
     */
    @JsonProperty("timeout")
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Sets timeout.
     * <p>
     * Field description:
     * Time to wait, in seconds, for the receiving application to accept the transfer.
     *
     * @param timeout
     */
    @JsonProperty("timeout")
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * Sets context.
     * <p>
     * Field description:
     * Client defined data to be passed to the destination application.
     *
     * @param context
     * @return This {@link CallsApplicationTransferRequest instance}.
     */
    public CallsApplicationTransferRequest context(Map<String, String> context) {
        this.context = context;
        return this;
    }

    /**
     * Puts and entry into context.
     * <p>
     * Field description:
     * Client defined data to be passed to the destination application.
     *
     * @param key The given key.
     * @param contextItem The item to be associated with the given key.
     * @return This {@link CallsApplicationTransferRequest instance}.
     */
    public CallsApplicationTransferRequest putContextItem(String key, String contextItem) {
        if (this.context == null) {
            this.context = new HashMap<>();
        }
        this.context.put(key, contextItem);
        return this;
    }

    /**
     * Returns context.
     * <p>
     * Field description:
     * Client defined data to be passed to the destination application.
     *
     * @return context
     */
    @JsonProperty("context")
    public Map<String, String> getContext() {
        return context;
    }

    /**
     * Sets context.
     * <p>
     * Field description:
     * Client defined data to be passed to the destination application.
     *
     * @param context
     */
    @JsonProperty("context")
    public void setContext(Map<String, String> context) {
        this.context = context;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsApplicationTransferRequest callsApplicationTransferRequest = (CallsApplicationTransferRequest) o;
        return Objects.equals(this.destinationApplicationId, callsApplicationTransferRequest.destinationApplicationId)
                && Objects.equals(this.timeout, callsApplicationTransferRequest.timeout)
                && Objects.equals(this.context, callsApplicationTransferRequest.context);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationApplicationId, timeout, context);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsApplicationTransferRequest {")
                .append(newLine)
                .append("    destinationApplicationId: ")
                .append(toIndentedString(destinationApplicationId))
                .append(newLine)
                .append("    timeout: ")
                .append(toIndentedString(timeout))
                .append(newLine)
                .append("    context: ")
                .append(toIndentedString(context))
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
