package tests;

import config.TestDataConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeEach;

import static helpers.WebDriverHelper.configureDriver;

public class BaseTest {

    public static final TestDataConfig testDataConfig = ConfigFactory.create(TestDataConfig.class, System.getProperties());

    @BeforeEach
    void setup() {
        configureDriver(testDataConfig.baseUrl());
    }
}