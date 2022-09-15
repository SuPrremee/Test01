package com.qiao.OOP.ooptest.demo10;

public class Teacher {
    //属性
    String name = "taojiabao";
    int age = 30;
    int teachAge = 8;
    String course = "化学";

    //方法
    public void say(){
        System.out.print("姓名： " + name + "\n年龄： " + age + "\n教龄： " + teachAge + "\n课程： " + course);
    }
}
