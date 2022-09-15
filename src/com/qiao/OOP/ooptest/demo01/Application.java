package com.qiao.OOP.ooptest.demo01;


import java.util.Scanner;

//类的成员变量 猜数字游戏一个类A有一个成员变量v有一个初值100。定义一个类对A类的成员变量v进行猜。如果大了则提示大了小了则提示小了。等于则提示猜测成功。
public class Application {
    public static void main(String[] args) {
        System.out.println("请输入猜测的数字：");
        Scanner scanner = new Scanner(System.in);
        Test01 test01 = new Test01();
        A a = new A();
//        while (true){
//            int i = scanner.nextInt();
//            if (i > test01.getV()){
//                System.out.println("大了");
//            } else if (i < test01.getV()) {
//                System.out.println("小了");
//            }else {
//                System.out.println("恭喜你猜对了！");
//                break;
//            }
//        }
        while (true){
            int i = scanner.nextInt();
            if (i > a.v){
                System.out.println("大了");
            } else if (i < a.v) {
                System.out.println("小了");
            }else {
                System.out.println("恭喜你猜对了！");
                break;
            }
        }
        scanner.close();
    }
}

class A{
    public int v = 100;
}
