/*
 * This class is auto generated from the Infobip OpenAPI specification
 * through the OpenAPI Specification Client API libraries (Re)Generator (OSCAR),
 * powered by the OpenAPI Generator (https://openapi-generator.tech).
 *
 * Do not edit manually. To learn how to raise an issue, see the CONTRIBUTING guide
 * or contact us @ support@infobip.com.
 */

package com.infobip.api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.infobip.ApiCallback;
import com.infobip.ApiClient;
import com.infobip.ApiException;
import com.infobip.Parameter;
import com.infobip.RequestDefinition;
import com.infobip.model.TfaApplicationRequest;
import com.infobip.model.TfaApplicationResponse;
import com.infobip.model.TfaCreateEmailMessageRequest;
import com.infobip.model.TfaCreateMessageRequest;
import com.infobip.model.TfaEmailMessage;
import com.infobip.model.TfaMessage;
import com.infobip.model.TfaResendPinRequest;
import com.infobip.model.TfaStartAuthenticationRequest;
import com.infobip.model.TfaStartAuthenticationResponse;
import com.infobip.model.TfaStartEmailAuthenticationRequest;
import com.infobip.model.TfaStartEmailAuthenticationResponse;
import com.infobip.model.TfaUpdateEmailMessageRequest;
import com.infobip.model.TfaUpdateMessageRequest;
import com.infobip.model.TfaVerificationResponse;
import com.infobip.model.TfaVerifyPinRequest;
import com.infobip.model.TfaVerifyPinResponse;
import java.util.List;
import java.util.Objects;

/**
 * Represents TfaApi API client.
 */
public class TfaApi {

    private final ApiClient apiClient;

    /**
     * Constructs a new instance of TfaApi.
     *
     * @param apiClient {@link ApiClient} instance to delegate calls to.
     */
    public TfaApi(ApiClient apiClient) {
        this.apiClient = Objects.requireNonNull(apiClient, "ApiClient must not be null!");
    }

