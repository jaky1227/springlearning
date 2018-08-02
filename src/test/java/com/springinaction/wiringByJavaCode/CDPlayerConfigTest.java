package com.springinaction.wiringByJavaCode;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CDPlayerConfigTest {

    @Test
    public void notNull(){
//        ApplicationContext context = new AnnotationConfigApplicationContext(com.springinaction.wiringByJavaCode.CDPlayerConfig.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("wiringByxml.xml");

        CDPlayer cdPlayer = context.getBean(CDPlayer.class);
        cdPlayer.play();
        Assert.assertNotNull(cdPlayer);
    }

}