package ds.anosov.Tests;

import ds.anosov.Config.WebTestsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * 15. Библиотека Owner.
 */

public class ConfigurationWebTests {

    @Test
    public void webConfigTest() {
    WebTestsConfig webconfig = ConfigFactory.create(WebTestsConfig.class, System.getProperties());

    /** Если нужно запустить локально, то в консоли нужно выполнить команду: gradle clean test -Dlaunch=local
     * закомментировав четвертую строчку с удаленным URL.
     * Если нужно удаленно в Дженкинсе, то нужно создать файлик с проперти в прописать команду: gradle clean test -Dlaunch=remote
     * Закомментить строчку 3, разкомментить строчку 4, с удаленным URL и запушить, сделать в Дженкинсе сборку.
     */

    assertThat(webconfig.browserName()).isEqualTo("CHROME");
    assertThat(webconfig.browserVersion()).isEqualTo("100.0");
    assertThat(webconfig.launchType()).isEqualTo("");
    //assertThat(webconfig.browserVersion()).isEqualTo("https://user1:1234@selenoid.autotests.cloud/wd/hub/");

    }
}
