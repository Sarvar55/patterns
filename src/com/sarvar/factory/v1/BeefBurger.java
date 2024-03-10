package com.sarvar.factory.v1;

public class BeefBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("beef prepare");
    }
}
