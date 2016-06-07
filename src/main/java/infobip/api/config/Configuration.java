package infobip.api.config;

/**
 * @author dcutic
 */
public abstract class Configuration {
    protected String baseUrl;
    protected int connectionTimeout = 10000;
    protected int readTimeout = 10000;

    public abstract String getAuthorizationHeader();

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    public int getReadTimeout() {
        return readTimeout;
    }
}