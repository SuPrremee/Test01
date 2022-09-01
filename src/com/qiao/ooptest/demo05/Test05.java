package com.qiao.ooptest.demo05;
/*
06.get方法和set方法 定义一个类该类有一个私有成员变量通过构造方法将其进行赋初值并提供该成员的getXXX()和setXXX()方法
提示假设有private String name;则有
 */
public class Test05 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
