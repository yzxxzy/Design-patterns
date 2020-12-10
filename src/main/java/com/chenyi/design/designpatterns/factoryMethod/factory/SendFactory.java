package com.chenyi.design.designpatterns.factoryMethod.factory;

import com.chenyi.design.designpatterns.factoryMethod.Sender;
import com.chenyi.design.designpatterns.factoryMethod.factory.impl.MailSender;
import com.chenyi.design.designpatterns.factoryMethod.factory.impl.SmsSender;
import com.chenyi.design.designpatterns.factoryMethod.factory.impl.WachtSender;


public class SendFactory {

    /**
     * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
     * @param type
     * @return
     */
    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }


    /**
     * 多个工厂方法模式，是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，
     * 而多个工厂方法模式是提供多个工厂方法，分别创建对象。
     * @return
     */
    public Sender moreProduceMail(){
        return new MailSender();
    }

    public Sender moreProduceSms(){
        return new SmsSender();
    }



    /**
     * 静态工厂方法模式
     * 总体来说，工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，
     * 可以通过工厂方法模式进行创建.
     */
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }


    public static Sender produceWacht(){
        return new WachtSender();
    }

}
