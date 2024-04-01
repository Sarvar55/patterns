package com.sarvar.bridge.v4;

public abstract class Video {
    VideoProcessor processor;

    public Video(VideoProcessor processor) {
        this.processor = processor;
    }

    public abstract void play(String video);
}
