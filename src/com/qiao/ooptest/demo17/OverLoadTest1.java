package com.qiao.ooptest.demo17;

/**
 * 定义三个重载方法并调用方法名为mOL
 * 三个方法分别接受一个int参数、两个int参数、一个字符串参数。
 * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息
 * 在主类的main（）方法中分别用参数区别调用3个方法
 */
public class OverLoadTest1 {
    public static void main(String[] args) {
        OverLoadTest1 test = new OverLoadTest1();
        test.mOL(3);
        test.mOL(2,3);
        test.mOL("taojiabao");
    }
    public void mOL(int num){
        System.out.println(Math.pow(num,2));
    }
    public void mOL(int num1,int num2){
        System.out.println(num1 * num2);
    }
    public void mOL(String s){
        System.out.println(s);
    }
}
