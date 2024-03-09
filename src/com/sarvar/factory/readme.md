# Factory Desing Pattern Nedir?
### If-Else ile Çalışan Factory

- Nesne oluşturma ve Konrol aynı yerde:
- Her yeni nesne eklediğimizde if-else yapısını bir şart daha eklememiz lazım
- kod Daha karmaşık ve daha az moduler

### Factory Desing pattern 
- Nesne oluşturma ve kontrol ayrı yerde
- Oluşturma için ayrı bir Sınıfta(Factory) taşınır,kontrol ve oluşturma ayrılır.
- Kod daha moduler ve genişleye bilir.
- Her yeni nesne oluşturmak için yeni bir alt sınıf oluşturmak gerektirir. Bu kodunuzu daha modüler ve genişleye bilir yapar.

Kod Karmaşıklığı:

Eğer uygulamanızda sınırlı sayıda durumu kontrol etmeniz gerekiyorsa ve durumlar basitse, if-else yapısı kullanılabilir. Ancak durumlar arttıkça ve kod karmaşıklığı arttıkça, Factory Design Pattern daha avantajlı olabilir.
Genişleyebilirlik:

Eğer uygulamanızda yeni durumlar veya nesneler eklenecekse ve bu durumları rahatça yönetmek istiyorsanız, Factory Design Pattern kullanmak daha uygun olabilir. Yeni nesneler eklemek sadece yeni bir sınıf oluşturmayı gerektirir.
Modülerlik:

Eğer kodunuzun daha modüler olmasını istiyorsanız ve her durumu veya nesneyi ayrı bir sınıfa taşıyarak birbirinden bağımsız hale getirmek istiyorsanız, Factory Design Pattern kullanmak tercih edilebilir.
Değişkenlik ve Esneklik:

Eğer uygulamanızdaki durumlar veya nesneler sık sık değişiyorsa ve bu değişikliklere hızla adapte olmanız gerekiyorsa, Factory Design Pattern daha esnek bir çözüm sunabilir.
SOLID Prensipleri:

Factory Design Pattern, SOLID prensiplerine (özellikle Open/Closed prensibi) daha iyi uyar ve kodunuzu daha sürdürülebilir ve genişleyebilir hale getirebilir.