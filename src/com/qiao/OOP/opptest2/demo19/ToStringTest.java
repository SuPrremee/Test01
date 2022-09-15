package com.qiao.OOP.opptest2.demo19;


import java.util.Date;

/**
 * @ClassName ToStringTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/5 4:58 PM
 * @Version 1.0
 **/

//

// Object类中toString()的使用
// 1.当我们输出一个对象的引用时，实际上就是调用当前对象的toString()
//
// 2.Object类中toString()的定义：
// public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }
//
// 3.像String、Date、File、包装类等都重写了Object类中的toString()方法
//   使得在调用对象的toString()时，返回实体内容信息。
//
// 4.自定义类也可以重写toString()方法，当调用此方法时，返回对象的"实体内容"
//
//
//
//
//
//
//
public class ToStringTest {
    public static void main(String[] args) {
        Equals equals1 = new Equals("陶家宝",21);
        System.out.println(equals1.toString());//com.qiao.OOP.opptest2.demo19.Equals@45c8afd9
        System.out.println(equals1);//com.qiao.OOP.opptest2.demo19.Equals@45c8afd9

        String str = new String("MM");
        System.out.println(str);

        Date date = new Date(4654564654656L);
        System.out.println(date.toString());
    }
}
