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
 * Fields representing details about IVR, if outbound IVR is being used. If the call was not IVR, the field will be null.
 */
public class CallsIvrData {

    private String scenarioId;

    private String scenarioName;

    private String collectedDtmfs;

    private String collectedMappedDtmfs;

    private String spokenInput;

    private String matchedSpokenInput;

    /**
     * Sets scenarioId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the IVR scenario.
     *
     * @param scenarioId
     * @return This {@link CallsIvrData instance}.
     */
    public CallsIvrData scenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
        return this;
    }

    /**
     * Returns scenarioId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the IVR scenario.
     *
     * @return scenarioId
     */
    @JsonProperty("scenarioId")
    public String getScenarioId() {
        return scenarioId;
    }

    /**
     * Sets scenarioId.
     * <p>
     * Field description:
     * The ID that uniquely identifies the IVR scenario.
     *
     * @param scenarioId
     */
    @JsonProperty("scenarioId")
    public void setScenarioId(String scenarioId) {
        this.scenarioId = scenarioId;
    }

    /**
     * Sets scenarioName.
     * <p>
     * Field description:
     * Name of IVR scenario.
     *
     * @param scenarioName
     * @return This {@link CallsIvrData instance}.
     */
    public CallsIvrData scenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
        return this;
    }

    /**
     * Returns scenarioName.
     * <p>
     * Field description:
     * Name of IVR scenario.
     *
     * @return scenarioName
     */
    @JsonProperty("scenarioName")
    public String getScenarioName() {
        return scenarioName;
    }

    /**
     * Sets scenarioName.
     * <p>
     * Field description:
     * Name of IVR scenario.
     *
     * @param scenarioName
     */
    @JsonProperty("scenarioName")
    public void setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
    }

    /**
     * Sets collectedDtmfs.
     * <p>
     * Field description:
     * JSON object showing the result of every CollectAction in IVR scenario in the form of key/value pairs, where the key is CollectAction variable and pair is collected DTMF.
     *
     * @param collectedDtmfs
     * @return This {@link CallsIvrData instance}.
     */
    public CallsIvrData collectedDtmfs(String collectedDtmfs) {
        this.collectedDtmfs = collectedDtmfs;
        return this;
    }

    /**
     * Returns collectedDtmfs.
     * <p>
     * Field description:
     * JSON object showing the result of every CollectAction in IVR scenario in the form of key/value pairs, where the key is CollectAction variable and pair is collected DTMF.
     *
     * @return collectedDtmfs
     */
    @JsonProperty("collectedDtmfs")
    public String getCollectedDtmfs() {
        return collectedDtmfs;
    }

    /**
     * Sets collectedDtmfs.
     * <p>
     * Field description:
     * JSON object showing the result of every CollectAction in IVR scenario in the form of key/value pairs, where the key is CollectAction variable and pair is collected DTMF.
     *
     * @param collectedDtmfs
     */
    @JsonProperty("collectedDtmfs")
    public void setCollectedDtmfs(String collectedDtmfs) {
        this.collectedDtmfs = collectedDtmfs;
    }

    /**
     * Sets collectedMappedDtmfs.
     * <p>
     * Field description:
     * JSON object showing the result of every CollectAction in IVR scenario with the mapped, meaningful, values you defined in CollectAction &#x60;mappedValues&#x60; option.
     *
     * @param collectedMappedDtmfs
     * @return This {@link CallsIvrData instance}.
     */
    public CallsIvrData collectedMappedDtmfs(String collectedMappedDtmfs) {
        this.collectedMappedDtmfs = collectedMappedDtmfs;
        return this;
    }

    /**
     * Returns collectedMappedDtmfs.
     * <p>
     * Field description:
     * JSON object showing the result of every CollectAction in IVR scenario with the mapped, meaningful, values you defined in CollectAction &#x60;mappedValues&#x60; option.
     *
     * @return collectedMappedDtmfs
     */
    @JsonProperty("collectedMappedDtmfs")
    public String getCollectedMappedDtmfs() {
        return collectedMappedDtmfs;
    }

    /**
     * Sets collectedMappedDtmfs.
     * <p>
     * Field description:
     * JSON object showing the result of every CollectAction in IVR scenario with the mapped, meaningful, values you defined in CollectAction &#x60;mappedValues&#x60; option.
     *
     * @param collectedMappedDtmfs
     */
    @JsonProperty("collectedMappedDtmfs")
    public void setCollectedMappedDtmfs(String collectedMappedDtmfs) {
        this.collectedMappedDtmfs = collectedMappedDtmfs;
    }

    /**
     * Sets spokenInput.
     * <p>
     * Field description:
     * JSON object showing the result of every CaptureSpeech action with full text spoken by the user.
     *
     * @param spokenInput
     * @return This {@link CallsIvrData instance}.
     */
    public CallsIvrData spokenInput(String spokenInput) {
        this.spokenInput = spokenInput;
        return this;
    }

    /**
     * Returns spokenInput.
     * <p>
     * Field description:
     * JSON object showing the result of every CaptureSpeech action with full text spoken by the user.
     *
     * @return spokenInput
     */
    @JsonProperty("spokenInput")
    public String getSpokenInput() {
        return spokenInput;
    }

    /**
     * Sets spokenInput.
     * <p>
     * Field description:
     * JSON object showing the result of every CaptureSpeech action with full text spoken by the user.
     *
     * @param spokenInput
     */
    @JsonProperty("spokenInput")
    public void setSpokenInput(String spokenInput) {
        this.spokenInput = spokenInput;
    }

    /**
     * Sets matchedSpokenInput.
     * <p>
     * Field description:
     * JSON object showing the result of every CaptureSpeech action with only the key phrases that matched user spoken input.
     *
     * @param matchedSpokenInput
     * @return This {@link CallsIvrData instance}.
     */
    public CallsIvrData matchedSpokenInput(String matchedSpokenInput) {
        this.matchedSpokenInput = matchedSpokenInput;
        return this;
    }

    /**
     * Returns matchedSpokenInput.
     * <p>
     * Field description:
     * JSON object showing the result of every CaptureSpeech action with only the key phrases that matched user spoken input.
     *
     * @return matchedSpokenInput
     */
    @JsonProperty("matchedSpokenInput")
    public String getMatchedSpokenInput() {
        return matchedSpokenInput;
    }

    /**
     * Sets matchedSpokenInput.
     * <p>
     * Field description:
     * JSON object showing the result of every CaptureSpeech action with only the key phrases that matched user spoken input.
     *
     * @param matchedSpokenInput
     */
    @JsonProperty("matchedSpokenInput")
    public void setMatchedSpokenInput(String matchedSpokenInput) {
        this.matchedSpokenInput = matchedSpokenInput;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsIvrData callsIvrData = (CallsIvrData) o;
        return Objects.equals(this.scenarioId, callsIvrData.scenarioId)
                && Objects.equals(this.scenarioName, callsIvrData.scenarioName)
                && Objects.equals(this.collectedDtmfs, callsIvrData.collectedDtmfs)
                && Objects.equals(this.collectedMappedDtmfs, callsIvrData.collectedMappedDtmfs)
                && Objects.equals(this.spokenInput, callsIvrData.spokenInput)
                && Objects.equals(this.matchedSpokenInput, callsIvrData.matchedSpokenInput);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                scenarioId, scenarioName, collectedDtmfs, collectedMappedDtmfs, spokenInput, matchedSpokenInput);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsIvrData {")
                .append(newLine)
                .append("    scenarioId: ")
                .append(toIndentedString(scenarioId))
                .append(newLine)
                .append("    scenarioName: ")
                .append(toIndentedString(scenarioName))
                .append(newLine)
                .append("    collectedDtmfs: ")
                .append(toIndentedString(collectedDtmfs))
                .append(newLine)
                .append("    collectedMappedDtmfs: ")
                .append(toIndentedString(collectedMappedDtmfs))
                .append(newLine)
                .append("    spokenInput: ")
                .append(toIndentedString(spokenInput))
                .append(newLine)
                .append("    matchedSpokenInput: ")
                .append(toIndentedString(matchedSpokenInput))
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
