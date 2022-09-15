package com.qiao.OOP.opptest2.demo01;

/**
 * @ClassName PersonTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/2 3:10 PM
 * @Version 1.0
 **/
public class Person extends Creature {
    String name;
    private int age;


    public Person(){

    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void method(){
        Student s = new Student();
        s.study();
    }

    private void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
        eat();
    }

    //设置访问器

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
