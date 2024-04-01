package com.sarvar.bridge.v1;

public class Music {
    String sound;
    String songName;

    public Music(String sound, String songName) {
        this.sound = sound;
        this.songName = songName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
