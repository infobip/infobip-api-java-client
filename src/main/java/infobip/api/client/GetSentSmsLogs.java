package infobip.api.client;

import infobip.api.config.Configuration;
import retrofit.*;
import retrofit.http.*;
import com.google.gson.GsonBuilder;
import retrofit.converter.GsonConverter;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.sms.mt.logs.SMSLogsResponse;
import infobip.api.config.FormattedDate;

/**
 * This is a generated class and is not intended for modification!
 */
public class GetSentSmsLogs {
    private final Configuration configuration;

    public GetSentSmsLogs(Configuration configuration) {
        this.configuration = configuration;
    }

    interface GetSentSmsLogsService {
        @GET("/sms/1/logs")
        SMSLogsResponse execute(@Query("from") String from, @Query("to") String to, @Query("bulkId") String[] bulkId, @Query("messageId") String[] messageId, @Query("generalStatus") String generalStatus, @Query("sentSince") FormattedDate sentSince, @Query("sentUntil") FormattedDate sentUntil, @Query("limit") Integer limit, @Query("mcc") String mcc, @Query("mnc") String mnc);
    }
    public SMSLogsResponse execute(String from, String to, String[] bulkId, String[] messageId, String generalStatus, FormattedDate sentSince, FormattedDate sentUntil, Integer limit, String mcc, String mnc) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        GetSentSmsLogsService service = restAdapter.create(GetSentSmsLogsService.class);
        return service.execute(from, to, bulkId, messageId, generalStatus, sentSince, sentUntil, limit, mcc, mnc);
    }

    private RequestInterceptor getRequestInterceptor() {
        return new RequestInterceptor() {
            @Override
            public void intercept(RequestFacade request) {
                if (configuration != null && configuration.getAuthorizationHeader() != null) {
                    request.addHeader("Authorization", configuration.getAuthorizationHeader());
                    request.addHeader("User-Agent", "Java-Client-Library");
                }
            }
        };
    }
}