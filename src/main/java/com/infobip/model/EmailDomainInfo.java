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
 * Domain get response.
 */
public class EmailDomainInfo {

    private String domainName;

    private EmailApiDomainAccess dataAccess;

    private Boolean readBounces;

    private Boolean createBounces;

    private Boolean deleteBounces;

    private Boolean readComplaints;

    private Boolean createComplaints;

    private Boolean deleteComplaints;

    private Boolean readOverquotas;

    /**
     * Sets domainName.
     * <p>
     * Field description:
     * Name of the requested domain.
     * <p>
     * The field is required.
     *
     * @param domainName
     * @return This {@link EmailDomainInfo instance}.
     */
    public EmailDomainInfo domainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Returns domainName.
     * <p>
     * Field description:
     * Name of the requested domain.
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
     * Name of the requested domain.
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
     * Sets dataAccess.
     * <p>
     * The field is required.
     *
     * @param dataAccess
     * @return This {@link EmailDomainInfo instance}.
     */
    public EmailDomainInfo dataAccess(EmailApiDomainAccess dataAccess) {
        this.dataAccess = dataAccess;
        return this;
    }

    /**
     * Returns dataAccess.
     * <p>
     * The field is required.
     *
     * @return dataAccess
     */
    @JsonProperty("dataAccess")
    public EmailApiDomainAccess getDataAccess() {
        return dataAccess;
    }

    /**
     * Sets dataAccess.
     * <p>
     * The field is required.
     *
     * @param dataAccess
     */
    @JsonProperty("dataAccess")
    public void setDataAccess(EmailApiDomainAccess dataAccess) {
        this.dataAccess = dataAccess;
    }

    /**
     * Sets readBounces.
     * <p>
     * Field description:
     * Read bounces permission.
     * <p>
     * The field is required.
     *
     * @param readBounces
     * @return This {@link EmailDomainInfo instance}.
     */
    public EmailDomainInfo readBounces(Boolean readBounces) {
        this.readBounces = readBounces;
        return this;
    }

    /**
     * Returns readBounces.
     * <p>
     * Field description:
     * Read bounces permission.
     * <p>
     * The field is required.
     *
     * @return readBounces
     */
    @JsonProperty("readBounces")
    public Boolean getReadBounces() {
        return readBounces;
    }

    /**
     * Sets readBounces.
     * <p>
     * Field description:
     * Read bounces permission.
     * <p>
     * The field is required.
     *
     * @param readBounces
     */
    @JsonProperty("readBounces")
    public void setReadBounces(Boolean readBounces) {
        this.readBounces = readBounces;
    }

    /**
     * Sets createBounces.
     * <p>
     * Field description:
     * Create bounces permission.
     * <p>
     * The field is required.
     *
     * @param createBounces
     * @return This {@link EmailDomainInfo instance}.
     */
    public EmailDomainInfo createBounces(Boolean createBounces) {
        this.createBounces = createBounces;
        return this;
    }

    /**
     * Returns createBounces.
     * <p>
     * Field description:
     * Create bounces permission.
     * <p>
     * The field is required.
     *
     * @return createBounces
     */
    @JsonProperty("createBounces")
    public Boolean getCreateBounces() {
        return createBounces;
    }

    /**
     * Sets createBounces.
     * <p>
     * Field description:
     * Create bounces permission.
     * <p>
     * The field is required.
     *
     * @param createBounces
     */
    @JsonProperty("createBounces")
    public void setCreateBounces(Boolean createBounces) {
        this.createBounces = createBounces;
    }

    /**
     * Sets deleteBounces.
     * <p>
     * Field description:
     * Delete bounces permission.
     * <p>
     * The field is required.
     *
     * @param deleteBounces
     * @return This {@link EmailDomainInfo instance}.
     */
    public EmailDomainInfo deleteBounces(Boolean deleteBounces) {
        this.deleteBounces = deleteBounces;
        return this;
    }

    /**
     * Returns deleteBounces.
     * <p>
     * Field description:
     * Delete bounces permission.
     * <p>
     * The field is required.
     *
     * @return deleteBounces
     */
    @JsonProperty("deleteBounces")
    public Boolean getDeleteBounces() {
        return deleteBounces;
    }

    /**
     * Sets deleteBounces.
     * <p>
     * Field description:
     * Delete bounces permission.
     * <p>
     * The field is required.
     *
     * @param deleteBounces
     */
    @JsonProperty("deleteBounces")
    public void setDeleteBounces(Boolean deleteBounces) {
        this.deleteBounces = deleteBounces;
    }

    /**
     * Sets readComplaints.
     * <p>
     * Field description:
     * Read complaints permission.
     * <p>
     * The field is required.
     *
     * @param readComplaints
     * @return This {@link EmailDomainInfo instance}.
     */
    public EmailDomainInfo readComplaints(Boolean readComplaints) {
        this.readComplaints = readComplaints;
        return this;
    }

    /**
     * Returns readComplaints.
     * <p>
     * Field description:
     * Read complaints permission.
     * <p>
     * The field is required.
     *
     * @return readComplaints
     */
    @JsonProperty("readComplaints")
    public Boolean getReadComplaints() {
        return readComplaints;
    }

