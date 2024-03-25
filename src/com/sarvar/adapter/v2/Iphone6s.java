package com.sarvar.adapter.v2;

public class Iphone6s implements IPhone {

    Charger Iphone4sTo6sAdapter;

    public Iphone6s(Charger iphone4sTo6sAdapter) {
        this.Iphone4sTo6sAdapter = iphone4sTo6sAdapter;
    }

    @Override
    public void onCharge() {
        Iphone4sTo6sAdapter.charge();
    }

}
