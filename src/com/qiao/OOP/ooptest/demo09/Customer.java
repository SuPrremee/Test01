package com.qiao.OOP.ooptest.demo09;

import java.util.Arrays;

/**
 * 类中当法的声明和调用
 * <p>
 * 方法：描述类应该具有的功能
 * 比如 Math类：sqrt()\random()
 * Scanner类
 * Arrays类
 */

/*
public void eat()
public void sleep(int hour)
public String getName()
public String getNation(String nathion)
 */
public class Customer {
    public static void main(String[] args) {
        int[] arrays = new int[]{9, 1, 5, 8, 4, 7};
        Customer1 p1 = new Customer1();
        p1.name = "taojiabao";
        p1.isMale = true;
        p1.eat();
        p1.sleep(5);
        System.out.println(p1.getName());
        System.out.println(p1.getNation("中国"));
        p1.sort(arrays);
    }
}

//客户类
class Customer1 {
    //属性
    String name;
    boolean isMale;

    //方法
    public void eat() {
        System.out.println("客户吃饭");
    }

    public void sleep(int hour) {
        System.out.println("休息了 " + hour + " 个小时");
    }

    public String getName() {
        return name;
    }

    public String getNation(String nathion) {
        String Info = "我的国籍是 " + nathion;
        return Info;
    }

    public void sort(int[] arrays) {
        Arrays.sort(arrays);
        for (int array : arrays) {
            System.out.print(array + " ");
        }
    }
}