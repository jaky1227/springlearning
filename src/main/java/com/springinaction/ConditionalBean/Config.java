package com.springinaction.ConditionalBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:conditionalBean.xml")
public class Config {

    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean(){
        MagicBean magicBean = new MagicBean();
        magicBean.setColor("red");
        return magicBean;
    }
}
