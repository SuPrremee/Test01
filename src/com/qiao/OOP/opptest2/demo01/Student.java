package com.qiao.OOP.opptest2.demo01;

/**
 * @ClassName Student
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/2 4:52 PM
 * @Version 1.0
 **/
public class Student extends Person{
    //Person父类中定义过就不用在在子类中再写
//    String name;
//    int age;
    String major;
    public Student(){

    }
    public Student(String name,int age,String major){
        this.name = name;
        //this.age = age;
        setAge(age);
        this.major = major;
    }

//    public void eat(){
//        System.out.println("吃饭");
//    }
//
//    public void sleep(){
//        System.out.println("睡觉");
//    }
    public void study(){
        System.out.println("学习");
    }

    public void show(){
        //System.out.println("姓名：" + name + ",年龄：" + setAge(age););
    }
}
