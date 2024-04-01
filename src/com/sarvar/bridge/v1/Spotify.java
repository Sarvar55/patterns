package com.sarvar.bridge.v1;

public class Spotify {

    public String playMusic(Music music) {
        System.out.println("Spotify" + music.sound + "şarkısı çalınıyor");
        return music.sound;
    }

}
