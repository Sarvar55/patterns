package com.sarvar.factory;

public class Main {

    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();
        factory.createVehicle("car").start();

    }
}

/*
 * Factory desing pattern bir creational categoride yer alır.
 * Nesne oluşturma işlemi yapar.
 *
 *
 *
 * */
