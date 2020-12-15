package com.chenyi.design.designpatterns.factoryMethod.abstractFactory;

import com.chenyi.design.designpatterns.factoryMethod.Sender;
import com.chenyi.design.designpatterns.factoryMethod.abstractFactory.impl.SmsSender;
import com.chenyi.design.designpatterns.factoryMethod.abstractFactory.impl.WachtSender;


public class SendWachtFactory implements Provider {

    @Override
    public Sender produce() {
        return new WachtSender();
    }
}
