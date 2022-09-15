package com.qiao.OOP.ooptest3.demo04;

/**
 * @ClassName SingletonTest3
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/8 5:57 PM
 * @Version 1.0
 **/
public class SingletonTest3 {
    public static void main(String[] args) {
//        System.out.println(Bank3.getInstance());
        Bank3 bank1 = Bank3.instance;
        Bank3 bank2 = Bank3.instance;
        //考虑到外部可以将对象置为null
       // Bank3.instance = null;
        System.out.println(bank2 == bank1);
    }
}
class Bank3{
    private Bank3(){

    }
    //但是可以通过final将instance限制
    public static final Bank3 instance = new Bank3();

//    public static Bank3 getInstance(){
//        return instance;
//    }
}
