package dev.bananaback;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "dev.bananaback")
public class AppConfig {
    public static final double LOGIN_STAGE_WIDTH = 875;
    public static final double LOGIN_STAGE_HEIGHT = 570;

    public static final double MAIN_STAGE_WIDTH = 1440;
    public static final double MAIN_STAGE_HEIGHT = 1024;

    public static final double MAIN_STAGE_NAV_BAR_HEIGHT = 74;
}
