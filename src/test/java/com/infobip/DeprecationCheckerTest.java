/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip;

import static com.infobip.util.DeprecationNoticeLogRecorder.recordDeprecationNoticeLogs;
import static org.assertj.core.api.AssertionsForClassTypes.tuple;
import static org.assertj.core.api.BDDAssertions.then;
import static org.assertj.core.api.BDDAssertions.thenNullPointerException;

import java.io.IOException;
import java.time.Clock;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeprecationCheckerTest {

    private static final String GIVEN_DEPRECATED_ENDPOINT_PATH = "/deprecated/endpoint";
    private static final String GIVEN_DEPRECATED_ENDPOINT_METHOD = "GET";
    private static final String DEPRECATION_HEADER = "Deprecation";
    private static final String SUNSET_HEADER = "Sunset";
    private static final String SUPPORT_EMAIL = "support@infobip.com";

    private final OkHttpClient client = new OkHttpClient();
    private final MockWebServer server = new MockWebServer();

    private static final Instant NOW =
            OffsetDateTime.parse("2023-02-09T12:00:00+01:00").toInstant();
    private static final String THREE_MONTHS_AGO_RFC1123 = "Wed, 9 Nov 2022 11:00:00 GMT";
    private static final String TWO_MONTHS_AGO_RFC1123 = "Fri, 9 Dec 2022 11:00:00 GMT";
    private static final String TWO_MONTHS_ISO_LOCAL_DATE = "2022-12-09";
    private static final String THREE_MONTHS_FROM_NOW_RFC1123 = "Tue, 9 May 2023 11:00:00 GMT";
    private static final String THREE_MONTHS_FROM_NOW_ISO_LOCAL_DATE = "2023-05-09";
    private static final Clock FIXED_CLOCK = Clock.fixed(NOW, ZoneOffset.ofHours(1));

    @BeforeEach
    void setUpServer() throws IOException {
        server.start();
    }

    @AfterEach
    void shutdownServer() throws IOException {
        server.shutdown();
    }

    @Test
    void shouldThrowNullPointerExceptionIfNullDownloaderIsProvided() {
        // given
        DeprecationChecker deprecationChecker = new DeprecationChecker(FIXED_CLOCK);

        // when, then
        thenNullPointerException().isThrownBy(() -> deprecationChecker.notice(null));
    }

    @Test
    void shouldLogDeprecationIfDeprecationHeaderSetToTrueIsReturned() throws IOException {
        // given
        String givenDeprecationHeaderValue = "true";
        MockResponse mockResponse = new MockResponse().setHeader(DEPRECATION_HEADER, givenDeprecationHeaderValue);
        server.enqueue(mockResponse);

        DeprecationChecker deprecationChecker = new DeprecationChecker(FIXED_CLOCK);

        // when
        Response actualResponse = sendRequestToDeprecatedEndpoint(server);
        List<LogRecord> logRecords = recordDeprecationNoticeLogs(() -> deprecationChecker.notice(actualResponse));

        // then
        String expectedDeprecationNotice = String.format(
                "The endpoint %s %s is deprecated. "
                        + "Please consider updating the library or reaching out to %s for assistance.",
                GIVEN_DEPRECATED_ENDPOINT_METHOD, GIVEN_DEPRECATED_ENDPOINT_PATH, SUPPORT_EMAIL);
        thenDeprecationNoticeIsLogged(logRecords, expectedDeprecationNotice);
        actualResponse.close();
    }

    @Test
    void shouldLogDeprecationIfDeprecationHeaderContainsDeprecationDate() throws IOException {
        // given
        MockResponse mockResponse = new MockResponse().setHeader(DEPRECATION_HEADER, THREE_MONTHS_AGO_RFC1123);
        server.enqueue(mockResponse);

        DeprecationChecker deprecationChecker = new DeprecationChecker(FIXED_CLOCK);

        // when
        Response actualResponse = sendRequestToDeprecatedEndpoint(server);
        List<LogRecord> logRecords = recordDeprecationNoticeLogs(() -> deprecationChecker.notice(actualResponse));

        // then
        String expectedDeprecationNotice = String.format(
                "The endpoint %s %s is deprecated. "
                        + "Please consider updating the library or reaching out to %s for assistance.",
                GIVEN_DEPRECATED_ENDPOINT_METHOD, GIVEN_DEPRECATED_ENDPOINT_PATH, SUPPORT_EMAIL);
        thenDeprecationNoticeIsLogged(logRecords, expectedDeprecationNotice);
        actualResponse.close();
    }

    @Test
    void shouldLogDeprecationEvenIfDeprecationTimestampCanNotBeParsed() throws IOException {
        // given
        MockResponse mockResponse = new MockResponse().setHeader(DEPRECATION_HEADER, "not a valid date");
        server.enqueue(mockResponse);

        DeprecationChecker deprecationChecker = new DeprecationChecker(FIXED_CLOCK);

        // when
        Response actualResponse = sendRequestToDeprecatedEndpoint(server);
        List<LogRecord> logRecords = recordDeprecationNoticeLogs(() -> deprecationChecker.notice(actualResponse));

        // then
        String expectedDeprecationNotice = String.format(
                "The endpoint %s %s is deprecated. "
                        + "Please consider updating the library or reaching out to %s for assistance.",
                GIVEN_DEPRECATED_ENDPOINT_METHOD, GIVEN_DEPRECATED_ENDPOINT_PATH, SUPPORT_EMAIL);
        thenDeprecationNoticeIsLogged(logRecords, expectedDeprecationNotice);
        actualResponse.close();
    }

    @Test
    void shouldLogSunsetDateIfBothDeprecationAndSunsetDatesAreProvided() throws IOException {
        // given
        MockResponse mockResponse = new MockResponse()
                .setHeader(DEPRECATION_HEADER, THREE_MONTHS_AGO_RFC1123)
                .setHeader(SUNSET_HEADER, THREE_MONTHS_FROM_NOW_RFC1123);
        server.enqueue(mockResponse);

        DeprecationChecker deprecationChecker = new DeprecationChecker(FIXED_CLOCK);

        // when
        Response actualResponse = sendRequestToDeprecatedEndpoint(server);
        List<LogRecord> logRecords = recordDeprecationNoticeLogs(() -> deprecationChecker.notice(actualResponse));

        // then
        String expectedDeprecationNotice = String.format(
                "As of %s UTC, the endpoint %s %s will no longer be available. "
                        + "To avoid disruption, kindly update the library or reach out to %s.",
                THREE_MONTHS_FROM_NOW_ISO_LOCAL_DATE,
                GIVEN_DEPRECATED_ENDPOINT_METHOD,
                GIVEN_DEPRECATED_ENDPOINT_PATH,
                SUPPORT_EMAIL);
        thenDeprecationNoticeIsLogged(logRecords, expectedDeprecationNotice);
        actualResponse.close();
    }

    @Test
    void shouldLogDeprecationOnlyIfSunsetDateIsInTheWrongFormat() throws IOException {
        // given
        MockResponse mockResponse = new MockResponse()
                .setHeader(DEPRECATION_HEADER, THREE_MONTHS_AGO_RFC1123)
                .setHeader(SUNSET_HEADER, "not a valid date");
        server.enqueue(mockResponse);

        DeprecationChecker deprecationChecker = new DeprecationChecker(FIXED_CLOCK);

        // when
        Response actualResponse = sendRequestToDeprecatedEndpoint(server);
        List<LogRecord> logRecords = recordDeprecationNoticeLogs(() -> deprecationChecker.notice(actualResponse));

        // then
        String expectedDeprecationNotice = String.format(
                "The endpoint %s %s is deprecated. "
                        + "Please consider updating the library or reaching out to %s for assistance.",
                GIVEN_DEPRECATED_ENDPOINT_METHOD, GIVEN_DEPRECATED_ENDPOINT_PATH, SUPPORT_EMAIL);
        thenDeprecationNoticeIsLogged(logRecords, expectedDeprecationNotice);
        actualResponse.close();
    }

    @Test
    void shouldReportTheEndpointIsDiscontinuedIfSunsetDateIsInThePast() throws IOException {
        // given
        MockResponse mockResponse = new MockResponse()
                .setHeader(DEPRECATION_HEADER, THREE_MONTHS_AGO_RFC1123)
                .setHeader(SUNSET_HEADER, TWO_MONTHS_AGO_RFC1123);
        server.enqueue(mockResponse);

        DeprecationChecker deprecationChecker = new DeprecationChecker(FIXED_CLOCK);

        // when
        Response actualResponse = sendRequestToDeprecatedEndpoint(server);
        List<LogRecord> logRecords = recordDeprecationNoticeLogs(() -> deprecationChecker.notice(actualResponse));

        // then
        String expectedDeprecationNotice = String.format(
                "As of %s UTC, the endpoint %s %s has been discontinued. "
                        + "To continue using our services, please update the library or contact %s.",
                TWO_MONTHS_ISO_LOCAL_DATE,
                GIVEN_DEPRECATED_ENDPOINT_METHOD,
                GIVEN_DEPRECATED_ENDPOINT_PATH,
                SUPPORT_EMAIL);
        thenDeprecationNoticeIsLogged(logRecords, expectedDeprecationNotice);
        actualResponse.close();
    }

    @Test
    void shouldNotWriteDeprecationNoticeIfEndpointIsNotDeprecated() throws IOException {
        // given
        server.enqueue(new MockResponse());

        DeprecationChecker deprecationChecker = new DeprecationChecker(FIXED_CLOCK);

        // when
        Response actualResponse = sendRequestToDeprecatedEndpoint(server);
        List<LogRecord> logRecords = recordDeprecationNoticeLogs(() -> deprecationChecker.notice(actualResponse));

        // then
        then(logRecords).isEmpty();
        actualResponse.close();
    }

    @Test
    void shouldRespectSystemUTCClock() throws IOException {
        // given
        OffsetDateTime futureSunsetDate = OffsetDateTime.now(ZoneOffset.UTC).plus(1, ChronoUnit.MONTHS);
        String givenSunsetDateHeaderValue =
                DateTimeFormatter.RFC_1123_DATE_TIME.withZone(ZoneOffset.UTC).format(futureSunsetDate);

        MockResponse mockResponse = new MockResponse()
                .setHeader(DEPRECATION_HEADER, THREE_MONTHS_FROM_NOW_RFC1123)
                .setHeader(SUNSET_HEADER, givenSunsetDateHeaderValue);
        server.enqueue(mockResponse);

        DeprecationChecker deprecationChecker = new DeprecationChecker(Clock.systemUTC());

        // when
        Response actualResponse = sendRequestToDeprecatedEndpoint(server);
        List<LogRecord> logRecords = recordDeprecationNoticeLogs(() -> deprecationChecker.notice(actualResponse));

        // then
        String expectedDeprecationNoticeEnding = String.format(
                "the endpoint %s %s will no longer be available. "
                        + "To avoid disruption, kindly update the library or reach out to %s.",
                GIVEN_DEPRECATED_ENDPOINT_METHOD, GIVEN_DEPRECATED_ENDPOINT_PATH, SUPPORT_EMAIL);
        then(logRecords)
                .hasSize(1)
                .extracting(LogRecord::getMessage)
                .allMatch(logMessage -> logMessage.endsWith(expectedDeprecationNoticeEnding));
    }

    private Response sendRequestToDeprecatedEndpoint(MockWebServer server) throws IOException {
        Request request = new Request.Builder()
                .url(server.url(GIVEN_DEPRECATED_ENDPOINT_PATH))
                .method(GIVEN_DEPRECATED_ENDPOINT_METHOD, null)
                .build();
        return client.newCall(request).execute();
    }

    private void thenDeprecationNoticeIsLogged(List<LogRecord> logRecords, String expectedDeprecationNotice) {
        then(logRecords)
                .extracting(LogRecord::getLevel, LogRecord::getMessage)
                .containsExactly(tuple(Level.WARNING, expectedDeprecationNotice));
    }
}
