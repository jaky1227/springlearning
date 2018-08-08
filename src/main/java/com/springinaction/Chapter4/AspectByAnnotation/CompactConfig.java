package com.springinaction.Chapter4.AspectByAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;


@Configuration
@EnableAspectJAutoProxy
public class CompactConfig {

    @Bean
    public CompactDisc sgtPeppers() {
        String title = "Sgt. Pepper's Lonely Hearts Club Band";
        String artist = "The Beatles";
        List<String> tracks = new ArrayList<String>();
        tracks.add("Lonely Hearts Club Bands");
        tracks.add("Getting Better");
        tracks.add("Lucy in the Sky with Diamonds");
        tracks.add("Fixing a Hole");
        tracks.add("Home");

        BlankDisc cd = new BlankDisc(title, artist, tracks);
        return cd;
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }


}
