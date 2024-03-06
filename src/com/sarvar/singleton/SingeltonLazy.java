package com.sarvar.singleton;

public class SingeltonLazy {
    private static SingeltonLazy singeltonLazy;

    private SingeltonLazy() {
        //dışarıda erişime kapalı
    }

    public static SingeltonLazy getInstance() {
        if (singeltonLazy != null)
            return singeltonLazy;
        return new SingeltonLazy();
    }
}
/*
* Lazy Loading: lazy örnegi sadece ihtiyaç duyduğunda oluşturmasını sağlar.
* Bu uygulamanı başlatma sürecinde gereksiz kaynak kullanımını önler.
* Eğer instance büyük ve maliyetli bir kaynağa bağlıysa bu tasarruf sağlaya bilir.
*
* Eğer örnek oluşturmak zaman alıyosa ve ya uygulamanı belirli bir kısmınıda gerekli değil ise
* Lazy loading performansı yükselte bilir.
* Instance sadce kullanılmak istendiğinde oluşturulur yani.
* */