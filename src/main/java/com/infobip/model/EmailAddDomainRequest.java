/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;

/**
 * Represents EmailAddDomainRequest model.
 */
public class EmailAddDomainRequest {

    private String domainName;

    /**
     * Value for DKIM key length.
     */
    public enum DkimKeyLengthEnum {
        NUMBER_1024(1024),
        NUMBER_2048(2048);

        private Integer value;

        DkimKeyLengthEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DkimKeyLengthEnum fromValue(Integer value) {
            for (DkimKeyLengthEnum enumElement : DkimKeyLengthEnum.values()) {
                if (enumElement.value.equals(value)) {
                    return enumElement;
                }
            }
            throw new IllegalArgumentException("Unexpected enum value '" + value + "'.");
        }
    }

    private DkimKeyLengthEnum dkimKeyLength;

    private Long targetedDailyTraffic;

    private String applicationId;

    private String entityId;

    private String returnPathAddress;

    /**
     * Sets domainName.
     * <p>
     * Field description:
     * Unique name for the domain.
     * <p>
     * The field is required.
     *
     * @param domainName
     * @return This {@link EmailAddDomainRequest instance}.
     */
    public EmailAddDomainRequest domainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Returns domainName.
     * <p>
     * Field description:
     * Unique name for the domain.
     * <p>
     * The field is required.
     *
     * @return domainName
     */
    @JsonProperty("domainName")
    public String getDomainName() {
        return domainName;
    }

    /**
     * Sets domainName.
     * <p>
     * Field description:
     * Unique name for the domain.
     * <p>
     * The field is required.
     *
     * @param domainName
     */
    @JsonProperty("domainName")
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * Sets dkimKeyLength.
     * <p>
     * Field description:
     * Value for DKIM key length.
     *
     * @param dkimKeyLength
     * @return This {@link EmailAddDomainRequest instance}.
     */
    public EmailAddDomainRequest dkimKeyLength(DkimKeyLengthEnum dkimKeyLength) {
        this.dkimKeyLength = dkimKeyLength;
        return this;
    }

    /**
     * Returns dkimKeyLength.
     * <p>
     * Field description:
     * Value for DKIM key length.
     *
     * @return dkimKeyLength
     */
    @JsonProperty("dkimKeyLength")
    public DkimKeyLengthEnum getDkimKeyLength() {
        return dkimKeyLength;
    }

    /**
     * Sets dkimKeyLength.
     * <p>
     * Field description:
     * Value for DKIM key length.
     *
     * @param dkimKeyLength
     */
    @JsonProperty("dkimKeyLength")
    public void setDkimKeyLength(DkimKeyLengthEnum dkimKeyLength) {
        this.dkimKeyLength = dkimKeyLength;
    }

    /**
     * Sets targetedDailyTraffic.
     * <p>
     * Field description:
     * Targeted daily traffic.
     * <p>
     * The field is required.
     *
     * @param targetedDailyTraffic
     * @return This {@link EmailAddDomainRequest instance}.
     */
    public EmailAddDomainRequest targetedDailyTraffic(Long targetedDailyTraffic) {
        this.targetedDailyTraffic = targetedDailyTraffic;
        return this;
    }

    /**
     * Returns targetedDailyTraffic.
     * <p>
     * Field description:
     * Targeted daily traffic.
     * <p>
     * The field is required.
     *
     * @return targetedDailyTraffic
     */
    @JsonProperty("targetedDailyTraffic")
    public Long getTargetedDailyTraffic() {
        return targetedDailyTraffic;
    }

    /**
     * Sets targetedDailyTraffic.
     * <p>
     * Field description:
     * Targeted daily traffic.
     * <p>
     * The field is required.
     *
     * @param targetedDailyTraffic
     */
    @JsonProperty("targetedDailyTraffic")
    public void setTargetedDailyTraffic(Long targetedDailyTraffic) {
        this.targetedDailyTraffic = targetedDailyTraffic;
    }

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * Required for application use in a send request for outbound traffic. Returned in notification events.
     *
     * @param applicationId
     * @return This {@link EmailAddDomainRequest instance}.
     */
    public EmailAddDomainRequest applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * Required for application use in a send request for outbound traffic. Returned in notification events.
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
     * Required for application use in a send request for outbound traffic. Returned in notification events.
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
     * Required for entity use in a send request for outbound traffic. Returned in notification events.
     *
     * @param entityId
     * @return This {@link EmailAddDomainRequest instance}.
     */
    public EmailAddDomainRequest entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     * <p>
     * Field description:
     * Required for entity use in a send request for outbound traffic. Returned in notification events.
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
     * Required for entity use in a send request for outbound traffic. Returned in notification events.
     *
     * @param entityId
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * Sets returnPathAddress.
     * <p>
     * Field description:
     * Set a custom return path to customize the mailbox that tells receiving email servers where to route delayed bounces.
     *
     * @param returnPathAddress
     * @return This {@link EmailAddDomainRequest instance}.
     */
    public EmailAddDomainRequest returnPathAddress(String returnPathAddress) {
        this.returnPathAddress = returnPathAddress;
        return this;
    }

    /**
     * Returns returnPathAddress.
     * <p>
     * Field description:
     * Set a custom return path to customize the mailbox that tells receiving email servers where to route delayed bounces.
     *
     * @return returnPathAddress
     */
    @JsonProperty("returnPathAddress")
    public String getReturnPathAddress() {
        return returnPathAddress;
    }

    /**
     * Sets returnPathAddress.
     * <p>
     * Field description:
     * Set a custom return path to customize the mailbox that tells receiving email servers where to route delayed bounces.
     *
     * @param returnPathAddress
     */
    @JsonProperty("returnPathAddress")
    public void setReturnPathAddress(String returnPathAddress) {
        this.returnPathAddress = returnPathAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailAddDomainRequest emailAddDomainRequest = (EmailAddDomainRequest) o;
        return Objects.equals(this.domainName, emailAddDomainRequest.domainName)
                && Objects.equals(this.dkimKeyLength, emailAddDomainRequest.dkimKeyLength)
                && Objects.equals(this.targetedDailyTraffic, emailAddDomainRequest.targetedDailyTraffic)
                && Objects.equals(this.applicationId, emailAddDomainRequest.applicationId)
                && Objects.equals(this.entityId, emailAddDomainRequest.entityId)
                && Objects.equals(this.returnPathAddress, emailAddDomainRequest.returnPathAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                domainName, dkimKeyLength, targetedDailyTraffic, applicationId, entityId, returnPathAddress);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailAddDomainRequest {")
                .append(newLine)
                .append("    domainName: ")
                .append(toIndentedString(domainName))
                .append(newLine)
                .append("    dkimKeyLength: ")
                .append(toIndentedString(dkimKeyLength))
                .append(newLine)
                .append("    targetedDailyTraffic: ")
                .append(toIndentedString(targetedDailyTraffic))
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    entityId: ")
                .append(toIndentedString(entityId))
                .append(newLine)
                .append("    returnPathAddress: ")
                .append(toIndentedString(returnPathAddress))
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
