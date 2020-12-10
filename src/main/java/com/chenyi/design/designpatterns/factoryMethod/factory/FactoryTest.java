package com.chenyi.design.designpatterns.factoryMethod.factory;

import com.chenyi.design.designpatterns.factoryMethod.Sender;

public class FactoryTest {

    public static void main(String[] args) {
        /**
         * 普通工厂模式
         */
        SendFactory factory = new SendFactory();
        Sender sender1 = factory.produce("sms");
        sender1.Send();


        /**
         * 多个工厂模式
         */
        SendFactory factory1 = new SendFactory();
        Sender sender2 = factory1.moreProduceMail();
        sender2.Send();


        /**
         * 静态工厂模式
         */
        Sender sender = SendFactory.produceWacht();
        sender.Send();
    }

}
