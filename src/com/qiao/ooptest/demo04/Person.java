package com.qiao.ooptest.demo04;
//定义一个人类Person该类中应该有两个私有属性姓名name和年龄age。
public class Person {
    private String name;
    private int age;

    //构造器（构造方法）与类名相同
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println(name + age);
    }

    //    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void display(){
//        System.out.println(getName());
//        System.out.println(getAge());
//    }
}
