package com.sarvar.bridge.v3;

//concrete implementor
public class SMSSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("send message via SMS" + message);
    }

}
