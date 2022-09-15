package com.qiao.OOP.ooptest3.demo21;

public interface CompareA {
    //静态方法
    //可以直接通过接口去调用
    public static void method1() {
        System.out.println("CompareA:北京");
    }

    //默认方法
    public default void method2() {
        System.out.println("CompareA:上海");
    }

    default void method3() {
        System.out.println("CompareA:上海");
    }
}
