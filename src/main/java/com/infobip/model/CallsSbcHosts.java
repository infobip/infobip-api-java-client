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
 * Infobip SBC (Session Border Controller) hosts.
 */
public class CallsSbcHosts {

    private List<String> primary = null;

    private List<String> backup = null;

    /**
     * Sets primary.
     *
     * @param primary
     * @return This {@link CallsSbcHosts instance}.
     */
    public CallsSbcHosts primary(List<String> primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Adds and item into primary.
     *
     * @param primaryItem The item to be added to the list.
     * @return This {@link CallsSbcHosts instance}.
     */
    public CallsSbcHosts addPrimaryItem(String primaryItem) {
        if (this.primary == null) {
            this.primary = new ArrayList<>();
        }
        this.primary.add(primaryItem);
        return this;
    }

    /**
     * Returns primary.
     *
     * @return primary
     */
    @JsonProperty("primary")
    public List<String> getPrimary() {
        return primary;
    }

    /**
     * Sets primary.
     *
     * @param primary
     */
    @JsonProperty("primary")
    public void setPrimary(List<String> primary) {
        this.primary = primary;
    }

    /**
     * Sets backup.
     *
     * @param backup
     * @return This {@link CallsSbcHosts instance}.
     */
    public CallsSbcHosts backup(List<String> backup) {
        this.backup = backup;
        return this;
    }

    /**
     * Adds and item into backup.
     *
     * @param backupItem The item to be added to the list.
     * @return This {@link CallsSbcHosts instance}.
     */
    public CallsSbcHosts addBackupItem(String backupItem) {
        if (this.backup == null) {
            this.backup = new ArrayList<>();
        }
        this.backup.add(backupItem);
        return this;
    }

    /**
     * Returns backup.
     *
     * @return backup
     */
    @JsonProperty("backup")
    public List<String> getBackup() {
        return backup;
    }

    /**
     * Sets backup.
     *
     * @param backup
     */
    @JsonProperty("backup")
    public void setBackup(List<String> backup) {
        this.backup = backup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSbcHosts callsSbcHosts = (CallsSbcHosts) o;
        return Objects.equals(this.primary, callsSbcHosts.primary) && Objects.equals(this.backup, callsSbcHosts.backup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primary, backup);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSbcHosts {")
                .append(newLine)
                .append("    primary: ")
                .append(toIndentedString(primary))
                .append(newLine)
                .append("    backup: ")
                .append(toIndentedString(backup))
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
