package com.qiao.OOP.ooptest.demo17;

/**
 * 定义三个重载方法max()。
 * 第一个方法求两个int值中最大值
 * 第二个方法求两个double值中的最大值
 * 第三个方法求三个double值中最大的值
 * 并分别调用三个方法
 */
public class OverLoadTest2 {
    public static void main(String[] args) {
        OverLoadTest2 test = new OverLoadTest2();
        test.max(1,2);
        test.max(2,1);
        test.max(1,2,3);
    }
    public void max(int a,int b){
        int max = a > b ? a : b;
        System.out.println(max);
    }
    public void max(double a,double b){
        double max = a > b ? a : b;
        System.out.println(max);
    }
    public void max(double a,double b,double c){
        double max = a > b ? a : b;
        double max1 = max > c ? max : c;
        System.out.println(max1);
    }
}
