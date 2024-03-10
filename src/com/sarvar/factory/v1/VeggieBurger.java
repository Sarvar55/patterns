package com.sarvar.factory.v1;

public class VeggieBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Veggie prepare");
    }
}
