package com.sarvar.adapter;

public class Main {

    public static void main(String[] args) {

        TransferTransaction transaction = new TransferTransaction();
        transaction.setAmount(10);
        transaction.setFromIban("1");
        transaction.setToIban("10");

        IBankAPI adapter = new JSONBankAPIAdapter();
        adapter.executeTransaction(transaction);

        IBankAPI bankAPI = new XMLBankAPIAdapter();

    }

    /*
     * Hesaplar arası bir transfer yapan bir tane kutuphane yazıyoruz bu kutuphane
     * bu işlemi yaparken
     * XML kullanıyor.
     * Bir gün artık bizim Json ile çalışan servislermiz de olmaya başladı.
     */
}
