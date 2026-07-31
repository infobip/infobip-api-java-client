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
 * Viber message template response containing template details and current status.
 */
public class ViberTemplateResponse {

    private String templateId;

    private String version;

    private String sender;

    private Long createdAt;

    private ViberTemplateCategory category;

    private ViberTemplateStatus status;

    private Long lastModified;

    private List<ViberTemplateParam> params = null;

    private List<ViberTemplateBody> body = null;

    /**
     * Sets templateId.
     * <p>
     * Field description:
     * Unique identifier of the template.
     *
     * @param templateId
     * @return This {@link ViberTemplateResponse instance}.
     */
    public ViberTemplateResponse templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * Returns templateId.
     * <p>
     * Field description:
     * Unique identifier of the template.
     *
     * @return templateId
     */
    @JsonProperty("templateId")
    public String getTemplateId() {
        return templateId;
    }

    /**
     * Sets templateId.
     * <p>
     * Field description:
     * Unique identifier of the template.
     *
     * @param templateId
     */
    @JsonProperty("templateId")
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * Sets version.
     * <p>
     * Field description:
     * Template version number.
     *
     * @param version
     * @return This {@link ViberTemplateResponse instance}.
     */
    public ViberTemplateResponse version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Returns version.
     * <p>
     * Field description:
     * Template version number.
     *
     * @return version
     */
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    /**
     * Sets version.
     * <p>
     * Field description:
     * Template version number.
     *
     * @param version
     */
    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Sets sender.
     * <p>
     * Field description:
     * Sender for which the template is registered.
     *
     * @param sender
     * @return This {@link ViberTemplateResponse instance}.
     */
    public ViberTemplateResponse sender(String sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Returns sender.
     * <p>
     * Field description:
     * Sender for which the template is registered.
     *
     * @return sender
     */
    @JsonProperty("sender")
    public String getSender() {
        return sender;
    }

    /**
     * Sets sender.
     * <p>
     * Field description:
     * Sender for which the template is registered.
     *
     * @param sender
     */
    @JsonProperty("sender")
    public void setSender(String sender) {
        this.sender = sender;
    }

    /**
     * Sets createdAt.
     * <p>
     * Field description:
     * Unix timestamp in milliseconds when the template was created.
     *
     * @param createdAt
     * @return This {@link ViberTemplateResponse instance}.
     */
    public ViberTemplateResponse createdAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Returns createdAt.
     * <p>
     * Field description:
     * Unix timestamp in milliseconds when the template was created.
     *
     * @return createdAt
     */
    @JsonProperty("createdAt")
    public Long getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets createdAt.
     * <p>
     * Field description:
     * Unix timestamp in milliseconds when the template was created.
     *
     * @param createdAt
     */
    @JsonProperty("createdAt")
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Sets category.
     *
     * @param category
     * @return This {@link ViberTemplateResponse instance}.
     */
    public ViberTemplateResponse category(ViberTemplateCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Returns category.
     *
     * @return category
     */
    @JsonProperty("category")
    public ViberTemplateCategory getCategory() {
        return category;
    }

    /**
     * Sets category.
     *
     * @param category
     */
    @JsonProperty("category")
    public void setCategory(ViberTemplateCategory category) {
        this.category = category;
    }

    /**
     * Sets status.
     *
     * @param status
     * @return This {@link ViberTemplateResponse instance}.
     */
    public ViberTemplateResponse status(ViberTemplateStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Returns status.
     *
     * @return status
     */
    @JsonProperty("status")
    public ViberTemplateStatus getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status
     */
    @JsonProperty("status")
    public void setStatus(ViberTemplateStatus status) {
        this.status = status;
    }

    /**
     * Sets lastModified.
     * <p>
     * Field description:
     * Unix timestamp in milliseconds when the template was last modified.
     *
     * @param lastModified
     * @return This {@link ViberTemplateResponse instance}.
     */
    public ViberTemplateResponse lastModified(Long lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * Returns lastModified.
     * <p>
     * Field description:
     * Unix timestamp in milliseconds when the template was last modified.
     *
     * @return lastModified
     */
    @JsonProperty("lastModified")
    public Long getLastModified() {
        return lastModified;
    }

    /**
     * Sets lastModified.
     * <p>
     * Field description:
     * Unix timestamp in milliseconds when the template was last modified.
     *
     * @param lastModified
     */
    @JsonProperty("lastModified")
    public void setLastModified(Long lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * Sets params.
     * <p>
     * Field description:
     * List of variable parameters defined in the template.
     *
     * @param params
     * @return This {@link ViberTemplateResponse instance}.
     */
    public ViberTemplateResponse params(List<ViberTemplateParam> params) {
        this.params = params;
        return this;
    }

    /**
     * Adds and item into params.
     * <p>
     * Field description:
     * List of variable parameters defined in the template.
     *
     * @param paramsItem The item to be added to the list.
     * @return This {@link ViberTemplateResponse instance}.
     */
    public ViberTemplateResponse addParamsItem(ViberTemplateParam paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    /**
     * Returns params.
     * <p>
     * Field description:
     * List of variable parameters defined in the template.
     *
     * @return params
     */
    @JsonProperty("params")
    public List<ViberTemplateParam> getParams() {
        return params;
    }

    /**
     * Sets params.
     * <p>
     * Field description:
     * List of variable parameters defined in the template.
     *
     * @param params
     */
    @JsonProperty("params")
    public void setParams(List<ViberTemplateParam> params) {
        this.params = params;
    }

    /**
     * Sets body.
     * <p>
     * Field description:
     * List of template bodies per language containing the actual message text.
     *
     * @param body
     * @return This {@link ViberTemplateResponse instance}.
     */
    public ViberTemplateResponse body(List<ViberTemplateBody> body) {
        this.body = body;
        return this;
    }

    /**
     * Adds and item into body.
     * <p>
     * Field description:
     * List of template bodies per language containing the actual message text.
     *
     * @param bodyItem The item to be added to the list.
     * @return This {@link ViberTemplateResponse instance}.
     */
    public ViberTemplateResponse addBodyItem(ViberTemplateBody bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    /**
     * Returns body.
     * <p>
     * Field description:
     * List of template bodies per language containing the actual message text.
     *
     * @return body
     */
    @JsonProperty("body")
    public List<ViberTemplateBody> getBody() {
        return body;
    }

    /**
     * Sets body.
     * <p>
     * Field description:
     * List of template bodies per language containing the actual message text.
     *
     * @param body
     */
    @JsonProperty("body")
    public void setBody(List<ViberTemplateBody> body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ViberTemplateResponse viberTemplateResponse = (ViberTemplateResponse) o;
        return Objects.equals(this.templateId, viberTemplateResponse.templateId)
                && Objects.equals(this.version, viberTemplateResponse.version)
                && Objects.equals(this.sender, viberTemplateResponse.sender)
                && Objects.equals(this.createdAt, viberTemplateResponse.createdAt)
                && Objects.equals(this.category, viberTemplateResponse.category)
                && Objects.equals(this.status, viberTemplateResponse.status)
                && Objects.equals(this.lastModified, viberTemplateResponse.lastModified)
                && Objects.equals(this.params, viberTemplateResponse.params)
                && Objects.equals(this.body, viberTemplateResponse.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId, version, sender, createdAt, category, status, lastModified, params, body);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ViberTemplateResponse {")
                .append(newLine)
                .append("    templateId: ")
                .append(toIndentedString(templateId))
                .append(newLine)
                .append("    version: ")
                .append(toIndentedString(version))
                .append(newLine)
                .append("    sender: ")
                .append(toIndentedString(sender))
                .append(newLine)
                .append("    createdAt: ")
                .append(toIndentedString(createdAt))
                .append(newLine)
                .append("    category: ")
                .append(toIndentedString(category))
                .append(newLine)
                .append("    status: ")
                .append(toIndentedString(status))
                .append(newLine)
                .append("    lastModified: ")
                .append(toIndentedString(lastModified))
                .append(newLine)
                .append("    params: ")
                .append(toIndentedString(params))
                .append(newLine)
                .append("    body: ")
                .append(toIndentedString(body))
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
