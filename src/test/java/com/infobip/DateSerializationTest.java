package com.infobip;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Objects;
import java.util.stream.Stream;

import static org.assertj.core.api.BDDAssertions.then;

public class DateSerializationTest {

    private static final long EXPECTED_TIMESTAMP = 2071051722777L;

    private final JSON json = new JSON();

    @ParameterizedTest
    @MethodSource("supportedDateFormatsSource")
    void shouldSupportSpecifiedDateFormatsInJsonDateDeserialization(String givenDateString) {
        // given
        String jsonDateContainer = jsonDateContainer(givenDateString);

        // when
        DateContainer dateContainer = json.deserialize(jsonDateContainer, DateContainer.class);

        // then
        then(dateContainer.getDate().toInstant().toEpochMilli()).isEqualTo(EXPECTED_TIMESTAMP);
    }

    private static Stream<String> supportedDateFormatsSource() {
        return Stream.of(
                "2035-08-18T12:08:42.777Z",
                "2035-08-18T12:08:42.777+0000",
                "2035-08-18T13:08:42.777+0100",
                "2035-08-18T11:08:42.777-0100",
                "2035-08-18T17:08:42.777+0500",
                "2035-08-18T07:08:42.777-0500",
                "2035-08-18T13:38:42.777+0130",
                "2035-08-18T10:38:42.777-0130",
                "2035-08-18T17:38:42.777+0530",
                "2035-08-18T06:38:42.777-0530",
                "2035-08-18T12:08:42.777+00:00",
                "2035-08-18T13:08:42.777+01:00",
                "2035-08-18T11:08:42.777-01:00",
                "2035-08-18T17:08:42.777+05:00",
                "2035-08-18T07:08:42.777-05:00",
                "2035-08-18T13:38:42.777+01:30",
                "2035-08-18T10:38:42.777-01:30",
                "2035-08-18T17:38:42.777+05:30",
                "2035-08-18T06:38:42.777-05:30"
        );
    }

    @ParameterizedTest
    @MethodSource("jsonDateSerializationSource")
    void shouldWriteDesiredDateFormatInJsonDateSerialization(OffsetDateTime givenDate, String expectedDateString) {
        // given
        DateContainer givenDateContainer = new DateContainer();
        givenDateContainer.setDate(givenDate);

        // when
        String resultingJson = json.serialize(givenDateContainer);

        // then
        String expectedJson = jsonDateContainer(expectedDateString);
        then(resultingJson).isEqualTo(expectedJson);
    }

    private static Stream<Arguments> jsonDateSerializationSource() {
        return Stream.of(
                Arguments.of(
                        OffsetDateTime.of(2020, 4, 26, 15, 24, 10, 0, ZoneOffset.UTC),
                        "2020-04-26T15:24:10.000+0000"
                ),
                Arguments.of(
                        OffsetDateTime.of(2020, 4, 26, 17, 24, 10, 0, ZoneOffset.of("+0100")),
                        "2020-04-26T17:24:10.000+0100"
                )
        );
    }

    private static final class DateContainer {

        private OffsetDateTime date;

        public OffsetDateTime getDate() {
            return date;
        }

        public void setDate(OffsetDateTime date) {
            this.date = date;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            DateContainer that = (DateContainer) o;
            return Objects.equals(date, that.date);
        }

        @Override
        public int hashCode() {
            return Objects.hash(date);
        }

        @Override
        public String toString() {
            return "DateContainer{date=" + date + "}";
        }
    }

    private static String jsonDateContainer(String dateString) {
        return String.format("{\"date\":\"%s\"}", dateString);
    }
}
