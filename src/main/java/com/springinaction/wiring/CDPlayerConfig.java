package com.springinaction.wiring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = MarkerInterfaceForWiring.class)
public class CDPlayerConfig {
}
