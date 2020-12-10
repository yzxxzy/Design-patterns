package com.chenyi.design.designpatterns.factoryMethod.abstractFactory.impl;

import com.chenyi.design.designpatterns.factoryMethod.Sender;

/**
 * 邮箱发送
 */
public class MailSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}
