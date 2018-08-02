package com.springinaction.wiringByJavaCode;




public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonly Hearts Club Band";

    private  String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
