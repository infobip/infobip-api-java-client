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

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okio.Buffer;
import okio.Okio;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

class DownloaderTest {

    private final OkHttpClient client = new OkHttpClient();

    @Test
    void shouldThrowNullPointerExceptionIfNullTempDirectoryPathIsProvided() {
        // when, then
        thenNullPointerException().isThrownBy(() -> new Downloader(null));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionIfProvidedPathIsNotADirectory(@TempDir File tempDir) {
        // given
        File givenFile = new File(tempDir, "a.txt");

        // when, then
        thenIllegalArgumentException().isThrownBy(() -> new Downloader(givenFile.toPath()));
    }

    @Test
    void shouldThrowNullPointerExceptionIfResponseIsNull() {
        // given
        Downloader downloader = new Downloader();

        // when, then
        thenNullPointerException().isThrownBy(() -> downloader.downloadFile(null));
    }

    @Test
    void shouldReportSystemTempPathIfPathIsNotPassedThroughConstructor() {
        // given
        Downloader downloader = new Downloader();

        // when
        Path tempDirectoryPath = downloader.tempDirectoryPath();

        // then
        String expectedSystemDefaultPath = System.getProperty("java.io.tmpdir");
        then(tempDirectoryPath).isEqualTo(Path.of(expectedSystemDefaultPath));
    }

    @Test
    void shouldReportGivenTempDirectoryPath(@TempDir File tempDir) {
        // given
        Path givenTempDirPath = tempDir.toPath();
        Downloader downloader = new Downloader(givenTempDirPath);

        // when
        Path tempDirectoryPath = downloader.tempDirectoryPath();

        // then
        then(tempDirectoryPath).isEqualTo(givenTempDirPath);
    }

    @Test
    void shouldDownloadFileWhenNameNotDefinedInHeader(@TempDir File tempDir) throws IOException {
        // given
        String givenTextContent = "Hello World!";

        MockWebServer server = new MockWebServer();
        server.enqueue(new MockResponse()
                .addHeader("Content-Type", "text/plain")
                .addHeader("Content-Disposition", "attachment")
                .setBody(givenTextContent));
        server.start();

        Downloader downloader = new Downloader(tempDir.toPath());

        // when
        Response response = sendTestRequest(server);
        File resultFile = downloader.downloadFile(response);

        // then
        then(resultFile).hasNoExtension().hasContent(givenTextContent);
        then(resultFile.getName()).startsWith("infobip-download-");

        server.shutdown();
    }

    @Test
    void shouldDownloadFileWithDefinedNameWhenContentDispositionHeaderIsNotProvided(@TempDir File tempDir)
            throws IOException {
        // given
        String givenTextContent = "Hello World!";

        MockWebServer server = new MockWebServer();
        server.enqueue(
                new MockResponse().setHeader("Content-Type", "text/plain").setBody(givenTextContent));
        server.start();

        Downloader downloader = new Downloader(tempDir.toPath());

        // when
        Response response = sendTestRequest(server);
        File resultFile = downloader.downloadFile(response);

        // then
        then(resultFile).hasNoExtension().hasContent(givenTextContent);
        then(resultFile.getName()).startsWith("infobip-download-");

        server.shutdown();
    }

    @Test
    void shouldDownloadFileWithDefinedNameWhenContentDispositionHeaderIsEmpty(@TempDir File tempDir)
            throws IOException {
        // given
        String givenTextContent = "Hello World!";

        MockWebServer server = new MockWebServer();
        server.enqueue(new MockResponse()
                .setHeader("Content-Type", "text/plain")
                .setHeader("Content-Disposition", "")
                .setBody(givenTextContent));
        server.start();

        Downloader downloader = new Downloader(tempDir.toPath());

        // when
        Response response = sendTestRequest(server);
        File resultFile = downloader.downloadFile(response);

        // then
        then(resultFile).hasNoExtension().hasContent(givenTextContent);
        then(resultFile.getName()).startsWith("infobip-download-");

        server.shutdown();
    }

    @Test
    void shouldDownloadFileWithDefinedNameWhenContentDispositionHeaderDoesNotHaveAnExtension(@TempDir File tempDir)
            throws IOException {
        // given
        String givenTextContent = "Hello World!";
        String givenFileName = "hello";

        MockWebServer server = new MockWebServer();
        server.enqueue(new MockResponse()
                .setHeader("Content-Type", "text/plain")
                .addHeader("Content-Disposition", String.format("attachment; filename=\"%s\"", givenFileName))
                .setBody(givenTextContent));
        server.start();

        Downloader downloader = new Downloader(tempDir.toPath());

        // when
        Response response = sendTestRequest(server);
        File resultFile = downloader.downloadFile(response);

        // then
        then(resultFile).hasNoExtension().hasContent(givenTextContent);
        then(resultFile.getName()).startsWith(givenFileName);

        server.shutdown();
    }

    @Test
    void shouldDownloadTextFile(@TempDir File tempDir) throws IOException {
        // given
        String givenTextContent = "Hello World!";
        String givenFileNamePrefix = "hello";
        String givenFileExtension = "txt";
        String givenContentDispositionFileName = givenFileNamePrefix + "." + givenFileExtension;

        MockWebServer server = new MockWebServer();
        server.enqueue(new MockResponse()
                .addHeader("Content-Type", "text/plain")
                .addHeader(
                        "Content-Disposition",
                        String.format("attachment; filename=\"%s\"", givenContentDispositionFileName))
                .setBody(givenTextContent));
        server.start();

        Downloader downloader = new Downloader(tempDir.toPath());

        // when
        Response response = sendTestRequest(server);
        File resultFile = downloader.downloadFile(response);

        // then
        then(resultFile).hasExtension(givenFileExtension).hasContent(givenTextContent);
        then(resultFile.getName()).startsWith(givenFileNamePrefix);

        server.shutdown();
    }

    @Test
    void shouldDownloadPngFile(@TempDir File tempDir) throws IOException {
        // given
        File icon = new File(DownloaderTest.class.getResource("/icon.png").getFile());
        Buffer iconBinaryContentBuffer = new Buffer();
        iconBinaryContentBuffer.writeAll(Okio.source(icon));
        String givenFileNamePrefix = "icon";
        String givenFileExtension = "png";
        String givenContentDispositionFileName = givenFileNamePrefix + "." + givenFileExtension;

        MockWebServer server = new MockWebServer();
        server.enqueue(new MockResponse()
                .addHeader("Content-Type", "image/png")
                .addHeader(
                        "Content-Disposition",
                        String.format("attachment; filename=\"%s\"", givenContentDispositionFileName))
                .setBody(iconBinaryContentBuffer));
        server.start();

        Downloader downloader = new Downloader(tempDir.toPath());

        // when
        Response response = sendTestRequest(server);
        File resultFile = downloader.downloadFile(response);

        // then
        then(resultFile).hasExtension(givenFileExtension).hasSameBinaryContentAs(icon);
        then(resultFile.getName()).startsWith(givenFileNamePrefix);

        server.shutdown();
    }

    @Test
    void shouldReturnEmptyFileForEmptyBody(@TempDir File tempDir) throws IOException {
        // given
        MockWebServer server = new MockWebServer();
        server.enqueue(new MockResponse());
        server.start();

        Downloader downloader = new Downloader(tempDir.toPath());

        // when
        Response response = sendTestRequest(server);
        File resultFile = downloader.downloadFile(response);

        // then
        then(resultFile).isEmpty();
        then(resultFile.getName()).startsWith("infobip-download-");

        server.shutdown();
    }

    @Test
    void shouldNotAllowPathInFileNames(@TempDir File tempDir) throws IOException {
        // given
        String givenTextContent = "Hello World!";
        String givenFileNamePrefix = "../../etc/hello";
        String givenFileExtension = "txt";
        String givenContentDispositionFileName = givenFileNamePrefix + "." + givenFileExtension;

        MockWebServer server = new MockWebServer();
        server.enqueue(new MockResponse()
                .addHeader("Content-Type", "text/plain")
                .addHeader(
                        "Content-Disposition",
                        String.format("attachment; filename=\"%s\"", givenContentDispositionFileName))
                .setBody(givenTextContent));
        server.start();

        Downloader downloader = new Downloader(tempDir.toPath());

        // when
        Response response = sendTestRequest(server);
        File resultFile = downloader.downloadFile(response);

        // then
        then(resultFile).hasNoExtension().hasContent(givenTextContent);
        then(resultFile.getName()).startsWith("infobip-download-");

        server.shutdown();
    }

    @Test
    void shouldNotAllowWhitespacesInFileNames(@TempDir File tempDir) throws IOException {
        // given
        String givenTextContent = "Hello World!";
        String givenFileNamePrefix = "hello world";
        String givenFileExtension = "txt";
        String givenContentDispositionFileName = givenFileNamePrefix + "." + givenFileExtension;

        MockWebServer server = new MockWebServer();
        server.enqueue(new MockResponse()
                .addHeader("Content-Type", "text/plain")
                .addHeader(
                        "Content-Disposition",
                        String.format("attachment; filename=\"%s\"", givenContentDispositionFileName))
                .setBody(givenTextContent));
        server.start();

        Downloader downloader = new Downloader(tempDir.toPath());

        // when
        Response response = sendTestRequest(server);
        File resultFile = downloader.downloadFile(response);

        // then
        then(resultFile).hasNoExtension().hasContent(givenTextContent);
        then(resultFile.getName()).startsWith("infobip-download-");

        server.shutdown();
    }

    private Response sendTestRequest(MockWebServer server) throws IOException {
        return client.newCall(new Request.Builder().url(server.url("/")).build())
                .execute();
    }
}
