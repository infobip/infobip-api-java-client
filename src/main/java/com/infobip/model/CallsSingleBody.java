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
 * Represents CallsSingleBody model.
 */
public class CallsSingleBody {

    private String audioFileUrl;

    private String from;

    private String language;

    private String text;

    private String to;

    private CallsVoice voice;

    /**
     * Sets audioFileUrl.
     * <p>
     * Field description:
     * An audio file can be delivered as a voice message to the recipients. An audio file must be uploaded online, so that the existing URL can be available for file download. Size of the audio file must be below 4 MB. Supported formats of the provided file are aac, aiff, m4a, mp2, mp3, mp4 (audio only), ogg, wav and wma. Our platform needs to have permission to make GET and HEAD HTTP requests on the provided URL. Standard http ports (like 80, 8080, etc.) are advised.
     *
     * @param audioFileUrl
     * @return This {@link CallsSingleBody instance}.
     */
    public CallsSingleBody audioFileUrl(String audioFileUrl) {
        this.audioFileUrl = audioFileUrl;
        return this;
    }

    /**
     * Returns audioFileUrl.
     * <p>
     * Field description:
     * An audio file can be delivered as a voice message to the recipients. An audio file must be uploaded online, so that the existing URL can be available for file download. Size of the audio file must be below 4 MB. Supported formats of the provided file are aac, aiff, m4a, mp2, mp3, mp4 (audio only), ogg, wav and wma. Our platform needs to have permission to make GET and HEAD HTTP requests on the provided URL. Standard http ports (like 80, 8080, etc.) are advised.
     *
     * @return audioFileUrl
     */
    @JsonProperty("audioFileUrl")
    public String getAudioFileUrl() {
        return audioFileUrl;
    }

