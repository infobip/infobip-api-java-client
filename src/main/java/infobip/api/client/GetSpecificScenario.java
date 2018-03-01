package infobip.api.client;

import infobip.api.config.Configuration;
import retrofit.*;
import retrofit.http.*;
import com.google.gson.GsonBuilder;
import retrofit.converter.GsonConverter;
import infobip.api.config.TimeoutClientProvider;
import infobip.api.model.omni.scenarios.Scenario;

/**
 * This is a generated class and is not intended for modification!
 */
public class GetSpecificScenario {
    private final Configuration configuration;

    public GetSpecificScenario(Configuration configuration) {
        this.configuration = configuration;
    }

    interface GetSpecificScenarioService {
        @GET("/omni/1/scenarios/{scenarioKey}")
        Scenario execute(@Path("scenarioKey") String scenarioKey);
    }
    public Scenario execute(String scenarioKey) {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(configuration.getBaseUrl())
                .setRequestInterceptor(getRequestInterceptor())
                .setConverter(new GsonConverter(new GsonBuilder()
                						.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
                						.create()))
                .setClient(new TimeoutClientProvider(configuration))
                .build();
        GetSpecificScenarioService service = restAdapter.create(GetSpecificScenarioService.class);
        return service.execute(scenarioKey);
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