# Adapter Desing Pattern

The Adapter design pattern is a structual pattern that allows the interface of an existing class to be used as another interface. Its acts as a bridge two incompatible interfaces , making them work together. This pattern involves a single class , known as the adapter which is responsible for joining functionalities of independent or incompatible interface.

Adapter pattern 3th part kutuphanleri kullanırken de kullanılır. Diyelim ki biz mernis ile kontrol yapacağız bu tc numarası doğru mu değil mi diye o zaman direk o servisi kodumuzun içine taşımak yerine onu abstraction edib Adapter patter ile o şekilde kullanıyoruz belki saah o servis çalışmayacak o zama biz gidib onu her yerden mi değiştireceğiz hayir Adapter pattern yazdığımız yere ya başka bir servis ya da kendimiz bir şey yazacağız ve yine kodumuz çalışmaya devam edecek yani değişim söz kunusu olduğunda sadece bir noktada olmuş olacak.

örnek kod

```java
public class MernisManagerAdepters implements CheckIfRealPerson {

    @Override
    public boolean checkInPerson(Gamer gamer) {
        IVLKPSPublicSoap client= new IVLKPSPublicSoap();
       try {
       return client.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),gamer.getFirstName(),gamer.getLastName(),gamer.getDeteOfBirth());
       }catch (Exception e){
        System.out.println(e.getMessage());
        return  false;
       }
    }
}
```
