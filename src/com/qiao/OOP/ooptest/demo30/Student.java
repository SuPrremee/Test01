package com.qiao.OOP.ooptest.demo30;

public class Student {
    //属性
    String name;
    int age;
    String school;
    String major;

    //构造器
    public Student(String n,int a){
        name = n;
        age = a;
    }
    public Student(String n,String s){
        name = n;
        school = s;
    }
    public Student(String n,int a,String m){
        name = n;
        age = a;
        major = m;
    }
}
