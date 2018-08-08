package com.springinaction.Chapter4.AspectByAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Config {

    @Bean
    public Audience audience(){
        return new Audience();
    }

    @Bean
    public JZhouConcert jZhouConcert(){
        return new JZhouConcert();
    }

    @Bean
    public EncoreableIntroduce encoreableIntroduce(){
        return new EncoreableIntroduce();
    }
//    @Bean
//    public DefaultEnCoreable defaultEnCoreable(){
//        return new DefaultEnCoreable();
//    }
}
