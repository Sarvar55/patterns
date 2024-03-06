package com.sarvar.singleton;


/*
 *
 *
 *
 *
 *
 *
 * */

public class SingletonEager {
    //Eager Loadding zamanı instance class yüklenirken oluşturulur
    private static SingletonEager singletonEager = new SingletonEager();

    private SingletonEager() {
        // Özel kurucu metot, dışarıdan erişime kapatılır.
    }

    public static SingletonEager getInstance() {
        return singletonEager;
    }
}

/*
* Performans: Eager Loading, uygulama başladığında örneği hemen oluşturarak, ilgili sınıfın kullanılmaya hazır olmasını sağlar.
*  Bu, uygulama çalıştığında örneği oluşturmak için herhangi bir gecikmeyi ortadan kaldırır ve performansı artırabilir.

Basit Kullanım: Eager Loading, örneği oluşturmayı ve hemen kullanılabilir kılmayı basitleştirir.
*  Kodu daha az karmaşık hale getirir ve kullanımı kolaylaştırır.
* */