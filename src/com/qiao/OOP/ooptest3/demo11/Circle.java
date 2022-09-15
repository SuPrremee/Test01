package com.qiao.OOP.ooptest3.demo11;

/**
 * @ClassName CircleTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/5 1:06 AM
 * @Version 1.0
 **/
public class Circle extends GeometricObject {
    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }
//    public CircleTest(){
//
//    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return radius * radius * Math.PI;
    }
}
