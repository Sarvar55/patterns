# Bridge Pattern nedir ve nerelerde kullanılır

Bir sınıfın içirsinde bulunan elemanların çeşitlilik yaratdığı durumlarda oluşan karmaşayı çözmektedir.

Günümüzde bazı şirketler müşterilerine reklam veya bilgilendirme amaçlı bildirimler gönderebilmektedir. Bu bildirimler ise e-posta, SMS veya anlık mesajlaşma bildirimleri gibi yöntemlerle gerçekleşebilir. Biz de bu konuyu düşünerek sorunlu bir durum oluşturalım. Varsayalım ki şirketimiz göndereceği bildirimlerin içeriğini, bildirimin türüne göre değiştirmek istiyor. Örneğin, şirketimiz, anlık mesajlaşma ve SMS bildirimlerini düz yazı ile iletirken, e-posta bildirimlerini ise pdf olarak iletiyor olsun. Bu durumda toplamda 3 farklı bildirim yöntemi ve 2 farklı içerik tipi doğmakta. Bunları kartezyen bir liste haline getirelim.

- Anlık mesajlaşma ve düz yazı -> Mümkün
- Anlık mesajlaşma ve pdf -> Mümkün değil
- SMS ve düz yazı -> Mümkün
- SMS ve pdf -> Mümkün değil
- E-posta ve düz yazı -> Mümkün değil
- E-posta ve pdf -> Mümkün

Öncelikler bir `Enum` tanımlayalım ve içine bildirim tiplerimizi yazalım.

```java
public enum NotficationType{
    SMS,
    IM,
    EMAIL
}

public class NotificationManager {

    public void sendNotification(NotificationType notificationType) {
        if (NotificationType.SMS.equals(notificationType)) {
            System.out.println("Notification sent! (SMS + Text)");
        } else if (NotificationType.IM.equals(notificationType)) {
            System.out.println("Notification sent! (IM + Text)");
        } else if (NotificationType.EMAIL.equals(notificationType)) {
            System.out.println("Notification sent! (EMAIL + pdf)");
        } else {
            System.out.println("Please choose a valid type");
        }
    }
}

public class NotificationService {

    public static void main(String[] args) {
        sendNotification();
    }

    public static void sendNotification() {
        NotificationManager notificationManager = new NotificationManager();
        notificationManager.sendNotification(NotificationType.SMS);
        notificationManager.sendNotification(NotificationType.IM);
        notificationManager.sendNotification(NotificationType.EMAIL);
    }
}
```

BUradaki karmaşa NOtficationManager sınıfında yaşanmaktadır. Dikkat ederseniz sınıfı yeni bir bildirim türü ile genişletmek istediğimizde ana akışa dokunmak zorunda kalmaktayız. Üstelik burada birbirine uyumlu içerik ve yöntem kontrolü bulunmuyor.

```java
public class SMS{
    public void sendSMSNotfication(){
        System.out.println("sendSMSNotification");
    }
}
public class IM {
    public void sendIMNotification() {
        System.out.println("sendIMNotification");
    }
}

public class Email {
    public void sendEmailNotification() {
        System.out.println("sendEmailNotification");
    }
}

public class NotificationManagerModified {

    private SMS sms;
    private IM im;
    private Email email;

    public NotificationManagerModified() {
        this.sms = new SMS();
        this.im = new IM();
        this.email = new Email();
    }

    public void sendSMSNotification() {
        sms.sendSMSNotification();
    }

    public void sendIMNotification() {
        im.sendIMNotification();
    }

    public void sendEmailNotification() {
        email.sendEmailNotification();
    }
}

public static void sendNotificationModified() {
    var notificationManager = new NotificationManagerModified();
    notificationManager.sendSMSNotification();
    notificationManager.sendIMNotification();
    notificationManager.sendEmailNotification();
}
```

Görüldüğü üzere bu sınıfı fazla karar noktasında kurtarmış bulunuyoruz . Artık karar noktalarını tüketici sınıfına bırakmış olacağız.

BU akış bizi her ne kadar ana sınıfımızdanki karmaşadan kurtarsa da karmaşayı başka bir yere devretmil olduk. Bu yaklaşım asıl sorunu çözmemiş olur. Yani bizim farklı bir tasarıma ihtiyacımız vardır. Kaldı ki yeni bir yöntem veya içierik türü geldiğinde yeni methodlar eklememiz ve bu methodların yürütücek sınıfları manager sınıfına bağlı kılmamız gerekecektir.

Çözüm için uygulamamızı yeniden tasarlayalım.

