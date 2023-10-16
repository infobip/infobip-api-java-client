# Change Log of `infobip-api-java-client`

All notable changes to the library will be documented in this file.

The format of the file is based on [Keep a Changelog](http://keepachangelog.com/)
and this library adheres to [Semantic Versioning](http://semver.org/) as mentioned in [README.md][readme] file.

## [4.0.1](https://github.com/infobip/infobip-api-java-client/releases/tag/4.0.1) - 2023-10-16

### Added
- Added `maven-publish.yml` workflow to facilitate the release of new project versions on GitHub and enable publishing to the Maven Central repository.
- Introduced `snyk.yml` workflow, which serves the purpose of identifying and addressing dependency vulnerabilities in the project.
- Introduced `sonar.yml` workflow to analyze the source code, enhancing code quality and maintainability.
- Introduced `git-build-hook-maven-plugin` plugin into the project, providing support for Git hooks.
- Implemented `pre-commit.sh` hook, which automatically executes `mvn spotless:apply` prior to each commit, ensuring code formatting consistency.

### Changed
- [slf4j-api](https://github.com/qos-ch/slf4j/tree/master/slf4j-api) dependency was bumped to version `2.0.7`
- [Jackson](https://github.com/FasterXML/jackson) dependency was bumped to version `2.15.2`

## [4.0.0](https://github.com/infobip/infobip-api-java-client/releases/tag/4.0.0) - 2023-03-01

🎉 **NEW Major Version of `infobip-api-java-client`.**

⚠️ **IMPORTANT NOTE:** This release contains breaking changes.
All changes, including breaking changes, are addressed and explained in the list bellow.
If you find out that something was not addressed properly, please submit an issue.

### Added
* Support for [Infobip MMS API](https://www.infobip.com/docs/api/channels/mms).
* Support for [Infobip Voice API](https://www.infobip.com/docs/api/channels/voice).
* Support for [Infobip WebRTC API](https://www.infobip.com/docs/api/channels/webrtc).
* Support for [Infobip Viber API](https://www.infobip.com/docs/api/channels/viber).
* Most recent [Infobip SMS API](https://www.infobip.com/docs/api/channels/sms) feature set.
* Most recent [Email](https://www.infobip.com/docs/api/channels/email) feature set.
* Most recent [WhatsApp](https://www.infobip.com/docs/api/channels/whatsapp) feature set.
* Tests for the static parts of the auto-generated code.
  There are multiple tests phases implemented in our auto-generation pipeline.
  A part of the tests is now included as a library source code.
* Base URL [abstraction](src/main/java/com/infobip/BaseUrl.java).
* Api Key [abstraction](src/main/java/com/infobip/ApiKey.java).
* Deprecation notice log if deprecated or gone endpoints are used (`slf4j-api` dependency).
* Snyk and Java version badges to README.

### Changed
* The library now requires Java 11 or above.
* [OkHttp](https://square.github.io/okhttp/) dependency was bumped to version 4.10.0.
* From this version, an `ApiClient` instance must be constructed and configured using the Builder pattern:
  ```
      ApiClient apiClient = ApiClient.forApiKey(givenApiKey)
            .withBaseUrl(givenBaseUrl)
            .withHttpClient(givenHttpClient)
            .withReadTimeout(givenReadTimeoutInSeconds)
            .withTempDirectoryPath(givenTempDirPath)
            .build();
  ```
  The additional OkHttp client configuration was removed from the library.
  Please check the Removed section for details.
* API classes were refactored in a way that all functionalities are grouped under the same product.
  For example, `SendSmsApi`, `ScheduledSmsApi` and `ReceiveSmsApi` classes are replaced with a single `SmsApi` class.
* API class methods that trigger an API call were rewritten using a fluent style where all required parameters
  must be passed to a request builder factory method.
  On the other hand, optional parameters may be passed using a separate request builder methods.
  The result can be fetched using `execute` or `executeAsync` methods.
  That allows us to add optional parameters without introducing a breaking change to the library.
  For example, in the previous version, to send a TFA pin code, we could use something like this:
  ```
      TfaStartAuthenticationResponse response = tfaApi.sendTfaPinCodeOverSms(false, request);
  ```
  In the new version, the following pattern applies:
  ```
      TfaStartAuthenticationResponse sendCodeResponse = tfaApi
            .sendTfaPinCodeOverSms(request)
            .ncNeeded(false)
            .execute();
  ```
* [Jackson](https://github.com/FasterXML/jackson) (version 2.14.2) serialization library is used instead of [Gson](https://github.com/google/gson).
  The `JSON` serialization [utility](src/main/java/com/infobip/JSON.java) now uses a preconfigured Jackson's `ObjectMapper`.
  Also, the support for `InputStream` serialization was added.
* All maven plugins were bumped to the most recent version.
  Both unneeded plugins and the obsolete configuration were removed.
* The API request and response processing was rewritten to increase maintainability and usability.
* The `ApiException` class was refactored to have fluent getters and a single accessible Builder.
* From this version, the error response body is deserialized and stored in `details` property of the `ApiException` class.
* The `palantir-java-format` is now used instead of `google-java-format` to have the formatting closer to our internal coding style.
  See the Spotless [README](https://github.com/diffplug/spotless/tree/main/plugin-maven#palantir-java-format) for details.
* Some products like Email and WhatsApp contain a few breaking changes since a new version of a few of the API endpoints was released.
  If you have issues when migrating the existing implementation, please check the official API documentation or submit an issue.

### Removed
- [Basic](https://www.infobip.com/docs/essentials/api-authentication#basic), [IBSSO Token Header](https://www.infobip.com/docs/essentials/api-authentication#ibsso-token-header) and client credentials grant type [OAuth2](https://www.infobip.com/docs/essentials/api-authentication#oauth-2-0) authentication methods.
  Use [API Key Header](https://www.infobip.com/docs/essentials/api-authentication#api-key-header) authentication method instead.
  The API Key should be injected into the `ApiClient` instance through the newly introduced `forApiKey` factory method.
  Examples can be found in the README.
- `Configuration` utility class.
  Having static default configuration is error-prone and provides an unnecessary overhead.
  An `ApiClient` instance should always be injected in the given API class.
- `SSL` settings configuration methods from the `ApiClient`.
  If you need to configure custom `SSL` related settings (custom client keys, disabled CA certificate and hostname verification, etc.),
  configure them on the `OkHttpClient` instance directly and pass the instance to the `ApiClient` using `withHttpClient` builder method.
- Date format customization methods from the `ApiClient`.
  Only the default Infobip [date format](https://www.infobip.com/docs/essentials/integration-best-practices#date-formats-backward-compatibility) should be used.
  The date formatter instance to be used is available through the `JSON` [class](src/main/java/com/infobip/JSON.java).
- Header and cookie manipulation through `ApiClient` public interface.
  However, it can still be achieved using OkHttp interceptors if needed.
  Feel free to configure an `OkHttpClient` instance with appropriate [interceptors](https://square.github.io/okhttp/features/interceptors/) and pass the instance to the `ApiClient` using `withHttpClient` builder method.
- Explicit debugging option for `ApiClient`.
  [HttpLoggingInterceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor) can always be included by providing a preconfigured HTTP client as described above.
- Explicit gzip support for requests.
  The support should be provided by the client itself like explained [here](https://github.com/square/okhttp/issues/350).
- Unused generated classes.
- Default network interceptor used for tracking upload and download progress.
  The functionality can be re-added by using the official OkHttp [recipe](https://github.com/square/okhttp/blob/master/samples/guide/src/main/java/okhttp3/recipes/Progress.java).
- `...WithHttpInfo` methods from API client classes.
  If an additional info like response headers or the response code is needed, the `executeAsync` method should be
  used.
  The required information is injected in the callback.
- `...buildCall` methods from API client classes.
  The OkHttp `Call` [abstraction](https://square.github.io/okhttp/4.x/okhttp/okhttp3/-call/) can be obtained by using the `executeAsync` method.
  We don't allow calling the API without processing the response internally anymore.


## [3.2.0](https://github.com/infobip/infobip-api-java-client/releases/tag/3.2.0) - 2022-01-19

### Added
- Support for [Infobip WhatsApp API](https://www.infobip.com/docs/api#channels/whatsapp)
- `whatsapp.md` containing quick start guide for WhatsApp API

### Changed
- Email sending API to match the latest version of the API. 
  - Signature changed: getEmailLogs()
- Renamed some email API models to be consistent across multiple products
  - EmailError -> EmailReportError
  - EmailLogsResult -> EmailLogsResponse

### Fixed
- Minor SMS API changes (some field became readonly)
- Improved Javadoc comments


## [3.1.0](https://github.com/infobip/infobip-api-java-client/releases/tag/3.1.0) - 2021-06-16

### Added
- Support for [Infobip Email API](https://www.infobip.com/docs/api#channels/email)
- `email.md` which contains basic example of Email API usage


## [3.0.1](https://github.com/infobip/infobip-api-java-client/releases/tag/3.0.1) - 2021-02-16

### Changed
- `README.md` which now contains more details about supported authentication methods & updated examples of library usage for webhooks

### Removed
- Unused model classes
- Unused utility classes
- Unused dependency

### Fixed
- Supported date formats as specified in [Integration Best Practices](https://www.infobip.com/docs/essentials/integration-best-practices#date-formats)

## [3.0.0](https://github.com/infobip/infobip-api-java-client/releases/tag/3.0.0) - 2021-02-03

🎉 **NEW Major Version of `infobip-api-java-client`.**

⚠️ **IMPORTANT NOTE:** This release contains breaking changes!

In this release the infobip-api-java-client library is updated and modernized. It is auto-generated and completely different from the previous version.

### Added
- Support for async execution
- `CONTRIBUTING.md` which contains guidelines for creating GitHub issues
- Support for [Infobip Two-factor Authentication API](https://www.infobip.com/docs/api#channels/sms/send-2fa-pin-code-over-sms)

### Changed
- Models, structure, examples, etc. for [Infobip SMS API](https://www.infobip.com/docs/api#channels/sms)
- Library dependencies
- `README.md` which contains necessary data and examples for quickstart as well as some other important pieces of information on versioning, licensing, etc.

### Removed
- Support for [Infobip Omni API](https://www.infobip.com/docs/api#channels/omni-failover) (to be included back in one of the next releases)

[readme]: README.md
