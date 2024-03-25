package com.sarvar.adapter;

public class JSONBankAPIAdapter implements IBankAPI {

    private JSONBankAPI bankAPI;

    public JSONBankAPIAdapter() {
        this.bankAPI = new JSONBankAPI();
    }

    @Override
    public void executeTransaction(TransferTransaction transferTransaction) {
        bankAPI.executeTransaction(transferTransaction);
    }

}
