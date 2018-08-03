package com.springinaction.Chapter3.RuntimeInjection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/com/soundsystem/app.properties")
@ComponentScan
public class ConfigForAutoWiring {
}
