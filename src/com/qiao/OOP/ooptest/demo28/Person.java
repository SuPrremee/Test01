package com.qiao.OOP.ooptest.demo28;

/**
 * 1.在Person类中添加构造器，利用构造器设置所有人的age属性初始化值都为18
 * 2.构造器添加name属性，使得每次创建Person对象的同时初始化对象的age属性和name属性
 */

public class Person {
    //属性
    private int age;
    private String name;
    //方法
    public int getAge() {
        return age;
    }

    public void setAge(int Age) {
        if (Age < 0 || Age > 130){
            //getAge();
            return;
        }else {
            age = Age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //构造器
    public Person(){
        age = 18;
        name = "taojiabao";
    }

    //构造器
    public Person(String s,int Age){
        age = Age;
        name = s;
    }
}