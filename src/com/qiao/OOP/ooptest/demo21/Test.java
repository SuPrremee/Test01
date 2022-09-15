package com.qiao.OOP.ooptest.demo21;

import java.io.PrintStream;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        /**
         * 需要在method方法被调用之后，仅打印出a=100，b=200请写出method方法的代码
         */
        method(a,b);
        method(a,b);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

    public static void method(int a,int b){
        a = 100;
        b = 200;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.exit(0);
    }

    public static void method(int...ints){
        PrintStream ps = new PrintStream(System.out){
            @Override
            public void println(String x){
                if ("a = 10".equals(x)){
                    x = "a = 100";
                }else if ("b = 20".equals(x)){
                    x = "b = 200";
                }
                super.println(x);
            }
        };
        System.setOut(ps);
    }
}
