# Change Log of `infobip-api-java-client`

All notable changes to the library will be documented in this file.

The format of the file is based on [Keep a Changelog](http://keepachangelog.com/)
and this library adheres to [Semantic Versioning](http://semver.org/) as mentioned in [README.md][readme] file.

## [ [3.0.1](https://github.com/infobip/infobip-api-java-client/releases/tag/3.0.1) ] - 2021-02-16

### Changed
- `README.md` which now contains more details about supported authentication methods & updated examples of library usage for webhooks

### Removed
- Unused model classes
- Unused utility classes
- Unused dependency

### Fixed
- Supported date formats as specified in [Integration Best Practices](https://www.infobip.com/docs/essentials/integration-best-practices#date-formats)

## [ [3.0.0](https://github.com/infobip/infobip-api-java-client/releases/tag/3.0.0) ] - 2021-02-03

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
