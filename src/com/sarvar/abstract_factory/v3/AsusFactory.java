package com.sarvar.abstract_factory.v3;

import com.sarvar.abstract_factory.v3.Company;

public class AsusFactory extends Company {

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }

    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }
}
