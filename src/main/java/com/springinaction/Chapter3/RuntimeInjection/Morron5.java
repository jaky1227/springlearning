package com.springinaction.Chapter3.RuntimeInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Morron5 implements CompactDisc {

    private String title;
    private String artist;

    public Morron5(@Value("${disc.title}") String title,
                   @Value("${disc.artist}") String artist){
        this.title = title;
        this.artist = artist;
    }
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
