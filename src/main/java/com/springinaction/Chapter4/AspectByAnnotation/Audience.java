package com.springinaction.Chapter4.AspectByAnnotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Audience {

    @Pointcut("execution(* *.perform(..))")
    public void performance(){}



    @AfterReturning("execution(* *.performEncore(..))")
    public void afterPerformEncore(){
        System.out.println("Clap for encore");
    }

//    @Before("performance()")
//    public void silenceCellPhones(){
//        System.out.println("Silencing cell phone");
//    }
//
//    @Before("performance()")
//    public void takeSeats(){
//        System.out.println("Taking seats");
//    }
//
//    @AfterReturning("performance()")
//    public void applause(){
//        System.out.println("CLAP CLAP CLAP !!!");
//    }
//
//    @AfterThrowing("performance()")
//    public void demandRefund(){
//        System.out.println("Demanding a refund");
//    }

    @Around("performance()")
    public void aroundPerform(ProceedingJoinPoint jp){
        try{
            System.out.println("Silencing cell phone!");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("CLAP CLAP CLAP !!!");
        }catch (Throwable e){
            System.out.println("Demanding a refund");
        }

    }

}
