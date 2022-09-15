package com.qiao.OOP.opptest2.demo15;

/**
 * @ClassName InterviewTest
 * @Description TODO
 * @Author liuyuqiao
 * @Data 2022/9/5 3:22 AM
 * @Version 1.0
 **/
public class InterviewTest {
    public static void main(String[] args) {
        Base base = new Sub();
        //调用的是重写父类的子类方法
        base.add(1,2,3);

        Sub s = (Sub) base;
        s.add(1,2,3);
    }
}

class Base{
    public void add(int a,int...arr){
        System.out.println("base");
    }
}
class Sub extends Base{
    public void add(int a, int[] arr){
        System.out.println("sub1");
    }

    public void add(int a,int b,int c){
        System.out.println("sub2");
    }
}