# Two-Factor Authentication (2FA)

This tutorial will show you how to use a two-factor authentication using [Infobip 2FA API](https://www.infobip.com/docs/api/channels/sms/2fa).

Initialize a 2FA API client:

```java
    ApiClient apiClient = ApiClient.forApiKey(ApiKey.from(API_KEY))
        .withBaseUrl(BaseUrl.from(BASE_URL))
        .build();

    TfaApi tfaApi = new TfaApi(apiClient);
```

Before sending one-time PIN codes you need to set up an application and a message template.

## Application setup

The application represents your service. It’s a good practice to have separate applications for separate services.

```java
    TfaApplicationRequest applicationRequest = new TfaApplicationRequest()
        .name("2FA application");

    TfaApplicationResponse tfaApplication = tfaApi
        .createTfaApplication(applicationRequest)
        .execute();

    String appId = tfaApplication.getApplicationId();
```

## Message template setup

A message template represents the message body with the PIN placeholder that is sent to the end users.

```java
    TfaCreateMessageRequest createMessageRequest = new TfaCreateMessageRequest()
        .messageText("Your pin is {{pin}}")
        .pinType(TfaPinType.NUMERIC)
        .pinLength(4);

    TfaMessage tfaMessageTemplate = tfaApi
        .createTfaMessageTemplate(appId, createMessageRequest)
        .execute();

    String messageId = tfaMessageTemplate.getMessageId();
```

## Send a 2FA code via an SMS

Once you set up application and message templates, you can start generating and sending PIN codes via an SMS to the provided destination addresses (i.e. numbers
you've purchased from Infobip).

```java
    TfaStartAuthenticationRequest startAuthenticationRequest = new TfaStartAuthenticationRequest()
        .applicationId(appId)
        .messageId(messageId)
        .from("InfoSMS")
        .to("41793026727");

    TfaStartAuthenticationResponse sendCodeResponse = tfaApi
        .sendTfaPinCodeOverSms(startAuthenticationRequest)
        .execute();

    boolean isSuccessful = sendCodeResponse.getSmsStatus().equals("MESSAGE_SENT");
    String pinId = sendCodeResponse.getPinId();
```

## Verify a phone number

Verify a phone number to confirm a successful 2FA authentication.

```java
    TfaVerifyPinRequest verifyPinRequest = new TfaVerifyPinRequest()
        .pin("1598");

    TfaVerifyPinResponse verifyResponse = tfaApi
        .verifyTfaPhoneNumber(pinId, verifyPinRequest)
        .execute();

    boolean verified = verifyResponse.getVerified();
```
