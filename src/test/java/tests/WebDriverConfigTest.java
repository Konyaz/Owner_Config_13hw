package tests;

import config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;

public class WebDriverConfigTest {

    @Test
    public void ConfigTest() {
        System.setProperty("webdriver.url", "https://user1:1234@selenoid.autotests.cloud/wd/hub/");
        WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

        AssertionsForClassTypes.assertThat(config.getURL().toString()).isEqualTo("https://user1:1234@selenoid.autotests.cloud/wd/hub/");
    }
}