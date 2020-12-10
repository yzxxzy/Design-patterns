package com.chenyi.design.designpatterns.factoryMethod.abstractFactory;

import com.chenyi.design.designpatterns.factoryMethod.Sender;

public interface Provider {

    Sender produce();
}
