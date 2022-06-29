package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:Example_test_data.properties")
public interface TestDataConfig extends Config {

    @Key("base.url")
    String baseUrl();
}