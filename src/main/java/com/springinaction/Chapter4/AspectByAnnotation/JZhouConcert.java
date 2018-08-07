package com.springinaction.Chapter4.AspectByAnnotation;

import org.springframework.stereotype.Component;

@Component
public class JZhouConcert implements Performance {

    public void perform() {
        System.out.println("Jay Zhou's concert begins !");
    }
}
