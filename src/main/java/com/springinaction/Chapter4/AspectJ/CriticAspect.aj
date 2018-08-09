package com.springinaction.Chapter4.AspectJ;

public aspect CriticAspect {
    public CriticAspect() {
    }
    pointcut performance():execution(* perform());

    after() : performance(){
        System.out.println(criticismEngine.getCriticism());
    }

    after() returning :performance() {
        System.out.println("Performance over");
        System.out.println(criticismEngine.getCriticism());
    }

    private CriticismEngine criticismEngine;

    public void setCriticismEngine(CriticismEngine criticismEngine){
        this.criticismEngine = criticismEngine;
    }


}
