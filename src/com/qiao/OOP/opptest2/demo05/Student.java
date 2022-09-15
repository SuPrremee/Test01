package com.qiao.OOP.opptest2.demo05;

/**
 * @ClassName Student
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/3 2:49 AM
 * @Version 1.0
 **/
public class Student extends Person{
    String major;
    public Student(){

    }
    public Student(String major){
        this.major = major;
    }
    public void study(){
        System.out.println("学习。专业是：" + major);
    }

    public void eat(){
        System.out.println("学生应该多吃有营养的食物");
    }

    public void show(){
        System.out.println("我是一个学生");
    }

    public String info(){
        return null;
    }

    public double info1(){
        return 1.0;
    }
}


