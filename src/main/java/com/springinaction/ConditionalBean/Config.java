package com.springinaction.ConditionalBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/com/magicBean/magic.properties")
public class Config {

    @Autowired
    Environment env;
    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean(){
        MagicBean magicBean = new MagicBean();
        magicBean.setColor(env.getProperty("magicBean.color","Black"));
        return magicBean;
    }
}
