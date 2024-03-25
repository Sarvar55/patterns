package com.sarvar.adapter.v3;

public class Apiv1Impl implements Api1 {

    @Override
    public String getUserNameById(Long Id) {
        return String.valueOf(Id);
    }

}
