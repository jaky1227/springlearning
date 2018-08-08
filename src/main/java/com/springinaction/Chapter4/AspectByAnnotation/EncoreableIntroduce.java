package com.springinaction.Chapter4.AspectByAnnotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroduce {

    @DeclareParents(value = "com.springinaction.Chapter4.AspectByAnnotation.Performance+",
            defaultImpl = DefaultEnCoreable.class)
    public static Encoreable encoreable;


}
