/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;

/**
 * File download utility class.
 */
final class Downloader {

    private static final String DEFAULT_FILE_PREFIX = "infobip-download-";
    private static final Pattern CONTENT_DISPOSITION_FILENAME_PATTERN =
            Pattern.compile("filename=\"([A-Za-z0-9._-]+)\"");

    private final File tempDirectory;

    /**
     * Constructs a new {@link Downloader} instance. System's default temporary directory will be used as a storage
     * for downloaded files.
     */
    Downloader() {
        this.tempDirectory = null;
    }

    /**
     * Constructs a new {@link Downloader} instance with the path of the temporary directory to be used to store
     * downloaded files.
     */
    Downloader(Path tempDirectoryPath) {
        Objects.requireNonNull(tempDirectoryPath, "Provided temp directory path must not be null.");
        File tempDirectory = tempDirectoryPath.toFile();
        if (!tempDirectory.isDirectory()) {
            throw new IllegalArgumentException("Provided temp directory is not an existing directory.");
        }
        if (!tempDirectory.canWrite()) {
            throw new IllegalArgumentException("Provided temp directory is not writable.");
        }
        this.tempDirectory = tempDirectory;
    }

    /**
     * Downloads file from the given response. The response body will be consumed and closed accordingly.
     *
     * @param response The response instance.
     * @return The downloaded file.
     * @throws IOException If reading the response body or writing the resulting file fails.
     * @throws NullPointerException if the response is null.
     */
    File downloadFile(Response response) throws IOException {
        Objects.requireNonNull(response);
        try (response) {
            File file = prepareDownloadFile(response);
            ResponseBody responseBody = response.body();
            if (responseBody != null) {
                try (BufferedSink sink = Okio.buffer(Okio.sink(file))) {
                    try (Source source = responseBody.source()) {
                        sink.writeAll(source);
                    }
                }
            }
            return file;
        }
    }

    /**
     * The path of the temporary directory used to store downloaded files from endpoints
     * with a file response. If not set differently, system's default temporary directory will be used.
     *
     * @return The temporary directory path.
     */
    Path tempDirectoryPath() {
        return Optional.ofNullable(tempDirectory)
                .map(File::toPath)
                .or(() -> Optional.ofNullable(System.getProperty("java.io.tmpdir"))
                        .map(Path::of))
                .orElseThrow(() -> new RuntimeException("Temp directory path cannot be resolved."));
    }

    private File prepareDownloadFile(Response response) throws IOException {
        String filename = Optional.ofNullable(response.header("Content-Disposition"))
                .filter(contentDisposition -> !contentDisposition.isEmpty())
                .map(CONTENT_DISPOSITION_FILENAME_PATTERN::matcher)
                .filter(Matcher::find)
                .map(matcher -> matcher.group(1))
                .orElse(null);

        String prefix = DEFAULT_FILE_PREFIX;
        String suffix = "";

        if (filename != null) {
            int extensionStartPosition = filename.lastIndexOf(".");
            if (extensionStartPosition == -1) {
                prefix = filename + "-";
            } else {
                prefix = filename.substring(0, extensionStartPosition);
                suffix = filename.substring(extensionStartPosition);
            }
        }

        if (tempDirectory == null) {
            return Files.createTempFile(prefix, suffix).toFile();
        }
        return Files.createTempFile(tempDirectory.toPath(), prefix, suffix).toFile();
    }
}
