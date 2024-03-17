package com.sarvar.abstract_factory.v1;

public class Main {
    public static void main(String[] args) {
        Company asusCompany = new AsusManuFacturer();
        asusCompany.assembleGpu();
    }
}
