Şöyle bir senaryomus olsun biz video izlemek istiyoruz bunu Youtube,Netflix vs uygulamalar üzerinden izleye biliriz. Bu videoları da 4k,8K,720p gib kalitelerde izlemek istesek her birini farkli uygulamada o zaman her bir uygulama için Youtube4K,Youtube8K,Netflix4K diye mi yazacağız hayir bbu şekilde yazıcak olursak SOLID presipini bozmuş oluruz.

```java
// Implementor Interface
interface VideoProcessor{
    void process(String videoFile);
}

//concrete implementation
public class HDProcessor implements VideoProcessor{

    @Override
    public void process(String videoFile){

    }
}

//concrete implementation
public class UH4KProcessor implements VideoProcessor{

    @Override
    public void process(String videoFile){

    }

}
// Abstraction
public abstract class Video{
    VideoProcessor videoProcessor;

    public Video(VideoProcessor videoProcessor){
        this.videoProcessor=videoProcessor;
    }

    public abstract void play(String videoFile);
}

//Refined Abstraction
public class YoutubeVideo extends Video{

    public YoutubeVideo(VideoProcessor processor){
        super(processor);
    }
    @Override
    public void play(String videoFile){
        processor.process(videoFile);
    }
}

//Refined Abstraction
public class NetflixVideo extends Video{

    public YoutubeVideo(VideoProcessor processor){
        super(processor);
    }
    @Override
    public void play(String videoFile){
        processor.process(videoFile);
    }
}
public class Main {
    public static void main(String[] args) {
        Video youtubeVideo = new YoutubeVideo(new HDProcessor());
        youtubeVideo.play("abc.mp4");
        Video netflixVideo = new NetflixVideo(new UHD4KProcessor());
        netflixVideo.play("abc.mp4");
    }
}
```

Temel olarak soyutlama ve gerçekleştirim arasındaki ilişkinin “is a” ilişkisinden “has a” ilişkisine dönüştürülmesine dayalıdır.
Bunu bu şekilde yazdığımız zaman Video içinde composition pattern olmuş olury yani has-a lişikisi olmuş oluyor. Vidoe içinde Processor olmuş oluyor
