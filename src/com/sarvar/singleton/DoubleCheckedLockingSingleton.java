package com.sarvar.singleton;

public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton singleton;

    //Bu durumu önlemek için, volatile anahtar kelimesi kullanılarak instance değişkeninin güncel değerini her zaman ana bellekte tutmak önemlidir.
    private DoubleCheckedLockingSingleton() {

    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                // Tekrar kontrol yapılır, çünkü bir diğer iş parçacığı ilk kontrolün ardından içeri girebilir.
                // yani demek istedigim duşun sen otobusten iniyorsun önunde bir kişi var o senin de yerine kart basmış ise senin bir kere daha kart basmaya gerek yok
                // 3 tane thred var 1 girdi nesne yok 3 de ilk 2 si girmez bunu yapan volatile instance değerini güncel değerini tutar
                if (singleton == null) {
                    return new DoubleCheckedLockingSingleton();
                }
            }
        }
        return singleton;
    }
}

/*
*  Bu durumda, bir iş parçacığı instance'ı null olarak kontrol ettiği halde, diğer iş parçacıkları onu oluşturmuş ve atamış olabilir.
* Bu durumda, her bir iş parçacığı sırayla synchronized bloğa girecek, ancak içerideki null kontrolü artık geçersiz olacaktır, çünkü diğer iş parçacıkları tarafından oluşturulmuş bir örnek mevcut olacaktır.

Bu durumu önlemek için, volatile anahtar kelimesi kullanılarak instance değişkeninin güncel değerini her zaman ana bellekte tutmak önemlidir.
* volatile anahtar kelimesi, değişkenin değerini ana bellekte korur ve bir iş parçacığı tarafından yapılan değişikliklerin diğer iş parçacıkları tarafından hemen görülmesini sağlar.
*
* */

/*
 *  Volatile anahtar sözcüğü, iş parçacıklarının en son değerlere erişmesini sağlar ve iş parçacıklarının
 * beklemesini gerektirmez. Bu nedenle, aşağıdaki kodda,
 * iş parçacıklarının kontrol edilmesi ve nesne oluşturulmadan önce beklemeleri gerekmez:
 * */