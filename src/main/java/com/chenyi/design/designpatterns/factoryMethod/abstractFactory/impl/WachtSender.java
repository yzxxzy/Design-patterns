package com.chenyi.design.designpatterns.factoryMethod.abstractFactory.impl;

import com.chenyi.design.designpatterns.factoryMethod.Sender;

/**
 * 微信发送
 */
public class WachtSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is wacht sender!");
    }
}
