package com.qiao.OOP.ooptest3.demo04;

/**
 * @ClassName SingletonTest1
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/7 2:39 PM
 * @Version 1.0
 **/

//
// 单例设计模式
// 如何实现
// 1.饿汉式
// 2.懒汉式
// 3.区分饿汉式和懒汉式
//   饿汉式：
//          坏处，对象加载时间过长
//          坏处：饿汉式是线程安全的
//   懒汉式：好处：延迟对象的创建
//          坏处：线程不安全--->到多线程时再修改
//
//
//
//
//
//
//
public class SingletonTest1 {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank2 == bank1);
    }
}

//饿汉式
class Bank{
    //1.私有化类的构造器
    private Bank(){

    }
    //2.内部创建类的对象
    //4.要求此对象也必须声明为静态的
    //可以理解类的属性
    private static Bank instance = new Bank();

    //3.提供公共的静态方法返回类的对象
    public static Bank getInstance(){
        return instance;
    }
}

//饿汉式
class Bank1{
    //1.私有化类的构造器
    private Bank1(){

    }
    //2.内部创建类的对象
    //4.要求此对象也必须声明为静态的
    //可以理解类的属性
    private static Bank1 instance = null;
    static {
        instance = new Bank1();
    }
    //3.提供公共的静态方法返回类的对象
    public static Bank1 getInstance(){
        return instance;
    }
}