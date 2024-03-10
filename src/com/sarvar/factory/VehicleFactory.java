package com.sarvar.factory;

public class VehicleFactory {

    /*Bu Simple factory desing patter adlanır*/
    public Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("motor")) {
            return new Motor();
        } else {
            throw new IllegalArgumentException("Invalid vehicle type.");
        }
    }

}
