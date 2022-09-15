package com.qiao.OOP.ooptest.demo15;

public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.sendEmail();
        p.playGame();

        //匿名对象
        //匿名对象不是同一个对象，因为每new一个就创建一个新对象
        new Phone().sendEmail();
        new Phone().playGame();
        System.out.println("************************");
        //.showPrice = 0.0所以不是同一个对象
        //所以匿名对象最好直调一次
        new Phone().price = 2000;
        new Phone().showPrice();
        System.out.println("************************");
        //匿名对象的使用
        PhoneMall mall = new PhoneMall();
        mall.show(new Phone());//匿名对象作为参数
    }
}

class PhoneMall{
    public void show(Phone phone){  //在栈中就有形式参数的地址
        phone.sendEmail();
        phone.showPrice();
    }
}

class Phone{
    //属性
    double price;   //价格
    public void sendEmail(){
        System.out.println("发送邮件");
    }
    public void playGame(){
        System.out.println("打游戏");
    }

    public void showPrice(){
        System.out.println("手机价格" + price);
    }
}