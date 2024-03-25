package com.sarvar.adapter.v3;

public class Apiv1Adapter implements UserService {

    private Api1 api1;

    public Apiv1Adapter() {
        this.api1 = new Apiv1Impl();
    }

    @Override
    public String getUserNameById(Long Id) {
        return api1.getUserNameById(Id);
    }

}
