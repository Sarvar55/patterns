package com.sarvar.bridge.v3;

public class Main {
    public static void main(String[] args) {
        MessageSender messageSender = new EmailSender();
        messageSender.sendMessage("merhaba");

        Message message = new SMSMessage(messageSender);
    }
}
