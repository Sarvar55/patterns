package com.sarvar.factory.v1;

public class Main {
    public static void main(String[] args) {
        Restaurant beefRes = new BeefBurgerRestaurant();
        beefRes.orderBurger();
    }
    /*
    * use it if you have no idea of the exact types of the objects your code will work with
    * makes it easy to extends the product constrruction code independently from the rest of the
    * app
    *
    *
    * */
}
