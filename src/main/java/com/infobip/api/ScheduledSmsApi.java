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
import com.infobip.model.SmsBulkRequest;
import com.infobip.model.SmsBulkResponse;
import com.infobip.model.SmsBulkStatusResponse;
import com.infobip.model.SmsUpdateStatusRequest;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScheduledSmsApi {
  private ApiClient localVarApiClient;

  public ScheduledSmsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ScheduledSmsApi(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return localVarApiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.localVarApiClient = apiClient;
  }

  /**
   * Build call for getScheduledSmsMessages.
   *
   * @param bulkId (required)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
   */
  public okhttp3.Call getScheduledSmsMessagesCall(String bulkId, final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/sms/1/bulks";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (bulkId != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("bulkId", bulkId));
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
  private okhttp3.Call getScheduledSmsMessagesValidateBeforeCall(
      String bulkId, final ApiCallback _callback) throws ApiException {

    // verify the required parameter 'bulkId' is set
    if (bulkId == null) {
      throw new ApiException(
          "Missing the required parameter 'bulkId' when calling getScheduledSmsMessages(Async)");
    }

    okhttp3.Call localVarCall = getScheduledSmsMessagesCall(bulkId, _callback);
    return localVarCall;
  }

  /**
   * Get scheduled SMS messages. See the status and the scheduled time of your SMS messages.
   *
   * @param bulkId (required)
   * @return SmsBulkResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
   */
  public SmsBulkResponse getScheduledSmsMessages(String bulkId) throws ApiException {
    ApiResponse<SmsBulkResponse> localVarResp = getScheduledSmsMessagesWithHttpInfo(bulkId);
    return localVarResp.getData();
  }

  /**
   * Get scheduled SMS messages. See the status and the scheduled time of your SMS messages.
   *
   * @param bulkId (required)
   * @return ApiResponse&lt;SmsBulkResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
   */
  public ApiResponse<SmsBulkResponse> getScheduledSmsMessagesWithHttpInfo(String bulkId)
      throws ApiException {
    okhttp3.Call localVarCall = getScheduledSmsMessagesValidateBeforeCall(bulkId, null);
    Type localVarReturnType = new TypeToken<SmsBulkResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Get scheduled SMS messages (asynchronously). See the status and the scheduled time of your SMS
   * messages.
   *
   * @param bulkId (required)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
   */
  public okhttp3.Call getScheduledSmsMessagesAsync(
      String bulkId, final ApiCallback<SmsBulkResponse> _callback) throws ApiException {

    okhttp3.Call localVarCall = getScheduledSmsMessagesValidateBeforeCall(bulkId, _callback);
    Type localVarReturnType = new TypeToken<SmsBulkResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for getScheduledSmsMessagesStatus.
   *
   * @param bulkId (required)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
   */
  public okhttp3.Call getScheduledSmsMessagesStatusCall(String bulkId, final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/sms/1/bulks/status";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (bulkId != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("bulkId", bulkId));
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
  private okhttp3.Call getScheduledSmsMessagesStatusValidateBeforeCall(
      String bulkId, final ApiCallback _callback) throws ApiException {

    // verify the required parameter 'bulkId' is set
    if (bulkId == null) {
      throw new ApiException(
          "Missing the required parameter 'bulkId' when calling"
              + " getScheduledSmsMessagesStatus(Async)");
    }

    okhttp3.Call localVarCall = getScheduledSmsMessagesStatusCall(bulkId, _callback);
    return localVarCall;
  }

  /**
   * Get scheduled SMS messages status. See the status of scheduled messages.
   *
   * @param bulkId (required)
   * @return SmsBulkStatusResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
   */
  public SmsBulkStatusResponse getScheduledSmsMessagesStatus(String bulkId) throws ApiException {
    ApiResponse<SmsBulkStatusResponse> localVarResp =
        getScheduledSmsMessagesStatusWithHttpInfo(bulkId);
    return localVarResp.getData();
  }

  /**
   * Get scheduled SMS messages status. See the status of scheduled messages.
   *
   * @param bulkId (required)
   * @return ApiResponse&lt;SmsBulkStatusResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
   */
  public ApiResponse<SmsBulkStatusResponse> getScheduledSmsMessagesStatusWithHttpInfo(String bulkId)
      throws ApiException {
    okhttp3.Call localVarCall = getScheduledSmsMessagesStatusValidateBeforeCall(bulkId, null);
    Type localVarReturnType = new TypeToken<SmsBulkStatusResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Get scheduled SMS messages status (asynchronously). See the status of scheduled messages.
   *
   * @param bulkId (required)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
   */
  public okhttp3.Call getScheduledSmsMessagesStatusAsync(
      String bulkId, final ApiCallback<SmsBulkStatusResponse> _callback) throws ApiException {

    okhttp3.Call localVarCall = getScheduledSmsMessagesStatusValidateBeforeCall(bulkId, _callback);
    Type localVarReturnType = new TypeToken<SmsBulkStatusResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for rescheduleSmsMessages.
   *
   * @param bulkId (required)
   * @param smsBulkRequest (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
   */
  public okhttp3.Call rescheduleSmsMessagesCall(
      String bulkId, SmsBulkRequest smsBulkRequest, final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = smsBulkRequest;

    // create path and map variables
    String localVarPath = "/sms/1/bulks";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (bulkId != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("bulkId", bulkId));
    }

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
        "PUT",
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
  private okhttp3.Call rescheduleSmsMessagesValidateBeforeCall(
      String bulkId, SmsBulkRequest smsBulkRequest, final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'bulkId' is set
    if (bulkId == null) {
      throw new ApiException(
          "Missing the required parameter 'bulkId' when calling rescheduleSmsMessages(Async)");
    }

    okhttp3.Call localVarCall = rescheduleSmsMessagesCall(bulkId, smsBulkRequest, _callback);
    return localVarCall;
  }

  /**
   * Reschedule SMS messages. Change the date and time for sending scheduled messages.
   *
   * @param bulkId (required)
   * @param smsBulkRequest (optional)
   * @return SmsBulkResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
   */
  public SmsBulkResponse rescheduleSmsMessages(String bulkId, SmsBulkRequest smsBulkRequest)
      throws ApiException {
    ApiResponse<SmsBulkResponse> localVarResp =
        rescheduleSmsMessagesWithHttpInfo(bulkId, smsBulkRequest);
    return localVarResp.getData();
  }

  /**
   * Reschedule SMS messages. Change the date and time for sending scheduled messages.
   *
   * @param bulkId (required)
   * @param smsBulkRequest (optional)
   * @return ApiResponse&lt;SmsBulkResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
   */
  public ApiResponse<SmsBulkResponse> rescheduleSmsMessagesWithHttpInfo(
      String bulkId, SmsBulkRequest smsBulkRequest) throws ApiException {
    okhttp3.Call localVarCall =
        rescheduleSmsMessagesValidateBeforeCall(bulkId, smsBulkRequest, null);
    Type localVarReturnType = new TypeToken<SmsBulkResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Reschedule SMS messages (asynchronously). Change the date and time for sending scheduled
   * messages.
   *
   * @param bulkId (required)
   * @param smsBulkRequest (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
   */
  public okhttp3.Call rescheduleSmsMessagesAsync(
      String bulkId, SmsBulkRequest smsBulkRequest, final ApiCallback<SmsBulkResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        rescheduleSmsMessagesValidateBeforeCall(bulkId, smsBulkRequest, _callback);
    Type localVarReturnType = new TypeToken<SmsBulkResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
  /**
   * Build call for updateScheduledSmsMessagesStatus.
   *
   * @param bulkId (required)
   * @param smsUpdateStatusRequest (optional)
   * @param _callback Callback for upload/download progress
   * @return Call to execute
   * @throws ApiException If fail to serialize the request body object
   * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
   */
  public okhttp3.Call updateScheduledSmsMessagesStatusCall(
      String bulkId, SmsUpdateStatusRequest smsUpdateStatusRequest, final ApiCallback _callback)
      throws ApiException {
    Object localVarPostBody = smsUpdateStatusRequest;

    // create path and map variables
    String localVarPath = "/sms/1/bulks/status";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    if (bulkId != null) {
      localVarQueryParams.addAll(localVarApiClient.parameterToPair("bulkId", bulkId));
    }

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
        "PUT",
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
  private okhttp3.Call updateScheduledSmsMessagesStatusValidateBeforeCall(
      String bulkId, SmsUpdateStatusRequest smsUpdateStatusRequest, final ApiCallback _callback)
      throws ApiException {

    // verify the required parameter 'bulkId' is set
    if (bulkId == null) {
      throw new ApiException(
          "Missing the required parameter 'bulkId' when calling"
              + " updateScheduledSmsMessagesStatus(Async)");
    }

    okhttp3.Call localVarCall =
        updateScheduledSmsMessagesStatusCall(bulkId, smsUpdateStatusRequest, _callback);
    return localVarCall;
  }

  /**
   * Update scheduled SMS messages status. Change status or completely cancel sending of scheduled
   * messages.
   *
   * @param bulkId (required)
   * @param smsUpdateStatusRequest (optional)
   * @return SmsBulkStatusResponse
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
   */
  public SmsBulkStatusResponse updateScheduledSmsMessagesStatus(
      String bulkId, SmsUpdateStatusRequest smsUpdateStatusRequest) throws ApiException {
    ApiResponse<SmsBulkStatusResponse> localVarResp =
        updateScheduledSmsMessagesStatusWithHttpInfo(bulkId, smsUpdateStatusRequest);
    return localVarResp.getData();
  }

  /**
   * Update scheduled SMS messages status. Change status or completely cancel sending of scheduled
   * messages.
   *
   * @param bulkId (required)
   * @param smsUpdateStatusRequest (optional)
   * @return ApiResponse&lt;SmsBulkStatusResponse&gt;
   * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
   *     response body
   * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
   */
  public ApiResponse<SmsBulkStatusResponse> updateScheduledSmsMessagesStatusWithHttpInfo(
      String bulkId, SmsUpdateStatusRequest smsUpdateStatusRequest) throws ApiException {
    okhttp3.Call localVarCall =
        updateScheduledSmsMessagesStatusValidateBeforeCall(bulkId, smsUpdateStatusRequest, null);
    Type localVarReturnType = new TypeToken<SmsBulkStatusResponse>() {}.getType();
    return localVarApiClient.execute(localVarCall, localVarReturnType);
  }

  /**
   * Update scheduled SMS messages status (asynchronously). Change status or completely cancel
   * sending of scheduled messages.
   *
   * @param bulkId (required)
   * @param smsUpdateStatusRequest (optional)
   * @param _callback The callback to be executed when the API call finishes
   * @return The request call
   * @throws ApiException If fail to process the API call, e.g. serializing the request body object
   * @see <a href="https://www.infobip.com/docs/sms">Learn more about SMS channel and use cases</a>
   */
  public okhttp3.Call updateScheduledSmsMessagesStatusAsync(
      String bulkId,
      SmsUpdateStatusRequest smsUpdateStatusRequest,
      final ApiCallback<SmsBulkStatusResponse> _callback)
      throws ApiException {

    okhttp3.Call localVarCall =
        updateScheduledSmsMessagesStatusValidateBeforeCall(
            bulkId, smsUpdateStatusRequest, _callback);
    Type localVarReturnType = new TypeToken<SmsBulkStatusResponse>() {}.getType();
    localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
    return localVarCall;
  }
}