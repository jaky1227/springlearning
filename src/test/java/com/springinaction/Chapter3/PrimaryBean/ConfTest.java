package com.springinaction.Chapter3.PrimaryBean;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Conf.class)
public class ConfTest {

    @Autowired
    private Food food2;
    @Test
    public void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Conf.class);
        Food food = applicationContext.getBean(Food.class);
        Assert.assertNotNull(food);
        food.eatFood();
    }

    @Test
    public void testForAutoWired(){
        food2.eatFood();
        Assert.assertNotNull(food2);
    }




}