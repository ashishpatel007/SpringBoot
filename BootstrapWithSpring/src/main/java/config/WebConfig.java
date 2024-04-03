package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * The main purpose of the @Configuration classes is to be sources of bean
 * definitions for the Spring IoC Container.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "controller")
public class WebConfig {
}
