package com.qiao.OOP.ooptest3.demo04;

/**
 * @ClassName SingletonTest2
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/7 3:58 PM
 * @Version 1.0
 **/
//懒汉式
public class SingletonTest2 {
    public static void main(String[] args) {
        System.out.println(Bank2.getInstance());
        Bank2 bank1 = Bank2.getInstance();
        Bank2 bank2 = Bank2.getInstance();
        System.out.println(bank2 == bank1);
    }
}
class Bank2{
    //1.私有化构造器
    private Bank2(){

    }
    //2.声明当前类对象，没有初始化
    //此对象也必须声明为static
    private static Bank2 instance = null;

    //3.声明public、static的返回当前类对象的方法
    public static Bank2 getInstance(){
        if (instance == null){
            instance = new Bank2();
        }
        return instance;
    }
}
