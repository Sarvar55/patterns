package com.sarvar.bridge.v3;

//  Concrete Implementor 1
public class EmailSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("send message via email" + message);
    }

}
