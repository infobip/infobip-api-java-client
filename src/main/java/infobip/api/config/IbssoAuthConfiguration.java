package infobip.api.config;

/**
 * Created by denis on 13.07.15..
 */
public class IbssoAuthConfiguration extends Configuration {

    private final String ibssoToken;

    public IbssoAuthConfiguration(String baseUrl, String ibssoToken) {
        this.baseUrl = baseUrl;
        this.ibssoToken = ibssoToken;
    }

    @Override
    public String getAuthorizationHeader() {
        return "IBSSO " + ibssoToken;
    }

    public String getIbssoToken() {
        return ibssoToken;
    }
}
