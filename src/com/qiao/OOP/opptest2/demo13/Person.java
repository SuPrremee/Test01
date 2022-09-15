package com.qiao.OOP.opptest2.demo13;

/**
 * @ClassName PersonTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/5 12:41 AM
 * @Version 1.0
 **/
public class Person {
    protected String name = "person";
    protected int age = 50;
    public String getInfo(){
        return "Name:" + name + "\n" + "age:" + age;
    }
}

class Student extends Person{
    protected String school = "pku";
    public String getInfo(){
        return "Name:" + name + "\n" + "age:" + age + "\n" + "school：" + school;
    }
}

class Graduate extends Student{
    public String major = "IT";
    public String getInfo(){
        return "Name:" + name + "\n" + "age:" + age + "\n" + "school：" + school + "\n" + "major：" + major;
    }
}
