package com.sarvar.factory;

public class Motor implements Vehicle{

    @Override
    public void start() {
        System.out.println("Motorcycle is starting.");
    }
}
