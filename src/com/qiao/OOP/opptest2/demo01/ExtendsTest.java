package com.qiao.OOP.opptest2.demo01;

/**
 * @ClassName ExtendsTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/2 4:56 PM
 * @Version 1.0
 **/
// 面向对象的特征之二：继承性
// 一、继承性的好处
//  1.减少了代码的冗余，提高了代码的复用性
//  2.便于功能的扩展
//  3.为以后多态性的使用提供了前提
//
// 二、继承性的格式
// class A extends B(){}
// A:子类，派生类，subclass
// B:父类，超类，基类，superclass
// B:父类，超类，基类，superclass
//
// 体现：一旦子类A继承B以后，子类中A就获取了父类中声明的结构：属性，结构
// 特别的，父类中声明为private的属性或方法，子类继承父类以后，仍然认为获取了父类中私有的结构。
// 只有因为封装性的影响，是的子类不能直接调用父类的结构而已
//
// 子类继承父类以后，还可以声明自己特有的属性或方法：实现功能的拓展；
// 子类和父类的关系，不同于子集和集合的关系
//
// 三、Java中关于继承的规定
// 1.一个类可以被多个子类继承。
// 2.Java中类的单继承性：一个类只能有一个父类：单继承
// 3.子父类是相对的概念
// 4.子类直接继承父类，称为直接父类，间接继承的父类称为：间接父类
// 5.子类继承父类以后，就获取了类直接父类以及所有间接父类中声明的属性和方法
// 6.如果我们没有显式的声明一个类的父类，则此类继承java.lang.Object类
// 7.所有的java类(除java.lang.Object类之外)都直接或间接的继承于java.lang.Object类
//
//
public class ExtendsTest {
    public static void main(String[] args) {
        Person p = new Person();
        //p.age = 1;
        //p.eat();
        Student s = new Student();
        s.setAge(10);
        s.name = "陶家宝";
        s.sleep();
        //s.show();
        s.breath();
        p.method();
        System.out.println(s.getAge());
        Creature creature = new Creature();
    }
}
