package com.qiao.ooptest.demo05;
/*
06.get方法和set方法 定义一个类该类有一个私有成员变量通过构造方法将其进行赋初值并提供该成员的getXXX()和setXXX()方法
提示假设有private String name;则有
 */
public class Application {
    public static void main(String[] args) {
        Test05 test05 = new Test05();
        test05.setName("taojiabao");
        System.out.println(test05.getName());
    }
}

