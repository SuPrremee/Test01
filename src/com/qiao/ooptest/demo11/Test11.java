package com.qiao.ooptest.demo11;

public class Test11 {
    public static void main(String[] args) {
        Person person= new Person();
        person.name = "taojiabao";
        person.age = 10;
        person.isMale = true;
        person.study();
        person.showAge();
        System.out.println(person.addAge(2));

    }
}
