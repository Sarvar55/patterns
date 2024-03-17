package com.sarvar.abstract_factory.v2;

public class MsiGpu implements Component {
    @Override
    public void assemble() {
        System.out.println("Msi gpu.");
    }
}
