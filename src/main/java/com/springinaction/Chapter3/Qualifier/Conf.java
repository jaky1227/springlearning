package com.springinaction.Chapter3.Qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Conf {

    @Bean
    @Qualifier("cheese")
    public Cake cake(){
        return new Cake();
    }

    @Bean
    @Qualifier("cold")
    @Creamy
    public IceCream iceCream(){
        return new IceCream();
    }



}
