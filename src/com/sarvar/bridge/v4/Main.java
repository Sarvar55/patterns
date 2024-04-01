package com.sarvar.bridge.v4;

public class Main {
    public static void main(String[] args) {

        Video video = new YoutubeVideo(new HDProcessor());
        video.play("deneme.mp4");
    }
}
