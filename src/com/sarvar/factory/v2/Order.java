package com.sarvar.factory.v2;


public class Order {
    private Chef chef;

    public Order(Chef chef){
        this.chef=chef;
    }

    public void prepareFood() {
        Food food = chef.createFood();
        food.prepare();
    }

}
