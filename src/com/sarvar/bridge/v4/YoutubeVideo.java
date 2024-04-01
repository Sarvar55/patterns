package com.sarvar.bridge.v4;

public class YoutubeVideo extends Video {

    public YoutubeVideo(VideoProcessor processor) {
        super(processor);
    }

    @Override
    public void play(String video) {
        System.out.println("youtube");
        processor.play(video);
    }

}
