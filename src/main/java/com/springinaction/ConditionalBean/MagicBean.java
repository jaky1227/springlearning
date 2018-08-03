package com.springinaction.ConditionalBean;

public class MagicBean {

    private String color;

    public void setColor(String color){
        this.color = color;
    }
    public void magic(){
        System.out.println("This is a magic bean with color: " +color);
    }
}
