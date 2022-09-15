package com.qiao.OOP.ooptest.demo30;

/**
 * 总结属性赋值的先后顺序
 * 默认初始化
 * 显式初始化
 * 构造器中的赋值
 * 通过"对象.方法"或"对象.属性"的方式赋值
 *
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("陶家宝",18);
        Student s2 = new Student("taojiabao",18);
        Student s3 = new Student("taojiabao",18,"Java");
        System.out.println(s1.name + s1.age);
        System.out.println(s2.name + s2.age);
        System.out.println(s3.name + s3.major);
    }
}
