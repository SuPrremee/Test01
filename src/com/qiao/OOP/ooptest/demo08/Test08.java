package com.qiao.OOP.ooptest.demo08;

public class Test08 {
    public static void main(String[] args) {
        //创建Person类对象
        //创建类的对象 = 类的实例化 = 实例化类
        Person p1 = new Person();
        //调用对象的结构：属性、方法
        //调用属性：对象.属性
        //调用方法:对象.方法
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);

        Person p2 = new Person();
        System.out.println(p2.name);
        Person p3 = p1;
        p3.age = 10;
        System.out.println(p3.age);
        System.out.println(p1.age);
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");

    }
}