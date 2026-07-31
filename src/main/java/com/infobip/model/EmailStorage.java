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
 * [Email storage options](https://www.infobip.com/docs/email/email-storage-and-retrieval) per message.
 */
public class EmailStorage {

    private Boolean skipPassive;

    private Boolean skipActive;

    /**
     * Sets skipPassive.
     * <p>
     * Field description:
     * Set to true to skip [passive email storage](https://www.infobip.com/docs/email/email-storage-and-retrieval/passive-email-storage) (long-term storage used for compliance, legal, or audit purposes).             If &#x60;false&#x60; or not set, the account-level setting is used.
     *
     * @param skipPassive
     * @return This {@link EmailStorage instance}.
     */
    public EmailStorage skipPassive(Boolean skipPassive) {
        this.skipPassive = skipPassive;
        return this;
    }

    /**
     * Returns skipPassive.
     * <p>
     * Field description:
     * Set to true to skip [passive email storage](https://www.infobip.com/docs/email/email-storage-and-retrieval/passive-email-storage) (long-term storage used for compliance, legal, or audit purposes).             If &#x60;false&#x60; or not set, the account-level setting is used.
     *
     * @return skipPassive
     */
    @JsonProperty("skipPassive")
    public Boolean getSkipPassive() {
        return skipPassive;
    }

    /**
     * Sets skipPassive.
     * <p>
     * Field description:
     * Set to true to skip [passive email storage](https://www.infobip.com/docs/email/email-storage-and-retrieval/passive-email-storage) (long-term storage used for compliance, legal, or audit purposes).             If &#x60;false&#x60; or not set, the account-level setting is used.
     *
     * @param skipPassive
     */
    @JsonProperty("skipPassive")
    public void setSkipPassive(Boolean skipPassive) {
        this.skipPassive = skipPassive;
    }

    /**
     * Sets skipActive.
     * <p>
     * Field description:
     * Set to true to skip [active email storage](https://www.infobip.com/docs/email/email-storage-and-retrieval/active-email-storage) (short-term storage used for troubleshooting or support).             If &#x60;false&#x60; or not set, the account-level setting is used.
     *
     * @param skipActive
     * @return This {@link EmailStorage instance}.
     */
    public EmailStorage skipActive(Boolean skipActive) {
        this.skipActive = skipActive;
        return this;
    }

    /**
     * Returns skipActive.
     * <p>
     * Field description:
     * Set to true to skip [active email storage](https://www.infobip.com/docs/email/email-storage-and-retrieval/active-email-storage) (short-term storage used for troubleshooting or support).             If &#x60;false&#x60; or not set, the account-level setting is used.
     *
     * @return skipActive
     */
    @JsonProperty("skipActive")
    public Boolean getSkipActive() {
        return skipActive;
    }

    /**
     * Sets skipActive.
     * <p>
     * Field description:
     * Set to true to skip [active email storage](https://www.infobip.com/docs/email/email-storage-and-retrieval/active-email-storage) (short-term storage used for troubleshooting or support).             If &#x60;false&#x60; or not set, the account-level setting is used.
     *
     * @param skipActive
     */
    @JsonProperty("skipActive")
    public void setSkipActive(Boolean skipActive) {
        this.skipActive = skipActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmailStorage emailStorage = (EmailStorage) o;
        return Objects.equals(this.skipPassive, emailStorage.skipPassive)
                && Objects.equals(this.skipActive, emailStorage.skipActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skipPassive, skipActive);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class EmailStorage {")
                .append(newLine)
                .append("    skipPassive: ")
                .append(toIndentedString(skipPassive))
                .append(newLine)
                .append("    skipActive: ")
                .append(toIndentedString(skipActive))
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
