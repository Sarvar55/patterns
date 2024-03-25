package com.sarvar.adapter;

public class XMLBankAPIAdapter implements IBankAPI {

    private XMLBankAPI bankAPI;

    public XMLBankAPIAdapter() {
        this.bankAPI = new XMLBankAPI();
    }

    @Override
    public void executeTransaction(TransferTransaction transferTransaction) {
        bankAPI.executeTransaction(transferTransaction);
    }

}
