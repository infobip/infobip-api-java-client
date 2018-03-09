package infobip.api.client;

import infobip.api.config.Configuration;
import retrofit.*;
import retrofit.http.*;
import com.google.gson.GsonBuilder;
import retrofit.converter.GsonConverter;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.omni.campaign.Campaign;

/**
 * This is a generated class and is not intended for modification!
 */
public class GetCampaignDetails {
    private final Configuration configuration;

    public GetCampaignDetails(Configuration configuration) {
        this.configuration = configuration;
    }

    interface GetCampaignDetailsService {
        @GET("/omni/1/campaigns/{campaignKey}")
        Campaign execute(@Path("campaignKey") String campaignKey);
    }
    public Campaign execute(String campaignKey) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        GetCampaignDetailsService service = restAdapter.create(GetCampaignDetailsService.class);
        return service.execute(campaignKey);
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