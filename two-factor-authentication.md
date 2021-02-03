## Two-Factor Authentication (2FA)
Initialize 2FA API client:
```java
    ApiClient apiClient = new ApiClient();
    apiClient.setApiKeyPrefix(API_KEY_PREFIX);
    apiClient.setApiKey(API_KEY);
    apiClient.setBasePath(URL_BASE_PATH);

    TfaApi tfaApi = new TfaApi(apiClient);
```
Before sending one-time PIN codes you need to set up application and message template.

#### Application setup
The application represents your service. It’s good practice to have separate applications for separate services.
```java
    TfaApplicationResponse tfaApplication = tfaApi.createTfaApplication(
        new TfaApplicationRequest().name("2FA application")
    );
    String appId = tfaApplication.getApplicationId();
```

#### Message template setup
Message template is the message body with the PIN placeholder that is sent to end users.
```java
    TfaMessage tfaMessageTemplate = tfaApi.createTfaMessageTemplate(appId,
        new TfaCreateMessageRequest()
            .messageText("Your pin is {{pin}}")
            .pinType(TfaPinType.NUMERIC)
            .pinLength(4)
    );

    String messageId = tfaMessageTemplate.getMessageId();
```

#### Send 2FA code via SMS
After setting up the application and message template, you can start generating and sending PIN codes via SMS to the provided destination address.
```java
    TfaStartAuthenticationResponse sendCodeResponse = tfaApi.sendTfaPinCodeOverSms(true,
        new TfaStartAuthenticationRequest()
            .applicationId(appId)
            .messageId(messageId)
            .from("InfoSMS")
            .to("41793026727")
    );
    boolean isSuccessful = sendCodeResponse.getSmsStatus().equals("MESSAGE_SENT");
    String pinId = sendCodeResponse.getPinId();
```

#### Verify phone number
Verify a phone number to confirm successful 2FA authentication.
```java
    TfaVerifyPinResponse verifyResponse = tfaApi.verifyTfaPhoneNumber(pinId,
        new TfaVerifyPinRequest().pin("1598")
    );
    boolean verified = verifyResponse.getVerified();
```
