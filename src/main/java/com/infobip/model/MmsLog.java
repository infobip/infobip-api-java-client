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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Results.
 */
public class MmsLog {

    private String from;

    private String to;

    private String bulkId;

    private String messageId;

    private String title;

    private List<MmsLogsMessageSegment> messageSegments = null;

    private OffsetDateTime sentAt;

    private OffsetDateTime doneAt;

    private Integer mmsCount;

    private String mccMnc;

    private MessagePrice price;

    private MessageStatus status;

    private MessageError error;

    private String applicationId;

    private String entityId;

    /**
     * Sets from.
     * <p>
     * Field description:
     * The sender ID which can be alphanumeric or numeric (e.g., &#x60;CompanyName&#x60;).
     *
     * @param from
     * @return This {@link MmsLog instance}.
     */
    public MmsLog from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * The sender ID which can be alphanumeric or numeric (e.g., &#x60;CompanyName&#x60;).
     *
     * @return from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * The sender ID which can be alphanumeric or numeric (e.g., &#x60;CompanyName&#x60;).
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Message destination address.
     *
     * @param to
     * @return This {@link MmsLog instance}.
     */
    public MmsLog to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Message destination address.
     *
     * @return to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Message destination address.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request.
     *
     * @param bulkId
     * @return This {@link MmsLog instance}.
     */
    public MmsLog bulkId(String bulkId) {
        this.bulkId = bulkId;
        return this;
    }

    /**
     * Returns bulkId.
     * <p>
     * Field description:
     * Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request.
     *
     * @return bulkId
     */
    @JsonProperty("bulkId")
    public String getBulkId() {
        return bulkId;
    }

    /**
     * Sets bulkId.
     * <p>
     * Field description:
     * Unique ID assigned to the request if messaging multiple recipients or sending multiple messages via a single API request.
     *
     * @param bulkId
     */
    @JsonProperty("bulkId")
    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * Unique message ID.
     *
     * @param messageId
     * @return This {@link MmsLog instance}.
     */
    public MmsLog messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Returns messageId.
     * <p>
     * Field description:
     * Unique message ID.
     *
     * @return messageId
     */
    @JsonProperty("messageId")
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets messageId.
     * <p>
     * Field description:
     * Unique message ID.
     *
     * @param messageId
     */
    @JsonProperty("messageId")
    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * Sets title.
     * <p>
     * Field description:
     * Message title.
     *
     * @param title
     * @return This {@link MmsLog instance}.
     */
    public MmsLog title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Returns title.
     * <p>
     * Field description:
     * Message title.
     *
     * @return title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     * <p>
     * Field description:
     * Message title.
     *
     * @param title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Sets messageSegments.
     * <p>
     * Field description:
     * Content of the message being sent.
     *
     * @param messageSegments
     * @return This {@link MmsLog instance}.
     */
    public MmsLog messageSegments(List<MmsLogsMessageSegment> messageSegments) {
        this.messageSegments = messageSegments;
        return this;
    }

    /**
     * Adds and item into messageSegments.
     * <p>
     * Field description:
     * Content of the message being sent.
     *
     * @param messageSegmentsItem The item to be added to the list.
     * @return This {@link MmsLog instance}.
     */
    public MmsLog addMessageSegmentsItem(MmsLogsMessageSegment messageSegmentsItem) {
        if (this.messageSegments == null) {
            this.messageSegments = new ArrayList<>();
        }
        this.messageSegments.add(messageSegmentsItem);
        return this;
    }

    /**
     * Returns messageSegments.
     * <p>
     * Field description:
     * Content of the message being sent.
     *
     * @return messageSegments
     */
    @JsonProperty("messageSegments")
    public List<MmsLogsMessageSegment> getMessageSegments() {
        return messageSegments;
    }

    /**
     * Sets messageSegments.
     * <p>
     * Field description:
     * Content of the message being sent.
     *
     * @param messageSegments
     */
    @JsonProperty("messageSegments")
    public void setMessageSegments(List<MmsLogsMessageSegment> messageSegments) {
        this.messageSegments = messageSegments;
    }

    /**
     * Sets sentAt.
     * <p>
     * Field description:
     * Date and time when the message was sent. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param sentAt
     * @return This {@link MmsLog instance}.
     */
    public MmsLog sentAt(OffsetDateTime sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    /**
     * Returns sentAt.
     * <p>
     * Field description:
     * Date and time when the message was sent. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @return sentAt
     */
    @JsonProperty("sentAt")
    public OffsetDateTime getSentAt() {
        return sentAt;
    }

    /**
     * Sets sentAt.
     * <p>
     * Field description:
     * Date and time when the message was sent. Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param sentAt
     */
    @JsonProperty("sentAt")
    public void setSentAt(OffsetDateTime sentAt) {
        this.sentAt = sentAt;
    }

    /**
     * Sets doneAt.
     * <p>
     * Field description:
     * Date and time when the Infobip services finished processing the message (i.e., delivered to the destination, delivered to the destination network, etc.). Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param doneAt
     * @return This {@link MmsLog instance}.
     */
    public MmsLog doneAt(OffsetDateTime doneAt) {
        this.doneAt = doneAt;
        return this;
    }

    /**
     * Returns doneAt.
     * <p>
     * Field description:
     * Date and time when the Infobip services finished processing the message (i.e., delivered to the destination, delivered to the destination network, etc.). Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @return doneAt
     */
    @JsonProperty("doneAt")
    public OffsetDateTime getDoneAt() {
        return doneAt;
    }

    /**
     * Sets doneAt.
     * <p>
     * Field description:
     * Date and time when the Infobip services finished processing the message (i.e., delivered to the destination, delivered to the destination network, etc.). Has the following format: &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;.
     *
     * @param doneAt
     */
    @JsonProperty("doneAt")
    public void setDoneAt(OffsetDateTime doneAt) {
        this.doneAt = doneAt;
    }

    /**
     * Sets mmsCount.
     * <p>
     * Field description:
     * The number of parts the message content was split into.
     *
     * @param mmsCount
     * @return This {@link MmsLog instance}.
     */
    public MmsLog mmsCount(Integer mmsCount) {
        this.mmsCount = mmsCount;
        return this;
    }

    /**
     * Returns mmsCount.
     * <p>
     * Field description:
     * The number of parts the message content was split into.
     *
     * @return mmsCount
     */
    @JsonProperty("mmsCount")
    public Integer getMmsCount() {
        return mmsCount;
    }

    /**
     * Sets mmsCount.
     * <p>
     * Field description:
     * The number of parts the message content was split into.
     *
     * @param mmsCount
     */
    @JsonProperty("mmsCount")
    public void setMmsCount(Integer mmsCount) {
        this.mmsCount = mmsCount;
    }

    /**
     * Sets mccMnc.
     * <p>
     * Field description:
     * Mobile country and network codes.
     *
     * @param mccMnc
     * @return This {@link MmsLog instance}.
     */
    public MmsLog mccMnc(String mccMnc) {
        this.mccMnc = mccMnc;
        return this;
    }

    /**
     * Returns mccMnc.
     * <p>
     * Field description:
     * Mobile country and network codes.
     *
     * @return mccMnc
     */
    @JsonProperty("mccMnc")
    public String getMccMnc() {
        return mccMnc;
    }

    /**
     * Sets mccMnc.
     * <p>
     * Field description:
     * Mobile country and network codes.
     *
     * @param mccMnc
     */
    @JsonProperty("mccMnc")
    public void setMccMnc(String mccMnc) {
        this.mccMnc = mccMnc;
    }

    /**
     * Sets price.
     *
     * @param price
     * @return This {@link MmsLog instance}.
     */
    public MmsLog price(MessagePrice price) {
        this.price = price;
        return this;
    }

    /**
     * Returns price.
     *
     * @return price
     */
    @JsonProperty("price")
    public MessagePrice getPrice() {
        return price;
    }

    /**
     * Sets price.
     *
     * @param price
     */
    @JsonProperty("price")
    public void setPrice(MessagePrice price) {
        this.price = price;
    }

    /**
     * Sets status.
     *
     * @param status
     * @return This {@link MmsLog instance}.
     */
    public MmsLog status(MessageStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     *
     * @return status
     */
    @JsonProperty("status")
    public MessageStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(MessageStatus status) {
        this.status = status;
    }

    /**
     * Sets error.
     *
     * @param error
     * @return This {@link MmsLog instance}.
     */
    public MmsLog error(MessageError error) {
        this.error = error;
        return this;
    }

    /**
     * Returns error.
     *
     * @return error
     */
    @JsonProperty("error")
    public MessageError getError() {
        return error;
    }

    /**
     * Sets error.
     *
     * @param error
     */
    @JsonProperty("error")
    public void setError(MessageError error) {
        this.error = error;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * The application used when sending the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param applicationId
     * @return This {@link MmsLog instance}.
     */
    public MmsLog applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * The application used when sending the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @return applicationId
     */
    @JsonProperty("applicationId")
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * The application used when sending the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param applicationId
     */
    @JsonProperty("applicationId")
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * The entity used when sending the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param entityId
     * @return This {@link MmsLog instance}.
     */
    public MmsLog entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     * <p>
     * Field description:
     * The entity used when sending the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @return entityId
     */
    @JsonProperty("entityId")
    public String getEntityId() {
        return entityId;
    }

    /**
     * Sets entityId.
     * <p>
     * Field description:
     * The entity used when sending the message. For more details, see our [documentation](https://www.infobip.com/docs/cpaas-x/application-and-entity-management).
     *
     * @param entityId
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MmsLog mmsLog = (MmsLog) o;
        return Objects.equals(this.from, mmsLog.from)
                && Objects.equals(this.to, mmsLog.to)
                && Objects.equals(this.bulkId, mmsLog.bulkId)
                && Objects.equals(this.messageId, mmsLog.messageId)
                && Objects.equals(this.title, mmsLog.title)
                && Objects.equals(this.messageSegments, mmsLog.messageSegments)
                && Objects.equals(this.sentAt, mmsLog.sentAt)
                && Objects.equals(this.doneAt, mmsLog.doneAt)
                && Objects.equals(this.mmsCount, mmsLog.mmsCount)
                && Objects.equals(this.mccMnc, mmsLog.mccMnc)
                && Objects.equals(this.price, mmsLog.price)
                && Objects.equals(this.status, mmsLog.status)
                && Objects.equals(this.error, mmsLog.error)
                && Objects.equals(this.applicationId, mmsLog.applicationId)
                && Objects.equals(this.entityId, mmsLog.entityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                from,
                to,
                bulkId,
                messageId,
                title,
                messageSegments,
                sentAt,
                doneAt,
                mmsCount,
                mccMnc,
                price,
                status,
                error,
                applicationId,
                entityId);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class MmsLog {")
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    bulkId: ")
                .append(toIndentedString(bulkId))
                .append(newLine)
                .append("    messageId: ")
                .append(toIndentedString(messageId))
                .append(newLine)
                .append("    title: ")
                .append(toIndentedString(title))
                .append(newLine)
                .append("    messageSegments: ")
                .append(toIndentedString(messageSegments))
                .append(newLine)
                .append("    sentAt: ")
                .append(toIndentedString(sentAt))
                .append(newLine)
                .append("    doneAt: ")
                .append(toIndentedString(doneAt))
                .append(newLine)
                .append("    mmsCount: ")
                .append(toIndentedString(mmsCount))
                .append(newLine)
                .append("    mccMnc: ")
                .append(toIndentedString(mccMnc))
                .append(newLine)
                .append("    price: ")
                .append(toIndentedString(price))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    error: ")
                .append(toIndentedString(error))
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    entityId: ")
                .append(toIndentedString(entityId))
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
