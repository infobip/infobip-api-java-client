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
 * Represents WhatsAppWABAConversionEventRequest model.
 */
public class WhatsAppWABAConversionEventRequest {

    private String sourceId;

    private List<WhatsAppMetaConversionModel> conversions = new ArrayList<>();

    /**
     * Sets sourceId.
     * <p>
     * Field description:
     * Sender as source identifier. This is the phone number registered via the embedded signup flow available in Exchange app.
     * <p>
     * The field is required.
     *
     * @param sourceId
     * @return This {@link WhatsAppWABAConversionEventRequest instance}.
     */
    public WhatsAppWABAConversionEventRequest sourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * Returns sourceId.
     * <p>
     * Field description:
     * Sender as source identifier. This is the phone number registered via the embedded signup flow available in Exchange app.
     * <p>
     * The field is required.
     *
     * @return sourceId
     */
    @JsonProperty("sourceId")
    public String getSourceId() {
        return sourceId;
    }

    /**
     * Sets sourceId.
     * <p>
     * Field description:
     * Sender as source identifier. This is the phone number registered via the embedded signup flow available in Exchange app.
     * <p>
     * The field is required.
     *
     * @param sourceId
     */
    @JsonProperty("sourceId")
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * Sets conversions.
     * <p>
     * Field description:
     * Conversion events collection.
     * <p>
     * The field is required.
     *
     * @param conversions
     * @return This {@link WhatsAppWABAConversionEventRequest instance}.
     */
    public WhatsAppWABAConversionEventRequest conversions(List<WhatsAppMetaConversionModel> conversions) {
        this.conversions = conversions;
        return this;
    }

    /**
     * Adds and item into conversions.
     * <p>
     * Field description:
     * Conversion events collection.
     * <p>
     * The field is required.
     *
     * @param conversionsItem The item to be added to the list.
     * @return This {@link WhatsAppWABAConversionEventRequest instance}.
     */
    public WhatsAppWABAConversionEventRequest addConversionsItem(WhatsAppMetaConversionModel conversionsItem) {
        if (this.conversions == null) {
            this.conversions = new ArrayList<>();
        }
        this.conversions.add(conversionsItem);
        return this;
    }

    /**
     * Returns conversions.
     * <p>
     * Field description:
     * Conversion events collection.
     * <p>
     * The field is required.
     *
     * @return conversions
     */
    @JsonProperty("conversions")
    public List<WhatsAppMetaConversionModel> getConversions() {
        return conversions;
    }

    /**
     * Sets conversions.
     * <p>
     * Field description:
     * Conversion events collection.
     * <p>
     * The field is required.
     *
     * @param conversions
     */
    @JsonProperty("conversions")
    public void setConversions(List<WhatsAppMetaConversionModel> conversions) {
        this.conversions = conversions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WhatsAppWABAConversionEventRequest whatsAppWABAConversionEventRequest = (WhatsAppWABAConversionEventRequest) o;
        return Objects.equals(this.sourceId, whatsAppWABAConversionEventRequest.sourceId)
                && Objects.equals(this.conversions, whatsAppWABAConversionEventRequest.conversions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceId, conversions);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class WhatsAppWABAConversionEventRequest {")
                .append(newLine)
                .append("    sourceId: ")
                .append(toIndentedString(sourceId))
                .append(newLine)
                .append("    conversions: ")
                .append(toIndentedString(conversions))
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
