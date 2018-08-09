package com.springinaction.Chapter4.AspectJ;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



public class CriticAspectTest {

//    @Autowired
//    private Performance concert;
    @Test
    public void testAspectJ(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/aspectj/conf-aspectj.xml");
        Performance concert = context.getBean(JZhouConcert.class);
        concert.perform();

    }


}