    /**
     * Sets audioFileUrl.
     * <p>
     * Field description:
     * An audio file can be delivered as a voice message to the recipients. An audio file must be uploaded online, so that the existing URL can be available for file download. Size of the audio file must be below 4 MB. Supported formats of the provided file are aac, aiff, m4a, mp2, mp3, mp4 (audio only), ogg, wav and wma. Our platform needs to have permission to make GET and HEAD HTTP requests on the provided URL. Standard http ports (like 80, 8080, etc.) are advised.
     *
     * @param audioFileUrl
     */
    @JsonProperty("audioFileUrl")
    public void setAudioFileUrl(String audioFileUrl) {
        this.audioFileUrl = audioFileUrl;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Numeric sender ID in E.164 standard format (Example: 41793026727). This is caller ID that will be presented to the end user where applicable.
     * <p>
     * The field is required.
     *
     * @param from
     * @return This {@link CallsSingleBody instance}.
     */
    public CallsSingleBody from(String from) {
        this.from = from;
        return this;
    }

    /**
     * Returns from.
     * <p>
     * Field description:
     * Numeric sender ID in E.164 standard format (Example: 41793026727). This is caller ID that will be presented to the end user where applicable.
     * <p>
     * The field is required.
     *
     * @return from
     */
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    /**
     * Sets from.
     * <p>
     * Field description:
     * Numeric sender ID in E.164 standard format (Example: 41793026727). This is caller ID that will be presented to the end user where applicable.
     * <p>
     * The field is required.
     *
     * @param from
     */
    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * Sets language.
     * <p>
     * Field description:
     * If the message is in text format, the language in which the message is written must be defined for correct pronunciation. More about Text-to-speech functionality and supported TTS languages can be found [here](https://www.infobip.com/docs/voice-and-video/outbound-calls#text-to-speech-voice-over-broadcast). If not set, default language is &#x60;English [en]&#x60;. If voice is not set, then default voice for that specific language is used. In the case of English language, the voice is &#x60;[Joanna]&#x60;.
     *
     * @param language
     * @return This {@link CallsSingleBody instance}.
     */
    public CallsSingleBody language(String language) {
        this.language = language;
        return this;
    }

    /**
     * Returns language.
     * <p>
     * Field description:
     * If the message is in text format, the language in which the message is written must be defined for correct pronunciation. More about Text-to-speech functionality and supported TTS languages can be found [here](https://www.infobip.com/docs/voice-and-video/outbound-calls#text-to-speech-voice-over-broadcast). If not set, default language is &#x60;English [en]&#x60;. If voice is not set, then default voice for that specific language is used. In the case of English language, the voice is &#x60;[Joanna]&#x60;.
     *
     * @return language
     */
    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    /**
     * Sets language.
     * <p>
     * Field description:
     * If the message is in text format, the language in which the message is written must be defined for correct pronunciation. More about Text-to-speech functionality and supported TTS languages can be found [here](https://www.infobip.com/docs/voice-and-video/outbound-calls#text-to-speech-voice-over-broadcast). If not set, default language is &#x60;English [en]&#x60;. If voice is not set, then default voice for that specific language is used. In the case of English language, the voice is &#x60;[Joanna]&#x60;.
     *
     * @param language
     */
    @JsonProperty("language")
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Sets text.
     * <p>
     * Field description:
     * Message to be converted to speech and played to subscribers. Message text can be up to 1400 characters long and cannot contain only punctuation.
     *
     * @param text
     * @return This {@link CallsSingleBody instance}.
     */
    public CallsSingleBody text(String text) {
        this.text = text;
        return this;
    }

    /**
     * Returns text.
     * <p>
     * Field description:
     * Message to be converted to speech and played to subscribers. Message text can be up to 1400 characters long and cannot contain only punctuation.
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
     * Message to be converted to speech and played to subscribers. Message text can be up to 1400 characters long and cannot contain only punctuation.
     *
     * @param text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Phone number of the recipient. Phone number must be written in E.164 standard format (Example: 41793026727).
     * <p>
     * The field is required.
     *
     * @param to
     * @return This {@link CallsSingleBody instance}.
     */
    public CallsSingleBody to(String to) {
        this.to = to;
        return this;
    }

    /**
     * Returns to.
     * <p>
     * Field description:
     * Phone number of the recipient. Phone number must be written in E.164 standard format (Example: 41793026727).
     * <p>
     * The field is required.
     *
     * @return to
     */
    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     * <p>
     * Field description:
     * Phone number of the recipient. Phone number must be written in E.164 standard format (Example: 41793026727).
     * <p>
     * The field is required.
     *
     * @param to
     */
    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Sets voice.
     *
     * @param voice
     * @return This {@link CallsSingleBody instance}.
     */
    public CallsSingleBody voice(CallsVoice voice) {
        this.voice = voice;
        return this;
    }

    /**
     * Returns voice.
     *
     * @return voice
     */
    @JsonProperty("voice")
    public CallsVoice getVoice() {
        return voice;
    }

    /**
     * Sets voice.
     *
     * @param voice
     */
    @JsonProperty("voice")
    public void setVoice(CallsVoice voice) {
        this.voice = voice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CallsSingleBody callsSingleBody = (CallsSingleBody) o;
        return Objects.equals(this.audioFileUrl, callsSingleBody.audioFileUrl)
                && Objects.equals(this.from, callsSingleBody.from)
                && Objects.equals(this.language, callsSingleBody.language)
                && Objects.equals(this.text, callsSingleBody.text)
                && Objects.equals(this.to, callsSingleBody.to)
                && Objects.equals(this.voice, callsSingleBody.voice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioFileUrl, from, language, text, to, voice);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return new StringBuilder()
                .append("class CallsSingleBody {")
                .append(newLine)
                .append("    audioFileUrl: ")
                .append(toIndentedString(audioFileUrl))
                .append(newLine)
                .append("    from: ")
                .append(toIndentedString(from))
                .append(newLine)
                .append("    language: ")
                .append(toIndentedString(language))
                .append(newLine)
                .append("    text: ")
                .append(toIndentedString(text))
                .append(newLine)
                .append("    to: ")
                .append(toIndentedString(to))
                .append(newLine)
                .append("    voice: ")
                .append(toIndentedString(voice))
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
