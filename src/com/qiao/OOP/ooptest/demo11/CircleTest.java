package com.qiao.OOP.ooptest.demo11;

/*
利用面向对象的编程方法，设计Circle计算圆的面积
 */

import java.util.Scanner;

import static java.lang.Math.PI;

//半径作为属性更合适
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.print("请输入圆的半径：");
        Scanner scanner = new Scanner(System.in);
        circle.radius = scanner.nextInt();
        double area =circle.area();
        System.out.println("圆的面积为：" + area);
        scanner.close();
    }
}

class Circle{
    //半径作为属性更为合适
    int radius;
    public double area(){
        double area = PI * radius * radius;
        return area;
    }
}