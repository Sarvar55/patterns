Şimdi burada ana fikir şu ki iki tane şirket var biri MSI diğeri ise ASUS bu şirketler ikisi de Gpu üretiyor bizim
gönderdiğimiz instance değerine göre gidib o clasın methodunu çağırıyor o şirketin işlerini yapıyor. Buraya kadar güzel
The factory pattern kendi işini çok güzel yapıyıyor. Ikı tane şirket var her iki şirketin de aynı türden yaptığı işlem
var Gpu üretmek bizim de işlemimiz bu gpu üretmek.

````java
public class Main {
    public static void main(String[] args) {
        Company asusCompany = new AsusManuFactory();
        asusCompany.assembleGpu();
    }
}

public abstract class Company {

    public Gpu assembleGpu() {
        Gpu gpu = createGpu();
        gpu.assemble();
        return gpu;
    }

    public abstract Gpu createGpu();
}

public class AsusGpuFactory extends Company {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }
}

public class MsiGpuFactory extends Company {
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }
}

public interface Gpu {
    void assemble();
}

public class MsiGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Msi gpu.");
    }
}

public class AsusGpu implements Gpu {

    @Override
    public void assemble() {
        System.out.println("asus gpu.");
    }
}
````

_Ama bu şirketler Monitor üretmek istese o zaman_ona bakalım. Bu sefer alt claslarda if-else olmaya başlar sebeb ise
artık bir şirket birden fazla ürün geliştire biliyor önceden mesela ``MsiGpuFactory```clası sadece bir tane nesne
oluşturuyordu ama şimdi ise hem monitör hem de Gpu oluşturucak o zaman simpe factor method sub claslarda tekrar etmeye
başlar bakalım o nasıl oluyor.

````java
public class MsiGpuFactory extends Company {
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }
}
````

# Code

````java
//burası aslında bir önceki GPU sadece bir tane base gpu uyumusz olucağı için bu şekilde adlandırdım.
public interface Component {
    void assemble();
}

public class MsiGpuFactory extends Company {

    //işte burada bize gelen `` type`` bilgisine göre nesne oluşturuyoruz open closed direk 
    // bozuldu
    @Override
    public Component createComponent(String type) {
        if (type.equals("GPU"))
            return new MsiGpu();
        else
            return new MsiMonitor();
    }
}

public abstract class Company {

    public Component assebleGpu(String type) {
        Component gpu = createComponent(type);
        gpu.assemble();
        return gpu;
    }

    public abstract Component createComponent(String type);
}
````

Diğerleri de benzer bir yapıda.

Şimdi ise Abstract Factory pattern ile bu işlemi yapalım bu sefer bu şekilde değil de her şirketin ürettiği ürün için
bir tana ``ìnterface`` oluşturacağız. Abstract Factory Pattern:
Bu desen, bir nesne ailesini oluşturmak için kullanılır. Yani birden fazla birbirine bağımlı nesneyi bir arada
oluşturmanın bir yolunu sağlar.

````java
public interface Gpu {
    void assemble();
}

public interface Monitor {
    void assemble();
}

public class AsusGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Asus Gpu.");
    }
}

public class AsusMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("Asus Monitor");
    }
}

public class AsusFactory extends Company {

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }
}
````
