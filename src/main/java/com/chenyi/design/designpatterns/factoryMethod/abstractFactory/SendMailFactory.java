package com.chenyi.design.designpatterns.factoryMethod.abstractFactory;

import com.chenyi.design.designpatterns.factoryMethod.Sender;
import com.chenyi.design.designpatterns.factoryMethod.abstractFactory.impl.MailSender;
import com.chenyi.design.designpatterns.factoryMethod.abstractFactory.impl.SmsSender;


public class SendMailFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }

}
