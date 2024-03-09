package com.sarvar.factory.v2;

public class BurgerChef implements Chef {
    @Override
    public Food createFood() {
        return new Burger();
    }
}
