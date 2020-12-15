package com.chenyi.design.designpatterns.adapter.classAdapter;

import com.chenyi.design.designpatterns.adapter.Targetable;

/**
 * 类的适配器模式
 *
 * 当希望将一个类转换成满足另一个新接口的类时，可以使用类的适配器模式，创建一个新类，继承原有的类，实现新的接口即可。
 */
public class AdapterTest {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }

}
