package com.sarvar.abstract_factory.v1;

public class MsiGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Msi gpu");
    }
}
