package com.qiao.OOP.ooptest.demo27;

/**
 * 类的结构之三：构造器（或构造方法、constructor）的使用
 * 一、constructor的作用：
 *      创建对象
 *      可以初始化对象的属性
 * 二、说明：
 *      1.如果没有显式的定义类的构造器的话，则系统默认提供一个空参的构造器
 *      2.定义构造器的格式：权限修饰符 类名(形参列表){}
 *      3.一个类中定义的多个构造器。彼此构成重载
 *      4.一旦显式的定义了构造器之后，系统就不再提供默认的空参构造器
 *      5.一个类中，至少会有一个构造器
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建对象：new + 构造器
        Person p = new Person("taojiabao");
        Person p1 = new Person(18);
        p.eat();
        p.study();
        System.out.println(p.name);
        System.out.println(p1.age);
    }
}
class Person{
    //属性
    String name;
    int age;

    //方法
    public void eat(){
        System.out.println("人吃饭");
    }
    public void study(){
        System.out.println("人学习");
    }

    //构造器
    //显式的Person的构造器
    public Person(){
        System.out.println("显式的Person构造器");
    }
    public Person(String s){
        name = s;
    }

    public Person(int Age){
        age = Age;
    }
}