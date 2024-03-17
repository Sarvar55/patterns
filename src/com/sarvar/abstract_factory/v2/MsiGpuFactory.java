package com.sarvar.abstract_factory.v2;

public class MsiGpuFactory extends Company {

    @Override
    public Component createComponent(String type) {
        if (type.equals("GPU"))
            return new MsiGpu();
        else
            return new MsiMonitor();
    }
}
