package com.sarvar.factory.v2;

public class Burger implements Food{

    @Override
    public void prepare() {
        System.out.println("Burger is being prepared.");
    }
}
