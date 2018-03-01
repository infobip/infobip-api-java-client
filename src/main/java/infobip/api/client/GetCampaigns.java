package infobip.api.client;

import infobip.api.config.Configuration;
import retrofit.*;
import retrofit.http.*;
import com.google.gson.GsonBuilder;
import retrofit.converter.GsonConverter;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.omni.campaign.CampaignsResponse;

/**
 * This is a generated class and is not intended for modification!
 */
public class GetCampaigns {
    private final Configuration configuration;

    public GetCampaigns(Configuration configuration) {
        this.configuration = configuration;
    }

    interface GetCampaignsService {
        @GET("/omni/1/campaigns")
        CampaignsResponse execute(@Query("limit") Integer limit, @Query("page") Integer page);
    }
    public CampaignsResponse execute(Integer limit, Integer page) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        GetCampaignsService service = restAdapter.create(GetCampaignsService.class);
        return service.execute(limit, page);
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