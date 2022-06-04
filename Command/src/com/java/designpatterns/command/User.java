package com.java.designpatterns.command;

public class User {

    public static void main(String[] args) {
	    RemoteControl remote = new RemoteControl();
	    SetSpotify setSpotify=new SetSpotify();

	    remote.setCommand((new SetSpotifyOnCommand(setSpotify)));
	    remote.pressButton();

		remote.setCommand((new SetSpotifyOffCommand(setSpotify)));
		remote.pressButton();
    }
}
