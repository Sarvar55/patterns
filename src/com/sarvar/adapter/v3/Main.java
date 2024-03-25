package com.sarvar.adapter.v3;

public class Main {
    public static void main(String[] args) {

        UserService service = new UserServiceImpl();
        service.getUserNameById(1L);

        /*
         * bu apini de UserService ile uyumlu bir şekile getirmek istediymiz zaman
         * adapter desing patterni kullanırıq
         */
        // UserService service2 = new Apiv1Impl();

        UserService service2 = new Apiv1Adapter();
        service2.getUserNameById(2L);
    }
}
