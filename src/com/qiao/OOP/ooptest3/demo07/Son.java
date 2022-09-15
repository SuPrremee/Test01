package com.qiao.OOP.ooptest3.demo07;

/**
 * @ClassName Son
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/8 12:41 AM
 * @Version 1.0
 **/
class Father{
    static {
        System.out.println("1111111111111");
    }
    {
        System.out.println("2222222222");
    }
    public Father(){
        System.out.println("333333333333333");
    }
}
public class Son extends Father {
    static {
        System.out.println("444444444444444444");
    }

    {
        System.out.println("5555555555555555555");
    }

    public Son() {
        //super();
        System.out.println("6666666666666666666");
    }

    public static void main(String[] args) {
        System.out.println("77777777777777");
        System.out.println("*****************");
        new Son();
        System.out.println("*****************");
        new Son();
        System.out.println("*****************");
        new Father();
    }
}
