package com.qiao.OOP.opptest2.demo16;


/**
 * @ClassName ObjectTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/5 3:32 AM
 * @Version 1.0
 **/
// java.lang.Object类
// 1.Object类是所有Java类的根父类
// 2.如果在类的声明中未声明使用extends关键字指明其父亲，则默认父类为Java.lang.Object类
// 3.Object类中的功能(属性、方法)就具有通用性
//  属性：无
//  方法：equals()/toString()/getClass()/hashCode()/clone()/finalize()
//      wait()/notify()/notifyAll()
// 4.Object值声明了空参构造器
//
//
//
//
public class ObjectTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.getClass().getSuperclass());
    }
}

class Order{

}