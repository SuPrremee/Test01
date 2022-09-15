package com.qiao.OOP.ooptest.demo08;

public class Person {
    //属性 == 成员变量  ==field ==域、字段
    String name;
    int age = 1;
    boolean isMale;

    //方法 == 成员方法 == 函数(C语言)
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void talk(String language){
        System.out.println("人可以说话 " + language);
    }
}
