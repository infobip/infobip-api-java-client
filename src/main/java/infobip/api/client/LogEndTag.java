package infobip.api.client;

import infobip.api.config.Configuration;
import retrofit.*;
import retrofit.http.*;
import com.google.gson.GsonBuilder;
import retrofit.converter.GsonConverter;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.conversion.EndTagResponse;

/**
 * This is a generated class and is not intended for modification!
 */
public class LogEndTag {
    private final Configuration configuration;

    public LogEndTag(Configuration configuration) {
        this.configuration = configuration;
    }

    interface LogEndTagService {
        @POST("/ct/1/log/end/{messageId}")
        EndTagResponse execute(@Path("messageId") String messageId);
    }
    public EndTagResponse execute(String messageId) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        LogEndTagService service = restAdapter.create(LogEndTagService.class);
        return service.execute(messageId);
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