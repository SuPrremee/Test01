package com.qiao.OOP.ooptest.demo28;

/**
 * 1.在Person类中添加构造器，利用构造器设置所有人的age属性初始化值都为18
 * 2.构造器添加name属性，使得每次创建Person对象的同时初始化对象的age属性和name属性
 */

public class PersonTest {
    public static void main(String[] args) {
        Person b = new Person();
        b.setAge(13);
        System.out.println(b.getAge());

        Person b2 = new Person("taojiabao",18);
        System.out.println(b2.getName() + b2.getAge());

    }
}