package com.sarvar.adapter;

public class XMLBankAPI implements IBankAPI {

    @Override
    public void executeTransaction(TransferTransaction transferTransaction) {
        System.out.println("sending with xml");
    }

}
