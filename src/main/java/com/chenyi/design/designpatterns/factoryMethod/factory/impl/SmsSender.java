package com.chenyi.design.designpatterns.factoryMethod.factory.impl;

import com.chenyi.design.designpatterns.factoryMethod.Sender;

/**
 * 短信发送
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}
