package ds.anosov.Config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:Config/api.properties")
public interface ApiTestsConfig extends Config {

    @Key("baseUrl")
    String apiBaseUrl();

    @Key("token")
    String apiToken();
}
