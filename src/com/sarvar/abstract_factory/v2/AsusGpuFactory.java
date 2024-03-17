package com.sarvar.abstract_factory.v2;

public class AsusGpuFactory extends Company {

    @Override
    public Component createComponent(String type) {
        if (type.equals("GPU")) {
            return new AsusGpu();
        } else {
            return new AsusMonitor();
        }
    }
}
