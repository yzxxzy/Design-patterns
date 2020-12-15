package com.chenyi.design.designpatterns.factoryMethod.abstractFactory;

import com.chenyi.design.designpatterns.factoryMethod.Sender;
import com.chenyi.design.designpatterns.factoryMethod.abstractFactory.impl.SmsSender;


public class SendSmsFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
