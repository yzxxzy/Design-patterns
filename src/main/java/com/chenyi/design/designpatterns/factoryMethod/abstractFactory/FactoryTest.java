package com.chenyi.design.designpatterns.factoryMethod.abstractFactory;

import com.chenyi.design.designpatterns.factoryMethod.Sender;

public class FactoryTest {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender produce = provider.produce();
        produce.Send();
    }


}
