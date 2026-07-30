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
 * Message content.
 */
public class EmailMessageContent {

    private String subject;

    private String text;

    private String html;

    private String ampHtml;

    private String templateId;

    private List<EmailMediaAttachment> attachments = null;

    private List<EmailMediaInlineImage> inlineImages = null;

    private String defaultPlaceholders;

    private String landingPagePlaceholders;

    private String optoutLandingPageId;

    private String templateLanguageVersion;

    private String headers;

    /**
     * Sets subject.
     * <p>
     * Field description:
     * Message subject.  Note: This field is required if &#x60;templateId&#x60; is not present.
     *
     * @param subject
     * @return This {@link EmailMessageContent instance}.
     */
    public EmailMessageContent subject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Returns subject.
     * <p>
     * Field description:
     * Message subject.  Note: This field is required if &#x60;templateId&#x60; is not present.
     *
     * @return subject
     */
    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    /**
     * Sets subject.
     * <p>
     * Field description:
     * Message subject.  Note: This field is required if &#x60;templateId&#x60; is not present.
     *
     * @param subject
     */
    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Body of the message.
     *
     * @param text
     * @return This {@link EmailMessageContent instance}.
     */
    public EmailMessageContent text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Body of the message.
     *
     * @return text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Body of the message.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets html.
     * <p>
     * Field description:
     * The message&#39;s body in HTML format. If both &#x60;html&#x60; and &#x60;text&#x60; fields are included, the &#x60;text&#x60; field will be disregarded, and the message will be sent using the &#x60;html&#x60; content.
     *
     * @param html
     * @return This {@link EmailMessageContent instance}.
     */
    public EmailMessageContent html(String html) {
        this.html = html;
        return this;
    }

    /**
     * Returns html.
     * <p>
     * Field description:
     * The message&#39;s body in HTML format. If both &#x60;html&#x60; and &#x60;text&#x60; fields are included, the &#x60;text&#x60; field will be disregarded, and the message will be sent using the &#x60;html&#x60; content.
     *
     * @return html
     */
    @JsonProperty("html")
    public String getHtml() {
        return html;
    }

    /**
     * Sets html.
     * <p>
     * Field description:
     * The message&#39;s body in HTML format. If both &#x60;html&#x60; and &#x60;text&#x60; fields are included, the &#x60;text&#x60; field will be disregarded, and the message will be sent using the &#x60;html&#x60; content.
     *
     * @param html
     */
    @JsonProperty("html")
    public void setHtml(String html) {
        this.html = html;
    }

    /**
     * Sets ampHtml.
     * <p>
     * Field description:
     * The message&#39;s body in AMP HTML format. If you include &#x60;ampHtml&#x60;, you must also include &#x60;html&#x60;, which will be displayed if AMP is not supported. Keep in mind that not all email clients support AMP HTML. For guidance on configuring the Gmail client, please visit this link: https://developers.google.com/gmail/ampemail/ .
     *
     * @param ampHtml
     * @return This {@link EmailMessageContent instance}.
     */
    public EmailMessageContent ampHtml(String ampHtml) {
        this.ampHtml = ampHtml;
        return this;
    }

    /**
     * Returns ampHtml.
     * <p>
     * Field description:
     * The message&#39;s body in AMP HTML format. If you include &#x60;ampHtml&#x60;, you must also include &#x60;html&#x60;, which will be displayed if AMP is not supported. Keep in mind that not all email clients support AMP HTML. For guidance on configuring the Gmail client, please visit this link: https://developers.google.com/gmail/ampemail/ .
     *
     * @return ampHtml
     */
    @JsonProperty("ampHtml")
    public String getAmpHtml() {
        return ampHtml;
    }

    /**
     * Sets ampHtml.
     * <p>
     * Field description:
     * The message&#39;s body in AMP HTML format. If you include &#x60;ampHtml&#x60;, you must also include &#x60;html&#x60;, which will be displayed if AMP is not supported. Keep in mind that not all email clients support AMP HTML. For guidance on configuring the Gmail client, please visit this link: https://developers.google.com/gmail/ampemail/ .
     *
     * @param ampHtml
     */
    @JsonProperty("ampHtml")
    public void setAmpHtml(String ampHtml) {
        this.ampHtml = ampHtml;
    }

