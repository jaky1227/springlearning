package com.springinaction.Chapter3.RuntimeInjection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConfigForAutoWiring.class)
public class Morron5Test {

    @Autowired
    private Morron5 morron5;

    @Test
    public void test(){
        morron5.play();
        Assert.assertNotNull(morron5);
    }


    @Test
    public void testForValue(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigForAutoWiring.class);
        Morron5 morron5ByContext = context.getBean(Morron5.class);
        morron5ByContext.play();
        Assert.assertNotNull(morron5ByContext);
    }
}