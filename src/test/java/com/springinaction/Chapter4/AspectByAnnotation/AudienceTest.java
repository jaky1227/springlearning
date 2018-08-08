package com.springinaction.Chapter4.AspectByAnnotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class AudienceTest {

    @Autowired
    private Performance jZhouConcert;

    @Autowired
    private Encoreable defaultEncore;

    @Test
    public void testAop(){
//        jZhouConcert.perform();
        Encoreable encoreable = (Encoreable)jZhouConcert;
        encoreable.performEncore();
        defaultEncore.performEncore();
    }


}