    /**
     * Sets templateId.
     * <p>
     * Field description:
     * The Template ID with predefined email content created through the Infobip web interface or API. When &#x60;templateId&#x60; is specified, the &#x60;html&#x60; and &#x60;text&#x60; fields will be disregarded.  Note: &#x60;templateId&#x60; only supports the &#x60;Broadcast&#x60; value; &#x60;Content&#x60; and &#x60;Flow&#x60; templates are not supported.
     *
     * @param templateId
     * @return This {@link EmailMessageContent instance}.
     */
    public EmailMessageContent templateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * Returns templateId.
     * <p>
     * Field description:
     * The Template ID with predefined email content created through the Infobip web interface or API. When &#x60;templateId&#x60; is specified, the &#x60;html&#x60; and &#x60;text&#x60; fields will be disregarded.  Note: &#x60;templateId&#x60; only supports the &#x60;Broadcast&#x60; value; &#x60;Content&#x60; and &#x60;Flow&#x60; templates are not supported.
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
     * The Template ID with predefined email content created through the Infobip web interface or API. When &#x60;templateId&#x60; is specified, the &#x60;html&#x60; and &#x60;text&#x60; fields will be disregarded.  Note: &#x60;templateId&#x60; only supports the &#x60;Broadcast&#x60; value; &#x60;Content&#x60; and &#x60;Flow&#x60; templates are not supported.
     *
     * @param templateId
     */
    @JsonProperty("templateId")
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * Sets attachments.
     * <p>
     * Field description:
     * File attachments.
     *
     * @param attachments
     * @return This {@link EmailMessageContent instance}.
     */
    public EmailMessageContent attachments(List<EmailMediaAttachment> attachments) {
        this.attachments = attachments;
        return this;
    }

    /**
     * Adds and item into attachments.
     * <p>
     * Field description:
     * File attachments.
     *
     * @param attachmentsItem The item to be added to the list.
     * @return This {@link EmailMessageContent instance}.
     */
    public EmailMessageContent addAttachmentsItem(EmailMediaAttachment attachmentsItem) {
        if (this.attachments == null) {
            this.attachments = new ArrayList<>();
        }
        this.attachments.add(attachmentsItem);
        return this;
    }

    /**
     * Returns attachments.
     * <p>
     * Field description:
     * File attachments.
     *
     * @return attachments
     */
    @JsonProperty("attachments")
    public List<EmailMediaAttachment> getAttachments() {
        return attachments;
    }

    /**
     * Sets attachments.
     * <p>
     * Field description:
     * File attachments.
     *
     * @param attachments
     */
    @JsonProperty("attachments")
    public void setAttachments(List<EmailMediaAttachment> attachments) {
        this.attachments = attachments;
    }

    /**
     * Sets inlineImages.
     * <p>
     * Field description:
     * Allows for inserting an image file inside the HTML code of the email by using &#x60;cid:FILENAME&#x60; instead of providing an external link to the image.
     *
     * @param inlineImages
     * @return This {@link EmailMessageContent instance}.
     */
    public EmailMessageContent inlineImages(List<EmailMediaInlineImage> inlineImages) {
        this.inlineImages = inlineImages;
        return this;
    }

    /**
     * Adds and item into inlineImages.
     * <p>
     * Field description:
     * Allows for inserting an image file inside the HTML code of the email by using &#x60;cid:FILENAME&#x60; instead of providing an external link to the image.
     *
     * @param inlineImagesItem The item to be added to the list.
     * @return This {@link EmailMessageContent instance}.
     */
    public EmailMessageContent addInlineImagesItem(EmailMediaInlineImage inlineImagesItem) {
        if (this.inlineImages == null) {
            this.inlineImages = new ArrayList<>();
        }
        this.inlineImages.add(inlineImagesItem);
        return this;
    }

    /**
     * Returns inlineImages.
     * <p>
     * Field description:
     * Allows for inserting an image file inside the HTML code of the email by using &#x60;cid:FILENAME&#x60; instead of providing an external link to the image.
     *
     * @return inlineImages
     */
    @JsonProperty("inlineImages")
    public List<EmailMediaInlineImage> getInlineImages() {
        return inlineImages;
    }

