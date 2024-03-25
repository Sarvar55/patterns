package com.sarvar.adapter.v3;

public class UserServiceImpl implements UserService {

    @Override
    public String getUserNameById(Long Id) {
        return String.valueOf(Id);
    }

}
