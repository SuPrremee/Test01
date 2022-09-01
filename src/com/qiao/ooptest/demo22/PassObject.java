package com.qiao.ooptest.demo22;

/**
 * 定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea()方法返回圆的面积
 * 定义一个类PassObject，在类中定义一个方法printAreas(),该方法的定义如下：public void printAreas(Circle c,int time)
 * 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 * 例如，time为5，则输出半径1，2，3，4，5。以及对应的圆面积
 * 在main方法中调用printAreas()方法，调用完毕后输出当前半径值。程序运行结果如图所示
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject test = new PassObject();

        Circle c = new Circle();

        test.printAreas(c,5);

        System.out.println("now radius is:" + c.radius);
    }
    public void printAreas(Circle c,double time){
        System.out.println("Radius\t\t\tArea");
        for (int i = 1 ; i <= time; i++) {
            c.radius = i;
            System.out.println(c.radius +"\t\t\t\t" + c.findArea());
        }
        c.radius = time + 1;
    }
}

class Circle{
    //属性
    double radius;  //半径

    //findArea()方法返回圆的面积
    public double findArea(){
        return Math.PI * radius *radius;
    }

}