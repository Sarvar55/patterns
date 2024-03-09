package com.sarvar.factory.v2;

public class PastaChef implements Chef {
    @Override
    public Food createFood() {
        return new Pasta();
    }
}
