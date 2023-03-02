/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip;

import java.time.Clock;
import java.time.DateTimeException;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Objects;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The utility class that checks the {@link Response} and performs actions based on the API endpoint deprecation status.
 * The deprecation status is determined using <code>Deprecation</code> and <code>Sunset</code> headers that are provided
 * by the Infobip API in the case of deprecation.
 */
final class DeprecationChecker {

    private static final ZoneOffset HEADER_TIMEZONE = ZoneOffset.UTC;
    private static final ZoneOffset OUTPUT_TIMEZONE = ZoneOffset.UTC;
    private static final DateTimeFormatter HEADER_DATE_FORMATTER =
            DateTimeFormatter.RFC_1123_DATE_TIME.withZone(HEADER_TIMEZONE);

    private static final String DEPRECATION_HEADER = "Deprecation";
    private static final String SUNSET_HEADER = "Sunset";

    private final Clock clock;

    /**
     * Constructs a new {@link DeprecationChecker} instance. Accepts a {@link Clock} instance that will be used for
     * determining the current time.
     *
     * @param clock The {@link Clock} instance used for determining the current time.
     */
    public DeprecationChecker(Clock clock) {
        this.clock = clock;
    }

    /**
     * Checks the response and logs a deprecation notice to the provided logging facility if needed.
     * <p>
     * The deprecation state is calculated using <code>Deprecation</code> and <code>Sunset</code> header values
     * which are provided by Infobip API in the case of deprecation. The logger facility is accessed through the
     * {@link Logger} facade.
     *
     * @param response The {@link Response} instance representing the Infobip API response.
     */
    void notice(Response response) {
        Objects.requireNonNull(response);

        String sunsetHeader = response.header(SUNSET_HEADER);
        String deprecationHeader = response.header(DEPRECATION_HEADER);
        if (sunsetHeader == null && deprecationHeader == null) {
            return;
        }

        DeprecationNoticeLogger noticeLogger = DeprecationNoticeLogger.forRequest(response.request());

        TemporalAccessor sunsetDate = tryToParseDateFromHeader(sunsetHeader);
        if (sunsetDate != null) {
            OffsetDateTime now = OffsetDateTime.now(clock);
            if (OffsetDateTime.from(sunsetDate).isBefore(now)) {
                noticeLogger.gone(sunsetDate);
                return;
            }
            noticeLogger.deprecated(sunsetDate);
            return;
        }

        if (deprecationHeader != null) {
            noticeLogger.deprecated();
        }
    }

    private static TemporalAccessor tryToParseDateFromHeader(String headerThatShouldRepresentDate) {
        if (headerThatShouldRepresentDate == null) {
            return null;
        }
        try {
            return HEADER_DATE_FORMATTER.parse(headerThatShouldRepresentDate);
        } catch (DateTimeException ignored) {
            return null;
        }
    }

    private static final class DeprecationNoticeLogger {

        private static final Logger LOGGER = LoggerFactory.getLogger(DeprecationNoticeLogger.class);
        private static final DateTimeFormatter SUNSET_DATE_FORMATTER =
                DateTimeFormatter.ISO_LOCAL_DATE.withZone(OUTPUT_TIMEZONE);
        private static final String SUPPORT_EMAIL = "support@infobip.com";

        private final String deprecatedEndpointMethod;
        private final String deprecatedMethodPath;

        private DeprecationNoticeLogger(String deprecatedEndpointMethod, String deprecatedMethodPath) {
            this.deprecatedEndpointMethod = deprecatedEndpointMethod;
            this.deprecatedMethodPath = deprecatedMethodPath;
        }

        private static DeprecationNoticeLogger forRequest(Request request) {
            Objects.requireNonNull(request);
            return new DeprecationNoticeLogger(request.method(), request.url().encodedPath());
        }

        void gone(TemporalAccessor sunsetDate) {
            LOGGER.warn(
                    "As of {} UTC, the endpoint {} {} has been discontinued. "
                            + "To continue using our services, please update the library or contact {}.",
                    SUNSET_DATE_FORMATTER.format(sunsetDate),
                    deprecatedEndpointMethod,
                    deprecatedMethodPath,
                    SUPPORT_EMAIL);
        }

        void deprecated(TemporalAccessor sunsetDate) {
            LOGGER.warn(
                    "As of {} UTC, the endpoint {} {} will no longer be available. "
                            + "To avoid disruption, kindly update the library or reach out to {}.",
                    SUNSET_DATE_FORMATTER.format(sunsetDate),
                    deprecatedEndpointMethod,
                    deprecatedMethodPath,
                    SUPPORT_EMAIL);
        }

        void deprecated() {
            LOGGER.warn(
                    "The endpoint {} {} is deprecated. "
                            + "Please consider updating the library or reaching out to {} for assistance.",
                    deprecatedEndpointMethod,
                    deprecatedMethodPath,
                    SUPPORT_EMAIL);
        }
    }
}
