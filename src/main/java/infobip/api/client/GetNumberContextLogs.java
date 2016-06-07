package infobip.api.client;

import com.google.gson.GsonBuilder;

import infobip.api.config.Configuration;
import infobip.api.config.FormattedDate;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.nc.logs.NumberContextLogsResponse;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class GetNumberContextLogs {
    private final Configuration configuration;

    public GetNumberContextLogs(Configuration configuration) {
        this.configuration = configuration;
    }

    interface GetNumberContextLogsService {
        @GET("/number/1/logs")
        NumberContextLogsResponse execute(@Query("to") java.lang.String to, @Query("bulkId") java.lang.String[] bulkId, @Query("messageId") java.lang.String[] messageId, @Query("generalStatus") java.lang.String generalStatus, @Query("sentSince") FormattedDate sentSince, @Query("sentUntil") FormattedDate sentUntil, @Query("limit") java.lang.Integer limit, @Query("mcc") java.lang.String mcc, @Query("mnc") java.lang.String mnc);
    }
    public NumberContextLogsResponse execute(java.lang.String to, java.lang.String[] bulkId, java.lang.String[] messageId, java.lang.String generalStatus, FormattedDate sentSince, FormattedDate sentUntil, java.lang.Integer limit, java.lang.String mcc, java.lang.String mnc) {
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