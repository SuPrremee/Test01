package com.qiao.OOP.opptest2.demo02;

/**
 * @ClassName Student
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/3 12:29 AM
 * @Version 1.0
 **/
public class Student  extends Person{
    long number;
    int math;
    int english;
    int computer;

    public Student(){

    }

    public Student(String name, char sex, int age, long number, int math, int english, int computer) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.number = number;
        this.math = math;
        this.english = english;
        this.computer = computer;
    }
}
