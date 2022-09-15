package com.qiao.OOP.ooptest3.demo02;

/**
 * @ClassName CircleTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/7 11:59 AM
 * @Version 1.0
 **/

//static 关键字的应用
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3 = new Circle(1);
        System.out.println(c1.getId());
        System.out.println(c2.getId());
        System.out.println(c3.getId());
        System.out.println(Circle.getTotal());
    }
}

class Circle{
    private double radius;
    private int id;
    private static int total;//记录圆的个数
    private static int init = 1001;//static声明的属性被所有对象共享

    public Circle(){
        id = init++;
        total++;
    }

    public Circle(double radius){
        this();
//        id = init++;
//        total++;
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }

}

