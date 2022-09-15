package com.qiao.OOP.opptest2.test;

/**
 * @ClassName Man
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/3 11:57 PM
 * @Version 1.0
 **/
public class Man extends Person {
    public Man(String name, int age) {
        super(name, age);
    }

    public void earnMoney(){
        System.out.println("男人负责挣钱养家");
    }

    public void eat(){
        System.out.println("男人多吃肉，长肌肉");
    }

    public void walk() {
        System.out.println("男人霸气的走路");
    }
}
