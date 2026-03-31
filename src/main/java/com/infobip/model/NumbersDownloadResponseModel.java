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
 * Represents NumbersDownloadResponseModel model.
 */
public class NumbersDownloadResponseModel {

    private String id;

    private String downloadUrl;

    private String expiresAt;

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique recording identifier
     *
     * @param id
     * @return This {@link NumbersDownloadResponseModel instance}.
     */
    public NumbersDownloadResponseModel id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns id.
     * <p>
     * Field description:
     * Unique recording identifier
     *
     * @return id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     * <p>
     * Field description:
     * Unique recording identifier
     *
     * @param id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Sets downloadUrl.
     * <p>
     * Field description:
     * File url.
     *
     * @param downloadUrl
     * @return This {@link NumbersDownloadResponseModel instance}.
     */
    public NumbersDownloadResponseModel downloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * Returns downloadUrl.
     * <p>
     * Field description:
     * File url.
     *
     * @return downloadUrl
     */
    @JsonProperty("downloadUrl")
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
     * Sets downloadUrl.
     * <p>
     * Field description:
     * File url.
     *
     * @param downloadUrl
     */
    @JsonProperty("downloadUrl")
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    /**
     * Sets expiresAt.
     * <p>
     * Field description:
     * Date and time until download URL is valid. It is in *&#x60;YYYY-MM-DDThh:mm:ss.SSSZ&#x60; format &#x60;(2019-04-25T18:00:00.000+0000))&#x60;*
     *
     * @param expiresAt
     * @return This {@link NumbersDownloadResponseModel instance}.
     */
    public NumbersDownloadResponseModel expiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * Returns expiresAt.
     * <p>
     * Field description:
     * Date and time until download URL is valid. It is in *&#x60;YYYY-MM-DDThh:mm:ss.SSSZ&#x60; format &#x60;(2019-04-25T18:00:00.000+0000))&#x60;*
     *
     * @return expiresAt
     */
    @JsonProperty("expiresAt")
    public String getExpiresAt() {
        return expiresAt;
    }

    /**
     * Sets expiresAt.
     * <p>
     * Field description:
     * Date and time until download URL is valid. It is in *&#x60;YYYY-MM-DDThh:mm:ss.SSSZ&#x60; format &#x60;(2019-04-25T18:00:00.000+0000))&#x60;*
     *
     * @param expiresAt
     */
    @JsonProperty("expiresAt")
    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersDownloadResponseModel numbersDownloadResponseModel = (NumbersDownloadResponseModel) o;
        return Objects.equals(this.id, numbersDownloadResponseModel.id)
                && Objects.equals(this.downloadUrl, numbersDownloadResponseModel.downloadUrl)
                && Objects.equals(this.expiresAt, numbersDownloadResponseModel.expiresAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, downloadUrl, expiresAt);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersDownloadResponseModel {")
                .append(newLine)
                .append("    id: ")
                .append(toIndentedString(id))
                .append(newLine)
                .append("    downloadUrl: ")
                .append(toIndentedString(downloadUrl))
                .append(newLine)
                .append("    expiresAt: ")
                .append(toIndentedString(expiresAt))
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
