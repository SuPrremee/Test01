package com.qiao.OOP.opptest2.demo04;

/**
 * @ClassName Cylinder
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/3 1:35 AM
 * @Version 1.0
 **/
public class Cylinder extends Circle {
    //属性
    private double length;  //高

    //构造器
    public Cylinder() {
        super();
        length = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //返回圆柱的体积
    public double findVolume(){
        //return Math.PI * getRadius() * getRadius() * getLength();
        return super.findArea() * getLength();
    }

    @Override
    public double findArea(){
        //返回圆的面积表面积
        return Math.PI * getRadius() * getRadius() * 2 + 2 * Math.PI * getRadius() * getLength();
    }
}
