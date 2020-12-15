package com.chenyi.design.designpatterns.builder;

public class Test {

    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(5);
    }

}
