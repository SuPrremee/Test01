package com.qiao.OOP.ooptest3.demo10;

/**
 * @ClassName AbstractTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/8 7:52 PM
 * @Version 1.0
 **/
//
// abstract关键字的使用
// 1. abstract：抽象的
// 2. abstract可以用来修饰的结构：类、方法
//
// 3. abstract修饰类：抽象类
//          > 此类不能实例化
//          > 抽象类中一定有构造器，便于子类实例化时调用（设计：子类对象实例化全过程）
//          > 开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作
//
//
//
//
// 4.abstract修饰方法：抽象方法
//          > 抽象方法只有方法的声明，没有方法体
//          > 包含抽象方法的类，一定是一个抽象类。反之，抽象类中可以没有抽象方法的。
//          > 若子类重写类父类中的所有的抽象方法后，此类方可实例化
//            若子类没有重写父类中的所有的抽象方法，则子类也是一个抽象类，需要使用abstract修饰
//
// 5.abstract使用上的注意点：
//      1. abstract不能用来修饰：属性、构造器等结构
//      2. abstract不能用来修饰私有方法、静态方法、final的方法、final的类
//
//
//
//
public class AbstractTest {
    public static void main(String[] args) {
        //一旦Person类抽象了，就不可实例化
        //PersonTest p = new PersonTest();
        //p.eat();
    }
}

abstract class Creature{
    public abstract void breath();
}
abstract class Person extends Creature{
    String name;
    int age;

    public Person(){

    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public abstract void eat();
    public  void walk(){
        System.out.println("人走路");
    }
    //抽象方法
    public abstract void sleep();
}

class Student extends Person{
    public Student(){
        super();
    }

    public Student (String name, int age){
        super(name, age);
    }
    public void sleep(){
        System.out.println("学生睡觉");
    }

    public void eat(){
        System.out.println("学生应该吃饭");
    }

    @Override
    public void breath() {
        System.out.println("学生应该呼吸新鲜空气");
    }
}
//处理方式二：
//abstract class Student extends PersonTest {
//    public Student(String name, int age) {
//        super(name, age);
//    }
//}