package com.sarvar.factory.v1;

public abstract class Restaurant {

    public Burger orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    //bu method bu clası extend eden sub clasların bu methodu implement etmesi ile o methodun kendi içinde olan nesne oluşucak
    // Nesnelerin oluşturulmasını sub claslara devr ediyor .
    public abstract Burger createBurger();
}
