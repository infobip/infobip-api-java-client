package infobip.api.config;

/**
 * Created by denis on 13.07.15..
 */
public class ApiKeyAuthConfiguration extends Configuration {

    private final String apiKey;

    public ApiKeyAuthConfiguration(String baseUrl, String apiKey) {
        this.baseUrl = baseUrl;
        this.apiKey = apiKey;
    }

    @Override
    public String getAuthorizationHeader() {
        return "Api " + apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }
}
