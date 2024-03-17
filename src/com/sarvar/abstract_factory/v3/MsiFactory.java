package com.sarvar.abstract_factory.v3;

public class MsiFactory extends Company {
    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }

    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }
}
