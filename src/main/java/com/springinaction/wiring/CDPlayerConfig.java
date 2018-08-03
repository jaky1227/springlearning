package com.springinaction.wiring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:cd-config.xml")
@ComponentScan(basePackageClasses = MarkerInterfaceForWiring.class)
public class CDPlayerConfig {
}
