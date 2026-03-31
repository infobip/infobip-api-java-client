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
 * Voice setup configuration.
 */
public class NumbersVoiceSetup {

    private String applicationId;

    private String entityId;

    private NumbersVoiceActionDetails action;

    /**
     * Sets applicationId.
     * <p>
     * Field description:
     * ID of the Application that would be associated with the voice setup.
     *
     * @param applicationId
     * @return This {@link NumbersVoiceSetup instance}.
     */
    public NumbersVoiceSetup applicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns applicationId.
     * <p>
     * Field description:
     * ID of the Application that would be associated with the voice setup.
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
     * ID of the Application that would be associated with the voice setup.
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
     * ID of the Entity that would be associated with the voice setup.
     *
     * @param entityId
     * @return This {@link NumbersVoiceSetup instance}.
     */
    public NumbersVoiceSetup entityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Returns entityId.
     * <p>
     * Field description:
     * ID of the Entity that would be associated with the voice setup.
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
     * ID of the Entity that would be associated with the voice setup.
     *
     * @param entityId
     */
    @JsonProperty("entityId")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    /**
     * Sets action.
     * <p>
     * The field is required.
     *
     * @param action
     * @return This {@link NumbersVoiceSetup instance}.
     */
    public NumbersVoiceSetup action(NumbersVoiceActionDetails action) {
        this.action = action;
        return this;
    }

    /**
     * Returns action.
     * <p>
     * The field is required.
     *
     * @return action
     */
    @JsonProperty("action")
    public NumbersVoiceActionDetails getAction() {
        return action;
    }

    /**
     * Sets action.
     * <p>
     * The field is required.
     *
     * @param action
     */
    @JsonProperty("action")
    public void setAction(NumbersVoiceActionDetails action) {
        this.action = action;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NumbersVoiceSetup numbersVoiceSetup = (NumbersVoiceSetup) o;
        return Objects.equals(this.applicationId, numbersVoiceSetup.applicationId)
                && Objects.equals(this.entityId, numbersVoiceSetup.entityId)
                && Objects.equals(this.action, numbersVoiceSetup.action);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationId, entityId, action);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class NumbersVoiceSetup {")
                .append(newLine)
                .append("    applicationId: ")
                .append(toIndentedString(applicationId))
                .append(newLine)
                .append("    entityId: ")
                .append(toIndentedString(entityId))
                .append(newLine)
                .append("    action: ")
                .append(toIndentedString(action))
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
