package com.qiao.OOP.ooptest3.demo10;

/**
 * @ClassName PersonTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/9 7:53 AM
 * @Version 1.0
 **/

//
// 抽象类的匿名子类
//
//
//
//
//
//
//
//
//
public class PersonTest {
    public static void main (String[] args) {
        method(new Student());  //匿名对象
        Worker worker = new Worker();
        method1(worker);    //  非匿名的类非匿名的对象
        method1(new Worker());  //非匿名的类匿名的对象

        System.out.println("*****************************");

        //创建一个匿名子类的对象 : p
        Person p = new Person(){

            @Override
            public void sleep() {
                System.out.println("匿名子类的对象 : p的sleep方法");
            }
            @Override
            public void eat(){
                System.out.println("匿名子类的对象 : p的eat方法");
            }

            @Override
            public void breath() {
                System.out.println("匿名子类的对象 : p的breath方法");
            }
        };
        method1(p);
        System.out.println("*****************************");
        //创建匿名子类的匿名对象
        method1(new Person() {
            @Override
            public void eat() {
                System.out.println("匿名子类的匿名对象的eat方法");
            }

            @Override
            public void sleep() {
                System.out.println("匿名子类的匿名对象的sleep方法");
            }

            @Override
            public void breath() {
                System.out.println("匿名子类的匿名对象的breath方法");
            }
        });
    }

    public static void method1(Person p){
        p.eat();
        p.sleep();
        p.breath();
    }
    public static void method(Student s){

    }
}

class Worker extends Person{


    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void breath() {

    }
}