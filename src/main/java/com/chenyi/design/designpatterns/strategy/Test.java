package com.chenyi.design.designpatterns.strategy;

import com.chenyi.design.designpatterns.strategy.impl.StrategyImplA;
import com.chenyi.design.designpatterns.strategy.impl.StrategyImplB;

public class Test {

    public static void main(String[] args) {
        Context ctx = new Context(new StrategyImplA());
        ctx.doMethod();
        ctx = new Context(new StrategyImplB());
        ctx.doMethod();
        Strategy strategy = new StrategyImplA();
        strategy.method();
    }
}
