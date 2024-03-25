package com.sarvar.adapter;

public class JSONBankAPI implements IBankAPI {

    @Override
    public void executeTransaction(TransferTransaction transferTransaction) {
        System.out.println("sending with json");
    }

}
