package com.sarvar.adapter;

public class Main {

    public static void main(String[] args) {

        TransferTransaction transaction = new TransferTransaction();
        transaction.setAmount(10);
        transaction.setFromIban("1");
        transaction.setToIban("10");

        JSONBankAPIAdapter adapter = new JSONBankAPIAdapter();
        adapter.executeTransaction(transaction);

    }

    /*
     * Hesaplar arası bir transfer yapan bir tane kutuphane yazıyoruz bu kutuphane
     * bu işlemi yaparken
     * XML kullanıyor.
     * Bir gün artık bizim Json ile çalışan servislermiz de olmaya başladı.
     */
}
