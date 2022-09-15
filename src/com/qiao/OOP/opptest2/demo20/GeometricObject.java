package com.qiao.OOP.opptest2.demo20;

/**
 * @ClassName GeometricObject
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/5 5:53 PM
 * @Version 1.0
 **/
public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject(){
        this.color = "white";
        this.weight = 1.0;
    }
    protected GeometricObject(String color,double weight){
        this.color = color;
        this.weight = weight;
    }

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
}

class Circle extends GeometricObject{
    private double radius;

    public Circle(){
        super();
        this.radius = 1.0;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(double radius,String color,double weight){
        super(color,weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * this.radius * this.radius;
    }

    public boolean equals(Object obj){
        //当前对象和形参对象一样
        if (this == obj){
            return true;
        }
        //判断形参obj是否是Circle的一个实例(对象)
        if (obj instanceof Circle){
            Circle circle =  (Circle) obj;
            //return findArea() == ((CircleTest) obj).findArea();
            return this.radius == circle.radius;
        }
        else return false;
    }
    public String toString(){
        return "面积：" + findArea();
    }
 }

class test{
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.0);
        Circle circle2 = new Circle(1.0);
        System.out.println("颜色是否相等：" + circle1.getColor().equals(circle2.getColor()));
        System.out.println("半径是否相等：" + circle1.equals(circle2));
        System.out.println("circle1 : " + circle1.toString() + ",circle2" + circle2.toString());
    }
}