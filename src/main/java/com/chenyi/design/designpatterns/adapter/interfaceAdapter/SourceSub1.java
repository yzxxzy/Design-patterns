package com.chenyi.design.designpatterns.adapter.interfaceAdapter;

public class SourceSub1 extends Wrapper2 {

    @Override
    public void method1() {
        System.out.println("the sourceable interface's first Sub1!");
    }
}
