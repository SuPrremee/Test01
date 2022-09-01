package com.qiao.ooptest.demo33;

public class Boy {
    //属性
    private String name;
    private int age;

    //构造器
    public void Boy(){

    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //get、set方法
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    // 其他方法
    public void marry(Girl girl){
        System.out.println("我想娶"+girl.getName());
    }

    public void shout(){
        if (this.age >= 22){
            System.out.println("你可以去登记了");
        }else {
            System.out.println("先谈恋爱");
        }
    }

}
