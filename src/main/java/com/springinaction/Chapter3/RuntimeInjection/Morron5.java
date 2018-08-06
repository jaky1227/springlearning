package com.springinaction.Chapter3.RuntimeInjection;

public class Morron5 implements CompactDisc {

    private String title;
    private String artist;

    public Morron5( String title, String artist){
        this.title = title;
        this.artist = artist;
    }
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
