package com.springinaction.Chapter3.Scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Notepad {

    private String color;

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}
