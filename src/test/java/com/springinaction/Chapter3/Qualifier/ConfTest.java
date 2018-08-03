package com.springinaction.Chapter3.Qualifier;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Conf.class)
public class ConfTest {

    @Autowired
    private Food food;

    @Test
    public void testNotNull(){
        food.eatFood();
        Assert.assertNotNull(food);
    }
}