package com.sarvar.singleton;

public class ThreadSafeSingleton {

    private volatile static ThreadSafeSingleton singleton;

    private ThreadSafeSingleton() {

    }

    //v1
    public static ThreadSafeSingleton getInstanceV1() {
        if (singleton != null)
            return singleton;
        return new ThreadSafeSingleton();
    }

    //v2
    public static synchronized ThreadSafeSingleton getInstanceV2() {
        if (singleton == null) {
            return new ThreadSafeSingleton();
        }
        return singleton;
    }

}
/*
 * v1: biz hep uyğulammamızı tek thread olarak düşündük ama birden fazla thrad olsa ne yapacağız
 * yani uygulama içinde olan farklı thread içinde o nesneden bir tane üretilirse bud a bir sorun
 * o zaman bunu çözelim.
 * */

/*
 * v2: bu method ile sorunumuzu çözmüş olduk ama synchronized kwyword bize farklı bir sorun da getirmiş oldu
 * bu kelime biraz maliyetli sebeb ise 4 tane thread bu keywordu gorduğu anda kuyruğa girer ve
 * sıralı bir şekilde çalışmaya devam ederler. Aslında methodumuz çok giddi bir şekilde yavaşladı.
 * */

/*
* işte bu şekilde şimdi 4 tane thread gelse bile sadece 1 tane obje oluşmuş olucak
* ama synchronized keyword bize bir de maliyet sorunu ile de geliyor 4 tane thread geldi hepsi sıraya girer
* ama belki de nesne vardır onceden yani programın bir yereinde kullanılmış şimdi de hafızada o zaman boşuna beklemiş oluruz
* bunun için ise oluşturmadan bir blogu senkron yapıp ona göre kontrol yapa biliriz buna ise doublecheck diyorlar
* */
