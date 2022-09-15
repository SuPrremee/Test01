package com.qiao.OOP.opptest2.demo04;

/**
 * @ClassName CircleTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/3 1:35 AM
 * @Version 1.0
 **/
public class Circle {
    //属性
    private double radius;//半径

    //构造器
    public Circle(){
        radius = 1.0;
    }
    //访问器

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //返回圆的面积
    public double findArea(){
        return radius * radius * Math.PI;
    }
}
