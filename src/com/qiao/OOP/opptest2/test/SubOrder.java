package com.qiao.OOP.opptest2.test;

import com.qiao.OOP.opptest2.demo06.Order;

/**
 * @ClassName SubOrder
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/3 2:37 PM
 * @Version 1.0
 **/
public class SubOrder extends Order {
    public void method(){
        orderProtected = 1;
        orderPublic = 2;

        methodProtected();
        methodPublic();

        //在不同包的子类中，不能调用Order类中声明为private和缺省权限的属性、方法
//        orderDefault = 3;
//        orderPrivate = 4;
//
//        methodDefault();
//        methodPrivate();
    }
}
