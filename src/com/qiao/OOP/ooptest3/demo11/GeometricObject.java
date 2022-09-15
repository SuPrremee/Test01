package com.qiao.OOP.ooptest3.demo11;

/**
 * @ClassName GeometricObject
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/5 1:06 AM
 * @Version 1.0
 **/
public abstract class GeometricObject {
    protected String color;
    protected double weight;
    public GeometricObject(String color,double weight){
        super();
        this.color = color;
        this.weight = weight;
    }
//    public GeometricObject(){
//
//    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract double findArea();
}

class GeometricTest{
    public static void main(String[] args) {

        GeometricTest test = new GeometricTest();

        MyRectangle myRectangle = new MyRectangle(1.0,1.0,"white",1.0);
        test.displayGeometricObject(myRectangle);

        Circle circle = new Circle("white",1.0,1.0);
        test.displayGeometricObject(circle);
//        myRectangle.setHeight(1);
//        myRectangle.setWidth(1);
//        circle.setRadius(1);
        boolean isSuccess =test.equalsArea(circle,myRectangle);
        if (isSuccess){
            System.out.println("相等");
        }else System.out.println("不等");
    }

    public boolean equalsArea(GeometricObject geometricObject1,GeometricObject geometricObject2){
//        if (geometricObject1.findArea() == geometricObject2.findArea()){
//            return true;
//        }else return false;
        return false;
    }
    public void displayGeometricObject(GeometricObject geometricObject){
        System.out.println(geometricObject.findArea());
    }
}