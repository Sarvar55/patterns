package com.sarvar.bridge.v3;

public class SMSMessage extends Message {

    public SMSMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    void send(String message) {
        messageSender.sendMessage(message);
    }

}
