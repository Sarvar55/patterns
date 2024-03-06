package com.sarvar.singleton;

public class Main {
    public static void main(String[] args) {

//        Singleton singleton=new Singleton();

        for (int i = 0; i < 10; i++) {
            Singleton singleton = Singleton.getInstanceV2();
            System.out.println(singleton.hashCode());
        }
        /* output
        1791741888
1791741888
1791741888
1791741888
1791741888
1791741888
1791741888
1791741888
1791741888
1791741888
        * */

        /*çıktıdan da görüleceği üzere hep 1 tane nese oluşmuş */
        /*
        * sebebi ise static class yüklendiği anda class ile beraber yüklenir
        * daha sora ise programın sonuna kadar kalır.
        * bu yüzden de constuctor 1 kere çalışır(private constructor sadece kendi içinde çağrıla bilir)
        * ve onda sonra zaten hep programın hafızasında oluuğu için ordan kullanılır(static alanda olucaktır static değişkenler)
        *
        * */
    }
}
