package com.qiao.OOP.opptest2.demo07;

/**
 * @ClassName Student
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/3 2:53 PM
 * @Version 1.0
 **/
public class Student extends Person{
    String major;
    String id = "1002";

    public Student(){
        super();
    }
    public Student(String major){
        super();
        this.major = major;
    }
    public Student(String name,int age,String major){
//        this.name = name;
//        this.age = age;
        super(name, age);
        this.major = major;
    }
    @Override
    public void eat(){
        System. out.println("学生多吃有营养的食物");
    }
    public void study(){
        System.out.println("学习");
        super.eat();
        this.eat();
    }
    public void show(){
        System.out.println("name = " + this.name + "，age = " + super.age);
        System.out.println("id = " + id);
        System.out.println("id = " + super.id);
    }
}
