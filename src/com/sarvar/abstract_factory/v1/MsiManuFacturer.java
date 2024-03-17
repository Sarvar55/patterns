package com.sarvar.abstract_factory.v1;

public class MsiManuFacturer extends Company {

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }
}
