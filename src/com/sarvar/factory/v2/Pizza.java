package com.sarvar.factory.v2;

public class Pizza implements Food{

    @Override
    public void prepare() {
        System.out.println("Pizza is preparing.");
    }
}
