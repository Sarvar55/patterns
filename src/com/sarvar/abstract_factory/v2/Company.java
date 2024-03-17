package com.sarvar.abstract_factory.v2;

public abstract class Company {

    public Component assebleGpu(String type) {
        Component gpu = createComponent(type);
        gpu.assemble();
        return gpu;
    }

    public abstract Component createComponent(String type);
}