```java
//interface implementor
public interface NotficationContent{
    String getContent();
}

public class Text implements NotficationContent{

    @Override
    public String getContent() {
        return "Text notification";
    }
}
//
public class Pdf implements NotificationContent {

    @Override
    public String getContent() {
        return "Pdf notification";
    }
}

public abstract NotficationMethod{
    NotficationContent content;
    public NotifictionMethod(NotificationContent content) {
        this.content = content;
    }

    abstract void sendNotfication();
}

public class SMS extends NotficationMethod{
    public SMS(NotficationContent content){
        super(content);
    }

    @Override
    public void sendNotification() {
        System.out.println("SMS Notification " + content.getContent());
    }
}

public class IM extends NotifictionMethod {

    public IM(NotificationContent content) {
        super(content);
    }

    @Override
    public void sendNotification() {
        System.out.println("IM Notification " + content.getContent());
    }
}

public class Email extends NotifictionMethod {

    public Email(NotificationContent content) {
        super(content);
    }

    @Override
    public void sendNotification() {
        System.out.println("Email Notification " + content.getContent());
    }
}

public class NotficationBridge{
    public void sendNotfication(NOtficationMethod method){
        method.sendNotfication();
    }

    public static void sendNotificationViaBridge() {

    NotificationBridge bridge = new NotificationBridge();

    Pdf pdf = new Pdf();
    Text text = new Text();

    IM instantMessage = new IM(text);
    SMS sms = new SMS(text);
    Email email = new Email(pdf);

    bridge.sendNotification(instantMessage);
    bridge.sendNotification(sms);
    bridge.sendNotification(email);
}
}
```

Özetlemek gerekirse farklı nesnelerin bir arada bir birinden bağımsız bir şekilde bir arada çalışmalarını sağlıyor.

Bir clası eger diğer objelerin birleştirip clasları çoğaltmak yerine implemantasyonları ayırıp sonra o clas içinde birleştiriyoruz. Aslında yukarıda bir nevi onu yaptık.

Biraz daha iyi anlamak için aşağıdaki kod örneğimize bakalım.

```java
public class Computer{
    Spotify sporify;
    LoudSpeaker speaker;


    public Computer(Spotify s,LoudSpeaker l){
        this.sporify=s;
        this.speaker=l;
    }

    public void playMusic(String music){
        speaker.soundMusic(spotify.playMusic(music));
    }
}

public class Spotify{

    public String playMusic(String music){
        System.out.println("music playing via spotify"+music);
        return music;
    }
}

public class LoudSpeaker{

    public void soundMusic(String sound){
        System.out.println("The song is sung through speakers");
    }
}
```

Buradakı koda bakıcak olursak aslında nesneler arasında `has-a` ilişkisi var. `SOLID` prensibi de bozulmuş eger ben yarın `Spotify` yerine `Fizy`
kullanmak istesem o zaman `Camputer` clası içine `Fizy` bağımlılığı mı ekleyceğim bu zaman `open-closed ve single responsible` bu class birden fazla iş yapıyor aynı zamanda güncellenmeye de açık değil. `Computer` clası da aynı zamanda `CamputerWithSpotifyAndLoudSpeaker` gibi bir şey.

Şimdi bunu daha iyi bir hale getirmeye çalışalım.

```java
// interface implementor
public interface MusicPlatform{
    String playMusic(String music);
}
//concrete implementor 1
public class Spotify implements MusicPlatform{

    @Override
    public String playMusic(String music){
        System.out.println("music playing via spotify"+music);
        return music;
    }
}
//concrete implementor 2
public class Fizy implements MusicPlatform{

    @Override
    public String playMusic(String music){
        System.out.println("music playing via fizy"+music);
        return music;
    }
}

public interface Speaker{
    void soundMusic(String music);
}

public class Headphone implements Speaker{

     @Override
    public void soundMusic(String sound){
        System.out.println("The song is sung through speakers");
    }

}

public abstract class Device{
    MusicPlatform platform;
    Speaker speaker;

    public Device(MusicPlatform platform,Speaker speaker){
        this.platform=platform;
        this.speaker=speaker;
    }

    abstract void playMusic(String music);
}

public class Computer extends Device{

    public Computer(MusicPlatform platform,Speaker speaker){
        super(platform,speaker);
    }

    @Override
    public void playMusic(String music){
        speaker.soundMusic(platform.playMusic(music));
    }
}

public class Main{
    public static void main(String ...args){
        var platform=new Spotify();
        var speaker=new Headphone();

        var camputer= new Computer(platform,speaker);
        camputer.playMusic("merhabalar ben bu yerlerden biriyim");
    }
}
```

işte bu şekilde uygulamanı daha da iyi bir şekilde yazmış olduk.
