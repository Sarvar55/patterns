# What is difference between The factory pattern and Abstract Factory Patter

### Factory Method Pattern

Bu desen, bir sınıfın alt sınıflarına nesne oluşturma sorumluluğunu devretme amacını taşır. Yani bir sınıf, nesnesini
oluşturmak istediğinde, bunu alt sınıflarına bırakır. Örneğin, bir belge oluşturma uygulamasında, farklı belge türlerini
oluşturmak için bir arayüz tanımlayabilir ve alt sınıfları bu arayüzü uygulayarak kendi belgelerini oluşturabilir.

````java
interface Document {
    void create();
}

class Resume implements Document {
    @Override
    public void create() {
        System.out.println("Resume document created.");
    }
}

class Report implements Document {
    @Override
    public void create() {
        System.out.println("Report document created.");
    }
}

abstract class DocumentCreator {
    abstract Document createDocument();
}

class ResumeCreator extends DocumentCreator {
    @Override
    Document createDocument() {
        return new Resume();
    }
}

class ReportCreator extends DocumentCreator {
    @Override
    Document createDocument() {
        return new Report();
    }
}

public class Main {
    public static void main(String[] args) {
        DocumentCreator creator = new ResumeCreator();
        Document document = creator.createDocument();
        document.create();  // Resume document created.
    }
}
````

