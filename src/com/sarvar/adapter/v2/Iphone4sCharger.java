package com.sarvar.adapter.v2;

/**
 * Implements the Adaptee class: This class represents the
 * existing component with an incompatible interface. So this is the IPhone4s
 * charger that your friends has
 * 
 * 
 */
public class Iphone4sCharger implements Charger {

    @Override
    public void charge() {
        System.out.println("charging with 4s charger");
    }

}
