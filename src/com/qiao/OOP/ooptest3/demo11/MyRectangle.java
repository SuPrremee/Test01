package com.qiao.OOP.ooptest3.demo11;

/**
 * @ClassName MyRectangle
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/5 1:07 AM
 * @Version 1.0
 **/
public class MyRectangle extends GeometricObject {
    private double width;
    private double height;

    public MyRectangle(double width,double height,String color ,double weight){
        super(color,weight);
        this.width = width;
        this.height = height;
    }
//    public MyRectangle(){
//
//    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findArea(){
        return width * height;
    }

}
