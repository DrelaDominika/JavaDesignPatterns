package com.java.designpatterns.command;

public class SetSpotifyOffCommand implements Command{
    SetSpotify setSpotify;
    public SetSpotifyOffCommand(SetSpotify setSpotify){
        this.setSpotify=setSpotify;
    }

    @Override
    public void execute() {
        setSpotify.off();
    }
}
