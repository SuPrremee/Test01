package com.qiao.OOP.ooptest.Test;

import com.qiao.OOP.ooptest.demo25.Order;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        //出了Order类所属的包之后，私有的结构缺省声明的结构就不可以调用了
        //order.orderDefault = 1;

        order.orderPublic = 2;

        //出了Order类之后私有的结构就不可以调用了
        //order.orderPrivate = 3;

        //出了Order类所属的包之后，私有的结构缺省声明的结构就不可以调用了
        //order.methodDefault();

        order.methodPublic();

        //出了Order类之后私有的结构就不可以调用了
        //order.methodPrivate();
    }
}