    private RequestDefinition createTfaApplicationDefinition(TfaApplicationRequest tfaApplicationRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/2fa/2/applications")
                .body(tfaApplicationRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * createTfaApplication request builder class.
     */
    public class CreateTfaApplicationRequest {
        private final TfaApplicationRequest tfaApplicationRequest;

        private CreateTfaApplicationRequest(TfaApplicationRequest tfaApplicationRequest) {
            this.tfaApplicationRequest = Objects.requireNonNull(
                    tfaApplicationRequest, "The required parameter 'tfaApplicationRequest' is missing.");
        }

        /**
         * Executes the createTfaApplication request.
         *
         * @return TfaApplicationResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public TfaApplicationResponse execute() throws ApiException {
            RequestDefinition createTfaApplicationDefinition = createTfaApplicationDefinition(tfaApplicationRequest);
            return apiClient.execute(
                    createTfaApplicationDefinition, new TypeReference<TfaApplicationResponse>() {}.getType());
        }

        /**
         * Executes the createTfaApplication request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<TfaApplicationResponse> callback) {
            RequestDefinition createTfaApplicationDefinition = createTfaApplicationDefinition(tfaApplicationRequest);
            return apiClient.executeAsync(
                    createTfaApplicationDefinition, new TypeReference<TfaApplicationResponse>() {}.getType(), callback);
        }
    }

    /**
     * Create 2FA application.
     * <p>
     * Create and configure a new 2FA application.
     *
     * @param tfaApplicationRequest  (required)
     * @return CreateTfaApplicationRequest
     * @see <a href="https://www.infobip.com/docs/tutorials/two-factor-authentication-over-api">Read me first: Introduction and use cases</a>
     */
    public CreateTfaApplicationRequest createTfaApplication(TfaApplicationRequest tfaApplicationRequest) {
        return new CreateTfaApplicationRequest(tfaApplicationRequest);
    }

    private RequestDefinition createTfaEmailMessageTemplateDefinition(
            String appId, TfaCreateEmailMessageRequest tfaCreateEmailMessageRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "POST", "/2fa/2/applications/{appId}/email/messages")
                .body(tfaCreateEmailMessageRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (appId != null) {
            builder.addPathParameter(new Parameter("appId", appId));
        }
        return builder.build();
    }

    /**
     * createTfaEmailMessageTemplate request builder class.
     */
    public class CreateTfaEmailMessageTemplateRequest {
        private final String appId;
        private final TfaCreateEmailMessageRequest tfaCreateEmailMessageRequest;

        private CreateTfaEmailMessageTemplateRequest(
                String appId, TfaCreateEmailMessageRequest tfaCreateEmailMessageRequest) {
            this.appId = Objects.requireNonNull(appId, "The required parameter 'appId' is missing.");
            this.tfaCreateEmailMessageRequest = Objects.requireNonNull(
                    tfaCreateEmailMessageRequest, "The required parameter 'tfaCreateEmailMessageRequest' is missing.");
        }

        /**
         * Executes the createTfaEmailMessageTemplate request.
         *
         * @return TfaEmailMessage The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public TfaEmailMessage execute() throws ApiException {
            RequestDefinition createTfaEmailMessageTemplateDefinition =
                    createTfaEmailMessageTemplateDefinition(appId, tfaCreateEmailMessageRequest);
            return apiClient.execute(
                    createTfaEmailMessageTemplateDefinition, new TypeReference<TfaEmailMessage>() {}.getType());
        }

        /**
         * Executes the createTfaEmailMessageTemplate request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<TfaEmailMessage> callback) {
            RequestDefinition createTfaEmailMessageTemplateDefinition =
                    createTfaEmailMessageTemplateDefinition(appId, tfaCreateEmailMessageRequest);
            return apiClient.executeAsync(
                    createTfaEmailMessageTemplateDefinition,
                    new TypeReference<TfaEmailMessage>() {}.getType(),
                    callback);
        }
    }

    /**
     * Create 2FA Email message template.
     * <p>
     * Once you have your [2FA application](#channels/sms/create-2fa-application), create one or more [Email message templates](#channels/sms/2fa/2fa-configuration/create-2fa-email-message-template) where your PIN will be dynamically included when you send the PIN message over Email.
     *
     * @param appId ID of application for which requested message was created. (required)
     * @param tfaCreateEmailMessageRequest  (required)
     * @return CreateTfaEmailMessageTemplateRequest
     * @see <a href="https://www.infobip.com/docs/tutorials/two-factor-authentication-over-api">Read me first: Introduction and use cases</a>
     */
    public CreateTfaEmailMessageTemplateRequest createTfaEmailMessageTemplate(
            String appId, TfaCreateEmailMessageRequest tfaCreateEmailMessageRequest) {
        return new CreateTfaEmailMessageTemplateRequest(appId, tfaCreateEmailMessageRequest);
    }

    private RequestDefinition createTfaMessageTemplateDefinition(
            String appId, TfaCreateMessageRequest tfaCreateMessageRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/2fa/2/applications/{appId}/messages")
                .body(tfaCreateMessageRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (appId != null) {
            builder.addPathParameter(new Parameter("appId", appId));
        }
        return builder.build();
    }

    /**
     * createTfaMessageTemplate request builder class.
     */
    public class CreateTfaMessageTemplateRequest {
        private final String appId;
        private final TfaCreateMessageRequest tfaCreateMessageRequest;

        private CreateTfaMessageTemplateRequest(String appId, TfaCreateMessageRequest tfaCreateMessageRequest) {
            this.appId = Objects.requireNonNull(appId, "The required parameter 'appId' is missing.");
            this.tfaCreateMessageRequest = Objects.requireNonNull(
                    tfaCreateMessageRequest, "The required parameter 'tfaCreateMessageRequest' is missing.");
        }

        /**
         * Executes the createTfaMessageTemplate request.
         *
         * @return TfaMessage The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public TfaMessage execute() throws ApiException {
            RequestDefinition createTfaMessageTemplateDefinition =
                    createTfaMessageTemplateDefinition(appId, tfaCreateMessageRequest);
            return apiClient.execute(createTfaMessageTemplateDefinition, new TypeReference<TfaMessage>() {}.getType());
        }

        /**
         * Executes the createTfaMessageTemplate request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<TfaMessage> callback) {
            RequestDefinition createTfaMessageTemplateDefinition =
                    createTfaMessageTemplateDefinition(appId, tfaCreateMessageRequest);
            return apiClient.executeAsync(
                    createTfaMessageTemplateDefinition, new TypeReference<TfaMessage>() {}.getType(), callback);
        }
    }

    /**
     * Create 2FA SMS or Voice message template.
     * <p>
     * Once you have your [2FA application](#channels/sms/2fa/2fa-configuration/create-2fa-application), create one or more [message templates](#channels/sms/2fa/2fa-configuration/create-2fa-message-template) where your PIN will be dynamically included when you send the PIN message over SMS or Voice.
     *
     * @param appId ID of application for which requested message was created. (required)
     * @param tfaCreateMessageRequest  (required)
     * @return CreateTfaMessageTemplateRequest
     * @see <a href="https://www.infobip.com/docs/tutorials/two-factor-authentication-over-api">Read me first: Introduction and use cases</a>
     */
    public CreateTfaMessageTemplateRequest createTfaMessageTemplate(
            String appId, TfaCreateMessageRequest tfaCreateMessageRequest) {
        return new CreateTfaMessageTemplateRequest(appId, tfaCreateMessageRequest);
    }

    private RequestDefinition getTfaApplicationDefinition(String appId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/2fa/2/applications/{appId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (appId != null) {
            builder.addPathParameter(new Parameter("appId", appId));
        }
        return builder.build();
    }

    /**
     * getTfaApplication request builder class.
     */
    public class GetTfaApplicationRequest {
        private final String appId;

        private GetTfaApplicationRequest(String appId) {
            this.appId = Objects.requireNonNull(appId, "The required parameter 'appId' is missing.");
        }

        /**
         * Executes the getTfaApplication request.
         *
         * @return TfaApplicationResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public TfaApplicationResponse execute() throws ApiException {
            RequestDefinition getTfaApplicationDefinition = getTfaApplicationDefinition(appId);
            return apiClient.execute(
                    getTfaApplicationDefinition, new TypeReference<TfaApplicationResponse>() {}.getType());
        }

        /**
         * Executes the getTfaApplication request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<TfaApplicationResponse> callback) {
            RequestDefinition getTfaApplicationDefinition = getTfaApplicationDefinition(appId);
            return apiClient.executeAsync(
                    getTfaApplicationDefinition, new TypeReference<TfaApplicationResponse>() {}.getType(), callback);
        }
    }

    /**
     * Get 2FA application.
     * <p>
     * Get a single 2FA application to see its configuration details.
     *
     * @param appId ID of application for which configuration view was requested. (required)
     * @return GetTfaApplicationRequest
     * @see <a href="https://www.infobip.com/docs/tutorials/two-factor-authentication-over-api">Read me first: Introduction and use cases</a>
     */
    public GetTfaApplicationRequest getTfaApplication(String appId) {
        return new GetTfaApplicationRequest(appId);
    }

    private RequestDefinition getTfaApplicationsDefinition() {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/2fa/2/applications")
                .requiresAuthentication(true)
                .accept("application/json");

        return builder.build();
    }

    /**
     * getTfaApplications request builder class.
     */
    public class GetTfaApplicationsRequest {

        private GetTfaApplicationsRequest() {}

        /**
         * Executes the getTfaApplications request.
         *
         * @return List&lt;TfaApplicationResponse&gt; The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public List<TfaApplicationResponse> execute() throws ApiException {
            RequestDefinition getTfaApplicationsDefinition = getTfaApplicationsDefinition();
            return apiClient.execute(
                    getTfaApplicationsDefinition, new TypeReference<List<TfaApplicationResponse>>() {}.getType());
        }

        /**
         * Executes the getTfaApplications request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<List<TfaApplicationResponse>> callback) {
            RequestDefinition getTfaApplicationsDefinition = getTfaApplicationsDefinition();
            return apiClient.executeAsync(
                    getTfaApplicationsDefinition,
                    new TypeReference<List<TfaApplicationResponse>>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get 2FA applications.
     * <p>
     * An application is a container for 2FA message templates. Use this method to list your applications.
     *
     * @return GetTfaApplicationsRequest
     * @see <a href="https://www.infobip.com/docs/tutorials/two-factor-authentication-over-api">Read me first: Introduction and use cases</a>
     */
    public GetTfaApplicationsRequest getTfaApplications() {
        return new GetTfaApplicationsRequest();
    }

    private RequestDefinition getTfaMessageTemplateDefinition(String appId, String msgId) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/2fa/2/applications/{appId}/messages/{msgId}")
                .requiresAuthentication(true)
                .accept("application/json");

        if (appId != null) {
            builder.addPathParameter(new Parameter("appId", appId));
        }
        if (msgId != null) {
            builder.addPathParameter(new Parameter("msgId", msgId));
        }
        return builder.build();
    }

    /**
     * getTfaMessageTemplate request builder class.
     */
    public class GetTfaMessageTemplateRequest {
        private final String appId;
        private final String msgId;

        private GetTfaMessageTemplateRequest(String appId, String msgId) {
            this.appId = Objects.requireNonNull(appId, "The required parameter 'appId' is missing.");
            this.msgId = Objects.requireNonNull(msgId, "The required parameter 'msgId' is missing.");
        }

        /**
         * Executes the getTfaMessageTemplate request.
         *
         * @return TfaMessage The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public TfaMessage execute() throws ApiException {
            RequestDefinition getTfaMessageTemplateDefinition = getTfaMessageTemplateDefinition(appId, msgId);
            return apiClient.execute(getTfaMessageTemplateDefinition, new TypeReference<TfaMessage>() {}.getType());
        }

        /**
         * Executes the getTfaMessageTemplate request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<TfaMessage> callback) {
            RequestDefinition getTfaMessageTemplateDefinition = getTfaMessageTemplateDefinition(appId, msgId);
            return apiClient.executeAsync(
                    getTfaMessageTemplateDefinition, new TypeReference<TfaMessage>() {}.getType(), callback);
        }
    }

    /**
     * Get 2FA message template.
     * <p>
     * Get a single 2FA message template from an application to see its configuration details.
     *
     * @param appId ID of application for which requested message was created. (required)
     * @param msgId Requested message ID. (required)
     * @return GetTfaMessageTemplateRequest
     * @see <a href="https://www.infobip.com/docs/tutorials/two-factor-authentication-over-api">Read me first: Introduction and use cases</a>
     */
    public GetTfaMessageTemplateRequest getTfaMessageTemplate(String appId, String msgId) {
        return new GetTfaMessageTemplateRequest(appId, msgId);
    }

    private RequestDefinition getTfaMessageTemplatesDefinition(String appId) {
        RequestDefinition.Builder builder = RequestDefinition.builder("GET", "/2fa/2/applications/{appId}/messages")
                .requiresAuthentication(true)
                .accept("application/json");

        if (appId != null) {
            builder.addPathParameter(new Parameter("appId", appId));
        }
        return builder.build();
    }

    /**
     * getTfaMessageTemplates request builder class.
     */
    public class GetTfaMessageTemplatesRequest {
        private final String appId;

        private GetTfaMessageTemplatesRequest(String appId) {
            this.appId = Objects.requireNonNull(appId, "The required parameter 'appId' is missing.");
        }

        /**
         * Executes the getTfaMessageTemplates request.
         *
         * @return List&lt;TfaMessage&gt; The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public List<TfaMessage> execute() throws ApiException {
            RequestDefinition getTfaMessageTemplatesDefinition = getTfaMessageTemplatesDefinition(appId);
            return apiClient.execute(
                    getTfaMessageTemplatesDefinition, new TypeReference<List<TfaMessage>>() {}.getType());
        }

        /**
         * Executes the getTfaMessageTemplates request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<List<TfaMessage>> callback) {
            RequestDefinition getTfaMessageTemplatesDefinition = getTfaMessageTemplatesDefinition(appId);
            return apiClient.executeAsync(
                    getTfaMessageTemplatesDefinition, new TypeReference<List<TfaMessage>>() {}.getType(), callback);
        }
    }

    /**
     * Get 2FA message templates.
     * <p>
     * List all message templates in a 2FA application.
     *
     * @param appId ID of application for which requested message was created. (required)
     * @return GetTfaMessageTemplatesRequest
     * @see <a href="https://www.infobip.com/docs/tutorials/two-factor-authentication-over-api">Read me first: Introduction and use cases</a>
     */
    public GetTfaMessageTemplatesRequest getTfaMessageTemplates(String appId) {
        return new GetTfaMessageTemplatesRequest(appId);
    }

    private RequestDefinition getTfaVerificationStatusDefinition(
            String msisdn, String appId, Boolean verified, Boolean sent) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "GET", "/2fa/2/applications/{appId}/verifications")
                .requiresAuthentication(true)
                .accept("application/json");

        if (appId != null) {
            builder.addPathParameter(new Parameter("appId", appId));
        }
        if (msisdn != null) {
            builder.addQueryParameter(new Parameter("msisdn", msisdn));
        }
        if (verified != null) {
            builder.addQueryParameter(new Parameter("verified", verified));
        }
        if (sent != null) {
            builder.addQueryParameter(new Parameter("sent", sent));
        }
        return builder.build();
    }

    /**
     * getTfaVerificationStatus request builder class.
     */
    public class GetTfaVerificationStatusRequest {
        private final String msisdn;
        private final String appId;
        private Boolean verified;
        private Boolean sent;

        private GetTfaVerificationStatusRequest(String msisdn, String appId) {
            this.msisdn = Objects.requireNonNull(msisdn, "The required parameter 'msisdn' is missing.");
            this.appId = Objects.requireNonNull(appId, "The required parameter 'appId' is missing.");
        }

        /**
         * Sets verified.
         *
         * @param verified Filter by verified (true or false). (optional)
         * @return GetTfaVerificationStatusRequest
         */
        public GetTfaVerificationStatusRequest verified(Boolean verified) {
            this.verified = verified;
            return this;
        }

        /**
         * Sets sent.
         *
         * @param sent Filter by message sent status (true or false). (optional)
         * @return GetTfaVerificationStatusRequest
         */
        public GetTfaVerificationStatusRequest sent(Boolean sent) {
            this.sent = sent;
            return this;
        }

        /**
         * Executes the getTfaVerificationStatus request.
         *
         * @return TfaVerificationResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public TfaVerificationResponse execute() throws ApiException {
            RequestDefinition getTfaVerificationStatusDefinition =
                    getTfaVerificationStatusDefinition(msisdn, appId, verified, sent);
            return apiClient.execute(
                    getTfaVerificationStatusDefinition, new TypeReference<TfaVerificationResponse>() {}.getType());
        }

        /**
         * Executes the getTfaVerificationStatus request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<TfaVerificationResponse> callback) {
            RequestDefinition getTfaVerificationStatusDefinition =
                    getTfaVerificationStatusDefinition(msisdn, appId, verified, sent);
            return apiClient.executeAsync(
                    getTfaVerificationStatusDefinition,
                    new TypeReference<TfaVerificationResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Get 2FA verification status.
     * <p>
     * Check if a phone number is already verified for a specific 2FA application.
     *
     * @param msisdn Filter by msisdn (phone number) for which verification status is checked. (required)
     * @param appId ID of 2-FA application for which phone number verification status is requested. (required)
     * @return GetTfaVerificationStatusRequest
     * @see <a href="https://www.infobip.com/docs/tutorials/two-factor-authentication-over-api">Read me first: Introduction and use cases</a>
     */
    public GetTfaVerificationStatusRequest getTfaVerificationStatus(String msisdn, String appId) {
        return new GetTfaVerificationStatusRequest(msisdn, appId);
    }

    private RequestDefinition resend2faPinCodeOverEmailDefinition(
            String pinId, TfaResendPinRequest tfaResendPinRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/2fa/2/pin/{pinId}/resend/email")
                .body(tfaResendPinRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (pinId != null) {
            builder.addPathParameter(new Parameter("pinId", pinId));
        }
        return builder.build();
    }

    /**
     * resend2faPinCodeOverEmail request builder class.
     */
    public class Resend2faPinCodeOverEmailRequest {
        private final String pinId;
        private final TfaResendPinRequest tfaResendPinRequest;

        private Resend2faPinCodeOverEmailRequest(String pinId, TfaResendPinRequest tfaResendPinRequest) {
            this.pinId = Objects.requireNonNull(pinId, "The required parameter 'pinId' is missing.");
            this.tfaResendPinRequest = Objects.requireNonNull(
                    tfaResendPinRequest, "The required parameter 'tfaResendPinRequest' is missing.");
        }

        /**
         * Executes the resend2faPinCodeOverEmail request.
         *
         * @return TfaStartEmailAuthenticationResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public TfaStartEmailAuthenticationResponse execute() throws ApiException {
            RequestDefinition resend2faPinCodeOverEmailDefinition =
                    resend2faPinCodeOverEmailDefinition(pinId, tfaResendPinRequest);
            return apiClient.execute(
                    resend2faPinCodeOverEmailDefinition,
                    new TypeReference<TfaStartEmailAuthenticationResponse>() {}.getType());
        }

        /**
         * Executes the resend2faPinCodeOverEmail request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<TfaStartEmailAuthenticationResponse> callback) {
            RequestDefinition resend2faPinCodeOverEmailDefinition =
                    resend2faPinCodeOverEmailDefinition(pinId, tfaResendPinRequest);
            return apiClient.executeAsync(
                    resend2faPinCodeOverEmailDefinition,
                    new TypeReference<TfaStartEmailAuthenticationResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Resend 2FA PIN code over Email.
     * <p>
     * If needed, you can resend the same (previously sent) PIN code over Email.
     *
     * @param pinId ID of the pin code that has to be verified. (required)
     * @param tfaResendPinRequest  (required)
     * @return Resend2faPinCodeOverEmailRequest
     * @see <a href="https://www.infobip.com/docs/tutorials/two-factor-authentication-over-api">Read me first: Introduction and use cases</a>
     */
    public Resend2faPinCodeOverEmailRequest resend2faPinCodeOverEmail(
            String pinId, TfaResendPinRequest tfaResendPinRequest) {
        return new Resend2faPinCodeOverEmailRequest(pinId, tfaResendPinRequest);
    }

    private RequestDefinition resendTfaPinCodeOverSmsDefinition(String pinId, TfaResendPinRequest tfaResendPinRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/2fa/2/pin/{pinId}/resend")
                .body(tfaResendPinRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (pinId != null) {
            builder.addPathParameter(new Parameter("pinId", pinId));
        }
        return builder.build();
    }

    /**
     * resendTfaPinCodeOverSms request builder class.
     */
    public class ResendTfaPinCodeOverSmsRequest {
        private final String pinId;
        private final TfaResendPinRequest tfaResendPinRequest;

        private ResendTfaPinCodeOverSmsRequest(String pinId, TfaResendPinRequest tfaResendPinRequest) {
            this.pinId = Objects.requireNonNull(pinId, "The required parameter 'pinId' is missing.");
            this.tfaResendPinRequest = Objects.requireNonNull(
                    tfaResendPinRequest, "The required parameter 'tfaResendPinRequest' is missing.");
        }

        /**
         * Executes the resendTfaPinCodeOverSms request.
         *
         * @return TfaStartAuthenticationResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public TfaStartAuthenticationResponse execute() throws ApiException {
            RequestDefinition resendTfaPinCodeOverSmsDefinition =
                    resendTfaPinCodeOverSmsDefinition(pinId, tfaResendPinRequest);
            return apiClient.execute(
                    resendTfaPinCodeOverSmsDefinition,
                    new TypeReference<TfaStartAuthenticationResponse>() {}.getType());
        }

        /**
         * Executes the resendTfaPinCodeOverSms request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<TfaStartAuthenticationResponse> callback) {
            RequestDefinition resendTfaPinCodeOverSmsDefinition =
                    resendTfaPinCodeOverSmsDefinition(pinId, tfaResendPinRequest);
            return apiClient.executeAsync(
                    resendTfaPinCodeOverSmsDefinition,
                    new TypeReference<TfaStartAuthenticationResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Resend 2FA PIN code over SMS.
     * <p>
     * If needed, you can resend the same (previously sent) PIN code over SMS.
     *
     * @param pinId ID of the pin code that has to be verified. (required)
     * @param tfaResendPinRequest  (required)
     * @return ResendTfaPinCodeOverSmsRequest
     * @see <a href="https://www.infobip.com/docs/tutorials/two-factor-authentication-over-api">Read me first: Introduction and use cases</a>
     */
    public ResendTfaPinCodeOverSmsRequest resendTfaPinCodeOverSms(
            String pinId, TfaResendPinRequest tfaResendPinRequest) {
        return new ResendTfaPinCodeOverSmsRequest(pinId, tfaResendPinRequest);
    }

    private RequestDefinition resendTfaPinCodeOverVoiceDefinition(
            String pinId, TfaResendPinRequest tfaResendPinRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/2fa/2/pin/{pinId}/resend/voice")
                .body(tfaResendPinRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (pinId != null) {
            builder.addPathParameter(new Parameter("pinId", pinId));
        }
        return builder.build();
    }

    /**
     * resendTfaPinCodeOverVoice request builder class.
     */
    public class ResendTfaPinCodeOverVoiceRequest {
        private final String pinId;
        private final TfaResendPinRequest tfaResendPinRequest;

        private ResendTfaPinCodeOverVoiceRequest(String pinId, TfaResendPinRequest tfaResendPinRequest) {
            this.pinId = Objects.requireNonNull(pinId, "The required parameter 'pinId' is missing.");
            this.tfaResendPinRequest = Objects.requireNonNull(
                    tfaResendPinRequest, "The required parameter 'tfaResendPinRequest' is missing.");
        }

        /**
         * Executes the resendTfaPinCodeOverVoice request.
         *
         * @return TfaStartAuthenticationResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public TfaStartAuthenticationResponse execute() throws ApiException {
            RequestDefinition resendTfaPinCodeOverVoiceDefinition =
                    resendTfaPinCodeOverVoiceDefinition(pinId, tfaResendPinRequest);
            return apiClient.execute(
                    resendTfaPinCodeOverVoiceDefinition,
                    new TypeReference<TfaStartAuthenticationResponse>() {}.getType());
        }

        /**
         * Executes the resendTfaPinCodeOverVoice request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<TfaStartAuthenticationResponse> callback) {
            RequestDefinition resendTfaPinCodeOverVoiceDefinition =
                    resendTfaPinCodeOverVoiceDefinition(pinId, tfaResendPinRequest);
            return apiClient.executeAsync(
                    resendTfaPinCodeOverVoiceDefinition,
                    new TypeReference<TfaStartAuthenticationResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Resend 2FA PIN code over Voice.
     * <p>
     * If needed, you can resend the same (previously sent) PIN code over Voice.
     *
     * @param pinId ID of the pin code that has to be verified. (required)
     * @param tfaResendPinRequest  (required)
     * @return ResendTfaPinCodeOverVoiceRequest
     * @see <a href="https://www.infobip.com/docs/tutorials/two-factor-authentication-over-api">Read me first: Introduction and use cases</a>
     */
    public ResendTfaPinCodeOverVoiceRequest resendTfaPinCodeOverVoice(
            String pinId, TfaResendPinRequest tfaResendPinRequest) {
        return new ResendTfaPinCodeOverVoiceRequest(pinId, tfaResendPinRequest);
    }

    private RequestDefinition send2faPinCodeOverEmailDefinition(
            TfaStartEmailAuthenticationRequest tfaStartEmailAuthenticationRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/2fa/2/pin/email")
                .body(tfaStartEmailAuthenticationRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * send2faPinCodeOverEmail request builder class.
     */
    public class Send2faPinCodeOverEmailRequest {
        private final TfaStartEmailAuthenticationRequest tfaStartEmailAuthenticationRequest;

        private Send2faPinCodeOverEmailRequest(TfaStartEmailAuthenticationRequest tfaStartEmailAuthenticationRequest) {
            this.tfaStartEmailAuthenticationRequest = Objects.requireNonNull(
                    tfaStartEmailAuthenticationRequest,
                    "The required parameter 'tfaStartEmailAuthenticationRequest' is missing.");
        }

        /**
         * Executes the send2faPinCodeOverEmail request.
         *
         * @return TfaStartEmailAuthenticationResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public TfaStartEmailAuthenticationResponse execute() throws ApiException {
            RequestDefinition send2faPinCodeOverEmailDefinition =
                    send2faPinCodeOverEmailDefinition(tfaStartEmailAuthenticationRequest);
            return apiClient.execute(
                    send2faPinCodeOverEmailDefinition,
                    new TypeReference<TfaStartEmailAuthenticationResponse>() {}.getType());
        }

        /**
         * Executes the send2faPinCodeOverEmail request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<TfaStartEmailAuthenticationResponse> callback) {
            RequestDefinition send2faPinCodeOverEmailDefinition =
                    send2faPinCodeOverEmailDefinition(tfaStartEmailAuthenticationRequest);
            return apiClient.executeAsync(
                    send2faPinCodeOverEmailDefinition,
                    new TypeReference<TfaStartEmailAuthenticationResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Send 2FA PIN code over Email.
     * <p>
     * Send a PIN code over Email using previously created [Email message template](#channels/sms/2fa/2fa-configuration/create-2fa-email-message-template).
     *
     * @param tfaStartEmailAuthenticationRequest  (required)
     * @return Send2faPinCodeOverEmailRequest
     * @see <a href="https://www.infobip.com/docs/tutorials/two-factor-authentication-over-api">Read me first: Introduction and use cases</a>
     */
    public Send2faPinCodeOverEmailRequest send2faPinCodeOverEmail(
            TfaStartEmailAuthenticationRequest tfaStartEmailAuthenticationRequest) {
        return new Send2faPinCodeOverEmailRequest(tfaStartEmailAuthenticationRequest);
    }

    private RequestDefinition sendTfaPinCodeOverSmsDefinition(
            TfaStartAuthenticationRequest tfaStartAuthenticationRequest, Boolean ncNeeded) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/2fa/2/pin")
                .body(tfaStartAuthenticationRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (ncNeeded != null) {
            builder.addQueryParameter(new Parameter("ncNeeded", ncNeeded));
        }
        return builder.build();
    }

    /**
     * sendTfaPinCodeOverSms request builder class.
     */
    public class SendTfaPinCodeOverSmsRequest {
        private final TfaStartAuthenticationRequest tfaStartAuthenticationRequest;
        private Boolean ncNeeded;

        private SendTfaPinCodeOverSmsRequest(TfaStartAuthenticationRequest tfaStartAuthenticationRequest) {
            this.tfaStartAuthenticationRequest = Objects.requireNonNull(
                    tfaStartAuthenticationRequest,
                    "The required parameter 'tfaStartAuthenticationRequest' is missing.");
        }

        /**
         * Sets ncNeeded.
         *
         * @param ncNeeded Indicates if Number Lookup is needed before sending the 2FA message. If the parameter value is true, Number Lookup will be requested before sending the SMS. If the value is false, the SMS will be sent without requesting Number Lookup. Field&#39;s default value is &#x60;true&#x60;. (optional)
         * @return SendTfaPinCodeOverSmsRequest
         */
        public SendTfaPinCodeOverSmsRequest ncNeeded(Boolean ncNeeded) {
            this.ncNeeded = ncNeeded;
            return this;
        }

        /**
         * Executes the sendTfaPinCodeOverSms request.
         *
         * @return TfaStartAuthenticationResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public TfaStartAuthenticationResponse execute() throws ApiException {
            RequestDefinition sendTfaPinCodeOverSmsDefinition =
                    sendTfaPinCodeOverSmsDefinition(tfaStartAuthenticationRequest, ncNeeded);
            return apiClient.execute(
                    sendTfaPinCodeOverSmsDefinition, new TypeReference<TfaStartAuthenticationResponse>() {}.getType());
        }

        /**
         * Executes the sendTfaPinCodeOverSms request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<TfaStartAuthenticationResponse> callback) {
            RequestDefinition sendTfaPinCodeOverSmsDefinition =
                    sendTfaPinCodeOverSmsDefinition(tfaStartAuthenticationRequest, ncNeeded);
            return apiClient.executeAsync(
                    sendTfaPinCodeOverSmsDefinition,
                    new TypeReference<TfaStartAuthenticationResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Send 2FA PIN code over SMS.
     * <p>
     * Send a PIN code over SMS using a previously created [message template](#channels/sms/create-2fa-message-template).
     *
     * @param tfaStartAuthenticationRequest  (required)
     * @return SendTfaPinCodeOverSmsRequest
     * @see <a href="https://www.infobip.com/docs/tutorials/two-factor-authentication-over-api">Read me first: Introduction and use cases</a>
     */
    public SendTfaPinCodeOverSmsRequest sendTfaPinCodeOverSms(
            TfaStartAuthenticationRequest tfaStartAuthenticationRequest) {
        return new SendTfaPinCodeOverSmsRequest(tfaStartAuthenticationRequest);
    }

    private RequestDefinition sendTfaPinCodeOverVoiceDefinition(
            TfaStartAuthenticationRequest tfaStartAuthenticationRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/2fa/2/pin/voice")
                .body(tfaStartAuthenticationRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        return builder.build();
    }

    /**
     * sendTfaPinCodeOverVoice request builder class.
     */
    public class SendTfaPinCodeOverVoiceRequest {
        private final TfaStartAuthenticationRequest tfaStartAuthenticationRequest;

        private SendTfaPinCodeOverVoiceRequest(TfaStartAuthenticationRequest tfaStartAuthenticationRequest) {
            this.tfaStartAuthenticationRequest = Objects.requireNonNull(
                    tfaStartAuthenticationRequest,
                    "The required parameter 'tfaStartAuthenticationRequest' is missing.");
        }

        /**
         * Executes the sendTfaPinCodeOverVoice request.
         *
         * @return TfaStartAuthenticationResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public TfaStartAuthenticationResponse execute() throws ApiException {
            RequestDefinition sendTfaPinCodeOverVoiceDefinition =
                    sendTfaPinCodeOverVoiceDefinition(tfaStartAuthenticationRequest);
            return apiClient.execute(
                    sendTfaPinCodeOverVoiceDefinition,
                    new TypeReference<TfaStartAuthenticationResponse>() {}.getType());
        }

        /**
         * Executes the sendTfaPinCodeOverVoice request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<TfaStartAuthenticationResponse> callback) {
            RequestDefinition sendTfaPinCodeOverVoiceDefinition =
                    sendTfaPinCodeOverVoiceDefinition(tfaStartAuthenticationRequest);
            return apiClient.executeAsync(
                    sendTfaPinCodeOverVoiceDefinition,
                    new TypeReference<TfaStartAuthenticationResponse>() {}.getType(),
                    callback);
        }
    }

    /**
     * Send 2FA PIN code over Voice.
     * <p>
     * Send a PIN code over Voice using previously created [message template](#channels/sms/create-2fa-message-template).
     *
     * @param tfaStartAuthenticationRequest  (required)
     * @return SendTfaPinCodeOverVoiceRequest
     * @see <a href="https://www.infobip.com/docs/tutorials/two-factor-authentication-over-api">Read me first: Introduction and use cases</a>
     */
    public SendTfaPinCodeOverVoiceRequest sendTfaPinCodeOverVoice(
            TfaStartAuthenticationRequest tfaStartAuthenticationRequest) {
        return new SendTfaPinCodeOverVoiceRequest(tfaStartAuthenticationRequest);
    }

    private RequestDefinition updateTfaApplicationDefinition(
            String appId, TfaApplicationRequest tfaApplicationRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("PUT", "/2fa/2/applications/{appId}")
                .body(tfaApplicationRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (appId != null) {
            builder.addPathParameter(new Parameter("appId", appId));
        }
        return builder.build();
    }

    /**
     * updateTfaApplication request builder class.
     */
    public class UpdateTfaApplicationRequest {
        private final String appId;
        private final TfaApplicationRequest tfaApplicationRequest;

        private UpdateTfaApplicationRequest(String appId, TfaApplicationRequest tfaApplicationRequest) {
            this.appId = Objects.requireNonNull(appId, "The required parameter 'appId' is missing.");
            this.tfaApplicationRequest = Objects.requireNonNull(
                    tfaApplicationRequest, "The required parameter 'tfaApplicationRequest' is missing.");
        }

        /**
         * Executes the updateTfaApplication request.
         *
         * @return TfaApplicationResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public TfaApplicationResponse execute() throws ApiException {
            RequestDefinition updateTfaApplicationDefinition =
                    updateTfaApplicationDefinition(appId, tfaApplicationRequest);
            return apiClient.execute(
                    updateTfaApplicationDefinition, new TypeReference<TfaApplicationResponse>() {}.getType());
        }

        /**
         * Executes the updateTfaApplication request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<TfaApplicationResponse> callback) {
            RequestDefinition updateTfaApplicationDefinition =
                    updateTfaApplicationDefinition(appId, tfaApplicationRequest);
            return apiClient.executeAsync(
                    updateTfaApplicationDefinition, new TypeReference<TfaApplicationResponse>() {}.getType(), callback);
        }
    }

    /**
     * Update 2FA application.
     * <p>
     * Change configuration options for your existing 2FA application.
     *
     * @param appId ID of application that should be updated. (required)
     * @param tfaApplicationRequest  (required)
     * @return UpdateTfaApplicationRequest
     * @see <a href="https://www.infobip.com/docs/tutorials/two-factor-authentication-over-api">Read me first: Introduction and use cases</a>
     */
    public UpdateTfaApplicationRequest updateTfaApplication(String appId, TfaApplicationRequest tfaApplicationRequest) {
        return new UpdateTfaApplicationRequest(appId, tfaApplicationRequest);
    }

    private RequestDefinition updateTfaEmailMessageTemplateDefinition(
            String appId, String msgId, TfaUpdateEmailMessageRequest tfaUpdateEmailMessageRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "PUT", "/2fa/2/applications/{appId}/email/messages/{msgId}")
                .body(tfaUpdateEmailMessageRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (appId != null) {
            builder.addPathParameter(new Parameter("appId", appId));
        }
        if (msgId != null) {
            builder.addPathParameter(new Parameter("msgId", msgId));
        }
        return builder.build();
    }

    /**
     * updateTfaEmailMessageTemplate request builder class.
     */
    public class UpdateTfaEmailMessageTemplateRequest {
        private final String appId;
        private final String msgId;
        private final TfaUpdateEmailMessageRequest tfaUpdateEmailMessageRequest;

        private UpdateTfaEmailMessageTemplateRequest(
                String appId, String msgId, TfaUpdateEmailMessageRequest tfaUpdateEmailMessageRequest) {
            this.appId = Objects.requireNonNull(appId, "The required parameter 'appId' is missing.");
            this.msgId = Objects.requireNonNull(msgId, "The required parameter 'msgId' is missing.");
            this.tfaUpdateEmailMessageRequest = Objects.requireNonNull(
                    tfaUpdateEmailMessageRequest, "The required parameter 'tfaUpdateEmailMessageRequest' is missing.");
        }

        /**
         * Executes the updateTfaEmailMessageTemplate request.
         *
         * @return TfaEmailMessage The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public TfaEmailMessage execute() throws ApiException {
            RequestDefinition updateTfaEmailMessageTemplateDefinition =
                    updateTfaEmailMessageTemplateDefinition(appId, msgId, tfaUpdateEmailMessageRequest);
            return apiClient.execute(
                    updateTfaEmailMessageTemplateDefinition, new TypeReference<TfaEmailMessage>() {}.getType());
        }

        /**
         * Executes the updateTfaEmailMessageTemplate request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<TfaEmailMessage> callback) {
            RequestDefinition updateTfaEmailMessageTemplateDefinition =
                    updateTfaEmailMessageTemplateDefinition(appId, msgId, tfaUpdateEmailMessageRequest);
            return apiClient.executeAsync(
                    updateTfaEmailMessageTemplateDefinition,
                    new TypeReference<TfaEmailMessage>() {}.getType(),
                    callback);
        }
    }

    /**
     * Update 2FA Email message template.
     * <p>
     * Change configuration options for your existing 2FA application Email message template.
     *
     * @param appId ID of application for which requested message was created. (required)
     * @param msgId Requested message ID. (required)
     * @param tfaUpdateEmailMessageRequest  (required)
     * @return UpdateTfaEmailMessageTemplateRequest
     * @see <a href="https://www.infobip.com/docs/tutorials/two-factor-authentication-over-api">Read me first: Introduction and use cases</a>
     */
    public UpdateTfaEmailMessageTemplateRequest updateTfaEmailMessageTemplate(
            String appId, String msgId, TfaUpdateEmailMessageRequest tfaUpdateEmailMessageRequest) {
        return new UpdateTfaEmailMessageTemplateRequest(appId, msgId, tfaUpdateEmailMessageRequest);
    }

    private RequestDefinition updateTfaMessageTemplateDefinition(
            String appId, String msgId, TfaUpdateMessageRequest tfaUpdateMessageRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder(
                        "PUT", "/2fa/2/applications/{appId}/messages/{msgId}")
                .body(tfaUpdateMessageRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (appId != null) {
            builder.addPathParameter(new Parameter("appId", appId));
        }
        if (msgId != null) {
            builder.addPathParameter(new Parameter("msgId", msgId));
        }
        return builder.build();
    }

    /**
     * updateTfaMessageTemplate request builder class.
     */
    public class UpdateTfaMessageTemplateRequest {
        private final String appId;
        private final String msgId;
        private final TfaUpdateMessageRequest tfaUpdateMessageRequest;

        private UpdateTfaMessageTemplateRequest(
                String appId, String msgId, TfaUpdateMessageRequest tfaUpdateMessageRequest) {
            this.appId = Objects.requireNonNull(appId, "The required parameter 'appId' is missing.");
            this.msgId = Objects.requireNonNull(msgId, "The required parameter 'msgId' is missing.");
            this.tfaUpdateMessageRequest = Objects.requireNonNull(
                    tfaUpdateMessageRequest, "The required parameter 'tfaUpdateMessageRequest' is missing.");
        }

        /**
         * Executes the updateTfaMessageTemplate request.
         *
         * @return TfaMessage The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public TfaMessage execute() throws ApiException {
            RequestDefinition updateTfaMessageTemplateDefinition =
                    updateTfaMessageTemplateDefinition(appId, msgId, tfaUpdateMessageRequest);
            return apiClient.execute(updateTfaMessageTemplateDefinition, new TypeReference<TfaMessage>() {}.getType());
        }

        /**
         * Executes the updateTfaMessageTemplate request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<TfaMessage> callback) {
            RequestDefinition updateTfaMessageTemplateDefinition =
                    updateTfaMessageTemplateDefinition(appId, msgId, tfaUpdateMessageRequest);
            return apiClient.executeAsync(
                    updateTfaMessageTemplateDefinition, new TypeReference<TfaMessage>() {}.getType(), callback);
        }
    }

    /**
     * Update 2FA SMS or Voice message template.
     * <p>
     * Change configuration options for your existing 2FA application SMS or Voice message template.
     *
     * @param appId ID of application for which requested message was created. (required)
     * @param msgId Requested message ID. (required)
     * @param tfaUpdateMessageRequest  (required)
     * @return UpdateTfaMessageTemplateRequest
     * @see <a href="https://www.infobip.com/docs/tutorials/two-factor-authentication-over-api">Read me first: Introduction and use cases</a>
     */
    public UpdateTfaMessageTemplateRequest updateTfaMessageTemplate(
            String appId, String msgId, TfaUpdateMessageRequest tfaUpdateMessageRequest) {
        return new UpdateTfaMessageTemplateRequest(appId, msgId, tfaUpdateMessageRequest);
    }

    private RequestDefinition verifyTfaPhoneNumberDefinition(String pinId, TfaVerifyPinRequest tfaVerifyPinRequest) {
        RequestDefinition.Builder builder = RequestDefinition.builder("POST", "/2fa/2/pin/{pinId}/verify")
                .body(tfaVerifyPinRequest)
                .requiresAuthentication(true)
                .accept("application/json")
                .contentType("application/json");

        if (pinId != null) {
            builder.addPathParameter(new Parameter("pinId", pinId));
        }
        return builder.build();
    }

    /**
     * verifyTfaPhoneNumber request builder class.
     */
    public class VerifyTfaPhoneNumberRequest {
        private final String pinId;
        private final TfaVerifyPinRequest tfaVerifyPinRequest;

        private VerifyTfaPhoneNumberRequest(String pinId, TfaVerifyPinRequest tfaVerifyPinRequest) {
            this.pinId = Objects.requireNonNull(pinId, "The required parameter 'pinId' is missing.");
            this.tfaVerifyPinRequest = Objects.requireNonNull(
                    tfaVerifyPinRequest, "The required parameter 'tfaVerifyPinRequest' is missing.");
        }

        /**
         * Executes the verifyTfaPhoneNumber request.
         *
         * @return TfaVerifyPinResponse The deserialized response.
         * @throws ApiException If the API call fails or an error occurs during the request or response processing.
         */
        public TfaVerifyPinResponse execute() throws ApiException {
            RequestDefinition verifyTfaPhoneNumberDefinition =
                    verifyTfaPhoneNumberDefinition(pinId, tfaVerifyPinRequest);
            return apiClient.execute(
                    verifyTfaPhoneNumberDefinition, new TypeReference<TfaVerifyPinResponse>() {}.getType());
        }

        /**
         * Executes the verifyTfaPhoneNumber request asynchronously.
         *
         * @param callback The {@link ApiCallback} to be invoked.
         * @return The {@link okhttp3.Call} associated with the API request.
         */
        public okhttp3.Call executeAsync(ApiCallback<TfaVerifyPinResponse> callback) {
            RequestDefinition verifyTfaPhoneNumberDefinition =
                    verifyTfaPhoneNumberDefinition(pinId, tfaVerifyPinRequest);
            return apiClient.executeAsync(
                    verifyTfaPhoneNumberDefinition, new TypeReference<TfaVerifyPinResponse>() {}.getType(), callback);
        }
    }

    /**
     * Verify phone number.
     * <p>
     * Verify a phone number to confirm successful 2FA authentication.
     *
     * @param pinId ID of the pin code that has to be verified. (required)
     * @param tfaVerifyPinRequest  (required)
     * @return VerifyTfaPhoneNumberRequest
     * @see <a href="https://www.infobip.com/docs/tutorials/two-factor-authentication-over-api">Read me first: Introduction and use cases</a>
     */
    public VerifyTfaPhoneNumberRequest verifyTfaPhoneNumber(String pinId, TfaVerifyPinRequest tfaVerifyPinRequest) {
        return new VerifyTfaPhoneNumberRequest(pinId, tfaVerifyPinRequest);
    }
}
