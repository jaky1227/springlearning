package com.springinaction.Chapter3.Qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cold")
public class Popsicle implements Dessert {

    public void dessertType() {
        System.out.println("This is a popsicle");
    }
}
