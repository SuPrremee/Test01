package com.qiao.ooptest.demo04;
/*
构造方法 编写Java程序用于显示人的姓名和年龄。
 定义一个人类Person该类中应该有两个私有属性姓名name和年龄age。
 定义构造方法用来初始化数据成员。再定义显示display方法将姓名和年龄打印出来。
 在main方法中创建人类的实例然后将信息显示
 */
public class Test04 {
    public static void main(String[] args) {
        Person person = new Person("taojiabao",16);
        person.display();
        //方法1：get，set
//        Person person = new Person();
//        person.setName("taojiabao");
//        person.setAge(16);
//        person.display();
    }

}
