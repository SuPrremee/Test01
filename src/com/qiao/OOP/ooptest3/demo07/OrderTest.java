package com.qiao.OOP.ooptest3.demo07;

/**
 * @ClassName OrderTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/8 12:55 AM
 * @Version 1.0
 **/

// 对属性可以赋值的位置：
// 1.默认初始化
// 2.显式初始化 5.在代码块中赋值
// 3.构造器中初始化
// 4.有了对象以后，可以通过"对象.属性"或"对象.方法"的方式，进行赋值
//
//执行的先后顺序：1 - 2 / 5 - 3 - 4
//
//
//
//
public class OrderTest {
    public static void main(String[] args) {
        ;
        System.out.println(new Order().orderId);
    }
}

class Order{
    int orderId = 3;
    {
        orderId = 4;
    }
}