package com.springinaction.ConditionalBean;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MagicBeanTest {

    @Test
    public void magicBeanExists() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MagicBean magicBean = context.getBean(MagicBean.class);
        Assert.assertNotNull(magicBean);
        magicBean.magic();
    }
}