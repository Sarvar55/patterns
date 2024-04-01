Imagine you are building a remote control system for different types of devices. You have various types of
of remote controls (eg. basic remote,advanced remote) and different types of devices(eg.,TV,radio). You want to ensure
that you can easily add new types of remote controls and devices without tightly coupling.

```java
//Implementer Interface
interface Device{
    void turnOn();
    void turnOff();
}


//Concrete Implementer 1
class TV implements Device{
    public void turnOn() {
        System.out.println("TV is turned on");
    }

    public void turnOff() {
        System.out.println("TV is turned off");
    }
}

// Concrete Implementor 2
class Radio implements Device {
    public void turnOn() {
        System.out.println("Radio is turned on");
    }

    public void turnOff() {
        System.out.println("Radio is turned off");
    }
}

abstract class RemoteControl{
    protected Device device;

     public RemoteControl(Device device) {
        this.device = device;
    }

    abstract void power();
}

// Refined Abstraction 1
class BasicRemoteControl extends RemoteControl {
    public BasicRemoteControl(Device device) {
        super(device);
    }

    public void power() {
        System.out.println("Basic Remote: Powering the device...");
        device.turnOn();
    }
}

// Refined Abstraction 2
class AdvancedRemoteControl extends RemoteControl {
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Advanced Remote: Muting the device...");
        device.turnOff();
    }
}

// Usage
public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl basicRemote = new BasicRemoteControl(tv);
        basicRemote.power(); // Output: Basic Remote: Powering the device... TV is turned on

        Device radio = new Radio();
        RemoteControl advancedRemote = new AdvancedRemoteControl(radio);
        advancedRemote.mute(); // Output: Advanced Remote: Muting the device... Radio is turned off
    }
}
```

Device is the Implementor interface, defining the operations for different types of devices.

TV and Radio are concrete implementations of the Device interface.

RemoteControl is the Abstraction class, acting as a bridge between different types of remote controls and devices.

BasicRemoteControl and AdvancedRemoteControl are refined abstractions, providing different functionalities for remote controls.
