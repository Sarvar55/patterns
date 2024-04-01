şimdi diyelim ki bir tane uygulama yazıyoruz bu uygulamada farkli ciaharlar üzerinden farkli uygulamalarda şarki denleyeceğimizi düşünelim bunu yapmak için v1 dosyası içinde bir yolu tercih ede biliriz . Ama bu yol bizim için effektiv bir yol değil sebebi ise bir bilgisayar Spotify üzerinden Hoparlor ile şarki söyleyecek diyeli ben sonra dedim ki hoparloer yerine kulaklı olsun dedim bu zaman gelib bir tane daha class mı oluşturucam kullaklık ile denleme yaptıran .
Ya da bu sefer de Spotify dan değil de Fizy den dinlemek istesem yine de farklı bir clas oluşturmak benim için kod tekrarı olmuş olucak ve bu iyi bir yöntem değil benim için.

```java
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


```
