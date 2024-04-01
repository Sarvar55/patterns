package com.sarvar.bridge.v3;

public class EmailMessage extends Message {

    public EmailMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    void send(String message) {
        messageSender.sendMessage(message);
    }

}
