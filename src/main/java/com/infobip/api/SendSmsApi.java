/*
 * Infobip Client API Libraries OpenAPI Specification
 * OpenAPI specification containing public endpoints supported in client API libraries.
 *
 * Contact: support@infobip.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.infobip.api;

import com.google.gson.reflect.TypeToken;
import com.infobip.ApiCallback;
import com.infobip.ApiClient;
import com.infobip.ApiException;
import com.infobip.ApiResponse;
import com.infobip.Configuration;
import com.infobip.Pair;
import com.infobip.model.SmsAdvancedBinaryRequest;
import com.infobip.model.SmsAdvancedTextualRequest;
import com.infobip.model.SmsDeliveryResult;
import com.infobip.model.SmsLogsResponse;
import com.infobip.model.SmsPreviewRequest;
import com.infobip.model.SmsPreviewResponse;
import com.infobip.model.SmsResponse;
import java.lang.reflect.Type;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SendSmsApi {
  private ApiClient localVarApiClient;

  public SendSmsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SendSmsApi(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return localVarApiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  /**
   * Build call for getOutboundSmsMessageDeliveryReports
   *
   * @param bulkId ID of bulk which delivery report is requested. (optional)
   * @param messageId ID of SMS which delivery report is requested. (optional)
   * @param limit Maximal number of delivery reports that will be returned. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   *     <p>Learn more about SMS channel and use cases
   * @see <a href="https://www.infobip.com/docs/sms">Get outbound SMS message delivery reports
   *     Documentation</a>
   */
  public okhttp3.Call getOutboundSmsMessageDeliveryReportsCall(
      String bulkId, String messageId, Integer limit, final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/sms/1/reports";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (bulkId != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("bulkId", bulkId));
    }

    if (messageId != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("messageId", messageId));
    }

    if (limit != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/json", "application/xml"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames =
        new String[] {"APIKeyHeader", "Basic", "IBSSOTokenHeader", "OAuth2"};
    return localVarApiClient.buildCall(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call getOutboundSmsMessageDeliveryReportsValidateBeforeCall(
      String bulkId, String messageId, Integer limit, final ApiCallback _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        getOutboundSmsMessageDeliveryReportsCall(bulkId, messageId, limit, _callback);
    return localVarCall;
  }

  /**
   * Get outbound SMS message delivery reports If you are for any reason unable to receive real time
   * delivery reports on your endpoint, you can use this API method to learn if and when the message
   * has been delivered to the recipient. Each request will return a batch of delivery reports -
   * only once. The following API request will return only new reports that arrived since the last
   * API request.
   *
   * @param bulkId ID of bulk which delivery report is requested. (optional)
   * @param messageId ID of SMS which delivery report is requested. (optional)
   * @param limit Maximal number of delivery reports that will be returned. (optional)
   * @return SmsDeliveryResult
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   *     <p>Learn more about SMS channel and use cases
   * @see <a href="https://www.infobip.com/docs/sms">Get outbound SMS message delivery reports
   *     Documentation</a>
   */
  public SmsDeliveryResult getOutboundSmsMessageDeliveryReports(
      String bulkId, String messageId, Integer limit) throws ApiException {
    ApiResponse<SmsDeliveryResult> localVarResp =
        getOutboundSmsMessageDeliveryReportsWithHttpInfo(bulkId, messageId, limit);
    return localVarResp.getData();
  }

  /**
   * Get outbound SMS message delivery reports If you are for any reason unable to receive real time
   * delivery reports on your endpoint, you can use this API method to learn if and when the message
   * has been delivered to the recipient. Each request will return a batch of delivery reports -
   * only once. The following API request will return only new reports that arrived since the last
   * API request.
   *
   * @param bulkId ID of bulk which delivery report is requested. (optional)
   * @param messageId ID of SMS which delivery report is requested. (optional)
   * @param limit Maximal number of delivery reports that will be returned. (optional)
   * @return ApiResponse&lt;SmsDeliveryResult&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   *     <p>Learn more about SMS channel and use cases
   * @see <a href="https://www.infobip.com/docs/sms">Get outbound SMS message delivery reports
   *     Documentation</a>
   */
  public ApiResponse<SmsDeliveryResult> getOutboundSmsMessageDeliveryReportsWithHttpInfo(
      String bulkId, String messageId, Integer limit) throws ApiException {
    okhttp3.Call localVarCall =
        getOutboundSmsMessageDeliveryReportsValidateBeforeCall(bulkId, messageId, limit, null);
    Type localVarReturnType = new TypeToken<SmsDeliveryResult>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Get outbound SMS message delivery reports (asynchronously) If you are for any reason unable to
   * receive real time delivery reports on your endpoint, you can use this API method to learn if
   * and when the message has been delivered to the recipient. Each request will return a batch of
   * delivery reports - only once. The following API request will return only new reports that
   * arrived since the last API request.
   *
   * @param bulkId ID of bulk which delivery report is requested. (optional)
   * @param messageId ID of SMS which delivery report is requested. (optional)
   * @param limit Maximal number of delivery reports that will be returned. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   *     <p>Learn more about SMS channel and use cases
   * @see <a href="https://www.infobip.com/docs/sms">Get outbound SMS message delivery reports
   *     Documentation</a>
   */
  public okhttp3.Call getOutboundSmsMessageDeliveryReportsAsync(
      String bulkId,
      String messageId,
      Integer limit,
      final ApiCallback<SmsDeliveryResult> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        getOutboundSmsMessageDeliveryReportsValidateBeforeCall(bulkId, messageId, limit, _callback);
    Type localVarReturnType = new TypeToken<SmsDeliveryResult>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for getOutboundSmsMessageLogs
   *
   * @param from Sender address. (optional)
   * @param to Destination address. (optional)
   * @param bulkId Bulk ID for which log is requested. (optional)
   * @param messageId SMS ID for which log is requested. (optional)
   * @param generalStatus Sent SMS status. (optional)
   * @param sentSince Lower limit on date and time of sending SMS. Has the following format:
   *     &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. (optional)
   * @param sentUntil Upper limit on date and time of sending SMS. Has the following format:
   *     &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. (optional)
   * @param limit Maximal number of messages in returned logs. Limit should be between &#x60;1&#x60;
   *     and &#x60;1000&#x60;. If you want to fetch more than 1000 logs you can retrieve them in
   *     pages using &#x60;sentSince&#x60; and &#x60;sentUntil&#x60; parameters. Defaults to
   *     &#x60;50&#x60;. (optional)
   * @param mcc Mobile country code. (optional)
   * @param mnc Mobile network code. (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   *     <p>Learn more about SMS channel and use cases
   * @see <a href="https://www.infobip.com/docs/sms">Get outbound SMS message logs Documentation</a>
   */
  public okhttp3.Call getOutboundSmsMessageLogsCall(
      String from,
      String to,
      List<String> bulkId,
      List<String> messageId,
      String generalStatus,
      OffsetDateTime sentSince,
      OffsetDateTime sentUntil,
      Integer limit,
      String mcc,
      String mnc,
      final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/sms/1/logs";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (from != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("from", from));
    }

    if (to != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("to", to));
    }

    if (bulkId != null) {
      localVarCollectionQueryParams.addAll(
          localVarApiClient.parameterToPairs("multi", "bulkId", bulkId));
    }

    if (messageId != null) {
      localVarCollectionQueryParams.addAll(
          localVarApiClient.parameterToPairs("multi", "messageId", messageId));
    }

    if (generalStatus != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("generalStatus", generalStatus));
    }

    if (sentSince != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("sentSince", sentSince));
    }

    if (sentUntil != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("sentUntil", sentUntil));
    }

    if (limit != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
    }

    if (mcc != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("mcc", mcc));
    }

    if (mnc != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("mnc", mnc));
    }

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/json", "application/xml"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {};

    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames =
        new String[] {"APIKeyHeader", "Basic", "IBSSOTokenHeader", "OAuth2"};
    return localVarApiClient.buildCall(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call getOutboundSmsMessageLogsValidateBeforeCall(
      String from,
      String to,
      List<String> bulkId,
      List<String> messageId,
      String generalStatus,
      OffsetDateTime sentSince,
      OffsetDateTime sentUntil,
      Integer limit,
      String mcc,
      String mnc,
      final ApiCallback _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        getOutboundSmsMessageLogsCall(
            from,
            to,
            bulkId,
            messageId,
            generalStatus,
            sentSince,
            sentUntil,
            limit,
            mcc,
            mnc,
            _callback);
    return localVarCall;
  }

  /**
   * Get outbound SMS message logs You should use this method for displaying logs in the user
   * interface or for some other less frequent usage. See [message delivery
   * reports](#communication-channels/sms/get-sent-sms-delivery-reports) if your use case is to
   * verify message delivery.
   *
   * @param from Sender address. (optional)
   * @param to Destination address. (optional)
   * @param bulkId Bulk ID for which log is requested. (optional)
   * @param messageId SMS ID for which log is requested. (optional)
   * @param generalStatus Sent SMS status. (optional)
   * @param sentSince Lower limit on date and time of sending SMS. Has the following format:
   *     &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. (optional)
   * @param sentUntil Upper limit on date and time of sending SMS. Has the following format:
   *     &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. (optional)
   * @param limit Maximal number of messages in returned logs. Limit should be between &#x60;1&#x60;
   *     and &#x60;1000&#x60;. If you want to fetch more than 1000 logs you can retrieve them in
   *     pages using &#x60;sentSince&#x60; and &#x60;sentUntil&#x60; parameters. Defaults to
   *     &#x60;50&#x60;. (optional)
   * @param mcc Mobile country code. (optional)
   * @param mnc Mobile network code. (optional)
   * @return SmsLogsResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   *     <p>Learn more about SMS channel and use cases
   * @see <a href="https://www.infobip.com/docs/sms">Get outbound SMS message logs Documentation</a>
   */
  public SmsLogsResponse getOutboundSmsMessageLogs(
      String from,
      String to,
      List<String> bulkId,
      List<String> messageId,
      String generalStatus,
      OffsetDateTime sentSince,
      OffsetDateTime sentUntil,
      Integer limit,
      String mcc,
      String mnc)
      throws ApiException {
    ApiResponse<SmsLogsResponse> localVarResp =
        getOutboundSmsMessageLogsWithHttpInfo(
            from, to, bulkId, messageId, generalStatus, sentSince, sentUntil, limit, mcc, mnc);
    return localVarResp.getData();
  }

  /**
   * Get outbound SMS message logs You should use this method for displaying logs in the user
   * interface or for some other less frequent usage. See [message delivery
   * reports](#communication-channels/sms/get-sent-sms-delivery-reports) if your use case is to
   * verify message delivery.
   *
   * @param from Sender address. (optional)
   * @param to Destination address. (optional)
   * @param bulkId Bulk ID for which log is requested. (optional)
   * @param messageId SMS ID for which log is requested. (optional)
   * @param generalStatus Sent SMS status. (optional)
   * @param sentSince Lower limit on date and time of sending SMS. Has the following format:
   *     &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. (optional)
   * @param sentUntil Upper limit on date and time of sending SMS. Has the following format:
   *     &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. (optional)
   * @param limit Maximal number of messages in returned logs. Limit should be between &#x60;1&#x60;
   *     and &#x60;1000&#x60;. If you want to fetch more than 1000 logs you can retrieve them in
   *     pages using &#x60;sentSince&#x60; and &#x60;sentUntil&#x60; parameters. Defaults to
   *     &#x60;50&#x60;. (optional)
   * @param mcc Mobile country code. (optional)
   * @param mnc Mobile network code. (optional)
   * @return ApiResponse&lt;SmsLogsResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   *     <p>Learn more about SMS channel and use cases
   * @see <a href="https://www.infobip.com/docs/sms">Get outbound SMS message logs Documentation</a>
   */
  public ApiResponse<SmsLogsResponse> getOutboundSmsMessageLogsWithHttpInfo(
      String from,
      String to,
      List<String> bulkId,
      List<String> messageId,
      String generalStatus,
      OffsetDateTime sentSince,
      OffsetDateTime sentUntil,
      Integer limit,
      String mcc,
      String mnc)
      throws ApiException {
    okhttp3.Call localVarCall =
        getOutboundSmsMessageLogsValidateBeforeCall(
            from,
            to,
            bulkId,
            messageId,
            generalStatus,
            sentSince,
            sentUntil,
            limit,
            mcc,
            mnc,
            null);
    Type localVarReturnType = new TypeToken<SmsLogsResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Get outbound SMS message logs (asynchronously) You should use this method for displaying logs
   * in the user interface or for some other less frequent usage. See [message delivery
   * reports](#communication-channels/sms/get-sent-sms-delivery-reports) if your use case is to
   * verify message delivery.
   *
   * @param from Sender address. (optional)
   * @param to Destination address. (optional)
   * @param bulkId Bulk ID for which log is requested. (optional)
   * @param messageId SMS ID for which log is requested. (optional)
   * @param generalStatus Sent SMS status. (optional)
   * @param sentSince Lower limit on date and time of sending SMS. Has the following format:
   *     &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. (optional)
   * @param sentUntil Upper limit on date and time of sending SMS. Has the following format:
   *     &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;. (optional)
   * @param limit Maximal number of messages in returned logs. Limit should be between &#x60;1&#x60;
   *     and &#x60;1000&#x60;. If you want to fetch more than 1000 logs you can retrieve them in
   *     pages using &#x60;sentSince&#x60; and &#x60;sentUntil&#x60; parameters. Defaults to
   *     &#x60;50&#x60;. (optional)
   * @param mcc Mobile country code. (optional)
   * @param mnc Mobile network code. (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   *     <p>Learn more about SMS channel and use cases
   * @see <a href="https://www.infobip.com/docs/sms">Get outbound SMS message logs Documentation</a>
   */
  public okhttp3.Call getOutboundSmsMessageLogsAsync(
      String from,
      String to,
      List<String> bulkId,
      List<String> messageId,
      String generalStatus,
      OffsetDateTime sentSince,
      OffsetDateTime sentUntil,
      Integer limit,
      String mcc,
      String mnc,
      final ApiCallback<SmsLogsResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        getOutboundSmsMessageLogsValidateBeforeCall(
            from,
            to,
            bulkId,
            messageId,
            generalStatus,
            sentSince,
            sentUntil,
            limit,
            mcc,
            mnc,
            _callback);
    Type localVarReturnType = new TypeToken<SmsLogsResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for previewSmsMessage
   *
   * @param smsPreviewRequest (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   *     <p>Learn more about SMS channel and use cases
   * @see <a href="https://www.infobip.com/docs/sms">Preview SMS message Documentation</a>
   */
  public okhttp3.Call previewSmsMessageCall(
      SmsPreviewRequest smsPreviewRequest, final ApiCallback _callback) throws ApiException {
    Object localVarPostBody = smsPreviewRequest;

    // create path and map variables
    String localVarPath = "/sms/1/preview";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/json", "application/xml"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {"application/json", "application/xml"};
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames =
        new String[] {"APIKeyHeader", "Basic", "IBSSOTokenHeader", "OAuth2"};
    return localVarApiClient.buildCall(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call previewSmsMessageValidateBeforeCall(
      SmsPreviewRequest smsPreviewRequest, final ApiCallback _callback) throws ApiException {

    okhttp3.Call localVarCall = previewSmsMessageCall(smsPreviewRequest, _callback);
    return localVarCall;
  }

  /**
   * Preview SMS message Avoid unpleasant surprises and check how different message configurations
   * will affect your message text, number of characters and message parts.
   *
   * @param smsPreviewRequest (optional)
   * @return SmsPreviewResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   *     <p>Learn more about SMS channel and use cases
   * @see <a href="https://www.infobip.com/docs/sms">Preview SMS message Documentation</a>
   */
  public SmsPreviewResponse previewSmsMessage(SmsPreviewRequest smsPreviewRequest)
      throws ApiException {
    ApiResponse<SmsPreviewResponse> localVarResp = previewSmsMessageWithHttpInfo(smsPreviewRequest);
    return localVarResp.getData();
  }

  /**
   * Preview SMS message Avoid unpleasant surprises and check how different message configurations
   * will affect your message text, number of characters and message parts.
   *
   * @param smsPreviewRequest (optional)
   * @return ApiResponse&lt;SmsPreviewResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   *     <p>Learn more about SMS channel and use cases
   * @see <a href="https://www.infobip.com/docs/sms">Preview SMS message Documentation</a>
   */
  public ApiResponse<SmsPreviewResponse> previewSmsMessageWithHttpInfo(
      SmsPreviewRequest smsPreviewRequest) throws ApiException {
    okhttp3.Call localVarCall = previewSmsMessageValidateBeforeCall(smsPreviewRequest, null);
    Type localVarReturnType = new TypeToken<SmsPreviewResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Preview SMS message (asynchronously) Avoid unpleasant surprises and check how different message
   * configurations will affect your message text, number of characters and message parts.
   *
   * @param smsPreviewRequest (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   *     <p>Learn more about SMS channel and use cases
   * @see <a href="https://www.infobip.com/docs/sms">Preview SMS message Documentation</a>
   */
  public okhttp3.Call previewSmsMessageAsync(
      SmsPreviewRequest smsPreviewRequest, final ApiCallback<SmsPreviewResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall = previewSmsMessageValidateBeforeCall(smsPreviewRequest, _callback);
    Type localVarReturnType = new TypeToken<SmsPreviewResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for sendBinarySmsMessage
   *
   * @param smsAdvancedBinaryRequest (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   *     <p>Learn more about SMS channel and use cases
   * @see <a href="https://www.infobip.com/docs/sms">Send binary SMS message Documentation</a>
   */
  public okhttp3.Call sendBinarySmsMessageCall(
      SmsAdvancedBinaryRequest smsAdvancedBinaryRequest, final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = smsAdvancedBinaryRequest;

    // create path and map variables
    String localVarPath = "/sms/2/binary/advanced";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/json", "application/xml"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {"application/json", "application/xml"};
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames =
        new String[] {"APIKeyHeader", "Basic", "IBSSOTokenHeader", "OAuth2"};
    return localVarApiClient.buildCall(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call sendBinarySmsMessageValidateBeforeCall(
      SmsAdvancedBinaryRequest smsAdvancedBinaryRequest, final ApiCallback _callback)
      throws ApiException {

    okhttp3.Call localVarCall = sendBinarySmsMessageCall(smsAdvancedBinaryRequest, _callback);
    return localVarCall;
  }

  /**
   * Send binary SMS message Send single or multiple binary messages to one or more destination
   * address.
   *
   * @param smsAdvancedBinaryRequest (optional)
   * @return SmsResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   *     <p>Learn more about SMS channel and use cases
   * @see <a href="https://www.infobip.com/docs/sms">Send binary SMS message Documentation</a>
   */
  public SmsResponse sendBinarySmsMessage(SmsAdvancedBinaryRequest smsAdvancedBinaryRequest)
      throws ApiException {
    ApiResponse<SmsResponse> localVarResp =
        sendBinarySmsMessageWithHttpInfo(smsAdvancedBinaryRequest);
    return localVarResp.getData();
  }

  /**
   * Send binary SMS message Send single or multiple binary messages to one or more destination
   * address.
   *
   * @param smsAdvancedBinaryRequest (optional)
   * @return ApiResponse&lt;SmsResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   *     <p>Learn more about SMS channel and use cases
   * @see <a href="https://www.infobip.com/docs/sms">Send binary SMS message Documentation</a>
   */
  public ApiResponse<SmsResponse> sendBinarySmsMessageWithHttpInfo(
      SmsAdvancedBinaryRequest smsAdvancedBinaryRequest) throws ApiException {
    okhttp3.Call localVarCall =
        sendBinarySmsMessageValidateBeforeCall(smsAdvancedBinaryRequest, null);
    Type localVarReturnType = new TypeToken<SmsResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Send binary SMS message (asynchronously) Send single or multiple binary messages to one or more
   * destination address.
   *
   * @param smsAdvancedBinaryRequest (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   *     <p>Learn more about SMS channel and use cases
   * @see <a href="https://www.infobip.com/docs/sms">Send binary SMS message Documentation</a>
   */
  public okhttp3.Call sendBinarySmsMessageAsync(
      SmsAdvancedBinaryRequest smsAdvancedBinaryRequest, final ApiCallback<SmsResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        sendBinarySmsMessageValidateBeforeCall(smsAdvancedBinaryRequest, _callback);
    Type localVarReturnType = new TypeToken<SmsResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for sendSmsMessage
   *
   * @param smsAdvancedTextualRequest (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   *     <p>Learn more about SMS channel and use cases
   * @see <a href="https://www.infobip.com/docs/sms">Send SMS message Documentation</a>
   */
  public okhttp3.Call sendSmsMessageCall(
      SmsAdvancedTextualRequest smsAdvancedTextualRequest, final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = smsAdvancedTextualRequest;

    // create path and map variables
    String localVarPath = "/sms/2/text/advanced";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();
    final String[] localVarAccepts = {"application/json", "application/xml"};
    final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
    if (localVarAccept != null) {
      localVarHeaderParams.put("Accept", localVarAccept);
    }

    final String[] localVarContentTypes = {"application/json", "application/xml"};
    final String localVarContentType =
        localVarApiClient.selectHeaderContentType(localVarContentTypes);
    localVarHeaderParams.put("Content-Type", localVarContentType);

    String[] localVarAuthNames =
        new String[] {"APIKeyHeader", "Basic", "IBSSOTokenHeader", "OAuth2"};
    return localVarApiClient.buildCall(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAuthNames,
        _callback);
  }

  @SuppressWarnings("rawtypes")
  private okhttp3.Call sendSmsMessageValidateBeforeCall(
      SmsAdvancedTextualRequest smsAdvancedTextualRequest, final ApiCallback _callback)
      throws ApiException {

    okhttp3.Call localVarCall = sendSmsMessageCall(smsAdvancedTextualRequest, _callback);
    return localVarCall;
  }

  /**
   * Send SMS message 99% of all use cases can be achieved by using this API method. Everything from
   * sending a simple single message to a single destination, up to batch sending of personalized
   * messages to the thousands of recipients with a single API request. Language, transliteration,
   * scheduling and every advanced feature you can think of is supported.
   *
   * @param smsAdvancedTextualRequest (optional)
   * @return SmsResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   *     <p>Learn more about SMS channel and use cases
   * @see <a href="https://www.infobip.com/docs/sms">Send SMS message Documentation</a>
   */
  public SmsResponse sendSmsMessage(SmsAdvancedTextualRequest smsAdvancedTextualRequest)
      throws ApiException {
    ApiResponse<SmsResponse> localVarResp = sendSmsMessageWithHttpInfo(smsAdvancedTextualRequest);
    return localVarResp.getData();
  }

  /**
   * Send SMS message 99% of all use cases can be achieved by using this API method. Everything from
   * sending a simple single message to a single destination, up to batch sending of personalized
   * messages to the thousands of recipients with a single API request. Language, transliteration,
   * scheduling and every advanced feature you can think of is supported.
   *
   * @param smsAdvancedTextualRequest (optional)
   * @return ApiResponse&lt;SmsResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   *     <p>Learn more about SMS channel and use cases
   * @see <a href="https://www.infobip.com/docs/sms">Send SMS message Documentation</a>
   */
  public ApiResponse<SmsResponse> sendSmsMessageWithHttpInfo(
      SmsAdvancedTextualRequest smsAdvancedTextualRequest) throws ApiException {
    okhttp3.Call localVarCall = sendSmsMessageValidateBeforeCall(smsAdvancedTextualRequest, null);
    Type localVarReturnType = new TypeToken<SmsResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Send SMS message (asynchronously) 99% of all use cases can be achieved by using this API
   * method. Everything from sending a simple single message to a single destination, up to batch
   * sending of personalized messages to the thousands of recipients with a single API request.
   * Language, transliteration, scheduling and every advanced feature you can think of is supported.
   *
   * @param smsAdvancedTextualRequest (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   *     <p>Learn more about SMS channel and use cases
   * @see <a href="https://www.infobip.com/docs/sms">Send SMS message Documentation</a>
   */
  public okhttp3.Call sendSmsMessageAsync(
      SmsAdvancedTextualRequest smsAdvancedTextualRequest, final ApiCallback<SmsResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        sendSmsMessageValidateBeforeCall(smsAdvancedTextualRequest, _callback);
    Type localVarReturnType = new TypeToken<SmsResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
}
