package infobip.api.client;

import com.google.gson.GsonBuilder;

import infobip.api.config.Configuration;
import infobip.api.config.FormattedDate;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.sms.mo.logs.MOLogsResponse;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * This is a generated class and is not intended for modification!
 * TODO: Point to Github contribution instructions
 */
public class GetReceivedSmsLogs {
    private final Configuration configuration;

    public GetReceivedSmsLogs(Configuration configuration) {
        this.configuration = configuration;
    }

    interface GetReceivedSmsLogsService {
        @GET("/sms/1/inbox/logs")
        MOLogsResponse execute(@Query("to") java.lang.String to, @Query("receivedSince") FormattedDate receivedSince, @Query("receivedUntil") FormattedDate receivedUntil, @Query("limit") java.lang.Integer limit, @Query("keyword") java.lang.String keyword);
    }
    public MOLogsResponse execute(java.lang.String to, FormattedDate receivedSince, FormattedDate receivedUntil, java.lang.Integer limit, java.lang.String keyword) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        GetReceivedSmsLogsService service = restAdapter.create(GetReceivedSmsLogsService.class);
        return service.execute(to, receivedSince, receivedUntil, limit, keyword);
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