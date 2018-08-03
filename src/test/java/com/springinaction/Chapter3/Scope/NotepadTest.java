package com.springinaction.Chapter3.Scope;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NotepadTest {

    @Test
    public void testForScope(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Notepad notepad1 = context.getBean(Notepad.class);
        notepad1.setColor("Red");
        System.out.println("notepad1 with color: " + notepad1.getColor());
        Notepad notepad2 = context.getBean(Notepad.class);
        notepad2.setColor("Pink");
        System.out.println("notepad1 with color: " + notepad1.getColor());
        System.out.println("notepad2 with color: " + notepad2.getColor());

    }

}