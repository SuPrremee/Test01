package com.qiao.OOP.ooptest.demo06;
//1.有三个属性 面码:String theMa 粉的分量(两) int quantity 是否带汤 boolean likeSoup
//2.写一个构造方法 以便于简化初始化过程 如 WuMingFen f1 = new WuMingFen(“牛肉”,3,true);
//3.重载构造方法 使得初始化过程可以多样化 WuMingFen f2 = new WuMingFen(“牛肉”,2);
//4.如何使得下列语句构造出来的粉对象是酸辣面码、2两、带汤的 WuMingFen f3 = new WuMingFen();
public class WuMingFen {
    private String theMa;
    private int quntity;
    private boolean likeSoup;

    public WuMingFen(String theMa, int quntity, boolean likeSoup) {
        this.theMa = theMa;
        this.quntity = quntity;
        this.likeSoup = likeSoup;
    }

    public WuMingFen(String theMa, boolean likeSoup, int quntity){
        this.theMa = theMa;
        this.quntity = quntity;
        this.likeSoup = likeSoup;
    }
    public WuMingFen(String theMa,int quntity){
        this.theMa = theMa;
        this.quntity = quntity;
    }
}
