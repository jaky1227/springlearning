package com.springinaction.Chapter3.PrimaryBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class Conf {

    @Bean
    public Cake cake(){
        return new Cake();
    }

    @Bean
    @Primary
    public IceCream iceCream(){
        return new IceCream();
    }

    @Bean
    public Food food(Dessert dessert){
        Food food = new Food();
        food.setDessert(dessert);
        return food;
    }

}
