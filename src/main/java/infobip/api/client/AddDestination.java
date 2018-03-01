package infobip.api.client;

import infobip.api.config.Configuration;
import retrofit.*;
import retrofit.http.*;
import com.google.gson.GsonBuilder;
import retrofit.converter.GsonConverter;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.omni.campaign.Campaign;
import infobip.api.model.omni.campaign.Destinations;

/**
 * This is a generated class and is not intended for modification!
 */
public class AddDestination {
    private final Configuration configuration;

    public AddDestination(Configuration configuration) {
        this.configuration = configuration;
    }

    interface AddDestinationService {
        @PUT("/omni/2/campaigns/{campaignKey}/destinations")
        Campaign execute(@Path("campaignKey") String campaignKey, @Body Destinations bodyObject);
    }
    public Campaign execute(String campaignKey,Destinations bodyObject) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        AddDestinationService service = restAdapter.create(AddDestinationService.class);
        return service.execute(campaignKey, bodyObject);
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