    /**
     * Sets inlineImages.
     * <p>
     * Field description:
     * Allows for inserting an image file inside the HTML code of the email by using &#x60;cid:FILENAME&#x60; instead of providing an external link to the image.
     *
     * @param inlineImages
     */
    @JsonProperty("inlineImages")
    public void setInlineImages(List<EmailMediaInlineImage> inlineImages) {
        this.inlineImages = inlineImages;
    }

    /**
     * Sets defaultPlaceholders.
     * <p>
     * Field description:
     * General placeholders: &#x60;{\&quot;ph1\&quot;: \&quot;Success\&quot;}&#x60; will replace the key &#x60;{{ph1}}&#x60; with the value Success throughout the email, including the &#x60;subject&#x60;, &#x60;text&#x60;, and HTML. If there are multiple recipients in the To field, this placeholder will use the same value for the key ph1 for all recipients.
     *
     * @param defaultPlaceholders
     * @return This {@link EmailMessageContent instance}.
     */
    public EmailMessageContent defaultPlaceholders(String defaultPlaceholders) {
        this.defaultPlaceholders = defaultPlaceholders;
        return this;
    }

    /**
     * Returns defaultPlaceholders.
     * <p>
     * Field description:
     * General placeholders: &#x60;{\&quot;ph1\&quot;: \&quot;Success\&quot;}&#x60; will replace the key &#x60;{{ph1}}&#x60; with the value Success throughout the email, including the &#x60;subject&#x60;, &#x60;text&#x60;, and HTML. If there are multiple recipients in the To field, this placeholder will use the same value for the key ph1 for all recipients.
     *
     * @return defaultPlaceholders
     */
    @JsonProperty("defaultPlaceholders")
    public String getDefaultPlaceholders() {
        return defaultPlaceholders;
    }

    /**
     * Sets defaultPlaceholders.
     * <p>
     * Field description:
     * General placeholders: &#x60;{\&quot;ph1\&quot;: \&quot;Success\&quot;}&#x60; will replace the key &#x60;{{ph1}}&#x60; with the value Success throughout the email, including the &#x60;subject&#x60;, &#x60;text&#x60;, and HTML. If there are multiple recipients in the To field, this placeholder will use the same value for the key ph1 for all recipients.
     *
     * @param defaultPlaceholders
     */
    @JsonProperty("defaultPlaceholders")
    public void setDefaultPlaceholders(String defaultPlaceholders) {
        this.defaultPlaceholders = defaultPlaceholders;
    }

    /**
     * Sets landingPagePlaceholders.
     * <p>
     * Field description:
     * Personalize Opt-Out Landing Page by inserting placeholders. Insert placeholder or tag while designing landing page. Value should be defined as: &#x60;{\&quot;unsubscribe\&quot;: \&quot;Unsubscribe\&quot;}&#x60;
     *
     * @param landingPagePlaceholders
     * @return This {@link EmailMessageContent instance}.
     */
    public EmailMessageContent landingPagePlaceholders(String landingPagePlaceholders) {
        this.landingPagePlaceholders = landingPagePlaceholders;
        return this;
    }

    /**
     * Returns landingPagePlaceholders.
     * <p>
     * Field description:
     * Personalize Opt-Out Landing Page by inserting placeholders. Insert placeholder or tag while designing landing page. Value should be defined as: &#x60;{\&quot;unsubscribe\&quot;: \&quot;Unsubscribe\&quot;}&#x60;
     *
     * @return landingPagePlaceholders
     */
    @JsonProperty("landingPagePlaceholders")
    public String getLandingPagePlaceholders() {
        return landingPagePlaceholders;
    }

    /**
     * Sets landingPagePlaceholders.
     * <p>
     * Field description:
     * Personalize Opt-Out Landing Page by inserting placeholders. Insert placeholder or tag while designing landing page. Value should be defined as: &#x60;{\&quot;unsubscribe\&quot;: \&quot;Unsubscribe\&quot;}&#x60;
     *
     * @param landingPagePlaceholders
     */
    @JsonProperty("landingPagePlaceholders")
    public void setLandingPagePlaceholders(String landingPagePlaceholders) {
        this.landingPagePlaceholders = landingPagePlaceholders;
    }

