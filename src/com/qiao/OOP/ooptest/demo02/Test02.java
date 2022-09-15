package com.qiao.OOP.ooptest.demo02;
//类的成员变量 请定义一个交通工具(Vehicle)的类其中有:
// 属性速度(speed)体积(size)等等 方法移动(move())设置速度(setSpeed(int speed))加速speedUp(),减速speedDown()等等.
// 最后在测试类Vehicle中的main()中实例化一个交通工具对象并通过方法给它初始化speed,size的值并且通过打印出来。另外调用加速减速的方法对速度进行改变。

public class Test02 {
    private int speed;
    private String size;

    public void move(){
        System.out.println("i'm moving");
    }
    public void setSpeed(int speed){
        System.out.println("now i'm running with " + speed + " per hour");
    }
    public void speedUp(){
        Test02 test02 = new Test02();
        test02.setSpeed(1000);
    }
    public void speedDown(){
        Test02 test02 = new Test02();
        test02.setSpeed(10);
    }

    public static void main(String[] args) {
        Test02 test02 = new Test02();
        test02.speed = 100;
        test02.size = "50/m^3";
        System.out.println("the initial speed is " + test02.speed + " and my size is " + test02.size);
        test02.speedUp();
        test02.speedDown();
    }
}
