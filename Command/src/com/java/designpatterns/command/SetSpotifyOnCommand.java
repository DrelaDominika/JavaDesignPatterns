package com.java.designpatterns.command;

public class SetSpotifyOnCommand implements Command{
    SetSpotify setSpotify;
    public SetSpotifyOnCommand(SetSpotify setSpotify){
        this.setSpotify=setSpotify;
    }

    @Override
    public void execute() {
        setSpotify.on();
        setSpotify.setGenre("Swedish Rap");
        setSpotify.setVolume(100);
    }
}
