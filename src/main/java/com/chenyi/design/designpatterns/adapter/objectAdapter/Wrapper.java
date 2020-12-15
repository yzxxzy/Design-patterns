package com.chenyi.design.designpatterns.adapter.objectAdapter;

import com.chenyi.design.designpatterns.adapter.Source;
import com.chenyi.design.designpatterns.adapter.Targetable;

public class Wrapper implements Targetable {

    private Source source;

    public Wrapper(Source source){
        super();
        this.source = source;
    }
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }

    @Override
    public void method1() {
        source.method1();
    }

}
