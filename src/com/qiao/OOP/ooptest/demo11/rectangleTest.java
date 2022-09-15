package com.qiao.OOP.ooptest.demo11;

import java.util.Scanner;

public class rectangleTest {
    public static void main(String[] args) {
       Rectangle rectangle = new Rectangle();
       rectangle.printMethod();
       int area = rectangle.printMethod();
       System.out.println("长方形面积：" + area);
       System.out.println("请输入m,n");
        Scanner m = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        rectangle.m = m.nextInt();
        rectangle.n = n.nextInt();
        int area1 = rectangle.method();
        System.out.println("长方形面积：" + area1);
    }

}
class Rectangle{
    int Long = 10;
    int Wide = 8;

    int m;
    int n;
    public int printMethod(){
        for (int i = 1; i <= Wide; i++){
            for (int j = 1; j <= Long; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        return Long * Wide;
    }

    public int method(){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        return m * n;
    }
}