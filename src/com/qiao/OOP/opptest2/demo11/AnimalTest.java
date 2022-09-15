package com.qiao.OOP.opptest2.demo11;

import java.sql.Connection;

/**
 * @ClassName AnimalTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/4 1:32 AM
 * @Version 1.0
 **/

//多态性的使用举例一：
public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new Dog());
        test.func(new Cat());
    }

    //Animal animal = new Dog();
    public void func(Animal animal){
        animal.eat();
        animal.shout();
    }

    //如果没有多态性就需要写这两个方法去调用
//    public void func(Dog dog){
//        dog.eat();
//        dog.shout();
//    }
//
//    public  void func(Cat cat){
//        cat.eat();
//        cat.shout();
//    }
}
class Animal{
    public void eat(){
        System.out.println("动物：进食");
    }
    public void shout(){
        System.out.println("动物：叫");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("🐶：骨头");
    }
    public void shout(){
        System.out.println("🐶：汪汪");
    }
    //子类中重载父类的方法
//    public void eat(String food){
//        System.out.println("狗吃" + food);
//    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("🐱：骨头");
    }
    public void shout(){
        System.out.println("🐱：喵喵");
    }
}

//举例二：
class Order{
    public void method(Object obj){
    }
}

//举例三
class Driver{
    public void doData(Connection connection){  //connection = new MySQLConnection()
        //规范的步骤去操作数据
//        connection.method1();
//        connection.method2();
//        connection.method3();

    }
}
