package com.sarvar.factory.v2;

public class Pasta implements Food {
    @Override
    public void prepare() {
        System.out.println("Pasta being is prepared.");
    }
}
