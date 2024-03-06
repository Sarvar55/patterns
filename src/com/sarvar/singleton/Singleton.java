package com.sarvar.singleton;

/*
 * Desing patterlar sıkılıkla karşılaşmış  olduğumuz sorunlara
 * soyutlanmış bir şekilde çözüm üretirler.
 * patter demek bir sorun ve o sorunun  çüözümü demektir
 * Patternler 3 ana kategoriye ayrılmışdır.
 * 1. Creational
 * 2. Structial
 * 3. Behaveral
 *
 * 1. bu kategorini amacı genelde nesne oluştururken sorun ile karşılaşıyoruz bu o soruna çözum olmuş oluyor
 * 2 Yapısal: nesneler arasında ilişkiler arasında cıkan sorunları çözmek için kullanılır.
 * 3. Davranışsal: Neselerin çalışma zamanında davranışlarında değişiklik yaparkenn karşılaşılan genel çözumlar bu kategoride yer alır.
 * */

/*Ilgili nesneden bir tane olsun istiyorsak o zaman Singleton desing pattern kullana biliriz*/
// Davranışında da elli oldugu gibi bu bir creational bir pattern olarak geçer
public class Singleton {
    //v1: private Singleton singleton = new Singleton();
    // v2 private static Singleton singleton = new Singleton();
    private static Singleton singleton = new Singleton();


    private Singleton() {
    }

    //v1 method
    public Singleton getInstanceV1() {
        return new Singleton();
    }

    //v2 method
    public static Singleton getInstanceV2() {
        if (singleton != null)
            return singleton;
        return new Singleton();
    }
}
/*
 * v1: sorun şimdi yukarıda gördüğümüz gibi
 * private Singleton singleton = new Singleton(); tanımladık ama
 * hala problem şu bu değişkene ulaşmmak için bile yine de bizim nesne oluşturmaya ihtiyacımız var
 * e bunu yapamıyoruz ama o zaman demek ki akıla şöyle bir yöntem geliyor bizim bir yolumz daha var ki
 * nesne oluşturmadan da direk class isimi ile erişe biliriz static keyword ile o zaman hadi onu yapalım
 * */

/*
 * v2: şimdi evet bir sorun olmadan eriştik ama bir her defasında bu field'ı çağırdığımız zaman bizim için yeni bir nesne
 * oluşturmuş oluyor bu da bizim işimizi görmez yani o zaman direk constructoru public yapsaydık olurdu
 * ki zaten bu ile o aynı demek ki bizim nesneyi kontrolluü bir şekilde oluşturmamız lazım. akla gelen bir method constructor olmalı
 * */


/*
 * v1 method:
 * Bu method iş görür mu hayır
 * 1 sebep: instance bir method yani nesne oluşturmak lazım ki oluşturamayız
 * 2. sebep: yine her defasında bize yeni nesne dönucek
 * */

/*
* v2 method
* BU method çalışır mı çalışır sebeb ise hem class method yani class yuklendiğii an onla beraber yüklenir
* yani instance oluşturmadan direk kulanıla bilir ve içinde de kontrol var eger onceden bir nesne var ise onu dön yok ise
* yeni oluştur ve onu dön.
*
* */

/*

* */
