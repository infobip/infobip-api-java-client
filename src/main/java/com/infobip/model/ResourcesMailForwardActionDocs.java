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
 * Represents ResourcesMailForwardActionDocs model.
 */
public class ResourcesMailForwardActionDocs extends ResourcesMoActionDocs {

    private String mail;

    private String description;

    /**
     * Constructs a new {@link ResourcesMailForwardActionDocs} instance.
     */
    public ResourcesMailForwardActionDocs() {
        super("MAIL_FORWARD");
    }

    /**
     * Sets mail.
     * <p>
     * Field description:
     * Specifies e-mail destination.
     * <p>
     * The field is required.
     *
     * @param mail
     * @return This {@link ResourcesMailForwardActionDocs instance}.
     */
    public ResourcesMailForwardActionDocs mail(String mail) {
        this.mail = mail;
        return this;
    }

    /**
     * Returns mail.
     * <p>
     * Field description:
     * Specifies e-mail destination.
     * <p>
     * The field is required.
     *
     * @return mail
     */
    @JsonProperty("mail")
    public String getMail() {
        return mail;
    }

    /**
     * Sets mail.
     * <p>
     * Field description:
     * Specifies e-mail destination.
     * <p>
     * The field is required.
     *
     * @param mail
     */
    @JsonProperty("mail")
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Additional action description.
     *
     * @param description
     * @return This {@link ResourcesMailForwardActionDocs instance}.
     */
    public ResourcesMailForwardActionDocs description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Returns description.
     * <p>
     * Field description:
     * Additional action description.
     *
     * @return description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     * <p>
     * Field description:
     * Additional action description.
     *
     * @param description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourcesMailForwardActionDocs resourcesMailForwardActionDocs = (ResourcesMailForwardActionDocs) o;
        return Objects.equals(this.mail, resourcesMailForwardActionDocs.mail)
                && Objects.equals(this.description, resourcesMailForwardActionDocs.description)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mail, description, super.hashCode());
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class ResourcesMailForwardActionDocs {")
                .append(newLine)
                .append("    ")
                .append(toIndentedString(super.toString()))
                .append(newLine)
                .append("    mail: ")
                .append(toIndentedString(mail))
                .append(newLine)
                .append("    description: ")
                .append(toIndentedString(description))
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
