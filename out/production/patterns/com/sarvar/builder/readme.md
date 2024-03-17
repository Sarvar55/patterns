# What is Builder Desing Pattern?

The Builder creational desing pattern. It allows to produces different types and representations of an object using the
same construction process. The Builder pattern is a dessing pattern used in software development to help create complext
object step by step. Imagine we have a ``Car`` class to create to simple car.

The main benefit of using The Builder pattern is that it makes your code more flexible and easier to understand. It also
allows you to create different variations of objects without (cluttering)(dağınıklık) your code with lots of different
constructors or methods.

````java
public class Car {
    private String brand;
    private String model;
    private String color;
    private int nrbDoors;
    private String screenType;
    private double height;
    private double weight;
}
````

initilazition of the many fields of this object is usually (buried)(gömülü) inside a monstrous(korkunç) constructor.

``Car car=new Car(id,brand,mdoel,color,nrbDoors,screenTYpe,weight,height);``
``Car car=new Car(id,brand,null,color,null,null,weight,height)``

We may not need to fill all the fields of an object.

Another option will be to create several overload constructor each time use the one we need.

```java
        new Car(id,screenType,weight,height);
        new Car(id,brand,model,color,nrbDoor);
        new Car(id,brand,screenType,color);
        new Car(id,brand,model);
```

but this way not clearly and lots of unnecessary constructors in your code. Here is when the builder pattern comes in.
This pattern suggests that we extract the object construction or creation code out of its own class.

````java
import com.sarvar.factory.Car;

public class CarBuilder {
    private int id;
    private String brand;
    private String model;
    private String color;

    public CarBuilder id(int id) {
        this.id = id;
    }

    public CarBuilder brand(String brand) {
        this.brand = brand;
    }

    public CarBuilder color(String color) {
        this.color = color;
    }

    public CarBuilder model(String model) {
        this.model = model;
    }

    public Car build() {
        return new Car(id, brand, model, color);
    }
}
````

Let's create another example class using Builder pattern. We'll create a simple class representing a ``Person`` with
optional attributes such as `name`, `age`, and `gender` . We'll use the Builder pettern to construct(inşa
etmek) `Person` objects in a flexible and readable way.

````java
public class Person {
    private String name;
    private int age;
    private String gender;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public static class Builder {
        private String name;
        private int age;
        private String gender;

        public Builder() {
            //Set default values if needed
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    public static void main(String[] args) {
        // Create a Person object using Builder pattern
        Person person = new Person.Builder()
                .name("John")
                .age(30)
                .gender("Male")
                .build();
    }
}
````

In this example , the ``Person`` class has three attributes:`name`,
`age`,and `gender` . We have a private constructor that takes a  `Builder`
object as an argument to construct a `Person` instance. We use a private constructor in the `Person` class to enforce(
zorlamak)
the creation of `Person` objects through the Builder pattern.
Making the constructor private prevents instance
of `Person` from being created using the `new`
keyword outside of the `Person` class itself. By making the constructor private, we ensure that only way to create
a `Person`
object is by using the `Builder` class, which provides a more flexible adn readable way to construct `Person` instance.
This helps to enforce the usage of the Builder pattern and encapsulate the construction logic within the `Person` class.

To create a `Person` object , you use the `Builder` class by chaining method calls to set the desired(istenen)
attributes. Fially , you call the ``build()``
method to obtain the constructed ``Person`` object.