    /**
     * Sets optoutLandingPageId.
     * <p>
     * Field description:
     * The Opt-Out Landing Page ID specifies the page to be displayed when an end user clicks the unsubscribe link. If the ID is not provided, the default opt-out landing page will be used. Create a landing page over Infobip web interface and use its ID, for example, &#x60;1_23456.&#x60;
     *
     * @param optoutLandingPageId
     * @return This {@link EmailMessageContent instance}.
     */
    public EmailMessageContent optoutLandingPageId(String optoutLandingPageId) {
        this.optoutLandingPageId = optoutLandingPageId;
        return this;
    }

    /**
     * Returns optoutLandingPageId.
     * <p>
     * Field description:
     * The Opt-Out Landing Page ID specifies the page to be displayed when an end user clicks the unsubscribe link. If the ID is not provided, the default opt-out landing page will be used. Create a landing page over Infobip web interface and use its ID, for example, &#x60;1_23456.&#x60;
     *
     * @return optoutLandingPageId
     */
    @JsonProperty("optoutLandingPageId")
    public String getOptoutLandingPageId() {
        return optoutLandingPageId;
    }

    /**
     * Sets optoutLandingPageId.
     * <p>
     * Field description:
     * The Opt-Out Landing Page ID specifies the page to be displayed when an end user clicks the unsubscribe link. If the ID is not provided, the default opt-out landing page will be used. Create a landing page over Infobip web interface and use its ID, for example, &#x60;1_23456.&#x60;
     *
     * @param optoutLandingPageId
     */
    @JsonProperty("optoutLandingPageId")
    public void setOptoutLandingPageId(String optoutLandingPageId) {
        this.optoutLandingPageId = optoutLandingPageId;
    }

    /**
     * Sets templateLanguageVersion.
     * <p>
     * Field description:
     * Indicates the version of the template language to be used in the current message template. Use version 1 for the older template language and version 2 to access features of the new template language. If not specified, version 1 will be used by default.
     *
     * @param templateLanguageVersion
     * @return This {@link EmailMessageContent instance}.
     */
    public EmailMessageContent templateLanguageVersion(String templateLanguageVersion) {
        this.templateLanguageVersion = templateLanguageVersion;
        return this;
    }

    /**
     * Returns templateLanguageVersion.
     * <p>
     * Field description:
     * Indicates the version of the template language to be used in the current message template. Use version 1 for the older template language and version 2 to access features of the new template language. If not specified, version 1 will be used by default.
     *
     * @return templateLanguageVersion
     */
    @JsonProperty("templateLanguageVersion")
    public String getTemplateLanguageVersion() {
        return templateLanguageVersion;
    }

    /**
     * Sets templateLanguageVersion.
     * <p>
     * Field description:
     * Indicates the version of the template language to be used in the current message template. Use version 1 for the older template language and version 2 to access features of the new template language. If not specified, version 1 will be used by default.
     *
     * @param templateLanguageVersion
     */
    @JsonProperty("templateLanguageVersion")
    public void setTemplateLanguageVersion(String templateLanguageVersion) {
        this.templateLanguageVersion = templateLanguageVersion;
    }

