package com.springinaction.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KightMainTest {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
//        Minstrel minstrel = context.getBean(Minstrel.class);
//        minstrel.singAfterQuest();
        context.close();

    }
}
