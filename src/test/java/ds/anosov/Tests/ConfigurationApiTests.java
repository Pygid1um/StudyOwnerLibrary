package ds.anosov.Tests;

import ds.anosov.Config.ApiTestsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConfigurationApiTests {

    @Test
    public void apiConfigTest() {
        ApiTestsConfig apiConfig = ConfigFactory.create(ApiTestsConfig.class, System.getProperties());

        assertThat(apiConfig.apiBaseUrl()).isEqualTo("https://www.cat.com/");
        assertThat(apiConfig.apiToken()).isEqualTo("1231jkll123##");

    }
}
