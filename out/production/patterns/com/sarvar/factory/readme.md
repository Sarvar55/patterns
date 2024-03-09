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