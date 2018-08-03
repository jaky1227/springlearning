package com.springinaction.Chapter3.PrimaryBean;

public class Food {
    private Dessert dessert;

    public void setDessert(Dessert dessert){
        this.dessert = dessert;
    }

    public void eatFood(){
        dessert.dessertType();
    }
}
