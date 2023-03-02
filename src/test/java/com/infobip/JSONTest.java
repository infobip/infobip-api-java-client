/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip;

import static org.assertj.core.api.BDDAssertions.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Objects;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class JSONTest {

    private static final long EXPECTED_TIMESTAMP = 2071051722777L;

    private final JSON json = new JSON();

    @Test
    void shouldNotSerializeNullValues() {
        // given
        TestClass testClass = new TestClass();
        testClass.setMessage("Some text.");

        // when
        String serializationResult = json.serialize(testClass);

        // then
        then(serializationResult).isEqualTo("{\"message\":\"Some text.\"}");
    }

    @Test
    void shouldNotFailWhenEncounteringUnknownProperties() {
        // given
        String givenInput = "{\"message\":\"Some text.\",\"unknown\":\"unknown\"}";

        // when
        TestClass deserializationResult = json.deserialize(givenInput, TestClass.class);

        // then
        TestClass expectedResult = new TestClass();
        expectedResult.setMessage("Some text.");
        then(deserializationResult).isEqualTo(expectedResult);
    }

    @Test
    void shouldThrowJsonExceptionIfStringDeserializationFails() {
        // given
        String givenMalformedInput = "{\"message\":\"Some text.\",";

        // when, then
        thenExceptionOfType(JSONException.class)
                .isThrownBy(() -> json.deserialize(givenMalformedInput, TestClass.class))
                .withCauseInstanceOf(JsonProcessingException.class);
    }

    @Test
    void shouldThrowJsonExceptionIfStreamDeserializationFails() {
        // given
        String givenMalformedInput = "{\"message\":\"Some text.\",";
        InputStream inputStream = new ByteArrayInputStream(givenMalformedInput.getBytes(StandardCharsets.UTF_8));

        // when, then
        thenExceptionOfType(JSONException.class)
                .isThrownBy(() -> json.deserialize(inputStream, TestClass.class))
                .withCauseInstanceOf(JsonProcessingException.class);
    }

    @Test
    void shouldDeserializeJsonString() {
        // given
        String givenMessage = "Some text.";
        String givenJson = String.format("{\"message\":\"%s\"}", givenMessage);

        // when
        TestClass deserializationResult = json.deserialize(givenJson, TestClass.class);

        // then
        TestClass expectedResult = new TestClass();
        expectedResult.setMessage(givenMessage);
        then(deserializationResult).isEqualTo(expectedResult);
    }

    @Test
    void shouldDeserializeJsonStream() {
        // given
        String givenMessage = "Some text.";
        String givenJson = String.format("{\"message\":\"%s\"}", givenMessage);
        InputStream givenStream = new ByteArrayInputStream(givenJson.getBytes(StandardCharsets.UTF_8));

        // when
        TestClass deserializationResult = json.deserialize(givenStream, TestClass.class);

        // then
        TestClass expectedResult = new TestClass();
        expectedResult.setMessage(givenMessage);
        then(deserializationResult).isEqualTo(expectedResult);
    }

    @ParameterizedTest
    @MethodSource("offsetDateTimeSerializationSource")
    void shouldProvideDateTimeFormatterUsingOfficialPattern(OffsetDateTime givenDate, String expectedDateString) {
        // when
        String formattedDateTime = json.dateTimeFormatter().format(givenDate);

        // then
        then(formattedDateTime).isEqualTo(expectedDateString);
    }

    @ParameterizedTest
    @MethodSource("supportedDateTimeFormatsSource")
    void shouldSupportSpecifiedDateFormatsInJsonDateTimeDeserialization(
            String givenDateString, ZoneOffset expectedZoneOffset) {
        // given
        String jsonDateTimeContainer = String.format("{\"dateTime\":\"%s\"}", givenDateString);

        // when
        TestClass offsetDateTimeContainer = json.deserialize(jsonDateTimeContainer, TestClass.class);

        // then
        OffsetDateTime offsetDateTime = offsetDateTimeContainer.getDateTime();
        then(offsetDateTime.toInstant().toEpochMilli()).isEqualTo(EXPECTED_TIMESTAMP);
        then(offsetDateTime.getOffset()).isEqualTo(expectedZoneOffset);
    }

    @ParameterizedTest
    @MethodSource("supportedDateTimeFormatsSource")
    void shouldSupportSpecifiedDateFormatsInJsonDateTimeStreamDeserialization(
            String givenDateString, ZoneOffset expectedZoneOffset) {
        // given
        InputStream jsonDateTimeContainer = new ByteArrayInputStream(
                String.format("{\"dateTime\":\"%s\"}", givenDateString).getBytes(StandardCharsets.UTF_8));

        // when
        TestClass offsetDateTimeContainer = json.deserialize(jsonDateTimeContainer, TestClass.class);

        // then
        OffsetDateTime offsetDateTime = offsetDateTimeContainer.getDateTime();
        then(offsetDateTime.toInstant().toEpochMilli()).isEqualTo(EXPECTED_TIMESTAMP);
        then(offsetDateTime.getOffset()).isEqualTo(expectedZoneOffset);
    }

    @ParameterizedTest
    @MethodSource("offsetDateTimeSerializationSource")
    void shouldWriteDesiredDateFormatInJsonDateTimeSerialization(OffsetDateTime givenDate, String expectedDateString) {
        // given
        TestClass givenOffsetDateTimeContainer = new TestClass();
        givenOffsetDateTimeContainer.setDateTime(givenDate);

        // when
        String resultingJson = json.serialize(givenOffsetDateTimeContainer);

        // then
        String expectedJson = String.format("{\"dateTime\":\"%s\"}", expectedDateString);
        then(resultingJson).isEqualTo(expectedJson);
    }

    @Test
    void shouldCloseTheInputStreamWhenDeserializing(@TempDir File tempDir) throws IOException {
        // given
        String givenText = "{\"message\":\"Some text.\"}";
        File fileToBeReadTwice = new File(tempDir, "temp.txt");
        Files.writeString(fileToBeReadTwice.toPath(), givenText);
        InputStream givenInputStream = new FileInputStream(fileToBeReadTwice);

        // when, then
        json.deserialize(givenInputStream, TestClass.class);
        thenIOException().isThrownBy(givenInputStream::read).withMessage("Stream Closed");
    }

    private static Stream<Arguments> supportedDateTimeFormatsSource() {
        return Stream.of(
                Arguments.of("2035-08-18T12:08:42.777Z", ZoneOffset.UTC),
                Arguments.of("2035-08-18T12:08:42.777+0000", ZoneOffset.UTC),
                Arguments.of("2035-08-18T13:08:42.777+0100", ZoneOffset.of("+01:00")),
                Arguments.of("2035-08-18T11:08:42.777-0100", ZoneOffset.of("-01:00")),
                Arguments.of("2035-08-18T17:08:42.777+0500", ZoneOffset.of("+05:00")),
                Arguments.of("2035-08-18T07:08:42.777-0500", ZoneOffset.of("-05:00")),
                Arguments.of("2035-08-18T13:38:42.777+0130", ZoneOffset.of("+01:30")),
                Arguments.of("2035-08-18T10:38:42.777-0130", ZoneOffset.of("-01:30")),
                Arguments.of("2035-08-18T17:38:42.777+0530", ZoneOffset.of("+05:30")),
                Arguments.of("2035-08-18T06:38:42.777-0530", ZoneOffset.of("-05:30")),
                Arguments.of("2035-08-18T12:08:42.777+00:00", ZoneOffset.UTC),
                Arguments.of("2035-08-18T13:08:42.777+01:00", ZoneOffset.of("+01:00")),
                Arguments.of("2035-08-18T11:08:42.777-01:00", ZoneOffset.of("-01:00")),
                Arguments.of("2035-08-18T17:08:42.777+05:00", ZoneOffset.of("+05:00")),
                Arguments.of("2035-08-18T07:08:42.777-05:00", ZoneOffset.of("-05:00")),
                Arguments.of("2035-08-18T13:38:42.777+01:30", ZoneOffset.of("+01:30")),
                Arguments.of("2035-08-18T10:38:42.777-01:30", ZoneOffset.of("-01:30")),
                Arguments.of("2035-08-18T17:38:42.777+05:30", ZoneOffset.of("+05:30")),
                Arguments.of("2035-08-18T06:38:42.777-05:30", ZoneOffset.of("-05:30")));
    }

    private static Stream<Arguments> offsetDateTimeSerializationSource() {
        return Stream.of(
                Arguments.of(
                        OffsetDateTime.of(2035, 8, 18, 12, 8, 42, 0, ZoneOffset.UTC), "2035-08-18T12:08:42.000+0000"),
                Arguments.of(
                        OffsetDateTime.of(2035, 8, 18, 13, 8, 42, 0, ZoneOffset.of("+0100")),
                        "2035-08-18T13:08:42.000+0100"));
    }

    private static class TestClass {

        private String message;
        private OffsetDateTime dateTime;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public OffsetDateTime getDateTime() {
            return dateTime;
        }

        public void setDateTime(OffsetDateTime dateTime) {
            this.dateTime = dateTime;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TestClass testClass = (TestClass) o;
            return Objects.equals(message, testClass.message) && Objects.equals(dateTime, testClass.dateTime);
        }

        @Override
        public int hashCode() {
            return Objects.hash(message, dateTime);
        }

        @Override
        public String toString() {
            return "TestClass{" + "message='" + message + '\'' + ", dateTime=" + dateTime + '}';
        }
    }
}
