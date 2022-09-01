package com.qiao.ooptest.demo37.bean;

/**
 * @ClassName Customer
 * @Description Customer为实体类，用来封装客户信息
 * 客户信息如下：
 * String name; //客户姓名
 * char gender; //性别
 * int age; //年龄
 * String phone;    //电话号码
 * String email;    //电子邮箱
 * @Author liuyuqiao
 * @Data 2022/8/30 10:14 PM
 * @Version 1.0
 **/
public class Customer {

    //属性
    private String name; //客户姓名
    private char gender; //性别
    private int age; //年龄
    private String phone;    //电话号码
    private String email;    //电子邮箱

    //构造器
    public Customer(){

    }

    //访问器方法
    public String getName() {
        return name;
    }

    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
