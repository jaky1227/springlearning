package com.springinaction.Chapter4.AspectByXml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/com/aspectByXml/audience-aspect.xml")
public class AudienceTest {

    @Autowired
    private Performance concert;

    @Autowired
    private DefaultEnCoreable defaultEnCoreable;

    @Test
    public void testConcert(){
        concert.perform();
        Encoreable encoreable =(Encoreable)concert;
        encoreable.performEncore();
        defaultEnCoreable.performEncore();
    }

}