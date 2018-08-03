package com.springinaction.Chapter3.RuntimeInjection;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BlankDiscTest {

    @Test
    public void testDisc(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        CompactDisc disc = context.getBean(CompactDisc.class);
        disc.play();
    }

}