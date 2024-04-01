package com.sarvar.bridge.v1;

public class Main {
    public static void main(String[] args) {
        Music music = new Music("salami salami salaa", "salami");
        Computer computer = new Computer();
        computer.playMusic(music);
    }
}
