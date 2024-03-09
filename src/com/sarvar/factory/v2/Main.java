package com.sarvar.factory.v2;

public class Main {
    public static void main(String[] args) {

        Order order=new Order(new BurgerChef());
        order.prepareFood();
        Order order1=new Order(new PastaChef());
        order1.prepareFood();
    }
}