    /**
     * Sets readComplaints.
     * <p>
     * Field description:
     * Read complaints permission.
     * <p>
     * The field is required.
     *
     * @param readComplaints
     */
    @JsonProperty("readComplaints")
    public void setReadComplaints(Boolean readComplaints) {
        this.readComplaints = readComplaints;
    }

    /**
     * Sets createComplaints.
     * <p>
     * Field description:
     * Create complaints permission.
     * <p>
     * The field is required.
     *
     * @param createComplaints
     * @return This {@link EmailDomainInfo instance}.
     */
    public EmailDomainInfo createComplaints(Boolean createComplaints) {
        this.createComplaints = createComplaints;
        return this;
    }

    /**
     * Returns createComplaints.
     * <p>
     * Field description:
     * Create complaints permission.
     * <p>
     * The field is required.
     *
     * @return createComplaints
     */
    @JsonProperty("createComplaints")
    public Boolean getCreateComplaints() {
        return createComplaints;
    }

    /**
     * Sets createComplaints.
     * <p>
     * Field description:
     * Create complaints permission.
     * <p>
     * The field is required.
     *
     * @param createComplaints
     */
    @JsonProperty("createComplaints")
    public void setCreateComplaints(Boolean createComplaints) {
        this.createComplaints = createComplaints;
    }

    /**
     * Sets deleteComplaints.
     * <p>
     * Field description:
     * Delete complaints permission.
     * <p>
     * The field is required.
     *
     * @param deleteComplaints
     * @return This {@link EmailDomainInfo instance}.
     */
    public EmailDomainInfo deleteComplaints(Boolean deleteComplaints) {
        this.deleteComplaints = deleteComplaints;
        return this;
    }

    /**
     * Returns deleteComplaints.
     * <p>
     * Field description:
     * Delete complaints permission.
     * <p>
     * The field is required.
     *
     * @return deleteComplaints
     */
    @JsonProperty("deleteComplaints")
    public Boolean getDeleteComplaints() {
        return deleteComplaints;
    }

    /**
     * Sets deleteComplaints.
     * <p>
     * Field description:
     * Delete complaints permission.
     * <p>
     * The field is required.
     *
     * @param deleteComplaints
     */
    @JsonProperty("deleteComplaints")
    public void setDeleteComplaints(Boolean deleteComplaints) {
        this.deleteComplaints = deleteComplaints;
    }

    /**
     * Sets readOverquotas.
     * <p>
     * Field description:
     * Read overquotas permission.
     * <p>
     * The field is required.
     *
     * @param readOverquotas
     * @return This {@link EmailDomainInfo instance}.
     */
    public EmailDomainInfo readOverquotas(Boolean readOverquotas) {
        this.readOverquotas = readOverquotas;
        return this;
    }

    /**
     * Returns readOverquotas.
     * <p>
     * Field description:
     * Read overquotas permission.
     * <p>
     * The field is required.
     *
     * @return readOverquotas
     */
    @JsonProperty("readOverquotas")
    public Boolean getReadOverquotas() {
        return readOverquotas;
    }

    /**
     * Sets readOverquotas.
     * <p>
     * Field description:
     * Read overquotas permission.
     * <p>
     * The field is required.
     *
     * @param readOverquotas
     */
    @JsonProperty("readOverquotas")
    public void setReadOverquotas(Boolean readOverquotas) {
        this.readOverquotas = readOverquotas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailDomainInfo emailDomainInfo = (EmailDomainInfo) o;
        return Objects.equals(this.domainName, emailDomainInfo.domainName)
                && Objects.equals(this.dataAccess, emailDomainInfo.dataAccess)
                && Objects.equals(this.readBounces, emailDomainInfo.readBounces)
                && Objects.equals(this.createBounces, emailDomainInfo.createBounces)
                && Objects.equals(this.deleteBounces, emailDomainInfo.deleteBounces)
                && Objects.equals(this.readComplaints, emailDomainInfo.readComplaints)
                && Objects.equals(this.createComplaints, emailDomainInfo.createComplaints)
                && Objects.equals(this.deleteComplaints, emailDomainInfo.deleteComplaints)
                && Objects.equals(this.readOverquotas, emailDomainInfo.readOverquotas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                domainName,
                dataAccess,
                readBounces,
                createBounces,
                deleteBounces,
                readComplaints,
                createComplaints,
                deleteComplaints,
                readOverquotas);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailDomainInfo {")
                .append(newLine)
                .append("    domainName: ")
                .append(toIndentedString(domainName))
                .append(newLine)
                .append("    dataAccess: ")
                .append(toIndentedString(dataAccess))
                .append(newLine)
                .append("    readBounces: ")
                .append(toIndentedString(readBounces))
                .append(newLine)
                .append("    createBounces: ")
                .append(toIndentedString(createBounces))
                .append(newLine)
                .append("    deleteBounces: ")
                .append(toIndentedString(deleteBounces))
                .append(newLine)
                .append("    readComplaints: ")
                .append(toIndentedString(readComplaints))
                .append(newLine)
                .append("    createComplaints: ")
                .append(toIndentedString(createComplaints))
                .append(newLine)
                .append("    deleteComplaints: ")
                .append(toIndentedString(deleteComplaints))
                .append(newLine)
                .append("    readOverquotas: ")
                .append(toIndentedString(readOverquotas))
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
