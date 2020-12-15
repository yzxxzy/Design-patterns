package com.chenyi.design.designpatterns.adapter.classAdapter;

import com.chenyi.design.designpatterns.adapter.Source;
import com.chenyi.design.designpatterns.adapter.Targetable;

public class Adapter extends Source implements Targetable {

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
