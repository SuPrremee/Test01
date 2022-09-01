package com.qiao.ooptest.demo31;

/**
 * JavaBean是一种Java语言写成的可重用组件
 * 所谓JavaBean，是指符合如下标准的Java类：
 *     >类是公共的
 *     >有一个无参的公共的构造器
 *     >有属性，且有对应的get、set方法
 */
public class Customer {
    //属性
    private int id;
    private String name;

    //构造器
    public Customer(){

    }

    //get,set方法
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
