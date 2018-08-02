package com.springinaction.wiringByJavaCode;



public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    public void setCompactDisc(CompactDisc cd){
        this.cd = cd;
    }
    public void play() {
        cd.play();
    }
}
