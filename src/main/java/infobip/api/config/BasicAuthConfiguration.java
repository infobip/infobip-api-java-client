package infobip.api.config;

import javax.xml.bind.DatatypeConverter;

/**
 * Created by denis on 13.07.15..
 */
public class BasicAuthConfiguration extends Configuration {

    private final String username;
    private final String password;

    public BasicAuthConfiguration(String baseUrl, String username, String password) {
        this.baseUrl = baseUrl;
        this.username = username;
        this.password = password;
    }

    public BasicAuthConfiguration(String username, String password) {
        this.baseUrl = "https://api.infobip.com";
        this.username = username;
        this.password = password;
    }

    @Override
    public String getAuthorizationHeader() {
        return "Basic " + encodeBase64();
    }

    private String encodeBase64() {
        String userPass = username + ":" + password;
        return DatatypeConverter.printBase64Binary(userPass.getBytes());
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
