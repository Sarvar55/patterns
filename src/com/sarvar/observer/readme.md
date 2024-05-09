# Observer Design Pattern

The Observer Desing Pattern is behavioral design pattern that defines a one-to-many dependency between objects so that
when one object(the subject)
changes state, all its dependents (observes ) are notified and updated automatically.

# What is Observer Design Pattern

````
It primarily deals with the interaction and communication between objects,
specifically focusing on how objects behave in response to changes 
in the state of the other objects.
````

- The pattern is concerned with defining a mechanisim for a group of objects to interact(etkileşim) based on changes in
  the state of one object(the subject). The observers' behavior is triggered by changes in the subject's state.

- It encapsulates the behavior of the dependent objects(observers) and allows for clean separation between the subject
  and its observers. This seperation (promotes)(teşvik etmek) a more modular and maintainable(sürdürülebilir) design.

- The pattern promotes(teşvik eder) loose coupling between the subject and its observers. The subject doesn't need to
  know the concrete classes of its observers, and observers can be added or removed without affecting the subject.

- The primary mechanism in the Observer Pattern is the notfication of observers when a change occurs. This notification
  mechanism facilitates(kolaylaştırmak) the dynamic and coordinated behavior of multip objects in response to changes in
  the subject.

# Real-world analogy of the Observer Design Pattern

Let us imagine a scenario where the weather station is observed by various smart devices. The weather station maintains
a list of registered devices. When there is a change in weather conditions, the weather station notifies(bildirir) all
devices about the update.

- Each device, (acts as a concrete observer(somut bir gözlemci olarak hareket eder)),interprets(yorumlar) and displays
  the information in its own way.
- The Observer Design Pattern facilitates a flexible and scalable system where adding new devices or weather stations
  doesn't disrupt(bozmak,dağıtmak) the overall communication, providing real-time and location-specifi weather updates
  to users.

# Components of Observer Design Patter

- Subject
- Concrete Subject
- Observer
- Concrete Observer

- Subject:The subject maintains a list of observer (subscriber or listeners). It provides methods to register and
  unregister observers dynamically and defines a method to notify observer of changes in its state.

3. Observer : defines an interface with an update method that concrete observers must implement and ensures a common or
   consisten way for concrete observer to recive udates from the subject. Concrete observers implement this
   interface,allowing them to react(tepki) to changes in the subject's state.
4. Concrete Subject: Concrete Subject are specific implementations of the subject. They hold the state or data that
   observers want to track. When this state changes,concrete subject notify their observers. For instance, if a weather
   station is the subject, specific weather station in different locations would be concrete subjects.
5. Concrete Observer: implements the observer interface. Thye register with a concrete subect and react when notified of
   a state change. When the subject's state change, the concrete observer's ``update()`` method is (invoked)(çağırmak),
   allowing it to take appropriate actions. In a practical example, a weather app on your smartphone is a concrete
   observer that reacts to changes from a weather station.

## Example

Consider a scenario where you have a weather monitoring system. Different parts of your app need to be updated when the
weather conditions change.

## Challenges or difficulties while implementing this system without Observer Design Pattern

- Components interested in weather updated would need direct references to the weather monitoring system,leading to
  right coupling.
- Adding or removing components that react to weather changes requires modifiying the core weather monitoring system
  code, making it hard to maintain.

## How Observer Pattern helps to solve above challenges?

The Observer Pattern helps decouple(ayrıştırmak,ayırmak) the weather monitoring system from the components interested in
weather updates. Each component can register as an observer, and when the weather changes, the observer are notified.
This way, adding or removing components doesn't affect the weather monitoring system.

1. Subject

- The ``subject`` interface outlines the operation a subject (like "weatherStatition") should support.
- ``addObserver`` and ``removeObserver`` are for managing the list of observers.
- ``notifyObservers`` is for informing(bilgilendirme) observers about _changes_.

````java
public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
````

2. Observer

- The ``òbserver`` interface defines a contract for objects that want to be notified about changes in the subject(""
  WeatherStation" in this case).
- It includes a method ``update`` that concrete observer must implement to receive and handle updates.

````java
public interface Observer {
    void update(String weather);
}
````

3. Concrete Subject

- ``WeatherStation`` is the concrete subject implementing the `subject` interface.
- It maintains a list of observers(""observers") and provides methods to manage this list.
- ``notifyObservers`` iterates through the observers and calls their `update` method, passing the current weather.
- ``serWeather`` method updates the weather and notifies observers of the change.

`````java
public class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String weather;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weather);
        }
    }

    public void setWeather(String newWeather) {
        this.weather = newWeather;
        notifyObservers();
    }
}
`````

4. Concrete Observer(Phone Display)

- ``PhoneDisplay`` is a concrete observer implementing the `observer` interface.
- It has a private field ``weather`` to store the latest weather.
- The ``update`` method sets the new weather and calls the `display` method.
- ``displlay`` prints the updated weather to the console.

````java
public class PhoneDisplay implements Observer {
    private String weather;

    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }

    private void display() {
        System.out.println("Phone Display: Weather updated - " + weather);
    }
}
````

## Usage

````java
public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer phoneDisplay = new PhoneDisplay();
        Observer tvDisplay = new TVDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(tvDisplay);

        // Simulating weather change
        weatherStation.setWeather("Sunny");

    }
}
````

## When to use the Observer Design Pattern?

- One-To-Many Dependence:
    - Use the Observer Pattern when there is a one-to-many relationship between objects,and changes in one object should
      notify multiple dependent objects.
    - This is particularly useful when changes in one object need to propagate(yaymak,bulaştırmak) to several other
      objects wiithout making them tightly coupled.
- Decoupling:
    - Use the Observer pattern to achieve loose coupling between objects.
    - This allows the subject(publisher) and observer(subscribers) to interact without being aware(farkında) of each
      other's specific details. It promotes a flexible and maintainable system.