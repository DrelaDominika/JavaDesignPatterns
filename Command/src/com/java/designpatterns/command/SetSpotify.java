package com.java.designpatterns.command;

public class SetSpotify {
    public void on(){
        System.out.println("Spotify is on");
    }

    public void off(){
        System.out.println("Spotify is off");
    }

    public void setGenre(String defaultGenre){
        System.out.println("Spotify is set to genre: "+defaultGenre);
    }
    public void setVolume(int volume){
        System.out.println("Spotify volume is set to: "+volume);
    }
}
