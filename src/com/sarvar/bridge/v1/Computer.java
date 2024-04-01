package com.sarvar.bridge.v1;

public class Computer {

    Loudspeaker loudspeaker;
    Spotify spotify;

    public Computer() {
        this.loudspeaker = new Loudspeaker();
        this.spotify = new Spotify();
    }

    public void playMusic(Music music) {
        loudspeaker.playSound(spotify.playMusic(music));
    }

    public Spotify getSpotify() {
        return spotify;
    }

    public void setSpotify(Spotify spotify) {
        this.spotify = spotify;
    }

}
