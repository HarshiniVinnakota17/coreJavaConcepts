package org.example;

public class Episode {
    int seriesNumber;
    int episodeNumber;
    void play(){
        System.out.println("Playing episode: "+ episodeNumber);
    }
    void skipIntro(){
        System.out.println("skipping intro....");
    }
    void skiptoNext(){
        System.out.println("Loading next episode....");
    }
}
