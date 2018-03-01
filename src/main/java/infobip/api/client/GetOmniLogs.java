package infobip.api.client;

import infobip.api.config.Configuration;
import retrofit.*;
import retrofit.http.*;
import com.google.gson.GsonBuilder;
import retrofit.converter.GsonConverter;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.omni.logs.OmniLogsResponse;
import infobip.api.model.omni.OmniChannel;
import infobip.api.config.FormattedDate;

/**
 * This is a generated class and is not intended for modification!
 */
public class GetOmniLogs {
    private final Configuration configuration;

    public GetOmniLogs(Configuration configuration) {
        this.configuration = configuration;
    }

    interface GetOmniLogsService {
        @GET("/omni/1/logs")
        OmniLogsResponse execute(@Query("from") String from, @Query("to") String to, @Query("bulkId") String[] bulkId, @Query("messageId") String[] messageId, @Query("generalStatus") String generalStatus, @Query("channel") OmniChannel channel, @Query("sentSince") FormattedDate sentSince, @Query("sentUntil") FormattedDate sentUntil, @Query("limit") Integer limit, @Query("mcc") String mcc, @Query("mnc") String mnc);
    }
    public OmniLogsResponse execute(String from, String to, String[] bulkId, String[] messageId, String generalStatus, OmniChannel channel, FormattedDate sentSince, FormattedDate sentUntil, Integer limit, String mcc, String mnc) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        GetOmniLogsService service = restAdapter.create(GetOmniLogsService.class);
        return service.execute(from, to, bulkId, messageId, generalStatus, channel, sentSince, sentUntil, limit, mcc, mnc);
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