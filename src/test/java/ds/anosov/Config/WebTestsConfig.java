package ds.anosov.Config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:Config/${launch}.properties"})
public interface WebTestsConfig extends Config {

    @Key("browser.name")
    String browserName();

    @Key("browser.version")
    String browserVersion();

    @Key("launch.type")
    String launchType();
}
