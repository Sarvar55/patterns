package com.sarvar.factory;

public class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("car is starting.");
    }
}
