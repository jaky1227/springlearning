package com.springinaction.ConditionalBean;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(MagicExistsCondition.class)
public class ConditionForComponent {

    public void test(){
        System.out.println("This is a test for conditional");
    }
}
