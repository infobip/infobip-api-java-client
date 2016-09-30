package infobip.api.client;

import infobip.api.config.Configuration;
import retrofit.*;
import retrofit.http.*;
import com.google.gson.GsonBuilder;
import retrofit.converter.GsonConverter;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.nc.logs.NumberContextLogsResponse;
import infobip.api.config.FormattedDate;

/**
 * This is a generated class and is not intended for modification!
 */
public class GetNumberContextLogs {
    private final Configuration configuration;

    public GetNumberContextLogs(Configuration configuration) {
        this.configuration = configuration;
    }

    interface GetNumberContextLogsService {
        @GET("/number/1/logs")
        NumberContextLogsResponse execute(@Query("to") String to, @Query("bulkId") String[] bulkId, @Query("messageId") String[] messageId, @Query("generalStatus") String generalStatus, @Query("sentSince") FormattedDate sentSince, @Query("sentUntil") FormattedDate sentUntil, @Query("limit") Integer limit, @Query("mcc") String mcc, @Query("mnc") String mnc);
    }
    public NumberContextLogsResponse execute(String to, String[] bulkId, String[] messageId, String generalStatus, FormattedDate sentSince, FormattedDate sentUntil, Integer limit, String mcc, String mnc) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        GetNumberContextLogsService service = restAdapter.create(GetNumberContextLogsService.class);
        return service.execute(to, bulkId, messageId, generalStatus, sentSince, sentUntil, limit, mcc, mnc);
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