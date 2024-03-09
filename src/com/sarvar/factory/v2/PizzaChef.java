package com.sarvar.factory.v2;

public class PizzaChef implements Chef {
    @Override
    public Food createFood() {
        return new Pizza();
    }
}