    /**
     * Sets headers.
     * <p>
     * Field description:
     * Additional email headers for customization that can be provided in a form of JSON. Example: &#x60;headers&#x3D;{\&quot;X-CustomHeader\&quot;: \&quot;Header value\&quot;}&#x60;.  There are a few exceptions of headers which are not adjustable through this option: &#x60;To&#x60;, &#x60;Cc&#x60;, &#x60;Bcc&#x60;, &#x60;From&#x60;, &#x60;Subject&#x60;, &#x60;Content-Type&#x60;, &#x60;DKIM-Signature&#x60;, &#x60;Content-Transfer-Encoding&#x60;, &#x60;Return-Path&#x60;, &#x60;MIME-Version&#x60;
     *
     * @param headers
     * @return This {@link EmailMessageContent instance}.
     */
    public EmailMessageContent headers(String headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Returns headers.
     * <p>
     * Field description:
     * Additional email headers for customization that can be provided in a form of JSON. Example: &#x60;headers&#x3D;{\&quot;X-CustomHeader\&quot;: \&quot;Header value\&quot;}&#x60;.  There are a few exceptions of headers which are not adjustable through this option: &#x60;To&#x60;, &#x60;Cc&#x60;, &#x60;Bcc&#x60;, &#x60;From&#x60;, &#x60;Subject&#x60;, &#x60;Content-Type&#x60;, &#x60;DKIM-Signature&#x60;, &#x60;Content-Transfer-Encoding&#x60;, &#x60;Return-Path&#x60;, &#x60;MIME-Version&#x60;
     *
     * @return headers
     */
    @JsonProperty("headers")
    public String getHeaders() {
        return headers;
    }

    /**
     * Sets headers.
     * <p>
     * Field description:
     * Additional email headers for customization that can be provided in a form of JSON. Example: &#x60;headers&#x3D;{\&quot;X-CustomHeader\&quot;: \&quot;Header value\&quot;}&#x60;.  There are a few exceptions of headers which are not adjustable through this option: &#x60;To&#x60;, &#x60;Cc&#x60;, &#x60;Bcc&#x60;, &#x60;From&#x60;, &#x60;Subject&#x60;, &#x60;Content-Type&#x60;, &#x60;DKIM-Signature&#x60;, &#x60;Content-Transfer-Encoding&#x60;, &#x60;Return-Path&#x60;, &#x60;MIME-Version&#x60;
     *
     * @param headers
     */
    @JsonProperty("headers")
    public void setHeaders(String headers) {
        this.headers = headers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailMessageContent emailMessageContent = (EmailMessageContent) o;
        return Objects.equals(this.subject, emailMessageContent.subject)
                && Objects.equals(this.text, emailMessageContent.text)
                && Objects.equals(this.html, emailMessageContent.html)
                && Objects.equals(this.ampHtml, emailMessageContent.ampHtml)
                && Objects.equals(this.templateId, emailMessageContent.templateId)
                && Objects.equals(this.attachments, emailMessageContent.attachments)
                && Objects.equals(this.inlineImages, emailMessageContent.inlineImages)
                && Objects.equals(this.defaultPlaceholders, emailMessageContent.defaultPlaceholders)
                && Objects.equals(this.landingPagePlaceholders, emailMessageContent.landingPagePlaceholders)
                && Objects.equals(this.optoutLandingPageId, emailMessageContent.optoutLandingPageId)
                && Objects.equals(this.templateLanguageVersion, emailMessageContent.templateLanguageVersion)
                && Objects.equals(this.headers, emailMessageContent.headers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                subject,
                text,
                html,
                ampHtml,
                templateId,
                attachments,
                inlineImages,
                defaultPlaceholders,
                landingPagePlaceholders,
                optoutLandingPageId,
                templateLanguageVersion,
                headers);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailMessageContent {")
                .append(newLine)
                .append("    subject: ")
                .append(toIndentedString(subject))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    html: ")
                .append(toIndentedString(html))
                .append(newLine)
                .append("    ampHtml: ")
                .append(toIndentedString(ampHtml))
                .append(newLine)
                .append("    templateId: ")
                .append(toIndentedString(templateId))
                .append(newLine)
                .append("    attachments: ")
                .append(toIndentedString(attachments))
                .append(newLine)
                .append("    inlineImages: ")
                .append(toIndentedString(inlineImages))
                .append(newLine)
                .append("    defaultPlaceholders: ")
                .append(toIndentedString(defaultPlaceholders))
                .append(newLine)
                .append("    landingPagePlaceholders: ")
                .append(toIndentedString(landingPagePlaceholders))
                .append(newLine)
                .append("    optoutLandingPageId: ")
                .append(toIndentedString(optoutLandingPageId))
                .append(newLine)
                .append("    templateLanguageVersion: ")
                .append(toIndentedString(templateLanguageVersion))
                .append(newLine)
                .append("    headers: ")
                .append(toIndentedString(headers))
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
