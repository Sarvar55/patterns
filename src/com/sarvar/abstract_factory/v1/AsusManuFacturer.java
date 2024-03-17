package com.sarvar.abstract_factory.v1;

public class AsusManuFacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }
}
