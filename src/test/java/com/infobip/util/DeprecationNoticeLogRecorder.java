/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public final class DeprecationNoticeLogRecorder {

    private static final Logger DEPRECATION_NOTICE_LOGGER =
            Logger.getLogger("com.infobip.DeprecationChecker$DeprecationNoticeLogger");

    private DeprecationNoticeLogRecorder() {}

    /**
     * Records all log events logged through the library deprecation checker functionality.
     * when running the given {@link Runnable}.
     * The operation is not thread safe, call it only in test when you're sure that
     * no concurrent logging will happen.
     *
     * @param runnable {@link Runnable} to be run.
     * @return A list of the recorded {@link LogRecord} instances.
     */
    public static List<LogRecord> recordDeprecationNoticeLogs(Runnable runnable) {
        List<LogRecord> logRecords = new ArrayList<>();
        Handler logCaptor = logCaptor(logRecords);

        DEPRECATION_NOTICE_LOGGER.addHandler(logCaptor);
        try {
            runnable.run();
        } finally {
            DEPRECATION_NOTICE_LOGGER.removeHandler(logCaptor);
        }

        return logRecords;
    }

    /**
     * Records all log events logged through the library deprecation checker functionality
     * when calling the given {@link Supplier}.
     * The operation is not thread safe, call it only in test when you're sure that
     * no concurrent logging will happen.
     *
     * @param supplier {@link Supplier} to be called.
     * @param <T>      The result type.
     * @return The {@link ResultWithLogRecords} instance that contains the operation result and recorded log records.
     */
    public static <T> ResultWithLogRecords<T> recordDeprecationNoticeLogs(Supplier<T> supplier) {
        List<LogRecord> logRecords = new ArrayList<>();
        Handler logCaptor = logCaptor(logRecords);

        T result;
        DEPRECATION_NOTICE_LOGGER.addHandler(logCaptor);
        try {
            result = supplier.get();
        } finally {
            DEPRECATION_NOTICE_LOGGER.removeHandler(logCaptor);
        }

        return new ResultWithLogRecords<>(result, logRecords);
    }

    public static final class ResultWithLogRecords<T> {

        private final T result;
        private final List<LogRecord> logRecords;

        private ResultWithLogRecords(T result, List<LogRecord> logRecords) {
            this.result = result;
            this.logRecords = Objects.requireNonNull(logRecords);
        }

        public T result() {
            return result;
        }

        public List<LogRecord> logRecords() {
            return logRecords;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            ResultWithLogRecords<?> that = (ResultWithLogRecords<?>) o;
            return Objects.equals(result, that.result) && logRecords.equals(that.logRecords);
        }

        @Override
        public int hashCode() {
            return Objects.hash(result, logRecords);
        }

        @Override
        public String toString() {
            return "ResultWithLogRecords{" + "result=" + result + ", logRecords=" + logRecords + '}';
        }
    }

    private static Handler logCaptor(List<LogRecord> logRecordsContainer) {
        return new Handler() {
            @Override
            public void publish(LogRecord record) {
                logRecordsContainer.add(record);
            }

            @Override
            public void flush() {
                logRecordsContainer.clear();
            }

            @Override
            public void close() throws SecurityException {}
        };
    }
}
