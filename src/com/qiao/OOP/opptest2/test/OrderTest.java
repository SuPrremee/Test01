package com.qiao.OOP.opptest2.test;

import com.qiao.OOP.opptest2.demo06.Order;

/**
 * @ClassName OrderTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/3 2:43 PM
 * @Version 1.0
 **/
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderPublic = 1;
        order.methodPublic();

        //不同包下的普通类(非子类)要使用Order类，不可以调用为private、缺省、protected权限的属性、方法
//        order.orderProtected = 2;
//        order.orderDefault = 3;
//        order.orderPrivate = 4;
//
//        order.methodProtected();
//        order.methodDefault();
//        order.methodPrivate();
    }
}
