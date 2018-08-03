package com.springinaction.Chapter3.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Food {
    private Dessert dessert;

    @Autowired
    @Qualifier("cold")
    @Creamy
    public void setDessert(Dessert dessert){
        this.dessert = dessert;
    }

    public void eatFood(){
        dessert.dessertType();
    }
}
