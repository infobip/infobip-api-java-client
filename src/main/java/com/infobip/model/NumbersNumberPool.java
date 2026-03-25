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
 * The number pool to be used with the campaign.
 */
public class NumbersNumberPool {

    private String numberPoolId;

    private NumbersNumberPoolType numberPoolType;

    private NumbersNumberPoolStatus numberPoolStatus;

    private String nnid;

    private NumbersPolicyType policy;

    /**
     * Sets numberPoolId.
     * <p>
     * Field description:
     * Registrar ID of number pool
     *
     * @param numberPoolId
     * @return This {@link NumbersNumberPool instance}.
     */
    public NumbersNumberPool numberPoolId(String numberPoolId) {
        this.numberPoolId = numberPoolId;
        return this;
    }

    /**
     * Returns numberPoolId.
     * <p>
     * Field description:
     * Registrar ID of number pool
     *
     * @return numberPoolId
     */
    @JsonProperty("numberPoolId")
    public String getNumberPoolId() {
        return numberPoolId;
    }

    /**
     * Sets numberPoolId.
     * <p>
     * Field description:
     * Registrar ID of number pool
     *
     * @param numberPoolId
     */
    @JsonProperty("numberPoolId")
    public void setNumberPoolId(String numberPoolId) {
        this.numberPoolId = numberPoolId;
    }

    /**
     * Sets numberPoolType.
     *
     * @param numberPoolType
     * @return This {@link NumbersNumberPool instance}.
     */
    public NumbersNumberPool numberPoolType(NumbersNumberPoolType numberPoolType) {
        this.numberPoolType = numberPoolType;
        return this;
    }

    /**
     * Returns numberPoolType.
     *
     * @return numberPoolType
     */
    @JsonProperty("numberPoolType")
    public NumbersNumberPoolType getNumberPoolType() {
        return numberPoolType;
    }

    /**
     * Sets numberPoolType.
     *
     * @param numberPoolType
     */
    @JsonProperty("numberPoolType")
    public void setNumberPoolType(NumbersNumberPoolType numberPoolType) {
        this.numberPoolType = numberPoolType;
    }

    /**
     * Sets numberPoolStatus.
     *
     * @param numberPoolStatus
     * @return This {@link NumbersNumberPool instance}.
     */
    public NumbersNumberPool numberPoolStatus(NumbersNumberPoolStatus numberPoolStatus) {
        this.numberPoolStatus = numberPoolStatus;
        return this;
    }

    /**
     * Returns numberPoolStatus.
     *
     * @return numberPoolStatus
     */
    @JsonProperty("numberPoolStatus")
    public NumbersNumberPoolStatus getNumberPoolStatus() {
        return numberPoolStatus;
    }

    /**
     * Sets numberPoolStatus.
     *
     * @param numberPoolStatus
     */
    @JsonProperty("numberPoolStatus")
    public void setNumberPoolStatus(NumbersNumberPoolStatus numberPoolStatus) {
        this.numberPoolStatus = numberPoolStatus;
    }

    /**
     * Sets nnid.
     * <p>
     * Field description:
     * NNID of number pool
     *
     * @param nnid
     * @return This {@link NumbersNumberPool instance}.
     */
    public NumbersNumberPool nnid(String nnid) {
        this.nnid = nnid;
        return this;
    }

    /**
     * Returns nnid.
     * <p>
     * Field description:
     * NNID of number pool
     *
     * @return nnid
     */
    @JsonProperty("nnid")
    public String getNnid() {
        return nnid;
    }

    /**
     * Sets nnid.
     * <p>
     * Field description:
     * NNID of number pool
     *
     * @param nnid
     */
    @JsonProperty("nnid")
    public void setNnid(String nnid) {
        this.nnid = nnid;
    }

    /**
     * Sets policy.
     *
     * @param policy
     * @return This {@link NumbersNumberPool instance}.
     */
    public NumbersNumberPool policy(NumbersPolicyType policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Returns policy.
     *
     * @return policy
     */
    @JsonProperty("policy")
    public NumbersPolicyType getPolicy() {
        return policy;
    }

    /**
     * Sets policy.
     *
     * @param policy
     */
    @JsonProperty("policy")
    public void setPolicy(NumbersPolicyType policy) {
        this.policy = policy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersNumberPool numbersNumberPool = (NumbersNumberPool) o;
        return Objects.equals(this.numberPoolId, numbersNumberPool.numberPoolId)
                && Objects.equals(this.numberPoolType, numbersNumberPool.numberPoolType)
                && Objects.equals(this.numberPoolStatus, numbersNumberPool.numberPoolStatus)
                && Objects.equals(this.nnid, numbersNumberPool.nnid)
                && Objects.equals(this.policy, numbersNumberPool.policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberPoolId, numberPoolType, numberPoolStatus, nnid, policy);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersNumberPool {")
                .append(newLine)
                .append("    numberPoolId: ")
                .append(toIndentedString(numberPoolId))
                .append(newLine)
                .append("    numberPoolType: ")
                .append(toIndentedString(numberPoolType))
                .append(newLine)
                .append("    numberPoolStatus: ")
                .append(toIndentedString(numberPoolStatus))
                .append(newLine)
                .append("    nnid: ")
                .append(toIndentedString(nnid))
                .append(newLine)
                .append("    policy: ")
                .append(toIndentedString(policy))
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
