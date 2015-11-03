package infobip.api.config;

/**
 * @author dcutic
 */
public abstract class Configuration {
    protected String baseUrl;

    abstract public String getAuthorizationHeader();

    public String getBaseUrl() {
        return baseUrl;
    }
}