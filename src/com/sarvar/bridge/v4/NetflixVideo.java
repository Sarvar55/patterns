package com.sarvar.bridge.v4;

public class NetflixVideo extends Video {

    public NetflixVideo(VideoProcessor processor) {
        super(processor);

    }

    @Override
    public void play(String video) {
        processor.play(video);
    }

}
