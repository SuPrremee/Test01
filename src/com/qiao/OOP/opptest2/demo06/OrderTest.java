package com.qiao.OOP.opptest2.demo06;

/**
 * @ClassName OrderTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/3 2:32 PM
 * @Version 1.0
 **/
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderDefault = 1;
        order.orderProtected = 2;
        order.orderPublic = 3;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();

        //同一个包中的其他类，不可以调用Order类中私有的属性方法
//        order.orderPrivate = 4;
//        order.methodPrivate();
    }
}
