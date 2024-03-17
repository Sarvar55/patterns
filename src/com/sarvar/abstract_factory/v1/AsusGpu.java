package com.sarvar.abstract_factory.v1;

public class AsusGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Asus Component.");
    }
}
