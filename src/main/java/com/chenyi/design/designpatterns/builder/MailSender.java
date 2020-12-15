package com.chenyi.design.designpatterns.builder;


/**
 * 邮箱发送
 */
public class MailSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}
